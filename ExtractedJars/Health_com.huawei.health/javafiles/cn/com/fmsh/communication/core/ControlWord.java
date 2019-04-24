// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;


public class ControlWord
{
	public static final class CommandType extends Enum
	{

		public static CommandType valueOf(String s)
		{
			return (CommandType)Enum.valueOf(cn/com/fmsh/communication/core/ControlWord$CommandType, s);
		//    0    0:ldc1            #2   <Class ControlWord$CommandType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ControlWord$CommandType>
		//    4    9:areturn         
		}

		public static CommandType[] values()
		{
			CommandType acommandtype[] = ENUM$VALUES;
		//    0    0:getstatic       #37  <Field ControlWord$CommandType[] ENUM$VALUES>
		//    1    3:astore_1        
			int i = acommandtype.length;
		//    2    4:aload_1         
		//    3    5:arraylength     
		//    4    6:istore_0        
			CommandType acommandtype1[] = new CommandType[i];
		//    5    7:iload_0         
		//    6    8:anewarray       CommandType[]
		//    7   11:astore_2        
			System.arraycopy(((Object) (acommandtype)), 0, ((Object) (acommandtype1)), 0, i);
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:aload_2         
		//   11   15:iconst_0        
		//   12   16:iload_0         
		//   13   17:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
			return acommandtype1;
		//   14   20:aload_2         
		//   15   21:areturn         
		}

		public static final CommandType BUSINESS_ERROR;
		public static final CommandType CLOSESESSION;
		private static final CommandType ENUM$VALUES[];
		public static final CommandType HEARTBEAT;
		public static final CommandType OPENSESSION;
		private int value;

		static 
		{
			HEARTBEAT = new CommandType("HEARTBEAT", 0, 0);
		//    0    0:new             #2   <Class ControlWord$CommandType>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "HEARTBEAT">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #24  <Method void ControlWord$CommandType(String, int, int)>
		//    6   11:putstatic       #26  <Field ControlWord$CommandType HEARTBEAT>
			OPENSESSION = new CommandType("OPENSESSION", 1, 1);
		//    7   14:new             #2   <Class ControlWord$CommandType>
		//    8   17:dup             
		//    9   18:ldc1            #27  <String "OPENSESSION">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #24  <Method void ControlWord$CommandType(String, int, int)>
		//   13   25:putstatic       #29  <Field ControlWord$CommandType OPENSESSION>
			CLOSESESSION = new CommandType("CLOSESESSION", 2, 2);
		//   14   28:new             #2   <Class ControlWord$CommandType>
		//   15   31:dup             
		//   16   32:ldc1            #30  <String "CLOSESESSION">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #24  <Method void ControlWord$CommandType(String, int, int)>
		//   20   39:putstatic       #32  <Field ControlWord$CommandType CLOSESESSION>
			BUSINESS_ERROR = new CommandType("BUSINESS_ERROR", 3, 3);
		//   21   42:new             #2   <Class ControlWord$CommandType>
		//   22   45:dup             
		//   23   46:ldc1            #33  <String "BUSINESS_ERROR">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #24  <Method void ControlWord$CommandType(String, int, int)>
		//   27   53:putstatic       #35  <Field ControlWord$CommandType BUSINESS_ERROR>
			ENUM$VALUES = (new CommandType[] {
				HEARTBEAT, OPENSESSION, CLOSESESSION, BUSINESS_ERROR
			});
		//   28   56:iconst_4        
		//   29   57:anewarray       CommandType[]
		//   30   60:dup             
		//   31   61:iconst_0        
		//   32   62:getstatic       #26  <Field ControlWord$CommandType HEARTBEAT>
		//   33   65:aastore         
		//   34   66:dup             
		//   35   67:iconst_1        
		//   36   68:getstatic       #29  <Field ControlWord$CommandType OPENSESSION>
		//   37   71:aastore         
		//   38   72:dup             
		//   39   73:iconst_2        
		//   40   74:getstatic       #32  <Field ControlWord$CommandType CLOSESESSION>
		//   41   77:aastore         
		//   42   78:dup             
		//   43   79:iconst_3        
		//   44   80:getstatic       #35  <Field ControlWord$CommandType BUSINESS_ERROR>
		//   45   83:aastore         
		//   46   84:putstatic       #37  <Field ControlWord$CommandType[] ENUM$VALUES>
		//*  47   87:return          
		}

