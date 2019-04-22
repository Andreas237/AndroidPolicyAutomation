// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//			ViewDragHelper

public class SlidingPaneLayout extends ViewGroup
{
	private class DisableLayerRunnable
		implements Runnable
	{

		public void run()
		{
			if(mChildView.getParent() == SlidingPaneLayout.this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field View mChildView>
		//*   2    4:invokevirtual   #30  <Method android.view.ViewParent View.getParent()>
		//*   3    7:aload_0         
		//*   4    8:getfield        #17  <Field SlidingPaneLayout this$0>
		//*   5   11:if_acmpne       34
			{
				mChildView.setLayerType(0, ((Paint) (null)));
		//    6   14:aload_0         
		//    7   15:getfield        #22  <Field View mChildView>
		//    8   18:iconst_0        
		//    9   19:aconst_null     
		//   10   20:invokevirtual   #34  <Method void View.setLayerType(int, Paint)>
				invalidateChildRegion(mChildView);
		//   11   23:aload_0         
		//   12   24:getfield        #17  <Field SlidingPaneLayout this$0>
		//   13   27:aload_0         
		//   14   28:getfield        #22  <Field View mChildView>
		//   15   31:invokevirtual   #38  <Method void SlidingPaneLayout.invalidateChildRegion(View)>
			}
			mPostedRunnables.remove(((Object) (this)));
		//   16   34:aload_0         
		//   17   35:getfield        #17  <Field SlidingPaneLayout this$0>
		//   18   38:getfield        #42  <Field ArrayList SlidingPaneLayout.mPostedRunnables>
		//   19   41:aload_0         
		//   20   42:invokevirtual   #48  <Method boolean ArrayList.remove(Object)>
		//   21   45:pop             
		//   22   46:return          
		}

		final View mChildView;
		final SlidingPaneLayout this$0;

		DisableLayerRunnable(View view)
		{
			this$0 = SlidingPaneLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field SlidingPaneLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			mChildView = view;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field View mChildView>
		//    8   14:return          
		}
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		private static final int ATTRS[] = {
			0x1010181
		};
		Paint dimPaint;
		boolean dimWhenOffset;
		boolean slideable;
		public float weight;

		static 
		{
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:ldc1            #19  <Int 0x1010181>
		//    5    7:iastore         
		//    6    8:putstatic       #21  <Field int[] ATTRS>
		//*   7   11:return          
		}

		public LayoutParams()
		{
			super(-1, -1);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:iconst_m1       
		//    3    3:invokespecial   #26  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			weight = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #28  <Field float weight>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #33  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			weight = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #28  <Field float weight>
			context = ((Context) (context.obtainStyledAttributes(attributeset, ATTRS)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #21  <Field int[] ATTRS>
		//   10   16:invokevirtual   #39  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			weight = ((TypedArray) (context)).getFloat(0, 0.0F);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:fconst_0        
		//   16   24:invokevirtual   #45  <Method float TypedArray.getFloat(int, float)>
		//   17   27:putfield        #28  <Field float weight>
			((TypedArray) (context)).recycle();
		//   18   30:aload_1         
		//   19   31:invokevirtual   #48  <Method void TypedArray.recycle()>
		//   20   34:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #52  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			weight = 0.0F;
		//    3    5:aload_0         
		//    4    6:fconst_0        
		//    5    7:putfield        #28  <Field float weight>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #55  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			weight = 0.0F;
		//    3    5:aload_0         
		//    4    6:fconst_0        
		//    5    7:putfield        #28  <Field float weight>
		//    6   10:return          
		}
	}

	public static interface PanelSlideListener
	{

		public abstract void onPanelClosed(View view);

		public abstract void onPanelOpened(View view);

		public abstract void onPanelSlide(View view, float f);
	}

	static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #40  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #42  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #47  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #34  <Method SlidingPaneLayout$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean isOpen;

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
			isOpen = flag;
		//   12   20:aload_0         
		//   13   21:iload_3         
		//   14   22:putfield        #33  <Field boolean isOpen>
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


	private boolean closePane(View view, int i)
	{
		if(!mFirstLayout && !smoothSlideTo(0.0F, i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field boolean mFirstLayout>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:fconst_0        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #61  <Method boolean smoothSlideTo(float, int)>
	//*   7   13:ifeq            19
	//*   8   16:goto            21
		{
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		} else
		{
			mPreservedOpenState = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #63  <Field boolean mPreservedOpenState>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		}
	}

	private void dimChildView(View view, float f, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          5
		if(f > 0.0F && i != 0)
	//*   4    9:fload_2         
	//*   5   10:fconst_0        
	//*   6   11:fcmpl           
	//*   7   12:ifle            105
	//*   8   15:iload_3         
	//*   9   16:ifeq            105
		{
			int j = (int)((float)((0xff000000 & i) >>> 24) * f);
	//   10   19:ldc1            #73  <Int 0xff000000>
	//   11   21:iload_3         
	//   12   22:iand            
	//   13   23:bipush          24
	//   14   25:iushr           
	//   15   26:i2f             
	//   16   27:fload_2         
	//   17   28:fmul            
	//   18   29:f2i             
	//   19   30:istore          4
			if(layoutparams.dimPaint == null)
	//*  20   32:aload           5
	//*  21   34:getfield        #77  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//*  22   37:ifnonnull       52
				layoutparams.dimPaint = new Paint();
	//   23   40:aload           5
	//   24   42:new             #79  <Class Paint>
	//   25   45:dup             
	//   26   46:invokespecial   #83  <Method void Paint()>
	//   27   49:putfield        #77  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
			layoutparams.dimPaint.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j << 24 | i & 0xffffff, android.graphics.PorterDuff.Mode.SRC_OVER))));
	//   28   52:aload           5
	//   29   54:getfield        #77  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   30   57:new             #85  <Class PorterDuffColorFilter>
	//   31   60:dup             
	//   32   61:iload           4
	//   33   63:bipush          24
	//   34   65:ishl            
	//   35   66:iload_3         
	//   36   67:ldc1            #86  <Int 0xffffff>
	//   37   69:iand            
	//   38   70:ior             
	//   39   71:getstatic       #92  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//   40   74:invokespecial   #95  <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   41   77:invokevirtual   #99  <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   42   80:pop             
			if(view.getLayerType() != 2)
	//*  43   81:aload_1         
	//*  44   82:invokevirtual   #103 <Method int View.getLayerType()>
	//*  45   85:iconst_2        
	//*  46   86:icmpeq          99
				view.setLayerType(2, layoutparams.dimPaint);
	//   47   89:aload_1         
	//   48   90:iconst_2        
	//   49   91:aload           5
	//   50   93:getfield        #77  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   51   96:invokevirtual   #107 <Method void View.setLayerType(int, Paint)>
			invalidateChildRegion(view);
	//   52   99:aload_0         
	//   53  100:aload_1         
	//   54  101:invokevirtual   #111 <Method void invalidateChildRegion(View)>
			return;
	//   55  104:return          
		}
		if(view.getLayerType() != 0)
	//*  56  105:aload_1         
	//*  57  106:invokevirtual   #103 <Method int View.getLayerType()>
	//*  58  109:ifeq            154
		{
			if(layoutparams.dimPaint != null)
	//*  59  112:aload           5
	//*  60  114:getfield        #77  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//*  61  117:ifnull          130
				layoutparams.dimPaint.setColorFilter(((android.graphics.ColorFilter) (null)));
	//   62  120:aload           5
	//   63  122:getfield        #77  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   64  125:aconst_null     
	//   65  126:invokevirtual   #99  <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   66  129:pop             
			view = ((View) (new DisableLayerRunnable(view)));
	//   67  130:new             #6   <Class SlidingPaneLayout$DisableLayerRunnable>
	//   68  133:dup             
	//   69  134:aload_0         
	//   70  135:aload_1         
	//   71  136:invokespecial   #114 <Method void SlidingPaneLayout$DisableLayerRunnable(SlidingPaneLayout, View)>
	//   72  139:astore_1        
			mPostedRunnables.add(((Object) (view)));
	//   73  140:aload_0         
	//   74  141:getfield        #116 <Field ArrayList mPostedRunnables>
	//   75  144:aload_1         
	//   76  145:invokevirtual   #122 <Method boolean ArrayList.add(Object)>
	//   77  148:pop             
			ViewCompat.postOnAnimation(((View) (this)), ((Runnable) (view)));
	//   78  149:aload_0         
	//   79  150:aload_1         
	//   80  151:invokestatic    #128 <Method void ViewCompat.postOnAnimation(View, Runnable)>
		}
	//   81  154:return          
	}

	private boolean openPane(View view, int i)
	{
		if(!mFirstLayout && !smoothSlideTo(1.0F, i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field boolean mFirstLayout>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:fconst_1        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #61  <Method boolean smoothSlideTo(float, int)>
	//*   7   13:ifeq            19
	//*   8   16:goto            21
		{
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		} else
		{
			mPreservedOpenState = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #63  <Field boolean mPreservedOpenState>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		}
	}

	private void parallaxOtherViews(float f)
	{
		int i;
		int j;
		boolean flag;
label0:
		{
			flag = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          8
			LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
	//    3    6:aload_0         
	//    4    7:getfield        #137 <Field View mSlideableView>
	//    5   10:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   13:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//    7   16:astore          10
			boolean flag1 = layoutparams.dimWhenOffset;
	//    8   18:aload           10
	//    9   20:getfield        #140 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//   10   23:istore          9
			j = 0;
	//   11   25:iconst_0        
	//   12   26:istore          4
			if(flag1)
	//*  13   28:iload           9
	//*  14   30:ifeq            62
			{
				if(flag)
	//*  15   33:iload           8
	//*  16   35:ifeq            47
					i = layoutparams.rightMargin;
	//   17   38:aload           10
	//   18   40:getfield        #143 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   19   43:istore_3        
				else
	//*  20   44:goto            53
					i = layoutparams.leftMargin;
	//   21   47:aload           10
	//   22   49:getfield        #146 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   23   52:istore_3        
				if(i <= 0)
	//*  24   53:iload_3         
	//*  25   54:ifgt            62
				{
					i = 1;
	//   26   57:iconst_1        
	//   27   58:istore_3        
					break label0;
	//   28   59:goto            64
				}
			}
			i = 0;
	//   29   62:iconst_0        
	//   30   63:istore_3        
		}
		for(int i1 = getChildCount(); j < i1; j++)
	//*  31   64:aload_0         
	//*  32   65:invokevirtual   #149 <Method int getChildCount()>
	//*  33   68:istore          7
	//*  34   70:iload           4
	//*  35   72:iload           7
	//*  36   74:icmpge          203
		{
			View view = getChildAt(j);
	//   37   77:aload_0         
	//   38   78:iload           4
	//   39   80:invokevirtual   #153 <Method View getChildAt(int)>
	//   40   83:astore          10
			if(view == mSlideableView)
	//*  41   85:aload           10
	//*  42   87:aload_0         
	//*  43   88:getfield        #137 <Field View mSlideableView>
	//*  44   91:if_acmpne       97
				continue;
	//   45   94:goto            194
			float f1 = mParallaxOffset;
	//   46   97:aload_0         
	//   47   98:getfield        #155 <Field float mParallaxOffset>
	//   48  101:fstore_2        
			int k = mParallaxBy;
	//   49  102:aload_0         
	//   50  103:getfield        #157 <Field int mParallaxBy>
	//   51  106:istore          5
			int l = (int)((1.0F - f1) * (float)k);
	//   52  108:fconst_1        
	//   53  109:fload_2         
	//   54  110:fsub            
	//   55  111:iload           5
	//   56  113:i2f             
	//   57  114:fmul            
	//   58  115:f2i             
	//   59  116:istore          6
			mParallaxOffset = f;
	//   60  118:aload_0         
	//   61  119:fload_1         
	//   62  120:putfield        #155 <Field float mParallaxOffset>
			l -= (int)((1.0F - f) * (float)k);
	//   63  123:iload           6
	//   64  125:fconst_1        
	//   65  126:fload_1         
	//   66  127:fsub            
	//   67  128:iload           5
	//   68  130:i2f             
	//   69  131:fmul            
	//   70  132:f2i             
	//   71  133:isub            
	//   72  134:istore          6
			k = l;
	//   73  136:iload           6
	//   74  138:istore          5
			if(flag)
	//*  75  140:iload           8
	//*  76  142:ifeq            150
				k = -l;
	//   77  145:iload           6
	//   78  147:ineg            
	//   79  148:istore          5
			view.offsetLeftAndRight(k);
	//   80  150:aload           10
	//   81  152:iload           5
	//   82  154:invokevirtual   #161 <Method void View.offsetLeftAndRight(int)>
			if(!i)
				continue;
	//   83  157:iload_3         
	//   84  158:ifeq            194
			if(flag)
	//*  85  161:iload           8
	//*  86  163:ifeq            176
				f1 = mParallaxOffset - 1.0F;
	//   87  166:aload_0         
	//   88  167:getfield        #155 <Field float mParallaxOffset>
	//   89  170:fconst_1        
	//   90  171:fsub            
	//   91  172:fstore_2        
			else
	//*  92  173:goto            183
				f1 = 1.0F - mParallaxOffset;
	//   93  176:fconst_1        
	//   94  177:aload_0         
	//   95  178:getfield        #155 <Field float mParallaxOffset>
	//   96  181:fsub            
	//   97  182:fstore_2        
			dimChildView(view, f1, mCoveredFadeColor);
	//   98  183:aload_0         
	//   99  184:aload           10
	//  100  186:fload_2         
	//  101  187:aload_0         
	//  102  188:getfield        #163 <Field int mCoveredFadeColor>
	//  103  191:invokespecial   #165 <Method void dimChildView(View, float, int)>
		}

	//  104  194:iload           4
	//  105  196:iconst_1        
	//  106  197:iadd            
	//  107  198:istore          4
	//* 108  200:goto            70
	//  109  203:return          
	}

	private static boolean viewIsOpaque(View view)
	{
		if(view.isOpaque())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #170 <Method boolean View.isOpaque()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   5    9:getstatic       #175 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          18
	//*   7   14:icmplt          19
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		view = ((View) (view.getBackground()));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #179 <Method Drawable View.getBackground()>
	//   12   23:astore_0        
		if(view != null)
	//*  13   24:aload_0         
	//*  14   25:ifnull          40
			return ((Drawable) (view)).getOpacity() == -1;
	//   15   28:aload_0         
	//   16   29:invokevirtual   #184 <Method int Drawable.getOpacity()>
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

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #9   <Class SlidingPaneLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #188 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean closePane()
	{
		return closePane(mSlideableView, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #137 <Field View mSlideableView>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #190 <Method boolean closePane(View, int)>
	//    5    9:ireturn         
	}

	public void computeScroll()
	{
		if(mDragHelper.continueSettling(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #193 <Field ViewDragHelper mDragHelper>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #199 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*   4    8:ifeq            30
		{
			if(!mCanSlide)
	//*   5   11:aload_0         
	//*   6   12:getfield        #201 <Field boolean mCanSlide>
	//*   7   15:ifne            26
			{
				mDragHelper.abort();
	//    8   18:aload_0         
	//    9   19:getfield        #193 <Field ViewDragHelper mDragHelper>
	//   10   22:invokevirtual   #204 <Method void ViewDragHelper.abort()>
				return;
	//   11   25:return          
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   12   26:aload_0         
	//   13   27:invokestatic    #207 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   14   30:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #211 <Method void ViewGroup.draw(Canvas)>
		Drawable drawable;
		if(isLayoutRtlSupport())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #135 <Method boolean isLayoutRtlSupport()>
	//*   5    9:ifeq            21
			drawable = mShadowDrawableRight;
	//    6   12:aload_0         
	//    7   13:getfield        #213 <Field Drawable mShadowDrawableRight>
	//    8   16:astore          7
		else
	//*   9   18:goto            27
			drawable = mShadowDrawableLeft;
	//   10   21:aload_0         
	//   11   22:getfield        #215 <Field Drawable mShadowDrawableLeft>
	//   12   25:astore          7
		View view;
		if(getChildCount() > 1)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #149 <Method int getChildCount()>
	//*  15   31:iconst_1        
	//*  16   32:icmple          45
			view = getChildAt(1);
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #153 <Method View getChildAt(int)>
	//   20   40:astore          8
		else
	//*  21   42:goto            48
			view = null;
	//   22   45:aconst_null     
	//   23   46:astore          8
		if(view != null)
	//*  24   48:aload           8
	//*  25   50:ifnull          138
		{
			if(drawable == null)
	//*  26   53:aload           7
	//*  27   55:ifnonnull       59
				return;
	//   28   58:return          
			int l = view.getTop();
	//   29   59:aload           8
	//   30   61:invokevirtual   #218 <Method int View.getTop()>
	//   31   64:istore          5
			int i1 = view.getBottom();
	//   32   66:aload           8
	//   33   68:invokevirtual   #221 <Method int View.getBottom()>
	//   34   71:istore          6
			int k = drawable.getIntrinsicWidth();
	//   35   73:aload           7
	//   36   75:invokevirtual   #224 <Method int Drawable.getIntrinsicWidth()>
	//   37   78:istore          4
			int i;
			int j;
			if(isLayoutRtlSupport())
	//*  38   80:aload_0         
	//*  39   81:invokevirtual   #135 <Method boolean isLayoutRtlSupport()>
	//*  40   84:ifeq            101
			{
				i = view.getRight();
	//   41   87:aload           8
	//   42   89:invokevirtual   #227 <Method int View.getRight()>
	//   43   92:istore_2        
				j = k + i;
	//   44   93:iload           4
	//   45   95:iload_2         
	//   46   96:iadd            
	//   47   97:istore_3        
			} else
	//*  48   98:goto            120
			{
				j = view.getLeft();
	//   49  101:aload           8
	//   50  103:invokevirtual   #230 <Method int View.getLeft()>
	//   51  106:istore_3        
				i = j;
	//   52  107:iload_3         
	//   53  108:istore_2        
				k = j - k;
	//   54  109:iload_3         
	//   55  110:iload           4
	//   56  112:isub            
	//   57  113:istore          4
				j = i;
	//   58  115:iload_2         
	//   59  116:istore_3        
				i = k;
	//   60  117:iload           4
	//   61  119:istore_2        
			}
			drawable.setBounds(i, l, j, i1);
	//   62  120:aload           7
	//   63  122:iload_2         
	//   64  123:iload           5
	//   65  125:iload_3         
	//   66  126:iload           6
	//   67  128:invokevirtual   #234 <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(canvas);
	//   68  131:aload           7
	//   69  133:aload_1         
	//   70  134:invokevirtual   #235 <Method void Drawable.draw(Canvas)>
			return;
	//   71  137:return          
		} else
		{
			return;
	//   72  138:return          
		}
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          7
		int i = canvas.save();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #242 <Method int Canvas.save()>
	//    6   13:istore          5
		if(mCanSlide && !layoutparams.slideable && mSlideableView != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #201 <Field boolean mCanSlide>
	//*   9   19:ifeq            117
	//*  10   22:aload           7
	//*  11   24:getfield        #245 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//*  12   27:ifne            117
	//*  13   30:aload_0         
	//*  14   31:getfield        #137 <Field View mSlideableView>
	//*  15   34:ifnull          117
		{
			canvas.getClipBounds(mTmpRect);
	//   16   37:aload_1         
	//   17   38:aload_0         
	//   18   39:getfield        #247 <Field Rect mTmpRect>
	//   19   42:invokevirtual   #251 <Method boolean Canvas.getClipBounds(Rect)>
	//   20   45:pop             
			if(isLayoutRtlSupport())
	//*  21   46:aload_0         
	//*  22   47:invokevirtual   #135 <Method boolean isLayoutRtlSupport()>
	//*  23   50:ifeq            82
			{
				Rect rect = mTmpRect;
	//   24   53:aload_0         
	//   25   54:getfield        #247 <Field Rect mTmpRect>
	//   26   57:astore          7
				rect.left = Math.max(rect.left, mSlideableView.getRight());
	//   27   59:aload           7
	//   28   61:aload           7
	//   29   63:getfield        #256 <Field int Rect.left>
	//   30   66:aload_0         
	//   31   67:getfield        #137 <Field View mSlideableView>
	//   32   70:invokevirtual   #227 <Method int View.getRight()>
	//   33   73:invokestatic    #262 <Method int Math.max(int, int)>
	//   34   76:putfield        #256 <Field int Rect.left>
			} else
	//*  35   79:goto            108
			{
				Rect rect1 = mTmpRect;
	//   36   82:aload_0         
	//   37   83:getfield        #247 <Field Rect mTmpRect>
	//   38   86:astore          7
				rect1.right = Math.min(rect1.right, mSlideableView.getLeft());
	//   39   88:aload           7
	//   40   90:aload           7
	//   41   92:getfield        #265 <Field int Rect.right>
	//   42   95:aload_0         
	//   43   96:getfield        #137 <Field View mSlideableView>
	//   44   99:invokevirtual   #230 <Method int View.getLeft()>
	//   45  102:invokestatic    #268 <Method int Math.min(int, int)>
	//   46  105:putfield        #265 <Field int Rect.right>
			}
			canvas.clipRect(mTmpRect);
	//   47  108:aload_1         
	//   48  109:aload_0         
	//   49  110:getfield        #247 <Field Rect mTmpRect>
	//   50  113:invokevirtual   #271 <Method boolean Canvas.clipRect(Rect)>
	//   51  116:pop             
		}
		boolean flag = super.drawChild(canvas, view, l);
	//   52  117:aload_0         
	//   53  118:aload_1         
	//   54  119:aload_2         
	//   55  120:lload_3         
	//   56  121:invokespecial   #273 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   57  124:istore          6
		canvas.restoreToCount(i);
	//   58  126:aload_1         
	//   59  127:iload           5
	//   60  129:invokevirtual   #276 <Method void Canvas.restoreToCount(int)>
		return flag;
	//   61  132:iload           6
	//   62  134:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #9   <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #278 <Method void SlidingPaneLayout$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #9   <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #284 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #287 <Method void SlidingPaneLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #290 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #9   <Class SlidingPaneLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #290 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #293 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #9   <Class SlidingPaneLayout$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #296 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public int getCoveredFadeColor()
	{
		return mCoveredFadeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field int mCoveredFadeColor>
	//    2    4:ireturn         
	}

	public int getParallaxDistance()
	{
		return mParallaxBy;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field int mParallaxBy>
	//    2    4:ireturn         
	}

	public int getSliderFadeColor()
	{
		return mSliderFadeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field int mSliderFadeColor>
	//    2    4:ireturn         
	}

	void invalidateChildRegion(View view)
	{
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #175 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          23
			{
				ViewCompat.setLayerPaint(view, ((LayoutParams)view.getLayoutParams()).dimPaint);
	//    3    8:aload_1         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   13:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//    7   16:getfield        #77  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//    8   19:invokestatic    #314 <Method void ViewCompat.setLayerPaint(View, Paint)>
				return;
	//    9   22:return          
			}
			if(android.os.Build.VERSION.SDK_INT < 16)
				break label0;
	//   10   23:getstatic       #175 <Field int android.os.Build$VERSION.SDK_INT>
	//   11   26:bipush          16
	//   12   28:icmplt          170
			if(!mDisplayListReflectionLoaded)
	//*  13   31:aload_0         
	//*  14   32:getfield        #316 <Field boolean mDisplayListReflectionLoaded>
	//*  15   35:ifne            109
			{
				try
				{
					mGetDisplayList = ((Class) (android/view/View)).getDeclaredMethod("getDisplayList", (Class[])null);
	//   16   38:aload_0         
	//   17   39:ldc1            #68  <Class View>
	//   18   41:ldc2            #318 <String "getDisplayList">
	//   19   44:aconst_null     
	//   20   45:checkcast       #320 <Class Class[]>
	//   21   48:invokevirtual   #326 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   22   51:putfield        #328 <Field Method mGetDisplayList>
				}
	//*  23   54:goto            69
				catch(NoSuchMethodException nosuchmethodexception)
	//*  24   57:astore_2        
				{
					Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", ((Throwable) (nosuchmethodexception)));
	//   25   58:ldc2            #330 <String "SlidingPaneLayout">
	//   26   61:ldc2            #332 <String "Couldn't fetch getDisplayList method; dimming won't work right.">
	//   27   64:aload_2         
	//   28   65:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
	//   29   68:pop             
				}
				try
				{
					mRecreateDisplayList = ((Class) (android/view/View)).getDeclaredField("mRecreateDisplayList");
	//   30   69:aload_0         
	//   31   70:ldc1            #68  <Class View>
	//   32   72:ldc2            #339 <String "mRecreateDisplayList">
	//   33   75:invokevirtual   #343 <Method Field Class.getDeclaredField(String)>
	//   34   78:putfield        #345 <Field Field mRecreateDisplayList>
					mRecreateDisplayList.setAccessible(true);
	//   35   81:aload_0         
	//   36   82:getfield        #345 <Field Field mRecreateDisplayList>
	//   37   85:iconst_1        
	//   38   86:invokevirtual   #351 <Method void Field.setAccessible(boolean)>
				}
	//*  39   89:goto            104
				catch(NoSuchFieldException nosuchfieldexception)
	//*  40   92:astore_2        
				{
					Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", ((Throwable) (nosuchfieldexception)));
	//   41   93:ldc2            #330 <String "SlidingPaneLayout">
	//   42   96:ldc2            #353 <String "Couldn't fetch mRecreateDisplayList field; dimming will be slow.">
	//   43   99:aload_2         
	//   44  100:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
	//   45  103:pop             
				}
				mDisplayListReflectionLoaded = true;
	//   46  104:aload_0         
	//   47  105:iconst_1        
	//   48  106:putfield        #316 <Field boolean mDisplayListReflectionLoaded>
			}
			if(mGetDisplayList != null)
	//*  49  109:aload_0         
	//*  50  110:getfield        #328 <Field Method mGetDisplayList>
	//*  51  113:ifnull          165
			{
				Field field = mRecreateDisplayList;
	//   52  116:aload_0         
	//   53  117:getfield        #345 <Field Field mRecreateDisplayList>
	//   54  120:astore_2        
				if(field != null)
	//*  55  121:aload_2         
	//*  56  122:ifnonnull       128
	//*  57  125:goto            165
				{
					try
					{
						field.setBoolean(((Object) (view)), true);
	//   58  128:aload_2         
	//   59  129:aload_1         
	//   60  130:iconst_1        
	//   61  131:invokevirtual   #357 <Method void Field.setBoolean(Object, boolean)>
						mGetDisplayList.invoke(((Object) (view)), (Object[])null);
	//   62  134:aload_0         
	//   63  135:getfield        #328 <Field Method mGetDisplayList>
	//   64  138:aload_1         
	//   65  139:aconst_null     
	//   66  140:checkcast       #359 <Class Object[]>
	//   67  143:invokevirtual   #365 <Method Object Method.invoke(Object, Object[])>
	//   68  146:pop             
					}
	//*  69  147:goto            170
					catch(Exception exception)
	//*  70  150:astore_2        
					{
						Log.e("SlidingPaneLayout", "Error refreshing display list state", ((Throwable) (exception)));
	//   71  151:ldc2            #330 <String "SlidingPaneLayout">
	//   72  154:ldc2            #367 <String "Error refreshing display list state">
	//   73  157:aload_2         
	//   74  158:invokestatic    #338 <Method int Log.e(String, String, Throwable)>
	//   75  161:pop             
					}
					break label0;
	//   76  162:goto            170
				}
			}
			view.invalidate();
	//   77  165:aload_1         
	//   78  166:invokevirtual   #370 <Method void View.invalidate()>
			return;
	//   79  169:return          
		}
		ViewCompat.postInvalidateOnAnimation(((View) (this)), view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   80  170:aload_0         
	//   81  171:aload_1         
	//   82  172:invokevirtual   #230 <Method int View.getLeft()>
	//   83  175:aload_1         
	//   84  176:invokevirtual   #218 <Method int View.getTop()>
	//   85  179:aload_1         
	//   86  180:invokevirtual   #227 <Method int View.getRight()>
	//   87  183:aload_1         
	//   88  184:invokevirtual   #221 <Method int View.getBottom()>
	//   89  187:invokestatic    #373 <Method void ViewCompat.postInvalidateOnAnimation(View, int, int, int, int)>
	//   90  190:return          
	}

	boolean isDimmed(View view)
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
	//    7    9:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   12:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//    9   15:astore_1        
		boolean flag = flag1;
	//   10   16:iload_3         
	//   11   17:istore_2        
		if(mCanSlide)
	//*  12   18:aload_0         
	//*  13   19:getfield        #201 <Field boolean mCanSlide>
	//*  14   22:ifeq            47
		{
			flag = flag1;
	//   15   25:iload_3         
	//   16   26:istore_2        
			if(((LayoutParams) (view)).dimWhenOffset)
	//*  17   27:aload_1         
	//*  18   28:getfield        #140 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  19   31:ifeq            47
			{
				flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
				if(mSlideOffset > 0.0F)
	//*  22   36:aload_0         
	//*  23   37:getfield        #376 <Field float mSlideOffset>
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

	boolean isLayoutRtlSupport()
	{
		return ViewCompat.getLayoutDirection(((View) (this))) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #380 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isOpen()
	{
		return !mCanSlide || mSlideOffset == 1.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field boolean mCanSlide>
	//    2    4:ifeq            21
	//    3    7:aload_0         
	//    4    8:getfield        #376 <Field float mSlideOffset>
	//    5   11:fconst_1        
	//    6   12:fcmpl           
	//    7   13:ifne            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean isSlideable()
	{
		return mCanSlide;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field boolean mCanSlide>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #385 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #57  <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #388 <Method void ViewGroup.onDetachedFromWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #57  <Field boolean mFirstLayout>
		int j = mPostedRunnables.size();
	//    5    9:aload_0         
	//    6   10:getfield        #116 <Field ArrayList mPostedRunnables>
	//    7   13:invokevirtual   #391 <Method int ArrayList.size()>
	//    8   16:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:icmpge          45
			((DisableLayerRunnable)mPostedRunnables.get(i)).run();
	//   14   24:aload_0         
	//   15   25:getfield        #116 <Field ArrayList mPostedRunnables>
	//   16   28:iload_1         
	//   17   29:invokevirtual   #395 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #6   <Class SlidingPaneLayout$DisableLayerRunnable>
	//   19   35:invokevirtual   #398 <Method void SlidingPaneLayout$DisableLayerRunnable.run()>

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            19
		mPostedRunnables.clear();
	//   25   45:aload_0         
	//   26   46:getfield        #116 <Field ArrayList mPostedRunnables>
	//   27   49:invokevirtual   #401 <Method void ArrayList.clear()>
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
					int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #408 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
					boolean flag2 = mCanSlide;
	//    3    6:aload_0         
	//    4    7:getfield        #201 <Field boolean mCanSlide>
	//    5   10:istore          6
					flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore          5
					if(!flag2 && i == 0 && getChildCount() > 1)
	//*   8   15:iload           6
	//*   9   17:ifne            70
	//*  10   20:iload           4
	//*  11   22:ifne            70
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #149 <Method int getChildCount()>
	//*  14   29:iconst_1        
	//*  15   30:icmple          70
					{
						View view = getChildAt(1);
	//   16   33:aload_0         
	//   17   34:iconst_1        
	//   18   35:invokevirtual   #153 <Method View getChildAt(int)>
	//   19   38:astore          7
						if(view != null)
	//*  20   40:aload           7
	//*  21   42:ifnull          70
							mPreservedOpenState = mDragHelper.isViewUnder(view, (int)motionevent.getX(), (int)motionevent.getY()) ^ true;
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #193 <Field ViewDragHelper mDragHelper>
	//   25   50:aload           7
	//   26   52:aload_1         
	//   27   53:invokevirtual   #412 <Method float MotionEvent.getX()>
	//   28   56:f2i             
	//   29   57:aload_1         
	//   30   58:invokevirtual   #415 <Method float MotionEvent.getY()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #419 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//   33   65:iconst_1        
	//   34   66:ixor            
	//   35   67:putfield        #63  <Field boolean mPreservedOpenState>
					}
					if(!mCanSlide || mIsUnableToDrag && i != 0)
	//*  36   70:aload_0         
	//*  37   71:getfield        #201 <Field boolean mCanSlide>
	//*  38   74:ifeq            280
	//*  39   77:aload_0         
	//*  40   78:getfield        #421 <Field boolean mIsUnableToDrag>
	//*  41   81:ifeq            92
	//*  42   84:iload           4
	//*  43   86:ifeq            92
						break label0;
	//   44   89:goto            280
					if(i == 3 || i == 1)
	//*  45   92:iload           4
	//*  46   94:iconst_3        
	//*  47   95:icmpeq          271
	//*  48   98:iload           4
	//*  49  100:iconst_1        
	//*  50  101:icmpne          107
						break label1;
	//   51  104:goto            271
					if(i != 0)
	//*  52  107:iload           4
	//*  53  109:ifeq            184
					{
						if(i == 2)
	//*  54  112:iload           4
	//*  55  114:iconst_2        
	//*  56  115:icmpeq          121
	//*  57  118:goto            244
						{
							float f2 = motionevent.getX();
	//   58  121:aload_1         
	//   59  122:invokevirtual   #412 <Method float MotionEvent.getX()>
	//   60  125:fstore_3        
							float f = motionevent.getY();
	//   61  126:aload_1         
	//   62  127:invokevirtual   #415 <Method float MotionEvent.getY()>
	//   63  130:fstore_2        
							f2 = Math.abs(f2 - mInitialMotionX);
	//   64  131:fload_3         
	//   65  132:aload_0         
	//   66  133:getfield        #423 <Field float mInitialMotionX>
	//   67  136:fsub            
	//   68  137:invokestatic    #427 <Method float Math.abs(float)>
	//   69  140:fstore_3        
							f = Math.abs(f - mInitialMotionY);
	//   70  141:fload_2         
	//   71  142:aload_0         
	//   72  143:getfield        #429 <Field float mInitialMotionY>
	//   73  146:fsub            
	//   74  147:invokestatic    #427 <Method float Math.abs(float)>
	//   75  150:fstore_2        
							if(f2 > (float)mDragHelper.getTouchSlop() && f > f2)
	//*  76  151:fload_3         
	//*  77  152:aload_0         
	//*  78  153:getfield        #193 <Field ViewDragHelper mDragHelper>
	//*  79  156:invokevirtual   #432 <Method int ViewDragHelper.getTouchSlop()>
	//*  80  159:i2f             
	//*  81  160:fcmpl           
	//*  82  161:ifle            244
	//*  83  164:fload_2         
	//*  84  165:fload_3         
	//*  85  166:fcmpl           
	//*  86  167:ifle            244
							{
								mDragHelper.cancel();
	//   87  170:aload_0         
	//   88  171:getfield        #193 <Field ViewDragHelper mDragHelper>
	//   89  174:invokevirtual   #435 <Method void ViewDragHelper.cancel()>
								mIsUnableToDrag = true;
	//   90  177:aload_0         
	//   91  178:iconst_1        
	//   92  179:putfield        #421 <Field boolean mIsUnableToDrag>
								return false;
	//   93  182:iconst_0        
	//   94  183:ireturn         
							}
						}
					} else
					{
						mIsUnableToDrag = false;
	//   95  184:aload_0         
	//   96  185:iconst_0        
	//   97  186:putfield        #421 <Field boolean mIsUnableToDrag>
						float f1 = motionevent.getX();
	//   98  189:aload_1         
	//   99  190:invokevirtual   #412 <Method float MotionEvent.getX()>
	//  100  193:fstore_2        
						float f3 = motionevent.getY();
	//  101  194:aload_1         
	//  102  195:invokevirtual   #415 <Method float MotionEvent.getY()>
	//  103  198:fstore_3        
						mInitialMotionX = f1;
	//  104  199:aload_0         
	//  105  200:fload_2         
	//  106  201:putfield        #423 <Field float mInitialMotionX>
						mInitialMotionY = f3;
	//  107  204:aload_0         
	//  108  205:fload_3         
	//  109  206:putfield        #429 <Field float mInitialMotionY>
						if(mDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f3) && isDimmed(mSlideableView))
	//* 110  209:aload_0         
	//* 111  210:getfield        #193 <Field ViewDragHelper mDragHelper>
	//* 112  213:aload_0         
	//* 113  214:getfield        #137 <Field View mSlideableView>
	//* 114  217:fload_2         
	//* 115  218:f2i             
	//* 116  219:fload_3         
	//* 117  220:f2i             
	//* 118  221:invokevirtual   #419 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//* 119  224:ifeq            244
	//* 120  227:aload_0         
	//* 121  228:aload_0         
	//* 122  229:getfield        #137 <Field View mSlideableView>
	//* 123  232:invokevirtual   #437 <Method boolean isDimmed(View)>
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
				if(!mDragHelper.shouldInterceptTouchEvent(motionevent))
	//* 130  247:aload_0         
	//* 131  248:getfield        #193 <Field ViewDragHelper mDragHelper>
	//* 132  251:aload_1         
	//* 133  252:invokevirtual   #440 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
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
			mDragHelper.cancel();
	//  143  271:aload_0         
	//  144  272:getfield        #193 <Field ViewDragHelper mDragHelper>
	//  145  275:invokevirtual   #435 <Method void ViewDragHelper.cancel()>
			return false;
	//  146  278:iconst_0        
	//  147  279:ireturn         
		}
		mDragHelper.cancel();
	//  148  280:aload_0         
	//  149  281:getfield        #193 <Field ViewDragHelper mDragHelper>
	//  150  284:invokevirtual   #435 <Method void ViewDragHelper.cancel()>
		return super.onInterceptTouchEvent(motionevent);
	//  151  287:aload_0         
	//  152  288:aload_1         
	//  153  289:invokespecial   #442 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//  154  292:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		boolean flag1 = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          14
		if(flag1)
	//*   3    6:iload           14
	//*   4    8:ifeq            22
			mDragHelper.setEdgeTrackingEnabled(2);
	//    5   11:aload_0         
	//    6   12:getfield        #193 <Field ViewDragHelper mDragHelper>
	//    7   15:iconst_2        
	//    8   16:invokevirtual   #447 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		else
	//*   9   19:goto            30
			mDragHelper.setEdgeTrackingEnabled(1);
	//   10   22:aload_0         
	//   11   23:getfield        #193 <Field ViewDragHelper mDragHelper>
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #447 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		int l1 = k - i;
	//   14   30:iload           4
	//   15   32:iload_2         
	//   16   33:isub            
	//   17   34:istore          9
		if(flag1)
	//*  18   36:iload           14
	//*  19   38:ifeq            49
			i = getPaddingRight();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #450 <Method int getPaddingRight()>
	//   22   45:istore_2        
		else
	//*  23   46:goto            54
			i = getPaddingLeft();
	//   24   49:aload_0         
	//   25   50:invokevirtual   #453 <Method int getPaddingLeft()>
	//   26   53:istore_2        
		if(flag1)
	//*  27   54:iload           14
	//*  28   56:ifeq            68
			l = getPaddingLeft();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #453 <Method int getPaddingLeft()>
	//   31   63:istore          5
		else
	//*  32   65:goto            74
			l = getPaddingRight();
	//   33   68:aload_0         
	//   34   69:invokevirtual   #450 <Method int getPaddingRight()>
	//   35   72:istore          5
		int j2 = getPaddingTop();
	//   36   74:aload_0         
	//   37   75:invokevirtual   #456 <Method int getPaddingTop()>
	//   38   78:istore          11
		int i2 = getChildCount();
	//   39   80:aload_0         
	//   40   81:invokevirtual   #149 <Method int getChildCount()>
	//   41   84:istore          10
		if(mFirstLayout)
	//*  42   86:aload_0         
	//*  43   87:getfield        #57  <Field boolean mFirstLayout>
	//*  44   90:ifeq            122
		{
			float f;
			if(mCanSlide && mPreservedOpenState)
	//*  45   93:aload_0         
	//*  46   94:getfield        #201 <Field boolean mCanSlide>
	//*  47   97:ifeq            113
	//*  48  100:aload_0         
	//*  49  101:getfield        #63  <Field boolean mPreservedOpenState>
	//*  50  104:ifeq            113
				f = 1.0F;
	//   51  107:fconst_1        
	//   52  108:fstore          6
			else
	//*  53  110:goto            116
				f = 0.0F;
	//   54  113:fconst_0        
	//   55  114:fstore          6
			mSlideOffset = f;
	//   56  116:aload_0         
	//   57  117:fload           6
	//   58  119:putfield        #376 <Field float mSlideOffset>
		}
		j = i;
	//   59  122:iload_2         
	//   60  123:istore_3        
		for(int i1 = 0; i1 < i2; i1++)
	//*  61  124:iconst_0        
	//*  62  125:istore          7
	//*  63  127:iload           7
	//*  64  129:iload           10
	//*  65  131:icmpge          429
		{
			int k2;
			View view;
label0:
			{
				view = getChildAt(i1);
	//   66  134:aload_0         
	//   67  135:iload           7
	//   68  137:invokevirtual   #153 <Method View getChildAt(int)>
	//   69  140:astore          15
				if(view.getVisibility() == 8)
	//*  70  142:aload           15
	//*  71  144:invokevirtual   #459 <Method int View.getVisibility()>
	//*  72  147:bipush          8
	//*  73  149:icmpne          155
					continue;
	//   74  152:goto            420
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   75  155:aload           15
	//   76  157:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   77  160:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//   78  163:astore          16
				k2 = view.getMeasuredWidth();
	//   79  165:aload           15
	//   80  167:invokevirtual   #462 <Method int View.getMeasuredWidth()>
	//   81  170:istore          12
				if(layoutparams.slideable)
	//*  82  172:aload           16
	//*  83  174:getfield        #245 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//*  84  177:ifeq            318
				{
					k = layoutparams.leftMargin;
	//   85  180:aload           16
	//   86  182:getfield        #146 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   87  185:istore          4
					int l2 = layoutparams.rightMargin;
	//   88  187:aload           16
	//   89  189:getfield        #143 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   90  192:istore          13
					int j1 = l1 - l;
	//   91  194:iload           9
	//   92  196:iload           5
	//   93  198:isub            
	//   94  199:istore          8
					l2 = Math.min(i, j1 - mOverhangSize) - j - (k + l2);
	//   95  201:iload_2         
	//   96  202:iload           8
	//   97  204:aload_0         
	//   98  205:getfield        #464 <Field int mOverhangSize>
	//   99  208:isub            
	//  100  209:invokestatic    #268 <Method int Math.min(int, int)>
	//  101  212:iload_3         
	//  102  213:isub            
	//  103  214:iload           4
	//  104  216:iload           13
	//  105  218:iadd            
	//  106  219:isub            
	//  107  220:istore          13
					mSlideRange = l2;
	//  108  222:aload_0         
	//  109  223:iload           13
	//  110  225:putfield        #466 <Field int mSlideRange>
					if(flag1)
	//* 111  228:iload           14
	//* 112  230:ifeq            243
						k = layoutparams.rightMargin;
	//  113  233:aload           16
	//  114  235:getfield        #143 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  115  238:istore          4
					else
	//* 116  240:goto            250
						k = layoutparams.leftMargin;
	//  117  243:aload           16
	//  118  245:getfield        #146 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  119  248:istore          4
					if(j + k + l2 + k2 / 2 > j1)
	//* 120  250:iload_3         
	//* 121  251:iload           4
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
					layoutparams.dimWhenOffset = flag;
	//  136  274:aload           16
	//  137  276:iload_1         
	//  138  277:putfield        #140 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
					j1 = (int)((float)l2 * mSlideOffset);
	//  139  280:iload           13
	//  140  282:i2f             
	//  141  283:aload_0         
	//  142  284:getfield        #376 <Field float mSlideOffset>
	//  143  287:fmul            
	//  144  288:f2i             
	//  145  289:istore          8
					j = k + j1 + j;
	//  146  291:iload           4
	//  147  293:iload           8
	//  148  295:iadd            
	//  149  296:iload_3         
	//  150  297:iadd            
	//  151  298:istore_3        
					mSlideOffset = (float)j1 / (float)mSlideRange;
	//  152  299:aload_0         
	//  153  300:iload           8
	//  154  302:i2f             
	//  155  303:aload_0         
	//  156  304:getfield        #466 <Field int mSlideRange>
	//  157  307:i2f             
	//  158  308:fdiv            
	//  159  309:putfield        #376 <Field float mSlideOffset>
					k = 0;
	//  160  312:iconst_0        
	//  161  313:istore          4
					break label0;
	//  162  315:goto            356
				}
				if(mCanSlide)
	//* 163  318:aload_0         
	//* 164  319:getfield        #201 <Field boolean mCanSlide>
	//* 165  322:ifeq            351
				{
					j = mParallaxBy;
	//  166  325:aload_0         
	//  167  326:getfield        #157 <Field int mParallaxBy>
	//  168  329:istore_3        
					if(j != 0)
	//* 169  330:iload_3         
	//* 170  331:ifeq            351
					{
						k = (int)((1.0F - mSlideOffset) * (float)j);
	//  171  334:fconst_1        
	//  172  335:aload_0         
	//  173  336:getfield        #376 <Field float mSlideOffset>
	//  174  339:fsub            
	//  175  340:iload_3         
	//  176  341:i2f             
	//  177  342:fmul            
	//  178  343:f2i             
	//  179  344:istore          4
						j = i;
	//  180  346:iload_2         
	//  181  347:istore_3        
						break label0;
	//  182  348:goto            356
					}
				}
				j = i;
	//  183  351:iload_2         
	//  184  352:istore_3        
				k = 0;
	//  185  353:iconst_0        
	//  186  354:istore          4
			}
			int k1;
			if(flag1)
	//* 187  356:iload           14
	//* 188  358:ifeq            380
			{
				k1 = (l1 - j) + k;
	//  189  361:iload           9
	//  190  363:iload_3         
	//  191  364:isub            
	//  192  365:iload           4
	//  193  367:iadd            
	//  194  368:istore          8
				k = k1 - k2;
	//  195  370:iload           8
	//  196  372:iload           12
	//  197  374:isub            
	//  198  375:istore          4
			} else
	//* 199  377:goto            393
			{
				k = j - k;
	//  200  380:iload_3         
	//  201  381:iload           4
	//  202  383:isub            
	//  203  384:istore          4
				k1 = k + k2;
	//  204  386:iload           4
	//  205  388:iload           12
	//  206  390:iadd            
	//  207  391:istore          8
			}
			view.layout(k, j2, k1, view.getMeasuredHeight() + j2);
	//  208  393:aload           15
	//  209  395:iload           4
	//  210  397:iload           11
	//  211  399:iload           8
	//  212  401:aload           15
	//  213  403:invokevirtual   #469 <Method int View.getMeasuredHeight()>
	//  214  406:iload           11
	//  215  408:iadd            
	//  216  409:invokevirtual   #472 <Method void View.layout(int, int, int, int)>
			i += view.getWidth();
	//  217  412:iload_2         
	//  218  413:aload           15
	//  219  415:invokevirtual   #475 <Method int View.getWidth()>
	//  220  418:iadd            
	//  221  419:istore_2        
		}

	//  222  420:iload           7
	//  223  422:iconst_1        
	//  224  423:iadd            
	//  225  424:istore          7
	//* 226  426:goto            127
		if(mFirstLayout)
	//* 227  429:aload_0         
	//* 228  430:getfield        #57  <Field boolean mFirstLayout>
	//* 229  433:ifeq            533
		{
			if(mCanSlide)
	//* 230  436:aload_0         
	//* 231  437:getfield        #201 <Field boolean mCanSlide>
	//* 232  440:ifeq            493
			{
				if(mParallaxBy != 0)
	//* 233  443:aload_0         
	//* 234  444:getfield        #157 <Field int mParallaxBy>
	//* 235  447:ifeq            458
					parallaxOtherViews(mSlideOffset);
	//  236  450:aload_0         
	//  237  451:aload_0         
	//  238  452:getfield        #376 <Field float mSlideOffset>
	//  239  455:invokespecial   #477 <Method void parallaxOtherViews(float)>
				if(((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
	//* 240  458:aload_0         
	//* 241  459:getfield        #137 <Field View mSlideableView>
	//* 242  462:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 243  465:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//* 244  468:getfield        #140 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//* 245  471:ifeq            522
					dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
	//  246  474:aload_0         
	//  247  475:aload_0         
	//  248  476:getfield        #137 <Field View mSlideableView>
	//  249  479:aload_0         
	//  250  480:getfield        #376 <Field float mSlideOffset>
	//  251  483:aload_0         
	//  252  484:getfield        #304 <Field int mSliderFadeColor>
	//  253  487:invokespecial   #165 <Method void dimChildView(View, float, int)>
			} else
	//* 254  490:goto            522
			{
				for(i = 0; i < i2; i++)
	//* 255  493:iconst_0        
	//* 256  494:istore_2        
	//* 257  495:iload_2         
	//* 258  496:iload           10
	//* 259  498:icmpge          522
					dimChildView(getChildAt(i), 0.0F, mSliderFadeColor);
	//  260  501:aload_0         
	//  261  502:aload_0         
	//  262  503:iload_2         
	//  263  504:invokevirtual   #153 <Method View getChildAt(int)>
	//  264  507:fconst_0        
	//  265  508:aload_0         
	//  266  509:getfield        #304 <Field int mSliderFadeColor>
	//  267  512:invokespecial   #165 <Method void dimChildView(View, float, int)>

	//  268  515:iload_2         
	//  269  516:iconst_1        
	//  270  517:iadd            
	//  271  518:istore_2        
			}
	//* 272  519:goto            495
			updateObscuredViewsVisibility(mSlideableView);
	//  273  522:aload_0         
	//  274  523:aload_0         
	//  275  524:getfield        #137 <Field View mSlideableView>
	//  276  527:invokevirtual   #480 <Method void updateObscuredViewsVisibility(View)>
		}
	//* 277  530:goto            533
		mFirstLayout = false;
	//  278  533:aload_0         
	//  279  534:iconst_0        
	//  280  535:putfield        #57  <Field boolean mFirstLayout>
	//  281  538:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l1 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #488 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          8
		int k = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #491 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore          5
		int l = android.view.View.MeasureSpec.getMode(j);
	//    6   12:iload_2         
	//    7   13:invokestatic    #488 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   16:istore          6
		j = android.view.View.MeasureSpec.getSize(j);
	//    9   18:iload_2         
	//   10   19:invokestatic    #491 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:istore_2        
		int k1;
		int i2;
		if(l1 != 0x40000000)
	//*  12   23:iload           8
	//*  13   25:ldc2            #492 <Int 0x40000000>
	//*  14   28:icmpeq          99
		{
			if(isInEditMode())
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #495 <Method boolean isInEditMode()>
	//*  17   35:ifeq            88
			{
				if(l1 == 0x80000000)
	//*  18   38:iload           8
	//*  19   40:ldc2            #496 <Int 0x80000000>
	//*  20   43:icmpne          59
				{
					k1 = k;
	//   21   46:iload           5
	//   22   48:istore          7
					i2 = l;
	//   23   50:iload           6
	//   24   52:istore          9
					i = j;
	//   25   54:iload_2         
	//   26   55:istore_1        
				} else
	//*  27   56:goto            163
				{
					k1 = k;
	//   28   59:iload           5
	//   29   61:istore          7
					i2 = l;
	//   30   63:iload           6
	//   31   65:istore          9
					i = j;
	//   32   67:iload_2         
	//   33   68:istore_1        
					if(l1 == 0)
	//*  34   69:iload           8
	//*  35   71:ifne            163
					{
						k1 = 300;
	//   36   74:sipush          300
	//   37   77:istore          7
						i2 = l;
	//   38   79:iload           6
	//   39   81:istore          9
						i = j;
	//   40   83:iload_2         
	//   41   84:istore_1        
					}
				}
			} else
	//*  42   85:goto            163
			{
				throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
	//   43   88:new             #498 <Class IllegalStateException>
	//   44   91:dup             
	//   45   92:ldc2            #500 <String "Width must have an exact value or MATCH_PARENT">
	//   46   95:invokespecial   #503 <Method void IllegalStateException(String)>
	//   47   98:athrow          
			}
		} else
		{
			k1 = k;
	//   48   99:iload           5
	//   49  101:istore          7
			i2 = l;
	//   50  103:iload           6
	//   51  105:istore          9
			i = j;
	//   52  107:iload_2         
	//   53  108:istore_1        
			if(l == 0)
	//*  54  109:iload           6
	//*  55  111:ifne            163
				if(isInEditMode())
	//*  56  114:aload_0         
	//*  57  115:invokevirtual   #495 <Method boolean isInEditMode()>
	//*  58  118:ifeq            152
				{
					k1 = k;
	//   59  121:iload           5
	//   60  123:istore          7
					i2 = l;
	//   61  125:iload           6
	//   62  127:istore          9
					i = j;
	//   63  129:iload_2         
	//   64  130:istore_1        
					if(l == 0)
	//*  65  131:iload           6
	//*  66  133:ifne            163
					{
						i2 = 0x80000000;
	//   67  136:ldc2            #496 <Int 0x80000000>
	//   68  139:istore          9
						i = 300;
	//   69  141:sipush          300
	//   70  144:istore_1        
						k1 = k;
	//   71  145:iload           5
	//   72  147:istore          7
					}
				} else
	//*  73  149:goto            163
				{
					throw new IllegalStateException("Height must not be UNSPECIFIED");
	//   74  152:new             #498 <Class IllegalStateException>
	//   75  155:dup             
	//   76  156:ldc2            #505 <String "Height must not be UNSPECIFIED">
	//   77  159:invokespecial   #503 <Method void IllegalStateException(String)>
	//   78  162:athrow          
				}
		}
		if(i2 != 0x80000000)
	//*  79  163:iload           9
	//*  80  165:ldc2            #496 <Int 0x80000000>
	//*  81  168:icmpeq          203
		{
			if(i2 != 0x40000000)
	//*  82  171:iload           9
	//*  83  173:ldc2            #492 <Int 0x40000000>
	//*  84  176:icmpeq          186
			{
				i = 0;
	//   85  179:iconst_0        
	//   86  180:istore_1        
				j = 0;
	//   87  181:iconst_0        
	//   88  182:istore_2        
			} else
	//*  89  183:goto            217
			{
				i = i - getPaddingTop() - getPaddingBottom();
	//   90  186:iload_1         
	//   91  187:aload_0         
	//   92  188:invokevirtual   #456 <Method int getPaddingTop()>
	//   93  191:isub            
	//   94  192:aload_0         
	//   95  193:invokevirtual   #508 <Method int getPaddingBottom()>
	//   96  196:isub            
	//   97  197:istore_1        
				j = i;
	//   98  198:iload_1         
	//   99  199:istore_2        
			}
		} else
	//* 100  200:goto            217
		{
			j = i - getPaddingTop() - getPaddingBottom();
	//  101  203:iload_1         
	//  102  204:aload_0         
	//  103  205:invokevirtual   #456 <Method int getPaddingTop()>
	//  104  208:isub            
	//  105  209:aload_0         
	//  106  210:invokevirtual   #508 <Method int getPaddingBottom()>
	//  107  213:isub            
	//  108  214:istore_2        
			i = 0;
	//  109  215:iconst_0        
	//  110  216:istore_1        
		}
		int i3 = k1 - getPaddingLeft() - getPaddingRight();
	//  111  217:iload           7
	//  112  219:aload_0         
	//  113  220:invokevirtual   #453 <Method int getPaddingLeft()>
	//  114  223:isub            
	//  115  224:aload_0         
	//  116  225:invokevirtual   #450 <Method int getPaddingRight()>
	//  117  228:isub            
	//  118  229:istore          11
		int j3 = getChildCount();
	//  119  231:aload_0         
	//  120  232:invokevirtual   #149 <Method int getChildCount()>
	//  121  235:istore          12
		if(j3 > 2)
	//* 122  237:iload           12
	//* 123  239:iconst_2        
	//* 124  240:icmple          253
			Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
	//  125  243:ldc2            #330 <String "SlidingPaneLayout">
	//  126  246:ldc2            #510 <String "onMeasure: More than two child views are not supported.">
	//  127  249:invokestatic    #513 <Method int Log.e(String, String)>
	//  128  252:pop             
		mSlideableView = null;
	//  129  253:aload_0         
	//  130  254:aconst_null     
	//  131  255:putfield        #137 <Field View mSlideableView>
		l1 = i3;
	//  132  258:iload           11
	//  133  260:istore          8
		int k2 = 0;
	//  134  262:iconst_0        
	//  135  263:istore          10
		boolean flag = false;
	//  136  265:iconst_0        
	//  137  266:istore          15
		float f1 = 0.0F;
	//  138  268:fconst_0        
	//  139  269:fstore          4
		for(k = i; k2 < j3; k = i)
	//* 140  271:iload_1         
	//* 141  272:istore          5
	//* 142  274:iload           10
	//* 143  276:iload           12
	//* 144  278:icmpge          608
		{
			float f;
label0:
			{
				View view = getChildAt(k2);
	//  145  281:aload_0         
	//  146  282:iload           10
	//  147  284:invokevirtual   #153 <Method View getChildAt(int)>
	//  148  287:astore          17
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  149  289:aload           17
	//  150  291:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  151  294:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//  152  297:astore          18
				if(view.getVisibility() == 8)
	//* 153  299:aload           17
	//* 154  301:invokevirtual   #459 <Method int View.getVisibility()>
	//* 155  304:bipush          8
	//* 156  306:icmpne          324
				{
					layoutparams.dimWhenOffset = false;
	//  157  309:aload           18
	//  158  311:iconst_0        
	//  159  312:putfield        #140 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
					f = f1;
	//  160  315:fload           4
	//  161  317:fstore_3        
					i = k;
	//  162  318:iload           5
	//  163  320:istore_1        
					break label0;
	//  164  321:goto            593
				}
				f = f1;
	//  165  324:fload           4
	//  166  326:fstore_3        
				if(layoutparams.weight > 0.0F)
	//* 167  327:aload           18
	//* 168  329:getfield        #516 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 169  332:fconst_0        
	//* 170  333:fcmpl           
	//* 171  334:ifle            367
				{
					f1 += layoutparams.weight;
	//  172  337:fload           4
	//  173  339:aload           18
	//  174  341:getfield        #516 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  175  344:fadd            
	//  176  345:fstore          4
					f = f1;
	//  177  347:fload           4
	//  178  349:fstore_3        
					if(layoutparams.width == 0)
	//* 179  350:aload           18
	//* 180  352:getfield        #519 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 181  355:ifne            367
					{
						f = f1;
	//  182  358:fload           4
	//  183  360:fstore_3        
						i = k;
	//  184  361:iload           5
	//  185  363:istore_1        
						break label0;
	//  186  364:goto            593
					}
				}
				i = layoutparams.leftMargin + layoutparams.rightMargin;
	//  187  367:aload           18
	//  188  369:getfield        #146 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  189  372:aload           18
	//  190  374:getfield        #143 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  191  377:iadd            
	//  192  378:istore_1        
				if(layoutparams.width == -2)
	//* 193  379:aload           18
	//* 194  381:getfield        #519 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 195  384:bipush          -2
	//* 196  386:icmpne          403
					i = android.view.View.MeasureSpec.makeMeasureSpec(i3 - i, 0x80000000);
	//  197  389:iload           11
	//  198  391:iload_1         
	//  199  392:isub            
	//  200  393:ldc2            #496 <Int 0x80000000>
	//  201  396:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  202  399:istore_1        
				else
	//* 203  400:goto            438
				if(layoutparams.width == -1)
	//* 204  403:aload           18
	//* 205  405:getfield        #519 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 206  408:iconst_m1       
	//* 207  409:icmpne          426
					i = android.view.View.MeasureSpec.makeMeasureSpec(i3 - i, 0x40000000);
	//  208  412:iload           11
	//  209  414:iload_1         
	//  210  415:isub            
	//  211  416:ldc2            #492 <Int 0x40000000>
	//  212  419:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  213  422:istore_1        
				else
	//* 214  423:goto            438
					i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
	//  215  426:aload           18
	//  216  428:getfield        #519 <Field int SlidingPaneLayout$LayoutParams.width>
	//  217  431:ldc2            #492 <Int 0x40000000>
	//  218  434:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  219  437:istore_1        
				int i1;
				if(layoutparams.height == -2)
	//* 220  438:aload           18
	//* 221  440:getfield        #525 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 222  443:bipush          -2
	//* 223  445:icmpne          460
					i1 = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
	//  224  448:iload_2         
	//  225  449:ldc2            #496 <Int 0x80000000>
	//  226  452:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  227  455:istore          6
				else
	//* 228  457:goto            494
				if(layoutparams.height == -1)
	//* 229  460:aload           18
	//* 230  462:getfield        #525 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 231  465:iconst_m1       
	//* 232  466:icmpne          481
					i1 = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  233  469:iload_2         
	//  234  470:ldc2            #492 <Int 0x40000000>
	//  235  473:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  236  476:istore          6
				else
	//* 237  478:goto            494
					i1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
	//  238  481:aload           18
	//  239  483:getfield        #525 <Field int SlidingPaneLayout$LayoutParams.height>
	//  240  486:ldc2            #492 <Int 0x40000000>
	//  241  489:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  242  492:istore          6
				view.measure(i, i1);
	//  243  494:aload           17
	//  244  496:iload_1         
	//  245  497:iload           6
	//  246  499:invokevirtual   #528 <Method void View.measure(int, int)>
				i1 = view.getMeasuredWidth();
	//  247  502:aload           17
	//  248  504:invokevirtual   #462 <Method int View.getMeasuredWidth()>
	//  249  507:istore          6
				int k3 = view.getMeasuredHeight();
	//  250  509:aload           17
	//  251  511:invokevirtual   #469 <Method int View.getMeasuredHeight()>
	//  252  514:istore          13
				i = k;
	//  253  516:iload           5
	//  254  518:istore_1        
				if(i2 == 0x80000000)
	//* 255  519:iload           9
	//* 256  521:ldc2            #496 <Int 0x80000000>
	//* 257  524:icmpne          544
				{
					i = k;
	//  258  527:iload           5
	//  259  529:istore_1        
					if(k3 > k)
	//* 260  530:iload           13
	//* 261  532:iload           5
	//* 262  534:icmple          544
						i = Math.min(k3, j);
	//  263  537:iload           13
	//  264  539:iload_2         
	//  265  540:invokestatic    #268 <Method int Math.min(int, int)>
	//  266  543:istore_1        
				}
				l1 -= i1;
	//  267  544:iload           8
	//  268  546:iload           6
	//  269  548:isub            
	//  270  549:istore          8
				boolean flag1;
				if(l1 < 0)
	//* 271  551:iload           8
	//* 272  553:ifge            562
					flag1 = true;
	//  273  556:iconst_1        
	//  274  557:istore          16
				else
	//* 275  559:goto            565
					flag1 = false;
	//  276  562:iconst_0        
	//  277  563:istore          16
				layoutparams.slideable = flag1;
	//  278  565:aload           18
	//  279  567:iload           16
	//  280  569:putfield        #245 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
				if(layoutparams.slideable)
	//* 281  572:aload           18
	//* 282  574:getfield        #245 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//* 283  577:ifeq            586
					mSlideableView = view;
	//  284  580:aload_0         
	//  285  581:aload           17
	//  286  583:putfield        #137 <Field View mSlideableView>
				flag = flag1 | flag;
	//  287  586:iload           16
	//  288  588:iload           15
	//  289  590:ior             
	//  290  591:istore          15
			}
			k2++;
	//  291  593:iload           10
	//  292  595:iconst_1        
	//  293  596:iadd            
	//  294  597:istore          10
			f1 = f;
	//  295  599:fload_3         
	//  296  600:fstore          4
		}

	//  297  602:iload_1         
	//  298  603:istore          5
	//* 299  605:goto            274
		if(flag || f1 > 0.0F)
	//* 300  608:iload           15
	//* 301  610:ifne            620
	//* 302  613:fload           4
	//* 303  615:fconst_0        
	//* 304  616:fcmpl           
	//* 305  617:ifle            1039
		{
			int j1 = i3 - mOverhangSize;
	//  306  620:iload           11
	//  307  622:aload_0         
	//  308  623:getfield        #464 <Field int mOverhangSize>
	//  309  626:isub            
	//  310  627:istore          6
			for(int j2 = 0; j2 < j3; j2++)
	//* 311  629:iconst_0        
	//* 312  630:istore          9
	//* 313  632:iload           9
	//* 314  634:iload           12
	//* 315  636:icmpge          1039
			{
				View view1 = getChildAt(j2);
	//  316  639:aload_0         
	//  317  640:iload           9
	//  318  642:invokevirtual   #153 <Method View getChildAt(int)>
	//  319  645:astore          17
				if(view1.getVisibility() == 8)
	//* 320  647:aload           17
	//* 321  649:invokevirtual   #459 <Method int View.getVisibility()>
	//* 322  652:bipush          8
	//* 323  654:icmpne          660
					continue;
	//  324  657:goto            1030
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  325  660:aload           17
	//  326  662:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  327  665:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//  328  668:astore          18
				if(view1.getVisibility() == 8)
	//* 329  670:aload           17
	//* 330  672:invokevirtual   #459 <Method int View.getVisibility()>
	//* 331  675:bipush          8
	//* 332  677:icmpne          683
					continue;
	//  333  680:goto            1030
				if(layoutparams1.width == 0 && layoutparams1.weight > 0.0F)
	//* 334  683:aload           18
	//* 335  685:getfield        #519 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 336  688:ifne            706
	//* 337  691:aload           18
	//* 338  693:getfield        #516 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 339  696:fconst_0        
	//* 340  697:fcmpl           
	//* 341  698:ifle            706
					i = 1;
	//  342  701:iconst_1        
	//  343  702:istore_1        
				else
	//* 344  703:goto            708
					i = 0;
	//  345  706:iconst_0        
	//  346  707:istore_1        
				int l2;
				if(i != 0)
	//* 347  708:iload_1         
	//* 348  709:ifeq            718
					l2 = 0;
	//  349  712:iconst_0        
	//  350  713:istore          10
				else
	//* 351  715:goto            725
					l2 = view1.getMeasuredWidth();
	//  352  718:aload           17
	//  353  720:invokevirtual   #462 <Method int View.getMeasuredWidth()>
	//  354  723:istore          10
				if(flag && view1 != mSlideableView)
	//* 355  725:iload           15
	//* 356  727:ifeq            856
	//* 357  730:aload           17
	//* 358  732:aload_0         
	//* 359  733:getfield        #137 <Field View mSlideableView>
	//* 360  736:if_acmpeq       856
				{
					if(layoutparams1.width >= 0 || l2 <= j1 && layoutparams1.weight <= 0.0F)
						continue;
	//  361  739:aload           18
	//  362  741:getfield        #519 <Field int SlidingPaneLayout$LayoutParams.width>
	//  363  744:ifge            853
	//  364  747:iload           10
	//  365  749:iload           6
	//  366  751:icmpgt          764
	//  367  754:aload           18
	//  368  756:getfield        #516 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  369  759:fconst_0        
	//  370  760:fcmpl           
	//  371  761:ifle            853
					if(i != 0)
	//* 372  764:iload_1         
	//* 373  765:ifeq            824
					{
						if(layoutparams1.height == -2)
	//* 374  768:aload           18
	//* 375  770:getfield        #525 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 376  773:bipush          -2
	//* 377  775:icmpne          789
							i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
	//  378  778:iload_2         
	//  379  779:ldc2            #496 <Int 0x80000000>
	//  380  782:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  381  785:istore_1        
						else
	//* 382  786:goto            836
						if(layoutparams1.height == -1)
	//* 383  789:aload           18
	//* 384  791:getfield        #525 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 385  794:iconst_m1       
	//* 386  795:icmpne          809
							i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  387  798:iload_2         
	//  388  799:ldc2            #492 <Int 0x40000000>
	//  389  802:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  390  805:istore_1        
						else
	//* 391  806:goto            836
							i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
	//  392  809:aload           18
	//  393  811:getfield        #525 <Field int SlidingPaneLayout$LayoutParams.height>
	//  394  814:ldc2            #492 <Int 0x40000000>
	//  395  817:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  396  820:istore_1        
					} else
	//* 397  821:goto            836
					{
						i = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  398  824:aload           17
	//  399  826:invokevirtual   #469 <Method int View.getMeasuredHeight()>
	//  400  829:ldc2            #492 <Int 0x40000000>
	//  401  832:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  402  835:istore_1        
					}
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), i);
	//  403  836:aload           17
	//  404  838:iload           6
	//  405  840:ldc2            #492 <Int 0x40000000>
	//  406  843:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  407  846:iload_1         
	//  408  847:invokevirtual   #528 <Method void View.measure(int, int)>
					continue;
	//  409  850:goto            1030
				}
	//* 410  853:goto            1030
				if(layoutparams1.weight <= 0.0F)
					continue;
	//  411  856:aload           18
	//  412  858:getfield        #516 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  413  861:fconst_0        
	//  414  862:fcmpl           
	//  415  863:ifle            1030
				if(layoutparams1.width == 0)
	//* 416  866:aload           18
	//* 417  868:getfield        #519 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 418  871:ifne            930
				{
					if(layoutparams1.height == -2)
	//* 419  874:aload           18
	//* 420  876:getfield        #525 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 421  879:bipush          -2
	//* 422  881:icmpne          895
						i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
	//  423  884:iload_2         
	//  424  885:ldc2            #496 <Int 0x80000000>
	//  425  888:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  426  891:istore_1        
					else
	//* 427  892:goto            942
					if(layoutparams1.height == -1)
	//* 428  895:aload           18
	//* 429  897:getfield        #525 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 430  900:iconst_m1       
	//* 431  901:icmpne          915
						i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  432  904:iload_2         
	//  433  905:ldc2            #492 <Int 0x40000000>
	//  434  908:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  435  911:istore_1        
					else
	//* 436  912:goto            942
						i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
	//  437  915:aload           18
	//  438  917:getfield        #525 <Field int SlidingPaneLayout$LayoutParams.height>
	//  439  920:ldc2            #492 <Int 0x40000000>
	//  440  923:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  441  926:istore_1        
				} else
	//* 442  927:goto            942
				{
					i = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  443  930:aload           17
	//  444  932:invokevirtual   #469 <Method int View.getMeasuredHeight()>
	//  445  935:ldc2            #492 <Int 0x40000000>
	//  446  938:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  447  941:istore_1        
				}
				if(flag)
	//* 448  942:iload           15
	//* 449  944:ifeq            991
				{
					int l3 = i3 - (layoutparams1.leftMargin + layoutparams1.rightMargin);
	//  450  947:iload           11
	//  451  949:aload           18
	//  452  951:getfield        #146 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  453  954:aload           18
	//  454  956:getfield        #143 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  455  959:iadd            
	//  456  960:isub            
	//  457  961:istore          13
					int j4 = android.view.View.MeasureSpec.makeMeasureSpec(l3, 0x40000000);
	//  458  963:iload           13
	//  459  965:ldc2            #492 <Int 0x40000000>
	//  460  968:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  461  971:istore          14
					if(l2 != l3)
	//* 462  973:iload           10
	//* 463  975:iload           13
	//* 464  977:icmpeq          988
						view1.measure(j4, i);
	//  465  980:aload           17
	//  466  982:iload           14
	//  467  984:iload_1         
	//  468  985:invokevirtual   #528 <Method void View.measure(int, int)>
				} else
	//* 469  988:goto            1030
				{
					int i4 = Math.max(0, l1);
	//  470  991:iconst_0        
	//  471  992:iload           8
	//  472  994:invokestatic    #262 <Method int Math.max(int, int)>
	//  473  997:istore          13
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2 + (int)((layoutparams1.weight * (float)i4) / f1), 0x40000000), i);
	//  474  999:aload           17
	//  475 1001:iload           10
	//  476 1003:aload           18
	//  477 1005:getfield        #516 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  478 1008:iload           13
	//  479 1010:i2f             
	//  480 1011:fmul            
	//  481 1012:fload           4
	//  482 1014:fdiv            
	//  483 1015:f2i             
	//  484 1016:iadd            
	//  485 1017:ldc2            #492 <Int 0x40000000>
	//  486 1020:invokestatic    #522 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  487 1023:iload_1         
	//  488 1024:invokevirtual   #528 <Method void View.measure(int, int)>
				}
			}

	//  489 1027:goto            1030
	//  490 1030:iload           9
	//  491 1032:iconst_1        
	//  492 1033:iadd            
	//  493 1034:istore          9
		}
	//* 494 1036:goto            632
		setMeasuredDimension(k1, k + getPaddingTop() + getPaddingBottom());
	//  495 1039:aload_0         
	//  496 1040:iload           7
	//  497 1042:iload           5
	//  498 1044:aload_0         
	//  499 1045:invokevirtual   #456 <Method int getPaddingTop()>
	//  500 1048:iadd            
	//  501 1049:aload_0         
	//  502 1050:invokevirtual   #508 <Method int getPaddingBottom()>
	//  503 1053:iadd            
	//  504 1054:invokevirtual   #531 <Method void setMeasuredDimension(int, int)>
		mCanSlide = flag;
	//  505 1057:aload_0         
	//  506 1058:iload           15
	//  507 1060:putfield        #201 <Field boolean mCanSlide>
		if(mDragHelper.getViewDragState() != 0 && !flag)
	//* 508 1063:aload_0         
	//* 509 1064:getfield        #193 <Field ViewDragHelper mDragHelper>
	//* 510 1067:invokevirtual   #534 <Method int ViewDragHelper.getViewDragState()>
	//* 511 1070:ifeq            1085
	//* 512 1073:iload           15
	//* 513 1075:ifne            1085
			mDragHelper.abort();
	//  514 1078:aload_0         
	//  515 1079:getfield        #193 <Field ViewDragHelper mDragHelper>
	//  516 1082:invokevirtual   #204 <Method void ViewDragHelper.abort()>
	//  517 1085:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #15  <Class SlidingPaneLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #538 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #15  <Class SlidingPaneLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #542 <Method Parcelable SlidingPaneLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #538 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).isOpen)
	//*  14   26:aload_1         
	//*  15   27:getfield        #544 <Field boolean SlidingPaneLayout$SavedState.isOpen>
	//*  16   30:ifeq            41
			openPane();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #546 <Method boolean openPane()>
	//   19   37:pop             
		else
	//*  20   38:goto            46
			closePane();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #548 <Method boolean closePane()>
	//   23   45:pop             
		mPreservedOpenState = ((SavedState) (parcelable)).isOpen;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #544 <Field boolean SlidingPaneLayout$SavedState.isOpen>
	//   27   51:putfield        #63  <Field boolean mPreservedOpenState>
	//   28   54:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #15  <Class SlidingPaneLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #551 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #553 <Method void SlidingPaneLayout$SavedState(Parcelable)>
	//    5   11:astore_2        
		boolean flag;
		if(isSlideable())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #555 <Method boolean isSlideable()>
	//*   8   16:ifeq            27
			flag = isOpen();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #557 <Method boolean isOpen()>
	//   11   23:istore_1        
		else
	//*  12   24:goto            32
			flag = mPreservedOpenState;
	//   13   27:aload_0         
	//   14   28:getfield        #63  <Field boolean mPreservedOpenState>
	//   15   31:istore_1        
		savedstate.isOpen = flag;
	//   16   32:aload_2         
	//   17   33:iload_1         
	//   18   34:putfield        #544 <Field boolean SlidingPaneLayout$SavedState.isOpen>
		return ((Parcelable) (savedstate));
	//   19   37:aload_2         
	//   20   38:areturn         
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #560 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i != k)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          19
			mFirstLayout = true;
	//    9   14:aload_0         
	//   10   15:iconst_1        
	//   11   16:putfield        #57  <Field boolean mFirstLayout>
	//   12   19:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(!mCanSlide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field boolean mCanSlide>
	//*   2    4:ifne            13
			return super.onTouchEvent(motionevent);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #563 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//    6   12:ireturn         
		mDragHelper.processTouchEvent(motionevent);
	//    7   13:aload_0         
	//    8   14:getfield        #193 <Field ViewDragHelper mDragHelper>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #567 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		switch(motionevent.getActionMasked())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #408 <Method int MotionEvent.getActionMasked()>
		{
	//*  13   25:tableswitch     0 1: default 48
	//	               0 147
	//	               1 50
		default:
			return true;
	//   14   48:iconst_1        
	//   15   49:ireturn         

		case 1: // '\001'
			if(isDimmed(mSlideableView))
	//*  16   50:aload_0         
	//*  17   51:aload_0         
	//*  18   52:getfield        #137 <Field View mSlideableView>
	//*  19   55:invokevirtual   #437 <Method boolean isDimmed(View)>
	//*  20   58:ifeq            167
			{
				float f = motionevent.getX();
	//   21   61:aload_1         
	//   22   62:invokevirtual   #412 <Method float MotionEvent.getX()>
	//   23   65:fstore_2        
				float f2 = motionevent.getY();
	//   24   66:aload_1         
	//   25   67:invokevirtual   #415 <Method float MotionEvent.getY()>
	//   26   70:fstore_3        
				float f4 = f - mInitialMotionX;
	//   27   71:fload_2         
	//   28   72:aload_0         
	//   29   73:getfield        #423 <Field float mInitialMotionX>
	//   30   76:fsub            
	//   31   77:fstore          4
				float f5 = f2 - mInitialMotionY;
	//   32   79:fload_3         
	//   33   80:aload_0         
	//   34   81:getfield        #429 <Field float mInitialMotionY>
	//   35   84:fsub            
	//   36   85:fstore          5
				int i = mDragHelper.getTouchSlop();
	//   37   87:aload_0         
	//   38   88:getfield        #193 <Field ViewDragHelper mDragHelper>
	//   39   91:invokevirtual   #432 <Method int ViewDragHelper.getTouchSlop()>
	//   40   94:istore          6
				if(f4 * f4 + f5 * f5 < (float)(i * i) && mDragHelper.isViewUnder(mSlideableView, (int)f, (int)f2))
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
	//*  55  118:getfield        #193 <Field ViewDragHelper mDragHelper>
	//*  56  121:aload_0         
	//*  57  122:getfield        #137 <Field View mSlideableView>
	//*  58  125:fload_2         
	//*  59  126:f2i             
	//*  60  127:fload_3         
	//*  61  128:f2i             
	//*  62  129:invokevirtual   #419 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//*  63  132:ifeq            167
				{
					closePane(mSlideableView, 0);
	//   64  135:aload_0         
	//   65  136:aload_0         
	//   66  137:getfield        #137 <Field View mSlideableView>
	//   67  140:iconst_0        
	//   68  141:invokespecial   #190 <Method boolean closePane(View, int)>
	//   69  144:pop             
					return true;
	//   70  145:iconst_1        
	//   71  146:ireturn         
				}
			}
			break;

		case 0: // '\0'
			float f1 = motionevent.getX();
	//   72  147:aload_1         
	//   73  148:invokevirtual   #412 <Method float MotionEvent.getX()>
	//   74  151:fstore_2        
			float f3 = motionevent.getY();
	//   75  152:aload_1         
	//   76  153:invokevirtual   #415 <Method float MotionEvent.getY()>
	//   77  156:fstore_3        
			mInitialMotionX = f1;
	//   78  157:aload_0         
	//   79  158:fload_2         
	//   80  159:putfield        #423 <Field float mInitialMotionX>
			mInitialMotionY = f3;
	//   81  162:aload_0         
	//   82  163:fload_3         
	//   83  164:putfield        #429 <Field float mInitialMotionY>
			break;
		}
		return true;
	//   84  167:iconst_1        
	//   85  168:ireturn         
	}

	public boolean openPane()
	{
		return openPane(mSlideableView, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #137 <Field View mSlideableView>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #569 <Method boolean openPane(View, int)>
	//    5    9:ireturn         
	}

	public void requestChildFocus(View view, View view1)
	{
		super.requestChildFocus(view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #573 <Method void ViewGroup.requestChildFocus(View, View)>
		if(!isInTouchMode() && !mCanSlide)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #576 <Method boolean isInTouchMode()>
	//*   6   10:ifne            40
	//*   7   13:aload_0         
	//*   8   14:getfield        #201 <Field boolean mCanSlide>
	//*   9   17:ifne            40
		{
			boolean flag;
			if(view == mSlideableView)
	//*  10   20:aload_1         
	//*  11   21:aload_0         
	//*  12   22:getfield        #137 <Field View mSlideableView>
	//*  13   25:if_acmpne       33
				flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_3        
			else
	//*  16   30:goto            35
				flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_3        
			mPreservedOpenState = flag;
	//   19   35:aload_0         
	//   20   36:iload_3         
	//   21   37:putfield        #63  <Field boolean mPreservedOpenState>
		}
	//   22   40:return          
	}

	void setAllChildrenVisible()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #153 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(view.getVisibility() == 4)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #459 <Method int View.getVisibility()>
	//*  14   22:iconst_4        
	//*  15   23:icmpne          31
				view.setVisibility(0);
	//   16   26:aload_3         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #580 <Method void View.setVisibility(int)>
		}

	//   19   31:iload_1         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
	//*  23   35:goto            7
	//   24   38:return          
	}

	public void setCoveredFadeColor(int i)
	{
		mCoveredFadeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #163 <Field int mCoveredFadeColor>
	//    3    5:return          
	}

	public void setPanelSlideListener(PanelSlideListener panelslidelistener)
	{
		mPanelSlideListener = panelslidelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #587 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    3    5:return          
	}

	public void setParallaxDistance(int i)
	{
		mParallaxBy = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #157 <Field int mParallaxBy>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #591 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setShadowDrawable(Drawable drawable)
	{
		setShadowDrawableLeft(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #597 <Method void setShadowDrawableLeft(Drawable)>
	//    3    5:return          
	}

	public void setShadowDrawableLeft(Drawable drawable)
	{
		mShadowDrawableLeft = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #215 <Field Drawable mShadowDrawableLeft>
	//    3    5:return          
	}

	public void setShadowDrawableRight(Drawable drawable)
	{
		mShadowDrawableRight = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #213 <Field Drawable mShadowDrawableRight>
	//    3    5:return          
	}

	public void setShadowResource(int i)
	{
		setShadowDrawable(getResources().getDrawable(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #605 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #611 <Method Drawable Resources.getDrawable(int)>
	//    5    9:invokevirtual   #613 <Method void setShadowDrawable(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceLeft(int i)
	{
		setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #284 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #619 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #597 <Method void setShadowDrawableLeft(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceRight(int i)
	{
		setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #284 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #619 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #622 <Method void setShadowDrawableRight(Drawable)>
	//    6   12:return          
	}

	public void setSliderFadeColor(int i)
	{
		mSliderFadeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #304 <Field int mSliderFadeColor>
	//    3    5:return          
	}

	boolean smoothSlideTo(float f, int i)
	{
		if(!mCanSlide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field boolean mCanSlide>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag = isLayoutRtlSupport();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #135 <Method boolean isLayoutRtlSupport()>
	//    7   13:istore          5
		Object obj = ((Object) ((LayoutParams)mSlideableView.getLayoutParams()));
	//    8   15:aload_0         
	//    9   16:getfield        #137 <Field View mSlideableView>
	//   10   19:invokevirtual   #72  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   22:checkcast       #9   <Class SlidingPaneLayout$LayoutParams>
	//   12   25:astore          6
		if(flag)
	//*  13   27:iload           5
	//*  14   29:ifeq            79
		{
			i = getPaddingRight();
	//   15   32:aload_0         
	//   16   33:invokevirtual   #450 <Method int getPaddingRight()>
	//   17   36:istore_2        
			int j = ((LayoutParams) (obj)).rightMargin;
	//   18   37:aload           6
	//   19   39:getfield        #143 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   20   42:istore_3        
			int k = mSlideableView.getWidth();
	//   21   43:aload_0         
	//   22   44:getfield        #137 <Field View mSlideableView>
	//   23   47:invokevirtual   #475 <Method int View.getWidth()>
	//   24   50:istore          4
			i = (int)((float)getWidth() - ((float)(i + j) + f * (float)mSlideRange + (float)k));
	//   25   52:aload_0         
	//   26   53:invokevirtual   #624 <Method int getWidth()>
	//   27   56:i2f             
	//   28   57:iload_2         
	//   29   58:iload_3         
	//   30   59:iadd            
	//   31   60:i2f             
	//   32   61:fload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #466 <Field int mSlideRange>
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
			i = (int)((float)(getPaddingLeft() + ((LayoutParams) (obj)).leftMargin) + f * (float)mSlideRange);
	//   45   79:aload_0         
	//   46   80:invokevirtual   #453 <Method int getPaddingLeft()>
	//   47   83:aload           6
	//   48   85:getfield        #146 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   49   88:iadd            
	//   50   89:i2f             
	//   51   90:fload_1         
	//   52   91:aload_0         
	//   53   92:getfield        #466 <Field int mSlideRange>
	//   54   95:i2f             
	//   55   96:fmul            
	//   56   97:fadd            
	//   57   98:f2i             
	//   58   99:istore_2        
		}
		obj = ((Object) (mDragHelper));
	//   59  100:aload_0         
	//   60  101:getfield        #193 <Field ViewDragHelper mDragHelper>
	//   61  104:astore          6
		View view = mSlideableView;
	//   62  106:aload_0         
	//   63  107:getfield        #137 <Field View mSlideableView>
	//   64  110:astore          7
		if(((ViewDragHelper) (obj)).smoothSlideViewTo(view, i, view.getTop()))
	//*  65  112:aload           6
	//*  66  114:aload           7
	//*  67  116:iload_2         
	//*  68  117:aload           7
	//*  69  119:invokevirtual   #218 <Method int View.getTop()>
	//*  70  122:invokevirtual   #627 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  71  125:ifeq            138
		{
			setAllChildrenVisible();
	//   72  128:aload_0         
	//   73  129:invokevirtual   #629 <Method void setAllChildrenVisible()>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   74  132:aload_0         
	//   75  133:invokestatic    #207 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return true;
	//   76  136:iconst_1        
	//   77  137:ireturn         
		} else
		{
			return false;
	//   78  138:iconst_0        
	//   79  139:ireturn         
		}
	}

	void updateObscuredViewsVisibility(View view)
	{
		boolean flag = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          17
		int i;
		if(flag)
	//*   3    6:iload           17
	//*   4    8:ifeq            24
			i = getWidth() - getPaddingRight();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #624 <Method int getWidth()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #450 <Method int getPaddingRight()>
	//    9   19:isub            
	//   10   20:istore_2        
		else
	//*  11   21:goto            29
			i = getPaddingLeft();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #453 <Method int getPaddingLeft()>
	//   14   28:istore_2        
		int j;
		if(flag)
	//*  15   29:iload           17
	//*  16   31:ifeq            42
			j = getPaddingLeft();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #453 <Method int getPaddingLeft()>
	//   19   38:istore_3        
		else
	//*  20   39:goto            52
			j = getWidth() - getPaddingRight();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #624 <Method int getWidth()>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #450 <Method int getPaddingRight()>
	//   25   50:isub            
	//   26   51:istore_3        
		int i2 = getPaddingTop();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #456 <Method int getPaddingTop()>
	//   29   56:istore          10
		int j2 = getHeight();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #632 <Method int getHeight()>
	//   32   62:istore          11
		int k2 = getPaddingBottom();
	//   33   64:aload_0         
	//   34   65:invokevirtual   #508 <Method int getPaddingBottom()>
	//   35   68:istore          12
		int k;
		int l;
		int i1;
		int j1;
		if(view != null && viewIsOpaque(view))
	//*  36   70:aload_1         
	//*  37   71:ifnull          108
	//*  38   74:aload_1         
	//*  39   75:invokestatic    #634 <Method boolean viewIsOpaque(View)>
	//*  40   78:ifeq            108
		{
			k = view.getLeft();
	//   41   81:aload_1         
	//   42   82:invokevirtual   #230 <Method int View.getLeft()>
	//   43   85:istore          4
			l = view.getRight();
	//   44   87:aload_1         
	//   45   88:invokevirtual   #227 <Method int View.getRight()>
	//   46   91:istore          5
			i1 = view.getTop();
	//   47   93:aload_1         
	//   48   94:invokevirtual   #218 <Method int View.getTop()>
	//   49   97:istore          6
			j1 = view.getBottom();
	//   50   99:aload_1         
	//   51  100:invokevirtual   #221 <Method int View.getBottom()>
	//   52  103:istore          7
		} else
	//*  53  105:goto            120
		{
			k = 0;
	//   54  108:iconst_0        
	//   55  109:istore          4
			l = 0;
	//   56  111:iconst_0        
	//   57  112:istore          5
			i1 = 0;
	//   58  114:iconst_0        
	//   59  115:istore          6
			j1 = 0;
	//   60  117:iconst_0        
	//   61  118:istore          7
		}
		int l2 = getChildCount();
	//   62  120:aload_0         
	//   63  121:invokevirtual   #149 <Method int getChildCount()>
	//   64  124:istore          13
		for(int k1 = 0; k1 < l2; k1++)
	//*  65  126:iconst_0        
	//*  66  127:istore          8
	//*  67  129:iload           8
	//*  68  131:iload           13
	//*  69  133:icmpge          296
		{
			View view1 = getChildAt(k1);
	//   70  136:aload_0         
	//   71  137:iload           8
	//   72  139:invokevirtual   #153 <Method View getChildAt(int)>
	//   73  142:astore          18
			if(view1 == view)
	//*  74  144:aload           18
	//*  75  146:aload_1         
	//*  76  147:if_acmpne       151
				return;
	//   77  150:return          
			if(view1.getVisibility() == 8)
	//*  78  151:aload           18
	//*  79  153:invokevirtual   #459 <Method int View.getVisibility()>
	//*  80  156:bipush          8
	//*  81  158:icmpne          164
				continue;
	//   82  161:goto            287
			int l1;
			if(flag)
	//*  83  164:iload           17
	//*  84  166:ifeq            175
				l1 = j;
	//   85  169:iload_3         
	//   86  170:istore          9
			else
	//*  87  172:goto            178
				l1 = i;
	//   88  175:iload_2         
	//   89  176:istore          9
			int i3 = Math.max(l1, view1.getLeft());
	//   90  178:iload           9
	//   91  180:aload           18
	//   92  182:invokevirtual   #230 <Method int View.getLeft()>
	//   93  185:invokestatic    #262 <Method int Math.max(int, int)>
	//   94  188:istore          14
			int j3 = Math.max(i2, view1.getTop());
	//   95  190:iload           10
	//   96  192:aload           18
	//   97  194:invokevirtual   #218 <Method int View.getTop()>
	//   98  197:invokestatic    #262 <Method int Math.max(int, int)>
	//   99  200:istore          15
			if(flag)
	//* 100  202:iload           17
	//* 101  204:ifeq            213
				l1 = i;
	//  102  207:iload_2         
	//  103  208:istore          9
			else
	//* 104  210:goto            216
				l1 = j;
	//  105  213:iload_3         
	//  106  214:istore          9
			l1 = Math.min(l1, view1.getRight());
	//  107  216:iload           9
	//  108  218:aload           18
	//  109  220:invokevirtual   #227 <Method int View.getRight()>
	//  110  223:invokestatic    #268 <Method int Math.min(int, int)>
	//  111  226:istore          9
			int k3 = Math.min(j2 - k2, view1.getBottom());
	//  112  228:iload           11
	//  113  230:iload           12
	//  114  232:isub            
	//  115  233:aload           18
	//  116  235:invokevirtual   #221 <Method int View.getBottom()>
	//  117  238:invokestatic    #268 <Method int Math.min(int, int)>
	//  118  241:istore          16
			if(i3 >= k && j3 >= i1 && l1 <= l && k3 <= j1)
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
				l1 = 4;
	//  131  271:iconst_4        
	//  132  272:istore          9
			else
	//* 133  274:goto            280
				l1 = 0;
	//  134  277:iconst_0        
	//  135  278:istore          9
			view1.setVisibility(l1);
	//  136  280:aload           18
	//  137  282:iload           9
	//  138  284:invokevirtual   #580 <Method void View.setVisibility(int)>
		}

	//  139  287:iload           8
	//  140  289:iconst_1        
	//  141  290:iadd            
	//  142  291:istore          8
	//* 143  293:goto            129
	//  144  296:return          
	}

	private boolean mCanSlide;
	private int mCoveredFadeColor;
	private boolean mDisplayListReflectionLoaded;
	final ViewDragHelper mDragHelper;
	private boolean mFirstLayout;
	private Method mGetDisplayList;
	private float mInitialMotionX;
	private float mInitialMotionY;
	boolean mIsUnableToDrag;
	private final int mOverhangSize;
	private PanelSlideListener mPanelSlideListener;
	private int mParallaxBy;
	private float mParallaxOffset;
	final ArrayList mPostedRunnables;
	boolean mPreservedOpenState;
	private Field mRecreateDisplayList;
	private Drawable mShadowDrawableLeft;
	private Drawable mShadowDrawableRight;
	float mSlideOffset;
	int mSlideRange;
	View mSlideableView;
	private int mSliderFadeColor;
	private final Rect mTmpRect;
}
