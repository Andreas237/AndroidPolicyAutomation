// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.*;
import android.webkit.*;
import com.google.android.gms.ads.internal.aw;
import java.io.InputStream;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			afn, afo, wx, wi, 
//			xp, bse

public class xo
{

	private xo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	xo(xp xp)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void xo()>
	//    2    4:return          
	}

	public static boolean a(afn afn1)
	{
		if(afn1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		} else
		{
			afn1.onPause();
	//    4    6:aload_0         
	//    5    7:invokeinterface #22  <Method void afn.onPause()>
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		}
	}

	public static boolean b(afn afn1)
	{
		if(afn1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		} else
		{
			afn1.onResume();
	//    4    6:aload_0         
	//    5    7:invokeinterface #26  <Method void afn.onResume()>
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		}
	}

	public static boolean e()
	{
		int i = Process.myUid();
	//    0    0:invokestatic    #34  <Method int Process.myUid()>
	//    1    3:istore_0        
		return i == 0 || i == 1000;
	//    2    4:iload_0         
	//    3    5:ifeq            20
	//    4    8:iload_0         
	//    5    9:sipush          1000
	//    6   12:icmpne          18
	//    7   15:goto            20
	//    8   18:iconst_0        
	//    9   19:ireturn         
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	public int a()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Drawable a(Context context, Bitmap bitmap, boolean flag, float f1)
	{
		return ((Drawable) (new BitmapDrawable(context.getResources(), bitmap)));
	//    0    0:new             #37  <Class BitmapDrawable>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method android.content.res.Resources Context.getResources()>
	//    4    8:aload_2         
	//    5    9:invokespecial   #46  <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
	//    6   12:areturn         
	}

	public WebResourceResponse a(String s, String s1, int i, String s2, Map map, InputStream inputstream)
	{
		return new WebResourceResponse(s, s1, inputstream);
	//    0    0:new             #49  <Class WebResourceResponse>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload           6
	//    5    8:invokespecial   #52  <Method void WebResourceResponse(String, String, InputStream)>
	//    6   11:areturn         
	}

	public afo a(afn afn1, bse bse, boolean flag)
	{
		return new afo(afn1, bse, flag);
	//    0    0:new             #55  <Class afo>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #58  <Method void afo(afn, bse, boolean)>
	//    6   10:areturn         
	}

	public String a(Context context)
	{
		return "";
	//    0    0:ldc1            #61  <String "">
	//    1    2:areturn         
	}

	public String a(SslError sslerror)
	{
		return "";
	//    0    0:ldc1            #61  <String "">
	//    1    2:areturn         
	}

	public Set a(Uri uri)
	{
		if(uri.isOpaque())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #68  <Method boolean Uri.isOpaque()>
	//*   2    4:ifeq            11
			return Collections.emptySet();
	//    3    7:invokestatic    #74  <Method Set Collections.emptySet()>
	//    4   10:areturn         
		uri = ((Uri) (uri.getEncodedQuery()));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #78  <Method String Uri.getEncodedQuery()>
	//    7   15:astore_1        
		if(uri == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       24
			return Collections.emptySet();
	//   10   20:invokestatic    #74  <Method Set Collections.emptySet()>
	//   11   23:areturn         
		LinkedHashSet linkedhashset = new LinkedHashSet();
	//   12   24:new             #80  <Class LinkedHashSet>
	//   13   27:dup             
	//   14   28:invokespecial   #81  <Method void LinkedHashSet()>
	//   15   31:astore          6
		int j = 0;
	//   16   33:iconst_0        
	//   17   34:istore_3        
		do
		{
			int i;
			int k;
label0:
			{
				k = ((String) (uri)).indexOf('&', j);
	//   18   35:aload_1         
	//   19   36:bipush          38
	//   20   38:iload_3         
	//   21   39:invokevirtual   #87  <Method int String.indexOf(int, int)>
	//   22   42:istore          4
				i = k;
	//   23   44:iload           4
	//   24   46:istore_2        
				if(k == -1)
	//*  25   47:iload           4
	//*  26   49:iconst_m1       
	//*  27   50:icmpne          58
					i = ((String) (uri)).length();
	//   28   53:aload_1         
	//   29   54:invokevirtual   #90  <Method int String.length()>
	//   30   57:istore_2        
				int l = ((String) (uri)).indexOf('=', j);
	//   31   58:aload_1         
	//   32   59:bipush          61
	//   33   61:iload_3         
	//   34   62:invokevirtual   #87  <Method int String.indexOf(int, int)>
	//   35   65:istore          5
				if(l <= i)
	//*  36   67:iload           5
	//*  37   69:iload_2         
	//*  38   70:icmpgt          83
				{
					k = l;
	//   39   73:iload           5
	//   40   75:istore          4
					if(l != -1)
						break label0;
	//   41   77:iload           5
	//   42   79:iconst_m1       
	//   43   80:icmpne          86
				}
				k = i;
	//   44   83:iload_2         
	//   45   84:istore          4
			}
			((Set) (linkedhashset)).add(((Object) (Uri.decode(((String) (uri)).substring(j, k)))));
	//   46   86:aload           6
	//   47   88:aload_1         
	//   48   89:iload_3         
	//   49   90:iload           4
	//   50   92:invokevirtual   #94  <Method String String.substring(int, int)>
	//   51   95:invokestatic    #98  <Method String Uri.decode(String)>
	//   52   98:invokeinterface #104 <Method boolean Set.add(Object)>
	//   53  103:pop             
			i++;
	//   54  104:iload_2         
	//   55  105:iconst_1        
	//   56  106:iadd            
	//   57  107:istore_2        
			j = i;
	//   58  108:iload_2         
	//   59  109:istore_3        
			if(i >= ((String) (uri)).length())
	//*  60  110:iload_2         
	//*  61  111:aload_1         
	//*  62  112:invokevirtual   #90  <Method int String.length()>
	//*  63  115:icmplt          35
				return Collections.unmodifiableSet(((Set) (linkedhashset)));
	//   64  118:aload           6
	//   65  120:invokestatic    #108 <Method Set Collections.unmodifiableSet(Set)>
	//   66  123:areturn         
		} while(true);
	}

	public void a(View view, Drawable drawable)
	{
		view.setBackgroundDrawable(drawable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #115 <Method void View.setBackgroundDrawable(Drawable)>
	//    3    5:return          
	}

	public void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
	{
		viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #122 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    3    5:return          
	}

	public boolean a(android.app.DownloadManager.Request request)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(Context context, WebSettings websettings)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(View view)
	{
		return view.getWindowToken() != null || view.getWindowVisibility() != 8;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #129 <Method android.os.IBinder View.getWindowToken()>
	//    2    4:ifnonnull       21
	//    3    7:aload_1         
	//    4    8:invokevirtual   #132 <Method int View.getWindowVisibility()>
	//    5   11:bipush          8
	//    6   13:icmpeq          19
	//    7   16:goto            21
	//    8   19:iconst_0        
	//    9   20:ireturn         
	//   10   21:iconst_1        
	//   11   22:ireturn         
	}

	public boolean a(Window window)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int b()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void b(Context context)
	{
	//    0    0:return          
	}

	public boolean b(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int c()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	public CookieManager c(Context context)
	{
		if(e())
	//*   0    0:invokestatic    #140 <Method boolean e()>
	//*   1    3:ifeq            8
			return null;
	//    2    6:aconst_null     
	//    3    7:areturn         
		try
		{
			CookieSyncManager.createInstance(context);
	//    4    8:aload_1         
	//    5    9:invokestatic    #146 <Method CookieSyncManager CookieSyncManager.createInstance(Context)>
	//    6   12:pop             
			context = ((Context) (CookieManager.getInstance()));
	//    7   13:invokestatic    #152 <Method CookieManager CookieManager.getInstance()>
	//    8   16:astore_1        
		}
	//*   9   17:aload_1         
	//*  10   18:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  11   19:astore_1        
		{
			wx.b("Failed to obtain CookieManager.", ((Throwable) (context)));
	//   12   20:ldc1            #154 <String "Failed to obtain CookieManager.">
	//   13   22:aload_1         
	//   14   23:invokestatic    #159 <Method void wx.b(String, Throwable)>
			aw.i().a(((Throwable) (context)), "ApiLevelUtil.getCookieManager");
	//   15   26:invokestatic    #165 <Method wi aw.i()>
	//   16   29:aload_1         
	//   17   30:ldc1            #167 <String "ApiLevelUtil.getCookieManager">
	//   18   32:invokevirtual   #172 <Method void wi.a(Throwable, String)>
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		}
		return ((CookieManager) (context));
	}

	public boolean c(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public android.view.ViewGroup.LayoutParams d()
	{
		return new android.view.ViewGroup.LayoutParams(-2, -2);
	//    0    0:new             #176 <Class android.view.ViewGroup$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #179 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	public int f()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
