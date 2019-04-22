// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.net.Uri;
import androidx.work.*;
import java.io.*;
import java.util.Iterator;

public class WorkTypeConverters
{
	public static interface BackoffPolicyIds
	{
	}

	public static interface NetworkTypeIds
	{
	}

	public static interface StateIds
	{
	}


	public static int backoffPolicyToInt(BackoffPolicy backoffpolicy)
	{
		static class _cls1
		{

			static final int $SwitchMap$androidx$work$BackoffPolicy[];
			static final int $SwitchMap$androidx$work$NetworkType[];
			static final int $SwitchMap$androidx$work$State[];

			static 
			{
				$SwitchMap$androidx$work$NetworkType = new int[NetworkType.values().length];
			//    0    0:invokestatic    #20  <Method NetworkType[] NetworkType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.NOT_REQUIRED.ordinal()] = 1;
			//    4    9:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//    5   12:getstatic       #26  <Field NetworkType NetworkType.NOT_REQUIRED>
			//    6   15:invokevirtual   #30  <Method int NetworkType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//*  10   23:getstatic       #33  <Field NetworkType NetworkType.CONNECTED>
			//*  11   26:invokevirtual   #30  <Method int NetworkType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//*  15   34:getstatic       #36  <Field NetworkType NetworkType.UNMETERED>
			//*  16   37:invokevirtual   #30  <Method int NetworkType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//*  20   45:getstatic       #39  <Field NetworkType NetworkType.NOT_ROAMING>
			//*  21   48:invokevirtual   #30  <Method int NetworkType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #22  <Field int[] $SwitchMap$androidx$work$NetworkType>
			//*  25   56:getstatic       #42  <Field NetworkType NetworkType.METERED>
			//*  26   59:invokevirtual   #30  <Method int NetworkType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:invokestatic    #47  <Method BackoffPolicy[] BackoffPolicy.values()>
			//*  30   67:arraylength     
			//*  31   68:newarray        int[]
			//*  32   70:putstatic       #49  <Field int[] $SwitchMap$androidx$work$BackoffPolicy>
			//*  33   73:getstatic       #49  <Field int[] $SwitchMap$androidx$work$BackoffPolicy>
			//*  34   76:getstatic       #53  <Field BackoffPolicy BackoffPolicy.EXPONENTIAL>
			//*  35   79:invokevirtual   #54  <Method int BackoffPolicy.ordinal()>
			//*  36   82:iconst_1        
			//*  37   83:iastore         
			//*  38   84:getstatic       #49  <Field int[] $SwitchMap$androidx$work$BackoffPolicy>
			//*  39   87:getstatic       #57  <Field BackoffPolicy BackoffPolicy.LINEAR>
			//*  40   90:invokevirtual   #54  <Method int BackoffPolicy.ordinal()>
			//*  41   93:iconst_2        
			//*  42   94:iastore         
			//*  43   95:invokestatic    #62  <Method State[] State.values()>
			//*  44   98:arraylength     
			//*  45   99:newarray        int[]
			//*  46  101:putstatic       #64  <Field int[] $SwitchMap$androidx$work$State>
			//*  47  104:getstatic       #64  <Field int[] $SwitchMap$androidx$work$State>
			//*  48  107:getstatic       #68  <Field State State.ENQUEUED>
			//*  49  110:invokevirtual   #69  <Method int State.ordinal()>
			//*  50  113:iconst_1        
			//*  51  114:iastore         
			//*  52  115:getstatic       #64  <Field int[] $SwitchMap$androidx$work$State>
			//*  53  118:getstatic       #72  <Field State State.RUNNING>
			//*  54  121:invokevirtual   #69  <Method int State.ordinal()>
			//*  55  124:iconst_2        
			//*  56  125:iastore         
			//*  57  126:getstatic       #64  <Field int[] $SwitchMap$androidx$work$State>
			//*  58  129:getstatic       #75  <Field State State.SUCCEEDED>
			//*  59  132:invokevirtual   #69  <Method int State.ordinal()>
			//*  60  135:iconst_3        
			//*  61  136:iastore         
			//*  62  137:getstatic       #64  <Field int[] $SwitchMap$androidx$work$State>
			//*  63  140:getstatic       #78  <Field State State.FAILED>
			//*  64  143:invokevirtual   #69  <Method int State.ordinal()>
			//*  65  146:iconst_4        
			//*  66  147:iastore         
			//*  67  148:getstatic       #64  <Field int[] $SwitchMap$androidx$work$State>
			//*  68  151:getstatic       #81  <Field State State.BLOCKED>
			//*  69  154:invokevirtual   #69  <Method int State.ordinal()>
			//*  70  157:iconst_5        
			//*  71  158:iastore         
			//*  72  159:getstatic       #64  <Field int[] $SwitchMap$androidx$work$State>
			//*  73  162:getstatic       #84  <Field State State.CANCELLED>
			//*  74  165:invokevirtual   #69  <Method int State.ordinal()>
			//*  75  168:bipush          6
			//*  76  170:iastore         
			//*  77  171:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   78  172:astore_0        
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.CONNECTED.ordinal()] = 2;
				}
			//*  79  173:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   80  176:astore_0        
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.UNMETERED.ordinal()] = 3;
				}
			//*  81  177:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   82  180:astore_0        
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.NOT_ROAMING.ordinal()] = 4;
				}
			//*  83  181:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   84  184:astore_0        
				try
				{
					$SwitchMap$androidx$work$NetworkType[NetworkType.METERED.ordinal()] = 5;
				}
			//*  85  185:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   86  188:astore_0        
				$SwitchMap$androidx$work$BackoffPolicy = new int[BackoffPolicy.values().length];
				try
				{
					$SwitchMap$androidx$work$BackoffPolicy[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
				}
			//*  87  189:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   88  192:astore_0        
				try
				{
					$SwitchMap$androidx$work$BackoffPolicy[BackoffPolicy.LINEAR.ordinal()] = 2;
				}
			//*  89  193:goto            84
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   90  196:astore_0        
				$SwitchMap$androidx$work$State = new int[State.values().length];
				try
				{
					$SwitchMap$androidx$work$State[State.ENQUEUED.ordinal()] = 1;
				}
			//*  91  197:goto            95
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   92  200:astore_0        
				try
				{
					$SwitchMap$androidx$work$State[State.RUNNING.ordinal()] = 2;
				}
			//*  93  201:goto            115
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   94  204:astore_0        
				try
				{
					$SwitchMap$androidx$work$State[State.SUCCEEDED.ordinal()] = 3;
				}
			//*  95  205:goto            126
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   96  208:astore_0        
				try
				{
					$SwitchMap$androidx$work$State[State.FAILED.ordinal()] = 4;
				}
			//*  97  209:goto            137
				catch(NoSuchFieldError nosuchfielderror10) { }
			//   98  212:astore_0        
				try
				{
					$SwitchMap$androidx$work$State[State.BLOCKED.ordinal()] = 5;
				}
			//*  99  213:goto            148
				catch(NoSuchFieldError nosuchfielderror11) { }
			//  100  216:astore_0        
				try
				{
					$SwitchMap$androidx$work$State[State.CANCELLED.ordinal()] = 6;
				}
			//* 101  217:goto            159
				catch(NoSuchFieldError nosuchfielderror12) { }
			//  102  220:astore_0        
			//* 103  221:return          
			}
		}

		switch(_cls1..SwitchMap.androidx.work.BackoffPolicy[backoffpolicy.ordinal()])
	//*   0    0:getstatic       #22  <Field int[] WorkTypeConverters$1.$SwitchMap$androidx$work$BackoffPolicy>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #28  <Method int BackoffPolicy.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 74
	//	               2 72
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   32:new             #30  <Class StringBuilder>
	//    6   35:dup             
	//    7   36:invokespecial   #34  <Method void StringBuilder()>
	//    8   39:astore_1        
			stringbuilder.append("Could not convert ");
	//    9   40:aload_1         
	//   10   41:ldc1            #36  <String "Could not convert ">
	//   11   43:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   12   46:pop             
			stringbuilder.append(((Object) (backoffpolicy)));
	//   13   47:aload_1         
	//   14   48:aload_0         
	//   15   49:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
	//   16   52:pop             
			stringbuilder.append(" to int");
	//   17   53:aload_1         
	//   18   54:ldc1            #45  <String " to int">
	//   19   56:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   20   59:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   60:new             #47  <Class IllegalArgumentException>
	//   22   63:dup             
	//   23   64:aload_1         
	//   24   65:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   25   68:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   26   71:athrow          

		case 2: // '\002'
			return 1;
	//   27   72:iconst_1        
	//   28   73:ireturn         

		case 1: // '\001'
			return 0;
	//   29   74:iconst_0        
	//   30   75:ireturn         
		}
	}

	public static ContentUriTriggers byteArrayToContentUriTriggers(byte abyte0[])
	{
		ByteArrayInputStream bytearrayinputstream;
		ContentUriTriggers contenturitriggers;
		contenturitriggers = new ContentUriTriggers();
	//    0    0:new             #62  <Class ContentUriTriggers>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void ContentUriTriggers()>
	//    3    7:astore          5
		if(abyte0 == null)
	//*   4    9:aload_0         
	//*   5   10:ifnonnull       16
			return contenturitriggers;
	//    6   13:aload           5
	//    7   15:areturn         
		bytearrayinputstream = new ByteArrayInputStream(abyte0);
	//    8   16:new             #65  <Class ByteArrayInputStream>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #68  <Method void ByteArrayInputStream(byte[])>
	//   12   24:astore          4
		Object obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (bytearrayinputstream)))));
	//   13   26:new             #70  <Class ObjectInputStream>
	//   14   29:dup             
	//   15   30:aload           4
	//   16   32:invokespecial   #73  <Method void ObjectInputStream(java.io.InputStream)>
	//   17   35:astore_2        
		abyte0 = ((byte []) (obj));
	//   18   36:aload_2         
	//   19   37:astore_0        
		int i = ((ObjectInputStream) (obj)).readInt();
	//   20   38:aload_2         
	//   21   39:invokevirtual   #76  <Method int ObjectInputStream.readInt()>
	//   22   42:istore_1        