		private CommandType(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #43  <Field int value>
		//    7   11:return          
		}
	}

	public static final class Direction extends Enum
	{

		public static Direction valueOf(String s)
		{
			return (Direction)Enum.valueOf(cn/com/fmsh/communication/core/ControlWord$Direction, s);
		//    0    0:ldc1            #2   <Class ControlWord$Direction>
		//    1    2:aload_0         
		//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ControlWord$Direction>
		//    4    9:areturn         
		}

		public static Direction[] values()
		{
			Direction adirection[] = ENUM$VALUES;
		//    0    0:getstatic       #29  <Field ControlWord$Direction[] ENUM$VALUES>
		//    1    3:astore_1        
			int i = adirection.length;
		//    2    4:aload_1         
		//    3    5:arraylength     
		//    4    6:istore_0        
			Direction adirection1[] = new Direction[i];
		//    5    7:iload_0         
		//    6    8:anewarray       Direction[]
		//    7   11:astore_2        
			System.arraycopy(((Object) (adirection)), 0, ((Object) (adirection1)), 0, i);
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:aload_2         
		//   11   15:iconst_0        
		//   12   16:iload_0         
		//   13   17:invokestatic    #48  <Method void System.arraycopy(Object, int, Object, int, int)>
			return adirection1;
		//   14   20:aload_2         
		//   15   21:areturn         
		}

		private static final Direction ENUM$VALUES[];
		public static final Direction REQUEST;
		public static final Direction RESPONSE;
		private int value;

		static 
		{
			REQUEST = new Direction("REQUEST", 0, 0);
		//    0    0:new             #2   <Class ControlWord$Direction>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "REQUEST">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #22  <Method void ControlWord$Direction(String, int, int)>
		//    6   11:putstatic       #24  <Field ControlWord$Direction REQUEST>
			RESPONSE = new Direction("RESPONSE", 1, 1);
		//    7   14:new             #2   <Class ControlWord$Direction>
		//    8   17:dup             
		//    9   18:ldc1            #25  <String "RESPONSE">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #22  <Method void ControlWord$Direction(String, int, int)>
		//   13   25:putstatic       #27  <Field ControlWord$Direction RESPONSE>
			ENUM$VALUES = (new Direction[] {
				REQUEST, RESPONSE
			});
		//   14   28:iconst_2        
		//   15   29:anewarray       Direction[]
		//   16   32:dup             
		//   17   33:iconst_0        
		//   18   34:getstatic       #24  <Field ControlWord$Direction REQUEST>
		//   19   37:aastore         
		//   20   38:dup             
		//   21   39:iconst_1        
		//   22   40:getstatic       #27  <Field ControlWord$Direction RESPONSE>
		//   23   43:aastore         
		//   24   44:putstatic       #29  <Field ControlWord$Direction[] ENUM$VALUES>
		//*  25   47:return          
		}

		private Direction(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #35  <Field int value>
		//    7   11:return          
		}
	}

	public static final class MessageType extends Enum
	{

		public static MessageType valueOf(String s)
		{
			return (MessageType)Enum.valueOf(cn/com/fmsh/communication/core/ControlWord$MessageType, s);
		//    0    0:ldc1            #2   <Class ControlWord$MessageType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ControlWord$MessageType>
		//    4    9:areturn         
		}

		public static MessageType[] values()
		{
			MessageType amessagetype[] = ENUM$VALUES;
		//    0    0:getstatic       #29  <Field ControlWord$MessageType[] ENUM$VALUES>
		//    1    3:astore_1        
			int i = amessagetype.length;
		//    2    4:aload_1         
		//    3    5:arraylength     
		//    4    6:istore_0        
			MessageType amessagetype1[] = new MessageType[i];
		//    5    7:iload_0         
		//    6    8:anewarray       MessageType[]
		//    7   11:astore_2        
			System.arraycopy(((Object) (amessagetype)), 0, ((Object) (amessagetype1)), 0, i);
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:aload_2         
		//   11   15:iconst_0        
		//   12   16:iload_0         
		//   13   17:invokestatic    #48  <Method void System.arraycopy(Object, int, Object, int, int)>
			return amessagetype1;
		//   14   20:aload_2         
		//   15   21:areturn         
		}

