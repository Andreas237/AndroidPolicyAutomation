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
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
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
import o.*;

// Referenced classes of package android.support.design.widget:
//			CheckableImageButton, TextInputEditText

public class TextInputLayout extends LinearLayout
{
	static class SavedState extends AbsSavedState
	{

		public String toString()
		{
			return (new StringBuilder()).append("TextInputLayout.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" error=").append(((Object) (error))).append("}").toString();
		//    0    0:new             #53  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #54  <Method void StringBuilder()>
		//    3    7:ldc1            #56  <String "TextInputLayout.SavedState{">
		//    4    9:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:invokestatic    #66  <Method int System.identityHashCode(Object)>
		//    7   16:invokestatic    #72  <Method String Integer.toHexString(int)>
		//    8   19:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #74  <String " error=">
		//   10   24:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_0         
		//   12   28:getfield        #46  <Field CharSequence error>
		//   13   31:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
		//   14   34:ldc1            #79  <String "}">
		//   15   36:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   17   42:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #85  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			TextUtils.writeToParcel(error, parcel, i);
		//    4    6:aload_0         
		//    5    7:getfield        #46  <Field CharSequence error>
		//    6   10:aload_1         
		//    7   11:iload_2         
		//    8   12:invokestatic    #88  <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		//    9   15:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

			public SavedState b(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class TextInputLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void TextInputLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] b(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (b(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #27  <Method TextInputLayout$SavedState b(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (b(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method TextInputLayout$SavedState[] b(int)>
			//    3    5:areturn         
			}

		}
);
		CharSequence error;

		static 
		{
		//    0    0:new             #9   <Class TextInputLayout$SavedState$2>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void TextInputLayout$SavedState$2()>
		//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
			error = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
		//    4    6:aload_0         
		//    5    7:getstatic       #36  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//    6   10:aload_1         
		//    7   11:invokeinterface #42  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    8   16:checkcast       #44  <Class CharSequence>
		//    9   19:putfield        #46  <Field CharSequence error>
		//   10   22:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #49  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	class d extends AccessibilityDelegateCompat
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
			view = ((View) (e.mCollapsingTextHelper.k()));
		//    8   15:aload_0         
		//    9   16:getfield        #13  <Field TextInputLayout e>
		//   10   19:getfield        #44  <Field n TextInputLayout.mCollapsingTextHelper>
		//   11   22:invokevirtual   #50  <Method CharSequence n.k()>
		//   12   25:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (view))))
		//*  13   26:aload_1         
		//*  14   27:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  15   30:ifne            38
				accessibilitynodeinfocompat.setText(((CharSequence) (view)));
		//   16   33:aload_2         
		//   17   34:aload_1         
		//   18   35:invokevirtual   #59  <Method void AccessibilityNodeInfoCompat.setText(CharSequence)>
			if(e.mEditText != null)
		//*  19   38:aload_0         
		//*  20   39:getfield        #13  <Field TextInputLayout e>
		//*  21   42:getfield        #63  <Field EditText TextInputLayout.mEditText>
		//*  22   45:ifnull          59
				accessibilitynodeinfocompat.setLabelFor(((View) (e.mEditText)));
		//   23   48:aload_2         
		//   24   49:aload_0         
		//   25   50:getfield        #13  <Field TextInputLayout e>
		//   26   53:getfield        #63  <Field EditText TextInputLayout.mEditText>
		//   27   56:invokevirtual   #67  <Method void AccessibilityNodeInfoCompat.setLabelFor(View)>
			if(e.mErrorView != null)
		//*  28   59:aload_0         
		//*  29   60:getfield        #13  <Field TextInputLayout e>
		//*  30   63:getfield        #71  <Field TextView TextInputLayout.mErrorView>
		//*  31   66:ifnull          83
				view = ((View) (e.mErrorView.getText()));
		//   32   69:aload_0         
		//   33   70:getfield        #13  <Field TextInputLayout e>
		//   34   73:getfield        #71  <Field TextView TextInputLayout.mErrorView>
		//   35   76:invokevirtual   #76  <Method CharSequence TextView.getText()>
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
		//   45   94:invokevirtual   #80  <Method void AccessibilityNodeInfoCompat.setContentInvalid(boolean)>
				accessibilitynodeinfocompat.setError(((CharSequence) (view)));
		//   46   97:aload_2         
		//   47   98:aload_1         
		//   48   99:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.setError(CharSequence)>
			}
		//   49  102:return          
		}

		public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			super.onPopulateAccessibilityEvent(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #86  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
			view = ((View) (e.mCollapsingTextHelper.k()));
		//    4    6:aload_0         
		//    5    7:getfield        #13  <Field TextInputLayout e>
		//    6   10:getfield        #44  <Field n TextInputLayout.mCollapsingTextHelper>
		//    7   13:invokevirtual   #50  <Method CharSequence n.k()>
		//    8   16:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (view))))
		//*   9   17:aload_1         
		//*  10   18:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  11   21:ifne            35
				accessibilityevent.getText().add(((Object) (view)));
		//   12   24:aload_2         
		//   13   25:invokevirtual   #89  <Method List AccessibilityEvent.getText()>
		//   14   28:aload_1         
		//   15   29:invokeinterface #95  <Method boolean List.add(Object)>
		//   16   34:pop             
		//   17   35:return          
		}

		final TextInputLayout e;

