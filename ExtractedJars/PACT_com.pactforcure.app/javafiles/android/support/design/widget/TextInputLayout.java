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
import android.support.v4.widget.Space;
import android.support.v4.widget.TextViewCompat;
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
//			CheckableImageButton, DrawableUtils, TextInputEditText, ViewGroupUtils

public class TextInputLayout extends LinearLayout
{
	static class SavedState extends AbsSavedState
	{

		public String toString()
		{
			return (new StringBuilder()).append("TextInputLayout.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" error=").append(((Object) (error))).append("}").toString();
		//    0    0:new             #57  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void StringBuilder()>
		//    3    7:ldc1            #60  <String "TextInputLayout.SavedState{">
		//    4    9:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:invokestatic    #70  <Method int System.identityHashCode(Object)>
		//    7   16:invokestatic    #76  <Method String Integer.toHexString(int)>
		//    8   19:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #78  <String " error=">
		//   10   24:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_0         
		//   12   28:getfield        #42  <Field CharSequence error>
		//   13   31:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
		//   14   34:ldc1            #83  <String "}">
		//   15   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #85  <Method String StringBuilder.toString()>
		//   17   42:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #89  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			TextUtils.writeToParcel(error, parcel, i);
		//    4    6:aload_0         
		//    5    7:getfield        #42  <Field CharSequence error>
		//    6   10:aload_1         
		//    7   11:iload_2         
		//    8   12:invokestatic    #92  <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			if(isPasswordToggledVisible)
		//*   9   15:aload_0         
		//*  10   16:getfield        #50  <Field boolean isPasswordToggledVisible>
		//*  11   19:ifeq            30
				i = 1;
		//   12   22:iconst_1        
		//   13   23:istore_2        
			else
		//*  14   24:aload_1         
		//*  15   25:iload_2         
		//*  16   26:invokevirtual   #96  <Method void Parcel.writeInt(int)>
		//*  17   29:return          
				i = 0;
		//   18   30:iconst_0        
		//   19   31:istore_2        
			parcel.writeInt(i);
		//*  20   32:goto            24
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
			boolean flag;
			if(parcel.readInt() == 1)
		//*  10   22:aload_1         
		//*  11   23:invokevirtual   #48  <Method int Parcel.readInt()>
		//*  12   26:iconst_1        
		//*  13   27:icmpne          38
				flag = true;
		//   14   30:iconst_1        
		//   15   31:istore_3        
			else
		//*  16   32:aload_0         
		//*  17   33:iload_3         
		//*  18   34:putfield        #50  <Field boolean isPasswordToggledVisible>
		//*  19   37:return          
				flag = false;
		//   20   38:iconst_0        
		//   21   39:istore_3        
			isPasswordToggledVisible = flag;
		//*  22   40:goto            32
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
		//*  31   66:ifnull          98
				view = ((View) (mErrorView.getText()));
		//   32   69:aload_0         
		//   33   70:getfield        #13  <Field TextInputLayout this$0>
		//   34   73:getfield        #71  <Field TextView TextInputLayout.mErrorView>
		//   35   76:invokevirtual   #74  <Method CharSequence TextView.getText()>
		//   36   79:astore_1        
			else
		//*  37   80:aload_1         
		//*  38   81:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  39   84:ifne            97
		//*  40   87:aload_2         
		//*  41   88:iconst_1        
		//*  42   89:invokevirtual   #78  <Method void AccessibilityNodeInfoCompat.setContentInvalid(boolean)>
		//*  43   92:aload_2         
		//*  44   93:aload_1         
		//*  45   94:invokevirtual   #81  <Method void AccessibilityNodeInfoCompat.setError(CharSequence)>
		//*  46   97:return          
				view = null;
		//   47   98:aconst_null     
		//   48   99:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (view))))
			{
				accessibilitynodeinfocompat.setContentInvalid(true);
				accessibilitynodeinfocompat.setError(((CharSequence) (view)));
			}
		//*  49  100:goto            80
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
	//    3    3:invokespecial   #92  <Method void TextInputLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #96  <Method void TextInputLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #97  <Method void LinearLayout(Context, AttributeSet)>
		mTmpRect = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #99  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #102 <Method void Rect()>
	//    8   14:putfield        #104 <Field Rect mTmpRect>
		mCollapsingTextHelper = new CollapsingTextHelper(((View) (this)));
	//    9   17:aload_0         
	//   10   18:new             #106 <Class CollapsingTextHelper>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #109 <Method void CollapsingTextHelper(View)>
	//   14   26:putfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
		ThemeUtils.checkAppCompatTheme(context);
	//   15   29:aload_1         
	//   16   30:invokestatic    #116 <Method void ThemeUtils.checkAppCompatTheme(Context)>
		setOrientation(1);
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #120 <Method void setOrientation(int)>
		setWillNotDraw(false);
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #124 <Method void setWillNotDraw(boolean)>
		setAddStatesFromChildren(true);
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:invokevirtual   #127 <Method void setAddStatesFromChildren(boolean)>
		mInputFrame = new FrameLayout(context);
	//   26   48:aload_0         
	//   27   49:new             #129 <Class FrameLayout>
	//   28   52:dup             
	//   29   53:aload_1         
	//   30   54:invokespecial   #131 <Method void FrameLayout(Context)>
	//   31   57:putfield        #133 <Field FrameLayout mInputFrame>
		mInputFrame.setAddStatesFromChildren(true);
	//   32   60:aload_0         
	//   33   61:getfield        #133 <Field FrameLayout mInputFrame>
	//   34   64:iconst_1        
	//   35   65:invokevirtual   #134 <Method void FrameLayout.setAddStatesFromChildren(boolean)>
		addView(((View) (mInputFrame)));
	//   36   68:aload_0         
	//   37   69:aload_0         
	//   38   70:getfield        #133 <Field FrameLayout mInputFrame>
	//   39   73:invokevirtual   #137 <Method void addView(View)>
		mCollapsingTextHelper.setTextSizeInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
	//   40   76:aload_0         
	//   41   77:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   42   80:getstatic       #143 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   43   83:invokevirtual   #147 <Method void CollapsingTextHelper.setTextSizeInterpolator(android.view.animation.Interpolator)>
		mCollapsingTextHelper.setPositionInterpolator(((android.view.animation.Interpolator) (new AccelerateInterpolator())));
	//   44   86:aload_0         
	//   45   87:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   46   90:new             #149 <Class AccelerateInterpolator>
	//   47   93:dup             
	//   48   94:invokespecial   #150 <Method void AccelerateInterpolator()>
	//   49   97:invokevirtual   #153 <Method void CollapsingTextHelper.setPositionInterpolator(android.view.animation.Interpolator)>
		mCollapsingTextHelper.setCollapsedTextGravity(0x800033);
	//   50  100:aload_0         
	//   51  101:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   52  104:ldc1            #154 <Int 0x800033>
	//   53  106:invokevirtual   #157 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.TextInputLayout, i, android.support.design.R.style.Widget_Design_TextInputLayout)));
	//   54  109:aload_1         
	//   55  110:aload_2         
	//   56  111:getstatic       #162 <Field int[] android.support.design.R$styleable.TextInputLayout>
	//   57  114:iload_3         
	//   58  115:getstatic       #167 <Field int android.support.design.R$style.Widget_Design_TextInputLayout>
	//   59  118:invokestatic    #173 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   60  121:astore_1        
		mHintEnabled = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_hintEnabled, true);
	//   61  122:aload_0         
	//   62  123:aload_1         
	//   63  124:getstatic       #176 <Field int android.support.design.R$styleable.TextInputLayout_hintEnabled>
	//   64  127:iconst_1        
	//   65  128:invokevirtual   #180 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   66  131:putfield        #182 <Field boolean mHintEnabled>
		setHint(((TintTypedArray) (context)).getText(android.support.design.R.styleable.TextInputLayout_android_hint));
	//   67  134:aload_0         
	//   68  135:aload_1         
	//   69  136:getstatic       #185 <Field int android.support.design.R$styleable.TextInputLayout_android_hint>
	//   70  139:invokevirtual   #189 <Method CharSequence TintTypedArray.getText(int)>
	//   71  142:invokevirtual   #193 <Method void setHint(CharSequence)>
		mHintAnimationEnabled = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_hintAnimationEnabled, true);
	//   72  145:aload_0         
	//   73  146:aload_1         
	//   74  147:getstatic       #196 <Field int android.support.design.R$styleable.TextInputLayout_hintAnimationEnabled>
	//   75  150:iconst_1        
	//   76  151:invokevirtual   #180 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   77  154:putfield        #198 <Field boolean mHintAnimationEnabled>
		if(((TintTypedArray) (context)).hasValue(android.support.design.R.styleable.TextInputLayout_android_textColorHint))
	//*  78  157:aload_1         
	//*  79  158:getstatic       #201 <Field int android.support.design.R$styleable.TextInputLayout_android_textColorHint>
	//*  80  161:invokevirtual   #205 <Method boolean TintTypedArray.hasValue(int)>
	//*  81  164:ifeq            185
		{
			attributeset = ((AttributeSet) (((TintTypedArray) (context)).getColorStateList(android.support.design.R.styleable.TextInputLayout_android_textColorHint)));
	//   82  167:aload_1         
	//   83  168:getstatic       #201 <Field int android.support.design.R$styleable.TextInputLayout_android_textColorHint>
	//   84  171:invokevirtual   #209 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   85  174:astore_2        
			mFocusedTextColor = ((ColorStateList) (attributeset));
	//   86  175:aload_0         
	//   87  176:aload_2         
	//   88  177:putfield        #211 <Field ColorStateList mFocusedTextColor>
			mDefaultTextColor = ((ColorStateList) (attributeset));
	//   89  180:aload_0         
	//   90  181:aload_2         
	//   91  182:putfield        #213 <Field ColorStateList mDefaultTextColor>
		}
		if(((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, -1) != -1)
	//*  92  185:aload_1         
	//*  93  186:getstatic       #216 <Field int android.support.design.R$styleable.TextInputLayout_hintTextAppearance>
	//*  94  189:iconst_m1       
	//*  95  190:invokevirtual   #220 <Method int TintTypedArray.getResourceId(int, int)>
	//*  96  193:iconst_m1       
	//*  97  194:icmpeq          209
			setHintTextAppearance(((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, 0));
	//   98  197:aload_0         
	//   99  198:aload_1         
	//  100  199:getstatic       #216 <Field int android.support.design.R$styleable.TextInputLayout_hintTextAppearance>
	//  101  202:iconst_0        
	//  102  203:invokevirtual   #220 <Method int TintTypedArray.getResourceId(int, int)>
	//  103  206:invokevirtual   #223 <Method void setHintTextAppearance(int)>
		mErrorTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_errorTextAppearance, 0);
	//  104  209:aload_0         
	//  105  210:aload_1         
	//  106  211:getstatic       #226 <Field int android.support.design.R$styleable.TextInputLayout_errorTextAppearance>
	//  107  214:iconst_0        
	//  108  215:invokevirtual   #220 <Method int TintTypedArray.getResourceId(int, int)>
	//  109  218:putfield        #228 <Field int mErrorTextAppearance>
		boolean flag = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_errorEnabled, false);
	//  110  221:aload_1         
	//  111  222:getstatic       #231 <Field int android.support.design.R$styleable.TextInputLayout_errorEnabled>
	//  112  225:iconst_0        
	//  113  226:invokevirtual   #180 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  114  229:istore          4
		boolean flag1 = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_counterEnabled, false);
	//  115  231:aload_1         
	//  116  232:getstatic       #234 <Field int android.support.design.R$styleable.TextInputLayout_counterEnabled>
	//  117  235:iconst_0        
	//  118  236:invokevirtual   #180 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  119  239:istore          5
		setCounterMaxLength(((TintTypedArray) (context)).getInt(android.support.design.R.styleable.TextInputLayout_counterMaxLength, -1));
	//  120  241:aload_0         
	//  121  242:aload_1         
	//  122  243:getstatic       #237 <Field int android.support.design.R$styleable.TextInputLayout_counterMaxLength>
	//  123  246:iconst_m1       
	//  124  247:invokevirtual   #240 <Method int TintTypedArray.getInt(int, int)>
	//  125  250:invokevirtual   #243 <Method void setCounterMaxLength(int)>
		mCounterTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_counterTextAppearance, 0);
	//  126  253:aload_0         
	//  127  254:aload_1         
	//  128  255:getstatic       #246 <Field int android.support.design.R$styleable.TextInputLayout_counterTextAppearance>
	//  129  258:iconst_0        
	//  130  259:invokevirtual   #220 <Method int TintTypedArray.getResourceId(int, int)>
	//  131  262:putfield        #248 <Field int mCounterTextAppearance>
		mCounterOverflowTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
	//  132  265:aload_0         
	//  133  266:aload_1         
	//  134  267:getstatic       #251 <Field int android.support.design.R$styleable.TextInputLayout_counterOverflowTextAppearance>
	//  135  270:iconst_0        
	//  136  271:invokevirtual   #220 <Method int TintTypedArray.getResourceId(int, int)>
	//  137  274:putfield        #253 <Field int mCounterOverflowTextAppearance>
		mPasswordToggleEnabled = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_passwordToggleEnabled, false);
	//  138  277:aload_0         
	//  139  278:aload_1         
	//  140  279:getstatic       #256 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleEnabled>
	//  141  282:iconst_0        
	//  142  283:invokevirtual   #180 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  143  286:putfield        #258 <Field boolean mPasswordToggleEnabled>
		mPasswordToggleDrawable = ((TintTypedArray) (context)).getDrawable(android.support.design.R.styleable.TextInputLayout_passwordToggleDrawable);
	//  144  289:aload_0         
	//  145  290:aload_1         
	//  146  291:getstatic       #261 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleDrawable>
	//  147  294:invokevirtual   #265 <Method Drawable TintTypedArray.getDrawable(int)>
	//  148  297:putfield        #267 <Field Drawable mPasswordToggleDrawable>
		mPasswordToggleContentDesc = ((TintTypedArray) (context)).getText(android.support.design.R.styleable.TextInputLayout_passwordToggleContentDescription);
	//  149  300:aload_0         
	//  150  301:aload_1         
	//  151  302:getstatic       #270 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleContentDescription>
	//  152  305:invokevirtual   #189 <Method CharSequence TintTypedArray.getText(int)>
	//  153  308:putfield        #272 <Field CharSequence mPasswordToggleContentDesc>
		if(((TintTypedArray) (context)).hasValue(android.support.design.R.styleable.TextInputLayout_passwordToggleTint))
	//* 154  311:aload_1         
	//* 155  312:getstatic       #275 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTint>
	//* 156  315:invokevirtual   #205 <Method boolean TintTypedArray.hasValue(int)>
	//* 157  318:ifeq            337
		{
			mHasPasswordToggleTintList = true;
	//  158  321:aload_0         
	//  159  322:iconst_1        
	//  160  323:putfield        #277 <Field boolean mHasPasswordToggleTintList>
			mPasswordToggleTintList = ((TintTypedArray) (context)).getColorStateList(android.support.design.R.styleable.TextInputLayout_passwordToggleTint);
	//  161  326:aload_0         
	//  162  327:aload_1         
	//  163  328:getstatic       #275 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTint>
	//  164  331:invokevirtual   #209 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  165  334:putfield        #279 <Field ColorStateList mPasswordToggleTintList>
		}
		if(((TintTypedArray) (context)).hasValue(android.support.design.R.styleable.TextInputLayout_passwordToggleTintMode))
	//* 166  337:aload_1         
	//* 167  338:getstatic       #282 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTintMode>
	//* 168  341:invokevirtual   #205 <Method boolean TintTypedArray.hasValue(int)>
	//* 169  344:ifeq            368
		{
			mHasPasswordToggleTintMode = true;
	//  170  347:aload_0         
	//  171  348:iconst_1        
	//  172  349:putfield        #284 <Field boolean mHasPasswordToggleTintMode>
			mPasswordToggleTintMode = ViewUtils.parseTintMode(((TintTypedArray) (context)).getInt(android.support.design.R.styleable.TextInputLayout_passwordToggleTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//  173  352:aload_0         
	//  174  353:aload_1         
	//  175  354:getstatic       #282 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTintMode>
	//  176  357:iconst_m1       
	//  177  358:invokevirtual   #240 <Method int TintTypedArray.getInt(int, int)>
	//  178  361:aconst_null     
	//  179  362:invokestatic    #290 <Method android.graphics.PorterDuff$Mode ViewUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  180  365:putfield        #292 <Field android.graphics.PorterDuff$Mode mPasswordToggleTintMode>
		}
		((TintTypedArray) (context)).recycle();
	//  181  368:aload_1         
	//  182  369:invokevirtual   #295 <Method void TintTypedArray.recycle()>
		setErrorEnabled(flag);
	//  183  372:aload_0         
	//  184  373:iload           4
	//  185  375:invokevirtual   #298 <Method void setErrorEnabled(boolean)>
		setCounterEnabled(flag1);
	//  186  378:aload_0         
	//  187  379:iload           5
	//  188  381:invokevirtual   #301 <Method void setCounterEnabled(boolean)>
		applyPasswordToggleTint();
	//  189  384:aload_0         
	//  190  385:invokespecial   #304 <Method void applyPasswordToggleTint()>
		if(ViewCompat.getImportantForAccessibility(((View) (this))) == 0)
	//* 191  388:aload_0         
	//* 192  389:invokestatic    #310 <Method int ViewCompat.getImportantForAccessibility(View)>
	//* 193  392:ifne            400
			ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//  194  395:aload_0         
	//  195  396:iconst_1        
	//  196  397:invokestatic    #314 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new TextInputAccessibilityDelegate())));
	//  197  400:aload_0         
	//  198  401:new             #21  <Class TextInputLayout$TextInputAccessibilityDelegate>
	//  199  404:dup             
	//  200  405:aload_0         
	//  201  406:invokespecial   #317 <Method void TextInputLayout$TextInputAccessibilityDelegate(TextInputLayout)>
	//  202  409:invokestatic    #321 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//  203  412:return          
	}

	private void addIndicator(TextView textview, int i)
	{
		if(mIndicatorArea == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #334 <Field LinearLayout mIndicatorArea>
	//*   2    4:ifnonnull       86
		{
			mIndicatorArea = new LinearLayout(getContext());
	//    3    7:aload_0         
	//    4    8:new             #4   <Class LinearLayout>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #338 <Method Context getContext()>
	//    8   16:invokespecial   #339 <Method void LinearLayout(Context)>
	//    9   19:putfield        #334 <Field LinearLayout mIndicatorArea>
			mIndicatorArea.setOrientation(0);
	//   10   22:aload_0         
	//   11   23:getfield        #334 <Field LinearLayout mIndicatorArea>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #340 <Method void LinearLayout.setOrientation(int)>
			addView(((View) (mIndicatorArea)), -1, -2);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #334 <Field LinearLayout mIndicatorArea>
	//   17   35:iconst_m1       
	//   18   36:bipush          -2
	//   19   38:invokevirtual   #343 <Method void addView(View, int, int)>
			Space space = new Space(getContext());
	//   20   41:new             #345 <Class Space>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokevirtual   #338 <Method Context getContext()>
	//   24   49:invokespecial   #346 <Method void Space(Context)>
	//   25   52:astore_3        
			android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, 0, 1.0F);
	//   26   53:new             #348 <Class android.widget.LinearLayout$LayoutParams>
	//   27   56:dup             
	//   28   57:iconst_0        
	//   29   58:iconst_0        
	//   30   59:fconst_1        
	//   31   60:invokespecial   #351 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   32   63:astore          4
			mIndicatorArea.addView(((View) (space)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   33   65:aload_0         
	//   34   66:getfield        #334 <Field LinearLayout mIndicatorArea>
	//   35   69:aload_3         
	//   36   70:aload           4
	//   37   72:invokevirtual   #354 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			if(mEditText != null)
	//*  38   75:aload_0         
	//*  39   76:getfield        #356 <Field EditText mEditText>
	//*  40   79:ifnull          86
				adjustIndicatorPadding();
	//   41   82:aload_0         
	//   42   83:invokespecial   #359 <Method void adjustIndicatorPadding()>
		}
		mIndicatorArea.setVisibility(0);
	//   43   86:aload_0         
	//   44   87:getfield        #334 <Field LinearLayout mIndicatorArea>
	//   45   90:iconst_0        
	//   46   91:invokevirtual   #362 <Method void LinearLayout.setVisibility(int)>
		mIndicatorArea.addView(((View) (textview)), i);
	//   47   94:aload_0         
	//   48   95:getfield        #334 <Field LinearLayout mIndicatorArea>
	//   49   98:aload_1         
	//   50   99:iload_2         
	//   51  100:invokevirtual   #364 <Method void LinearLayout.addView(View, int)>
		mIndicatorsAdded = mIndicatorsAdded + 1;
	//   52  103:aload_0         
	//   53  104:aload_0         
	//   54  105:getfield        #366 <Field int mIndicatorsAdded>
	//   55  108:iconst_1        
	//   56  109:iadd            
	//   57  110:putfield        #366 <Field int mIndicatorsAdded>
	//   58  113:return          
	}

	private void adjustIndicatorPadding()
	{
		ViewCompat.setPaddingRelative(((View) (mIndicatorArea)), ViewCompat.getPaddingStart(((View) (mEditText))), 0, ViewCompat.getPaddingEnd(((View) (mEditText))), mEditText.getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field LinearLayout mIndicatorArea>
	//    2    4:aload_0         
	//    3    5:getfield        #356 <Field EditText mEditText>
	//    4    8:invokestatic    #369 <Method int ViewCompat.getPaddingStart(View)>
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #356 <Field EditText mEditText>
	//    8   16:invokestatic    #372 <Method int ViewCompat.getPaddingEnd(View)>
	//    9   19:aload_0         
	//   10   20:getfield        #356 <Field EditText mEditText>
	//   11   23:invokevirtual   #378 <Method int EditText.getPaddingBottom()>
	//   12   26:invokestatic    #382 <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
	//   13   29:return          
	}

	private void applyPasswordToggleTint()
	{
		if(mPasswordToggleDrawable != null && (mHasPasswordToggleTintList || mHasPasswordToggleTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #267 <Field Drawable mPasswordToggleDrawable>
	//*   2    4:ifnull          103
	//*   3    7:aload_0         
	//*   4    8:getfield        #277 <Field boolean mHasPasswordToggleTintList>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #284 <Field boolean mHasPasswordToggleTintMode>
	//*   8   18:ifeq            103
		{
			mPasswordToggleDrawable = DrawableCompat.wrap(mPasswordToggleDrawable).mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #267 <Field Drawable mPasswordToggleDrawable>
	//   12   26:invokestatic    #388 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   13   29:invokevirtual   #394 <Method Drawable Drawable.mutate()>
	//   14   32:putfield        #267 <Field Drawable mPasswordToggleDrawable>
			if(mHasPasswordToggleTintList)
	//*  15   35:aload_0         
	//*  16   36:getfield        #277 <Field boolean mHasPasswordToggleTintList>
	//*  17   39:ifeq            53
				DrawableCompat.setTintList(mPasswordToggleDrawable, mPasswordToggleTintList);
	//   18   42:aload_0         
	//   19   43:getfield        #267 <Field Drawable mPasswordToggleDrawable>
	//   20   46:aload_0         
	//   21   47:getfield        #279 <Field ColorStateList mPasswordToggleTintList>
	//   22   50:invokestatic    #398 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasPasswordToggleTintMode)
	//*  23   53:aload_0         
	//*  24   54:getfield        #284 <Field boolean mHasPasswordToggleTintMode>
	//*  25   57:ifeq            71
				DrawableCompat.setTintMode(mPasswordToggleDrawable, mPasswordToggleTintMode);
	//   26   60:aload_0         
	//   27   61:getfield        #267 <Field Drawable mPasswordToggleDrawable>
	//   28   64:aload_0         
	//   29   65:getfield        #292 <Field android.graphics.PorterDuff$Mode mPasswordToggleTintMode>
	//   30   68:invokestatic    #402 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mPasswordToggleView != null && mPasswordToggleView.getDrawable() != mPasswordToggleDrawable)
	//*  31   71:aload_0         
	//*  32   72:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//*  33   75:ifnull          103
	//*  34   78:aload_0         
	//*  35   79:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//*  36   82:invokevirtual   #408 <Method Drawable CheckableImageButton.getDrawable()>
	//*  37   85:aload_0         
	//*  38   86:getfield        #267 <Field Drawable mPasswordToggleDrawable>
	//*  39   89:if_acmpeq       103
				mPasswordToggleView.setImageDrawable(mPasswordToggleDrawable);
	//   40   92:aload_0         
	//   41   93:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//   42   96:aload_0         
	//   43   97:getfield        #267 <Field Drawable mPasswordToggleDrawable>
	//   44  100:invokevirtual   #412 <Method void CheckableImageButton.setImageDrawable(Drawable)>
		}
	//   45  103:return          
	}

	private static boolean arrayContains(int ai[], int i)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int k = ai.length;
	//    2    3:aload_0         
	//    3    4:arraylength     
	//    4    5:istore_3        
		int j = 0;
	//    5    6:iconst_0        
	//    6    7:istore_2        
		do
		{
label0:
			{
				boolean flag = flag1;
	//    7    8:iload           5
	//    8   10:istore          4
				if(j < k)
	//*   9   12:iload_2         
	//*  10   13:iload_3         
	//*  11   14:icmpge          27
				{
					if(ai[j] != i)
						break label0;
	//   12   17:aload_0         
	//   13   18:iload_2         
	//   14   19:iaload          
	//   15   20:iload_1         
	//   16   21:icmpne          30
					flag = true;
	//   17   24:iconst_1        
	//   18   25:istore          4
				}
				return flag;
	//   19   27:iload           4
	//   20   29:ireturn         
			}
			j++;
	//   21   30:iload_2         
	//   22   31:iconst_1        
	//   23   32:iadd            
	//   24   33:istore_2        
		} while(true);
	//   25   34:goto            8
	}

	private void collapseHint(boolean flag)
	{
		if(mAnimator != null && mAnimator.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #417 <Field ValueAnimator mAnimator>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #417 <Field ValueAnimator mAnimator>
	//*   5   11:invokevirtual   #423 <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			mAnimator.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #417 <Field ValueAnimator mAnimator>
	//    9   21:invokevirtual   #426 <Method void ValueAnimator.cancel()>
		if(flag && mHintAnimationEnabled)
	//*  10   24:iload_1         
	//*  11   25:ifeq            46
	//*  12   28:aload_0         
	//*  13   29:getfield        #198 <Field boolean mHintAnimationEnabled>
	//*  14   32:ifeq            46
			animateToExpansionFraction(1.0F);
	//   15   35:aload_0         
	//   16   36:fconst_1        
	//   17   37:invokevirtual   #430 <Method void animateToExpansionFraction(float)>
		else
	//*  18   40:aload_0         
	//*  19   41:iconst_0        
	//*  20   42:putfield        #432 <Field boolean mHintExpanded>
	//*  21   45:return          
			mCollapsingTextHelper.setExpansionFraction(1.0F);
	//   22   46:aload_0         
	//   23   47:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   24   50:fconst_1        
	//   25   51:invokevirtual   #435 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		mHintExpanded = false;
	//*  26   54:goto            40
	}

	private void ensureBackgroundDrawableStateWorkaround()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #441 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		Drawable drawable;
		if(i == 21 || i == 22)
	//*   2    4:iload_1         
	//*   3    5:bipush          21
	//*   4    7:icmpeq          17
	//*   5   10:iload_1         
	//*   6   11:bipush          22
	//*   7   13:icmpeq          17
	//*   8   16:return          
	//*   9   17:aload_0         
	//*  10   18:getfield        #356 <Field EditText mEditText>
	//*  11   21:invokevirtual   #444 <Method Drawable EditText.getBackground()>
	//*  12   24:astore_2        
			if((drawable = mEditText.getBackground()) != null && !mHasReconstructedEditTextBackground)
	//*  13   25:aload_2         
	//*  14   26:ifnull          16
	//*  15   29:aload_0         
	//*  16   30:getfield        #446 <Field boolean mHasReconstructedEditTextBackground>
	//*  17   33:ifne            16
			{
				Drawable drawable1 = drawable.getConstantState().newDrawable();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #450 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   20   40:invokevirtual   #455 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   21   43:astore_3        
				if(drawable instanceof DrawableContainer)
	//*  22   44:aload_2         
	//*  23   45:instanceof      #457 <Class DrawableContainer>
	//*  24   48:ifeq            66
					mHasReconstructedEditTextBackground = DrawableUtils.setContainerConstantState((DrawableContainer)drawable, drawable1.getConstantState());
	//   25   51:aload_0         
	//   26   52:aload_2         
	//   27   53:checkcast       #457 <Class DrawableContainer>
	//   28   56:aload_3         
	//   29   57:invokevirtual   #450 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   30   60:invokestatic    #463 <Method boolean DrawableUtils.setContainerConstantState(DrawableContainer, android.graphics.drawable.Drawable$ConstantState)>
	//   31   63:putfield        #446 <Field boolean mHasReconstructedEditTextBackground>
				if(!mHasReconstructedEditTextBackground)
	//*  32   66:aload_0         
	//*  33   67:getfield        #446 <Field boolean mHasReconstructedEditTextBackground>
	//*  34   70:ifne            16
				{
					ViewCompat.setBackground(((View) (mEditText)), drawable1);
	//   35   73:aload_0         
	//   36   74:getfield        #356 <Field EditText mEditText>
	//   37   77:aload_3         
	//   38   78:invokestatic    #467 <Method void ViewCompat.setBackground(View, Drawable)>
					mHasReconstructedEditTextBackground = true;
	//   39   81:aload_0         
	//   40   82:iconst_1        
	//   41   83:putfield        #446 <Field boolean mHasReconstructedEditTextBackground>
					return;
	//   42   86:return          
				}
			}
	}

	private void expandHint(boolean flag)
	{
		if(mAnimator != null && mAnimator.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #417 <Field ValueAnimator mAnimator>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #417 <Field ValueAnimator mAnimator>
	//*   5   11:invokevirtual   #423 <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			mAnimator.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #417 <Field ValueAnimator mAnimator>
	//    9   21:invokevirtual   #426 <Method void ValueAnimator.cancel()>
		if(flag && mHintAnimationEnabled)
	//*  10   24:iload_1         
	//*  11   25:ifeq            46
	//*  12   28:aload_0         
	//*  13   29:getfield        #198 <Field boolean mHintAnimationEnabled>
	//*  14   32:ifeq            46
			animateToExpansionFraction(0.0F);
	//   15   35:aload_0         
	//   16   36:fconst_0        
	//   17   37:invokevirtual   #430 <Method void animateToExpansionFraction(float)>
		else
	//*  18   40:aload_0         
	//*  19   41:iconst_1        
	//*  20   42:putfield        #432 <Field boolean mHintExpanded>
	//*  21   45:return          
			mCollapsingTextHelper.setExpansionFraction(0.0F);
	//   22   46:aload_0         
	//   23   47:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   24   50:fconst_0        
	//   25   51:invokevirtual   #435 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		mHintExpanded = true;
	//*  26   54:goto            40
	}

	private boolean hasPasswordTransformation()
	{
		return mEditText != null && (mEditText.getTransformationMethod() instanceof PasswordTransformationMethod);
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field EditText mEditText>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #356 <Field EditText mEditText>
	//    5   11:invokevirtual   #473 <Method android.text.method.TransformationMethod EditText.getTransformationMethod()>
	//    6   14:instanceof      #475 <Class PasswordTransformationMethod>
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
	//*   1    1:getfield        #258 <Field boolean mPasswordToggleEnabled>
	//*   2    4:ifeq            65
		{
			int i = mEditText.getSelectionEnd();
	//    3    7:aload_0         
	//    4    8:getfield        #356 <Field EditText mEditText>
	//    5   11:invokevirtual   #478 <Method int EditText.getSelectionEnd()>
	//    6   14:istore_2        
			if(hasPasswordTransformation())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #480 <Method boolean hasPasswordTransformation()>
	//*   9   19:ifeq            66
			{
				mEditText.setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #356 <Field EditText mEditText>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #484 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				mPasswordToggledVisible = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #486 <Field boolean mPasswordToggledVisible>
			} else
	//*  17   35:aload_0         
	//*  18   36:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//*  19   39:aload_0         
	//*  20   40:getfield        #486 <Field boolean mPasswordToggledVisible>
	//*  21   43:invokevirtual   #489 <Method void CheckableImageButton.setChecked(boolean)>
	//*  22   46:iload_1         
	//*  23   47:ifeq            57
	//*  24   50:aload_0         
	//*  25   51:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//*  26   54:invokevirtual   #492 <Method void CheckableImageButton.jumpDrawablesToCurrentState()>
	//*  27   57:aload_0         
	//*  28   58:getfield        #356 <Field EditText mEditText>
	//*  29   61:iload_2         
	//*  30   62:invokevirtual   #495 <Method void EditText.setSelection(int)>
	//*  31   65:return          
			{
				mEditText.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   32   66:aload_0         
	//   33   67:getfield        #356 <Field EditText mEditText>
	//   34   70:invokestatic    #499 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   35   73:invokevirtual   #484 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				mPasswordToggledVisible = false;
	//   36   76:aload_0         
	//   37   77:iconst_0        
	//   38   78:putfield        #486 <Field boolean mPasswordToggledVisible>
			}
			mPasswordToggleView.setChecked(mPasswordToggledVisible);
			if(flag)
				mPasswordToggleView.jumpDrawablesToCurrentState();
			mEditText.setSelection(i);
		}
	//*  39   81:goto            35
	}

	private static void recursiveSetEnabled(ViewGroup viewgroup, boolean flag)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = viewgroup.getChildCount(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #506 <Method int ViewGroup.getChildCount()>
	//*   4    6:istore_3        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          49
		{
			View view = viewgroup.getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #510 <Method View ViewGroup.getChildAt(int)>
	//   11   17:astore          4
			view.setEnabled(flag);
	//   12   19:aload           4
	//   13   21:iload_1         
	//   14   22:invokevirtual   #515 <Method void View.setEnabled(boolean)>
			if(view instanceof ViewGroup)
	//*  15   25:aload           4
	//*  16   27:instanceof      #503 <Class ViewGroup>
	//*  17   30:ifeq            42
				recursiveSetEnabled((ViewGroup)view, flag);
	//   18   33:aload           4
	//   19   35:checkcast       #503 <Class ViewGroup>
	//   20   38:iload_1         
	//   21   39:invokestatic    #517 <Method void recursiveSetEnabled(ViewGroup, boolean)>
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
	//*   1    1:getfield        #334 <Field LinearLayout mIndicatorArea>
	//*   2    4:ifnull          40
		{
			mIndicatorArea.removeView(((View) (textview)));
	//    3    7:aload_0         
	//    4    8:getfield        #334 <Field LinearLayout mIndicatorArea>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #522 <Method void LinearLayout.removeView(View)>
			int i = mIndicatorsAdded - 1;
	//    7   15:aload_0         
	//    8   16:getfield        #366 <Field int mIndicatorsAdded>
	//    9   19:iconst_1        
	//   10   20:isub            
	//   11   21:istore_2        
			mIndicatorsAdded = i;
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:putfield        #366 <Field int mIndicatorsAdded>
			if(i == 0)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
				mIndicatorArea.setVisibility(8);
	//   17   31:aload_0         
	//   18   32:getfield        #334 <Field LinearLayout mIndicatorArea>
	//   19   35:bipush          8
	//   20   37:invokevirtual   #362 <Method void LinearLayout.setVisibility(int)>
		}
	//   21   40:return          
	}

	private void setEditText(EditText edittext)
	{
		if(mEditText != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field EditText mEditText>
	//*   2    4:ifnull          18
			throw new IllegalArgumentException("We already have an EditText, can only have one");
	//    3    7:new             #526 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #528 <String "We already have an EditText, can only have one">
	//    6   14:invokespecial   #531 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		if(!(edittext instanceof TextInputEditText))
	//*   8   18:aload_1         
	//*   9   19:instanceof      #533 <Class TextInputEditText>
	//*  10   22:ifne            34
			Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
	//   11   25:ldc1            #31  <String "TextInputLayout">
	//   12   27:ldc2            #535 <String "EditText added is not a TextInputEditText. Please switch to using that class instead.">
	//   13   30:invokestatic    #541 <Method int Log.i(String, String)>
	//   14   33:pop             
		mEditText = edittext;
	//   15   34:aload_0         
	//   16   35:aload_1         
	//   17   36:putfield        #356 <Field EditText mEditText>
		if(!hasPasswordTransformation())
	//*  18   39:aload_0         
	//*  19   40:invokespecial   #480 <Method boolean hasPasswordTransformation()>
	//*  20   43:ifne            60
			mCollapsingTextHelper.setTypefaces(mEditText.getTypeface());
	//   21   46:aload_0         
	//   22   47:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   23   50:aload_0         
	//   24   51:getfield        #356 <Field EditText mEditText>
	//   25   54:invokevirtual   #545 <Method Typeface EditText.getTypeface()>
	//   26   57:invokevirtual   #549 <Method void CollapsingTextHelper.setTypefaces(Typeface)>
		mCollapsingTextHelper.setExpandedTextSize(mEditText.getTextSize());
	//   27   60:aload_0         
	//   28   61:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   29   64:aload_0         
	//   30   65:getfield        #356 <Field EditText mEditText>
	//   31   68:invokevirtual   #553 <Method float EditText.getTextSize()>
	//   32   71:invokevirtual   #556 <Method void CollapsingTextHelper.setExpandedTextSize(float)>
		int i = mEditText.getGravity();
	//   33   74:aload_0         
	//   34   75:getfield        #356 <Field EditText mEditText>
	//   35   78:invokevirtual   #559 <Method int EditText.getGravity()>
	//   36   81:istore_2        
		mCollapsingTextHelper.setCollapsedTextGravity(i & 0xffffff8f | 0x30);
	//   37   82:aload_0         
	//   38   83:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   39   86:iload_2         
	//   40   87:bipush          -113
	//   41   89:iand            
	//   42   90:bipush          48
	//   43   92:ior             
	//   44   93:invokevirtual   #157 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
		mCollapsingTextHelper.setExpandedTextGravity(i);
	//   45   96:aload_0         
	//   46   97:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   47  100:iload_2         
	//   48  101:invokevirtual   #562 <Method void CollapsingTextHelper.setExpandedTextGravity(int)>
		mEditText.addTextChangedListener(new TextWatcher() {

			public void afterTextChanged(Editable editable)
			{
				TextInputLayout textinputlayout = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field TextInputLayout this$0>
			//    2    4:astore_3        
				boolean flag;
				if(!mRestoringSavedState)
			//*   3    5:aload_0         
			//*   4    6:getfield        #17  <Field TextInputLayout this$0>
			//*   5    9:invokestatic    #27  <Method boolean TextInputLayout.access$000(TextInputLayout)>
			//*   6   12:ifne            46
					flag = true;
			//    7   15:iconst_1        
			//    8   16:istore_2        
				else
			//*   9   17:aload_3         
			//*  10   18:iload_2         
			//*  11   19:invokevirtual   #31  <Method void TextInputLayout.updateLabelState(boolean)>
			//*  12   22:aload_0         
			//*  13   23:getfield        #17  <Field TextInputLayout this$0>
			//*  14   26:getfield        #35  <Field boolean TextInputLayout.mCounterEnabled>
			//*  15   29:ifeq            45
			//*  16   32:aload_0         
			//*  17   33:getfield        #17  <Field TextInputLayout this$0>
			//*  18   36:aload_1         
			//*  19   37:invokeinterface #41  <Method int Editable.length()>
			//*  20   42:invokevirtual   #45  <Method void TextInputLayout.updateCounter(int)>
			//*  21   45:return          
					flag = false;
			//   22   46:iconst_0        
			//   23   47:istore_2        
				textinputlayout.updateLabelState(flag);
				if(mCounterEnabled)
					updateCounter(editable.length());
			//*  24   48:goto            17
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
	//   50  105:getfield        #356 <Field EditText mEditText>
	//   51  108:new             #6   <Class TextInputLayout$1>
	//   52  111:dup             
	//   53  112:aload_0         
	//   54  113:invokespecial   #563 <Method void TextInputLayout$1(TextInputLayout)>
	//   55  116:invokevirtual   #567 <Method void EditText.addTextChangedListener(TextWatcher)>
		if(mDefaultTextColor == null)
	//*  56  119:aload_0         
	//*  57  120:getfield        #213 <Field ColorStateList mDefaultTextColor>
	//*  58  123:ifnonnull       137
			mDefaultTextColor = mEditText.getHintTextColors();
	//   59  126:aload_0         
	//   60  127:aload_0         
	//   61  128:getfield        #356 <Field EditText mEditText>
	//   62  131:invokevirtual   #571 <Method ColorStateList EditText.getHintTextColors()>
	//   63  134:putfield        #213 <Field ColorStateList mDefaultTextColor>
		if(mHintEnabled && TextUtils.isEmpty(mHint))
	//*  64  137:aload_0         
	//*  65  138:getfield        #182 <Field boolean mHintEnabled>
	//*  66  141:ifeq            181
	//*  67  144:aload_0         
	//*  68  145:getfield        #573 <Field CharSequence mHint>
	//*  69  148:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  70  151:ifeq            181
		{
			mOriginalHint = mEditText.getHint();
	//   71  154:aload_0         
	//   72  155:aload_0         
	//   73  156:getfield        #356 <Field EditText mEditText>
	//   74  159:invokevirtual   #583 <Method CharSequence EditText.getHint()>
	//   75  162:putfield        #585 <Field CharSequence mOriginalHint>
			setHint(mOriginalHint);
	//   76  165:aload_0         
	//   77  166:aload_0         
	//   78  167:getfield        #585 <Field CharSequence mOriginalHint>
	//   79  170:invokevirtual   #193 <Method void setHint(CharSequence)>
			mEditText.setHint(((CharSequence) (null)));
	//   80  173:aload_0         
	//   81  174:getfield        #356 <Field EditText mEditText>
	//   82  177:aconst_null     
	//   83  178:invokevirtual   #586 <Method void EditText.setHint(CharSequence)>
		}
		if(mCounterView != null)
	//*  84  181:aload_0         
	//*  85  182:getfield        #588 <Field TextView mCounterView>
	//*  86  185:ifnull          204
			updateCounter(mEditText.getText().length());
	//   87  188:aload_0         
	//   88  189:aload_0         
	//   89  190:getfield        #356 <Field EditText mEditText>
	//   90  193:invokevirtual   #591 <Method Editable EditText.getText()>
	//   91  196:invokeinterface #596 <Method int Editable.length()>
	//   92  201:invokevirtual   #599 <Method void updateCounter(int)>
		if(mIndicatorArea != null)
	//*  93  204:aload_0         
	//*  94  205:getfield        #334 <Field LinearLayout mIndicatorArea>
	//*  95  208:ifnull          215
			adjustIndicatorPadding();
	//   96  211:aload_0         
	//   97  212:invokespecial   #359 <Method void adjustIndicatorPadding()>
		updatePasswordToggleView();
	//   98  215:aload_0         
	//   99  216:invokespecial   #602 <Method void updatePasswordToggleView()>
		updateLabelState(false, true);
	//  100  219:aload_0         
	//  101  220:iconst_0        
	//  102  221:iconst_1        
	//  103  222:invokevirtual   #606 <Method void updateLabelState(boolean, boolean)>
	//  104  225:return          
	}

	private void setError(final CharSequence error, boolean flag)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		mError = error;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #611 <Field CharSequence mError>
		if(!mErrorEnabled)
	//*   5    7:aload_0         
	//*   6    8:getfield        #613 <Field boolean mErrorEnabled>
	//*   7   11:ifne            27
		{
			if(TextUtils.isEmpty(error))
	//*   8   14:aload_1         
	//*   9   15:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   18:ifeq            22
				return;
	//   11   21:return          
			setErrorEnabled(true);
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:invokevirtual   #298 <Method void setErrorEnabled(boolean)>
		}
		if(TextUtils.isEmpty(error))
	//*  15   27:aload_1         
	//*  16   28:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   31:ifne            143
	//*  18   34:aload_0         
	//*  19   35:iload_3         
	//*  20   36:putfield        #615 <Field boolean mErrorShown>
	//*  21   39:aload_0         
	//*  22   40:getfield        #617 <Field TextView mErrorView>
	//*  23   43:invokevirtual   #623 <Method ViewPropertyAnimator TextView.animate()>
	//*  24   46:invokevirtual   #626 <Method void ViewPropertyAnimator.cancel()>
	//*  25   49:aload_0         
	//*  26   50:getfield        #615 <Field boolean mErrorShown>
	//*  27   53:ifeq            159
	//*  28   56:aload_0         
	//*  29   57:getfield        #617 <Field TextView mErrorView>
	//*  30   60:aload_1         
	//*  31   61:invokevirtual   #629 <Method void TextView.setText(CharSequence)>
	//*  32   64:aload_0         
	//*  33   65:getfield        #617 <Field TextView mErrorView>
	//*  34   68:iconst_0        
	//*  35   69:invokevirtual   #630 <Method void TextView.setVisibility(int)>
	//*  36   72:iload_2         
	//*  37   73:ifeq            148
	//*  38   76:aload_0         
	//*  39   77:getfield        #617 <Field TextView mErrorView>
	//*  40   80:invokevirtual   #633 <Method float TextView.getAlpha()>
	//*  41   83:fconst_1        
	//*  42   84:fcmpl           
	//*  43   85:ifne            96
	//*  44   88:aload_0         
	//*  45   89:getfield        #617 <Field TextView mErrorView>
	//*  46   92:fconst_0        
	//*  47   93:invokevirtual   #636 <Method void TextView.setAlpha(float)>
	//*  48   96:aload_0         
	//*  49   97:getfield        #617 <Field TextView mErrorView>
	//*  50  100:invokevirtual   #623 <Method ViewPropertyAnimator TextView.animate()>
	//*  51  103:fconst_1        
	//*  52  104:invokevirtual   #640 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//*  53  107:ldc2w           #641 <Long 200L>
	//*  54  110:invokevirtual   #646 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//*  55  113:getstatic       #649 <Field android.view.animation.Interpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//*  56  116:invokevirtual   #653 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//*  57  119:new             #8   <Class TextInputLayout$2>
	//*  58  122:dup             
	//*  59  123:aload_0         
	//*  60  124:invokespecial   #654 <Method void TextInputLayout$2(TextInputLayout)>
	//*  61  127:invokevirtual   #658 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//*  62  130:invokevirtual   #661 <Method void ViewPropertyAnimator.start()>
	//*  63  133:aload_0         
	//*  64  134:invokespecial   #664 <Method void updateEditTextBackground()>
	//*  65  137:aload_0         
	//*  66  138:iload_2         
	//*  67  139:invokevirtual   #666 <Method void updateLabelState(boolean)>
	//*  68  142:return          
			flag1 = false;
	//   69  143:iconst_0        
	//   70  144:istore_3        
		mErrorShown = flag1;
		mErrorView.animate().cancel();
		if(!mErrorShown) goto _L2; else goto _L1
_L1:
		mErrorView.setText(error);
		mErrorView.setVisibility(0);
		if(flag)
		{
			if(mErrorView.getAlpha() == 1.0F)
				mErrorView.setAlpha(0.0F);
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
		} else
	//*  71  145:goto            34
		{
			mErrorView.setAlpha(1.0F);
	//   72  148:aload_0         
	//   73  149:getfield        #617 <Field TextView mErrorView>
	//   74  152:fconst_1        
	//   75  153:invokevirtual   #636 <Method void TextView.setAlpha(float)>
		}
_L4:
		updateEditTextBackground();
		updateLabelState(flag);
		return;
	//*  76  156:goto            133
_L2:
		if(mErrorView.getVisibility() == 0)
	//*  77  159:aload_0         
	//*  78  160:getfield        #617 <Field TextView mErrorView>
	//*  79  163:invokevirtual   #669 <Method int TextView.getVisibility()>
	//*  80  166:ifne            133
			if(flag)
	//*  81  169:iload_2         
	//*  82  170:ifeq            214
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
	//   83  173:aload_0         
	//   84  174:getfield        #617 <Field TextView mErrorView>
	//   85  177:invokevirtual   #623 <Method ViewPropertyAnimator TextView.animate()>
	//   86  180:fconst_0        
	//   87  181:invokevirtual   #640 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   88  184:ldc2w           #641 <Long 200L>
	//   89  187:invokevirtual   #646 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   90  190:getstatic       #672 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   91  193:invokevirtual   #653 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   92  196:new             #10  <Class TextInputLayout$3>
	//   93  199:dup             
	//   94  200:aload_0         
	//   95  201:aload_1         
	//   96  202:invokespecial   #675 <Method void TextInputLayout$3(TextInputLayout, CharSequence)>
	//   97  205:invokevirtual   #658 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   98  208:invokevirtual   #661 <Method void ViewPropertyAnimator.start()>
			} else
	//*  99  211:goto            133
			{
				mErrorView.setText(error);
	//  100  214:aload_0         
	//  101  215:getfield        #617 <Field TextView mErrorView>
	//  102  218:aload_1         
	//  103  219:invokevirtual   #629 <Method void TextView.setText(CharSequence)>
				mErrorView.setVisibility(4);
	//  104  222:aload_0         
	//  105  223:getfield        #617 <Field TextView mErrorView>
	//  106  226:iconst_4        
	//  107  227:invokevirtual   #630 <Method void TextView.setVisibility(int)>
			}
		if(true) goto _L4; else goto _L3
	//  108  230:goto            133
_L3:
	}

	private void setHintInternal(CharSequence charsequence)
	{
		mHint = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #573 <Field CharSequence mHint>
		mCollapsingTextHelper.setText(charsequence);
	//    3    5:aload_0         
	//    4    6:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #678 <Method void CollapsingTextHelper.setText(CharSequence)>
	//    7   13:return          
	}

	private boolean shouldShowPasswordIcon()
	{
		return mPasswordToggleEnabled && (hasPasswordTransformation() || mPasswordToggledVisible);
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field boolean mPasswordToggleEnabled>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:invokespecial   #480 <Method boolean hasPasswordTransformation()>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:getfield        #486 <Field boolean mPasswordToggledVisible>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void updateEditTextBackground()
	{
		Drawable drawable1;
		if(mEditText != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field EditText mEditText>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #356 <Field EditText mEditText>
	//*   6   12:invokevirtual   #444 <Method Drawable EditText.getBackground()>
	//*   7   15:astore_2        
			if((drawable1 = mEditText.getBackground()) != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          7
			{
				ensureBackgroundDrawableStateWorkaround();
	//   10   20:aload_0         
	//   11   21:invokespecial   #681 <Method void ensureBackgroundDrawableStateWorkaround()>
				Drawable drawable = drawable1;
	//   12   24:aload_2         
	//   13   25:astore_1        
				if(DrawableUtils.canSafelyMutateDrawable(drawable1))
	//*  14   26:aload_2         
	//*  15   27:invokestatic    #687 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  16   30:ifeq            38
					drawable = drawable1.mutate();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #394 <Method Drawable Drawable.mutate()>
	//   19   37:astore_1        
				if(mErrorShown && mErrorView != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #615 <Field boolean mErrorShown>
	//*  22   42:ifeq            70
	//*  23   45:aload_0         
	//*  24   46:getfield        #617 <Field TextView mErrorView>
	//*  25   49:ifnull          70
				{
					drawable.setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(mErrorView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   26   52:aload_1         
	//   27   53:aload_0         
	//   28   54:getfield        #617 <Field TextView mErrorView>
	//   29   57:invokevirtual   #690 <Method int TextView.getCurrentTextColor()>
	//   30   60:getstatic       #695 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   31   63:invokestatic    #701 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   32   66:invokevirtual   #705 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
					return;
	//   33   69:return          
				}
				if(mCounterOverflowed && mCounterView != null)
	//*  34   70:aload_0         
	//*  35   71:getfield        #707 <Field boolean mCounterOverflowed>
	//*  36   74:ifeq            102
	//*  37   77:aload_0         
	//*  38   78:getfield        #588 <Field TextView mCounterView>
	//*  39   81:ifnull          102
				{
					drawable.setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(mCounterView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   40   84:aload_1         
	//   41   85:aload_0         
	//   42   86:getfield        #588 <Field TextView mCounterView>
	//   43   89:invokevirtual   #690 <Method int TextView.getCurrentTextColor()>
	//   44   92:getstatic       #695 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   45   95:invokestatic    #701 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   46   98:invokevirtual   #705 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
					return;
	//   47  101:return          
				} else
				{
					DrawableCompat.clearColorFilter(drawable);
	//   48  102:aload_1         
	//   49  103:invokestatic    #710 <Method void DrawableCompat.clearColorFilter(Drawable)>
					mEditText.refreshDrawableState();
	//   50  106:aload_0         
	//   51  107:getfield        #356 <Field EditText mEditText>
	//   52  110:invokevirtual   #713 <Method void EditText.refreshDrawableState()>
					return;
	//   53  113:return          
				}
			}
	}

	private void updateInputLayoutMargins()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mInputFrame.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field FrameLayout mInputFrame>
	//    2    4:invokevirtual   #718 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//    3    7:checkcast       #348 <Class android.widget.LinearLayout$LayoutParams>
	//    4   10:astore_2        
		int i;
		if(mHintEnabled)
	//*   5   11:aload_0         
	//*   6   12:getfield        #182 <Field boolean mHintEnabled>
	//*   7   15:ifeq            96
		{
			if(mTmpPaint == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #720 <Field Paint mTmpPaint>
	//*  10   22:ifnonnull       36
				mTmpPaint = new Paint();
	//   11   25:aload_0         
	//   12   26:new             #722 <Class Paint>
	//   13   29:dup             
	//   14   30:invokespecial   #723 <Method void Paint()>
	//   15   33:putfield        #720 <Field Paint mTmpPaint>
			mTmpPaint.setTypeface(mCollapsingTextHelper.getCollapsedTypeface());
	//   16   36:aload_0         
	//   17   37:getfield        #720 <Field Paint mTmpPaint>
	//   18   40:aload_0         
	//   19   41:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   20   44:invokevirtual   #726 <Method Typeface CollapsingTextHelper.getCollapsedTypeface()>
	//   21   47:invokevirtual   #730 <Method Typeface Paint.setTypeface(Typeface)>
	//   22   50:pop             
			mTmpPaint.setTextSize(mCollapsingTextHelper.getCollapsedTextSize());
	//   23   51:aload_0         
	//   24   52:getfield        #720 <Field Paint mTmpPaint>
	//   25   55:aload_0         
	//   26   56:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   27   59:invokevirtual   #733 <Method float CollapsingTextHelper.getCollapsedTextSize()>
	//   28   62:invokevirtual   #736 <Method void Paint.setTextSize(float)>
			i = (int)(-mTmpPaint.ascent());
	//   29   65:aload_0         
	//   30   66:getfield        #720 <Field Paint mTmpPaint>
	//   31   69:invokevirtual   #739 <Method float Paint.ascent()>
	//   32   72:fneg            
	//   33   73:f2i             
	//   34   74:istore_1        
		} else
	//*  35   75:iload_1         
	//*  36   76:aload_2         
	//*  37   77:getfield        #742 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//*  38   80:icmpeq          95
	//*  39   83:aload_2         
	//*  40   84:iload_1         
	//*  41   85:putfield        #742 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//*  42   88:aload_0         
	//*  43   89:getfield        #133 <Field FrameLayout mInputFrame>
	//*  44   92:invokevirtual   #745 <Method void FrameLayout.requestLayout()>
	//*  45   95:return          
		{
			i = 0;
	//   46   96:iconst_0        
	//   47   97:istore_1        
		}
		if(i != layoutparams.topMargin)
		{
			layoutparams.topMargin = i;
			mInputFrame.requestLayout();
		}
	//*  48   98:goto            75
	}

	private void updatePasswordToggleView()
	{
		if(mEditText != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field EditText mEditText>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			if(shouldShowPasswordIcon())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #747 <Method boolean shouldShowPasswordIcon()>
	//*   6   12:ifeq            261
			{
				if(mPasswordToggleView == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//*   9   19:ifnonnull       95
				{
					mPasswordToggleView = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_text_input_password_icon, ((ViewGroup) (mInputFrame)), false);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #338 <Method Context getContext()>
	//   13   27:invokestatic    #753 <Method LayoutInflater LayoutInflater.from(Context)>
	//   14   30:getstatic       #758 <Field int android.support.design.R$layout.design_text_input_password_icon>
	//   15   33:aload_0         
	//   16   34:getfield        #133 <Field FrameLayout mInputFrame>
	//   17   37:iconst_0        
	//   18   38:invokevirtual   #762 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   19   41:checkcast       #406 <Class CheckableImageButton>
	//   20   44:putfield        #404 <Field CheckableImageButton mPasswordToggleView>
					mPasswordToggleView.setImageDrawable(mPasswordToggleDrawable);
	//   21   47:aload_0         
	//   22   48:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//   23   51:aload_0         
	//   24   52:getfield        #267 <Field Drawable mPasswordToggleDrawable>
	//   25   55:invokevirtual   #412 <Method void CheckableImageButton.setImageDrawable(Drawable)>
					mPasswordToggleView.setContentDescription(mPasswordToggleContentDesc);
	//   26   58:aload_0         
	//   27   59:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//   28   62:aload_0         
	//   29   63:getfield        #272 <Field CharSequence mPasswordToggleContentDesc>
	//   30   66:invokevirtual   #765 <Method void CheckableImageButton.setContentDescription(CharSequence)>
					mInputFrame.addView(((View) (mPasswordToggleView)));
	//   31   69:aload_0         
	//   32   70:getfield        #133 <Field FrameLayout mInputFrame>
	//   33   73:aload_0         
	//   34   74:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//   35   77:invokevirtual   #766 <Method void FrameLayout.addView(View)>
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
	//   37   81:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//   38   84:new             #12  <Class TextInputLayout$4>
	//   39   87:dup             
	//   40   88:aload_0         
	//   41   89:invokespecial   #767 <Method void TextInputLayout$4(TextInputLayout)>
	//   42   92:invokevirtual   #771 <Method void CheckableImageButton.setOnClickListener(android.view.View$OnClickListener)>
				}
				if(mEditText != null && ViewCompat.getMinimumHeight(((View) (mEditText))) <= 0)
	//*  43   95:aload_0         
	//*  44   96:getfield        #356 <Field EditText mEditText>
	//*  45   99:ifnull          126
	//*  46  102:aload_0         
	//*  47  103:getfield        #356 <Field EditText mEditText>
	//*  48  106:invokestatic    #774 <Method int ViewCompat.getMinimumHeight(View)>
	//*  49  109:ifgt            126
					mEditText.setMinimumHeight(ViewCompat.getMinimumHeight(((View) (mPasswordToggleView))));
	//   50  112:aload_0         
	//   51  113:getfield        #356 <Field EditText mEditText>
	//   52  116:aload_0         
	//   53  117:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//   54  120:invokestatic    #774 <Method int ViewCompat.getMinimumHeight(View)>
	//   55  123:invokevirtual   #777 <Method void EditText.setMinimumHeight(int)>
				mPasswordToggleView.setVisibility(0);
	//   56  126:aload_0         
	//   57  127:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//   58  130:iconst_0        
	//   59  131:invokevirtual   #778 <Method void CheckableImageButton.setVisibility(int)>
				mPasswordToggleView.setChecked(mPasswordToggledVisible);
	//   60  134:aload_0         
	//   61  135:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//   62  138:aload_0         
	//   63  139:getfield        #486 <Field boolean mPasswordToggledVisible>
	//   64  142:invokevirtual   #489 <Method void CheckableImageButton.setChecked(boolean)>
				if(mPasswordToggleDummyDrawable == null)
	//*  65  145:aload_0         
	//*  66  146:getfield        #780 <Field Drawable mPasswordToggleDummyDrawable>
	//*  67  149:ifnonnull       163
					mPasswordToggleDummyDrawable = ((Drawable) (new ColorDrawable()));
	//   68  152:aload_0         
	//   69  153:new             #782 <Class ColorDrawable>
	//   70  156:dup             
	//   71  157:invokespecial   #783 <Method void ColorDrawable()>
	//   72  160:putfield        #780 <Field Drawable mPasswordToggleDummyDrawable>
				mPasswordToggleDummyDrawable.setBounds(0, 0, mPasswordToggleView.getMeasuredWidth(), 1);
	//   73  163:aload_0         
	//   74  164:getfield        #780 <Field Drawable mPasswordToggleDummyDrawable>
	//   75  167:iconst_0        
	//   76  168:iconst_0        
	//   77  169:aload_0         
	//   78  170:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//   79  173:invokevirtual   #786 <Method int CheckableImageButton.getMeasuredWidth()>
	//   80  176:iconst_1        
	//   81  177:invokevirtual   #790 <Method void Drawable.setBounds(int, int, int, int)>
				Drawable adrawable[] = TextViewCompat.getCompoundDrawablesRelative(((TextView) (mEditText)));
	//   82  180:aload_0         
	//   83  181:getfield        #356 <Field EditText mEditText>
	//   84  184:invokestatic    #796 <Method Drawable[] TextViewCompat.getCompoundDrawablesRelative(TextView)>
	//   85  187:astore_1        
				if(adrawable[2] != mPasswordToggleDummyDrawable)
	//*  86  188:aload_1         
	//*  87  189:iconst_2        
	//*  88  190:aaload          
	//*  89  191:aload_0         
	//*  90  192:getfield        #780 <Field Drawable mPasswordToggleDummyDrawable>
	//*  91  195:if_acmpeq       205
					mOriginalEditTextEndDrawable = adrawable[2];
	//   92  198:aload_0         
	//   93  199:aload_1         
	//   94  200:iconst_2        
	//   95  201:aaload          
	//   96  202:putfield        #798 <Field Drawable mOriginalEditTextEndDrawable>
				TextViewCompat.setCompoundDrawablesRelative(((TextView) (mEditText)), adrawable[0], adrawable[1], mPasswordToggleDummyDrawable, adrawable[3]);
	//   97  205:aload_0         
	//   98  206:getfield        #356 <Field EditText mEditText>
	//   99  209:aload_1         
	//  100  210:iconst_0        
	//  101  211:aaload          
	//  102  212:aload_1         
	//  103  213:iconst_1        
	//  104  214:aaload          
	//  105  215:aload_0         
	//  106  216:getfield        #780 <Field Drawable mPasswordToggleDummyDrawable>
	//  107  219:aload_1         
	//  108  220:iconst_3        
	//  109  221:aaload          
	//  110  222:invokestatic    #802 <Method void TextViewCompat.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
				mPasswordToggleView.setPadding(mEditText.getPaddingLeft(), mEditText.getPaddingTop(), mEditText.getPaddingRight(), mEditText.getPaddingBottom());
	//  111  225:aload_0         
	//  112  226:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//  113  229:aload_0         
	//  114  230:getfield        #356 <Field EditText mEditText>
	//  115  233:invokevirtual   #805 <Method int EditText.getPaddingLeft()>
	//  116  236:aload_0         
	//  117  237:getfield        #356 <Field EditText mEditText>
	//  118  240:invokevirtual   #808 <Method int EditText.getPaddingTop()>
	//  119  243:aload_0         
	//  120  244:getfield        #356 <Field EditText mEditText>
	//  121  247:invokevirtual   #811 <Method int EditText.getPaddingRight()>
	//  122  250:aload_0         
	//  123  251:getfield        #356 <Field EditText mEditText>
	//  124  254:invokevirtual   #378 <Method int EditText.getPaddingBottom()>
	//  125  257:invokevirtual   #814 <Method void CheckableImageButton.setPadding(int, int, int, int)>
				return;
	//  126  260:return          
			}
			if(mPasswordToggleView != null && mPasswordToggleView.getVisibility() == 0)
	//* 127  261:aload_0         
	//* 128  262:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//* 129  265:ifnull          287
	//* 130  268:aload_0         
	//* 131  269:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//* 132  272:invokevirtual   #815 <Method int CheckableImageButton.getVisibility()>
	//* 133  275:ifne            287
				mPasswordToggleView.setVisibility(8);
	//  134  278:aload_0         
	//  135  279:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//  136  282:bipush          8
	//  137  284:invokevirtual   #778 <Method void CheckableImageButton.setVisibility(int)>
			if(mPasswordToggleDummyDrawable != null)
	//* 138  287:aload_0         
	//* 139  288:getfield        #780 <Field Drawable mPasswordToggleDummyDrawable>
	//* 140  291:ifnull          7
			{
				Drawable adrawable1[] = TextViewCompat.getCompoundDrawablesRelative(((TextView) (mEditText)));
	//  141  294:aload_0         
	//  142  295:getfield        #356 <Field EditText mEditText>
	//  143  298:invokestatic    #796 <Method Drawable[] TextViewCompat.getCompoundDrawablesRelative(TextView)>
	//  144  301:astore_1        
				if(adrawable1[2] == mPasswordToggleDummyDrawable)
	//* 145  302:aload_1         
	//* 146  303:iconst_2        
	//* 147  304:aaload          
	//* 148  305:aload_0         
	//* 149  306:getfield        #780 <Field Drawable mPasswordToggleDummyDrawable>
	//* 150  309:if_acmpne       7
				{
					TextViewCompat.setCompoundDrawablesRelative(((TextView) (mEditText)), adrawable1[0], adrawable1[1], mOriginalEditTextEndDrawable, adrawable1[3]);
	//  151  312:aload_0         
	//  152  313:getfield        #356 <Field EditText mEditText>
	//  153  316:aload_1         
	//  154  317:iconst_0        
	//  155  318:aaload          
	//  156  319:aload_1         
	//  157  320:iconst_1        
	//  158  321:aaload          
	//  159  322:aload_0         
	//  160  323:getfield        #798 <Field Drawable mOriginalEditTextEndDrawable>
	//  161  326:aload_1         
	//  162  327:iconst_3        
	//  163  328:aaload          
	//  164  329:invokestatic    #802 <Method void TextViewCompat.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
					mPasswordToggleDummyDrawable = null;
	//  165  332:aload_0         
	//  166  333:aconst_null     
	//  167  334:putfield        #780 <Field Drawable mPasswordToggleDummyDrawable>
					return;
	//  168  337:return          
				}
			}
		}
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(view instanceof EditText)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #374 <Class EditText>
	//*   2    4:ifeq            64
		{
			android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams);
	//    3    7:new             #818 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_3         
	//    6   12:invokespecial   #821 <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    7   15:astore          4
			layoutparams1.gravity = layoutparams1.gravity & 0xffffff8f | 0x10;
	//    8   17:aload           4
	//    9   19:aload           4
	//   10   21:getfield        #824 <Field int android.widget.FrameLayout$LayoutParams.gravity>
	//   11   24:bipush          -113
	//   12   26:iand            
	//   13   27:bipush          16
	//   14   29:ior             
	//   15   30:putfield        #824 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			mInputFrame.addView(view, ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   16   33:aload_0         
	//   17   34:getfield        #133 <Field FrameLayout mInputFrame>
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokevirtual   #825 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			mInputFrame.setLayoutParams(layoutparams);
	//   21   43:aload_0         
	//   22   44:getfield        #133 <Field FrameLayout mInputFrame>
	//   23   47:aload_3         
	//   24   48:invokevirtual   #828 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			updateInputLayoutMargins();
	//   25   51:aload_0         
	//   26   52:invokespecial   #830 <Method void updateInputLayoutMargins()>
			setEditText((EditText)view);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:checkcast       #374 <Class EditText>
	//   30   60:invokespecial   #832 <Method void setEditText(EditText)>
			return;
	//   31   63:return          
		} else
		{
			super.addView(view, i, layoutparams);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:iload_2         
	//   35   67:aload_3         
	//   36   68:invokespecial   #834 <Method void LinearLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   37   71:return          
		}
	}

	void animateToExpansionFraction(float f)
	{
		if(mCollapsingTextHelper.getExpansionFraction() == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//*   2    4:invokevirtual   #838 <Method float CollapsingTextHelper.getExpansionFraction()>
	//*   3    7:fload_1         
	//*   4    8:fcmpl           
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(mAnimator == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #417 <Field ValueAnimator mAnimator>
	//*   9   17:ifnonnull       67
		{
			mAnimator = new ValueAnimator();
	//   10   20:aload_0         
	//   11   21:new             #419 <Class ValueAnimator>
	//   12   24:dup             
	//   13   25:invokespecial   #839 <Method void ValueAnimator()>
	//   14   28:putfield        #417 <Field ValueAnimator mAnimator>
			mAnimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.LINEAR_INTERPOLATOR)));
	//   15   31:aload_0         
	//   16   32:getfield        #417 <Field ValueAnimator mAnimator>
	//   17   35:getstatic       #842 <Field android.view.animation.Interpolator AnimationUtils.LINEAR_INTERPOLATOR>
	//   18   38:invokevirtual   #845 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			mAnimator.setDuration(200L);
	//   19   41:aload_0         
	//   20   42:getfield        #417 <Field ValueAnimator mAnimator>
	//   21   45:ldc2w           #641 <Long 200L>
	//   22   48:invokevirtual   #848 <Method ValueAnimator ValueAnimator.setDuration(long)>
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
	//   25   53:getfield        #417 <Field ValueAnimator mAnimator>
	//   26   56:new             #14  <Class TextInputLayout$5>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:invokespecial   #849 <Method void TextInputLayout$5(TextInputLayout)>
	//   30   64:invokevirtual   #853 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
		mAnimator.setFloatValues(new float[] {
			mCollapsingTextHelper.getExpansionFraction(), f
		});
	//   31   67:aload_0         
	//   32   68:getfield        #417 <Field ValueAnimator mAnimator>
	//   33   71:iconst_2        
	//   34   72:newarray        float[]
	//   35   74:dup             
	//   36   75:iconst_0        
	//   37   76:aload_0         
	//   38   77:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   39   80:invokevirtual   #838 <Method float CollapsingTextHelper.getExpansionFraction()>
	//   40   83:fastore         
	//   41   84:dup             
	//   42   85:iconst_1        
	//   43   86:fload_1         
	//   44   87:fastore         
	//   45   88:invokevirtual   #857 <Method void ValueAnimator.setFloatValues(float[])>
		mAnimator.start();
	//   46   91:aload_0         
	//   47   92:getfield        #417 <Field ValueAnimator mAnimator>
	//   48   95:invokevirtual   #858 <Method void ValueAnimator.start()>
	//   49   98:return          
	}

	public void dispatchProvideAutofillStructure(ViewStructure viewstructure, int i)
	{
		CharSequence charsequence;
		if(mOriginalHint == null || mEditText == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #585 <Field CharSequence mOriginalHint>
	//*   2    4:ifnull          14
	//*   3    7:aload_0         
	//*   4    8:getfield        #356 <Field EditText mEditText>
	//*   5   11:ifnonnull       21
		{
			super.dispatchProvideAutofillStructure(viewstructure, i);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:invokespecial   #863 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
			return;
	//   10   20:return          
		}
		charsequence = mEditText.getHint();
	//   11   21:aload_0         
	//   12   22:getfield        #356 <Field EditText mEditText>
	//   13   25:invokevirtual   #583 <Method CharSequence EditText.getHint()>
	//   14   28:astore_3        
		mEditText.setHint(mOriginalHint);
	//   15   29:aload_0         
	//   16   30:getfield        #356 <Field EditText mEditText>
	//   17   33:aload_0         
	//   18   34:getfield        #585 <Field CharSequence mOriginalHint>
	//   19   37:invokevirtual   #586 <Method void EditText.setHint(CharSequence)>
		super.dispatchProvideAutofillStructure(viewstructure, i);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:iload_2         
	//   23   43:invokespecial   #863 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
		mEditText.setHint(charsequence);
	//   24   46:aload_0         
	//   25   47:getfield        #356 <Field EditText mEditText>
	//   26   50:aload_3         
	//   27   51:invokevirtual   #586 <Method void EditText.setHint(CharSequence)>
		return;
	//   28   54:return          
		viewstructure;
	//   29   55:astore_1        
		mEditText.setHint(charsequence);
	//   30   56:aload_0         
	//   31   57:getfield        #356 <Field EditText mEditText>
	//   32   60:aload_3         
	//   33   61:invokevirtual   #586 <Method void EditText.setHint(CharSequence)>
		throw viewstructure;
	//   34   64:aload_1         
	//   35   65:athrow          
	}

	protected void dispatchRestoreInstanceState(SparseArray sparsearray)
	{
		mRestoringSavedState = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #325 <Field boolean mRestoringSavedState>
		super.dispatchRestoreInstanceState(sparsearray);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #867 <Method void LinearLayout.dispatchRestoreInstanceState(SparseArray)>
		mRestoringSavedState = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #325 <Field boolean mRestoringSavedState>
	//    9   15:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #873 <Method void LinearLayout.draw(Canvas)>
		if(mHintEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #182 <Field boolean mHintEnabled>
	//*   5    9:ifeq            20
			mCollapsingTextHelper.draw(canvas);
	//    6   12:aload_0         
	//    7   13:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #874 <Method void CollapsingTextHelper.draw(Canvas)>
	//   10   20:return          
	}

	protected void drawableStateChanged()
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(mInDrawableStateChanged)
	//*   2    2:aload_0         
	//*   3    3:getfield        #877 <Field boolean mInDrawableStateChanged>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		mInDrawableStateChanged = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #877 <Field boolean mInDrawableStateChanged>
		super.drawableStateChanged();
	//    9   15:aload_0         
	//   10   16:invokespecial   #879 <Method void LinearLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #883 <Method int[] getDrawableState()>
	//   13   23:astore_3        
		boolean flag = false;
	//   14   24:iconst_0        
	//   15   25:istore_1        
		if(!ViewCompat.isLaidOut(((View) (this))) || !isEnabled())
	//*  16   26:aload_0         
	//*  17   27:invokestatic    #887 <Method boolean ViewCompat.isLaidOut(View)>
	//*  18   30:ifeq            81
	//*  19   33:aload_0         
	//*  20   34:invokevirtual   #890 <Method boolean isEnabled()>
	//*  21   37:ifeq            81
	//*  22   40:aload_0         
	//*  23   41:iload_2         
	//*  24   42:invokevirtual   #666 <Method void updateLabelState(boolean)>
	//*  25   45:aload_0         
	//*  26   46:invokespecial   #664 <Method void updateEditTextBackground()>
	//*  27   49:aload_0         
	//*  28   50:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//*  29   53:ifnull          67
	//*  30   56:iconst_0        
	//*  31   57:aload_0         
	//*  32   58:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//*  33   61:aload_3         
	//*  34   62:invokevirtual   #894 <Method boolean CollapsingTextHelper.setState(int[])>
	//*  35   65:ior             
	//*  36   66:istore_1        
	//*  37   67:iload_1         
	//*  38   68:ifeq            75
	//*  39   71:aload_0         
	//*  40   72:invokevirtual   #897 <Method void invalidate()>
	//*  41   75:aload_0         
	//*  42   76:iconst_0        
	//*  43   77:putfield        #877 <Field boolean mInDrawableStateChanged>
	//*  44   80:return          
			flag1 = false;
	//   45   81:iconst_0        
	//   46   82:istore_2        
		updateLabelState(flag1);
		updateEditTextBackground();
		if(mCollapsingTextHelper != null)
			flag = false | mCollapsingTextHelper.setState(ai);
		if(flag)
			invalidate();
		mInDrawableStateChanged = false;
	//*  47   83:goto            40
	}

	public int getCounterMaxLength()
	{
		return mCounterMaxLength;
	//    0    0:aload_0         
	//    1    1:getfield        #900 <Field int mCounterMaxLength>
	//    2    4:ireturn         
	}

	public EditText getEditText()
	{
		return mEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field EditText mEditText>
	//    2    4:areturn         
	}

	public CharSequence getError()
	{
		if(mErrorEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #613 <Field boolean mErrorEnabled>
	//*   2    4:ifeq            12
			return mError;
	//    3    7:aload_0         
	//    4    8:getfield        #611 <Field CharSequence mError>
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
	//*   1    1:getfield        #182 <Field boolean mHintEnabled>
	//*   2    4:ifeq            12
			return mHint;
	//    3    7:aload_0         
	//    4    8:getfield        #573 <Field CharSequence mHint>
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
	//    1    1:getfield        #272 <Field CharSequence mPasswordToggleContentDesc>
	//    2    4:areturn         
	}

	public Drawable getPasswordVisibilityToggleDrawable()
	{
		return mPasswordToggleDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field Drawable mPasswordToggleDrawable>
	//    2    4:areturn         
	}

	public Typeface getTypeface()
	{
		return mTypeface;
	//    0    0:aload_0         
	//    1    1:getfield        #908 <Field Typeface mTypeface>
	//    2    4:areturn         
	}

	public boolean isCounterEnabled()
	{
		return mCounterEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #911 <Field boolean mCounterEnabled>
	//    2    4:ireturn         
	}

	public boolean isErrorEnabled()
	{
		return mErrorEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #613 <Field boolean mErrorEnabled>
	//    2    4:ireturn         
	}

	public boolean isHintAnimationEnabled()
	{
		return mHintAnimationEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field boolean mHintAnimationEnabled>
	//    2    4:ireturn         
	}

	public boolean isHintEnabled()
	{
		return mHintEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field boolean mHintEnabled>
	//    2    4:ireturn         
	}

	final boolean isHintExpanded()
	{
		return mHintExpanded;
	//    0    0:aload_0         
	//    1    1:getfield        #432 <Field boolean mHintExpanded>
	//    2    4:ireturn         
	}

	public boolean isPasswordVisibilityToggleEnabled()
	{
		return mPasswordToggleEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field boolean mPasswordToggleEnabled>
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
	//    6    8:invokespecial   #920 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		if(mHintEnabled && mEditText != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #182 <Field boolean mHintEnabled>
	//*   9   15:ifeq            136
	//*  10   18:aload_0         
	//*  11   19:getfield        #356 <Field EditText mEditText>
	//*  12   22:ifnull          136
		{
			Rect rect = mTmpRect;
	//   13   25:aload_0         
	//   14   26:getfield        #104 <Field Rect mTmpRect>
	//   15   29:astore          6
			ViewGroupUtils.getDescendantRect(((ViewGroup) (this)), ((View) (mEditText)), rect);
	//   16   31:aload_0         
	//   17   32:aload_0         
	//   18   33:getfield        #356 <Field EditText mEditText>
	//   19   36:aload           6
	//   20   38:invokestatic    #926 <Method void ViewGroupUtils.getDescendantRect(ViewGroup, View, Rect)>
			i = rect.left + mEditText.getCompoundPaddingLeft();
	//   21   41:aload           6
	//   22   43:getfield        #929 <Field int Rect.left>
	//   23   46:aload_0         
	//   24   47:getfield        #356 <Field EditText mEditText>
	//   25   50:invokevirtual   #932 <Method int EditText.getCompoundPaddingLeft()>
	//   26   53:iadd            
	//   27   54:istore_2        
			k = rect.right - mEditText.getCompoundPaddingRight();
	//   28   55:aload           6
	//   29   57:getfield        #935 <Field int Rect.right>
	//   30   60:aload_0         
	//   31   61:getfield        #356 <Field EditText mEditText>
	//   32   64:invokevirtual   #938 <Method int EditText.getCompoundPaddingRight()>
	//   33   67:isub            
	//   34   68:istore          4
			mCollapsingTextHelper.setExpandedBounds(i, rect.top + mEditText.getCompoundPaddingTop(), k, rect.bottom - mEditText.getCompoundPaddingBottom());
	//   35   70:aload_0         
	//   36   71:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   37   74:iload_2         
	//   38   75:aload           6
	//   39   77:getfield        #941 <Field int Rect.top>
	//   40   80:aload_0         
	//   41   81:getfield        #356 <Field EditText mEditText>
	//   42   84:invokevirtual   #944 <Method int EditText.getCompoundPaddingTop()>
	//   43   87:iadd            
	//   44   88:iload           4
	//   45   90:aload           6
	//   46   92:getfield        #947 <Field int Rect.bottom>
	//   47   95:aload_0         
	//   48   96:getfield        #356 <Field EditText mEditText>
	//   49   99:invokevirtual   #950 <Method int EditText.getCompoundPaddingBottom()>
	//   50  102:isub            
	//   51  103:invokevirtual   #953 <Method void CollapsingTextHelper.setExpandedBounds(int, int, int, int)>
			mCollapsingTextHelper.setCollapsedBounds(i, getPaddingTop(), k, l - j - getPaddingBottom());
	//   52  106:aload_0         
	//   53  107:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   54  110:iload_2         
	//   55  111:aload_0         
	//   56  112:invokevirtual   #954 <Method int getPaddingTop()>
	//   57  115:iload           4
	//   58  117:iload           5
	//   59  119:iload_3         
	//   60  120:isub            
	//   61  121:aload_0         
	//   62  122:invokevirtual   #955 <Method int getPaddingBottom()>
	//   63  125:isub            
	//   64  126:invokevirtual   #958 <Method void CollapsingTextHelper.setCollapsedBounds(int, int, int, int)>
			mCollapsingTextHelper.recalculate();
	//   65  129:aload_0         
	//   66  130:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   67  133:invokevirtual   #961 <Method void CollapsingTextHelper.recalculate()>
		}
	//   68  136:return          
	}

	protected void onMeasure(int i, int j)
	{
		updatePasswordToggleView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #602 <Method void updatePasswordToggleView()>
		super.onMeasure(i, j);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #965 <Method void LinearLayout.onMeasure(int, int)>
	//    6   10:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class TextInputLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #969 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #16  <Class TextInputLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #973 <Method Parcelable TextInputLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #969 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
		setError(((SavedState) (parcelable)).error);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #976 <Field CharSequence TextInputLayout$SavedState.error>
	//   17   31:invokevirtual   #978 <Method void setError(CharSequence)>
		if(((SavedState) (parcelable)).isPasswordToggledVisible)
	//*  18   34:aload_1         
	//*  19   35:getfield        #981 <Field boolean TextInputLayout$SavedState.isPasswordToggledVisible>
	//*  20   38:ifeq            46
			passwordVisibilityToggleRequested(true);
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:invokespecial   #330 <Method void passwordVisibilityToggleRequested(boolean)>
		requestLayout();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #982 <Method void requestLayout()>
	//   26   50:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #16  <Class TextInputLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #985 <Method Parcelable LinearLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #987 <Method void TextInputLayout$SavedState(Parcelable)>
	//    5   11:astore_1        
		if(mErrorShown)
	//*   6   12:aload_0         
	//*   7   13:getfield        #615 <Field boolean mErrorShown>
	//*   8   16:ifeq            27
			savedstate.error = getError();
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #989 <Method CharSequence getError()>
	//   12   24:putfield        #976 <Field CharSequence TextInputLayout$SavedState.error>
		savedstate.isPasswordToggledVisible = mPasswordToggledVisible;
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #486 <Field boolean mPasswordToggledVisible>
	//   16   32:putfield        #981 <Field boolean TextInputLayout$SavedState.isPasswordToggledVisible>
		return ((Parcelable) (savedstate));
	//   17   35:aload_1         
	//   18   36:areturn         
	}

	public void setCounterEnabled(boolean flag)
	{
		if(mCounterEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #911 <Field boolean mCounterEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          100
		{
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            151
			{
				mCounterView = ((TextView) (new AppCompatTextView(getContext())));
	//    6   12:aload_0         
	//    7   13:new             #993 <Class AppCompatTextView>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #338 <Method Context getContext()>
	//   11   21:invokespecial   #994 <Method void AppCompatTextView(Context)>
	//   12   24:putfield        #588 <Field TextView mCounterView>
				mCounterView.setId(android.support.design.R.id.textinput_counter);
	//   13   27:aload_0         
	//   14   28:getfield        #588 <Field TextView mCounterView>
	//   15   31:getstatic       #999 <Field int android.support.design.R$id.textinput_counter>
	//   16   34:invokevirtual   #1002 <Method void TextView.setId(int)>
				if(mTypeface != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #908 <Field Typeface mTypeface>
	//*  19   41:ifnull          55
					mCounterView.setTypeface(mTypeface);
	//   20   44:aload_0         
	//   21   45:getfield        #588 <Field TextView mCounterView>
	//   22   48:aload_0         
	//   23   49:getfield        #908 <Field Typeface mTypeface>
	//   24   52:invokevirtual   #1004 <Method void TextView.setTypeface(Typeface)>
				mCounterView.setMaxLines(1);
	//   25   55:aload_0         
	//   26   56:getfield        #588 <Field TextView mCounterView>
	//   27   59:iconst_1        
	//   28   60:invokevirtual   #1007 <Method void TextView.setMaxLines(int)>
				try
				{
					TextViewCompat.setTextAppearance(mCounterView, mCounterTextAppearance);
	//   29   63:aload_0         
	//   30   64:getfield        #588 <Field TextView mCounterView>
	//   31   67:aload_0         
	//   32   68:getfield        #248 <Field int mCounterTextAppearance>
	//   33   71:invokestatic    #1010 <Method void TextViewCompat.setTextAppearance(TextView, int)>
				}
	//*  34   74:aload_0         
	//*  35   75:aload_0         
	//*  36   76:getfield        #588 <Field TextView mCounterView>
	//*  37   79:iconst_m1       
	//*  38   80:invokespecial   #1012 <Method void addIndicator(TextView, int)>
	//*  39   83:aload_0         
	//*  40   84:getfield        #356 <Field EditText mEditText>
	//*  41   87:ifnonnull       132
	//*  42   90:aload_0         
	//*  43   91:iconst_0        
	//*  44   92:invokevirtual   #599 <Method void updateCounter(int)>
	//*  45   95:aload_0         
	//*  46   96:iload_1         
	//*  47   97:putfield        #911 <Field boolean mCounterEnabled>
	//*  48  100:return          
				catch(Exception exception)
	//*  49  101:astore_2        
				{
					TextViewCompat.setTextAppearance(mCounterView, android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Caption);
	//   50  102:aload_0         
	//   51  103:getfield        #588 <Field TextView mCounterView>
	//   52  106:getstatic       #1017 <Field int android.support.v7.appcompat.R$style.TextAppearance_AppCompat_Caption>
	//   53  109:invokestatic    #1010 <Method void TextViewCompat.setTextAppearance(TextView, int)>
					mCounterView.setTextColor(ContextCompat.getColor(getContext(), android.support.v7.appcompat.R.color.error_color_material));
	//   54  112:aload_0         
	//   55  113:getfield        #588 <Field TextView mCounterView>
	//   56  116:aload_0         
	//   57  117:invokevirtual   #338 <Method Context getContext()>
	//   58  120:getstatic       #1022 <Field int android.support.v7.appcompat.R$color.error_color_material>
	//   59  123:invokestatic    #1028 <Method int ContextCompat.getColor(Context, int)>
	//   60  126:invokevirtual   #1031 <Method void TextView.setTextColor(int)>
				}
				addIndicator(mCounterView, -1);
				if(mEditText == null)
					updateCounter(0);
				else
	//*  61  129:goto            74
					updateCounter(mEditText.getText().length());
	//   62  132:aload_0         
	//   63  133:aload_0         
	//   64  134:getfield        #356 <Field EditText mEditText>
	//   65  137:invokevirtual   #591 <Method Editable EditText.getText()>
	//   66  140:invokeinterface #596 <Method int Editable.length()>
	//   67  145:invokevirtual   #599 <Method void updateCounter(int)>
			} else
	//*  68  148:goto            95
			{
				removeIndicator(mCounterView);
	//   69  151:aload_0         
	//   70  152:aload_0         
	//   71  153:getfield        #588 <Field TextView mCounterView>
	//   72  156:invokespecial   #1033 <Method void removeIndicator(TextView)>
				mCounterView = null;
	//   73  159:aload_0         
	//   74  160:aconst_null     
	//   75  161:putfield        #588 <Field TextView mCounterView>
			}
			mCounterEnabled = flag;
		}
	//*  76  164:goto            95
	}

	public void setCounterMaxLength(int i)
	{
		if(mCounterMaxLength != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #900 <Field int mCounterMaxLength>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          38
		{
			if(i > 0)
	//*   4    8:iload_1         
	//*   5    9:ifle            39
				mCounterMaxLength = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #900 <Field int mCounterMaxLength>
			else
	//*   9   17:aload_0         
	//*  10   18:getfield        #911 <Field boolean mCounterEnabled>
	//*  11   21:ifeq            38
	//*  12   24:aload_0         
	//*  13   25:getfield        #356 <Field EditText mEditText>
	//*  14   28:ifnonnull       47
	//*  15   31:iconst_0        
	//*  16   32:istore_1        
	//*  17   33:aload_0         
	//*  18   34:iload_1         
	//*  19   35:invokevirtual   #599 <Method void updateCounter(int)>
	//*  20   38:return          
				mCounterMaxLength = -1;
	//   21   39:aload_0         
	//   22   40:iconst_m1       
	//   23   41:putfield        #900 <Field int mCounterMaxLength>
			if(mCounterEnabled)
			{
				if(mEditText == null)
					i = 0;
				else
	//*  24   44:goto            17
					i = mEditText.getText().length();
	//   25   47:aload_0         
	//   26   48:getfield        #356 <Field EditText mEditText>
	//   27   51:invokevirtual   #591 <Method Editable EditText.getText()>
	//   28   54:invokeinterface #596 <Method int Editable.length()>
	//   29   59:istore_1        
				updateCounter(i);
			}
		}
	//*  30   60:goto            33
	}

	public void setEnabled(boolean flag)
	{
		recursiveSetEnabled(((ViewGroup) (this)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #517 <Method void recursiveSetEnabled(ViewGroup, boolean)>
		super.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #1034 <Method void LinearLayout.setEnabled(boolean)>
	//    6   10:return          
	}

	public void setError(CharSequence charsequence)
	{
		boolean flag;
		if(ViewCompat.isLaidOut(((View) (this))) && isEnabled() && (mErrorView == null || !TextUtils.equals(mErrorView.getText(), charsequence)))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #887 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifeq            44
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #890 <Method boolean isEnabled()>
	//*   5   11:ifeq            44
	//*   6   14:aload_0         
	//*   7   15:getfield        #617 <Field TextView mErrorView>
	//*   8   18:ifnull          35
	//*   9   21:aload_0         
	//*  10   22:getfield        #617 <Field TextView mErrorView>
	//*  11   25:invokevirtual   #1036 <Method CharSequence TextView.getText()>
	//*  12   28:aload_1         
	//*  13   29:invokestatic    #1040 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  14   32:ifne            44
			flag = true;
	//   15   35:iconst_1        
	//   16   36:istore_2        
		else
	//*  17   37:aload_0         
	//*  18   38:aload_1         
	//*  19   39:iload_2         
	//*  20   40:invokespecial   #1042 <Method void setError(CharSequence, boolean)>
	//*  21   43:return          
			flag = false;
	//   22   44:iconst_0        
	//   23   45:istore_2        
		setError(charsequence, flag);
	//*  24   46:goto            37
	}

	public void setErrorEnabled(boolean flag)
	{
		if(mErrorEnabled == flag) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #613 <Field boolean mErrorEnabled>
	//    2    4:iload_1         
	//    3    5:icmpeq          180
_L1:
		boolean flag2;
		if(mErrorView != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #617 <Field TextView mErrorView>
	//*   6   12:ifnull          25
			mErrorView.animate().cancel();
	//    7   15:aload_0         
	//    8   16:getfield        #617 <Field TextView mErrorView>
	//    9   19:invokevirtual   #623 <Method ViewPropertyAnimator TextView.animate()>
	//   10   22:invokevirtual   #626 <Method void ViewPropertyAnimator.cancel()>
		if(!flag)
			break MISSING_BLOCK_LABEL_188;
	//   11   25:iload_1         
	//   12   26:ifeq            188
		mErrorView = ((TextView) (new AppCompatTextView(getContext())));
	//   13   29:aload_0         
	//   14   30:new             #993 <Class AppCompatTextView>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokevirtual   #338 <Method Context getContext()>
	//   18   38:invokespecial   #994 <Method void AppCompatTextView(Context)>
	//   19   41:putfield        #617 <Field TextView mErrorView>
		mErrorView.setId(android.support.design.R.id.textinput_error);
	//   20   44:aload_0         
	//   21   45:getfield        #617 <Field TextView mErrorView>
	//   22   48:getstatic       #1045 <Field int android.support.design.R$id.textinput_error>
	//   23   51:invokevirtual   #1002 <Method void TextView.setId(int)>
		if(mTypeface != null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #908 <Field Typeface mTypeface>
	//*  26   58:ifnull          72
			mErrorView.setTypeface(mTypeface);
	//   27   61:aload_0         
	//   28   62:getfield        #617 <Field TextView mErrorView>
	//   29   65:aload_0         
	//   30   66:getfield        #908 <Field Typeface mTypeface>
	//   31   69:invokevirtual   #1004 <Method void TextView.setTypeface(Typeface)>
		flag2 = false;
	//   32   72:iconst_0        
	//   33   73:istore_3        
		TextViewCompat.setTextAppearance(mErrorView, mErrorTextAppearance);
	//   34   74:aload_0         
	//   35   75:getfield        #617 <Field TextView mErrorView>
	//   36   78:aload_0         
	//   37   79:getfield        #228 <Field int mErrorTextAppearance>
	//   38   82:invokestatic    #1010 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		boolean flag1 = flag2;
	//   39   85:iload_3         
	//   40   86:istore_2        
		int i;
		if(android.os.Build.VERSION.SDK_INT < 23)
			break MISSING_BLOCK_LABEL_119;
	//   41   87:getstatic       #441 <Field int android.os.Build$VERSION.SDK_INT>
	//   42   90:bipush          23
	//   43   92:icmplt          119
		i = mErrorView.getTextColors().getDefaultColor();
	//   44   95:aload_0         
	//   45   96:getfield        #617 <Field TextView mErrorView>
	//   46   99:invokevirtual   #1048 <Method ColorStateList TextView.getTextColors()>
	//   47  102:invokevirtual   #1053 <Method int ColorStateList.getDefaultColor()>
	//   48  105:istore          4
		flag1 = flag2;
	//   49  107:iload_3         
	//   50  108:istore_2        
		if(i == -65281)
	//*  51  109:iload           4
	//*  52  111:ldc2            #1054 <Int -65281>
	//*  53  114:icmpne          119
			flag1 = true;
	//   54  117:iconst_1        
	//   55  118:istore_2        
_L3:
		if(flag1)
	//*  56  119:iload_2         
	//*  57  120:ifeq            150
		{
			TextViewCompat.setTextAppearance(mErrorView, android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Caption);
	//   58  123:aload_0         
	//   59  124:getfield        #617 <Field TextView mErrorView>
	//   60  127:getstatic       #1017 <Field int android.support.v7.appcompat.R$style.TextAppearance_AppCompat_Caption>
	//   61  130:invokestatic    #1010 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			mErrorView.setTextColor(ContextCompat.getColor(getContext(), android.support.v7.appcompat.R.color.error_color_material));
	//   62  133:aload_0         
	//   63  134:getfield        #617 <Field TextView mErrorView>
	//   64  137:aload_0         
	//   65  138:invokevirtual   #338 <Method Context getContext()>
	//   66  141:getstatic       #1022 <Field int android.support.v7.appcompat.R$color.error_color_material>
	//   67  144:invokestatic    #1028 <Method int ContextCompat.getColor(Context, int)>
	//   68  147:invokevirtual   #1031 <Method void TextView.setTextColor(int)>
		}
		mErrorView.setVisibility(4);
	//   69  150:aload_0         
	//   70  151:getfield        #617 <Field TextView mErrorView>
	//   71  154:iconst_4        
	//   72  155:invokevirtual   #630 <Method void TextView.setVisibility(int)>
		ViewCompat.setAccessibilityLiveRegion(((View) (mErrorView)), 1);
	//   73  158:aload_0         
	//   74  159:getfield        #617 <Field TextView mErrorView>
	//   75  162:iconst_1        
	//   76  163:invokestatic    #1057 <Method void ViewCompat.setAccessibilityLiveRegion(View, int)>
		addIndicator(mErrorView, 0);
	//   77  166:aload_0         
	//   78  167:aload_0         
	//   79  168:getfield        #617 <Field TextView mErrorView>
	//   80  171:iconst_0        
	//   81  172:invokespecial   #1012 <Method void addIndicator(TextView, int)>
_L4:
		mErrorEnabled = flag;
	//   82  175:aload_0         
	//   83  176:iload_1         
	//   84  177:putfield        #613 <Field boolean mErrorEnabled>
_L2:
		return;
	//   85  180:return          
		Exception exception;
		exception;
	//   86  181:astore          5
		flag1 = true;
	//   87  183:iconst_1        
	//   88  184:istore_2        
		  goto _L3
	//*  89  185:goto            119
		mErrorShown = false;
	//   90  188:aload_0         
	//   91  189:iconst_0        
	//   92  190:putfield        #615 <Field boolean mErrorShown>
		updateEditTextBackground();
	//   93  193:aload_0         
	//   94  194:invokespecial   #664 <Method void updateEditTextBackground()>
		removeIndicator(mErrorView);
	//   95  197:aload_0         
	//   96  198:aload_0         
	//   97  199:getfield        #617 <Field TextView mErrorView>
	//   98  202:invokespecial   #1033 <Method void removeIndicator(TextView)>
		mErrorView = null;
	//   99  205:aload_0         
	//  100  206:aconst_null     
	//  101  207:putfield        #617 <Field TextView mErrorView>
		  goto _L4
	//* 102  210:goto            175
	}

	public void setErrorTextAppearance(int i)
	{
		mErrorTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #228 <Field int mErrorTextAppearance>
		if(mErrorView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #617 <Field TextView mErrorView>
	//*   5    9:ifnull          20
			TextViewCompat.setTextAppearance(mErrorView, i);
	//    6   12:aload_0         
	//    7   13:getfield        #617 <Field TextView mErrorView>
	//    8   16:iload_1         
	//    9   17:invokestatic    #1010 <Method void TextViewCompat.setTextAppearance(TextView, int)>
	//   10   20:return          
	}

	public void setHint(CharSequence charsequence)
	{
		if(mHintEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field boolean mHintEnabled>
	//*   2    4:ifeq            19
		{
			setHintInternal(charsequence);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1061 <Method void setHintInternal(CharSequence)>
			sendAccessibilityEvent(2048);
	//    6   12:aload_0         
	//    7   13:sipush          2048
	//    8   16:invokevirtual   #1064 <Method void sendAccessibilityEvent(int)>
		}
	//    9   19:return          
	}

	public void setHintAnimationEnabled(boolean flag)
	{
		mHintAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #198 <Field boolean mHintAnimationEnabled>
	//    3    5:return          
	}

	public void setHintEnabled(boolean flag)
	{
		if(flag == mHintEnabled) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #182 <Field boolean mHintEnabled>
	//    3    5:icmpeq          72
_L1:
		CharSequence charsequence;
		mHintEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #182 <Field boolean mHintEnabled>
		charsequence = mEditText.getHint();
	//    7   13:aload_0         
	//    8   14:getfield        #356 <Field EditText mEditText>
	//    9   17:invokevirtual   #583 <Method CharSequence EditText.getHint()>
	//   10   20:astore_2        
		if(mHintEnabled) goto _L4; else goto _L3
	//   11   21:aload_0         
	//   12   22:getfield        #182 <Field boolean mHintEnabled>
	//   13   25:ifne            73
_L3:
		if(!TextUtils.isEmpty(mHint) && TextUtils.isEmpty(charsequence))
	//*  14   28:aload_0         
	//*  15   29:getfield        #573 <Field CharSequence mHint>
	//*  16   32:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   35:ifne            56
	//*  18   38:aload_2         
	//*  19   39:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   42:ifeq            56
			mEditText.setHint(mHint);
	//   21   45:aload_0         
	//   22   46:getfield        #356 <Field EditText mEditText>
	//   23   49:aload_0         
	//   24   50:getfield        #573 <Field CharSequence mHint>
	//   25   53:invokevirtual   #586 <Method void EditText.setHint(CharSequence)>
		setHintInternal(((CharSequence) (null)));
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:invokespecial   #1061 <Method void setHintInternal(CharSequence)>
_L6:
		if(mEditText != null)
	//*  29   61:aload_0         
	//*  30   62:getfield        #356 <Field EditText mEditText>
	//*  31   65:ifnull          72
			updateInputLayoutMargins();
	//   32   68:aload_0         
	//   33   69:invokespecial   #830 <Method void updateInputLayoutMargins()>
_L2:
		return;
	//   34   72:return          
_L4:
		if(!TextUtils.isEmpty(charsequence))
	//*  35   73:aload_2         
	//*  36   74:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   77:ifne            61
		{
			if(TextUtils.isEmpty(mHint))
	//*  38   80:aload_0         
	//*  39   81:getfield        #573 <Field CharSequence mHint>
	//*  40   84:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   87:ifeq            95
				setHint(charsequence);
	//   42   90:aload_0         
	//   43   91:aload_2         
	//   44   92:invokevirtual   #193 <Method void setHint(CharSequence)>
			mEditText.setHint(((CharSequence) (null)));
	//   45   95:aload_0         
	//   46   96:getfield        #356 <Field EditText mEditText>
	//   47   99:aconst_null     
	//   48  100:invokevirtual   #586 <Method void EditText.setHint(CharSequence)>
		}
		if(true) goto _L6; else goto _L5
	//   49  103:goto            61
_L5:
	}

	public void setHintTextAppearance(int i)
	{
		mCollapsingTextHelper.setCollapsedTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1069 <Method void CollapsingTextHelper.setCollapsedTextAppearance(int)>
		mFocusedTextColor = mCollapsingTextHelper.getCollapsedTextColor();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//    7   13:invokevirtual   #1072 <Method ColorStateList CollapsingTextHelper.getCollapsedTextColor()>
	//    8   16:putfield        #211 <Field ColorStateList mFocusedTextColor>
		if(mEditText != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #356 <Field EditText mEditText>
	//*  11   23:ifnull          35
		{
			updateLabelState(false);
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #666 <Method void updateLabelState(boolean)>
			updateInputLayoutMargins();
	//   15   31:aload_0         
	//   16   32:invokespecial   #830 <Method void updateInputLayoutMargins()>
		}
	//   17   35:return          
	}

	public void setPasswordVisibilityToggleContentDescription(int i)
	{
		CharSequence charsequence;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
			charsequence = getResources().getText(i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1078 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1081 <Method CharSequence Resources.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #1083 <Method void setPasswordVisibilityToggleContentDescription(CharSequence)>
	//*  10   18:return          
			charsequence = null;
	//   11   19:aconst_null     
	//   12   20:astore_2        
		setPasswordVisibilityToggleContentDescription(charsequence);
	//*  13   21:goto            13
	}

	public void setPasswordVisibilityToggleContentDescription(CharSequence charsequence)
	{
		mPasswordToggleContentDesc = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #272 <Field CharSequence mPasswordToggleContentDesc>
		if(mPasswordToggleView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//*   5    9:ifnull          20
			mPasswordToggleView.setContentDescription(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #765 <Method void CheckableImageButton.setContentDescription(CharSequence)>
	//   10   20:return          
	}

	public void setPasswordVisibilityToggleDrawable(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #338 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1090 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #1092 <Method void setPasswordVisibilityToggleDrawable(Drawable)>
	//*  10   18:return          
			drawable = null;
	//   11   19:aconst_null     
	//   12   20:astore_2        
		setPasswordVisibilityToggleDrawable(drawable);
	//*  13   21:goto            13
	}

	public void setPasswordVisibilityToggleDrawable(Drawable drawable)
	{
		mPasswordToggleDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #267 <Field Drawable mPasswordToggleDrawable>
		if(mPasswordToggleView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//*   5    9:ifnull          20
			mPasswordToggleView.setImageDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #404 <Field CheckableImageButton mPasswordToggleView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #412 <Method void CheckableImageButton.setImageDrawable(Drawable)>
	//   10   20:return          
	}

	public void setPasswordVisibilityToggleEnabled(boolean flag)
	{
		if(mPasswordToggleEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #258 <Field boolean mPasswordToggleEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          50
		{
			mPasswordToggleEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #258 <Field boolean mPasswordToggleEnabled>
			if(!flag && mPasswordToggledVisible && mEditText != null)
	//*   7   13:iload_1         
	//*   8   14:ifne            41
	//*   9   17:aload_0         
	//*  10   18:getfield        #486 <Field boolean mPasswordToggledVisible>
	//*  11   21:ifeq            41
	//*  12   24:aload_0         
	//*  13   25:getfield        #356 <Field EditText mEditText>
	//*  14   28:ifnull          41
				mEditText.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   15   31:aload_0         
	//   16   32:getfield        #356 <Field EditText mEditText>
	//   17   35:invokestatic    #499 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   18   38:invokevirtual   #484 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
			mPasswordToggledVisible = false;
	//   19   41:aload_0         
	//   20   42:iconst_0        
	//   21   43:putfield        #486 <Field boolean mPasswordToggledVisible>
			updatePasswordToggleView();
	//   22   46:aload_0         
	//   23   47:invokespecial   #602 <Method void updatePasswordToggleView()>
		}
	//   24   50:return          
	}

	public void setPasswordVisibilityToggleTintList(ColorStateList colorstatelist)
	{
		mPasswordToggleTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #279 <Field ColorStateList mPasswordToggleTintList>
		mHasPasswordToggleTintList = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #277 <Field boolean mHasPasswordToggleTintList>
		applyPasswordToggleTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #304 <Method void applyPasswordToggleTint()>
	//    8   14:return          
	}

	public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mPasswordToggleTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #292 <Field android.graphics.PorterDuff$Mode mPasswordToggleTintMode>
		mHasPasswordToggleTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #284 <Field boolean mHasPasswordToggleTintMode>
		applyPasswordToggleTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #304 <Method void applyPasswordToggleTint()>
	//    8   14:return          
	}

	public void setTypeface(Typeface typeface)
	{
		if(mTypeface != null && !mTypeface.equals(((Object) (typeface))) || mTypeface == null && typeface != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #908 <Field Typeface mTypeface>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #908 <Field Typeface mTypeface>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #1102 <Method boolean Typeface.equals(Object)>
	//*   7   15:ifeq            29
	//*   8   18:aload_0         
	//*   9   19:getfield        #908 <Field Typeface mTypeface>
	//*  10   22:ifnonnull       72
	//*  11   25:aload_1         
	//*  12   26:ifnull          72
		{
			mTypeface = typeface;
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:putfield        #908 <Field Typeface mTypeface>
			mCollapsingTextHelper.setTypefaces(typeface);
	//   16   34:aload_0         
	//   17   35:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #549 <Method void CollapsingTextHelper.setTypefaces(Typeface)>
			if(mCounterView != null)
	//*  20   42:aload_0         
	//*  21   43:getfield        #588 <Field TextView mCounterView>
	//*  22   46:ifnull          57
				mCounterView.setTypeface(typeface);
	//   23   49:aload_0         
	//   24   50:getfield        #588 <Field TextView mCounterView>
	//   25   53:aload_1         
	//   26   54:invokevirtual   #1004 <Method void TextView.setTypeface(Typeface)>
			if(mErrorView != null)
	//*  27   57:aload_0         
	//*  28   58:getfield        #617 <Field TextView mErrorView>
	//*  29   61:ifnull          72
				mErrorView.setTypeface(typeface);
	//   30   64:aload_0         
	//   31   65:getfield        #617 <Field TextView mErrorView>
	//   32   68:aload_1         
	//   33   69:invokevirtual   #1004 <Method void TextView.setTypeface(Typeface)>
		}
	//   34   72:return          
	}

	void updateCounter(int i)
	{
		boolean flag1 = mCounterOverflowed;
	//    0    0:aload_0         
	//    1    1:getfield        #707 <Field boolean mCounterOverflowed>
	//    2    4:istore          4
		if(mCounterMaxLength == -1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #900 <Field int mCounterMaxLength>
	//*   5   10:iconst_m1       
	//*   6   11:icmpne          56
		{
			mCounterView.setText(((CharSequence) (String.valueOf(i))));
	//    7   14:aload_0         
	//    8   15:getfield        #588 <Field TextView mCounterView>
	//    9   18:iload_1         
	//   10   19:invokestatic    #1108 <Method String String.valueOf(int)>
	//   11   22:invokevirtual   #629 <Method void TextView.setText(CharSequence)>
			mCounterOverflowed = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #707 <Field boolean mCounterOverflowed>
		} else
	//*  15   30:aload_0         
	//*  16   31:getfield        #356 <Field EditText mEditText>
	//*  17   34:ifnull          55
	//*  18   37:iload           4
	//*  19   39:aload_0         
	//*  20   40:getfield        #707 <Field boolean mCounterOverflowed>
	//*  21   43:icmpeq          55
	//*  22   46:aload_0         
	//*  23   47:iconst_0        
	//*  24   48:invokevirtual   #666 <Method void updateLabelState(boolean)>
	//*  25   51:aload_0         
	//*  26   52:invokespecial   #664 <Method void updateEditTextBackground()>
	//*  27   55:return          
		{
			boolean flag;
			if(i > mCounterMaxLength)
	//*  28   56:iload_1         
	//*  29   57:aload_0         
	//*  30   58:getfield        #900 <Field int mCounterMaxLength>
	//*  31   61:icmple          145
				flag = true;
	//   32   64:iconst_1        
	//   33   65:istore_3        
			else
	//*  34   66:aload_0         
	//*  35   67:iload_3         
	//*  36   68:putfield        #707 <Field boolean mCounterOverflowed>
	//*  37   71:iload           4
	//*  38   73:aload_0         
	//*  39   74:getfield        #707 <Field boolean mCounterOverflowed>
	//*  40   77:icmpeq          104
	//*  41   80:aload_0         
	//*  42   81:getfield        #588 <Field TextView mCounterView>
	//*  43   84:astore          5
	//*  44   86:aload_0         
	//*  45   87:getfield        #707 <Field boolean mCounterOverflowed>
	//*  46   90:ifeq            150
	//*  47   93:aload_0         
	//*  48   94:getfield        #253 <Field int mCounterOverflowTextAppearance>
	//*  49   97:istore_2        
	//*  50   98:aload           5
	//*  51  100:iload_2         
	//*  52  101:invokestatic    #1010 <Method void TextViewCompat.setTextAppearance(TextView, int)>
	//*  53  104:aload_0         
	//*  54  105:getfield        #588 <Field TextView mCounterView>
	//*  55  108:aload_0         
	//*  56  109:invokevirtual   #338 <Method Context getContext()>
	//*  57  112:getstatic       #1113 <Field int android.support.design.R$string.character_counter_pattern>
	//*  58  115:iconst_2        
	//*  59  116:anewarray       Object[]
	//*  60  119:dup             
	//*  61  120:iconst_0        
	//*  62  121:iload_1         
	//*  63  122:invokestatic    #1120 <Method Integer Integer.valueOf(int)>
	//*  64  125:aastore         
	//*  65  126:dup             
	//*  66  127:iconst_1        
	//*  67  128:aload_0         
	//*  68  129:getfield        #900 <Field int mCounterMaxLength>
	//*  69  132:invokestatic    #1120 <Method Integer Integer.valueOf(int)>
	//*  70  135:aastore         
	//*  71  136:invokevirtual   #1126 <Method String Context.getString(int, Object[])>
	//*  72  139:invokevirtual   #629 <Method void TextView.setText(CharSequence)>
	//*  73  142:goto            30
				flag = false;
	//   74  145:iconst_0        
	//   75  146:istore_3        
			mCounterOverflowed = flag;
			if(flag1 != mCounterOverflowed)
			{
				TextView textview = mCounterView;
				int j;
				if(mCounterOverflowed)
					j = mCounterOverflowTextAppearance;
				else
	//*  76  147:goto            66
					j = mCounterTextAppearance;
	//   77  150:aload_0         
	//   78  151:getfield        #248 <Field int mCounterTextAppearance>
	//   79  154:istore_2        
				TextViewCompat.setTextAppearance(textview, j);
			}
			mCounterView.setText(((CharSequence) (getContext().getString(android.support.design.R.string.character_counter_pattern, new Object[] {
				Integer.valueOf(i), Integer.valueOf(mCounterMaxLength)
			}))));
		}
		if(mEditText != null && flag1 != mCounterOverflowed)
		{
			updateLabelState(false);
			updateEditTextBackground();
		}
	//*  80  155:goto            98
	}

	void updateLabelState(boolean flag)
	{
		updateLabelState(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #606 <Method void updateLabelState(boolean, boolean)>
	//    4    6:return          
	}

	void updateLabelState(boolean flag, boolean flag1)
	{
		boolean flag4;
		boolean flag5;
		flag4 = isEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #890 <Method boolean isEnabled()>
	//    2    4:istore          5
		boolean flag2;
		boolean flag3;
		if(mEditText != null && !TextUtils.isEmpty(((CharSequence) (mEditText.getText()))))
	//*   3    6:aload_0         
	//*   4    7:getfield        #356 <Field EditText mEditText>
	//*   5   10:ifnull          142
	//*   6   13:aload_0         
	//*   7   14:getfield        #356 <Field EditText mEditText>
	//*   8   17:invokevirtual   #591 <Method Editable EditText.getText()>
	//*   9   20:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   23:ifne            142
			flag2 = true;
	//   11   26:iconst_1        
	//   12   27:istore_3        
		else
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #883 <Method int[] getDrawableState()>
	//*  15   32:ldc2            #1127 <Int 0x101009c>
	//*  16   35:invokestatic    #1129 <Method boolean arrayContains(int[], int)>
	//*  17   38:istore          6
	//*  18   40:aload_0         
	//*  19   41:invokevirtual   #989 <Method CharSequence getError()>
	//*  20   44:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   47:ifne            147
	//*  22   50:iconst_1        
	//*  23   51:istore          4
	//*  24   53:aload_0         
	//*  25   54:getfield        #213 <Field ColorStateList mDefaultTextColor>
	//*  26   57:ifnull          71
	//*  27   60:aload_0         
	//*  28   61:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//*  29   64:aload_0         
	//*  30   65:getfield        #213 <Field ColorStateList mDefaultTextColor>
	//*  31   68:invokevirtual   #1132 <Method void CollapsingTextHelper.setExpandedTextColor(ColorStateList)>
	//*  32   71:iload           5
	//*  33   73:ifeq            153
	//*  34   76:aload_0         
	//*  35   77:getfield        #707 <Field boolean mCounterOverflowed>
	//*  36   80:ifeq            153
	//*  37   83:aload_0         
	//*  38   84:getfield        #588 <Field TextView mCounterView>
	//*  39   87:ifnull          153
	//*  40   90:aload_0         
	//*  41   91:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//*  42   94:aload_0         
	//*  43   95:getfield        #588 <Field TextView mCounterView>
	//*  44   98:invokevirtual   #1048 <Method ColorStateList TextView.getTextColors()>
	//*  45  101:invokevirtual   #1135 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
	//*  46  104:iload_3         
	//*  47  105:ifne            125
	//*  48  108:aload_0         
	//*  49  109:invokevirtual   #890 <Method boolean isEnabled()>
	//*  50  112:ifeq            205
	//*  51  115:iload           6
	//*  52  117:ifne            125
	//*  53  120:iload           4
	//*  54  122:ifeq            205
	//*  55  125:iload_2         
	//*  56  126:ifne            136
	//*  57  129:aload_0         
	//*  58  130:getfield        #432 <Field boolean mHintExpanded>
	//*  59  133:ifeq            141
	//*  60  136:aload_0         
	//*  61  137:iload_1         
	//*  62  138:invokespecial   #1137 <Method void collapseHint(boolean)>
	//*  63  141:return          
			flag2 = false;
	//   64  142:iconst_0        
	//   65  143:istore_3        
		flag5 = arrayContains(getDrawableState(), 0x101009c);
		if(!TextUtils.isEmpty(getError()))
			flag3 = true;
		else
	//*  66  144:goto            28
			flag3 = false;
	//   67  147:iconst_0        
	//   68  148:istore          4
		if(mDefaultTextColor != null)
			mCollapsingTextHelper.setExpandedTextColor(mDefaultTextColor);
		if(!flag4 || !mCounterOverflowed || mCounterView == null) goto _L2; else goto _L1
_L1:
		mCollapsingTextHelper.setCollapsedTextColor(mCounterView.getTextColors());
_L8:
		if(!flag2 && (!isEnabled() || !flag5 && !flag3)) goto _L4; else goto _L3
_L3:
		if(flag1 || mHintExpanded)
			collapseHint(flag);
_L6:
		return;
	//*  69  150:goto            53
_L2:
		if(flag4 && flag5 && mFocusedTextColor != null)
	//*  70  153:iload           5
	//*  71  155:ifeq            184
	//*  72  158:iload           6
	//*  73  160:ifeq            184
	//*  74  163:aload_0         
	//*  75  164:getfield        #211 <Field ColorStateList mFocusedTextColor>
	//*  76  167:ifnull          184
			mCollapsingTextHelper.setCollapsedTextColor(mFocusedTextColor);
	//   77  170:aload_0         
	//   78  171:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   79  174:aload_0         
	//   80  175:getfield        #211 <Field ColorStateList mFocusedTextColor>
	//   81  178:invokevirtual   #1135 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
		else
	//*  82  181:goto            104
		if(mDefaultTextColor != null)
	//*  83  184:aload_0         
	//*  84  185:getfield        #213 <Field ColorStateList mDefaultTextColor>
	//*  85  188:ifnull          104
			mCollapsingTextHelper.setCollapsedTextColor(mDefaultTextColor);
	//   86  191:aload_0         
	//   87  192:getfield        #111 <Field CollapsingTextHelper mCollapsingTextHelper>
	//   88  195:aload_0         
	//   89  196:getfield        #213 <Field ColorStateList mDefaultTextColor>
	//   90  199:invokevirtual   #1135 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
		continue; /* Loop/switch isn't completed */
	//   91  202:goto            104
_L4:
		if(!flag1 && mHintExpanded) goto _L6; else goto _L5
	//   92  205:iload_2         
	//   93  206:ifne            216
	//   94  209:aload_0         
	//   95  210:getfield        #432 <Field boolean mHintExpanded>
	//   96  213:ifne            141
_L5:
		expandHint(flag);
	//   97  216:aload_0         
	//   98  217:iload_1         
	//   99  218:invokespecial   #1139 <Method void expandHint(boolean)>
		return;
	//  100  221:return          
		if(true) goto _L8; else goto _L7
_L7:
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
	//    1    1:getfield        #325 <Field boolean mRestoringSavedState>
	//    2    4:ireturn         
	}

*/


/*
	static void access$100(TextInputLayout textinputlayout, boolean flag)
	{
		textinputlayout.passwordVisibilityToggleRequested(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #330 <Method void passwordVisibilityToggleRequested(boolean)>
		return;
	//    3    5:return          
	}

*/
}
