// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.enums.inappmessage.MessageType;
import com.appboy.models.*;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			dt, bl

public final class ds
{

	public ds()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static IInAppMessage a(String s, bl bl)
	{
		if(!StringUtils.isNullOrBlank(s))
			break MISSING_BLOCK_LABEL_18;
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method boolean StringUtils.isNullOrBlank(String)>
	//    2    4:ifeq            18
		AppboyLogger.i(a, "In-app message string was null or blank. Not de-serializing message.");
	//    3    7:getstatic       #18  <Field String a>
	//    4   10:ldc1            #35  <String "In-app message string was null or blank. Not de-serializing message.">
	//    5   12:invokestatic    #39  <Method int AppboyLogger.i(String, String)>
	//    6   15:pop             
		return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		try
		{
			bl = ((bl) (a(new JSONObject(s), bl)));
	//    9   18:new             #41  <Class JSONObject>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokespecial   #44  <Method void JSONObject(String)>
	//   13   26:aload_1         
	//   14   27:invokestatic    #47  <Method IInAppMessage a(JSONObject, bl)>
	//   15   30:astore_1        
		}
	//*  16   31:aload_1         
	//*  17   32:areturn         
	//*  18   33:astore_1        
	//*  19   34:getstatic       #18  <Field String a>
	//*  20   37:astore_2        
	//*  21   38:new             #49  <Class StringBuilder>
	//*  22   41:dup             
	//*  23   42:invokespecial   #50  <Method void StringBuilder()>
	//*  24   45:astore_3        
	//*  25   46:aload_3         
	//*  26   47:ldc1            #52  <String "Failed to deserialize the in-app message string.">
	//*  27   49:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  28   52:pop             
	//*  29   53:aload_3         
	//*  30   54:aload_0         
	//*  31   55:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  32   58:pop             
	//*  33   59:aload_2         
	//*  34   60:aload_3         
	//*  35   61:invokevirtual   #60  <Method String StringBuilder.toString()>
	//*  36   64:aload_1         
	//*  37   65:invokestatic    #64  <Method int AppboyLogger.e(String, String, Throwable)>
	//*  38   68:pop             
	//*  39   69:aconst_null     
	//*  40   70:areturn         
		// Misplaced declaration of an exception variable
		catch(bl bl)
	//*  41   71:astore_1        
		{
			String s2 = a;
	//   42   72:getstatic       #18  <Field String a>
	//   43   75:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   44   76:new             #49  <Class StringBuilder>
	//   45   79:dup             
	//   46   80:invokespecial   #50  <Method void StringBuilder()>
	//   47   83:astore_3        
			stringbuilder1.append("Encountered JSONException processing in-app message string: ");
	//   48   84:aload_3         
	//   49   85:ldc1            #66  <String "Encountered JSONException processing in-app message string: ">
	//   50   87:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   51   90:pop             
			stringbuilder1.append(s);
	//   52   91:aload_3         
	//   53   92:aload_0         
	//   54   93:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   55   96:pop             
			AppboyLogger.w(s2, stringbuilder1.toString(), ((Throwable) (bl)));
	//   56   97:aload_2         
	//   57   98:aload_3         
	//   58   99:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   59  102:aload_1         
	//   60  103:invokestatic    #69  <Method int AppboyLogger.w(String, String, Throwable)>
	//   61  106:pop             
			return null;
	//   62  107:aconst_null     
	//   63  108:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(bl bl)
		{
			String s1 = a;
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Failed to deserialize the in-app message string.");
			stringbuilder.append(s);
			AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (bl)));
			return null;
		}
		return ((IInAppMessage) (bl));
	}

	public static IInAppMessage a(JSONObject jsonobject, bl bl)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
		{
			static class _cls1
			{

				static final int a[];

				static 
				{
					a = new int[MessageType.values().length];
				//    0    0:invokestatic    #18  <Method MessageType[] MessageType.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] a>
					try
					{
						a[MessageType.FULL.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] a>
				//    5   12:getstatic       #24  <Field MessageType MessageType.FULL>
				//    6   15:invokevirtual   #28  <Method int MessageType.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] a>
				//*  10   23:getstatic       #31  <Field MessageType MessageType.MODAL>
				//*  11   26:invokevirtual   #28  <Method int MessageType.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] a>
				//*  15   34:getstatic       #34  <Field MessageType MessageType.SLIDEUP>
				//*  16   37:invokevirtual   #28  <Method int MessageType.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] a>
				//*  20   45:getstatic       #37  <Field MessageType MessageType.HTML_FULL>
				//*  21   48:invokevirtual   #28  <Method int MessageType.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   25   54:astore_0        
					try
					{
						a[MessageType.MODAL.ordinal()] = 2;
					}
				//*  26   55:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   27   58:astore_0        
					try
					{
						a[MessageType.SLIDEUP.ordinal()] = 3;
					}
				//*  28   59:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   29   62:astore_0        
					try
					{
						a[MessageType.HTML_FULL.ordinal()] = 4;
					}
				//*  30   63:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   31   66:astore_0        
				//*  32   67:return          
				}
			}

			Object obj;
			try
			{
				AppboyLogger.d(a, "In-app message Json was null. Not deserializing message.");
	//    2    4:getstatic       #18  <Field String a>
	//    3    7:ldc1            #71  <String "In-app message Json was null. Not deserializing message.">
	//    4    9:invokestatic    #74  <Method int AppboyLogger.d(String, String)>
	//    5   12:pop             
			}
	//*   6   13:aconst_null     
	//*   7   14:areturn         
	//*   8   15:aload_0         
	//*   9   16:invokestatic    #77  <Method boolean a(JSONObject)>
	//*  10   19:ifeq            41
	//*  11   22:getstatic       #18  <Field String a>
	//*  12   25:ldc1            #79  <String "Deserializing control in-app message.">
	//*  13   27:invokestatic    #74  <Method int AppboyLogger.d(String, String)>
	//*  14   30:pop             
	//*  15   31:new             #81  <Class InAppMessageControl>
	//*  16   34:dup             
	//*  17   35:aload_0         
	//*  18   36:aload_1         
	//*  19   37:invokespecial   #84  <Method void InAppMessageControl(JSONObject, bl)>
	//*  20   40:areturn         
	//*  21   41:aload_0         
	//*  22   42:ldc1            #86  <String "type">
	//*  23   44:ldc1            #88  <Class MessageType>
	//*  24   46:aconst_null     
	//*  25   47:invokestatic    #93  <Method Enum dt.a(JSONObject, String, Class, Enum)>
	//*  26   50:checkcast       #88  <Class MessageType>
	//*  27   53:astore_2        
	//*  28   54:aload_2         
	//*  29   55:ifnonnull       97
	//*  30   58:getstatic       #18  <Field String a>
	//*  31   61:astore_1        
	//*  32   62:new             #49  <Class StringBuilder>
	//*  33   65:dup             
	//*  34   66:invokespecial   #50  <Method void StringBuilder()>
	//*  35   69:astore_2        
	//*  36   70:aload_2         
	//*  37   71:ldc1            #95  <String "In-app message type was null. Not deserializing message: ">
	//*  38   73:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  39   76:pop             
	//*  40   77:aload_2         
	//*  41   78:aload_0         
	//*  42   79:invokestatic    #98  <Method String dt.a(JSONObject)>
	//*  43   82:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  44   85:pop             
	//*  45   86:aload_1         
	//*  46   87:aload_2         
	//*  47   88:invokevirtual   #60  <Method String StringBuilder.toString()>
	//*  48   91:invokestatic    #39  <Method int AppboyLogger.i(String, String)>
	//*  49   94:pop             
	//*  50   95:aconst_null     
	//*  51   96:areturn         
	//*  52   97:getstatic       #101 <Field int[] ds$1.a>
	//*  53  100:aload_2         
	//*  54  101:invokevirtual   #105 <Method int MessageType.ordinal()>
	//*  55  104:iaload          
	//*  56  105:tableswitch     1 4: default 300
	//	               1 173
	//	               2 163
	//	               3 153
	//	               4 143
	//*  57  136:getstatic       #18  <Field String a>
	//*  58  139:astore_1        
	//*  59  140:goto            183
	//*  60  143:new             #107 <Class InAppMessageHtmlFull>
	//*  61  146:dup             
	//*  62  147:aload_0         
	//*  63  148:aload_1         
	//*  64  149:invokespecial   #108 <Method void InAppMessageHtmlFull(JSONObject, bl)>
	//*  65  152:areturn         
	//*  66  153:new             #110 <Class InAppMessageSlideup>
	//*  67  156:dup             
	//*  68  157:aload_0         
	//*  69  158:aload_1         
	//*  70  159:invokespecial   #111 <Method void InAppMessageSlideup(JSONObject, bl)>
	//*  71  162:areturn         
	//*  72  163:new             #113 <Class InAppMessageModal>
	//*  73  166:dup             
	//*  74  167:aload_0         
	//*  75  168:aload_1         
	//*  76  169:invokespecial   #114 <Method void InAppMessageModal(JSONObject, bl)>
	//*  77  172:areturn         
	//*  78  173:new             #116 <Class InAppMessageFull>
	//*  79  176:dup             
	//*  80  177:aload_0         
	//*  81  178:aload_1         
	//*  82  179:invokespecial   #117 <Method void InAppMessageFull(JSONObject, bl)>
	//*  83  182:areturn         
	//*  84  183:new             #49  <Class StringBuilder>
	//*  85  186:dup             
	//*  86  187:invokespecial   #50  <Method void StringBuilder()>
	//*  87  190:astore_2        
	//*  88  191:aload_2         
	//*  89  192:ldc1            #119 <String "Unknown in-app message type. Not deserializing message: ">
	//*  90  194:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  91  197:pop             
	//*  92  198:aload_2         
	//*  93  199:aload_0         
	//*  94  200:invokestatic    #98  <Method String dt.a(JSONObject)>
	//*  95  203:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  96  206:pop             
	//*  97  207:aload_1         
	//*  98  208:aload_2         
	//*  99  209:invokevirtual   #60  <Method String StringBuilder.toString()>
	//* 100  212:invokestatic    #121 <Method int AppboyLogger.e(String, String)>
	//* 101  215:pop             
	//* 102  216:aconst_null     
	//* 103  217:areturn         
	//* 104  218:astore_1        
	//* 105  219:getstatic       #18  <Field String a>
	//* 106  222:astore_2        
	//* 107  223:new             #49  <Class StringBuilder>
	//* 108  226:dup             
	//* 109  227:invokespecial   #50  <Method void StringBuilder()>
	//* 110  230:astore_3        
	//* 111  231:aload_3         
	//* 112  232:ldc1            #123 <String "Failed to deserialize the in-app message: ">
	//* 113  234:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//* 114  237:pop             
	//* 115  238:aload_3         
	//* 116  239:aload_0         
	//* 117  240:invokestatic    #98  <Method String dt.a(JSONObject)>
	//* 118  243:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//* 119  246:pop             
	//* 120  247:aload_2         
	//* 121  248:aload_3         
	//* 122  249:invokevirtual   #60  <Method String StringBuilder.toString()>
	//* 123  252:aload_1         
	//* 124  253:invokestatic    #64  <Method int AppboyLogger.e(String, String, Throwable)>
	//* 125  256:pop             
	//* 126  257:aconst_null     
	//* 127  258:areturn         
			// Misplaced declaration of an exception variable
			catch(bl bl)
	//* 128  259:astore_1        
			{
				String s1 = a;
	//  129  260:getstatic       #18  <Field String a>
	//  130  263:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder();
	//  131  264:new             #49  <Class StringBuilder>
	//  132  267:dup             
	//  133  268:invokespecial   #50  <Method void StringBuilder()>
	//  134  271:astore_3        
				stringbuilder1.append("Encountered JSONException processing in-app message: ");
	//  135  272:aload_3         
	//  136  273:ldc1            #125 <String "Encountered JSONException processing in-app message: ">
	//  137  275:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  138  278:pop             
				stringbuilder1.append(dt.a(jsonobject));
	//  139  279:aload_3         
	//  140  280:aload_0         
	//  141  281:invokestatic    #98  <Method String dt.a(JSONObject)>
	//  142  284:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  143  287:pop             
				AppboyLogger.w(s1, stringbuilder1.toString(), ((Throwable) (bl)));
	//  144  288:aload_2         
	//  145  289:aload_3         
	//  146  290:invokevirtual   #60  <Method String StringBuilder.toString()>
	//  147  293:aload_1         
	//  148  294:invokestatic    #69  <Method int AppboyLogger.w(String, String, Throwable)>
	//  149  297:pop             
				return null;
	//  150  298:aconst_null     
	//  151  299:areturn         
			}
			// Misplaced declaration of an exception variable
			catch(bl bl)
			{
				String s = a;
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("Failed to deserialize the in-app message: ");
				stringbuilder.append(dt.a(jsonobject));
				AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (bl)));
				return null;
			}
			return null;
		}
		if(a(jsonobject))
		{
			AppboyLogger.d(a, "Deserializing control in-app message.");
			return ((IInAppMessage) (new InAppMessageControl(jsonobject, bl)));
		}
		obj = ((Object) ((MessageType)dt.a(jsonobject, "type", com/appboy/enums/inappmessage/MessageType, ((Enum) (null)))));
		if(obj != null)
			break MISSING_BLOCK_LABEL_97;
		bl = ((bl) (a));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("In-app message type was null. Not deserializing message: ");
		((StringBuilder) (obj)).append(dt.a(jsonobject));
		AppboyLogger.i(((String) (bl)), ((StringBuilder) (obj)).toString());
		return null;
		_cls1.a[((MessageType) (obj)).ordinal()];
		JVM INSTR tableswitch 1 4: default 300
	//	               1 173
	//	               2 163
	//	               3 153
	//	               4 143;
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		bl = ((bl) (a));
		  goto _L6
_L5:
		return ((IInAppMessage) (new InAppMessageHtmlFull(jsonobject, bl)));
_L4:
		return ((IInAppMessage) (new InAppMessageSlideup(jsonobject, bl)));
_L3:
		return ((IInAppMessage) (new InAppMessageModal(jsonobject, bl)));
_L2:
		return ((IInAppMessage) (new InAppMessageFull(jsonobject, bl)));
_L6:
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Unknown in-app message type. Not deserializing message: ");
		((StringBuilder) (obj)).append(dt.a(jsonobject));
		AppboyLogger.e(((String) (bl)), ((StringBuilder) (obj)).toString());
		return null;
	//* 152  300:goto            136
	}

	static boolean a(JSONObject jsonobject)
	{
		return jsonobject.optBoolean("is_control", false);
	//    0    0:aload_0         
	//    1    1:ldc1            #128 <String "is_control">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #132 <Method boolean JSONObject.optBoolean(String, boolean)>
	//    4    7:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ds);

	static 
	{
	//    0    0:ldc1            #2   <Class ds>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String a>
	//*   3    8:return          
	}
}
