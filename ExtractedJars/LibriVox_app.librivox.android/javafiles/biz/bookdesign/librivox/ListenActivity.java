// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.view.ac;
import android.support.v4.view.au;
import android.support.v7.app.ActionBar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import biz.bookdesign.librivox.a.g;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.audio.LocalAudioService;
import biz.bookdesign.librivox.b.a;
import biz.bookdesign.librivox.b.j;
import biz.bookdesign.librivox.b.m;
import biz.bookdesign.librivox.b.q;
import biz.bookdesign.librivox.support.ScalingImageView;
import com.google.android.gms.cast.framework.b;
import com.squareup.picasso.al;
import com.squareup.picasso.bb;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package biz.bookdesign.librivox:
//			a, cq, cx, da, 
//			db, dc, dq, dd, 
//			de, dj, cr, dg, 
//			bw, cs, ct, cu, 
//			cw, cv, cy, cz, 
//			df

public class ListenActivity extends biz.bookdesign.librivox.a
{

	public ListenActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void biz.bookdesign.librivox.a()>
		m = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #86  <Field int m>
		v = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #88  <Field int v>
		i = new Handler();
	//    8   14:aload_0         
	//    9   15:new             #90  <Class Handler>
	//   10   18:dup             
	//   11   19:invokespecial   #91  <Method void Handler()>
	//   12   22:putfield        #93  <Field Handler i>
		w = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #95  <Field Dialog w>
		y = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #97  <Field boolean y>
		A = new SimpleDateFormat("m:ss", Locale.getDefault());
	//   19   35:aload_0         
	//   20   36:new             #99  <Class SimpleDateFormat>
	//   21   39:dup             
	//   22   40:ldc1            #101 <String "m:ss">
	//   23   42:invokestatic    #107 <Method Locale Locale.getDefault()>
	//   24   45:invokespecial   #110 <Method void SimpleDateFormat(String, Locale)>
	//   25   48:putfield        #112 <Field SimpleDateFormat A>
		B = new SimpleDateFormat("h:mm:ss", Locale.getDefault());
	//   26   51:aload_0         
	//   27   52:new             #99  <Class SimpleDateFormat>
	//   28   55:dup             
	//   29   56:ldc1            #114 <String "h:mm:ss">
	//   30   58:invokestatic    #107 <Method Locale Locale.getDefault()>
	//   31   61:invokespecial   #110 <Method void SimpleDateFormat(String, Locale)>
	//   32   64:putfield        #116 <Field SimpleDateFormat B>
		A.setTimeZone(TimeZone.getTimeZone("GMT"));
	//   33   67:aload_0         
	//   34   68:getfield        #112 <Field SimpleDateFormat A>
	//   35   71:ldc1            #118 <String "GMT">
	//   36   73:invokestatic    #124 <Method TimeZone TimeZone.getTimeZone(String)>
	//   37   76:invokevirtual   #128 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		B.setTimeZone(TimeZone.getTimeZone("GMT"));
	//   38   79:aload_0         
	//   39   80:getfield        #116 <Field SimpleDateFormat B>
	//   40   83:ldc1            #118 <String "GMT">
	//   41   85:invokestatic    #124 <Method TimeZone TimeZone.getTimeZone(String)>
	//   42   88:invokevirtual   #128 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		C = ((Runnable) (new cq(this)));
	//   43   91:aload_0         
	//   44   92:new             #130 <Class cq>
	//   45   95:dup             
	//   46   96:aload_0         
	//   47   97:invokespecial   #133 <Method void cq(ListenActivity)>
	//   48  100:putfield        #135 <Field Runnable C>
	//   49  103:aload_0         
	//   50  104:new             #137 <Class cx>
	//   51  107:dup             
	//   52  108:aload_0         
	//   53  109:invokespecial   #138 <Method void cx(ListenActivity)>
	//   54  112:putfield        #140 <Field Runnable E>
	//   55  115:return          
	}

	static int a(ListenActivity listenactivity, int i1)
	{
		listenactivity.m = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field int m>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static Dialog a(ListenActivity listenactivity, Dialog dialog)
	{
		listenactivity.w = dialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field Dialog w>
		return dialog;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(int i1, int j1)
	{
		if(b(i1) == j1)
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #148 <Method int b(int)>
	//*   3    5:iload_2         
	//*   4    6:icmpne          10
			return;
	//    5    9:return          
		android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (this))).edit();
	//    6   10:aload_0         
	//    7   11:invokestatic    #154 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    8   14:invokeinterface #160 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   19:astore_3        
		if(i1 > 0)
	//*  10   20:iload_1         
	//*  11   21:ifle            42
		{
			g = j1;
	//   12   24:aload_0         
	//   13   25:iload_2         
	//   14   26:putfield        #162 <Field int g>
			editor.putInt("biz.bookdesign.librivox.ff_button", j1);
	//   15   29:aload_3         
	//   16   30:ldc1            #164 <String "biz.bookdesign.librivox.ff_button">
	//   17   32:iload_2         
	//   18   33:invokeinterface #170 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   19   38:pop             
		} else
	//*  20   39:goto            57
		{
			h = j1;
	//   21   42:aload_0         
	//   22   43:iload_2         
	//   23   44:putfield        #172 <Field int h>
			editor.putInt("biz.bookdesign.librivox.rew_button", j1);
	//   24   47:aload_3         
	//   25   48:ldc1            #174 <String "biz.bookdesign.librivox.rew_button">
	//   26   50:iload_2         
	//   27   51:invokeinterface #170 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   28   56:pop             
		}
		editor.apply();
	//   29   57:aload_3         
	//   30   58:invokeinterface #177 <Method void android.content.SharedPreferences$Editor.apply()>
	//   31   63:return          
	}

	private void a(int i1, int j1, int k1, int l1)
	{
		ImageButton imagebutton = (ImageButton)findViewById(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #182 <Method View findViewById(int)>
	//    3    5:checkcast       #184 <Class ImageButton>
	//    4    8:astore          5
		imagebutton.setOnClickListener(((android.view.View.OnClickListener) (new da(this, imagebutton, k1, j1, l1))));
	//    5   10:aload           5
	//    6   12:new             #186 <Class da>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload           5
	//   10   19:iload_3         
	//   11   20:iload_2         
	//   12   21:iload           4
	//   13   23:invokespecial   #189 <Method void da(ListenActivity, ImageButton, int, int, int)>
	//   14   26:invokevirtual   #193 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		imagebutton.setOnLongClickListener(((android.view.View.OnLongClickListener) (new db(this, k1))));
	//   15   29:aload           5
	//   16   31:new             #195 <Class db>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:iload_3         
	//   20   37:invokespecial   #198 <Method void db(ListenActivity, int)>
	//   21   40:invokevirtual   #202 <Method void ImageButton.setOnLongClickListener(android.view.View$OnLongClickListener)>
		if(b(k1) == l1)
	//*  22   43:aload_0         
	//*  23   44:iload_3         
	//*  24   45:invokespecial   #148 <Method int b(int)>
	//*  25   48:iload           4
	//*  26   50:icmpne          60
		{
			imagebutton.setVisibility(0);
	//   27   53:aload           5
	//   28   55:iconst_0        
	//   29   56:invokevirtual   #206 <Method void ImageButton.setVisibility(int)>
			return;
	//   30   59:return          
		} else
		{
			imagebutton.setVisibility(8);
	//   31   60:aload           5
	//   32   62:bipush          8
	//   33   64:invokevirtual   #206 <Method void ImageButton.setVisibility(int)>
			return;
	//   34   67:return          
		}
	}

	private void a(int i1, boolean flag)
	{
		if(flag && v == i1)
	//*   0    0:iload_2         
	//*   1    1:ifeq            13
	//*   2    4:aload_0         
	//*   3    5:getfield        #88  <Field int v>
	//*   4    8:iload_1         
	//*   5    9:icmpne          13
			return;
	//    6   12:return          
		if(flag)
	//*   7   13:iload_2         
	//*   8   14:ifeq            39
		{
			int j1 = v;
	//    9   17:aload_0         
	//   10   18:getfield        #88  <Field int v>
	//   11   21:istore_3        
			int l1 = -i1;
	//   12   22:iload_1         
	//   13   23:ineg            
	//   14   24:istore          4
			if(j1 == l1)
	//*  15   26:iload_3         
	//*  16   27:iload           4
	//*  17   29:icmpne          39
				a(l1, false);
	//   18   32:aload_0         
	//   19   33:iload           4
	//   20   35:iconst_0        
	//   21   36:invokespecial   #209 <Method void a(int, boolean)>
		}
		int ai[];
		if(i1 == 1)
	//*  22   39:iload_1         
	//*  23   40:iconst_1        
	//*  24   41:icmpne          52
			ai = k;
	//   25   44:getstatic       #76  <Field int[] k>
	//   26   47:astore          6
		else
	//*  27   49:goto            57
			ai = j;
	//   28   52:getstatic       #62  <Field int[] j>
	//   29   55:astore          6
		int i2 = b(i1);
	//   30   57:aload_0         
	//   31   58:iload_1         
	//   32   59:invokespecial   #148 <Method int b(int)>
	//   33   62:istore          4
		for(int k1 = 0; k1 < ai.length; k1++)
	//*  34   64:iconst_0        
	//*  35   65:istore_3        
	//*  36   66:iload_3         
	//*  37   67:aload           6
	//*  38   69:arraylength     
	//*  39   70:icmpge          135
		{
			if(flag)
	//*  40   73:iload_2         
	//*  41   74:ifeq            95
			{
				a(findViewById(ai[k1]), k1, i1);
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:aload           6
	//   45   81:iload_3         
	//   46   82:iaload          
	//   47   83:invokevirtual   #182 <Method View findViewById(int)>
	//   48   86:iload_3         
	//   49   87:i2f             
	//   50   88:iload_1         
	//   51   89:invokespecial   #212 <Method void a(View, float, int)>
				continue;
	//   52   92:goto            128
			}
			View view = findViewById(ai[k1]);
	//   53   95:aload_0         
	//   54   96:aload           6
	//   55   98:iload_3         
	//   56   99:iaload          
	//   57  100:invokevirtual   #182 <Method View findViewById(int)>
	//   58  103:astore          7
			boolean flag1;
			if(i2 == k1)
	//*  59  105:iload           4
	//*  60  107:iload_3         
	//*  61  108:icmpne          117
				flag1 = true;
	//   62  111:iconst_1        
	//   63  112:istore          5
			else
	//*  64  114:goto            120
				flag1 = false;
	//   65  117:iconst_0        
	//   66  118:istore          5
			a(view, flag1);
	//   67  120:aload_0         
	//   68  121:aload           7
	//   69  123:iload           5
	//   70  125:invokespecial   #215 <Method void a(View, boolean)>
		}

	//   71  128:iload_3         
	//   72  129:iconst_1        
	//   73  130:iadd            
	//   74  131:istore_3        
	//*  75  132:goto            66
		if(!flag)
	//*  76  135:iload_2         
	//*  77  136:ifeq            142
	//*  78  139:goto            144
			i1 = 0;
	//   79  142:iconst_0        
	//   80  143:istore_1        
		v = i1;
	//   81  144:aload_0         
	//   82  145:iload_1         
	//   83  146:putfield        #88  <Field int v>
	//   84  149:return          
	}

	private void a(long l1, boolean flag)
	{
		i.removeCallbacks(E);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Handler i>
	//    2    4:aload_0         
	//    3    5:getfield        #140 <Field Runnable E>
	//    4    8:invokevirtual   #220 <Method void Handler.removeCallbacks(Runnable)>
		t = (TextView)findViewById(h.sleepTime);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getstatic       #223 <Field int h.sleepTime>
	//    8   16:invokevirtual   #182 <Method View findViewById(int)>
	//    9   19:checkcast       #225 <Class TextView>
	//   10   22:putfield        #227 <Field TextView t>
		if(t != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #227 <Field TextView t>
	//*  13   29:ifnull          93
		{
			if(l1 > System.currentTimeMillis())
	//*  14   32:lload_1         
	//*  15   33:invokestatic    #233 <Method long System.currentTimeMillis()>
	//*  16   36:lcmp            
	//*  17   37:ifle            63
			{
				D = l1;
	//   18   40:aload_0         
	//   19   41:lload_1         
	//   20   42:putfield        #235 <Field long D>
				t.setVisibility(0);
	//   21   45:aload_0         
	//   22   46:getfield        #227 <Field TextView t>
	//   23   49:iconst_0        
	//   24   50:invokevirtual   #236 <Method void TextView.setVisibility(int)>
				E.run();
	//   25   53:aload_0         
	//   26   54:getfield        #140 <Field Runnable E>
	//   27   57:invokeinterface #241 <Method void Runnable.run()>
				return;
	//   28   62:return          
			}
			if(flag)
	//*  29   63:iload_3         
	//*  30   64:ifeq            85
			{
				t.setText("");
	//   31   67:aload_0         
	//   32   68:getfield        #227 <Field TextView t>
	//   33   71:ldc1            #243 <String "">
	//   34   73:invokevirtual   #247 <Method void TextView.setText(CharSequence)>
				t.setVisibility(0);
	//   35   76:aload_0         
	//   36   77:getfield        #227 <Field TextView t>
	//   37   80:iconst_0        
	//   38   81:invokevirtual   #236 <Method void TextView.setVisibility(int)>
				return;
	//   39   84:return          
			}
			t.setVisibility(4);
	//   40   85:aload_0         
	//   41   86:getfield        #227 <Field TextView t>
	//   42   89:iconst_4        
	//   43   90:invokevirtual   #236 <Method void TextView.setVisibility(int)>
		}
	//   44   93:return          
	}

	private void a(View view, float f1)
	{
		view.setRotation(0.0F);
	//    0    0:aload_1         
	//    1    1:fconst_0        
	//    2    2:invokevirtual   #254 <Method void View.setRotation(float)>
		AccelerateDecelerateInterpolator acceleratedecelerateinterpolator = new AccelerateDecelerateInterpolator();
	//    3    5:new             #256 <Class AccelerateDecelerateInterpolator>
	//    4    8:dup             
	//    5    9:invokespecial   #257 <Method void AccelerateDecelerateInterpolator()>
	//    6   12:astore_3        
		ac.l(view).d(f1).d().a(200L).a(((android.view.animation.Interpolator) (acceleratedecelerateinterpolator))).c();
	//    7   13:aload_1         
	//    8   14:invokestatic    #262 <Method au ac.l(View)>
	//    9   17:fload_2         
	//   10   18:invokevirtual   #268 <Method au au.d(float)>
	//   11   21:invokevirtual   #271 <Method au au.d()>
	//   12   24:ldc2w           #272 <Long 200L>
	//   13   27:invokevirtual   #276 <Method au au.a(long)>
	//   14   30:aload_3         
	//   15   31:invokevirtual   #279 <Method au au.a(android.view.animation.Interpolator)>
	//   16   34:invokevirtual   #282 <Method void au.c()>
	//   17   37:return          
	}

	private void a(View view, float f1, int i1)
	{
		float f2 = f1;
	//    0    0:fload_2         
	//    1    1:fstore          6
		if(getResources().getConfiguration().orientation == 2)
	//*   2    3:aload_0         
	//*   3    4:invokevirtual   #286 <Method Resources getResources()>
	//*   4    7:invokevirtual   #292 <Method Configuration Resources.getConfiguration()>
	//*   5   10:getfield        #297 <Field int Configuration.orientation>
	//*   6   13:iconst_2        
	//*   7   14:icmpne          36
		{
			double d1 = f1;
	//    8   17:fload_2         
	//    9   18:f2d             
	//   10   19:dstore          4
			Double.isNaN(d1);
	//   11   21:dload           4
	//   12   23:invokestatic    #303 <Method boolean Double.isNaN(double)>
	//   13   26:pop             
			f2 = (float)(d1 - 1.5D);
	//   14   27:dload           4
	//   15   29:ldc2w           #304 <Double 1.5D>
	//   16   32:dsub            
	//   17   33:d2f             
	//   18   34:fstore          6
		}
		view.setVisibility(0);
	//   19   36:aload_1         
	//   20   37:iconst_0        
	//   21   38:invokevirtual   #306 <Method void View.setVisibility(int)>
		AccelerateDecelerateInterpolator acceleratedecelerateinterpolator = new AccelerateDecelerateInterpolator();
	//   22   41:new             #256 <Class AccelerateDecelerateInterpolator>
	//   23   44:dup             
	//   24   45:invokespecial   #257 <Method void AccelerateDecelerateInterpolator()>
	//   25   48:astore          7
		ac.l(view).b(25F * f2 * f2 * (float)i1).c(f2 * -150F).d().a(200L).a(((android.view.animation.Interpolator) (acceleratedecelerateinterpolator))).c();
	//   26   50:aload_1         
	//   27   51:invokestatic    #262 <Method au ac.l(View)>
	//   28   54:ldc2            #307 <Float 25F>
	//   29   57:fload           6
	//   30   59:fmul            
	//   31   60:fload           6
	//   32   62:fmul            
	//   33   63:iload_3         
	//   34   64:i2f             
	//   35   65:fmul            
	//   36   66:invokevirtual   #309 <Method au au.b(float)>
	//   37   69:fload           6
	//   38   71:ldc2            #310 <Float -150F>
	//   39   74:fmul            
	//   40   75:invokevirtual   #312 <Method au au.c(float)>
	//   41   78:invokevirtual   #271 <Method au au.d()>
	//   42   81:ldc2w           #272 <Long 200L>
	//   43   84:invokevirtual   #276 <Method au au.a(long)>
	//   44   87:aload           7
	//   45   89:invokevirtual   #279 <Method au au.a(android.view.animation.Interpolator)>
	//   46   92:invokevirtual   #282 <Method void au.c()>
	//   47   95:return          
	}

	private void a(View view, boolean flag)
	{
		dc dc1 = new dc(this, flag, view);
	//    0    0:new             #314 <Class dc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #317 <Method void dc(ListenActivity, boolean, View)>
	//    6   10:astore_3        
		AccelerateDecelerateInterpolator acceleratedecelerateinterpolator = new AccelerateDecelerateInterpolator();
	//    7   11:new             #256 <Class AccelerateDecelerateInterpolator>
	//    8   14:dup             
	//    9   15:invokespecial   #257 <Method void AccelerateDecelerateInterpolator()>
	//   10   18:astore          4
		ac.l(view).b(0.0F).c(0.0F).d().a(200L).a(((android.view.animation.Interpolator) (acceleratedecelerateinterpolator))).a(((Runnable) (dc1))).c();
	//   11   20:aload_1         
	//   12   21:invokestatic    #262 <Method au ac.l(View)>
	//   13   24:fconst_0        
	//   14   25:invokevirtual   #309 <Method au au.b(float)>
	//   15   28:fconst_0        
	//   16   29:invokevirtual   #312 <Method au au.c(float)>
	//   17   32:invokevirtual   #271 <Method au au.d()>
	//   18   35:ldc2w           #272 <Long 200L>
	//   19   38:invokevirtual   #276 <Method au au.a(long)>
	//   20   41:aload           4
	//   21   43:invokevirtual   #279 <Method au au.a(android.view.animation.Interpolator)>
	//   22   46:aload_3         
	//   23   47:invokevirtual   #320 <Method au au.a(Runnable)>
	//   24   50:invokevirtual   #282 <Method void au.c()>
	//   25   53:return          
	}

	static void a(ListenActivity listenactivity)
	{
		listenactivity.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #322 <Method void n()>
	//    2    4:return          
	}

	static void a(ListenActivity listenactivity, int i1, int j1)
	{
		listenactivity.a(i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #325 <Method void a(int, int)>
	//    4    6:return          
	}

	static void a(ListenActivity listenactivity, int i1, boolean flag)
	{
		listenactivity.a(i1, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #209 <Method void a(int, boolean)>
	//    4    6:return          
	}

	static void a(ListenActivity listenactivity, long l1, boolean flag)
	{
		listenactivity.b(l1, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #329 <Method void b(long, boolean)>
	//    4    6:return          
	}

	static void a(ListenActivity listenactivity, View view, float f1)
	{
		listenactivity.a(view, f1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #332 <Method void a(View, float)>
	//    4    6:return          
	}

	private void a(boolean flag)
	{
		ProgressDialog progressdialog = x;
	//    0    0:aload_0         
	//    1    1:getfield        #335 <Field ProgressDialog x>
	//    2    4:astore_2        
		if(progressdialog != null && progressdialog.isShowing())
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #341 <Method boolean ProgressDialog.isShowing()>
	//*   7   13:ifeq            23
			x.dismiss();
	//    8   16:aload_0         
	//    9   17:getfield        #335 <Field ProgressDialog x>
	//   10   20:invokevirtual   #344 <Method void ProgressDialog.dismiss()>
		if(flag)
	//*  11   23:iload_1         
	//*  12   24:ifeq            38
			a(getString(k.load_error));
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getstatic       #349 <Field int k.load_error>
	//   16   32:invokevirtual   #353 <Method String getString(int)>
	//   17   35:invokevirtual   #356 <Method void a(String)>
		x = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #335 <Field ProgressDialog x>
	//   21   43:return          
	}

	static boolean a(ListenActivity listenactivity, boolean flag)
	{
		listenactivity.p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #359 <Field boolean p>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private int b(int i1)
	{
		if(i1 > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            9
			return g;
	//    2    4:aload_0         
	//    3    5:getfield        #162 <Field int g>
	//    4    8:ireturn         
		else
			return h;
	//    5    9:aload_0         
	//    6   10:getfield        #172 <Field int h>
	//    7   13:ireturn         
	}

	static long b(ListenActivity listenactivity)
	{
		return listenactivity.D;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field long D>
	//    2    4:lreturn         
	}

	private void b(long l1, boolean flag)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field LocalAudioService f>
	//*   2    4:ifnull          50
		{
			if(!f.k())
	//*   3    7:aload_0         
	//*   4    8:getfield        #364 <Field LocalAudioService f>
	//*   5   11:invokevirtual   #368 <Method boolean LocalAudioService.k()>
	//*   6   14:ifne            40
				a(new m(b.p(), m, ((android.content.Context) (this))));
	//    7   17:aload_0         
	//    8   18:new             #370 <Class m>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #373 <Field a b>
	//   12   26:invokevirtual   #378 <Method int a.p()>
	//   13   29:aload_0         
	//   14   30:getfield        #86  <Field int m>
	//   15   33:aload_0         
	//   16   34:invokespecial   #381 <Method void m(int, int, android.content.Context)>
	//   17   37:invokevirtual   #384 <Method void a(m)>
			f.a(l1, flag);
	//   18   40:aload_0         
	//   19   41:getfield        #364 <Field LocalAudioService f>
	//   20   44:lload_1         
	//   21   45:iload_3         
	//   22   46:invokevirtual   #386 <Method void LocalAudioService.a(long, boolean)>
			return;
	//   23   49:return          
		} else
		{
			com.crashlytics.android.a.a(6, "LibriVox", "No audio service to contact for sleep");
	//   24   50:bipush          6
	//   25   52:ldc2            #388 <String "LibriVox">
	//   26   55:ldc2            #390 <String "No audio service to contact for sleep">
	//   27   58:invokestatic    #395 <Method void com.crashlytics.android.a.a(int, String, String)>
			return;
	//   28   61:return          
		}
	}

	static void b(ListenActivity listenactivity, long l1, boolean flag)
	{
		listenactivity.a(l1, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #396 <Method void a(long, boolean)>
	//    4    6:return          
	}

	static void b(ListenActivity listenactivity, boolean flag)
	{
		listenactivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #399 <Method void a(boolean)>
	//    3    5:return          
	}

	static SimpleDateFormat c(ListenActivity listenactivity)
	{
		return listenactivity.B;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field SimpleDateFormat B>
	//    2    4:areturn         
	}

	static SimpleDateFormat d(ListenActivity listenactivity)
	{
		return listenactivity.A;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field SimpleDateFormat A>
	//    2    4:areturn         
	}

	static TextView e(ListenActivity listenactivity)
	{
		return listenactivity.t;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field TextView t>
	//    2    4:areturn         
	}

	static int f(ListenActivity listenactivity)
	{
		return listenactivity.m;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int m>
	//    2    4:ireturn         
	}

	static Runnable g(ListenActivity listenactivity)
	{
		return listenactivity.C;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field Runnable C>
	//    2    4:areturn         
	}

	static boolean h(ListenActivity listenactivity)
	{
		return listenactivity.p;
	//    0    0:aload_0         
	//    1    1:getfield        #359 <Field boolean p>
	//    2    4:ireturn         
	}

	private void i()
	{
		SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #154 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    2    4:astore_2        
		g = sharedpreferences.getInt("biz.bookdesign.librivox.ff_button", 1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:ldc1            #164 <String "biz.bookdesign.librivox.ff_button">
	//    6    9:iconst_1        
	//    7   10:invokeinterface #409 <Method int SharedPreferences.getInt(String, int)>
	//    8   15:putfield        #162 <Field int g>
		int i1 = 0;
	//    9   18:iconst_0        
	//   10   19:istore_1        
		h = sharedpreferences.getInt("biz.bookdesign.librivox.rew_button", 0);
	//   11   20:aload_0         
	//   12   21:aload_2         
	//   13   22:ldc1            #174 <String "biz.bookdesign.librivox.rew_button">
	//   14   24:iconst_0        
	//   15   25:invokeinterface #409 <Method int SharedPreferences.getInt(String, int)>
	//   16   30:putfield        #172 <Field int h>
		v = 0;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #88  <Field int v>
		for(; i1 < j.length; i1++)
	//*  20   38:iload_1         
	//*  21   39:getstatic       #62  <Field int[] j>
	//*  22   42:arraylength     
	//*  23   43:icmpge          85
		{
			a(k[i1], l[i1], 1, i1);
	//   24   46:aload_0         
	//   25   47:getstatic       #76  <Field int[] k>
	//   26   50:iload_1         
	//   27   51:iaload          
	//   28   52:getstatic       #80  <Field int[] l>
	//   29   55:iload_1         
	//   30   56:iaload          
	//   31   57:iconst_1        
	//   32   58:iload_1         
	//   33   59:invokespecial   #411 <Method void a(int, int, int, int)>
			a(j[i1], l[i1], -1, i1);
	//   34   62:aload_0         
	//   35   63:getstatic       #62  <Field int[] j>
	//   36   66:iload_1         
	//   37   67:iaload          
	//   38   68:getstatic       #80  <Field int[] l>
	//   39   71:iload_1         
	//   40   72:iaload          
	//   41   73:iconst_m1       
	//   42   74:iload_1         
	//   43   75:invokespecial   #411 <Method void a(int, int, int, int)>
		}

	//   44   78:iload_1         
	//   45   79:iconst_1        
	//   46   80:iadd            
	//   47   81:istore_1        
	//*  48   82:goto            38
	//   49   85:return          
	}

	static void i(ListenActivity listenactivity)
	{
		listenactivity.t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #413 <Method void t()>
	//    2    4:return          
	}

	private void j()
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field LocalAudioService f>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		z.c();
	//    4    8:aload_0         
	//    5    9:getfield        #415 <Field dq z>
	//    6   12:invokevirtual   #418 <Method void dq.c()>
		o();
	//    7   15:aload_0         
	//    8   16:invokespecial   #420 <Method void o()>
		l();
	//    9   19:aload_0         
	//   10   20:invokespecial   #422 <Method void l()>
		k();
	//   11   23:aload_0         
	//   12   24:invokespecial   #424 <Method void k()>
		r();
	//   13   27:aload_0         
	//   14   28:invokespecial   #426 <Method void r()>
		f.t();
	//   15   31:aload_0         
	//   16   32:getfield        #364 <Field LocalAudioService f>
	//   17   35:invokevirtual   #427 <Method void LocalAudioService.t()>
		p();
	//   18   38:aload_0         
	//   19   39:invokespecial   #429 <Method void p()>
		if(y)
	//*  20   42:aload_0         
	//*  21   43:getfield        #97  <Field boolean y>
	//*  22   46:ifeq            50
			return;
	//   23   49:return          
		y = true;
	//   24   50:aload_0         
	//   25   51:iconst_1        
	//   26   52:putfield        #97  <Field boolean y>
		if(getIntent().hasExtra("biz.bookdesign.librivox.PLAY_ON_PREPARED"))
	//*  27   55:aload_0         
	//*  28   56:invokevirtual   #433 <Method Intent getIntent()>
	//*  29   59:ldc2            #435 <String "biz.bookdesign.librivox.PLAY_ON_PREPARED">
	//*  30   62:invokevirtual   #441 <Method boolean Intent.hasExtra(String)>
	//*  31   65:ifeq            76
			a(b);
	//   32   68:aload_0         
	//   33   69:aload_0         
	//   34   70:getfield        #373 <Field a b>
	//   35   73:invokevirtual   #444 <Method void a(a)>
	//   36   76:return          
	}

	static void j(ListenActivity listenactivity)
	{
		listenactivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #429 <Method void p()>
	//    2    4:return          
	}

	static dq k(ListenActivity listenactivity)
	{
		return listenactivity.z;
	//    0    0:aload_0         
	//    1    1:getfield        #415 <Field dq z>
	//    2    4:areturn         
	}

	private void k()
	{
		String s1;
		if(b instanceof q)
	//*   0    0:aload_0         
	//*   1    1:getfield        #373 <Field a b>
	//*   2    4:instanceof      #447 <Class q>
	//*   3    7:ifeq            24
			s1 = ((q)b).K();
	//    4   10:aload_0         
	//    5   11:getfield        #373 <Field a b>
	//    6   14:checkcast       #447 <Class q>
	//    7   17:invokevirtual   #451 <Method String q.K()>
	//    8   20:astore_1        
		else
	//*   9   21:goto            32
			s1 = b.a();
	//   10   24:aload_0         
	//   11   25:getfield        #373 <Field a b>
	//   12   28:invokevirtual   #453 <Method String a.a()>
	//   13   31:astore_1        
		ScalingImageView scalingimageview = (ScalingImageView)findViewById(h.album_cover);
	//   14   32:aload_0         
	//   15   33:getstatic       #456 <Field int h.album_cover>
	//   16   36:invokevirtual   #182 <Method View findViewById(int)>
	//   17   39:checkcast       #458 <Class ScalingImageView>
	//   18   42:astore_2        
		al.b().a(s1).b(g.default_book_image).a(g.default_book_image).d().a(((com.squareup.picasso.bj) (new dd(this, scalingimageview))));
	//   19   43:invokestatic    #463 <Method al al.b()>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #466 <Method bb al.a(String)>
	//   22   50:getstatic       #471 <Field int g.default_book_image>
	//   23   53:invokevirtual   #476 <Method bb bb.b(int)>
	//   24   56:getstatic       #471 <Field int g.default_book_image>
	//   25   59:invokevirtual   #478 <Method bb bb.a(int)>
	//   26   62:invokevirtual   #481 <Method bb bb.d()>
	//   27   65:new             #483 <Class dd>
	//   28   68:dup             
	//   29   69:aload_0         
	//   30   70:aload_2         
	//   31   71:invokespecial   #486 <Method void dd(ListenActivity, ScalingImageView)>
	//   32   74:invokevirtual   #489 <Method void bb.a(com.squareup.picasso.bj)>
		scalingimageview.setOnClickListener(((android.view.View.OnClickListener) (new de(this, scalingimageview))));
	//   33   77:aload_2         
	//   34   78:new             #491 <Class de>
	//   35   81:dup             
	//   36   82:aload_0         
	//   37   83:aload_2         
	//   38   84:invokespecial   #492 <Method void de(ListenActivity, ScalingImageView)>
	//   39   87:invokevirtual   #493 <Method void ScalingImageView.setOnClickListener(android.view.View$OnClickListener)>
	//   40   90:return          
	}

	private void l()
	{
		Button button = (Button)findViewById(h.purchase_button);
	//    0    0:aload_0         
	//    1    1:getstatic       #496 <Field int h.purchase_button>
	//    2    4:invokevirtual   #182 <Method View findViewById(int)>
	//    3    7:checkcast       #498 <Class Button>
	//    4   10:astore_1        
		if(b instanceof q)
	//*   5   11:aload_0         
	//*   6   12:getfield        #373 <Field a b>
	//*   7   15:instanceof      #447 <Class q>
	//*   8   18:ifeq            74
		{
			if(a == null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #501 <Field dj a>
	//*  11   25:ifnonnull       50
				a = new dj(((android.support.v4.app.x) (this)), (q)b);
	//   12   28:aload_0         
	//   13   29:new             #503 <Class dj>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #373 <Field a b>
	//   18   38:checkcast       #447 <Class q>
	//   19   41:invokespecial   #506 <Method void dj(android.support.v4.app.x, q)>
	//   20   44:putfield        #501 <Field dj a>
			else
	//*  21   47:goto            64
				a.a((q)b);
	//   22   50:aload_0         
	//   23   51:getfield        #501 <Field dj a>
	//   24   54:aload_0         
	//   25   55:getfield        #373 <Field a b>
	//   26   58:checkcast       #447 <Class q>
	//   27   61:invokevirtual   #509 <Method void biz.bookdesign.librivox.dj.a(q)>
			a.a(((android.support.v4.app.x) (this)), button);
	//   28   64:aload_0         
	//   29   65:getfield        #501 <Field dj a>
	//   30   68:aload_0         
	//   31   69:aload_1         
	//   32   70:invokevirtual   #512 <Method void biz.bookdesign.librivox.dj.a(android.support.v4.app.x, Button)>
			return;
	//   33   73:return          
		} else
		{
			button.setVisibility(8);
	//   34   74:aload_1         
	//   35   75:bipush          8
	//   36   77:invokevirtual   #513 <Method void Button.setVisibility(int)>
			return;
	//   37   80:return          
		}
	}

	static void l(ListenActivity listenactivity)
	{
		listenactivity.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #515 <Method void q()>
	//    2    4:return          
	}

	static SeekBar m(ListenActivity listenactivity)
	{
		return listenactivity.q;
	//    0    0:aload_0         
	//    1    1:getfield        #518 <Field SeekBar q>
	//    2    4:areturn         
	}

	private void m()
	{
		int i1 = h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #520 <Method int h()>
	//    2    4:istore_1        
		SimpleDateFormat simpledateformat;
		if(i1 > 0x36ee80)
	//*   3    5:iload_1         
	//*   4    6:ldc2            #521 <Int 0x36ee80>
	//*   5    9:icmple          20
			simpledateformat = B;
	//    6   12:aload_0         
	//    7   13:getfield        #116 <Field SimpleDateFormat B>
	//    8   16:astore_3        
		else
	//*   9   17:goto            25
			simpledateformat = A;
	//   10   20:aload_0         
	//   11   21:getfield        #112 <Field SimpleDateFormat A>
	//   12   24:astore_3        
		Date date = new Date(i1);
	//   13   25:new             #523 <Class Date>
	//   14   28:dup             
	//   15   29:iload_1         
	//   16   30:i2l             
	//   17   31:invokespecial   #526 <Method void Date(long)>
	//   18   34:astore          4
		s.setText(((CharSequence) (simpledateformat.format(date))));
	//   19   36:aload_0         
	//   20   37:getfield        #528 <Field TextView s>
	//   21   40:aload_3         
	//   22   41:aload           4
	//   23   43:invokevirtual   #532 <Method String SimpleDateFormat.format(Date)>
	//   24   46:invokevirtual   #247 <Method void TextView.setText(CharSequence)>
		int j1 = g();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #534 <Method int g()>
	//   27   53:istore_2        
		if(j1 > 0x36ee80)
	//*  28   54:iload_2         
	//*  29   55:ldc2            #521 <Int 0x36ee80>
	//*  30   58:icmple          69
			simpledateformat = B;
	//   31   61:aload_0         
	//   32   62:getfield        #116 <Field SimpleDateFormat B>
	//   33   65:astore_3        
		else
	//*  34   66:goto            74
			simpledateformat = A;
	//   35   69:aload_0         
	//   36   70:getfield        #112 <Field SimpleDateFormat A>
	//   37   73:astore_3        
		date = new Date(j1);
	//   38   74:new             #523 <Class Date>
	//   39   77:dup             
	//   40   78:iload_2         
	//   41   79:i2l             
	//   42   80:invokespecial   #526 <Method void Date(long)>
	//   43   83:astore          4
		r.setText(((CharSequence) (simpledateformat.format(date))));
	//   44   85:aload_0         
	//   45   86:getfield        #536 <Field TextView r>
	//   46   89:aload_3         
	//   47   90:aload           4
	//   48   92:invokevirtual   #532 <Method String SimpleDateFormat.format(Date)>
	//   49   95:invokevirtual   #247 <Method void TextView.setText(CharSequence)>
		q.setMax(i1);
	//   50   98:aload_0         
	//   51   99:getfield        #518 <Field SeekBar q>
	//   52  102:iload_1         
	//   53  103:invokevirtual   #541 <Method void SeekBar.setMax(int)>
		q.setProgress(j1);
	//   54  106:aload_0         
	//   55  107:getfield        #518 <Field SeekBar q>
	//   56  110:iload_2         
	//   57  111:invokevirtual   #544 <Method void SeekBar.setProgress(int)>
		q.setSecondaryProgress((a() * i1) / 100);
	//   58  114:aload_0         
	//   59  115:getfield        #518 <Field SeekBar q>
	//   60  118:aload_0         
	//   61  119:invokevirtual   #546 <Method int a()>
	//   62  122:iload_1         
	//   63  123:imul            
	//   64  124:bipush          100
	//   65  126:idiv            
	//   66  127:invokevirtual   #549 <Method void SeekBar.setSecondaryProgress(int)>
		if(e())
	//*  67  130:aload_0         
	//*  68  131:invokevirtual   #551 <Method boolean e()>
	//*  69  134:ifeq            160
		{
			i.removeCallbacks(C);
	//   70  137:aload_0         
	//   71  138:getfield        #93  <Field Handler i>
	//   72  141:aload_0         
	//   73  142:getfield        #135 <Field Runnable C>
	//   74  145:invokevirtual   #220 <Method void Handler.removeCallbacks(Runnable)>
			i.post(C);
	//   75  148:aload_0         
	//   76  149:getfield        #93  <Field Handler i>
	//   77  152:aload_0         
	//   78  153:getfield        #135 <Field Runnable C>
	//   79  156:invokevirtual   #555 <Method boolean Handler.post(Runnable)>
	//   80  159:pop             
		}
	//   81  160:return          
	}

	private void n()
	{
		int i1 = g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #534 <Method int g()>
	//    2    4:istore_1        
		q.setProgress(i1);
	//    3    5:aload_0         
	//    4    6:getfield        #518 <Field SeekBar q>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #544 <Method void SeekBar.setProgress(int)>
		SimpleDateFormat simpledateformat;
		if(i1 > 0x36ee80)
	//*   7   13:iload_1         
	//*   8   14:ldc2            #521 <Int 0x36ee80>
	//*   9   17:icmple          28
			simpledateformat = B;
	//   10   20:aload_0         
	//   11   21:getfield        #116 <Field SimpleDateFormat B>
	//   12   24:astore_2        
		else
	//*  13   25:goto            33
			simpledateformat = A;
	//   14   28:aload_0         
	//   15   29:getfield        #112 <Field SimpleDateFormat A>
	//   16   32:astore_2        
		Date date = new Date(i1);
	//   17   33:new             #523 <Class Date>
	//   18   36:dup             
	//   19   37:iload_1         
	//   20   38:i2l             
	//   21   39:invokespecial   #526 <Method void Date(long)>
	//   22   42:astore_3        
		r.setText(((CharSequence) (simpledateformat.format(date))));
	//   23   43:aload_0         
	//   24   44:getfield        #536 <Field TextView r>
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:invokevirtual   #532 <Method String SimpleDateFormat.format(Date)>
	//   28   52:invokevirtual   #247 <Method void TextView.setText(CharSequence)>
	//   29   55:return          
	}

	static void n(ListenActivity listenactivity)
	{
		listenactivity.u();
	//    0    0:aload_0         
	//    1    1:invokespecial   #557 <Method void u()>
	//    2    4:return          
	}

	private void o()
	{
		Spinner spinner = (Spinner)findViewById(h.chapter_spinner);
	//    0    0:aload_0         
	//    1    1:getstatic       #560 <Field int h.chapter_spinner>
	//    2    4:invokevirtual   #182 <Method View findViewById(int)>
	//    3    7:checkcast       #562 <Class Spinner>
	//    4   10:astore_1        
		if(b.m() == 1)
	//*   5   11:aload_0         
	//*   6   12:getfield        #373 <Field a b>
	//*   7   15:invokevirtual   #564 <Method int a.m()>
	//*   8   18:iconst_1        
	//*   9   19:icmpne          30
			spinner.setVisibility(0);
	//   10   22:aload_1         
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #565 <Method void Spinner.setVisibility(int)>
		else
	//*  13   27:goto            36
			spinner.setVisibility(8);
	//   14   30:aload_1         
	//   15   31:bipush          8
	//   16   33:invokevirtual   #565 <Method void Spinner.setVisibility(int)>
		Object obj = ((Object) (c.a(b.p())));
	//   17   36:aload_0         
	//   18   37:getfield        #568 <Field j c>
	//   19   40:aload_0         
	//   20   41:getfield        #373 <Field a b>
	//   21   44:invokevirtual   #378 <Method int a.p()>
	//   22   47:i2l             
	//   23   48:invokevirtual   #573 <Method Cursor j.a(long)>
	//   24   51:astore_2        
		((Cursor) (obj)).moveToFirst();
	//   25   52:aload_2         
	//   26   53:invokeinterface #578 <Method boolean Cursor.moveToFirst()>
	//   27   58:pop             
		ArrayList arraylist = new ArrayList();
	//   28   59:new             #580 <Class ArrayList>
	//   29   62:dup             
	//   30   63:invokespecial   #581 <Method void ArrayList()>
	//   31   66:astore_3        
		for(; ((Cursor) (obj)).getPosition() < ((Cursor) (obj)).getCount(); ((Cursor) (obj)).moveToNext())
	//*  32   67:aload_2         
	//*  33   68:invokeinterface #584 <Method int Cursor.getPosition()>
	//*  34   73:aload_2         
	//*  35   74:invokeinterface #587 <Method int Cursor.getCount()>
	//*  36   79:icmpge          114
			((List) (arraylist)).add(((Object) (((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("title")))));
	//   37   82:aload_3         
	//   38   83:aload_2         
	//   39   84:aload_2         
	//   40   85:ldc2            #589 <String "title">
	//   41   88:invokeinterface #593 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   42   93:invokeinterface #594 <Method String Cursor.getString(int)>
	//   43   98:invokeinterface #600 <Method boolean List.add(Object)>
	//   44  103:pop             

	//   45  104:aload_2         
	//   46  105:invokeinterface #603 <Method boolean Cursor.moveToNext()>
	//   47  110:pop             
	//*  48  111:goto            67
		((Cursor) (obj)).close();
	//   49  114:aload_2         
	//   50  115:invokeinterface #606 <Method void Cursor.close()>
		if(spinner.getSelectedItemPosition() > ((List) (arraylist)).size())
	//*  51  120:aload_1         
	//*  52  121:invokevirtual   #609 <Method int Spinner.getSelectedItemPosition()>
	//*  53  124:aload_3         
	//*  54  125:invokeinterface #612 <Method int List.size()>
	//*  55  130:icmple          139
			spinner.setSelection(0, false);
	//   56  133:aload_1         
	//   57  134:iconst_0        
	//   58  135:iconst_0        
	//   59  136:invokevirtual   #615 <Method void Spinner.setSelection(int, boolean)>
		obj = ((Object) (new ArrayAdapter(((android.content.Context) (this)), i.spinner_row_base, ((List) (arraylist)))));
	//   60  139:new             #617 <Class ArrayAdapter>
	//   61  142:dup             
	//   62  143:aload_0         
	//   63  144:getstatic       #622 <Field int i.spinner_row_base>
	//   64  147:aload_3         
	//   65  148:invokespecial   #625 <Method void ArrayAdapter(android.content.Context, int, List)>
	//   66  151:astore_2        
		((ArrayAdapter) (obj)).setDropDownViewResource(i.spinner_row);
	//   67  152:aload_2         
	//   68  153:getstatic       #628 <Field int i.spinner_row>
	//   69  156:invokevirtual   #631 <Method void ArrayAdapter.setDropDownViewResource(int)>
		spinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
	//   70  159:aload_1         
	//   71  160:aload_2         
	//   72  161:invokevirtual   #635 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		spinner.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (new cr(this))));
	//   73  164:aload_1         
	//   74  165:new             #637 <Class cr>
	//   75  168:dup             
	//   76  169:aload_0         
	//   77  170:invokespecial   #638 <Method void cr(ListenActivity)>
	//   78  173:invokevirtual   #642 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
	//   79  176:return          
	}

	static void o(ListenActivity listenactivity)
	{
		listenactivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #644 <Method void j()>
	//    2    4:return          
	}

	private void p()
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field LocalAudioService f>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		m m1 = f.f();
	//    4    8:aload_0         
	//    5    9:getfield        #364 <Field LocalAudioService f>
	//    6   12:invokevirtual   #649 <Method m LocalAudioService.f()>
	//    7   15:astore_1        
		if(m1 == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		if(m1.a() != b.p())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #650 <Method int m.a()>
	//*  13   25:aload_0         
	//*  14   26:getfield        #373 <Field a b>
	//*  15   29:invokevirtual   #378 <Method int a.p()>
	//*  16   32:icmpeq          46
		{
			com.crashlytics.android.a.a(5, "LibriVox", "ListenActivity not displaying same book as audio service");
	//   17   35:iconst_5        
	//   18   36:ldc2            #388 <String "LibriVox">
	//   19   39:ldc2            #652 <String "ListenActivity not displaying same book as audio service">
	//   20   42:invokestatic    #395 <Method void com.crashlytics.android.a.a(int, String, String)>
			return;
	//   21   45:return          
		}
		m = m1.b();
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokevirtual   #654 <Method int m.b()>
	//   25   51:putfield        #86  <Field int m>
		m();
	//   26   54:aload_0         
	//   27   55:invokespecial   #656 <Method void m()>
		try
		{
			Spinner spinner = (Spinner)findViewById(h.chapter_spinner);
	//   28   58:aload_0         
	//   29   59:getstatic       #560 <Field int h.chapter_spinner>
	//   30   62:invokevirtual   #182 <Method View findViewById(int)>
	//   31   65:checkcast       #562 <Class Spinner>
	//   32   68:astore_1        
			if(m <= spinner.getCount())
	//*  33   69:aload_0         
	//*  34   70:getfield        #86  <Field int m>
	//*  35   73:aload_1         
	//*  36   74:invokevirtual   #657 <Method int Spinner.getCount()>
	//*  37   77:icmpgt          98
				spinner.setSelection(m - 1);
	//   38   80:aload_1         
	//   39   81:aload_0         
	//   40   82:getfield        #86  <Field int m>
	//   41   85:iconst_1        
	//   42   86:isub            
	//   43   87:invokevirtual   #659 <Method void Spinner.setSelection(int)>
		}
	//*  44   90:goto            98
		catch(Exception exception)
	//*  45   93:astore_1        
		{
			com.crashlytics.android.a.a(((Throwable) (exception)));
	//   46   94:aload_1         
	//   47   95:invokestatic    #662 <Method void com.crashlytics.android.a.a(Throwable)>
		}
		r();
	//   48   98:aload_0         
	//   49   99:invokespecial   #426 <Method void r()>
	//   50  102:return          
	}

	static void p(ListenActivity listenactivity)
	{
		listenactivity.s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #664 <Method void s()>
	//    2    4:return          
	}

	private void q()
	{
		i.removeCallbacks(C);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Handler i>
	//    2    4:aload_0         
	//    3    5:getfield        #135 <Field Runnable C>
	//    4    8:invokevirtual   #220 <Method void Handler.removeCallbacks(Runnable)>
		z.c();
	//    5   11:aload_0         
	//    6   12:getfield        #415 <Field dq z>
	//    7   15:invokevirtual   #418 <Method void dq.c()>
	//    8   18:return          
	}

	private void r()
	{
		if(f.r())
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field LocalAudioService f>
	//*   2    4:invokevirtual   #666 <Method boolean LocalAudioService.r()>
	//*   3    7:ifeq            209
		{
			RelativeLayout relativelayout = (RelativeLayout)findViewById(h.play_layout);
	//    4   10:aload_0         
	//    5   11:getstatic       #669 <Field int h.play_layout>
	//    6   14:invokevirtual   #182 <Method View findViewById(int)>
	//    7   17:checkcast       #671 <Class RelativeLayout>
	//    8   20:astore_1        
			Object obj = ((Object) (u));
	//    9   21:aload_0         
	//   10   22:getfield        #673 <Field dg u>
	//   11   25:astore_2        
			if(obj == null)
	//*  12   26:aload_2         
	//*  13   27:ifnonnull       156
			{
				u = new dg(this, ((android.content.Context) (this)));
	//   14   30:aload_0         
	//   15   31:new             #675 <Class dg>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:invokespecial   #678 <Method void dg(ListenActivity, android.content.Context)>
	//   20   40:putfield        #673 <Field dg u>
				u.getHolder().addCallback(((android.view.SurfaceHolder.Callback) (u)));
	//   21   43:aload_0         
	//   22   44:getfield        #673 <Field dg u>
	//   23   47:invokevirtual   #682 <Method SurfaceHolder dg.getHolder()>
	//   24   50:aload_0         
	//   25   51:getfield        #673 <Field dg u>
	//   26   54:invokeinterface #688 <Method void SurfaceHolder.addCallback(android.view.SurfaceHolder$Callback)>
				if(getResources().getConfiguration().orientation == 2)
	//*  27   59:aload_0         
	//*  28   60:invokevirtual   #286 <Method Resources getResources()>
	//*  29   63:invokevirtual   #292 <Method Configuration Resources.getConfiguration()>
	//*  30   66:getfield        #297 <Field int Configuration.orientation>
	//*  31   69:iconst_2        
	//*  32   70:icmpne          120
				{
					u.setLayoutParams(relativelayout.getLayoutParams());
	//   33   73:aload_0         
	//   34   74:getfield        #673 <Field dg u>
	//   35   77:aload_1         
	//   36   78:invokevirtual   #692 <Method android.view.ViewGroup$LayoutParams RelativeLayout.getLayoutParams()>
	//   37   81:invokevirtual   #696 <Method void dg.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					obj = ((Object) (new MediaController(((android.content.Context) (this)))));
	//   38   84:new             #698 <Class MediaController>
	//   39   87:dup             
	//   40   88:aload_0         
	//   41   89:invokespecial   #701 <Method void MediaController(android.content.Context)>
	//   42   92:astore_2        
					((MediaController) (obj)).setAnchorView(((View) (u)));
	//   43   93:aload_2         
	//   44   94:aload_0         
	//   45   95:getfield        #673 <Field dg u>
	//   46   98:invokevirtual   #705 <Method void MediaController.setAnchorView(View)>
					((MediaController) (obj)).setMediaPlayer(((android.widget.MediaController.MediaPlayerControl) (u)));
	//   47  101:aload_2         
	//   48  102:aload_0         
	//   49  103:getfield        #673 <Field dg u>
	//   50  106:invokevirtual   #709 <Method void MediaController.setMediaPlayer(android.widget.MediaController$MediaPlayerControl)>
					u.a(((MediaController) (obj)));
	//   51  109:aload_0         
	//   52  110:getfield        #673 <Field dg u>
	//   53  113:aload_2         
	//   54  114:invokevirtual   #712 <Method void biz.bookdesign.librivox.dg.a(MediaController)>
				} else
	//*  55  117:goto            139
				{
					obj = ((Object) (findViewById(h.album_cover)));
	//   56  120:aload_0         
	//   57  121:getstatic       #456 <Field int h.album_cover>
	//   58  124:invokevirtual   #182 <Method View findViewById(int)>
	//   59  127:astore_2        
					u.setLayoutParams(((View) (obj)).getLayoutParams());
	//   60  128:aload_0         
	//   61  129:getfield        #673 <Field dg u>
	//   62  132:aload_2         
	//   63  133:invokevirtual   #713 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   64  136:invokevirtual   #696 <Method void dg.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				}
				relativelayout.addView(((View) (u)));
	//   65  139:aload_1         
	//   66  140:aload_0         
	//   67  141:getfield        #673 <Field dg u>
	//   68  144:invokevirtual   #716 <Method void RelativeLayout.addView(View)>
				relativelayout.bringChildToFront(((View) (u)));
	//   69  147:aload_1         
	//   70  148:aload_0         
	//   71  149:getfield        #673 <Field dg u>
	//   72  152:invokevirtual   #719 <Method void RelativeLayout.bringChildToFront(View)>
				return;
	//   73  155:return          
			}
			if(!((dg) (obj)).getHolder().getSurface().isValid())
	//*  74  156:aload_2         
	//*  75  157:invokevirtual   #682 <Method SurfaceHolder dg.getHolder()>
	//*  76  160:invokeinterface #723 <Method Surface SurfaceHolder.getSurface()>
	//*  77  165:invokevirtual   #728 <Method boolean Surface.isValid()>
	//*  78  168:ifne            199
			{
				com.crashlytics.android.a.a(4, "LibriVox", "Recreating Video Pane");
	//   79  171:iconst_4        
	//   80  172:ldc2            #388 <String "LibriVox">
	//   81  175:ldc2            #730 <String "Recreating Video Pane">
	//   82  178:invokestatic    #395 <Method void com.crashlytics.android.a.a(int, String, String)>
				relativelayout.removeView(((View) (u)));
	//   83  181:aload_1         
	//   84  182:aload_0         
	//   85  183:getfield        #673 <Field dg u>
	//   86  186:invokevirtual   #733 <Method void RelativeLayout.removeView(View)>
				u = null;
	//   87  189:aload_0         
	//   88  190:aconst_null     
	//   89  191:putfield        #673 <Field dg u>
				r();
	//   90  194:aload_0         
	//   91  195:invokespecial   #426 <Method void r()>
				return;
	//   92  198:return          
			}
			com.crashlytics.android.a.a(4, "LibriVox", "Reusing Video Pane");
	//   93  199:iconst_4        
	//   94  200:ldc2            #388 <String "LibriVox">
	//   95  203:ldc2            #735 <String "Reusing Video Pane">
	//   96  206:invokestatic    #395 <Method void com.crashlytics.android.a.a(int, String, String)>
		}
	//   97  209:return          
	}

	private void s()
	{
		View view = findViewById(h.ad_companion_view);
	//    0    0:aload_0         
	//    1    1:getstatic       #738 <Field int h.ad_companion_view>
	//    2    4:invokevirtual   #182 <Method View findViewById(int)>
	//    3    7:astore_2        
		boolean flag;
		if(view == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       28
		{
			view = ((bw)getApplication()).j();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #742 <Method android.app.Application getApplication()>
	//    8   16:checkcast       #744 <Class bw>
	//    9   19:invokevirtual   #747 <Method View biz.bookdesign.librivox.bw.j()>
	//   10   22:astore_2        
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_1        
		} else
	//*  13   25:goto            30
		{
			flag = false;
	//   14   28:iconst_0        
	//   15   29:istore_1        
		}
		if(view != null)
	//*  16   30:aload_2         
	//*  17   31:ifnull          149
		{
			View view1 = findViewById(h.album_cover);
	//   18   34:aload_0         
	//   19   35:getstatic       #456 <Field int h.album_cover>
	//   20   38:invokevirtual   #182 <Method View findViewById(int)>
	//   21   41:astore_3        
			if(view1 != null)
	//*  22   42:aload_3         
	//*  23   43:ifnull          52
				view1.setVisibility(8);
	//   24   46:aload_3         
	//   25   47:bipush          8
	//   26   49:invokevirtual   #306 <Method void View.setVisibility(int)>
			if(flag)
	//*  27   52:iload_1         
	//*  28   53:ifeq            144
			{
				view.setId(h.ad_companion_view);
	//   29   56:aload_2         
	//   30   57:getstatic       #738 <Field int h.ad_companion_view>
	//   31   60:invokevirtual   #750 <Method void View.setId(int)>
				((ViewGroup)findViewById(h.play_layout)).addView(view, 0);
	//   32   63:aload_0         
	//   33   64:getstatic       #669 <Field int h.play_layout>
	//   34   67:invokevirtual   #182 <Method View findViewById(int)>
	//   35   70:checkcast       #752 <Class ViewGroup>
	//   36   73:aload_2         
	//   37   74:iconst_0        
	//   38   75:invokevirtual   #755 <Method void ViewGroup.addView(View, int)>
				android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
	//   39   78:aload_2         
	//   40   79:invokevirtual   #713 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   41   82:checkcast       #757 <Class android.widget.RelativeLayout$LayoutParams>
	//   42   85:astore_3        
				layoutparams.addRule(15);
	//   43   86:aload_3         
	//   44   87:bipush          15
	//   45   89:invokevirtual   #760 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
				layoutparams.addRule(14);
	//   46   92:aload_3         
	//   47   93:bipush          14
	//   48   95:invokevirtual   #760 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
				Resources resources = getResources();
	//   49   98:aload_0         
	//   50   99:invokevirtual   #286 <Method Resources getResources()>
	//   51  102:astore          4
				layoutparams.width = (int)TypedValue.applyDimension(1, 300F, resources.getDisplayMetrics());
	//   52  104:aload_3         
	//   53  105:iconst_1        
	//   54  106:ldc2            #761 <Float 300F>
	//   55  109:aload           4
	//   56  111:invokevirtual   #765 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   57  114:invokestatic    #771 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   58  117:f2i             
	//   59  118:putfield        #774 <Field int android.widget.RelativeLayout$LayoutParams.width>
				layoutparams.height = (int)TypedValue.applyDimension(1, 250F, resources.getDisplayMetrics());
	//   60  121:aload_3         
	//   61  122:iconst_1        
	//   62  123:ldc2            #775 <Float 250F>
	//   63  126:aload           4
	//   64  128:invokevirtual   #765 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   65  131:invokestatic    #771 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   66  134:f2i             
	//   67  135:putfield        #778 <Field int android.widget.RelativeLayout$LayoutParams.height>
				view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   68  138:aload_2         
	//   69  139:aload_3         
	//   70  140:invokevirtual   #779 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				return;
	//   71  143:return          
			}
			view.setVisibility(0);
	//   72  144:aload_2         
	//   73  145:iconst_0        
	//   74  146:invokevirtual   #306 <Method void View.setVisibility(int)>
		}
	//   75  149:return          
	}

	private void t()
	{
		View view = findViewById(h.ad_companion_view);
	//    0    0:aload_0         
	//    1    1:getstatic       #738 <Field int h.ad_companion_view>
	//    2    4:invokevirtual   #182 <Method View findViewById(int)>
	//    3    7:astore_1        
		if(view != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          18
			view.setVisibility(8);
	//    6   12:aload_1         
	//    7   13:bipush          8
	//    8   15:invokevirtual   #306 <Method void View.setVisibility(int)>
		view = findViewById(h.album_cover);
	//    9   18:aload_0         
	//   10   19:getstatic       #456 <Field int h.album_cover>
	//   11   22:invokevirtual   #182 <Method View findViewById(int)>
	//   12   25:astore_1        
		if(view != null)
	//*  13   26:aload_1         
	//*  14   27:ifnull          35
			view.setVisibility(0);
	//   15   30:aload_1         
	//   16   31:iconst_0        
	//   17   32:invokevirtual   #306 <Method void View.setVisibility(int)>
	//   18   35:return          
	}

	private void u()
	{
		if(x != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #335 <Field ProgressDialog x>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			x = ProgressDialog.show(((android.content.Context) (this)), ((CharSequence) (getString(k.loading_book))), ((CharSequence) (getString(k.please_wait))), true, true, ((android.content.DialogInterface.OnCancelListener) (new cs(this))));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getstatic       #782 <Field int k.loading_book>
	//    8   14:invokevirtual   #353 <Method String getString(int)>
	//    9   17:aload_0         
	//   10   18:getstatic       #785 <Field int k.please_wait>
	//   11   21:invokevirtual   #353 <Method String getString(int)>
	//   12   24:iconst_1        
	//   13   25:iconst_1        
	//   14   26:new             #787 <Class cs>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokespecial   #788 <Method void cs(ListenActivity)>
	//   18   34:invokestatic    #792 <Method ProgressDialog ProgressDialog.show(android.content.Context, CharSequence, CharSequence, boolean, boolean, android.content.DialogInterface$OnCancelListener)>
	//   19   37:putfield        #335 <Field ProgressDialog x>
			return;
	//   20   40:return          
		}
	}

	private boolean v()
	{
		Object obj = ((Object) (new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (this)))));
	//    0    0:new             #794 <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #795 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:astore_2        
		View view = getLayoutInflater().inflate(i.sleep_dialog, ((ViewGroup) (null)));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #799 <Method LayoutInflater getLayoutInflater()>
	//    7   13:getstatic       #802 <Field int i.sleep_dialog>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #808 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   10   20:astore_3        
		TimePicker timepicker = (TimePicker)view.findViewById(h.time_picker);
	//   11   21:aload_3         
	//   12   22:getstatic       #811 <Field int h.time_picker>
	//   13   25:invokevirtual   #812 <Method View View.findViewById(int)>
	//   14   28:checkcast       #814 <Class TimePicker>
	//   15   31:astore          4
		CheckBox checkbox = (CheckBox)view.findViewById(h.chapter_check_box);
	//   16   33:aload_3         
	//   17   34:getstatic       #817 <Field int h.chapter_check_box>
	//   18   37:invokevirtual   #812 <Method View View.findViewById(int)>
	//   19   40:checkcast       #819 <Class CheckBox>
	//   20   43:astore          5
		Object obj1 = ((Object) (view.findViewById(h.overlay)));
	//   21   45:aload_3         
	//   22   46:getstatic       #822 <Field int h.overlay>
	//   23   49:invokevirtual   #812 <Method View View.findViewById(int)>
	//   24   52:astore          6
		timepicker.setIs24HourView(Boolean.valueOf(true));
	//   25   54:aload           4
	//   26   56:iconst_1        
	//   27   57:invokestatic    #828 <Method Boolean Boolean.valueOf(boolean)>
	//   28   60:invokevirtual   #832 <Method void TimePicker.setIs24HourView(Boolean)>
		((View) (obj1)).setOnTouchListener(((android.view.View.OnTouchListener) (new ct(this, checkbox))));
	//   29   63:aload           6
	//   30   65:new             #834 <Class ct>
	//   31   68:dup             
	//   32   69:aload_0         
	//   33   70:aload           5
	//   34   72:invokespecial   #837 <Method void ct(ListenActivity, CheckBox)>
	//   35   75:invokevirtual   #841 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		checkbox.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (new cu(this, ((View) (obj1))))));
	//   36   78:aload           5
	//   37   80:new             #843 <Class cu>
	//   38   83:dup             
	//   39   84:aload_0         
	//   40   85:aload           6
	//   41   87:invokespecial   #846 <Method void cu(ListenActivity, View)>
	//   42   90:invokevirtual   #850 <Method void CheckBox.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		obj1 = ((Object) (PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (this)))));
	//   43   93:aload_0         
	//   44   94:invokestatic    #154 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//   45   97:astore          6
		int i1 = ((SharedPreferences) (obj1)).getInt("sleeptime", 0);
	//   46   99:aload           6
	//   47  101:ldc2            #852 <String "sleeptime">
	//   48  104:iconst_0        
	//   49  105:invokeinterface #409 <Method int SharedPreferences.getInt(String, int)>
	//   50  110:istore_1        
		timepicker.setCurrentHour(Integer.valueOf(i1 / 60));
	//   51  111:aload           4
	//   52  113:iload_1         
	//   53  114:bipush          60
	//   54  116:idiv            
	//   55  117:invokestatic    #857 <Method Integer Integer.valueOf(int)>
	//   56  120:invokevirtual   #861 <Method void TimePicker.setCurrentHour(Integer)>
		timepicker.setCurrentMinute(Integer.valueOf(i1 % 60));
	//   57  123:aload           4
	//   58  125:iload_1         
	//   59  126:bipush          60
	//   60  128:irem            
	//   61  129:invokestatic    #857 <Method Integer Integer.valueOf(int)>
	//   62  132:invokevirtual   #864 <Method void TimePicker.setCurrentMinute(Integer)>
		if(((SharedPreferences) (obj1)).getBoolean("sleepchapter", false))
	//*  63  135:aload           6
	//*  64  137:ldc2            #866 <String "sleepchapter">
	//*  65  140:iconst_0        
	//*  66  141:invokeinterface #870 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  67  146:ifeq            155
			checkbox.setChecked(true);
	//   68  149:aload           5
	//   69  151:iconst_1        
	//   70  152:invokevirtual   #873 <Method void CheckBox.setChecked(boolean)>
		((android.support.v7.app.AlertDialog.Builder) (obj)).setView(view).setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (new cw(this, checkbox, timepicker)))).setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (new cv(this))));
	//   71  155:aload_2         
	//   72  156:aload_3         
	//   73  157:invokevirtual   #877 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setView(View)>
	//   74  160:ldc2            #878 <Int 0x104000a>
	//   75  163:new             #880 <Class cw>
	//   76  166:dup             
	//   77  167:aload_0         
	//   78  168:aload           5
	//   79  170:aload           4
	//   80  172:invokespecial   #883 <Method void cw(ListenActivity, CheckBox, TimePicker)>
	//   81  175:invokevirtual   #887 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   82  178:ldc2            #888 <Int 0x1040000>
	//   83  181:new             #890 <Class cv>
	//   84  184:dup             
	//   85  185:aload_0         
	//   86  186:invokespecial   #891 <Method void cv(ListenActivity)>
	//   87  189:invokevirtual   #894 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   88  192:pop             
		w = ((Dialog) (((android.support.v7.app.AlertDialog.Builder) (obj)).create()));
	//   89  193:aload_0         
	//   90  194:aload_2         
	//   91  195:invokevirtual   #898 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   92  198:putfield        #95  <Field Dialog w>
		w.show();
	//   93  201:aload_0         
	//   94  202:getfield        #95  <Field Dialog w>
	//   95  205:invokevirtual   #902 <Method void Dialog.show()>
		obj = ((Object) (getResources()));
	//   96  208:aload_0         
	//   97  209:invokevirtual   #286 <Method Resources getResources()>
	//   98  212:astore_2        
		if(((Resources) (obj)).getConfiguration().orientation == 2)
	//*  99  213:aload_2         
	//* 100  214:invokevirtual   #292 <Method Configuration Resources.getConfiguration()>
	//* 101  217:getfield        #297 <Field int Configuration.orientation>
	//* 102  220:iconst_2        
	//* 103  221:icmpne          274
		{
			android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
	//  104  224:new             #904 <Class android.view.WindowManager$LayoutParams>
	//  105  227:dup             
	//  106  228:invokespecial   #905 <Method void android.view.WindowManager$LayoutParams()>
	//  107  231:astore_3        
			layoutparams.copyFrom(w.getWindow().getAttributes());
	//  108  232:aload_3         
	//  109  233:aload_0         
	//  110  234:getfield        #95  <Field Dialog w>
	//  111  237:invokevirtual   #909 <Method Window Dialog.getWindow()>
	//  112  240:invokevirtual   #915 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//  113  243:invokevirtual   #919 <Method int android.view.WindowManager$LayoutParams.copyFrom(android.view.WindowManager$LayoutParams)>
	//  114  246:pop             
			layoutparams.width = (int)TypedValue.applyDimension(1, 500F, ((Resources) (obj)).getDisplayMetrics());
	//  115  247:aload_3         
	//  116  248:iconst_1        
	//  117  249:ldc2            #920 <Float 500F>
	//  118  252:aload_2         
	//  119  253:invokevirtual   #765 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//  120  256:invokestatic    #771 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//  121  259:f2i             
	//  122  260:putfield        #921 <Field int android.view.WindowManager$LayoutParams.width>
			w.getWindow().setAttributes(layoutparams);
	//  123  263:aload_0         
	//  124  264:getfield        #95  <Field Dialog w>
	//  125  267:invokevirtual   #909 <Method Window Dialog.getWindow()>
	//  126  270:aload_3         
	//  127  271:invokevirtual   #925 <Method void Window.setAttributes(android.view.WindowManager$LayoutParams)>
		}
		return true;
	//  128  274:iconst_1        
	//  129  275:ireturn         
	}

	public int a()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field LocalAudioService f>
	//*   2    4:ifnull          15
			return f.u();
	//    3    7:aload_0         
	//    4    8:getfield        #364 <Field LocalAudioService f>
	//    5   11:invokevirtual   #927 <Method int LocalAudioService.u()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void a(int i1)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field LocalAudioService f>
	//*   2    4:ifnull          15
			f.d(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #364 <Field LocalAudioService f>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #929 <Method void LocalAudioService.d(int)>
	//    7   15:return          
	}

	public int g()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field LocalAudioService f>
	//*   2    4:ifnull          15
			return f.i();
	//    3    7:aload_0         
	//    4    8:getfield        #364 <Field LocalAudioService f>
	//    5   11:invokevirtual   #931 <Method int LocalAudioService.i()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int h()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #364 <Field LocalAudioService f>
	//*   2    4:ifnull          21
		{
			int i1 = f.j();
	//    3    7:aload_0         
	//    4    8:getfield        #364 <Field LocalAudioService f>
	//    5   11:invokevirtual   #933 <Method int LocalAudioService.j()>
	//    6   14:istore_1        
			if(i1 > 0)
	//*   7   15:iload_1         
	//*   8   16:ifle            21
				return i1;
	//    9   19:iload_1         
	//   10   20:ireturn         
		}
		if(b == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #373 <Field a b>
	//*  13   25:ifnonnull       30
			return 0;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		if(m == 0)
	//*  16   30:aload_0         
	//*  17   31:getfield        #86  <Field int m>
	//*  18   34:ifne            39
			return 0;
	//   19   37:iconst_0        
	//   20   38:ireturn         
		else
			return (int)b.b(m).q();
	//   21   39:aload_0         
	//   22   40:getfield        #373 <Field a b>
	//   23   43:aload_0         
	//   24   44:getfield        #86  <Field int m>
	//   25   47:invokevirtual   #936 <Method m a.b(int)>
	//   26   50:invokevirtual   #938 <Method long m.q()>
	//   27   53:l2i             
	//   28   54:ireturn         
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		if((0xffff & i1) == 32771 && j1 > 0)
	//*   0    0:ldc2            #941 <Int 65535>
	//*   1    3:iload_1         
	//*   2    4:iand            
	//*   3    5:ldc2            #942 <Int 32771>
	//*   4    8:icmpne          49
	//*   5   11:iload_2         
	//*   6   12:ifle            49
		{
			biz.bookdesign.librivox.b.i k1 = b.a(j1);
	//    7   15:aload_0         
	//    8   16:getfield        #373 <Field a b>
	//    9   19:iload_2         
	//   10   20:i2l             
	//   11   21:invokevirtual   #945 <Method biz.bookdesign.librivox.b.i a.a(long)>
	//   12   24:astore          4
			if(f != null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #364 <Field LocalAudioService f>
	//*  15   30:ifnull          49
				a(k1.d(), (int)k1.e());
	//   16   33:aload_0         
	//   17   34:aload           4
	//   18   36:invokevirtual   #949 <Method m biz.bookdesign.librivox.b.i.d()>
	//   19   39:aload           4
	//   20   41:invokevirtual   #951 <Method long biz.bookdesign.librivox.b.i.e()>
	//   21   44:l2i             
	//   22   45:i2l             
	//   23   46:invokevirtual   #954 <Method void a(m, long)>
		}
		super.onActivityResult(i1, j1, intent);
	//   24   49:aload_0         
	//   25   50:iload_1         
	//   26   51:iload_2         
	//   27   52:aload_3         
	//   28   53:invokespecial   #956 <Method void a.onActivityResult(int, int, Intent)>
	//   29   56:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #960 <Method void a.onCreate(Bundle)>
		setContentView(i.listen);
	//    3    5:aload_0         
	//    4    6:getstatic       #963 <Field int i.listen>
	//    5    9:invokevirtual   #966 <Method void setContentView(int)>
		n = android.support.v4.a.g.a(((android.content.Context) (this)));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokestatic    #971 <Method android.support.v4.a.g android.support.v4.a.g.a(android.content.Context)>
	//    9   17:putfield        #973 <Field android.support.v4.a.g n>
		B.setTimeZone(TimeZone.getTimeZone("GMT"));
	//   10   20:aload_0         
	//   11   21:getfield        #116 <Field SimpleDateFormat B>
	//   12   24:ldc1            #118 <String "GMT">
	//   13   26:invokestatic    #124 <Method TimeZone TimeZone.getTimeZone(String)>
	//   14   29:invokevirtual   #128 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		p = false;
	//   15   32:aload_0         
	//   16   33:iconst_0        
	//   17   34:putfield        #359 <Field boolean p>
		a(getIntent(), bundle);
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:invokevirtual   #433 <Method Intent getIntent()>
	//   21   42:aload_1         
	//   22   43:invokevirtual   #976 <Method void a(Intent, Bundle)>
		Object obj = ((Object) (getSupportActionBar()));
	//   23   46:aload_0         
	//   24   47:invokevirtual   #980 <Method ActionBar getSupportActionBar()>
	//   25   50:astore_2        
		if(obj != null)
	//*  26   51:aload_2         
	//*  27   52:ifnull          242
		{
			((ActionBar) (obj)).setHomeAsUpIndicator(g.ic_close_white_24dp);
	//   28   55:aload_2         
	//   29   56:getstatic       #983 <Field int g.ic_close_white_24dp>
	//   30   59:invokevirtual   #988 <Method void ActionBar.setHomeAsUpIndicator(int)>
			z = new dq(((bi) (this)), (ImageButton)findViewById(h.playButton), b);
	//   31   62:aload_0         
	//   32   63:new             #417 <Class dq>
	//   33   66:dup             
	//   34   67:aload_0         
	//   35   68:aload_0         
	//   36   69:getstatic       #991 <Field int h.playButton>
	//   37   72:invokevirtual   #182 <Method View findViewById(int)>
	//   38   75:checkcast       #184 <Class ImageButton>
	//   39   78:aload_0         
	//   40   79:getfield        #373 <Field a b>
	//   41   82:invokespecial   #994 <Method void dq(bi, ImageButton, a)>
	//   42   85:putfield        #415 <Field dq z>
			q = (SeekBar)findViewById(h.seekBar);
	//   43   88:aload_0         
	//   44   89:aload_0         
	//   45   90:getstatic       #997 <Field int h.seekBar>
	//   46   93:invokevirtual   #182 <Method View findViewById(int)>
	//   47   96:checkcast       #538 <Class SeekBar>
	//   48   99:putfield        #518 <Field SeekBar q>
			r = (TextView)findViewById(h.currentPosition);
	//   49  102:aload_0         
	//   50  103:aload_0         
	//   51  104:getstatic       #1000 <Field int h.currentPosition>
	//   52  107:invokevirtual   #182 <Method View findViewById(int)>
	//   53  110:checkcast       #225 <Class TextView>
	//   54  113:putfield        #536 <Field TextView r>
			s = (TextView)findViewById(h.duration);
	//   55  116:aload_0         
	//   56  117:aload_0         
	//   57  118:getstatic       #1003 <Field int h.duration>
	//   58  121:invokevirtual   #182 <Method View findViewById(int)>
	//   59  124:checkcast       #225 <Class TextView>
	//   60  127:putfield        #528 <Field TextView s>
			i();
	//   61  130:aload_0         
	//   62  131:invokespecial   #1005 <Method void i()>
			((ImageButton)findViewById(h.bookmarkButton)).setOnClickListener(((android.view.View.OnClickListener) (new cy(this))));
	//   63  134:aload_0         
	//   64  135:getstatic       #1008 <Field int h.bookmarkButton>
	//   65  138:invokevirtual   #182 <Method View findViewById(int)>
	//   66  141:checkcast       #184 <Class ImageButton>
	//   67  144:new             #1010 <Class cy>
	//   68  147:dup             
	//   69  148:aload_0         
	//   70  149:invokespecial   #1011 <Method void cy(ListenActivity)>
	//   71  152:invokevirtual   #193 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
			q.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (new cz(this))));
	//   72  155:aload_0         
	//   73  156:getfield        #518 <Field SeekBar q>
	//   74  159:new             #1013 <Class cz>
	//   75  162:dup             
	//   76  163:aload_0         
	//   77  164:invokespecial   #1014 <Method void cz(ListenActivity)>
	//   78  167:invokevirtual   #1018 <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
			if(bundle != null && bundle.containsKey("sleepdialog"))
	//*  79  170:aload_1         
	//*  80  171:ifnull          189
	//*  81  174:aload_1         
	//*  82  175:ldc2            #1020 <String "sleepdialog">
	//*  83  178:invokevirtual   #1025 <Method boolean Bundle.containsKey(String)>
	//*  84  181:ifeq            189
				v();
	//   85  184:aload_0         
	//   86  185:invokespecial   #1027 <Method boolean v()>
	//   87  188:pop             
			obj = ((Object) ((bw)biz.bookdesign.catalogbase.a.g()));
	//   88  189:invokestatic    #1032 <Method biz.bookdesign.catalogbase.a biz.bookdesign.catalogbase.a.g()>
	//   89  192:checkcast       #744 <Class bw>
	//   90  195:astore_2        
			if(b.l() && ((bw) (obj)).e() != null)
	//*  91  196:aload_0         
	//*  92  197:getfield        #373 <Field a b>
	//*  93  200:invokevirtual   #1034 <Method boolean a.l()>
	//*  94  203:ifeq            241
	//*  95  206:aload_2         
	//*  96  207:invokevirtual   #1036 <Method String bw.e()>
	//*  97  210:ifnull          241
			{
				bundle = ((Bundle) ((ViewGroup)findViewById(h.listen)));
	//   98  213:aload_0         
	//   99  214:getstatic       #1037 <Field int h.listen>
	//  100  217:invokevirtual   #182 <Method View findViewById(int)>
	//  101  220:checkcast       #752 <Class ViewGroup>
	//  102  223:astore_1        
				obj = ((Object) (((bw) (obj)).a(((android.support.v4.app.x) (this)), ((ViewGroup) (bundle)))));
	//  103  224:aload_2         
	//  104  225:aload_0         
	//  105  226:aload_1         
	//  106  227:invokevirtual   #1040 <Method View biz.bookdesign.librivox.bw.a(android.support.v4.app.x, ViewGroup)>
	//  107  230:astore_2        
				if(obj != null)
	//* 108  231:aload_2         
	//* 109  232:ifnull          241
					((ViewGroup) (bundle)).addView(((View) (obj)), 0);
	//  110  235:aload_1         
	//  111  236:aload_2         
	//  112  237:iconst_0        
	//  113  238:invokevirtual   #755 <Method void ViewGroup.addView(View, int)>
			}
			return;
	//  114  241:return          
		} else
		{
			throw new IllegalStateException("Activity should have action bar.");
	//  115  242:new             #1042 <Class IllegalStateException>
	//  116  245:dup             
	//  117  246:ldc2            #1044 <String "Activity should have action bar.">
	//  118  249:invokespecial   #1046 <Method void IllegalStateException(String)>
	//  119  252:athrow          
		}
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(biz.bookdesign.librivox.a.j.listen_menu, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1054 <Method MenuInflater getMenuInflater()>
	//    2    4:getstatic       #1059 <Field int biz.bookdesign.librivox.a.j.listen_menu>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #1064 <Method void MenuInflater.inflate(int, Menu)>
		try
		{
			com.google.android.gms.cast.framework.b.a(getApplicationContext(), menu, h.media_route_menu_item);
	//    5   11:aload_0         
	//    6   12:invokevirtual   #1068 <Method android.content.Context getApplicationContext()>
	//    7   15:aload_1         
	//    8   16:getstatic       #1071 <Field int h.media_route_menu_item>
	//    9   19:invokestatic    #1076 <Method MenuItem b.a(android.content.Context, Menu, int)>
	//   10   22:pop             
		}
	//*  11   23:goto            41
		catch(RuntimeException runtimeexception)
	//*  12   26:astore_2        
		{
			com.crashlytics.android.a.a(5, "LibriVox", "Unable to initialize Google cast support");
	//   13   27:iconst_5        
	//   14   28:ldc2            #388 <String "LibriVox">
	//   15   31:ldc2            #1078 <String "Unable to initialize Google cast support">
	//   16   34:invokestatic    #395 <Method void com.crashlytics.android.a.a(int, String, String)>
			com.crashlytics.android.a.a(((Throwable) (runtimeexception)));
	//   17   37:aload_2         
	//   18   38:invokestatic    #662 <Method void com.crashlytics.android.a.a(Throwable)>
		}
		return super.onCreateOptionsMenu(menu);
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokespecial   #1080 <Method boolean a.onCreateOptionsMenu(Menu)>
	//   22   46:ireturn         
	}

	protected void onNewIntent(Intent intent)
	{
		y = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #97  <Field boolean y>
		a(intent, ((Bundle) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #976 <Method void a(Intent, Bundle)>
		j();
	//    7   11:aload_0         
	//    8   12:invokespecial   #644 <Method void j()>
		super.onNewIntent(intent);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #1084 <Method void a.onNewIntent(Intent)>
	//   12   20:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		int i1 = menuitem.getItemId();
	//    0    0:aload_1         
	//    1    1:invokeinterface #1091 <Method int MenuItem.getItemId()>
	//    2    6:istore_2        
		if(i1 == 0x102002c)
	//*   3    7:iload_2         
	//*   4    8:ldc2            #1092 <Int 0x102002c>
	//*   5   11:icmpne          20
		{
			finish();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #1095 <Method void finish()>
			return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
		}
		if(i1 == h.menu_sleep)
	//*  10   20:iload_2         
	//*  11   21:getstatic       #1098 <Field int h.menu_sleep>
	//*  12   24:icmpne          32
			return v();
	//   13   27:aload_0         
	//   14   28:invokespecial   #1027 <Method boolean v()>
	//   15   31:ireturn         
		else
			return super.onOptionsItemSelected(menuitem);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokespecial   #1100 <Method boolean a.onOptionsItemSelected(MenuItem)>
	//   19   37:ireturn         
	}

	public void onPause()
	{
		i.removeCallbacks(C);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Handler i>
	//    2    4:aload_0         
	//    3    5:getfield        #135 <Field Runnable C>
	//    4    8:invokevirtual   #220 <Method void Handler.removeCallbacks(Runnable)>
		dg dg1 = u;
	//    5   11:aload_0         
	//    6   12:getfield        #673 <Field dg u>
	//    7   15:astore_1        
		if(dg1 != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          25
			dg1.surfaceDestroyed(((SurfaceHolder) (null)));
	//   10   20:aload_1         
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #1105 <Method void dg.surfaceDestroyed(SurfaceHolder)>
		n.a(((android.content.BroadcastReceiver) (o)));
	//   13   25:aload_0         
	//   14   26:getfield        #973 <Field android.support.v4.a.g n>
	//   15   29:aload_0         
	//   16   30:getfield        #1107 <Field df o>
	//   17   33:invokevirtual   #1110 <Method void android.support.v4.a.g.a(android.content.BroadcastReceiver)>
		t();
	//   18   36:aload_0         
	//   19   37:invokespecial   #413 <Method void t()>
		a(false);
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:invokespecial   #399 <Method void a(boolean)>
		super.onPause();
	//   23   45:aload_0         
	//   24   46:invokespecial   #1112 <Method void a.onPause()>
	//   25   49:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1115 <Method void a.onResume()>
		IntentFilter intentfilter = new IntentFilter();
	//    2    4:new             #1117 <Class IntentFilter>
	//    3    7:dup             
	//    4    8:invokespecial   #1118 <Method void IntentFilter()>
	//    5   11:astore_1        
		intentfilter.addAction("biz.bookdesign.librivox.CHAPTER_NOTIFICATION");
	//    6   12:aload_1         
	//    7   13:ldc2            #1120 <String "biz.bookdesign.librivox.CHAPTER_NOTIFICATION">
	//    8   16:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.COMPLETED");
	//    9   19:aload_1         
	//   10   20:ldc2            #1125 <String "biz.bookdesign.librivox.COMPLETED">
	//   11   23:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.ERROR");
	//   12   26:aload_1         
	//   13   27:ldc2            #1127 <String "biz.bookdesign.librivox.ERROR">
	//   14   30:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.BUFFER_STATUS_NOTIFICATION");
	//   15   33:aload_1         
	//   16   34:ldc2            #1129 <String "biz.bookdesign.librivox.BUFFER_STATUS_NOTIFICATION">
	//   17   37:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.BUFFERING_START");
	//   18   40:aload_1         
	//   19   41:ldc2            #1131 <String "biz.bookdesign.librivox.BUFFERING_START">
	//   20   44:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.BUFFERING_STOP");
	//   21   47:aload_1         
	//   22   48:ldc2            #1133 <String "biz.bookdesign.librivox.BUFFERING_STOP">
	//   23   51:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.PAUSE_NOTIFICATION");
	//   24   54:aload_1         
	//   25   55:ldc2            #1135 <String "biz.bookdesign.librivox.PAUSE_NOTIFICATION">
	//   26   58:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.SERVICE_CONNECTED_NOTIFICATION");
	//   27   61:aload_1         
	//   28   62:ldc2            #1137 <String "biz.bookdesign.librivox.SERVICE_CONNECTED_NOTIFICATION">
	//   29   65:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.SLEEP_NOTIFICATION");
	//   30   68:aload_1         
	//   31   69:ldc2            #1139 <String "biz.bookdesign.librivox.SLEEP_NOTIFICATION">
	//   32   72:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.show_companion_ad");
	//   33   75:aload_1         
	//   34   76:ldc2            #1141 <String "biz.bookdesign.librivox.show_companion_ad">
	//   35   79:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.hide_companion_ad");
	//   36   82:aload_1         
	//   37   83:ldc2            #1143 <String "biz.bookdesign.librivox.hide_companion_ad">
	//   38   86:invokevirtual   #1123 <Method void IntentFilter.addAction(String)>
		o = new df(this, ((cq) (null)));
	//   39   89:aload_0         
	//   40   90:new             #1145 <Class df>
	//   41   93:dup             
	//   42   94:aload_0         
	//   43   95:aconst_null     
	//   44   96:invokespecial   #1148 <Method void df(ListenActivity, cq)>
	//   45   99:putfield        #1107 <Field df o>
		n.a(((android.content.BroadcastReceiver) (o)), intentfilter);
	//   46  102:aload_0         
	//   47  103:getfield        #973 <Field android.support.v4.a.g n>
	//   48  106:aload_0         
	//   49  107:getfield        #1107 <Field df o>
	//   50  110:aload_1         
	//   51  111:invokevirtual   #1151 <Method void android.support.v4.a.g.a(android.content.BroadcastReceiver, IntentFilter)>
		j();
	//   52  114:aload_0         
	//   53  115:invokespecial   #644 <Method void j()>
	//   54  118:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		if(w != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field Dialog w>
	//*   2    4:ifnull          15
			bundle.putBoolean("sleepdialog", true);
	//    3    7:aload_1         
	//    4    8:ldc2            #1020 <String "sleepdialog">
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #1156 <Method void Bundle.putBoolean(String, boolean)>
		super.onSaveInstanceState(bundle);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1158 <Method void a.onSaveInstanceState(Bundle)>
	//   10   20:return          
	}

	private static final int j[];
	private static final int k[];
	private static final int l[] = {
		10000, 30000, 60000, 0x493e0
	};
	private SimpleDateFormat A;
	private SimpleDateFormat B;
	private Runnable C;
	private long D;
	private final Runnable E = new cx(this);
	int g;
	int h;
	Handler i;
	private int m;
	private android.support.v4.a.g n;
	private df o;
	private boolean p;
	private SeekBar q;
	private TextView r;
	private TextView s;
	private TextView t;
	private dg u;
	private int v;
	private Dialog w;
	private ProgressDialog x;
	private boolean y;
	private dq z;

	static 
	{
		j = (new int[] {
			h.rewButton10, h.rewButton30, h.rewButton60, h.rewButton5m
		});
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:getstatic       #51  <Field int h.rewButton10>
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:getstatic       #54  <Field int h.rewButton30>
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:getstatic       #57  <Field int h.rewButton60>
	//   13   20:iastore         
	//   14   21:dup             
	//   15   22:iconst_3        
	//   16   23:getstatic       #60  <Field int h.rewButton5m>
	//   17   26:iastore         
	//   18   27:putstatic       #62  <Field int[] j>
		k = (new int[] {
			h.ffButton10, h.ffButton30, h.ffButton60, h.ffButton5m
		});
	//   19   30:iconst_4        
	//   20   31:newarray        int[]
	//   21   33:dup             
	//   22   34:iconst_0        
	//   23   35:getstatic       #65  <Field int h.ffButton10>
	//   24   38:iastore         
	//   25   39:dup             
	//   26   40:iconst_1        
	//   27   41:getstatic       #68  <Field int h.ffButton30>
	//   28   44:iastore         
	//   29   45:dup             
	//   30   46:iconst_2        
	//   31   47:getstatic       #71  <Field int h.ffButton60>
	//   32   50:iastore         
	//   33   51:dup             
	//   34   52:iconst_3        
	//   35   53:getstatic       #74  <Field int h.ffButton5m>
	//   36   56:iastore         
	//   37   57:putstatic       #76  <Field int[] k>
	//   38   60:iconst_4        
	//   39   61:newarray        int[]
	//   40   63:dup             
	//   41   64:iconst_0        
	//   42   65:sipush          10000
	//   43   68:iastore         
	//   44   69:dup             
	//   45   70:iconst_1        
	//   46   71:sipush          30000
	//   47   74:iastore         
	//   48   75:dup             
	//   49   76:iconst_2        
	//   50   77:ldc1            #77  <Int 60000>
	//   51   79:iastore         
	//   52   80:dup             
	//   53   81:iconst_3        
	//   54   82:ldc1            #78  <Int 0x493e0>
	//   55   84:iastore         
	//   56   85:putstatic       #80  <Field int[] l>
	//*  57   88:return          
	}
}
