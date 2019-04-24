// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import java.io.*;
import java.util.Calendar;
import java.util.Locale;

// Referenced classes of package com.adjust.sdk:
//			AdjustFactory, Util, ILogger

public class ActivityState
	implements Serializable, Cloneable
{

	protected ActivityState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		logger = AdjustFactory.getLogger();
	//    2    4:aload_0         
	//    3    5:invokestatic    #72  <Method ILogger AdjustFactory.getLogger()>
	//    4    8:putfield        #74  <Field ILogger logger>
		uuid = Util.createUuid();
	//    5   11:aload_0         
	//    6   12:invokestatic    #80  <Method String Util.createUuid()>
	//    7   15:putfield        #82  <Field String uuid>
		enabled = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #84  <Field boolean enabled>
		askingAttribution = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #86  <Field boolean askingAttribution>
		eventCount = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #88  <Field int eventCount>
		sessionCount = 0;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #90  <Field int sessionCount>
		subsessionCount = -1;
	//   20   38:aload_0         
	//   21   39:iconst_m1       
	//   22   40:putfield        #92  <Field int subsessionCount>
		sessionLength = -1L;
	//   23   43:aload_0         
	//   24   44:ldc2w           #93  <Long -1L>
	//   25   47:putfield        #96  <Field long sessionLength>
		timeSpent = -1L;
	//   26   50:aload_0         
	//   27   51:ldc2w           #93  <Long -1L>
	//   28   54:putfield        #98  <Field long timeSpent>
		lastActivity = -1L;
	//   29   57:aload_0         
	//   30   58:ldc2w           #93  <Long -1L>
	//   31   61:putfield        #100 <Field long lastActivity>
		lastInterval = -1L;
	//   32   64:aload_0         
	//   33   65:ldc2w           #93  <Long -1L>
	//   34   68:putfield        #102 <Field long lastInterval>
	//   35   71:return          
	}

	private void readObject(ObjectInputStream objectinputstream)
		throws IOException, ClassNotFoundException
	{
		objectinputstream = ((ObjectInputStream) (objectinputstream.readFields()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method java.io.ObjectInputStream$GetField ObjectInputStream.readFields()>
	//    2    4:astore_1        
		eventCount = Util.readIntField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "eventCount", 0);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #49  <String "eventCount">
	//    6    9:iconst_0        
	//    7   10:invokestatic    #118 <Method int Util.readIntField(java.io.ObjectInputStream$GetField, String, int)>
	//    8   13:putfield        #88  <Field int eventCount>
		sessionCount = Util.readIntField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "sessionCount", 0);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:ldc1            #53  <String "sessionCount">
	//   12   20:iconst_0        
	//   13   21:invokestatic    #118 <Method int Util.readIntField(java.io.ObjectInputStream$GetField, String, int)>
	//   14   24:putfield        #90  <Field int sessionCount>
		subsessionCount = Util.readIntField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "subsessionCount", -1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:ldc1            #54  <String "subsessionCount">
	//   18   31:iconst_m1       
	//   19   32:invokestatic    #118 <Method int Util.readIntField(java.io.ObjectInputStream$GetField, String, int)>
	//   20   35:putfield        #92  <Field int subsessionCount>
		sessionLength = Util.readLongField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "sessionLength", -1L);
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:ldc1            #55  <String "sessionLength">
	//   24   42:ldc2w           #93  <Long -1L>
	//   25   45:invokestatic    #122 <Method long Util.readLongField(java.io.ObjectInputStream$GetField, String, long)>
	//   26   48:putfield        #96  <Field long sessionLength>
		timeSpent = Util.readLongField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "timeSpent", -1L);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:ldc1            #59  <String "timeSpent">
	//   30   55:ldc2w           #93  <Long -1L>
	//   31   58:invokestatic    #122 <Method long Util.readLongField(java.io.ObjectInputStream$GetField, String, long)>
	//   32   61:putfield        #98  <Field long timeSpent>
		lastActivity = Util.readLongField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "lastActivity", -1L);
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:ldc1            #60  <String "lastActivity">
	//   36   68:ldc2w           #93  <Long -1L>
	//   37   71:invokestatic    #122 <Method long Util.readLongField(java.io.ObjectInputStream$GetField, String, long)>
	//   38   74:putfield        #100 <Field long lastActivity>
		lastInterval = Util.readLongField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "lastInterval", -1L);
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:ldc1            #61  <String "lastInterval">
	//   42   81:ldc2w           #93  <Long -1L>
	//   43   84:invokestatic    #122 <Method long Util.readLongField(java.io.ObjectInputStream$GetField, String, long)>
	//   44   87:putfield        #102 <Field long lastInterval>
		uuid = Util.readStringField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "uuid", ((String) (null)));
	//   45   90:aload_0         
	//   46   91:aload_1         
	//   47   92:ldc1            #34  <String "uuid">
	//   48   94:aconst_null     
	//   49   95:invokestatic    #126 <Method String Util.readStringField(java.io.ObjectInputStream$GetField, String, String)>
	//   50   98:putfield        #82  <Field String uuid>
		enabled = Util.readBooleanField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "enabled", true);
	//   51  101:aload_0         
	//   52  102:aload_1         
	//   53  103:ldc1            #41  <String "enabled">
	//   54  105:iconst_1        
	//   55  106:invokestatic    #130 <Method boolean Util.readBooleanField(java.io.ObjectInputStream$GetField, String, boolean)>
	//   56  109:putfield        #84  <Field boolean enabled>
		askingAttribution = Util.readBooleanField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "askingAttribution", false);
	//   57  112:aload_0         
	//   58  113:aload_1         
	//   59  114:ldc1            #48  <String "askingAttribution">
	//   60  116:iconst_0        
	//   61  117:invokestatic    #130 <Method boolean Util.readBooleanField(java.io.ObjectInputStream$GetField, String, boolean)>
	//   62  120:putfield        #86  <Field boolean askingAttribution>
		if(uuid == null)
	//*  63  123:aload_0         
	//*  64  124:getfield        #82  <Field String uuid>
	//*  65  127:ifnonnull       137
			uuid = Util.createUuid();
	//   66  130:aload_0         
	//   67  131:invokestatic    #80  <Method String Util.createUuid()>
	//   68  134:putfield        #82  <Field String uuid>
	//   69  137:return          
	}

	private static String stamp(long l)
	{
		Calendar.getInstance().setTimeInMillis(l);
	//    0    0:invokestatic    #139 <Method Calendar Calendar.getInstance()>
	//    1    3:lload_0         
	//    2    4:invokevirtual   #143 <Method void Calendar.setTimeInMillis(long)>
		return String.format(Locale.US, "%02d:%02d:%02d", new Object[] {
			Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13)
		});
	//    3    7:getstatic       #149 <Field Locale Locale.US>
	//    4   10:ldc1            #151 <String "%02d:%02d:%02d">
	//    5   12:iconst_3        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:bipush          11
	//   10   20:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   11   23:aastore         
	//   12   24:dup             
	//   13   25:iconst_1        
	//   14   26:bipush          12
	//   15   28:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_2        
	//   19   34:bipush          13
	//   20   36:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   21   39:aastore         
	//   22   40:invokestatic    #159 <Method String String.format(Locale, String, Object[])>
	//   23   43:areturn         
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		objectoutputstream.defaultWriteObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #166 <Method void ObjectOutputStream.defaultWriteObject()>
	//    2    4:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #172 <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #172 <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ActivityState)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ActivityState>
	//   18   30:astore_1        
		if(!Util.equalString(uuid, ((ActivityState) (obj)).uuid))
	//*  19   31:aload_0         
	//*  20   32:getfield        #82  <Field String uuid>
	//*  21   35:aload_1         
	//*  22   36:getfield        #82  <Field String uuid>
	//*  23   39:invokestatic    #176 <Method boolean Util.equalString(String, String)>
	//*  24   42:ifne            47
			return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		if(!Util.equalBoolean(Boolean.valueOf(enabled), Boolean.valueOf(((ActivityState) (obj)).enabled)))
	//*  27   47:aload_0         
	//*  28   48:getfield        #84  <Field boolean enabled>
	//*  29   51:invokestatic    #179 <Method Boolean Boolean.valueOf(boolean)>
	//*  30   54:aload_1         
	//*  31   55:getfield        #84  <Field boolean enabled>
	//*  32   58:invokestatic    #179 <Method Boolean Boolean.valueOf(boolean)>
	//*  33   61:invokestatic    #183 <Method boolean Util.equalBoolean(Boolean, Boolean)>
	//*  34   64:ifne            69
			return false;
	//   35   67:iconst_0        
	//   36   68:ireturn         
		if(!Util.equalBoolean(Boolean.valueOf(askingAttribution), Boolean.valueOf(((ActivityState) (obj)).askingAttribution)))
	//*  37   69:aload_0         
	//*  38   70:getfield        #86  <Field boolean askingAttribution>
	//*  39   73:invokestatic    #179 <Method Boolean Boolean.valueOf(boolean)>
	//*  40   76:aload_1         
	//*  41   77:getfield        #86  <Field boolean askingAttribution>
	//*  42   80:invokestatic    #179 <Method Boolean Boolean.valueOf(boolean)>
	//*  43   83:invokestatic    #183 <Method boolean Util.equalBoolean(Boolean, Boolean)>
	//*  44   86:ifne            91
			return false;
	//   45   89:iconst_0        
	//   46   90:ireturn         
		if(!Util.equalInt(Integer.valueOf(eventCount), Integer.valueOf(((ActivityState) (obj)).eventCount)))
	//*  47   91:aload_0         
	//*  48   92:getfield        #88  <Field int eventCount>
	//*  49   95:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//*  50   98:aload_1         
	//*  51   99:getfield        #88  <Field int eventCount>
	//*  52  102:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//*  53  105:invokestatic    #187 <Method boolean Util.equalInt(Integer, Integer)>
	//*  54  108:ifne            113
			return false;
	//   55  111:iconst_0        
	//   56  112:ireturn         
		if(!Util.equalInt(Integer.valueOf(sessionCount), Integer.valueOf(((ActivityState) (obj)).sessionCount)))
	//*  57  113:aload_0         
	//*  58  114:getfield        #90  <Field int sessionCount>
	//*  59  117:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//*  60  120:aload_1         
	//*  61  121:getfield        #90  <Field int sessionCount>
	//*  62  124:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//*  63  127:invokestatic    #187 <Method boolean Util.equalInt(Integer, Integer)>
	//*  64  130:ifne            135
			return false;
	//   65  133:iconst_0        
	//   66  134:ireturn         
		if(!Util.equalInt(Integer.valueOf(subsessionCount), Integer.valueOf(((ActivityState) (obj)).subsessionCount)))
	//*  67  135:aload_0         
	//*  68  136:getfield        #92  <Field int subsessionCount>
	//*  69  139:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//*  70  142:aload_1         
	//*  71  143:getfield        #92  <Field int subsessionCount>
	//*  72  146:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//*  73  149:invokestatic    #187 <Method boolean Util.equalInt(Integer, Integer)>
	//*  74  152:ifne            157
			return false;
	//   75  155:iconst_0        
	//   76  156:ireturn         
		if(!Util.equalLong(Long.valueOf(sessionLength), Long.valueOf(((ActivityState) (obj)).sessionLength)))
	//*  77  157:aload_0         
	//*  78  158:getfield        #96  <Field long sessionLength>
	//*  79  161:invokestatic    #190 <Method Long Long.valueOf(long)>
	//*  80  164:aload_1         
	//*  81  165:getfield        #96  <Field long sessionLength>
	//*  82  168:invokestatic    #190 <Method Long Long.valueOf(long)>
	//*  83  171:invokestatic    #194 <Method boolean Util.equalLong(Long, Long)>
	//*  84  174:ifne            179
			return false;
	//   85  177:iconst_0        
	//   86  178:ireturn         
		if(!Util.equalLong(Long.valueOf(timeSpent), Long.valueOf(((ActivityState) (obj)).timeSpent)))
	//*  87  179:aload_0         
	//*  88  180:getfield        #98  <Field long timeSpent>
	//*  89  183:invokestatic    #190 <Method Long Long.valueOf(long)>
	//*  90  186:aload_1         
	//*  91  187:getfield        #98  <Field long timeSpent>
	//*  92  190:invokestatic    #190 <Method Long Long.valueOf(long)>
	//*  93  193:invokestatic    #194 <Method boolean Util.equalLong(Long, Long)>
	//*  94  196:ifne            201
			return false;
	//   95  199:iconst_0        
	//   96  200:ireturn         
		return Util.equalLong(Long.valueOf(lastInterval), Long.valueOf(((ActivityState) (obj)).lastInterval));
	//   97  201:aload_0         
	//   98  202:getfield        #102 <Field long lastInterval>
	//   99  205:invokestatic    #190 <Method Long Long.valueOf(long)>
	//  100  208:aload_1         
	//  101  209:getfield        #102 <Field long lastInterval>
	//  102  212:invokestatic    #190 <Method Long Long.valueOf(long)>
	//  103  215:invokestatic    #194 <Method boolean Util.equalLong(Long, Long)>
	//  104  218:ifne            223
	//  105  221:iconst_0        
	//  106  222:ireturn         
	//  107  223:iconst_1        
	//  108  224:ireturn         
	}

	public int hashCode()
	{
		return 37 * ((((((((629 + Util.hashString(uuid)) * 37 + Util.hashBoolean(Boolean.valueOf(enabled))) * 37 + Util.hashBoolean(Boolean.valueOf(askingAttribution))) * 37 + eventCount) * 37 + sessionCount) * 37 + subsessionCount) * 37 + Util.hashLong(Long.valueOf(sessionLength))) * 37 + Util.hashLong(Long.valueOf(timeSpent))) + Util.hashLong(Long.valueOf(lastInterval));
	//    0    0:bipush          37
	//    1    2:sipush          629
	//    2    5:aload_0         
	//    3    6:getfield        #82  <Field String uuid>
	//    4    9:invokestatic    #200 <Method int Util.hashString(String)>
	//    5   12:iadd            
	//    6   13:bipush          37
	//    7   15:imul            
	//    8   16:aload_0         
	//    9   17:getfield        #84  <Field boolean enabled>
	//   10   20:invokestatic    #179 <Method Boolean Boolean.valueOf(boolean)>
	//   11   23:invokestatic    #204 <Method int Util.hashBoolean(Boolean)>
	//   12   26:iadd            
	//   13   27:bipush          37
	//   14   29:imul            
	//   15   30:aload_0         
	//   16   31:getfield        #86  <Field boolean askingAttribution>
	//   17   34:invokestatic    #179 <Method Boolean Boolean.valueOf(boolean)>
	//   18   37:invokestatic    #204 <Method int Util.hashBoolean(Boolean)>
	//   19   40:iadd            
	//   20   41:bipush          37
	//   21   43:imul            
	//   22   44:aload_0         
	//   23   45:getfield        #88  <Field int eventCount>
	//   24   48:iadd            
	//   25   49:bipush          37
	//   26   51:imul            
	//   27   52:aload_0         
	//   28   53:getfield        #90  <Field int sessionCount>
	//   29   56:iadd            
	//   30   57:bipush          37
	//   31   59:imul            
	//   32   60:aload_0         
	//   33   61:getfield        #92  <Field int subsessionCount>
	//   34   64:iadd            
	//   35   65:bipush          37
	//   36   67:imul            
	//   37   68:aload_0         
	//   38   69:getfield        #96  <Field long sessionLength>
	//   39   72:invokestatic    #190 <Method Long Long.valueOf(long)>
	//   40   75:invokestatic    #208 <Method int Util.hashLong(Long)>
	//   41   78:iadd            
	//   42   79:bipush          37
	//   43   81:imul            
	//   44   82:aload_0         
	//   45   83:getfield        #98  <Field long timeSpent>
	//   46   86:invokestatic    #190 <Method Long Long.valueOf(long)>
	//   47   89:invokestatic    #208 <Method int Util.hashLong(Long)>
	//   48   92:iadd            
	//   49   93:imul            
	//   50   94:aload_0         
	//   51   95:getfield        #102 <Field long lastInterval>
	//   52   98:invokestatic    #190 <Method Long Long.valueOf(long)>
	//   53  101:invokestatic    #208 <Method int Util.hashLong(Long)>
	//   54  104:iadd            
	//   55  105:ireturn         
	}

	protected void resetSessionAttributes(long l)
	{
		subsessionCount = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #92  <Field int subsessionCount>
		sessionLength = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #96  <Field long sessionLength>
		timeSpent = 0L;
	//    6   10:aload_0         
	//    7   11:lconst_0        
	//    8   12:putfield        #98  <Field long timeSpent>
		lastActivity = l;
	//    9   15:aload_0         
	//   10   16:lload_1         
	//   11   17:putfield        #100 <Field long lastActivity>
		lastInterval = -1L;
	//   12   20:aload_0         
	//   13   21:ldc2w           #93  <Long -1L>
	//   14   24:putfield        #102 <Field long lastInterval>
	//   15   27:return          
	}

	public ActivityState shallowCopy()
	{
		CloneNotSupportedException clonenotsupportedexception;
		ActivityState activitystate;
		try
		{
			activitystate = (ActivityState)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #217 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class ActivityState>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
	//*   6   10:aconst_null     
	//*   7   11:areturn         
		// Misplaced declaration of an exception variable
		catch(CloneNotSupportedException clonenotsupportedexception)
		{
			return null;
		}
		return activitystate;
	//*   8   12:astore_1        
	//*   9   13:goto            10
	}

	public String toString()
	{
		return String.format(Locale.US, "ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s", new Object[] {
			Integer.valueOf(eventCount), Integer.valueOf(sessionCount), Integer.valueOf(subsessionCount), Double.valueOf((double)sessionLength / 1000D), Double.valueOf((double)timeSpent / 1000D), stamp(lastActivity), uuid
		});
	//    0    0:getstatic       #149 <Field Locale Locale.US>
	//    1    3:ldc1            #220 <String "ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s">
	//    2    5:bipush          7
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #88  <Field int eventCount>
	//    8   16:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//    9   19:aastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:aload_0         
	//   13   23:getfield        #90  <Field int sessionCount>
	//   14   26:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   15   29:aastore         
	//   16   30:dup             
	//   17   31:iconst_2        
	//   18   32:aload_0         
	//   19   33:getfield        #92  <Field int subsessionCount>
	//   20   36:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   21   39:aastore         
	//   22   40:dup             
	//   23   41:iconst_3        
	//   24   42:aload_0         
	//   25   43:getfield        #96  <Field long sessionLength>
	//   26   46:l2d             
	//   27   47:ldc2w           #221 <Double 1000D>
	//   28   50:ddiv            
	//   29   51:invokestatic    #227 <Method Double Double.valueOf(double)>
	//   30   54:aastore         
	//   31   55:dup             
	//   32   56:iconst_4        
	//   33   57:aload_0         
	//   34   58:getfield        #98  <Field long timeSpent>
	//   35   61:l2d             
	//   36   62:ldc2w           #221 <Double 1000D>
	//   37   65:ddiv            
	//   38   66:invokestatic    #227 <Method Double Double.valueOf(double)>
	//   39   69:aastore         
	//   40   70:dup             
	//   41   71:iconst_5        
	//   42   72:aload_0         
	//   43   73:getfield        #100 <Field long lastActivity>
	//   44   76:invokestatic    #229 <Method String stamp(long)>
	//   45   79:aastore         
	//   46   80:dup             
	//   47   81:bipush          6
	//   48   83:aload_0         
	//   49   84:getfield        #82  <Field String uuid>
	//   50   87:aastore         
	//   51   88:invokestatic    #159 <Method String String.format(Locale, String, Object[])>
	//   52   91:areturn         
	}

	private static final ObjectStreamField serialPersistentFields[];
	private static final long serialVersionUID = 0x6d4bab64L;
	protected boolean askingAttribution;
	protected boolean enabled;
	protected int eventCount;
	protected long lastActivity;
	protected long lastInterval;
	private transient ILogger logger;
	protected int sessionCount;
	protected long sessionLength;
	protected int subsessionCount;
	protected long timeSpent;
	protected String uuid;

	static 
	{
		serialPersistentFields = (new ObjectStreamField[] {
			new ObjectStreamField("uuid", java/lang/String), new ObjectStreamField("enabled", Boolean.TYPE), new ObjectStreamField("askingAttribution", Boolean.TYPE), new ObjectStreamField("eventCount", Integer.TYPE), new ObjectStreamField("sessionCount", Integer.TYPE), new ObjectStreamField("subsessionCount", Integer.TYPE), new ObjectStreamField("sessionLength", Long.TYPE), new ObjectStreamField("timeSpent", Long.TYPE), new ObjectStreamField("lastActivity", Long.TYPE), new ObjectStreamField("lastInterval", Long.TYPE)
		});
	//    0    0:bipush          10
	//    1    2:anewarray       ObjectStreamField[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:new             #33  <Class ObjectStreamField>
	//    5   10:dup             
	//    6   11:ldc1            #34  <String "uuid">
	//    7   13:ldc1            #36  <Class String>
	//    8   15:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:new             #33  <Class ObjectStreamField>
	//   13   24:dup             
	//   14   25:ldc1            #41  <String "enabled">
	//   15   27:getstatic       #47  <Field Class Boolean.TYPE>
	//   16   30:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//   17   33:aastore         
	//   18   34:dup             
	//   19   35:iconst_2        
	//   20   36:new             #33  <Class ObjectStreamField>
	//   21   39:dup             
	//   22   40:ldc1            #48  <String "askingAttribution">
	//   23   42:getstatic       #47  <Field Class Boolean.TYPE>
	//   24   45:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//   25   48:aastore         
	//   26   49:dup             
	//   27   50:iconst_3        
	//   28   51:new             #33  <Class ObjectStreamField>
	//   29   54:dup             
	//   30   55:ldc1            #49  <String "eventCount">
	//   31   57:getstatic       #52  <Field Class Integer.TYPE>
	//   32   60:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//   33   63:aastore         
	//   34   64:dup             
	//   35   65:iconst_4        
	//   36   66:new             #33  <Class ObjectStreamField>
	//   37   69:dup             
	//   38   70:ldc1            #53  <String "sessionCount">
	//   39   72:getstatic       #52  <Field Class Integer.TYPE>
	//   40   75:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//   41   78:aastore         
	//   42   79:dup             
	//   43   80:iconst_5        
	//   44   81:new             #33  <Class ObjectStreamField>
	//   45   84:dup             
	//   46   85:ldc1            #54  <String "subsessionCount">
	//   47   87:getstatic       #52  <Field Class Integer.TYPE>
	//   48   90:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//   49   93:aastore         
	//   50   94:dup             
	//   51   95:bipush          6
	//   52   97:new             #33  <Class ObjectStreamField>
	//   53  100:dup             
	//   54  101:ldc1            #55  <String "sessionLength">
	//   55  103:getstatic       #58  <Field Class Long.TYPE>
	//   56  106:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//   57  109:aastore         
	//   58  110:dup             
	//   59  111:bipush          7
	//   60  113:new             #33  <Class ObjectStreamField>
	//   61  116:dup             
	//   62  117:ldc1            #59  <String "timeSpent">
	//   63  119:getstatic       #58  <Field Class Long.TYPE>
	//   64  122:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//   65  125:aastore         
	//   66  126:dup             
	//   67  127:bipush          8
	//   68  129:new             #33  <Class ObjectStreamField>
	//   69  132:dup             
	//   70  133:ldc1            #60  <String "lastActivity">
	//   71  135:getstatic       #58  <Field Class Long.TYPE>
	//   72  138:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//   73  141:aastore         
	//   74  142:dup             
	//   75  143:bipush          9
	//   76  145:new             #33  <Class ObjectStreamField>
	//   77  148:dup             
	//   78  149:ldc1            #61  <String "lastInterval">
	//   79  151:getstatic       #58  <Field Class Long.TYPE>
	//   80  154:invokespecial   #40  <Method void ObjectStreamField(String, Class)>
	//   81  157:aastore         
	//   82  158:putstatic       #63  <Field ObjectStreamField[] serialPersistentFields>
	//*  83  161:return          
	}
}
