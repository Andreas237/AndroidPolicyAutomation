// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//			p

public class SlidingPaneLayout extends ViewGroup
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		private static final int e[] = {
			0x1010181
		};
		public float a;
		boolean b;
		boolean c;
		Paint d;

		static 
		{
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:ldc1            #19  <Int 0x1010181>
		//    5    7:iastore         
		//    6    8:putstatic       #21  <Field int[] e>
		//*   7   11:return          
		}

		public LayoutParams()
		{
			super(-1, -1);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:iconst_m1       
		//    3    3:invokespecial   #26  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			a = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #28  <Field float a>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #31  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			a = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #28  <Field float a>
			context = ((Context) (context.obtainStyledAttributes(attributeset, e)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #21  <Field int[] e>
		//   10   16:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			a = ((TypedArray) (context)).getFloat(0, 0.0F);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:fconst_0        
		//   16   24:invokevirtual   #43  <Method float TypedArray.getFloat(int, float)>
		//   17   27:putfield        #28  <Field float a>
			((TypedArray) (context)).recycle();
		//   18   30:aload_1         
		//   19   31:invokevirtual   #46  <Method void TypedArray.recycle()>
		//   20   34:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #49  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			a = 0.0F;
		//    3    5:aload_0         
		//    4    6:fconst_0        
		//    5    7:putfield        #28  <Field float a>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #52  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			a = 0.0F;
		//    3    5:aload_0         
		//    4    6:fconst_0        
		//    5    7:putfield        #28  <Field float a>
		//    6   10:return          
		}
	}

	static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i1)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #40  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #42  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #47  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] a(int i1)
			{
				return new SavedState[i1];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #28  <Method SlidingPaneLayout$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method SlidingPaneLayout$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method SlidingPaneLayout$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		boolean a;

		static 
		{
		//    0    0:new             #9   <Class SlidingPaneLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void SlidingPaneLayout$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   4    6:aload_1         
		//*   5    7:invokevirtual   #31  <Method int Parcel.readInt()>
		//*   6   10:ifeq            18
				flag = true;
		//    7   13:iconst_1        
		//    8   14:istore_3        
			else
		//*   9   15:goto            20
				flag = false;
		//   10   18:iconst_0        
		//   11   19:istore_3        
			a = flag;
		//   12   20:aload_0         
		//   13   21:iload_3         
		//   14   22:putfield        #33  <Field boolean a>
		//   15   25:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	class a extends android.support.v4.view.a
	{

		private void a(android.support.v4.view.a.b b1, android.support.v4.view.a.b b2)
		{
			Rect rect = c;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Rect c>
		//    2    4:astore_3        
			b2.a(rect);
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #29  <Method void android.support.v4.view.a.b.a(Rect)>
			b1.b(rect);
		//    6   10:aload_1         
		//    7   11:aload_3         
		//    8   12:invokevirtual   #32  <Method void android.support.v4.view.a.b.b(Rect)>
			b2.c(rect);
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #34  <Method void android.support.v4.view.a.b.c(Rect)>
			b1.d(rect);
		//   12   20:aload_1         
		//   13   21:aload_3         
		//   14   22:invokevirtual   #37  <Method void android.support.v4.view.a.b.d(Rect)>
			b1.e(b2.h());
		//   15   25:aload_1         
		//   16   26:aload_2         
		//   17   27:invokevirtual   #41  <Method boolean android.support.v4.view.a.b.h()>
		//   18   30:invokevirtual   #45  <Method void android.support.v4.view.a.b.e(boolean)>
			b1.a(b2.p());
		//   19   33:aload_1         
		//   20   34:aload_2         
		//   21   35:invokevirtual   #49  <Method CharSequence android.support.v4.view.a.b.p()>
		//   22   38:invokevirtual   #52  <Method void android.support.v4.view.a.b.a(CharSequence)>
			b1.b(b2.q());
		//   23   41:aload_1         
		//   24   42:aload_2         
		//   25   43:invokevirtual   #55  <Method CharSequence android.support.v4.view.a.b.q()>
		//   26   46:invokevirtual   #57  <Method void android.support.v4.view.a.b.b(CharSequence)>
			b1.d(b2.s());
		//   27   49:aload_1         
		//   28   50:aload_2         
		//   29   51:invokevirtual   #60  <Method CharSequence android.support.v4.view.a.b.s()>
		//   30   54:invokevirtual   #62  <Method void android.support.v4.view.a.b.d(CharSequence)>
			b1.j(b2.m());
		//   31   57:aload_1         
		//   32   58:aload_2         
		//   33   59:invokevirtual   #65  <Method boolean android.support.v4.view.a.b.m()>
		//   34   62:invokevirtual   #68  <Method void android.support.v4.view.a.b.j(boolean)>
			b1.h(b2.k());
		//   35   65:aload_1         
		//   36   66:aload_2         
		//   37   67:invokevirtual   #71  <Method boolean android.support.v4.view.a.b.k()>
		//   38   70:invokevirtual   #73  <Method void android.support.v4.view.a.b.h(boolean)>
			b1.c(b2.f());
		//   39   73:aload_1         
		//   40   74:aload_2         
		//   41   75:invokevirtual   #76  <Method boolean android.support.v4.view.a.b.f()>
		//   42   78:invokevirtual   #78  <Method void android.support.v4.view.a.b.c(boolean)>
			b1.d(b2.g());
		//   43   81:aload_1         
		//   44   82:aload_2         
		//   45   83:invokevirtual   #81  <Method boolean android.support.v4.view.a.b.g()>
		//   46   86:invokevirtual   #83  <Method void android.support.v4.view.a.b.d(boolean)>
			b1.f(b2.i());
		//   47   89:aload_1         
		//   48   90:aload_2         
		//   49   91:invokevirtual   #86  <Method boolean android.support.v4.view.a.b.i()>
		//   50   94:invokevirtual   #88  <Method void android.support.v4.view.a.b.f(boolean)>
			b1.g(b2.j());
		//   51   97:aload_1         
		//   52   98:aload_2         
		//   53   99:invokevirtual   #90  <Method boolean android.support.v4.view.a.b.j()>
		//   54  102:invokevirtual   #92  <Method void android.support.v4.view.a.b.g(boolean)>
			b1.i(b2.l());
		//   55  105:aload_1         
		//   56  106:aload_2         
		//   57  107:invokevirtual   #95  <Method boolean android.support.v4.view.a.b.l()>
		//   58  110:invokevirtual   #97  <Method void android.support.v4.view.a.b.i(boolean)>
			b1.a(b2.b());
		//   59  113:aload_1         
		//   60  114:aload_2         
		//   61  115:invokevirtual   #100 <Method int android.support.v4.view.a.b.b()>
		//   62  118:invokevirtual   #103 <Method void android.support.v4.view.a.b.a(int)>
			b1.b(b2.c());
		//   63  121:aload_1         
		//   64  122:aload_2         
		//   65  123:invokevirtual   #105 <Method int android.support.v4.view.a.b.c()>
		//   66  126:invokevirtual   #107 <Method void android.support.v4.view.a.b.b(int)>
		//   67  129:return          
		}

		public void a(View view, android.support.v4.view.a.b b1)
		{
			android.support.v4.view.a.b b2 = android.support.v4.view.a.b.a(b1);
		//    0    0:aload_2         
		//    1    1:invokestatic    #111 <Method android.support.v4.view.a.b android.support.v4.view.a.b.a(android.support.v4.view.a.b)>
		//    2    4:astore          5
			super.a(view, b2);
		//    3    6:aload_0         
		//    4    7:aload_1         
		//    5    8:aload           5
		//    6   10:invokespecial   #113 <Method void android.support.v4.view.a.a(View, android.support.v4.view.a.b)>
			a(b1, b2);
		//    7   13:aload_0         
		//    8   14:aload_2         
		//    9   15:aload           5
		//   10   17:invokespecial   #115 <Method void a(android.support.v4.view.a.b, android.support.v4.view.a.b)>
			b2.t();
		//   11   20:aload           5
		//   12   22:invokevirtual   #118 <Method void android.support.v4.view.a.b.t()>
			b1.b(((CharSequence) (((Class) (android/support/v4/widget/SlidingPaneLayout)).getName())));
		//   13   25:aload_2         
		//   14   26:ldc1            #6   <Class SlidingPaneLayout>
		//   15   28:invokevirtual   #124 <Method String Class.getName()>
		//   16   31:invokevirtual   #57  <Method void android.support.v4.view.a.b.b(CharSequence)>
			b1.a(view);
		//   17   34:aload_2         
		//   18   35:aload_1         
		//   19   36:invokevirtual   #127 <Method void android.support.v4.view.a.b.a(View)>
			view = ((View) (android.support.v4.view.s.f(view)));
		//   20   39:aload_1         
		//   21   40:invokestatic    #132 <Method android.view.ViewParent s.f(View)>
		//   22   43:astore_1        
			if(view instanceof View)
		//*  23   44:aload_1         
		//*  24   45:instanceof      #134 <Class View>
		//*  25   48:ifeq            59
				b1.c((View)view);
		//   26   51:aload_2         
		//   27   52:aload_1         
		//   28   53:checkcast       #134 <Class View>
		//   29   56:invokevirtual   #136 <Method void android.support.v4.view.a.b.c(View)>
			int j1 = a.getChildCount();
		//   30   59:aload_0         
		//   31   60:getfield        #14  <Field SlidingPaneLayout a>
		//   32   63:invokevirtual   #139 <Method int SlidingPaneLayout.getChildCount()>
		//   33   66:istore          4
			for(int i1 = 0; i1 < j1; i1++)
		//*  34   68:iconst_0        
		//*  35   69:istore_3        
		//*  36   70:iload_3         
		//*  37   71:iload           4
		//*  38   73:icmpge          117
			{
				view = a.getChildAt(i1);
		//   39   76:aload_0         
		//   40   77:getfield        #14  <Field SlidingPaneLayout a>
		//   41   80:iload_3         
		//   42   81:invokevirtual   #143 <Method View SlidingPaneLayout.getChildAt(int)>
		//   43   84:astore_1        
				if(!b(view) && view.getVisibility() == 0)
		//*  44   85:aload_0         
		//*  45   86:aload_1         
		//*  46   87:invokevirtual   #146 <Method boolean b(View)>
		//*  47   90:ifne            110
		//*  48   93:aload_1         
		//*  49   94:invokevirtual   #149 <Method int View.getVisibility()>
		//*  50   97:ifne            110
				{
					android.support.v4.view.s.a(view, 1);
		//   51  100:aload_1         
		//   52  101:iconst_1        
		//   53  102:invokestatic    #152 <Method void s.a(View, int)>
					b1.b(view);
		//   54  105:aload_2         
		//   55  106:aload_1         
		//   56  107:invokevirtual   #154 <Method void android.support.v4.view.a.b.b(View)>
				}
			}

		//   57  110:iload_3         
		//   58  111:iconst_1        
		//   59  112:iadd            
		//   60  113:istore_3        
		//*  61  114:goto            70
		//   62  117:return          
		}

		public void a(View view, AccessibilityEvent accessibilityevent)
		{
			super.a(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #157 <Method void android.support.v4.view.a.a(View, AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/widget/SlidingPaneLayout)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class SlidingPaneLayout>
		//    6    9:invokevirtual   #124 <Method String Class.getName()>
		//    7   12:invokevirtual   #162 <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    8   15:return          
		}

		public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
		{
			if(!b(view))
		//*   0    0:aload_0         
		//*   1    1:aload_2         
		//*   2    2:invokevirtual   #146 <Method boolean b(View)>
		//*   3    5:ifne            16
				return super.a(viewgroup, view, accessibilityevent);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokespecial   #165 <Method boolean android.support.v4.view.a.a(ViewGroup, View, AccessibilityEvent)>
		//    9   15:ireturn         
			else
				return false;
		//   10   16:iconst_0        
		//   11   17:ireturn         
		}

		public boolean b(View view)
		{
			return a.f(view);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field SlidingPaneLayout a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #167 <Method boolean SlidingPaneLayout.f(View)>
		//    4    8:ireturn         
		}

		final SlidingPaneLayout a;
		private final Rect c = new Rect();

		a()
		{
			a = SlidingPaneLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field SlidingPaneLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void android.support.v4.view.a()>
		//    5    9:aload_0         
		//    6   10:new             #19  <Class Rect>
		//    7   13:dup             
		//    8   14:invokespecial   #20  <Method void Rect()>
		//    9   17:putfield        #22  <Field Rect c>
		//   10   20:return          
		}
	}

	private class b
		implements Runnable
	{

		public void run()
		{
			if(a.getParent() == b)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field View a>
		//*   2    4:invokevirtual   #29  <Method android.view.ViewParent View.getParent()>
		//*   3    7:aload_0         
		//*   4    8:getfield        #16  <Field SlidingPaneLayout b>
		//*   5   11:if_acmpne       34
			{
				a.setLayerType(0, ((Paint) (null)));
		//    6   14:aload_0         
		//    7   15:getfield        #21  <Field View a>
		//    8   18:iconst_0        
		//    9   19:aconst_null     
		//   10   20:invokevirtual   #33  <Method void View.setLayerType(int, Paint)>
				b.e(a);
		//   11   23:aload_0         
		//   12   24:getfield        #16  <Field SlidingPaneLayout b>
		//   13   27:aload_0         
		//   14   28:getfield        #21  <Field View a>
		//   15   31:invokevirtual   #37  <Method void SlidingPaneLayout.e(View)>
			}
			b.g.remove(((Object) (this)));
		//   16   34:aload_0         
		//   17   35:getfield        #16  <Field SlidingPaneLayout b>
		//   18   38:getfield        #41  <Field ArrayList SlidingPaneLayout.g>
		//   19   41:aload_0         
		//   20   42:invokevirtual   #47  <Method boolean ArrayList.remove(Object)>
		//   21   45:pop             
		//   22   46:return          
		}

		final View a;
		final SlidingPaneLayout b;

		b(View view)
		{
			b = SlidingPaneLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field SlidingPaneLayout b>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
			a = view;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field View a>
		//    8   14:return          
		}
	}

	private class c extends p.a
	{

		public int a(View view, int i1, int j1)
		{
			return view.getTop();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method int View.getTop()>
		//    2    4:ireturn         
		}

		public void a(int i1)
		{
			if(a.e.a() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field SlidingPaneLayout a>
		//*   2    4:getfield        #29  <Field p SlidingPaneLayout.e>
		//*   3    7:invokevirtual   #33  <Method int android.support.v4.widget.p.a()>
		//*   4   10:ifne            90
			{
				boolean flag;
				SlidingPaneLayout slidingpanelayout;
				if(a.b == 0.0F)
		//*   5   13:aload_0         
		//*   6   14:getfield        #13  <Field SlidingPaneLayout a>
		//*   7   17:getfield        #37  <Field float SlidingPaneLayout.b>
		//*   8   20:fconst_0        
		//*   9   21:fcmpl           
		//*  10   22:ifne            66
				{
					a.d(a.a);
		//   11   25:aload_0         
		//   12   26:getfield        #13  <Field SlidingPaneLayout a>
		//   13   29:aload_0         
		//   14   30:getfield        #13  <Field SlidingPaneLayout a>
		//   15   33:getfield        #40  <Field View android.support.v4.widget.SlidingPaneLayout.a>
		//   16   36:invokevirtual   #44  <Method void SlidingPaneLayout.d(View)>
					a.c(a.a);
		//   17   39:aload_0         
		//   18   40:getfield        #13  <Field SlidingPaneLayout a>
		//   19   43:aload_0         
		//   20   44:getfield        #13  <Field SlidingPaneLayout a>
		//   21   47:getfield        #40  <Field View android.support.v4.widget.SlidingPaneLayout.a>
		//   22   50:invokevirtual   #46  <Method void SlidingPaneLayout.c(View)>
					slidingpanelayout = a;
		//   23   53:aload_0         
		//   24   54:getfield        #13  <Field SlidingPaneLayout a>
		//   25   57:astore_3        
					flag = false;
		//   26   58:iconst_0        
		//   27   59:istore_2        
				} else
		//*  28   60:aload_3         
		//*  29   61:iload_2         
		//*  30   62:putfield        #50  <Field boolean SlidingPaneLayout.f>
		//*  31   65:return          
				{
					a.b(a.a);
		//   32   66:aload_0         
		//   33   67:getfield        #13  <Field SlidingPaneLayout a>
		//   34   70:aload_0         
		//   35   71:getfield        #13  <Field SlidingPaneLayout a>
		//   36   74:getfield        #40  <Field View android.support.v4.widget.SlidingPaneLayout.a>
		//   37   77:invokevirtual   #52  <Method void SlidingPaneLayout.b(View)>
					slidingpanelayout = a;
		//   38   80:aload_0         
		//   39   81:getfield        #13  <Field SlidingPaneLayout a>
		//   40   84:astore_3        
					flag = true;
		//   41   85:iconst_1        
		//   42   86:istore_2        
				}
				slidingpanelayout.f = flag;
				return;
			} else
		//*  43   87:goto            60
			{
				return;
		//   44   90:return          
			}
		}

		public void a(View view, float f1, float f2)
		{
			int i1;
label0:
			{
				LayoutParams layoutparams;
label1:
				{
label2:
					{
						layoutparams = (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #59  <Class SlidingPaneLayout$LayoutParams>
		//    3    7:astore          7
						if(!a.f())
							break label1;
		//    4    9:aload_0         
		//    5   10:getfield        #13  <Field SlidingPaneLayout a>
		//    6   13:invokevirtual   #62  <Method boolean SlidingPaneLayout.f()>
		//    7   16:ifeq            109
						int j1 = a.getPaddingRight() + layoutparams.rightMargin;
		//    8   19:aload_0         
		//    9   20:getfield        #13  <Field SlidingPaneLayout a>
		//   10   23:invokevirtual   #65  <Method int SlidingPaneLayout.getPaddingRight()>
		//   11   26:aload           7
		//   12   28:getfield        #69  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
		//   13   31:iadd            
		//   14   32:istore          5
						if(f1 >= 0.0F)
		//*  15   34:fload_2         
		//*  16   35:fconst_0        
		//*  17   36:fcmpg           
		//*  18   37:iflt            67
						{
							i1 = j1;
		//   19   40:iload           5
		//   20   42:istore          4
							if(f1 != 0.0F)
								break label2;
		//   21   44:fload_2         
		//   22   45:fconst_0        
		//   23   46:fcmpl           
		//   24   47:ifne            79
							i1 = j1;
		//   25   50:iload           5
		//   26   52:istore          4
							if(a.b <= 0.5F)
								break label2;
		//   27   54:aload_0         
		//   28   55:getfield        #13  <Field SlidingPaneLayout a>
		//   29   58:getfield        #37  <Field float SlidingPaneLayout.b>
		//   30   61:ldc1            #70  <Float 0.5F>
		//   31   63:fcmpl           
		//   32   64:ifle            79
						}
						i1 = j1 + a.c;
		//   33   67:iload           5
		//   34   69:aload_0         
		//   35   70:getfield        #13  <Field SlidingPaneLayout a>
		//   36   73:getfield        #72  <Field int SlidingPaneLayout.c>
		//   37   76:iadd            
		//   38   77:istore          4
					}
					int k1 = a.a.getWidth();
		//   39   79:aload_0         
		//   40   80:getfield        #13  <Field SlidingPaneLayout a>
		//   41   83:getfield        #40  <Field View android.support.v4.widget.SlidingPaneLayout.a>
		//   42   86:invokevirtual   #75  <Method int View.getWidth()>
		//   43   89:istore          5
					i1 = a.getWidth() - i1 - k1;
		//   44   91:aload_0         
		//   45   92:getfield        #13  <Field SlidingPaneLayout a>
		//   46   95:invokevirtual   #76  <Method int SlidingPaneLayout.getWidth()>
		//   47   98:iload           4
		//   48  100:isub            
		//   49  101:iload           5
		//   50  103:isub            
		//   51  104:istore          4
					break label0;
		//   52  106:goto            176
				}
				i1 = a.getPaddingLeft();
		//   53  109:aload_0         
		//   54  110:getfield        #13  <Field SlidingPaneLayout a>
		//   55  113:invokevirtual   #79  <Method int SlidingPaneLayout.getPaddingLeft()>
		//   56  116:istore          4
				int l1 = layoutparams.leftMargin + i1;
		//   57  118:aload           7
		//   58  120:getfield        #82  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
		//   59  123:iload           4
		//   60  125:iadd            
		//   61  126:istore          5
				int i2 = f1 != 0.0F;
		//   62  128:fload_2         
		//   63  129:fconst_0        
		//   64  130:fcmpl           
		//   65  131:istore          6
				if(i2 <= 0)
		//*  66  133:iload           6
		//*  67  135:ifgt            164
				{
					i1 = l1;
		//   68  138:iload           5
		//   69  140:istore          4
					if(i2 != 0)
						break label0;
		//   70  142:iload           6
		//   71  144:ifne            176
					i1 = l1;
		//   72  147:iload           5
		//   73  149:istore          4
					if(a.b <= 0.5F)
						break label0;
		//   74  151:aload_0         
		//   75  152:getfield        #13  <Field SlidingPaneLayout a>
		//   76  155:getfield        #37  <Field float SlidingPaneLayout.b>
		//   77  158:ldc1            #70  <Float 0.5F>
		//   78  160:fcmpl           
		//   79  161:ifle            176
				}
				i1 = l1 + a.c;
		//   80  164:iload           5
		//   81  166:aload_0         
		//   82  167:getfield        #13  <Field SlidingPaneLayout a>
		//   83  170:getfield        #72  <Field int SlidingPaneLayout.c>
		//   84  173:iadd            
		//   85  174:istore          4
			}
			a.e.a(i1, view.getTop());
		//   86  176:aload_0         
		//   87  177:getfield        #13  <Field SlidingPaneLayout a>
		//   88  180:getfield        #29  <Field p SlidingPaneLayout.e>
		//   89  183:iload           4
		//   90  185:aload_1         
		//   91  186:invokevirtual   #24  <Method int View.getTop()>
		//   92  189:invokevirtual   #85  <Method boolean android.support.v4.widget.p.a(int, int)>
		//   93  192:pop             
			a.invalidate();
		//   94  193:aload_0         
		//   95  194:getfield        #13  <Field SlidingPaneLayout a>
		//   96  197:invokevirtual   #88  <Method void SlidingPaneLayout.invalidate()>
		//   97  200:return          
		}

		public void a(View view, int i1, int j1, int k1, int l1)
		{
			a.a(i1);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout a>
		//    2    4:iload_2         
		//    3    5:invokevirtual   #91  <Method void android.support.v4.widget.SlidingPaneLayout.a(int)>
			a.invalidate();
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field SlidingPaneLayout a>
		//    6   12:invokevirtual   #88  <Method void SlidingPaneLayout.invalidate()>
		//    7   15:return          
		}

		public boolean a(View view, int i1)
		{
			if(a.d)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field SlidingPaneLayout a>
		//*   2    4:getfield        #94  <Field boolean SlidingPaneLayout.d>
		//*   3    7:ifeq            12
				return false;
		//    4   10:iconst_0        
		//    5   11:ireturn         
			else
				return ((LayoutParams)view.getLayoutParams()).b;
		//    6   12:aload_1         
		//    7   13:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    8   16:checkcast       #59  <Class SlidingPaneLayout$LayoutParams>
		//    9   19:getfield        #96  <Field boolean SlidingPaneLayout$LayoutParams.b>
		//   10   22:ireturn         
		}

		public int b(View view)
		{
			return a.c;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout a>
		//    2    4:getfield        #72  <Field int SlidingPaneLayout.c>
		//    3    7:ireturn         
		}

		public int b(View view, int i1, int j1)
		{
			view = ((View) ((LayoutParams)a.a.getLayoutParams()));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout a>
		//    2    4:getfield        #40  <Field View android.support.v4.widget.SlidingPaneLayout.a>
		//    3    7:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    4   10:checkcast       #59  <Class SlidingPaneLayout$LayoutParams>
		//    5   13:astore_1        
			if(a.f())
		//*   6   14:aload_0         
		//*   7   15:getfield        #13  <Field SlidingPaneLayout a>
		//*   8   18:invokevirtual   #62  <Method boolean SlidingPaneLayout.f()>
		//*   9   21:ifeq            78
			{
				j1 = a.getWidth() - (a.getPaddingRight() + ((LayoutParams) (view)).rightMargin + a.a.getWidth());
		//   10   24:aload_0         
		//   11   25:getfield        #13  <Field SlidingPaneLayout a>
		//   12   28:invokevirtual   #76  <Method int SlidingPaneLayout.getWidth()>
		//   13   31:aload_0         
		//   14   32:getfield        #13  <Field SlidingPaneLayout a>
		//   15   35:invokevirtual   #65  <Method int SlidingPaneLayout.getPaddingRight()>
		//   16   38:aload_1         
		//   17   39:getfield        #69  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
		//   18   42:iadd            
		//   19   43:aload_0         
		//   20   44:getfield        #13  <Field SlidingPaneLayout a>
		//   21   47:getfield        #40  <Field View android.support.v4.widget.SlidingPaneLayout.a>
		//   22   50:invokevirtual   #75  <Method int View.getWidth()>
		//   23   53:iadd            
		//   24   54:isub            
		//   25   55:istore_3        
				int k1 = a.c;
		//   26   56:aload_0         
		//   27   57:getfield        #13  <Field SlidingPaneLayout a>
		//   28   60:getfield        #72  <Field int SlidingPaneLayout.c>
		//   29   63:istore          4
				return Math.max(Math.min(i1, j1), j1 - k1);
		//   30   65:iload_2         
		//   31   66:iload_3         
		//   32   67:invokestatic    #103 <Method int Math.min(int, int)>
		//   33   70:iload_3         
		//   34   71:iload           4
		//   35   73:isub            
		//   36   74:invokestatic    #106 <Method int Math.max(int, int)>
		//   37   77:ireturn         
			} else
			{
				j1 = a.getPaddingLeft() + ((LayoutParams) (view)).leftMargin;
		//   38   78:aload_0         
		//   39   79:getfield        #13  <Field SlidingPaneLayout a>
		//   40   82:invokevirtual   #79  <Method int SlidingPaneLayout.getPaddingLeft()>
		//   41   85:aload_1         
		//   42   86:getfield        #82  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
		//   43   89:iadd            
		//   44   90:istore_3        
				int l1 = a.c;
		//   45   91:aload_0         
		//   46   92:getfield        #13  <Field SlidingPaneLayout a>
		//   47   95:getfield        #72  <Field int SlidingPaneLayout.c>
		//   48   98:istore          4
				return Math.min(Math.max(i1, j1), l1 + j1);
		//   49  100:iload_2         
		//   50  101:iload_3         
		//   51  102:invokestatic    #106 <Method int Math.max(int, int)>
		//   52  105:iload           4
		//   53  107:iload_3         
		//   54  108:iadd            
		//   55  109:invokestatic    #103 <Method int Math.min(int, int)>
		//   56  112:ireturn         
			}
		}

		public void b(int i1, int j1)
		{
			a.e.a(a.a, j1);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout a>
		//    2    4:getfield        #29  <Field p SlidingPaneLayout.e>
		//    3    7:aload_0         
		//    4    8:getfield        #13  <Field SlidingPaneLayout a>
		//    5   11:getfield        #40  <Field View android.support.v4.widget.SlidingPaneLayout.a>
		//    6   14:iload_2         
		//    7   15:invokevirtual   #110 <Method void android.support.v4.widget.p.a(View, int)>
		//    8   18:return          
		}

		public void b(View view, int i1)
		{
			a.a();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout a>
		//    2    4:invokevirtual   #112 <Method void android.support.v4.widget.SlidingPaneLayout.a()>
		//    3    7:return          
		}

		final SlidingPaneLayout a;

		c()
		{
			a = SlidingPaneLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field SlidingPaneLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void p$a()>
		//    5    9:return          
		}
	}

	public static interface d
	{

		public abstract void a(View view);

		public abstract void a(View view, float f1);

		public abstract void b(View view);
	}

	static interface e
	{

		public abstract void a(SlidingPaneLayout slidingpanelayout, View view);
	}

	static class f
		implements e
	{

		public void a(SlidingPaneLayout slidingpanelayout, View view)
		{
			android.support.v4.view.s.a(((View) (slidingpanelayout)), view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #22  <Method int View.getLeft()>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #25  <Method int View.getTop()>
		//    5    9:aload_2         
		//    6   10:invokevirtual   #28  <Method int View.getRight()>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #31  <Method int View.getBottom()>
		//    9   17:invokestatic    #36  <Method void s.a(View, int, int, int, int)>
		//   10   20:return          
		}

		f()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class g extends f
	{

		public void a(SlidingPaneLayout slidingpanelayout, View view)
		{
			if(a != null && b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Method a>
		//*   2    4:ifnull          56
		//*   3    7:aload_0         
		//*   4    8:getfield        #51  <Field Field b>
		//*   5   11:ifnull          56
			{
				try
				{
					b.setBoolean(((Object) (view)), true);
		//    6   14:aload_0         
		//    7   15:getfield        #51  <Field Field b>
		//    8   18:aload_2         
		//    9   19:iconst_1        
		//   10   20:invokevirtual   #67  <Method void Field.setBoolean(Object, boolean)>
					a.invoke(((Object) (view)), (Object[])null);
		//   11   23:aload_0         
		//   12   24:getfield        #33  <Field Method a>
		//   13   27:aload_2         
		//   14   28:aconst_null     
		//   15   29:checkcast       #69  <Class Object[]>
		//   16   32:invokevirtual   #75  <Method Object Method.invoke(Object, Object[])>
		//   17   35:pop             
				}
		//*  18   36:goto            49
				catch(Exception exception)
		//*  19   39:astore_3        
				{
					Log.e("SlidingPaneLayout", "Error refreshing display list state", ((Throwable) (exception)));
		//   20   40:ldc1            #35  <String "SlidingPaneLayout">
		//   21   42:ldc1            #77  <String "Error refreshing display list state">
		//   22   44:aload_3         
		//   23   45:invokestatic    #43  <Method int Log.e(String, String, Throwable)>
		//   24   48:pop             
				}
				super.a(slidingpanelayout, view);
		//   25   49:aload_0         
		//   26   50:aload_1         
		//   27   51:aload_2         
		//   28   52:invokespecial   #79  <Method void android.support.v4.widget.SlidingPaneLayout$f.a(SlidingPaneLayout, View)>
				return;
		//   29   55:return          
			} else
			{
				view.invalidate();
		//   30   56:aload_2         
		//   31   57:invokevirtual   #82  <Method void View.invalidate()>
				return;
		//   32   60:return          
			}
		}

		private Method a;
		private Field b;

		g()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void SlidingPaneLayout$f()>
			try
			{
				a = ((Class) (android/view/View)).getDeclaredMethod("getDisplayList", (Class[])null);
		//    2    4:aload_0         
		//    3    5:ldc1            #21  <Class View>
		//    4    7:ldc1            #23  <String "getDisplayList">
		//    5    9:aconst_null     
		//    6   10:checkcast       #25  <Class Class[]>
		//    7   13:invokevirtual   #31  <Method Method Class.getDeclaredMethod(String, Class[])>
		//    8   16:putfield        #33  <Field Method a>
			}
		//*   9   19:goto            32
			catch(NoSuchMethodException nosuchmethodexception)
		//*  10   22:astore_1        
			{
				Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", ((Throwable) (nosuchmethodexception)));
		//   11   23:ldc1            #35  <String "SlidingPaneLayout">
		//   12   25:ldc1            #37  <String "Couldn't fetch getDisplayList method; dimming won't work right.">
		//   13   27:aload_1         
		//   14   28:invokestatic    #43  <Method int Log.e(String, String, Throwable)>
		//   15   31:pop             
			}
			try
			{
				b = ((Class) (android/view/View)).getDeclaredField("mRecreateDisplayList");
		//   16   32:aload_0         
		//   17   33:ldc1            #21  <Class View>
		//   18   35:ldc1            #45  <String "mRecreateDisplayList">
		//   19   37:invokevirtual   #49  <Method Field Class.getDeclaredField(String)>
		//   20   40:putfield        #51  <Field Field b>
				b.setAccessible(true);
		//   21   43:aload_0         
		//   22   44:getfield        #51  <Field Field b>
		//   23   47:iconst_1        
		//   24   48:invokevirtual   #57  <Method void Field.setAccessible(boolean)>
				return;
		//   25   51:return          
			}
			catch(NoSuchFieldException nosuchfieldexception)
		//*  26   52:astore_1        
			{
				Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", ((Throwable) (nosuchfieldexception)));
		//   27   53:ldc1            #35  <String "SlidingPaneLayout">
		//   28   55:ldc1            #59  <String "Couldn't fetch mRecreateDisplayList field; dimming will be slow.">
		//   29   57:aload_1         
		//   30   58:invokestatic    #43  <Method int Log.e(String, String, Throwable)>
		//   31   61:pop             
			}
		//   32   62:return          
		}
	}

	static class h extends f
	{

		public void a(SlidingPaneLayout slidingpanelayout, View view)
		{
			android.support.v4.view.s.a(view, ((LayoutParams)view.getLayoutParams()).d);
		//    0    0:aload_2         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #20  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    3    5:checkcast       #22  <Class SlidingPaneLayout$LayoutParams>
		//    4    8:getfield        #26  <Field Paint SlidingPaneLayout$LayoutParams.d>
		//    5   11:invokestatic    #31  <Method void s.a(View, Paint)>
		//    6   14:return          
		}

		h()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void SlidingPaneLayout$f()>
		//    2    4:return          
		}
	}


	public SlidingPaneLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #79  <Method void SlidingPaneLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SlidingPaneLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #82  <Method void SlidingPaneLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public SlidingPaneLayout(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #83  <Method void ViewGroup(Context, AttributeSet, int)>
		i = 0xcccccccc;
	//    5    7:aload_0         
	//    6    8:ldc1            #84  <Int 0xcccccccc>
	//    7   10:putfield        #86  <Field int i>
		t = true;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #88  <Field boolean t>
		u = new Rect();
	//   11   18:aload_0         
	//   12   19:new             #90  <Class Rect>
	//   13   22:dup             
	//   14   23:invokespecial   #91  <Method void Rect()>
	//   15   26:putfield        #93  <Field Rect u>
		g = new ArrayList();
	//   16   29:aload_0         
	//   17   30:new             #95  <Class ArrayList>
	//   18   33:dup             
	//   19   34:invokespecial   #96  <Method void ArrayList()>
	//   20   37:putfield        #98  <Field ArrayList g>
		float f1 = context.getResources().getDisplayMetrics().density;
	//   21   40:aload_1         
	//   22   41:invokevirtual   #104 <Method Resources Context.getResources()>
	//   23   44:invokevirtual   #110 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   24   47:getfield        #115 <Field float DisplayMetrics.density>
	//   25   50:fstore          4
		m = (int)(32F * f1 + 0.5F);
	//   26   52:aload_0         
	//   27   53:ldc1            #116 <Float 32F>
	//   28   55:fload           4
	//   29   57:fmul            
	//   30   58:ldc1            #117 <Float 0.5F>
	//   31   60:fadd            
	//   32   61:f2i             
	//   33   62:putfield        #119 <Field int m>
		setWillNotDraw(false);
	//   34   65:aload_0         
	//   35   66:iconst_0        
	//   36   67:invokevirtual   #123 <Method void setWillNotDraw(boolean)>
		android.support.v4.view.s.a(((View) (this)), ((android.support.v4.view.a) (new a())));
	//   37   70:aload_0         
	//   38   71:new             #14  <Class SlidingPaneLayout$a>
	//   39   74:dup             
	//   40   75:aload_0         
	//   41   76:invokespecial   #126 <Method void SlidingPaneLayout$a(SlidingPaneLayout)>
	//   42   79:invokestatic    #131 <Method void s.a(View, android.support.v4.view.a)>
		android.support.v4.view.s.a(((View) (this)), 1);
	//   43   82:aload_0         
	//   44   83:iconst_1        
	//   45   84:invokestatic    #134 <Method void s.a(View, int)>
		e = android.support.v4.widget.p.a(((ViewGroup) (this)), 0.5F, ((p.a) (new c())));
	//   46   87:aload_0         
	//   47   88:aload_0         
	//   48   89:ldc1            #117 <Float 0.5F>
	//   49   91:new             #20  <Class SlidingPaneLayout$c>
	//   50   94:dup             
	//   51   95:aload_0         
	//   52   96:invokespecial   #135 <Method void SlidingPaneLayout$c(SlidingPaneLayout)>
	//   53   99:invokestatic    #140 <Method p android.support.v4.widget.p.a(ViewGroup, float, p$a)>
	//   54  102:putfield        #142 <Field p e>
		e.a(f1 * 400F);
	//   55  105:aload_0         
	//   56  106:getfield        #142 <Field p e>
	//   57  109:fload           4
	//   58  111:ldc1            #143 <Float 400F>
	//   59  113:fmul            
	//   60  114:invokevirtual   #146 <Method void android.support.v4.widget.p.a(float)>
	//   61  117:return          
	}

	private void a(float f1)
	{
		int i1;
		int j1;
		boolean flag;
label0:
		{
			flag = f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method boolean f()>
	//    2    4:istore          8
			LayoutParams layoutparams = (LayoutParams)a.getLayoutParams();
	//    3    6:aload_0         
	//    4    7:getfield        #151 <Field View a>
	//    5   10:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   13:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//    7   16:astore          10
			boolean flag1 = layoutparams.c;
	//    8   18:aload           10
	//    9   20:getfield        #159 <Field boolean SlidingPaneLayout$LayoutParams.c>
	//   10   23:istore          9
			j1 = 0;
	//   11   25:iconst_0        
	//   12   26:istore          4
			if(flag1)
	//*  13   28:iload           9
	//*  14   30:ifeq            62
			{
				if(flag)
	//*  15   33:iload           8
	//*  16   35:ifeq            47
					i1 = layoutparams.rightMargin;
	//   17   38:aload           10
	//   18   40:getfield        #162 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   19   43:istore_3        
				else
	//*  20   44:goto            53
					i1 = layoutparams.leftMargin;
	//   21   47:aload           10
	//   22   49:getfield        #165 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   23   52:istore_3        
				if(i1 <= 0)
	//*  24   53:iload_3         
	//*  25   54:ifgt            62
				{
					i1 = 1;
	//   26   57:iconst_1        
	//   27   58:istore_3        
					break label0;
	//   28   59:goto            64
				}
			}
			i1 = 0;
	//   29   62:iconst_0        
	//   30   63:istore_3        
		}
		for(int i2 = getChildCount(); j1 < i2; j1++)
	//*  31   64:aload_0         
	//*  32   65:invokevirtual   #169 <Method int getChildCount()>
	//*  33   68:istore          7
	//*  34   70:iload           4
	//*  35   72:iload           7
	//*  36   74:icmpge          199
		{
			View view = getChildAt(j1);
	//   37   77:aload_0         
	//   38   78:iload           4
	//   39   80:invokevirtual   #173 <Method View getChildAt(int)>
	//   40   83:astore          10
			if(view == a)
	//*  41   85:aload           10
	//*  42   87:aload_0         
	//*  43   88:getfield        #151 <Field View a>
	//*  44   91:if_acmpne       97
				continue;
	//   45   94:goto            190
			int k1 = (int)((1.0F - o) * (float)p);
	//   46   97:fconst_1        
	//   47   98:aload_0         
	//   48   99:getfield        #175 <Field float o>
	//   49  102:fsub            
	//   50  103:aload_0         
	//   51  104:getfield        #177 <Field int p>
	//   52  107:i2f             
	//   53  108:fmul            
	//   54  109:f2i             
	//   55  110:istore          5
			o = f1;
	//   56  112:aload_0         
	//   57  113:fload_1         
	//   58  114:putfield        #175 <Field float o>
			int l1 = k1 - (int)((1.0F - f1) * (float)p);
	//   59  117:iload           5
	//   60  119:fconst_1        
	//   61  120:fload_1         
	//   62  121:fsub            
	//   63  122:aload_0         
	//   64  123:getfield        #177 <Field int p>
	//   65  126:i2f             
	//   66  127:fmul            
	//   67  128:f2i             
	//   68  129:isub            
	//   69  130:istore          6
			k1 = l1;
	//   70  132:iload           6
	//   71  134:istore          5
			if(flag)
	//*  72  136:iload           8
	//*  73  138:ifeq            146
				k1 = -l1;
	//   74  141:iload           6
	//   75  143:ineg            
	//   76  144:istore          5
			view.offsetLeftAndRight(k1);
	//   77  146:aload           10
	//   78  148:iload           5
	//   79  150:invokevirtual   #181 <Method void View.offsetLeftAndRight(int)>
			if(!i1)
				continue;
	//   80  153:iload_3         
	//   81  154:ifeq            190
			float f2;
			if(flag)
	//*  82  157:iload           8
	//*  83  159:ifeq            172
				f2 = o - 1.0F;
	//   84  162:aload_0         
	//   85  163:getfield        #175 <Field float o>
	//   86  166:fconst_1        
	//   87  167:fsub            
	//   88  168:fstore_2        
			else
	//*  89  169:goto            179
				f2 = 1.0F - o;
	//   90  172:fconst_1        
	//   91  173:aload_0         
	//   92  174:getfield        #175 <Field float o>
	//   93  177:fsub            
	//   94  178:fstore_2        
			a(view, f2, j);
	//   95  179:aload_0         
	//   96  180:aload           10
	//   97  182:fload_2         
	//   98  183:aload_0         
	//   99  184:getfield        #183 <Field int j>
	//  100  187:invokespecial   #186 <Method void a(View, float, int)>
		}

	//  101  190:iload           4
	//  102  192:iconst_1        
	//  103  193:iadd            
	//  104  194:istore          4
	//* 105  196:goto            70
	//  106  199:return          
	}

	private void a(View view, float f1, int i1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          5
		if(f1 > 0.0F && i1 != 0)
	//*   4    9:fload_2         
	//*   5   10:fconst_0        
	//*   6   11:fcmpl           
	//*   7   12:ifle            105
	//*   8   15:iload_3         
	//*   9   16:ifeq            105
		{
			int j1 = (int)((float)((0xff000000 & i1) >>> 24) * f1);
	//   10   19:ldc1            #187 <Int 0xff000000>
	//   11   21:iload_3         
	//   12   22:iand            
	//   13   23:bipush          24
	//   14   25:iushr           
	//   15   26:i2f             
	//   16   27:fload_2         
	//   17   28:fmul            
	//   18   29:f2i             
	//   19   30:istore          4
			if(layoutparams.d == null)
	//*  20   32:aload           5
	//*  21   34:getfield        #190 <Field Paint SlidingPaneLayout$LayoutParams.d>
	//*  22   37:ifnonnull       52
				layoutparams.d = new Paint();
	//   23   40:aload           5
	//   24   42:new             #192 <Class Paint>
	//   25   45:dup             
	//   26   46:invokespecial   #193 <Method void Paint()>
	//   27   49:putfield        #190 <Field Paint SlidingPaneLayout$LayoutParams.d>
			layoutparams.d.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j1 << 24 | i1 & 0xffffff, android.graphics.PorterDuff.Mode.SRC_OVER))));
	//   28   52:aload           5
	//   29   54:getfield        #190 <Field Paint SlidingPaneLayout$LayoutParams.d>
	//   30   57:new             #195 <Class PorterDuffColorFilter>
	//   31   60:dup             
	//   32   61:iload           4
	//   33   63:bipush          24
	//   34   65:ishl            
	//   35   66:iload_3         
	//   36   67:ldc1            #196 <Int 0xffffff>
	//   37   69:iand            
	//   38   70:ior             
	//   39   71:getstatic       #202 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//   40   74:invokespecial   #205 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   41   77:invokevirtual   #209 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   42   80:pop             
			if(view.getLayerType() != 2)
	//*  43   81:aload_1         
	//*  44   82:invokevirtual   #212 <Method int View.getLayerType()>
	//*  45   85:iconst_2        
	//*  46   86:icmpeq          99
				view.setLayerType(2, layoutparams.d);
	//   47   89:aload_1         
	//   48   90:iconst_2        
	//   49   91:aload           5
	//   50   93:getfield        #190 <Field Paint SlidingPaneLayout$LayoutParams.d>
	//   51   96:invokevirtual   #216 <Method void View.setLayerType(int, Paint)>
			e(view);
	//   52   99:aload_0         
	//   53  100:aload_1         
	//   54  101:invokevirtual   #219 <Method void e(View)>
			return;
	//   55  104:return          
		}
		if(view.getLayerType() != 0)
	//*  56  105:aload_1         
	//*  57  106:invokevirtual   #212 <Method int View.getLayerType()>
	//*  58  109:ifeq            154
		{
			if(layoutparams.d != null)
	//*  59  112:aload           5
	//*  60  114:getfield        #190 <Field Paint SlidingPaneLayout$LayoutParams.d>
	//*  61  117:ifnull          130
				layoutparams.d.setColorFilter(((android.graphics.ColorFilter) (null)));
	//   62  120:aload           5
	//   63  122:getfield        #190 <Field Paint SlidingPaneLayout$LayoutParams.d>
	//   64  125:aconst_null     
	//   65  126:invokevirtual   #209 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   66  129:pop             
			view = ((View) (new b(view)));
	//   67  130:new             #17  <Class SlidingPaneLayout$b>
	//   68  133:dup             
	//   69  134:aload_0         
	//   70  135:aload_1         
	//   71  136:invokespecial   #222 <Method void SlidingPaneLayout$b(SlidingPaneLayout, View)>
	//   72  139:astore_1        
			g.add(((Object) (view)));
	//   73  140:aload_0         
	//   74  141:getfield        #98  <Field ArrayList g>
	//   75  144:aload_1         
	//   76  145:invokevirtual   #226 <Method boolean ArrayList.add(Object)>
	//   77  148:pop             
			android.support.v4.view.s.a(((View) (this)), ((Runnable) (view)));
	//   78  149:aload_0         
	//   79  150:aload_1         
	//   80  151:invokestatic    #229 <Method void s.a(View, Runnable)>
		}
	//   81  154:return          
	}

	private boolean a(View view, int i1)
	{
		if(!t && !a(0.0F, i1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field boolean t>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:fconst_0        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #233 <Method boolean a(float, int)>
	//*   7   13:ifeq            19
	//*   8   16:goto            21
		{
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		} else
		{
			f = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #235 <Field boolean f>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		}
	}

	private boolean b(View view, int i1)
	{
		if(!t && !a(1.0F, i1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field boolean t>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:fconst_1        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #233 <Method boolean a(float, int)>
	//*   7   13:ifeq            19
	//*   8   16:goto            21
		{
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		} else
		{
			f = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #235 <Field boolean f>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		}
	}

	private static boolean g(View view)
	{
		if(view.isOpaque())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #239 <Method boolean View.isOpaque()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   5    9:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          18
	//*   7   14:icmplt          19
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		view = ((View) (view.getBackground()));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #243 <Method Drawable View.getBackground()>
	//   12   23:astore_0        
		if(view != null)
	//*  13   24:aload_0         
	//*  14   25:ifnull          40
			return ((Drawable) (view)).getOpacity() == -1;
	//   15   28:aload_0         
	//   16   29:invokevirtual   #248 <Method int Drawable.getOpacity()>
	//   17   32:iconst_m1       
	//   18   33:icmpne          38
	//   19   36:iconst_1        
	//   20   37:ireturn         
	//   21   38:iconst_0        
	//   22   39:ireturn         
		else
			return false;
	//   23   40:iconst_0        
	//   24   41:ireturn         
	}

	void a()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
		{
			View view = getChildAt(i1);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #173 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(view.getVisibility() == 4)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #251 <Method int View.getVisibility()>
	//*  14   22:iconst_4        
	//*  15   23:icmpne          31
				view.setVisibility(0);
	//   16   26:aload_3         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #254 <Method void View.setVisibility(int)>
		}

	//   19   31:iload_1         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
	//*  23   35:goto            7
	//   24   38:return          
	}

	void a(int i1)
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field View a>
	//*   2    4:ifnonnull       13
		{
			b = 0.0F;
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:putfield        #256 <Field float b>
			return;
	//    6   12:return          
		}
		boolean flag = f();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #149 <Method boolean f()>
	//    9   17:istore          4
		LayoutParams layoutparams = (LayoutParams)a.getLayoutParams();
	//   10   19:aload_0         
	//   11   20:getfield        #151 <Field View a>
	//   12   23:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   26:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//   14   29:astore          5
		int k1 = a.getWidth();
	//   15   31:aload_0         
	//   16   32:getfield        #151 <Field View a>
	//   17   35:invokevirtual   #259 <Method int View.getWidth()>
	//   18   38:istore_3        
		int j1 = i1;
	//   19   39:iload_1         
	//   20   40:istore_2        
		if(flag)
	//*  21   41:iload           4
	//*  22   43:ifeq            55
			j1 = getWidth() - i1 - k1;
	//   23   46:aload_0         
	//   24   47:invokevirtual   #260 <Method int getWidth()>
	//   25   50:iload_1         
	//   26   51:isub            
	//   27   52:iload_3         
	//   28   53:isub            
	//   29   54:istore_2        
		if(flag)
	//*  30   55:iload           4
	//*  31   57:ifeq            68
			i1 = getPaddingRight();
	//   32   60:aload_0         
	//   33   61:invokevirtual   #263 <Method int getPaddingRight()>
	//   34   64:istore_1        
		else
	//*  35   65:goto            73
			i1 = getPaddingLeft();
	//   36   68:aload_0         
	//   37   69:invokevirtual   #266 <Method int getPaddingLeft()>
	//   38   72:istore_1        
		if(flag)
	//*  39   73:iload           4
	//*  40   75:ifeq            87
			k1 = layoutparams.rightMargin;
	//   41   78:aload           5
	//   42   80:getfield        #162 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   43   83:istore_3        
		else
	//*  44   84:goto            93
			k1 = layoutparams.leftMargin;
	//   45   87:aload           5
	//   46   89:getfield        #165 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   47   92:istore_3        
		b = (float)(j1 - (i1 + k1)) / (float)c;
	//   48   93:aload_0         
	//   49   94:iload_2         
	//   50   95:iload_1         
	//   51   96:iload_3         
	//   52   97:iadd            
	//   53   98:isub            
	//   54   99:i2f             
	//   55  100:aload_0         
	//   56  101:getfield        #268 <Field int c>
	//   57  104:i2f             
	//   58  105:fdiv            
	//   59  106:putfield        #256 <Field float b>
		if(p != 0)
	//*  60  109:aload_0         
	//*  61  110:getfield        #177 <Field int p>
	//*  62  113:ifeq            124
			a(b);
	//   63  116:aload_0         
	//   64  117:aload_0         
	//   65  118:getfield        #256 <Field float b>
	//   66  121:invokespecial   #269 <Method void a(float)>
		if(layoutparams.c)
	//*  67  124:aload           5
	//*  68  126:getfield        #159 <Field boolean SlidingPaneLayout$LayoutParams.c>
	//*  69  129:ifeq            148
			a(a, b, i);
	//   70  132:aload_0         
	//   71  133:aload_0         
	//   72  134:getfield        #151 <Field View a>
	//   73  137:aload_0         
	//   74  138:getfield        #256 <Field float b>
	//   75  141:aload_0         
	//   76  142:getfield        #86  <Field int i>
	//   77  145:invokespecial   #186 <Method void a(View, float, int)>
		a(a);
	//   78  148:aload_0         
	//   79  149:aload_0         
	//   80  150:getfield        #151 <Field View a>
	//   81  153:invokevirtual   #271 <Method void a(View)>
	//   82  156:return          
	}

	void a(View view)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #273 <Field SlidingPaneLayout$d s>
	//*   2    4:ifnull          21
			s.a(view, b);
	//    3    7:aload_0         
	//    4    8:getfield        #273 <Field SlidingPaneLayout$d s>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #256 <Field float b>
	//    8   16:invokeinterface #276 <Method void android.support.v4.widget.SlidingPaneLayout$d.a(View, float)>
	//    9   21:return          
	}

	boolean a(float f1, int i1)
	{
		if(!n)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field boolean n>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag = f();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #149 <Method boolean f()>
	//    7   13:istore          5
		LayoutParams layoutparams = (LayoutParams)a.getLayoutParams();
	//    8   15:aload_0         
	//    9   16:getfield        #151 <Field View a>
	//   10   19:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   22:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//   12   25:astore          6
		if(flag)
	//*  13   27:iload           5
	//*  14   29:ifeq            79
		{
			i1 = getPaddingRight();
	//   15   32:aload_0         
	//   16   33:invokevirtual   #263 <Method int getPaddingRight()>
	//   17   36:istore_2        
			int j1 = layoutparams.rightMargin;
	//   18   37:aload           6
	//   19   39:getfield        #162 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   20   42:istore_3        
			int k1 = a.getWidth();
	//   21   43:aload_0         
	//   22   44:getfield        #151 <Field View a>
	//   23   47:invokevirtual   #259 <Method int View.getWidth()>
	//   24   50:istore          4
			i1 = (int)((float)getWidth() - ((float)(i1 + j1) + f1 * (float)c + (float)k1));
	//   25   52:aload_0         
	//   26   53:invokevirtual   #260 <Method int getWidth()>
	//   27   56:i2f             
	//   28   57:iload_2         
	//   29   58:iload_3         
	//   30   59:iadd            
	//   31   60:i2f             
	//   32   61:fload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #268 <Field int c>
	//   35   66:i2f             
	//   36   67:fmul            
	//   37   68:fadd            
	//   38   69:iload           4
	//   39   71:i2f             
	//   40   72:fadd            
	//   41   73:fsub            
	//   42   74:f2i             
	//   43   75:istore_2        
		} else
	//*  44   76:goto            100
		{
			i1 = (int)((float)(getPaddingLeft() + layoutparams.leftMargin) + f1 * (float)c);
	//   45   79:aload_0         
	//   46   80:invokevirtual   #266 <Method int getPaddingLeft()>
	//   47   83:aload           6
	//   48   85:getfield        #165 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   49   88:iadd            
	//   50   89:i2f             
	//   51   90:fload_1         
	//   52   91:aload_0         
	//   53   92:getfield        #268 <Field int c>
	//   54   95:i2f             
	//   55   96:fmul            
	//   56   97:fadd            
	//   57   98:f2i             
	//   58   99:istore_2        
		}
		if(e.a(a, i1, a.getTop()))
	//*  59  100:aload_0         
	//*  60  101:getfield        #142 <Field p e>
	//*  61  104:aload_0         
	//*  62  105:getfield        #151 <Field View a>
	//*  63  108:iload_2         
	//*  64  109:aload_0         
	//*  65  110:getfield        #151 <Field View a>
	//*  66  113:invokevirtual   #281 <Method int View.getTop()>
	//*  67  116:invokevirtual   #284 <Method boolean android.support.v4.widget.p.a(View, int, int)>
	//*  68  119:ifeq            132
		{
			a();
	//   69  122:aload_0         
	//   70  123:invokevirtual   #286 <Method void a()>
			android.support.v4.view.s.c(((View) (this)));
	//   71  126:aload_0         
	//   72  127:invokestatic    #288 <Method void s.c(View)>
			return true;
	//   73  130:iconst_1        
	//   74  131:ireturn         
		} else
		{
			return false;
	//   75  132:iconst_0        
	//   76  133:ireturn         
		}
	}

	void b(View view)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #273 <Field SlidingPaneLayout$d s>
	//*   2    4:ifnull          17
			s.a(view);
	//    3    7:aload_0         
	//    4    8:getfield        #273 <Field SlidingPaneLayout$d s>
	//    5   11:aload_1         
	//    6   12:invokeinterface #289 <Method void android.support.v4.widget.SlidingPaneLayout$d.a(View)>
		sendAccessibilityEvent(32);
	//    7   17:aload_0         
	//    8   18:bipush          32
	//    9   20:invokevirtual   #292 <Method void sendAccessibilityEvent(int)>
	//   10   23:return          
	}

	public boolean b()
	{
		return b(a, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #151 <Field View a>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #294 <Method boolean b(View, int)>
	//    5    9:ireturn         
	}

	void c(View view)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #273 <Field SlidingPaneLayout$d s>
	//*   2    4:ifnull          17
			s.b(view);
	//    3    7:aload_0         
	//    4    8:getfield        #273 <Field SlidingPaneLayout$d s>
	//    5   11:aload_1         
	//    6   12:invokeinterface #296 <Method void SlidingPaneLayout$d.b(View)>
		sendAccessibilityEvent(32);
	//    7   17:aload_0         
	//    8   18:bipush          32
	//    9   20:invokevirtual   #292 <Method void sendAccessibilityEvent(int)>
	//   10   23:return          
	}

	public boolean c()
	{
		return a(a, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #151 <Field View a>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #298 <Method boolean a(View, int)>
	//    5    9:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #6   <Class SlidingPaneLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #302 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void computeScroll()
	{
		if(e.a(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field p e>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #306 <Method boolean android.support.v4.widget.p.a(boolean)>
	//*   4    8:ifeq            30
		{
			if(!n)
	//*   5   11:aload_0         
	//*   6   12:getfield        #278 <Field boolean n>
	//*   7   15:ifne            26
			{
				e.f();
	//    8   18:aload_0         
	//    9   19:getfield        #142 <Field p e>
	//   10   22:invokevirtual   #308 <Method void p.f()>
				return;
	//   11   25:return          
			}
			android.support.v4.view.s.c(((View) (this)));
	//   12   26:aload_0         
	//   13   27:invokestatic    #288 <Method void s.c(View)>
		}
	//   14   30:return          
	}

	void d(View view)
	{
		boolean flag = f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method boolean f()>
	//    2    4:istore          17
		int i1;
		if(flag)
	//*   3    6:iload           17
	//*   4    8:ifeq            24
			i1 = getWidth() - getPaddingRight();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #260 <Method int getWidth()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #263 <Method int getPaddingRight()>
	//    9   19:isub            
	//   10   20:istore_2        
		else
	//*  11   21:goto            29
			i1 = getPaddingLeft();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #266 <Method int getPaddingLeft()>
	//   14   28:istore_2        
		int j1;
		if(flag)
	//*  15   29:iload           17
	//*  16   31:ifeq            42
			j1 = getPaddingLeft();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #266 <Method int getPaddingLeft()>
	//   19   38:istore_3        
		else
	//*  20   39:goto            52
			j1 = getWidth() - getPaddingRight();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #260 <Method int getWidth()>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #263 <Method int getPaddingRight()>
	//   25   50:isub            
	//   26   51:istore_3        
		int i3 = getPaddingTop();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #311 <Method int getPaddingTop()>
	//   29   56:istore          10
		int j3 = getHeight();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #314 <Method int getHeight()>
	//   32   62:istore          11
		int k3 = getPaddingBottom();
	//   33   64:aload_0         
	//   34   65:invokevirtual   #317 <Method int getPaddingBottom()>
	//   35   68:istore          12
		int k1;
		int l1;
		int i2;
		int j2;
		if(view != null && g(view))
	//*  36   70:aload_1         
	//*  37   71:ifnull          108
	//*  38   74:aload_1         
	//*  39   75:invokestatic    #319 <Method boolean g(View)>
	//*  40   78:ifeq            108
		{
			k1 = view.getLeft();
	//   41   81:aload_1         
	//   42   82:invokevirtual   #322 <Method int View.getLeft()>
	//   43   85:istore          4
			l1 = view.getRight();
	//   44   87:aload_1         
	//   45   88:invokevirtual   #325 <Method int View.getRight()>
	//   46   91:istore          5
			i2 = view.getTop();
	//   47   93:aload_1         
	//   48   94:invokevirtual   #281 <Method int View.getTop()>
	//   49   97:istore          6
			j2 = view.getBottom();
	//   50   99:aload_1         
	//   51  100:invokevirtual   #328 <Method int View.getBottom()>
	//   52  103:istore          7
		} else
	//*  53  105:goto            120
		{
			k1 = 0;
	//   54  108:iconst_0        
	//   55  109:istore          4
			l1 = 0;
	//   56  111:iconst_0        
	//   57  112:istore          5
			i2 = 0;
	//   58  114:iconst_0        
	//   59  115:istore          6
			j2 = 0;
	//   60  117:iconst_0        
	//   61  118:istore          7
		}
		int l3 = getChildCount();
	//   62  120:aload_0         
	//   63  121:invokevirtual   #169 <Method int getChildCount()>
	//   64  124:istore          13
		for(int k2 = 0; k2 < l3; k2++)
	//*  65  126:iconst_0        
	//*  66  127:istore          8
	//*  67  129:iload           8
	//*  68  131:iload           13
	//*  69  133:icmpge          296
		{
			View view1 = getChildAt(k2);
	//   70  136:aload_0         
	//   71  137:iload           8
	//   72  139:invokevirtual   #173 <Method View getChildAt(int)>
	//   73  142:astore          18
			if(view1 == view)
	//*  74  144:aload           18
	//*  75  146:aload_1         
	//*  76  147:if_acmpne       151
				return;
	//   77  150:return          
			if(view1.getVisibility() == 8)
	//*  78  151:aload           18
	//*  79  153:invokevirtual   #251 <Method int View.getVisibility()>
	//*  80  156:bipush          8
	//*  81  158:icmpne          164
				continue;
	//   82  161:goto            287
			int l2;
			if(flag)
	//*  83  164:iload           17
	//*  84  166:ifeq            175
				l2 = j1;
	//   85  169:iload_3         
	//   86  170:istore          9
			else
	//*  87  172:goto            178
				l2 = i1;
	//   88  175:iload_2         
	//   89  176:istore          9
			int i4 = Math.max(l2, view1.getLeft());
	//   90  178:iload           9
	//   91  180:aload           18
	//   92  182:invokevirtual   #322 <Method int View.getLeft()>
	//   93  185:invokestatic    #334 <Method int Math.max(int, int)>
	//   94  188:istore          14
			int j4 = Math.max(i3, view1.getTop());
	//   95  190:iload           10
	//   96  192:aload           18
	//   97  194:invokevirtual   #281 <Method int View.getTop()>
	//   98  197:invokestatic    #334 <Method int Math.max(int, int)>
	//   99  200:istore          15
			if(flag)
	//* 100  202:iload           17
	//* 101  204:ifeq            213
				l2 = i1;
	//  102  207:iload_2         
	//  103  208:istore          9
			else
	//* 104  210:goto            216
				l2 = j1;
	//  105  213:iload_3         
	//  106  214:istore          9
			l2 = Math.min(l2, view1.getRight());
	//  107  216:iload           9
	//  108  218:aload           18
	//  109  220:invokevirtual   #325 <Method int View.getRight()>
	//  110  223:invokestatic    #337 <Method int Math.min(int, int)>
	//  111  226:istore          9
			int k4 = Math.min(j3 - k3, view1.getBottom());
	//  112  228:iload           11
	//  113  230:iload           12
	//  114  232:isub            
	//  115  233:aload           18
	//  116  235:invokevirtual   #328 <Method int View.getBottom()>
	//  117  238:invokestatic    #337 <Method int Math.min(int, int)>
	//  118  241:istore          16
			if(i4 >= k1 && j4 >= i2 && l2 <= l1 && k4 <= j2)
	//* 119  243:iload           14
	//* 120  245:iload           4
	//* 121  247:icmplt          277
	//* 122  250:iload           15
	//* 123  252:iload           6
	//* 124  254:icmplt          277
	//* 125  257:iload           9
	//* 126  259:iload           5
	//* 127  261:icmpgt          277
	//* 128  264:iload           16
	//* 129  266:iload           7
	//* 130  268:icmpgt          277
				l2 = 4;
	//  131  271:iconst_4        
	//  132  272:istore          9
			else
	//* 133  274:goto            280
				l2 = 0;
	//  134  277:iconst_0        
	//  135  278:istore          9
			view1.setVisibility(l2);
	//  136  280:aload           18
	//  137  282:iload           9
	//  138  284:invokevirtual   #254 <Method void View.setVisibility(int)>
		}

	//  139  287:iload           8
	//  140  289:iconst_1        
	//  141  290:iadd            
	//  142  291:istore          8
	//* 143  293:goto            129
	//  144  296:return          
	}

	public boolean d()
	{
		return !n || b == 1.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field boolean n>
	//    2    4:ifeq            21
	//    3    7:aload_0         
	//    4    8:getfield        #256 <Field float b>
	//    5   11:fconst_1        
	//    6   12:fcmpl           
	//    7   13:ifne            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #341 <Method void ViewGroup.draw(Canvas)>
		Drawable drawable;
		if(f())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #149 <Method boolean f()>
	//*   5    9:ifeq            21
			drawable = l;
	//    6   12:aload_0         
	//    7   13:getfield        #343 <Field Drawable l>
	//    8   16:astore          7
		else
	//*   9   18:goto            27
			drawable = k;
	//   10   21:aload_0         
	//   11   22:getfield        #345 <Field Drawable k>
	//   12   25:astore          7
		View view;
		if(getChildCount() > 1)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #169 <Method int getChildCount()>
	//*  15   31:iconst_1        
	//*  16   32:icmple          45
			view = getChildAt(1);
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #173 <Method View getChildAt(int)>
	//   20   40:astore          8
		else
	//*  21   42:goto            48
			view = null;
	//   22   45:aconst_null     
	//   23   46:astore          8
		if(view != null)
	//*  24   48:aload           8
	//*  25   50:ifnull          137
		{
			if(drawable == null)
	//*  26   53:aload           7
	//*  27   55:ifnonnull       59
				return;
	//   28   58:return          
			int l1 = view.getTop();
	//   29   59:aload           8
	//   30   61:invokevirtual   #281 <Method int View.getTop()>
	//   31   64:istore          5
			int i2 = view.getBottom();
	//   32   66:aload           8
	//   33   68:invokevirtual   #328 <Method int View.getBottom()>
	//   34   71:istore          6
			int k1 = drawable.getIntrinsicWidth();
	//   35   73:aload           7
	//   36   75:invokevirtual   #348 <Method int Drawable.getIntrinsicWidth()>
	//   37   78:istore          4
			int i1;
			int j1;
			if(f())
	//*  38   80:aload_0         
	//*  39   81:invokevirtual   #149 <Method boolean f()>
	//*  40   84:ifeq            101
			{
				i1 = view.getRight();
	//   41   87:aload           8
	//   42   89:invokevirtual   #325 <Method int View.getRight()>
	//   43   92:istore_2        
				j1 = k1 + i1;
	//   44   93:iload           4
	//   45   95:iload_2         
	//   46   96:iadd            
	//   47   97:istore_3        
			} else
	//*  48   98:goto            120
			{
				j1 = view.getLeft();
	//   49  101:aload           8
	//   50  103:invokevirtual   #322 <Method int View.getLeft()>
	//   51  106:istore_3        
				i1 = j1;
	//   52  107:iload_3         
	//   53  108:istore_2        
				k1 = j1 - k1;
	//   54  109:iload_3         
	//   55  110:iload           4
	//   56  112:isub            
	//   57  113:istore          4
				j1 = i1;
	//   58  115:iload_2         
	//   59  116:istore_3        
				i1 = k1;
	//   60  117:iload           4
	//   61  119:istore_2        
			}
			drawable.setBounds(i1, l1, j1, i2);
	//   62  120:aload           7
	//   63  122:iload_2         
	//   64  123:iload           5
	//   65  125:iload_3         
	//   66  126:iload           6
	//   67  128:invokevirtual   #352 <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(canvas);
	//   68  131:aload           7
	//   69  133:aload_1         
	//   70  134:invokevirtual   #353 <Method void Drawable.draw(Canvas)>
		}
	//   71  137:return          
	}

	protected boolean drawChild(Canvas canvas, View view, long l1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          7
		int i1 = canvas.save(2);
	//    4    9:aload_1         
	//    5   10:iconst_2        
	//    6   11:invokevirtual   #361 <Method int Canvas.save(int)>
	//    7   14:istore          5
		if(n && !layoutparams.b && a != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #278 <Field boolean n>
	//*  10   20:ifeq            114
	//*  11   23:aload           7
	//*  12   25:getfield        #363 <Field boolean SlidingPaneLayout$LayoutParams.b>
	//*  13   28:ifne            114
	//*  14   31:aload_0         
	//*  15   32:getfield        #151 <Field View a>
	//*  16   35:ifnull          114
		{
			canvas.getClipBounds(u);
	//   17   38:aload_1         
	//   18   39:aload_0         
	//   19   40:getfield        #93  <Field Rect u>
	//   20   43:invokevirtual   #367 <Method boolean Canvas.getClipBounds(Rect)>
	//   21   46:pop             
			if(f())
	//*  22   47:aload_0         
	//*  23   48:invokevirtual   #149 <Method boolean f()>
	//*  24   51:ifeq            81
				u.left = Math.max(u.left, a.getRight());
	//   25   54:aload_0         
	//   26   55:getfield        #93  <Field Rect u>
	//   27   58:aload_0         
	//   28   59:getfield        #93  <Field Rect u>
	//   29   62:getfield        #370 <Field int Rect.left>
	//   30   65:aload_0         
	//   31   66:getfield        #151 <Field View a>
	//   32   69:invokevirtual   #325 <Method int View.getRight()>
	//   33   72:invokestatic    #334 <Method int Math.max(int, int)>
	//   34   75:putfield        #370 <Field int Rect.left>
			else
	//*  35   78:goto            105
				u.right = Math.min(u.right, a.getLeft());
	//   36   81:aload_0         
	//   37   82:getfield        #93  <Field Rect u>
	//   38   85:aload_0         
	//   39   86:getfield        #93  <Field Rect u>
	//   40   89:getfield        #373 <Field int Rect.right>
	//   41   92:aload_0         
	//   42   93:getfield        #151 <Field View a>
	//   43   96:invokevirtual   #322 <Method int View.getLeft()>
	//   44   99:invokestatic    #337 <Method int Math.min(int, int)>
	//   45  102:putfield        #373 <Field int Rect.right>
			canvas.clipRect(u);
	//   46  105:aload_1         
	//   47  106:aload_0         
	//   48  107:getfield        #93  <Field Rect u>
	//   49  110:invokevirtual   #376 <Method boolean Canvas.clipRect(Rect)>
	//   50  113:pop             
		}
		boolean flag = super.drawChild(canvas, view, l1);
	//   51  114:aload_0         
	//   52  115:aload_1         
	//   53  116:aload_2         
	//   54  117:lload_3         
	//   55  118:invokespecial   #378 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   56  121:istore          6
		canvas.restoreToCount(i1);
	//   57  123:aload_1         
	//   58  124:iload           5
	//   59  126:invokevirtual   #381 <Method void Canvas.restoreToCount(int)>
		return flag;
	//   60  129:iload           6
	//   61  131:ireturn         
	}

	void e(View view)
	{
		h.a(this, view);
	//    0    0:getstatic       #72  <Field SlidingPaneLayout$e h>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #383 <Method void android.support.v4.widget.SlidingPaneLayout$e.a(SlidingPaneLayout, View)>
	//    4   10:return          
	}

	public boolean e()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field boolean n>
	//    2    4:ireturn         
	}

	boolean f()
	{
		return android.support.v4.view.s.e(((View) (this))) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #386 <Method int s.e(View)>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	boolean f(View view)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(view == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		view = ((View) ((LayoutParams)view.getLayoutParams()));
	//    6    8:aload_1         
	//    7    9:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   12:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//    9   15:astore_1        
		boolean flag = flag1;
	//   10   16:iload_3         
	//   11   17:istore_2        
		if(n)
	//*  12   18:aload_0         
	//*  13   19:getfield        #278 <Field boolean n>
	//*  14   22:ifeq            47
		{
			flag = flag1;
	//   15   25:iload_3         
	//   16   26:istore_2        
			if(((LayoutParams) (view)).c)
	//*  17   27:aload_1         
	//*  18   28:getfield        #159 <Field boolean SlidingPaneLayout$LayoutParams.c>
	//*  19   31:ifeq            47
			{
				flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
				if(b > 0.0F)
	//*  22   36:aload_0         
	//*  23   37:getfield        #256 <Field float b>
	//*  24   40:fconst_0        
	//*  25   41:fcmpl           
	//*  26   42:ifle            47
					flag = true;
	//   27   45:iconst_1        
	//   28   46:istore_2        
			}
		}
		return flag;
	//   29   47:iload_2         
	//   30   48:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #6   <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #388 <Method void SlidingPaneLayout$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #6   <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #394 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #395 <Method void SlidingPaneLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #398 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #6   <Class SlidingPaneLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #398 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #401 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #6   <Class SlidingPaneLayout$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #404 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public int getCoveredFadeColor()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field int j>
	//    2    4:ireturn         
	}

	public int getParallaxDistance()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field int p>
	//    2    4:ireturn         
	}

	public int getSliderFadeColor()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int i>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #410 <Method void ViewGroup.onAttachedToWindow()>
		t = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #88  <Field boolean t>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #413 <Method void ViewGroup.onDetachedFromWindow()>
		t = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #88  <Field boolean t>
		int j1 = g.size();
	//    5    9:aload_0         
	//    6   10:getfield        #98  <Field ArrayList g>
	//    7   13:invokevirtual   #416 <Method int ArrayList.size()>
	//    8   16:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:icmpge          45
			((b)g.get(i1)).run();
	//   14   24:aload_0         
	//   15   25:getfield        #98  <Field ArrayList g>
	//   16   28:iload_1         
	//   17   29:invokevirtual   #420 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #17  <Class SlidingPaneLayout$b>
	//   19   35:invokevirtual   #423 <Method void SlidingPaneLayout$b.run()>

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            19
		g.clear();
	//   25   45:aload_0         
	//   26   46:getfield        #98  <Field ArrayList g>
	//   27   49:invokevirtual   #426 <Method void ArrayList.clear()>
	//   28   52:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
label0:
		{
label1:
			{
				boolean flag;
				boolean flag1;
label2:
				{
					int i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #433 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
					boolean flag2 = n;
	//    3    6:aload_0         
	//    4    7:getfield        #278 <Field boolean n>
	//    5   10:istore          6
					flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore          5
					if(!flag2 && i1 == 0 && getChildCount() > 1)
	//*   8   15:iload           6
	//*   9   17:ifne            70
	//*  10   20:iload           4
	//*  11   22:ifne            70
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #169 <Method int getChildCount()>
	//*  14   29:iconst_1        
	//*  15   30:icmple          70
					{
						View view = getChildAt(1);
	//   16   33:aload_0         
	//   17   34:iconst_1        
	//   18   35:invokevirtual   #173 <Method View getChildAt(int)>
	//   19   38:astore          7
						if(view != null)
	//*  20   40:aload           7
	//*  21   42:ifnull          70
							f = e.b(view, (int)motionevent.getX(), (int)motionevent.getY()) ^ true;
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #142 <Field p e>
	//   25   50:aload           7
	//   26   52:aload_1         
	//   27   53:invokevirtual   #437 <Method float MotionEvent.getX()>
	//   28   56:f2i             
	//   29   57:aload_1         
	//   30   58:invokevirtual   #440 <Method float MotionEvent.getY()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #442 <Method boolean p.b(View, int, int)>
	//   33   65:iconst_1        
	//   34   66:ixor            
	//   35   67:putfield        #235 <Field boolean f>
					}
					if(!n || d && i1 != 0)
	//*  36   70:aload_0         
	//*  37   71:getfield        #278 <Field boolean n>
	//*  38   74:ifeq            280
	//*  39   77:aload_0         
	//*  40   78:getfield        #444 <Field boolean d>
	//*  41   81:ifeq            92
	//*  42   84:iload           4
	//*  43   86:ifeq            92
						break label0;
	//   44   89:goto            280
					if(i1 == 3 || i1 == 1)
	//*  45   92:iload           4
	//*  46   94:iconst_3        
	//*  47   95:icmpeq          271
	//*  48   98:iload           4
	//*  49  100:iconst_1        
	//*  50  101:icmpne          107
						break label1;
	//   51  104:goto            271
					if(i1 != 0)
	//*  52  107:iload           4
	//*  53  109:ifeq            184
					{
						if(i1 == 2)
	//*  54  112:iload           4
	//*  55  114:iconst_2        
	//*  56  115:icmpeq          121
	//*  57  118:goto            244
						{
							float f3 = motionevent.getX();
	//   58  121:aload_1         
	//   59  122:invokevirtual   #437 <Method float MotionEvent.getX()>
	//   60  125:fstore_3        
							float f1 = motionevent.getY();
	//   61  126:aload_1         
	//   62  127:invokevirtual   #440 <Method float MotionEvent.getY()>
	//   63  130:fstore_2        
							f3 = Math.abs(f3 - q);
	//   64  131:fload_3         
	//   65  132:aload_0         
	//   66  133:getfield        #446 <Field float q>
	//   67  136:fsub            
	//   68  137:invokestatic    #450 <Method float Math.abs(float)>
	//   69  140:fstore_3        
							f1 = Math.abs(f1 - r);
	//   70  141:fload_2         
	//   71  142:aload_0         
	//   72  143:getfield        #452 <Field float r>
	//   73  146:fsub            
	//   74  147:invokestatic    #450 <Method float Math.abs(float)>
	//   75  150:fstore_2        
							if(f3 > (float)e.d() && f1 > f3)
	//*  76  151:fload_3         
	//*  77  152:aload_0         
	//*  78  153:getfield        #142 <Field p e>
	//*  79  156:invokevirtual   #454 <Method int p.d()>
	//*  80  159:i2f             
	//*  81  160:fcmpl           
	//*  82  161:ifle            244
	//*  83  164:fload_2         
	//*  84  165:fload_3         
	//*  85  166:fcmpl           
	//*  86  167:ifle            244
							{
								e.e();
	//   87  170:aload_0         
	//   88  171:getfield        #142 <Field p e>
	//   89  174:invokevirtual   #456 <Method void p.e()>
								d = true;
	//   90  177:aload_0         
	//   91  178:iconst_1        
	//   92  179:putfield        #444 <Field boolean d>
								return false;
	//   93  182:iconst_0        
	//   94  183:ireturn         
							}
						}
					} else
					{
						d = false;
	//   95  184:aload_0         
	//   96  185:iconst_0        
	//   97  186:putfield        #444 <Field boolean d>
						float f2 = motionevent.getX();
	//   98  189:aload_1         
	//   99  190:invokevirtual   #437 <Method float MotionEvent.getX()>
	//  100  193:fstore_2        
						float f4 = motionevent.getY();
	//  101  194:aload_1         
	//  102  195:invokevirtual   #440 <Method float MotionEvent.getY()>
	//  103  198:fstore_3        
						q = f2;
	//  104  199:aload_0         
	//  105  200:fload_2         
	//  106  201:putfield        #446 <Field float q>
						r = f4;
	//  107  204:aload_0         
	//  108  205:fload_3         
	//  109  206:putfield        #452 <Field float r>
						if(e.b(a, (int)f2, (int)f4) && f(a))
	//* 110  209:aload_0         
	//* 111  210:getfield        #142 <Field p e>
	//* 112  213:aload_0         
	//* 113  214:getfield        #151 <Field View a>
	//* 114  217:fload_2         
	//* 115  218:f2i             
	//* 116  219:fload_3         
	//* 117  220:f2i             
	//* 118  221:invokevirtual   #442 <Method boolean p.b(View, int, int)>
	//* 119  224:ifeq            244
	//* 120  227:aload_0         
	//* 121  228:aload_0         
	//* 122  229:getfield        #151 <Field View a>
	//* 123  232:invokevirtual   #458 <Method boolean f(View)>
	//* 124  235:ifeq            244
						{
							flag = true;
	//  125  238:iconst_1        
	//  126  239:istore          4
							break label2;
	//  127  241:goto            247
						}
					}
					flag = false;
	//  128  244:iconst_0        
	//  129  245:istore          4
				}
				if(!e.a(motionevent))
	//* 130  247:aload_0         
	//* 131  248:getfield        #142 <Field p e>
	//* 132  251:aload_1         
	//* 133  252:invokevirtual   #460 <Method boolean android.support.v4.widget.p.a(MotionEvent)>
	//* 134  255:ifne            268
				{
					if(flag)
	//* 135  258:iload           4
	//* 136  260:ifeq            265
						return true;
	//  137  263:iconst_1        
	//  138  264:ireturn         
					flag1 = false;
	//  139  265:iconst_0        
	//  140  266:istore          5
				}
				return flag1;
	//  141  268:iload           5
	//  142  270:ireturn         
			}
			e.e();
	//  143  271:aload_0         
	//  144  272:getfield        #142 <Field p e>
	//  145  275:invokevirtual   #456 <Method void p.e()>
			return false;
	//  146  278:iconst_0        
	//  147  279:ireturn         
		}
		e.e();
	//  148  280:aload_0         
	//  149  281:getfield        #142 <Field p e>
	//  150  284:invokevirtual   #456 <Method void p.e()>
		return super.onInterceptTouchEvent(motionevent);
	//  151  287:aload_0         
	//  152  288:aload_1         
	//  153  289:invokespecial   #462 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//  154  292:ireturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		boolean flag1 = f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method boolean f()>
	//    2    4:istore          14
		if(flag1)
	//*   3    6:iload           14
	//*   4    8:ifeq            22
			e.a(2);
	//    5   11:aload_0         
	//    6   12:getfield        #142 <Field p e>
	//    7   15:iconst_2        
	//    8   16:invokevirtual   #466 <Method void android.support.v4.widget.p.a(int)>
		else
	//*   9   19:goto            30
			e.a(1);
	//   10   22:aload_0         
	//   11   23:getfield        #142 <Field p e>
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #466 <Method void android.support.v4.widget.p.a(int)>
		int i3 = k1 - i1;
	//   14   30:iload           4
	//   15   32:iload_2         
	//   16   33:isub            
	//   17   34:istore          9
		if(flag1)
	//*  18   36:iload           14
	//*  19   38:ifeq            49
			i1 = getPaddingRight();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #263 <Method int getPaddingRight()>
	//   22   45:istore_2        
		else
	//*  23   46:goto            54
			i1 = getPaddingLeft();
	//   24   49:aload_0         
	//   25   50:invokevirtual   #266 <Method int getPaddingLeft()>
	//   26   53:istore_2        
		if(flag1)
	//*  27   54:iload           14
	//*  28   56:ifeq            68
			k1 = getPaddingLeft();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #266 <Method int getPaddingLeft()>
	//   31   63:istore          4
		else
	//*  32   65:goto            74
			k1 = getPaddingRight();
	//   33   68:aload_0         
	//   34   69:invokevirtual   #263 <Method int getPaddingRight()>
	//   35   72:istore          4
		int k3 = getPaddingTop();
	//   36   74:aload_0         
	//   37   75:invokevirtual   #311 <Method int getPaddingTop()>
	//   38   78:istore          11
		int j3 = getChildCount();
	//   39   80:aload_0         
	//   40   81:invokevirtual   #169 <Method int getChildCount()>
	//   41   84:istore          10
		if(t)
	//*  42   86:aload_0         
	//*  43   87:getfield        #88  <Field boolean t>
	//*  44   90:ifeq            122
		{
			float f1;
			if(n && f)
	//*  45   93:aload_0         
	//*  46   94:getfield        #278 <Field boolean n>
	//*  47   97:ifeq            113
	//*  48  100:aload_0         
	//*  49  101:getfield        #235 <Field boolean f>
	//*  50  104:ifeq            113
				f1 = 1.0F;
	//   51  107:fconst_1        
	//   52  108:fstore          6
			else
	//*  53  110:goto            116
				f1 = 0.0F;
	//   54  113:fconst_0        
	//   55  114:fstore          6
			b = f1;
	//   56  116:aload_0         
	//   57  117:fload           6
	//   58  119:putfield        #256 <Field float b>
		}
		j1 = i1;
	//   59  122:iload_2         
	//   60  123:istore_3        
		for(l1 = 0; l1 < j3; l1++)
	//*  61  124:iconst_0        
	//*  62  125:istore          5
	//*  63  127:iload           5
	//*  64  129:iload           10
	//*  65  131:icmpge          427
		{
			int j2;
			int l3;
			View view;
label0:
			{
				view = getChildAt(l1);
	//   66  134:aload_0         
	//   67  135:iload           5
	//   68  137:invokevirtual   #173 <Method View getChildAt(int)>
	//   69  140:astore          15
				if(view.getVisibility() == 8)
	//*  70  142:aload           15
	//*  71  144:invokevirtual   #251 <Method int View.getVisibility()>
	//*  72  147:bipush          8
	//*  73  149:icmpne          155
					continue;
	//   74  152:goto            418
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   75  155:aload           15
	//   76  157:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   77  160:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//   78  163:astore          16
				l3 = view.getMeasuredWidth();
	//   79  165:aload           15
	//   80  167:invokevirtual   #469 <Method int View.getMeasuredWidth()>
	//   81  170:istore          12
				if(layoutparams.b)
	//*  82  172:aload           16
	//*  83  174:getfield        #363 <Field boolean SlidingPaneLayout$LayoutParams.b>
	//*  84  177:ifeq            315
				{
					int i2 = layoutparams.leftMargin;
	//   85  180:aload           16
	//   86  182:getfield        #165 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   87  185:istore          7
					int i4 = layoutparams.rightMargin;
	//   88  187:aload           16
	//   89  189:getfield        #162 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   90  192:istore          13
					int k2 = i3 - k1;
	//   91  194:iload           9
	//   92  196:iload           4
	//   93  198:isub            
	//   94  199:istore          8
					i4 = Math.min(i1, k2 - m) - j1 - (i2 + i4);
	//   95  201:iload_2         
	//   96  202:iload           8
	//   97  204:aload_0         
	//   98  205:getfield        #119 <Field int m>
	//   99  208:isub            
	//  100  209:invokestatic    #337 <Method int Math.min(int, int)>
	//  101  212:iload_3         
	//  102  213:isub            
	//  103  214:iload           7
	//  104  216:iload           13
	//  105  218:iadd            
	//  106  219:isub            
	//  107  220:istore          13
					c = i4;
	//  108  222:aload_0         
	//  109  223:iload           13
	//  110  225:putfield        #268 <Field int c>
					if(flag1)
	//* 111  228:iload           14
	//* 112  230:ifeq            243
						i2 = layoutparams.rightMargin;
	//  113  233:aload           16
	//  114  235:getfield        #162 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  115  238:istore          7
					else
	//* 116  240:goto            250
						i2 = layoutparams.leftMargin;
	//  117  243:aload           16
	//  118  245:getfield        #165 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  119  248:istore          7
					if(j1 + i2 + i4 + l3 / 2 > k2)
	//* 120  250:iload_3         
	//* 121  251:iload           7
	//* 122  253:iadd            
	//* 123  254:iload           13
	//* 124  256:iadd            
	//* 125  257:iload           12
	//* 126  259:iconst_2        
	//* 127  260:idiv            
	//* 128  261:iadd            
	//* 129  262:iload           8
	//* 130  264:icmple          272
						flag = true;
	//  131  267:iconst_1        
	//  132  268:istore_1        
					else
	//* 133  269:goto            274
						flag = false;
	//  134  272:iconst_0        
	//  135  273:istore_1        
					layoutparams.c = flag;
	//  136  274:aload           16
	//  137  276:iload_1         
	//  138  277:putfield        #159 <Field boolean SlidingPaneLayout$LayoutParams.c>
					k2 = (int)((float)i4 * b);
	//  139  280:iload           13
	//  140  282:i2f             
	//  141  283:aload_0         
	//  142  284:getfield        #256 <Field float b>
	//  143  287:fmul            
	//  144  288:f2i             
	//  145  289:istore          8
					j1 = i2 + k2 + j1;
	//  146  291:iload           7
	//  147  293:iload           8
	//  148  295:iadd            
	//  149  296:iload_3         
	//  150  297:iadd            
	//  151  298:istore_3        
					b = (float)k2 / (float)c;
	//  152  299:aload_0         
	//  153  300:iload           8
	//  154  302:i2f             
	//  155  303:aload_0         
	//  156  304:getfield        #268 <Field int c>
	//  157  307:i2f             
	//  158  308:fdiv            
	//  159  309:putfield        #256 <Field float b>
				} else
	//* 160  312:goto            351
				{
					if(n && p != 0)
	//* 161  315:aload_0         
	//* 162  316:getfield        #278 <Field boolean n>
	//* 163  319:ifeq            349
	//* 164  322:aload_0         
	//* 165  323:getfield        #177 <Field int p>
	//* 166  326:ifeq            349
					{
						j2 = (int)((1.0F - b) * (float)p);
	//  167  329:fconst_1        
	//  168  330:aload_0         
	//  169  331:getfield        #256 <Field float b>
	//  170  334:fsub            
	//  171  335:aload_0         
	//  172  336:getfield        #177 <Field int p>
	//  173  339:i2f             
	//  174  340:fmul            
	//  175  341:f2i             
	//  176  342:istore          7
						j1 = i1;
	//  177  344:iload_2         
	//  178  345:istore_3        
						break label0;
	//  179  346:goto            354
					}
					j1 = i1;
	//  180  349:iload_2         
	//  181  350:istore_3        
				}
				j2 = 0;
	//  182  351:iconst_0        
	//  183  352:istore          7
			}
			int l2;
			if(flag1)
	//* 184  354:iload           14
	//* 185  356:ifeq            378
			{
				l2 = (i3 - j1) + j2;
	//  186  359:iload           9
	//  187  361:iload_3         
	//  188  362:isub            
	//  189  363:iload           7
	//  190  365:iadd            
	//  191  366:istore          8
				j2 = l2 - l3;
	//  192  368:iload           8
	//  193  370:iload           12
	//  194  372:isub            
	//  195  373:istore          7
			} else
	//* 196  375:goto            391
			{
				j2 = j1 - j2;
	//  197  378:iload_3         
	//  198  379:iload           7
	//  199  381:isub            
	//  200  382:istore          7
				l2 = j2 + l3;
	//  201  384:iload           7
	//  202  386:iload           12
	//  203  388:iadd            
	//  204  389:istore          8
			}
			view.layout(j2, k3, l2, view.getMeasuredHeight() + k3);
	//  205  391:aload           15
	//  206  393:iload           7
	//  207  395:iload           11
	//  208  397:iload           8
	//  209  399:aload           15
	//  210  401:invokevirtual   #472 <Method int View.getMeasuredHeight()>
	//  211  404:iload           11
	//  212  406:iadd            
	//  213  407:invokevirtual   #475 <Method void View.layout(int, int, int, int)>
			i1 += view.getWidth();
	//  214  410:iload_2         
	//  215  411:aload           15
	//  216  413:invokevirtual   #259 <Method int View.getWidth()>
	//  217  416:iadd            
	//  218  417:istore_2        
		}

	//  219  418:iload           5
	//  220  420:iconst_1        
	//  221  421:iadd            
	//  222  422:istore          5
	//* 223  424:goto            127
		if(t)
	//* 224  427:aload_0         
	//* 225  428:getfield        #88  <Field boolean t>
	//* 226  431:ifeq            528
		{
			if(n)
	//* 227  434:aload_0         
	//* 228  435:getfield        #278 <Field boolean n>
	//* 229  438:ifeq            491
			{
				if(p != 0)
	//* 230  441:aload_0         
	//* 231  442:getfield        #177 <Field int p>
	//* 232  445:ifeq            456
					a(b);
	//  233  448:aload_0         
	//  234  449:aload_0         
	//  235  450:getfield        #256 <Field float b>
	//  236  453:invokespecial   #269 <Method void a(float)>
				if(((LayoutParams)a.getLayoutParams()).c)
	//* 237  456:aload_0         
	//* 238  457:getfield        #151 <Field View a>
	//* 239  460:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 240  463:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//* 241  466:getfield        #159 <Field boolean SlidingPaneLayout$LayoutParams.c>
	//* 242  469:ifeq            520
					a(a, b, i);
	//  243  472:aload_0         
	//  244  473:aload_0         
	//  245  474:getfield        #151 <Field View a>
	//  246  477:aload_0         
	//  247  478:getfield        #256 <Field float b>
	//  248  481:aload_0         
	//  249  482:getfield        #86  <Field int i>
	//  250  485:invokespecial   #186 <Method void a(View, float, int)>
			} else
	//* 251  488:goto            520
			{
				for(i1 = 0; i1 < j3; i1++)
	//* 252  491:iconst_0        
	//* 253  492:istore_2        
	//* 254  493:iload_2         
	//* 255  494:iload           10
	//* 256  496:icmpge          520
					a(getChildAt(i1), 0.0F, i);
	//  257  499:aload_0         
	//  258  500:aload_0         
	//  259  501:iload_2         
	//  260  502:invokevirtual   #173 <Method View getChildAt(int)>
	//  261  505:fconst_0        
	//  262  506:aload_0         
	//  263  507:getfield        #86  <Field int i>
	//  264  510:invokespecial   #186 <Method void a(View, float, int)>

	//  265  513:iload_2         
	//  266  514:iconst_1        
	//  267  515:iadd            
	//  268  516:istore_2        
			}
	//* 269  517:goto            493
			d(a);
	//  270  520:aload_0         
	//  271  521:aload_0         
	//  272  522:getfield        #151 <Field View a>
	//  273  525:invokevirtual   #477 <Method void d(View)>
		}
		t = false;
	//  274  528:aload_0         
	//  275  529:iconst_0        
	//  276  530:putfield        #88  <Field boolean t>
	//  277  533:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		float f2;
		int k2;
		int l2;
		int i3;
		int k3;
		int k4;
		int l4;
		boolean flag1;
		k3 = android.view.View.MeasureSpec.getMode(i1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #484 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          9
		int k1 = android.view.View.MeasureSpec.getSize(i1);
	//    3    6:iload_1         
	//    4    7:invokestatic    #487 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore          5
		l2 = android.view.View.MeasureSpec.getMode(j1);
	//    6   12:iload_2         
	//    7   13:invokestatic    #484 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   16:istore          7
		j1 = android.view.View.MeasureSpec.getSize(j1);
	//    9   18:iload_2         
	//   10   19:invokestatic    #487 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:istore_2        
		if(k3 != 0x40000000)
	//*  12   23:iload           9
	//*  13   25:ldc2            #488 <Int 0x40000000>
	//*  14   28:icmpeq          99
		{
			if(isInEditMode())
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #491 <Method boolean isInEditMode()>
	//*  17   35:ifeq            88
			{
				if(k3 == 0x80000000)
	//*  18   38:iload           9
	//*  19   40:ldc2            #492 <Int 0x80000000>
	//*  20   43:icmpne          59
				{
					k2 = k1;
	//   21   46:iload           5
	//   22   48:istore          6
					i3 = l2;
	//   23   50:iload           7
	//   24   52:istore          8
					i1 = j1;
	//   25   54:iload_2         
	//   26   55:istore_1        
				} else
	//*  27   56:goto            163
				{
					k2 = k1;
	//   28   59:iload           5
	//   29   61:istore          6
					i3 = l2;
	//   30   63:iload           7
	//   31   65:istore          8
					i1 = j1;
	//   32   67:iload_2         
	//   33   68:istore_1        
					if(k3 == 0)
	//*  34   69:iload           9
	//*  35   71:ifne            163
					{
						k2 = 300;
	//   36   74:sipush          300
	//   37   77:istore          6
						i3 = l2;
	//   38   79:iload           7
	//   39   81:istore          8
						i1 = j1;
	//   40   83:iload_2         
	//   41   84:istore_1        
					}
				}
			} else
	//*  42   85:goto            163
			{
				throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
	//   43   88:new             #494 <Class IllegalStateException>
	//   44   91:dup             
	//   45   92:ldc2            #496 <String "Width must have an exact value or MATCH_PARENT">
	//   46   95:invokespecial   #499 <Method void IllegalStateException(String)>
	//   47   98:athrow          
			}
		} else
		{
			k2 = k1;
	//   48   99:iload           5
	//   49  101:istore          6
			i3 = l2;
	//   50  103:iload           7
	//   51  105:istore          8
			i1 = j1;
	//   52  107:iload_2         
	//   53  108:istore_1        
			if(l2 == 0)
	//*  54  109:iload           7
	//*  55  111:ifne            163
				if(isInEditMode())
	//*  56  114:aload_0         
	//*  57  115:invokevirtual   #491 <Method boolean isInEditMode()>
	//*  58  118:ifeq            152
				{
					k2 = k1;
	//   59  121:iload           5
	//   60  123:istore          6
					i3 = l2;
	//   61  125:iload           7
	//   62  127:istore          8
					i1 = j1;
	//   63  129:iload_2         
	//   64  130:istore_1        
					if(l2 == 0)
	//*  65  131:iload           7
	//*  66  133:ifne            163
					{
						i3 = 0x80000000;
	//   67  136:ldc2            #492 <Int 0x80000000>
	//   68  139:istore          8
						i1 = 300;
	//   69  141:sipush          300
	//   70  144:istore_1        
						k2 = k1;
	//   71  145:iload           5
	//   72  147:istore          6
					}
				} else
	//*  73  149:goto            163
				{
					throw new IllegalStateException("Height must not be UNSPECIFIED");
	//   74  152:new             #494 <Class IllegalStateException>
	//   75  155:dup             
	//   76  156:ldc2            #501 <String "Height must not be UNSPECIFIED">
	//   77  159:invokespecial   #499 <Method void IllegalStateException(String)>
	//   78  162:athrow          
				}
		}
		if(i3 != 0x80000000)
	//*  79  163:iload           8
	//*  80  165:ldc2            #492 <Int 0x80000000>
	//*  81  168:icmpeq          203
		{
			if(i3 != 0x40000000)
	//*  82  171:iload           8
	//*  83  173:ldc2            #488 <Int 0x40000000>
	//*  84  176:icmpeq          186
			{
				i1 = 0;
	//   85  179:iconst_0        
	//   86  180:istore_1        
				j1 = 0;
	//   87  181:iconst_0        
	//   88  182:istore_2        
			} else
	//*  89  183:goto            217
			{
				i1 = i1 - getPaddingTop() - getPaddingBottom();
	//   90  186:iload_1         
	//   91  187:aload_0         
	//   92  188:invokevirtual   #311 <Method int getPaddingTop()>
	//   93  191:isub            
	//   94  192:aload_0         
	//   95  193:invokevirtual   #317 <Method int getPaddingBottom()>
	//   96  196:isub            
	//   97  197:istore_1        
				j1 = i1;
	//   98  198:iload_1         
	//   99  199:istore_2        
			}
		} else
	//* 100  200:goto            217
		{
			j1 = i1 - getPaddingTop() - getPaddingBottom();
	//  101  203:iload_1         
	//  102  204:aload_0         
	//  103  205:invokevirtual   #311 <Method int getPaddingTop()>
	//  104  208:isub            
	//  105  209:aload_0         
	//  106  210:invokevirtual   #317 <Method int getPaddingBottom()>
	//  107  213:isub            
	//  108  214:istore_2        
			i1 = 0;
	//  109  215:iconst_0        
	//  110  216:istore_1        
		}
		k4 = k2 - getPaddingLeft() - getPaddingRight();
	//  111  217:iload           6
	//  112  219:aload_0         
	//  113  220:invokevirtual   #266 <Method int getPaddingLeft()>
	//  114  223:isub            
	//  115  224:aload_0         
	//  116  225:invokevirtual   #263 <Method int getPaddingRight()>
	//  117  228:isub            
	//  118  229:istore          11
		l4 = getChildCount();
	//  119  231:aload_0         
	//  120  232:invokevirtual   #169 <Method int getChildCount()>
	//  121  235:istore          12
		if(l4 > 2)
	//* 122  237:iload           12
	//* 123  239:iconst_2        
	//* 124  240:icmple          253
			Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
	//  125  243:ldc2            #503 <String "SlidingPaneLayout">
	//  126  246:ldc2            #505 <String "onMeasure: More than two child views are not supported.">
	//  127  249:invokestatic    #510 <Method int Log.e(String, String)>
	//  128  252:pop             
		a = null;
	//  129  253:aload_0         
	//  130  254:aconst_null     
	//  131  255:putfield        #151 <Field View a>
		l2 = k4;
	//  132  258:iload           11
	//  133  260:istore          7
		k3 = 0;
	//  134  262:iconst_0        
	//  135  263:istore          9
		flag1 = false;
	//  136  265:iconst_0        
	//  137  266:istore          15
		f2 = 0.0F;
	//  138  268:fconst_0        
	//  139  269:fstore          4
_L7:
		if(k3 >= l4) goto _L2; else goto _L1
	//  140  271:iload           9
	//  141  273:iload           12
	//  142  275:icmpge          607
_L1:
		float f1;
		int l1;
		View view;
		LayoutParams layoutparams;
		view = getChildAt(k3);
	//  143  278:aload_0         
	//  144  279:iload           9
	//  145  281:invokevirtual   #173 <Method View getChildAt(int)>
	//  146  284:astore          17
		layoutparams = (LayoutParams)view.getLayoutParams();
	//  147  286:aload           17
	//  148  288:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  149  291:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//  150  294:astore          18
		if(view.getVisibility() == 8)
	//* 151  296:aload           17
	//* 152  298:invokevirtual   #251 <Method int View.getVisibility()>
	//* 153  301:bipush          8
	//* 154  303:icmpne          318
		{
			layoutparams.c = false;
	//  155  306:aload           18
	//  156  308:iconst_0        
	//  157  309:putfield        #159 <Field boolean SlidingPaneLayout$LayoutParams.c>
			f1 = f2;
	//  158  312:fload           4
	//  159  314:fstore_3        
			break MISSING_BLOCK_LABEL_595;
	//  160  315:goto            595
		}
		f1 = f2;
	//  161  318:fload           4
	//  162  320:fstore_3        
		if(layoutparams.a > 0.0F)
	//* 163  321:aload           18
	//* 164  323:getfield        #512 <Field float android.support.v4.widget.SlidingPaneLayout$LayoutParams.a>
	//* 165  326:fconst_0        
	//* 166  327:fcmpl           
	//* 167  328:ifle            358
		{
			f2 += layoutparams.a;
	//  168  331:fload           4
	//  169  333:aload           18
	//  170  335:getfield        #512 <Field float android.support.v4.widget.SlidingPaneLayout$LayoutParams.a>
	//  171  338:fadd            
	//  172  339:fstore          4
			f1 = f2;
	//  173  341:fload           4
	//  174  343:fstore_3        
			if(layoutparams.width == 0)
	//* 175  344:aload           18
	//* 176  346:getfield        #515 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 177  349:ifne            358
			{
				f1 = f2;
	//  178  352:fload           4
	//  179  354:fstore_3        
				break MISSING_BLOCK_LABEL_595;
	//  180  355:goto            595
			}
		}
		l1 = layoutparams.leftMargin + layoutparams.rightMargin;
	//  181  358:aload           18
	//  182  360:getfield        #165 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  183  363:aload           18
	//  184  365:getfield        #162 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  185  368:iadd            
	//  186  369:istore          5
		if(layoutparams.width == -2)
	//* 187  371:aload           18
	//* 188  373:getfield        #515 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 189  376:bipush          -2
	//* 190  378:icmpne          397
		{
			l1 = android.view.View.MeasureSpec.makeMeasureSpec(k4 - l1, 0x80000000);
	//  191  381:iload           11
	//  192  383:iload           5
	//  193  385:isub            
	//  194  386:ldc2            #492 <Int 0x80000000>
	//  195  389:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  196  392:istore          5
		} else
	//* 197  394:goto            436
		{
			if(layoutparams.width == -1)
	//* 198  397:aload           18
	//* 199  399:getfield        #515 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 200  402:iconst_m1       
	//* 201  403:icmpne          426
				l1 = k4 - l1;
	//  202  406:iload           11
	//  203  408:iload           5
	//  204  410:isub            
	//  205  411:istore          5
			else
	//* 206  413:iload           5
	//* 207  415:ldc2            #488 <Int 0x40000000>
	//* 208  418:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 209  421:istore          5
	//* 210  423:goto            436
				l1 = layoutparams.width;
	//  211  426:aload           18
	//  212  428:getfield        #515 <Field int SlidingPaneLayout$LayoutParams.width>
	//  213  431:istore          5
			l1 = android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000);
		}
	//* 214  433:goto            413
		if(layoutparams.height != -2) goto _L4; else goto _L3
	//  215  436:aload           18
	//  216  438:getfield        #521 <Field int SlidingPaneLayout$LayoutParams.height>
	//  217  441:bipush          -2
	//  218  443:icmpne          462
_L3:
		int i4 = 0x80000000;
	//  219  446:ldc2            #492 <Int 0x80000000>
	//  220  449:istore          10
_L6:
		i4 = android.view.View.MeasureSpec.makeMeasureSpec(j1, i4);
	//  221  451:iload_2         
	//  222  452:iload           10
	//  223  454:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  224  457:istore          10
		break MISSING_BLOCK_LABEL_492;
	//  225  459:goto            492
_L4:
		if(layoutparams.height != -1)
			break; /* Loop/switch isn't completed */
	//  226  462:aload           18
	//  227  464:getfield        #521 <Field int SlidingPaneLayout$LayoutParams.height>
	//  228  467:iconst_m1       
	//  229  468:icmpne          479
		i4 = 0x40000000;
	//  230  471:ldc2            #488 <Int 0x40000000>
	//  231  474:istore          10
		if(true) goto _L6; else goto _L5
	//  232  476:goto            451
_L5:
		i4 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
	//  233  479:aload           18
	//  234  481:getfield        #521 <Field int SlidingPaneLayout$LayoutParams.height>
	//  235  484:ldc2            #488 <Int 0x40000000>
	//  236  487:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  237  490:istore          10
		view.measure(l1, i4);
	//  238  492:aload           17
	//  239  494:iload           5
	//  240  496:iload           10
	//  241  498:invokevirtual   #524 <Method void View.measure(int, int)>
		i4 = view.getMeasuredWidth();
	//  242  501:aload           17
	//  243  503:invokevirtual   #469 <Method int View.getMeasuredWidth()>
	//  244  506:istore          10
		int i5 = view.getMeasuredHeight();
	//  245  508:aload           17
	//  246  510:invokevirtual   #472 <Method int View.getMeasuredHeight()>
	//  247  513:istore          13
		l1 = i1;
	//  248  515:iload_1         
	//  249  516:istore          5
		if(i3 == 0x80000000)
	//* 250  518:iload           8
	//* 251  520:ldc2            #492 <Int 0x80000000>
	//* 252  523:icmpne          543
		{
			l1 = i1;
	//  253  526:iload_1         
	//  254  527:istore          5
			if(i5 > i1)
	//* 255  529:iload           13
	//* 256  531:iload_1         
	//* 257  532:icmple          543
				l1 = Math.min(i5, j1);
	//  258  535:iload           13
	//  259  537:iload_2         
	//  260  538:invokestatic    #337 <Method int Math.min(int, int)>
	//  261  541:istore          5
		}
		l2 -= i4;
	//  262  543:iload           7
	//  263  545:iload           10
	//  264  547:isub            
	//  265  548:istore          7
		boolean flag2;
		if(l2 < 0)
	//* 266  550:iload           7
	//* 267  552:ifge            561
			flag2 = true;
	//  268  555:iconst_1        
	//  269  556:istore          16
		else
	//* 270  558:goto            564
			flag2 = false;
	//  271  561:iconst_0        
	//  272  562:istore          16
		layoutparams.b = flag2;
	//  273  564:aload           18
	//  274  566:iload           16
	//  275  568:putfield        #363 <Field boolean SlidingPaneLayout$LayoutParams.b>
		if(layoutparams.b)
	//* 276  571:aload           18
	//* 277  573:getfield        #363 <Field boolean SlidingPaneLayout$LayoutParams.b>
	//* 278  576:ifeq            585
			a = view;
	//  279  579:aload_0         
	//  280  580:aload           17
	//  281  582:putfield        #151 <Field View a>
		flag1 = flag2 | flag1;
	//  282  585:iload           16
	//  283  587:iload           15
	//  284  589:ior             
	//  285  590:istore          15
		i1 = l1;
	//  286  592:iload           5
	//  287  594:istore_1        
		k3++;
	//  288  595:iload           9
	//  289  597:iconst_1        
	//  290  598:iadd            
	//  291  599:istore          9
		f2 = f1;
	//  292  601:fload_3         
	//  293  602:fstore          4
		  goto _L7
	//* 294  604:goto            271
_L2:
label0:
		{
			if(!flag1 && f2 <= 0.0F)
				break label0;
	//  295  607:iload           15
	//  296  609:ifne            619
	//  297  612:fload           4
	//  298  614:fconst_0        
	//  299  615:fcmpl           
	//  300  616:ifle            1043
			int j3 = k4 - m;
	//  301  619:iload           11
	//  302  621:aload_0         
	//  303  622:getfield        #119 <Field int m>
	//  304  625:isub            
	//  305  626:istore          8
			for(int l3 = 0; l3 < l4; l3++)
	//* 306  628:iconst_0        
	//* 307  629:istore          9
	//* 308  631:iload           9
	//* 309  633:iload           12
	//* 310  635:icmpge          1043
			{
				int j4;
				View view1;
				LayoutParams layoutparams1;
label1:
				{
					int i2;
label2:
					{
						view1 = getChildAt(l3);
	//  311  638:aload_0         
	//  312  639:iload           9
	//  313  641:invokevirtual   #173 <Method View getChildAt(int)>
	//  314  644:astore          17
						if(view1.getVisibility() == 8)
	//* 315  646:aload           17
	//* 316  648:invokevirtual   #251 <Method int View.getVisibility()>
	//* 317  651:bipush          8
	//* 318  653:icmpne          659
							continue;
	//  319  656:goto            1034
						layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  320  659:aload           17
	//  321  661:invokevirtual   #157 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  322  664:checkcast       #6   <Class SlidingPaneLayout$LayoutParams>
	//  323  667:astore          18
						if(view1.getVisibility() == 8)
	//* 324  669:aload           17
	//* 325  671:invokevirtual   #251 <Method int View.getVisibility()>
	//* 326  674:bipush          8
	//* 327  676:icmpne          682
							continue;
	//  328  679:goto            656
						boolean flag;
						if(layoutparams1.width == 0 && layoutparams1.a > 0.0F)
	//* 329  682:aload           18
	//* 330  684:getfield        #515 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 331  687:ifne            706
	//* 332  690:aload           18
	//* 333  692:getfield        #512 <Field float android.support.v4.widget.SlidingPaneLayout$LayoutParams.a>
	//* 334  695:fconst_0        
	//* 335  696:fcmpl           
	//* 336  697:ifle            706
							flag = true;
	//  337  700:iconst_1        
	//  338  701:istore          5
						else
	//* 339  703:goto            709
							flag = false;
	//  340  706:iconst_0        
	//  341  707:istore          5
						if(flag)
	//* 342  709:iload           5
	//* 343  711:ifeq            720
							j4 = 0;
	//  344  714:iconst_0        
	//  345  715:istore          10
						else
	//* 346  717:goto            727
							j4 = view1.getMeasuredWidth();
	//  347  720:aload           17
	//  348  722:invokevirtual   #469 <Method int View.getMeasuredWidth()>
	//  349  725:istore          10
						if(!flag1 || view1 == a)
							break label1;
	//  350  727:iload           15
	//  351  729:ifeq            859
	//  352  732:aload           17
	//  353  734:aload_0         
	//  354  735:getfield        #151 <Field View a>
	//  355  738:if_acmpeq       859
						if(layoutparams1.width >= 0 || j4 <= j3 && layoutparams1.a <= 0.0F)
							continue;
	//  356  741:aload           18
	//  357  743:getfield        #515 <Field int SlidingPaneLayout$LayoutParams.width>
	//  358  746:ifge            656
	//  359  749:iload           10
	//  360  751:iload           8
	//  361  753:icmpgt          766
	//  362  756:aload           18
	//  363  758:getfield        #512 <Field float android.support.v4.widget.SlidingPaneLayout$LayoutParams.a>
	//  364  761:fconst_0        
	//  365  762:fcmpl           
	//  366  763:ifle            656
						if(flag)
	//* 367  766:iload           5
	//* 368  768:ifeq            824
						{
							if(layoutparams1.height == -2)
	//* 369  771:aload           18
	//* 370  773:getfield        #521 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 371  776:bipush          -2
	//* 372  778:icmpne          793
							{
								i2 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
	//  373  781:iload_2         
	//  374  782:ldc2            #492 <Int 0x80000000>
	//  375  785:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  376  788:istore          5
								break label2;
	//  377  790:goto            841
							}
							if(layoutparams1.height == -1)
	//* 378  793:aload           18
	//* 379  795:getfield        #521 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 380  798:iconst_m1       
	//* 381  799:icmpne          814
							{
								i2 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
	//  382  802:iload_2         
	//  383  803:ldc2            #488 <Int 0x40000000>
	//  384  806:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  385  809:istore          5
								break label2;
	//  386  811:goto            841
							}
							i2 = layoutparams1.height;
	//  387  814:aload           18
	//  388  816:getfield        #521 <Field int SlidingPaneLayout$LayoutParams.height>
	//  389  819:istore          5
						} else
	//* 390  821:goto            831
						{
							i2 = view1.getMeasuredHeight();
	//  391  824:aload           17
	//  392  826:invokevirtual   #472 <Method int View.getMeasuredHeight()>
	//  393  829:istore          5
						}
						i2 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
	//  394  831:iload           5
	//  395  833:ldc2            #488 <Int 0x40000000>
	//  396  836:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  397  839:istore          5
					}
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000), i2);
	//  398  841:aload           17
	//  399  843:iload           8
	//  400  845:ldc2            #488 <Int 0x40000000>
	//  401  848:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  402  851:iload           5
	//  403  853:invokevirtual   #524 <Method void View.measure(int, int)>
					continue;
	//  404  856:goto            656
				}
				int j2;
label3:
				{
					if(layoutparams1.a <= 0.0F)
						continue;
	//  405  859:aload           18
	//  406  861:getfield        #512 <Field float android.support.v4.widget.SlidingPaneLayout$LayoutParams.a>
	//  407  864:fconst_0        
	//  408  865:fcmpl           
	//  409  866:ifle            656
					if(layoutparams1.width == 0)
	//* 410  869:aload           18
	//* 411  871:getfield        #515 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 412  874:ifne            930
					{
						if(layoutparams1.height == -2)
	//* 413  877:aload           18
	//* 414  879:getfield        #521 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 415  882:bipush          -2
	//* 416  884:icmpne          899
						{
							j2 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
	//  417  887:iload_2         
	//  418  888:ldc2            #492 <Int 0x80000000>
	//  419  891:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  420  894:istore          5
							break label3;
	//  421  896:goto            947
						}
						if(layoutparams1.height == -1)
	//* 422  899:aload           18
	//* 423  901:getfield        #521 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 424  904:iconst_m1       
	//* 425  905:icmpne          920
						{
							j2 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
	//  426  908:iload_2         
	//  427  909:ldc2            #488 <Int 0x40000000>
	//  428  912:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  429  915:istore          5
							break label3;
	//  430  917:goto            947
						}
						j2 = layoutparams1.height;
	//  431  920:aload           18
	//  432  922:getfield        #521 <Field int SlidingPaneLayout$LayoutParams.height>
	//  433  925:istore          5
					} else
	//* 434  927:goto            937
					{
						j2 = view1.getMeasuredHeight();
	//  435  930:aload           17
	//  436  932:invokevirtual   #472 <Method int View.getMeasuredHeight()>
	//  437  935:istore          5
					}
					j2 = android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000);
	//  438  937:iload           5
	//  439  939:ldc2            #488 <Int 0x40000000>
	//  440  942:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  441  945:istore          5
				}
				if(flag1)
	//* 442  947:iload           15
	//* 443  949:ifeq            997
				{
					int j5 = k4 - (layoutparams1.leftMargin + layoutparams1.rightMargin);
	//  444  952:iload           11
	//  445  954:aload           18
	//  446  956:getfield        #165 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  447  959:aload           18
	//  448  961:getfield        #162 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  449  964:iadd            
	//  450  965:isub            
	//  451  966:istore          13
					int l5 = android.view.View.MeasureSpec.makeMeasureSpec(j5, 0x40000000);
	//  452  968:iload           13
	//  453  970:ldc2            #488 <Int 0x40000000>
	//  454  973:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  455  976:istore          14
					if(j4 != j5)
	//* 456  978:iload           10
	//* 457  980:iload           13
	//* 458  982:icmpeq          656
						view1.measure(l5, j2);
	//  459  985:aload           17
	//  460  987:iload           14
	//  461  989:iload           5
	//  462  991:invokevirtual   #524 <Method void View.measure(int, int)>
				} else
	//* 463  994:goto            656
				{
					int k5 = Math.max(0, l2);
	//  464  997:iconst_0        
	//  465  998:iload           7
	//  466 1000:invokestatic    #334 <Method int Math.max(int, int)>
	//  467 1003:istore          13
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j4 + (int)((layoutparams1.a * (float)k5) / f2), 0x40000000), j2);
	//  468 1005:aload           17
	//  469 1007:iload           10
	//  470 1009:aload           18
	//  471 1011:getfield        #512 <Field float android.support.v4.widget.SlidingPaneLayout$LayoutParams.a>
	//  472 1014:iload           13
	//  473 1016:i2f             
	//  474 1017:fmul            
	//  475 1018:fload           4
	//  476 1020:fdiv            
	//  477 1021:f2i             
	//  478 1022:iadd            
	//  479 1023:ldc2            #488 <Int 0x40000000>
	//  480 1026:invokestatic    #518 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  481 1029:iload           5
	//  482 1031:invokevirtual   #524 <Method void View.measure(int, int)>
				}
			}

	//  483 1034:iload           9
	//  484 1036:iconst_1        
	//  485 1037:iadd            
	//  486 1038:istore          9
		}
	//* 487 1040:goto            631
		setMeasuredDimension(k2, i1 + getPaddingTop() + getPaddingBottom());
	//  488 1043:aload_0         
	//  489 1044:iload           6
	//  490 1046:iload_1         
	//  491 1047:aload_0         
	//  492 1048:invokevirtual   #311 <Method int getPaddingTop()>
	//  493 1051:iadd            
	//  494 1052:aload_0         
	//  495 1053:invokevirtual   #317 <Method int getPaddingBottom()>
	//  496 1056:iadd            
	//  497 1057:invokevirtual   #527 <Method void setMeasuredDimension(int, int)>
		n = flag1;
	//  498 1060:aload_0         
	//  499 1061:iload           15
	//  500 1063:putfield        #278 <Field boolean n>
		if(e.a() != 0 && !flag1)
	//* 501 1066:aload_0         
	//* 502 1067:getfield        #142 <Field p e>
	//* 503 1070:invokevirtual   #529 <Method int android.support.v4.widget.p.a()>
	//* 504 1073:ifeq            1088
	//* 505 1076:iload           15
	//* 506 1078:ifne            1088
			e.f();
	//  507 1081:aload_0         
	//  508 1082:getfield        #142 <Field p e>
	//  509 1085:invokevirtual   #308 <Method void p.f()>
		return;
	//  510 1088:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class SlidingPaneLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #533 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #9   <Class SlidingPaneLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).a());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #536 <Method Parcelable android.support.v4.widget.SlidingPaneLayout$SavedState.a()>
	//   13   23:invokespecial   #533 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).a)
	//*  14   26:aload_1         
	//*  15   27:getfield        #538 <Field boolean android.support.v4.widget.SlidingPaneLayout$SavedState.a>
	//*  16   30:ifeq            41
			b();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #540 <Method boolean b()>
	//   19   37:pop             
		else
	//*  20   38:goto            46
			c();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #542 <Method boolean c()>
	//   23   45:pop             
		f = ((SavedState) (parcelable)).a;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #538 <Field boolean android.support.v4.widget.SlidingPaneLayout$SavedState.a>
	//   27   51:putfield        #235 <Field boolean f>
	//   28   54:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #545 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #547 <Method void SlidingPaneLayout$SavedState(Parcelable)>
	//    5   11:astore_2        
		boolean flag;
		if(e())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #549 <Method boolean e()>
	//*   8   16:ifeq            27
			flag = d();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #551 <Method boolean d()>
	//   11   23:istore_1        
		else
	//*  12   24:goto            32
			flag = f;
	//   13   27:aload_0         
	//   14   28:getfield        #235 <Field boolean f>
	//   15   31:istore_1        
		savedstate.a = flag;
	//   16   32:aload_2         
	//   17   33:iload_1         
	//   18   34:putfield        #538 <Field boolean android.support.v4.widget.SlidingPaneLayout$SavedState.a>
		return ((Parcelable) (savedstate));
	//   19   37:aload_2         
	//   20   38:areturn         
	}

	protected void onSizeChanged(int i1, int j1, int k1, int l1)
	{
		super.onSizeChanged(i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #554 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i1 != k1)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          19
			t = true;
	//    9   14:aload_0         
	//   10   15:iconst_1        
	//   11   16:putfield        #88  <Field boolean t>
	//   12   19:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(!n)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field boolean n>
	//*   2    4:ifne            13
			return super.onTouchEvent(motionevent);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #557 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//    6   12:ireturn         
		e.b(motionevent);
	//    7   13:aload_0         
	//    8   14:getfield        #142 <Field p e>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #560 <Method void p.b(MotionEvent)>
		switch(motionevent.getActionMasked())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #433 <Method int MotionEvent.getActionMasked()>
		{
	//*  13   25:tableswitch     0 1: default 48
	//	               0 147
	//	               1 50
		default:
			return true;
	//   14   48:iconst_1        
	//   15   49:ireturn         

		case 1: // '\001'
			if(f(a))
	//*  16   50:aload_0         
	//*  17   51:aload_0         
	//*  18   52:getfield        #151 <Field View a>
	//*  19   55:invokevirtual   #458 <Method boolean f(View)>
	//*  20   58:ifeq            167
			{
				float f1 = motionevent.getX();
	//   21   61:aload_1         
	//   22   62:invokevirtual   #437 <Method float MotionEvent.getX()>
	//   23   65:fstore_2        
				float f3 = motionevent.getY();
	//   24   66:aload_1         
	//   25   67:invokevirtual   #440 <Method float MotionEvent.getY()>
	//   26   70:fstore_3        
				float f5 = f1 - q;
	//   27   71:fload_2         
	//   28   72:aload_0         
	//   29   73:getfield        #446 <Field float q>
	//   30   76:fsub            
	//   31   77:fstore          4
				float f6 = f3 - r;
	//   32   79:fload_3         
	//   33   80:aload_0         
	//   34   81:getfield        #452 <Field float r>
	//   35   84:fsub            
	//   36   85:fstore          5
				int i1 = e.d();
	//   37   87:aload_0         
	//   38   88:getfield        #142 <Field p e>
	//   39   91:invokevirtual   #454 <Method int p.d()>
	//   40   94:istore          6
				if(f5 * f5 + f6 * f6 < (float)(i1 * i1) && e.b(a, (int)f1, (int)f3))
	//*  41   96:fload           4
	//*  42   98:fload           4
	//*  43  100:fmul            
	//*  44  101:fload           5
	//*  45  103:fload           5
	//*  46  105:fmul            
	//*  47  106:fadd            
	//*  48  107:iload           6
	//*  49  109:iload           6
	//*  50  111:imul            
	//*  51  112:i2f             
	//*  52  113:fcmpg           
	//*  53  114:ifge            167
	//*  54  117:aload_0         
	//*  55  118:getfield        #142 <Field p e>
	//*  56  121:aload_0         
	//*  57  122:getfield        #151 <Field View a>
	//*  58  125:fload_2         
	//*  59  126:f2i             
	//*  60  127:fload_3         
	//*  61  128:f2i             
	//*  62  129:invokevirtual   #442 <Method boolean p.b(View, int, int)>
	//*  63  132:ifeq            167
				{
					a(a, 0);
	//   64  135:aload_0         
	//   65  136:aload_0         
	//   66  137:getfield        #151 <Field View a>
	//   67  140:iconst_0        
	//   68  141:invokespecial   #298 <Method boolean a(View, int)>
	//   69  144:pop             
					return true;
	//   70  145:iconst_1        
	//   71  146:ireturn         
				}
			}
			break;

		case 0: // '\0'
			float f2 = motionevent.getX();
	//   72  147:aload_1         
	//   73  148:invokevirtual   #437 <Method float MotionEvent.getX()>
	//   74  151:fstore_2        
			float f4 = motionevent.getY();
	//   75  152:aload_1         
	//   76  153:invokevirtual   #440 <Method float MotionEvent.getY()>
	//   77  156:fstore_3        
			q = f2;
	//   78  157:aload_0         
	//   79  158:fload_2         
	//   80  159:putfield        #446 <Field float q>
			r = f4;
	//   81  162:aload_0         
	//   82  163:fload_3         
	//   83  164:putfield        #452 <Field float r>
			break;
		}
		return true;
	//   84  167:iconst_1        
	//   85  168:ireturn         
	}

	public void requestChildFocus(View view, View view1)
	{
		super.requestChildFocus(view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #564 <Method void ViewGroup.requestChildFocus(View, View)>
		if(!isInTouchMode() && !n)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #567 <Method boolean isInTouchMode()>
	//*   6   10:ifne            40
	//*   7   13:aload_0         
	//*   8   14:getfield        #278 <Field boolean n>
	//*   9   17:ifne            40
		{
			boolean flag;
			if(view == a)
	//*  10   20:aload_1         
	//*  11   21:aload_0         
	//*  12   22:getfield        #151 <Field View a>
	//*  13   25:if_acmpne       33
				flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_3        
			else
	//*  16   30:goto            35
				flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_3        
			f = flag;
	//   19   35:aload_0         
	//   20   36:iload_3         
	//   21   37:putfield        #235 <Field boolean f>
		}
	//   22   40:return          
	}

	public void setCoveredFadeColor(int i1)
	{
		j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #183 <Field int j>
	//    3    5:return          
	}

	public void setPanelSlideListener(d d1)
	{
		s = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #273 <Field SlidingPaneLayout$d s>
	//    3    5:return          
	}

	public void setParallaxDistance(int i1)
	{
		p = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #177 <Field int p>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #574 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setShadowDrawable(Drawable drawable)
	{
		setShadowDrawableLeft(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #580 <Method void setShadowDrawableLeft(Drawable)>
	//    3    5:return          
	}

	public void setShadowDrawableLeft(Drawable drawable)
	{
		k = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #345 <Field Drawable k>
	//    3    5:return          
	}

	public void setShadowDrawableRight(Drawable drawable)
	{
		l = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #343 <Field Drawable l>
	//    3    5:return          
	}

	public void setShadowResource(int i1)
	{
		setShadowDrawable(getResources().getDrawable(i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #584 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #588 <Method Drawable Resources.getDrawable(int)>
	//    5    9:invokevirtual   #590 <Method void setShadowDrawable(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceLeft(int i1)
	{
		setShadowDrawableLeft(android.support.v4.content.a.getDrawable(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #394 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #596 <Method Drawable a.getDrawable(Context, int)>
	//    5    9:invokevirtual   #580 <Method void setShadowDrawableLeft(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceRight(int i1)
	{
		setShadowDrawableRight(android.support.v4.content.a.getDrawable(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #394 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #596 <Method Drawable a.getDrawable(Context, int)>
	//    5    9:invokevirtual   #599 <Method void setShadowDrawableRight(Drawable)>
	//    6   12:return          
	}

	public void setSliderFadeColor(int i1)
	{
		i = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field int i>
	//    3    5:return          
	}

	static final e h;
	View a;
	float b;
	int c;
	boolean d;
	final p e;
	boolean f;
	final ArrayList g;
	private int i;
	private int j;
	private Drawable k;
	private Drawable l;
	private final int m;
	private boolean n;
	private float o;
	private int p;
	private float q;
	private float r;
	private d s;
	private boolean t;
	private final Rect u;

	static 
	{
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          21
			obj = ((Object) (new h()));
	//    3    8:new             #35  <Class SlidingPaneLayout$h>
	//    4   11:dup             
	//    5   12:invokespecial   #70  <Method void SlidingPaneLayout$h()>
	//    6   15:astore_0        
		else
	//*   7   16:aload_0         
	//*   8   17:putstatic       #72  <Field SlidingPaneLayout$e h>
	//*   9   20:return          
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  10   21:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   24:bipush          16
	//*  12   26:icmplt          40
			obj = ((Object) (new g()));
	//   13   29:new             #32  <Class SlidingPaneLayout$g>
	//   14   32:dup             
	//   15   33:invokespecial   #73  <Method void SlidingPaneLayout$g()>
	//   16   36:astore_0        
		else
	//*  17   37:goto            16
			obj = ((Object) (new f()));
	//   18   40:new             #29  <Class SlidingPaneLayout$f>
	//   19   43:dup             
	//   20   44:invokespecial   #74  <Method void SlidingPaneLayout$f()>
	//   21   47:astore_0        
		h = ((e) (obj));
	//*  22   48:goto            16
	}
}
