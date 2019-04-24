// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.util.*;

// Referenced classes of package o:
//			mr, me, oa, mq, 
//			la, oc, ll, lm, 
//			np, ln, ma, nz, 
//			mh, nf, mz, lk, 
//			nd, nj, ne, ml, 
//			mi

public abstract class ld extends ViewGroup
	implements mr
{

	public ld(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void ViewGroup(Context)>
		j = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #71  <Field boolean j>
		A = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #73  <Field ma A>
		D = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #75  <Field boolean D>
		c = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #77  <Field boolean c>
		a = 0.9F;
	//   15   25:aload_0         
	//   16   26:ldc1            #78  <Float 0.9F>
	//   17   28:putfield        #80  <Field float a>
		E = new me(0);
	//   18   31:aload_0         
	//   19   32:new             #82  <Class me>
	//   20   35:dup             
	//   21   36:iconst_0        
	//   22   37:invokespecial   #85  <Method void me(int)>
	//   23   40:putfield        #87  <Field me E>
		I = true;
	//   24   43:aload_0         
	//   25   44:iconst_1        
	//   26   45:putfield        #89  <Field boolean I>
		e = "No chart data available.";
	//   27   48:aload_0         
	//   28   49:ldc1            #91  <String "No chart data available.">
	//   29   51:putfield        #93  <Field String e>
		O = new oa();
	//   30   54:aload_0         
	//   31   55:new             #95  <Class oa>
	//   32   58:dup             
	//   33   59:invokespecial   #98  <Method void oa()>
	//   34   62:putfield        #100 <Field oa O>
		d = 0.0F;
	//   35   65:aload_0         
	//   36   66:fconst_0        
	//   37   67:putfield        #102 <Field float d>
		g = 0.0F;
	//   38   70:aload_0         
	//   39   71:fconst_0        
	//   40   72:putfield        #104 <Field float g>
		f = 0.0F;
	//   41   75:aload_0         
	//   42   76:fconst_0        
	//   43   77:putfield        #106 <Field float f>
		i = 0.0F;
	//   44   80:aload_0         
	//   45   81:fconst_0        
	//   46   82:putfield        #108 <Field float i>
		h = false;
	//   47   85:aload_0         
	//   48   86:iconst_0        
	//   49   87:putfield        #110 <Field boolean h>
		V = 0.0F;
	//   50   90:aload_0         
	//   51   91:fconst_0        
	//   52   92:putfield        #112 <Field float V>
		U = true;
	//   53   95:aload_0         
	//   54   96:iconst_1        
	//   55   97:putfield        #114 <Field boolean U>
		W = new ArrayList();
	//   56  100:aload_0         
	//   57  101:new             #116 <Class ArrayList>
	//   58  104:dup             
	//   59  105:invokespecial   #117 <Method void ArrayList()>
	//   60  108:putfield        #119 <Field ArrayList W>
		k = false;
	//   61  111:aload_0         
	//   62  112:iconst_0        
	//   63  113:putfield        #121 <Field boolean k>
		a();
	//   64  116:aload_0         
	//   65  117:invokevirtual   #123 <Method void a()>
	//   66  120:return          
	}

	public ld(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #127 <Method void ViewGroup(Context, AttributeSet)>
		j = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #71  <Field boolean j>
		A = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #73  <Field ma A>
		D = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #75  <Field boolean D>
		c = true;
	//   13   21:aload_0         
	//   14   22:iconst_1        
	//   15   23:putfield        #77  <Field boolean c>
		a = 0.9F;
	//   16   26:aload_0         
	//   17   27:ldc1            #78  <Float 0.9F>
	//   18   29:putfield        #80  <Field float a>
		E = new me(0);
	//   19   32:aload_0         
	//   20   33:new             #82  <Class me>
	//   21   36:dup             
	//   22   37:iconst_0        
	//   23   38:invokespecial   #85  <Method void me(int)>
	//   24   41:putfield        #87  <Field me E>
		I = true;
	//   25   44:aload_0         
	//   26   45:iconst_1        
	//   27   46:putfield        #89  <Field boolean I>
		e = "No chart data available.";
	//   28   49:aload_0         
	//   29   50:ldc1            #91  <String "No chart data available.">
	//   30   52:putfield        #93  <Field String e>
		O = new oa();
	//   31   55:aload_0         
	//   32   56:new             #95  <Class oa>
	//   33   59:dup             
	//   34   60:invokespecial   #98  <Method void oa()>
	//   35   63:putfield        #100 <Field oa O>
		d = 0.0F;
	//   36   66:aload_0         
	//   37   67:fconst_0        
	//   38   68:putfield        #102 <Field float d>
		g = 0.0F;
	//   39   71:aload_0         
	//   40   72:fconst_0        
	//   41   73:putfield        #104 <Field float g>
		f = 0.0F;
	//   42   76:aload_0         
	//   43   77:fconst_0        
	//   44   78:putfield        #106 <Field float f>
		i = 0.0F;
	//   45   81:aload_0         
	//   46   82:fconst_0        
	//   47   83:putfield        #108 <Field float i>
		h = false;
	//   48   86:aload_0         
	//   49   87:iconst_0        
	//   50   88:putfield        #110 <Field boolean h>
		V = 0.0F;
	//   51   91:aload_0         
	//   52   92:fconst_0        
	//   53   93:putfield        #112 <Field float V>
		U = true;
	//   54   96:aload_0         
	//   55   97:iconst_1        
	//   56   98:putfield        #114 <Field boolean U>
		W = new ArrayList();
	//   57  101:aload_0         
	//   58  102:new             #116 <Class ArrayList>
	//   59  105:dup             
	//   60  106:invokespecial   #117 <Method void ArrayList()>
	//   61  109:putfield        #119 <Field ArrayList W>
		k = false;
	//   62  112:aload_0         
	//   63  113:iconst_0        
	//   64  114:putfield        #121 <Field boolean k>
		a();
	//   65  117:aload_0         
	//   66  118:invokevirtual   #123 <Method void a()>
	//   67  121:return          
	}

	public ld(Context context, AttributeSet attributeset, int l)
	{
		super(context, attributeset, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #130 <Method void ViewGroup(Context, AttributeSet, int)>
		j = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #71  <Field boolean j>
		A = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #73  <Field ma A>
		D = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #75  <Field boolean D>
		c = true;
	//   14   22:aload_0         
	//   15   23:iconst_1        
	//   16   24:putfield        #77  <Field boolean c>
		a = 0.9F;
	//   17   27:aload_0         
	//   18   28:ldc1            #78  <Float 0.9F>
	//   19   30:putfield        #80  <Field float a>
		E = new me(0);
	//   20   33:aload_0         
	//   21   34:new             #82  <Class me>
	//   22   37:dup             
	//   23   38:iconst_0        
	//   24   39:invokespecial   #85  <Method void me(int)>
	//   25   42:putfield        #87  <Field me E>
		I = true;
	//   26   45:aload_0         
	//   27   46:iconst_1        
	//   28   47:putfield        #89  <Field boolean I>
		e = "No chart data available.";
	//   29   50:aload_0         
	//   30   51:ldc1            #91  <String "No chart data available.">
	//   31   53:putfield        #93  <Field String e>
		O = new oa();
	//   32   56:aload_0         
	//   33   57:new             #95  <Class oa>
	//   34   60:dup             
	//   35   61:invokespecial   #98  <Method void oa()>
	//   36   64:putfield        #100 <Field oa O>
		d = 0.0F;
	//   37   67:aload_0         
	//   38   68:fconst_0        
	//   39   69:putfield        #102 <Field float d>
		g = 0.0F;
	//   40   72:aload_0         
	//   41   73:fconst_0        
	//   42   74:putfield        #104 <Field float g>
		f = 0.0F;
	//   43   77:aload_0         
	//   44   78:fconst_0        
	//   45   79:putfield        #106 <Field float f>
		i = 0.0F;
	//   46   82:aload_0         
	//   47   83:fconst_0        
	//   48   84:putfield        #108 <Field float i>
		h = false;
	//   49   87:aload_0         
	//   50   88:iconst_0        
	//   51   89:putfield        #110 <Field boolean h>
		V = 0.0F;
	//   52   92:aload_0         
	//   53   93:fconst_0        
	//   54   94:putfield        #112 <Field float V>
		U = true;
	//   55   97:aload_0         
	//   56   98:iconst_1        
	//   57   99:putfield        #114 <Field boolean U>
		W = new ArrayList();
	//   58  102:aload_0         
	//   59  103:new             #116 <Class ArrayList>
	//   60  106:dup             
	//   61  107:invokespecial   #117 <Method void ArrayList()>
	//   62  110:putfield        #119 <Field ArrayList W>
		k = false;
	//   63  113:aload_0         
	//   64  114:iconst_0        
	//   65  115:putfield        #121 <Field boolean k>
		a();
	//   66  118:aload_0         
	//   67  119:invokevirtual   #123 <Method void a()>
	//   68  122:return          
	}

	private void e(View view)
	{
		if(view.getBackground() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #137 <Method Drawable View.getBackground()>
	//*   2    4:ifnull          15
			view.getBackground().setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #137 <Method Drawable View.getBackground()>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #143 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		if(view instanceof ViewGroup)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #5   <Class ViewGroup>
	//*   9   19:ifeq            61
		{
			for(int l = 0; l < ((ViewGroup)view).getChildCount(); l++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:aload_1         
	//*  14   26:checkcast       #5   <Class ViewGroup>
	//*  15   29:invokevirtual   #147 <Method int ViewGroup.getChildCount()>
	//*  16   32:icmpge          54
				e(((ViewGroup)view).getChildAt(l));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:checkcast       #5   <Class ViewGroup>
	//   20   40:iload_2         
	//   21   41:invokevirtual   #151 <Method View ViewGroup.getChildAt(int)>
	//   22   44:invokespecial   #153 <Method void e(View)>

	//   23   47:iload_2         
	//   24   48:iconst_1        
	//   25   49:iadd            
	//   26   50:istore_2        
	//*  27   51:goto            24
			((ViewGroup)view).removeAllViews();
	//   28   54:aload_1         
	//   29   55:checkcast       #5   <Class ViewGroup>
	//   30   58:invokevirtual   #156 <Method void ViewGroup.removeAllViews()>
		}
	//   31   61:return          
	}

	public void A()
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method ViewParent getParent()>
	//    2    4:astore_1        
		if(viewparent != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokeinterface #166 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	public void B()
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method ViewParent getParent()>
	//    2    4:astore_1        
		if(viewparent != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokeinterface #166 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	public boolean C()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean j>
	//    2    4:ireturn         
	}

	public mh a(float f1, float f2)
	{
		if(A == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field ma A>
	//*   2    4:ifnonnull       17
		{
			Log.e("MPAndroidChart", "Can't select by touch. No data set.");
	//    3    7:ldc1            #172 <String "MPAndroidChart">
	//    4    9:ldc1            #174 <String "Can't select by touch. No data set.">
	//    5   11:invokestatic    #179 <Method int Log.e(String, String)>
	//    6   14:pop             
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		} else
		{
			return getHighlighter().c(f1, f2);
	//    9   17:aload_0         
	//   10   18:invokevirtual   #183 <Method mq getHighlighter()>
	//   11   21:fload_1         
	//   12   22:fload_2         
	//   13   23:invokeinterface #187 <Method mh mq.c(float, float)>
	//   14   28:areturn         
		}
	}

	protected void a()
	{
		setWillNotDraw(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #190 <Method void setWillNotDraw(boolean)>
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   3    5:getstatic       #195 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          11
	//*   5   10:icmpge          27
			P = new la();
	//    6   13:aload_0         
	//    7   14:new             #197 <Class la>
	//    8   17:dup             
	//    9   18:invokespecial   #198 <Method void la()>
	//   10   21:putfield        #200 <Field la P>
		else
	//*  11   24:goto            46
			P = new la(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					d.postInvalidate();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ld d>
				//    2    4:invokevirtual   #25  <Method void ld.postInvalidate()>
				//    3    7:return          
				}

				final ld d;

			
			{
				d = ld.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ld d>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   12   27:aload_0         
	//   13   28:new             #197 <Class la>
	//   14   31:dup             
	//   15   32:new             #9   <Class ld$2>
	//   16   35:dup             
	//   17   36:aload_0         
	//   18   37:invokespecial   #203 <Method void ld$2(ld)>
	//   19   40:invokespecial   #206 <Method void la(android.animation.ValueAnimator$AnimatorUpdateListener)>
	//   20   43:putfield        #200 <Field la P>
		oc.b(getContext());
	//   21   46:aload_0         
	//   22   47:invokevirtual   #210 <Method Context getContext()>
	//   23   50:invokestatic    #214 <Method void oc.b(Context)>
		V = oc.b(500F);
	//   24   53:aload_0         
	//   25   54:ldc1            #215 <Float 500F>
	//   26   56:invokestatic    #218 <Method float oc.b(float)>
	//   27   59:putfield        #112 <Field float V>
		L = new ll();
	//   28   62:aload_0         
	//   29   63:new             #220 <Class ll>
	//   30   66:dup             
	//   31   67:invokespecial   #221 <Method void ll()>
	//   32   70:putfield        #223 <Field ll L>
		N = new lm();
	//   33   73:aload_0         
	//   34   74:new             #225 <Class lm>
	//   35   77:dup             
	//   36   78:invokespecial   #226 <Method void lm()>
	//   37   81:putfield        #228 <Field lm N>
		J = new np(O, N);
	//   38   84:aload_0         
	//   39   85:new             #230 <Class np>
	//   40   88:dup             
	//   41   89:aload_0         
	//   42   90:getfield        #100 <Field oa O>
	//   43   93:aload_0         
	//   44   94:getfield        #228 <Field lm N>
	//   45   97:invokespecial   #233 <Method void np(oa, lm)>
	//   46  100:putfield        #235 <Field np J>
		H = new ln();
	//   47  103:aload_0         
	//   48  104:new             #237 <Class ln>
	//   49  107:dup             
	//   50  108:invokespecial   #238 <Method void ln()>
	//   51  111:putfield        #240 <Field ln H>
		F = new Paint(1);
	//   52  114:aload_0         
	//   53  115:new             #242 <Class Paint>
	//   54  118:dup             
	//   55  119:iconst_1        
	//   56  120:invokespecial   #243 <Method void Paint(int)>
	//   57  123:putfield        #245 <Field Paint F>
		G = new Paint(1);
	//   58  126:aload_0         
	//   59  127:new             #242 <Class Paint>
	//   60  130:dup             
	//   61  131:iconst_1        
	//   62  132:invokespecial   #243 <Method void Paint(int)>
	//   63  135:putfield        #247 <Field Paint G>
		G.setColor(Color.rgb(247, 189, 51));
	//   64  138:aload_0         
	//   65  139:getfield        #247 <Field Paint G>
	//   66  142:sipush          247
	//   67  145:sipush          189
	//   68  148:bipush          51
	//   69  150:invokestatic    #253 <Method int Color.rgb(int, int, int)>
	//   70  153:invokevirtual   #256 <Method void Paint.setColor(int)>
		G.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   71  156:aload_0         
	//   72  157:getfield        #247 <Field Paint G>
	//   73  160:getstatic       #262 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   74  163:invokevirtual   #266 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		G.setTextSize(oc.b(12F));
	//   75  166:aload_0         
	//   76  167:getfield        #247 <Field Paint G>
	//   77  170:ldc2            #267 <Float 12F>
	//   78  173:invokestatic    #218 <Method float oc.b(float)>
	//   79  176:invokevirtual   #271 <Method void Paint.setTextSize(float)>
		if(j)
	//*  80  179:aload_0         
	//*  81  180:getfield        #71  <Field boolean j>
	//*  82  183:ifeq            196
			Log.i("", "Chart.init()");
	//   83  186:ldc2            #273 <String "">
	//   84  189:ldc2            #275 <String "Chart.init()">
	//   85  192:invokestatic    #277 <Method int Log.i(String, String)>
	//   86  195:pop             
	//   87  196:return          
	}

	protected void b(float f1, float f2)
	{
		if(A == null || A.o() < 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field ma A>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #73  <Field ma A>
	//*   5   11:invokevirtual   #283 <Method int ma.o()>
	//*   6   14:iconst_2        
	//*   7   15:icmpge          33
			f1 = Math.max(Math.abs(f1), Math.abs(f2));
	//    8   18:fload_1         
	//    9   19:invokestatic    #288 <Method float Math.abs(float)>
	//   10   22:fload_2         
	//   11   23:invokestatic    #288 <Method float Math.abs(float)>
	//   12   26:invokestatic    #292 <Method float Math.max(float, float)>
	//   13   29:fstore_1        
		else
	//*  14   30:goto            40
			f1 = Math.abs(f2 - f1);
	//   15   33:fload_2         
	//   16   34:fload_1         
	//   17   35:fsub            
	//   18   36:invokestatic    #288 <Method float Math.abs(float)>
	//   19   39:fstore_1        
		int l = oc.e(f1);
	//   20   40:fload_1         
	//   21   41:invokestatic    #295 <Method int oc.e(float)>
	//   22   44:istore_3        
		E.b(l);
	//   23   45:aload_0         
	//   24   46:getfield        #87  <Field me E>
	//   25   49:iload_3         
	//   26   50:invokevirtual   #297 <Method void me.b(int)>
	//   27   53:return          
	}

	protected void b(Canvas canvas)
	{
		if(L != null && L.B())
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field ll L>
	//*   2    4:ifnull          164
	//*   3    7:aload_0         
	//*   4    8:getfield        #223 <Field ll L>
	//*   5   11:invokevirtual   #300 <Method boolean ll.B()>
	//*   6   14:ifeq            164
		{
			nz nz1 = L.d();
	//    7   17:aload_0         
	//    8   18:getfield        #223 <Field ll L>
	//    9   21:invokevirtual   #303 <Method nz ll.d()>
	//   10   24:astore          4
			F.setTypeface(L.x());
	//   11   26:aload_0         
	//   12   27:getfield        #245 <Field Paint F>
	//   13   30:aload_0         
	//   14   31:getfield        #223 <Field ll L>
	//   15   34:invokevirtual   #307 <Method Typeface ll.x()>
	//   16   37:invokevirtual   #311 <Method Typeface Paint.setTypeface(Typeface)>
	//   17   40:pop             
			F.setTextSize(L.z());
	//   18   41:aload_0         
	//   19   42:getfield        #245 <Field Paint F>
	//   20   45:aload_0         
	//   21   46:getfield        #223 <Field ll L>
	//   22   49:invokevirtual   #315 <Method float ll.z()>
	//   23   52:invokevirtual   #271 <Method void Paint.setTextSize(float)>
			F.setColor(L.A());
	//   24   55:aload_0         
	//   25   56:getfield        #245 <Field Paint F>
	//   26   59:aload_0         
	//   27   60:getfield        #223 <Field ll L>
	//   28   63:invokevirtual   #317 <Method int ll.A()>
	//   29   66:invokevirtual   #256 <Method void Paint.setColor(int)>
			F.setTextAlign(L.a());
	//   30   69:aload_0         
	//   31   70:getfield        #245 <Field Paint F>
	//   32   73:aload_0         
	//   33   74:getfield        #223 <Field ll L>
	//   34   77:invokevirtual   #320 <Method android.graphics.Paint$Align ll.a()>
	//   35   80:invokevirtual   #266 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			float f1;
			float f2;
			if(nz1 == null)
	//*  36   83:aload           4
	//*  37   85:ifnonnull       135
			{
				f1 = (float)getWidth() - O.b() - L.v();
	//   38   88:aload_0         
	//   39   89:invokevirtual   #323 <Method int getWidth()>
	//   40   92:i2f             
	//   41   93:aload_0         
	//   42   94:getfield        #100 <Field oa O>
	//   43   97:invokevirtual   #325 <Method float oa.b()>
	//   44  100:fsub            
	//   45  101:aload_0         
	//   46  102:getfield        #223 <Field ll L>
	//   47  105:invokevirtual   #328 <Method float ll.v()>
	//   48  108:fsub            
	//   49  109:fstore_2        
				f2 = (float)getHeight() - O.d() - L.y();
	//   50  110:aload_0         
	//   51  111:invokevirtual   #331 <Method int getHeight()>
	//   52  114:i2f             
	//   53  115:aload_0         
	//   54  116:getfield        #100 <Field oa O>
	//   55  119:invokevirtual   #333 <Method float oa.d()>
	//   56  122:fsub            
	//   57  123:aload_0         
	//   58  124:getfield        #223 <Field ll L>
	//   59  127:invokevirtual   #336 <Method float ll.y()>
	//   60  130:fsub            
	//   61  131:fstore_3        
			} else
	//*  62  132:goto            147
			{
				f1 = nz1.e;
	//   63  135:aload           4
	//   64  137:getfield        #340 <Field float nz.e>
	//   65  140:fstore_2        
				f2 = nz1.c;
	//   66  141:aload           4
	//   67  143:getfield        #342 <Field float nz.c>
	//   68  146:fstore_3        
			}
			canvas.drawText(L.b(), f1, f2, F);
	//   69  147:aload_1         
	//   70  148:aload_0         
	//   71  149:getfield        #223 <Field ll L>
	//   72  152:invokevirtual   #345 <Method String ll.b()>
	//   73  155:fload_2         
	//   74  156:fload_3         
	//   75  157:aload_0         
	//   76  158:getfield        #245 <Field Paint F>
	//   77  161:invokevirtual   #351 <Method void Canvas.drawText(String, float, float, Paint)>
		}
	//   78  164:return          
	}

	public void c(int l)
	{
		P.c(l);
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field la P>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #353 <Method void la.c(int)>
	//    4    8:return          
	}

	public void c(mh mh1, boolean flag)
	{
		com.github.mikephil.charting.data.Entry entry = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(mh1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
		{
			Q = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #356 <Field mh[] Q>
		} else
	//*   7   11:goto            85
		{
			if(j)
	//*   8   14:aload_0         
	//*   9   15:getfield        #71  <Field boolean j>
	//*  10   18:ifeq            50
				Log.i("MPAndroidChart", (new StringBuilder()).append("Highlighted: ").append(mh1.toString()).toString());
	//   11   21:ldc1            #172 <String "MPAndroidChart">
	//   12   23:new             #358 <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #359 <Method void StringBuilder()>
	//   15   30:ldc2            #361 <String "Highlighted: ">
	//   16   33:invokevirtual   #365 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:aload_1         
	//   18   37:invokevirtual   #370 <Method String mh.toString()>
	//   19   40:invokevirtual   #365 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:invokevirtual   #371 <Method String StringBuilder.toString()>
	//   21   46:invokestatic    #277 <Method int Log.i(String, String)>
	//   22   49:pop             
			entry = A.d(mh1);
	//   23   50:aload_0         
	//   24   51:getfield        #73  <Field ma A>
	//   25   54:aload_1         
	//   26   55:invokevirtual   #374 <Method com.github.mikephil.charting.data.Entry ma.d(mh)>
	//   27   58:astore_3        
			if(entry == null)
	//*  28   59:aload_3         
	//*  29   60:ifnonnull       73
			{
				Q = null;
	//   30   63:aload_0         
	//   31   64:aconst_null     
	//   32   65:putfield        #356 <Field mh[] Q>
				mh1 = null;
	//   33   68:aconst_null     
	//   34   69:astore_1        
			} else
	//*  35   70:goto            85
			{
				Q = (new mh[] {
					mh1
				});
	//   36   73:aload_0         
	//   37   74:iconst_1        
	//   38   75:anewarray       mh[]
	//   39   78:dup             
	//   40   79:iconst_0        
	//   41   80:aload_1         
	//   42   81:aastore         
	//   43   82:putfield        #356 <Field mh[] Q>
			}
		}
		setLastHighlighted(Q);
	//   44   85:aload_0         
	//   45   86:aload_0         
	//   46   87:getfield        #356 <Field mh[] Q>
	//   47   90:invokevirtual   #378 <Method void setLastHighlighted(mh[])>
		if(flag && M != null)
	//*  48   93:iload_2         
	//*  49   94:ifeq            134
	//*  50   97:aload_0         
	//*  51   98:getfield        #380 <Field nf M>
	//*  52  101:ifnull          134
			if(!z())
	//*  53  104:aload_0         
	//*  54  105:invokevirtual   #382 <Method boolean z()>
	//*  55  108:ifne            123
				M.b();
	//   56  111:aload_0         
	//   57  112:getfield        #380 <Field nf M>
	//   58  115:invokeinterface #386 <Method void nf.b()>
			else
	//*  59  120:goto            134
				M.a(entry, mh1);
	//   60  123:aload_0         
	//   61  124:getfield        #380 <Field nf M>
	//   62  127:aload_3         
	//   63  128:aload_1         
	//   64  129:invokeinterface #389 <Method void nf.a(com.github.mikephil.charting.data.Entry, mh)>
		invalidate();
	//   65  134:aload_0         
	//   66  135:invokevirtual   #392 <Method void invalidate()>
	//   67  138:return          
	}

	protected float[] c(mh mh1)
	{
		return (new float[] {
			mh1.f(), mh1.h()
		});
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:aload_1         
	//    5    6:invokevirtual   #395 <Method float mh.f()>
	//    6    9:fastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:aload_1         
	//   10   13:invokevirtual   #397 <Method float mh.h()>
	//   11   16:fastore         
	//   12   17:areturn         
	}

	protected abstract void d();

	protected void d(Canvas canvas)
	{
		if(T == null || !j() || !z())
	//*   0    0:aload_0         
	//*   1    1:getfield        #399 <Field lk T>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #401 <Method boolean j()>
	//*   5   11:ifeq            21
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #382 <Method boolean z()>
	//*   8   18:ifne            22
			return;
	//    9   21:return          
		for(int l = 0; l < Q.length; l++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:aload_0         
	//*  14   26:getfield        #356 <Field mh[] Q>
	//*  15   29:arraylength     
	//*  16   30:icmpge          177
		{
			mh mh1 = Q[l];
	//   17   33:aload_0         
	//   18   34:getfield        #356 <Field mh[] Q>
	//   19   37:iload_2         
	//   20   38:aaload          
	//   21   39:astore          4
			mz mz1 = A.a(mh1.g());
	//   22   41:aload_0         
	//   23   42:getfield        #73  <Field ma A>
	//   24   45:aload           4
	//   25   47:invokevirtual   #403 <Method int mh.g()>
	//   26   50:invokevirtual   #406 <Method mz ma.a(int)>
	//   27   53:astore          6
			com.github.mikephil.charting.data.Entry entry = A.d(Q[l]);
	//   28   55:aload_0         
	//   29   56:getfield        #73  <Field ma A>
	//   30   59:aload_0         
	//   31   60:getfield        #356 <Field mh[] Q>
	//   32   63:iload_2         
	//   33   64:aaload          
	//   34   65:invokevirtual   #374 <Method com.github.mikephil.charting.data.Entry ma.d(mh)>
	//   35   68:astore          5
			int i1 = mz1.b(entry);
	//   36   70:aload           6
	//   37   72:aload           5
	//   38   74:invokeinterface #411 <Method int mz.b(com.github.mikephil.charting.data.Entry)>
	//   39   79:istore_3        
			if(entry == null || (float)i1 > (float)mz1.C() * P.b())
	//*  40   80:aload           5
	//*  41   82:ifnull          170
	//*  42   85:iload_3         
	//*  43   86:i2f             
	//*  44   87:aload           6
	//*  45   89:invokeinterface #413 <Method int mz.C()>
	//*  46   94:i2f             
	//*  47   95:aload_0         
	//*  48   96:getfield        #200 <Field la P>
	//*  49   99:invokevirtual   #414 <Method float la.b()>
	//*  50  102:fmul            
	//*  51  103:fcmpl           
	//*  52  104:ifle            110
				continue;
	//   53  107:goto            170
			float af[] = c(mh1);
	//   54  110:aload_0         
	//   55  111:aload           4
	//   56  113:invokevirtual   #416 <Method float[] c(mh)>
	//   57  116:astore          6
			if(O.d(af[0], af[1]))
	//*  58  118:aload_0         
	//*  59  119:getfield        #100 <Field oa O>
	//*  60  122:aload           6
	//*  61  124:iconst_0        
	//*  62  125:faload          
	//*  63  126:aload           6
	//*  64  128:iconst_1        
	//*  65  129:faload          
	//*  66  130:invokevirtual   #419 <Method boolean oa.d(float, float)>
	//*  67  133:ifne            139
	//*  68  136:goto            170
			{
				T.d(entry, mh1);
	//   69  139:aload_0         
	//   70  140:getfield        #399 <Field lk T>
	//   71  143:aload           5
	//   72  145:aload           4
	//   73  147:invokeinterface #423 <Method void lk.d(com.github.mikephil.charting.data.Entry, mh)>
				T.b(canvas, af[0], af[1]);
	//   74  152:aload_0         
	//   75  153:getfield        #399 <Field lk T>
	//   76  156:aload_1         
	//   77  157:aload           6
	//   78  159:iconst_0        
	//   79  160:faload          
	//   80  161:aload           6
	//   81  163:iconst_1        
	//   82  164:faload          
	//   83  165:invokeinterface #426 <Method void lk.b(Canvas, float, float)>
			}
		}

	//   84  170:iload_2         
	//   85  171:iconst_1        
	//   86  172:iadd            
	//   87  173:istore_2        
	//*  88  174:goto            24
	//   89  177:return          
	}

	public void e(mh amh[])
	{
		Q = amh;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #356 <Field mh[] Q>
		setLastHighlighted(amh);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #378 <Method void setLastHighlighted(mh[])>
		invalidate();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #392 <Method void invalidate()>
	//    8   14:return          
	}

	protected abstract void f();

	public la getAnimator()
	{
		return P;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field la P>
	//    2    4:areturn         
	}

	public nz getCenter()
	{
		return nz.d((float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method int getWidth()>
	//    2    4:i2f             
	//    3    5:fconst_2        
	//    4    6:fdiv            
	//    5    7:aload_0         
	//    6    8:invokevirtual   #331 <Method int getHeight()>
	//    7   11:i2f             
	//    8   12:fconst_2        
	//    9   13:fdiv            
	//   10   14:invokestatic    #432 <Method nz nz.d(float, float)>
	//   11   17:areturn         
	}

	public nz getCenterOfView()
	{
		return getCenter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #435 <Method nz getCenter()>
	//    2    4:areturn         
	}

	public nz getCenterOffsets()
	{
		return O.l();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field oa O>
	//    2    4:invokevirtual   #439 <Method nz oa.l()>
	//    3    7:areturn         
	}

	public Bitmap getChartBitmap()
	{
		Bitmap bitmap = Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.RGB_565);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method int getWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #331 <Method int getHeight()>
	//    4    8:getstatic       #447 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//    5   11:invokestatic    #453 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//    6   14:astore_1        
		Canvas canvas = new Canvas(bitmap);
	//    7   15:new             #347 <Class Canvas>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #456 <Method void Canvas(Bitmap)>
	//   11   23:astore_2        
		Drawable drawable = getBackground();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #457 <Method Drawable getBackground()>
	//   14   28:astore_3        
		if(drawable != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          41
			drawable.draw(canvas);
	//   17   33:aload_3         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #460 <Method void Drawable.draw(Canvas)>
		else
	//*  20   38:goto            46
			canvas.drawColor(-1);
	//   21   41:aload_2         
	//   22   42:iconst_m1       
	//   23   43:invokevirtual   #463 <Method void Canvas.drawColor(int)>
		draw(canvas);
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #464 <Method void draw(Canvas)>
		return bitmap;
	//   27   51:aload_1         
	//   28   52:areturn         
	}

	public RectF getContentRect()
	{
		return O.m();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field oa O>
	//    2    4:invokevirtual   #469 <Method RectF oa.m()>
	//    3    7:areturn         
	}

	public ma getData()
	{
		return A;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ma A>
	//    2    4:areturn         
	}

	public ml getDefaultValueFormatter()
	{
		return ((ml) (E));
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field me E>
	//    2    4:areturn         
	}

	public ll getDescription()
	{
		return L;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field ll L>
	//    2    4:areturn         
	}

	public float getDragDecelerationFrictionCoef()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field float a>
	//    2    4:freturn         
	}

	public float getExtraBottomOffset()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field float f>
	//    2    4:freturn         
	}

	public float getExtraLeftOffset()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field float i>
	//    2    4:freturn         
	}

	public float getExtraRightOffset()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field float g>
	//    2    4:freturn         
	}

	public float getExtraTopOffset()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field float d>
	//    2    4:freturn         
	}

	public mh[] getHighlighted()
	{
		return Q;
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field mh[] Q>
	//    2    4:areturn         
	}

	public mq getHighlighter()
	{
		return R;
	//    0    0:aload_0         
	//    1    1:getfield        #486 <Field mq R>
	//    2    4:areturn         
	}

	public ArrayList getJobs()
	{
		return W;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field ArrayList W>
	//    2    4:areturn         
	}

	public lm getLegend()
	{
		return N;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field lm N>
	//    2    4:areturn         
	}

	public np getLegendRenderer()
	{
		return J;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field np J>
	//    2    4:areturn         
	}

	public lk getMarker()
	{
		return T;
	//    0    0:aload_0         
	//    1    1:getfield        #399 <Field lk T>
	//    2    4:areturn         
	}

	public lk getMarkerView()
	{
		return getMarker();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #499 <Method lk getMarker()>
	//    2    4:areturn         
	}

	public float getMaxHighlightDistance()
	{
		return V;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field float V>
	//    2    4:freturn         
	}

	public ne getOnChartGestureListener()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #505 <Field ne b>
	//    2    4:areturn         
	}

	public nd getOnTouchListener()
	{
		return K;
	//    0    0:aload_0         
	//    1    1:getfield        #509 <Field nd K>
	//    2    4:areturn         
	}

	public nj getRenderer()
	{
		return S;
	//    0    0:aload_0         
	//    1    1:getfield        #513 <Field nj S>
	//    2    4:areturn         
	}

	public oa getViewPortHandler()
	{
		return O;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field oa O>
	//    2    4:areturn         
	}

	public ln getXAxis()
	{
		return H;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field ln H>
	//    2    4:areturn         
	}

	public float getXChartMax()
	{
		return H.u;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field ln H>
	//    2    4:getfield        #521 <Field float ln.u>
	//    3    7:freturn         
	}

	public float getXChartMin()
	{
		return H.q;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field ln H>
	//    2    4:getfield        #525 <Field float ln.q>
	//    3    7:freturn         
	}

	public float getXRange()
	{
		return H.w;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field ln H>
	//    2    4:getfield        #529 <Field float ln.w>
	//    3    7:freturn         
	}

	public float getYMax()
	{
		return A.g();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ma A>
	//    2    4:invokevirtual   #532 <Method float ma.g()>
	//    3    7:freturn         
	}

	public float getYMin()
	{
		return A.c();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ma A>
	//    2    4:invokevirtual   #535 <Method float ma.c()>
	//    3    7:freturn         
	}

	public abstract void h();

	public boolean j()
	{
		return U;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field boolean U>
	//    2    4:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #538 <Method void ViewGroup.onDetachedFromWindow()>
		if(k)
	//*   2    4:aload_0         
	//*   3    5:getfield        #121 <Field boolean k>
	//*   4    8:ifeq            16
			e(((View) (this)));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokespecial   #153 <Method void e(View)>
	//    8   16:return          
	}

	protected void onDraw(Canvas canvas)
	{
		if(A == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field ma A>
	//*   2    4:ifnonnull       54
		{
			boolean flag;
			if(!TextUtils.isEmpty(((CharSequence) (e))))
	//*   3    7:aload_0         
	//*   4    8:getfield        #93  <Field String e>
	//*   5   11:invokestatic    #545 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   14:ifne            22
				flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_2        
			else
	//*   9   19:goto            24
				flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_2        
			if(flag)
	//*  12   24:iload_2         
	//*  13   25:ifeq            53
			{
				nz nz1 = getCenter();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #435 <Method nz getCenter()>
	//   16   32:astore_3        
				canvas.drawText(e, nz1.e, nz1.c, G);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #93  <Field String e>
	//   20   38:aload_3         
	//   21   39:getfield        #340 <Field float nz.e>
	//   22   42:aload_3         
	//   23   43:getfield        #342 <Field float nz.c>
	//   24   46:aload_0         
	//   25   47:getfield        #247 <Field Paint G>
	//   26   50:invokevirtual   #351 <Method void Canvas.drawText(String, float, float, Paint)>
			}
			return;
	//   27   53:return          
		}
		if(!h)
	//*  28   54:aload_0         
	//*  29   55:getfield        #110 <Field boolean h>
	//*  30   58:ifne            70
		{
			f();
	//   31   61:aload_0         
	//   32   62:invokevirtual   #547 <Method void f()>
			h = true;
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:putfield        #110 <Field boolean h>
		}
	//   36   70:return          
	}

	protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
	{
		for(int l1 = 0; l1 < getChildCount(); l1++)
	//*   0    0:iconst_0        
	//*   1    1:istore          6
	//*   2    3:iload           6
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #550 <Method int getChildCount()>
	//*   5    9:icmpge          36
			getChildAt(l1).layout(l, i1, j1, k1);
	//    6   12:aload_0         
	//    7   13:iload           6
	//    8   15:invokevirtual   #551 <Method View getChildAt(int)>
	//    9   18:iload_2         
	//   10   19:iload_3         
	//   11   20:iload           4
	//   12   22:iload           5
	//   13   24:invokevirtual   #555 <Method void View.layout(int, int, int, int)>

	//   14   27:iload           6
	//   15   29:iconst_1        
	//   16   30:iadd            
	//   17   31:istore          6
	//*  18   33:goto            3
	//   19   36:return          
	}

	protected void onMeasure(int l, int i1)
	{
		super.onMeasure(l, i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #559 <Method void ViewGroup.onMeasure(int, int)>
		int j1 = (int)oc.b(50F);
	//    4    6:ldc2            #560 <Float 50F>
	//    5    9:invokestatic    #218 <Method float oc.b(float)>
	//    6   12:f2i             
	//    7   13:istore_3        
		setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), resolveSize(j1, l)), Math.max(getSuggestedMinimumHeight(), resolveSize(j1, i1)));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #563 <Method int getSuggestedMinimumWidth()>
	//   11   19:iload_3         
	//   12   20:iload_1         
	//   13   21:invokestatic    #567 <Method int resolveSize(int, int)>
	//   14   24:invokestatic    #569 <Method int Math.max(int, int)>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #572 <Method int getSuggestedMinimumHeight()>
	//   17   31:iload_3         
	//   18   32:iload_2         
	//   19   33:invokestatic    #567 <Method int resolveSize(int, int)>
	//   20   36:invokestatic    #569 <Method int Math.max(int, int)>
	//   21   39:invokevirtual   #575 <Method void setMeasuredDimension(int, int)>
	//   22   42:return          
	}

	protected void onSizeChanged(int l, int i1, int j1, int k1)
	{
		if(j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean j>
	//*   2    4:ifeq            16
			Log.i("MPAndroidChart", "OnSizeChanged()");
	//    3    7:ldc1            #172 <String "MPAndroidChart">
	//    4    9:ldc2            #578 <String "OnSizeChanged()">
	//    5   12:invokestatic    #277 <Method int Log.i(String, String)>
	//    6   15:pop             
		if(l > 0 && i1 > 0 && l < 10000 && i1 < 10000)
	//*   7   16:iload_1         
	//*   8   17:ifle            95
	//*   9   20:iload_2         
	//*  10   21:ifle            95
	//*  11   24:iload_1         
	//*  12   25:sipush          10000
	//*  13   28:icmpge          95
	//*  14   31:iload_2         
	//*  15   32:sipush          10000
	//*  16   35:icmpge          95
		{
			if(j)
	//*  17   38:aload_0         
	//*  18   39:getfield        #71  <Field boolean j>
	//*  19   42:ifeq            81
				Log.i("MPAndroidChart", (new StringBuilder()).append("Setting chart dimens, width: ").append(l).append(", height: ").append(i1).toString());
	//   20   45:ldc1            #172 <String "MPAndroidChart">
	//   21   47:new             #358 <Class StringBuilder>
	//   22   50:dup             
	//   23   51:invokespecial   #359 <Method void StringBuilder()>
	//   24   54:ldc2            #580 <String "Setting chart dimens, width: ">
	//   25   57:invokevirtual   #365 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:iload_1         
	//   27   61:invokevirtual   #583 <Method StringBuilder StringBuilder.append(int)>
	//   28   64:ldc2            #585 <String ", height: ">
	//   29   67:invokevirtual   #365 <Method StringBuilder StringBuilder.append(String)>
	//   30   70:iload_2         
	//   31   71:invokevirtual   #583 <Method StringBuilder StringBuilder.append(int)>
	//   32   74:invokevirtual   #371 <Method String StringBuilder.toString()>
	//   33   77:invokestatic    #277 <Method int Log.i(String, String)>
	//   34   80:pop             
			O.a(l, i1);
	//   35   81:aload_0         
	//   36   82:getfield        #100 <Field oa O>
	//   37   85:iload_1         
	//   38   86:i2f             
	//   39   87:iload_2         
	//   40   88:i2f             
	//   41   89:invokevirtual   #587 <Method void oa.a(float, float)>
		} else
	//*  42   92:goto            138
		if(j)
	//*  43   95:aload_0         
	//*  44   96:getfield        #71  <Field boolean j>
	//*  45   99:ifeq            138
			Log.w("MPAndroidChart", (new StringBuilder()).append("*Avoiding* setting chart dimens! width: ").append(l).append(", height: ").append(i1).toString());
	//   46  102:ldc1            #172 <String "MPAndroidChart">
	//   47  104:new             #358 <Class StringBuilder>
	//   48  107:dup             
	//   49  108:invokespecial   #359 <Method void StringBuilder()>
	//   50  111:ldc2            #589 <String "*Avoiding* setting chart dimens! width: ">
	//   51  114:invokevirtual   #365 <Method StringBuilder StringBuilder.append(String)>
	//   52  117:iload_1         
	//   53  118:invokevirtual   #583 <Method StringBuilder StringBuilder.append(int)>
	//   54  121:ldc2            #585 <String ", height: ">
	//   55  124:invokevirtual   #365 <Method StringBuilder StringBuilder.append(String)>
	//   56  127:iload_2         
	//   57  128:invokevirtual   #583 <Method StringBuilder StringBuilder.append(int)>
	//   58  131:invokevirtual   #371 <Method String StringBuilder.toString()>
	//   59  134:invokestatic    #591 <Method int Log.w(String, String)>
	//   60  137:pop             
		h();
	//   61  138:aload_0         
	//   62  139:invokevirtual   #593 <Method void h()>
		for(Iterator iterator = W.iterator(); iterator.hasNext(); post((Runnable)iterator.next()));
	//   63  142:aload_0         
	//   64  143:getfield        #119 <Field ArrayList W>
	//   65  146:invokevirtual   #597 <Method Iterator ArrayList.iterator()>
	//   66  149:astore          5
	//   67  151:aload           5
	//   68  153:invokeinterface #602 <Method boolean Iterator.hasNext()>
	//   69  158:ifeq            179
	//   70  161:aload_0         
	//   71  162:aload           5
	//   72  164:invokeinterface #606 <Method Object Iterator.next()>
	//   73  169:checkcast       #608 <Class Runnable>
	//   74  172:invokevirtual   #612 <Method boolean post(Runnable)>
	//   75  175:pop             
	//*  76  176:goto            151
		W.clear();
	//   77  179:aload_0         
	//   78  180:getfield        #119 <Field ArrayList W>
	//   79  183:invokevirtual   #615 <Method void ArrayList.clear()>
		super.onSizeChanged(l, i1, j1, k1);
	//   80  186:aload_0         
	//   81  187:iload_1         
	//   82  188:iload_2         
	//   83  189:iload_3         
	//   84  190:iload           4
	//   85  192:invokespecial   #617 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
	//   86  195:return          
	}

	public void setData(ma ma1)
	{
		A = ma1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field ma A>
		h = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #110 <Field boolean h>
		if(ma1 == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       15
			return;
	//    8   14:return          
		b(ma1.c(), ma1.g());
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #535 <Method float ma.c()>
	//   12   20:aload_1         
	//   13   21:invokevirtual   #532 <Method float ma.g()>
	//   14   24:invokevirtual   #621 <Method void b(float, float)>
		ma1 = ((ma) (A.h().iterator()));
	//   15   27:aload_0         
	//   16   28:getfield        #73  <Field ma A>
	//   17   31:invokevirtual   #624 <Method List ma.h()>
	//   18   34:invokeinterface #627 <Method Iterator List.iterator()>
	//   19   39:astore_1        
		do
		{
			if(!((Iterator) (ma1)).hasNext())
				break;
	//   20   40:aload_1         
	//   21   41:invokeinterface #602 <Method boolean Iterator.hasNext()>
	//   22   46:ifeq            94
			mz mz1 = (mz)((Iterator) (ma1)).next();
	//   23   49:aload_1         
	//   24   50:invokeinterface #606 <Method Object Iterator.next()>
	//   25   55:checkcast       #408 <Class mz>
	//   26   58:astore_2        
			if(mz1.t() || mz1.l() == E)
	//*  27   59:aload_2         
	//*  28   60:invokeinterface #630 <Method boolean mz.t()>
	//*  29   65:ifne            81
	//*  30   68:aload_2         
	//*  31   69:invokeinterface #632 <Method ml mz.l()>
	//*  32   74:aload_0         
	//*  33   75:getfield        #87  <Field me E>
	//*  34   78:if_acmpne       91
				mz1.b(((ml) (E)));
	//   35   81:aload_2         
	//   36   82:aload_0         
	//   37   83:getfield        #87  <Field me E>
	//   38   86:invokeinterface #635 <Method void mz.b(ml)>
		} while(true);
	//   39   91:goto            40
		h();
	//   40   94:aload_0         
	//   41   95:invokevirtual   #593 <Method void h()>
		if(j)
	//*  42   98:aload_0         
	//*  43   99:getfield        #71  <Field boolean j>
	//*  44  102:ifeq            114
			Log.i("MPAndroidChart", "Data is set.");
	//   45  105:ldc1            #172 <String "MPAndroidChart">
	//   46  107:ldc2            #637 <String "Data is set.">
	//   47  110:invokestatic    #277 <Method int Log.i(String, String)>
	//   48  113:pop             
	//   49  114:return          
	}

	public void setDescription(ll ll1)
	{
		L = ll1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #223 <Field ll L>
	//    3    5:return          
	}

	public void setDragDecelerationEnabled(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean c>
	//    3    5:return          
	}

	public void setDragDecelerationFrictionCoef(float f1)
	{
		float f2 = f1;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f1 < 0.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_0        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f2 = 0.0F;
	//    6    8:fconst_0        
	//    7    9:fstore_2        
		f1 = f2;
	//    8   10:fload_2         
	//    9   11:fstore_1        
		if(f2 >= 1.0F)
	//*  10   12:fload_2         
	//*  11   13:fconst_1        
	//*  12   14:fcmpl           
	//*  13   15:iflt            22
			f1 = 0.999F;
	//   14   18:ldc2            #643 <Float 0.999F>
	//   15   21:fstore_1        
		a = f1;
	//   16   22:aload_0         
	//   17   23:fload_1         
	//   18   24:putfield        #80  <Field float a>
	//   19   27:return          
	}

	public void setDrawMarkerViews(boolean flag)
	{
		setDrawMarkers(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #647 <Method void setDrawMarkers(boolean)>
	//    3    5:return          
	}

	public void setDrawMarkers(boolean flag)
	{
		U = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #114 <Field boolean U>
	//    3    5:return          
	}

	public void setExtraBottomOffset(float f1)
	{
		f = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #218 <Method float oc.b(float)>
	//    3    5:putfield        #106 <Field float f>
	//    4    8:return          
	}

	public void setExtraLeftOffset(float f1)
	{
		i = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #218 <Method float oc.b(float)>
	//    3    5:putfield        #108 <Field float i>
	//    4    8:return          
	}

	public void setExtraOffsets(float f1, float f2, float f3, float f4)
	{
		setExtraLeftOffset(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #653 <Method void setExtraLeftOffset(float)>
		setExtraTopOffset(f2);
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:invokevirtual   #656 <Method void setExtraTopOffset(float)>
		setExtraRightOffset(f3);
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:invokevirtual   #659 <Method void setExtraRightOffset(float)>
		setExtraBottomOffset(f4);
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:invokevirtual   #661 <Method void setExtraBottomOffset(float)>
	//   12   21:return          
	}

	public void setExtraRightOffset(float f1)
	{
		g = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #218 <Method float oc.b(float)>
	//    3    5:putfield        #104 <Field float g>
	//    4    8:return          
	}

	public void setExtraTopOffset(float f1)
	{
		d = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #218 <Method float oc.b(float)>
	//    3    5:putfield        #102 <Field float d>
	//    4    8:return          
	}

	public void setHardwareAccelerationEnabled(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #195 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          26
		{
			if(flag)
	//*   3    8:iload_1         
	//*   4    9:ifeq            19
			{
				setLayerType(2, ((Paint) (null)));
	//    5   12:aload_0         
	//    6   13:iconst_2        
	//    7   14:aconst_null     
	//    8   15:invokevirtual   #666 <Method void setLayerType(int, Paint)>
				return;
	//    9   18:return          
			} else
			{
				setLayerType(1, ((Paint) (null)));
	//   10   19:aload_0         
	//   11   20:iconst_1        
	//   12   21:aconst_null     
	//   13   22:invokevirtual   #666 <Method void setLayerType(int, Paint)>
				return;
	//   14   25:return          
			}
		} else
		{
			Log.e("MPAndroidChart", "Cannot enable/disable hardware acceleration for devices below API level 11.");
	//   15   26:ldc1            #172 <String "MPAndroidChart">
	//   16   28:ldc2            #668 <String "Cannot enable/disable hardware acceleration for devices below API level 11.">
	//   17   31:invokestatic    #179 <Method int Log.e(String, String)>
	//   18   34:pop             
			return;
	//   19   35:return          
		}
	}

	public void setHighlightPerTapEnabled(boolean flag)
	{
		D = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field boolean D>
	//    3    5:return          
	}

	public void setHighlighter(mi mi)
	{
		R = ((mq) (mi));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #486 <Field mq R>
	//    3    5:return          
	}

	protected void setLastHighlighted(mh amh[])
	{
		if(amh == null || amh.length <= 0 || amh[0] == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifle            15
	//*   5    9:aload_1         
	//*   6   10:iconst_0        
	//*   7   11:aaload          
	//*   8   12:ifnonnull       24
		{
			K.b(((mh) (null)));
	//    9   15:aload_0         
	//   10   16:getfield        #509 <Field nd K>
	//   11   19:aconst_null     
	//   12   20:invokevirtual   #676 <Method void nd.b(mh)>
			return;
	//   13   23:return          
		} else
		{
			K.b(amh[0]);
	//   14   24:aload_0         
	//   15   25:getfield        #509 <Field nd K>
	//   16   28:aload_1         
	//   17   29:iconst_0        
	//   18   30:aaload          
	//   19   31:invokevirtual   #676 <Method void nd.b(mh)>
			return;
	//   20   34:return          
		}
	}

	public void setLogEnabled(boolean flag)
	{
		j = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field boolean j>
	//    3    5:return          
	}

	public void setMarker(lk lk1)
	{
		T = lk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #399 <Field lk T>
	//    3    5:return          
	}

	public void setMarkerView(lk lk1)
	{
		setMarker(lk1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #682 <Method void setMarker(lk)>
	//    3    5:return          
	}

	public void setMaxHighlightDistance(float f1)
	{
		V = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #218 <Method float oc.b(float)>
	//    3    5:putfield        #112 <Field float V>
	//    4    8:return          
	}

	public void setNoDataText(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field String e>
	//    3    5:return          
	}

	public void setNoDataTextColor(int l)
	{
		G.setColor(l);
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field Paint G>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #256 <Method void Paint.setColor(int)>
	//    4    8:return          
	}

	public void setNoDataTextTypeface(Typeface typeface)
	{
		G.setTypeface(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field Paint G>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #311 <Method Typeface Paint.setTypeface(Typeface)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setOnChartGestureListener(ne ne)
	{
		b = ne;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #505 <Field ne b>
	//    3    5:return          
	}

	public void setOnChartValueSelectedListener(nf nf1)
	{
		M = nf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #380 <Field nf M>
	//    3    5:return          
	}

	public void setOnTouchListener(nd nd1)
	{
		K = nd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #509 <Field nd K>
	//    3    5:return          
	}

	public void setPaint(Paint paint, int l)
	{
		switch(l)
	//*   0    0:iload_2         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               7: 29
	//	               11: 35
		default:
			return;
	//    2   28:return          

		case 7: // '\007'
			G = paint;
	//    3   29:aload_0         
	//    4   30:aload_1         
	//    5   31:putfield        #247 <Field Paint G>
			return;
	//    6   34:return          

		case 11: // '\013'
			F = paint;
	//    7   35:aload_0         
	//    8   36:aload_1         
	//    9   37:putfield        #245 <Field Paint F>
			break;
		}
	//   10   40:return          
	}

	public void setRenderer(nj nj)
	{
		if(nj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			S = nj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #513 <Field nj S>
	//    5    9:return          
	}

	public void setTouchEnabled(boolean flag)
	{
		I = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field boolean I>
	//    3    5:return          
	}

	public void setUnbindEnabled(boolean flag)
	{
		k = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #121 <Field boolean k>
	//    3    5:return          
	}

	public boolean w()
	{
		return D;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean D>
	//    2    4:ireturn         
	}

	public boolean x()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean c>
	//    2    4:ireturn         
	}

	public boolean z()
	{
		return Q != null && Q.length > 0 && Q[0] != null;
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field mh[] Q>
	//    2    4:ifnull          24
	//    3    7:aload_0         
	//    4    8:getfield        #356 <Field mh[] Q>
	//    5   11:arraylength     
	//    6   12:ifle            24
	//    7   15:aload_0         
	//    8   16:getfield        #356 <Field mh[] Q>
	//    9   19:iconst_0        
	//   10   20:aaload          
	//   11   21:ifnonnull       26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	protected ma A;
	protected boolean D;
	protected me E;
	protected Paint F;
	protected Paint G;
	protected ln H;
	protected boolean I;
	protected np J;
	protected nd K;
	protected ll L;
	protected nf M;
	protected lm N;
	protected oa O;
	protected la P;
	protected mh Q[];
	protected mq R;
	protected nj S;
	protected lk T;
	protected boolean U;
	protected float V;
	protected ArrayList W;
	private float a;
	private ne b;
	private boolean c;
	private float d;
	private String e;
	private float f;
	private float g;
	private boolean h;
	private float i;
	protected boolean j;
	private boolean k;
}
