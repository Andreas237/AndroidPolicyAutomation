// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			LottieDrawable, Cancellable, LottieComposition, Utils, 
//			OnCompositionLoadedListener, ImageAssetDelegate

public class LottieAnimationView extends AppCompatImageView
{
	public static final class CacheStrategy extends Enum
	{

		public static CacheStrategy valueOf(String s)
		{
			return (CacheStrategy)Enum.valueOf(com/airbnb/lottie/LottieAnimationView$CacheStrategy, s);
		//    0    0:ldc1            #2   <Class LottieAnimationView$CacheStrategy>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LottieAnimationView$CacheStrategy>
		//    4    9:areturn         
		}

		public static CacheStrategy[] values()
		{
			return (CacheStrategy[])((CacheStrategy []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field LottieAnimationView$CacheStrategy[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.airbnb.lottie.LottieAnimationView$CacheStrategy_3B_.clone()>
		//    2    6:checkcast       #42  <Class LottieAnimationView$CacheStrategy[]>
		//    3    9:areturn         
		}

		private static final CacheStrategy $VALUES[];
		public static final CacheStrategy None;
		public static final CacheStrategy Strong;
		public static final CacheStrategy Weak;

		static 
		{
			None = new CacheStrategy("None", 0);
		//    0    0:new             #2   <Class LottieAnimationView$CacheStrategy>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "None">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void LottieAnimationView$CacheStrategy(String, int)>
		//    5   10:putstatic       #23  <Field LottieAnimationView$CacheStrategy None>
			Weak = new CacheStrategy("Weak", 1);
		//    6   13:new             #2   <Class LottieAnimationView$CacheStrategy>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "Weak">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void LottieAnimationView$CacheStrategy(String, int)>
		//   11   23:putstatic       #26  <Field LottieAnimationView$CacheStrategy Weak>
			Strong = new CacheStrategy("Strong", 2);
		//   12   26:new             #2   <Class LottieAnimationView$CacheStrategy>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "Strong">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void LottieAnimationView$CacheStrategy(String, int)>
		//   17   36:putstatic       #29  <Field LottieAnimationView$CacheStrategy Strong>
			$VALUES = (new CacheStrategy[] {
				None, Weak, Strong
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       CacheStrategy[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field LottieAnimationView$CacheStrategy None>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field LottieAnimationView$CacheStrategy Weak>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field LottieAnimationView$CacheStrategy Strong>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field LottieAnimationView$CacheStrategy[] $VALUES>
		//*  33   64:return          
		}

		private CacheStrategy(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static class SavedState extends android.view.View.BaseSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #61  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #63  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #68  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class LottieAnimationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void LottieAnimationView$SavedState(Parcel, LottieAnimationView$1)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method LottieAnimationView$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
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
			//    2    2:invokevirtual   #30  <Method LottieAnimationView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		String animationName;
		boolean isAnimating;
		boolean isLooping;
		float progress;

		static 
		{
		//    0    0:new             #9   <Class LottieAnimationView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void LottieAnimationView$SavedState$1()>
		//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private SavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void android.view.View$BaseSavedState(Parcel)>
			animationName = parcel.readString();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #36  <Method String Parcel.readString()>
		//    6   10:putfield        #38  <Field String animationName>
			progress = parcel.readFloat();
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:invokevirtual   #42  <Method float Parcel.readFloat()>
		//   10   18:putfield        #44  <Field float progress>
			int i = parcel.readInt();
		//   11   21:aload_1         
		//   12   22:invokevirtual   #48  <Method int Parcel.readInt()>
		//   13   25:istore_2        
			boolean flag1 = false;
		//   14   26:iconst_0        
		//   15   27:istore          4
			boolean flag;
			if(i == 1)
		//*  16   29:iload_2         
		//*  17   30:iconst_1        
		//*  18   31:icmpne          39
				flag = true;
		//   19   34:iconst_1        
		//   20   35:istore_3        
			else
		//*  21   36:goto            41
				flag = false;
		//   22   39:iconst_0        
		//   23   40:istore_3        
			isAnimating = flag;
		//   24   41:aload_0         
		//   25   42:iload_3         
		//   26   43:putfield        #50  <Field boolean isAnimating>
			flag = flag1;
		//   27   46:iload           4
		//   28   48:istore_3        
			if(parcel.readInt() == 1)
		//*  29   49:aload_1         
		//*  30   50:invokevirtual   #48  <Method int Parcel.readInt()>
		//*  31   53:iconst_1        
		//*  32   54:icmpne          59
				flag = true;
		//   33   57:iconst_1        
		//   34   58:istore_3        
			isLooping = flag;
		//   35   59:aload_0         
		//   36   60:iload_3         
		//   37   61:putfield        #52  <Field boolean isLooping>
		//   38   64:return          
		}


		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #57  <Method void android.view.View$BaseSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public LottieAnimationView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #55  <Method void AppCompatImageView(Context, AttributeSet)>
	//    4    6:aload_0         
	//    5    7:new             #6   <Class LottieAnimationView$1>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #58  <Method void LottieAnimationView$1(LottieAnimationView)>
	//    9   15:putfield        #60  <Field OnCompositionLoadedListener loadedListener>
	//   10   18:aload_0         
	//   11   19:new             #62  <Class LottieDrawable>
	//   12   22:dup             
	//   13   23:invokespecial   #63  <Method void LottieDrawable()>
	//   14   26:putfield        #65  <Field LottieDrawable lottieDrawable>
		wasAnimatingWhenDetached = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #67  <Field boolean wasAnimatingWhenDetached>
		autoPlay = false;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #69  <Field boolean autoPlay>
		init(attributeset);
	//   21   39:aload_0         
	//   22   40:aload_2         
	//   23   41:invokespecial   #73  <Method void init(AttributeSet)>
	//   24   44:return          
	}

	private void cancelLoaderTask()
	{
		Cancellable cancellable = compositionLoader;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Cancellable compositionLoader>
	//    2    4:astore_1        
		if(cancellable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			cancellable.cancel();
	//    5    9:aload_1         
	//    6   10:invokeinterface #86  <Method void Cancellable.cancel()>
			compositionLoader = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #77  <Field Cancellable compositionLoader>
		}
	//   10   20:return          
	}

	private void init(AttributeSet attributeset)
	{
		attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, R.styleable.LottieAnimationView)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method Context getContext()>
	//    2    4:aload_1         
	//    3    5:getstatic       #95  <Field int[] R$styleable.LottieAnimationView>
	//    4    8:invokevirtual   #101 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    5   11:astore_1        
		String s = ((TypedArray) (attributeset)).getString(R.styleable.LottieAnimationView_lottie_fileName);
	//    6   12:aload_1         
	//    7   13:getstatic       #105 <Field int R$styleable.LottieAnimationView_lottie_fileName>
	//    8   16:invokevirtual   #111 <Method String TypedArray.getString(int)>
	//    9   19:astore_3        
		if(!isInEditMode() && s != null)
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #115 <Method boolean isInEditMode()>
	//*  12   24:ifne            36
	//*  13   27:aload_3         
	//*  14   28:ifnull          36
			setAnimation(s);
	//   15   31:aload_0         
	//   16   32:aload_3         
	//   17   33:invokevirtual   #119 <Method void setAnimation(String)>
		if(((TypedArray) (attributeset)).getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false))
	//*  18   36:aload_1         
	//*  19   37:getstatic       #122 <Field int R$styleable.LottieAnimationView_lottie_autoPlay>
	//*  20   40:iconst_0        
	//*  21   41:invokevirtual   #126 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  22   44:ifeq            59
		{
			lottieDrawable.playAnimation();
	//   23   47:aload_0         
	//   24   48:getfield        #65  <Field LottieDrawable lottieDrawable>
	//   25   51:invokevirtual   #129 <Method void LottieDrawable.playAnimation()>
			autoPlay = true;
	//   26   54:aload_0         
	//   27   55:iconst_1        
	//   28   56:putfield        #69  <Field boolean autoPlay>
		}
		lottieDrawable.loop(((TypedArray) (attributeset)).getBoolean(R.styleable.LottieAnimationView_lottie_loop, false));
	//   29   59:aload_0         
	//   30   60:getfield        #65  <Field LottieDrawable lottieDrawable>
	//   31   63:aload_1         
	//   32   64:getstatic       #132 <Field int R$styleable.LottieAnimationView_lottie_loop>
	//   33   67:iconst_0        
	//   34   68:invokevirtual   #126 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   35   71:invokevirtual   #136 <Method void LottieDrawable.loop(boolean)>
		setImageAssetsFolder(((TypedArray) (attributeset)).getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:getstatic       #139 <Field int R$styleable.LottieAnimationView_lottie_imageAssetsFolder>
	//   39   79:invokevirtual   #111 <Method String TypedArray.getString(int)>
	//   40   82:invokevirtual   #142 <Method void setImageAssetsFolder(String)>
		setProgress(((TypedArray) (attributeset)).getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0F));
	//   41   85:aload_0         
	//   42   86:aload_1         
	//   43   87:getstatic       #145 <Field int R$styleable.LottieAnimationView_lottie_progress>
	//   44   90:fconst_0        
	//   45   91:invokevirtual   #149 <Method float TypedArray.getFloat(int, float)>
	//   46   94:invokevirtual   #153 <Method void setProgress(float)>
		enableMergePathsForKitKatAndAbove(((TypedArray) (attributeset)).getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:getstatic       #156 <Field int R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove>
	//   50  102:iconst_0        
	//   51  103:invokevirtual   #126 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   52  106:invokevirtual   #159 <Method void enableMergePathsForKitKatAndAbove(boolean)>
		int i = ((TypedArray) (attributeset)).getInt(R.styleable.LottieAnimationView_lottie_cacheStrategy, CacheStrategy.None.ordinal());
	//   53  109:aload_1         
	//   54  110:getstatic       #162 <Field int R$styleable.LottieAnimationView_lottie_cacheStrategy>
	//   55  113:getstatic       #165 <Field LottieAnimationView$CacheStrategy LottieAnimationView$CacheStrategy.None>
	//   56  116:invokevirtual   #169 <Method int LottieAnimationView$CacheStrategy.ordinal()>
	//   57  119:invokevirtual   #173 <Method int TypedArray.getInt(int, int)>
	//   58  122:istore_2        
		defaultCacheStrategy = CacheStrategy.values()[i];
	//   59  123:aload_0         
	//   60  124:invokestatic    #177 <Method LottieAnimationView$CacheStrategy[] LottieAnimationView$CacheStrategy.values()>
	//   61  127:iload_2         
	//   62  128:aaload          
	//   63  129:putfield        #179 <Field LottieAnimationView$CacheStrategy defaultCacheStrategy>
		((TypedArray) (attributeset)).recycle();
	//   64  132:aload_1         
	//   65  133:invokevirtual   #182 <Method void TypedArray.recycle()>
		setLayerType(1, ((android.graphics.Paint) (null)));
	//   66  136:aload_0         
	//   67  137:iconst_1        
	//   68  138:aconst_null     
	//   69  139:invokevirtual   #186 <Method void setLayerType(int, android.graphics.Paint)>
		if(android.os.Build.VERSION.SDK_INT >= 17 && android.provider.Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0F) == 0.0F)
	//*  70  142:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*  71  145:bipush          17
	//*  72  147:icmplt          175
	//*  73  150:aload_0         
	//*  74  151:invokevirtual   #90  <Method Context getContext()>
	//*  75  154:invokevirtual   #195 <Method android.content.ContentResolver Context.getContentResolver()>
	//*  76  157:ldc1            #197 <String "animator_duration_scale">
	//*  77  159:fconst_1        
	//*  78  160:invokestatic    #202 <Method float android.provider.Settings$Global.getFloat(android.content.ContentResolver, String, float)>
	//*  79  163:fconst_0        
	//*  80  164:fcmpl           
	//*  81  165:ifne            175
			lottieDrawable.systemAnimationsAreDisabled();
	//   82  168:aload_0         
	//   83  169:getfield        #65  <Field LottieDrawable lottieDrawable>
	//   84  172:invokevirtual   #205 <Method void LottieDrawable.systemAnimationsAreDisabled()>
	//   85  175:return          
	}

	public void addAnimatorListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		lottieDrawable.addAnimatorListener(animatorlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #210 <Method void LottieDrawable.addAnimatorListener(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	public void cancelAnimation()
	{
		lottieDrawable.cancelAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:invokevirtual   #213 <Method void LottieDrawable.cancelAnimation()>
	//    3    7:return          
	}

	public void enableMergePathsForKitKatAndAbove(boolean flag)
	{
		lottieDrawable.enableMergePathsForKitKatAndAbove(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #214 <Method void LottieDrawable.enableMergePathsForKitKatAndAbove(boolean)>
	//    4    8:return          
	}

	public long getDuration()
	{
		LottieComposition lottiecomposition = composition;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field LottieComposition composition>
	//    2    4:astore_1        
		if(lottiecomposition != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return lottiecomposition.getDuration();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #222 <Method long LottieComposition.getDuration()>
	//    7   13:lreturn         
		else
			return 0L;
	//    8   14:lconst_0        
	//    9   15:lreturn         
	}

	public float getProgress()
	{
		return lottieDrawable.getProgress();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:invokevirtual   #233 <Method float LottieDrawable.getProgress()>
	//    3    7:freturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		Drawable drawable1 = getDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #241 <Method Drawable getDrawable()>
	//    2    4:astore_2        
		LottieDrawable lottiedrawable = lottieDrawable;
	//    3    5:aload_0         
	//    4    6:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    5    9:astore_3        
		if(drawable1 == lottiedrawable)
	//*   6   10:aload_2         
	//*   7   11:aload_3         
	//*   8   12:if_acmpne       21
		{
			super.invalidateDrawable(((Drawable) (lottiedrawable)));
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:invokespecial   #243 <Method void AppCompatImageView.invalidateDrawable(Drawable)>
			return;
	//   12   20:return          
		} else
		{
			super.invalidateDrawable(drawable);
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokespecial   #243 <Method void AppCompatImageView.invalidateDrawable(Drawable)>
			return;
	//   16   26:return          
		}
	}

	public boolean isAnimating()
	{
		return lottieDrawable.isAnimating();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:invokevirtual   #246 <Method boolean LottieDrawable.isAnimating()>
	//    3    7:ireturn         
	}

	public void loop(boolean flag)
	{
		lottieDrawable.loop(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #136 <Method void LottieDrawable.loop(boolean)>
	//    4    8:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #249 <Method void AppCompatImageView.onAttachedToWindow()>
		if(autoPlay && wasAnimatingWhenDetached)
	//*   2    4:aload_0         
	//*   3    5:getfield        #69  <Field boolean autoPlay>
	//*   4    8:ifeq            22
	//*   5   11:aload_0         
	//*   6   12:getfield        #67  <Field boolean wasAnimatingWhenDetached>
	//*   7   15:ifeq            22
			playAnimation();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #250 <Method void playAnimation()>
	//   10   22:return          
	}

	protected void onDetachedFromWindow()
	{
		if(isAnimating())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #252 <Method boolean isAnimating()>
	//*   2    4:ifeq            16
		{
			cancelAnimation();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #253 <Method void cancelAnimation()>
			wasAnimatingWhenDetached = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #67  <Field boolean wasAnimatingWhenDetached>
		}
		recycleBitmaps();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #256 <Method void recycleBitmaps()>
		super.onDetachedFromWindow();
	//   10   20:aload_0         
	//   11   21:invokespecial   #258 <Method void AppCompatImageView.onDetachedFromWindow()>
	//   12   24:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #13  <Class LottieAnimationView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #262 <Method void AppCompatImageView.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #13  <Class LottieAnimationView$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #266 <Method Parcelable LottieAnimationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #262 <Method void AppCompatImageView.onRestoreInstanceState(Parcelable)>
		animationName = ((SavedState) (parcelable)).animationName;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #268 <Field String LottieAnimationView$SavedState.animationName>
	//   17   31:putfield        #269 <Field String animationName>
		if(!TextUtils.isEmpty(((CharSequence) (animationName))))
	//*  18   34:aload_0         
	//*  19   35:getfield        #269 <Field String animationName>
	//*  20   38:invokestatic    #275 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   41:ifne            52
			setAnimation(animationName);
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #269 <Field String animationName>
	//   25   49:invokevirtual   #119 <Method void setAnimation(String)>
		setProgress(((SavedState) (parcelable)).progress);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #279 <Field float LottieAnimationView$SavedState.progress>
	//   29   57:invokevirtual   #153 <Method void setProgress(float)>
		loop(((SavedState) (parcelable)).isLooping);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #282 <Field boolean LottieAnimationView$SavedState.isLooping>
	//   33   65:invokevirtual   #283 <Method void loop(boolean)>
		if(((SavedState) (parcelable)).isAnimating)
	//*  34   68:aload_1         
	//*  35   69:getfield        #285 <Field boolean LottieAnimationView$SavedState.isAnimating>
	//*  36   72:ifeq            79
			playAnimation();
	//   37   75:aload_0         
	//   38   76:invokevirtual   #250 <Method void playAnimation()>
	//   39   79:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #13  <Class LottieAnimationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #288 <Method Parcelable AppCompatImageView.onSaveInstanceState()>
	//    4    8:invokespecial   #290 <Method void LottieAnimationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.animationName = animationName;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #269 <Field String animationName>
	//    9   17:putfield        #268 <Field String LottieAnimationView$SavedState.animationName>
		savedstate.progress = lottieDrawable.getProgress();
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #65  <Field LottieDrawable lottieDrawable>
	//   13   25:invokevirtual   #233 <Method float LottieDrawable.getProgress()>
	//   14   28:putfield        #279 <Field float LottieAnimationView$SavedState.progress>
		savedstate.isAnimating = lottieDrawable.isAnimating();
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #65  <Field LottieDrawable lottieDrawable>
	//   18   36:invokevirtual   #246 <Method boolean LottieDrawable.isAnimating()>
	//   19   39:putfield        #285 <Field boolean LottieAnimationView$SavedState.isAnimating>
		savedstate.isLooping = lottieDrawable.isLooping();
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:getfield        #65  <Field LottieDrawable lottieDrawable>
	//   23   47:invokevirtual   #292 <Method boolean LottieDrawable.isLooping()>
	//   24   50:putfield        #282 <Field boolean LottieAnimationView$SavedState.isLooping>
		return ((Parcelable) (savedstate));
	//   25   53:aload_1         
	//   26   54:areturn         
	}

	public void playAnimation()
	{
		lottieDrawable.playAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:invokevirtual   #129 <Method void LottieDrawable.playAnimation()>
	//    3    7:return          
	}

	void recycleBitmaps()
	{
		LottieDrawable lottiedrawable = lottieDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:astore_1        
		if(lottiedrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			lottiedrawable.recycleBitmaps();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #294 <Method void LottieDrawable.recycleBitmaps()>
	//    7   13:return          
	}

	public void removeAnimatorListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		lottieDrawable.removeAnimatorListener(animatorlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #297 <Method void LottieDrawable.removeAnimatorListener(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	public void setAnimation(String s)
	{
		setAnimation(s, defaultCacheStrategy);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #179 <Field LottieAnimationView$CacheStrategy defaultCacheStrategy>
	//    4    6:invokevirtual   #300 <Method void setAnimation(String, LottieAnimationView$CacheStrategy)>
	//    5    9:return          
	}

	public void setAnimation(final String animationName, final CacheStrategy cacheStrategy)
	{
		this.animationName = animationName;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #269 <Field String animationName>
		if(weakRefCache.containsKey(((Object) (animationName))))
	//*   3    5:getstatic       #51  <Field Map weakRefCache>
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #306 <Method boolean Map.containsKey(Object)>
	//*   6   14:ifeq            49
		{
			WeakReference weakreference = (WeakReference)weakRefCache.get(((Object) (animationName)));
	//    7   17:getstatic       #51  <Field Map weakRefCache>
	//    8   20:aload_1         
	//    9   21:invokeinterface #310 <Method Object Map.get(Object)>
	//   10   26:checkcast       #312 <Class WeakReference>
	//   11   29:astore_3        
			if(weakreference.get() != null)
	//*  12   30:aload_3         
	//*  13   31:invokevirtual   #315 <Method Object WeakReference.get()>
	//*  14   34:ifnull          78
			{
				setComposition((LottieComposition)weakreference.get());
	//   15   37:aload_0         
	//   16   38:aload_3         
	//   17   39:invokevirtual   #315 <Method Object WeakReference.get()>
	//   18   42:checkcast       #220 <Class LottieComposition>
	//   19   45:invokevirtual   #319 <Method void setComposition(LottieComposition)>
				return;
	//   20   48:return          
			}
		} else
		if(strongRefCache.containsKey(((Object) (animationName))))
	//*  21   49:getstatic       #49  <Field Map strongRefCache>
	//*  22   52:aload_1         
	//*  23   53:invokeinterface #306 <Method boolean Map.containsKey(Object)>
	//*  24   58:ifeq            78
		{
			setComposition((LottieComposition)strongRefCache.get(((Object) (animationName))));
	//   25   61:aload_0         
	//   26   62:getstatic       #49  <Field Map strongRefCache>
	//   27   65:aload_1         
	//   28   66:invokeinterface #310 <Method Object Map.get(Object)>
	//   29   71:checkcast       #220 <Class LottieComposition>
	//   30   74:invokevirtual   #319 <Method void setComposition(LottieComposition)>
			return;
	//   31   77:return          
		}
		this.animationName = animationName;
	//   32   78:aload_0         
	//   33   79:aload_1         
	//   34   80:putfield        #269 <Field String animationName>
		lottieDrawable.cancelAnimation();
	//   35   83:aload_0         
	//   36   84:getfield        #65  <Field LottieDrawable lottieDrawable>
	//   37   87:invokevirtual   #213 <Method void LottieDrawable.cancelAnimation()>
		cancelLoaderTask();
	//   38   90:aload_0         
	//   39   91:invokespecial   #321 <Method void cancelLoaderTask()>
		compositionLoader = LottieComposition.Factory.fromAssetFileName(getContext(), animationName, new OnCompositionLoadedListener() {

			public void onCompositionLoaded(LottieComposition lottiecomposition)
			{
				if(cacheStrategy == CacheStrategy.Strong)
			//*   0    0:aload_0         
			//*   1    1:getfield        #23  <Field LottieAnimationView$CacheStrategy val$cacheStrategy>
			//*   2    4:getstatic       #36  <Field LottieAnimationView$CacheStrategy LottieAnimationView$CacheStrategy.Strong>
			//*   3    7:if_acmpne       27
					LottieAnimationView.strongRefCache.put(((Object) (animationName)), ((Object) (lottiecomposition)));
			//    4   10:invokestatic    #40  <Method Map LottieAnimationView.access$100()>
			//    5   13:aload_0         
			//    6   14:getfield        #25  <Field String val$animationName>
			//    7   17:aload_1         
			//    8   18:invokeinterface #46  <Method Object Map.put(Object, Object)>
			//    9   23:pop             
				else
			//*  10   24:goto            58
				if(cacheStrategy == CacheStrategy.Weak)
			//*  11   27:aload_0         
			//*  12   28:getfield        #23  <Field LottieAnimationView$CacheStrategy val$cacheStrategy>
			//*  13   31:getstatic       #49  <Field LottieAnimationView$CacheStrategy LottieAnimationView$CacheStrategy.Weak>
			//*  14   34:if_acmpne       58
					LottieAnimationView.weakRefCache.put(((Object) (animationName)), ((Object) (new WeakReference(((Object) (lottiecomposition))))));
			//   15   37:invokestatic    #52  <Method Map LottieAnimationView.access$200()>
			//   16   40:aload_0         
			//   17   41:getfield        #25  <Field String val$animationName>
			//   18   44:new             #54  <Class WeakReference>
			//   19   47:dup             
			//   20   48:aload_1         
			//   21   49:invokespecial   #57  <Method void WeakReference(Object)>
			//   22   52:invokeinterface #46  <Method Object Map.put(Object, Object)>
			//   23   57:pop             
				setComposition(lottiecomposition);
			//   24   58:aload_0         
			//   25   59:getfield        #21  <Field LottieAnimationView this$0>
			//   26   62:aload_1         
			//   27   63:invokevirtual   #60  <Method void LottieAnimationView.setComposition(LottieComposition)>
			//   28   66:return          
			}

			final LottieAnimationView this$0;
			final String val$animationName;
			final CacheStrategy val$cacheStrategy;

			
			{
				this$0 = LottieAnimationView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field LottieAnimationView this$0>
				cacheStrategy = cachestrategy;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field LottieAnimationView$CacheStrategy val$cacheStrategy>
				animationName = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$animationName>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   40   94:aload_0         
	//   41   95:aload_0         
	//   42   96:invokevirtual   #90  <Method Context getContext()>
	//   43   99:aload_1         
	//   44  100:new             #8   <Class LottieAnimationView$2>
	//   45  103:dup             
	//   46  104:aload_0         
	//   47  105:aload_2         
	//   48  106:aload_1         
	//   49  107:invokespecial   #324 <Method void LottieAnimationView$2(LottieAnimationView, LottieAnimationView$CacheStrategy, String)>
	//   50  110:invokestatic    #330 <Method Cancellable LottieComposition$Factory.fromAssetFileName(Context, String, OnCompositionLoadedListener)>
	//   51  113:putfield        #77  <Field Cancellable compositionLoader>
	//   52  116:return          
	}

	public void setAnimation(JSONObject jsonobject)
	{
		cancelLoaderTask();
	//    0    0:aload_0         
	//    1    1:invokespecial   #321 <Method void cancelLoaderTask()>
		compositionLoader = LottieComposition.Factory.fromJson(getResources(), jsonobject, loadedListener);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #335 <Method android.content.res.Resources getResources()>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #60  <Field OnCompositionLoadedListener loadedListener>
	//    8   14:invokestatic    #339 <Method Cancellable LottieComposition$Factory.fromJson(android.content.res.Resources, JSONObject, OnCompositionLoadedListener)>
	//    9   17:putfield        #77  <Field Cancellable compositionLoader>
	//   10   20:return          
	}

	public void setComposition(LottieComposition lottiecomposition)
	{
		lottieDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #343 <Method void LottieDrawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		if(!lottieDrawable.setComposition(lottiecomposition))
	//*   4    8:aload_0         
	//*   5    9:getfield        #65  <Field LottieDrawable lottieDrawable>
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #346 <Method boolean LottieDrawable.setComposition(LottieComposition)>
	//*   8   16:ifne            20
			return;
	//    9   19:return          
		int i = Utils.getScreenWidth(getContext());
	//   10   20:aload_0         
	//   11   21:invokevirtual   #90  <Method Context getContext()>
	//   12   24:invokestatic    #352 <Method int Utils.getScreenWidth(Context)>
	//   13   27:istore_2        
		int j = Utils.getScreenHeight(getContext());
	//   14   28:aload_0         
	//   15   29:invokevirtual   #90  <Method Context getContext()>
	//   16   32:invokestatic    #355 <Method int Utils.getScreenHeight(Context)>
	//   17   35:istore_3        
		int k = lottiecomposition.getBounds().width();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #359 <Method Rect LottieComposition.getBounds()>
	//   20   40:invokevirtual   #364 <Method int Rect.width()>
	//   21   43:istore          4
		int l = lottiecomposition.getBounds().height();
	//   22   45:aload_1         
	//   23   46:invokevirtual   #359 <Method Rect LottieComposition.getBounds()>
	//   24   49:invokevirtual   #367 <Method int Rect.height()>
	//   25   52:istore          5
		if(k > i || l > j)
	//*  26   54:iload           4
	//*  27   56:iload_2         
	//*  28   57:icmpgt          66
	//*  29   60:iload           5
	//*  30   62:iload_3         
	//*  31   63:icmple          132
		{
			setScale(Math.min((float)i / (float)k, (float)j / (float)l));
	//   32   66:aload_0         
	//   33   67:iload_2         
	//   34   68:i2f             
	//   35   69:iload           4
	//   36   71:i2f             
	//   37   72:fdiv            
	//   38   73:iload_3         
	//   39   74:i2f             
	//   40   75:iload           5
	//   41   77:i2f             
	//   42   78:fdiv            
	//   43   79:invokestatic    #373 <Method float Math.min(float, float)>
	//   44   82:invokevirtual   #376 <Method void setScale(float)>
			Log.w("LOTTIE", String.format("Composition larger than the screen %dx%d vs %dx%d. Scaling down.", new Object[] {
				Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i), Integer.valueOf(j)
			}));
	//   45   85:ldc2            #378 <String "LOTTIE">
	//   46   88:ldc2            #380 <String "Composition larger than the screen %dx%d vs %dx%d. Scaling down.">
	//   47   91:iconst_4        
	//   48   92:anewarray       Object[]
	//   49   95:dup             
	//   50   96:iconst_0        
	//   51   97:iload           4
	//   52   99:invokestatic    #388 <Method Integer Integer.valueOf(int)>
	//   53  102:aastore         
	//   54  103:dup             
	//   55  104:iconst_1        
	//   56  105:iload           5
	//   57  107:invokestatic    #388 <Method Integer Integer.valueOf(int)>
	//   58  110:aastore         
	//   59  111:dup             
	//   60  112:iconst_2        
	//   61  113:iload_2         
	//   62  114:invokestatic    #388 <Method Integer Integer.valueOf(int)>
	//   63  117:aastore         
	//   64  118:dup             
	//   65  119:iconst_3        
	//   66  120:iload_3         
	//   67  121:invokestatic    #388 <Method Integer Integer.valueOf(int)>
	//   68  124:aastore         
	//   69  125:invokestatic    #394 <Method String String.format(String, Object[])>
	//   70  128:invokestatic    #400 <Method int Log.w(String, String)>
	//   71  131:pop             
		}
		setImageDrawable(((Drawable) (null)));
	//   72  132:aload_0         
	//   73  133:aconst_null     
	//   74  134:invokevirtual   #403 <Method void setImageDrawable(Drawable)>
		setImageDrawable(((Drawable) (lottieDrawable)));
	//   75  137:aload_0         
	//   76  138:aload_0         
	//   77  139:getfield        #65  <Field LottieDrawable lottieDrawable>
	//   78  142:invokevirtual   #403 <Method void setImageDrawable(Drawable)>
		composition = lottiecomposition;
	//   79  145:aload_0         
	//   80  146:aload_1         
	//   81  147:putfield        #218 <Field LottieComposition composition>
		requestLayout();
	//   82  150:aload_0         
	//   83  151:invokevirtual   #406 <Method void requestLayout()>
	//   84  154:return          
	}

	public void setImageAssetDelegate(ImageAssetDelegate imageassetdelegate)
	{
		lottieDrawable.setImageAssetDelegate(imageassetdelegate);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #410 <Method void LottieDrawable.setImageAssetDelegate(ImageAssetDelegate)>
	//    4    8:return          
	}

	public void setImageAssetsFolder(String s)
	{
		lottieDrawable.setImagesAssetsFolder(s);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #413 <Method void LottieDrawable.setImagesAssetsFolder(String)>
	//    4    8:return          
	}

	public void setImageDrawable(Drawable drawable)
	{
		if(drawable != lottieDrawable)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #65  <Field LottieDrawable lottieDrawable>
	//*   3    5:if_acmpeq       12
			recycleBitmaps();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #256 <Method void recycleBitmaps()>
		super.setImageDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #414 <Method void AppCompatImageView.setImageDrawable(Drawable)>
	//    9   17:return          
	}

	public void setImageResource(int i)
	{
		super.setImageResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #418 <Method void AppCompatImageView.setImageResource(int)>
		recycleBitmaps();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #256 <Method void recycleBitmaps()>
	//    5    9:return          
	}

	public void setProgress(float f)
	{
		lottieDrawable.setProgress(f);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #419 <Method void LottieDrawable.setProgress(float)>
	//    4    8:return          
	}

	void setScale(float f)
	{
		lottieDrawable.setScale(f);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #420 <Method void LottieDrawable.setScale(float)>
		if(getDrawable() == lottieDrawable)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #241 <Method Drawable getDrawable()>
	//*   6   12:aload_0         
	//*   7   13:getfield        #65  <Field LottieDrawable lottieDrawable>
	//*   8   16:if_acmpne       32
		{
			setImageDrawable(((Drawable) (null)));
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:invokevirtual   #403 <Method void setImageDrawable(Drawable)>
			setImageDrawable(((Drawable) (lottieDrawable)));
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #65  <Field LottieDrawable lottieDrawable>
	//   15   29:invokevirtual   #403 <Method void setImageDrawable(Drawable)>
		}
	//   16   32:return          
	}

	public void setSpeed(float f)
	{
		lottieDrawable.setSpeed(f);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LottieDrawable lottieDrawable>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #423 <Method void LottieDrawable.setSpeed(float)>
	//    4    8:return          
	}

	private static final String TAG = "LottieAnimationView";
	private static final Map strongRefCache = new HashMap();
	private static final Map weakRefCache = new HashMap();
	private String animationName;
	private boolean autoPlay;
	private LottieComposition composition;
	private Cancellable compositionLoader;
	private CacheStrategy defaultCacheStrategy;
	private final OnCompositionLoadedListener loadedListener = new OnCompositionLoadedListener() {

		public void onCompositionLoaded(LottieComposition lottiecomposition)
		{
			setComposition(lottiecomposition);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field LottieAnimationView this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #23  <Method void LottieAnimationView.setComposition(LottieComposition)>
			compositionLoader = null;
		//    4    8:aload_0         
		//    5    9:getfield        #14  <Field LottieAnimationView this$0>
		//    6   12:aconst_null     
		//    7   13:invokestatic    #27  <Method Cancellable LottieAnimationView.access$002(LottieAnimationView, Cancellable)>
		//    8   16:pop             
		//    9   17:return          
		}

		final LottieAnimationView this$0;

			
			{
				this$0 = LottieAnimationView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field LottieAnimationView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final LottieDrawable lottieDrawable = new LottieDrawable();
	private boolean wasAnimatingWhenDetached;

	static 
	{
	//    0    0:new             #44  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void HashMap()>
	//    3    7:putstatic       #49  <Field Map strongRefCache>
	//    4   10:new             #44  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #47  <Method void HashMap()>
	//    7   17:putstatic       #51  <Field Map weakRefCache>
	//*   8   20:return          
	}


/*
	static Cancellable access$002(LottieAnimationView lottieanimationview, Cancellable cancellable)
	{
		lottieanimationview.compositionLoader = cancellable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field Cancellable compositionLoader>
		return cancellable;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Map access$100()
	{
		return strongRefCache;
	//    0    0:getstatic       #49  <Field Map strongRefCache>
	//    1    3:areturn         
	}

*/


/*
	static Map access$200()
	{
		return weakRefCache;
	//    0    0:getstatic       #51  <Field Map weakRefCache>
	//    1    3:areturn         
	}

*/
}
