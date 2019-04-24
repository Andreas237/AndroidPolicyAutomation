// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.contants;


public interface Contants
{
	public static interface Message
	{

		public static final int MESSAGE_HEAD_LENGTH = 12;
		public static final int MESSAGE_LENGTH_BIT_COUNT = 4;
		public static final String PACKET_CODE_DEFAULT = "9000";
		public static final byte PROTOCOL_VERSION = -128;
		public static final int RESPONSE_CODE_LENGTH = 2;
		public static final int SECURITY_LEVEL_BYTE_COUNT = 2;
	}

	public static interface Message.ReponseCode
	{

		public static final byte BUSINESS_DEFINE = 14;
		public static final byte SUCESS = 0;
	}

	public static interface Message.RtResponseCmdType
	{

		public static final int CMD_FIELD_ON = 2;
	}

	public static interface Message.SecurityLevel
	{

		public static final int DATA_CHECK_CRC = 2;
		public static final int DATA_CHECK_MAC = 1;
		public static final int DATA_ENCRYPT_3DES = 1;
		public static final int DATA_NO_CHECK = 0;
		public static final int DATA_NO_ENCRYPT = 0;
	}

	public static interface Message.TerminalType
	{

		public static final byte FM_MSG_HEAD_TTYPE_LTP = 64;
		public static final byte FM_MSG_HEAD_TTYPE_READER_1915 = 32;
		public static final byte FM_MSG_HEAD_TTYPE_READER_1920 = 64;
		public static final byte FM_MSG_HEAD_TTYPE_USB_CARD = 16;
	}


	public static final int MAC_LENGTH = 4;
	public static final byte VERSION = 17;
}