		public static final MessageType BUSINESS;
		public static final MessageType CONTROL;
		private static final MessageType ENUM$VALUES[];
		private int value;

		static 
		{
			BUSINESS = new MessageType("BUSINESS", 0, 0);
		//    0    0:new             #2   <Class ControlWord$MessageType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "BUSINESS">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #22  <Method void ControlWord$MessageType(String, int, int)>
		//    6   11:putstatic       #24  <Field ControlWord$MessageType BUSINESS>
			CONTROL = new MessageType("CONTROL", 1, 1);
		//    7   14:new             #2   <Class ControlWord$MessageType>
		//    8   17:dup             
		//    9   18:ldc1            #25  <String "CONTROL">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #22  <Method void ControlWord$MessageType(String, int, int)>
		//   13   25:putstatic       #27  <Field ControlWord$MessageType CONTROL>
			ENUM$VALUES = (new MessageType[] {
				BUSINESS, CONTROL
			});
		//   14   28:iconst_2        
		//   15   29:anewarray       MessageType[]
		//   16   32:dup             
		//   17   33:iconst_0        
		//   18   34:getstatic       #24  <Field ControlWord$MessageType BUSINESS>
		//   19   37:aastore         
		//   20   38:dup             
		//   21   39:iconst_1        
		//   22   40:getstatic       #27  <Field ControlWord$MessageType CONTROL>
		//   23   43:aastore         
		//   24   44:putstatic       #29  <Field ControlWord$MessageType[] ENUM$VALUES>
		//*  25   47:return          
		}

		private MessageType(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #35  <Field int value>
		//    7   11:return          
		}
	}


	static int[] $SWITCH_TABLE$cn$com$fmsh$communication$core$ControlWord$CommandType()
	{
		int ai[] = $SWITCH_TABLE$cn$com$fmsh$communication$core$ControlWord$CommandType;
	//    0    0:getstatic       #30  <Field int[] $SWITCH_TABLE$cn$com$fmsh$communication$core$ControlWord$CommandType>
	//    1    3:astore_0        
		if(ai != null)
	//*   2    4:aload_0         
	//*   3    5:ifnull          10
			return ai;
	//    4    8:aload_0         
	//    5    9:areturn         
		ai = new int[CommandType.values().length];
	//    6   10:invokestatic    #34  <Method ControlWord$CommandType[] ControlWord$CommandType.values()>
	//    7   13:arraylength     
	//    8   14:newarray        int[]
	//    9   16:astore_0        
		try
		{
			ai[CommandType.BUSINESS_ERROR.ordinal()] = 4;
	//   10   17:aload_0         
	//   11   18:getstatic       #37  <Field ControlWord$CommandType ControlWord$CommandType.BUSINESS_ERROR>
	//   12   21:invokevirtual   #41  <Method int ControlWord$CommandType.ordinal()>
	//   13   24:iconst_4        
	//   14   25:iastore         
		}
	//*  15   26:aload_0         
	//*  16   27:getstatic       #44  <Field ControlWord$CommandType ControlWord$CommandType.CLOSESESSION>
	//*  17   30:invokevirtual   #41  <Method int ControlWord$CommandType.ordinal()>
	//*  18   33:iconst_3        
	//*  19   34:iastore         
	//*  20   35:aload_0         
	//*  21   36:getstatic       #47  <Field ControlWord$CommandType ControlWord$CommandType.HEARTBEAT>
	//*  22   39:invokevirtual   #41  <Method int ControlWord$CommandType.ordinal()>
	//*  23   42:iconst_1        
	//*  24   43:iastore         
	//*  25   44:aload_0         
	//*  26   45:getstatic       #50  <Field ControlWord$CommandType ControlWord$CommandType.OPENSESSION>
	//*  27   48:invokevirtual   #41  <Method int ControlWord$CommandType.ordinal()>
	//*  28   51:iconst_2        
	//*  29   52:iastore         
	//*  30   53:aload_0         
	//*  31   54:putstatic       #30  <Field int[] $SWITCH_TABLE$cn$com$fmsh$communication$core$ControlWord$CommandType>
	//*  32   57:aload_0         
	//*  33   58:areturn         
		catch(NoSuchFieldError nosuchfielderror) { }
	//   34   59:astore_1        
		try
		{
			ai[CommandType.CLOSESESSION.ordinal()] = 3;
		}
	//*  35   60:goto            26
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   36   63:astore_1        
		try
		{
			ai[CommandType.HEARTBEAT.ordinal()] = 1;
		}
	//*  37   64:goto            35
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   38   67:astore_1        
		try
		{
			ai[CommandType.OPENSESSION.ordinal()] = 2;
		}
	//*  39   68:goto            44
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   40   71:astore_1        
		$SWITCH_TABLE$cn$com$fmsh$communication$core$ControlWord$CommandType = ai;
		return ai;
	//*  41   72:goto            53
	}

