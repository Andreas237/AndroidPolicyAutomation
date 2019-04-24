// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.*;
import com.amap.api.mapcore.util.*;
import com.amap.api.offlineservice.AMapPermissionActivity;
import com.amap.api.offlineservice.a;

public class OfflineMapActivity extends AMapPermissionActivity
	implements android.view.View.OnClickListener
{

	public OfflineMapActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AMapPermissionActivity()>
		d = new gb[32];
	//    2    4:aload_0         
	//    3    5:bipush          32
	//    4    7:anewarray       gb[]
	//    5   10:putfield        #29  <Field gb[] d>
		e = -1;
	//    6   13:aload_0         
	//    7   14:iconst_m1       
	//    8   15:putfield        #31  <Field int e>
	//    9   18:return          
	}

	private void a(gb gb1)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field a b>
	//*   2    4:ifnull          19
			{
				b.d();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field a b>
	//    5   11:invokevirtual   #40  <Method void a.d()>
				b = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #36  <Field a b>
			}
			b = c(gb1);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #43  <Method a c(gb)>
	//   13   25:putfield        #36  <Field a b>
			if(b != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #36  <Field a b>
	//*  16   32:ifnull          69
			{
				c = gb1;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #45  <Field gb c>
				b.a(this);
	//   20   40:aload_0         
	//   21   41:getfield        #36  <Field a b>
	//   22   44:aload_0         
	//   23   45:invokevirtual   #48  <Method void a.a(OfflineMapActivity)>
				b.a(c.b);
	//   24   48:aload_0         
	//   25   49:getfield        #36  <Field a b>
	//   26   52:aload_0         
	//   27   53:getfield        #45  <Field gb c>
	//   28   56:getfield        #51  <Field Bundle gb.b>
	//   29   59:invokevirtual   #54  <Method void a.a(Bundle)>
				b.a();
	//   30   62:aload_0         
	//   31   63:getfield        #36  <Field a b>
	//   32   66:invokevirtual   #56  <Method void a.a()>
			}
			return;
	//   33   69:return          
		}
		// Misplaced declaration of an exception variable
		catch(gb gb1)
	//*  34   70:astore_1        
		{
			((Throwable) (gb1)).printStackTrace();
	//   35   71:aload_1         
	//   36   72:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   37   75:return          
	}

	private boolean a(Bundle bundle)
	{
		a a1;
		if(a != 1)
			break MISSING_BLOCK_LABEL_18;
	//    0    0:getstatic       #21  <Field int a>
	//    1    3:iconst_1        
	//    2    4:icmpne          18
		a1 = b;
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field a b>
	//    5   11:astore_2        
		if(a1 != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(a <= 1)
			break MISSING_BLOCK_LABEL_79;
	//   10   18:getstatic       #21  <Field int a>
	//   11   21:iconst_1        
	//   12   22:icmple          71
		a--;
	//   13   25:getstatic       #21  <Field int a>
	//   14   28:iconst_1        
	//   15   29:isub            
	//   16   30:putstatic       #21  <Field int a>
		e = ((e - 1) + 32) % 32;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #31  <Field int e>
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:bipush          32
	//   23   42:iadd            
	//   24   43:bipush          32
	//   25   45:irem            
	//   26   46:putfield        #31  <Field int e>
		gb gb1 = d[e];
	//   27   49:aload_0         
	//   28   50:getfield        #29  <Field gb[] d>
	//   29   53:aload_0         
	//   30   54:getfield        #31  <Field int e>
	//   31   57:aaload          
	//   32   58:astore_2        
		gb1.b = bundle;
	//   33   59:aload_2         
	//   34   60:aload_1         
	//   35   61:putfield        #51  <Field Bundle gb.b>
		a(gb1);
	//   36   64:aload_0         
	//   37   65:aload_2         
	//   38   66:invokespecial   #62  <Method void a(gb)>
		return true;
	//   39   69:iconst_1        
	//   40   70:ireturn         
	//*  41   71:goto            79
		bundle;
	//   42   74:astore_1        
		((Throwable) (bundle)).printStackTrace();
	//   43   75:aload_1         
	//   44   76:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		return false;
	//   45   79:iconst_0        
	//   46   80:ireturn         
	}

	private void b(gb gb1)
	{
		try
		{
			a++;
	//    0    0:getstatic       #21  <Field int a>
	//    1    3:iconst_1        
	//    2    4:iadd            
	//    3    5:putstatic       #21  <Field int a>
			a(gb1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #62  <Method void a(gb)>
			e = (e + 1) % 32;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #31  <Field int e>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:bipush          32
	//   13   22:irem            
	//   14   23:putfield        #31  <Field int e>
			d[e] = gb1;
	//   15   26:aload_0         
	//   16   27:getfield        #29  <Field gb[] d>
	//   17   30:aload_0         
	//   18   31:getfield        #31  <Field int e>
	//   19   34:aload_1         
	//   20   35:aastore         
			return;
	//   21   36:return          
		}
		// Misplaced declaration of an exception variable
		catch(gb gb1)
	//*  22   37:astore_1        
		{
			((Throwable) (gb1)).printStackTrace();
	//   23   38:aload_1         
	//   24   39:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   25   42:return          
	}

	private a c(gb gb1)
	{
		gb1.a;
	//    0    0:aload_1         
	//    1    1:getfield        #63  <Field int gb.a>
		JVM INSTR lookupswitch 1: default 59
	//	               1: 24;
	//    2    4:lookupswitch    1: default 59
	//	               1: 24
		   goto _L1 _L2
_L2:
		if(f == null)
	//*   3   24:aload_0         
	//*   4   25:getfield        #65  <Field gc f>
	//*   5   28:ifnonnull       42
			f = new gc();
	//    6   31:aload_0         
	//    7   32:new             #67  <Class gc>
	//    8   35:dup             
	//    9   36:invokespecial   #68  <Method void gc()>
	//   10   39:putfield        #65  <Field gc f>
		gb1 = ((gb) (f));
	//   11   42:aload_0         
	//   12   43:getfield        #65  <Field gc f>
	//   13   46:astore_1        
		return ((a) (gb1));
	//   14   47:aload_1         
	//   15   48:areturn         
	//*  16   49:goto            57
		gb1;
	//   17   52:astore_1        
		((Throwable) (gb1)).printStackTrace();
	//   18   53:aload_1         
	//   19   54:invokevirtual   #59  <Method void Throwable.printStackTrace()>
_L1:
		return null;
	//   20   57:aconst_null     
	//   21   58:areturn         
	//*  22   59:goto            49
	}

	public void closeScr()
	{
		try
		{
			if(!a(((Bundle) (null))))
	//*   0    0:aload_0         
	//*   1    1:aconst_null     
	//*   2    2:invokespecial   #71  <Method boolean a(Bundle)>
	//*   3    5:ifne            26
			{
				if(b != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #36  <Field a b>
	//*   6   12:ifnull          22
					b.d();
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field a b>
	//    9   19:invokevirtual   #40  <Method void a.d()>
				finish();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #74  <Method void finish()>
			}
			return;
	//   12   26:return          
		}
		catch(Throwable throwable)
	//*  13   27:astore_1        
		{
			throwable.printStackTrace();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   16   32:return          
	}

	public void closeScr(Bundle bundle)
	{
		try
		{
			if(!a(bundle))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #71  <Method boolean a(Bundle)>
	//*   3    5:ifne            26
			{
				if(b != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #36  <Field a b>
	//*   6   12:ifnull          22
					b.d();
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field a b>
	//    9   19:invokevirtual   #40  <Method void a.d()>
				finish();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #74  <Method void finish()>
			}
			return;
	//   12   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  13   27:astore_1        
		{
			((Throwable) (bundle)).printStackTrace();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   16   32:return          
	}

	public void onClick(View view)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field a b>
	//*   2    4:ifnull          15
				b.a(view);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field a b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #78  <Method void a.a(View)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   8   16:astore_1        
		{
			((Throwable) (view)).printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		try
		{
			super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void AMapPermissionActivity.onConfigurationChanged(Configuration)>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Configuration configuration)
	//*   4    6:astore_1        
		{
			((Throwable) (configuration)).printStackTrace();
	//    5    7:aload_1         
	//    6    8:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//    7   11:return          
	}

	protected void onCreate(Bundle bundle)
	{
		try
		{
			super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void AMapPermissionActivity.onCreate(Bundle)>
			getWindow().setSoftInputMode(32);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #89  <Method Window getWindow()>
	//    5    9:bipush          32
	//    6   11:invokevirtual   #95  <Method void Window.setSoftInputMode(int)>
			getWindow().setFormat(-3);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #89  <Method Window getWindow()>
	//    9   18:bipush          -3
	//   10   20:invokevirtual   #98  <Method void Window.setFormat(int)>
			requestWindowFeature(1);
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #102 <Method boolean requestWindowFeature(int)>
	//   14   28:pop             
			ge.a(getApplicationContext());
	//   15   29:aload_0         
	//   16   30:invokevirtual   #106 <Method android.content.Context getApplicationContext()>
	//   17   33:invokestatic    #111 <Method boolean ge.a(android.content.Context)>
	//   18   36:pop             
			e = -1;
	//   19   37:aload_0         
	//   20   38:iconst_m1       
	//   21   39:putfield        #31  <Field int e>
			a = 0;
	//   22   42:iconst_0        
	//   23   43:putstatic       #21  <Field int a>
			b(new gb(1, ((Bundle) (null))));
	//   24   46:aload_0         
	//   25   47:new             #27  <Class gb>
	//   26   50:dup             
	//   27   51:iconst_1        
	//   28   52:aconst_null     
	//   29   53:invokespecial   #114 <Method void gb(int, Bundle)>
	//   30   56:invokespecial   #116 <Method void b(gb)>
			return;
	//   31   59:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  32   60:astore_1        
		{
			((Throwable) (bundle)).printStackTrace();
	//   33   61:aload_1         
	//   34   62:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   35   65:return          
	}

	protected void onDestroy()
	{
		try
		{
			super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void AMapPermissionActivity.onDestroy()>
			if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field a b>
	//*   4    8:ifnull          23
			{
				b.d();
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field a b>
	//    7   15:invokevirtual   #40  <Method void a.d()>
				b = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #36  <Field a b>
			}
			c = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #45  <Field gb c>
			d = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #29  <Field gb[] d>
			if(f != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #65  <Field gc f>
	//*  19   37:ifnull          52
			{
				f.d();
	//   20   40:aload_0         
	//   21   41:getfield        #65  <Field gc f>
	//   22   44:invokevirtual   #120 <Method void gc.d()>
				f = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #65  <Field gc f>
			}
			return;
	//   26   52:return          
		}
		catch(Throwable throwable)
	//*  27   53:astore_1        
		{
			throwable.printStackTrace();
	//   28   54:aload_1         
	//   29   55:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   30   58:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i != 4)
			break MISSING_BLOCK_LABEL_74;
	//    0    0:iload_1         
	//    1    1:iconst_4        
	//    2    2:icmpne          64
		boolean flag;
		if(b == null)
			break MISSING_BLOCK_LABEL_26;
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field a b>
	//    5    9:ifnull          26
		flag = b.b();
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field a b>
	//    8   16:invokevirtual   #125 <Method boolean a.b()>
	//    9   19:istore_3        
		if(!flag)
	//*  10   20:iload_3         
	//*  11   21:ifne            26
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		flag = a(((Bundle) (null)));
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:invokespecial   #71  <Method boolean a(Bundle)>
	//   17   31:istore_3        
		if(flag)
	//*  18   32:iload_3         
	//*  19   33:ifeq            38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		if(keyevent != null)
			break MISSING_BLOCK_LABEL_55;
	//   22   38:aload_2         
	//   23   39:ifnonnull       55
		if(a == 1)
	//*  24   42:getstatic       #21  <Field int a>
	//*  25   45:iconst_1        
	//*  26   46:icmpne          53
			finish();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #74  <Method void finish()>
		return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
		try
		{
			e = -1;
	//   31   55:aload_0         
	//   32   56:iconst_m1       
	//   33   57:putfield        #31  <Field int e>
			a = 0;
	//   34   60:iconst_0        
	//   35   61:putstatic       #21  <Field int a>
		}
	//*  36   64:goto            74
		catch(Throwable throwable)
	//*  37   67:astore          4
		{
			throwable.printStackTrace();
	//   38   69:aload           4
	//   39   71:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
		return super.onKeyDown(i, keyevent);
	//   40   74:aload_0         
	//   41   75:iload_1         
	//   42   76:aload_2         
	//   43   77:invokespecial   #127 <Method boolean AMapPermissionActivity.onKeyDown(int, KeyEvent)>
	//   44   80:ireturn         
	}

	protected void onPause()
	{
		try
		{
			super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void AMapPermissionActivity.onPause()>
			if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field a b>
	//*   4    8:ifnull          18
				b.h();
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field a b>
	//    7   15:invokevirtual   #133 <Method void a.h()>
			return;
	//    8   18:return          
		}
		catch(Throwable throwable)
	//*   9   19:astore_1        
		{
			throwable.printStackTrace();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   12   24:return          
	}

	public void onResume()
	{
		try
		{
			super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #136 <Method void AMapPermissionActivity.onResume()>
			if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field a b>
	//*   4    8:ifnull          18
				b.f();
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field a b>
	//    7   15:invokevirtual   #138 <Method void a.f()>
			return;
	//    8   18:return          
		}
		catch(Throwable throwable)
	//*   9   19:astore_1        
		{
			throwable.printStackTrace();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   12   24:return          
	}

	protected void onStart()
	{
		try
		{
			super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method void AMapPermissionActivity.onStart()>
			if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field a b>
	//*   4    8:ifnull          18
				b.e();
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field a b>
	//    7   15:invokevirtual   #143 <Method void a.e()>
			return;
	//    8   18:return          
		}
		catch(Throwable throwable)
	//*   9   19:astore_1        
		{
			throwable.printStackTrace();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   12   24:return          
	}

	protected void onStop()
	{
		try
		{
			super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #146 <Method void AMapPermissionActivity.onStop()>
			if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field a b>
	//*   4    8:ifnull          18
				b.g();
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field a b>
	//    7   15:invokevirtual   #149 <Method void a.g()>
			return;
	//    8   18:return          
		}
		catch(Throwable throwable)
	//*   9   19:astore_1        
		{
			throwable.printStackTrace();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//   12   24:return          
	}

	public void showScr()
	{
		try
		{
			setContentView(((View) (b.c())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field a b>
	//    3    5:invokevirtual   #153 <Method android.widget.RelativeLayout a.c()>
	//    4    8:invokevirtual   #156 <Method void setContentView(View)>
			return;
	//    5   11:return          
		}
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
	//    9   17:return          
	}

	private static int a = 0;
	private a b;
	private gb c;
	private gb d[];
	private int e;
	private gc f;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #21  <Field int a>
	//*   2    4:return          
	}
}
