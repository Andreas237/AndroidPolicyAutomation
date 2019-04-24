// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.*;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.*;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.*;
import android.text.*;
import android.text.method.PasswordTransformationMethod;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.*;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			CollapsingTextHelper, ThemeUtils, AnimationUtils, ViewUtils, 
//			CheckableImageButton, DrawableUtils, TextInputEditText

public class TextInputLayout extends LinearLayout
	implements WithHint
{
	static class SavedState extends AbsSavedState
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #57  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("TextInputLayout.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #60  <String "TextInputLayout.SavedState{">
		//    6   11:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #70  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #76  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" error=");
		//   14   27:aload_1         
		//   15   28:ldc1            #78  <String " error=">
		//   16   30:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(((Object) (error)));
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #42  <Field CharSequence error>
		//   21   39:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #83  <String "}">
		//   25   46:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #85  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #89  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #91  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #96  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class TextInputLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void TextInputLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class TextInputLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void TextInputLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method TextInputLayout$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method TextInputLayout$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #34  <Method TextInputLayout$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		CharSequence error;
		boolean isPasswordToggledVisible;

		static 
		{
		//    0    0:new             #9   <Class TextInputLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void TextInputLayout$SavedState$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void AbsSavedState(Parcel, ClassLoader)>
			error = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
		//    4    6:aload_0         
		//    5    7:getstatic       #32  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//    6   10:aload_1         
		//    7   11:invokeinterface #38  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    8   16:checkcast       #40  <Class CharSequence>
		//    9   19:putfield        #42  <Field CharSequence error>
			int i = parcel.readInt();
		//   10   22:aload_1         
		//   11   23:invokevirtual   #48  <Method int Parcel.readInt()>
		//   12   26:istore_3        
			boolean flag = true;
		//   13   27:iconst_1        
		//   14   28:istore          4
			if(i != 1)
		//*  15   30:iload_3         
		//*  16   31:iconst_1        
		//*  17   32:icmpne          38
		//*  18   35:goto            41
				flag = false;
		//   19   38:iconst_0        
		//   20   39:istore          4
			isPasswordToggledVisible = flag;
		//   21   41:aload_0         
		//   22   42:iload           4
		//   23   44:putfield        #50  <Field boolean isPasswordToggledVisible>
		//   24   47:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #53  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	private class TextInputAccessibilityDelegate extends AccessibilityDelegateCompat
	{

		public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/design/widget/TextInputLayout)).getSimpleName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class TextInputLayout>
		//    6    9:invokevirtual   #27  <Method String Class.getSimpleName()>
		//    7   12:invokevirtual   #33  <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    8   15:return          
		}

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #37  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/design/widget/TextInputLayout)).getSimpleName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class TextInputLayout>
		//    6    9:invokevirtual   #27  <Method String Class.getSimpleName()>
		//    7   12:invokevirtual   #40  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			view = ((View) (mCollapsingTextHelper.getText()));
		//    8   15:aload_0         
		//    9   16:getfield        #13  <Field TextInputLayout this$0>
		//   10   19:getfield        #44  <Field CollapsingTextHelper TextInputLayout.mCollapsingTextHelper>
		//   11   22:invokevirtual   #50  <Method CharSequence CollapsingTextHelper.getText()>
		//   12   25:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (view))))
		//*  13   26:aload_1         
		//*  14   27:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  15   30:ifne            38
				accessibilitynodeinfocompat.setText(((CharSequence) (view)));
		//   16   33:aload_2         
		//   17   34:aload_1         
		//   18   35:invokevirtual   #59  <Method void AccessibilityNodeInfoCompat.setText(CharSequence)>
			if(mEditText != null)
		//*  19   38:aload_0         
		//*  20   39:getfield        #13  <Field TextInputLayout this$0>
		//*  21   42:getfield        #63  <Field EditText TextInputLayout.mEditText>
		//*  22   45:ifnull          59
				accessibilitynodeinfocompat.setLabelFor(((View) (mEditText)));
		//   23   48:aload_2         
		//   24   49:aload_0         
		//   25   50:getfield        #13  <Field TextInputLayout this$0>
		//   26   53:getfield        #63  <Field EditText TextInputLayout.mEditText>
		//   27   56:invokevirtual   #67  <Method void AccessibilityNodeInfoCompat.setLabelFor(View)>
			if(mErrorView != null)
		//*  28   59:aload_0         
		//*  29   60:getfield        #13  <Field TextInputLayout this$0>
		//*  30   63:getfield        #71  <Field TextView TextInputLayout.mErrorView>
		//*  31   66:ifnull          83
				view = ((View) (mErrorView.getText()));
		//   32   69:aload_0         
		//   33   70:getfield        #13  <Field TextInputLayout this$0>
		//   34   73:getfield        #71  <Field TextView TextInputLayout.mErrorView>
		//   35   76:invokevirtual   #74  <Method CharSequence TextView.getText()>
		//   36   79:astore_1        
			else
		//*  37   80:goto            85
				view = null;
		//   38   83:aconst_null     
		//   39   84:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (view))))
		//*  40   85:aload_1         
		//*  41   86:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  42   89:ifne            102
			{
				accessibilitynodeinfocompat.setContentInvalid(true);
		//   43   92:aload_2         
		//   44   93:iconst_1        
		//   45   94:invokevirtual   #78  <Method void AccessibilityNodeInfoCompat.setContentInvalid(boolean)>
				accessibilitynodeinfocompat.setError(((CharSequence) (view)));
		//   46   97:aload_2         
		//   47   98:aload_1         
		//   48   99:invokevirtual   #81  <Method void AccessibilityNodeInfoCompat.setError(CharSequence)>
			}
		//   49  102:return          
		}

		public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			super.onPopulateAccessibilityEvent(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #84  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
			view = ((View) (mCollapsingTextHelper.getText()));
		//    4    6:aload_0         
		//    5    7:getfield        #13  <Field TextInputLayout this$0>
		//    6   10:getfield        #44  <Field CollapsingTextHelper TextInputLayout.mCollapsingTextHelper>
		//    7   13:invokevirtual   #50  <Method CharSequence CollapsingTextHelper.getText()>
		//    8   16:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (view))))
		//*   9   17:aload_1         
		//*  10   18:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  11   21:ifne            35
				accessibilityevent.getText().add(((Object) (view)));
		//   12   24:aload_2         
		//   13   25:invokevirtual   #87  <Method List AccessibilityEvent.getText()>
		//   14   28:aload_1         
		//   15   29:invokeinterface #93  <Method boolean List.add(Object)>
		//   16   34:pop             
		//   17   35:return          
		}

		final TextInputLayout this$0;

		TextInputAccessibilityDelegate()
		{
			this$0 = TextInputLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field TextInputLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void AccessibilityDelegateCompat()>
		//    5    9:return          
		}
	}


	public TextInputLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #94  <Method void TextInputLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #98  <Method void TextInputLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #99  <Method void LinearLayout(Context, AttributeSet)>
		mTmpRect = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #101 <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #104 <Method void Rect()>
	//    8   14:putfield        #106 <Field Rect mTmpRect>
		mCollapsingTextHelper = new CollapsingTextHelper(((View) (this)));
	//    9   17:aload_0         
	//   10   18:new             #108 <Class CollapsingTextHelper>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #111 <Method void CollapsingTextHelper(View)>
	//   14   26:putfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
		ThemeUtils.checkAppCompatTheme(context);
	//   15   29:aload_1         
	//   16   30:invokestatic    #118 <Method void ThemeUtils.checkAppCompatTheme(Context)>
		setOrientation(1);
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #122 <Method void setOrientation(int)>
		setWillNotDraw(false);
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #126 <Method void setWillNotDraw(boolean)>
		setAddStatesFromChildren(true);
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:invokevirtual   #129 <Method void setAddStatesFromChildren(boolean)>
		mInputFrame = new FrameLayout(context);
	//   26   48:aload_0         
	//   27   49:new             #131 <Class FrameLayout>
	//   28   52:dup             
	//   29   53:aload_1         
	//   30   54:invokespecial   #133 <Method void FrameLayout(Context)>
	//   31   57:putfield        #135 <Field FrameLayout mInputFrame>
		mInputFrame.setAddStatesFromChildren(true);
	//   32   60:aload_0         
	//   33   61:getfield        #135 <Field FrameLayout mInputFrame>
	//   34   64:iconst_1        
	//   35   65:invokevirtual   #136 <Method void FrameLayout.setAddStatesFromChildren(boolean)>
		addView(((View) (mInputFrame)));
	//   36   68:aload_0         
	//   37   69:aload_0         
	//   38   70:getfield        #135 <Field FrameLayout mInputFrame>
	//   39   73:invokevirtual   #139 <Method void addView(View)>
		mCollapsingTextHelper.setTextSizeInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
	//   40   76:aload_0         
	//   41   77:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   42   80:getstatic       #145 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   43   83:invokevirtual   #149 <Method void CollapsingTextHelper.setTextSizeInterpolator(android.view.animation.Interpolator)>
		mCollapsingTextHelper.setPositionInterpolator(((android.view.animation.Interpolator) (new AccelerateInterpolator())));
	//   44   86:aload_0         
	//   45   87:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   46   90:new             #151 <Class AccelerateInterpolator>
	//   47   93:dup             
	//   48   94:invokespecial   #152 <Method void AccelerateInterpolator()>
	//   49   97:invokevirtual   #155 <Method void CollapsingTextHelper.setPositionInterpolator(android.view.animation.Interpolator)>
		mCollapsingTextHelper.setCollapsedTextGravity(0x800033);
	//   50  100:aload_0         
	//   51  101:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   52  104:ldc1            #156 <Int 0x800033>
	//   53  106:invokevirtual   #159 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.TextInputLayout, i, android.support.design.R.style.Widget_Design_TextInputLayout)));
	//   54  109:aload_1         
	//   55  110:aload_2         
	//   56  111:getstatic       #164 <Field int[] android.support.design.R$styleable.TextInputLayout>
	//   57  114:iload_3         
	//   58  115:getstatic       #169 <Field int android.support.design.R$style.Widget_Design_TextInputLayout>
	//   59  118:invokestatic    #175 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   60  121:astore_1        
		mHintEnabled = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_hintEnabled, true);
	//   61  122:aload_0         
	//   62  123:aload_1         
	//   63  124:getstatic       #178 <Field int android.support.design.R$styleable.TextInputLayout_hintEnabled>
	//   64  127:iconst_1        
	//   65  128:invokevirtual   #182 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   66  131:putfield        #184 <Field boolean mHintEnabled>
		setHint(((TintTypedArray) (context)).getText(android.support.design.R.styleable.TextInputLayout_android_hint));
	//   67  134:aload_0         
	//   68  135:aload_1         
	//   69  136:getstatic       #187 <Field int android.support.design.R$styleable.TextInputLayout_android_hint>
	//   70  139:invokevirtual   #191 <Method CharSequence TintTypedArray.getText(int)>
	//   71  142:invokevirtual   #195 <Method void setHint(CharSequence)>
		mHintAnimationEnabled = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_hintAnimationEnabled, true);
	//   72  145:aload_0         
	//   73  146:aload_1         
	//   74  147:getstatic       #198 <Field int android.support.design.R$styleable.TextInputLayout_hintAnimationEnabled>
	//   75  150:iconst_1        
	//   76  151:invokevirtual   #182 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   77  154:putfield        #200 <Field boolean mHintAnimationEnabled>
		if(((TintTypedArray) (context)).hasValue(android.support.design.R.styleable.TextInputLayout_android_textColorHint))
	//*  78  157:aload_1         
	//*  79  158:getstatic       #203 <Field int android.support.design.R$styleable.TextInputLayout_android_textColorHint>
	//*  80  161:invokevirtual   #207 <Method boolean TintTypedArray.hasValue(int)>
	//*  81  164:ifeq            185
		{
			attributeset = ((AttributeSet) (((TintTypedArray) (context)).getColorStateList(android.support.design.R.styleable.TextInputLayout_android_textColorHint)));
	//   82  167:aload_1         
	//   83  168:getstatic       #203 <Field int android.support.design.R$styleable.TextInputLayout_android_textColorHint>
	//   84  171:invokevirtual   #211 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   85  174:astore_2        
			mFocusedTextColor = ((ColorStateList) (attributeset));
	//   86  175:aload_0         
	//   87  176:aload_2         
	//   88  177:putfield        #213 <Field ColorStateList mFocusedTextColor>
			mDefaultTextColor = ((ColorStateList) (attributeset));
	//   89  180:aload_0         
	//   90  181:aload_2         
	//   91  182:putfield        #215 <Field ColorStateList mDefaultTextColor>
		}
		if(((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, -1) != -1)
	//*  92  185:aload_1         
	//*  93  186:getstatic       #218 <Field int android.support.design.R$styleable.TextInputLayout_hintTextAppearance>
	//*  94  189:iconst_m1       
	//*  95  190:invokevirtual   #222 <Method int TintTypedArray.getResourceId(int, int)>
	//*  96  193:iconst_m1       
	//*  97  194:icmpeq          209
			setHintTextAppearance(((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, 0));
	//   98  197:aload_0         
	//   99  198:aload_1         
	//  100  199:getstatic       #218 <Field int android.support.design.R$styleable.TextInputLayout_hintTextAppearance>
	//  101  202:iconst_0        
	//  102  203:invokevirtual   #222 <Method int TintTypedArray.getResourceId(int, int)>
	//  103  206:invokevirtual   #225 <Method void setHintTextAppearance(int)>
		mErrorTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_errorTextAppearance, 0);
	//  104  209:aload_0         
	//  105  210:aload_1         
	//  106  211:getstatic       #228 <Field int android.support.design.R$styleable.TextInputLayout_errorTextAppearance>
	//  107  214:iconst_0        
	//  108  215:invokevirtual   #222 <Method int TintTypedArray.getResourceId(int, int)>
	//  109  218:putfield        #230 <Field int mErrorTextAppearance>
		boolean flag = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_errorEnabled, false);
	//  110  221:aload_1         
	//  111  222:getstatic       #233 <Field int android.support.design.R$styleable.TextInputLayout_errorEnabled>
	//  112  225:iconst_0        
	//  113  226:invokevirtual   #182 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  114  229:istore          4
		boolean flag1 = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_counterEnabled, false);
	//  115  231:aload_1         
	//  116  232:getstatic       #236 <Field int android.support.design.R$styleable.TextInputLayout_counterEnabled>
	//  117  235:iconst_0        
	//  118  236:invokevirtual   #182 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  119  239:istore          5
		setCounterMaxLength(((TintTypedArray) (context)).getInt(android.support.design.R.styleable.TextInputLayout_counterMaxLength, -1));
	//  120  241:aload_0         
	//  121  242:aload_1         
	//  122  243:getstatic       #239 <Field int android.support.design.R$styleable.TextInputLayout_counterMaxLength>
	//  123  246:iconst_m1       
	//  124  247:invokevirtual   #242 <Method int TintTypedArray.getInt(int, int)>
	//  125  250:invokevirtual   #245 <Method void setCounterMaxLength(int)>
		mCounterTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_counterTextAppearance, 0);
	//  126  253:aload_0         
	//  127  254:aload_1         
	//  128  255:getstatic       #248 <Field int android.support.design.R$styleable.TextInputLayout_counterTextAppearance>
	//  129  258:iconst_0        
	//  130  259:invokevirtual   #222 <Method int TintTypedArray.getResourceId(int, int)>
	//  131  262:putfield        #250 <Field int mCounterTextAppearance>
		mCounterOverflowTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
	//  132  265:aload_0         
	//  133  266:aload_1         
	//  134  267:getstatic       #253 <Field int android.support.design.R$styleable.TextInputLayout_counterOverflowTextAppearance>
	//  135  270:iconst_0        
	//  136  271:invokevirtual   #222 <Method int TintTypedArray.getResourceId(int, int)>
	//  137  274:putfield        #255 <Field int mCounterOverflowTextAppearance>
		mPasswordToggleEnabled = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_passwordToggleEnabled, false);
	//  138  277:aload_0         
	//  139  278:aload_1         
	//  140  279:getstatic       #258 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleEnabled>
	//  141  282:iconst_0        
	//  142  283:invokevirtual   #182 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  143  286:putfield        #260 <Field boolean mPasswordToggleEnabled>
		mPasswordToggleDrawable = ((TintTypedArray) (context)).getDrawable(android.support.design.R.styleable.TextInputLayout_passwordToggleDrawable);
	//  144  289:aload_0         
	//  145  290:aload_1         
	//  146  291:getstatic       #263 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleDrawable>
	//  147  294:invokevirtual   #267 <Method Drawable TintTypedArray.getDrawable(int)>
	//  148  297:putfield        #269 <Field Drawable mPasswordToggleDrawable>
		mPasswordToggleContentDesc = ((TintTypedArray) (context)).getText(android.support.design.R.styleable.TextInputLayout_passwordToggleContentDescription);
	//  149  300:aload_0         
	//  150  301:aload_1         
	//  151  302:getstatic       #272 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleContentDescription>
	//  152  305:invokevirtual   #191 <Method CharSequence TintTypedArray.getText(int)>
	//  153  308:putfield        #274 <Field CharSequence mPasswordToggleContentDesc>
		if(((TintTypedArray) (context)).hasValue(android.support.design.R.styleable.TextInputLayout_passwordToggleTint))
	//* 154  311:aload_1         
	//* 155  312:getstatic       #277 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTint>
	//* 156  315:invokevirtual   #207 <Method boolean TintTypedArray.hasValue(int)>
	//* 157  318:ifeq            337
		{
			mHasPasswordToggleTintList = true;
	//  158  321:aload_0         
	//  159  322:iconst_1        
	//  160  323:putfield        #279 <Field boolean mHasPasswordToggleTintList>
			mPasswordToggleTintList = ((TintTypedArray) (context)).getColorStateList(android.support.design.R.styleable.TextInputLayout_passwordToggleTint);
	//  161  326:aload_0         
	//  162  327:aload_1         
	//  163  328:getstatic       #277 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTint>
	//  164  331:invokevirtual   #211 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  165  334:putfield        #281 <Field ColorStateList mPasswordToggleTintList>
		}
		if(((TintTypedArray) (context)).hasValue(android.support.design.R.styleable.TextInputLayout_passwordToggleTintMode))
	//* 166  337:aload_1         
	//* 167  338:getstatic       #284 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTintMode>
	//* 168  341:invokevirtual   #207 <Method boolean TintTypedArray.hasValue(int)>
	//* 169  344:ifeq            368
		{
			mHasPasswordToggleTintMode = true;
	//  170  347:aload_0         
	//  171  348:iconst_1        
	//  172  349:putfield        #286 <Field boolean mHasPasswordToggleTintMode>
			mPasswordToggleTintMode = ViewUtils.parseTintMode(((TintTypedArray) (context)).getInt(android.support.design.R.styleable.TextInputLayout_passwordToggleTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//  173  352:aload_0         
	//  174  353:aload_1         
	//  175  354:getstatic       #284 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTintMode>
	//  176  357:iconst_m1       
	//  177  358:invokevirtual   #242 <Method int TintTypedArray.getInt(int, int)>
	//  178  361:aconst_null     
	//  179  362:invokestatic    #292 <Method android.graphics.PorterDuff$Mode ViewUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  180  365:putfield        #294 <Field android.graphics.PorterDuff$Mode mPasswordToggleTintMode>
		}
		((TintTypedArray) (context)).recycle();
	//  181  368:aload_1         
	//  182  369:invokevirtual   #297 <Method void TintTypedArray.recycle()>
		setErrorEnabled(flag);
	//  183  372:aload_0         
	//  184  373:iload           4
	//  185  375:invokevirtual   #300 <Method void setErrorEnabled(boolean)>
		setCounterEnabled(flag1);
	//  186  378:aload_0         
	//  187  379:iload           5
	//  188  381:invokevirtual   #303 <Method void setCounterEnabled(boolean)>
		applyPasswordToggleTint();
	//  189  384:aload_0         
	//  190  385:invokespecial   #306 <Method void applyPasswordToggleTint()>
		if(ViewCompat.getImportantForAccessibility(((View) (this))) == 0)
	//* 191  388:aload_0         
	//* 192  389:invokestatic    #312 <Method int ViewCompat.getImportantForAccessibility(View)>
	//* 193  392:ifne            400
			ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//  194  395:aload_0         
	//  195  396:iconst_1        
	//  196  397:invokestatic    #316 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new TextInputAccessibilityDelegate())));
	//  197  400:aload_0         
	//  198  401:new             #23  <Class TextInputLayout$TextInputAccessibilityDelegate>
	//  199  404:dup             
	//  200  405:aload_0         
	//  201  406:invokespecial   #319 <Method void TextInputLayout$TextInputAccessibilityDelegate(TextInputLayout)>
	//  202  409:invokestatic    #323 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//  203  412:return          
	}

	private void addIndicator(TextView textview, int i)
	{
		if(mIndicatorArea == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #336 <Field LinearLayout mIndicatorArea>
	//*   2    4:ifnonnull       86
		{
			mIndicatorArea = new LinearLayout(getContext());
	//    3    7:aload_0         
	//    4    8:new             #4   <Class LinearLayout>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #340 <Method Context getContext()>
	//    8   16:invokespecial   #341 <Method void LinearLayout(Context)>
	//    9   19:putfield        #336 <Field LinearLayout mIndicatorArea>
			mIndicatorArea.setOrientation(0);
	//   10   22:aload_0         
	//   11   23:getfield        #336 <Field LinearLayout mIndicatorArea>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #342 <Method void LinearLayout.setOrientation(int)>
			addView(((View) (mIndicatorArea)), -1, -2);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #336 <Field LinearLayout mIndicatorArea>
	//   17   35:iconst_m1       
	//   18   36:bipush          -2
	//   19   38:invokevirtual   #345 <Method void addView(View, int, int)>
			Space space = new Space(getContext());
	//   20   41:new             #347 <Class Space>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokevirtual   #340 <Method Context getContext()>
	//   24   49:invokespecial   #348 <Method void Space(Context)>
	//   25   52:astore_3        
			android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, 0, 1.0F);
	//   26   53:new             #350 <Class android.widget.LinearLayout$LayoutParams>
	//   27   56:dup             
	//   28   57:iconst_0        
	//   29   58:iconst_0        
	//   30   59:fconst_1        
	//   31   60:invokespecial   #353 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   32   63:astore          4
			mIndicatorArea.addView(((View) (space)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   33   65:aload_0         
	//   34   66:getfield        #336 <Field LinearLayout mIndicatorArea>
	//   35   69:aload_3         
	//   36   70:aload           4
	//   37   72:invokevirtual   #356 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			if(mEditText != null)
	//*  38   75:aload_0         
	//*  39   76:getfield        #358 <Field EditText mEditText>
	//*  40   79:ifnull          86
				adjustIndicatorPadding();
	//   41   82:aload_0         
	//   42   83:invokespecial   #361 <Method void adjustIndicatorPadding()>
		}
		mIndicatorArea.setVisibility(0);
	//   43   86:aload_0         
	//   44   87:getfield        #336 <Field LinearLayout mIndicatorArea>
	//   45   90:iconst_0        
	//   46   91:invokevirtual   #364 <Method void LinearLayout.setVisibility(int)>
		mIndicatorArea.addView(((View) (textview)), i);
	//   47   94:aload_0         
	//   48   95:getfield        #336 <Field LinearLayout mIndicatorArea>
	//   49   98:aload_1         
	//   50   99:iload_2         
	//   51  100:invokevirtual   #366 <Method void LinearLayout.addView(View, int)>
		mIndicatorsAdded = mIndicatorsAdded + 1;
	//   52  103:aload_0         
	//   53  104:aload_0         
	//   54  105:getfield        #368 <Field int mIndicatorsAdded>
	//   55  108:iconst_1        
	//   56  109:iadd            
	//   57  110:putfield        #368 <Field int mIndicatorsAdded>
	//   58  113:return          
	}

	private void adjustIndicatorPadding()
	{
		ViewCompat.setPaddingRelative(((View) (mIndicatorArea)), ViewCompat.getPaddingStart(((View) (mEditText))), 0, ViewCompat.getPaddingEnd(((View) (mEditText))), mEditText.getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field LinearLayout mIndicatorArea>
	//    2    4:aload_0         
	//    3    5:getfield        #358 <Field EditText mEditText>
	//    4    8:invokestatic    #371 <Method int ViewCompat.getPaddingStart(View)>
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #358 <Field EditText mEditText>
	//    8   16:invokestatic    #374 <Method int ViewCompat.getPaddingEnd(View)>
	//    9   19:aload_0         
	//   10   20:getfield        #358 <Field EditText mEditText>
	//   11   23:invokevirtual   #380 <Method int EditText.getPaddingBottom()>
	//   12   26:invokestatic    #384 <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
	//   13   29:return          
	}

	private void applyPasswordToggleTint()
	{
		if(mPasswordToggleDrawable != null && (mHasPasswordToggleTintList || mHasPasswordToggleTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #269 <Field Drawable mPasswordToggleDrawable>
	//*   2    4:ifnull          103
	//*   3    7:aload_0         
	//*   4    8:getfield        #279 <Field boolean mHasPasswordToggleTintList>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #286 <Field boolean mHasPasswordToggleTintMode>
	//*   8   18:ifeq            103
		{
			mPasswordToggleDrawable = DrawableCompat.wrap(mPasswordToggleDrawable).mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #269 <Field Drawable mPasswordToggleDrawable>
	//   12   26:invokestatic    #390 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   13   29:invokevirtual   #396 <Method Drawable Drawable.mutate()>
	//   14   32:putfield        #269 <Field Drawable mPasswordToggleDrawable>
			if(mHasPasswordToggleTintList)
	//*  15   35:aload_0         
	//*  16   36:getfield        #279 <Field boolean mHasPasswordToggleTintList>
	//*  17   39:ifeq            53
				DrawableCompat.setTintList(mPasswordToggleDrawable, mPasswordToggleTintList);
	//   18   42:aload_0         
	//   19   43:getfield        #269 <Field Drawable mPasswordToggleDrawable>
	//   20   46:aload_0         
	//   21   47:getfield        #281 <Field ColorStateList mPasswordToggleTintList>
	//   22   50:invokestatic    #400 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasPasswordToggleTintMode)
	//*  23   53:aload_0         
	//*  24   54:getfield        #286 <Field boolean mHasPasswordToggleTintMode>
	//*  25   57:ifeq            71
				DrawableCompat.setTintMode(mPasswordToggleDrawable, mPasswordToggleTintMode);
	//   26   60:aload_0         
	//   27   61:getfield        #269 <Field Drawable mPasswordToggleDrawable>
	//   28   64:aload_0         
	//   29   65:getfield        #294 <Field android.graphics.PorterDuff$Mode mPasswordToggleTintMode>
	//   30   68:invokestatic    #404 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mPasswordToggleView != null && mPasswordToggleView.getDrawable() != mPasswordToggleDrawable)
	//*  31   71:aload_0         
	//*  32   72:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//*  33   75:ifnull          103
	//*  34   78:aload_0         
	//*  35   79:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//*  36   82:invokevirtual   #410 <Method Drawable CheckableImageButton.getDrawable()>
	//*  37   85:aload_0         
	//*  38   86:getfield        #269 <Field Drawable mPasswordToggleDrawable>
	//*  39   89:if_acmpeq       103
				mPasswordToggleView.setImageDrawable(mPasswordToggleDrawable);
	//   40   92:aload_0         
	//   41   93:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   42   96:aload_0         
	//   43   97:getfield        #269 <Field Drawable mPasswordToggleDrawable>
	//   44  100:invokevirtual   #414 <Method void CheckableImageButton.setImageDrawable(Drawable)>
		}
	//   45  103:return          
	}

	private static boolean arrayContains(int ai[], int i)
	{
		int k = ai.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int j = 0; j < k; j++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          26
			if(ai[j] == i)
	//*   8   10:aload_0         
	//*   9   11:iload_2         
	//*  10   12:iaload          
	//*  11   13:iload_1         
	//*  12   14:icmpne          19
				return true;
	//   13   17:iconst_1        
	//   14   18:ireturn         

	//   15   19:iload_2         
	//   16   20:iconst_1        
	//   17   21:iadd            
	//   18   22:istore_2        
	//*  19   23:goto            5
		return false;
	//   20   26:iconst_0        
	//   21   27:ireturn         
	}

	private void collapseHint(boolean flag)
	{
		if(mAnimator != null && mAnimator.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #419 <Field ValueAnimator mAnimator>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #419 <Field ValueAnimator mAnimator>
	//*   5   11:invokevirtual   #425 <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			mAnimator.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #419 <Field ValueAnimator mAnimator>
	//    9   21:invokevirtual   #428 <Method void ValueAnimator.cancel()>
		if(flag && mHintAnimationEnabled)
	//*  10   24:iload_1         
	//*  11   25:ifeq            43
	//*  12   28:aload_0         
	//*  13   29:getfield        #200 <Field boolean mHintAnimationEnabled>
	//*  14   32:ifeq            43
			animateToExpansionFraction(1.0F);
	//   15   35:aload_0         
	//   16   36:fconst_1        
	//   17   37:invokevirtual   #432 <Method void animateToExpansionFraction(float)>
		else
	//*  18   40:goto            51
			mCollapsingTextHelper.setExpansionFraction(1.0F);
	//   19   43:aload_0         
	//   20   44:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   21   47:fconst_1        
	//   22   48:invokevirtual   #435 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		mHintExpanded = false;
	//   23   51:aload_0         
	//   24   52:iconst_0        
	//   25   53:putfield        #437 <Field boolean mHintExpanded>
	//   26   56:return          
	}

	private void ensureBackgroundDrawableStateWorkaround()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #443 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		if(i != 21 && i != 22)
	//*   2    4:iload_1         
	//*   3    5:bipush          21
	//*   4    7:icmpeq          17
	//*   5   10:iload_1         
	//*   6   11:bipush          22
	//*   7   13:icmpeq          17
			return;
	//    8   16:return          
		Drawable drawable = mEditText.getBackground();
	//    9   17:aload_0         
	//   10   18:getfield        #358 <Field EditText mEditText>
	//   11   21:invokevirtual   #446 <Method Drawable EditText.getBackground()>
	//   12   24:astore_2        
		if(drawable == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       30
			return;
	//   15   29:return          
		if(!mHasReconstructedEditTextBackground)
	//*  16   30:aload_0         
	//*  17   31:getfield        #448 <Field boolean mHasReconstructedEditTextBackground>
	//*  18   34:ifne            87
		{
			Drawable drawable1 = drawable.getConstantState().newDrawable();
	//   19   37:aload_2         
	//   20   38:invokevirtual   #452 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   21   41:invokevirtual   #457 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   22   44:astore_3        
			if(drawable instanceof DrawableContainer)
	//*  23   45:aload_2         
	//*  24   46:instanceof      #459 <Class DrawableContainer>
	//*  25   49:ifeq            67
				mHasReconstructedEditTextBackground = DrawableUtils.setContainerConstantState((DrawableContainer)drawable, drawable1.getConstantState());
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:checkcast       #459 <Class DrawableContainer>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #452 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   31   61:invokestatic    #465 <Method boolean DrawableUtils.setContainerConstantState(DrawableContainer, android.graphics.drawable.Drawable$ConstantState)>
	//   32   64:putfield        #448 <Field boolean mHasReconstructedEditTextBackground>
			if(!mHasReconstructedEditTextBackground)
	//*  33   67:aload_0         
	//*  34   68:getfield        #448 <Field boolean mHasReconstructedEditTextBackground>
	//*  35   71:ifne            87
			{
				ViewCompat.setBackground(((View) (mEditText)), drawable1);
	//   36   74:aload_0         
	//   37   75:getfield        #358 <Field EditText mEditText>
	//   38   78:aload_3         
	//   39   79:invokestatic    #469 <Method void ViewCompat.setBackground(View, Drawable)>
				mHasReconstructedEditTextBackground = true;
	//   40   82:aload_0         
	//   41   83:iconst_1        
	//   42   84:putfield        #448 <Field boolean mHasReconstructedEditTextBackground>
			}
		}
	//   43   87:return          
	}

	private void expandHint(boolean flag)
	{
		if(mAnimator != null && mAnimator.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #419 <Field ValueAnimator mAnimator>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #419 <Field ValueAnimator mAnimator>
	//*   5   11:invokevirtual   #425 <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			mAnimator.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #419 <Field ValueAnimator mAnimator>
	//    9   21:invokevirtual   #428 <Method void ValueAnimator.cancel()>
		if(flag && mHintAnimationEnabled)
	//*  10   24:iload_1         
	//*  11   25:ifeq            43
	//*  12   28:aload_0         
	//*  13   29:getfield        #200 <Field boolean mHintAnimationEnabled>
	//*  14   32:ifeq            43
			animateToExpansionFraction(0.0F);
	//   15   35:aload_0         
	//   16   36:fconst_0        
	//   17   37:invokevirtual   #432 <Method void animateToExpansionFraction(float)>
		else
	//*  18   40:goto            51
			mCollapsingTextHelper.setExpansionFraction(0.0F);
	//   19   43:aload_0         
	//   20   44:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   21   47:fconst_0        
	//   22   48:invokevirtual   #435 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		mHintExpanded = true;
	//   23   51:aload_0         
	//   24   52:iconst_1        
	//   25   53:putfield        #437 <Field boolean mHintExpanded>
	//   26   56:return          
	}

	private boolean hasPasswordTransformation()
	{
		return mEditText != null && (mEditText.getTransformationMethod() instanceof PasswordTransformationMethod);
	//    0    0:aload_0         
	//    1    1:getfield        #358 <Field EditText mEditText>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #358 <Field EditText mEditText>
	//    5   11:invokevirtual   #475 <Method android.text.method.TransformationMethod EditText.getTransformationMethod()>
	//    6   14:instanceof      #477 <Class PasswordTransformationMethod>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private void passwordVisibilityToggleRequested(boolean flag)
	{
		if(mPasswordToggleEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #260 <Field boolean mPasswordToggleEnabled>
	//*   2    4:ifeq            83
		{
			int i = mEditText.getSelectionEnd();
	//    3    7:aload_0         
	//    4    8:getfield        #358 <Field EditText mEditText>
	//    5   11:invokevirtual   #480 <Method int EditText.getSelectionEnd()>
	//    6   14:istore_2        
			if(hasPasswordTransformation())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #482 <Method boolean hasPasswordTransformation()>
	//*   9   19:ifeq            38
			{
				mEditText.setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #358 <Field EditText mEditText>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #486 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				mPasswordToggledVisible = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #488 <Field boolean mPasswordToggledVisible>
			} else
	//*  17   35:goto            53
			{
				mEditText.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   18   38:aload_0         
	//   19   39:getfield        #358 <Field EditText mEditText>
	//   20   42:invokestatic    #492 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   21   45:invokevirtual   #486 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				mPasswordToggledVisible = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #488 <Field boolean mPasswordToggledVisible>
			}
			mPasswordToggleView.setChecked(mPasswordToggledVisible);
	//   25   53:aload_0         
	//   26   54:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   27   57:aload_0         
	//   28   58:getfield        #488 <Field boolean mPasswordToggledVisible>
	//   29   61:invokevirtual   #495 <Method void CheckableImageButton.setChecked(boolean)>
			if(flag)
	//*  30   64:iload_1         
	//*  31   65:ifeq            75
				mPasswordToggleView.jumpDrawablesToCurrentState();
	//   32   68:aload_0         
	//   33   69:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   34   72:invokevirtual   #498 <Method void CheckableImageButton.jumpDrawablesToCurrentState()>
			mEditText.setSelection(i);
	//   35   75:aload_0         
	//   36   76:getfield        #358 <Field EditText mEditText>
	//   37   79:iload_2         
	//   38   80:invokevirtual   #501 <Method void EditText.setSelection(int)>
		}
	//   39   83:return          
	}

	private static void recursiveSetEnabled(ViewGroup viewgroup, boolean flag)
	{
		int j = viewgroup.getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #508 <Method int ViewGroup.getChildCount()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          49
		{
			View view = viewgroup.getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #512 <Method View ViewGroup.getChildAt(int)>
	//   11   17:astore          4
			view.setEnabled(flag);
	//   12   19:aload           4
	//   13   21:iload_1         
	//   14   22:invokevirtual   #517 <Method void View.setEnabled(boolean)>
			if(view instanceof ViewGroup)
	//*  15   25:aload           4
	//*  16   27:instanceof      #505 <Class ViewGroup>
	//*  17   30:ifeq            42
				recursiveSetEnabled((ViewGroup)view, flag);
	//   18   33:aload           4
	//   19   35:checkcast       #505 <Class ViewGroup>
	//   20   38:iload_1         
	//   21   39:invokestatic    #519 <Method void recursiveSetEnabled(ViewGroup, boolean)>
		}

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            7
	//   27   49:return          
	}

	private void removeIndicator(TextView textview)
	{
		if(mIndicatorArea != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #336 <Field LinearLayout mIndicatorArea>
	//*   2    4:ifnull          40
		{
			mIndicatorArea.removeView(((View) (textview)));
	//    3    7:aload_0         
	//    4    8:getfield        #336 <Field LinearLayout mIndicatorArea>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #524 <Method void LinearLayout.removeView(View)>
			int i = mIndicatorsAdded - 1;
	//    7   15:aload_0         
	//    8   16:getfield        #368 <Field int mIndicatorsAdded>
	//    9   19:iconst_1        
	//   10   20:isub            
	//   11   21:istore_2        
			mIndicatorsAdded = i;
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:putfield        #368 <Field int mIndicatorsAdded>
			if(i == 0)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
				mIndicatorArea.setVisibility(8);
	//   17   31:aload_0         
	//   18   32:getfield        #336 <Field LinearLayout mIndicatorArea>
	//   19   35:bipush          8
	//   20   37:invokevirtual   #364 <Method void LinearLayout.setVisibility(int)>
		}
	//   21   40:return          
	}

	private void setEditText(EditText edittext)
	{
		if(mEditText != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #358 <Field EditText mEditText>
	//*   2    4:ifnull          18
			throw new IllegalArgumentException("We already have an EditText, can only have one");
	//    3    7:new             #528 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #530 <String "We already have an EditText, can only have one">
	//    6   14:invokespecial   #533 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		if(!(edittext instanceof TextInputEditText))
	//*   8   18:aload_1         
	//*   9   19:instanceof      #535 <Class TextInputEditText>
	//*  10   22:ifne            34
			Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
	//   11   25:ldc1            #33  <String "TextInputLayout">
	//   12   27:ldc2            #537 <String "EditText added is not a TextInputEditText. Please switch to using that class instead.">
	//   13   30:invokestatic    #543 <Method int Log.i(String, String)>
	//   14   33:pop             
		mEditText = edittext;
	//   15   34:aload_0         
	//   16   35:aload_1         
	//   17   36:putfield        #358 <Field EditText mEditText>
		if(!hasPasswordTransformation())
	//*  18   39:aload_0         
	//*  19   40:invokespecial   #482 <Method boolean hasPasswordTransformation()>
	//*  20   43:ifne            60
			mCollapsingTextHelper.setTypefaces(mEditText.getTypeface());
	//   21   46:aload_0         
	//   22   47:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   23   50:aload_0         
	//   24   51:getfield        #358 <Field EditText mEditText>
	//   25   54:invokevirtual   #547 <Method Typeface EditText.getTypeface()>
	//   26   57:invokevirtual   #551 <Method void CollapsingTextHelper.setTypefaces(Typeface)>
		mCollapsingTextHelper.setExpandedTextSize(mEditText.getTextSize());
	//   27   60:aload_0         
	//   28   61:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   29   64:aload_0         
	//   30   65:getfield        #358 <Field EditText mEditText>
	//   31   68:invokevirtual   #555 <Method float EditText.getTextSize()>
	//   32   71:invokevirtual   #558 <Method void CollapsingTextHelper.setExpandedTextSize(float)>
		int i = mEditText.getGravity();
	//   33   74:aload_0         
	//   34   75:getfield        #358 <Field EditText mEditText>
	//   35   78:invokevirtual   #561 <Method int EditText.getGravity()>
	//   36   81:istore_2        
		mCollapsingTextHelper.setCollapsedTextGravity(0x30 | i & 0xffffff8f);
	//   37   82:aload_0         
	//   38   83:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   39   86:bipush          48
	//   40   88:iload_2         
	//   41   89:bipush          -113
	//   42   91:iand            
	//   43   92:ior             
	//   44   93:invokevirtual   #159 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
		mCollapsingTextHelper.setExpandedTextGravity(i);
	//   45   96:aload_0         
	//   46   97:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   47  100:iload_2         
	//   48  101:invokevirtual   #564 <Method void CollapsingTextHelper.setExpandedTextGravity(int)>
		mEditText.addTextChangedListener(new TextWatcher() {

			public void afterTextChanged(Editable editable)
			{
				updateLabelState(mRestoringSavedState ^ true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field TextInputLayout this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field TextInputLayout this$0>
			//    4    8:invokestatic    #27  <Method boolean TextInputLayout.access$000(TextInputLayout)>
			//    5   11:iconst_1        
			//    6   12:ixor            
			//    7   13:invokevirtual   #31  <Method void TextInputLayout.updateLabelState(boolean)>
				if(mCounterEnabled)
			//*   8   16:aload_0         
			//*   9   17:getfield        #17  <Field TextInputLayout this$0>
			//*  10   20:getfield        #35  <Field boolean TextInputLayout.mCounterEnabled>
			//*  11   23:ifeq            39
					updateCounter(editable.length());
			//   12   26:aload_0         
			//   13   27:getfield        #17  <Field TextInputLayout this$0>
			//   14   30:aload_1         
			//   15   31:invokeinterface #41  <Method int Editable.length()>
			//   16   36:invokevirtual   #45  <Method void TextInputLayout.updateCounter(int)>
			//   17   39:return          
			}

			public void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int j, int k, int l)
			{
			//    0    0:return          
			}

			final TextInputLayout this$0;

			
			{
				this$0 = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   49  104:aload_0         
	//   50  105:getfield        #358 <Field EditText mEditText>
	//   51  108:new             #8   <Class TextInputLayout$1>
	//   52  111:dup             
	//   53  112:aload_0         
	//   54  113:invokespecial   #565 <Method void TextInputLayout$1(TextInputLayout)>
	//   55  116:invokevirtual   #569 <Method void EditText.addTextChangedListener(TextWatcher)>
		if(mDefaultTextColor == null)
	//*  56  119:aload_0         
	//*  57  120:getfield        #215 <Field ColorStateList mDefaultTextColor>
	//*  58  123:ifnonnull       137
			mDefaultTextColor = mEditText.getHintTextColors();
	//   59  126:aload_0         
	//   60  127:aload_0         
	//   61  128:getfield        #358 <Field EditText mEditText>
	//   62  131:invokevirtual   #573 <Method ColorStateList EditText.getHintTextColors()>
	//   63  134:putfield        #215 <Field ColorStateList mDefaultTextColor>
		if(mHintEnabled && TextUtils.isEmpty(mHint))
	//*  64  137:aload_0         
	//*  65  138:getfield        #184 <Field boolean mHintEnabled>
	//*  66  141:ifeq            181
	//*  67  144:aload_0         
	//*  68  145:getfield        #575 <Field CharSequence mHint>
	//*  69  148:invokestatic    #581 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  70  151:ifeq            181
		{
			mOriginalHint = mEditText.getHint();
	//   71  154:aload_0         
	//   72  155:aload_0         
	//   73  156:getfield        #358 <Field EditText mEditText>
	//   74  159:invokevirtual   #585 <Method CharSequence EditText.getHint()>
	//   75  162:putfield        #587 <Field CharSequence mOriginalHint>
			setHint(mOriginalHint);
	//   76  165:aload_0         
	//   77  166:aload_0         
	//   78  167:getfield        #587 <Field CharSequence mOriginalHint>
	//   79  170:invokevirtual   #195 <Method void setHint(CharSequence)>
			mEditText.setHint(((CharSequence) (null)));
	//   80  173:aload_0         
	//   81  174:getfield        #358 <Field EditText mEditText>
	//   82  177:aconst_null     
	//   83  178:invokevirtual   #588 <Method void EditText.setHint(CharSequence)>
		}
		if(mCounterView != null)
	//*  84  181:aload_0         
	//*  85  182:getfield        #590 <Field TextView mCounterView>
	//*  86  185:ifnull          204
			updateCounter(mEditText.getText().length());
	//   87  188:aload_0         
	//   88  189:aload_0         
	//   89  190:getfield        #358 <Field EditText mEditText>
	//   90  193:invokevirtual   #593 <Method Editable EditText.getText()>
	//   91  196:invokeinterface #598 <Method int Editable.length()>
	//   92  201:invokevirtual   #601 <Method void updateCounter(int)>
		if(mIndicatorArea != null)
	//*  93  204:aload_0         
	//*  94  205:getfield        #336 <Field LinearLayout mIndicatorArea>
	//*  95  208:ifnull          215
			adjustIndicatorPadding();
	//   96  211:aload_0         
	//   97  212:invokespecial   #361 <Method void adjustIndicatorPadding()>
		updatePasswordToggleView();
	//   98  215:aload_0         
	//   99  216:invokespecial   #604 <Method void updatePasswordToggleView()>
		updateLabelState(false, true);
	//  100  219:aload_0         
	//  101  220:iconst_0        
	//  102  221:iconst_1        
	//  103  222:invokevirtual   #608 <Method void updateLabelState(boolean, boolean)>
	//  104  225:return          
	}

	private void setError(final CharSequence error, boolean flag)
	{
		mError = error;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #613 <Field CharSequence mError>
		if(!mErrorEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #615 <Field boolean mErrorEnabled>
	//*   5    9:ifne            25
		{
			if(TextUtils.isEmpty(error))
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #581 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            20
				return;
	//    9   19:return          
			setErrorEnabled(true);
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #300 <Method void setErrorEnabled(boolean)>
		}
		mErrorShown = TextUtils.isEmpty(error) ^ true;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #581 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   16   30:iconst_1        
	//   17   31:ixor            
	//   18   32:putfield        #617 <Field boolean mErrorShown>
		mErrorView.animate().cancel();
	//   19   35:aload_0         
	//   20   36:getfield        #619 <Field TextView mErrorView>
	//   21   39:invokevirtual   #625 <Method ViewPropertyAnimator TextView.animate()>
	//   22   42:invokevirtual   #628 <Method void ViewPropertyAnimator.cancel()>
		if(mErrorShown)
	//*  23   45:aload_0         
	//*  24   46:getfield        #617 <Field boolean mErrorShown>
	//*  25   49:ifeq            143
		{
			mErrorView.setText(error);
	//   26   52:aload_0         
	//   27   53:getfield        #619 <Field TextView mErrorView>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #631 <Method void TextView.setText(CharSequence)>
			mErrorView.setVisibility(0);
	//   30   60:aload_0         
	//   31   61:getfield        #619 <Field TextView mErrorView>
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #632 <Method void TextView.setVisibility(int)>
			if(flag)
	//*  34   68:iload_2         
	//*  35   69:ifeq            132
			{
				if(mErrorView.getAlpha() == 1.0F)
	//*  36   72:aload_0         
	//*  37   73:getfield        #619 <Field TextView mErrorView>
	//*  38   76:invokevirtual   #635 <Method float TextView.getAlpha()>
	//*  39   79:fconst_1        
	//*  40   80:fcmpl           
	//*  41   81:ifne            92
					mErrorView.setAlpha(0.0F);
	//   42   84:aload_0         
	//   43   85:getfield        #619 <Field TextView mErrorView>
	//   44   88:fconst_0        
	//   45   89:invokevirtual   #638 <Method void TextView.setAlpha(float)>
				mErrorView.animate().alpha(1.0F).setDuration(200L).setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR))).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

					public void onAnimationStart(Animator animator)
					{
						mErrorView.setVisibility(0);
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field TextInputLayout this$0>
					//    2    4:getfield        #25  <Field TextView TextInputLayout.mErrorView>
					//    3    7:iconst_0        
					//    4    8:invokevirtual   #31  <Method void TextView.setVisibility(int)>
					//    5   11:return          
					}

					final TextInputLayout this$0;

			
			{
				this$0 = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field TextInputLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
				}
))).start();
	//   46   92:aload_0         
	//   47   93:getfield        #619 <Field TextView mErrorView>
	//   48   96:invokevirtual   #625 <Method ViewPropertyAnimator TextView.animate()>
	//   49   99:fconst_1        
	//   50  100:invokevirtual   #642 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   51  103:ldc2w           #643 <Long 200L>
	//   52  106:invokevirtual   #648 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   53  109:getstatic       #651 <Field android.view.animation.Interpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   54  112:invokevirtual   #655 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   55  115:new             #10  <Class TextInputLayout$2>
	//   56  118:dup             
	//   57  119:aload_0         
	//   58  120:invokespecial   #656 <Method void TextInputLayout$2(TextInputLayout)>
	//   59  123:invokevirtual   #660 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   60  126:invokevirtual   #663 <Method void ViewPropertyAnimator.start()>
			} else
	//*  61  129:goto            214
			{
				mErrorView.setAlpha(1.0F);
	//   62  132:aload_0         
	//   63  133:getfield        #619 <Field TextView mErrorView>
	//   64  136:fconst_1        
	//   65  137:invokevirtual   #638 <Method void TextView.setAlpha(float)>
			}
		} else
	//*  66  140:goto            214
		if(mErrorView.getVisibility() == 0)
	//*  67  143:aload_0         
	//*  68  144:getfield        #619 <Field TextView mErrorView>
	//*  69  147:invokevirtual   #666 <Method int TextView.getVisibility()>
	//*  70  150:ifne            214
			if(flag)
	//*  71  153:iload_2         
	//*  72  154:ifeq            198
			{
				mErrorView.animate().alpha(0.0F).setDuration(200L).setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR))).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator)
					{
						mErrorView.setText(error);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field TextInputLayout this$0>
					//    2    4:getfield        #29  <Field TextView TextInputLayout.mErrorView>
					//    3    7:aload_0         
					//    4    8:getfield        #19  <Field CharSequence val$error>
					//    5   11:invokevirtual   #35  <Method void TextView.setText(CharSequence)>
						mErrorView.setVisibility(4);
					//    6   14:aload_0         
					//    7   15:getfield        #17  <Field TextInputLayout this$0>
					//    8   18:getfield        #29  <Field TextView TextInputLayout.mErrorView>
					//    9   21:iconst_4        
					//   10   22:invokevirtual   #39  <Method void TextView.setVisibility(int)>
					//   11   25:return          
					}

					final TextInputLayout this$0;
					final CharSequence val$error;

			
			{
				this$0 = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout this$0>
				error = charsequence;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field CharSequence val$error>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
				}
))).start();
	//   73  157:aload_0         
	//   74  158:getfield        #619 <Field TextView mErrorView>
	//   75  161:invokevirtual   #625 <Method ViewPropertyAnimator TextView.animate()>
	//   76  164:fconst_0        
	//   77  165:invokevirtual   #642 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   78  168:ldc2w           #643 <Long 200L>
	//   79  171:invokevirtual   #648 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   80  174:getstatic       #669 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   81  177:invokevirtual   #655 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   82  180:new             #12  <Class TextInputLayout$3>
	//   83  183:dup             
	//   84  184:aload_0         
	//   85  185:aload_1         
	//   86  186:invokespecial   #672 <Method void TextInputLayout$3(TextInputLayout, CharSequence)>
	//   87  189:invokevirtual   #660 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   88  192:invokevirtual   #663 <Method void ViewPropertyAnimator.start()>
			} else
	//*  89  195:goto            214
			{
				mErrorView.setText(error);
	//   90  198:aload_0         
	//   91  199:getfield        #619 <Field TextView mErrorView>
	//   92  202:aload_1         
	//   93  203:invokevirtual   #631 <Method void TextView.setText(CharSequence)>
				mErrorView.setVisibility(4);
	//   94  206:aload_0         
	//   95  207:getfield        #619 <Field TextView mErrorView>
	//   96  210:iconst_4        
	//   97  211:invokevirtual   #632 <Method void TextView.setVisibility(int)>
			}
		updateEditTextBackground();
	//   98  214:aload_0         
	//   99  215:invokespecial   #675 <Method void updateEditTextBackground()>
		updateLabelState(flag);
	//  100  218:aload_0         
	//  101  219:iload_2         
	//  102  220:invokevirtual   #677 <Method void updateLabelState(boolean)>
	//  103  223:return          
	}

	private void setHintInternal(CharSequence charsequence)
	{
		mHint = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #575 <Field CharSequence mHint>
		mCollapsingTextHelper.setText(charsequence);
	//    3    5:aload_0         
	//    4    6:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #680 <Method void CollapsingTextHelper.setText(CharSequence)>
	//    7   13:return          
	}

	private boolean shouldShowPasswordIcon()
	{
		return mPasswordToggleEnabled && (hasPasswordTransformation() || mPasswordToggledVisible);
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field boolean mPasswordToggleEnabled>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:invokespecial   #482 <Method boolean hasPasswordTransformation()>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:getfield        #488 <Field boolean mPasswordToggledVisible>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void updateEditTextBackground()
	{
		if(mEditText == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #358 <Field EditText mEditText>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Drawable drawable1 = mEditText.getBackground();
	//    4    8:aload_0         
	//    5    9:getfield        #358 <Field EditText mEditText>
	//    6   12:invokevirtual   #446 <Method Drawable EditText.getBackground()>
	//    7   15:astore_2        
		if(drawable1 == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		ensureBackgroundDrawableStateWorkaround();
	//   11   21:aload_0         
	//   12   22:invokespecial   #683 <Method void ensureBackgroundDrawableStateWorkaround()>
		Drawable drawable = drawable1;
	//   13   25:aload_2         
	//   14   26:astore_1        
		if(DrawableUtils.canSafelyMutateDrawable(drawable1))
	//*  15   27:aload_2         
	//*  16   28:invokestatic    #689 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  17   31:ifeq            39
			drawable = drawable1.mutate();
	//   18   34:aload_2         
	//   19   35:invokevirtual   #396 <Method Drawable Drawable.mutate()>
	//   20   38:astore_1        
		if(mErrorShown && mErrorView != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #617 <Field boolean mErrorShown>
	//*  23   43:ifeq            71
	//*  24   46:aload_0         
	//*  25   47:getfield        #619 <Field TextView mErrorView>
	//*  26   50:ifnull          71
		{
			drawable.setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(mErrorView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #619 <Field TextView mErrorView>
	//   30   58:invokevirtual   #692 <Method int TextView.getCurrentTextColor()>
	//   31   61:getstatic       #697 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   32   64:invokestatic    #703 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   33   67:invokevirtual   #707 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			return;
	//   34   70:return          
		}
		if(mCounterOverflowed && mCounterView != null)
	//*  35   71:aload_0         
	//*  36   72:getfield        #709 <Field boolean mCounterOverflowed>
	//*  37   75:ifeq            103
	//*  38   78:aload_0         
	//*  39   79:getfield        #590 <Field TextView mCounterView>
	//*  40   82:ifnull          103
		{
			drawable.setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(mCounterView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   41   85:aload_1         
	//   42   86:aload_0         
	//   43   87:getfield        #590 <Field TextView mCounterView>
	//   44   90:invokevirtual   #692 <Method int TextView.getCurrentTextColor()>
	//   45   93:getstatic       #697 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   46   96:invokestatic    #703 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   47   99:invokevirtual   #707 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			return;
	//   48  102:return          
		} else
		{
			DrawableCompat.clearColorFilter(drawable);
	//   49  103:aload_1         
	//   50  104:invokestatic    #712 <Method void DrawableCompat.clearColorFilter(Drawable)>
			mEditText.refreshDrawableState();
	//   51  107:aload_0         
	//   52  108:getfield        #358 <Field EditText mEditText>
	//   53  111:invokevirtual   #715 <Method void EditText.refreshDrawableState()>
			return;
	//   54  114:return          
		}
	}

	private void updateInputLayoutMargins()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mInputFrame.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field FrameLayout mInputFrame>
	//    2    4:invokevirtual   #720 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//    3    7:checkcast       #350 <Class android.widget.LinearLayout$LayoutParams>
	//    4   10:astore_2        
		int i;
		if(mHintEnabled)
	//*   5   11:aload_0         
	//*   6   12:getfield        #184 <Field boolean mHintEnabled>
	//*   7   15:ifeq            78
		{
			if(mTmpPaint == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #722 <Field Paint mTmpPaint>
	//*  10   22:ifnonnull       36
				mTmpPaint = new Paint();
	//   11   25:aload_0         
	//   12   26:new             #724 <Class Paint>
	//   13   29:dup             
	//   14   30:invokespecial   #725 <Method void Paint()>
	//   15   33:putfield        #722 <Field Paint mTmpPaint>
			mTmpPaint.setTypeface(mCollapsingTextHelper.getCollapsedTypeface());
	//   16   36:aload_0         
	//   17   37:getfield        #722 <Field Paint mTmpPaint>
	//   18   40:aload_0         
	//   19   41:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   20   44:invokevirtual   #728 <Method Typeface CollapsingTextHelper.getCollapsedTypeface()>
	//   21   47:invokevirtual   #732 <Method Typeface Paint.setTypeface(Typeface)>
	//   22   50:pop             
			mTmpPaint.setTextSize(mCollapsingTextHelper.getCollapsedTextSize());
	//   23   51:aload_0         
	//   24   52:getfield        #722 <Field Paint mTmpPaint>
	//   25   55:aload_0         
	//   26   56:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   27   59:invokevirtual   #735 <Method float CollapsingTextHelper.getCollapsedTextSize()>
	//   28   62:invokevirtual   #738 <Method void Paint.setTextSize(float)>
			i = (int)(-mTmpPaint.ascent());
	//   29   65:aload_0         
	//   30   66:getfield        #722 <Field Paint mTmpPaint>
	//   31   69:invokevirtual   #741 <Method float Paint.ascent()>
	//   32   72:fneg            
	//   33   73:f2i             
	//   34   74:istore_1        
		} else
	//*  35   75:goto            80
		{
			i = 0;
	//   36   78:iconst_0        
	//   37   79:istore_1        
		}
		if(i != layoutparams.topMargin)
	//*  38   80:iload_1         
	//*  39   81:aload_2         
	//*  40   82:getfield        #744 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//*  41   85:icmpeq          100
		{
			layoutparams.topMargin = i;
	//   42   88:aload_2         
	//   43   89:iload_1         
	//   44   90:putfield        #744 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
			mInputFrame.requestLayout();
	//   45   93:aload_0         
	//   46   94:getfield        #135 <Field FrameLayout mInputFrame>
	//   47   97:invokevirtual   #747 <Method void FrameLayout.requestLayout()>
		}
	//   48  100:return          
	}

	private void updatePasswordToggleView()
	{
		if(mEditText == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #358 <Field EditText mEditText>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(shouldShowPasswordIcon())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #749 <Method boolean shouldShowPasswordIcon()>
	//*   6   12:ifeq            261
		{
			if(mPasswordToggleView == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//*   9   19:ifnonnull       95
			{
				mPasswordToggleView = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_text_input_password_icon, ((ViewGroup) (mInputFrame)), false);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #340 <Method Context getContext()>
	//   13   27:invokestatic    #755 <Method LayoutInflater LayoutInflater.from(Context)>
	//   14   30:getstatic       #760 <Field int android.support.design.R$layout.design_text_input_password_icon>
	//   15   33:aload_0         
	//   16   34:getfield        #135 <Field FrameLayout mInputFrame>
	//   17   37:iconst_0        
	//   18   38:invokevirtual   #764 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   19   41:checkcast       #408 <Class CheckableImageButton>
	//   20   44:putfield        #406 <Field CheckableImageButton mPasswordToggleView>
				mPasswordToggleView.setImageDrawable(mPasswordToggleDrawable);
	//   21   47:aload_0         
	//   22   48:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   23   51:aload_0         
	//   24   52:getfield        #269 <Field Drawable mPasswordToggleDrawable>
	//   25   55:invokevirtual   #414 <Method void CheckableImageButton.setImageDrawable(Drawable)>
				mPasswordToggleView.setContentDescription(mPasswordToggleContentDesc);
	//   26   58:aload_0         
	//   27   59:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   28   62:aload_0         
	//   29   63:getfield        #274 <Field CharSequence mPasswordToggleContentDesc>
	//   30   66:invokevirtual   #767 <Method void CheckableImageButton.setContentDescription(CharSequence)>
				mInputFrame.addView(((View) (mPasswordToggleView)));
	//   31   69:aload_0         
	//   32   70:getfield        #135 <Field FrameLayout mInputFrame>
	//   33   73:aload_0         
	//   34   74:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   35   77:invokevirtual   #768 <Method void FrameLayout.addView(View)>
				mPasswordToggleView.setOnClickListener(new android.view.View.OnClickListener() {

					public void onClick(View view)
					{
						passwordVisibilityToggleRequested(false);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field TextInputLayout this$0>
					//    2    4:iconst_0        
					//    3    5:invokestatic    #26  <Method void TextInputLayout.access$100(TextInputLayout, boolean)>
					//    4    8:return          
					}

					final TextInputLayout this$0;

			
			{
				this$0 = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   36   80:aload_0         
	//   37   81:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   38   84:new             #14  <Class TextInputLayout$4>
	//   39   87:dup             
	//   40   88:aload_0         
	//   41   89:invokespecial   #769 <Method void TextInputLayout$4(TextInputLayout)>
	//   42   92:invokevirtual   #773 <Method void CheckableImageButton.setOnClickListener(android.view.View$OnClickListener)>
			}
			if(mEditText != null && ViewCompat.getMinimumHeight(((View) (mEditText))) <= 0)
	//*  43   95:aload_0         
	//*  44   96:getfield        #358 <Field EditText mEditText>
	//*  45   99:ifnull          126
	//*  46  102:aload_0         
	//*  47  103:getfield        #358 <Field EditText mEditText>
	//*  48  106:invokestatic    #776 <Method int ViewCompat.getMinimumHeight(View)>
	//*  49  109:ifgt            126
				mEditText.setMinimumHeight(ViewCompat.getMinimumHeight(((View) (mPasswordToggleView))));
	//   50  112:aload_0         
	//   51  113:getfield        #358 <Field EditText mEditText>
	//   52  116:aload_0         
	//   53  117:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   54  120:invokestatic    #776 <Method int ViewCompat.getMinimumHeight(View)>
	//   55  123:invokevirtual   #779 <Method void EditText.setMinimumHeight(int)>
			mPasswordToggleView.setVisibility(0);
	//   56  126:aload_0         
	//   57  127:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   58  130:iconst_0        
	//   59  131:invokevirtual   #780 <Method void CheckableImageButton.setVisibility(int)>
			mPasswordToggleView.setChecked(mPasswordToggledVisible);
	//   60  134:aload_0         
	//   61  135:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   62  138:aload_0         
	//   63  139:getfield        #488 <Field boolean mPasswordToggledVisible>
	//   64  142:invokevirtual   #495 <Method void CheckableImageButton.setChecked(boolean)>
			if(mPasswordToggleDummyDrawable == null)
	//*  65  145:aload_0         
	//*  66  146:getfield        #782 <Field Drawable mPasswordToggleDummyDrawable>
	//*  67  149:ifnonnull       163
				mPasswordToggleDummyDrawable = ((Drawable) (new ColorDrawable()));
	//   68  152:aload_0         
	//   69  153:new             #784 <Class ColorDrawable>
	//   70  156:dup             
	//   71  157:invokespecial   #785 <Method void ColorDrawable()>
	//   72  160:putfield        #782 <Field Drawable mPasswordToggleDummyDrawable>
			mPasswordToggleDummyDrawable.setBounds(0, 0, mPasswordToggleView.getMeasuredWidth(), 1);
	//   73  163:aload_0         
	//   74  164:getfield        #782 <Field Drawable mPasswordToggleDummyDrawable>
	//   75  167:iconst_0        
	//   76  168:iconst_0        
	//   77  169:aload_0         
	//   78  170:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//   79  173:invokevirtual   #788 <Method int CheckableImageButton.getMeasuredWidth()>
	//   80  176:iconst_1        
	//   81  177:invokevirtual   #792 <Method void Drawable.setBounds(int, int, int, int)>
			Drawable adrawable[] = TextViewCompat.getCompoundDrawablesRelative(((TextView) (mEditText)));
	//   82  180:aload_0         
	//   83  181:getfield        #358 <Field EditText mEditText>
	//   84  184:invokestatic    #798 <Method Drawable[] TextViewCompat.getCompoundDrawablesRelative(TextView)>
	//   85  187:astore_1        
			if(adrawable[2] != mPasswordToggleDummyDrawable)
	//*  86  188:aload_1         
	//*  87  189:iconst_2        
	//*  88  190:aaload          
	//*  89  191:aload_0         
	//*  90  192:getfield        #782 <Field Drawable mPasswordToggleDummyDrawable>
	//*  91  195:if_acmpeq       205
				mOriginalEditTextEndDrawable = adrawable[2];
	//   92  198:aload_0         
	//   93  199:aload_1         
	//   94  200:iconst_2        
	//   95  201:aaload          
	//   96  202:putfield        #800 <Field Drawable mOriginalEditTextEndDrawable>
			TextViewCompat.setCompoundDrawablesRelative(((TextView) (mEditText)), adrawable[0], adrawable[1], mPasswordToggleDummyDrawable, adrawable[3]);
	//   97  205:aload_0         
	//   98  206:getfield        #358 <Field EditText mEditText>
	//   99  209:aload_1         
	//  100  210:iconst_0        
	//  101  211:aaload          
	//  102  212:aload_1         
	//  103  213:iconst_1        
	//  104  214:aaload          
	//  105  215:aload_0         
	//  106  216:getfield        #782 <Field Drawable mPasswordToggleDummyDrawable>
	//  107  219:aload_1         
	//  108  220:iconst_3        
	//  109  221:aaload          
	//  110  222:invokestatic    #804 <Method void TextViewCompat.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
			mPasswordToggleView.setPadding(mEditText.getPaddingLeft(), mEditText.getPaddingTop(), mEditText.getPaddingRight(), mEditText.getPaddingBottom());
	//  111  225:aload_0         
	//  112  226:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//  113  229:aload_0         
	//  114  230:getfield        #358 <Field EditText mEditText>
	//  115  233:invokevirtual   #807 <Method int EditText.getPaddingLeft()>
	//  116  236:aload_0         
	//  117  237:getfield        #358 <Field EditText mEditText>
	//  118  240:invokevirtual   #810 <Method int EditText.getPaddingTop()>
	//  119  243:aload_0         
	//  120  244:getfield        #358 <Field EditText mEditText>
	//  121  247:invokevirtual   #813 <Method int EditText.getPaddingRight()>
	//  122  250:aload_0         
	//  123  251:getfield        #358 <Field EditText mEditText>
	//  124  254:invokevirtual   #380 <Method int EditText.getPaddingBottom()>
	//  125  257:invokevirtual   #816 <Method void CheckableImageButton.setPadding(int, int, int, int)>
			return;
	//  126  260:return          
		}
		if(mPasswordToggleView != null && mPasswordToggleView.getVisibility() == 0)
	//* 127  261:aload_0         
	//* 128  262:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//* 129  265:ifnull          287
	//* 130  268:aload_0         
	//* 131  269:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//* 132  272:invokevirtual   #817 <Method int CheckableImageButton.getVisibility()>
	//* 133  275:ifne            287
			mPasswordToggleView.setVisibility(8);
	//  134  278:aload_0         
	//  135  279:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//  136  282:bipush          8
	//  137  284:invokevirtual   #780 <Method void CheckableImageButton.setVisibility(int)>
		if(mPasswordToggleDummyDrawable != null)
	//* 138  287:aload_0         
	//* 139  288:getfield        #782 <Field Drawable mPasswordToggleDummyDrawable>
	//* 140  291:ifnull          337
		{
			Drawable adrawable1[] = TextViewCompat.getCompoundDrawablesRelative(((TextView) (mEditText)));
	//  141  294:aload_0         
	//  142  295:getfield        #358 <Field EditText mEditText>
	//  143  298:invokestatic    #798 <Method Drawable[] TextViewCompat.getCompoundDrawablesRelative(TextView)>
	//  144  301:astore_1        
			if(adrawable1[2] == mPasswordToggleDummyDrawable)
	//* 145  302:aload_1         
	//* 146  303:iconst_2        
	//* 147  304:aaload          
	//* 148  305:aload_0         
	//* 149  306:getfield        #782 <Field Drawable mPasswordToggleDummyDrawable>
	//* 150  309:if_acmpne       337
			{
				TextViewCompat.setCompoundDrawablesRelative(((TextView) (mEditText)), adrawable1[0], adrawable1[1], mOriginalEditTextEndDrawable, adrawable1[3]);
	//  151  312:aload_0         
	//  152  313:getfield        #358 <Field EditText mEditText>
	//  153  316:aload_1         
	//  154  317:iconst_0        
	//  155  318:aaload          
	//  156  319:aload_1         
	//  157  320:iconst_1        
	//  158  321:aaload          
	//  159  322:aload_0         
	//  160  323:getfield        #800 <Field Drawable mOriginalEditTextEndDrawable>
	//  161  326:aload_1         
	//  162  327:iconst_3        
	//  163  328:aaload          
	//  164  329:invokestatic    #804 <Method void TextViewCompat.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
				mPasswordToggleDummyDrawable = null;
	//  165  332:aload_0         
	//  166  333:aconst_null     
	//  167  334:putfield        #782 <Field Drawable mPasswordToggleDummyDrawable>
			}
		}
	//  168  337:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(view instanceof EditText)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #376 <Class EditText>
	//*   2    4:ifeq            64
		{
			android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams);
	//    3    7:new             #820 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_3         
	//    6   12:invokespecial   #823 <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    7   15:astore          4
			layoutparams1.gravity = 0x10 | layoutparams1.gravity & 0xffffff8f;
	//    8   17:aload           4
	//    9   19:bipush          16
	//   10   21:aload           4
	//   11   23:getfield        #826 <Field int android.widget.FrameLayout$LayoutParams.gravity>
	//   12   26:bipush          -113
	//   13   28:iand            
	//   14   29:ior             
	//   15   30:putfield        #826 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			mInputFrame.addView(view, ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   16   33:aload_0         
	//   17   34:getfield        #135 <Field FrameLayout mInputFrame>
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokevirtual   #827 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			mInputFrame.setLayoutParams(layoutparams);
	//   21   43:aload_0         
	//   22   44:getfield        #135 <Field FrameLayout mInputFrame>
	//   23   47:aload_3         
	//   24   48:invokevirtual   #830 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			updateInputLayoutMargins();
	//   25   51:aload_0         
	//   26   52:invokespecial   #832 <Method void updateInputLayoutMargins()>
			setEditText((EditText)view);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:checkcast       #376 <Class EditText>
	//   30   60:invokespecial   #834 <Method void setEditText(EditText)>
			return;
	//   31   63:return          
		} else
		{
			super.addView(view, i, layoutparams);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:iload_2         
	//   35   67:aload_3         
	//   36   68:invokespecial   #836 <Method void LinearLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   37   71:return          
		}
	}

	void animateToExpansionFraction(float f)
	{
		if(mCollapsingTextHelper.getExpansionFraction() == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//*   2    4:invokevirtual   #840 <Method float CollapsingTextHelper.getExpansionFraction()>
	//*   3    7:fload_1         
	//*   4    8:fcmpl           
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(mAnimator == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #419 <Field ValueAnimator mAnimator>
	//*   9   17:ifnonnull       67
		{
			mAnimator = new ValueAnimator();
	//   10   20:aload_0         
	//   11   21:new             #421 <Class ValueAnimator>
	//   12   24:dup             
	//   13   25:invokespecial   #841 <Method void ValueAnimator()>
	//   14   28:putfield        #419 <Field ValueAnimator mAnimator>
			mAnimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.LINEAR_INTERPOLATOR)));
	//   15   31:aload_0         
	//   16   32:getfield        #419 <Field ValueAnimator mAnimator>
	//   17   35:getstatic       #844 <Field android.view.animation.Interpolator AnimationUtils.LINEAR_INTERPOLATOR>
	//   18   38:invokevirtual   #847 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			mAnimator.setDuration(200L);
	//   19   41:aload_0         
	//   20   42:getfield        #419 <Field ValueAnimator mAnimator>
	//   21   45:ldc2w           #643 <Long 200L>
	//   22   48:invokevirtual   #850 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   23   51:pop             
			mAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					mCollapsingTextHelper.setExpansionFraction(((Float)valueanimator.getAnimatedValue()).floatValue());
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field TextInputLayout this$0>
				//    2    4:getfield        #27  <Field CollapsingTextHelper TextInputLayout.mCollapsingTextHelper>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
				//    5   11:checkcast       #35  <Class Float>
				//    6   14:invokevirtual   #39  <Method float Float.floatValue()>
				//    7   17:invokevirtual   #44  <Method void CollapsingTextHelper.setExpansionFraction(float)>
				//    8   20:return          
				}

				final TextInputLayout this$0;

			
			{
				this$0 = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   52:aload_0         
	//   25   53:getfield        #419 <Field ValueAnimator mAnimator>
	//   26   56:new             #16  <Class TextInputLayout$5>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:invokespecial   #851 <Method void TextInputLayout$5(TextInputLayout)>
	//   30   64:invokevirtual   #855 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
		mAnimator.setFloatValues(new float[] {
			mCollapsingTextHelper.getExpansionFraction(), f
		});
	//   31   67:aload_0         
	//   32   68:getfield        #419 <Field ValueAnimator mAnimator>
	//   33   71:iconst_2        
	//   34   72:newarray        float[]
	//   35   74:dup             
	//   36   75:iconst_0        
	//   37   76:aload_0         
	//   38   77:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   39   80:invokevirtual   #840 <Method float CollapsingTextHelper.getExpansionFraction()>
	//   40   83:fastore         
	//   41   84:dup             
	//   42   85:iconst_1        
	//   43   86:fload_1         
	//   44   87:fastore         
	//   45   88:invokevirtual   #859 <Method void ValueAnimator.setFloatValues(float[])>
		mAnimator.start();
	//   46   91:aload_0         
	//   47   92:getfield        #419 <Field ValueAnimator mAnimator>
	//   48   95:invokevirtual   #860 <Method void ValueAnimator.start()>
	//   49   98:return          
	}

	public void dispatchProvideAutofillStructure(ViewStructure viewstructure, int i)
	{
		CharSequence charsequence;
		if(mOriginalHint == null || mEditText == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #587 <Field CharSequence mOriginalHint>
	//*   2    4:ifnull          62
	//*   3    7:aload_0         
	//*   4    8:getfield        #358 <Field EditText mEditText>
	//*   5   11:ifnonnull       17
			break MISSING_BLOCK_LABEL_62;
	//    6   14:goto            62
		charsequence = mEditText.getHint();
	//    7   17:aload_0         
	//    8   18:getfield        #358 <Field EditText mEditText>
	//    9   21:invokevirtual   #585 <Method CharSequence EditText.getHint()>
	//   10   24:astore_3        
		mEditText.setHint(mOriginalHint);
	//   11   25:aload_0         
	//   12   26:getfield        #358 <Field EditText mEditText>
	//   13   29:aload_0         
	//   14   30:getfield        #587 <Field CharSequence mOriginalHint>
	//   15   33:invokevirtual   #588 <Method void EditText.setHint(CharSequence)>
		super.dispatchProvideAutofillStructure(viewstructure, i);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:iload_2         
	//   19   39:invokespecial   #865 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
		mEditText.setHint(charsequence);
	//   20   42:aload_0         
	//   21   43:getfield        #358 <Field EditText mEditText>
	//   22   46:aload_3         
	//   23   47:invokevirtual   #588 <Method void EditText.setHint(CharSequence)>
		return;
	//   24   50:return          
		viewstructure;
	//   25   51:astore_1        
		mEditText.setHint(charsequence);
	//   26   52:aload_0         
	//   27   53:getfield        #358 <Field EditText mEditText>
	//   28   56:aload_3         
	//   29   57:invokevirtual   #588 <Method void EditText.setHint(CharSequence)>
		throw viewstructure;
	//   30   60:aload_1         
	//   31   61:athrow          
		super.dispatchProvideAutofillStructure(viewstructure, i);
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:iload_2         
	//   35   65:invokespecial   #865 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
		return;
	//   36   68:return          
	}

	protected void dispatchRestoreInstanceState(SparseArray sparsearray)
	{
		mRestoringSavedState = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #327 <Field boolean mRestoringSavedState>
		super.dispatchRestoreInstanceState(sparsearray);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #869 <Method void LinearLayout.dispatchRestoreInstanceState(SparseArray)>
		mRestoringSavedState = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #327 <Field boolean mRestoringSavedState>
	//    9   15:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #875 <Method void LinearLayout.draw(Canvas)>
		if(mHintEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #184 <Field boolean mHintEnabled>
	//*   5    9:ifeq            20
			mCollapsingTextHelper.draw(canvas);
	//    6   12:aload_0         
	//    7   13:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #876 <Method void CollapsingTextHelper.draw(Canvas)>
	//   10   20:return          
	}

	protected void drawableStateChanged()
	{
		if(mInDrawableStateChanged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #879 <Field boolean mInDrawableStateChanged>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		boolean flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		mInDrawableStateChanged = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #879 <Field boolean mInDrawableStateChanged>
		super.drawableStateChanged();
	//    9   15:aload_0         
	//   10   16:invokespecial   #881 <Method void LinearLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #885 <Method int[] getDrawableState()>
	//   13   23:astore_3        
		if(!ViewCompat.isLaidOut(((View) (this))) || !isEnabled())
	//*  14   24:aload_0         
	//*  15   25:invokestatic    #889 <Method boolean ViewCompat.isLaidOut(View)>
	//*  16   28:ifeq            41
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #892 <Method boolean isEnabled()>
	//*  19   35:ifeq            41
	//*  20   38:goto            43
			flag1 = false;
	//   21   41:iconst_0        
	//   22   42:istore_2        
		updateLabelState(flag1);
	//   23   43:aload_0         
	//   24   44:iload_2         
	//   25   45:invokevirtual   #677 <Method void updateLabelState(boolean)>
		updateEditTextBackground();
	//   26   48:aload_0         
	//   27   49:invokespecial   #675 <Method void updateEditTextBackground()>
		boolean flag;
		if(mCollapsingTextHelper != null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//*  30   56:ifnull          73
			flag = mCollapsingTextHelper.setState(ai) | false;
	//   31   59:aload_0         
	//   32   60:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   33   63:aload_3         
	//   34   64:invokevirtual   #896 <Method boolean CollapsingTextHelper.setState(int[])>
	//   35   67:iconst_0        
	//   36   68:ior             
	//   37   69:istore_1        
		else
	//*  38   70:goto            75
			flag = false;
	//   39   73:iconst_0        
	//   40   74:istore_1        
		if(flag)
	//*  41   75:iload_1         
	//*  42   76:ifeq            83
			invalidate();
	//   43   79:aload_0         
	//   44   80:invokevirtual   #899 <Method void invalidate()>
		mInDrawableStateChanged = false;
	//   45   83:aload_0         
	//   46   84:iconst_0        
	//   47   85:putfield        #879 <Field boolean mInDrawableStateChanged>
	//   48   88:return          
	}

	public int getCounterMaxLength()
	{
		return mCounterMaxLength;
	//    0    0:aload_0         
	//    1    1:getfield        #902 <Field int mCounterMaxLength>
	//    2    4:ireturn         
	}

	public EditText getEditText()
	{
		return mEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #358 <Field EditText mEditText>
	//    2    4:areturn         
	}

	public CharSequence getError()
	{
		if(mErrorEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #615 <Field boolean mErrorEnabled>
	//*   2    4:ifeq            12
			return mError;
	//    3    7:aload_0         
	//    4    8:getfield        #613 <Field CharSequence mError>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public CharSequence getHint()
	{
		if(mHintEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field boolean mHintEnabled>
	//*   2    4:ifeq            12
			return mHint;
	//    3    7:aload_0         
	//    4    8:getfield        #575 <Field CharSequence mHint>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public CharSequence getPasswordVisibilityToggleContentDescription()
	{
		return mPasswordToggleContentDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field CharSequence mPasswordToggleContentDesc>
	//    2    4:areturn         
	}

	public Drawable getPasswordVisibilityToggleDrawable()
	{
		return mPasswordToggleDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field Drawable mPasswordToggleDrawable>
	//    2    4:areturn         
	}

	public Typeface getTypeface()
	{
		return mTypeface;
	//    0    0:aload_0         
	//    1    1:getfield        #910 <Field Typeface mTypeface>
	//    2    4:areturn         
	}

	public boolean isCounterEnabled()
	{
		return mCounterEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #913 <Field boolean mCounterEnabled>
	//    2    4:ireturn         
	}

	public boolean isErrorEnabled()
	{
		return mErrorEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field boolean mErrorEnabled>
	//    2    4:ireturn         
	}

	public boolean isHintAnimationEnabled()
	{
		return mHintAnimationEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field boolean mHintAnimationEnabled>
	//    2    4:ireturn         
	}

	public boolean isHintEnabled()
	{
		return mHintEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field boolean mHintEnabled>
	//    2    4:ireturn         
	}

	final boolean isHintExpanded()
	{
		return mHintExpanded;
	//    0    0:aload_0         
	//    1    1:getfield        #437 <Field boolean mHintExpanded>
	//    2    4:ireturn         
	}

	public boolean isPasswordVisibilityToggleEnabled()
	{
		return mPasswordToggleEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field boolean mPasswordToggleEnabled>
	//    2    4:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #922 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		if(mHintEnabled && mEditText != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #184 <Field boolean mHintEnabled>
	//*   9   15:ifeq            136
	//*  10   18:aload_0         
	//*  11   19:getfield        #358 <Field EditText mEditText>
	//*  12   22:ifnull          136
		{
			Rect rect = mTmpRect;
	//   13   25:aload_0         
	//   14   26:getfield        #106 <Field Rect mTmpRect>
	//   15   29:astore          6
			ViewGroupUtils.getDescendantRect(((ViewGroup) (this)), ((View) (mEditText)), rect);
	//   16   31:aload_0         
	//   17   32:aload_0         
	//   18   33:getfield        #358 <Field EditText mEditText>
	//   19   36:aload           6
	//   20   38:invokestatic    #928 <Method void ViewGroupUtils.getDescendantRect(ViewGroup, View, Rect)>
			i = rect.left + mEditText.getCompoundPaddingLeft();
	//   21   41:aload           6
	//   22   43:getfield        #931 <Field int Rect.left>
	//   23   46:aload_0         
	//   24   47:getfield        #358 <Field EditText mEditText>
	//   25   50:invokevirtual   #934 <Method int EditText.getCompoundPaddingLeft()>
	//   26   53:iadd            
	//   27   54:istore_2        
			k = rect.right - mEditText.getCompoundPaddingRight();
	//   28   55:aload           6
	//   29   57:getfield        #937 <Field int Rect.right>
	//   30   60:aload_0         
	//   31   61:getfield        #358 <Field EditText mEditText>
	//   32   64:invokevirtual   #940 <Method int EditText.getCompoundPaddingRight()>
	//   33   67:isub            
	//   34   68:istore          4
			mCollapsingTextHelper.setExpandedBounds(i, rect.top + mEditText.getCompoundPaddingTop(), k, rect.bottom - mEditText.getCompoundPaddingBottom());
	//   35   70:aload_0         
	//   36   71:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   37   74:iload_2         
	//   38   75:aload           6
	//   39   77:getfield        #943 <Field int Rect.top>
	//   40   80:aload_0         
	//   41   81:getfield        #358 <Field EditText mEditText>
	//   42   84:invokevirtual   #946 <Method int EditText.getCompoundPaddingTop()>
	//   43   87:iadd            
	//   44   88:iload           4
	//   45   90:aload           6
	//   46   92:getfield        #949 <Field int Rect.bottom>
	//   47   95:aload_0         
	//   48   96:getfield        #358 <Field EditText mEditText>
	//   49   99:invokevirtual   #952 <Method int EditText.getCompoundPaddingBottom()>
	//   50  102:isub            
	//   51  103:invokevirtual   #955 <Method void CollapsingTextHelper.setExpandedBounds(int, int, int, int)>
			mCollapsingTextHelper.setCollapsedBounds(i, getPaddingTop(), k, l - j - getPaddingBottom());
	//   52  106:aload_0         
	//   53  107:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   54  110:iload_2         
	//   55  111:aload_0         
	//   56  112:invokevirtual   #956 <Method int getPaddingTop()>
	//   57  115:iload           4
	//   58  117:iload           5
	//   59  119:iload_3         
	//   60  120:isub            
	//   61  121:aload_0         
	//   62  122:invokevirtual   #957 <Method int getPaddingBottom()>
	//   63  125:isub            
	//   64  126:invokevirtual   #960 <Method void CollapsingTextHelper.setCollapsedBounds(int, int, int, int)>
			mCollapsingTextHelper.recalculate();
	//   65  129:aload_0         
	//   66  130:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   67  133:invokevirtual   #963 <Method void CollapsingTextHelper.recalculate()>
		}
	//   68  136:return          
	}

	protected void onMeasure(int i, int j)
	{
		updatePasswordToggleView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #604 <Method void updatePasswordToggleView()>
		super.onMeasure(i, j);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #967 <Method void LinearLayout.onMeasure(int, int)>
	//    6   10:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class TextInputLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #971 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #18  <Class TextInputLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #975 <Method Parcelable TextInputLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #971 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
		setError(((SavedState) (parcelable)).error);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #978 <Field CharSequence TextInputLayout$SavedState.error>
	//   17   31:invokevirtual   #980 <Method void setError(CharSequence)>
		if(((SavedState) (parcelable)).isPasswordToggledVisible)
	//*  18   34:aload_1         
	//*  19   35:getfield        #983 <Field boolean TextInputLayout$SavedState.isPasswordToggledVisible>
	//*  20   38:ifeq            46
			passwordVisibilityToggleRequested(true);
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:invokespecial   #332 <Method void passwordVisibilityToggleRequested(boolean)>
		requestLayout();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #984 <Method void requestLayout()>
	//   26   50:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #18  <Class TextInputLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #987 <Method Parcelable LinearLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #989 <Method void TextInputLayout$SavedState(Parcelable)>
	//    5   11:astore_1        
		if(mErrorShown)
	//*   6   12:aload_0         
	//*   7   13:getfield        #617 <Field boolean mErrorShown>
	//*   8   16:ifeq            27
			savedstate.error = getError();
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #991 <Method CharSequence getError()>
	//   12   24:putfield        #978 <Field CharSequence TextInputLayout$SavedState.error>
		savedstate.isPasswordToggledVisible = mPasswordToggledVisible;
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #488 <Field boolean mPasswordToggledVisible>
	//   16   32:putfield        #983 <Field boolean TextInputLayout$SavedState.isPasswordToggledVisible>
		return ((Parcelable) (savedstate));
	//   17   35:aload_1         
	//   18   36:areturn         
	}

	public void setCounterEnabled(boolean flag)
	{
		Exception exception;
		if(mCounterEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #913 <Field boolean mCounterEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          165
		{
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            147
			{
				mCounterView = ((TextView) (new AppCompatTextView(getContext())));
	//    6   12:aload_0         
	//    7   13:new             #995 <Class AppCompatTextView>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #340 <Method Context getContext()>
	//   11   21:invokespecial   #996 <Method void AppCompatTextView(Context)>
	//   12   24:putfield        #590 <Field TextView mCounterView>
				mCounterView.setId(android.support.design.R.id.textinput_counter);
	//   13   27:aload_0         
	//   14   28:getfield        #590 <Field TextView mCounterView>
	//   15   31:getstatic       #1001 <Field int android.support.design.R$id.textinput_counter>
	//   16   34:invokevirtual   #1004 <Method void TextView.setId(int)>
				if(mTypeface != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #910 <Field Typeface mTypeface>
	//*  19   41:ifnull          55
					mCounterView.setTypeface(mTypeface);
	//   20   44:aload_0         
	//   21   45:getfield        #590 <Field TextView mCounterView>
	//   22   48:aload_0         
	//   23   49:getfield        #910 <Field Typeface mTypeface>
	//   24   52:invokevirtual   #1006 <Method void TextView.setTypeface(Typeface)>
				mCounterView.setMaxLines(1);
	//   25   55:aload_0         
	//   26   56:getfield        #590 <Field TextView mCounterView>
	//   27   59:iconst_1        
	//   28   60:invokevirtual   #1009 <Method void TextView.setMaxLines(int)>
				try
				{
					TextViewCompat.setTextAppearance(mCounterView, mCounterTextAppearance);
	//   29   63:aload_0         
	//   30   64:getfield        #590 <Field TextView mCounterView>
	//   31   67:aload_0         
	//   32   68:getfield        #250 <Field int mCounterTextAppearance>
	//   33   71:invokestatic    #1012 <Method void TextViewCompat.setTextAppearance(TextView, int)>
				}
	//*  34   74:goto            104
	//*  35   77:aload_0         
	//*  36   78:getfield        #590 <Field TextView mCounterView>
	//*  37   81:getstatic       #1017 <Field int android.support.v7.appcompat.R$style.TextAppearance_AppCompat_Caption>
	//*  38   84:invokestatic    #1012 <Method void TextViewCompat.setTextAppearance(TextView, int)>
	//*  39   87:aload_0         
	//*  40   88:getfield        #590 <Field TextView mCounterView>
	//*  41   91:aload_0         
	//*  42   92:invokevirtual   #340 <Method Context getContext()>
	//*  43   95:getstatic       #1022 <Field int android.support.v7.appcompat.R$color.error_color_material>
	//*  44   98:invokestatic    #1028 <Method int ContextCompat.getColor(Context, int)>
	//*  45  101:invokevirtual   #1031 <Method void TextView.setTextColor(int)>
	//*  46  104:aload_0         
	//*  47  105:aload_0         
	//*  48  106:getfield        #590 <Field TextView mCounterView>
	//*  49  109:iconst_m1       
	//*  50  110:invokespecial   #1033 <Method void addIndicator(TextView, int)>
	//*  51  113:aload_0         
	//*  52  114:getfield        #358 <Field EditText mEditText>
	//*  53  117:ifnonnull       128
	//*  54  120:aload_0         
	//*  55  121:iconst_0        
	//*  56  122:invokevirtual   #601 <Method void updateCounter(int)>
	//*  57  125:goto            160
	//*  58  128:aload_0         
	//*  59  129:aload_0         
	//*  60  130:getfield        #358 <Field EditText mEditText>
	//*  61  133:invokevirtual   #593 <Method Editable EditText.getText()>
	//*  62  136:invokeinterface #598 <Method int Editable.length()>
	//*  63  141:invokevirtual   #601 <Method void updateCounter(int)>
	//*  64  144:goto            160
	//*  65  147:aload_0         
	//*  66  148:aload_0         
	//*  67  149:getfield        #590 <Field TextView mCounterView>
	//*  68  152:invokespecial   #1035 <Method void removeIndicator(TextView)>
	//*  69  155:aload_0         
	//*  70  156:aconst_null     
	//*  71  157:putfield        #590 <Field TextView mCounterView>
	//*  72  160:aload_0         
	//*  73  161:iload_1         
	//*  74  162:putfield        #913 <Field boolean mCounterEnabled>
	//*  75  165:return          
				// Misplaced declaration of an exception variable
				catch(Exception exception)
				{
					TextViewCompat.setTextAppearance(mCounterView, android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Caption);
					mCounterView.setTextColor(ContextCompat.getColor(getContext(), android.support.v7.appcompat.R.color.error_color_material));
				}
				addIndicator(mCounterView, -1);
				if(mEditText == null)
					updateCounter(0);
				else
					updateCounter(mEditText.getText().length());
			} else
			{
				removeIndicator(mCounterView);
				mCounterView = null;
			}
			mCounterEnabled = flag;
		}
	//*  76  166:astore_2        
	//*  77  167:goto            77
	}

	public void setCounterMaxLength(int i)
	{
		if(mCounterMaxLength != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #902 <Field int mCounterMaxLength>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          62
		{
			if(i > 0)
	//*   4    8:iload_1         
	//*   5    9:ifle            20
				mCounterMaxLength = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #902 <Field int mCounterMaxLength>
			else
	//*   9   17:goto            25
				mCounterMaxLength = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #902 <Field int mCounterMaxLength>
			if(mCounterEnabled)
	//*  13   25:aload_0         
	//*  14   26:getfield        #913 <Field boolean mCounterEnabled>
	//*  15   29:ifeq            62
			{
				if(mEditText == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #358 <Field EditText mEditText>
	//*  18   36:ifnonnull       44
					i = 0;
	//   19   39:iconst_0        
	//   20   40:istore_1        
				else
	//*  21   41:goto            57
					i = mEditText.getText().length();
	//   22   44:aload_0         
	//   23   45:getfield        #358 <Field EditText mEditText>
	//   24   48:invokevirtual   #593 <Method Editable EditText.getText()>
	//   25   51:invokeinterface #598 <Method int Editable.length()>
	//   26   56:istore_1        
				updateCounter(i);
	//   27   57:aload_0         
	//   28   58:iload_1         
	//   29   59:invokevirtual   #601 <Method void updateCounter(int)>
			}
		}
	//   30   62:return          
	}

	public void setEnabled(boolean flag)
	{
		recursiveSetEnabled(((ViewGroup) (this)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #519 <Method void recursiveSetEnabled(ViewGroup, boolean)>
		super.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #1036 <Method void LinearLayout.setEnabled(boolean)>
	//    6   10:return          
	}

	public void setError(CharSequence charsequence)
	{
		boolean flag;
		if(ViewCompat.isLaidOut(((View) (this))) && isEnabled() && (mErrorView == null || !TextUtils.equals(mErrorView.getText(), charsequence)))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #889 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifeq            40
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #892 <Method boolean isEnabled()>
	//*   5   11:ifeq            40
	//*   6   14:aload_0         
	//*   7   15:getfield        #619 <Field TextView mErrorView>
	//*   8   18:ifnull          35
	//*   9   21:aload_0         
	//*  10   22:getfield        #619 <Field TextView mErrorView>
	//*  11   25:invokevirtual   #1038 <Method CharSequence TextView.getText()>
	//*  12   28:aload_1         
	//*  13   29:invokestatic    #1042 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  14   32:ifne            40
			flag = true;
	//   15   35:iconst_1        
	//   16   36:istore_2        
		else
	//*  17   37:goto            42
			flag = false;
	//   18   40:iconst_0        
	//   19   41:istore_2        
		setError(charsequence, flag);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:iload_2         
	//   23   45:invokespecial   #1044 <Method void setError(CharSequence, boolean)>
	//   24   48:return          
	}

	public void setErrorEnabled(boolean flag)
	{
		if(mErrorEnabled == flag) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field boolean mErrorEnabled>
	//    2    4:iload_1         
	//    3    5:icmpeq          205
_L1:
		if(mErrorView != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #619 <Field TextView mErrorView>
	//*   6   12:ifnull          25
			mErrorView.animate().cancel();
	//    7   15:aload_0         
	//    8   16:getfield        #619 <Field TextView mErrorView>
	//    9   19:invokevirtual   #625 <Method ViewPropertyAnimator TextView.animate()>
	//   10   22:invokevirtual   #628 <Method void ViewPropertyAnimator.cancel()>
		if(!flag) goto _L4; else goto _L3
	//   11   25:iload_1         
	//   12   26:ifeq            178
_L3:
		mErrorView = ((TextView) (new AppCompatTextView(getContext())));
	//   13   29:aload_0         
	//   14   30:new             #995 <Class AppCompatTextView>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokevirtual   #340 <Method Context getContext()>
	//   18   38:invokespecial   #996 <Method void AppCompatTextView(Context)>
	//   19   41:putfield        #619 <Field TextView mErrorView>
		mErrorView.setId(android.support.design.R.id.textinput_error);
	//   20   44:aload_0         
	//   21   45:getfield        #619 <Field TextView mErrorView>
	//   22   48:getstatic       #1047 <Field int android.support.design.R$id.textinput_error>
	//   23   51:invokevirtual   #1004 <Method void TextView.setId(int)>
		if(mTypeface != null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #910 <Field Typeface mTypeface>
	//*  26   58:ifnull          72
			mErrorView.setTypeface(mTypeface);
	//   27   61:aload_0         
	//   28   62:getfield        #619 <Field TextView mErrorView>
	//   29   65:aload_0         
	//   30   66:getfield        #910 <Field Typeface mTypeface>
	//   31   69:invokevirtual   #1006 <Method void TextView.setTypeface(Typeface)>
		TextViewCompat.setTextAppearance(mErrorView, mErrorTextAppearance);
	//   32   72:aload_0         
	//   33   73:getfield        #619 <Field TextView mErrorView>
	//   34   76:aload_0         
	//   35   77:getfield        #230 <Field int mErrorTextAppearance>
	//   36   80:invokestatic    #1012 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		if(android.os.Build.VERSION.SDK_INT < 23) goto _L6; else goto _L5
	//   37   83:getstatic       #443 <Field int android.os.Build$VERSION.SDK_INT>
	//   38   86:bipush          23
	//   39   88:icmplt          112
_L5:
		int i = mErrorView.getTextColors().getDefaultColor();
	//   40   91:aload_0         
	//   41   92:getfield        #619 <Field TextView mErrorView>
	//   42   95:invokevirtual   #1050 <Method ColorStateList TextView.getTextColors()>
	//   43   98:invokevirtual   #1055 <Method int ColorStateList.getDefaultColor()>
	//   44  101:istore_2        
		if(i != -65281) goto _L6; else goto _L7
	//   45  102:iload_2         
	//   46  103:ldc2            #1056 <Int -65281>
	//   47  106:icmpne          112
	//*  48  109:goto            117
_L6:
		boolean flag1 = false;
	//   49  112:iconst_0        
	//   50  113:istore_2        
		  goto _L8
	//*  51  114:goto            119
_L7:
		flag1 = true;
	//   52  117:iconst_1        
	//   53  118:istore_2        
_L8:
		if(flag1)
	//*  54  119:iload_2         
	//*  55  120:ifeq            150
		{
			TextViewCompat.setTextAppearance(mErrorView, android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Caption);
	//   56  123:aload_0         
	//   57  124:getfield        #619 <Field TextView mErrorView>
	//   58  127:getstatic       #1017 <Field int android.support.v7.appcompat.R$style.TextAppearance_AppCompat_Caption>
	//   59  130:invokestatic    #1012 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			mErrorView.setTextColor(ContextCompat.getColor(getContext(), android.support.v7.appcompat.R.color.error_color_material));
	//   60  133:aload_0         
	//   61  134:getfield        #619 <Field TextView mErrorView>
	//   62  137:aload_0         
	//   63  138:invokevirtual   #340 <Method Context getContext()>
	//   64  141:getstatic       #1022 <Field int android.support.v7.appcompat.R$color.error_color_material>
	//   65  144:invokestatic    #1028 <Method int ContextCompat.getColor(Context, int)>
	//   66  147:invokevirtual   #1031 <Method void TextView.setTextColor(int)>
		}
		mErrorView.setVisibility(4);
	//   67  150:aload_0         
	//   68  151:getfield        #619 <Field TextView mErrorView>
	//   69  154:iconst_4        
	//   70  155:invokevirtual   #632 <Method void TextView.setVisibility(int)>
		ViewCompat.setAccessibilityLiveRegion(((View) (mErrorView)), 1);
	//   71  158:aload_0         
	//   72  159:getfield        #619 <Field TextView mErrorView>
	//   73  162:iconst_1        
	//   74  163:invokestatic    #1059 <Method void ViewCompat.setAccessibilityLiveRegion(View, int)>
		addIndicator(mErrorView, 0);
	//   75  166:aload_0         
	//   76  167:aload_0         
	//   77  168:getfield        #619 <Field TextView mErrorView>
	//   78  171:iconst_0        
	//   79  172:invokespecial   #1033 <Method void addIndicator(TextView, int)>
		  goto _L9
	//*  80  175:goto            200
_L4:
		mErrorShown = false;
	//   81  178:aload_0         
	//   82  179:iconst_0        
	//   83  180:putfield        #617 <Field boolean mErrorShown>
		updateEditTextBackground();
	//   84  183:aload_0         
	//   85  184:invokespecial   #675 <Method void updateEditTextBackground()>
		removeIndicator(mErrorView);
	//   86  187:aload_0         
	//   87  188:aload_0         
	//   88  189:getfield        #619 <Field TextView mErrorView>
	//   89  192:invokespecial   #1035 <Method void removeIndicator(TextView)>
		mErrorView = null;
	//   90  195:aload_0         
	//   91  196:aconst_null     
	//   92  197:putfield        #619 <Field TextView mErrorView>
_L9:
		mErrorEnabled = flag;
	//   93  200:aload_0         
	//   94  201:iload_1         
	//   95  202:putfield        #615 <Field boolean mErrorEnabled>
_L2:
		return;
	//   96  205:return          
		Exception exception;
		exception;
	//   97  206:astore_3        
		if(true) goto _L7; else goto _L10
_L10:
	//*  98  207:goto            117
	}

	public void setErrorTextAppearance(int i)
	{
		mErrorTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #230 <Field int mErrorTextAppearance>
		if(mErrorView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #619 <Field TextView mErrorView>
	//*   5    9:ifnull          20
			TextViewCompat.setTextAppearance(mErrorView, i);
	//    6   12:aload_0         
	//    7   13:getfield        #619 <Field TextView mErrorView>
	//    8   16:iload_1         
	//    9   17:invokestatic    #1012 <Method void TextViewCompat.setTextAppearance(TextView, int)>
	//   10   20:return          
	}

	public void setHint(CharSequence charsequence)
	{
		if(mHintEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field boolean mHintEnabled>
	//*   2    4:ifeq            19
		{
			setHintInternal(charsequence);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1063 <Method void setHintInternal(CharSequence)>
			sendAccessibilityEvent(2048);
	//    6   12:aload_0         
	//    7   13:sipush          2048
	//    8   16:invokevirtual   #1066 <Method void sendAccessibilityEvent(int)>
		}
	//    9   19:return          
	}

	public void setHintAnimationEnabled(boolean flag)
	{
		mHintAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #200 <Field boolean mHintAnimationEnabled>
	//    3    5:return          
	}

	public void setHintEnabled(boolean flag)
	{
		if(flag != mHintEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #184 <Field boolean mHintEnabled>
	//*   3    5:icmpeq          105
		{
			mHintEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #184 <Field boolean mHintEnabled>
			CharSequence charsequence = mEditText.getHint();
	//    7   13:aload_0         
	//    8   14:getfield        #358 <Field EditText mEditText>
	//    9   17:invokevirtual   #585 <Method CharSequence EditText.getHint()>
	//   10   20:astore_2        
			if(!mHintEnabled)
	//*  11   21:aload_0         
	//*  12   22:getfield        #184 <Field boolean mHintEnabled>
	//*  13   25:ifne            64
			{
				if(!TextUtils.isEmpty(mHint) && TextUtils.isEmpty(charsequence))
	//*  14   28:aload_0         
	//*  15   29:getfield        #575 <Field CharSequence mHint>
	//*  16   32:invokestatic    #581 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   35:ifne            56
	//*  18   38:aload_2         
	//*  19   39:invokestatic    #581 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   42:ifeq            56
					mEditText.setHint(mHint);
	//   21   45:aload_0         
	//   22   46:getfield        #358 <Field EditText mEditText>
	//   23   49:aload_0         
	//   24   50:getfield        #575 <Field CharSequence mHint>
	//   25   53:invokevirtual   #588 <Method void EditText.setHint(CharSequence)>
				setHintInternal(((CharSequence) (null)));
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:invokespecial   #1063 <Method void setHintInternal(CharSequence)>
			} else
	//*  29   61:goto            94
			if(!TextUtils.isEmpty(charsequence))
	//*  30   64:aload_2         
	//*  31   65:invokestatic    #581 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   68:ifne            94
			{
				if(TextUtils.isEmpty(mHint))
	//*  33   71:aload_0         
	//*  34   72:getfield        #575 <Field CharSequence mHint>
	//*  35   75:invokestatic    #581 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  36   78:ifeq            86
					setHint(charsequence);
	//   37   81:aload_0         
	//   38   82:aload_2         
	//   39   83:invokevirtual   #195 <Method void setHint(CharSequence)>
				mEditText.setHint(((CharSequence) (null)));
	//   40   86:aload_0         
	//   41   87:getfield        #358 <Field EditText mEditText>
	//   42   90:aconst_null     
	//   43   91:invokevirtual   #588 <Method void EditText.setHint(CharSequence)>
			}
			if(mEditText != null)
	//*  44   94:aload_0         
	//*  45   95:getfield        #358 <Field EditText mEditText>
	//*  46   98:ifnull          105
				updateInputLayoutMargins();
	//   47  101:aload_0         
	//   48  102:invokespecial   #832 <Method void updateInputLayoutMargins()>
		}
	//   49  105:return          
	}

	public void setHintTextAppearance(int i)
	{
		mCollapsingTextHelper.setCollapsedTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1071 <Method void CollapsingTextHelper.setCollapsedTextAppearance(int)>
		mFocusedTextColor = mCollapsingTextHelper.getCollapsedTextColor();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//    7   13:invokevirtual   #1074 <Method ColorStateList CollapsingTextHelper.getCollapsedTextColor()>
	//    8   16:putfield        #213 <Field ColorStateList mFocusedTextColor>
		if(mEditText != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #358 <Field EditText mEditText>
	//*  11   23:ifnull          35
		{
			updateLabelState(false);
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #677 <Method void updateLabelState(boolean)>
			updateInputLayoutMargins();
	//   15   31:aload_0         
	//   16   32:invokespecial   #832 <Method void updateInputLayoutMargins()>
		}
	//   17   35:return          
	}

	public void setPasswordVisibilityToggleContentDescription(int i)
	{
		CharSequence charsequence;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			charsequence = getResources().getText(i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1080 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1083 <Method CharSequence Resources.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			charsequence = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleContentDescription(charsequence);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1085 <Method void setPasswordVisibilityToggleContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleContentDescription(CharSequence charsequence)
	{
		mPasswordToggleContentDesc = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #274 <Field CharSequence mPasswordToggleContentDesc>
		if(mPasswordToggleView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//*   5    9:ifnull          20
			mPasswordToggleView.setContentDescription(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #767 <Method void CheckableImageButton.setContentDescription(CharSequence)>
	//   10   20:return          
	}

	public void setPasswordVisibilityToggleDrawable(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #340 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1092 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleDrawable(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1094 <Method void setPasswordVisibilityToggleDrawable(Drawable)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleDrawable(Drawable drawable)
	{
		mPasswordToggleDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #269 <Field Drawable mPasswordToggleDrawable>
		if(mPasswordToggleView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//*   5    9:ifnull          20
			mPasswordToggleView.setImageDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #406 <Field CheckableImageButton mPasswordToggleView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #414 <Method void CheckableImageButton.setImageDrawable(Drawable)>
	//   10   20:return          
	}

	public void setPasswordVisibilityToggleEnabled(boolean flag)
	{
		if(mPasswordToggleEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #260 <Field boolean mPasswordToggleEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          50
		{
			mPasswordToggleEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #260 <Field boolean mPasswordToggleEnabled>
			if(!flag && mPasswordToggledVisible && mEditText != null)
	//*   7   13:iload_1         
	//*   8   14:ifne            41
	//*   9   17:aload_0         
	//*  10   18:getfield        #488 <Field boolean mPasswordToggledVisible>
	//*  11   21:ifeq            41
	//*  12   24:aload_0         
	//*  13   25:getfield        #358 <Field EditText mEditText>
	//*  14   28:ifnull          41
				mEditText.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   15   31:aload_0         
	//   16   32:getfield        #358 <Field EditText mEditText>
	//   17   35:invokestatic    #492 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   18   38:invokevirtual   #486 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
			mPasswordToggledVisible = false;
	//   19   41:aload_0         
	//   20   42:iconst_0        
	//   21   43:putfield        #488 <Field boolean mPasswordToggledVisible>
			updatePasswordToggleView();
	//   22   46:aload_0         
	//   23   47:invokespecial   #604 <Method void updatePasswordToggleView()>
		}
	//   24   50:return          
	}

	public void setPasswordVisibilityToggleTintList(ColorStateList colorstatelist)
	{
		mPasswordToggleTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #281 <Field ColorStateList mPasswordToggleTintList>
		mHasPasswordToggleTintList = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #279 <Field boolean mHasPasswordToggleTintList>
		applyPasswordToggleTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #306 <Method void applyPasswordToggleTint()>
	//    8   14:return          
	}

	public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mPasswordToggleTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #294 <Field android.graphics.PorterDuff$Mode mPasswordToggleTintMode>
		mHasPasswordToggleTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #286 <Field boolean mHasPasswordToggleTintMode>
		applyPasswordToggleTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #306 <Method void applyPasswordToggleTint()>
	//    8   14:return          
	}

	public void setTypeface(Typeface typeface)
	{
		if(mTypeface != null && !mTypeface.equals(((Object) (typeface))) || mTypeface == null && typeface != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #910 <Field Typeface mTypeface>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #910 <Field Typeface mTypeface>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #1104 <Method boolean Typeface.equals(Object)>
	//*   7   15:ifeq            29
	//*   8   18:aload_0         
	//*   9   19:getfield        #910 <Field Typeface mTypeface>
	//*  10   22:ifnonnull       72
	//*  11   25:aload_1         
	//*  12   26:ifnull          72
		{
			mTypeface = typeface;
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:putfield        #910 <Field Typeface mTypeface>
			mCollapsingTextHelper.setTypefaces(typeface);
	//   16   34:aload_0         
	//   17   35:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #551 <Method void CollapsingTextHelper.setTypefaces(Typeface)>
			if(mCounterView != null)
	//*  20   42:aload_0         
	//*  21   43:getfield        #590 <Field TextView mCounterView>
	//*  22   46:ifnull          57
				mCounterView.setTypeface(typeface);
	//   23   49:aload_0         
	//   24   50:getfield        #590 <Field TextView mCounterView>
	//   25   53:aload_1         
	//   26   54:invokevirtual   #1006 <Method void TextView.setTypeface(Typeface)>
			if(mErrorView != null)
	//*  27   57:aload_0         
	//*  28   58:getfield        #619 <Field TextView mErrorView>
	//*  29   61:ifnull          72
				mErrorView.setTypeface(typeface);
	//   30   64:aload_0         
	//   31   65:getfield        #619 <Field TextView mErrorView>
	//   32   68:aload_1         
	//   33   69:invokevirtual   #1006 <Method void TextView.setTypeface(Typeface)>
		}
	//   34   72:return          
	}

	void updateCounter(int i)
	{
		boolean flag1 = mCounterOverflowed;
	//    0    0:aload_0         
	//    1    1:getfield        #709 <Field boolean mCounterOverflowed>
	//    2    4:istore          4
		if(mCounterMaxLength == -1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #902 <Field int mCounterMaxLength>
	//*   5   10:iconst_m1       
	//*   6   11:icmpne          33
		{
			mCounterView.setText(((CharSequence) (String.valueOf(i))));
	//    7   14:aload_0         
	//    8   15:getfield        #590 <Field TextView mCounterView>
	//    9   18:iload_1         
	//   10   19:invokestatic    #1110 <Method String String.valueOf(int)>
	//   11   22:invokevirtual   #631 <Method void TextView.setText(CharSequence)>
			mCounterOverflowed = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #709 <Field boolean mCounterOverflowed>
		} else
	//*  15   30:goto            132
		{
			boolean flag;
			if(i > mCounterMaxLength)
	//*  16   33:iload_1         
	//*  17   34:aload_0         
	//*  18   35:getfield        #902 <Field int mCounterMaxLength>
	//*  19   38:icmple          46
				flag = true;
	//   20   41:iconst_1        
	//   21   42:istore_3        
			else
	//*  22   43:goto            48
				flag = false;
	//   23   46:iconst_0        
	//   24   47:istore_3        
			mCounterOverflowed = flag;
	//   25   48:aload_0         
	//   26   49:iload_3         
	//   27   50:putfield        #709 <Field boolean mCounterOverflowed>
			if(flag1 != mCounterOverflowed)
	//*  28   53:iload           4
	//*  29   55:aload_0         
	//*  30   56:getfield        #709 <Field boolean mCounterOverflowed>
	//*  31   59:icmpeq          94
			{
				TextView textview = mCounterView;
	//   32   62:aload_0         
	//   33   63:getfield        #590 <Field TextView mCounterView>
	//   34   66:astore          5
				int j;
				if(mCounterOverflowed)
	//*  35   68:aload_0         
	//*  36   69:getfield        #709 <Field boolean mCounterOverflowed>
	//*  37   72:ifeq            83
					j = mCounterOverflowTextAppearance;
	//   38   75:aload_0         
	//   39   76:getfield        #255 <Field int mCounterOverflowTextAppearance>
	//   40   79:istore_2        
				else
	//*  41   80:goto            88
					j = mCounterTextAppearance;
	//   42   83:aload_0         
	//   43   84:getfield        #250 <Field int mCounterTextAppearance>
	//   44   87:istore_2        
				TextViewCompat.setTextAppearance(textview, j);
	//   45   88:aload           5
	//   46   90:iload_2         
	//   47   91:invokestatic    #1012 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			}
			mCounterView.setText(((CharSequence) (getContext().getString(android.support.design.R.string.character_counter_pattern, new Object[] {
				Integer.valueOf(i), Integer.valueOf(mCounterMaxLength)
			}))));
	//   48   94:aload_0         
	//   49   95:getfield        #590 <Field TextView mCounterView>
	//   50   98:aload_0         
	//   51   99:invokevirtual   #340 <Method Context getContext()>
	//   52  102:getstatic       #1115 <Field int android.support.design.R$string.character_counter_pattern>
	//   53  105:iconst_2        
	//   54  106:anewarray       Object[]
	//   55  109:dup             
	//   56  110:iconst_0        
	//   57  111:iload_1         
	//   58  112:invokestatic    #1122 <Method Integer Integer.valueOf(int)>
	//   59  115:aastore         
	//   60  116:dup             
	//   61  117:iconst_1        
	//   62  118:aload_0         
	//   63  119:getfield        #902 <Field int mCounterMaxLength>
	//   64  122:invokestatic    #1122 <Method Integer Integer.valueOf(int)>
	//   65  125:aastore         
	//   66  126:invokevirtual   #1128 <Method String Context.getString(int, Object[])>
	//   67  129:invokevirtual   #631 <Method void TextView.setText(CharSequence)>
		}
		if(mEditText != null && flag1 != mCounterOverflowed)
	//*  68  132:aload_0         
	//*  69  133:getfield        #358 <Field EditText mEditText>
	//*  70  136:ifnull          157
	//*  71  139:iload           4
	//*  72  141:aload_0         
	//*  73  142:getfield        #709 <Field boolean mCounterOverflowed>
	//*  74  145:icmpeq          157
		{
			updateLabelState(false);
	//   75  148:aload_0         
	//   76  149:iconst_0        
	//   77  150:invokevirtual   #677 <Method void updateLabelState(boolean)>
			updateEditTextBackground();
	//   78  153:aload_0         
	//   79  154:invokespecial   #675 <Method void updateEditTextBackground()>
		}
	//   80  157:return          
	}

	void updateLabelState(boolean flag)
	{
		updateLabelState(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #608 <Method void updateLabelState(boolean, boolean)>
	//    4    6:return          
	}

	void updateLabelState(boolean flag, boolean flag1)
	{
		boolean flag3 = isEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #892 <Method boolean isEnabled()>
	//    2    4:istore          4
		boolean flag2;
		if(mEditText != null && !TextUtils.isEmpty(((CharSequence) (mEditText.getText()))))
	//*   3    6:aload_0         
	//*   4    7:getfield        #358 <Field EditText mEditText>
	//*   5   10:ifnull          31
	//*   6   13:aload_0         
	//*   7   14:getfield        #358 <Field EditText mEditText>
	//*   8   17:invokevirtual   #593 <Method Editable EditText.getText()>
	//*   9   20:invokestatic    #581 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   23:ifne            31
			flag2 = true;
	//   11   26:iconst_1        
	//   12   27:istore_3        
		else
	//*  13   28:goto            33
			flag2 = false;
	//   14   31:iconst_0        
	//   15   32:istore_3        
		boolean flag4 = arrayContains(getDrawableState(), 0x101009c);
	//   16   33:aload_0         
	//   17   34:invokevirtual   #885 <Method int[] getDrawableState()>
	//   18   37:ldc2            #1129 <Int 0x101009c>
	//   19   40:invokestatic    #1131 <Method boolean arrayContains(int[], int)>
	//   20   43:istore          5
		boolean flag5 = TextUtils.isEmpty(getError());
	//   21   45:aload_0         
	//   22   46:invokevirtual   #991 <Method CharSequence getError()>
	//   23   49:invokestatic    #581 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   24   52:istore          6
		if(mDefaultTextColor != null)
	//*  25   54:aload_0         
	//*  26   55:getfield        #215 <Field ColorStateList mDefaultTextColor>
	//*  27   58:ifnull          72
			mCollapsingTextHelper.setExpandedTextColor(mDefaultTextColor);
	//   28   61:aload_0         
	//   29   62:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   30   65:aload_0         
	//   31   66:getfield        #215 <Field ColorStateList mDefaultTextColor>
	//   32   69:invokevirtual   #1134 <Method void CollapsingTextHelper.setExpandedTextColor(ColorStateList)>
		if(flag3 && mCounterOverflowed && mCounterView != null)
	//*  33   72:iload           4
	//*  34   74:ifeq            108
	//*  35   77:aload_0         
	//*  36   78:getfield        #709 <Field boolean mCounterOverflowed>
	//*  37   81:ifeq            108
	//*  38   84:aload_0         
	//*  39   85:getfield        #590 <Field TextView mCounterView>
	//*  40   88:ifnull          108
			mCollapsingTextHelper.setCollapsedTextColor(mCounterView.getTextColors());
	//   41   91:aload_0         
	//   42   92:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   43   95:aload_0         
	//   44   96:getfield        #590 <Field TextView mCounterView>
	//   45   99:invokevirtual   #1050 <Method ColorStateList TextView.getTextColors()>
	//   46  102:invokevirtual   #1137 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
		else
	//*  47  105:goto            157
		if(flag3 && flag4 && mFocusedTextColor != null)
	//*  48  108:iload           4
	//*  49  110:ifeq            139
	//*  50  113:iload           5
	//*  51  115:ifeq            139
	//*  52  118:aload_0         
	//*  53  119:getfield        #213 <Field ColorStateList mFocusedTextColor>
	//*  54  122:ifnull          139
			mCollapsingTextHelper.setCollapsedTextColor(mFocusedTextColor);
	//   55  125:aload_0         
	//   56  126:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   57  129:aload_0         
	//   58  130:getfield        #213 <Field ColorStateList mFocusedTextColor>
	//   59  133:invokevirtual   #1137 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
		else
	//*  60  136:goto            157
		if(mDefaultTextColor != null)
	//*  61  139:aload_0         
	//*  62  140:getfield        #215 <Field ColorStateList mDefaultTextColor>
	//*  63  143:ifnull          157
			mCollapsingTextHelper.setCollapsedTextColor(mDefaultTextColor);
	//   64  146:aload_0         
	//   65  147:getfield        #113 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   66  150:aload_0         
	//   67  151:getfield        #215 <Field ColorStateList mDefaultTextColor>
	//   68  154:invokevirtual   #1137 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
		if(!flag2 && (!isEnabled() || !flag4 && !(true ^ flag5)))
	//*  69  157:iload_3         
	//*  70  158:ifne            200
	//*  71  161:aload_0         
	//*  72  162:invokevirtual   #892 <Method boolean isEnabled()>
	//*  73  165:ifeq            183
	//*  74  168:iload           5
	//*  75  170:ifne            200
	//*  76  173:iconst_1        
	//*  77  174:iload           6
	//*  78  176:ixor            
	//*  79  177:ifeq            183
	//*  80  180:goto            200
		{
			if(flag1 || !mHintExpanded)
	//*  81  183:iload_2         
	//*  82  184:ifne            194
	//*  83  187:aload_0         
	//*  84  188:getfield        #437 <Field boolean mHintExpanded>
	//*  85  191:ifne            216
			{
				expandHint(flag);
	//   86  194:aload_0         
	//   87  195:iload_1         
	//   88  196:invokespecial   #1139 <Method void expandHint(boolean)>
				return;
	//   89  199:return          
			}
		} else
		if(flag1 || mHintExpanded)
	//*  90  200:iload_2         
	//*  91  201:ifne            211
	//*  92  204:aload_0         
	//*  93  205:getfield        #437 <Field boolean mHintExpanded>
	//*  94  208:ifeq            216
			collapseHint(flag);
	//   95  211:aload_0         
	//   96  212:iload_1         
	//   97  213:invokespecial   #1141 <Method void collapseHint(boolean)>
	//   98  216:return          
	}

	private static final int ANIMATION_DURATION = 200;
	private static final int INVALID_MAX_LENGTH = -1;
	private static final String LOG_TAG = "TextInputLayout";
	private ValueAnimator mAnimator;
	final CollapsingTextHelper mCollapsingTextHelper;
	boolean mCounterEnabled;
	private int mCounterMaxLength;
	private int mCounterOverflowTextAppearance;
	private boolean mCounterOverflowed;
	private int mCounterTextAppearance;
	private TextView mCounterView;
	private ColorStateList mDefaultTextColor;
	EditText mEditText;
	private CharSequence mError;
	private boolean mErrorEnabled;
	private boolean mErrorShown;
	private int mErrorTextAppearance;
	TextView mErrorView;
	private ColorStateList mFocusedTextColor;
	private boolean mHasPasswordToggleTintList;
	private boolean mHasPasswordToggleTintMode;
	private boolean mHasReconstructedEditTextBackground;
	private CharSequence mHint;
	private boolean mHintAnimationEnabled;
	private boolean mHintEnabled;
	private boolean mHintExpanded;
	private boolean mInDrawableStateChanged;
	private LinearLayout mIndicatorArea;
	private int mIndicatorsAdded;
	private final FrameLayout mInputFrame;
	private Drawable mOriginalEditTextEndDrawable;
	private CharSequence mOriginalHint;
	private CharSequence mPasswordToggleContentDesc;
	private Drawable mPasswordToggleDrawable;
	private Drawable mPasswordToggleDummyDrawable;
	private boolean mPasswordToggleEnabled;
	private ColorStateList mPasswordToggleTintList;
	private android.graphics.PorterDuff.Mode mPasswordToggleTintMode;
	private CheckableImageButton mPasswordToggleView;
	private boolean mPasswordToggledVisible;
	private boolean mRestoringSavedState;
	private Paint mTmpPaint;
	private final Rect mTmpRect;
	private Typeface mTypeface;


/*
	static boolean access$000(TextInputLayout textinputlayout)
	{
		return textinputlayout.mRestoringSavedState;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field boolean mRestoringSavedState>
	//    2    4:ireturn         
	}

*/


/*
	static void access$100(TextInputLayout textinputlayout, boolean flag)
	{
		textinputlayout.passwordVisibilityToggleRequested(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #332 <Method void passwordVisibilityToggleRequested(boolean)>
		return;
	//    3    5:return          
	}

*/
}
