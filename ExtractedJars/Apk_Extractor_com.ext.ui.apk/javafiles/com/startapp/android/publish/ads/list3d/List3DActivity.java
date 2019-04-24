// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.list3d;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.d.a;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.common.a.g;
import com.startapp.common.b;
import java.util.List;

// Referenced classes of package com.startapp.android.publish.ads.list3d:
//			g, c, d, f, 
//			e, ListItem, b, SimpleDynamics

public class List3DActivity extends Activity
	implements com.startapp.android.publish.ads.list3d.g
{

	public List3DActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Activity()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #47  <Field ProgressDialog e>
		f = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #49  <Field WebView f>
		l = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #51  <Field long l>
		m = 0L;
	//   11   19:aload_0         
	//   12   20:lconst_0        
	//   13   21:putfield        #53  <Field long m>
		n = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent)
			{
				a.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field List3DActivity a>
			//    2    4:invokevirtual   #21  <Method void List3DActivity.finish()>
			//    3    7:return          
			}

			final List3DActivity a;

			
			{
				a = List3DActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field List3DActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   14   24:aload_0         
	//   15   25:new             #8   <Class List3DActivity$1>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:invokespecial   #56  <Method void List3DActivity$1(List3DActivity)>
	//   19   33:putfield        #58  <Field BroadcastReceiver n>
	//   20   36:return          
	}

	private void c()
	{
		if(g == getResources().getConfiguration().orientation)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int g>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #65  <Method Resources getResources()>
	//*   4    8:invokevirtual   #71  <Method Configuration Resources.getConfiguration()>
	//*   5   11:getfield        #76  <Field int Configuration.orientation>
	//*   6   14:icmpne          36
		{
			Intent intent = new Intent("com.startapp.android.HideDisplayBroadcastListener");
	//    7   17:new             #78  <Class Intent>
	//    8   20:dup             
	//    9   21:ldc1            #80  <String "com.startapp.android.HideDisplayBroadcastListener">
	//   10   23:invokespecial   #83  <Method void Intent(String)>
	//   11   26:astore_1        
			com.startapp.common.b.a(((Context) (this))).a(intent);
	//   12   27:aload_0         
	//   13   28:invokestatic    #88  <Method b b.a(Context)>
	//   14   31:aload_1         
	//   15   32:invokevirtual   #91  <Method boolean b.a(Intent)>
	//   16   35:pop             
		}
	//   17   36:return          
	}

	private boolean d()
	{
		while(i == null || j == null || System.currentTimeMillis() - i.longValue() <= j.longValue()) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field Long i>
	//*   2    4:ifnull          14
	//*   3    7:aload_0         
	//*   4    8:getfield        #96  <Field Long j>
	//*   5   11:ifnonnull       16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//    8   16:invokestatic    #102 <Method long System.currentTimeMillis()>
	//    9   19:aload_0         
	//   10   20:getfield        #94  <Field Long i>
	//   11   23:invokevirtual   #107 <Method long Long.longValue()>
	//   12   26:lsub            
	//   13   27:aload_0         
	//   14   28:getfield        #96  <Field Long j>
	//   15   31:invokevirtual   #107 <Method long Long.longValue()>
	//   16   34:lcmp            
	//   17   35:ifle            14
		return true;
	//   18   38:iconst_1        
	//   19   39:ireturn         
	}

	protected com.startapp.android.publish.adsCommon.d.b a()
	{
		l = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #102 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #51  <Field long l>
		return ((com.startapp.android.publish.adsCommon.d.b) (new a(String.valueOf((double)(l - m) / 1000D), b)));
	//    3    7:new             #110 <Class a>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field long l>
	//    7   15:aload_0         
	//    8   16:getfield        #53  <Field long m>
	//    9   19:lsub            
	//   10   20:l2d             
	//   11   21:ldc2w           #111 <Double 1000D>
	//   12   24:ddiv            
	//   13   25:invokestatic    #118 <Method String String.valueOf(double)>
	//   14   28:aload_0         
	//   15   29:getfield        #120 <Field String b>
	//   16   32:invokespecial   #123 <Method void a(String, String)>
	//   17   35:areturn         
	}

	public void a(int i1)
	{
		int j1 = d.getFirstItemPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//    2    4:invokevirtual   #132 <Method int c.getFirstItemPosition()>
	//    3    7:istore_2        
		Object obj = ((Object) (d.getChildAt(i1 - j1)));
	//    4    8:aload_0         
	//    5    9:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//    6   12:iload_1         
	//    7   13:iload_2         
	//    8   14:isub            
	//    9   15:invokevirtual   #136 <Method View c.getChildAt(int)>
	//   10   18:astore_3        
		if(obj != null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       24
	//*  13   23:return          
		{
			obj = ((Object) ((com.startapp.android.publish.ads.list3d.d)((View) (obj)).getTag()));
	//   14   24:aload_3         
	//   15   25:invokevirtual   #142 <Method Object View.getTag()>
	//   16   28:checkcast       #144 <Class com.startapp.android.publish.ads.list3d.d>
	//   17   31:astore_3        
			Object obj1 = ((Object) (com.startapp.android.publish.ads.list3d.f.a().a(a)));
	//   18   32:invokestatic    #149 <Method com.startapp.android.publish.ads.list3d.f com.startapp.android.publish.ads.list3d.f.a()>
	//   19   35:aload_0         
	//   20   36:getfield        #151 <Field String a>
	//   21   39:invokevirtual   #154 <Method e com.startapp.android.publish.ads.list3d.f.a(String)>
	//   22   42:astore          5
			if(obj1 != null && ((e) (obj1)).e() != null && i1 < ((e) (obj1)).e().size())
	//*  23   44:aload           5
	//*  24   46:ifnull          23
	//*  25   49:aload           5
	//*  26   51:invokevirtual   #159 <Method List e.e()>
	//*  27   54:ifnull          23
	//*  28   57:iload_1         
	//*  29   58:aload           5
	//*  30   60:invokevirtual   #159 <Method List e.e()>
	//*  31   63:invokeinterface #164 <Method int List.size()>
	//*  32   68:icmpge          23
			{
				ListItem listitem = (ListItem)((e) (obj1)).e().get(i1);
	//   33   71:aload           5
	//   34   73:invokevirtual   #159 <Method List e.e()>
	//   35   76:iload_1         
	//   36   77:invokeinterface #168 <Method Object List.get(int)>
	//   37   82:checkcast       #170 <Class ListItem>
	//   38   85:astore          4
				obj1 = ((Object) (((e) (obj1)).a(i1, listitem.a(), listitem.i())));
	//   39   87:aload           5
	//   40   89:iload_1         
	//   41   90:aload           4
	//   42   92:invokevirtual   #173 <Method String com.startapp.android.publish.ads.list3d.ListItem.a()>
	//   43   95:aload           4
	//   44   97:invokevirtual   #175 <Method String com.startapp.android.publish.ads.list3d.ListItem.i()>
	//   45  100:invokevirtual   #178 <Method Bitmap com.startapp.android.publish.ads.list3d.e.a(int, String, String)>
	//   46  103:astore          5
				((com.startapp.android.publish.ads.list3d.d) (obj)).b().setImageBitmap(((Bitmap) (obj1)));
	//   47  105:aload_3         
	//   48  106:invokevirtual   #181 <Method ImageView com.startapp.android.publish.ads.list3d.d.b()>
	//   49  109:aload           5
	//   50  111:invokevirtual   #187 <Method void ImageView.setImageBitmap(Bitmap)>
				((com.startapp.android.publish.ads.list3d.d) (obj)).b().requestLayout();
	//   51  114:aload_3         
	//   52  115:invokevirtual   #181 <Method ImageView com.startapp.android.publish.ads.list3d.d.b()>
	//   53  118:invokevirtual   #190 <Method void ImageView.requestLayout()>
				((com.startapp.android.publish.ads.list3d.d) (obj)).a(listitem.q());
	//   54  121:aload_3         
	//   55  122:aload           4
	//   56  124:invokevirtual   #193 <Method boolean ListItem.q()>
	//   57  127:invokevirtual   #196 <Method void com.startapp.android.publish.ads.list3d.d.a(boolean)>
				return;
	//   58  130:return          
			}
		}
	}

	protected String b()
	{
		if(c != null && !c.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field List c>
	//*   2    4:ifnull          58
	//*   3    7:aload_0         
	//*   4    8:getfield        #198 <Field List c>
	//*   5   11:invokeinterface #201 <Method boolean List.isEmpty()>
	//*   6   16:ifne            58
		{
			if(((ListItem)c.get(0)).d() != null)
	//*   7   19:aload_0         
	//*   8   20:getfield        #198 <Field List c>
	//*   9   23:iconst_0        
	//*  10   24:invokeinterface #168 <Method Object List.get(int)>
	//*  11   29:checkcast       #170 <Class ListItem>
	//*  12   32:invokevirtual   #203 <Method String com.startapp.android.publish.ads.list3d.ListItem.d()>
	//*  13   35:ifnull          55
				return ((ListItem)c.get(0)).d();
	//   14   38:aload_0         
	//   15   39:getfield        #198 <Field List c>
	//   16   42:iconst_0        
	//   17   43:invokeinterface #168 <Method Object List.get(int)>
	//   18   48:checkcast       #170 <Class ListItem>
	//   19   51:invokevirtual   #203 <Method String com.startapp.android.publish.ads.list3d.ListItem.d()>
	//   20   54:areturn         
			else
				return "";
	//   21   55:ldc1            #205 <String "">
	//   22   57:areturn         
		} else
		{
			return "";
	//   23   58:ldc1            #205 <String "">
	//   24   60:areturn         
		}
	}

	public void finish()
	{
		com.startapp.common.a.g.a("List3DActivity", 2, "Finishing activity.");
	//    0    0:ldc1            #208 <String "List3DActivity">
	//    1    2:iconst_2        
	//    2    3:ldc1            #210 <String "Finishing activity.">
	//    3    5:invokestatic    #215 <Method void g.a(String, int, String)>
		l = System.currentTimeMillis();
	//    4    8:aload_0         
	//    5    9:invokestatic    #102 <Method long System.currentTimeMillis()>
	//    6   12:putfield        #51  <Field long l>
		com.startapp.android.publish.adsCommon.c.b(((Context) (this)), b(), a());
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #217 <Method String b()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #219 <Method com.startapp.android.publish.adsCommon.d.b a()>
	//   12   24:invokestatic    #224 <Method void c.b(Context, String, com.startapp.android.publish.adsCommon.d.b)>
		com.startapp.android.publish.adsCommon.m.a().a(false);
	//   13   27:invokestatic    #229 <Method m m.a()>
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #230 <Method void m.a(boolean)>
		c();
	//   16   34:aload_0         
	//   17   35:invokespecial   #232 <Method void c()>
		this;
	//   18   38:aload_0         
		JVM INSTR monitorenter ;
	//   19   39:monitorenter    
		if(n != null)
	//*  20   40:aload_0         
	//*  21   41:getfield        #58  <Field BroadcastReceiver n>
	//*  22   44:ifnull          63
		{
			com.startapp.common.b.a(((Context) (this))).a(n);
	//   23   47:aload_0         
	//   24   48:invokestatic    #88  <Method b b.a(Context)>
	//   25   51:aload_0         
	//   26   52:getfield        #58  <Field BroadcastReceiver n>
	//   27   55:invokevirtual   #235 <Method void b.a(BroadcastReceiver)>
			n = null;
	//   28   58:aload_0         
	//   29   59:aconst_null     
	//   30   60:putfield        #58  <Field BroadcastReceiver n>
		}
		this;
	//   31   63:aload_0         
		JVM INSTR monitorexit ;
	//   32   64:monitorexit     
		com.startapp.android.publish.ads.list3d.f.a().a(a).d();
	//   33   65:invokestatic    #149 <Method com.startapp.android.publish.ads.list3d.f com.startapp.android.publish.ads.list3d.f.a()>
	//   34   68:aload_0         
	//   35   69:getfield        #151 <Field String a>
	//   36   72:invokevirtual   #154 <Method e com.startapp.android.publish.ads.list3d.f.a(String)>
	//   37   75:invokevirtual   #237 <Method void com.startapp.android.publish.ads.list3d.e.d()>
		if(!AdsConstants.OVERRIDE_NETWORK.booleanValue())
	//*  38   78:getstatic       #243 <Field Boolean AdsConstants.OVERRIDE_NETWORK>
	//*  39   81:invokevirtual   #248 <Method boolean Boolean.booleanValue()>
	//*  40   84:ifne            97
			com.startapp.android.publish.ads.list3d.f.a().b(a);
	//   41   87:invokestatic    #149 <Method com.startapp.android.publish.ads.list3d.f com.startapp.android.publish.ads.list3d.f.a()>
	//   42   90:aload_0         
	//   43   91:getfield        #151 <Field String a>
	//   44   94:invokevirtual   #250 <Method void com.startapp.android.publish.ads.list3d.f.b(String)>
		super.finish();
	//   45   97:aload_0         
	//   46   98:invokespecial   #252 <Method void Activity.finish()>
		return;
	//   47  101:return          
		Exception exception;
		exception;
	//   48  102:astore_1        
		this;
	//   49  103:aload_0         
		JVM INSTR monitorexit ;
	//   50  104:monitorexit     
		throw exception;
	//   51  105:aload_1         
	//   52  106:athrow          
	}

	public void onBackPressed()
	{
		com.startapp.android.publish.ads.list3d.f.a().a(a).d();
	//    0    0:invokestatic    #149 <Method com.startapp.android.publish.ads.list3d.f com.startapp.android.publish.ads.list3d.f.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #151 <Field String a>
	//    3    7:invokevirtual   #154 <Method e com.startapp.android.publish.ads.list3d.f.a(String)>
	//    4   10:invokevirtual   #237 <Method void com.startapp.android.publish.ads.list3d.e.d()>
		super.onBackPressed();
	//    5   13:aload_0         
	//    6   14:invokespecial   #255 <Method void Activity.onBackPressed()>
	//    7   17:return          
	}

	public void onCreate(Bundle bundle)
	{
		boolean flag;
		int i1;
		int j1;
		try
		{
			overridePendingTransition(0, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #263 <Method void overridePendingTransition(int, int)>
			super.onCreate(bundle);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #265 <Method void Activity.onCreate(Bundle)>
			if(getIntent().getBooleanExtra("fullscreen", false))
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #269 <Method Intent getIntent()>
	//*   9   15:ldc2            #271 <String "fullscreen">
	//*  10   18:iconst_0        
	//*  11   19:invokevirtual   #275 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  12   22:ifeq            44
			{
				requestWindowFeature(1);
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #279 <Method boolean requestWindowFeature(int)>
	//   16   30:pop             
				getWindow().setFlags(1024, 1024);
	//   17   31:aload_0         
	//   18   32:invokevirtual   #283 <Method Window getWindow()>
	//   19   35:sipush          1024
	//   20   38:sipush          1024
	//   21   41:invokevirtual   #288 <Method void Window.setFlags(int, int)>
			}
		}
	//*  22   44:aload_1         
	//*  23   45:ifnonnull       295
	//*  24   48:aload_0         
	//*  25   49:invokestatic    #88  <Method b b.a(Context)>
	//*  26   52:new             #78  <Class Intent>
	//*  27   55:dup             
	//*  28   56:ldc2            #290 <String "com.startapp.android.ShowDisplayBroadcastListener">
	//*  29   59:invokespecial   #83  <Method void Intent(String)>
	//*  30   62:invokevirtual   #91  <Method boolean b.a(Intent)>
	//*  31   65:pop             
	//*  32   66:aload_0         
	//*  33   67:aload_0         
	//*  34   68:invokevirtual   #269 <Method Intent getIntent()>
	//*  35   71:ldc2            #292 <String "lastLoadTime">
	//*  36   74:invokevirtual   #296 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//*  37   77:checkcast       #104 <Class Long>
	//*  38   80:putfield        #94  <Field Long i>
	//*  39   83:aload_0         
	//*  40   84:aload_0         
	//*  41   85:invokevirtual   #269 <Method Intent getIntent()>
	//*  42   88:ldc2            #298 <String "adCacheTtl">
	//*  43   91:invokevirtual   #296 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//*  44   94:checkcast       #104 <Class Long>
	//*  45   97:putfield        #96  <Field Long j>
	//*  46  100:aload_0         
	//*  47  101:aload_0         
	//*  48  102:invokevirtual   #269 <Method Intent getIntent()>
	//*  49  105:ldc2            #300 <String "position">
	//*  50  108:invokevirtual   #304 <Method String Intent.getStringExtra(String)>
	//*  51  111:putfield        #306 <Field String k>
	//*  52  114:aload_0         
	//*  53  115:aload_0         
	//*  54  116:invokevirtual   #269 <Method Intent getIntent()>
	//*  55  119:ldc2            #308 <String "listModelUuid">
	//*  56  122:invokevirtual   #304 <Method String Intent.getStringExtra(String)>
	//*  57  125:putfield        #151 <Field String a>
	//*  58  128:aload_0         
	//*  59  129:invokestatic    #88  <Method b b.a(Context)>
	//*  60  132:aload_0         
	//*  61  133:getfield        #58  <Field BroadcastReceiver n>
	//*  62  136:new             #310 <Class IntentFilter>
	//*  63  139:dup             
	//*  64  140:ldc2            #312 <String "com.startapp.android.CloseAdActivity">
	//*  65  143:invokespecial   #313 <Method void IntentFilter(String)>
	//*  66  146:invokevirtual   #316 <Method void b.a(BroadcastReceiver, IntentFilter)>
	//*  67  149:aload_0         
	//*  68  150:aload_0         
	//*  69  151:invokevirtual   #65  <Method Resources getResources()>
	//*  70  154:invokevirtual   #71  <Method Configuration Resources.getConfiguration()>
	//*  71  157:getfield        #76  <Field int Configuration.orientation>
	//*  72  160:putfield        #61  <Field int g>
	//*  73  163:aload_0         
	//*  74  164:iconst_1        
	//*  75  165:invokestatic    #321 <Method void i.a(Activity, boolean)>
	//*  76  168:aload_0         
	//*  77  169:invokevirtual   #269 <Method Intent getIntent()>
	//*  78  172:ldc2            #323 <String "overlay">
	//*  79  175:iconst_0        
	//*  80  176:invokevirtual   #275 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  81  179:istore          4
	//*  82  181:aload_0         
	//*  83  182:iconst_1        
	//*  84  183:invokevirtual   #279 <Method boolean requestWindowFeature(int)>
	//*  85  186:pop             
	//*  86  187:aload_0         
	//*  87  188:aload_0         
	//*  88  189:invokevirtual   #269 <Method Intent getIntent()>
	//*  89  192:ldc2            #325 <String "adTag">
	//*  90  195:invokevirtual   #304 <Method String Intent.getStringExtra(String)>
	//*  91  198:putfield        #120 <Field String b>
	//*  92  201:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//*  93  204:invokevirtual   #332 <Method int com.startapp.android.publish.adsCommon.b.e()>
	//*  94  207:istore_2        
	//*  95  208:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//*  96  211:invokevirtual   #334 <Method int com.startapp.android.publish.adsCommon.b.f()>
	//*  97  214:istore_3        
	//*  98  215:aload_0         
	//*  99  216:new             #128 <Class com.startapp.android.publish.ads.list3d.c>
	//* 100  219:dup             
	//* 101  220:aload_0         
	//* 102  221:aconst_null     
	//* 103  222:aload_0         
	//* 104  223:getfield        #120 <Field String b>
	//* 105  226:aload_0         
	//* 106  227:getfield        #151 <Field String a>
	//* 107  230:invokespecial   #337 <Method void com.startapp.android.publish.ads.list3d.c(Context, android.util.AttributeSet, String, String)>
	//* 108  233:putfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 109  236:new             #339 <Class GradientDrawable>
	//* 110  239:dup             
	//* 111  240:getstatic       #345 <Field android.graphics.drawable.GradientDrawable$Orientation android.graphics.drawable.GradientDrawable$Orientation.TOP_BOTTOM>
	//* 112  243:iconst_2        
	//* 113  244:newarray        int[]
	//* 114  246:dup             
	//* 115  247:iconst_0        
	//* 116  248:iload_2         
	//* 117  249:iastore         
	//* 118  250:dup             
	//* 119  251:iconst_1        
	//* 120  252:iload_3         
	//* 121  253:iastore         
	//* 122  254:invokespecial   #348 <Method void GradientDrawable(android.graphics.drawable.GradientDrawable$Orientation, int[])>
	//* 123  257:astore_1        
	//* 124  258:aload_0         
	//* 125  259:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 126  262:aload_1         
	//* 127  263:invokevirtual   #352 <Method void c.setBackgroundDrawable(android.graphics.drawable.Drawable)>
	//* 128  266:aload_0         
	//* 129  267:invokestatic    #149 <Method com.startapp.android.publish.ads.list3d.f com.startapp.android.publish.ads.list3d.f.a()>
	//* 130  270:aload_0         
	//* 131  271:getfield        #151 <Field String a>
	//* 132  274:invokevirtual   #154 <Method e com.startapp.android.publish.ads.list3d.f.a(String)>
	//* 133  277:invokevirtual   #159 <Method List e.e()>
	//* 134  280:putfield        #198 <Field List c>
	//* 135  283:aload_0         
	//* 136  284:getfield        #198 <Field List c>
	//* 137  287:ifnonnull       379
	//* 138  290:aload_0         
	//* 139  291:invokevirtual   #353 <Method void finish()>
	//* 140  294:return          
	//* 141  295:aload_1         
	//* 142  296:ldc2            #292 <String "lastLoadTime">
	//* 143  299:invokevirtual   #359 <Method boolean Bundle.containsKey(String)>
	//* 144  302:ifeq            319
	//* 145  305:aload_0         
	//* 146  306:aload_1         
	//* 147  307:ldc2            #292 <String "lastLoadTime">
	//* 148  310:invokevirtual   #362 <Method java.io.Serializable Bundle.getSerializable(String)>
	//* 149  313:checkcast       #104 <Class Long>
	//* 150  316:putfield        #94  <Field Long i>
	//* 151  319:aload_1         
	//* 152  320:ldc2            #298 <String "adCacheTtl">
	//* 153  323:invokevirtual   #359 <Method boolean Bundle.containsKey(String)>
	//* 154  326:ifeq            100
	//* 155  329:aload_0         
	//* 156  330:aload_1         
	//* 157  331:ldc2            #298 <String "adCacheTtl">
	//* 158  334:invokevirtual   #362 <Method java.io.Serializable Bundle.getSerializable(String)>
	//* 159  337:checkcast       #104 <Class Long>
	//* 160  340:putfield        #96  <Field Long j>
	//* 161  343:goto            100
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//* 162  346:astore_1        
		{
			com.startapp.common.a.g.a("List3DActivity", 6, "List3DActivity.onCreate", ((Throwable) (bundle)));
	//  163  347:ldc1            #208 <String "List3DActivity">
	//  164  349:bipush          6
	//  165  351:ldc2            #364 <String "List3DActivity.onCreate">
	//  166  354:aload_1         
	//  167  355:invokestatic    #367 <Method void g.a(String, int, String, Throwable)>
			com.startapp.android.publish.adsCommon.e.f.a(((Context) (this)), d.b, "List3DActivity.onCreate", ((Throwable) (bundle)).getMessage(), "");
	//  168  358:aload_0         
	//  169  359:getstatic       #372 <Field d d.b>
	//  170  362:ldc2            #364 <String "List3DActivity.onCreate">
	//  171  365:aload_1         
	//  172  366:invokevirtual   #375 <Method String Throwable.getMessage()>
	//  173  369:ldc1            #205 <String "">
	//  174  371:invokestatic    #380 <Method void f.a(Context, d, String, String, String)>
			finish();
	//  175  374:aload_0         
	//  176  375:invokevirtual   #353 <Method void finish()>
			return;
	//  177  378:return          
		}
		if(bundle != null)
			break MISSING_BLOCK_LABEL_295;
		com.startapp.common.b.a(((Context) (this))).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
		i = (Long)getIntent().getSerializableExtra("lastLoadTime");
		j = (Long)getIntent().getSerializableExtra("adCacheTtl");
_L2:
		k = getIntent().getStringExtra("position");
		a = getIntent().getStringExtra("listModelUuid");
		com.startapp.common.b.a(((Context) (this))).a(n, new IntentFilter("com.startapp.android.CloseAdActivity"));
		g = getResources().getConfiguration().orientation;
		com.startapp.android.publish.adsCommon.Utils.i.a(((Activity) (this)), true);
		flag = getIntent().getBooleanExtra("overlay", false);
		requestWindowFeature(1);
		b = getIntent().getStringExtra("adTag");
		i1 = com.startapp.android.publish.adsCommon.b.a().e();
		j1 = com.startapp.android.publish.adsCommon.b.a().f();
		d = new com.startapp.android.publish.ads.list3d.c(((Context) (this)), ((android.util.AttributeSet) (null)), b, a);
		bundle = ((Bundle) (new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
			i1, j1
		})));
		d.setBackgroundDrawable(((android.graphics.drawable.Drawable) (bundle)));
		c = com.startapp.android.publish.ads.list3d.f.a().a(a).e();
		if(c == null)
		{
			finish();
			return;
		}
		break MISSING_BLOCK_LABEL_379;
		if(bundle.containsKey("lastLoadTime"))
			i = (Long)bundle.getSerializable("lastLoadTime");
		if(bundle.containsKey("adCacheTtl"))
			j = (Long)bundle.getSerializable("adCacheTtl");
		if(true) goto _L2; else goto _L1
_L1:
		bundle = "";
	//  178  379:ldc1            #205 <String "">
	//  179  381:astore_1        
		if(!flag) goto _L4; else goto _L3
	//  180  382:iload           4
	//  181  384:ifeq            1184
_L3:
		com.startapp.common.b.a(((Context) (this))).a(d.p, new IntentFilter("com.startapp.android.Activity3DGetValues"));
	//  182  387:aload_0         
	//  183  388:invokestatic    #88  <Method b b.a(Context)>
	//  184  391:aload_0         
	//  185  392:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//  186  395:getfield        #383 <Field BroadcastReceiver c.p>
	//  187  398:new             #310 <Class IntentFilter>
	//  188  401:dup             
	//  189  402:ldc2            #385 <String "com.startapp.android.Activity3DGetValues">
	//  190  405:invokespecial   #313 <Method void IntentFilter(String)>
	//  191  408:invokevirtual   #316 <Method void b.a(BroadcastReceiver, IntentFilter)>
_L5:
		Object obj;
		bundle = ((Bundle) (new com.startapp.android.publish.ads.list3d.b(((Context) (this)), c, ((String) (bundle)), b, a)));
	//  192  411:new             #387 <Class com.startapp.android.publish.ads.list3d.b>
	//  193  414:dup             
	//  194  415:aload_0         
	//  195  416:aload_0         
	//  196  417:getfield        #198 <Field List c>
	//  197  420:aload_1         
	//  198  421:aload_0         
	//  199  422:getfield        #120 <Field String b>
	//  200  425:aload_0         
	//  201  426:getfield        #151 <Field String a>
	//  202  429:invokespecial   #390 <Method void com.startapp.android.publish.ads.list3d.b(Context, List, String, String, String)>
	//  203  432:astore_1        
		obj = ((Object) (com.startapp.android.publish.ads.list3d.f.a().a(a)));
	//  204  433:invokestatic    #149 <Method com.startapp.android.publish.ads.list3d.f com.startapp.android.publish.ads.list3d.f.a()>
	//  205  436:aload_0         
	//  206  437:getfield        #151 <Field String a>
	//  207  440:invokevirtual   #154 <Method e com.startapp.android.publish.ads.list3d.f.a(String)>
	//  208  443:astore          5
		android.widget.FrameLayout.LayoutParams layoutparams;
		Object obj1;
		Object obj2;
		android.widget.RelativeLayout.LayoutParams layoutparams1;
		Bitmap bitmap;
		if(!flag)
	//* 209  445:iload           4
	//* 210  447:ifne            1246
			flag = true;
	//  211  450:iconst_1        
	//  212  451:istore          4
		else
	//* 213  453:aload           5
	//* 214  455:aload_0         
	//* 215  456:iload           4
	//* 216  458:invokevirtual   #393 <Method void com.startapp.android.publish.ads.list3d.e.a(com.startapp.android.publish.ads.list3d.g, boolean)>
	//* 217  461:aload_0         
	//* 218  462:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 219  465:aload_1         
	//* 220  466:invokevirtual   #397 <Method void c.setAdapter(android.widget.Adapter)>
	//* 221  469:aload_0         
	//* 222  470:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 223  473:new             #399 <Class SimpleDynamics>
	//* 224  476:dup             
	//* 225  477:ldc2            #400 <Float 0.9F>
	//* 226  480:ldc2            #401 <Float 0.6F>
	//* 227  483:invokespecial   #404 <Method void SimpleDynamics(float, float)>
	//* 228  486:invokevirtual   #408 <Method void c.setDynamics(Dynamics)>
	//* 229  489:aload_0         
	//* 230  490:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 231  493:new             #10  <Class List3DActivity$2>
	//* 232  496:dup             
	//* 233  497:aload_0         
	//* 234  498:invokespecial   #409 <Method void List3DActivity$2(List3DActivity)>
	//* 235  501:invokevirtual   #413 <Method void c.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//* 236  504:new             #415 <Class RelativeLayout>
	//* 237  507:dup             
	//* 238  508:aload_0         
	//* 239  509:invokespecial   #418 <Method void RelativeLayout(Context)>
	//* 240  512:astore          5
	//* 241  514:aload           5
	//* 242  516:ldc2            #420 <String "StartApp Ad">
	//* 243  519:invokevirtual   #424 <Method void RelativeLayout.setContentDescription(CharSequence)>
	//* 244  522:aload           5
	//* 245  524:ldc2            #425 <Int 0x57f00000>
	//* 246  527:invokevirtual   #428 <Method void RelativeLayout.setId(int)>
	//* 247  530:new             #430 <Class android.widget.FrameLayout$LayoutParams>
	//* 248  533:dup             
	//* 249  534:iconst_m1       
	//* 250  535:iconst_m1       
	//* 251  536:invokespecial   #432 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//* 252  539:astore          6
	//* 253  541:new             #434 <Class android.widget.RelativeLayout$LayoutParams>
	//* 254  544:dup             
	//* 255  545:iconst_m1       
	//* 256  546:iconst_m1       
	//* 257  547:invokespecial   #435 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 258  550:astore_1        
	//* 259  551:new             #437 <Class LinearLayout>
	//* 260  554:dup             
	//* 261  555:aload_0         
	//* 262  556:invokespecial   #438 <Method void LinearLayout(Context)>
	//* 263  559:astore          7
	//* 264  561:aload           7
	//* 265  563:iconst_1        
	//* 266  564:invokevirtual   #441 <Method void LinearLayout.setOrientation(int)>
	//* 267  567:aload           5
	//* 268  569:aload           7
	//* 269  571:aload_1         
	//* 270  572:invokevirtual   #445 <Method void RelativeLayout.addView(View, android.view.ViewGroup$LayoutParams)>
	//* 271  575:new             #415 <Class RelativeLayout>
	//* 272  578:dup             
	//* 273  579:aload_0         
	//* 274  580:invokespecial   #418 <Method void RelativeLayout(Context)>
	//* 275  583:astore          8
	//* 276  585:aload           8
	//* 277  587:new             #434 <Class android.widget.RelativeLayout$LayoutParams>
	//* 278  590:dup             
	//* 279  591:iconst_m1       
	//* 280  592:bipush          -2
	//* 281  594:invokespecial   #435 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 282  597:invokevirtual   #449 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 283  600:aload           8
	//* 284  602:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//* 285  605:invokevirtual   #452 <Method Integer com.startapp.android.publish.adsCommon.b.h()>
	//* 286  608:invokevirtual   #457 <Method int Integer.intValue()>
	//* 287  611:invokevirtual   #460 <Method void RelativeLayout.setBackgroundColor(int)>
	//* 288  614:aload           7
	//* 289  616:aload           8
	//* 290  618:invokevirtual   #463 <Method void LinearLayout.addView(View)>
	//* 291  621:new             #465 <Class TextView>
	//* 292  624:dup             
	//* 293  625:aload_0         
	//* 294  626:invokespecial   #466 <Method void TextView(Context)>
	//* 295  629:astore_1        
	//* 296  630:new             #434 <Class android.widget.RelativeLayout$LayoutParams>
	//* 297  633:dup             
	//* 298  634:bipush          -2
	//* 299  636:bipush          -2
	//* 300  638:invokespecial   #435 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 301  641:astore          9
	//* 302  643:aload           9
	//* 303  645:bipush          13
	//* 304  647:invokevirtual   #469 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 305  650:aload_1         
	//* 306  651:aload           9
	//* 307  653:invokevirtual   #470 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 308  656:aload_1         
	//* 309  657:iconst_0        
	//* 310  658:aload_0         
	//* 311  659:iconst_2        
	//* 312  660:invokestatic    #475 <Method int h.a(Context, int)>
	//* 313  663:iconst_0        
	//* 314  664:aload_0         
	//* 315  665:iconst_5        
	//* 316  666:invokestatic    #475 <Method int h.a(Context, int)>
	//* 317  669:invokevirtual   #479 <Method void TextView.setPadding(int, int, int, int)>
	//* 318  672:aload_1         
	//* 319  673:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//* 320  676:invokevirtual   #481 <Method Integer com.startapp.android.publish.adsCommon.b.k()>
	//* 321  679:invokevirtual   #457 <Method int Integer.intValue()>
	//* 322  682:invokevirtual   #484 <Method void TextView.setTextColor(int)>
	//* 323  685:aload_1         
	//* 324  686:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//* 325  689:invokevirtual   #486 <Method Integer com.startapp.android.publish.adsCommon.b.j()>
	//* 326  692:invokevirtual   #457 <Method int Integer.intValue()>
	//* 327  695:i2f             
	//* 328  696:invokevirtual   #490 <Method void TextView.setTextSize(float)>
	//* 329  699:aload_1         
	//* 330  700:iconst_1        
	//* 331  701:invokevirtual   #493 <Method void TextView.setSingleLine(boolean)>
	//* 332  704:aload_1         
	//* 333  705:getstatic       #499 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//* 334  708:invokevirtual   #503 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
	//* 335  711:aload_1         
	//* 336  712:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//* 337  715:invokevirtual   #504 <Method String com.startapp.android.publish.adsCommon.b.i()>
	//* 338  718:invokevirtual   #507 <Method void TextView.setText(CharSequence)>
	//* 339  721:aload_1         
	//* 340  722:ldc2            #508 <Float 2.5F>
	//* 341  725:ldc2            #509 <Float -2F>
	//* 342  728:fconst_2        
	//* 343  729:ldc2            #510 <Int 0xff505050>
	//* 344  732:invokevirtual   #514 <Method void TextView.setShadowLayer(float, float, float, int)>
	//* 345  735:aload_1         
	//* 346  736:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//* 347  739:invokevirtual   #517 <Method java.util.Set com.startapp.android.publish.adsCommon.b.l()>
	//* 348  742:invokestatic    #520 <Method void h.a(TextView, java.util.Set)>
	//* 349  745:aload           8
	//* 350  747:aload_1         
	//* 351  748:invokevirtual   #521 <Method void RelativeLayout.addView(View)>
	//* 352  751:new             #434 <Class android.widget.RelativeLayout$LayoutParams>
	//* 353  754:dup             
	//* 354  755:bipush          -2
	//* 355  757:bipush          -2
	//* 356  759:invokespecial   #435 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 357  762:astore          9
	//* 358  764:aload           9
	//* 359  766:bipush          11
	//* 360  768:invokevirtual   #469 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 361  771:aload           9
	//* 362  773:bipush          15
	//* 363  775:invokevirtual   #469 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 364  778:aload_0         
	//* 365  779:ldc2            #523 <String "close_button.png">
	//* 366  782:invokestatic    #528 <Method Bitmap com.startapp.android.publish.adsCommon.Utils.a.a(Context, String)>
	//* 367  785:astore          10
	//* 368  787:aload           10
	//* 369  789:ifnull          1214
	//* 370  792:new             #530 <Class ImageButton>
	//* 371  795:dup             
	//* 372  796:aload_0         
	//* 373  797:aconst_null     
	//* 374  798:ldc2            #531 <Int 0x103000f>
	//* 375  801:invokespecial   #534 <Method void ImageButton(Context, android.util.AttributeSet, int)>
	//* 376  804:astore_1        
	//* 377  805:aload_1         
	//* 378  806:checkcast       #530 <Class ImageButton>
	//* 379  809:aload           10
	//* 380  811:aload_0         
	//* 381  812:bipush          36
	//* 382  814:invokestatic    #475 <Method int h.a(Context, int)>
	//* 383  817:aload_0         
	//* 384  818:bipush          36
	//* 385  820:invokestatic    #475 <Method int h.a(Context, int)>
	//* 386  823:iconst_1        
	//* 387  824:invokestatic    #540 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//* 388  827:invokevirtual   #541 <Method void ImageButton.setImageBitmap(Bitmap)>
	//* 389  830:aload_1         
	//* 390  831:aload           9
	//* 391  833:invokevirtual   #542 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 392  836:aload_1         
	//* 393  837:new             #14  <Class List3DActivity$3>
	//* 394  840:dup             
	//* 395  841:aload_0         
	//* 396  842:invokespecial   #543 <Method void List3DActivity$3(List3DActivity)>
	//* 397  845:invokevirtual   #547 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//* 398  848:aload_1         
	//* 399  849:ldc2            #549 <String "x">
	//* 400  852:invokevirtual   #550 <Method void View.setContentDescription(CharSequence)>
	//* 401  855:aload_1         
	//* 402  856:ldc2            #551 <Int 0x57f00003>
	//* 403  859:invokevirtual   #552 <Method void View.setId(int)>
	//* 404  862:aload           8
	//* 405  864:aload_1         
	//* 406  865:invokevirtual   #521 <Method void RelativeLayout.addView(View)>
	//* 407  868:new             #138 <Class View>
	//* 408  871:dup             
	//* 409  872:aload_0         
	//* 410  873:invokespecial   #553 <Method void View(Context)>
	//* 411  876:astore_1        
	//* 412  877:aload_1         
	//* 413  878:new             #555 <Class android.widget.LinearLayout$LayoutParams>
	//* 414  881:dup             
	//* 415  882:iconst_m1       
	//* 416  883:aload_0         
	//* 417  884:iconst_2        
	//* 418  885:invokestatic    #475 <Method int h.a(Context, int)>
	//* 419  888:invokespecial   #556 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//* 420  891:invokevirtual   #542 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 421  894:aload_1         
	//* 422  895:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//* 423  898:invokevirtual   #558 <Method Integer com.startapp.android.publish.adsCommon.b.m()>
	//* 424  901:invokevirtual   #457 <Method int Integer.intValue()>
	//* 425  904:invokevirtual   #559 <Method void View.setBackgroundColor(int)>
	//* 426  907:aload           7
	//* 427  909:aload_1         
	//* 428  910:invokevirtual   #463 <Method void LinearLayout.addView(View)>
	//* 429  913:new             #555 <Class android.widget.LinearLayout$LayoutParams>
	//* 430  916:dup             
	//* 431  917:iconst_m1       
	//* 432  918:iconst_0        
	//* 433  919:invokespecial   #556 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//* 434  922:astore_1        
	//* 435  923:aload_1         
	//* 436  924:fconst_1        
	//* 437  925:putfield        #563 <Field float android.widget.LinearLayout$LayoutParams.weight>
	//* 438  928:aload_0         
	//* 439  929:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 440  932:aload_1         
	//* 441  933:invokevirtual   #564 <Method void c.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 442  936:aload           7
	//* 443  938:aload_0         
	//* 444  939:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 445  942:invokevirtual   #463 <Method void LinearLayout.addView(View)>
	//* 446  945:new             #437 <Class LinearLayout>
	//* 447  948:dup             
	//* 448  949:aload_0         
	//* 449  950:invokespecial   #438 <Method void LinearLayout(Context)>
	//* 450  953:astore_1        
	//* 451  954:new             #555 <Class android.widget.LinearLayout$LayoutParams>
	//* 452  957:dup             
	//* 453  958:iconst_m1       
	//* 454  959:bipush          -2
	//* 455  961:invokespecial   #556 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//* 456  964:astore          8
	//* 457  966:aload           8
	//* 458  968:bipush          80
	//* 459  970:putfield        #567 <Field int android.widget.LinearLayout$LayoutParams.gravity>
	//* 460  973:aload_1         
	//* 461  974:aload           8
	//* 462  976:invokevirtual   #568 <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 463  979:aload_1         
	//* 464  980:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//* 465  983:invokevirtual   #571 <Method Integer com.startapp.android.publish.adsCommon.b.v()>
	//* 466  986:invokevirtual   #457 <Method int Integer.intValue()>
	//* 467  989:invokevirtual   #572 <Method void LinearLayout.setBackgroundColor(int)>
	//* 468  992:aload_1         
	//* 469  993:bipush          17
	//* 470  995:invokevirtual   #575 <Method void LinearLayout.setGravity(int)>
	//* 471  998:aload           7
	//* 472 1000:aload_1         
	//* 473 1001:invokevirtual   #463 <Method void LinearLayout.addView(View)>
	//* 474 1004:new             #465 <Class TextView>
	//* 475 1007:dup             
	//* 476 1008:aload_0         
	//* 477 1009:invokespecial   #466 <Method void TextView(Context)>
	//* 478 1012:astore          7
	//* 479 1014:aload           7
	//* 480 1016:invokestatic    #330 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//* 481 1019:invokevirtual   #578 <Method Integer com.startapp.android.publish.adsCommon.b.w()>
	//* 482 1022:invokevirtual   #457 <Method int Integer.intValue()>
	//* 483 1025:invokevirtual   #484 <Method void TextView.setTextColor(int)>
	//* 484 1028:aload           7
	//* 485 1030:iconst_0        
	//* 486 1031:aload_0         
	//* 487 1032:iconst_2        
	//* 488 1033:invokestatic    #475 <Method int h.a(Context, int)>
	//* 489 1036:iconst_0        
	//* 490 1037:aload_0         
	//* 491 1038:iconst_3        
	//* 492 1039:invokestatic    #475 <Method int h.a(Context, int)>
	//* 493 1042:invokevirtual   #479 <Method void TextView.setPadding(int, int, int, int)>
	//* 494 1045:aload           7
	//* 495 1047:ldc2            #580 <String "Powered By ">
	//* 496 1050:invokevirtual   #507 <Method void TextView.setText(CharSequence)>
	//* 497 1053:aload           7
	//* 498 1055:ldc2            #581 <Float 16F>
	//* 499 1058:invokevirtual   #490 <Method void TextView.setTextSize(float)>
	//* 500 1061:aload_1         
	//* 501 1062:aload           7
	//* 502 1064:invokevirtual   #463 <Method void LinearLayout.addView(View)>
	//* 503 1067:new             #183 <Class ImageView>
	//* 504 1070:dup             
	//* 505 1071:aload_0         
	//* 506 1072:invokespecial   #582 <Method void ImageView(Context)>
	//* 507 1075:astore          7
	//* 508 1077:aload           7
	//* 509 1079:aload_0         
	//* 510 1080:ldc2            #584 <String "logo.png">
	//* 511 1083:invokestatic    #528 <Method Bitmap com.startapp.android.publish.adsCommon.Utils.a.a(Context, String)>
	//* 512 1086:aload_0         
	//* 513 1087:bipush          56
	//* 514 1089:invokestatic    #475 <Method int h.a(Context, int)>
	//* 515 1092:aload_0         
	//* 516 1093:bipush          12
	//* 517 1095:invokestatic    #475 <Method int h.a(Context, int)>
	//* 518 1098:iconst_1        
	//* 519 1099:invokestatic    #540 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//* 520 1102:invokevirtual   #187 <Method void ImageView.setImageBitmap(Bitmap)>
	//* 521 1105:aload_1         
	//* 522 1106:aload           7
	//* 523 1108:invokevirtual   #463 <Method void LinearLayout.addView(View)>
	//* 524 1111:aload_0         
	//* 525 1112:invokevirtual   #269 <Method Intent getIntent()>
	//* 526 1115:ldc2            #586 <String "adInfoOverride">
	//* 527 1118:invokevirtual   #296 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//* 528 1121:checkcast       #588 <Class com.startapp.android.publish.adsCommon.adinformation.c>
	//* 529 1124:astore_1        
	//* 530 1125:aload_0         
	//* 531 1126:new             #590 <Class com.startapp.android.publish.adsCommon.adinformation.b>
	//* 532 1129:dup             
	//* 533 1130:aload_0         
	//* 534 1131:getstatic       #595 <Field com.startapp.android.publish.adsCommon.adinformation.b$b com.startapp.android.publish.adsCommon.adinformation.b$b.b>
	//* 535 1134:getstatic       #601 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_OFFER_WALL>
	//* 536 1137:aload_1         
	//* 537 1138:invokespecial   #604 <Method void com.startapp.android.publish.adsCommon.adinformation.b(Context, com.startapp.android.publish.adsCommon.adinformation.b$b, com.startapp.android.publish.common.model.AdPreferences$Placement, com.startapp.android.publish.adsCommon.adinformation.c)>
	//* 538 1141:putfield        #606 <Field com.startapp.android.publish.adsCommon.adinformation.b h>
	//* 539 1144:aload_0         
	//* 540 1145:getfield        #606 <Field com.startapp.android.publish.adsCommon.adinformation.b h>
	//* 541 1148:aload           5
	//* 542 1150:invokevirtual   #609 <Method void com.startapp.android.publish.adsCommon.adinformation.b.a(RelativeLayout)>
	//* 543 1153:aload_0         
	//* 544 1154:aload           5
	//* 545 1156:aload           6
	//* 546 1158:invokevirtual   #612 <Method void setContentView(View, android.view.ViewGroup$LayoutParams)>
	//* 547 1161:new             #614 <Class Handler>
	//* 548 1164:dup             
	//* 549 1165:invokespecial   #615 <Method void Handler()>
	//* 550 1168:new             #16  <Class List3DActivity$4>
	//* 551 1171:dup             
	//* 552 1172:aload_0         
	//* 553 1173:invokespecial   #616 <Method void List3DActivity$4(List3DActivity)>
	//* 554 1176:ldc2w           #617 <Long 500L>
	//* 555 1179:invokevirtual   #622 <Method boolean Handler.postDelayed(Runnable, long)>
	//* 556 1182:pop             
	//* 557 1183:return          
	//* 558 1184:aload_0         
	//* 559 1185:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 560 1188:invokevirtual   #624 <Method void com.startapp.android.publish.ads.list3d.c.a()>
	//* 561 1191:aload_0         
	//* 562 1192:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 563 1195:iconst_1        
	//* 564 1196:invokevirtual   #627 <Method void c.setHint(boolean)>
	//* 565 1199:aload_0         
	//* 566 1200:getfield        #126 <Field com.startapp.android.publish.ads.list3d.c d>
	//* 567 1203:iconst_1        
	//* 568 1204:invokevirtual   #630 <Method void c.setFade(boolean)>
	//* 569 1207:ldc2            #632 <String "back">
	//* 570 1210:astore_1        
	//* 571 1211:goto            411
	//* 572 1214:new             #465 <Class TextView>
	//* 573 1217:dup             
	//* 574 1218:aload_0         
	//* 575 1219:invokespecial   #466 <Method void TextView(Context)>
	//* 576 1222:astore_1        
	//* 577 1223:aload_1         
	//* 578 1224:checkcast       #465 <Class TextView>
	//* 579 1227:ldc2            #634 <String "   x   ">
	//* 580 1230:invokevirtual   #507 <Method void TextView.setText(CharSequence)>
	//* 581 1233:aload_1         
	//* 582 1234:checkcast       #465 <Class TextView>
	//* 583 1237:ldc2            #635 <Float 20F>
	//* 584 1240:invokevirtual   #490 <Method void TextView.setTextSize(float)>
	//* 585 1243:goto            830
			flag = false;
	//  586 1246:iconst_0        
	//  587 1247:istore          4
		((e) (obj)).a(((com.startapp.android.publish.ads.list3d.g) (this)), flag);
		d.setAdapter(((android.widget.Adapter) (bundle)));
		d.setDynamics(((Dynamics) (new SimpleDynamics(0.9F, 0.6F))));
		d.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

			private void a(String s, String s1, String s2, String s3)
			{
				com.startapp.android.publish.adsCommon.c.a(s, s1, s2, ((Context) (a)), new com.startapp.android.publish.adsCommon.d.b(a.b));
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:aload_0         
			//    4    4:getfield        #19  <Field List3DActivity a>
			//    5    7:new             #26  <Class com.startapp.android.publish.adsCommon.d.b>
			//    6   10:dup             
			//    7   11:aload_0         
			//    8   12:getfield        #19  <Field List3DActivity a>
			//    9   15:getfield        #30  <Field String com.startapp.android.publish.ads.list3d.List3DActivity.b>
			//   10   18:invokespecial   #33  <Method void com.startapp.android.publish.adsCommon.d.b(String)>
			//   11   21:invokestatic    #38  <Method void c.a(String, String, String, Context, com.startapp.android.publish.adsCommon.d.b)>
				a.finish();
			//   12   24:aload_0         
			//   13   25:getfield        #19  <Field List3DActivity a>
			//   14   28:invokevirtual   #41  <Method void List3DActivity.finish()>
			//   15   31:return          
			}

			public void onItemClick(AdapterView adapterview, View view, int k1, long l1)
			{
				adapterview = ((AdapterView) (((ListItem)a.c.get(k1)).b()));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field List3DActivity a>
			//    2    4:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
			//    3    7:iload_3         
			//    4    8:invokeinterface #53  <Method Object List.get(int)>
			//    5   13:checkcast       #55  <Class ListItem>
			//    6   16:invokevirtual   #58  <Method String com.startapp.android.publish.ads.list3d.ListItem.b()>
			//    7   19:astore_1        
				view = ((View) (((ListItem)a.c.get(k1)).e()));
			//    8   20:aload_0         
			//    9   21:getfield        #19  <Field List3DActivity a>
			//   10   24:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
			//   11   27:iload_3         
			//   12   28:invokeinterface #53  <Method Object List.get(int)>
			//   13   33:checkcast       #55  <Class ListItem>
			//   14   36:invokevirtual   #61  <Method String ListItem.e()>
			//   15   39:astore_2        
				Object obj3 = ((Object) (((ListItem)a.c.get(k1)).f()));
			//   16   40:aload_0         
			//   17   41:getfield        #19  <Field List3DActivity a>
			//   18   44:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
			//   19   47:iload_3         
			//   20   48:invokeinterface #53  <Method Object List.get(int)>
			//   21   53:checkcast       #55  <Class ListItem>
			//   22   56:invokevirtual   #64  <Method String com.startapp.android.publish.ads.list3d.ListItem.f()>
			//   23   59:astore          9
				boolean flag1 = ((ListItem)a.c.get(k1)).l();
			//   24   61:aload_0         
			//   25   62:getfield        #19  <Field List3DActivity a>
			//   26   65:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
			//   27   68:iload_3         
			//   28   69:invokeinterface #53  <Method Object List.get(int)>
			//   29   74:checkcast       #55  <Class ListItem>
			//   30   77:invokevirtual   #68  <Method boolean ListItem.l()>
			//   31   80:istore          6
				boolean flag3 = ((ListItem)a.c.get(k1)).m();
			//   32   82:aload_0         
			//   33   83:getfield        #19  <Field List3DActivity a>
			//   34   86:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
			//   35   89:iload_3         
			//   36   90:invokeinterface #53  <Method Object List.get(int)>
			//   37   95:checkcast       #55  <Class ListItem>
			//   38   98:invokevirtual   #71  <Method boolean com.startapp.android.publish.ads.list3d.ListItem.m()>
			//   39  101:istore          7
				String s = ((ListItem)a.c.get(k1)).p();
			//   40  103:aload_0         
			//   41  104:getfield        #19  <Field List3DActivity a>
			//   42  107:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
			//   43  110:iload_3         
			//   44  111:invokeinterface #53  <Method Object List.get(int)>
			//   45  116:checkcast       #55  <Class ListItem>
			//   46  119:invokevirtual   #74  <Method String ListItem.p()>
			//   47  122:astore          10
				String s1 = ((ListItem)a.c.get(k1)).o();
			//   48  124:aload_0         
			//   49  125:getfield        #19  <Field List3DActivity a>
			//   50  128:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
			//   51  131:iload_3         
			//   52  132:invokeinterface #53  <Method Object List.get(int)>
			//   53  137:checkcast       #55  <Class ListItem>
			//   54  140:invokevirtual   #77  <Method String ListItem.o()>
			//   55  143:astore          11
				Boolean boolean1 = ((ListItem)a.c.get(k1)).s();
			//   56  145:aload_0         
			//   57  146:getfield        #19  <Field List3DActivity a>
			//   58  149:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
			//   59  152:iload_3         
			//   60  153:invokeinterface #53  <Method Object List.get(int)>
			//   61  158:checkcast       #55  <Class ListItem>
			//   62  161:invokevirtual   #81  <Method Boolean ListItem.s()>
			//   63  164:astore          12
				com.startapp.android.publish.ads.list3d.f.a().a(a.a).a(((ListItem)a.c.get(k1)).c());
			//   64  166:invokestatic    #86  <Method com.startapp.android.publish.ads.list3d.f com.startapp.android.publish.ads.list3d.f.a()>
			//   65  169:aload_0         
			//   66  170:getfield        #19  <Field List3DActivity a>
			//   67  173:getfield        #88  <Field String com.startapp.android.publish.ads.list3d.List3DActivity.a>
			//   68  176:invokevirtual   #91  <Method e com.startapp.android.publish.ads.list3d.f.a(String)>
			//   69  179:aload_0         
			//   70  180:getfield        #19  <Field List3DActivity a>
			//   71  183:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
			//   72  186:iload_3         
			//   73  187:invokeinterface #53  <Method Object List.get(int)>
			//   74  192:checkcast       #55  <Class ListItem>
			//   75  195:invokevirtual   #93  <Method String com.startapp.android.publish.ads.list3d.ListItem.c()>
			//   76  198:invokevirtual   #97  <Method void com.startapp.android.publish.ads.list3d.e.a(String)>
				if(s != null && !TextUtils.isEmpty(((CharSequence) (s))))
			//*  77  201:aload           10
			//*  78  203:ifnull          225
			//*  79  206:aload           10
			//*  80  208:invokestatic    #103 <Method boolean TextUtils.isEmpty(CharSequence)>
			//*  81  211:ifne            225
					a(s, s1, ((String) (adapterview)), ((String) (view)));
			//   82  214:aload_0         
			//   83  215:aload           10
			//   84  217:aload           11
			//   85  219:aload_1         
			//   86  220:aload_2         
			//   87  221:invokespecial   #105 <Method void a(String, String, String, String)>
				else
			//*  88  224:return          
				if(!TextUtils.isEmpty(((CharSequence) (adapterview))))
			//*  89  225:aload_1         
			//*  90  226:invokestatic    #103 <Method boolean TextUtils.isEmpty(CharSequence)>
			//*  91  229:ifne            224
				{
					boolean flag4 = com.startapp.android.publish.adsCommon.c.a(a.getApplicationContext(), com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_OFFER_WALL);
			//   92  232:aload_0         
			//   93  233:getfield        #19  <Field List3DActivity a>
			//   94  236:invokevirtual   #109 <Method Context List3DActivity.getApplicationContext()>
			//   95  239:getstatic       #115 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_OFFER_WALL>
			//   96  242:invokestatic    #118 <Method boolean c.a(Context, com.startapp.android.publish.common.model.AdPreferences$Placement)>
			//   97  245:istore          8
					if(!flag1 || flag4)
			//*  98  247:iload           6
			//*  99  249:ifeq            257
			//* 100  252:iload           8
			//* 101  254:ifeq            311
					{
						obj3 = ((Object) (a));
			//  102  257:aload_0         
			//  103  258:getfield        #19  <Field List3DActivity a>
			//  104  261:astore          9
						com.startapp.android.publish.adsCommon.d.b b1 = a.a();
			//  105  263:aload_0         
			//  106  264:getfield        #19  <Field List3DActivity a>
			//  107  267:invokevirtual   #121 <Method com.startapp.android.publish.adsCommon.d.b com.startapp.android.publish.ads.list3d.List3DActivity.a()>
			//  108  270:astore          10
						boolean flag2;
						if(flag3 && !flag4)
			//* 109  272:iload           7
			//* 110  274:ifeq            305
			//* 111  277:iload           8
			//* 112  279:ifne            305
							flag2 = true;
			//  113  282:iconst_1        
			//  114  283:istore          6
						else
			//* 115  285:aload           9
			//* 116  287:aload_1         
			//* 117  288:aload_2         
			//* 118  289:aload           10
			//* 119  291:iload           6
			//* 120  293:iconst_0        
			//* 121  294:invokestatic    #124 <Method void c.a(Context, String, String, com.startapp.android.publish.adsCommon.d.b, boolean, boolean)>
			//* 122  297:aload_0         
			//* 123  298:getfield        #19  <Field List3DActivity a>
			//* 124  301:invokevirtual   #41  <Method void List3DActivity.finish()>
			//* 125  304:return          
							flag2 = false;
			//  126  305:iconst_0        
			//  127  306:istore          6
						com.startapp.android.publish.adsCommon.c.a(((Context) (obj3)), ((String) (adapterview)), ((String) (view)), b1, flag2, false);
						a.finish();
						return;
					} else
			//* 128  308:goto            285
					{
						com.startapp.android.publish.adsCommon.c.a(((Context) (a)), ((String) (adapterview)), ((String) (view)), ((String) (obj3)), a.a(), com.startapp.android.publish.adsCommon.b.a().A(), flag3, boolean1, false, new Runnable(this) {

							public void run()
							{
								a.a.finish();
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field List3DActivity$2 a>
							//    2    4:getfield        #25  <Field List3DActivity com.startapp.android.publish.ads.list3d.List3DActivity$2.a>
							//    3    7:invokevirtual   #30  <Method void List3DActivity.finish()>
							//    4   10:return          
							}

							final _cls2 a;

			
			{
				a = _pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field List3DActivity$2 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
						}
);
			//  129  311:aload_0         
			//  130  312:getfield        #19  <Field List3DActivity a>
			//  131  315:aload_1         
			//  132  316:aload_2         
			//  133  317:aload           9
			//  134  319:aload_0         
			//  135  320:getfield        #19  <Field List3DActivity a>
			//  136  323:invokevirtual   #121 <Method com.startapp.android.publish.adsCommon.d.b com.startapp.android.publish.ads.list3d.List3DActivity.a()>
			//  137  326:invokestatic    #129 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
			//  138  329:invokevirtual   #133 <Method long com.startapp.android.publish.adsCommon.b.A()>
			//  139  332:iload           7
			//  140  334:aload           12
			//  141  336:iconst_0        
			//  142  337:new             #13  <Class List3DActivity$2$1>
			//  143  340:dup             
			//  144  341:aload_0         
			//  145  342:invokespecial   #136 <Method void List3DActivity$2$1(List3DActivity$2)>
			//  146  345:invokestatic    #139 <Method void c.a(Context, String, String, String, com.startapp.android.publish.adsCommon.d.b, long, boolean, Boolean, boolean, Runnable)>
						return;
			//  147  348:return          
					}
				}
			}

			final List3DActivity a;

			
			{
				a = List3DActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field List3DActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}
);
		obj = ((Object) (new RelativeLayout(((Context) (this)))));
		((RelativeLayout) (obj)).setContentDescription("StartApp Ad");
		((RelativeLayout) (obj)).setId(0x57f00000);
		layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
		bundle = ((Bundle) (new android.widget.RelativeLayout.LayoutParams(-1, -1)));
		obj1 = ((Object) (new LinearLayout(((Context) (this)))));
		((LinearLayout) (obj1)).setOrientation(1);
		((RelativeLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (bundle)));
		obj2 = ((Object) (new RelativeLayout(((Context) (this)))));
		((RelativeLayout) (obj2)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, -2))));
		((RelativeLayout) (obj2)).setBackgroundColor(com.startapp.android.publish.adsCommon.b.a().h().intValue());
		((LinearLayout) (obj1)).addView(((View) (obj2)));
		bundle = ((Bundle) (new TextView(((Context) (this)))));
		layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
		layoutparams1.addRule(13);
		((TextView) (bundle)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
		((TextView) (bundle)).setPadding(0, com.startapp.android.publish.adsCommon.Utils.h.a(((Context) (this)), 2), 0, com.startapp.android.publish.adsCommon.Utils.h.a(((Context) (this)), 5));
		((TextView) (bundle)).setTextColor(com.startapp.android.publish.adsCommon.b.a().k().intValue());
		((TextView) (bundle)).setTextSize(com.startapp.android.publish.adsCommon.b.a().j().intValue());
		((TextView) (bundle)).setSingleLine(true);
		((TextView) (bundle)).setEllipsize(android.text.TextUtils.TruncateAt.END);
		((TextView) (bundle)).setText(((CharSequence) (com.startapp.android.publish.adsCommon.b.a().i())));
		((TextView) (bundle)).setShadowLayer(2.5F, -2F, 2.0F, 0xff505050);
		com.startapp.android.publish.adsCommon.Utils.h.a(((TextView) (bundle)), com.startapp.android.publish.adsCommon.b.a().l());
		((RelativeLayout) (obj2)).addView(((View) (bundle)));
		layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
		layoutparams1.addRule(11);
		layoutparams1.addRule(15);
		bitmap = com.startapp.android.publish.adsCommon.Utils.a.a(((Context) (this)), "close_button.png");
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_1214;
		bundle = ((Bundle) (new ImageButton(((Context) (this)), ((android.util.AttributeSet) (null)), 0x103000f)));
		((ImageButton)bundle).setImageBitmap(Bitmap.createScaledBitmap(bitmap, com.startapp.android.publish.adsCommon.Utils.h.a(((Context) (this)), 36), com.startapp.android.publish.adsCommon.Utils.h.a(((Context) (this)), 36), true));
_L6:
		((View) (bundle)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
		((View) (bundle)).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				com.startapp.android.publish.adsCommon.c.b(((Context) (a)), a.b(), a.a());
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field List3DActivity a>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field List3DActivity a>
			//    4    8:invokevirtual   #27  <Method String com.startapp.android.publish.ads.list3d.List3DActivity.b()>
			//    5   11:aload_0         
			//    6   12:getfield        #17  <Field List3DActivity a>
			//    7   15:invokevirtual   #30  <Method com.startapp.android.publish.adsCommon.d.b com.startapp.android.publish.ads.list3d.List3DActivity.a()>
			//    8   18:invokestatic    #35  <Method void c.b(Context, String, com.startapp.android.publish.adsCommon.d.b)>
				a.finish();
			//    9   21:aload_0         
			//   10   22:getfield        #17  <Field List3DActivity a>
			//   11   25:invokevirtual   #38  <Method void List3DActivity.finish()>
			//   12   28:return          
			}

			final List3DActivity a;

			
			{
				a = List3DActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field List3DActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		((View) (bundle)).setContentDescription("x");
		((View) (bundle)).setId(0x57f00003);
		((RelativeLayout) (obj2)).addView(((View) (bundle)));
		bundle = ((Bundle) (new View(((Context) (this)))));
		((View) (bundle)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, com.startapp.android.publish.adsCommon.Utils.h.a(((Context) (this)), 2)))));
		((View) (bundle)).setBackgroundColor(com.startapp.android.publish.adsCommon.b.a().m().intValue());
		((LinearLayout) (obj1)).addView(((View) (bundle)));
		bundle = ((Bundle) (new android.widget.LinearLayout.LayoutParams(-1, 0)));
		bundle.weight = 1.0F;
		d.setLayoutParams(((android.view.ViewGroup.LayoutParams) (bundle)));
		((LinearLayout) (obj1)).addView(((View) (d)));
		bundle = ((Bundle) (new LinearLayout(((Context) (this)))));
		obj2 = ((Object) (new android.widget.LinearLayout.LayoutParams(-1, -2)));
		obj2.gravity = 80;
		((LinearLayout) (bundle)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
		((LinearLayout) (bundle)).setBackgroundColor(com.startapp.android.publish.adsCommon.b.a().v().intValue());
		((LinearLayout) (bundle)).setGravity(17);
		((LinearLayout) (obj1)).addView(((View) (bundle)));
		obj1 = ((Object) (new TextView(((Context) (this)))));
		((TextView) (obj1)).setTextColor(com.startapp.android.publish.adsCommon.b.a().w().intValue());
		((TextView) (obj1)).setPadding(0, com.startapp.android.publish.adsCommon.Utils.h.a(((Context) (this)), 2), 0, com.startapp.android.publish.adsCommon.Utils.h.a(((Context) (this)), 3));
		((TextView) (obj1)).setText("Powered By ");
		((TextView) (obj1)).setTextSize(16F);
		((LinearLayout) (bundle)).addView(((View) (obj1)));
		obj1 = ((Object) (new ImageView(((Context) (this)))));
		((ImageView) (obj1)).setImageBitmap(Bitmap.createScaledBitmap(com.startapp.android.publish.adsCommon.Utils.a.a(((Context) (this)), "logo.png"), com.startapp.android.publish.adsCommon.Utils.h.a(((Context) (this)), 56), com.startapp.android.publish.adsCommon.Utils.h.a(((Context) (this)), 12), true));
		((LinearLayout) (bundle)).addView(((View) (obj1)));
		bundle = ((Bundle) ((com.startapp.android.publish.adsCommon.adinformation.c)getIntent().getSerializableExtra("adInfoOverride")));
		h = new com.startapp.android.publish.adsCommon.adinformation.b(((Context) (this)), com.startapp.android.publish.adsCommon.adinformation.b.b.b, com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_OFFER_WALL, ((com.startapp.android.publish.adsCommon.adinformation.c) (bundle)));
		h.a(((RelativeLayout) (obj)));
		setContentView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
		(new Handler()).postDelayed(new Runnable() {

			public void run()
			{
				Intent intent = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
			//    0    0:new             #24  <Class Intent>
			//    1    3:dup             
			//    2    4:ldc1            #26  <String "android.intent.action.CLOSE_SYSTEM_DIALOGS">
			//    3    6:invokespecial   #29  <Method void Intent(String)>
			//    4    9:astore_1        
				a.sendBroadcast(intent);
			//    5   10:aload_0         
			//    6   11:getfield        #17  <Field List3DActivity a>
			//    7   14:aload_1         
			//    8   15:invokevirtual   #33  <Method void List3DActivity.sendBroadcast(Intent)>
			//    9   18:return          
			}

			final List3DActivity a;

			
			{
				a = List3DActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field List3DActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, 500L);
		return;
_L4:
		d.a();
		d.setHint(true);
		d.setFade(true);
		bundle = "back";
		  goto _L5
		bundle = ((Bundle) (new TextView(((Context) (this)))));
		((TextView)bundle).setText("   x   ");
		((TextView)bundle).setTextSize(20F);
		  goto _L6
	//* 588 1249:goto            453
	}

	protected void onDestroy()
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field ProgressDialog e>
	//*   2    4:ifnull          35
			synchronized(e)
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field ProgressDialog e>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:monitorenter    
			{
				if(e != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #47  <Field ProgressDialog e>
	//*  10   18:ifnull          33
				{
					e.dismiss();
	//   11   21:aload_0         
	//   12   22:getfield        #47  <Field ProgressDialog e>
	//   13   25:invokevirtual   #641 <Method void ProgressDialog.dismiss()>
					e = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #47  <Field ProgressDialog e>
				}
			}
	//   17   33:aload_1         
	//   18   34:monitorexit     
		if(f != null)
	//*  19   35:aload_0         
	//*  20   36:getfield        #49  <Field WebView f>
	//*  21   39:ifnull          49
			f.stopLoading();
	//   22   42:aload_0         
	//   23   43:getfield        #49  <Field WebView f>
	//   24   46:invokevirtual   #646 <Method void WebView.stopLoading()>
		com.startapp.android.publish.adsCommon.Utils.i.a(((Activity) (this)), false);
	//   25   49:aload_0         
	//   26   50:iconst_0        
	//   27   51:invokestatic    #321 <Method void i.a(Activity, boolean)>
		super.onDestroy();
	//   28   54:aload_0         
	//   29   55:invokespecial   #648 <Method void Activity.onDestroy()>
		return;
	//   30   58:return          
		exception;
	//   31   59:astore_2        
		progressdialog;
	//   32   60:aload_1         
		JVM INSTR monitorexit ;
	//   33   61:monitorexit     
		throw exception;
	//   34   62:aload_2         
	//   35   63:athrow          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #651 <Method void Activity.onPause()>
		com.startapp.android.publish.ads.list3d.f.a().a(a).b();
	//    2    4:invokestatic    #149 <Method com.startapp.android.publish.ads.list3d.f com.startapp.android.publish.ads.list3d.f.a()>
	//    3    7:aload_0         
	//    4    8:getfield        #151 <Field String a>
	//    5   11:invokevirtual   #154 <Method e com.startapp.android.publish.ads.list3d.f.a(String)>
	//    6   14:invokevirtual   #653 <Method void com.startapp.android.publish.ads.list3d.e.b()>
		if(h != null && h.b())
	//*   7   17:aload_0         
	//*   8   18:getfield        #606 <Field com.startapp.android.publish.adsCommon.adinformation.b h>
	//*   9   21:ifnull          41
	//*  10   24:aload_0         
	//*  11   25:getfield        #606 <Field com.startapp.android.publish.adsCommon.adinformation.b h>
	//*  12   28:invokevirtual   #655 <Method boolean com.startapp.android.publish.adsCommon.adinformation.b.b()>
	//*  13   31:ifeq            41
			h.d();
	//   14   34:aload_0         
	//   15   35:getfield        #606 <Field com.startapp.android.publish.adsCommon.adinformation.b h>
	//   16   38:invokevirtual   #656 <Method void com.startapp.android.publish.adsCommon.adinformation.b.d()>
		overridePendingTransition(0, 0);
	//   17   41:aload_0         
	//   18   42:iconst_0        
	//   19   43:iconst_0        
	//   20   44:invokevirtual   #263 <Method void overridePendingTransition(int, int)>
		if(k != null && k.equals("back"))
	//*  21   47:aload_0         
	//*  22   48:getfield        #306 <Field String k>
	//*  23   51:ifnull          71
	//*  24   54:aload_0         
	//*  25   55:getfield        #306 <Field String k>
	//*  26   58:ldc2            #632 <String "back">
	//*  27   61:invokevirtual   #660 <Method boolean String.equals(Object)>
	//*  28   64:ifeq            71
			finish();
	//   29   67:aload_0         
	//   30   68:invokevirtual   #353 <Method void finish()>
	//   31   71:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #663 <Method void Activity.onResume()>
		if(d())
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #665 <Method boolean d()>
	//*   4    8:ifeq            25
		{
			com.startapp.common.a.g.a("List3DActivity", 3, "Cache TTL passed, finishing");
	//    5   11:ldc1            #208 <String "List3DActivity">
	//    6   13:iconst_3        
	//    7   14:ldc2            #667 <String "Cache TTL passed, finishing">
	//    8   17:invokestatic    #215 <Method void g.a(String, int, String)>
			finish();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #353 <Method void finish()>
			return;
	//   11   24:return          
		} else
		{
			com.startapp.android.publish.adsCommon.m.a().a(true);
	//   12   25:invokestatic    #229 <Method m m.a()>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #230 <Method void m.a(boolean)>
			m = System.currentTimeMillis();
	//   15   32:aload_0         
	//   16   33:invokestatic    #102 <Method long System.currentTimeMillis()>
	//   17   36:putfield        #53  <Field long m>
			com.startapp.android.publish.ads.list3d.f.a().a(a).c();
	//   18   39:invokestatic    #149 <Method com.startapp.android.publish.ads.list3d.f com.startapp.android.publish.ads.list3d.f.a()>
	//   19   42:aload_0         
	//   20   43:getfield        #151 <Field String a>
	//   21   46:invokevirtual   #154 <Method e com.startapp.android.publish.ads.list3d.f.a(String)>
	//   22   49:invokevirtual   #668 <Method void com.startapp.android.publish.ads.list3d.e.c()>
			return;
	//   23   52:return          
		}
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #671 <Method void Activity.onSaveInstanceState(Bundle)>
		if(i != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #94  <Field Long i>
	//*   5    9:ifnull          23
			bundle.putSerializable("lastLoadTime", ((java.io.Serializable) (i)));
	//    6   12:aload_1         
	//    7   13:ldc2            #292 <String "lastLoadTime">
	//    8   16:aload_0         
	//    9   17:getfield        #94  <Field Long i>
	//   10   20:invokevirtual   #675 <Method void Bundle.putSerializable(String, java.io.Serializable)>
		if(j != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #96  <Field Long j>
	//*  13   27:ifnull          41
			bundle.putSerializable("adCacheTtl", ((java.io.Serializable) (j)));
	//   14   30:aload_1         
	//   15   31:ldc2            #298 <String "adCacheTtl">
	//   16   34:aload_0         
	//   17   35:getfield        #96  <Field Long j>
	//   18   38:invokevirtual   #675 <Method void Bundle.putSerializable(String, java.io.Serializable)>
	//   19   41:return          
	}

	String a;
	String b;
	List c;
	private com.startapp.android.publish.ads.list3d.c d;
	private ProgressDialog e;
	private WebView f;
	private int g;
	private com.startapp.android.publish.adsCommon.adinformation.b h;
	private Long i;
	private Long j;
	private String k;
	private long l;
	private long m;
	private BroadcastReceiver n;
}