	public ControlWord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
	//    2    4:return          
	}

	public void fromBytes(byte byte0)
	{
		if((byte0 & 0x80) == 0)
	//*   0    0:iload_1         
	//*   1    1:sipush          128
	//*   2    4:iand            
	//*   3    5:ifne            18
		{
			type = MessageType.BUSINESS;
	//    4    8:aload_0         
	//    5    9:getstatic       #60  <Field ControlWord$MessageType ControlWord$MessageType.BUSINESS>
	//    6   12:putfield        #62  <Field ControlWord$MessageType type>
		} else
	//*   7   15:goto            104
		{
			type = MessageType.CONTROL;
	//    8   18:aload_0         
	//    9   19:getstatic       #65  <Field ControlWord$MessageType ControlWord$MessageType.CONTROL>
	//   10   22:putfield        #62  <Field ControlWord$MessageType type>
			switch((byte)((byte)(byte0 & 0x60) >> 5))
	//*  11   25:iload_1         
	//*  12   26:bipush          96
	//*  13   28:iand            
	//*  14   29:int2byte        
	//*  15   30:iconst_5        
	//*  16   31:ishr            
	//*  17   32:int2byte        
			{
	//*  18   33:tableswitch     0 3: default 64
	//	               0 67
	//	               1 77
	//	               2 87
	//	               3 97
	//*  19   64:goto            104
			case 0: // '\0'
				commandType = CommandType.HEARTBEAT;
	//   20   67:aload_0         
	//   21   68:getstatic       #47  <Field ControlWord$CommandType ControlWord$CommandType.HEARTBEAT>
	//   22   71:putfield        #67  <Field ControlWord$CommandType commandType>
				break;

	//*  23   74:goto            104
			case 1: // '\001'
				commandType = CommandType.OPENSESSION;
	//   24   77:aload_0         
	//   25   78:getstatic       #50  <Field ControlWord$CommandType ControlWord$CommandType.OPENSESSION>
	//   26   81:putfield        #67  <Field ControlWord$CommandType commandType>
				break;

	//*  27   84:goto            104
			case 2: // '\002'
				commandType = CommandType.CLOSESESSION;
	//   28   87:aload_0         
	//   29   88:getstatic       #44  <Field ControlWord$CommandType ControlWord$CommandType.CLOSESESSION>
	//   30   91:putfield        #67  <Field ControlWord$CommandType commandType>
				break;

	//*  31   94:goto            104
			case 3: // '\003'
				commandType = CommandType.BUSINESS_ERROR;
	//   32   97:aload_0         
	//   33   98:getstatic       #37  <Field ControlWord$CommandType ControlWord$CommandType.BUSINESS_ERROR>
	//   34  101:putfield        #67  <Field ControlWord$CommandType commandType>
				break;
			}
		}
		if((byte)(byte0 & 0x10) == 0)
	//*  35  104:iload_1         
	//*  36  105:bipush          16
	//*  37  107:iand            
	//*  38  108:int2byte        
	//*  39  109:ifne            122
			direction = Direction.REQUEST;
	//   40  112:aload_0         
	//   41  113:getstatic       #70  <Field ControlWord$Direction ControlWord$Direction.REQUEST>
	//   42  116:putfield        #72  <Field ControlWord$Direction direction>
		else
	//*  43  119:goto            129
			direction = Direction.RESPONSE;
	//   44  122:aload_0         
	//   45  123:getstatic       #75  <Field ControlWord$Direction ControlWord$Direction.RESPONSE>
	//   46  126:putfield        #72  <Field ControlWord$Direction direction>
		if(direction == Direction.RESPONSE)
	//*  47  129:aload_0         
	//*  48  130:getfield        #72  <Field ControlWord$Direction direction>
	//*  49  133:getstatic       #75  <Field ControlWord$Direction ControlWord$Direction.RESPONSE>
	//*  50  136:if_acmpne       206
		{
			if(type == MessageType.BUSINESS)
	//*  51  139:aload_0         
	//*  52  140:getfield        #62  <Field ControlWord$MessageType type>
	//*  53  143:getstatic       #60  <Field ControlWord$MessageType ControlWord$MessageType.BUSINESS>
	//*  54  146:if_acmpne       168
				if((byte0 & 0xf) == 0)
	//*  55  149:iload_1         
	//*  56  150:bipush          15
	//*  57  152:iand            
	//*  58  153:ifne            162
				{
					haveNews = false;
	//   59  156:aload_0         
	//   60  157:iconst_0        
	//   61  158:putfield        #77  <Field boolean haveNews>
					return;
	//   62  161:return          
				} else
				{
					haveNews = true;
	//   63  162:aload_0         
	//   64  163:iconst_1        
	//   65  164:putfield        #77  <Field boolean haveNews>
					return;
	//   66  167:return          
				}
			if(commandType == CommandType.HEARTBEAT)
	//*  67  168:aload_0         
	//*  68  169:getfield        #67  <Field ControlWord$CommandType commandType>
	//*  69  172:getstatic       #47  <Field ControlWord$CommandType ControlWord$CommandType.HEARTBEAT>
	//*  70  175:if_acmpne       197
				if((byte0 & 0xf) == 0)
	//*  71  178:iload_1         
	//*  72  179:bipush          15
	//*  73  181:iand            
	//*  74  182:ifne            191
				{
					haveNews = false;
	//   75  185:aload_0         
	//   76  186:iconst_0        
	//   77  187:putfield        #77  <Field boolean haveNews>
					return;
	//   78  190:return          
				} else
				{
					haveNews = true;
	//   79  191:aload_0         
	//   80  192:iconst_1        
	//   81  193:putfield        #77  <Field boolean haveNews>
					return;
	//   82  196:return          
				}
			reponseCode = (byte)(byte0 & 0xf);
	//   83  197:aload_0         
	//   84  198:iload_1         
	//   85  199:bipush          15
	//   86  201:iand            
	//   87  202:int2byte        
	//   88  203:putfield        #79  <Field byte reponseCode>
		}
	//   89  206:return          
	}

	public CommandType getCommandType()
	{
		return commandType;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ControlWord$CommandType commandType>
	//    2    4:areturn         
	}

	public Direction getDirection()
	{
		return direction;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ControlWord$Direction direction>
	//    2    4:areturn         
	}

	public byte getReponseCode()
	{
		return reponseCode;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field byte reponseCode>
	//    2    4:ireturn         
	}

	public MessageType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ControlWord$MessageType type>
	//    2    4:areturn         
	}

	public boolean isHaveNews()
	{
		return haveNews;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean haveNews>
	//    2    4:ireturn         
	}

	public void setCommandType(CommandType commandtype)
	{
		commandType = commandtype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field ControlWord$CommandType commandType>
	//    3    5:return          
	}

	public void setDirection(Direction direction1)
	{
		direction = direction1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field ControlWord$Direction direction>
	//    3    5:return          
	}

	public void setHaveNews(boolean flag)
	{
		haveNews = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean haveNews>
	//    3    5:return          
	}

	public void setReponseCode(byte byte0)
	{
		reponseCode = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field byte reponseCode>
	//    3    5:return          
	}

	public void setType(MessageType messagetype)
	{
		type = messagetype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field ControlWord$MessageType type>
	//    3    5:return          
	}

	public byte toBytes()
	{
		byte byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(type == MessageType.CONTROL)
	//*   2    2:aload_0         
	//*   3    3:getfield        #62  <Field ControlWord$MessageType type>
	//*   4    6:getstatic       #65  <Field ControlWord$MessageType ControlWord$MessageType.CONTROL>
	//*   5    9:if_acmpne       77
		{
			byte0 = -128;
	//    6   12:bipush          -128
	//    7   14:istore_1        
			switch($SWITCH_TABLE$cn$com$fmsh$communication$core$ControlWord$CommandType()[commandType.ordinal()])
	//*   8   15:invokestatic    #101 <Method int[] $SWITCH_TABLE$cn$com$fmsh$communication$core$ControlWord$CommandType()>
	//*   9   18:aload_0         
	//*  10   19:getfield        #67  <Field ControlWord$CommandType commandType>
	//*  11   22:invokevirtual   #41  <Method int ControlWord$CommandType.ordinal()>
	//*  12   25:iaload          
			{
	//*  13   26:tableswitch     1 4: default 56
	//	               1 59
	//	               2 62
	//	               3 68
	//	               4 74
	//*  14   56:goto            77
	//*  15   59:goto            77
			case 2: // '\002'
				byte0 = -96;
	//   16   62:bipush          -96
	//   17   64:istore_1        
				break;

	//*  18   65:goto            77
			case 3: // '\003'
				byte0 = -64;
	//   19   68:bipush          -64
	//   20   70:istore_1        
				break;

	//*  21   71:goto            77
			case 4: // '\004'
				byte0 = -32;
	//   22   74:bipush          -32
	//   23   76:istore_1        
				break;
			}
		}
		byte byte1 = byte0;
	//   24   77:iload_1         
	//   25   78:istore_2        
		if(direction == Direction.RESPONSE)
	//*  26   79:aload_0         
	//*  27   80:getfield        #72  <Field ControlWord$Direction direction>
	//*  28   83:getstatic       #75  <Field ControlWord$Direction ControlWord$Direction.RESPONSE>
	//*  29   86:if_acmpne       140
		{
			byte0 &= 0x10;
	//   30   89:iload_1         
	//   31   90:bipush          16
	//   32   92:iand            
	//   33   93:int2byte        
	//   34   94:istore_1        
			if(commandType == CommandType.HEARTBEAT || type == MessageType.BUSINESS)
	//*  35   95:aload_0         
	//*  36   96:getfield        #67  <Field ControlWord$CommandType commandType>
	//*  37   99:getstatic       #47  <Field ControlWord$CommandType ControlWord$CommandType.HEARTBEAT>
	//*  38  102:if_acmpeq       115
	//*  39  105:aload_0         
	//*  40  106:getfield        #62  <Field ControlWord$MessageType type>
	//*  41  109:getstatic       #60  <Field ControlWord$MessageType ControlWord$MessageType.BUSINESS>
	//*  42  112:if_acmpne       129
			{
				byte1 = byte0;
	//   43  115:iload_1         
	//   44  116:istore_2        
				if(haveNews)
	//*  45  117:aload_0         
	//*  46  118:getfield        #77  <Field boolean haveNews>
	//*  47  121:ifeq            140
					return (byte)(byte0 | 1);
	//   48  124:iload_1         
	//   49  125:iconst_1        
	//   50  126:ior             
	//   51  127:int2byte        
	//   52  128:ireturn         
			} else
			{
				byte1 = (byte)(reponseCode & 0xf | byte0);
	//   53  129:aload_0         
	//   54  130:getfield        #79  <Field byte reponseCode>
	//   55  133:bipush          15
	//   56  135:iand            
	//   57  136:iload_1         
	//   58  137:ior             
	//   59  138:int2byte        
	//   60  139:istore_2        
			}
		}
		return byte1;
	//   61  140:iload_2         
	//   62  141:ireturn         
	}

	private static int $SWITCH_TABLE$cn$com$fmsh$communication$core$ControlWord$CommandType[];
	private CommandType commandType;
	private Direction direction;
	private boolean haveNews;
	private byte reponseCode;
	private MessageType type;
}
