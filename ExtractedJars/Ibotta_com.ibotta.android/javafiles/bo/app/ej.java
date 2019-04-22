// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.enums.inappmessage.MessageType;
import com.appboy.models.*;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ek, bt

public final class ej
{

	public ej()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static IInAppMessage a(String s, bt bt)
	{
		if(!StringUtils.isNullOrBlank(s))
			break MISSING_BLOCK_LABEL_18;
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method boolean StringUtils.isNullOrBlank(String)>
	//    2    4:ifeq            18
		AppboyLogger.i(a, "In-app message string was null or blank. Not de-serializing message.");
	//    3    7:getstatic       #19  <Field String a>
	//    4   10:ldc1            #36  <String "In-app message string was null or blank. Not de-serializing message.">
	//    5   12:invokestatic    #40  <Method int AppboyLogger.i(String, String)>
	//    6   15:pop             
		return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		try
		{
			bt = ((bt) (a(JSONObjectInstrumentation.init(s), bt)));
	//    9   18:aload_0         
	//   10   19:invokestatic    #46  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   11   22:aload_1         
	//   12   23:invokestatic    #49  <Method IInAppMessage a(JSONObject, bt)>
	//   13   26:astore_1        
		}
	//*  14   27:aload_1         
	//*  15   28:areturn         
	//*  16   29:astore_1        
	//*  17   30:getstatic       #19  <Field String a>
	//*  18   33:astore_2        
	//*  19   34:new             #51  <Class StringBuilder>
	//*  20   37:dup             
	//*  21   38:invokespecial   #52  <Method void StringBuilder()>
	//*  22   41:astore_3        
	//*  23   42:aload_3         
	//*  24   43:ldc1            #54  <String "Failed to deserialize the in-app message string.">
	//*  25   45:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  26   48:pop             
	//*  27   49:aload_3         
	//*  28   50:aload_0         
	//*  29   51:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  30   54:pop             
	//*  31   55:aload_2         
	//*  32   56:aload_3         
	//*  33   57:invokevirtual   #62  <Method String StringBuilder.toString()>
	//*  34   60:aload_1         
	//*  35   61:invokestatic    #66  <Method int AppboyLogger.e(String, String, Throwable)>
	//*  36   64:pop             
	//*  37   65:aconst_null     
	//*  38   66:areturn         
		// Misplaced declaration of an exception variable
		catch(bt bt)
	//*  39   67:astore_1        
		{
			String s2 = a;
	//   40   68:getstatic       #19  <Field String a>
	//   41   71:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   42   72:new             #51  <Class StringBuilder>
	//   43   75:dup             
	//   44   76:invokespecial   #52  <Method void StringBuilder()>
	//   45   79:astore_3        
			stringbuilder1.append("Encountered JSONException processing in-app message string: ");
	//   46   80:aload_3         
	//   47   81:ldc1            #68  <String "Encountered JSONException processing in-app message string: ">
	//   48   83:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   49   86:pop             
			stringbuilder1.append(s);
	//   50   87:aload_3         
	//   51   88:aload_0         
	//   52   89:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   53   92:pop             
			AppboyLogger.w(s2, stringbuilder1.toString(), ((Throwable) (bt)));
	//   54   93:aload_2         
	//   55   94:aload_3         
	//   56   95:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   57   98:aload_1         
	//   58   99:invokestatic    #71  <Method int AppboyLogger.w(String, String, Throwable)>
	//   59  102:pop             
			return null;
	//   60  103:aconst_null     
	//   61  104:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(bt bt)
		{
			String s1 = a;
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Failed to deserialize the in-app message string.");
			stringbuilder.append(s);
			AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (bt)));
			return null;
		}
		return ((IInAppMessage) (bt));
	}

	public static IInAppMessage a(JSONObject jsonobject, bt bt)
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
	//    2    4:getstatic       #19  <Field String a>
	//    3    7:ldc1            #73  <String "In-app message Json was null. Not deserializing message.">
	//    4    9:invokestatic    #76  <Method int AppboyLogger.d(String, String)>
	//    5   12:pop             
			}
	//*   6   13:aconst_null     
	//*   7   14:areturn         
	//*   8   15:aload_0         
	//*   9   16:invokestatic    #79  <Method boolean a(JSONObject)>
	//*  10   19:ifeq            41
	//*  11   22:getstatic       #19  <Field String a>
	//*  12   25:ldc1            #81  <String "Deserializing control in-app message.">
	//*  13   27:invokestatic    #76  <Method int AppboyLogger.d(String, String)>
	//*  14   30:pop             
	//*  15   31:new             #83  <Class InAppMessageControl>
	//*  16   34:dup             
	//*  17   35:aload_0         
	//*  18   36:aload_1         
	//*  19   37:invokespecial   #86  <Method void InAppMessageControl(JSONObject, bt)>
	//*  20   40:areturn         
	//*  21   41:aload_0         
	//*  22   42:ldc1            #88  <String "type">
	//*  23   44:ldc1            #90  <Class MessageType>
	//*  24   46:aconst_null     
	//*  25   47:invokestatic    #95  <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//*  26   50:checkcast       #90  <Class MessageType>
	//*  27   53:astore_2        
	//*  28   54:aload_2         
	//*  29   55:ifnonnull       97
	//*  30   58:getstatic       #19  <Field String a>
	//*  31   61:astore_1        
	//*  32   62:new             #51  <Class StringBuilder>
	//*  33   65:dup             
	//*  34   66:invokespecial   #52  <Method void StringBuilder()>
	//*  35   69:astore_2        
	//*  36   70:aload_2         
	//*  37   71:ldc1            #97  <String "In-app message type was null. Not deserializing message: ">
	//*  38   73:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  39   76:pop             
	//*  40   77:aload_2         
	//*  41   78:aload_0         
	//*  42   79:invokestatic    #100 <Method String ek.a(JSONObject)>
	//*  43   82:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  44   85:pop             
	//*  45   86:aload_1         
	//*  46   87:aload_2         
	//*  47   88:invokevirtual   #62  <Method String StringBuilder.toString()>
	//*  48   91:invokestatic    #40  <Method int AppboyLogger.i(String, String)>
	//*  49   94:pop             
	//*  50   95:aconst_null     
	//*  51   96:areturn         
	//*  52   97:getstatic       #103 <Field int[] ej$1.a>
	//*  53  100:aload_2         
	//*  54  101:invokevirtual   #107 <Method int MessageType.ordinal()>
	//*  55  104:iaload          
	//*  56  105:tableswitch     1 4: default 300
	//	               1 173
	//	               2 163
	//	               3 153
	//	               4 143
	//*  57  136:getstatic       #19  <Field String a>
	//*  58  139:astore_1        
	//*  59  140:goto            183
	//*  60  143:new             #109 <Class InAppMessageHtmlFull>
	//*  61  146:dup             
	//*  62  147:aload_0         
	//*  63  148:aload_1         
	//*  64  149:invokespecial   #110 <Method void InAppMessageHtmlFull(JSONObject, bt)>
	//*  65  152:areturn         
	//*  66  153:new             #112 <Class InAppMessageSlideup>
	//*  67  156:dup             
	//*  68  157:aload_0         
	//*  69  158:aload_1         
	//*  70  159:invokespecial   #113 <Method void InAppMessageSlideup(JSONObject, bt)>
	//*  71  162:areturn         
	//*  72  163:new             #115 <Class InAppMessageModal>
	//*  73  166:dup             
	//*  74  167:aload_0         
	//*  75  168:aload_1         
	//*  76  169:invokespecial   #116 <Method void InAppMessageModal(JSONObject, bt)>
	//*  77  172:areturn         
	//*  78  173:new             #118 <Class InAppMessageFull>
	//*  79  176:dup             
	//*  80  177:aload_0         
	//*  81  178:aload_1         
	//*  82  179:invokespecial   #119 <Method void InAppMessageFull(JSONObject, bt)>
	//*  83  182:areturn         
	//*  84  183:new             #51  <Class StringBuilder>
	//*  85  186:dup             
	//*  86  187:invokespecial   #52  <Method void StringBuilder()>
	//*  87  190:astore_2        
	//*  88  191:aload_2         
	//*  89  192:ldc1            #121 <String "Unknown in-app message type. Not deserializing message: ">
	//*  90  194:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  91  197:pop             
	//*  92  198:aload_2         
	//*  93  199:aload_0         
	//*  94  200:invokestatic    #100 <Method String ek.a(JSONObject)>
	//*  95  203:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  96  206:pop             
	//*  97  207:aload_1         
	//*  98  208:aload_2         
	//*  99  209:invokevirtual   #62  <Method String StringBuilder.toString()>
	//* 100  212:invokestatic    #123 <Method int AppboyLogger.e(String, String)>
	//* 101  215:pop             
	//* 102  216:aconst_null     
	//* 103  217:areturn         
	//* 104  218:astore_1        
	//* 105  219:getstatic       #19  <Field String a>
	//* 106  222:astore_2        
	//* 107  223:new             #51  <Class StringBuilder>
	//* 108  226:dup             
	//* 109  227:invokespecial   #52  <Method void StringBuilder()>
	//* 110  230:astore_3        
	//* 111  231:aload_3         
	//* 112  232:ldc1            #125 <String "Failed to deserialize the in-app message: ">
	//* 113  234:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//* 114  237:pop             
	//* 115  238:aload_3         
	//* 116  239:aload_0         
	//* 117  240:invokestatic    #100 <Method String ek.a(JSONObject)>
	//* 118  243:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//* 119  246:pop             
	//* 120  247:aload_2         
	//* 121  248:aload_3         
	//* 122  249:invokevirtual   #62  <Method String StringBuilder.toString()>
	//* 123  252:aload_1         
	//* 124  253:invokestatic    #66  <Method int AppboyLogger.e(String, String, Throwable)>
	//* 125  256:pop             
	//* 126  257:aconst_null     
	//* 127  258:areturn         
			// Misplaced declaration of an exception variable
			catch(bt bt)
	//* 128  259:astore_1        
			{
				String s1 = a;
	//  129  260:getstatic       #19  <Field String a>
	//  130  263:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder();
	//  131  264:new             #51  <Class StringBuilder>
	//  132  267:dup             
	//  133  268:invokespecial   #52  <Method void StringBuilder()>
	//  134  271:astore_3        
				stringbuilder1.append("Encountered JSONException processing in-app message: ");
	//  135  272:aload_3         
	//  136  273:ldc1            #127 <String "Encountered JSONException processing in-app message: ">
	//  137  275:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  138  278:pop             
				stringbuilder1.append(ek.a(jsonobject));
	//  139  279:aload_3         
	//  140  280:aload_0         
	//  141  281:invokestatic    #100 <Method String ek.a(JSONObject)>
	//  142  284:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  143  287:pop             
				AppboyLogger.w(s1, stringbuilder1.toString(), ((Throwable) (bt)));
	//  144  288:aload_2         
	//  145  289:aload_3         
	//  146  290:invokevirtual   #62  <Method String StringBuilder.toString()>
	//  147  293:aload_1         
	//  148  294:invokestatic    #71  <Method int AppboyLogger.w(String, String, Throwable)>
	//  149  297:pop             
				return null;
	//  150  298:aconst_null     
	//  151  299:areturn         
			}
			// Misplaced declaration of an exception variable
			catch(bt bt)
			{
				String s = a;
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("Failed to deserialize the in-app message: ");
				stringbuilder.append(ek.a(jsonobject));
				AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (bt)));
				return null;
			}
			return null;
		}
		if(a(jsonobject))
		{
			AppboyLogger.d(a, "Deserializing control in-app message.");
			return ((IInAppMessage) (new InAppMessageControl(jsonobject, bt)));
		}
		obj = ((Object) ((MessageType)ek.a(jsonobject, "type", com/appboy/enums/inappmessage/MessageType, ((Enum) (null)))));
		if(obj != null)
			break MISSING_BLOCK_LABEL_97;
		bt = ((bt) (a));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("In-app message type was null. Not deserializing message: ");
		((StringBuilder) (obj)).append(ek.a(jsonobject));
		AppboyLogger.i(((String) (bt)), ((StringBuilder) (obj)).toString());
		return null;
		_cls1.a[((MessageType) (obj)).ordinal()];
		JVM INSTR tableswitch 1 4: default 300
	//	               1 173
	//	               2 163
	//	               3 153
	//	               4 143;
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		bt = ((bt) (a));
		  goto _L6
_L5:
		return ((IInAppMessage) (new InAppMessageHtmlFull(jsonobject, bt)));
_L4:
		return ((IInAppMessage) (new InAppMessageSlideup(jsonobject, bt)));
_L3:
		return ((IInAppMessage) (new InAppMessageModal(jsonobject, bt)));
_L2:
		return ((IInAppMessage) (new InAppMessageFull(jsonobject, bt)));
_L6:
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Unknown in-app message type. Not deserializing message: ");
		((StringBuilder) (obj)).append(ek.a(jsonobject));
		AppboyLogger.e(((String) (bt)), ((StringBuilder) (obj)).toString());
		return null;
	//* 152  300:goto            136
	}

	static boolean a(JSONObject jsonobject)
	{
		return jsonobject.optBoolean("is_control", false);
	//    0    0:aload_0         
	//    1    1:ldc1            #130 <String "is_control">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #136 <Method boolean JSONObject.optBoolean(String, boolean)>
	//    4    7:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ej);

	static 
	{
	//    0    0:ldc1            #2   <Class ej>
	//    1    2:invokestatic    #17  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #19  <Field String a>
	//*   3    8:return          
	}
}
