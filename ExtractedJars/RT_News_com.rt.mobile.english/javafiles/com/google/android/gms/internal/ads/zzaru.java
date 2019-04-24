// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbv;
import java.io.File;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqx, zzaqw, zzakb, zzait, 
//			zzasc, zzasi, zznk, zzkb, 
//			zzni, zzang, zzakk

public class zzaru extends zzaqx
{

	public zzaru(zzaqw zzaqw1, boolean flag)
	{
		super(zzaqw1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #12  <Method void zzaqx(zzaqw, boolean)>
	//    4    6:return          
	}

	protected final WebResourceResponse zza(WebView webview, String s, Map map)
	{
		if(!(webview instanceof zzaqw))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class zzaqw>
	//*   2    4:ifne            14
		{
			zzakb.zzdk("Tried to intercept request from a WebView that wasn't an AdWebView.");
	//    3    7:ldc1            #20  <String "Tried to intercept request from a WebView that wasn't an AdWebView.">
	//    4    9:invokestatic    #26  <Method void zzakb.zzdk(String)>
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		}
		zzaqw zzaqw1 = (zzaqw)webview;
	//    7   14:aload_1         
	//    8   15:checkcast       #18  <Class zzaqw>
	//    9   18:astore          4
		if(zzxd != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #30  <Field zzait zzxd>
	//*  12   24:ifnull          39
			zzxd.zza(s, map, 1);
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field zzait zzxd>
	//   15   31:aload_2         
	//   16   32:aload_3         
	//   17   33:iconst_1        
	//   18   34:invokeinterface #35  <Method void zzait.zza(String, Map, int)>
		if(!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
	//*  19   39:ldc1            #37  <String "mraid.js">
	//*  20   41:new             #39  <Class File>
	//*  21   44:dup             
	//*  22   45:aload_2         
	//*  23   46:invokespecial   #41  <Method void File(String)>
	//*  24   49:invokevirtual   #45  <Method String File.getName()>
	//*  25   52:invokevirtual   #51  <Method boolean String.equalsIgnoreCase(String)>
	//*  26   55:ifne            75
		{
			webview = ((WebView) (map));
	//   27   58:aload_3         
	//   28   59:astore_1        
			if(map == null)
	//*  29   60:aload_3         
	//*  30   61:ifnonnull       68
				webview = ((WebView) (Collections.emptyMap()));
	//   31   64:invokestatic    #57  <Method Map Collections.emptyMap()>
	//   32   67:astore_1        
			return super.zzd(s, ((Map) (webview)));
	//   33   68:aload_0         
	//   34   69:aload_2         
	//   35   70:aload_1         
	//   36   71:invokespecial   #61  <Method WebResourceResponse zzaqx.zzd(String, Map)>
	//   37   74:areturn         
		}
		if(zzaqw1.zzuf() != null)
	//*  38   75:aload           4
	//*  39   77:invokeinterface #65  <Method zzasc zzaqw.zzuf()>
	//*  40   82:ifnull          97
			zzaqw1.zzuf().zznk();
	//   41   85:aload           4
	//   42   87:invokeinterface #65  <Method zzasc zzaqw.zzuf()>
	//   43   92:invokeinterface #71  <Method void zzasc.zznk()>
		if(zzaqw1.zzud().zzvs())
	//*  44   97:aload           4
	//*  45   99:invokeinterface #75  <Method zzasi zzaqw.zzud()>
	//*  46  104:invokevirtual   #81  <Method boolean zzasi.zzvs()>
	//*  47  107:ifeq            128
			webview = ((WebView) (zznk.zzawe));
	//   48  110:getstatic       #87  <Field zzna zznk.zzawe>
	//   49  113:astore_1        
		else
	//*  50  114:invokestatic    #93  <Method zzni zzkb.zzik()>
	//*  51  117:aload_1         
	//*  52  118:invokevirtual   #98  <Method Object zzni.zzd(zzna)>
	//*  53  121:checkcast       #47  <Class String>
	//*  54  124:astore_1        
	//*  55  125:goto            152
		if(zzaqw1.zzuj())
	//*  56  128:aload           4
	//*  57  130:invokeinterface #101 <Method boolean zzaqw.zzuj()>
	//*  58  135:ifeq            145
			webview = ((WebView) (zznk.zzawd));
	//   59  138:getstatic       #104 <Field zzna zznk.zzawd>
	//   60  141:astore_1        
		else
	//*  61  142:goto            114
			webview = ((WebView) (zznk.zzawc));
	//   62  145:getstatic       #107 <Field zzna zznk.zzawc>
	//   63  148:astore_1        
		webview = ((WebView) ((String)zzkb.zzik().zzd(((zzna) (webview)))));
	//*  64  149:goto            114
		zzbv.zzek();
	//   65  152:invokestatic    #113 <Method zzakk zzbv.zzek()>
	//   66  155:pop             
		return zzakk.zzf(zzaqw1.getContext(), zzaqw1.zztq().zzcw, ((String) (webview)));
	//   67  156:aload           4
	//   68  158:invokeinterface #117 <Method android.content.Context zzaqw.getContext()>
	//   69  163:aload           4
	//   70  165:invokeinterface #121 <Method zzang zzaqw.zztq()>
	//   71  170:getfield        #127 <Field String zzang.zzcw>
	//   72  173:aload_1         
	//   73  174:invokestatic    #133 <Method WebResourceResponse zzakk.zzf(android.content.Context, String, String)>
	//   74  177:areturn         
	}
}
