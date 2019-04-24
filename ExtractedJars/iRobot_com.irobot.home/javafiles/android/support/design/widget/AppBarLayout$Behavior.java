// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.c.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			HeaderBehavior, AppBarLayout, a, CoordinatorLayout

public static class AppBarLayout$Behavior extends HeaderBehavior
{
	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #59  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #40  <Field int a>
		//    7   11:invokevirtual   #63  <Method void Parcel.writeInt(int)>
			parcel.writeFloat(b);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #46  <Field float b>
		//   11   19:invokevirtual   #67  <Method void Parcel.writeFloat(float)>
			parcel.writeByte((byte)c);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #52  <Field boolean c>
		//   15   27:int2byte        
		//   16   28:invokevirtual   #71  <Method void Parcel.writeByte(byte)>
		//   17   31:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] a(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #31  <Method AppBarLayout$Behavior$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #34  <Method AppBarLayout$Behavior$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #38  <Method AppBarLayout$Behavior$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;
		float b;
		boolean c;

		static 
		{
		//    0    0:new             #12  <Class AppBarLayout$Behavior$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void AppBarLayout$Behavior$SavedState$1()>
		//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #32  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #38  <Method int Parcel.readInt()>
		//    7   11:putfield        #40  <Field int a>
			b = parcel.readFloat();
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #44  <Method float Parcel.readFloat()>
		//   11   19:putfield        #46  <Field float b>
			boolean flag;
			if(parcel.readByte() != 0)
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #50  <Method byte Parcel.readByte()>
		//*  14   26:ifeq            34
				flag = true;
		//   15   29:iconst_1        
		//   16   30:istore_3        
			else
		//*  17   31:goto            36
				flag = false;
		//   18   34:iconst_0        
		//   19   35:istore_3        
			c = flag;
		//   20   36:aload_0         
		//   21   37:iload_3         
		//   22   38:putfield        #52  <Field boolean c>
		//   23   41:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #55  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static abstract class a
	{

		public abstract boolean a(AppBarLayout appbarlayout);
	}


	static int a(AppBarLayout$Behavior appbarlayout$behavior)
	{
		return appbarlayout$behavior.b;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int b>
	//    2    4:ireturn         
	}

	private int a(AppBarLayout appbarlayout, int i)
	{
		int k = appbarlayout.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
	//    2    4:istore          4
		for(int j = 0; j < k; j++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          58
		{
			View view = appbarlayout.getChildAt(j);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
	//   11   19:astore          7
			int l = view.getTop();
	//   12   21:aload           7
	//   13   23:invokevirtual   #59  <Method int View.getTop()>
	//   14   26:istore          5
			int i1 = -i;
	//   15   28:iload_2         
	//   16   29:ineg            
	//   17   30:istore          6
			if(l <= i1 && view.getBottom() >= i1)
	//*  18   32:iload           5
	//*  19   34:iload           6
	//*  20   36:icmpgt          51
	//*  21   39:aload           7
	//*  22   41:invokevirtual   #62  <Method int View.getBottom()>
	//*  23   44:iload           6
	//*  24   46:icmplt          51
				return j;
	//   25   49:iload_3         
	//   26   50:ireturn         
		}

	//   27   51:iload_3         
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:istore_3        
	//*  31   55:goto            8
		return -1;
	//   32   58:iconst_m1       
	//   33   59:ireturn         
	}

	private void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, float f1)
	{
		int j = Math.abs(a() - i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method int a()>
	//    2    4:iload_3         
	//    3    5:isub            
	//    4    6:invokestatic    #71  <Method int Math.abs(int)>
	//    5    9:istore          5
		f1 = Math.abs(f1);
	//    6   11:fload           4
	//    7   13:invokestatic    #74  <Method float Math.abs(float)>
	//    8   16:fstore          4
		if(f1 > 0.0F)
	//*   9   18:fload           4
	//*  10   20:fconst_0        
	//*  11   21:fcmpl           
	//*  12   22:ifle            44
			j = Math.round(((float)j / f1) * 1000F) * 3;
	//   13   25:iload           5
	//   14   27:i2f             
	//   15   28:fload           4
	//   16   30:fdiv            
	//   17   31:ldc1            #75  <Float 1000F>
	//   18   33:fmul            
	//   19   34:invokestatic    #79  <Method int Math.round(float)>
	//   20   37:iconst_3        
	//   21   38:imul            
	//   22   39:istore          5
		else
	//*  23   41:goto            61
			j = (int)(((float)j / (float)appbarlayout.getHeight() + 1.0F) * 150F);
	//   24   44:iload           5
	//   25   46:i2f             
	//   26   47:aload_2         
	//   27   48:invokevirtual   #82  <Method int AppBarLayout.getHeight()>
	//   28   51:i2f             
	//   29   52:fdiv            
	//   30   53:fconst_1        
	//   31   54:fadd            
	//   32   55:ldc1            #83  <Float 150F>
	//   33   57:fmul            
	//   34   58:f2i             
	//   35   59:istore          5
		a(coordinatorlayout, appbarlayout, i, j);
	//   36   61:aload_0         
	//   37   62:aload_1         
	//   38   63:aload_2         
	//   39   64:iload_3         
	//   40   65:iload           5
	//   41   67:invokespecial   #86  <Method void a(CoordinatorLayout, AppBarLayout, int, int)>
	//   42   70:return          
	}

	private void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j)
	{
		int k = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method int a()>
	//    2    4:istore          5
		if(k == i)
	//*   3    6:iload           5
	//*   4    8:iload_3         
	//*   5    9:icmpne          37
		{
			if(c != null && c.isRunning())
	//*   6   12:aload_0         
	//*   7   13:getfield        #88  <Field ValueAnimator c>
	//*   8   16:ifnull          36
	//*   9   19:aload_0         
	//*  10   20:getfield        #88  <Field ValueAnimator c>
	//*  11   23:invokevirtual   #94  <Method boolean ValueAnimator.isRunning()>
	//*  12   26:ifeq            36
				c.cancel();
	//   13   29:aload_0         
	//   14   30:getfield        #88  <Field ValueAnimator c>
	//   15   33:invokevirtual   #97  <Method void ValueAnimator.cancel()>
			return;
	//   16   36:return          
		}
		if(c == null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #88  <Field ValueAnimator c>
	//*  19   41:ifnonnull       85
		{
			c = new ValueAnimator();
	//   20   44:aload_0         
	//   21   45:new             #90  <Class ValueAnimator>
	//   22   48:dup             
	//   23   49:invokespecial   #98  <Method void ValueAnimator()>
	//   24   52:putfield        #88  <Field ValueAnimator c>
			c.setInterpolator(((android.animation.TimeInterpolator) (android.support.design.widget.a.e)));
	//   25   55:aload_0         
	//   26   56:getfield        #88  <Field ValueAnimator c>
	//   27   59:getstatic       #103 <Field Interpolator a.e>
	//   28   62:invokevirtual   #107 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			c.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(coordinatorlayout, appbarlayout) {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					c.a_(a, ((View) (b)), ((Integer)valueanimator.getAnimatedValue()).intValue());
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field AppBarLayout$Behavior c>
				//    2    4:aload_0         
				//    3    5:getfield        #25  <Field CoordinatorLayout a>
				//    4    8:aload_0         
				//    5    9:getfield        #27  <Field AppBarLayout b>
				//    6   12:aload_1         
				//    7   13:invokevirtual   #39  <Method Object ValueAnimator.getAnimatedValue()>
				//    8   16:checkcast       #41  <Class Integer>
				//    9   19:invokevirtual   #45  <Method int Integer.intValue()>
				//   10   22:invokevirtual   #49  <Method int AppBarLayout$Behavior.a_(CoordinatorLayout, View, int)>
				//   11   25:pop             
				//   12   26:return          
				}

				final CoordinatorLayout a;
				final AppBarLayout b;
				final AppBarLayout.Behavior c;

			
			{
				c = AppBarLayout.Behavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AppBarLayout$Behavior c>
				a = coordinatorlayout;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field CoordinatorLayout a>
				b = appbarlayout;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field AppBarLayout b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   29   65:aload_0         
	//   30   66:getfield        #88  <Field ValueAnimator c>
	//   31   69:new             #10  <Class AppBarLayout$Behavior$1>
	//   32   72:dup             
	//   33   73:aload_0         
	//   34   74:aload_1         
	//   35   75:aload_2         
	//   36   76:invokespecial   #110 <Method void AppBarLayout$Behavior$1(AppBarLayout$Behavior, CoordinatorLayout, AppBarLayout)>
	//   37   79:invokevirtual   #114 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		} else
	//*  38   82:goto            92
		{
			c.cancel();
	//   39   85:aload_0         
	//   40   86:getfield        #88  <Field ValueAnimator c>
	//   41   89:invokevirtual   #97  <Method void ValueAnimator.cancel()>
		}
		c.setDuration(Math.min(j, 600));
	//   42   92:aload_0         
	//   43   93:getfield        #88  <Field ValueAnimator c>
	//   44   96:iload           4
	//   45   98:sipush          600
	//   46  101:invokestatic    #118 <Method int Math.min(int, int)>
	//   47  104:i2l             
	//   48  105:invokevirtual   #122 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   49  108:pop             
		c.setIntValues(new int[] {
			k, i
		});
	//   50  109:aload_0         
	//   51  110:getfield        #88  <Field ValueAnimator c>
	//   52  113:iconst_2        
	//   53  114:newarray        int[]
	//   54  116:dup             
	//   55  117:iconst_0        
	//   56  118:iload           5
	//   57  120:iastore         
	//   58  121:dup             
	//   59  122:iconst_1        
	//   60  123:iload_3         
	//   61  124:iastore         
	//   62  125:invokevirtual   #126 <Method void ValueAnimator.setIntValues(int[])>
		c.start();
	//   63  128:aload_0         
	//   64  129:getfield        #88  <Field ValueAnimator c>
	//   65  132:invokevirtual   #129 <Method void ValueAnimator.start()>
	//   66  135:return          
	}

	private void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, boolean flag)
	{
		int k;
		boolean flag1;
		boolean flag2;
		View view;
		view = c(appbarlayout, i);
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #133 <Method View c(AppBarLayout, int)>
	//    3    5:astore          10
		if(view == null)
			break MISSING_BLOCK_LABEL_162;
	//    4    7:aload           10
	//    5    9:ifnull          162
		k = ((ams)view.getLayoutParams()).a();
	//    6   12:aload           10
	//    7   14:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   17:checkcast       #139 <Class AppBarLayout$LayoutParams>
	//    9   20:invokevirtual   #140 <Method int android.support.design.widget.AppBarLayout$LayoutParams.a()>
	//   10   23:istore          6
		flag2 = false;
	//   11   25:iconst_0        
	//   12   26:istore          9
		flag1 = flag2;
	//   13   28:iload           9
	//   14   30:istore          8
		if((k & 1) == 0) goto _L2; else goto _L1
	//   15   32:iload           6
	//   16   34:iconst_1        
	//   17   35:iand            
	//   18   36:ifeq            123
_L1:
		int l = s.j(view);
	//   19   39:aload           10
	//   20   41:invokestatic    #146 <Method int s.j(View)>
	//   21   44:istore          7
		if(j <= 0 || (k & 0xc) == 0) goto _L4; else goto _L3
	//   22   46:iload           4
	//   23   48:ifle            87
	//   24   51:iload           6
	//   25   53:bipush          12
	//   26   55:iand            
	//   27   56:ifeq            87
_L3:
		flag1 = flag2;
	//   28   59:iload           9
	//   29   61:istore          8
		if(-i < view.getBottom() - l - appbarlayout.getTopInset()) goto _L2; else goto _L5
	//   30   63:iload_3         
	//   31   64:ineg            
	//   32   65:aload           10
	//   33   67:invokevirtual   #62  <Method int View.getBottom()>
	//   34   70:iload           7
	//   35   72:isub            
	//   36   73:aload_2         
	//   37   74:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
	//   38   77:isub            
	//   39   78:icmplt          123
_L5:
		flag1 = true;
	//   40   81:iconst_1        
	//   41   82:istore          8
		break; /* Loop/switch isn't completed */
	//   42   84:goto            123
_L4:
		flag1 = flag2;
	//   43   87:iload           9
	//   44   89:istore          8
		if((k & 2) == 0)
			break; /* Loop/switch isn't completed */
	//   45   91:iload           6
	//   46   93:iconst_2        
	//   47   94:iand            
	//   48   95:ifeq            123
		flag1 = flag2;
	//   49   98:iload           9
	//   50  100:istore          8
		if(-i < view.getBottom() - l - appbarlayout.getTopInset()) goto _L2; else goto _L5
	//   51  102:iload_3         
	//   52  103:ineg            
	//   53  104:aload           10
	//   54  106:invokevirtual   #62  <Method int View.getBottom()>
	//   55  109:iload           7
	//   56  111:isub            
	//   57  112:aload_2         
	//   58  113:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
	//   59  116:isub            
	//   60  117:icmplt          123
	//*  61  120:goto            81
_L2:
		flag1 = appbarlayout.a(flag1);
	//   62  123:aload_2         
	//   63  124:iload           8
	//   64  126:invokevirtual   #152 <Method boolean android.support.design.widget.AppBarLayout.a(boolean)>
	//   65  129:istore          8
		if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && d(coordinatorlayout, appbarlayout)))
	//*  66  131:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
	//*  67  134:bipush          11
	//*  68  136:icmplt          162
	//*  69  139:iload           5
	//*  70  141:ifne            158
	//*  71  144:iload           8
	//*  72  146:ifeq            162
	//*  73  149:aload_0         
	//*  74  150:aload_1         
	//*  75  151:aload_2         
	//*  76  152:invokespecial   #160 <Method boolean d(CoordinatorLayout, AppBarLayout)>
	//*  77  155:ifeq            162
			appbarlayout.jumpDrawablesToCurrentState();
	//   78  158:aload_2         
	//   79  159:invokevirtual   #163 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
	//   80  162:return          
	}

