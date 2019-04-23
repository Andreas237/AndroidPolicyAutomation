// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.net.Uri;
import androidx.work.*;
import java.io.*;
import java.util.Iterator;
import java.util.Set;

public class WorkTypeConverters
{
	public static interface BackoffPolicyIds
	{

		public static final int EXPONENTIAL = 0;
		public static final int LINEAR = 1;
	}

	public static interface NetworkTypeIds
	{

		public static final int CONNECTED = 1;
		public static final int METERED = 4;
		public static final int NOT_REQUIRED = 0;
		public static final int NOT_ROAMING = 3;
		public static final int UNMETERED = 2;
	}

	public static interface StateIds
	{

		public static final int BLOCKED = 4;
		public static final int CANCELLED = 5;
		public static final String COMPLETED_STATES = "(2, 3, 5)";
		public static final int ENQUEUED = 0;
		public static final int FAILED = 3;
		public static final int RUNNING = 1;
		public static final int SUCCEEDED = 2;
	}


	private WorkTypeConverters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static int backoffPolicyToInt(BackoffPolicy backoffpolicy)
	{
		static class _cls1
		{

			static final int $SwitchMap$androidx$work$BackoffPolicy[];
			static final int $SwitchMap$androidx$work$NetworkType[];
			static final int $SwitchMap$androidx$work$WorkInfo$State[];

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
			//*  43   95:invokestatic    #62  <Method androidx.work.WorkInfo$State[] androidx.work.WorkInfo$State.values()>
			//*  44   98:arraylength     
			//*  45   99:newarray        int[]
			//*  46  101:putstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
			//*  47  104:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
			//*  48  107:getstatic       #68  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
			//*  49  110:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
			//*  50  113:iconst_1        
			//*  51  114:iastore         
			//*  52  115:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
			//*  53  118:getstatic       #72  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.RUNNING>
			//*  54  121:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
			//*  55  124:iconst_2        
			//*  56  125:iastore         
			//*  57  126:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
			//*  58  129:getstatic       #75  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.SUCCEEDED>
			//*  59  132:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
			//*  60  135:iconst_3        
			//*  61  136:iastore         
			//*  62  137:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
			//*  63  140:getstatic       #78  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.FAILED>
			//*  64  143:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
			//*  65  146:iconst_4        
			//*  66  147:iastore         
			//*  67  148:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
			//*  68  151:getstatic       #81  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.BLOCKED>
			//*  69  154:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
			//*  70  157:iconst_5        
			//*  71  158:iastore         
			//*  72  159:getstatic       #64  <Field int[] $SwitchMap$androidx$work$WorkInfo$State>
			//*  73  162:getstatic       #84  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.CANCELLED>
			//*  74  165:invokevirtual   #69  <Method int androidx.work.WorkInfo$State.ordinal()>
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
				$SwitchMap$androidx$work$WorkInfo$State = new int[androidx.work.WorkInfo.State.values().length];
				try
				{
					$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.ENQUEUED.ordinal()] = 1;
				}
			//*  91  197:goto            95
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   92  200:astore_0        
				try
				{
					$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.RUNNING.ordinal()] = 2;
				}
			//*  93  201:goto            115
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   94  204:astore_0        
				try
				{
					$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.SUCCEEDED.ordinal()] = 3;
				}
			//*  95  205:goto            126
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   96  208:astore_0        
				try
				{
					$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.FAILED.ordinal()] = 4;
				}
			//*  97  209:goto            137
				catch(NoSuchFieldError nosuchfielderror10) { }
			//   98  212:astore_0        
				try
				{
					$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.BLOCKED.ordinal()] = 5;
				}
			//*  99  213:goto            148
				catch(NoSuchFieldError nosuchfielderror11) { }
			//  100  216:astore_0        
				try
				{
					$SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.CANCELLED.ordinal()] = 6;
				}
			//* 101  217:goto            159
				catch(NoSuchFieldError nosuchfielderror12) { }
			//  102  220:astore_0        
			//* 103  221:return          
			}
		}

		switch(_cls1..SwitchMap.androidx.work.BackoffPolicy[backoffpolicy.ordinal()])
	//*   0    0:getstatic       #27  <Field int[] WorkTypeConverters$1.$SwitchMap$androidx$work$BackoffPolicy>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #33  <Method int BackoffPolicy.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 74
	//	               2 72
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   32:new             #35  <Class StringBuilder>
	//    6   35:dup             
	//    7   36:invokespecial   #36  <Method void StringBuilder()>
	//    8   39:astore_1        
			stringbuilder.append("Could not convert ");
	//    9   40:aload_1         
	//   10   41:ldc1            #38  <String "Could not convert ">
	//   11   43:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   46:pop             
			stringbuilder.append(((Object) (backoffpolicy)));
	//   13   47:aload_1         
	//   14   48:aload_0         
	//   15   49:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   16   52:pop             
			stringbuilder.append(" to int");
	//   17   53:aload_1         
	//   18   54:ldc1            #47  <String " to int">
	//   19   56:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   20   59:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   60:new             #49  <Class IllegalArgumentException>
	//   22   63:dup             
	//   23   64:aload_1         
	//   24   65:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   25   68:invokespecial   #56  <Method void IllegalArgumentException(String)>
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
	//    0    0:new             #63  <Class ContentUriTriggers>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void ContentUriTriggers()>
	//    3    7:astore          5
		if(abyte0 == null)
	//*   4    9:aload_0         
	//*   5   10:ifnonnull       16
			return contenturitriggers;
	//    6   13:aload           5
	//    7   15:areturn         
		bytearrayinputstream = new ByteArrayInputStream(abyte0);
	//    8   16:new             #66  <Class ByteArrayInputStream>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #69  <Method void ByteArrayInputStream(byte[])>
	//   12   24:astore          4
		Object obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (bytearrayinputstream)))));
	//   13   26:new             #71  <Class ObjectInputStream>
	//   14   29:dup             
	//   15   30:aload           4
	//   16   32:invokespecial   #74  <Method void ObjectInputStream(java.io.InputStream)>
	//   17   35:astore_2        
		abyte0 = ((byte []) (obj));
	//   18   36:aload_2         
	//   19   37:astore_0        
		int i = ((ObjectInputStream) (obj)).readInt();
	//   20   38:aload_2         
	//   21   39:invokevirtual   #77  <Method int ObjectInputStream.readInt()>
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
	//   29   52:invokevirtual   #80  <Method String ObjectInputStream.readUTF()>
	//   30   55:invokestatic    #86  <Method Uri Uri.parse(String)>
	//   31   58:aload_2         
	//   32   59:invokevirtual   #90  <Method boolean ObjectInputStream.readBoolean()>
	//   33   62:invokevirtual   #94  <Method void ContentUriTriggers.add(Uri, boolean)>
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
	//   40   73:invokevirtual   #97  <Method void ObjectInputStream.close()>
		}
	//*  41   76:goto            84
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  42   79:astore_0        
		{
			((IOException) (abyte0)).printStackTrace();
	//   43   80:aload_0         
	//   44   81:invokevirtual   #100 <Method void IOException.printStackTrace()>
		}
		IOException ioexception;
		try
		{
			bytearrayinputstream.close();
	//   45   84:aload           4
	//   46   86:invokevirtual   #101 <Method void ByteArrayInputStream.close()>
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
	//*  61  108:invokevirtual   #100 <Method void IOException.printStackTrace()>
	//*  62  111:aload_2         
	//*  63  112:ifnull          127
	//*  64  115:aload_2         
	//*  65  116:invokevirtual   #97  <Method void ObjectInputStream.close()>
	//*  66  119:goto            127
	//*  67  122:astore_0        
	//*  68  123:aload_0         
	//*  69  124:invokevirtual   #100 <Method void IOException.printStackTrace()>
	//*  70  127:aload           4
	//*  71  129:invokevirtual   #101 <Method void ByteArrayInputStream.close()>
	//*  72  132:aload           5
	//*  73  134:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  74  135:astore_0        
		{
			((IOException) (abyte0)).printStackTrace();
	//   75  136:aload_0         
	//   76  137:invokevirtual   #100 <Method void IOException.printStackTrace()>
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
	//   83  149:invokevirtual   #97  <Method void ObjectInputStream.close()>
			}
	//*  84  152:goto            160
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  85  155:astore_0        
			{
				((IOException) (abyte0)).printStackTrace();
	//   86  156:aload_0         
	//   87  157:invokevirtual   #100 <Method void IOException.printStackTrace()>
			}
		try
		{
			bytearrayinputstream.close();
	//   88  160:aload           4
	//   89  162:invokevirtual   #101 <Method void ByteArrayInputStream.close()>
		}
	//*  90  165:goto            173
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  91  168:astore_0        
		{
			((IOException) (abyte0)).printStackTrace();
	//   92  169:aload_0         
	//   93  170:invokevirtual   #100 <Method void IOException.printStackTrace()>
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
	//    1    1:invokevirtual   #106 <Method int ContentUriTriggers.size()>
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
	//   11   16:new             #108 <Class ByteArrayOutputStream>
	//   12   19:dup             
	//   13   20:invokespecial   #109 <Method void ByteArrayOutputStream()>
	//   14   23:astore          5
		Object obj1 = ((Object) (new ObjectOutputStream(((java.io.OutputStream) (bytearrayoutputstream)))));
	//   15   25:new             #111 <Class ObjectOutputStream>
	//   16   28:dup             
	//   17   29:aload           5
	//   18   31:invokespecial   #114 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   19   34:astore_3        
		try
		{
			((ObjectOutputStream) (obj1)).writeInt(contenturitriggers.size());
	//   20   35:aload_3         
	//   21   36:aload_0         
	//   22   37:invokevirtual   #106 <Method int ContentUriTriggers.size()>
	//   23   40:invokevirtual   #118 <Method void ObjectOutputStream.writeInt(int)>
			for(contenturitriggers = ((ContentUriTriggers) (contenturitriggers.getTriggers().iterator())); ((Iterator) (contenturitriggers)).hasNext(); ((ObjectOutputStream) (obj1)).writeBoolean(((androidx.work.ContentUriTriggers.Trigger) (obj)).shouldTriggerForDescendants()))
	//*  24   43:aload_0         
	//*  25   44:invokevirtual   #122 <Method Set ContentUriTriggers.getTriggers()>
	//*  26   47:invokeinterface #128 <Method Iterator Set.iterator()>
	//*  27   52:astore_0        
	//*  28   53:aload_0         
	//*  29   54:invokeinterface #133 <Method boolean Iterator.hasNext()>
	//*  30   59:ifeq            94
			{
				obj = ((Object) ((androidx.work.ContentUriTriggers.Trigger)((Iterator) (contenturitriggers)).next()));
	//   31   62:aload_0         
	//   32   63:invokeinterface #137 <Method Object Iterator.next()>
	//   33   68:checkcast       #139 <Class androidx.work.ContentUriTriggers$Trigger>
	//   34   71:astore_2        
				((ObjectOutputStream) (obj1)).writeUTF(((androidx.work.ContentUriTriggers.Trigger) (obj)).getUri().toString());
	//   35   72:aload_3         
	//   36   73:aload_2         
	//   37   74:invokevirtual   #143 <Method Uri androidx.work.ContentUriTriggers$Trigger.getUri()>
	//   38   77:invokevirtual   #144 <Method String Uri.toString()>
	//   39   80:invokevirtual   #147 <Method void ObjectOutputStream.writeUTF(String)>
			}

	//   40   83:aload_3         
	//   41   84:aload_2         
	//   42   85:invokevirtual   #150 <Method boolean androidx.work.ContentUriTriggers$Trigger.shouldTriggerForDescendants()>
	//   43   88:invokevirtual   #154 <Method void ObjectOutputStream.writeBoolean(boolean)>
		}
	//*  44   91:goto            53
	//*  45   94:aload_3         
	//*  46   95:invokevirtual   #155 <Method void ObjectOutputStream.close()>
	//*  47   98:goto            106
	//*  48  101:astore_0        
	//*  49  102:aload_0         
	//*  50  103:invokevirtual   #100 <Method void IOException.printStackTrace()>
	//*  51  106:aload           5
	//*  52  108:invokevirtual   #156 <Method void ByteArrayOutputStream.close()>
	//*  53  111:goto            171
	//*  54  114:astore_0        
	//*  55  115:goto            177
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  56  118:astore_2        
		{
			contenturitriggers = ((ContentUriTriggers) (obj1));
	//   57  119:aload_3         
	//   58  120:astore_0        
			obj1 = obj;
	//   59  121:aload_2         
	//   60  122:astore_3        
			break MISSING_BLOCK_LABEL_136;
	//   61  123:goto            136
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
	//*  62  126:astore_0        
	//*  63  127:aload_2         
	//*  64  128:astore_3        
	//*  65  129:goto            177
	//*  66  132:astore_3        
	//*  67  133:aload           4
	//*  68  135:astore_0        
	//*  69  136:aload_0         
	//*  70  137:astore_2        
	//*  71  138:aload_3         
	//*  72  139:invokevirtual   #100 <Method void IOException.printStackTrace()>
	//*  73  142:aload_0         
	//*  74  143:ifnull          158
	//*  75  146:aload_0         
	//*  76  147:invokevirtual   #155 <Method void ObjectOutputStream.close()>
	//*  77  150:goto            158
	//*  78  153:astore_0        
	//*  79  154:aload_0         
	//*  80  155:invokevirtual   #100 <Method void IOException.printStackTrace()>
	//*  81  158:aload           5
	//*  82  160:invokevirtual   #156 <Method void ByteArrayOutputStream.close()>
	//*  83  163:goto            171
		// Misplaced declaration of an exception variable
		catch(ContentUriTriggers contenturitriggers)
	//*  84  166:astore_0        
		{
			((IOException) (contenturitriggers)).printStackTrace();
	//   85  167:aload_0         
	//   86  168:invokevirtual   #100 <Method void IOException.printStackTrace()>
		}
		break MISSING_BLOCK_LABEL_171;
		contenturitriggers;
		break MISSING_BLOCK_LABEL_177;
		contenturitriggers;
		obj1 = obj;
		break MISSING_BLOCK_LABEL_177;
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
	//   87  171:aload           5
	//   88  173:invokevirtual   #160 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   89  176:areturn         
		if(obj1 != null)
	//*  90  177:aload_3         
	//*  91  178:ifnull          193
			try
			{
				((ObjectOutputStream) (obj1)).close();
	//   92  181:aload_3         
	//   93  182:invokevirtual   #155 <Method void ObjectOutputStream.close()>
			}
	//*  94  185:goto            193
			catch(IOException ioexception)
	//*  95  188:astore_2        
			{
				ioexception.printStackTrace();
	//   96  189:aload_2         
	//   97  190:invokevirtual   #100 <Method void IOException.printStackTrace()>
			}
		try
		{
			bytearrayoutputstream.close();
	//   98  193:aload           5
	//   99  195:invokevirtual   #156 <Method void ByteArrayOutputStream.close()>
		}
	//* 100  198:goto            206
		catch(IOException ioexception1)
	//* 101  201:astore_2        
		{
			ioexception1.printStackTrace();
	//  102  202:aload_2         
	//  103  203:invokevirtual   #100 <Method void IOException.printStackTrace()>
		}
		throw contenturitriggers;
	//  104  206:aload_0         
	//  105  207:athrow          
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
	//    2   24:new             #35  <Class StringBuilder>
	//    3   27:dup             
	//    4   28:invokespecial   #36  <Method void StringBuilder()>
	//    5   31:astore_1        
			stringbuilder.append("Could not convert ");
	//    6   32:aload_1         
	//    7   33:ldc1            #38  <String "Could not convert ">
	//    8   35:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   38:pop             
			stringbuilder.append(i);
	//   10   39:aload_1         
	//   11   40:iload_0         
	//   12   41:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//   13   44:pop             
			stringbuilder.append(" to BackoffPolicy");
	//   14   45:aload_1         
	//   15   46:ldc1            #167 <String " to BackoffPolicy">
	//   16   48:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   17   51:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   18   52:new             #49  <Class IllegalArgumentException>
	//   19   55:dup             
	//   20   56:aload_1         
	//   21   57:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   22   60:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   23   63:athrow          

		case 1: // '\001'
			return BackoffPolicy.LINEAR;
	//   24   64:getstatic       #171 <Field BackoffPolicy BackoffPolicy.LINEAR>
	//   25   67:areturn         

		case 0: // '\0'
			return BackoffPolicy.EXPONENTIAL;
	//   26   68:getstatic       #174 <Field BackoffPolicy BackoffPolicy.EXPONENTIAL>
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
	//    2   36:new             #35  <Class StringBuilder>
	//    3   39:dup             
	//    4   40:invokespecial   #36  <Method void StringBuilder()>
	//    5   43:astore_1        
			stringbuilder.append("Could not convert ");
	//    6   44:aload_1         
	//    7   45:ldc1            #38  <String "Could not convert ">
	//    8   47:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   50:pop             
			stringbuilder.append(i);
	//   10   51:aload_1         
	//   11   52:iload_0         
	//   12   53:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//   13   56:pop             
			stringbuilder.append(" to NetworkType");
	//   14   57:aload_1         
	//   15   58:ldc1            #178 <String " to NetworkType">
	//   16   60:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   17   63:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   18   64:new             #49  <Class IllegalArgumentException>
	//   19   67:dup             
	//   20   68:aload_1         
	//   21   69:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   22   72:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   23   75:athrow          

		case 4: // '\004'
			return NetworkType.METERED;
	//   24   76:getstatic       #184 <Field NetworkType NetworkType.METERED>
	//   25   79:areturn         

		case 3: // '\003'
			return NetworkType.NOT_ROAMING;
	//   26   80:getstatic       #187 <Field NetworkType NetworkType.NOT_ROAMING>
	//   27   83:areturn         

		case 2: // '\002'
			return NetworkType.UNMETERED;
	//   28   84:getstatic       #190 <Field NetworkType NetworkType.UNMETERED>
	//   29   87:areturn         

		case 1: // '\001'
			return NetworkType.CONNECTED;
	//   30   88:getstatic       #193 <Field NetworkType NetworkType.CONNECTED>
	//   31   91:areturn         

		case 0: // '\0'
			return NetworkType.NOT_REQUIRED;
	//   32   92:getstatic       #196 <Field NetworkType NetworkType.NOT_REQUIRED>
	//   33   95:areturn         
		}
	}

	public static androidx.work.WorkInfo.State intToState(int i)
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
	//    2   40:new             #35  <Class StringBuilder>
	//    3   43:dup             
	//    4   44:invokespecial   #36  <Method void StringBuilder()>
	//    5   47:astore_1        
			stringbuilder.append("Could not convert ");
	//    6   48:aload_1         
	//    7   49:ldc1            #38  <String "Could not convert ">
	//    8   51:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   54:pop             
			stringbuilder.append(i);
	//   10   55:aload_1         
	//   11   56:iload_0         
	//   12   57:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//   13   60:pop             
			stringbuilder.append(" to State");
	//   14   61:aload_1         
	//   15   62:ldc1            #200 <String " to State">
	//   16   64:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   17   67:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   18   68:new             #49  <Class IllegalArgumentException>
	//   19   71:dup             
	//   20   72:aload_1         
	//   21   73:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   22   76:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   23   79:athrow          

		case 5: // '\005'
			return androidx.work.WorkInfo.State.CANCELLED;
	//   24   80:getstatic       #206 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.CANCELLED>
	//   25   83:areturn         

		case 4: // '\004'
			return androidx.work.WorkInfo.State.BLOCKED;
	//   26   84:getstatic       #209 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.BLOCKED>
	//   27   87:areturn         

		case 3: // '\003'
			return androidx.work.WorkInfo.State.FAILED;
	//   28   88:getstatic       #212 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.FAILED>
	//   29   91:areturn         

		case 2: // '\002'
			return androidx.work.WorkInfo.State.SUCCEEDED;
	//   30   92:getstatic       #215 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.SUCCEEDED>
	//   31   95:areturn         

		case 1: // '\001'
			return androidx.work.WorkInfo.State.RUNNING;
	//   32   96:getstatic       #218 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.RUNNING>
	//   33   99:areturn         

		case 0: // '\0'
			return androidx.work.WorkInfo.State.ENQUEUED;
	//   34  100:getstatic       #221 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//   35  103:areturn         
		}
	}

	public static int networkTypeToInt(NetworkType networktype)
	{
		switch(_cls1..SwitchMap.androidx.work.NetworkType[networktype.ordinal()])
	//*   0    0:getstatic       #226 <Field int[] WorkTypeConverters$1.$SwitchMap$androidx$work$NetworkType>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #227 <Method int NetworkType.ordinal()>
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
	//    5   44:new             #35  <Class StringBuilder>
	//    6   47:dup             
	//    7   48:invokespecial   #36  <Method void StringBuilder()>
	//    8   51:astore_1        
			stringbuilder.append("Could not convert ");
	//    9   52:aload_1         
	//   10   53:ldc1            #38  <String "Could not convert ">
	//   11   55:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   58:pop             
			stringbuilder.append(((Object) (networktype)));
	//   13   59:aload_1         
	//   14   60:aload_0         
	//   15   61:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   16   64:pop             
			stringbuilder.append(" to int");
	//   17   65:aload_1         
	//   18   66:ldc1            #47  <String " to int">
	//   19   68:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   20   71:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   72:new             #49  <Class IllegalArgumentException>
	//   22   75:dup             
	//   23   76:aload_1         
	//   24   77:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   25   80:invokespecial   #56  <Method void IllegalArgumentException(String)>
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

	public static int stateToInt(androidx.work.WorkInfo.State state)
	{
		switch(_cls1..SwitchMap.androidx.work.WorkInfo.State[state.ordinal()])
	//*   0    0:getstatic       #232 <Field int[] WorkTypeConverters$1.$SwitchMap$androidx$work$WorkInfo$State>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #233 <Method int androidx.work.WorkInfo$State.ordinal()>
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
	//    5   48:new             #35  <Class StringBuilder>
	//    6   51:dup             
	//    7   52:invokespecial   #36  <Method void StringBuilder()>
	//    8   55:astore_1        
			stringbuilder.append("Could not convert ");
	//    9   56:aload_1         
	//   10   57:ldc1            #38  <String "Could not convert ">
	//   11   59:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   62:pop             
			stringbuilder.append(((Object) (state)));
	//   13   63:aload_1         
	//   14   64:aload_0         
	//   15   65:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   16   68:pop             
			stringbuilder.append(" to int");
	//   17   69:aload_1         
	//   18   70:ldc1            #47  <String " to int">
	//   19   72:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   20   75:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   76:new             #49  <Class IllegalArgumentException>
	//   22   79:dup             
	//   23   80:aload_1         
	//   24   81:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   25   84:invokespecial   #56  <Method void IllegalArgumentException(String)>
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