		d()
		{
			e = TextInputLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field TextInputLayout e>
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
	//    3    3:invokespecial   #91  <Method void TextInputLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #95  <Method void TextInputLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #96  <Method void LinearLayout(Context, AttributeSet)>
		mTmpRect = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #98  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #101 <Method void Rect()>
	//    8   14:putfield        #103 <Field Rect mTmpRect>
		mCollapsingTextHelper = new n(((View) (this)));
	//    9   17:aload_0         
	//   10   18:new             #105 <Class n>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #108 <Method void n(View)>
	//   14   26:putfield        #110 <Field n mCollapsingTextHelper>
		aa.b(context);
	//   15   29:aload_1         
	//   16   30:invokestatic    #115 <Method void aa.b(Context)>
		setOrientation(1);
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #119 <Method void setOrientation(int)>
		setWillNotDraw(false);
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #123 <Method void setWillNotDraw(boolean)>
		setAddStatesFromChildren(true);
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:invokevirtual   #126 <Method void setAddStatesFromChildren(boolean)>
		mInputFrame = new FrameLayout(context);
	//   26   48:aload_0         
	//   27   49:new             #128 <Class FrameLayout>
	//   28   52:dup             
	//   29   53:aload_1         
	//   30   54:invokespecial   #130 <Method void FrameLayout(Context)>
	//   31   57:putfield        #132 <Field FrameLayout mInputFrame>
		mInputFrame.setAddStatesFromChildren(true);
	//   32   60:aload_0         
	//   33   61:getfield        #132 <Field FrameLayout mInputFrame>
	//   34   64:iconst_1        
	//   35   65:invokevirtual   #133 <Method void FrameLayout.setAddStatesFromChildren(boolean)>
		addView(((View) (mInputFrame)));
	//   36   68:aload_0         
	//   37   69:aload_0         
	//   38   70:getfield        #132 <Field FrameLayout mInputFrame>
	//   39   73:invokevirtual   #136 <Method void addView(View)>
		mCollapsingTextHelper.b(p.a);
	//   40   76:aload_0         
	//   41   77:getfield        #110 <Field n mCollapsingTextHelper>
	//   42   80:getstatic       #142 <Field android.view.animation.Interpolator p.a>
	//   43   83:invokevirtual   #145 <Method void n.b(android.view.animation.Interpolator)>
		mCollapsingTextHelper.d(((android.view.animation.Interpolator) (new AccelerateInterpolator())));
	//   44   86:aload_0         
	//   45   87:getfield        #110 <Field n mCollapsingTextHelper>
	//   46   90:new             #147 <Class AccelerateInterpolator>
	//   47   93:dup             
	//   48   94:invokespecial   #148 <Method void AccelerateInterpolator()>
	//   49   97:invokevirtual   #150 <Method void n.d(android.view.animation.Interpolator)>
		mCollapsingTextHelper.b(0x800033);
	//   50  100:aload_0         
	//   51  101:getfield        #110 <Field n mCollapsingTextHelper>
	//   52  104:ldc1            #151 <Int 0x800033>
	//   53  106:invokevirtual   #153 <Method void n.b(int)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.TextInputLayout, i, android.support.design.R.style.Widget_Design_TextInputLayout)));
	//   54  109:aload_1         
	//   55  110:aload_2         
	//   56  111:getstatic       #158 <Field int[] android.support.design.R$styleable.TextInputLayout>
	//   57  114:iload_3         
	//   58  115:getstatic       #163 <Field int android.support.design.R$style.Widget_Design_TextInputLayout>
	//   59  118:invokestatic    #169 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   60  121:astore_1        
		mHintEnabled = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_hintEnabled, true);
	//   61  122:aload_0         
	//   62  123:aload_1         
	//   63  124:getstatic       #172 <Field int android.support.design.R$styleable.TextInputLayout_hintEnabled>
	//   64  127:iconst_1        
	//   65  128:invokevirtual   #176 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   66  131:putfield        #178 <Field boolean mHintEnabled>
		setHint(((TintTypedArray) (context)).getText(android.support.design.R.styleable.TextInputLayout_android_hint));
	//   67  134:aload_0         
	//   68  135:aload_1         
	//   69  136:getstatic       #181 <Field int android.support.design.R$styleable.TextInputLayout_android_hint>
	//   70  139:invokevirtual   #185 <Method CharSequence TintTypedArray.getText(int)>
	//   71  142:invokevirtual   #189 <Method void setHint(CharSequence)>
		mHintAnimationEnabled = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_hintAnimationEnabled, true);
	//   72  145:aload_0         
	//   73  146:aload_1         
	//   74  147:getstatic       #192 <Field int android.support.design.R$styleable.TextInputLayout_hintAnimationEnabled>
	//   75  150:iconst_1        
	//   76  151:invokevirtual   #176 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   77  154:putfield        #194 <Field boolean mHintAnimationEnabled>
		if(((TintTypedArray) (context)).hasValue(android.support.design.R.styleable.TextInputLayout_android_textColorHint))
	//*  78  157:aload_1         
	//*  79  158:getstatic       #197 <Field int android.support.design.R$styleable.TextInputLayout_android_textColorHint>
	//*  80  161:invokevirtual   #201 <Method boolean TintTypedArray.hasValue(int)>
	//*  81  164:ifeq            185
		{
			attributeset = ((AttributeSet) (((TintTypedArray) (context)).getColorStateList(android.support.design.R.styleable.TextInputLayout_android_textColorHint)));
	//   82  167:aload_1         
	//   83  168:getstatic       #197 <Field int android.support.design.R$styleable.TextInputLayout_android_textColorHint>
	//   84  171:invokevirtual   #205 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   85  174:astore_2        
			mFocusedTextColor = ((ColorStateList) (attributeset));
	//   86  175:aload_0         
	//   87  176:aload_2         
	//   88  177:putfield        #207 <Field ColorStateList mFocusedTextColor>
			mDefaultTextColor = ((ColorStateList) (attributeset));
	//   89  180:aload_0         
	//   90  181:aload_2         
	//   91  182:putfield        #209 <Field ColorStateList mDefaultTextColor>
		}
		if(((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, -1) != -1)
	//*  92  185:aload_1         
	//*  93  186:getstatic       #212 <Field int android.support.design.R$styleable.TextInputLayout_hintTextAppearance>
	//*  94  189:iconst_m1       
	//*  95  190:invokevirtual   #216 <Method int TintTypedArray.getResourceId(int, int)>
	//*  96  193:iconst_m1       
	//*  97  194:icmpeq          209
			setHintTextAppearance(((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, 0));
	//   98  197:aload_0         
	//   99  198:aload_1         
	//  100  199:getstatic       #212 <Field int android.support.design.R$styleable.TextInputLayout_hintTextAppearance>
	//  101  202:iconst_0        
	//  102  203:invokevirtual   #216 <Method int TintTypedArray.getResourceId(int, int)>
	//  103  206:invokevirtual   #219 <Method void setHintTextAppearance(int)>
		mErrorTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_errorTextAppearance, 0);
	//  104  209:aload_0         
	//  105  210:aload_1         
	//  106  211:getstatic       #222 <Field int android.support.design.R$styleable.TextInputLayout_errorTextAppearance>
	//  107  214:iconst_0        
	//  108  215:invokevirtual   #216 <Method int TintTypedArray.getResourceId(int, int)>
	//  109  218:putfield        #224 <Field int mErrorTextAppearance>
		boolean flag = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_errorEnabled, false);
	//  110  221:aload_1         
	//  111  222:getstatic       #227 <Field int android.support.design.R$styleable.TextInputLayout_errorEnabled>
	//  112  225:iconst_0        
	//  113  226:invokevirtual   #176 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  114  229:istore          4
		boolean flag1 = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_counterEnabled, false);
	//  115  231:aload_1         
	//  116  232:getstatic       #230 <Field int android.support.design.R$styleable.TextInputLayout_counterEnabled>
	//  117  235:iconst_0        
	//  118  236:invokevirtual   #176 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  119  239:istore          5
		setCounterMaxLength(((TintTypedArray) (context)).getInt(android.support.design.R.styleable.TextInputLayout_counterMaxLength, -1));
	//  120  241:aload_0         
	//  121  242:aload_1         
	//  122  243:getstatic       #233 <Field int android.support.design.R$styleable.TextInputLayout_counterMaxLength>
	//  123  246:iconst_m1       
	//  124  247:invokevirtual   #236 <Method int TintTypedArray.getInt(int, int)>
	//  125  250:invokevirtual   #239 <Method void setCounterMaxLength(int)>
		mCounterTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_counterTextAppearance, 0);
	//  126  253:aload_0         
	//  127  254:aload_1         
	//  128  255:getstatic       #242 <Field int android.support.design.R$styleable.TextInputLayout_counterTextAppearance>
	//  129  258:iconst_0        
	//  130  259:invokevirtual   #216 <Method int TintTypedArray.getResourceId(int, int)>
	//  131  262:putfield        #244 <Field int mCounterTextAppearance>
		mCounterOverflowTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
	//  132  265:aload_0         
	//  133  266:aload_1         
	//  134  267:getstatic       #247 <Field int android.support.design.R$styleable.TextInputLayout_counterOverflowTextAppearance>
	//  135  270:iconst_0        
	//  136  271:invokevirtual   #216 <Method int TintTypedArray.getResourceId(int, int)>
	//  137  274:putfield        #249 <Field int mCounterOverflowTextAppearance>
		mPasswordToggleEnabled = ((TintTypedArray) (context)).getBoolean(android.support.design.R.styleable.TextInputLayout_passwordToggleEnabled, false);
	//  138  277:aload_0         
	//  139  278:aload_1         
	//  140  279:getstatic       #252 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleEnabled>
	//  141  282:iconst_0        
	//  142  283:invokevirtual   #176 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  143  286:putfield        #254 <Field boolean mPasswordToggleEnabled>
		mPasswordToggleDrawable = ((TintTypedArray) (context)).getDrawable(android.support.design.R.styleable.TextInputLayout_passwordToggleDrawable);
	//  144  289:aload_0         
	//  145  290:aload_1         
	//  146  291:getstatic       #257 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleDrawable>
	//  147  294:invokevirtual   #261 <Method Drawable TintTypedArray.getDrawable(int)>
	//  148  297:putfield        #263 <Field Drawable mPasswordToggleDrawable>
		mPasswordToggleContentDesc = ((TintTypedArray) (context)).getText(android.support.design.R.styleable.TextInputLayout_passwordToggleContentDescription);
	//  149  300:aload_0         
	//  150  301:aload_1         
	//  151  302:getstatic       #266 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleContentDescription>
	//  152  305:invokevirtual   #185 <Method CharSequence TintTypedArray.getText(int)>
	//  153  308:putfield        #268 <Field CharSequence mPasswordToggleContentDesc>
		if(((TintTypedArray) (context)).hasValue(android.support.design.R.styleable.TextInputLayout_passwordToggleTint))
	//* 154  311:aload_1         
	//* 155  312:getstatic       #271 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTint>
	//* 156  315:invokevirtual   #201 <Method boolean TintTypedArray.hasValue(int)>
	//* 157  318:ifeq            337
		{
			mHasPasswordToggleTintList = true;
	//  158  321:aload_0         
	//  159  322:iconst_1        
	//  160  323:putfield        #273 <Field boolean mHasPasswordToggleTintList>
			mPasswordToggleTintList = ((TintTypedArray) (context)).getColorStateList(android.support.design.R.styleable.TextInputLayout_passwordToggleTint);
	//  161  326:aload_0         
	//  162  327:aload_1         
	//  163  328:getstatic       #271 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTint>
	//  164  331:invokevirtual   #205 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  165  334:putfield        #275 <Field ColorStateList mPasswordToggleTintList>
		}
		if(((TintTypedArray) (context)).hasValue(android.support.design.R.styleable.TextInputLayout_passwordToggleTintMode))
	//* 166  337:aload_1         
	//* 167  338:getstatic       #278 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTintMode>
	//* 168  341:invokevirtual   #201 <Method boolean TintTypedArray.hasValue(int)>
	//* 169  344:ifeq            368
		{
			mHasPasswordToggleTintMode = true;
	//  170  347:aload_0         
	//  171  348:iconst_1        
	//  172  349:putfield        #280 <Field boolean mHasPasswordToggleTintMode>
			mPasswordToggleTintMode = ad.d(((TintTypedArray) (context)).getInt(android.support.design.R.styleable.TextInputLayout_passwordToggleTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//  173  352:aload_0         
	//  174  353:aload_1         
	//  175  354:getstatic       #278 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTintMode>
	//  176  357:iconst_m1       
	//  177  358:invokevirtual   #236 <Method int TintTypedArray.getInt(int, int)>
	//  178  361:aconst_null     
	//  179  362:invokestatic    #285 <Method android.graphics.PorterDuff$Mode ad.d(int, android.graphics.PorterDuff$Mode)>
	//  180  365:putfield        #287 <Field android.graphics.PorterDuff$Mode mPasswordToggleTintMode>
		}
		((TintTypedArray) (context)).recycle();
	//  181  368:aload_1         
	//  182  369:invokevirtual   #290 <Method void TintTypedArray.recycle()>
		setErrorEnabled(flag);
	//  183  372:aload_0         
	//  184  373:iload           4
	//  185  375:invokevirtual   #293 <Method void setErrorEnabled(boolean)>
		setCounterEnabled(flag1);
	//  186  378:aload_0         
	//  187  379:iload           5
	//  188  381:invokevirtual   #296 <Method void setCounterEnabled(boolean)>
		applyPasswordToggleTint();
	//  189  384:aload_0         
	//  190  385:invokespecial   #299 <Method void applyPasswordToggleTint()>
		if(ViewCompat.getImportantForAccessibility(((View) (this))) == 0)
	//* 191  388:aload_0         
	//* 192  389:invokestatic    #305 <Method int ViewCompat.getImportantForAccessibility(View)>
	//* 193  392:ifne            400
			ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//  194  395:aload_0         
	//  195  396:iconst_1        
	//  196  397:invokestatic    #309 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new d())));
	//  197  400:aload_0         
	//  198  401:new             #21  <Class TextInputLayout$d>
	//  199  404:dup             
	//  200  405:aload_0         
	//  201  406:invokespecial   #312 <Method void TextInputLayout$d(TextInputLayout)>
	//  202  409:invokestatic    #316 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//  203  412:return          
	}

	private void addIndicator(TextView textview, int i)
	{
		if(mIndicatorArea == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field LinearLayout mIndicatorArea>
	//*   2    4:ifnonnull       86
		{
			mIndicatorArea = new LinearLayout(getContext());
	//    3    7:aload_0         
	//    4    8:new             #4   <Class LinearLayout>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #328 <Method Context getContext()>
	//    8   16:invokespecial   #329 <Method void LinearLayout(Context)>
	//    9   19:putfield        #324 <Field LinearLayout mIndicatorArea>
			mIndicatorArea.setOrientation(0);
	//   10   22:aload_0         
	//   11   23:getfield        #324 <Field LinearLayout mIndicatorArea>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #330 <Method void LinearLayout.setOrientation(int)>
			addView(((View) (mIndicatorArea)), -1, -2);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #324 <Field LinearLayout mIndicatorArea>
	//   17   35:iconst_m1       
	//   18   36:bipush          -2
	//   19   38:invokevirtual   #333 <Method void addView(View, int, int)>
			Space space = new Space(getContext());
	//   20   41:new             #335 <Class Space>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokevirtual   #328 <Method Context getContext()>
	//   24   49:invokespecial   #336 <Method void Space(Context)>
	//   25   52:astore_3        
			android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, 0, 1.0F);
	//   26   53:new             #338 <Class android.widget.LinearLayout$LayoutParams>
	//   27   56:dup             
	//   28   57:iconst_0        
	//   29   58:iconst_0        
	//   30   59:fconst_1        
	//   31   60:invokespecial   #341 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   32   63:astore          4
			mIndicatorArea.addView(((View) (space)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   33   65:aload_0         
	//   34   66:getfield        #324 <Field LinearLayout mIndicatorArea>
	//   35   69:aload_3         
	//   36   70:aload           4
	//   37   72:invokevirtual   #344 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			if(mEditText != null)
	//*  38   75:aload_0         
	//*  39   76:getfield        #346 <Field EditText mEditText>
	//*  40   79:ifnull          86
				adjustIndicatorPadding();
	//   41   82:aload_0         
	//   42   83:invokespecial   #349 <Method void adjustIndicatorPadding()>
		}
		mIndicatorArea.setVisibility(0);
	//   43   86:aload_0         
	//   44   87:getfield        #324 <Field LinearLayout mIndicatorArea>
	//   45   90:iconst_0        
	//   46   91:invokevirtual   #352 <Method void LinearLayout.setVisibility(int)>
		mIndicatorArea.addView(((View) (textview)), i);
	//   47   94:aload_0         
	//   48   95:getfield        #324 <Field LinearLayout mIndicatorArea>
	//   49   98:aload_1         
	//   50   99:iload_2         
	//   51  100:invokevirtual   #354 <Method void LinearLayout.addView(View, int)>
		mIndicatorsAdded = mIndicatorsAdded + 1;
	//   52  103:aload_0         
	//   53  104:aload_0         
	//   54  105:getfield        #356 <Field int mIndicatorsAdded>
	//   55  108:iconst_1        
	//   56  109:iadd            
	//   57  110:putfield        #356 <Field int mIndicatorsAdded>
	//   58  113:return          
	}

	private void adjustIndicatorPadding()
	{
		ViewCompat.setPaddingRelative(((View) (mIndicatorArea)), ViewCompat.getPaddingStart(((View) (mEditText))), 0, ViewCompat.getPaddingEnd(((View) (mEditText))), mEditText.getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field LinearLayout mIndicatorArea>
	//    2    4:aload_0         
	//    3    5:getfield        #346 <Field EditText mEditText>
	//    4    8:invokestatic    #359 <Method int ViewCompat.getPaddingStart(View)>
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #346 <Field EditText mEditText>
	//    8   16:invokestatic    #362 <Method int ViewCompat.getPaddingEnd(View)>
	//    9   19:aload_0         
	//   10   20:getfield        #346 <Field EditText mEditText>
	//   11   23:invokevirtual   #368 <Method int EditText.getPaddingBottom()>
	//   12   26:invokestatic    #372 <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
	//   13   29:return          
	}

	private void applyPasswordToggleTint()
	{
		if(mPasswordToggleDrawable != null && (mHasPasswordToggleTintList || mHasPasswordToggleTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #263 <Field Drawable mPasswordToggleDrawable>
	//*   2    4:ifnull          103
	//*   3    7:aload_0         
	//*   4    8:getfield        #273 <Field boolean mHasPasswordToggleTintList>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #280 <Field boolean mHasPasswordToggleTintMode>
	//*   8   18:ifeq            103
		{
			mPasswordToggleDrawable = DrawableCompat.wrap(mPasswordToggleDrawable).mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #263 <Field Drawable mPasswordToggleDrawable>
	//   12   26:invokestatic    #378 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   13   29:invokevirtual   #384 <Method Drawable Drawable.mutate()>
	//   14   32:putfield        #263 <Field Drawable mPasswordToggleDrawable>
			if(mHasPasswordToggleTintList)
	//*  15   35:aload_0         
	//*  16   36:getfield        #273 <Field boolean mHasPasswordToggleTintList>
	//*  17   39:ifeq            53
				DrawableCompat.setTintList(mPasswordToggleDrawable, mPasswordToggleTintList);
	//   18   42:aload_0         
	//   19   43:getfield        #263 <Field Drawable mPasswordToggleDrawable>
	//   20   46:aload_0         
	//   21   47:getfield        #275 <Field ColorStateList mPasswordToggleTintList>
	//   22   50:invokestatic    #388 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasPasswordToggleTintMode)
	//*  23   53:aload_0         
	//*  24   54:getfield        #280 <Field boolean mHasPasswordToggleTintMode>
	//*  25   57:ifeq            71
				DrawableCompat.setTintMode(mPasswordToggleDrawable, mPasswordToggleTintMode);
	//   26   60:aload_0         
	//   27   61:getfield        #263 <Field Drawable mPasswordToggleDrawable>
	//   28   64:aload_0         
	//   29   65:getfield        #287 <Field android.graphics.PorterDuff$Mode mPasswordToggleTintMode>
	//   30   68:invokestatic    #392 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mPasswordToggleView != null && mPasswordToggleView.getDrawable() != mPasswordToggleDrawable)
	//*  31   71:aload_0         
	//*  32   72:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//*  33   75:ifnull          103
	//*  34   78:aload_0         
	//*  35   79:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//*  36   82:invokevirtual   #398 <Method Drawable CheckableImageButton.getDrawable()>
	//*  37   85:aload_0         
	//*  38   86:getfield        #263 <Field Drawable mPasswordToggleDrawable>
	//*  39   89:if_acmpeq       103
				mPasswordToggleView.setImageDrawable(mPasswordToggleDrawable);
	//   40   92:aload_0         
	//   41   93:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   42   96:aload_0         
	//   43   97:getfield        #263 <Field Drawable mPasswordToggleDrawable>
	//   44  100:invokevirtual   #402 <Method void CheckableImageButton.setImageDrawable(Drawable)>
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
	//*   1    1:getfield        #407 <Field ValueAnimator mAnimator>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #407 <Field ValueAnimator mAnimator>
	//*   5   11:invokevirtual   #413 <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			mAnimator.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #407 <Field ValueAnimator mAnimator>
	//    9   21:invokevirtual   #416 <Method void ValueAnimator.cancel()>
		if(flag && mHintAnimationEnabled)
	//*  10   24:iload_1         
	//*  11   25:ifeq            43
	//*  12   28:aload_0         
	//*  13   29:getfield        #194 <Field boolean mHintAnimationEnabled>
	//*  14   32:ifeq            43
			animateToExpansionFraction(1.0F);
	//   15   35:aload_0         
	//   16   36:fconst_1        
	//   17   37:invokevirtual   #420 <Method void animateToExpansionFraction(float)>
		else
	//*  18   40:goto            51
			mCollapsingTextHelper.a(1.0F);
	//   19   43:aload_0         
	//   20   44:getfield        #110 <Field n mCollapsingTextHelper>
	//   21   47:fconst_1        
	//   22   48:invokevirtual   #422 <Method void n.a(float)>
		mHintExpanded = false;
	//   23   51:aload_0         
	//   24   52:iconst_0        
	//   25   53:putfield        #424 <Field boolean mHintExpanded>
	//   26   56:return          
	}

	private void ensureBackgroundDrawableStateWorkaround()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #430 <Field int android.os.Build$VERSION.SDK_INT>
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
	//   10   18:getfield        #346 <Field EditText mEditText>
	//   11   21:invokevirtual   #433 <Method Drawable EditText.getBackground()>
	//   12   24:astore_2        
		if(drawable == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       30
			return;
	//   15   29:return          
		if(!mHasReconstructedEditTextBackground)
	//*  16   30:aload_0         
	//*  17   31:getfield        #435 <Field boolean mHasReconstructedEditTextBackground>
	//*  18   34:ifne            87
		{
			Drawable drawable1 = drawable.getConstantState().newDrawable();
	//   19   37:aload_2         
	//   20   38:invokevirtual   #439 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   21   41:invokevirtual   #444 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   22   44:astore_3        
			if(drawable instanceof DrawableContainer)
	//*  23   45:aload_2         
	//*  24   46:instanceof      #446 <Class DrawableContainer>
	//*  25   49:ifeq            67
				mHasReconstructedEditTextBackground = t.d((DrawableContainer)drawable, drawable1.getConstantState());
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:checkcast       #446 <Class DrawableContainer>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #439 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   31   61:invokestatic    #451 <Method boolean t.d(DrawableContainer, android.graphics.drawable.Drawable$ConstantState)>
	//   32   64:putfield        #435 <Field boolean mHasReconstructedEditTextBackground>
			if(!mHasReconstructedEditTextBackground)
	//*  33   67:aload_0         
	//*  34   68:getfield        #435 <Field boolean mHasReconstructedEditTextBackground>
	//*  35   71:ifne            87
			{
				ViewCompat.setBackground(((View) (mEditText)), drawable1);
	//   36   74:aload_0         
	//   37   75:getfield        #346 <Field EditText mEditText>
	//   38   78:aload_3         
	//   39   79:invokestatic    #455 <Method void ViewCompat.setBackground(View, Drawable)>
				mHasReconstructedEditTextBackground = true;
	//   40   82:aload_0         
	//   41   83:iconst_1        
	//   42   84:putfield        #435 <Field boolean mHasReconstructedEditTextBackground>
			}
		}
	//   43   87:return          
	}

	private void expandHint(boolean flag)
	{
		if(mAnimator != null && mAnimator.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #407 <Field ValueAnimator mAnimator>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #407 <Field ValueAnimator mAnimator>
	//*   5   11:invokevirtual   #413 <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			mAnimator.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #407 <Field ValueAnimator mAnimator>
	//    9   21:invokevirtual   #416 <Method void ValueAnimator.cancel()>
		if(flag && mHintAnimationEnabled)
	//*  10   24:iload_1         
	//*  11   25:ifeq            43
	//*  12   28:aload_0         
	//*  13   29:getfield        #194 <Field boolean mHintAnimationEnabled>
	//*  14   32:ifeq            43
			animateToExpansionFraction(0.0F);
	//   15   35:aload_0         
	//   16   36:fconst_0        
	//   17   37:invokevirtual   #420 <Method void animateToExpansionFraction(float)>
		else
	//*  18   40:goto            51
			mCollapsingTextHelper.a(0.0F);
	//   19   43:aload_0         
	//   20   44:getfield        #110 <Field n mCollapsingTextHelper>
	//   21   47:fconst_0        
	//   22   48:invokevirtual   #422 <Method void n.a(float)>
		mHintExpanded = true;
	//   23   51:aload_0         
	//   24   52:iconst_1        
	//   25   53:putfield        #424 <Field boolean mHintExpanded>
	//   26   56:return          
	}

	private boolean hasPasswordTransformation()
	{
		return mEditText != null && (mEditText.getTransformationMethod() instanceof PasswordTransformationMethod);
	//    0    0:aload_0         
	//    1    1:getfield        #346 <Field EditText mEditText>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #346 <Field EditText mEditText>
	//    5   11:invokevirtual   #461 <Method android.text.method.TransformationMethod EditText.getTransformationMethod()>
	//    6   14:instanceof      #463 <Class PasswordTransformationMethod>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private static void recursiveSetEnabled(ViewGroup viewgroup, boolean flag)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = viewgroup.getChildCount(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #470 <Method int ViewGroup.getChildCount()>
	//*   4    6:istore_3        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          49
		{
			View view = viewgroup.getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #474 <Method View ViewGroup.getChildAt(int)>
	//   11   17:astore          4
			view.setEnabled(flag);
	//   12   19:aload           4
	//   13   21:iload_1         
	//   14   22:invokevirtual   #479 <Method void View.setEnabled(boolean)>
			if(view instanceof ViewGroup)
	//*  15   25:aload           4
	//*  16   27:instanceof      #467 <Class ViewGroup>
	//*  17   30:ifeq            42
				recursiveSetEnabled((ViewGroup)view, flag);
	//   18   33:aload           4
	//   19   35:checkcast       #467 <Class ViewGroup>
	//   20   38:iload_1         
	//   21   39:invokestatic    #481 <Method void recursiveSetEnabled(ViewGroup, boolean)>
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
	//*   1    1:getfield        #324 <Field LinearLayout mIndicatorArea>
	//*   2    4:ifnull          40
		{
			mIndicatorArea.removeView(((View) (textview)));
	//    3    7:aload_0         
	//    4    8:getfield        #324 <Field LinearLayout mIndicatorArea>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #486 <Method void LinearLayout.removeView(View)>
			int i = mIndicatorsAdded - 1;
	//    7   15:aload_0         
	//    8   16:getfield        #356 <Field int mIndicatorsAdded>
	//    9   19:iconst_1        
	//   10   20:isub            
	//   11   21:istore_2        
			mIndicatorsAdded = i;
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:putfield        #356 <Field int mIndicatorsAdded>
			if(i == 0)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
				mIndicatorArea.setVisibility(8);
	//   17   31:aload_0         
	//   18   32:getfield        #324 <Field LinearLayout mIndicatorArea>
	//   19   35:bipush          8
	//   20   37:invokevirtual   #352 <Method void LinearLayout.setVisibility(int)>
		}
	//   21   40:return          
	}

	private void setEditText(EditText edittext)
	{
		if(mEditText != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #346 <Field EditText mEditText>
	//*   2    4:ifnull          18
			throw new IllegalArgumentException("We already have an EditText, can only have one");
	//    3    7:new             #490 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #492 <String "We already have an EditText, can only have one">
	//    6   14:invokespecial   #495 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		if(!(edittext instanceof TextInputEditText))
	//*   8   18:aload_1         
	//*   9   19:instanceof      #497 <Class TextInputEditText>
	//*  10   22:ifne            34
			Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
	//   11   25:ldc1            #31  <String "TextInputLayout">
	//   12   27:ldc2            #499 <String "EditText added is not a TextInputEditText. Please switch to using that class instead.">
	//   13   30:invokestatic    #505 <Method int Log.i(String, String)>
	//   14   33:pop             
		mEditText = edittext;
	//   15   34:aload_0         
	//   16   35:aload_1         
	//   17   36:putfield        #346 <Field EditText mEditText>
		if(!hasPasswordTransformation())
	//*  18   39:aload_0         
	//*  19   40:invokespecial   #507 <Method boolean hasPasswordTransformation()>
	//*  20   43:ifne            60
			mCollapsingTextHelper.a(mEditText.getTypeface());
	//   21   46:aload_0         
	//   22   47:getfield        #110 <Field n mCollapsingTextHelper>
	//   23   50:aload_0         
	//   24   51:getfield        #346 <Field EditText mEditText>
	//   25   54:invokevirtual   #511 <Method Typeface EditText.getTypeface()>
	//   26   57:invokevirtual   #514 <Method void n.a(Typeface)>
		mCollapsingTextHelper.b(mEditText.getTextSize());
	//   27   60:aload_0         
	//   28   61:getfield        #110 <Field n mCollapsingTextHelper>
	//   29   64:aload_0         
	//   30   65:getfield        #346 <Field EditText mEditText>
	//   31   68:invokevirtual   #518 <Method float EditText.getTextSize()>
	//   32   71:invokevirtual   #520 <Method void n.b(float)>
		int i = mEditText.getGravity();
	//   33   74:aload_0         
	//   34   75:getfield        #346 <Field EditText mEditText>
	//   35   78:invokevirtual   #523 <Method int EditText.getGravity()>
	//   36   81:istore_2        
		mCollapsingTextHelper.b(i & 0xffffff8f | 0x30);
	//   37   82:aload_0         
	//   38   83:getfield        #110 <Field n mCollapsingTextHelper>
	//   39   86:iload_2         
	//   40   87:bipush          -113
	//   41   89:iand            
	//   42   90:bipush          48
	//   43   92:ior             
	//   44   93:invokevirtual   #153 <Method void n.b(int)>
		mCollapsingTextHelper.e(i);
	//   45   96:aload_0         
	//   46   97:getfield        #110 <Field n mCollapsingTextHelper>
	//   47  100:iload_2         
	//   48  101:invokevirtual   #526 <Method void n.e(int)>
		mEditText.addTextChangedListener(new TextWatcher() {

			public void afterTextChanged(Editable editable)
			{
				TextInputLayout textinputlayout = b;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field TextInputLayout b>
			//    2    4:astore_3        
				boolean flag;
				if(!b.mRestoringSavedState)
			//*   3    5:aload_0         
			//*   4    6:getfield        #17  <Field TextInputLayout b>
			//*   5    9:invokestatic    #27  <Method boolean TextInputLayout.access$000(TextInputLayout)>
			//*   6   12:ifne            20
					flag = true;
			//    7   15:iconst_1        
			//    8   16:istore_2        
				else
			//*   9   17:goto            22
					flag = false;
			//   10   20:iconst_0        
			//   11   21:istore_2        
				textinputlayout.updateLabelState(flag);
			//   12   22:aload_3         
			//   13   23:iload_2         
			//   14   24:invokevirtual   #31  <Method void TextInputLayout.updateLabelState(boolean)>
				if(b.mCounterEnabled)
			//*  15   27:aload_0         
			//*  16   28:getfield        #17  <Field TextInputLayout b>
			//*  17   31:getfield        #35  <Field boolean TextInputLayout.mCounterEnabled>
			//*  18   34:ifeq            50
					b.updateCounter(editable.length());
			//   19   37:aload_0         
			//   20   38:getfield        #17  <Field TextInputLayout b>
			//   21   41:aload_1         
			//   22   42:invokeinterface #41  <Method int Editable.length()>
			//   23   47:invokevirtual   #45  <Method void TextInputLayout.updateCounter(int)>
			//   24   50:return          
			}

			public void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int j, int k, int l)
			{
			//    0    0:return          
			}

			final TextInputLayout b;

			
			{
				b = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   49  104:aload_0         
	//   50  105:getfield        #346 <Field EditText mEditText>
	//   51  108:new             #14  <Class TextInputLayout$5>
	//   52  111:dup             
	//   53  112:aload_0         
	//   54  113:invokespecial   #527 <Method void TextInputLayout$5(TextInputLayout)>
	//   55  116:invokevirtual   #531 <Method void EditText.addTextChangedListener(TextWatcher)>
		if(mDefaultTextColor == null)
	//*  56  119:aload_0         
	//*  57  120:getfield        #209 <Field ColorStateList mDefaultTextColor>
	//*  58  123:ifnonnull       137
			mDefaultTextColor = mEditText.getHintTextColors();
	//   59  126:aload_0         
	//   60  127:aload_0         
	//   61  128:getfield        #346 <Field EditText mEditText>
	//   62  131:invokevirtual   #535 <Method ColorStateList EditText.getHintTextColors()>
	//   63  134:putfield        #209 <Field ColorStateList mDefaultTextColor>
		if(mHintEnabled && TextUtils.isEmpty(mHint))
	//*  64  137:aload_0         
	//*  65  138:getfield        #178 <Field boolean mHintEnabled>
	//*  66  141:ifeq            173
	//*  67  144:aload_0         
	//*  68  145:getfield        #537 <Field CharSequence mHint>
	//*  69  148:invokestatic    #543 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  70  151:ifeq            173
		{
			setHint(mEditText.getHint());
	//   71  154:aload_0         
	//   72  155:aload_0         
	//   73  156:getfield        #346 <Field EditText mEditText>
	//   74  159:invokevirtual   #547 <Method CharSequence EditText.getHint()>
	//   75  162:invokevirtual   #189 <Method void setHint(CharSequence)>
			mEditText.setHint(((CharSequence) (null)));
	//   76  165:aload_0         
	//   77  166:getfield        #346 <Field EditText mEditText>
	//   78  169:aconst_null     
	//   79  170:invokevirtual   #548 <Method void EditText.setHint(CharSequence)>
		}
		if(mCounterView != null)
	//*  80  173:aload_0         
	//*  81  174:getfield        #550 <Field TextView mCounterView>
	//*  82  177:ifnull          196
			updateCounter(mEditText.getText().length());
	//   83  180:aload_0         
	//   84  181:aload_0         
	//   85  182:getfield        #346 <Field EditText mEditText>
	//   86  185:invokevirtual   #553 <Method Editable EditText.getText()>
	//   87  188:invokeinterface #558 <Method int Editable.length()>
	//   88  193:invokevirtual   #561 <Method void updateCounter(int)>
		if(mIndicatorArea != null)
	//*  89  196:aload_0         
	//*  90  197:getfield        #324 <Field LinearLayout mIndicatorArea>
	//*  91  200:ifnull          207
			adjustIndicatorPadding();
	//   92  203:aload_0         
	//   93  204:invokespecial   #349 <Method void adjustIndicatorPadding()>
		updatePasswordToggleView();
	//   94  207:aload_0         
	//   95  208:invokespecial   #564 <Method void updatePasswordToggleView()>
		updateLabelState(false, true);
	//   96  211:aload_0         
	//   97  212:iconst_0        
	//   98  213:iconst_1        
	//   99  214:invokevirtual   #568 <Method void updateLabelState(boolean, boolean)>
	//  100  217:return          
	}

	private void setError(CharSequence charsequence, boolean flag)
	{
		mError = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #573 <Field CharSequence mError>
		if(!mErrorEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #575 <Field boolean mErrorEnabled>
	//*   5    9:ifne            25
		{
			if(TextUtils.isEmpty(charsequence))
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #543 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            20
				return;
	//    9   19:return          
			setErrorEnabled(true);
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #293 <Method void setErrorEnabled(boolean)>
		}
		boolean flag1;
		if(!TextUtils.isEmpty(charsequence))
	//*  13   25:aload_1         
	//*  14   26:invokestatic    #543 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   29:ifne            37
			flag1 = true;
	//   16   32:iconst_1        
	//   17   33:istore_3        
		else
	//*  18   34:goto            39
			flag1 = false;
	//   19   37:iconst_0        
	//   20   38:istore_3        
		mErrorShown = flag1;
	//   21   39:aload_0         
	//   22   40:iload_3         
	//   23   41:putfield        #577 <Field boolean mErrorShown>
		mErrorView.animate().cancel();
	//   24   44:aload_0         
	//   25   45:getfield        #579 <Field TextView mErrorView>
	//   26   48:invokevirtual   #585 <Method ViewPropertyAnimator TextView.animate()>
	//   27   51:invokevirtual   #588 <Method void ViewPropertyAnimator.cancel()>
		if(mErrorShown)
	//*  28   54:aload_0         
	//*  29   55:getfield        #577 <Field boolean mErrorShown>
	//*  30   58:ifeq            152
		{
			mErrorView.setText(charsequence);
	//   31   61:aload_0         
	//   32   62:getfield        #579 <Field TextView mErrorView>
	//   33   65:aload_1         
	//   34   66:invokevirtual   #591 <Method void TextView.setText(CharSequence)>
			mErrorView.setVisibility(0);
	//   35   69:aload_0         
	//   36   70:getfield        #579 <Field TextView mErrorView>
	//   37   73:iconst_0        
	//   38   74:invokevirtual   #592 <Method void TextView.setVisibility(int)>
			if(flag)
	//*  39   77:iload_2         
	//*  40   78:ifeq            141
			{
				if(mErrorView.getAlpha() == 1.0F)
	//*  41   81:aload_0         
	//*  42   82:getfield        #579 <Field TextView mErrorView>
	//*  43   85:invokevirtual   #595 <Method float TextView.getAlpha()>
	//*  44   88:fconst_1        
	//*  45   89:fcmpl           
	//*  46   90:ifne            101
					mErrorView.setAlpha(0.0F);
	//   47   93:aload_0         
	//   48   94:getfield        #579 <Field TextView mErrorView>
	//   49   97:fconst_0        
	//   50   98:invokevirtual   #598 <Method void TextView.setAlpha(float)>
				mErrorView.animate().alpha(1.0F).setDuration(200L).setInterpolator(((android.animation.TimeInterpolator) (p.c))).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

					public void onAnimationStart(Animator animator)
					{
						d.mErrorView.setVisibility(0);
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field TextInputLayout d>
					//    2    4:getfield        #25  <Field TextView TextInputLayout.mErrorView>
					//    3    7:iconst_0        
					//    4    8:invokevirtual   #31  <Method void TextView.setVisibility(int)>
					//    5   11:return          
					}

					final TextInputLayout d;

			
			{
				d = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field TextInputLayout d>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
				}
))).start();
	//   51  101:aload_0         
	//   52  102:getfield        #579 <Field TextView mErrorView>
	//   53  105:invokevirtual   #585 <Method ViewPropertyAnimator TextView.animate()>
	//   54  108:fconst_1        
	//   55  109:invokevirtual   #602 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   56  112:ldc2w           #603 <Long 200L>
	//   57  115:invokevirtual   #608 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   58  118:getstatic       #611 <Field android.view.animation.Interpolator p.c>
	//   59  121:invokevirtual   #615 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   60  124:new             #8   <Class TextInputLayout$2>
	//   61  127:dup             
	//   62  128:aload_0         
	//   63  129:invokespecial   #616 <Method void TextInputLayout$2(TextInputLayout)>
	//   64  132:invokevirtual   #620 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   65  135:invokevirtual   #623 <Method void ViewPropertyAnimator.start()>
			} else
	//*  66  138:goto            223
			{
				mErrorView.setAlpha(1.0F);
	//   67  141:aload_0         
	//   68  142:getfield        #579 <Field TextView mErrorView>
	//   69  145:fconst_1        
	//   70  146:invokevirtual   #598 <Method void TextView.setAlpha(float)>
			}
		} else
	//*  71  149:goto            223
		if(mErrorView.getVisibility() == 0)
	//*  72  152:aload_0         
	//*  73  153:getfield        #579 <Field TextView mErrorView>
	//*  74  156:invokevirtual   #626 <Method int TextView.getVisibility()>
	//*  75  159:ifne            223
			if(flag)
	//*  76  162:iload_2         
	//*  77  163:ifeq            207
			{
				mErrorView.animate().alpha(0.0F).setDuration(200L).setInterpolator(((android.animation.TimeInterpolator) (p.b))).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(charsequence) {

					public void onAnimationEnd(Animator animator)
					{
						b.mErrorView.setText(d);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field TextInputLayout b>
					//    2    4:getfield        #29  <Field TextView TextInputLayout.mErrorView>
					//    3    7:aload_0         
					//    4    8:getfield        #19  <Field CharSequence d>
					//    5   11:invokevirtual   #35  <Method void TextView.setText(CharSequence)>
						b.mErrorView.setVisibility(4);
					//    6   14:aload_0         
					//    7   15:getfield        #17  <Field TextInputLayout b>
					//    8   18:getfield        #29  <Field TextView TextInputLayout.mErrorView>
					//    9   21:iconst_4        
					//   10   22:invokevirtual   #39  <Method void TextView.setVisibility(int)>
					//   11   25:return          
					}

					final TextInputLayout b;
					final CharSequence d;

			
			{
				b = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout b>
				d = charsequence;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field CharSequence d>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
				}
))).start();
	//   78  166:aload_0         
	//   79  167:getfield        #579 <Field TextView mErrorView>
	//   80  170:invokevirtual   #585 <Method ViewPropertyAnimator TextView.animate()>
	//   81  173:fconst_0        
	//   82  174:invokevirtual   #602 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   83  177:ldc2w           #603 <Long 200L>
	//   84  180:invokevirtual   #608 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   85  183:getstatic       #628 <Field android.view.animation.Interpolator p.b>
	//   86  186:invokevirtual   #615 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   87  189:new             #12  <Class TextInputLayout$4>
	//   88  192:dup             
	//   89  193:aload_0         
	//   90  194:aload_1         
	//   91  195:invokespecial   #631 <Method void TextInputLayout$4(TextInputLayout, CharSequence)>
	//   92  198:invokevirtual   #620 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   93  201:invokevirtual   #623 <Method void ViewPropertyAnimator.start()>
			} else
	//*  94  204:goto            223
			{
				mErrorView.setText(charsequence);
	//   95  207:aload_0         
	//   96  208:getfield        #579 <Field TextView mErrorView>
	//   97  211:aload_1         
	//   98  212:invokevirtual   #591 <Method void TextView.setText(CharSequence)>
				mErrorView.setVisibility(4);
	//   99  215:aload_0         
	//  100  216:getfield        #579 <Field TextView mErrorView>
	//  101  219:iconst_4        
	//  102  220:invokevirtual   #592 <Method void TextView.setVisibility(int)>
			}
		updateEditTextBackground();
	//  103  223:aload_0         
	//  104  224:invokespecial   #634 <Method void updateEditTextBackground()>
		updateLabelState(flag);
	//  105  227:aload_0         
	//  106  228:iload_2         
	//  107  229:invokevirtual   #636 <Method void updateLabelState(boolean)>
	//  108  232:return          
	}

	private void setHintInternal(CharSequence charsequence)
	{
		mHint = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #537 <Field CharSequence mHint>
		mCollapsingTextHelper.a(charsequence);
	//    3    5:aload_0         
	//    4    6:getfield        #110 <Field n mCollapsingTextHelper>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #640 <Method void n.a(CharSequence)>
	//    7   13:return          
	}

	private boolean shouldShowPasswordIcon()
	{
		return mPasswordToggleEnabled && (hasPasswordTransformation() || mPasswordToggledVisible);
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field boolean mPasswordToggleEnabled>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:invokespecial   #507 <Method boolean hasPasswordTransformation()>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:getfield        #643 <Field boolean mPasswordToggledVisible>
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
	//*   1    1:getfield        #346 <Field EditText mEditText>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Drawable drawable1 = mEditText.getBackground();
	//    4    8:aload_0         
	//    5    9:getfield        #346 <Field EditText mEditText>
	//    6   12:invokevirtual   #433 <Method Drawable EditText.getBackground()>
	//    7   15:astore_2        
		if(drawable1 == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		ensureBackgroundDrawableStateWorkaround();
	//   11   21:aload_0         
	//   12   22:invokespecial   #645 <Method void ensureBackgroundDrawableStateWorkaround()>
		Drawable drawable = drawable1;
	//   13   25:aload_2         
	//   14   26:astore_1        
		if(DrawableUtils.canSafelyMutateDrawable(drawable1))
	//*  15   27:aload_2         
	//*  16   28:invokestatic    #651 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  17   31:ifeq            39
			drawable = drawable1.mutate();
	//   18   34:aload_2         
	//   19   35:invokevirtual   #384 <Method Drawable Drawable.mutate()>
	//   20   38:astore_1        
		if(mErrorShown && mErrorView != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #577 <Field boolean mErrorShown>
	//*  23   43:ifeq            71
	//*  24   46:aload_0         
	//*  25   47:getfield        #579 <Field TextView mErrorView>
	//*  26   50:ifnull          71
		{
			drawable.setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(mErrorView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #579 <Field TextView mErrorView>
	//   30   58:invokevirtual   #654 <Method int TextView.getCurrentTextColor()>
	//   31   61:getstatic       #659 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   32   64:invokestatic    #665 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   33   67:invokevirtual   #669 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			return;
	//   34   70:return          
		}
		if(mCounterOverflowed && mCounterView != null)
	//*  35   71:aload_0         
	//*  36   72:getfield        #671 <Field boolean mCounterOverflowed>
	//*  37   75:ifeq            103
	//*  38   78:aload_0         
	//*  39   79:getfield        #550 <Field TextView mCounterView>
	//*  40   82:ifnull          103
		{
			drawable.setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(mCounterView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   41   85:aload_1         
	//   42   86:aload_0         
	//   43   87:getfield        #550 <Field TextView mCounterView>
	//   44   90:invokevirtual   #654 <Method int TextView.getCurrentTextColor()>
	//   45   93:getstatic       #659 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   46   96:invokestatic    #665 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   47   99:invokevirtual   #669 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			return;
	//   48  102:return          
		} else
		{
			DrawableCompat.clearColorFilter(drawable);
	//   49  103:aload_1         
	//   50  104:invokestatic    #674 <Method void DrawableCompat.clearColorFilter(Drawable)>
			mEditText.refreshDrawableState();
	//   51  107:aload_0         
	//   52  108:getfield        #346 <Field EditText mEditText>
	//   53  111:invokevirtual   #677 <Method void EditText.refreshDrawableState()>
			return;
	//   54  114:return          
		}
	}

	private void updateInputLayoutMargins()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mInputFrame.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field FrameLayout mInputFrame>
	//    2    4:invokevirtual   #682 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//    3    7:checkcast       #338 <Class android.widget.LinearLayout$LayoutParams>
	//    4   10:astore_2        
		int i;
		if(mHintEnabled)
	//*   5   11:aload_0         
	//*   6   12:getfield        #178 <Field boolean mHintEnabled>
	//*   7   15:ifeq            78
		{
			if(mTmpPaint == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #684 <Field Paint mTmpPaint>
	//*  10   22:ifnonnull       36
				mTmpPaint = new Paint();
	//   11   25:aload_0         
	//   12   26:new             #686 <Class Paint>
	//   13   29:dup             
	//   14   30:invokespecial   #687 <Method void Paint()>
	//   15   33:putfield        #684 <Field Paint mTmpPaint>
			mTmpPaint.setTypeface(mCollapsingTextHelper.c());
	//   16   36:aload_0         
	//   17   37:getfield        #684 <Field Paint mTmpPaint>
	//   18   40:aload_0         
	//   19   41:getfield        #110 <Field n mCollapsingTextHelper>
	//   20   44:invokevirtual   #689 <Method Typeface n.c()>
	//   21   47:invokevirtual   #693 <Method Typeface Paint.setTypeface(Typeface)>
	//   22   50:pop             
			mTmpPaint.setTextSize(mCollapsingTextHelper.i());
	//   23   51:aload_0         
	//   24   52:getfield        #684 <Field Paint mTmpPaint>
	//   25   55:aload_0         
	//   26   56:getfield        #110 <Field n mCollapsingTextHelper>
	//   27   59:invokevirtual   #695 <Method float n.i()>
	//   28   62:invokevirtual   #698 <Method void Paint.setTextSize(float)>
			i = (int)(-mTmpPaint.ascent());
	//   29   65:aload_0         
	//   30   66:getfield        #684 <Field Paint mTmpPaint>
	//   31   69:invokevirtual   #701 <Method float Paint.ascent()>
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
	//*  40   82:getfield        #704 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//*  41   85:icmpeq          100
		{
			layoutparams.topMargin = i;
	//   42   88:aload_2         
	//   43   89:iload_1         
	//   44   90:putfield        #704 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
			mInputFrame.requestLayout();
	//   45   93:aload_0         
	//   46   94:getfield        #132 <Field FrameLayout mInputFrame>
	//   47   97:invokevirtual   #707 <Method void FrameLayout.requestLayout()>
		}
	//   48  100:return          
	}

	private void updatePasswordToggleView()
	{
		if(mEditText == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #346 <Field EditText mEditText>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(shouldShowPasswordIcon())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #709 <Method boolean shouldShowPasswordIcon()>
	//*   6   12:ifeq            261
		{
			if(mPasswordToggleView == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//*   9   19:ifnonnull       95
			{
				mPasswordToggleView = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_text_input_password_icon, ((ViewGroup) (mInputFrame)), false);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #328 <Method Context getContext()>
	//   13   27:invokestatic    #715 <Method LayoutInflater LayoutInflater.from(Context)>
	//   14   30:getstatic       #720 <Field int android.support.design.R$layout.design_text_input_password_icon>
	//   15   33:aload_0         
	//   16   34:getfield        #132 <Field FrameLayout mInputFrame>
	//   17   37:iconst_0        
	//   18   38:invokevirtual   #724 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   19   41:checkcast       #396 <Class CheckableImageButton>
	//   20   44:putfield        #394 <Field CheckableImageButton mPasswordToggleView>
				mPasswordToggleView.setImageDrawable(mPasswordToggleDrawable);
	//   21   47:aload_0         
	//   22   48:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   23   51:aload_0         
	//   24   52:getfield        #263 <Field Drawable mPasswordToggleDrawable>
	//   25   55:invokevirtual   #402 <Method void CheckableImageButton.setImageDrawable(Drawable)>
				mPasswordToggleView.setContentDescription(mPasswordToggleContentDesc);
	//   26   58:aload_0         
	//   27   59:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   28   62:aload_0         
	//   29   63:getfield        #268 <Field CharSequence mPasswordToggleContentDesc>
	//   30   66:invokevirtual   #727 <Method void CheckableImageButton.setContentDescription(CharSequence)>
				mInputFrame.addView(((View) (mPasswordToggleView)));
	//   31   69:aload_0         
	//   32   70:getfield        #132 <Field FrameLayout mInputFrame>
	//   33   73:aload_0         
	//   34   74:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   35   77:invokevirtual   #728 <Method void FrameLayout.addView(View)>
				mPasswordToggleView.setOnClickListener(new android.view.View.OnClickListener() {

					public void onClick(View view)
					{
						d.passwordVisibilityToggleRequested();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field TextInputLayout d>
					//    2    4:invokevirtual   #25  <Method void TextInputLayout.passwordVisibilityToggleRequested()>
					//    3    7:return          
					}

					final TextInputLayout d;

			
			{
				d = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout d>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   36   80:aload_0         
	//   37   81:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   38   84:new             #6   <Class TextInputLayout$1>
	//   39   87:dup             
	//   40   88:aload_0         
	//   41   89:invokespecial   #729 <Method void TextInputLayout$1(TextInputLayout)>
	//   42   92:invokevirtual   #733 <Method void CheckableImageButton.setOnClickListener(android.view.View$OnClickListener)>
			}
			if(mEditText != null && ViewCompat.getMinimumHeight(((View) (mEditText))) <= 0)
	//*  43   95:aload_0         
	//*  44   96:getfield        #346 <Field EditText mEditText>
	//*  45   99:ifnull          126
	//*  46  102:aload_0         
	//*  47  103:getfield        #346 <Field EditText mEditText>
	//*  48  106:invokestatic    #736 <Method int ViewCompat.getMinimumHeight(View)>
	//*  49  109:ifgt            126
				mEditText.setMinimumHeight(ViewCompat.getMinimumHeight(((View) (mPasswordToggleView))));
	//   50  112:aload_0         
	//   51  113:getfield        #346 <Field EditText mEditText>
	//   52  116:aload_0         
	//   53  117:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   54  120:invokestatic    #736 <Method int ViewCompat.getMinimumHeight(View)>
	//   55  123:invokevirtual   #739 <Method void EditText.setMinimumHeight(int)>
			mPasswordToggleView.setVisibility(0);
	//   56  126:aload_0         
	//   57  127:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   58  130:iconst_0        
	//   59  131:invokevirtual   #740 <Method void CheckableImageButton.setVisibility(int)>
			mPasswordToggleView.setChecked(mPasswordToggledVisible);
	//   60  134:aload_0         
	//   61  135:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   62  138:aload_0         
	//   63  139:getfield        #643 <Field boolean mPasswordToggledVisible>
	//   64  142:invokevirtual   #743 <Method void CheckableImageButton.setChecked(boolean)>
			if(mPasswordToggleDummyDrawable == null)
	//*  65  145:aload_0         
	//*  66  146:getfield        #745 <Field Drawable mPasswordToggleDummyDrawable>
	//*  67  149:ifnonnull       163
				mPasswordToggleDummyDrawable = ((Drawable) (new ColorDrawable()));
	//   68  152:aload_0         
	//   69  153:new             #747 <Class ColorDrawable>
	//   70  156:dup             
	//   71  157:invokespecial   #748 <Method void ColorDrawable()>
	//   72  160:putfield        #745 <Field Drawable mPasswordToggleDummyDrawable>
			mPasswordToggleDummyDrawable.setBounds(0, 0, mPasswordToggleView.getMeasuredWidth(), 1);
	//   73  163:aload_0         
	//   74  164:getfield        #745 <Field Drawable mPasswordToggleDummyDrawable>
	//   75  167:iconst_0        
	//   76  168:iconst_0        
	//   77  169:aload_0         
	//   78  170:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   79  173:invokevirtual   #751 <Method int CheckableImageButton.getMeasuredWidth()>
	//   80  176:iconst_1        
	//   81  177:invokevirtual   #755 <Method void Drawable.setBounds(int, int, int, int)>
			Drawable adrawable[] = TextViewCompat.getCompoundDrawablesRelative(((TextView) (mEditText)));
	//   82  180:aload_0         
	//   83  181:getfield        #346 <Field EditText mEditText>
	//   84  184:invokestatic    #761 <Method Drawable[] TextViewCompat.getCompoundDrawablesRelative(TextView)>
	//   85  187:astore_1        
			if(adrawable[2] != mPasswordToggleDummyDrawable)
	//*  86  188:aload_1         
	//*  87  189:iconst_2        
	//*  88  190:aaload          
	//*  89  191:aload_0         
	//*  90  192:getfield        #745 <Field Drawable mPasswordToggleDummyDrawable>
	//*  91  195:if_acmpeq       205
				mOriginalEditTextEndDrawable = adrawable[2];
	//   92  198:aload_0         
	//   93  199:aload_1         
	//   94  200:iconst_2        
	//   95  201:aaload          
	//   96  202:putfield        #763 <Field Drawable mOriginalEditTextEndDrawable>
			TextViewCompat.setCompoundDrawablesRelative(((TextView) (mEditText)), adrawable[0], adrawable[1], mPasswordToggleDummyDrawable, adrawable[3]);
	//   97  205:aload_0         
	//   98  206:getfield        #346 <Field EditText mEditText>
	//   99  209:aload_1         
	//  100  210:iconst_0        
	//  101  211:aaload          
	//  102  212:aload_1         
	//  103  213:iconst_1        
	//  104  214:aaload          
	//  105  215:aload_0         
	//  106  216:getfield        #745 <Field Drawable mPasswordToggleDummyDrawable>
	//  107  219:aload_1         
	//  108  220:iconst_3        
	//  109  221:aaload          
	//  110  222:invokestatic    #767 <Method void TextViewCompat.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
			mPasswordToggleView.setPadding(mEditText.getPaddingLeft(), mEditText.getPaddingTop(), mEditText.getPaddingRight(), mEditText.getPaddingBottom());
	//  111  225:aload_0         
	//  112  226:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//  113  229:aload_0         
	//  114  230:getfield        #346 <Field EditText mEditText>
	//  115  233:invokevirtual   #770 <Method int EditText.getPaddingLeft()>
	//  116  236:aload_0         
	//  117  237:getfield        #346 <Field EditText mEditText>
	//  118  240:invokevirtual   #773 <Method int EditText.getPaddingTop()>
	//  119  243:aload_0         
	//  120  244:getfield        #346 <Field EditText mEditText>
	//  121  247:invokevirtual   #776 <Method int EditText.getPaddingRight()>
	//  122  250:aload_0         
	//  123  251:getfield        #346 <Field EditText mEditText>
	//  124  254:invokevirtual   #368 <Method int EditText.getPaddingBottom()>
	//  125  257:invokevirtual   #779 <Method void CheckableImageButton.setPadding(int, int, int, int)>
			return;
	//  126  260:return          
		}
		if(mPasswordToggleView != null && mPasswordToggleView.getVisibility() == 0)
	//* 127  261:aload_0         
	//* 128  262:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//* 129  265:ifnull          287
	//* 130  268:aload_0         
	//* 131  269:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//* 132  272:invokevirtual   #780 <Method int CheckableImageButton.getVisibility()>
	//* 133  275:ifne            287
			mPasswordToggleView.setVisibility(8);
	//  134  278:aload_0         
	//  135  279:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//  136  282:bipush          8
	//  137  284:invokevirtual   #740 <Method void CheckableImageButton.setVisibility(int)>
		if(mPasswordToggleDummyDrawable != null)
	//* 138  287:aload_0         
	//* 139  288:getfield        #745 <Field Drawable mPasswordToggleDummyDrawable>
	//* 140  291:ifnull          337
		{
			Drawable adrawable1[] = TextViewCompat.getCompoundDrawablesRelative(((TextView) (mEditText)));
	//  141  294:aload_0         
	//  142  295:getfield        #346 <Field EditText mEditText>
	//  143  298:invokestatic    #761 <Method Drawable[] TextViewCompat.getCompoundDrawablesRelative(TextView)>
	//  144  301:astore_1        
			if(adrawable1[2] == mPasswordToggleDummyDrawable)
	//* 145  302:aload_1         
	//* 146  303:iconst_2        
	//* 147  304:aaload          
	//* 148  305:aload_0         
	//* 149  306:getfield        #745 <Field Drawable mPasswordToggleDummyDrawable>
	//* 150  309:if_acmpne       337
			{
				TextViewCompat.setCompoundDrawablesRelative(((TextView) (mEditText)), adrawable1[0], adrawable1[1], mOriginalEditTextEndDrawable, adrawable1[3]);
	//  151  312:aload_0         
	//  152  313:getfield        #346 <Field EditText mEditText>
	//  153  316:aload_1         
	//  154  317:iconst_0        
	//  155  318:aaload          
	//  156  319:aload_1         
	//  157  320:iconst_1        
	//  158  321:aaload          
	//  159  322:aload_0         
	//  160  323:getfield        #763 <Field Drawable mOriginalEditTextEndDrawable>
	//  161  326:aload_1         
	//  162  327:iconst_3        
	//  163  328:aaload          
	//  164  329:invokestatic    #767 <Method void TextViewCompat.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
				mPasswordToggleDummyDrawable = null;
	//  165  332:aload_0         
	//  166  333:aconst_null     
	//  167  334:putfield        #745 <Field Drawable mPasswordToggleDummyDrawable>
			}
		}
	//  168  337:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(view instanceof EditText)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #364 <Class EditText>
	//*   2    4:ifeq            64
		{
			android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams);
	//    3    7:new             #783 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_3         
	//    6   12:invokespecial   #786 <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    7   15:astore          4
			layoutparams1.gravity = layoutparams1.gravity & 0xffffff8f | 0x10;
	//    8   17:aload           4
	//    9   19:aload           4
	//   10   21:getfield        #789 <Field int android.widget.FrameLayout$LayoutParams.gravity>
	//   11   24:bipush          -113
	//   12   26:iand            
	//   13   27:bipush          16
	//   14   29:ior             
	//   15   30:putfield        #789 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			mInputFrame.addView(view, ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   16   33:aload_0         
	//   17   34:getfield        #132 <Field FrameLayout mInputFrame>
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokevirtual   #790 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			mInputFrame.setLayoutParams(layoutparams);
	//   21   43:aload_0         
	//   22   44:getfield        #132 <Field FrameLayout mInputFrame>
	//   23   47:aload_3         
	//   24   48:invokevirtual   #793 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			updateInputLayoutMargins();
	//   25   51:aload_0         
	//   26   52:invokespecial   #795 <Method void updateInputLayoutMargins()>
			setEditText((EditText)view);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:checkcast       #364 <Class EditText>
	//   30   60:invokespecial   #797 <Method void setEditText(EditText)>
			return;
	//   31   63:return          
		} else
		{
			super.addView(view, i, layoutparams);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:iload_2         
	//   35   67:aload_3         
	//   36   68:invokespecial   #799 <Method void LinearLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   37   71:return          
		}
	}

	void animateToExpansionFraction(float f)
	{
		if(mCollapsingTextHelper.g() == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field n mCollapsingTextHelper>
	//*   2    4:invokevirtual   #803 <Method float n.g()>
	//*   3    7:fload_1         
	//*   4    8:fcmpl           
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(mAnimator == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #407 <Field ValueAnimator mAnimator>
	//*   9   17:ifnonnull       67
		{
			mAnimator = new ValueAnimator();
	//   10   20:aload_0         
	//   11   21:new             #409 <Class ValueAnimator>
	//   12   24:dup             
	//   13   25:invokespecial   #804 <Method void ValueAnimator()>
	//   14   28:putfield        #407 <Field ValueAnimator mAnimator>
			mAnimator.setInterpolator(((android.animation.TimeInterpolator) (p.e)));
	//   15   31:aload_0         
	//   16   32:getfield        #407 <Field ValueAnimator mAnimator>
	//   17   35:getstatic       #806 <Field android.view.animation.Interpolator p.e>
	//   18   38:invokevirtual   #809 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			mAnimator.setDuration(200L);
	//   19   41:aload_0         
	//   20   42:getfield        #407 <Field ValueAnimator mAnimator>
	//   21   45:ldc2w           #603 <Long 200L>
	//   22   48:invokevirtual   #812 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   23   51:pop             
			mAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					d.mCollapsingTextHelper.a(((Float)valueanimator.getAnimatedValue()).floatValue());
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field TextInputLayout d>
				//    2    4:getfield        #27  <Field n TextInputLayout.mCollapsingTextHelper>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
				//    5   11:checkcast       #35  <Class Float>
				//    6   14:invokevirtual   #39  <Method float Float.floatValue()>
				//    7   17:invokevirtual   #44  <Method void n.a(float)>
				//    8   20:return          
				}

				final TextInputLayout d;

			
			{
				d = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout d>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   52:aload_0         
	//   25   53:getfield        #407 <Field ValueAnimator mAnimator>
	//   26   56:new             #10  <Class TextInputLayout$3>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:invokespecial   #813 <Method void TextInputLayout$3(TextInputLayout)>
	//   30   64:invokevirtual   #817 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
		mAnimator.setFloatValues(new float[] {
			mCollapsingTextHelper.g(), f
		});
	//   31   67:aload_0         
	//   32   68:getfield        #407 <Field ValueAnimator mAnimator>
	//   33   71:iconst_2        
	//   34   72:newarray        float[]
	//   35   74:dup             
	//   36   75:iconst_0        
	//   37   76:aload_0         
	//   38   77:getfield        #110 <Field n mCollapsingTextHelper>
	//   39   80:invokevirtual   #803 <Method float n.g()>
	//   40   83:fastore         
	//   41   84:dup             
	//   42   85:iconst_1        
	//   43   86:fload_1         
	//   44   87:fastore         
	//   45   88:invokevirtual   #821 <Method void ValueAnimator.setFloatValues(float[])>
		mAnimator.start();
	//   46   91:aload_0         
	//   47   92:getfield        #407 <Field ValueAnimator mAnimator>
	//   48   95:invokevirtual   #822 <Method void ValueAnimator.start()>
	//   49   98:return          
	}

	protected void dispatchRestoreInstanceState(SparseArray sparsearray)
	{
		mRestoringSavedState = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #320 <Field boolean mRestoringSavedState>
		super.dispatchRestoreInstanceState(sparsearray);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #827 <Method void LinearLayout.dispatchRestoreInstanceState(SparseArray)>
		mRestoringSavedState = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #320 <Field boolean mRestoringSavedState>
	//    9   15:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #833 <Method void LinearLayout.draw(Canvas)>
		if(mHintEnabled)
	//*   3    5:aload_0         
	//*   4    6:getfield        #178 <Field boolean mHintEnabled>
	//*   5    9:ifeq            20
			mCollapsingTextHelper.d(canvas);
	//    6   12:aload_0         
	//    7   13:getfield        #110 <Field n mCollapsingTextHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #835 <Method void n.d(Canvas)>
	//   10   20:return          
	}

	protected void drawableStateChanged()
	{
		if(mInDrawableStateChanged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #838 <Field boolean mInDrawableStateChanged>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mInDrawableStateChanged = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #838 <Field boolean mInDrawableStateChanged>
		super.drawableStateChanged();
	//    7   13:aload_0         
	//    8   14:invokespecial   #840 <Method void LinearLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #844 <Method int[] getDrawableState()>
	//   11   21:astore_3        
		boolean flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		boolean flag1;
		if(ViewCompat.isLaidOut(((View) (this))) && isEnabled())
	//*  14   24:aload_0         
	//*  15   25:invokestatic    #848 <Method boolean ViewCompat.isLaidOut(View)>
	//*  16   28:ifeq            43
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #851 <Method boolean isEnabled()>
	//*  19   35:ifeq            43
			flag1 = true;
	//   20   38:iconst_1        
	//   21   39:istore_2        
		else
	//*  22   40:goto            45
			flag1 = false;
	//   23   43:iconst_0        
	//   24   44:istore_2        
		updateLabelState(flag1);
	//   25   45:aload_0         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #636 <Method void updateLabelState(boolean)>
		updateEditTextBackground();
	//   28   50:aload_0         
	//   29   51:invokespecial   #634 <Method void updateEditTextBackground()>
		if(mCollapsingTextHelper != null)
	//*  30   54:aload_0         
	//*  31   55:getfield        #110 <Field n mCollapsingTextHelper>
	//*  32   58:ifnull          72
			flag = mCollapsingTextHelper.a(ai) | false;
	//   33   61:aload_0         
	//   34   62:getfield        #110 <Field n mCollapsingTextHelper>
	//   35   65:aload_3         
	//   36   66:invokevirtual   #854 <Method boolean n.a(int[])>
	//   37   69:iconst_0        
	//   38   70:ior             
	//   39   71:istore_1        
		if(flag)
	//*  40   72:iload_1         
	//*  41   73:ifeq            80
			invalidate();
	//   42   76:aload_0         
	//   43   77:invokevirtual   #857 <Method void invalidate()>
		mInDrawableStateChanged = false;
	//   44   80:aload_0         
	//   45   81:iconst_0        
	//   46   82:putfield        #838 <Field boolean mInDrawableStateChanged>
	//   47   85:return          
	}

	public int getCounterMaxLength()
	{
		return mCounterMaxLength;
	//    0    0:aload_0         
	//    1    1:getfield        #860 <Field int mCounterMaxLength>
	//    2    4:ireturn         
	}

	public EditText getEditText()
	{
		return mEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #346 <Field EditText mEditText>
	//    2    4:areturn         
	}

	public CharSequence getError()
	{
		if(mErrorEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #575 <Field boolean mErrorEnabled>
	//*   2    4:ifeq            12
			return mError;
	//    3    7:aload_0         
	//    4    8:getfield        #573 <Field CharSequence mError>
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
	//*   1    1:getfield        #178 <Field boolean mHintEnabled>
	//*   2    4:ifeq            12
			return mHint;
	//    3    7:aload_0         
	//    4    8:getfield        #537 <Field CharSequence mHint>
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
	//    1    1:getfield        #268 <Field CharSequence mPasswordToggleContentDesc>
	//    2    4:areturn         
	}

	public Drawable getPasswordVisibilityToggleDrawable()
	{
		return mPasswordToggleDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #263 <Field Drawable mPasswordToggleDrawable>
	//    2    4:areturn         
	}

	public Typeface getTypeface()
	{
		return mTypeface;
	//    0    0:aload_0         
	//    1    1:getfield        #868 <Field Typeface mTypeface>
	//    2    4:areturn         
	}

	public boolean isCounterEnabled()
	{
		return mCounterEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #871 <Field boolean mCounterEnabled>
	//    2    4:ireturn         
	}

	public boolean isErrorEnabled()
	{
		return mErrorEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #575 <Field boolean mErrorEnabled>
	//    2    4:ireturn         
	}

	public boolean isHintAnimationEnabled()
	{
		return mHintAnimationEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field boolean mHintAnimationEnabled>
	//    2    4:ireturn         
	}

	public boolean isHintEnabled()
	{
		return mHintEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field boolean mHintEnabled>
	//    2    4:ireturn         
	}

	final boolean isHintExpanded()
	{
		return mHintExpanded;
	//    0    0:aload_0         
	//    1    1:getfield        #424 <Field boolean mHintExpanded>
	//    2    4:ireturn         
	}

	public boolean isPasswordVisibilityToggleEnabled()
	{
		return mPasswordToggleEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field boolean mPasswordToggleEnabled>
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
	//    6    8:invokespecial   #880 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		if(mHintEnabled && mEditText != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #178 <Field boolean mHintEnabled>
	//*   9   15:ifeq            136
	//*  10   18:aload_0         
	//*  11   19:getfield        #346 <Field EditText mEditText>
	//*  12   22:ifnull          136
		{
			Rect rect = mTmpRect;
	//   13   25:aload_0         
	//   14   26:getfield        #103 <Field Rect mTmpRect>
	//   15   29:astore          6
			ac.e(((ViewGroup) (this)), ((View) (mEditText)), rect);
	//   16   31:aload_0         
	//   17   32:aload_0         
	//   18   33:getfield        #346 <Field EditText mEditText>
	//   19   36:aload           6
	//   20   38:invokestatic    #885 <Method void ac.e(ViewGroup, View, Rect)>
			i = rect.left + mEditText.getCompoundPaddingLeft();
	//   21   41:aload           6
	//   22   43:getfield        #888 <Field int Rect.left>
	//   23   46:aload_0         
	//   24   47:getfield        #346 <Field EditText mEditText>
	//   25   50:invokevirtual   #891 <Method int EditText.getCompoundPaddingLeft()>
	//   26   53:iadd            
	//   27   54:istore_2        
			k = rect.right - mEditText.getCompoundPaddingRight();
	//   28   55:aload           6
	//   29   57:getfield        #894 <Field int Rect.right>
	//   30   60:aload_0         
	//   31   61:getfield        #346 <Field EditText mEditText>
	//   32   64:invokevirtual   #897 <Method int EditText.getCompoundPaddingRight()>
	//   33   67:isub            
	//   34   68:istore          4
			mCollapsingTextHelper.d(i, rect.top + mEditText.getCompoundPaddingTop(), k, rect.bottom - mEditText.getCompoundPaddingBottom());
	//   35   70:aload_0         
	//   36   71:getfield        #110 <Field n mCollapsingTextHelper>
	//   37   74:iload_2         
	//   38   75:aload           6
	//   39   77:getfield        #900 <Field int Rect.top>
	//   40   80:aload_0         
	//   41   81:getfield        #346 <Field EditText mEditText>
	//   42   84:invokevirtual   #903 <Method int EditText.getCompoundPaddingTop()>
	//   43   87:iadd            
	//   44   88:iload           4
	//   45   90:aload           6
	//   46   92:getfield        #906 <Field int Rect.bottom>
	//   47   95:aload_0         
	//   48   96:getfield        #346 <Field EditText mEditText>
	//   49   99:invokevirtual   #909 <Method int EditText.getCompoundPaddingBottom()>
	//   50  102:isub            
	//   51  103:invokevirtual   #911 <Method void n.d(int, int, int, int)>
			mCollapsingTextHelper.b(i, getPaddingTop(), k, l - j - getPaddingBottom());
	//   52  106:aload_0         
	//   53  107:getfield        #110 <Field n mCollapsingTextHelper>
	//   54  110:iload_2         
	//   55  111:aload_0         
	//   56  112:invokevirtual   #912 <Method int getPaddingTop()>
	//   57  115:iload           4
	//   58  117:iload           5
	//   59  119:iload_3         
	//   60  120:isub            
	//   61  121:aload_0         
	//   62  122:invokevirtual   #913 <Method int getPaddingBottom()>
	//   63  125:isub            
	//   64  126:invokevirtual   #915 <Method void n.b(int, int, int, int)>
			mCollapsingTextHelper.h();
	//   65  129:aload_0         
	//   66  130:getfield        #110 <Field n mCollapsingTextHelper>
	//   67  133:invokevirtual   #918 <Method void n.h()>
		}
	//   68  136:return          
	}

	protected void onMeasure(int i, int j)
	{
		updatePasswordToggleView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #564 <Method void updatePasswordToggleView()>
		super.onMeasure(i, j);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #922 <Method void LinearLayout.onMeasure(int, int)>
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
	//    5    9:invokespecial   #926 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #16  <Class TextInputLayout$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #930 <Method Parcelable TextInputLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #926 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
			setError(((SavedState) (parcelable)).error);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #933 <Field CharSequence TextInputLayout$SavedState.error>
	//   17   31:invokevirtual   #935 <Method void setError(CharSequence)>
			requestLayout();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #936 <Method void requestLayout()>
			return;
	//   20   38:return          
		}
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #16  <Class TextInputLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #939 <Method Parcelable LinearLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #941 <Method void TextInputLayout$SavedState(Parcelable)>
	//    5   11:astore_1        
		if(mErrorShown)
	//*   6   12:aload_0         
	//*   7   13:getfield        #577 <Field boolean mErrorShown>
	//*   8   16:ifeq            27
			savedstate.error = getError();
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #943 <Method CharSequence getError()>
	//   12   24:putfield        #933 <Field CharSequence TextInputLayout$SavedState.error>
		return ((Parcelable) (savedstate));
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	void passwordVisibilityToggleRequested()
	{
		if(mPasswordToggleEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #254 <Field boolean mPasswordToggleEnabled>
	//*   2    4:ifeq            72
		{
			int i = mEditText.getSelectionEnd();
	//    3    7:aload_0         
	//    4    8:getfield        #346 <Field EditText mEditText>
	//    5   11:invokevirtual   #947 <Method int EditText.getSelectionEnd()>
	//    6   14:istore_1        
			if(hasPasswordTransformation())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #507 <Method boolean hasPasswordTransformation()>
	//*   9   19:ifeq            38
			{
				mEditText.setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #346 <Field EditText mEditText>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #951 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				mPasswordToggledVisible = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #643 <Field boolean mPasswordToggledVisible>
			} else
	//*  17   35:goto            53
			{
				mEditText.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   18   38:aload_0         
	//   19   39:getfield        #346 <Field EditText mEditText>
	//   20   42:invokestatic    #955 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   21   45:invokevirtual   #951 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				mPasswordToggledVisible = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #643 <Field boolean mPasswordToggledVisible>
			}
			mPasswordToggleView.setChecked(mPasswordToggledVisible);
	//   25   53:aload_0         
	//   26   54:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//   27   57:aload_0         
	//   28   58:getfield        #643 <Field boolean mPasswordToggledVisible>
	//   29   61:invokevirtual   #743 <Method void CheckableImageButton.setChecked(boolean)>
			mEditText.setSelection(i);
	//   30   64:aload_0         
	//   31   65:getfield        #346 <Field EditText mEditText>
	//   32   68:iload_1         
	//   33   69:invokevirtual   #958 <Method void EditText.setSelection(int)>
		}
	//   34   72:return          
	}

	public void setCounterEnabled(boolean flag)
	{
		if(mCounterEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #871 <Field boolean mCounterEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          166
		{
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            148
			{
				mCounterView = ((TextView) (new AppCompatTextView(getContext())));
	//    6   12:aload_0         
	//    7   13:new             #962 <Class AppCompatTextView>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #328 <Method Context getContext()>
	//   11   21:invokespecial   #963 <Method void AppCompatTextView(Context)>
	//   12   24:putfield        #550 <Field TextView mCounterView>
				mCounterView.setId(android.support.design.R.id.textinput_counter);
	//   13   27:aload_0         
	//   14   28:getfield        #550 <Field TextView mCounterView>
	//   15   31:getstatic       #968 <Field int android.support.design.R$id.textinput_counter>
	//   16   34:invokevirtual   #971 <Method void TextView.setId(int)>
				if(mTypeface != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #868 <Field Typeface mTypeface>
	//*  19   41:ifnull          55
					mCounterView.setTypeface(mTypeface);
	//   20   44:aload_0         
	//   21   45:getfield        #550 <Field TextView mCounterView>
	//   22   48:aload_0         
	//   23   49:getfield        #868 <Field Typeface mTypeface>
	//   24   52:invokevirtual   #973 <Method void TextView.setTypeface(Typeface)>
				mCounterView.setMaxLines(1);
	//   25   55:aload_0         
	//   26   56:getfield        #550 <Field TextView mCounterView>
	//   27   59:iconst_1        
	//   28   60:invokevirtual   #976 <Method void TextView.setMaxLines(int)>
				try
				{
					TextViewCompat.setTextAppearance(mCounterView, mCounterTextAppearance);
	//   29   63:aload_0         
	//   30   64:getfield        #550 <Field TextView mCounterView>
	//   31   67:aload_0         
	//   32   68:getfield        #244 <Field int mCounterTextAppearance>
	//   33   71:invokestatic    #979 <Method void TextViewCompat.setTextAppearance(TextView, int)>
				}
	//*  34   74:goto            105
				catch(Exception exception)
	//*  35   77:astore_2        
				{
					TextViewCompat.setTextAppearance(mCounterView, android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Caption);
	//   36   78:aload_0         
	//   37   79:getfield        #550 <Field TextView mCounterView>
	//   38   82:getstatic       #984 <Field int android.support.v7.appcompat.R$style.TextAppearance_AppCompat_Caption>
	//   39   85:invokestatic    #979 <Method void TextViewCompat.setTextAppearance(TextView, int)>
					mCounterView.setTextColor(ContextCompat.getColor(getContext(), android.support.design.R.color.design_textinput_error_color_light));
	//   40   88:aload_0         
	//   41   89:getfield        #550 <Field TextView mCounterView>
	//   42   92:aload_0         
	//   43   93:invokevirtual   #328 <Method Context getContext()>
	//   44   96:getstatic       #989 <Field int android.support.design.R$color.design_textinput_error_color_light>
	//   45   99:invokestatic    #995 <Method int ContextCompat.getColor(Context, int)>
	//   46  102:invokevirtual   #998 <Method void TextView.setTextColor(int)>
				}
				addIndicator(mCounterView, -1);
	//   47  105:aload_0         
	//   48  106:aload_0         
	//   49  107:getfield        #550 <Field TextView mCounterView>
	//   50  110:iconst_m1       
	//   51  111:invokespecial   #1000 <Method void addIndicator(TextView, int)>
				if(mEditText == null)
	//*  52  114:aload_0         
	//*  53  115:getfield        #346 <Field EditText mEditText>
	//*  54  118:ifnonnull       129
					updateCounter(0);
	//   55  121:aload_0         
	//   56  122:iconst_0        
	//   57  123:invokevirtual   #561 <Method void updateCounter(int)>
				else
	//*  58  126:goto            161
					updateCounter(mEditText.getText().length());
	//   59  129:aload_0         
	//   60  130:aload_0         
	//   61  131:getfield        #346 <Field EditText mEditText>
	//   62  134:invokevirtual   #553 <Method Editable EditText.getText()>
	//   63  137:invokeinterface #558 <Method int Editable.length()>
	//   64  142:invokevirtual   #561 <Method void updateCounter(int)>
			} else
	//*  65  145:goto            161
			{
				removeIndicator(mCounterView);
	//   66  148:aload_0         
	//   67  149:aload_0         
	//   68  150:getfield        #550 <Field TextView mCounterView>
	//   69  153:invokespecial   #1002 <Method void removeIndicator(TextView)>
				mCounterView = null;
	//   70  156:aload_0         
	//   71  157:aconst_null     
	//   72  158:putfield        #550 <Field TextView mCounterView>
			}
			mCounterEnabled = flag;
	//   73  161:aload_0         
	//   74  162:iload_1         
	//   75  163:putfield        #871 <Field boolean mCounterEnabled>
		}
	//   76  166:return          
	}

	public void setCounterMaxLength(int i)
	{
		if(mCounterMaxLength != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #860 <Field int mCounterMaxLength>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          62
		{
			if(i > 0)
	//*   4    8:iload_1         
	//*   5    9:ifle            20
				mCounterMaxLength = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #860 <Field int mCounterMaxLength>
			else
	//*   9   17:goto            25
				mCounterMaxLength = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #860 <Field int mCounterMaxLength>
			if(mCounterEnabled)
	//*  13   25:aload_0         
	//*  14   26:getfield        #871 <Field boolean mCounterEnabled>
	//*  15   29:ifeq            62
			{
				if(mEditText == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #346 <Field EditText mEditText>
	//*  18   36:ifnonnull       44
					i = 0;
	//   19   39:iconst_0        
	//   20   40:istore_1        
				else
	//*  21   41:goto            57
					i = mEditText.getText().length();
	//   22   44:aload_0         
	//   23   45:getfield        #346 <Field EditText mEditText>
	//   24   48:invokevirtual   #553 <Method Editable EditText.getText()>
	//   25   51:invokeinterface #558 <Method int Editable.length()>
	//   26   56:istore_1        
				updateCounter(i);
	//   27   57:aload_0         
	//   28   58:iload_1         
	//   29   59:invokevirtual   #561 <Method void updateCounter(int)>
			}
		}
	//   30   62:return          
	}

	public void setEnabled(boolean flag)
	{
		recursiveSetEnabled(((ViewGroup) (this)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #481 <Method void recursiveSetEnabled(ViewGroup, boolean)>
		super.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #1003 <Method void LinearLayout.setEnabled(boolean)>
	//    6   10:return          
	}

	public void setError(CharSequence charsequence)
	{
		boolean flag;
		if(ViewCompat.isLaidOut(((View) (this))) && isEnabled() && (mErrorView == null || !TextUtils.equals(mErrorView.getText(), charsequence)))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #848 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifeq            40
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #851 <Method boolean isEnabled()>
	//*   5   11:ifeq            40
	//*   6   14:aload_0         
	//*   7   15:getfield        #579 <Field TextView mErrorView>
	//*   8   18:ifnull          35
	//*   9   21:aload_0         
	//*  10   22:getfield        #579 <Field TextView mErrorView>
	//*  11   25:invokevirtual   #1005 <Method CharSequence TextView.getText()>
	//*  12   28:aload_1         
	//*  13   29:invokestatic    #1009 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
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
	//   23   45:invokespecial   #1011 <Method void setError(CharSequence, boolean)>
	//   24   48:return          
	}

	public void setErrorEnabled(boolean flag)
	{
		boolean flag2;
		if(mErrorEnabled == flag)
			break MISSING_BLOCK_LABEL_212;
	//    0    0:aload_0         
	//    1    1:getfield        #575 <Field boolean mErrorEnabled>
	//    2    4:iload_1         
	//    3    5:icmpeq          212
		if(mErrorView != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #579 <Field TextView mErrorView>
	//*   6   12:ifnull          25
			mErrorView.animate().cancel();
	//    7   15:aload_0         
	//    8   16:getfield        #579 <Field TextView mErrorView>
	//    9   19:invokevirtual   #585 <Method ViewPropertyAnimator TextView.animate()>
	//   10   22:invokevirtual   #588 <Method void ViewPropertyAnimator.cancel()>
		if(!flag)
			break MISSING_BLOCK_LABEL_185;
	//   11   25:iload_1         
	//   12   26:ifeq            185
		mErrorView = ((TextView) (new AppCompatTextView(getContext())));
	//   13   29:aload_0         
	//   14   30:new             #962 <Class AppCompatTextView>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokevirtual   #328 <Method Context getContext()>
	//   18   38:invokespecial   #963 <Method void AppCompatTextView(Context)>
	//   19   41:putfield        #579 <Field TextView mErrorView>
		mErrorView.setId(android.support.design.R.id.textinput_error);
	//   20   44:aload_0         
	//   21   45:getfield        #579 <Field TextView mErrorView>
	//   22   48:getstatic       #1014 <Field int android.support.design.R$id.textinput_error>
	//   23   51:invokevirtual   #971 <Method void TextView.setId(int)>
		if(mTypeface != null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #868 <Field Typeface mTypeface>
	//*  26   58:ifnull          72
			mErrorView.setTypeface(mTypeface);
	//   27   61:aload_0         
	//   28   62:getfield        #579 <Field TextView mErrorView>
	//   29   65:aload_0         
	//   30   66:getfield        #868 <Field Typeface mTypeface>
	//   31   69:invokevirtual   #973 <Method void TextView.setTypeface(Typeface)>
		flag2 = false;
	//   32   72:iconst_0        
	//   33   73:istore_3        
		TextViewCompat.setTextAppearance(mErrorView, mErrorTextAppearance);
	//   34   74:aload_0         
	//   35   75:getfield        #579 <Field TextView mErrorView>
	//   36   78:aload_0         
	//   37   79:getfield        #224 <Field int mErrorTextAppearance>
	//   38   82:invokestatic    #979 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		boolean flag1 = flag2;
	//   39   85:iload_3         
	//   40   86:istore_2        
		int i;
		if(android.os.Build.VERSION.SDK_INT < 23)
			break MISSING_BLOCK_LABEL_126;
	//   41   87:getstatic       #430 <Field int android.os.Build$VERSION.SDK_INT>
	//   42   90:bipush          23
	//   43   92:icmplt          119
		i = mErrorView.getTextColors().getDefaultColor();
	//   44   95:aload_0         
	//   45   96:getfield        #579 <Field TextView mErrorView>
	//   46   99:invokevirtual   #1017 <Method ColorStateList TextView.getTextColors()>
	//   47  102:invokevirtual   #1022 <Method int ColorStateList.getDefaultColor()>
	//   48  105:istore          4
		flag1 = flag2;
	//   49  107:iload_3         
	//   50  108:istore_2        
		if(i == -65281)
	//*  51  109:iload           4
	//*  52  111:ldc2            #1023 <Int -65281>
	//*  53  114:icmpne          119
			flag1 = true;
	//   54  117:iconst_1        
	//   55  118:istore_2        
		break MISSING_BLOCK_LABEL_126;
	//   56  119:goto            126
		Exception exception;
		exception;
	//   57  122:astore          5
		flag1 = true;
	//   58  124:iconst_1        
	//   59  125:istore_2        
		if(flag1)
	//*  60  126:iload_2         
	//*  61  127:ifeq            157
		{
			TextViewCompat.setTextAppearance(mErrorView, android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Caption);
	//   62  130:aload_0         
	//   63  131:getfield        #579 <Field TextView mErrorView>
	//   64  134:getstatic       #984 <Field int android.support.v7.appcompat.R$style.TextAppearance_AppCompat_Caption>
	//   65  137:invokestatic    #979 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			mErrorView.setTextColor(ContextCompat.getColor(getContext(), android.support.design.R.color.design_textinput_error_color_light));
	//   66  140:aload_0         
	//   67  141:getfield        #579 <Field TextView mErrorView>
	//   68  144:aload_0         
	//   69  145:invokevirtual   #328 <Method Context getContext()>
	//   70  148:getstatic       #989 <Field int android.support.design.R$color.design_textinput_error_color_light>
	//   71  151:invokestatic    #995 <Method int ContextCompat.getColor(Context, int)>
	//   72  154:invokevirtual   #998 <Method void TextView.setTextColor(int)>
		}
		mErrorView.setVisibility(4);
	//   73  157:aload_0         
	//   74  158:getfield        #579 <Field TextView mErrorView>
	//   75  161:iconst_4        
	//   76  162:invokevirtual   #592 <Method void TextView.setVisibility(int)>
		ViewCompat.setAccessibilityLiveRegion(((View) (mErrorView)), 1);
	//   77  165:aload_0         
	//   78  166:getfield        #579 <Field TextView mErrorView>
	//   79  169:iconst_1        
	//   80  170:invokestatic    #1026 <Method void ViewCompat.setAccessibilityLiveRegion(View, int)>
		addIndicator(mErrorView, 0);
	//   81  173:aload_0         
	//   82  174:aload_0         
	//   83  175:getfield        #579 <Field TextView mErrorView>
	//   84  178:iconst_0        
	//   85  179:invokespecial   #1000 <Method void addIndicator(TextView, int)>
		break MISSING_BLOCK_LABEL_207;
	//   86  182:goto            207
		mErrorShown = false;
	//   87  185:aload_0         
	//   88  186:iconst_0        
	//   89  187:putfield        #577 <Field boolean mErrorShown>
		updateEditTextBackground();
	//   90  190:aload_0         
	//   91  191:invokespecial   #634 <Method void updateEditTextBackground()>
		removeIndicator(mErrorView);
	//   92  194:aload_0         
	//   93  195:aload_0         
	//   94  196:getfield        #579 <Field TextView mErrorView>
	//   95  199:invokespecial   #1002 <Method void removeIndicator(TextView)>
		mErrorView = null;
	//   96  202:aload_0         
	//   97  203:aconst_null     
	//   98  204:putfield        #579 <Field TextView mErrorView>
		mErrorEnabled = flag;
	//   99  207:aload_0         
	//  100  208:iload_1         
	//  101  209:putfield        #575 <Field boolean mErrorEnabled>
	//  102  212:return          
	}

	public void setErrorTextAppearance(int i)
	{
		mErrorTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #224 <Field int mErrorTextAppearance>
		if(mErrorView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #579 <Field TextView mErrorView>
	//*   5    9:ifnull          20
			TextViewCompat.setTextAppearance(mErrorView, i);
	//    6   12:aload_0         
	//    7   13:getfield        #579 <Field TextView mErrorView>
	//    8   16:iload_1         
	//    9   17:invokestatic    #979 <Method void TextViewCompat.setTextAppearance(TextView, int)>
	//   10   20:return          
	}

	public void setHint(CharSequence charsequence)
	{
		if(mHintEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field boolean mHintEnabled>
	//*   2    4:ifeq            19
		{
			setHintInternal(charsequence);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1030 <Method void setHintInternal(CharSequence)>
			sendAccessibilityEvent(2048);
	//    6   12:aload_0         
	//    7   13:sipush          2048
	//    8   16:invokevirtual   #1033 <Method void sendAccessibilityEvent(int)>
		}
	//    9   19:return          
	}

	public void setHintAnimationEnabled(boolean flag)
	{
		mHintAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #194 <Field boolean mHintAnimationEnabled>
	//    3    5:return          
	}

	public void setHintEnabled(boolean flag)
	{
		if(flag != mHintEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #178 <Field boolean mHintEnabled>
	//*   3    5:icmpeq          105
		{
			mHintEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #178 <Field boolean mHintEnabled>
			CharSequence charsequence = mEditText.getHint();
	//    7   13:aload_0         
	//    8   14:getfield        #346 <Field EditText mEditText>
	//    9   17:invokevirtual   #547 <Method CharSequence EditText.getHint()>
	//   10   20:astore_2        
			if(!mHintEnabled)
	//*  11   21:aload_0         
	//*  12   22:getfield        #178 <Field boolean mHintEnabled>
	//*  13   25:ifne            64
			{
				if(!TextUtils.isEmpty(mHint) && TextUtils.isEmpty(charsequence))
	//*  14   28:aload_0         
	//*  15   29:getfield        #537 <Field CharSequence mHint>
	//*  16   32:invokestatic    #543 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   35:ifne            56
	//*  18   38:aload_2         
	//*  19   39:invokestatic    #543 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   42:ifeq            56
					mEditText.setHint(mHint);
	//   21   45:aload_0         
	//   22   46:getfield        #346 <Field EditText mEditText>
	//   23   49:aload_0         
	//   24   50:getfield        #537 <Field CharSequence mHint>
	//   25   53:invokevirtual   #548 <Method void EditText.setHint(CharSequence)>
				setHintInternal(((CharSequence) (null)));
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:invokespecial   #1030 <Method void setHintInternal(CharSequence)>
			} else
	//*  29   61:goto            94
			if(!TextUtils.isEmpty(charsequence))
	//*  30   64:aload_2         
	//*  31   65:invokestatic    #543 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   68:ifne            94
			{
				if(TextUtils.isEmpty(mHint))
	//*  33   71:aload_0         
	//*  34   72:getfield        #537 <Field CharSequence mHint>
	//*  35   75:invokestatic    #543 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  36   78:ifeq            86
					setHint(charsequence);
	//   37   81:aload_0         
	//   38   82:aload_2         
	//   39   83:invokevirtual   #189 <Method void setHint(CharSequence)>
				mEditText.setHint(((CharSequence) (null)));
	//   40   86:aload_0         
	//   41   87:getfield        #346 <Field EditText mEditText>
	//   42   90:aconst_null     
	//   43   91:invokevirtual   #548 <Method void EditText.setHint(CharSequence)>
			}
			if(mEditText != null)
	//*  44   94:aload_0         
	//*  45   95:getfield        #346 <Field EditText mEditText>
	//*  46   98:ifnull          105
				updateInputLayoutMargins();
	//   47  101:aload_0         
	//   48  102:invokespecial   #795 <Method void updateInputLayoutMargins()>
		}
	//   49  105:return          
	}

	public void setHintTextAppearance(int i)
	{
		mCollapsingTextHelper.c(i);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field n mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1037 <Method void n.c(int)>
		mFocusedTextColor = mCollapsingTextHelper.o();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #110 <Field n mCollapsingTextHelper>
	//    7   13:invokevirtual   #1040 <Method ColorStateList n.o()>
	//    8   16:putfield        #207 <Field ColorStateList mFocusedTextColor>
		if(mEditText != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #346 <Field EditText mEditText>
	//*  11   23:ifnull          35
		{
			updateLabelState(false);
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #636 <Method void updateLabelState(boolean)>
			updateInputLayoutMargins();
	//   15   31:aload_0         
	//   16   32:invokespecial   #795 <Method void updateInputLayoutMargins()>
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
	//    3    5:invokevirtual   #1046 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1049 <Method CharSequence Resources.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			charsequence = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleContentDescription(charsequence);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1051 <Method void setPasswordVisibilityToggleContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleContentDescription(CharSequence charsequence)
	{
		mPasswordToggleContentDesc = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #268 <Field CharSequence mPasswordToggleContentDesc>
		if(mPasswordToggleView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//*   5    9:ifnull          20
			mPasswordToggleView.setContentDescription(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #727 <Method void CheckableImageButton.setContentDescription(CharSequence)>
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
	//    3    5:invokevirtual   #328 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1058 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleDrawable(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1060 <Method void setPasswordVisibilityToggleDrawable(Drawable)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleDrawable(Drawable drawable)
	{
		mPasswordToggleDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #263 <Field Drawable mPasswordToggleDrawable>
		if(mPasswordToggleView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//*   5    9:ifnull          20
			mPasswordToggleView.setImageDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #394 <Field CheckableImageButton mPasswordToggleView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #402 <Method void CheckableImageButton.setImageDrawable(Drawable)>
	//   10   20:return          
	}

	public void setPasswordVisibilityToggleEnabled(boolean flag)
	{
		if(mPasswordToggleEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #254 <Field boolean mPasswordToggleEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          50
		{
			mPasswordToggleEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #254 <Field boolean mPasswordToggleEnabled>
			if(!flag && mPasswordToggledVisible && mEditText != null)
	//*   7   13:iload_1         
	//*   8   14:ifne            41
	//*   9   17:aload_0         
	//*  10   18:getfield        #643 <Field boolean mPasswordToggledVisible>
	//*  11   21:ifeq            41
	//*  12   24:aload_0         
	//*  13   25:getfield        #346 <Field EditText mEditText>
	//*  14   28:ifnull          41
				mEditText.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   15   31:aload_0         
	//   16   32:getfield        #346 <Field EditText mEditText>
	//   17   35:invokestatic    #955 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   18   38:invokevirtual   #951 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
			mPasswordToggledVisible = false;
	//   19   41:aload_0         
	//   20   42:iconst_0        
	//   21   43:putfield        #643 <Field boolean mPasswordToggledVisible>
			updatePasswordToggleView();
	//   22   46:aload_0         
	//   23   47:invokespecial   #564 <Method void updatePasswordToggleView()>
		}
	//   24   50:return          
	}

	public void setPasswordVisibilityToggleTintList(ColorStateList colorstatelist)
	{
		mPasswordToggleTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #275 <Field ColorStateList mPasswordToggleTintList>
		mHasPasswordToggleTintList = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #273 <Field boolean mHasPasswordToggleTintList>
		applyPasswordToggleTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #299 <Method void applyPasswordToggleTint()>
	//    8   14:return          
	}

	public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mPasswordToggleTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #287 <Field android.graphics.PorterDuff$Mode mPasswordToggleTintMode>
		mHasPasswordToggleTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #280 <Field boolean mHasPasswordToggleTintMode>
		applyPasswordToggleTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #299 <Method void applyPasswordToggleTint()>
	//    8   14:return          
	}

	public void setTypeface(Typeface typeface)
	{
		if(typeface != mTypeface)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #868 <Field Typeface mTypeface>
	//*   3    5:if_acmpeq       51
		{
			mTypeface = typeface;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #868 <Field Typeface mTypeface>
			mCollapsingTextHelper.a(typeface);
	//    7   13:aload_0         
	//    8   14:getfield        #110 <Field n mCollapsingTextHelper>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #514 <Method void n.a(Typeface)>
			if(mCounterView != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #550 <Field TextView mCounterView>
	//*  13   25:ifnull          36
				mCounterView.setTypeface(typeface);
	//   14   28:aload_0         
	//   15   29:getfield        #550 <Field TextView mCounterView>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #973 <Method void TextView.setTypeface(Typeface)>
			if(mErrorView != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #579 <Field TextView mErrorView>
	//*  20   40:ifnull          51
				mErrorView.setTypeface(typeface);
	//   21   43:aload_0         
	//   22   44:getfield        #579 <Field TextView mErrorView>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #973 <Method void TextView.setTypeface(Typeface)>
		}
	//   25   51:return          
	}

	void updateCounter(int i)
	{
		boolean flag1 = mCounterOverflowed;
	//    0    0:aload_0         
	//    1    1:getfield        #671 <Field boolean mCounterOverflowed>
	//    2    4:istore          4
		if(mCounterMaxLength == -1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #860 <Field int mCounterMaxLength>
	//*   5   10:iconst_m1       
	//*   6   11:icmpne          33
		{
			mCounterView.setText(((CharSequence) (String.valueOf(i))));
	//    7   14:aload_0         
	//    8   15:getfield        #550 <Field TextView mCounterView>
	//    9   18:iload_1         
	//   10   19:invokestatic    #1071 <Method String String.valueOf(int)>
	//   11   22:invokevirtual   #591 <Method void TextView.setText(CharSequence)>
			mCounterOverflowed = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #671 <Field boolean mCounterOverflowed>
		} else
	//*  15   30:goto            132
		{
			boolean flag;
			if(i > mCounterMaxLength)
	//*  16   33:iload_1         
	//*  17   34:aload_0         
	//*  18   35:getfield        #860 <Field int mCounterMaxLength>
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
	//   27   50:putfield        #671 <Field boolean mCounterOverflowed>
			if(flag1 != mCounterOverflowed)
	//*  28   53:iload           4
	//*  29   55:aload_0         
	//*  30   56:getfield        #671 <Field boolean mCounterOverflowed>
	//*  31   59:icmpeq          94
			{
				TextView textview = mCounterView;
	//   32   62:aload_0         
	//   33   63:getfield        #550 <Field TextView mCounterView>
	//   34   66:astore          5
				int j;
				if(mCounterOverflowed)
	//*  35   68:aload_0         
	//*  36   69:getfield        #671 <Field boolean mCounterOverflowed>
	//*  37   72:ifeq            83
					j = mCounterOverflowTextAppearance;
	//   38   75:aload_0         
	//   39   76:getfield        #249 <Field int mCounterOverflowTextAppearance>
	//   40   79:istore_2        
				else
	//*  41   80:goto            88
					j = mCounterTextAppearance;
	//   42   83:aload_0         
	//   43   84:getfield        #244 <Field int mCounterTextAppearance>
	//   44   87:istore_2        
				TextViewCompat.setTextAppearance(textview, j);
	//   45   88:aload           5
	//   46   90:iload_2         
	//   47   91:invokestatic    #979 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			}
			mCounterView.setText(((CharSequence) (getContext().getString(android.support.design.R.string.character_counter_pattern, new Object[] {
				Integer.valueOf(i), Integer.valueOf(mCounterMaxLength)
			}))));
	//   48   94:aload_0         
	//   49   95:getfield        #550 <Field TextView mCounterView>
	//   50   98:aload_0         
	//   51   99:invokevirtual   #328 <Method Context getContext()>
	//   52  102:getstatic       #1076 <Field int android.support.design.R$string.character_counter_pattern>
	//   53  105:iconst_2        
	//   54  106:anewarray       Object[]
	//   55  109:dup             
	//   56  110:iconst_0        
	//   57  111:iload_1         
	//   58  112:invokestatic    #1083 <Method Integer Integer.valueOf(int)>
	//   59  115:aastore         
	//   60  116:dup             
	//   61  117:iconst_1        
	//   62  118:aload_0         
	//   63  119:getfield        #860 <Field int mCounterMaxLength>
	//   64  122:invokestatic    #1083 <Method Integer Integer.valueOf(int)>
	//   65  125:aastore         
	//   66  126:invokevirtual   #1089 <Method String Context.getString(int, Object[])>
	//   67  129:invokevirtual   #591 <Method void TextView.setText(CharSequence)>
		}
		if(mEditText != null && flag1 != mCounterOverflowed)
	//*  68  132:aload_0         
	//*  69  133:getfield        #346 <Field EditText mEditText>
	//*  70  136:ifnull          157
	//*  71  139:iload           4
	//*  72  141:aload_0         
	//*  73  142:getfield        #671 <Field boolean mCounterOverflowed>
	//*  74  145:icmpeq          157
		{
			updateLabelState(false);
	//   75  148:aload_0         
	//   76  149:iconst_0        
	//   77  150:invokevirtual   #636 <Method void updateLabelState(boolean)>
			updateEditTextBackground();
	//   78  153:aload_0         
	//   79  154:invokespecial   #634 <Method void updateEditTextBackground()>
		}
	//   80  157:return          
	}

	void updateLabelState(boolean flag)
	{
		updateLabelState(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #568 <Method void updateLabelState(boolean, boolean)>
	//    4    6:return          
	}

	void updateLabelState(boolean flag, boolean flag1)
	{
		boolean flag4 = isEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #851 <Method boolean isEnabled()>
	//    2    4:istore          5
		boolean flag2;
		if(mEditText != null && !TextUtils.isEmpty(((CharSequence) (mEditText.getText()))))
	//*   3    6:aload_0         
	//*   4    7:getfield        #346 <Field EditText mEditText>
	//*   5   10:ifnull          31
	//*   6   13:aload_0         
	//*   7   14:getfield        #346 <Field EditText mEditText>
	//*   8   17:invokevirtual   #553 <Method Editable EditText.getText()>
	//*   9   20:invokestatic    #543 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   23:ifne            31
			flag2 = true;
	//   11   26:iconst_1        
	//   12   27:istore_3        
		else
	//*  13   28:goto            33
			flag2 = false;
	//   14   31:iconst_0        
	//   15   32:istore_3        
		boolean flag5 = arrayContains(getDrawableState(), 0x101009c);
	//   16   33:aload_0         
	//   17   34:invokevirtual   #844 <Method int[] getDrawableState()>
	//   18   37:ldc2            #1090 <Int 0x101009c>
	//   19   40:invokestatic    #1092 <Method boolean arrayContains(int[], int)>
	//   20   43:istore          6
		boolean flag3;
		if(!TextUtils.isEmpty(getError()))
	//*  21   45:aload_0         
	//*  22   46:invokevirtual   #943 <Method CharSequence getError()>
	//*  23   49:invokestatic    #543 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  24   52:ifne            61
			flag3 = true;
	//   25   55:iconst_1        
	//   26   56:istore          4
		else
	//*  27   58:goto            64
			flag3 = false;
	//   28   61:iconst_0        
	//   29   62:istore          4
		if(mDefaultTextColor != null)
	//*  30   64:aload_0         
	//*  31   65:getfield        #209 <Field ColorStateList mDefaultTextColor>
	//*  32   68:ifnull          82
			mCollapsingTextHelper.b(mDefaultTextColor);
	//   33   71:aload_0         
	//   34   72:getfield        #110 <Field n mCollapsingTextHelper>
	//   35   75:aload_0         
	//   36   76:getfield        #209 <Field ColorStateList mDefaultTextColor>
	//   37   79:invokevirtual   #1094 <Method void n.b(ColorStateList)>
		if(flag4 && mCounterOverflowed && mCounterView != null)
	//*  38   82:iload           5
	//*  39   84:ifeq            118
	//*  40   87:aload_0         
	//*  41   88:getfield        #671 <Field boolean mCounterOverflowed>
	//*  42   91:ifeq            118
	//*  43   94:aload_0         
	//*  44   95:getfield        #550 <Field TextView mCounterView>
	//*  45   98:ifnull          118
			mCollapsingTextHelper.c(mCounterView.getTextColors());
	//   46  101:aload_0         
	//   47  102:getfield        #110 <Field n mCollapsingTextHelper>
	//   48  105:aload_0         
	//   49  106:getfield        #550 <Field TextView mCounterView>
	//   50  109:invokevirtual   #1017 <Method ColorStateList TextView.getTextColors()>
	//   51  112:invokevirtual   #1096 <Method void n.c(ColorStateList)>
		else
	//*  52  115:goto            167
		if(flag4 && flag5 && mFocusedTextColor != null)
	//*  53  118:iload           5
	//*  54  120:ifeq            149
	//*  55  123:iload           6
	//*  56  125:ifeq            149
	//*  57  128:aload_0         
	//*  58  129:getfield        #207 <Field ColorStateList mFocusedTextColor>
	//*  59  132:ifnull          149
			mCollapsingTextHelper.c(mFocusedTextColor);
	//   60  135:aload_0         
	//   61  136:getfield        #110 <Field n mCollapsingTextHelper>
	//   62  139:aload_0         
	//   63  140:getfield        #207 <Field ColorStateList mFocusedTextColor>
	//   64  143:invokevirtual   #1096 <Method void n.c(ColorStateList)>
		else
	//*  65  146:goto            167
		if(mDefaultTextColor != null)
	//*  66  149:aload_0         
	//*  67  150:getfield        #209 <Field ColorStateList mDefaultTextColor>
	//*  68  153:ifnull          167
			mCollapsingTextHelper.c(mDefaultTextColor);
	//   69  156:aload_0         
	//   70  157:getfield        #110 <Field n mCollapsingTextHelper>
	//   71  160:aload_0         
	//   72  161:getfield        #209 <Field ColorStateList mDefaultTextColor>
	//   73  164:invokevirtual   #1096 <Method void n.c(ColorStateList)>
		if(flag2 || isEnabled() && (flag5 || flag3))
	//*  74  167:iload_3         
	//*  75  168:ifne            188
	//*  76  171:aload_0         
	//*  77  172:invokevirtual   #851 <Method boolean isEnabled()>
	//*  78  175:ifeq            205
	//*  79  178:iload           6
	//*  80  180:ifne            188
	//*  81  183:iload           4
	//*  82  185:ifeq            205
		{
			if(flag1 || mHintExpanded)
	//*  83  188:iload_2         
	//*  84  189:ifne            199
	//*  85  192:aload_0         
	//*  86  193:getfield        #424 <Field boolean mHintExpanded>
	//*  87  196:ifeq            221
			{
				collapseHint(flag);
	//   88  199:aload_0         
	//   89  200:iload_1         
	//   90  201:invokespecial   #1098 <Method void collapseHint(boolean)>
				return;
	//   91  204:return          
			}
		} else
		if(flag1 || !mHintExpanded)
	//*  92  205:iload_2         
	//*  93  206:ifne            216
	//*  94  209:aload_0         
	//*  95  210:getfield        #424 <Field boolean mHintExpanded>
	//*  96  213:ifne            221
			expandHint(flag);
	//   97  216:aload_0         
	//   98  217:iload_1         
	//   99  218:invokespecial   #1100 <Method void expandHint(boolean)>
	//  100  221:return          
	}

	private static final int ANIMATION_DURATION = 200;
	private static final int INVALID_MAX_LENGTH = -1;
	private static final String LOG_TAG = "TextInputLayout";
	private ValueAnimator mAnimator;
	final n mCollapsingTextHelper;
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
	//    1    1:getfield        #320 <Field boolean mRestoringSavedState>
	//    2    4:ireturn         
	}

*/
}