	private static boolean a(int i, int j)
	{
		return (i & j) == j;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iand            
	//    3    3:iload_1         
	//    4    4:icmpne          9
	//    5    7:iconst_1        
	//    6    8:ireturn         
	//    7    9:iconst_0        
	//    8   10:ireturn         
	}

	private int b(AppBarLayout appbarlayout, int i)
	{
		int l = Math.abs(i);
	//    0    0:iload_2         
	//    1    1:invokestatic    #71  <Method int Math.abs(int)>
	//    2    4:istore          6
		int i1 = appbarlayout.getChildCount();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
	//    5   10:istore          7
		int k = 0;
	//    6   12:iconst_0        
	//    7   13:istore          5
		int j = 0;
	//    8   15:iconst_0        
	//    9   16:istore          4
		do
		{
			if(j >= i1)
				break;
	//   10   18:iload           4
	//   11   20:iload           7
	//   12   22:icmpge          217
			View view = appbarlayout.getChildAt(j);
	//   13   25:aload_1         
	//   14   26:iload           4
	//   15   28:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
	//   16   31:astore          8
			ams ams = (ams)view.getLayoutParams();
	//   17   33:aload           8
	//   18   35:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   38:checkcast       #139 <Class AppBarLayout$LayoutParams>
	//   20   41:astore          9
			Interpolator interpolator = ams.b();
	//   21   43:aload           9
	//   22   45:invokevirtual   #167 <Method Interpolator AppBarLayout$LayoutParams.b()>
	//   23   48:astore          10
			if(l >= view.getTop() && l <= view.getBottom())
	//*  24   50:iload           6
	//*  25   52:aload           8
	//*  26   54:invokevirtual   #59  <Method int View.getTop()>
	//*  27   57:icmplt          208
	//*  28   60:iload           6
	//*  29   62:aload           8
	//*  30   64:invokevirtual   #62  <Method int View.getBottom()>
	//*  31   67:icmpgt          208
			{
				if(interpolator != null)
	//*  32   70:aload           10
	//*  33   72:ifnull          217
				{
					int j1 = ams.a();
	//   34   75:aload           9
	//   35   77:invokevirtual   #140 <Method int android.support.design.widget.AppBarLayout$LayoutParams.a()>
	//   36   80:istore          7
					j = k;
	//   37   82:iload           5
	//   38   84:istore          4
					if((j1 & 1) != 0)
	//*  39   86:iload           7
	//*  40   88:iconst_1        
	//*  41   89:iand            
	//*  42   90:ifeq            135
					{
						k = 0 + (view.getHeight() + ams.topMargin + ams.bottomMargin);
	//   43   93:iconst_0        
	//   44   94:aload           8
	//   45   96:invokevirtual   #168 <Method int View.getHeight()>
	//   46   99:aload           9
	//   47  101:getfield        #171 <Field int AppBarLayout$LayoutParams.topMargin>
	//   48  104:iadd            
	//   49  105:aload           9
	//   50  107:getfield        #174 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   51  110:iadd            
	//   52  111:iadd            
	//   53  112:istore          5
						j = k;
	//   54  114:iload           5
	//   55  116:istore          4
						if((j1 & 2) != 0)
	//*  56  118:iload           7
	//*  57  120:iconst_2        
	//*  58  121:iand            
	//*  59  122:ifeq            135
							j = k - s.j(view);
	//   60  125:iload           5
	//   61  127:aload           8
	//   62  129:invokestatic    #146 <Method int s.j(View)>
	//   63  132:isub            
	//   64  133:istore          4
					}
					k = j;
	//   65  135:iload           4
	//   66  137:istore          5
					if(s.q(view))
	//*  67  139:aload           8
	//*  68  141:invokestatic    #178 <Method boolean s.q(View)>
	//*  69  144:ifeq            156
						k = j - appbarlayout.getTopInset();
	//   70  147:iload           4
	//   71  149:aload_1         
	//   72  150:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
	//   73  153:isub            
	//   74  154:istore          5
					if(k > 0)
	//*  75  156:iload           5
	//*  76  158:ifle            217
					{
						j = view.getTop();
	//   77  161:aload           8
	//   78  163:invokevirtual   #59  <Method int View.getTop()>
	//   79  166:istore          4
						float f1 = k;
	//   80  168:iload           5
	//   81  170:i2f             
	//   82  171:fstore_3        
						j = Math.round(f1 * interpolator.getInterpolation((float)(l - j) / f1));
	//   83  172:fload_3         
	//   84  173:aload           10
	//   85  175:iload           6
	//   86  177:iload           4
	//   87  179:isub            
	//   88  180:i2f             
	//   89  181:fload_3         
	//   90  182:fdiv            
	//   91  183:invokeinterface #183 <Method float Interpolator.getInterpolation(float)>
	//   92  188:fmul            
	//   93  189:invokestatic    #79  <Method int Math.round(float)>
	//   94  192:istore          4
						return Integer.signum(i) * (view.getTop() + j);
	//   95  194:iload_2         
	//   96  195:invokestatic    #188 <Method int Integer.signum(int)>
	//   97  198:aload           8
	//   98  200:invokevirtual   #59  <Method int View.getTop()>
	//   99  203:iload           4
	//  100  205:iadd            
	//  101  206:imul            
	//  102  207:ireturn         
					}
				}
				break;
			}
			j++;
	//  103  208:iload           4
	//  104  210:iconst_1        
	//  105  211:iadd            
	//  106  212:istore          4
		} while(true);
	//  107  214:goto            18
		return i;
	//  108  217:iload_2         
	//  109  218:ireturn         
	}

