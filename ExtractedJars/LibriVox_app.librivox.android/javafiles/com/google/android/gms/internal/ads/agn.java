// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.aw;
import java.io.File;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			afo, afn, wx, vo, 
//			agv, ahb, p, bwk, 
//			m, zzbbi, xg, bse

public class agn extends afo
{

	public agn(afn afn1, bse bse, boolean flag)
	{
		super(afn1, bse, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #12  <Method void afo(afn, bse, boolean)>
	//    5    7:return          
	}

	protected final WebResourceResponse a(WebView webview, String s, Map map)
	{
		if(!(webview instanceof afn))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class afn>
	//*   2    4:ifne            14
		{
			wx.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
	//    3    7:ldc1            #19  <String "Tried to intercept request from a WebView that wasn't an AdWebView.">
	//    4    9:invokestatic    #25  <Method void wx.e(String)>
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		}
		afn afn1 = (afn)webview;
	//    7   14:aload_1         
	//    8   15:checkcast       #17  <Class afn>
	//    9   18:astore          4
		if(a != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #28  <Field vo a>
	//*  12   24:ifnull          39
			a.a(s, map, 1);
	//   13   27:aload_0         
	//   14   28:getfield        #28  <Field vo a>
	//   15   31:aload_2         
	//   16   32:aload_3         
	//   17   33:iconst_1        
	//   18   34:invokeinterface #33  <Method void vo.a(String, Map, int)>
		if(!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
	//*  19   39:ldc1            #35  <String "mraid.js">
	//*  20   41:new             #37  <Class File>
	//*  21   44:dup             
	//*  22   45:aload_2         
	//*  23   46:invokespecial   #39  <Method void File(String)>
	//*  24   49:invokevirtual   #43  <Method String File.getName()>
	//*  25   52:invokevirtual   #49  <Method boolean String.equalsIgnoreCase(String)>
	//*  26   55:ifne            75
		{
			webview = ((WebView) (map));
	//   27   58:aload_3         
	//   28   59:astore_1        
			if(map == null)
	//*  29   60:aload_3         
	//*  30   61:ifnonnull       68
				webview = ((WebView) (Collections.emptyMap()));
	//   31   64:invokestatic    #55  <Method Map Collections.emptyMap()>
	//   32   67:astore_1        
			return super.a(s, ((Map) (webview)));
	//   33   68:aload_0         
	//   34   69:aload_2         
	//   35   70:aload_1         
	//   36   71:invokespecial   #58  <Method WebResourceResponse afo.a(String, Map)>
	//   37   74:areturn         
		}
		if(afn1.w() != null)
	//*  38   75:aload           4
	//*  39   77:invokeinterface #62  <Method agv afn.w()>
	//*  40   82:ifnull          97
			afn1.w().n();
	//   41   85:aload           4
	//   42   87:invokeinterface #62  <Method agv afn.w()>
	//   43   92:invokeinterface #68  <Method void agv.n()>
		if(afn1.u().e())
	//*  44   97:aload           4
	//*  45   99:invokeinterface #72  <Method ahb afn.u()>
	//*  46  104:invokevirtual   #77  <Method boolean ahb.e()>
	//*  47  107:ifeq            128
		{
			webview = ((WebView) (p.H));
	//   48  110:getstatic       #83  <Field e p.H>
	//   49  113:astore_1        
			webview = ((WebView) ((String)bwk.e().a(((e) (webview)))));
	//   50  114:invokestatic    #88  <Method m bwk.e()>
	//   51  117:aload_1         
	//   52  118:invokevirtual   #93  <Method Object m.a(e)>
	//   53  121:checkcast       #45  <Class String>
	//   54  124:astore_1        
		} else
	//*  55  125:goto            171
		if(afn1.B())
	//*  56  128:aload           4
	//*  57  130:invokeinterface #96  <Method boolean afn.B()>
	//*  58  135:ifeq            156
		{
			webview = ((WebView) (p.G));
	//   59  138:getstatic       #99  <Field e p.G>
	//   60  141:astore_1        
			webview = ((WebView) ((String)bwk.e().a(((e) (webview)))));
	//   61  142:invokestatic    #88  <Method m bwk.e()>
	//   62  145:aload_1         
	//   63  146:invokevirtual   #93  <Method Object m.a(e)>
	//   64  149:checkcast       #45  <Class String>
	//   65  152:astore_1        
		} else
	//*  66  153:goto            171
		{
			webview = ((WebView) (p.F));
	//   67  156:getstatic       #102 <Field e p.F>
	//   68  159:astore_1        
			webview = ((WebView) ((String)bwk.e().a(((e) (webview)))));
	//   69  160:invokestatic    #88  <Method m bwk.e()>
	//   70  163:aload_1         
	//   71  164:invokevirtual   #93  <Method Object m.a(e)>
	//   72  167:checkcast       #45  <Class String>
	//   73  170:astore_1        
		}
		aw.e();
	//   74  171:invokestatic    #107 <Method xg aw.e()>
	//   75  174:pop             
		return xg.c(afn1.getContext(), afn1.k().a, ((String) (webview)));
	//   76  175:aload           4
	//   77  177:invokeinterface #111 <Method android.content.Context afn.getContext()>
	//   78  182:aload           4
	//   79  184:invokeinterface #115 <Method zzbbi afn.k()>
	//   80  189:getfield        #120 <Field String zzbbi.a>
	//   81  192:aload_1         
	//   82  193:invokestatic    #126 <Method WebResourceResponse xg.c(android.content.Context, String, String)>
	//   83  196:areturn         
	}
}