_L2:
		if(i <= 0)
			break; /* Loop/switch isn't completed */
	//   23   43:iload_1         
	//   24   44:ifle            72
		abyte0 = ((byte []) (obj));
	//   25   47:aload_2         
	//   26   48:astore_0        
		contenturitriggers.add(Uri.parse(((ObjectInputStream) (obj)).readUTF()), ((ObjectInputStream) (obj)).readBoolean());
	//   27   49:aload           5
	//   28   51:aload_2         
	//   29   52:invokevirtual   #79  <Method String ObjectInputStream.readUTF()>
	//   30   55:invokestatic    #85  <Method Uri Uri.parse(String)>
	//   31   58:aload_2         
	//   32   59:invokevirtual   #89  <Method boolean ObjectInputStream.readBoolean()>
	//   33   62:invokevirtual   #93  <Method void ContentUriTriggers.add(Uri, boolean)>
		i--;
	//   34   65:iload_1         
	//   35   66:iconst_1        
	//   36   67:isub            
	//   37   68:istore_1        
		if(true) goto _L2; else goto _L1
	//   38   69:goto            43
_L1:
		try
		{
			((ObjectInputStream) (obj)).close();
	//   39   72:aload_2         
	//   40   73:invokevirtual   #96  <Method void ObjectInputStream.close()>
		}
	//*  41   76:goto            84
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  42   79:astore_0        
		{
			((IOException) (abyte0)).printStackTrace();
	//   43   80:aload_0         
	//   44   81:invokevirtual   #99  <Method void IOException.printStackTrace()>
		}
		IOException ioexception;
		try
		{
			bytearrayinputstream.close();
	//   45   84:aload           4
	//   46   86:invokevirtual   #100 <Method void ByteArrayInputStream.close()>
		}
	//*  47   89:aload           5
	//*  48   91:areturn         
	//*  49   92:astore_3        
	//*  50   93:goto            105
	//*  51   96:astore_2        
	//*  52   97:aconst_null     
	//*  53   98:astore_0        
	//*  54   99:goto            144
	//*  55  102:astore_3        
	//*  56  103:aconst_null     
	//*  57  104:astore_2        
	//*  58  105:aload_2         
	//*  59  106:astore_0        
	//*  60  107:aload_3         
	//*  61  108:invokevirtual   #99  <Method void IOException.printStackTrace()>
	//*  62  111:aload_2         
	//*  63  112:ifnull          127
	//*  64  115:aload_2         
	//*  65  116:invokevirtual   #96  <Method void ObjectInputStream.close()>
	//*  66  119:goto            127
	//*  67  122:astore_0        
	//*  68  123:aload_0         
	//*  69  124:invokevirtual   #99  <Method void IOException.printStackTrace()>
	//*  70  127:aload           4
	//*  71  129:invokevirtual   #100 <Method void ByteArrayInputStream.close()>
	//*  72  132:aload           5
	//*  73  134:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  74  135:astore_0        
		{
			((IOException) (abyte0)).printStackTrace();
	//   75  136:aload_0         
	//   76  137:invokevirtual   #99  <Method void IOException.printStackTrace()>
			return contenturitriggers;
	//   77  140:aload           5
	//   78  142:areturn         
		}
		return contenturitriggers;
		ioexception;
		break MISSING_BLOCK_LABEL_105;
		obj;
		abyte0 = null;
		break MISSING_BLOCK_LABEL_144;
		ioexception;
		obj = null;
		abyte0 = ((byte []) (obj));
		ioexception.printStackTrace();
		if(obj != null)
			try
			{
				((ObjectInputStream) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				((IOException) (abyte0)).printStackTrace();
			}
		bytearrayinputstream.close();
		return contenturitriggers;
		obj;
	//   79  143:astore_2        
		if(abyte0 != null)
	//*  80  144:aload_0         
	//*  81  145:ifnull          160
			try
			{
				((ObjectInputStream) (abyte0)).close();
	//   82  148:aload_0         
	//   83  149:invokevirtual   #96  <Method void ObjectInputStream.close()>
			}
	//*  84  152:goto            160
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  85  155:astore_0        
			{
				((IOException) (abyte0)).printStackTrace();
	//   86  156:aload_0         
	//   87  157:invokevirtual   #99  <Method void IOException.printStackTrace()>
			}
		try
		{
			bytearrayinputstream.close();
	//   88  160:aload           4
	//   89  162:invokevirtual   #100 <Method void ByteArrayInputStream.close()>
		}
	//*  90  165:goto            173
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  91  168:astore_0        
		{
			((IOException) (abyte0)).printStackTrace();
	//   92  169:aload_0         
	//   93  170:invokevirtual   #99  <Method void IOException.printStackTrace()>
		}
		throw obj;
	//   94  173:aload_2         
	//   95  174:athrow          
	}

	public static byte[] contentUriTriggersToByteArray(ContentUriTriggers contenturitriggers)
	{
		Object obj;
		Object obj2;
		ByteArrayOutputStream bytearrayoutputstream;
		int i = contenturitriggers.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int ContentUriTriggers.size()>
	//    2    4:istore_1        
		obj2 = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		obj = null;
	//    5    8:aconst_null     
	//    6    9:astore_2        
		if(i == 0)
	//*   7   10:iload_1         
	//*   8   11:ifne            16
			return null;
	//    9   14:aconst_null     
	//   10   15:areturn         
		bytearrayoutputstream = new ByteArrayOutputStream();
	//   11   16:new             #107 <Class ByteArrayOutputStream>
	//   12   19:dup             
	//   13   20:invokespecial   #108 <Method void ByteArrayOutputStream()>
	//   14   23:astore          5
		Object obj1 = ((Object) (new ObjectOutputStream(((java.io.OutputStream) (bytearrayoutputstream)))));
	//   15   25:new             #110 <Class ObjectOutputStream>
	//   16   28:dup             
	//   17   29:aload           5
	//   18   31:invokespecial   #113 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   19   34:astore_3        
		try
		{
			((ObjectOutputStream) (obj1)).writeInt(contenturitriggers.size());
	//   20   35:aload_3         
	//   21   36:aload_0         
	//   22   37:invokevirtual   #105 <Method int ContentUriTriggers.size()>
	//   23   40:invokevirtual   #117 <Method void ObjectOutputStream.writeInt(int)>
			for(contenturitriggers = ((ContentUriTriggers) (contenturitriggers.iterator())); ((Iterator) (contenturitriggers)).hasNext(); ((ObjectOutputStream) (obj1)).writeBoolean(((androidx.work.ContentUriTriggers.Trigger) (obj)).shouldTriggerForDescendants()))
	//*  24   43:aload_0         
	//*  25   44:invokevirtual   #121 <Method Iterator ContentUriTriggers.iterator()>
	//*  26   47:astore_0        
	//*  27   48:aload_0         
	//*  28   49:invokeinterface #126 <Method boolean Iterator.hasNext()>
	//*  29   54:ifeq            89
			{
				obj = ((Object) ((androidx.work.ContentUriTriggers.Trigger)((Iterator) (contenturitriggers)).next()));
	//   30   57:aload_0         
	//   31   58:invokeinterface #130 <Method Object Iterator.next()>
	//   32   63:checkcast       #132 <Class androidx.work.ContentUriTriggers$Trigger>
	//   33   66:astore_2        
				((ObjectOutputStream) (obj1)).writeUTF(((androidx.work.ContentUriTriggers.Trigger) (obj)).getUri().toString());
	//   34   67:aload_3         
	//   35   68:aload_2         
	//   36   69:invokevirtual   #136 <Method Uri androidx.work.ContentUriTriggers$Trigger.getUri()>
	//   37   72:invokevirtual   #137 <Method String Uri.toString()>
	//   38   75:invokevirtual   #140 <Method void ObjectOutputStream.writeUTF(String)>
			}

	//   39   78:aload_3         
	//   40   79:aload_2         
	//   41   80:invokevirtual   #143 <Method boolean androidx.work.ContentUriTriggers$Trigger.shouldTriggerForDescendants()>
	//   42   83:invokevirtual   #147 <Method void ObjectOutputStream.writeBoolean(boolean)>
		}
	//*  43   86:goto            48
	//*  44   89:aload_3         
	//*  45   90:invokevirtual   #148 <Method void ObjectOutputStream.close()>
	//*  46   93:goto            101
	//*  47   96:astore_0        
	//*  48   97:aload_0         
	//*  49   98:invokevirtual   #99  <Method void IOException.printStackTrace()>
	//*  50  101:aload           5
	//*  51  103:invokevirtual   #149 <Method void ByteArrayOutputStream.close()>
	//*  52  106:goto            166
	//*  53  109:astore_0        
	//*  54  110:goto            172
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  55  113:astore_2        
		{
			contenturitriggers = ((ContentUriTriggers) (obj1));
	//   56  114:aload_3         
	//   57  115:astore_0        
			obj1 = obj;
	//   58  116:aload_2         
	//   59  117:astore_3        
			break MISSING_BLOCK_LABEL_131;
	//   60  118:goto            131
		}
		try
		{
			((ObjectOutputStream) (obj1)).close();
		}
		// Misplaced declaration of an exception variable
		catch(ContentUriTriggers contenturitriggers)
		{
			((IOException) (contenturitriggers)).printStackTrace();
		}
		try
		{
			bytearrayoutputstream.close();
		}
	//*  61  121:astore_0        
	//*  62  122:aload_2         
	//*  63  123:astore_3        
	//*  64  124:goto            172
	//*  65  127:astore_3        
	//*  66  128:aload           4
	//*  67  130:astore_0        
	//*  68  131:aload_0         
	//*  69  132:astore_2        
	//*  70  133:aload_3         
	//*  71  134:invokevirtual   #99  <Method void IOException.printStackTrace()>
	//*  72  137:aload_0         
	//*  73  138:ifnull          153
	//*  74  141:aload_0         
	//*  75  142:invokevirtual   #148 <Method void ObjectOutputStream.close()>
	//*  76  145:goto            153
	//*  77  148:astore_0        
	//*  78  149:aload_0         
	//*  79  150:invokevirtual   #99  <Method void IOException.printStackTrace()>
	//*  80  153:aload           5
	//*  81  155:invokevirtual   #149 <Method void ByteArrayOutputStream.close()>
	//*  82  158:goto            166
		// Misplaced declaration of an exception variable
		catch(ContentUriTriggers contenturitriggers)
	//*  83  161:astore_0        
		{
			((IOException) (contenturitriggers)).printStackTrace();
	//   84  162:aload_0         
	//   85  163:invokevirtual   #99  <Method void IOException.printStackTrace()>
		}
		break MISSING_BLOCK_LABEL_166;
		contenturitriggers;
		break MISSING_BLOCK_LABEL_172;
		contenturitriggers;
		obj1 = obj;
		break MISSING_BLOCK_LABEL_172;
		obj1;
		contenturitriggers = ((ContentUriTriggers) (obj2));
		obj = ((Object) (contenturitriggers));
		((IOException) (obj1)).printStackTrace();
		if(contenturitriggers != null)
			try
			{
				((ObjectOutputStream) (contenturitriggers)).close();
			}
			// Misplaced declaration of an exception variable
			catch(ContentUriTriggers contenturitriggers)
			{
				((IOException) (contenturitriggers)).printStackTrace();
			}
		bytearrayoutputstream.close();
		return bytearrayoutputstream.toByteArray();
	//   86  166:aload           5
	//   87  168:invokevirtual   #153 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   88  171:areturn         
		if(obj1 != null)
	//*  89  172:aload_3         
	//*  90  173:ifnull          188
			try
			{
				((ObjectOutputStream) (obj1)).close();
	//   91  176:aload_3         
	//   92  177:invokevirtual   #148 <Method void ObjectOutputStream.close()>
			}
	//*  93  180:goto            188
			catch(IOException ioexception)
	//*  94  183:astore_2        
			{
				ioexception.printStackTrace();
	//   95  184:aload_2         
	//   96  185:invokevirtual   #99  <Method void IOException.printStackTrace()>
			}
		try
		{
			bytearrayoutputstream.close();
	//   97  188:aload           5
	//   98  190:invokevirtual   #149 <Method void ByteArrayOutputStream.close()>
		}
	//*  99  193:goto            201
		catch(IOException ioexception1)
	//* 100  196:astore_2        
		{
			ioexception1.printStackTrace();
	//  101  197:aload_2         
	//  102  198:invokevirtual   #99  <Method void IOException.printStackTrace()>
		}
		throw contenturitriggers;
	//  103  201:aload_0         
	//  104  202:athrow          
	}

	public static BackoffPolicy intToBackoffPolicy(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 68
	//	               1 64
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   24:new             #30  <Class StringBuilder>
	//    3   27:dup             
	//    4   28:invokespecial   #34  <Method void StringBuilder()>
	//    5   31:astore_1        
			stringbuilder.append("Could not convert ");
	//    6   32:aload_1         
	//    7   33:ldc1            #36  <String "Could not convert ">
	//    8   35:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    9   38:pop             
			stringbuilder.append(i);
	//   10   39:aload_1         
	//   11   40:iload_0         
	//   12   41:invokevirtual   #158 <Method StringBuilder StringBuilder.append(int)>
	//   13   44:pop             
			stringbuilder.append(" to BackoffPolicy");
	//   14   45:aload_1         
	//   15   46:ldc1            #160 <String " to BackoffPolicy">
	//   16   48:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   17   51:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   18   52:new             #47  <Class IllegalArgumentException>
	//   19   55:dup             
	//   20   56:aload_1         
	//   21   57:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   22   60:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   23   63:athrow          

		case 1: // '\001'
			return BackoffPolicy.LINEAR;
	//   24   64:getstatic       #164 <Field BackoffPolicy BackoffPolicy.LINEAR>
	//   25   67:areturn         

		case 0: // '\0'
			return BackoffPolicy.EXPONENTIAL;
	//   26   68:getstatic       #167 <Field BackoffPolicy BackoffPolicy.EXPONENTIAL>
	//   27   71:areturn         
		}
	}

	public static NetworkType intToNetworkType(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 92
	//	               1 88
	//	               2 84
	//	               3 80
	//	               4 76
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   36:new             #30  <Class StringBuilder>
	//    3   39:dup             
	//    4   40:invokespecial   #34  <Method void StringBuilder()>
	//    5   43:astore_1        
			stringbuilder.append("Could not convert ");
	//    6   44:aload_1         
	//    7   45:ldc1            #36  <String "Could not convert ">
	//    8   47:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    9   50:pop             
			stringbuilder.append(i);
	//   10   51:aload_1         
	//   11   52:iload_0         
	//   12   53:invokevirtual   #158 <Method StringBuilder StringBuilder.append(int)>
	//   13   56:pop             
			stringbuilder.append(" to NetworkType");
	//   14   57:aload_1         
	//   15   58:ldc1            #171 <String " to NetworkType">
	//   16   60:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   17   63:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   18   64:new             #47  <Class IllegalArgumentException>
	//   19   67:dup             
	//   20   68:aload_1         
	//   21   69:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   22   72:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   23   75:athrow          

		case 4: // '\004'
			return NetworkType.METERED;
	//   24   76:getstatic       #177 <Field NetworkType NetworkType.METERED>
	//   25   79:areturn         

		case 3: // '\003'
			return NetworkType.NOT_ROAMING;
	//   26   80:getstatic       #180 <Field NetworkType NetworkType.NOT_ROAMING>
	//   27   83:areturn         

		case 2: // '\002'
			return NetworkType.UNMETERED;
	//   28   84:getstatic       #183 <Field NetworkType NetworkType.UNMETERED>
	//   29   87:areturn         

		case 1: // '\001'
			return NetworkType.CONNECTED;
	//   30   88:getstatic       #186 <Field NetworkType NetworkType.CONNECTED>
	//   31   91:areturn         

		case 0: // '\0'
			return NetworkType.NOT_REQUIRED;
	//   32   92:getstatic       #189 <Field NetworkType NetworkType.NOT_REQUIRED>
	//   33   95:areturn         
		}
	}

	public static State intToState(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 5: default 40
	//	               0 100
	//	               1 96
	//	               2 92
	//	               3 88
	//	               4 84
	//	               5 80
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   40:new             #30  <Class StringBuilder>
	//    3   43:dup             
	//    4   44:invokespecial   #34  <Method void StringBuilder()>
	//    5   47:astore_1        
			stringbuilder.append("Could not convert ");
	//    6   48:aload_1         
	//    7   49:ldc1            #36  <String "Could not convert ">
	//    8   51:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    9   54:pop             
			stringbuilder.append(i);
	//   10   55:aload_1         
	//   11   56:iload_0         
	//   12   57:invokevirtual   #158 <Method StringBuilder StringBuilder.append(int)>
	//   13   60:pop             
			stringbuilder.append(" to State");
	//   14   61:aload_1         
	//   15   62:ldc1            #193 <String " to State">
	//   16   64:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   17   67:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   18   68:new             #47  <Class IllegalArgumentException>
	//   19   71:dup             
	//   20   72:aload_1         
	//   21   73:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   22   76:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   23   79:athrow          

		case 5: // '\005'
			return State.CANCELLED;
	//   24   80:getstatic       #199 <Field State State.CANCELLED>
	//   25   83:areturn         

		case 4: // '\004'
			return State.BLOCKED;
	//   26   84:getstatic       #202 <Field State State.BLOCKED>
	//   27   87:areturn         

		case 3: // '\003'
			return State.FAILED;
	//   28   88:getstatic       #205 <Field State State.FAILED>
	//   29   91:areturn         

		case 2: // '\002'
			return State.SUCCEEDED;
	//   30   92:getstatic       #208 <Field State State.SUCCEEDED>
	//   31   95:areturn         

		case 1: // '\001'
			return State.RUNNING;
	//   32   96:getstatic       #211 <Field State State.RUNNING>
	//   33   99:areturn         

		case 0: // '\0'
			return State.ENQUEUED;
	//   34  100:getstatic       #214 <Field State State.ENQUEUED>
	//   35  103:areturn         
		}
	}

	public static int networkTypeToInt(NetworkType networktype)
	{
		switch(_cls1..SwitchMap.androidx.work.NetworkType[networktype.ordinal()])
	//*   0    0:getstatic       #219 <Field int[] WorkTypeConverters$1.$SwitchMap$androidx$work$NetworkType>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #220 <Method int NetworkType.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 5: default 44
	//	               1 92
	//	               2 90
	//	               3 88
	//	               4 86
	//	               5 84
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   44:new             #30  <Class StringBuilder>
	//    6   47:dup             
	//    7   48:invokespecial   #34  <Method void StringBuilder()>
	//    8   51:astore_1        
			stringbuilder.append("Could not convert ");
	//    9   52:aload_1         
	//   10   53:ldc1            #36  <String "Could not convert ">
	//   11   55:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   12   58:pop             
			stringbuilder.append(((Object) (networktype)));
	//   13   59:aload_1         
	//   14   60:aload_0         
	//   15   61:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
	//   16   64:pop             
			stringbuilder.append(" to int");
	//   17   65:aload_1         
	//   18   66:ldc1            #45  <String " to int">
	//   19   68:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   20   71:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   72:new             #47  <Class IllegalArgumentException>
	//   22   75:dup             
	//   23   76:aload_1         
	//   24   77:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   25   80:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   26   83:athrow          

		case 5: // '\005'
			return 4;
	//   27   84:iconst_4        
	//   28   85:ireturn         

		case 4: // '\004'
			return 3;
	//   29   86:iconst_3        
	//   30   87:ireturn         

		case 3: // '\003'
			return 2;
	//   31   88:iconst_2        
	//   32   89:ireturn         

		case 2: // '\002'
			return 1;
	//   33   90:iconst_1        
	//   34   91:ireturn         

		case 1: // '\001'
			return 0;
	//   35   92:iconst_0        
	//   36   93:ireturn         
		}
	}

	public static int stateToInt(State state)
	{
		switch(_cls1..SwitchMap.androidx.work.State[state.ordinal()])
	//*   0    0:getstatic       #225 <Field int[] WorkTypeConverters$1.$SwitchMap$androidx$work$State>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #226 <Method int State.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 6: default 48
	//	               1 98
	//	               2 96
	//	               3 94
	//	               4 92
	//	               5 90
	//	               6 88
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   48:new             #30  <Class StringBuilder>
	//    6   51:dup             
	//    7   52:invokespecial   #34  <Method void StringBuilder()>
	//    8   55:astore_1        
			stringbuilder.append("Could not convert ");
	//    9   56:aload_1         
	//   10   57:ldc1            #36  <String "Could not convert ">
	//   11   59:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   12   62:pop             
			stringbuilder.append(((Object) (state)));
	//   13   63:aload_1         
	//   14   64:aload_0         
	//   15   65:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
	//   16   68:pop             
			stringbuilder.append(" to int");
	//   17   69:aload_1         
	//   18   70:ldc1            #45  <String " to int">
	//   19   72:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   20   75:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   76:new             #47  <Class IllegalArgumentException>
	//   22   79:dup             
	//   23   80:aload_1         
	//   24   81:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   25   84:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   26   87:athrow          

		case 6: // '\006'
			return 5;
	//   27   88:iconst_5        
	//   28   89:ireturn         

		case 5: // '\005'
			return 4;
	//   29   90:iconst_4        
	//   30   91:ireturn         

		case 4: // '\004'
			return 3;
	//   31   92:iconst_3        
	//   32   93:ireturn         

		case 3: // '\003'
			return 2;
	//   33   94:iconst_2        
	//   34   95:ireturn         

		case 2: // '\002'
			return 1;
	//   35   96:iconst_1        
	//   36   97:ireturn         

		case 1: // '\001'
			return 0;
	//   37   98:iconst_0        
	//   38   99:ireturn         
		}
	}
}