	private static View c(AppBarLayout appbarlayout, int i)
	{
		int j = Math.abs(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #71  <Method int Math.abs(int)>
	//    2    4:istore_2        
		int k = appbarlayout.getChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
	//    5    9:istore_3        
		for(i = 0; i < k; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          52
		{
			View view = appbarlayout.getChildAt(i);
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
	//   14   22:astore          4
			if(j >= view.getTop() && j <= view.getBottom())
	//*  15   24:iload_2         
	//*  16   25:aload           4
	//*  17   27:invokevirtual   #59  <Method int View.getTop()>
	//*  18   30:icmplt          45
	//*  19   33:iload_2         
	//*  20   34:aload           4
	//*  21   36:invokevirtual   #62  <Method int View.getBottom()>
	//*  22   39:icmpgt          45
				return view;
	//   23   42:aload           4
	//   24   44:areturn         
		}

	//   25   45:iload_1         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_1        
	//*  29   49:goto            12
		return null;
	//   30   52:aconst_null     
	//   31   53:areturn         
	}

	private void c(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		int i1 = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method int a()>
	//    2    4:istore          7
		int k = a(appbarlayout, i1);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:iload           7
	//    6   10:invokespecial   #191 <Method int a(AppBarLayout, int)>
	//    7   13:istore          5
		if(k >= 0)
	//*   8   15:iload           5
	//*   9   17:iflt            193
		{
			View view = appbarlayout.getChildAt(k);
	//   10   20:aload_2         
	//   11   21:iload           5
	//   12   23:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
	//   13   26:astore          9
			int j1 = ((ams)view.getLayoutParams()).a();
	//   14   28:aload           9
	//   15   30:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   33:checkcast       #139 <Class AppBarLayout$LayoutParams>
	//   17   36:invokevirtual   #140 <Method int android.support.design.widget.AppBarLayout$LayoutParams.a()>
	//   18   39:istore          8
			if((j1 & 0x11) == 17)
	//*  19   41:iload           8
	//*  20   43:bipush          17
	//*  21   45:iand            
	//*  22   46:bipush          17
	//*  23   48:icmpne          193
			{
				int l = -view.getTop();
	//   24   51:aload           9
	//   25   53:invokevirtual   #59  <Method int View.getTop()>
	//   26   56:ineg            
	//   27   57:istore          6
				int i = -view.getBottom();
	//   28   59:aload           9
	//   29   61:invokevirtual   #62  <Method int View.getBottom()>
	//   30   64:ineg            
	//   31   65:istore_3        
				int j = i;
	//   32   66:iload_3         
	//   33   67:istore          4
				if(k == appbarlayout.getChildCount() - 1)
	//*  34   69:iload           5
	//*  35   71:aload_2         
	//*  36   72:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
	//*  37   75:iconst_1        
	//*  38   76:isub            
	//*  39   77:icmpne          88
					j = i + appbarlayout.getTopInset();
	//   40   80:iload_3         
	//   41   81:aload_2         
	//   42   82:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
	//   43   85:iadd            
	//   44   86:istore          4
				if(a(j1, 2))
	//*  45   88:iload           8
	//*  46   90:iconst_2        
	//*  47   91:invokestatic    #193 <Method boolean a(int, int)>
	//*  48   94:ifeq            113
				{
					i = j + s.j(view);
	//   49   97:iload           4
	//   50   99:aload           9
	//   51  101:invokestatic    #146 <Method int s.j(View)>
	//   52  104:iadd            
	//   53  105:istore_3        
					k = l;
	//   54  106:iload           6
	//   55  108:istore          5
				} else
	//*  56  110:goto            157
				{
					k = l;
	//   57  113:iload           6
	//   58  115:istore          5
					i = j;
	//   59  117:iload           4
	//   60  119:istore_3        
					if(a(j1, 5))
	//*  61  120:iload           8
	//*  62  122:iconst_5        
	//*  63  123:invokestatic    #193 <Method boolean a(int, int)>
	//*  64  126:ifeq            157
					{
						i = s.j(view) + j;
	//   65  129:aload           9
	//   66  131:invokestatic    #146 <Method int s.j(View)>
	//   67  134:iload           4
	//   68  136:iadd            
	//   69  137:istore_3        
						if(i1 < i)
	//*  70  138:iload           7
	//*  71  140:iload_3         
	//*  72  141:icmpge          153
						{
							k = i;
	//   73  144:iload_3         
	//   74  145:istore          5
							i = j;
	//   75  147:iload           4
	//   76  149:istore_3        
						} else
	//*  77  150:goto            157
						{
							k = l;
	//   78  153:iload           6
	//   79  155:istore          5
						}
					}
				}
				j = k;
	//   80  157:iload           5
	//   81  159:istore          4
				if(i1 < (i + k) / 2)
	//*  82  161:iload           7
	//*  83  163:iload_3         
	//*  84  164:iload           5
	//*  85  166:iadd            
	//*  86  167:iconst_2        
	//*  87  168:idiv            
	//*  88  169:icmpge          175
					j = i;
	//   89  172:iload_3         
	//   90  173:istore          4
				a(coordinatorlayout, appbarlayout, android.support.v4.c.a.a(j, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
	//   91  175:aload_0         
	//   92  176:aload_1         
	//   93  177:aload_2         
	//   94  178:iload           4
	//   95  180:aload_2         
	//   96  181:invokevirtual   #196 <Method int AppBarLayout.getTotalScrollRange()>
	//   97  184:ineg            
	//   98  185:iconst_0        
	//   99  186:invokestatic    #201 <Method int a.a(int, int, int)>
	//  100  189:fconst_0        
	//  101  190:invokespecial   #203 <Method void a(CoordinatorLayout, AppBarLayout, int, float)>
			}
		}
	//  102  193:return          
	}

	private boolean d(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		coordinatorlayout = ((CoordinatorLayout) (coordinatorlayout.d(((View) (appbarlayout)))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #208 <Method List CoordinatorLayout.d(View)>
	//    3    5:astore_1        
		int j = ((List) (coordinatorlayout)).size();
	//    4    6:aload_1         
	//    5    7:invokeinterface #213 <Method int List.size()>
	//    6   12:istore          4
		boolean flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_3        
	//*  11   19:iload_3         
	//*  12   20:iload           4
	//*  13   22:icmpge          75
		{
			appbarlayout = ((AppBarLayout) (((CoordinatorLayout.c)((View)((List) (coordinatorlayout)).get(i)).getLayoutParams()).b()));
	//   14   25:aload_1         
	//   15   26:iload_3         
	//   16   27:invokeinterface #217 <Method Object List.get(int)>
	//   17   32:checkcast       #56  <Class View>
	//   18   35:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   38:checkcast       #219 <Class CoordinatorLayout$c>
	//   20   41:invokevirtual   #222 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   21   44:astore_2        
			if(appbarlayout instanceof ViewBehavior)
	//*  22   45:aload_2         
	//*  23   46:instanceof      #224 <Class AppBarLayout$ScrollingViewBehavior>
	//*  24   49:ifeq            68
			{
				if(((ViewBehavior)appbarlayout).d() != 0)
	//*  25   52:aload_2         
	//*  26   53:checkcast       #224 <Class AppBarLayout$ScrollingViewBehavior>
	//*  27   56:invokevirtual   #226 <Method int AppBarLayout$ScrollingViewBehavior.d()>
	//*  28   59:ifeq            65
					flag = true;
	//   29   62:iconst_1        
	//   30   63:istore          5
				return flag;
	//   31   65:iload           5
	//   32   67:ireturn         
			}
		}

	//   33   68:iload_3         
	//   34   69:iconst_1        
	//   35   70:iadd            
	//   36   71:istore_3        
	//*  37   72:goto            19
		return false;
	//   38   75:iconst_0        
	//   39   76:ireturn         
	}

	int a()
	{
		return b() + b;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #228 <Method int b()>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field int b>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	int a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
	{
		int l = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method int a()>
	//    2    4:istore          6
		if(j != 0 && l >= j && l <= k)
	//*   3    6:iload           4
	//*   4    8:ifeq            133
	//*   5   11:iload           6
	//*   6   13:iload           4
	//*   7   15:icmplt          133
	//*   8   18:iload           6
	//*   9   20:iload           5
	//*  10   22:icmpgt          133
		{
			j = android.support.v4.c.a.a(i, j, k);
	//   11   25:iload_3         
	//   12   26:iload           4
	//   13   28:iload           5
	//   14   30:invokestatic    #201 <Method int a.a(int, int, int)>
	//   15   33:istore          4
			if(l != j)
	//*  16   35:iload           6
	//*  17   37:iload           4
	//*  18   39:icmpeq          138
			{
				if(appbarlayout.b())
	//*  19   42:aload_2         
	//*  20   43:invokevirtual   #231 <Method boolean AppBarLayout.b()>
	//*  21   46:ifeq            60
					i = b(appbarlayout, j);
	//   22   49:aload_0         
	//   23   50:aload_2         
	//   24   51:iload           4
	//   25   53:invokespecial   #233 <Method int b(AppBarLayout, int)>
	//   26   56:istore_3        
				else
	//*  27   57:goto            63
					i = j;
	//   28   60:iload           4
	//   29   62:istore_3        
				boolean flag = a(i);
	//   30   63:aload_0         
	//   31   64:iload_3         
	//   32   65:invokevirtual   #236 <Method boolean a(int)>
	//   33   68:istore          7
				b = j - i;
	//   34   70:aload_0         
	//   35   71:iload           4
	//   36   73:iload_3         
	//   37   74:isub            
	//   38   75:putfield        #45  <Field int b>
				if(!flag && appbarlayout.b())
	//*  39   78:iload           7
	//*  40   80:ifne            95
	//*  41   83:aload_2         
	//*  42   84:invokevirtual   #231 <Method boolean AppBarLayout.b()>
	//*  43   87:ifeq            95
					coordinatorlayout.b(((View) (appbarlayout)));
	//   44   90:aload_1         
	//   45   91:aload_2         
	//   46   92:invokevirtual   #239 <Method void CoordinatorLayout.b(View)>
				appbarlayout.a(b());
	//   47   95:aload_2         
	//   48   96:aload_0         
	//   49   97:invokevirtual   #228 <Method int b()>
	//   50  100:invokevirtual   #242 <Method void android.support.design.widget.AppBarLayout.a(int)>
				if(j < l)
	//*  51  103:iload           4
	//*  52  105:iload           6
	//*  53  107:icmpge          115
					i = -1;
	//   54  110:iconst_m1       
	//   55  111:istore_3        
				else
	//*  56  112:goto            117
					i = 1;
	//   57  115:iconst_1        
	//   58  116:istore_3        
				a(coordinatorlayout, appbarlayout, j, i, false);
	//   59  117:aload_0         
	//   60  118:aload_1         
	//   61  119:aload_2         
	//   62  120:iload           4
	//   63  122:iload_3         
	//   64  123:iconst_0        
	//   65  124:invokespecial   #244 <Method void a(CoordinatorLayout, AppBarLayout, int, int, boolean)>
				return l - j;
	//   66  127:iload           6
	//   67  129:iload           4
	//   68  131:isub            
	//   69  132:ireturn         
			}
		} else
		{
			b = 0;
	//   70  133:aload_0         
	//   71  134:iconst_0        
	//   72  135:putfield        #45  <Field int b>
		}
		return 0;
	//   73  138:iconst_0        
	//   74  139:ireturn         
	}

	volatile int a(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
	{
		return a(coordinatorlayout, (AppBarLayout)view, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #247 <Method int a(CoordinatorLayout, AppBarLayout, int, int, int)>
	//    8   14:ireturn         
	}

	int a(View view)
	{
		return c((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #250 <Method int c(AppBarLayout)>
	//    4    8:ireturn         
	}

	void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		c(coordinatorlayout, appbarlayout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #252 <Method void c(CoordinatorLayout, AppBarLayout)>
	//    4    6:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #12  <Class AppBarLayout$Behavior$SavedState>
	//*   2    4:ifeq            47
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    3    7:aload_3         
	//    4    8:checkcast       #12  <Class AppBarLayout$Behavior$SavedState>
	//    5   11:astore_3        
			super.a(coordinatorlayout, ((View) (appbarlayout)), ((SavedState) (parcelable)).a());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #256 <Method Parcelable android.support.design.widget.AppBarLayout$Behavior$SavedState.a()>
	//   11   19:invokespecial   #259 <Method void android.support.design.widget.HeaderBehavior.a(CoordinatorLayout, View, Parcelable)>
			d = ((SavedState) (parcelable)).a;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:getfield        #261 <Field int android.support.design.widget.AppBarLayout$Behavior$SavedState.a>
	//   15   27:putfield        #38  <Field int d>
			f = ((SavedState) (parcelable)).b;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:getfield        #263 <Field float AppBarLayout$Behavior$SavedState.b>
	//   19   35:putfield        #265 <Field float f>
			e = ((SavedState) (parcelable)).c;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:getfield        #267 <Field boolean AppBarLayout$Behavior$SavedState.c>
	//   23   43:putfield        #269 <Field boolean e>
			return;
	//   24   46:return          
		} else
		{
			super.a(coordinatorlayout, ((View) (appbarlayout)), parcelable);
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:aload_2         
	//   28   50:aload_3         
	//   29   51:invokespecial   #259 <Method void android.support.design.widget.HeaderBehavior.a(CoordinatorLayout, View, Parcelable)>
			d = -1;
	//   30   54:aload_0         
	//   31   55:iconst_m1       
	//   32   56:putfield        #38  <Field int d>
			return;
	//   33   59:return          
		}
	}

	public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i)
	{
		if(i == 0)
	//*   0    0:iload           4
	//*   1    2:ifne            11
			c(coordinatorlayout, appbarlayout);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:invokespecial   #252 <Method void c(CoordinatorLayout, AppBarLayout)>
		g = new WeakReference(((Object) (view)));
	//    6   11:aload_0         
	//    7   12:new             #272 <Class WeakReference>
	//    8   15:dup             
	//    9   16:aload_3         
	//   10   17:invokespecial   #275 <Method void WeakReference(Object)>
	//   11   20:putfield        #277 <Field WeakReference g>
	//   12   23:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int k, int l, 
			int i1)
	{
		if(l < 0)
	//*   0    0:iload           7
	//*   1    2:ifge            20
			b(coordinatorlayout, ((View) (appbarlayout)), l, -appbarlayout.getDownNestedScrollRange(), 0);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:iload           7
	//    6   10:aload_2         
	//    7   11:invokevirtual   #281 <Method int AppBarLayout.getDownNestedScrollRange()>
	//    8   14:ineg            
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #283 <Method int b(CoordinatorLayout, View, int, int, int)>
	//   11   19:pop             
	//   12   20:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[], int k)
	{
		if(j != 0)
	//*   0    0:iload           5
	//*   1    2:ifeq            70
		{
			if(j < 0)
	//*   2    5:iload           5
	//*   3    7:ifge            37
			{
				k = -appbarlayout.getTotalScrollRange();
	//    4   10:aload_2         
	//    5   11:invokevirtual   #196 <Method int AppBarLayout.getTotalScrollRange()>
	//    6   14:ineg            
	//    7   15:istore          7
				int l = appbarlayout.getDownNestedPreScrollRange();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #287 <Method int AppBarLayout.getDownNestedPreScrollRange()>
	//   10   21:istore          8
				i = k;
	//   11   23:iload           7
	//   12   25:istore          4
				k = l + k;
	//   13   27:iload           8
	//   14   29:iload           7
	//   15   31:iadd            
	//   16   32:istore          7
			} else
	//*  17   34:goto            47
			{
				i = -appbarlayout.getUpNestedPreScrollRange();
	//   18   37:aload_2         
	//   19   38:invokevirtual   #290 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//   20   41:ineg            
	//   21   42:istore          4
				k = 0;
	//   22   44:iconst_0        
	//   23   45:istore          7
			}
			if(i != k)
	//*  24   47:iload           4
	//*  25   49:iload           7
	//*  26   51:icmpeq          70
				ai[1] = b(coordinatorlayout, ((View) (appbarlayout)), j, i, k);
	//   27   54:aload           6
	//   28   56:iconst_1        
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:aload_2         
	//   32   60:iload           5
	//   33   62:iload           4
	//   34   64:iload           7
	//   35   66:invokevirtual   #283 <Method int b(CoordinatorLayout, View, int, int, int)>
	//   36   69:iastore         
		}
	//   37   70:return          
	}

	volatile void a(CoordinatorLayout coordinatorlayout, View view)
	{
		a(coordinatorlayout, (AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:invokevirtual   #293 <Method void a(CoordinatorLayout, AppBarLayout)>
	//    5    9:return          
	}

	public volatile void a(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
	{
		a(coordinatorlayout, (AppBarLayout)view, parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #295 <Method void a(CoordinatorLayout, AppBarLayout, Parcelable)>
	//    6   10:return          
	}

	public volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i)
	{
		a(coordinatorlayout, (AppBarLayout)view, view1, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #298 <Method void a(CoordinatorLayout, AppBarLayout, View, int)>
	//    7   12:return          
	}

	public volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l, 
			int i1)
	{
		a(coordinatorlayout, (AppBarLayout)view, view1, i, j, k, l, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:iload           7
	//    9   15:iload           8
	//   10   17:invokevirtual   #301 <Method void a(CoordinatorLayout, AppBarLayout, View, int, int, int, int, int)>
	//   11   20:return          
	}

	public volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[], int k)
	{
		a(coordinatorlayout, (AppBarLayout)view, view1, i, j, ai, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:aload           6
	//    8   13:iload           7
	//    9   15:invokevirtual   #304 <Method void a(CoordinatorLayout, AppBarLayout, View, int, int, int[], int)>
	//   10   18:return          
	}

	public volatile boolean a(int i)
	{
		return super.a(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #305 <Method boolean android.support.design.widget.HeaderBehavior.a(int)>
	//    3    5:ireturn         
	}

	boolean a(AppBarLayout appbarlayout)
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #308 <Field AppBarLayout$Behavior$a h>
	//*   2    4:ifnull          16
			return h.a(appbarlayout);
	//    3    7:aload_0         
	//    4    8:getfield        #308 <Field AppBarLayout$Behavior$a h>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #310 <Method boolean android.support.design.widget.AppBarLayout$Behavior$a.a(AppBarLayout)>
	//    7   15:ireturn         
		appbarlayout = ((AppBarLayout) (g));
	//    8   16:aload_0         
	//    9   17:getfield        #277 <Field WeakReference g>
	//   10   20:astore_1        
		boolean flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		if(appbarlayout != null)
	//*  13   23:aload_1         
	//*  14   24:ifnull          61
		{
			appbarlayout = ((AppBarLayout) ((View)g.get()));
	//   15   27:aload_0         
	//   16   28:getfield        #277 <Field WeakReference g>
	//   17   31:invokevirtual   #313 <Method Object WeakReference.get()>
	//   18   34:checkcast       #56  <Class View>
	//   19   37:astore_1        
			if(appbarlayout != null && ((View) (appbarlayout)).isShown() && !((View) (appbarlayout)).canScrollVertically(-1))
	//*  20   38:aload_1         
	//*  21   39:ifnull          59
	//*  22   42:aload_1         
	//*  23   43:invokevirtual   #316 <Method boolean View.isShown()>
	//*  24   46:ifeq            59
	//*  25   49:aload_1         
	//*  26   50:iconst_m1       
	//*  27   51:invokevirtual   #319 <Method boolean View.canScrollVertically(int)>
	//*  28   54:ifne            59
				return true;
	//   29   57:iconst_1        
	//   30   58:ireturn         
			flag = false;
	//   31   59:iconst_0        
	//   32   60:istore_2        
		}
		return flag;
	//   33   61:iload_2         
	//   34   62:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
	{
		boolean flag = super.a(coordinatorlayout, ((View) (appbarlayout)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #323 <Method boolean android.support.design.widget.HeaderBehavior.a(CoordinatorLayout, View, int)>
	//    5    7:istore          5
		int j = appbarlayout.getPendingAction();
	//    6    9:aload_2         
	//    7   10:invokevirtual   #326 <Method int AppBarLayout.getPendingAction()>
	//    8   13:istore          4
		if(d >= 0 && (j & 8) == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #38  <Field int d>
	//*  11   19:iflt            101
	//*  12   22:iload           4
	//*  13   24:bipush          8
	//*  14   26:iand            
	//*  15   27:ifne            101
		{
			View view = appbarlayout.getChildAt(d);
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #38  <Field int d>
	//   19   35:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
	//   20   38:astore          6
			j = -view.getBottom();
	//   21   40:aload           6
	//   22   42:invokevirtual   #62  <Method int View.getBottom()>
	//   23   45:ineg            
	//   24   46:istore          4
			if(e)
	//*  25   48:aload_0         
	//*  26   49:getfield        #269 <Field boolean e>
	//*  27   52:ifeq            69
				i = s.j(view) + appbarlayout.getTopInset();
	//   28   55:aload           6
	//   29   57:invokestatic    #146 <Method int s.j(View)>
	//   30   60:aload_2         
	//   31   61:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
	//   32   64:iadd            
	//   33   65:istore_3        
			else
	//*  34   66:goto            87
				i = Math.round((float)view.getHeight() * f);
	//   35   69:aload           6
	//   36   71:invokevirtual   #168 <Method int View.getHeight()>
	//   37   74:i2f             
	//   38   75:aload_0         
	//   39   76:getfield        #265 <Field float f>
	//   40   79:fmul            
	//   41   80:invokestatic    #79  <Method int Math.round(float)>
	//   42   83:istore_3        
	//*  43   84:goto            66
			a_(coordinatorlayout, ((View) (appbarlayout)), j + i);
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:aload_2         
	//   47   90:iload           4
	//   48   92:iload_3         
	//   49   93:iadd            
	//   50   94:invokevirtual   #330 <Method int a_(CoordinatorLayout, View, int)>
	//   51   97:pop             
		} else
	//*  52   98:goto            192
		if(j != 0)
	//*  53  101:iload           4
	//*  54  103:ifeq            192
		{
			if((j & 4) != 0)
	//*  55  106:iload           4
	//*  56  108:iconst_4        
	//*  57  109:iand            
	//*  58  110:ifeq            118
				i = 1;
	//   59  113:iconst_1        
	//   60  114:istore_3        
			else
	//*  61  115:goto            120
				i = 0;
	//   62  118:iconst_0        
	//   63  119:istore_3        
			if((j & 2) != 0)
	//*  64  120:iload           4
	//*  65  122:iconst_2        
	//*  66  123:iand            
	//*  67  124:ifeq            162
			{
				j = -appbarlayout.getUpNestedPreScrollRange();
	//   68  127:aload_2         
	//   69  128:invokevirtual   #290 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//   70  131:ineg            
	//   71  132:istore          4
				if(i != 0)
	//*  72  134:iload_3         
	//*  73  135:ifeq            150
					a(coordinatorlayout, appbarlayout, j, 0.0F);
	//   74  138:aload_0         
	//   75  139:aload_1         
	//   76  140:aload_2         
	//   77  141:iload           4
	//   78  143:fconst_0        
	//   79  144:invokespecial   #203 <Method void a(CoordinatorLayout, AppBarLayout, int, float)>
				else
	//*  80  147:goto            192
					a_(coordinatorlayout, ((View) (appbarlayout)), j);
	//   81  150:aload_0         
	//   82  151:aload_1         
	//   83  152:aload_2         
	//   84  153:iload           4
	//   85  155:invokevirtual   #330 <Method int a_(CoordinatorLayout, View, int)>
	//   86  158:pop             
			} else
	//*  87  159:goto            192
			if((j & 1) != 0)
	//*  88  162:iload           4
	//*  89  164:iconst_1        
	//*  90  165:iand            
	//*  91  166:ifeq            192
				if(i != 0)
	//*  92  169:iload_3         
	//*  93  170:ifeq            184
					a(coordinatorlayout, appbarlayout, 0, 0.0F);
	//   94  173:aload_0         
	//   95  174:aload_1         
	//   96  175:aload_2         
	//   97  176:iconst_0        
	//   98  177:fconst_0        
	//   99  178:invokespecial   #203 <Method void a(CoordinatorLayout, AppBarLayout, int, float)>
				else
	//* 100  181:goto            192
					a_(coordinatorlayout, ((View) (appbarlayout)), 0);
	//  101  184:aload_0         
	//  102  185:aload_1         
	//  103  186:aload_2         
	//  104  187:iconst_0        
	//  105  188:invokevirtual   #330 <Method int a_(CoordinatorLayout, View, int)>
	//  106  191:pop             
		}
		appbarlayout.d();
	//  107  192:aload_2         
	//  108  193:invokevirtual   #332 <Method void AppBarLayout.d()>
		d = -1;
	//  109  196:aload_0         
	//  110  197:iconst_m1       
	//  111  198:putfield        #38  <Field int d>
		a(android.support.v4.c.a.a(b(), -appbarlayout.getTotalScrollRange(), 0));
	//  112  201:aload_0         
	//  113  202:aload_0         
	//  114  203:invokevirtual   #228 <Method int b()>
	//  115  206:aload_2         
	//  116  207:invokevirtual   #196 <Method int AppBarLayout.getTotalScrollRange()>
	//  117  210:ineg            
	//  118  211:iconst_0        
	//  119  212:invokestatic    #201 <Method int a.a(int, int, int)>
	//  120  215:invokevirtual   #236 <Method boolean a(int)>
	//  121  218:pop             
		a(coordinatorlayout, appbarlayout, b(), 0, true);
	//  122  219:aload_0         
	//  123  220:aload_1         
	//  124  221:aload_2         
	//  125  222:aload_0         
	//  126  223:invokevirtual   #228 <Method int b()>
	//  127  226:iconst_0        
	//  128  227:iconst_1        
	//  129  228:invokespecial   #244 <Method void a(CoordinatorLayout, AppBarLayout, int, int, boolean)>
		appbarlayout.a(b());
	//  130  231:aload_2         
	//  131  232:aload_0         
	//  132  233:invokevirtual   #228 <Method int b()>
	//  133  236:invokevirtual   #242 <Method void android.support.design.widget.AppBarLayout.a(int)>
		return flag;
	//  134  239:iload           5
	//  135  241:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k, int l)
	{
		if(((CoordinatorLayout.c)appbarlayout.getLayoutParams()).height == -2)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
	//*   2    4:checkcast       #219 <Class CoordinatorLayout$c>
	//*   3    7:getfield        #337 <Field int CoordinatorLayout$c.height>
	//*   4   10:bipush          -2
	//*   5   12:icmpne          32
		{
			coordinatorlayout.a(((View) (appbarlayout)), i, j, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), l);
	//    6   15:aload_1         
	//    7   16:aload_2         
	//    8   17:iload_3         
	//    9   18:iload           4
	//   10   20:iconst_0        
	//   11   21:iconst_0        
	//   12   22:invokestatic    #342 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   25:iload           6
	//   14   27:invokevirtual   #345 <Method void android.support.design.widget.CoordinatorLayout.a(View, int, int, int, int)>
			return true;
	//   15   30:iconst_1        
	//   16   31:ireturn         
		} else
		{
			return super.a(coordinatorlayout, ((View) (appbarlayout)), i, j, k, l);
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:iload_3         
	//   21   36:iload           4
	//   22   38:iload           5
	//   23   40:iload           6
	//   24   42:invokespecial   #348 <Method boolean android.support.design.widget.HeaderBehavior.a(CoordinatorLayout, View, int, int, int, int)>
	//   25   45:ireturn         
		}
	}

	public boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i, int j)
	{
		boolean flag;
		if((i & 2) != 0 && appbarlayout.c() && coordinatorlayout.getHeight() - view.getHeight() <= appbarlayout.getHeight())
	//*   0    0:iload           5
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            36
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #351 <Method boolean AppBarLayout.c()>
	//*   6   11:ifeq            36
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #352 <Method int CoordinatorLayout.getHeight()>
	//*   9   18:aload_3         
	//*  10   19:invokevirtual   #168 <Method int View.getHeight()>
	//*  11   22:isub            
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #82  <Method int AppBarLayout.getHeight()>
	//*  14   27:icmpgt          36
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore          7
		else
	//*  17   33:goto            39
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore          7
		if(flag && c != null)
	//*  20   39:iload           7
	//*  21   41:ifeq            58
	//*  22   44:aload_0         
	//*  23   45:getfield        #88  <Field ValueAnimator c>
	//*  24   48:ifnull          58
			c.cancel();
	//   25   51:aload_0         
	//   26   52:getfield        #88  <Field ValueAnimator c>
	//   27   55:invokevirtual   #97  <Method void ValueAnimator.cancel()>
		g = null;
	//   28   58:aload_0         
	//   29   59:aconst_null     
	//   30   60:putfield        #277 <Field WeakReference g>
		return flag;
	//   31   63:iload           7
	//   32   65:ireturn         
	}

	public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return a(coordinatorlayout, (AppBarLayout)view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #354 <Method boolean a(CoordinatorLayout, AppBarLayout, int)>
	//    6   10:ireturn         
	}

	public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
	{
		return a(coordinatorlayout, (AppBarLayout)view, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #356 <Method boolean a(CoordinatorLayout, AppBarLayout, int, int, int, int)>
	//    9   16:ireturn         
	}

	public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
	{
		return a(coordinatorlayout, (AppBarLayout)view, view1, view2, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #359 <Method boolean a(CoordinatorLayout, AppBarLayout, View, View, int, int)>
	//    9   16:ireturn         
	}

	public volatile int b()
	{
		return super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #360 <Method int HeaderBehavior.b()>
	//    2    4:ireturn         
	}

	int b(AppBarLayout appbarlayout)
	{
		return -appbarlayout.getDownNestedScrollRange();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #281 <Method int AppBarLayout.getDownNestedScrollRange()>
	//    2    4:ineg            
	//    3    5:ireturn         
	}

	volatile int b(View view)
	{
		return b((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #362 <Method int b(AppBarLayout)>
	//    4    8:ireturn         
	}

	public Parcelable b(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		Object obj = ((Object) (super.b(coordinatorlayout, ((View) (appbarlayout)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #366 <Method Parcelable HeaderBehavior.b(CoordinatorLayout, View)>
	//    4    6:astore          8
		int j = b();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #228 <Method int b()>
	//    7   12:istore          4
		int k = appbarlayout.getChildCount();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
	//   10   18:istore          5
		boolean flag = false;
	//   11   20:iconst_0        
	//   12   21:istore          7
		for(int i = 0; i < k; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_3        
	//*  15   25:iload_3         
	//*  16   26:iload           5
	//*  17   28:icmpge          126
		{
			coordinatorlayout = ((CoordinatorLayout) (appbarlayout.getChildAt(i)));
	//   18   31:aload_2         
	//   19   32:iload_3         
	//   20   33:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
	//   21   36:astore_1        
			int l = ((View) (coordinatorlayout)).getBottom() + j;
	//   22   37:aload_1         
	//   23   38:invokevirtual   #62  <Method int View.getBottom()>
	//   24   41:iload           4
	//   25   43:iadd            
	//   26   44:istore          6
			if(((View) (coordinatorlayout)).getTop() + j <= 0 && l >= 0)
	//*  27   46:aload_1         
	//*  28   47:invokevirtual   #59  <Method int View.getTop()>
	//*  29   50:iload           4
	//*  30   52:iadd            
	//*  31   53:ifgt            119
	//*  32   56:iload           6
	//*  33   58:iflt            119
			{
				obj = ((Object) (new SavedState(((Parcelable) (obj)))));
	//   34   61:new             #12  <Class AppBarLayout$Behavior$SavedState>
	//   35   64:dup             
	//   36   65:aload           8
	//   37   67:invokespecial   #369 <Method void AppBarLayout$Behavior$SavedState(Parcelable)>
	//   38   70:astore          8
				obj.a = i;
	//   39   72:aload           8
	//   40   74:iload_3         
	//   41   75:putfield        #261 <Field int android.support.design.widget.AppBarLayout$Behavior$SavedState.a>
				if(l == s.j(((View) (coordinatorlayout))) + appbarlayout.getTopInset())
	//*  42   78:iload           6
	//*  43   80:aload_1         
	//*  44   81:invokestatic    #146 <Method int s.j(View)>
	//*  45   84:aload_2         
	//*  46   85:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
	//*  47   88:iadd            
	//*  48   89:icmpne          95
					flag = true;
	//   49   92:iconst_1        
	//   50   93:istore          7
				obj.c = flag;
	//   51   95:aload           8
	//   52   97:iload           7
	//   53   99:putfield        #267 <Field boolean AppBarLayout$Behavior$SavedState.c>
				obj.b = (float)l / (float)((View) (coordinatorlayout)).getHeight();
	//   54  102:aload           8
	//   55  104:iload           6
	//   56  106:i2f             
	//   57  107:aload_1         
	//   58  108:invokevirtual   #168 <Method int View.getHeight()>
	//   59  111:i2f             
	//   60  112:fdiv            
	//   61  113:putfield        #263 <Field float AppBarLayout$Behavior$SavedState.b>
				return ((Parcelable) (obj));
	//   62  116:aload           8
	//   63  118:areturn         
			}
		}

	//   64  119:iload_3         
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:istore_3        
	//*  68  123:goto            25
		return ((Parcelable) (obj));
	//   69  126:aload           8
	//   70  128:areturn         
	}

	public volatile Parcelable b(CoordinatorLayout coordinatorlayout, View view)
	{
		return b(coordinatorlayout, (AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:invokevirtual   #371 <Method Parcelable b(CoordinatorLayout, AppBarLayout)>
	//    5    9:areturn         
	}

	int c(AppBarLayout appbarlayout)
	{
		return appbarlayout.getTotalScrollRange();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #196 <Method int AppBarLayout.getTotalScrollRange()>
	//    2    4:ireturn         
	}

	boolean c(View view)
	{
		return a((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #372 <Method boolean a(AppBarLayout)>
	//    4    8:ireturn         
	}

	private int b;
	private ValueAnimator c;
	private int d;
	private boolean e;
	private float f;
	private WeakReference g;
	private a h;

	public AppBarLayout$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void HeaderBehavior()>
		d = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #38  <Field int d>
	//    5    9:return          
	}

	public AppBarLayout$Behavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #42  <Method void HeaderBehavior(Context, AttributeSet)>
		d = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #38  <Field int d>
	//    7   11:return          
	}
}
