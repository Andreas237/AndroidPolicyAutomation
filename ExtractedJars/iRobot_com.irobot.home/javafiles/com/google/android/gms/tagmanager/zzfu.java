// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbe, zzfv, zzbw, zzdi, 
//			zzfw, zzfx, zzdn

final class zzfu
	implements zzbe
{

	zzfu(Context context, zzfw zzfw1)
	{
		this(((zzfx) (new zzfv())), context, zzfw1);
	//    0    0:aload_0         
	//    1    1:new             #19  <Class zzfv>
	//    2    4:dup             
	//    3    5:invokespecial   #22  <Method void zzfv()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #25  <Method void zzfu(zzfx, Context, zzfw)>
	//    7   13:return          
	}

	private zzfu(zzfx zzfx1, Context context, zzfw zzfw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		zzbgn = zzfx1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field zzfx zzbgn>
		zzri = context.getApplicationContext();
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #36  <Method Context Context.getApplicationContext()>
	//    8   14:putfield        #38  <Field Context zzri>
		zzbgo = zzfw1;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #40  <Field zzfw zzbgo>
		zzfw1 = ((zzfw) (android.os.Build.VERSION.RELEASE));
	//   12   22:getstatic       #45  <Field String android.os.Build$VERSION.RELEASE>
	//   13   25:astore_3        
		Locale locale = Locale.getDefault();
	//   14   26:invokestatic    #51  <Method Locale Locale.getDefault()>
	//   15   29:astore          4
		context = null;
	//   16   31:aconst_null     
	//   17   32:astore_2        
		if(locale == null)
	//*  18   33:aload           4
	//*  19   35:ifnonnull       43
		{
			zzfx1 = ((zzfx) (context));
	//   20   38:aload_2         
	//   21   39:astore_1        
		} else
	//*  22   40:goto            134
		{
			zzfx1 = ((zzfx) (context));
	//   23   43:aload_2         
	//   24   44:astore_1        
			if(locale.getLanguage() != null)
	//*  25   45:aload           4
	//*  26   47:invokevirtual   #55  <Method String Locale.getLanguage()>
	//*  27   50:ifnull          134
				if(locale.getLanguage().length() == 0)
	//*  28   53:aload           4
	//*  29   55:invokevirtual   #55  <Method String Locale.getLanguage()>
	//*  30   58:invokevirtual   #61  <Method int String.length()>
	//*  31   61:ifne            69
				{
					zzfx1 = ((zzfx) (context));
	//   32   64:aload_2         
	//   33   65:astore_1        
				} else
	//*  34   66:goto            134
				{
					zzfx1 = ((zzfx) (new StringBuilder()));
	//   35   69:new             #63  <Class StringBuilder>
	//   36   72:dup             
	//   37   73:invokespecial   #64  <Method void StringBuilder()>
	//   38   76:astore_1        
					((StringBuilder) (zzfx1)).append(locale.getLanguage().toLowerCase());
	//   39   77:aload_1         
	//   40   78:aload           4
	//   41   80:invokevirtual   #55  <Method String Locale.getLanguage()>
	//   42   83:invokevirtual   #67  <Method String String.toLowerCase()>
	//   43   86:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
					if(locale.getCountry() != null && locale.getCountry().length() != 0)
	//*  45   90:aload           4
	//*  46   92:invokevirtual   #74  <Method String Locale.getCountry()>
	//*  47   95:ifnull          129
	//*  48   98:aload           4
	//*  49  100:invokevirtual   #74  <Method String Locale.getCountry()>
	//*  50  103:invokevirtual   #61  <Method int String.length()>
	//*  51  106:ifeq            129
					{
						((StringBuilder) (zzfx1)).append("-");
	//   52  109:aload_1         
	//   53  110:ldc1            #76  <String "-">
	//   54  112:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   55  115:pop             
						((StringBuilder) (zzfx1)).append(locale.getCountry().toLowerCase());
	//   56  116:aload_1         
	//   57  117:aload           4
	//   58  119:invokevirtual   #74  <Method String Locale.getCountry()>
	//   59  122:invokevirtual   #67  <Method String String.toLowerCase()>
	//   60  125:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   61  128:pop             
					}
					zzfx1 = ((zzfx) (((StringBuilder) (zzfx1)).toString()));
	//   62  129:aload_1         
	//   63  130:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   64  133:astore_1        
				}
		}
		zzabl = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
			"GoogleTagManager", "4.00", zzfw1, zzfx1, Build.MODEL, Build.ID
		});
	//   65  134:aload_0         
	//   66  135:ldc1            #81  <String "%s/%s (Linux; U; Android %s; %s; %s Build/%s)">
	//   67  137:bipush          6
	//   68  139:anewarray       Object[]
	//   69  142:dup             
	//   70  143:iconst_0        
	//   71  144:ldc1            #83  <String "GoogleTagManager">
	//   72  146:aastore         
	//   73  147:dup             
	//   74  148:iconst_1        
	//   75  149:ldc1            #85  <String "4.00">
	//   76  151:aastore         
	//   77  152:dup             
	//   78  153:iconst_2        
	//   79  154:aload_3         
	//   80  155:aastore         
	//   81  156:dup             
	//   82  157:iconst_3        
	//   83  158:aload_1         
	//   84  159:aastore         
	//   85  160:dup             
	//   86  161:iconst_4        
	//   87  162:getstatic       #90  <Field String Build.MODEL>
	//   88  165:aastore         
	//   89  166:dup             
	//   90  167:iconst_5        
	//   91  168:getstatic       #93  <Field String Build.ID>
	//   92  171:aastore         
	//   93  172:invokestatic    #97  <Method String String.format(String, Object[])>
	//   94  175:putfield        #99  <Field String zzabl>
	//   95  178:return          
	}

	private static URL zzd(zzbw zzbw1)
	{
		zzbw1 = ((zzbw) (zzbw1.zzox()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method String zzbw.zzox()>
	//    2    4:astore_0        
		try
		{
			zzbw1 = ((zzbw) (new URL(((String) (zzbw1)))));
	//    3    5:new             #110 <Class URL>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #113 <Method void URL(String)>
	//    7   13:astore_0        
		}
	//*   8   14:aload_0         
	//*   9   15:areturn         
	//*  10   16:ldc1            #115 <String "Error trying to parse the GTM url.">
	//*  11   18:invokestatic    #120 <Method void zzdi.e(String)>
	//*  12   21:aconst_null     
	//*  13   22:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbw zzbw1)
		{
			zzdi.e("Error trying to parse the GTM url.");
			return null;
		}
		return ((URL) (zzbw1));
	//*  14   23:astore_0        
	//*  15   24:goto            16
	}

	public final void zzf(List list)
	{
		int j;
		int l;
		int i1;
		i1 = Math.min(list.size(), 40);
	//    0    0:aload_1         
	//    1    1:invokeinterface #129 <Method int List.size()>
	//    2    6:bipush          40
	//    3    8:invokestatic    #135 <Method int Math.min(int, int)>
	//    4   11:istore          6
		l = 0;
	//    5   13:iconst_0        
	//    6   14:istore          5
		j = 1;
	//    7   16:iconst_1        
	//    8   17:istore_3        
_L6:
		if(l >= i1) goto _L2; else goto _L1
	//    9   18:iload           5
	//   10   20:iload           6
	//   11   22:icmpge          339
_L1:
		Object obj;
		zzbw zzbw1;
		zzbw1 = (zzbw)list.get(l);
	//   12   25:aload_1         
	//   13   26:iload           5
	//   14   28:invokeinterface #139 <Method Object List.get(int)>
	//   15   33:checkcast       #105 <Class zzbw>
	//   16   36:astore          9
		obj = ((Object) (zzd(zzbw1)));
	//   17   38:aload           9
	//   18   40:invokestatic    #141 <Method URL zzd(zzbw)>
	//   19   43:astore          7
		if(obj != null) goto _L4; else goto _L3
	//   20   45:aload           7
	//   21   47:ifnonnull       71
_L3:
		int i;
		zzdi.zzab("No destination: discarding hit.");
	//   22   50:ldc1            #143 <String "No destination: discarding hit.">
	//   23   52:invokestatic    #146 <Method void zzdi.zzab(String)>
		zzbgo.zzb(zzbw1);
	//   24   55:aload_0         
	//   25   56:getfield        #40  <Field zzfw zzbgo>
	//   26   59:aload           9
	//   27   61:invokeinterface #152 <Method void zzfw.zzb(zzbw)>
		i = j;
	//   28   66:iload_3         
	//   29   67:istore_2        
		  goto _L5
	//*  30   68:goto            328
_L4:
		int k = j;
	//   31   71:iload_3         
	//   32   72:istore          4
		HttpURLConnection httpurlconnection = zzbgn.zzc(((URL) (obj)));
	//   33   74:aload_0         
	//   34   75:getfield        #30  <Field zzfx zzbgn>
	//   35   78:aload           7
	//   36   80:invokeinterface #158 <Method HttpURLConnection zzfx.zzc(URL)>
	//   37   85:astore          10
		i = j;
	//   38   87:iload_3         
	//   39   88:istore_2        
		if(j == 0)
			break MISSING_BLOCK_LABEL_105;
	//   40   89:iload_3         
	//   41   90:ifeq            105
		zzdn.zzw(zzri);
	//   42   93:aload_0         
	//   43   94:getfield        #38  <Field Context zzri>
	//   44   97:invokestatic    #164 <Method void zzdn.zzw(Context)>
		i = 0;
	//   45  100:iconst_0        
	//   46  101:istore_2        
	//*  47  102:goto            105
		j = i;
	//   48  105:iload_2         
	//   49  106:istore_3        
		httpurlconnection.setRequestProperty("User-Agent", zzabl);
	//   50  107:aload           10
	//   51  109:ldc1            #166 <String "User-Agent">
	//   52  111:aload_0         
	//   53  112:getfield        #99  <Field String zzabl>
	//   54  115:invokevirtual   #172 <Method void HttpURLConnection.setRequestProperty(String, String)>
		j = i;
	//   55  118:iload_2         
	//   56  119:istore_3        
		k = httpurlconnection.getResponseCode();
	//   57  120:aload           10
	//   58  122:invokevirtual   #175 <Method int HttpURLConnection.getResponseCode()>
	//   59  125:istore          4
		j = i;
	//   60  127:iload_2         
	//   61  128:istore_3        
		Object obj1 = ((Object) (httpurlconnection.getInputStream()));
	//   62  129:aload           10
	//   63  131:invokevirtual   #179 <Method InputStream HttpURLConnection.getInputStream()>
	//   64  134:astore          8
		if(k == 200)
			break MISSING_BLOCK_LABEL_193;
	//   65  136:iload           4
	//   66  138:sipush          200
	//   67  141:icmpeq          193
		obj = ((Object) (new StringBuilder(25)));
	//   68  144:new             #63  <Class StringBuilder>
	//   69  147:dup             
	//   70  148:bipush          25
	//   71  150:invokespecial   #182 <Method void StringBuilder(int)>
	//   72  153:astore          7
		((StringBuilder) (obj)).append("Bad response: ");
	//   73  155:aload           7
	//   74  157:ldc1            #184 <String "Bad response: ">
	//   75  159:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   76  162:pop             
		((StringBuilder) (obj)).append(k);
	//   77  163:aload           7
	//   78  165:iload           4
	//   79  167:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//   80  170:pop             
		zzdi.zzab(((StringBuilder) (obj)).toString());
	//   81  171:aload           7
	//   82  173:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   83  176:invokestatic    #146 <Method void zzdi.zzab(String)>
		zzbgo.zzc(zzbw1);
	//   84  179:aload_0         
	//   85  180:getfield        #40  <Field zzfw zzbgo>
	//   86  183:aload           9
	//   87  185:invokeinterface #189 <Method void zzfw.zzc(zzbw)>
		break MISSING_BLOCK_LABEL_204;
	//   88  190:goto            204
		zzbgo.zza(zzbw1);
	//   89  193:aload_0         
	//   90  194:getfield        #40  <Field zzfw zzbgo>
	//   91  197:aload           9
	//   92  199:invokeinterface #192 <Method void zzfw.zza(zzbw)>
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_217;
	//   93  204:aload           8
	//   94  206:ifnull          217
		k = i;
	//   95  209:iload_2         
	//   96  210:istore          4
		((InputStream) (obj1)).close();
	//   97  212:aload           8
	//   98  214:invokevirtual   #197 <Method void InputStream.close()>
		k = i;
	//   99  217:iload_2         
	//  100  218:istore          4
		httpurlconnection.disconnect();
	//  101  220:aload           10
	//  102  222:invokevirtual   #200 <Method void HttpURLConnection.disconnect()>
		  goto _L5
	//* 103  225:goto            328
_L7:
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_241;
	//  104  228:aload           8
	//  105  230:ifnull          241
		k = i;
	//  106  233:iload_2         
	//  107  234:istore          4
		((InputStream) (obj1)).close();
	//  108  236:aload           8
	//  109  238:invokevirtual   #197 <Method void InputStream.close()>
		k = i;
	//  110  241:iload_2         
	//  111  242:istore          4
		httpurlconnection.disconnect();
	//  112  244:aload           10
	//  113  246:invokevirtual   #200 <Method void HttpURLConnection.disconnect()>
		k = i;
	//  114  249:iload_2         
	//  115  250:istore          4
		IOException ioexception;
		try
		{
			throw obj;
	//  116  252:aload           7
	//  117  254:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
	//* 118  255:astore          8
		{
			obj = ((Object) (String.valueOf(((Object) (((Object) (ioexception)).getClass().getSimpleName())))));
	//  119  257:aload           8
	//  120  259:invokevirtual   #204 <Method Class Object.getClass()>
	//  121  262:invokevirtual   #209 <Method String Class.getSimpleName()>
	//  122  265:invokestatic    #213 <Method String String.valueOf(Object)>
	//  123  268:astore          7
		}
		if(((String) (obj)).length() != 0)
	//* 124  270:aload           7
	//* 125  272:invokevirtual   #61  <Method int String.length()>
	//* 126  275:ifeq            290
			obj = ((Object) ("Exception sending hit: ".concat(((String) (obj)))));
	//  127  278:ldc1            #215 <String "Exception sending hit: ">
	//  128  280:aload           7
	//  129  282:invokevirtual   #219 <Method String String.concat(String)>
	//  130  285:astore          7
		else
	//* 131  287:goto            301
			obj = ((Object) (new String("Exception sending hit: ")));
	//  132  290:new             #57  <Class String>
	//  133  293:dup             
	//  134  294:ldc1            #215 <String "Exception sending hit: ">
	//  135  296:invokespecial   #220 <Method void String(String)>
	//  136  299:astore          7
		zzdi.zzab(((String) (obj)));
	//  137  301:aload           7
	//  138  303:invokestatic    #146 <Method void zzdi.zzab(String)>
		zzdi.zzab(ioexception.getMessage());
	//  139  306:aload           8
	//  140  308:invokevirtual   #223 <Method String IOException.getMessage()>
	//  141  311:invokestatic    #146 <Method void zzdi.zzab(String)>
		zzbgo.zzc(zzbw1);
	//  142  314:aload_0         
	//  143  315:getfield        #40  <Field zzfw zzbgo>
	//  144  318:aload           9
	//  145  320:invokeinterface #189 <Method void zzfw.zzc(zzbw)>
		i = k;
	//  146  325:iload           4
	//  147  327:istore_2        
_L5:
		l++;
	//  148  328:iload           5
	//  149  330:iconst_1        
	//  150  331:iadd            
	//  151  332:istore          5
		j = i;
	//  152  334:iload_2         
	//  153  335:istore_3        
		  goto _L6
	//* 154  336:goto            18
_L2:
		return;
	//  155  339:return          
		obj;
	//  156  340:astore          7
		ioexception = null;
	//  157  342:aconst_null     
	//  158  343:astore          8
		i = j;
	//  159  345:iload_3         
	//  160  346:istore_2        
		  goto _L7
	//* 161  347:goto            228
		obj;
	//  162  350:astore          7
		  goto _L7
	//* 163  352:goto            228
	}

	public final boolean zzom()
	{
		NetworkInfo networkinfo = ((ConnectivityManager)zzri.getSystemService("connectivity")).getActiveNetworkInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Context zzri>
	//    2    4:ldc1            #229 <String "connectivity">
	//    3    6:invokevirtual   #233 <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #235 <Class ConnectivityManager>
	//    5   12:invokevirtual   #239 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    6   15:astore_1        
		if(networkinfo != null && networkinfo.isConnected())
	//*   7   16:aload_1         
	//*   8   17:ifnull          32
	//*   9   20:aload_1         
	//*  10   21:invokevirtual   #244 <Method boolean NetworkInfo.isConnected()>
	//*  11   24:ifne            30
	//*  12   27:goto            32
		{
			return true;
	//   13   30:iconst_1        
	//   14   31:ireturn         
		} else
		{
			zzdi.v("...no network connectivity");
	//   15   32:ldc1            #246 <String "...no network connectivity">
	//   16   34:invokestatic    #249 <Method void zzdi.v(String)>
			return false;
	//   17   37:iconst_0        
	//   18   38:ireturn         
		}
	}

	private final String zzabl;
	private final zzfx zzbgn;
	private final zzfw zzbgo;
	private final Context zzri;
}
