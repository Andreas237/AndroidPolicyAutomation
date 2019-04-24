// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdi

class zzeh
{
	static final class zza extends Enum
	{

		public static zza[] values()
		{
			return (zza[])((zza []) (zzbej)).clone();
		//    0    0:getstatic       #34  <Field zzeh$zza[] zzbej>
		//    1    3:invokevirtual   #44  <Method Object _5B_Lcom.google.android.gms.tagmanager.zzeh$zza_3B_.clone()>
		//    2    6:checkcast       #40  <Class zzeh$zza[]>
		//    3    9:areturn         
		}

		public static final zza zzbeg;
		public static final zza zzbeh;
		public static final zza zzbei;
		private static final zza zzbej[];

		static 
		{
			zzbeg = new zza("NONE", 0);
		//    0    0:new             #2   <Class zzeh$zza>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void zzeh$zza(String, int)>
		//    5   10:putstatic       #24  <Field zzeh$zza zzbeg>
			zzbeh = new zza("CONTAINER", 1);
		//    6   13:new             #2   <Class zzeh$zza>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "CONTAINER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void zzeh$zza(String, int)>
		//   11   23:putstatic       #28  <Field zzeh$zza zzbeh>
			zzbei = new zza("CONTAINER_DEBUG", 2);
		//   12   26:new             #2   <Class zzeh$zza>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "CONTAINER_DEBUG">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void zzeh$zza(String, int)>
		//   17   36:putstatic       #32  <Field zzeh$zza zzbei>
			zzbej = (new zza[] {
				zzbeg, zzbeh, zzbei
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       zza[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #24  <Field zzeh$zza zzbeg>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #28  <Field zzeh$zza zzbeh>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #32  <Field zzeh$zza zzbei>
		//   31   60:aastore         
		//   32   61:putstatic       #34  <Field zzeh$zza[] zzbej>
		//*  33   64:return          
		}

		private zza(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #36  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	zzeh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzbed = zza.zzbeg;
	//    2    4:aload_0         
	//    3    5:getstatic       #24  <Field zzeh$zza zzeh$zza.zzbeg>
	//    4    8:putfield        #26  <Field zzeh$zza zzbed>
		zzbee = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #28  <Field String zzbee>
		zzazq = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #30  <Field String zzazq>
		zzbef = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #32  <Field String zzbef>
	//   14   26:return          
	}

	private static String zzdx(String s)
	{
		return s.split("&")[0].split("=")[1];
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "&">
	//    2    3:invokevirtual   #43  <Method String[] String.split(String)>
	//    3    6:iconst_0        
	//    4    7:aaload          
	//    5    8:ldc1            #45  <String "=">
	//    6   10:invokevirtual   #43  <Method String[] String.split(String)>
	//    7   13:iconst_1        
	//    8   14:aaload          
	//    9   15:areturn         
	}

	static zzeh zzpm()
	{
		com/google/android/gms/tagmanager/zzeh;
	//    0    0:ldc1            #2   <Class zzeh>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzeh zzeh1;
		if(zzbec == null)
	//*   2    3:getstatic       #49  <Field zzeh zzbec>
	//*   3    6:ifnonnull       19
			zzbec = new zzeh();
	//    4    9:new             #2   <Class zzeh>
	//    5   12:dup             
	//    6   13:invokespecial   #50  <Method void zzeh()>
	//    7   16:putstatic       #49  <Field zzeh zzbec>
		zzeh1 = zzbec;
	//    8   19:getstatic       #49  <Field zzeh zzbec>
	//    9   22:astore_0        
		com/google/android/gms/tagmanager/zzeh;
	//   10   23:ldc1            #2   <Class zzeh>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return zzeh1;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
		com/google/android/gms/tagmanager/zzeh;
	//   15   29:ldc1            #2   <Class zzeh>
		JVM INSTR monitorexit ;
	//   16   31:monitorexit     
		throw exception;
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	final String getContainerId()
	{
		return zzazq;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzazq>
	//    2    4:areturn         
	}

	final boolean zzb(Uri uri)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		String s;
		try
		{
			s = URLDecoder.decode(uri.toString(), "UTF-8");
	//    2    2:aload_1         
	//    3    3:invokevirtual   #62  <Method String Uri.toString()>
	//    4    6:ldc1            #64  <String "UTF-8">
	//    5    8:invokestatic    #70  <Method String URLDecoder.decode(String, String)>
	//    6   11:astore_3        
		}
	//*   7   12:aload_3         
	//*   8   13:ldc1            #72  <String "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$">
	//*   9   15:invokevirtual   #76  <Method boolean String.matches(String)>
	//*  10   18:ifeq            179
	//*  11   21:aload_3         
	//*  12   22:invokestatic    #80  <Method String String.valueOf(Object)>
	//*  13   25:astore_2        
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #84  <Method int String.length()>
	//*  16   30:ifeq            43
	//*  17   33:ldc1            #86  <String "Container preview url: ">
	//*  18   35:aload_2         
	//*  19   36:invokevirtual   #89  <Method String String.concat(String)>
	//*  20   39:astore_2        
	//*  21   40:goto            53
	//*  22   43:new             #39  <Class String>
	//*  23   46:dup             
	//*  24   47:ldc1            #86  <String "Container preview url: ">
	//*  25   49:invokespecial   #92  <Method void String(String)>
	//*  26   52:astore_2        
	//*  27   53:aload_2         
	//*  28   54:invokestatic    #97  <Method void zzdi.v(String)>
	//*  29   57:aload_3         
	//*  30   58:ldc1            #99  <String ".*?&gtm_debug=x$">
	//*  31   60:invokevirtual   #76  <Method boolean String.matches(String)>
	//*  32   63:ifeq            78
	//*  33   66:getstatic       #102 <Field zzeh$zza zzeh$zza.zzbei>
	//*  34   69:astore_2        
	//*  35   70:aload_0         
	//*  36   71:aload_2         
	//*  37   72:putfield        #26  <Field zzeh$zza zzbed>
	//*  38   75:goto            85
	//*  39   78:getstatic       #105 <Field zzeh$zza zzeh$zza.zzbeh>
	//*  40   81:astore_2        
	//*  41   82:goto            70
	//*  42   85:aload_0         
	//*  43   86:aload_1         
	//*  44   87:invokevirtual   #108 <Method String Uri.getQuery()>
	//*  45   90:ldc1            #110 <String "&gtm_debug=x">
	//*  46   92:ldc1            #112 <String "">
	//*  47   94:invokevirtual   #116 <Method String String.replace(CharSequence, CharSequence)>
	//*  48   97:putfield        #32  <Field String zzbef>
	//*  49  100:aload_0         
	//*  50  101:getfield        #26  <Field zzeh$zza zzbed>
	//*  51  104:getstatic       #105 <Field zzeh$zza zzeh$zza.zzbeh>
	//*  52  107:if_acmpeq       120
	//*  53  110:aload_0         
	//*  54  111:getfield        #26  <Field zzeh$zza zzbed>
	//*  55  114:getstatic       #102 <Field zzeh$zza zzeh$zza.zzbei>
	//*  56  117:if_acmpne       164
	//*  57  120:ldc1            #118 <String "/r?">
	//*  58  122:invokestatic    #80  <Method String String.valueOf(Object)>
	//*  59  125:astore_1        
	//*  60  126:aload_0         
	//*  61  127:getfield        #32  <Field String zzbef>
	//*  62  130:invokestatic    #80  <Method String String.valueOf(Object)>
	//*  63  133:astore_2        
	//*  64  134:aload_2         
	//*  65  135:invokevirtual   #84  <Method int String.length()>
	//*  66  138:ifeq            150
	//*  67  141:aload_1         
	//*  68  142:aload_2         
	//*  69  143:invokevirtual   #89  <Method String String.concat(String)>
	//*  70  146:astore_1        
	//*  71  147:goto            159
	//*  72  150:new             #39  <Class String>
	//*  73  153:dup             
	//*  74  154:aload_1         
	//*  75  155:invokespecial   #92  <Method void String(String)>
	//*  76  158:astore_1        
	//*  77  159:aload_0         
	//*  78  160:aload_1         
	//*  79  161:putfield        #28  <Field String zzbee>
	//*  80  164:aload_0         
	//*  81  165:aload_0         
	//*  82  166:getfield        #32  <Field String zzbef>
	//*  83  169:invokestatic    #120 <Method String zzdx(String)>
	//*  84  172:putfield        #30  <Field String zzazq>
	//*  85  175:aload_0         
	//*  86  176:monitorexit     
	//*  87  177:iconst_1        
	//*  88  178:ireturn         
	//*  89  179:aload_3         
	//*  90  180:ldc1            #122 <String "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$">
	//*  91  182:invokevirtual   #76  <Method boolean String.matches(String)>
	//*  92  185:ifeq            264
	//*  93  188:aload_1         
	//*  94  189:invokevirtual   #108 <Method String Uri.getQuery()>
	//*  95  192:invokestatic    #120 <Method String zzdx(String)>
	//*  96  195:aload_0         
	//*  97  196:getfield        #30  <Field String zzazq>
	//*  98  199:invokevirtual   #126 <Method boolean String.equals(Object)>
	//*  99  202:ifeq            260
	//* 100  205:aload_0         
	//* 101  206:getfield        #30  <Field String zzazq>
	//* 102  209:invokestatic    #80  <Method String String.valueOf(Object)>
	//* 103  212:astore_1        
	//* 104  213:aload_1         
	//* 105  214:invokevirtual   #84  <Method int String.length()>
	//* 106  217:ifeq            230
	//* 107  220:ldc1            #128 <String "Exit preview mode for container: ">
	//* 108  222:aload_1         
	//* 109  223:invokevirtual   #89  <Method String String.concat(String)>
	//* 110  226:astore_1        
	//* 111  227:goto            240
	//* 112  230:new             #39  <Class String>
	//* 113  233:dup             
	//* 114  234:ldc1            #128 <String "Exit preview mode for container: ">
	//* 115  236:invokespecial   #92  <Method void String(String)>
	//* 116  239:astore_1        
	//* 117  240:aload_1         
	//* 118  241:invokestatic    #97  <Method void zzdi.v(String)>
	//* 119  244:aload_0         
	//* 120  245:getstatic       #24  <Field zzeh$zza zzeh$zza.zzbeg>
	//* 121  248:putfield        #26  <Field zzeh$zza zzbed>
	//* 122  251:aload_0         
	//* 123  252:aconst_null     
	//* 124  253:putfield        #28  <Field String zzbee>
	//* 125  256:aload_0         
	//* 126  257:monitorexit     
	//* 127  258:iconst_1        
	//* 128  259:ireturn         
	//* 129  260:aload_0         
	//* 130  261:monitorexit     
	//* 131  262:iconst_0        
	//* 132  263:ireturn         
	//* 133  264:aload_3         
	//* 134  265:invokestatic    #80  <Method String String.valueOf(Object)>
	//* 135  268:astore_1        
	//* 136  269:aload_1         
	//* 137  270:invokevirtual   #84  <Method int String.length()>
	//* 138  273:ifeq            286
	//* 139  276:ldc1            #130 <String "Invalid preview uri: ">
	//* 140  278:aload_1         
	//* 141  279:invokevirtual   #89  <Method String String.concat(String)>
	//* 142  282:astore_1        
	//* 143  283:goto            296
	//* 144  286:new             #39  <Class String>
	//* 145  289:dup             
	//* 146  290:ldc1            #130 <String "Invalid preview uri: ">
	//* 147  292:invokespecial   #92  <Method void String(String)>
	//* 148  295:astore_1        
	//* 149  296:aload_1         
	//* 150  297:invokestatic    #133 <Method void zzdi.zzab(String)>
	//* 151  300:aload_0         
	//* 152  301:monitorexit     
	//* 153  302:iconst_0        
	//* 154  303:ireturn         
	//* 155  304:astore_1        
	//* 156  305:aload_0         
	//* 157  306:monitorexit     
	//* 158  307:aload_1         
	//* 159  308:athrow          
	//* 160  309:aload_0         
	//* 161  310:monitorexit     
	//* 162  311:iconst_0        
	//* 163  312:ireturn         
		// Misplaced declaration of an exception variable
		catch(Uri uri)
		{
			return false;
		}
		if(!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$"))
			break MISSING_BLOCK_LABEL_179;
		obj = ((Object) (String.valueOf(((Object) (s)))));
		if(((String) (obj)).length() != 0)
		{
			obj = ((Object) ("Container preview url: ".concat(((String) (obj)))));
			break MISSING_BLOCK_LABEL_53;
		}
		obj = ((Object) (new String("Container preview url: ")));
		zzdi.v(((String) (obj)));
		if(!s.matches(".*?&gtm_debug=x$")) goto _L2; else goto _L1
_L1:
		obj = ((Object) (zza.zzbei));
_L4:
		zzbed = ((zza) (obj));
		break MISSING_BLOCK_LABEL_85;
_L2:
		obj = ((Object) (zza.zzbeh));
		if(true) goto _L4; else goto _L3
_L3:
		zzbef = uri.getQuery().replace("&gtm_debug=x", "");
		if(zzbed != zza.zzbeh && zzbed != zza.zzbei)
			break MISSING_BLOCK_LABEL_164;
		uri = ((Uri) (String.valueOf("/r?")));
		obj = ((Object) (String.valueOf(((Object) (zzbef)))));
		if(((String) (obj)).length() != 0)
		{
			uri = ((Uri) (((String) (uri)).concat(((String) (obj)))));
			break MISSING_BLOCK_LABEL_159;
		}
		uri = ((Uri) (new String(((String) (uri)))));
		zzbee = ((String) (uri));
		zzazq = zzdx(zzbef);
		this;
		JVM INSTR monitorexit ;
		return true;
		if(!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
			break MISSING_BLOCK_LABEL_264;
		if(!zzdx(uri.getQuery()).equals(((Object) (zzazq))))
			break MISSING_BLOCK_LABEL_260;
		uri = ((Uri) (String.valueOf(((Object) (zzazq)))));
		if(((String) (uri)).length() != 0)
		{
			uri = ((Uri) ("Exit preview mode for container: ".concat(((String) (uri)))));
			break MISSING_BLOCK_LABEL_240;
		}
		uri = ((Uri) (new String("Exit preview mode for container: ")));
		zzdi.v(((String) (uri)));
		zzbed = zza.zzbeg;
		zzbee = null;
		this;
		JVM INSTR monitorexit ;
		return true;
		this;
		JVM INSTR monitorexit ;
		return false;
		uri = ((Uri) (String.valueOf(((Object) (s)))));
		if(((String) (uri)).length() != 0)
		{
			uri = ((Uri) ("Invalid preview uri: ".concat(((String) (uri)))));
			break MISSING_BLOCK_LABEL_296;
		}
		uri = ((Uri) (new String("Invalid preview uri: ")));
		zzdi.zzab(((String) (uri)));
		this;
		JVM INSTR monitorexit ;
		return false;
		uri;
		throw uri;
	//* 164  313:astore_1        
	//* 165  314:goto            309
	}

	final zza zzpn()
	{
		return zzbed;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field zzeh$zza zzbed>
	//    2    4:areturn         
	}

	final String zzpo()
	{
		return zzbee;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String zzbee>
	//    2    4:areturn         
	}

	private static zzeh zzbec;
	private volatile String zzazq;
	private volatile zza zzbed;
	private volatile String zzbee;
	private volatile String zzbef;
}
