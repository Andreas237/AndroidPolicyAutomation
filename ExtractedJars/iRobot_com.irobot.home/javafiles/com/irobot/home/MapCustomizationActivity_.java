// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.PercentageRingView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity, IRobotApplication_

public final class MapCustomizationActivity_ extends MapCustomizationActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s1)
		{
			return (a)super.a("assetId", s1);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "assetId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class MapCustomizationActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("isLaunchedFromPush", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "isLaunchedFromPush">
		//    2    3:iload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class MapCustomizationActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #37  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #43  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #45  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #45  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #37  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #48  <Field Bundle a>
		//   20   42:invokevirtual   #53  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #57  <Field Context b>
		//*  24   52:instanceof      #59  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #57  <Field Context b>
		//   28   62:checkcast       #59  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #37  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #48  <Field Bundle a>
		//   34   74:invokestatic    #64  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #57  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #37  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #48  <Field Bundle a>
		//   42   92:invokevirtual   #70  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #72  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #57  <Field Context b>
		//   47  103:invokespecial   #74  <Method void e(Context)>
		//   48  106:areturn         
		}

		public a b(int i)
		{
			return (a)super.a("placeholderMapNumber", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #77  <String "placeholderMapNumber">
		//    2    3:iload_1         
		//    3    4:invokespecial   #80  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class MapCustomizationActivity_$a>
		//    5   10:areturn         
		}

		public a c(int i)
		{
			return (a)super.a("mapLearningPercent", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #82  <String "mapLearningPercent">
		//    2    3:iload_1         
		//    3    4:invokespecial   #80  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class MapCustomizationActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/MapCustomizationActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class MapCustomizationActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public MapCustomizationActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void MapCustomizationActivity()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void c()>
	//    6   12:putfield        #50  <Field c H>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #38  <Class MapCustomizationActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #55  <Method void MapCustomizationActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #59  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #65  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #68  <Field IRobotApplication a>
		x();
	//    5   11:aload_0         
	//    6   12:invokespecial   #71  <Method void x()>
	//    7   15:return          
	}

	static void a(MapCustomizationActivity_ mapcustomizationactivity_)
	{
		((MapCustomizationActivity) (mapcustomizationactivity_)).MapCustomizationActivity.s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void MapCustomizationActivity.s()>
	//    2    4:return          
	}

	static void a(MapCustomizationActivity_ mapcustomizationactivity_, int i)
	{
		((MapCustomizationActivity) (mapcustomizationactivity_)).MapCustomizationActivity.f(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #80  <Method void MapCustomizationActivity.f(int)>
	//    3    5:return          
	}

	static void a(MapCustomizationActivity_ mapcustomizationactivity_, CharSequence charsequence, int i)
	{
		((MapCustomizationActivity) (mapcustomizationactivity_)).com.irobot.home.MapCustomizationActivity.a(charsequence, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #84  <Method void com.irobot.home.MapCustomizationActivity.a(CharSequence, int)>
	//    4    6:return          
	}

	private void x()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method Intent getIntent()>
	//    2    4:invokevirtual   #94  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          88
		{
			if(bundle.containsKey("assetId"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #96  <String "assetId">
	//*   8   15:invokevirtual   #102 <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				b = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #96  <String "assetId">
	//   13   25:invokevirtual   #106 <Method String Bundle.getString(String)>
	//   14   28:putfield        #110 <Field String b>
			if(bundle.containsKey("placeholderMapNumber"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #112 <String "placeholderMapNumber">
	//*  17   34:invokevirtual   #102 <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				c = bundle.getInt("placeholderMapNumber");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #112 <String "placeholderMapNumber">
	//   22   44:invokevirtual   #116 <Method int Bundle.getInt(String)>
	//   23   47:putfield        #120 <Field int c>
			if(bundle.containsKey("mapLearningPercent"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #122 <String "mapLearningPercent">
	//*  26   53:invokevirtual   #102 <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				d = bundle.getInt("mapLearningPercent");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #122 <String "mapLearningPercent">
	//   31   63:invokevirtual   #116 <Method int Bundle.getInt(String)>
	//   32   66:putfield        #125 <Field int d>
			if(bundle.containsKey("isLaunchedFromPush"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #127 <String "isLaunchedFromPush">
	//*  35   72:invokevirtual   #102 <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				e = bundle.getBoolean("isLaunchedFromPush");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #127 <String "isLaunchedFromPush">
	//   40   82:invokevirtual   #130 <Method boolean Bundle.getBoolean(String)>
	//   41   85:putfield        #134 <Field boolean e>
		}
	//   42   88:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #138 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	protected void a(CharSequence charsequence, int i)
	{
		org.androidannotations.api.b.a("", new Runnable(charsequence, i) {

			public void run()
			{
				com.irobot.home.MapCustomizationActivity_.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field MapCustomizationActivity_ c>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field CharSequence a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int b>
			//    6   12:invokestatic    #31  <Method void com.irobot.home.MapCustomizationActivity_.a(MapCustomizationActivity_, CharSequence, int)>
			//    7   15:return          
			}

			final CharSequence a;
			final int b;
			final MapCustomizationActivity_ c;

			
			{
				c = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MapCustomizationActivity_ c>
				a = charsequence;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field CharSequence a>
				b = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
, 0L);
	//    0    0:ldc1            #142 <String "">
	//    1    2:new             #26  <Class MapCustomizationActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:invokespecial   #144 <Method void MapCustomizationActivity_$4(MapCustomizationActivity_, CharSequence, int)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #149 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    9   16:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		f = (CustomButton)a1.a(0x7f090403);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #151 <Int 0x7f090403>
	//    3    4:invokeinterface #153 <Method View a.a(int)>
	//    4    9:checkcast       #155 <Class CustomButton>
	//    5   12:putfield        #158 <Field CustomButton f>
		g = (CustomButton)a1.a(0x7f09003b);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #159 <Int 0x7f09003b>
	//    9   19:invokeinterface #153 <Method View a.a(int)>
	//   10   24:checkcast       #155 <Class CustomButton>
	//   11   27:putfield        #162 <Field CustomButton g>
		h = (FrameLayout)a1.a(0x7f09008c);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #163 <Int 0x7f09008c>
	//   15   34:invokeinterface #153 <Method View a.a(int)>
	//   16   39:checkcast       #165 <Class FrameLayout>
	//   17   42:putfield        #169 <Field FrameLayout h>
		i = (LinearLayout)a1.a(0x7f09008d);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #170 <Int 0x7f09008d>
	//   21   49:invokeinterface #153 <Method View a.a(int)>
	//   22   54:checkcast       #172 <Class LinearLayout>
	//   23   57:putfield        #176 <Field LinearLayout i>
		j = (CustomTextView)a1.a(0x7f09012d);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #177 <Int 0x7f09012d>
	//   27   64:invokeinterface #153 <Method View a.a(int)>
	//   28   69:checkcast       #179 <Class CustomTextView>
	//   29   72:putfield        #183 <Field CustomTextView j>
		k = (RecyclerView)a1.a(0x7f090372);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #184 <Int 0x7f090372>
	//   33   79:invokeinterface #153 <Method View a.a(int)>
	//   34   84:checkcast       #186 <Class RecyclerView>
	//   35   87:putfield        #190 <Field RecyclerView k>
		l = (ImageView)a1.a(0x7f09024f);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #191 <Int 0x7f09024f>
	//   39   94:invokeinterface #153 <Method View a.a(int)>
	//   40   99:checkcast       #193 <Class ImageView>
	//   41  102:putfield        #197 <Field ImageView l>
		m = (ImageView)a1.a(0x7f0900fe);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #198 <Int 0x7f0900fe>
	//   45  109:invokeinterface #153 <Method View a.a(int)>
	//   46  114:checkcast       #193 <Class ImageView>
	//   47  117:putfield        #201 <Field ImageView m>
		n = (CustomTextView)a1.a(0x7f09015b);
	//   48  120:aload_0         
	//   49  121:aload_1         
	//   50  122:ldc1            #202 <Int 0x7f09015b>
	//   51  124:invokeinterface #153 <Method View a.a(int)>
	//   52  129:checkcast       #179 <Class CustomTextView>
	//   53  132:putfield        #205 <Field CustomTextView n>
		o = (CustomTextView)a1.a(0x7f0900ae);
	//   54  135:aload_0         
	//   55  136:aload_1         
	//   56  137:ldc1            #206 <Int 0x7f0900ae>
	//   57  139:invokeinterface #153 <Method View a.a(int)>
	//   58  144:checkcast       #179 <Class CustomTextView>
	//   59  147:putfield        #209 <Field CustomTextView o>
		t = (CustomTextView)a1.a(0x7f090133);
	//   60  150:aload_0         
	//   61  151:aload_1         
	//   62  152:ldc1            #210 <Int 0x7f090133>
	//   63  154:invokeinterface #153 <Method View a.a(int)>
	//   64  159:checkcast       #179 <Class CustomTextView>
	//   65  162:putfield        #213 <Field CustomTextView t>
		u = (CustomTextView)a1.a(0x7f090240);
	//   66  165:aload_0         
	//   67  166:aload_1         
	//   68  167:ldc1            #214 <Int 0x7f090240>
	//   69  169:invokeinterface #153 <Method View a.a(int)>
	//   70  174:checkcast       #179 <Class CustomTextView>
	//   71  177:putfield        #217 <Field CustomTextView u>
		v = (CustomTextView)a1.a(0x7f09023f);
	//   72  180:aload_0         
	//   73  181:aload_1         
	//   74  182:ldc1            #218 <Int 0x7f09023f>
	//   75  184:invokeinterface #153 <Method View a.a(int)>
	//   76  189:checkcast       #179 <Class CustomTextView>
	//   77  192:putfield        #221 <Field CustomTextView v>
		w = (CustomTextView)a1.a(0x7f090043);
	//   78  195:aload_0         
	//   79  196:aload_1         
	//   80  197:ldc1            #222 <Int 0x7f090043>
	//   81  199:invokeinterface #153 <Method View a.a(int)>
	//   82  204:checkcast       #179 <Class CustomTextView>
	//   83  207:putfield        #225 <Field CustomTextView w>
		x = (CustomTextView)a1.a(0x7f090044);
	//   84  210:aload_0         
	//   85  211:aload_1         
	//   86  212:ldc1            #226 <Int 0x7f090044>
	//   87  214:invokeinterface #153 <Method View a.a(int)>
	//   88  219:checkcast       #179 <Class CustomTextView>
	//   89  222:putfield        #228 <Field CustomTextView x>
		y = (PercentageRingView)a1.a(0x7f09020e);
	//   90  225:aload_0         
	//   91  226:aload_1         
	//   92  227:ldc1            #229 <Int 0x7f09020e>
	//   93  229:invokeinterface #153 <Method View a.a(int)>
	//   94  234:checkcast       #231 <Class PercentageRingView>
	//   95  237:putfield        #235 <Field PercentageRingView y>
		z = (CustomTextView)a1.a(0x7f09020f);
	//   96  240:aload_0         
	//   97  241:aload_1         
	//   98  242:ldc1            #236 <Int 0x7f09020f>
	//   99  244:invokeinterface #153 <Method View a.a(int)>
	//  100  249:checkcast       #179 <Class CustomTextView>
	//  101  252:putfield        #239 <Field CustomTextView z>
		A = (LinearLayout)a1.a(0x7f09023a);
	//  102  255:aload_0         
	//  103  256:aload_1         
	//  104  257:ldc1            #240 <Int 0x7f09023a>
	//  105  259:invokeinterface #153 <Method View a.a(int)>
	//  106  264:checkcast       #172 <Class LinearLayout>
	//  107  267:putfield        #243 <Field LinearLayout A>
		B = (CustomTextView)a1.a(0x7f0900b0);
	//  108  270:aload_0         
	//  109  271:aload_1         
	//  110  272:ldc1            #244 <Int 0x7f0900b0>
	//  111  274:invokeinterface #153 <Method View a.a(int)>
	//  112  279:checkcast       #179 <Class CustomTextView>
	//  113  282:putfield        #247 <Field CustomTextView B>
		C = (ImageButton)a1.a(0x7f09013a);
	//  114  285:aload_0         
	//  115  286:aload_1         
	//  116  287:ldc1            #248 <Int 0x7f09013a>
	//  117  289:invokeinterface #153 <Method View a.a(int)>
	//  118  294:checkcast       #250 <Class ImageButton>
	//  119  297:putfield        #254 <Field ImageButton C>
		D = (ImageButton)a1.a(0x7f090374);
	//  120  300:aload_0         
	//  121  301:aload_1         
	//  122  302:ldc1            #255 <Int 0x7f090374>
	//  123  304:invokeinterface #153 <Method View a.a(int)>
	//  124  309:checkcast       #250 <Class ImageButton>
	//  125  312:putfield        #258 <Field ImageButton D>
		E = (CustomButton)a1.a(0x7f0902f8);
	//  126  315:aload_0         
	//  127  316:aload_1         
	//  128  317:ldc2            #259 <Int 0x7f0902f8>
	//  129  320:invokeinterface #153 <Method View a.a(int)>
	//  130  325:checkcast       #155 <Class CustomButton>
	//  131  328:putfield        #262 <Field CustomButton E>
		F = (FloatingActionButton)a1.a(0x7f090322);
	//  132  331:aload_0         
	//  133  332:aload_1         
	//  134  333:ldc2            #263 <Int 0x7f090322>
	//  135  336:invokeinterface #153 <Method View a.a(int)>
	//  136  341:checkcast       #265 <Class FloatingActionButton>
	//  137  344:putfield        #269 <Field FloatingActionButton F>
		if(g != null)
	//* 138  347:aload_0         
	//* 139  348:getfield        #162 <Field CustomButton g>
	//* 140  351:ifnull          369
			g.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.g()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  141  354:aload_0         
	//  142  355:getfield        #162 <Field CustomButton g>
	//  143  358:new             #10  <Class MapCustomizationActivity_$1>
	//  144  361:dup             
	//  145  362:aload_0         
	//  146  363:invokespecial   #271 <Method void MapCustomizationActivity_$1(MapCustomizationActivity_)>
	//  147  366:invokevirtual   #275 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(B != null)
	//* 148  369:aload_0         
	//* 149  370:getfield        #247 <Field CustomTextView B>
	//* 150  373:ifnull          391
			B.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.h()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  151  376:aload_0         
	//  152  377:getfield        #247 <Field CustomTextView B>
	//  153  380:new             #32  <Class MapCustomizationActivity_$7>
	//  154  383:dup             
	//  155  384:aload_0         
	//  156  385:invokespecial   #276 <Method void MapCustomizationActivity_$7(MapCustomizationActivity_)>
	//  157  388:invokevirtual   #277 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		if(C != null)
	//* 158  391:aload_0         
	//* 159  392:getfield        #254 <Field ImageButton C>
	//* 160  395:ifnull          413
			C.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.i()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  161  398:aload_0         
	//  162  399:getfield        #254 <Field ImageButton C>
	//  163  402:new             #34  <Class MapCustomizationActivity_$8>
	//  164  405:dup             
	//  165  406:aload_0         
	//  166  407:invokespecial   #278 <Method void MapCustomizationActivity_$8(MapCustomizationActivity_)>
	//  167  410:invokevirtual   #279 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(D != null)
	//* 168  413:aload_0         
	//* 169  414:getfield        #258 <Field ImageButton D>
	//* 170  417:ifnull          435
			D.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.j()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  171  420:aload_0         
	//  172  421:getfield        #258 <Field ImageButton D>
	//  173  424:new             #36  <Class MapCustomizationActivity_$9>
	//  174  427:dup             
	//  175  428:aload_0         
	//  176  429:invokespecial   #280 <Method void MapCustomizationActivity_$9(MapCustomizationActivity_)>
	//  177  432:invokevirtual   #279 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(E != null)
	//* 178  435:aload_0         
	//* 179  436:getfield        #262 <Field CustomButton E>
	//* 180  439:ifnull          457
			E.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.k()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  181  442:aload_0         
	//  182  443:getfield        #262 <Field CustomButton E>
	//  183  446:new             #12  <Class MapCustomizationActivity_$10>
	//  184  449:dup             
	//  185  450:aload_0         
	//  186  451:invokespecial   #281 <Method void MapCustomizationActivity_$10(MapCustomizationActivity_)>
	//  187  454:invokevirtual   #275 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(l != null)
	//* 188  457:aload_0         
	//* 189  458:getfield        #197 <Field ImageView l>
	//* 190  461:ifnull          479
			l.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.l()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  191  464:aload_0         
	//  192  465:getfield        #197 <Field ImageView l>
	//  193  468:new             #14  <Class MapCustomizationActivity_$11>
	//  194  471:dup             
	//  195  472:aload_0         
	//  196  473:invokespecial   #282 <Method void MapCustomizationActivity_$11(MapCustomizationActivity_)>
	//  197  476:invokevirtual   #283 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		if(o != null)
	//* 198  479:aload_0         
	//* 199  480:getfield        #209 <Field CustomTextView o>
	//* 200  483:ifnull          501
			o.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.m();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.m()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  201  486:aload_0         
	//  202  487:getfield        #209 <Field CustomTextView o>
	//  203  490:new             #16  <Class MapCustomizationActivity_$12>
	//  204  493:dup             
	//  205  494:aload_0         
	//  206  495:invokespecial   #284 <Method void MapCustomizationActivity_$12(MapCustomizationActivity_)>
	//  207  498:invokevirtual   #277 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		if(m != null)
	//* 208  501:aload_0         
	//* 209  502:getfield        #201 <Field ImageView m>
	//* 210  505:ifnull          523
			m.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.n();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.n()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  211  508:aload_0         
	//  212  509:getfield        #201 <Field ImageView m>
	//  213  512:new             #18  <Class MapCustomizationActivity_$13>
	//  214  515:dup             
	//  215  516:aload_0         
	//  216  517:invokespecial   #285 <Method void MapCustomizationActivity_$13(MapCustomizationActivity_)>
	//  217  520:invokevirtual   #283 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		if(n != null)
	//* 218  523:aload_0         
	//* 219  524:getfield        #205 <Field CustomTextView n>
	//* 220  527:ifnull          545
			n.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.o();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.o()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  221  530:aload_0         
	//  222  531:getfield        #205 <Field CustomTextView n>
	//  223  534:new             #20  <Class MapCustomizationActivity_$14>
	//  224  537:dup             
	//  225  538:aload_0         
	//  226  539:invokespecial   #286 <Method void MapCustomizationActivity_$14(MapCustomizationActivity_)>
	//  227  542:invokevirtual   #277 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		if(f != null)
	//* 228  545:aload_0         
	//* 229  546:getfield        #158 <Field CustomButton f>
	//* 230  549:ifnull          567
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.p();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.p()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  231  552:aload_0         
	//  232  553:getfield        #158 <Field CustomButton f>
	//  233  556:new             #22  <Class MapCustomizationActivity_$2>
	//  234  559:dup             
	//  235  560:aload_0         
	//  236  561:invokespecial   #287 <Method void MapCustomizationActivity_$2(MapCustomizationActivity_)>
	//  237  564:invokevirtual   #275 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(F != null)
	//* 238  567:aload_0         
	//* 239  568:getfield        #269 <Field FloatingActionButton F>
	//* 240  571:ifnull          589
			F.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.q();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity_.q()>
				//    3    7:return          
				}

				final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  241  574:aload_0         
	//  242  575:getfield        #269 <Field FloatingActionButton F>
	//  243  578:new             #24  <Class MapCustomizationActivity_$3>
	//  244  581:dup             
	//  245  582:aload_0         
	//  246  583:invokespecial   #288 <Method void MapCustomizationActivity_$3(MapCustomizationActivity_)>
	//  247  586:invokevirtual   #289 <Method void FloatingActionButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//  248  589:aload_0         
	//  249  590:invokevirtual   #291 <Method void e()>
	//  250  593:return          
	}

	protected void f(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.MapCustomizationActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field MapCustomizationActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.MapCustomizationActivity_.a(MapCustomizationActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final MapCustomizationActivity_ b;

			
			{
				b = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MapCustomizationActivity_ b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #142 <String "">
	//    1    2:new             #28  <Class MapCustomizationActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #293 <Method void MapCustomizationActivity_$5(MapCustomizationActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #149 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(H);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field c H>
	//    2    4:invokestatic    #297 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #299 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #301 <Method void MapCustomizationActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #297 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b004d);
	//   13   23:aload_0         
	//   14   24:ldc2            #302 <Int 0x7f0b004d>
	//   15   27:invokevirtual   #305 <Method void setContentView(int)>
	//   16   30:return          
	}

	void s()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.MapCustomizationActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MapCustomizationActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.MapCustomizationActivity_.a(MapCustomizationActivity_)>
			//    3    7:return          
			}

			final MapCustomizationActivity_ a;

			
			{
				a = MapCustomizationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #142 <String "">
	//    1    2:new             #30  <Class MapCustomizationActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #306 <Method void MapCustomizationActivity_$6(MapCustomizationActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #149 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #307 <Method void MapCustomizationActivity.setContentView(int)>
		H.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field c H>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #309 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #312 <Method void MapCustomizationActivity.setContentView(View)>
		H.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field c H>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #309 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #315 <Method void MapCustomizationActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		H.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #50  <Field c H>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #309 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #319 <Method void MapCustomizationActivity.setIntent(Intent)>
		x();
	//    3    5:aload_0         
	//    4    6:invokespecial   #71  <Method void x()>
	//    5    9:return          
	}

	private final c H = new c();
}
