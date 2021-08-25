/* **************************************************************************************
 * Copyright (c) 2018 Calypso Networks Association https://calypsonet.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.eclipse.keyple.card.calypso;

import org.calypsonet.terminal.card.ApduResponseApi;

/**
 * (package-private)<br>
 * Parses the card Get challenge response.
 *
 * @since 2.0.0
 */
final class CardGetChallengeRespPars extends AbstractCardResponseParser {

  /**
   * Instantiates a new CardGetChallengeRespPars.
   *
   * @param response the response from Card Get Challenge APDU Command.
   * @param builder the reference to the builder that created this parser.
   * @since 2.0.0
   */
  public CardGetChallengeRespPars(ApduResponseApi response, CardGetChallengeBuilder builder) {
    super(response, builder);
  }

  /**
   * Gets the card challenge
   *
   * @return An array of bytes
   * @since 2.0.0
   */
  public byte[] getCardChallenge() {
    return getApduResponse().getDataOut();
  }
}
