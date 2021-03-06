/* ConfigParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ConfigParserTokenManager.java */
package org.libconfig.parser;

/** Token Manager. */
@SuppressWarnings("unused")
public class ConfigParserTokenManager implements ConfigParserConstants {

	/** Debug output. */
	public java.io.PrintStream debugStream = System.out;

	/** Set debug output. */
	public void setDebugStream(final java.io.PrintStream ds) {
		debugStream = ds;
	}

	private final int jjStopStringLiteralDfa_0(final int pos, final long active0) {
		switch (pos) {
		case 0:
			if ((active0 & 0x80L) != 0L) {
				return 39;
			}
			return -1;
		default:
			return -1;
		}
	}

	private final int jjStartNfa_0(final int pos, final long active0) {
		return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
	}

	private int jjStopAtPos(final int pos, final int kind) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		return pos + 1;
	}

	private int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
		case 40:
			return jjStopAtPos(0, 26);
		case 41:
			return jjStopAtPos(0, 27);
		case 44:
			return jjStopAtPos(0, 34);
		case 47:
			return jjMoveStringLiteralDfa1_0(0x80L);
		case 58:
			return jjStopAtPos(0, 33);
		case 59:
			return jjStopAtPos(0, 32);
		case 61:
			return jjStopAtPos(0, 35);
		case 91:
			return jjStopAtPos(0, 30);
		case 93:
			return jjStopAtPos(0, 31);
		case 123:
			return jjStopAtPos(0, 28);
		case 125:
			return jjStopAtPos(0, 29);
		default:
			return jjMoveNfa_0(0, 0);
		}
	}

	private int jjMoveStringLiteralDfa1_0(final long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			jjStopStringLiteralDfa_0(0, active0);
			return 1;
		}
		switch (curChar) {
		case 42:
			if ((active0 & 0x80L) != 0L) {
				return jjStartNfaWithStates_0(1, 7, 37);
			}
			break;
		default:
			break;
		}
		return jjStartNfa_0(0, active0);
	}

	private int jjStartNfaWithStates_0(final int pos, final int kind, final int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_0(state, pos + 1);
	}

	static final long[]	jjbitVec0	= { 0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL,
			0xffffffffffffffffL };
	static final long[]	jjbitVec2	= { 0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL };

	private int jjMoveNfa_0(final int startState, int curPos) {
		int startsAt = 0;
		jjnewStateCnt = 56;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff) {
				ReInitRounds();
			}
			if (curChar < 64) {
				final long l = 1L << curChar;
				do {
					switch (jjstateSet[--i]) {
					case 0:
						if ((0x3ff000000000000L & l) != 0L) {
							if (kind > 15) {
								kind = 15;
							}
							{
								jjCheckNAddStates(0, 7);
							}
						} else if ((0x280000000000L & l) != 0L) {
							jjCheckNAdd(15);
						} else if (curChar == 47) {
							jjAddStates(8, 9);
						} else if (curChar == 34) {
							jjCheckNAddStates(10, 12);
						} else if (curChar == 46) {
							jjCheckNAdd(20);
						} else if (curChar == 35) {
							if (kind > 8) {
								kind = 8;
							}
							{
								jjCheckNAddStates(13, 15);
							}
						}
						if ((0x3ff000000000000L & l) != 0L) {
							if (kind > 23) {
								kind = 23;
							}
							{
								jjCheckNAddTwoStates(34, 35);
							}
						}
						if (curChar == 48) {
							jjstateSet[jjnewStateCnt++] = 17;
						}
						break;
					case 39:
						if (curChar == 47) {
							if (kind > 8) {
								kind = 8;
							}
							{
								jjCheckNAddStates(13, 15);
							}
						} else if (curChar == 42) {
							jjstateSet[jjnewStateCnt++] = 37;
						}
						break;
					case 1:
						if ((0xffffffffffffdbffL & l) == 0L) {
							break;
						}
						if (kind > 8) {
							kind = 8;
						} {
						jjCheckNAddStates(13, 15);
					}
						break;
					case 2:
						if ((0x2400L & l) != 0L && kind > 8) {
							kind = 8;
						}
						break;
					case 3:
						if (curChar == 10 && kind > 8) {
							kind = 8;
						}
						break;
					case 4:
						if (curChar == 13) {
							jjstateSet[jjnewStateCnt++] = 3;
						}
						break;
					case 14:
						if ((0x280000000000L & l) != 0L) {
							jjCheckNAdd(15);
						}
						break;
					case 15:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 15) {
							kind = 15;
						} {
						jjCheckNAddTwoStates(14, 15);
					}
						break;
					case 16:
						if (curChar == 48) {
							jjstateSet[jjnewStateCnt++] = 17;
						}
						break;
					case 18:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 17) {
							kind = 17;
						}
						jjstateSet[jjnewStateCnt++] = 18;
						break;
					case 19:
						if (curChar == 46) {
							jjCheckNAdd(20);
						}
						break;
					case 20:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 19) {
							kind = 19;
						} {
						jjCheckNAddTwoStates(20, 21);
					}
						break;
					case 22:
						if ((0x280000000000L & l) != 0L) {
							jjCheckNAdd(23);
						}
						break;
					case 23:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 19) {
							kind = 19;
						} {
						jjCheckNAdd(23);
					}
						break;
					case 24:
						if (curChar == 34) {
							jjCheckNAddStates(10, 12);
						}
						break;
					case 25:
						if ((0xfffffffbffffdbffL & l) != 0L) {
							jjCheckNAddStates(10, 12);
						}
						break;
					case 27:
						if ((0x8400000000L & l) != 0L) {
							jjCheckNAddStates(10, 12);
						}
						break;
					case 28:
						if (curChar == 34 && kind > 22) {
							kind = 22;
						}
						break;
					case 29:
						if ((0xff000000000000L & l) != 0L) {
							jjCheckNAddStates(16, 19);
						}
						break;
					case 30:
						if ((0xff000000000000L & l) != 0L) {
							jjCheckNAddStates(10, 12);
						}
						break;
					case 31:
						if ((0xf000000000000L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 32;
						}
						break;
					case 32:
						if ((0xff000000000000L & l) != 0L) {
							jjCheckNAdd(30);
						}
						break;
					case 33:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 23) {
							kind = 23;
						} {
						jjCheckNAddTwoStates(34, 35);
					}
						break;
					case 34:
						if (curChar != 45) {
							break;
						}
						if (kind > 23) {
							kind = 23;
						} {
						jjCheckNAdd(35);
					}
						break;
					case 35:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 23) {
							kind = 23;
						} {
						jjCheckNAddStates(20, 22);
					}
						break;
					case 36:
						if (curChar == 47) {
							jjAddStates(8, 9);
						}
						break;
					case 37:
						if (curChar == 42) {
							jjstateSet[jjnewStateCnt++] = 38;
						}
						break;
					case 38:
						if ((0xffff7fffffffffffL & l) != 0L && kind > 6) {
							kind = 6;
						}
						break;
					case 40:
						if (curChar != 47) {
							break;
						}
						if (kind > 8) {
							kind = 8;
						} {
						jjCheckNAddStates(13, 15);
					}
						break;
					case 41:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 15) {
							kind = 15;
						} {
						jjCheckNAddStates(0, 7);
					}
						break;
					case 42:
						if ((0x3ff000000000000L & l) != 0L) {
							jjCheckNAddTwoStates(42, 43);
						}
						break;
					case 43:
						if (curChar != 46) {
							break;
						}
						if (kind > 19) {
							kind = 19;
						} {
						jjCheckNAddTwoStates(44, 45);
					}
						break;
					case 44:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 19) {
							kind = 19;
						} {
						jjCheckNAddTwoStates(44, 45);
					}
						break;
					case 46:
						if ((0x280000000000L & l) != 0L) {
							jjCheckNAdd(47);
						}
						break;
					case 47:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 19) {
							kind = 19;
						} {
						jjCheckNAdd(47);
					}
						break;
					case 48:
						if ((0x3ff000000000000L & l) != 0L) {
							jjCheckNAddTwoStates(48, 49);
						}
						break;
					case 50:
						if ((0x280000000000L & l) != 0L) {
							jjCheckNAdd(51);
						}
						break;
					case 51:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 19) {
							kind = 19;
						} {
						jjCheckNAdd(51);
					}
						break;
					case 52:
						if ((0x3ff000000000000L & l) != 0L) {
							jjCheckNAddTwoStates(52, 53);
						}
						break;
					case 54:
						if ((0x280000000000L & l) != 0L) {
							jjCheckNAdd(55);
						}
						break;
					case 55:
						if ((0x3ff000000000000L & l) == 0L) {
							break;
						}
						if (kind > 19) {
							kind = 19;
						} {
						jjCheckNAdd(55);
					}
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				final long l = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 0:
						if ((0x7fffffe87fffffeL & l) != 0L) {
							if (kind > 23) {
								kind = 23;
							}
							{
								jjCheckNAddTwoStates(34, 35);
							}
						}
						if ((0x8106200081062L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 10;
						}
						if ((0x34002000340020L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 6;
						}
						break;
					case 1:
						if (kind > 8) {
							kind = 8;
						} {
						jjAddStates(13, 15);
					}
						break;
					case 5:
						if ((0x34002000340020L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 6;
						}
						break;
					case 6:
						if ((0x34002000340020L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 7;
						}
						break;
					case 7:
						if ((0x34002000340020L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 8;
						}
						break;
					case 8:
						if ((0x34002000340020L & l) != 0L && kind > 12) {
							kind = 12;
						}
						break;
					case 9:
						if ((0x8106200081062L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 10;
						}
						break;
					case 10:
						if ((0x8106200081062L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 11;
						}
						break;
					case 11:
						if ((0x8106200081062L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 12;
						}
						break;
					case 12:
						if ((0x8106200081062L & l) != 0L) {
							jjstateSet[jjnewStateCnt++] = 13;
						}
						break;
					case 13:
						if ((0x8106200081062L & l) != 0L && kind > 12) {
							kind = 12;
						}
						break;
					case 17:
						if ((0x100000001000000L & l) != 0L) {
							jjCheckNAdd(18);
						}
						break;
					case 18:
						if ((0x7e0000007eL & l) == 0L) {
							break;
						}
						if (kind > 17) {
							kind = 17;
						} {
						jjCheckNAdd(18);
					}
						break;
					case 21:
						if ((0x2000000020L & l) != 0L) {
							jjAddStates(23, 24);
						}
						break;
					case 25:
						if ((0xffffffffefffffffL & l) != 0L) {
							jjCheckNAddStates(10, 12);
						}
						break;
					case 26:
						if (curChar == 92) {
							jjAddStates(25, 27);
						}
						break;
					case 27:
						if ((0x14404410000000L & l) != 0L) {
							jjCheckNAddStates(10, 12);
						}
						break;
					case 33:
						if ((0x7fffffe87fffffeL & l) == 0L) {
							break;
						}
						if (kind > 23) {
							kind = 23;
						} {
						jjCheckNAddTwoStates(34, 35);
					}
						break;
					case 35:
						if ((0x7fffffe87fffffeL & l) == 0L) {
							break;
						}
						if (kind > 23) {
							kind = 23;
						} {
						jjCheckNAddStates(20, 22);
					}
						break;
					case 38:
						if (kind > 6) {
							kind = 6;
						}
						break;
					case 45:
						if ((0x2000000020L & l) != 0L) {
							jjAddStates(28, 29);
						}
						break;
					case 49:
						if ((0x2000000020L & l) != 0L) {
							jjAddStates(30, 31);
						}
						break;
					case 53:
						if ((0x2000000020L & l) != 0L) {
							jjAddStates(32, 33);
						}
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				final int hiByte = (curChar >> 8);
				final int i1 = hiByte >> 6;
				final long l1 = 1L << (hiByte & 077);
				final int i2 = (curChar & 0xff) >> 6;
				final long l2 = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 1:
						if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
							break;
						}
						if (kind > 8) {
							kind = 8;
						} {
						jjAddStates(13, 15);
					}
						break;
					case 25:
						if (jjCanMove_0(hiByte, i1, i2, l1, l2)) {
							jjAddStates(10, 12);
						}
						break;
					case 38:
						if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 6) {
							kind = 6;
						}
						break;
					default:
						if (i1 == 0 || l1 == 0 || i2 == 0 || l2 == 0) {
							break;
						} else {
							break;
						}
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			if ((i = jjnewStateCnt) == (startsAt = 56 - (jjnewStateCnt = startsAt))) {
				return curPos;
			}
			try {
				curChar = input_stream.readChar();
			} catch (final java.io.IOException e) {
				return curPos;
			}
		}
	}

	private int jjMoveStringLiteralDfa0_2() {
		switch (curChar) {
		case 42:
			return jjMoveStringLiteralDfa1_2(0x400L);
		default:
			return 1;
		}
	}

	private int jjMoveStringLiteralDfa1_2(final long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			return 1;
		}
		switch (curChar) {
		case 47:
			if ((active0 & 0x400L) != 0L) {
				return jjStopAtPos(1, 10);
			}
			break;
		default:
			return 2;
		}
		return 2;
	}

	private int jjMoveStringLiteralDfa0_1() {
		switch (curChar) {
		case 42:
			return jjMoveStringLiteralDfa1_1(0x200L);
		default:
			return 1;
		}
	}

	private int jjMoveStringLiteralDfa1_1(final long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			return 1;
		}
		switch (curChar) {
		case 47:
			if ((active0 & 0x200L) != 0L) {
				return jjStopAtPos(1, 9);
			}
			break;
		default:
			return 2;
		}
		return 2;
	}

	static final int[] jjnextStates = { 14, 15, 42, 43, 48, 49, 52, 53, 39, 40, 25, 26, 28, 1, 2, 4, 25, 26, 30, 28, 33,
			34, 35, 22, 23, 27, 29, 31, 46, 47, 50, 51, 54, 55, };

	private static final boolean jjCanMove_0(final int hiByte, final int i1, final int i2, final long l1,
			final long l2) {
		switch (hiByte) {
		case 0:
			return ((jjbitVec2[i2] & l2) != 0L);
		default:
			if ((jjbitVec0[i1] & l1) != 0L) {
				return true;
			}
			return false;
		}
	}

	/** Token literal values. */
	public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "\50", "\51",
			"\173", "\175", "\133", "\135", "\73", "\72", "\54", "\75", };

	protected Token jjFillToken() {
		final Token t;
		final String curTokenImage;
		final int beginLine;
		final int endLine;
		final int beginColumn;
		final int endColumn;
		final String im = jjstrLiteralImages[jjmatchedKind];
		curTokenImage = (im == null) ? input_stream.GetImage() : im;
		beginLine = input_stream.getBeginLine();
		beginColumn = input_stream.getBeginColumn();
		endLine = input_stream.getEndLine();
		endColumn = input_stream.getEndColumn();
		t = Token.newToken(jjmatchedKind, curTokenImage);

		t.beginLine = beginLine;
		t.endLine = endLine;
		t.beginColumn = beginColumn;
		t.endColumn = endColumn;

		return t;
	}

	int	curLexState		= 0;
	int	defaultLexState	= 0;
	int	jjnewStateCnt;
	int	jjround;
	int	jjmatchedPos;
	int	jjmatchedKind;

	/** Get the next Token. */
	public Token getNextToken() {
		Token specialToken = null;
		Token matchedToken;
		int curPos = 0;

		EOFLoop: for (;;) {
			try {
				curChar = input_stream.BeginToken();
			} catch (final java.io.IOException e) {
				jjmatchedKind = 0;
				jjmatchedPos = -1;
				matchedToken = jjFillToken();
				matchedToken.specialToken = specialToken;
				return matchedToken;
			}
			image = jjimage;
			image.setLength(0);
			jjimageLen = 0;

			for (;;) {
				switch (curLexState) {
				case 0:
					try {
						input_stream.backup(0);
						while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L) {
							curChar = input_stream.BeginToken();
						}
					} catch (final java.io.IOException e1) {
						continue EOFLoop;
					}
					jjmatchedKind = 0x7fffffff;
					jjmatchedPos = 0;
					curPos = jjMoveStringLiteralDfa0_0();
					break;
				case 1:
					jjmatchedKind = 0x7fffffff;
					jjmatchedPos = 0;
					curPos = jjMoveStringLiteralDfa0_1();
					if (jjmatchedPos == 0 && jjmatchedKind > 11) {
						jjmatchedKind = 11;
					}
					break;
				case 2:
					jjmatchedKind = 0x7fffffff;
					jjmatchedPos = 0;
					curPos = jjMoveStringLiteralDfa0_2();
					if (jjmatchedPos == 0 && jjmatchedKind > 11) {
						jjmatchedKind = 11;
					}
					break;
				}
				if (jjmatchedKind != 0x7fffffff) {
					if (jjmatchedPos + 1 < curPos) {
						input_stream.backup(curPos - jjmatchedPos - 1);
					}
					if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
						matchedToken = jjFillToken();
						matchedToken.specialToken = specialToken;
						if (jjnewLexState[jjmatchedKind] != -1) {
							curLexState = jjnewLexState[jjmatchedKind];
						}
						return matchedToken;
					} else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
						if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
							matchedToken = jjFillToken();
							if (specialToken == null) {
								specialToken = matchedToken;
							} else {
								matchedToken.specialToken = specialToken;
								specialToken = (specialToken.next = matchedToken);
							}
							SkipLexicalActions(matchedToken);
						} else {
							SkipLexicalActions(null);
						}
						if (jjnewLexState[jjmatchedKind] != -1) {
							curLexState = jjnewLexState[jjmatchedKind];
						}
						continue EOFLoop;
					}
					MoreLexicalActions();
					if (jjnewLexState[jjmatchedKind] != -1) {
						curLexState = jjnewLexState[jjmatchedKind];
					}
					curPos = 0;
					jjmatchedKind = 0x7fffffff;
					try {
						curChar = input_stream.readChar();
						continue;
					} catch (final java.io.IOException e1) {
					}
				}
				int error_line = input_stream.getEndLine();
				int error_column = input_stream.getEndColumn();
				String error_after = null;
				boolean EOFSeen = false;
				try {
					input_stream.readChar();
					input_stream.backup(1);
				} catch (final java.io.IOException e1) {
					EOFSeen = true;
					error_after = curPos <= 1 ? "" : input_stream.GetImage();
					if (curChar == '\n' || curChar == '\r') {
						error_line++;
						error_column = 0;
					} else {
						error_column++;
					}
				}
				if (!EOFSeen) {
					input_stream.backup(1);
					error_after = curPos <= 1 ? "" : input_stream.GetImage();
				}
				throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar,
						TokenMgrError.LEXICAL_ERROR);
			}
		}
	}

	void SkipLexicalActions(final Token matchedToken) {
		switch (jjmatchedKind) {
		default:
			break;
		}
	}

	void MoreLexicalActions() {
		jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
		switch (jjmatchedKind) {
		case 6:
			image.append(input_stream.GetSuffix(jjimageLen));
			jjimageLen = 0;
			input_stream.backup(1);
			break;
		default:
			break;
		}
	}

	private void jjCheckNAdd(final int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}

	private void jjAddStates(int start, final int end) {
		do {
			jjstateSet[jjnewStateCnt++] = jjnextStates[start];
		} while (start++ != end);
	}

	private void jjCheckNAddTwoStates(final int state1, final int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}

	private void jjCheckNAddStates(int start, final int end) {
		do {
			jjCheckNAdd(jjnextStates[start]);
		} while (start++ != end);
	}

	/** Constructor. */
	public ConfigParserTokenManager(final SimpleCharStream stream) {

		if (SimpleCharStream.staticFlag) {
			throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
		}

		input_stream = stream;
	}

	/** Constructor. */
	public ConfigParserTokenManager(final SimpleCharStream stream, final int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	/** Reinitialise parser. */
	public void ReInit(final SimpleCharStream stream) {
		jjmatchedPos = jjnewStateCnt = 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}

	private void ReInitRounds() {
		int i;
		jjround = 0x80000001;
		for (i = 56; i-- > 0;) {
			jjrounds[i] = 0x80000000;
		}
	}

	/** Reinitialise parser. */
	public void ReInit(final SimpleCharStream stream, final int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	/** Switch to specified lex state. */
	public void SwitchTo(final int lexState) {
		if (lexState >= 3 || lexState < 0) {
			throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.",
					TokenMgrError.INVALID_LEXICAL_STATE);
		} else {
			curLexState = lexState;
		}
	}

	/** Lexer state names. */
	public static final String[]	lexStateNames	= { "DEFAULT", "IN_FORMAL_COMMENT", "IN_MULTI_LINE_COMMENT", };

	/** Lex State array. */
	public static final int[]		jjnewLexState	= { -1, -1, -1, -1, -1, -1, 1, 2, -1, 0, 0, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, };
	static final long[]				jjtoToken		= { 0xffcca9001L, };
	static final long[]				jjtoSkip		= { 0x73eL, };
	static final long[]				jjtoSpecial		= { 0x700L, };
	static final long[]				jjtoMore		= { 0x8c0L, };
	protected SimpleCharStream		input_stream;

	private final int[]				jjrounds		= new int[56];
	private final int[]				jjstateSet		= new int[2 * 56];

	private final StringBuilder		jjimage			= new StringBuilder();
	private StringBuilder			image			= jjimage;
	private int						jjimageLen;
	private int						lengthOfMatch;

	protected char					curChar;
}
