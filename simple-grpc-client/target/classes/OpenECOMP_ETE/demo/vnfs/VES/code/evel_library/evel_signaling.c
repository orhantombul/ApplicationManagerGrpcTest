/**************************************************************************//**
 * @file
 * Implementation of EVEL functions relating to Signaling.
 *
 * License
 * -------
 *
 * Copyright © 2017 AT&T Intellectual Property. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *****************************************************************************/

#include <string.h>
#include <assert.h>
#include <stdlib.h>

#include "evel_throttle.h"

/**************************************************************************//**
 * Create a new Signaling event.
 *
 * @note    The mandatory fields on the Signaling must be supplied to
 *          this factory function and are immutable once set.  Optional fields
 *          have explicit setter functions, but again values may only be set
 *          once so that the event has immutable properties.
 * @param vendor_id     The vendor id to encode in the event instance id.
 * @param event_id      The vendor event id to encode in the event instance id.
 * @returns pointer to the newly manufactured ::EVENT_SIGNALING.  If the event
 *          is not used (i.e. posted) it must be released using
 *          ::evel_free_signaling.
 * @retval  NULL  Failed to create the event.
 *****************************************************************************/
EVENT_SIGNALING * evel_new_signaling(const char * const vendor_id,
                                     const char * const event_id)
{
  EVENT_SIGNALING * event = NULL;

  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions.                                                    */
  /***************************************************************************/
  assert(vendor_id != NULL);
  assert(event_id != NULL);

  /***************************************************************************/
  /* Allocate the Signaling event.                                           */
  /***************************************************************************/
  event = malloc(sizeof(EVENT_SIGNALING));
  if (event == NULL)
  {
    log_error_state("Out of memory");
    goto exit_label;
  }
  memset(event, 0, sizeof(EVENT_SIGNALING));
  EVEL_DEBUG("New Signaling event is at %lp", event);

  /***************************************************************************/
  /* Initialize the header & the Signaling fields.                           */
  /***************************************************************************/
  evel_init_header(&event->header);
  event->header.event_domain = EVEL_DOMAIN_SIGNALING;
  event->major_version = EVEL_SIGNALING_MAJOR_VERSION;
  event->minor_version = EVEL_SIGNALING_MINOR_VERSION;
  evel_init_event_instance_id(&event->instance_id, vendor_id, event_id);
  evel_init_option_string(&event->correlator);
  evel_init_option_string(&event->local_ip_address);
  evel_init_option_string(&event->local_port);
  evel_init_option_string(&event->remote_ip_address);
  evel_init_option_string(&event->remote_port);
  evel_init_option_string(&event->compressed_sip);
  evel_init_option_string(&event->summary_sip);

exit_label:

  EVEL_EXIT();
  return event;
}

/**************************************************************************//**
 * Set the Event Type property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param type          The Event Type to be set. ASCIIZ string. The caller
 *                      does not need to preserve the value once the function
 *                      returns.
 *****************************************************************************/
void evel_signaling_type_set(EVENT_SIGNALING * const event,
                             const char * const type)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions and call evel_header_type_set.                      */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  evel_header_type_set(&event->header, type);

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Local Ip Address property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param local_ip_address
 *                      The Local Ip Address to be set. ASCIIZ string. The
 *                      caller does not need to preserve the value once the
 *                      function returns.
 *****************************************************************************/
void evel_signaling_local_ip_address_set(EVENT_SIGNALING * const event,
                                         const char * const local_ip_address)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions.                                                    */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  assert(local_ip_address != NULL);

  evel_set_option_string(&event->local_ip_address,
                         local_ip_address,
                         "Local Ip Address");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Local Port property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param local_port    The Local Port to be set. ASCIIZ string. The caller
 *                      does not need to preserve the value once the function
 *                      returns.
 *****************************************************************************/
void evel_signaling_local_port_set(EVENT_SIGNALING * const event,
                                   const char * const local_port)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions.                                                    */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  assert(local_port != NULL);

  evel_set_option_string(&event->local_port,
                         local_port,
                         "Local Port");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Remote Ip Address property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param remote_ip_address
 *                      The Remote Ip Address to be set. ASCIIZ string. The
 *                      caller does not need to preserve the value once the
 *                      function returns.
 *****************************************************************************/
void evel_signaling_remote_ip_address_set(EVENT_SIGNALING * const event,
                                          const char * const remote_ip_address)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions.                                                    */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  assert(remote_ip_address != NULL);

  evel_set_option_string(&event->remote_ip_address,
                         remote_ip_address,
                         "Remote Ip Address");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Remote Port property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param remote_port   The Remote Port to be set. ASCIIZ string. The caller
 *                      does not need to preserve the value once the function
 *                      returns.
 *****************************************************************************/
void evel_signaling_remote_port_set(EVENT_SIGNALING * const event,
                                    const char * const remote_port)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions.                                                    */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  assert(remote_port != NULL);

  evel_set_option_string(&event->remote_port,
                         remote_port,
                         "Remote Port");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Compressed SIP property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param compressed_sip
 *                      The Compressed SIP to be set. ASCIIZ string. The caller
 *                      does not need to preserve the value once the function
 *                      returns.
 *****************************************************************************/
void evel_signaling_compressed_sip_set(EVENT_SIGNALING * const event,
                                       const char * const compressed_sip)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions.                                                    */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  assert(compressed_sip != NULL);

  evel_set_option_string(&event->compressed_sip,
                         compressed_sip,
                         "Compressed SIP");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Summary SIP property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param summary_sip   The Summary SIP to be set. ASCIIZ string. The caller
 *                      does not need to preserve the value once the function
 *                      returns.
 *****************************************************************************/
void evel_signaling_summary_sip_set(EVENT_SIGNALING * const event,
                                    const char * const summary_sip)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions.                                                    */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  assert(summary_sip != NULL);

  evel_set_option_string(&event->summary_sip,
                         summary_sip,
                         "Summary SIP");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Product Id property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param product_id    The vendor product id to be set. ASCIIZ string. The
 *                      caller does not need to preserve the value once the
 *                      function returns.
 *****************************************************************************/
void evel_signaling_product_id_set(EVENT_SIGNALING * const event,
                                   const char * const product_id)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions and call evel_header_type_set.                      */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  evel_set_option_string(&event->instance_id.product_id,
                         product_id,
                         "Product Id");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Subsystem Id property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param subsystem_id  The vendor subsystem id to be set. ASCIIZ string. The
 *                      caller does not need to preserve the value once the
 *                      function returns.
 *****************************************************************************/
void evel_signaling_subsystem_id_set(EVENT_SIGNALING * const event,
                                     const char * const subsystem_id)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions and call evel_header_type_set.                      */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  evel_set_option_string(&event->instance_id.subsystem_id,
                         subsystem_id,
                         "Subsystem Id");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Friendly Name property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param friendly_name The vendor friendly name to be set. ASCIIZ string. The
 *                      caller does not need to preserve the value once the
 *                      function returns.
 *****************************************************************************/
void evel_signaling_friendly_name_set(EVENT_SIGNALING * const event,
                                      const char * const friendly_name)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions and call evel_header_type_set.                      */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  evel_set_option_string(&event->instance_id.event_friendly_name,
                         friendly_name,
                         "Friendly Name");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Set the Correlator property of the Signaling event.
 *
 * @note  The property is treated as immutable: it is only valid to call
 *        the setter once.  However, we don't assert if the caller tries to
 *        overwrite, just ignoring the update instead.
 *
 * @param event         Pointer to the Signaling event.
 * @param correlator    The correlator to be set. ASCIIZ string. The caller
 *                      does not need to preserve the value once the function
 *                      returns.
 *****************************************************************************/
void evel_signaling_correlator_set(EVENT_SIGNALING * const event,
                                   const char * const correlator)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions and call evel_header_type_set.                      */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);
  evel_set_option_string(&event->correlator,
                         correlator,
                         "Correlator");

  EVEL_EXIT();
}

/**************************************************************************//**
 * Encode the Signaling in JSON according to AT&T's schema for the
 * event type.
 *
 * @param jbuf          Pointer to the ::EVEL_JSON_BUFFER to encode into.
 * @param event         Pointer to the ::EVENT_HEADER to encode.
 *****************************************************************************/
void evel_json_encode_signaling(EVEL_JSON_BUFFER * const jbuf,
                                EVENT_SIGNALING * const event)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions.                                                    */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);

  evel_json_encode_header(jbuf, &event->header);
  evel_json_open_named_object(jbuf, "signalingFields");

  /***************************************************************************/
  /* Mandatory fields                                                        */
  /***************************************************************************/
  evel_json_encode_instance_id(jbuf, &event->instance_id);
  evel_enc_version(jbuf,
                   "signalingFieldsVersion",
                   event->major_version,
                   event->minor_version);

  /***************************************************************************/
  /* Optional fields                                                         */
  /***************************************************************************/
  evel_enc_kv_opt_string(jbuf, "correlator", &event->correlator);
  evel_enc_kv_opt_string(jbuf, "localIpAddress", &event->local_ip_address);
  evel_enc_kv_opt_string(jbuf, "localPort", &event->local_port);
  evel_enc_kv_opt_string(jbuf, "remoteIpAddress", &event->remote_ip_address);
  evel_enc_kv_opt_string(jbuf, "remotePort", &event->remote_port);
  evel_enc_kv_opt_string(jbuf, "compressedSip", &event->compressed_sip);
  evel_enc_kv_opt_string(jbuf, "summarySip", &event->summary_sip);
  evel_json_close_object(jbuf);

  EVEL_EXIT();
}

/**************************************************************************//**
 * Free a Signaling event.
 *
 * Free off the event supplied.  Will free all the contained allocated memory.
 *
 * @note It does not free the event itself, since that may be part of a larger
 * structure.
 *****************************************************************************/
void evel_free_signaling(EVENT_SIGNALING * const event)
{
  EVEL_ENTER();

  /***************************************************************************/
  /* Check preconditions.  As an internal API we don't allow freeing NULL    */
  /* events as we do on the public API.                                      */
  /***************************************************************************/
  assert(event != NULL);
  assert(event->header.event_domain == EVEL_DOMAIN_SIGNALING);

  evel_free_header(&event->header);
  evel_free_event_instance_id(&event->instance_id);
  evel_free_option_string(&event->correlator);
  evel_free_option_string(&event->local_ip_address);
  evel_free_option_string(&event->local_port);
  evel_free_option_string(&event->remote_ip_address);
  evel_free_option_string(&event->remote_port);
  evel_free_option_string(&event->compressed_sip);
  evel_free_option_string(&event->summary_sip);

  EVEL_EXIT();
}
