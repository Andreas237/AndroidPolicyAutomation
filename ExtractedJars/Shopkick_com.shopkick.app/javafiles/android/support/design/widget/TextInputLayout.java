// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.*;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.animation.AnimationUtils;
import android.support.design.internal.ThemeEnforcement;
import android.support.design.internal.ViewUtils;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.*;
import android.text.*;
import android.text.method.PasswordTransformationMethod;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.widget.*;
import java.lang.annotation.Annotation;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			IndicatorViewController, CollapsingTextHelper, CheckableImageButton, CutoutDrawable, 
//			DrawableUtils, TextInputEditText, DescendantOffsetUtils

public class TextInputLayout extends LinearLayout
{
	public static class AccessibilityDelegate extends AccessibilityDelegateCompat
	{

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			view = ((View) (layout.getEditText()));
		//    4    6:aload_0         
		//    5    7:getfield        #16  <Field TextInputLayout layout>
		//    6   10:invokevirtual   #25  <Method EditText TextInputLayout.getEditText()>
		//    7   13:astore_1        
			if(view != null)
		//*   8   14:aload_1         
		//*   9   15:ifnull          26
				view = ((View) (((EditText) (view)).getText()));
		//   10   18:aload_1         
		//   11   19:invokevirtual   #31  <Method Editable EditText.getText()>
		//   12   22:astore_1        
			else
		//*  13   23:goto            28
				view = null;
		//   14   26:aconst_null     
		//   15   27:astore_1        
			CharSequence charsequence2 = layout.getHint();
		//   16   28:aload_0         
		//   17   29:getfield        #16  <Field TextInputLayout layout>
		//   18   32:invokevirtual   #35  <Method CharSequence TextInputLayout.getHint()>
		//   19   35:astore          11
			CharSequence charsequence = layout.getError();
		//   20   37:aload_0         
		//   21   38:getfield        #16  <Field TextInputLayout layout>
		//   22   41:invokevirtual   #38  <Method CharSequence TextInputLayout.getError()>
		//   23   44:astore          9
			CharSequence charsequence1 = layout.getCounterOverflowDescription();
		//   24   46:aload_0         
		//   25   47:getfield        #16  <Field TextInputLayout layout>
		//   26   50:invokevirtual   #41  <Method CharSequence TextInputLayout.getCounterOverflowDescription()>
		//   27   53:astore          10
			boolean flag1 = TextUtils.isEmpty(((CharSequence) (view))) ^ true;
		//   28   55:aload_1         
		//   29   56:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
		//   30   59:iconst_1        
		//   31   60:ixor            
		//   32   61:istore          4
			boolean flag2 = TextUtils.isEmpty(charsequence2) ^ true;
		//   33   63:aload           11
		//   34   65:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
		//   35   68:iconst_1        
		//   36   69:ixor            
		//   37   70:istore          5
			boolean flag3 = TextUtils.isEmpty(charsequence) ^ true;
		//   38   72:aload           9
		//   39   74:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
		//   40   77:iconst_1        
		//   41   78:ixor            
		//   42   79:istore          6
			boolean flag5 = false;
		//   43   81:iconst_0        
		//   44   82:istore          8
			boolean flag;
			if(!flag3 && TextUtils.isEmpty(charsequence1))
		//*  45   84:iload           6
		//*  46   86:ifne            105
		//*  47   89:aload           10
		//*  48   91:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  49   94:ifne            100
		//*  50   97:goto            105
				flag = false;
		//   51  100:iconst_0        
		//   52  101:istore_3        
			else
		//*  53  102:goto            107
				flag = true;
		//   54  105:iconst_1        
		//   55  106:istore_3        
			if(flag1)
		//*  56  107:iload           4
		//*  57  109:ifeq            120
				accessibilitynodeinfocompat.setText(((CharSequence) (view)));
		//   58  112:aload_2         
		//   59  113:aload_1         
		//   60  114:invokevirtual   #53  <Method void AccessibilityNodeInfoCompat.setText(CharSequence)>
			else
		//*  61  117:goto            131
			if(flag2)
		//*  62  120:iload           5
		//*  63  122:ifeq            131
				accessibilitynodeinfocompat.setText(charsequence2);
		//   64  125:aload_2         
		//   65  126:aload           11
		//   66  128:invokevirtual   #53  <Method void AccessibilityNodeInfoCompat.setText(CharSequence)>
			if(flag2)
		//*  67  131:iload           5
		//*  68  133:ifeq            169
			{
				accessibilitynodeinfocompat.setHintText(charsequence2);
		//   69  136:aload_2         
		//   70  137:aload           11
		//   71  139:invokevirtual   #56  <Method void AccessibilityNodeInfoCompat.setHintText(CharSequence)>
				boolean flag4 = flag5;
		//   72  142:iload           8
		//   73  144:istore          7
				if(!flag1)
		//*  74  146:iload           4
		//*  75  148:ifne            163
				{
					flag4 = flag5;
		//   76  151:iload           8
		//   77  153:istore          7
					if(flag2)
		//*  78  155:iload           5
		//*  79  157:ifeq            163
						flag4 = true;
		//   80  160:iconst_1        
		//   81  161:istore          7
				}
				accessibilitynodeinfocompat.setShowingHintText(flag4);
		//   82  163:aload_2         
		//   83  164:iload           7
		//   84  166:invokevirtual   #60  <Method void AccessibilityNodeInfoCompat.setShowingHintText(boolean)>
			}
			if(flag)
		//*  85  169:iload_3         
		//*  86  170:ifeq            197
			{
				if(flag3)
		//*  87  173:iload           6
		//*  88  175:ifeq            184
					view = ((View) (charsequence));
		//   89  178:aload           9
		//   90  180:astore_1        
				else
		//*  91  181:goto            187
					view = ((View) (charsequence1));
		//   92  184:aload           10
		//   93  186:astore_1        
				accessibilitynodeinfocompat.setError(((CharSequence) (view)));
		//   94  187:aload_2         
		//   95  188:aload_1         
		//   96  189:invokevirtual   #63  <Method void AccessibilityNodeInfoCompat.setError(CharSequence)>
				accessibilitynodeinfocompat.setContentInvalid(true);
		//   97  192:aload_2         
		//   98  193:iconst_1        
		//   99  194:invokevirtual   #66  <Method void AccessibilityNodeInfoCompat.setContentInvalid(boolean)>
			}
		//  100  197:return          
		}

		public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			super.onPopulateAccessibilityEvent(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #70  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
			view = ((View) (layout.getEditText()));
		//    4    6:aload_0         
		//    5    7:getfield        #16  <Field TextInputLayout layout>
		//    6   10:invokevirtual   #25  <Method EditText TextInputLayout.getEditText()>
		//    7   13:astore_1        
			if(view != null)
		//*   8   14:aload_1         
		//*   9   15:ifnull          26
				view = ((View) (((EditText) (view)).getText()));
		//   10   18:aload_1         
		//   11   19:invokevirtual   #31  <Method Editable EditText.getText()>
		//   12   22:astore_1        
			else
		//*  13   23:goto            28
				view = null;
		//   14   26:aconst_null     
		//   15   27:astore_1        
			Object obj = ((Object) (view));
		//   16   28:aload_1         
		//   17   29:astore_3        
			if(TextUtils.isEmpty(((CharSequence) (view))))
		//*  18   30:aload_1         
		//*  19   31:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  20   34:ifeq            45
				obj = ((Object) (layout.getHint()));
		//   21   37:aload_0         
		//   22   38:getfield        #16  <Field TextInputLayout layout>
		//   23   41:invokevirtual   #35  <Method CharSequence TextInputLayout.getHint()>
		//   24   44:astore_3        
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
		//*  25   45:aload_3         
		//*  26   46:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  27   49:ifne            63
				accessibilityevent.getText().add(obj);
		//   28   52:aload_2         
		//   29   53:invokevirtual   #75  <Method List AccessibilityEvent.getText()>
		//   30   56:aload_3         
		//   31   57:invokeinterface #81  <Method boolean List.add(Object)>
		//   32   62:pop             
		//   33   63:return          
		}

		private final TextInputLayout layout;

		public AccessibilityDelegate(TextInputLayout textinputlayout)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AccessibilityDelegateCompat()>
			layout = textinputlayout;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field TextInputLayout layout>
		//    5    9:return          
		}
	}

	public static interface BoxBackgroundMode
		extends Annotation
	{
	}

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


	public TextInputLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #114 <Method void TextInputLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.design.R.attr.textInputStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #120 <Field int android.support.design.R$attr.textInputStyle>
	//    4    6:invokespecial   #123 <Method void TextInputLayout(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #124 <Method void LinearLayout(Context, AttributeSet, int)>
		indicatorViewController = new IndicatorViewController(this);
	//    5    7:aload_0         
	//    6    8:new             #126 <Class IndicatorViewController>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #129 <Method void IndicatorViewController(TextInputLayout)>
	//   10   16:putfield        #131 <Field IndicatorViewController indicatorViewController>
		tmpRect = new Rect();
	//   11   19:aload_0         
	//   12   20:new             #133 <Class Rect>
	//   13   23:dup             
	//   14   24:invokespecial   #136 <Method void Rect()>
	//   15   27:putfield        #138 <Field Rect tmpRect>
		tmpRectF = new RectF();
	//   16   30:aload_0         
	//   17   31:new             #140 <Class RectF>
	//   18   34:dup             
	//   19   35:invokespecial   #141 <Method void RectF()>
	//   20   38:putfield        #143 <Field RectF tmpRectF>
		collapsingTextHelper = new CollapsingTextHelper(((View) (this)));
	//   21   41:aload_0         
	//   22   42:new             #145 <Class CollapsingTextHelper>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:invokespecial   #148 <Method void CollapsingTextHelper(View)>
	//   26   50:putfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
		setOrientation(1);
	//   27   53:aload_0         
	//   28   54:iconst_1        
	//   29   55:invokevirtual   #154 <Method void setOrientation(int)>
		setWillNotDraw(false);
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:invokevirtual   #158 <Method void setWillNotDraw(boolean)>
		setAddStatesFromChildren(true);
	//   33   63:aload_0         
	//   34   64:iconst_1        
	//   35   65:invokevirtual   #161 <Method void setAddStatesFromChildren(boolean)>
		inputFrame = new FrameLayout(context);
	//   36   68:aload_0         
	//   37   69:new             #163 <Class FrameLayout>
	//   38   72:dup             
	//   39   73:aload_1         
	//   40   74:invokespecial   #165 <Method void FrameLayout(Context)>
	//   41   77:putfield        #167 <Field FrameLayout inputFrame>
		inputFrame.setAddStatesFromChildren(true);
	//   42   80:aload_0         
	//   43   81:getfield        #167 <Field FrameLayout inputFrame>
	//   44   84:iconst_1        
	//   45   85:invokevirtual   #168 <Method void FrameLayout.setAddStatesFromChildren(boolean)>
		addView(((View) (inputFrame)));
	//   46   88:aload_0         
	//   47   89:aload_0         
	//   48   90:getfield        #167 <Field FrameLayout inputFrame>
	//   49   93:invokevirtual   #171 <Method void addView(View)>
		collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
	//   50   96:aload_0         
	//   51   97:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   52  100:getstatic       #177 <Field android.animation.TimeInterpolator AnimationUtils.LINEAR_INTERPOLATOR>
	//   53  103:invokevirtual   #181 <Method void CollapsingTextHelper.setTextSizeInterpolator(android.animation.TimeInterpolator)>
		collapsingTextHelper.setPositionInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
	//   54  106:aload_0         
	//   55  107:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   56  110:getstatic       #177 <Field android.animation.TimeInterpolator AnimationUtils.LINEAR_INTERPOLATOR>
	//   57  113:invokevirtual   #184 <Method void CollapsingTextHelper.setPositionInterpolator(android.animation.TimeInterpolator)>
		collapsingTextHelper.setCollapsedTextGravity(0x800033);
	//   58  116:aload_0         
	//   59  117:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   60  120:ldc1            #185 <Int 0x800033>
	//   61  122:invokevirtual   #188 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
		attributeset = ((AttributeSet) (ThemeEnforcement.obtainTintedStyledAttributes(context, attributeset, android.support.design.R.styleable.TextInputLayout, i, android.support.design.R.style.Widget_Design_TextInputLayout, new int[0])));
	//   62  125:aload_1         
	//   63  126:aload_2         
	//   64  127:getstatic       #193 <Field int[] android.support.design.R$styleable.TextInputLayout>
	//   65  130:iload_3         
	//   66  131:getstatic       #198 <Field int android.support.design.R$style.Widget_Design_TextInputLayout>
	//   67  134:iconst_0        
	//   68  135:newarray        int[]
	//   69  137:invokestatic    #204 <Method TintTypedArray ThemeEnforcement.obtainTintedStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   70  140:astore_2        
		hintEnabled = ((TintTypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.TextInputLayout_hintEnabled, true);
	//   71  141:aload_0         
	//   72  142:aload_2         
	//   73  143:getstatic       #207 <Field int android.support.design.R$styleable.TextInputLayout_hintEnabled>
	//   74  146:iconst_1        
	//   75  147:invokevirtual   #213 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   76  150:putfield        #215 <Field boolean hintEnabled>
		setHint(((TintTypedArray) (attributeset)).getText(android.support.design.R.styleable.TextInputLayout_android_hint));
	//   77  153:aload_0         
	//   78  154:aload_2         
	//   79  155:getstatic       #218 <Field int android.support.design.R$styleable.TextInputLayout_android_hint>
	//   80  158:invokevirtual   #222 <Method CharSequence TintTypedArray.getText(int)>
	//   81  161:invokevirtual   #226 <Method void setHint(CharSequence)>
		hintAnimationEnabled = ((TintTypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.TextInputLayout_hintAnimationEnabled, true);
	//   82  164:aload_0         
	//   83  165:aload_2         
	//   84  166:getstatic       #229 <Field int android.support.design.R$styleable.TextInputLayout_hintAnimationEnabled>
	//   85  169:iconst_1        
	//   86  170:invokevirtual   #213 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   87  173:putfield        #231 <Field boolean hintAnimationEnabled>
		boxBottomOffsetPx = context.getResources().getDimensionPixelOffset(android.support.design.R.dimen.mtrl_textinput_box_bottom_offset);
	//   88  176:aload_0         
	//   89  177:aload_1         
	//   90  178:invokevirtual   #237 <Method Resources Context.getResources()>
	//   91  181:getstatic       #242 <Field int android.support.design.R$dimen.mtrl_textinput_box_bottom_offset>
	//   92  184:invokevirtual   #248 <Method int Resources.getDimensionPixelOffset(int)>
	//   93  187:putfield        #250 <Field int boxBottomOffsetPx>
		boxLabelCutoutPaddingPx = context.getResources().getDimensionPixelOffset(android.support.design.R.dimen.mtrl_textinput_box_label_cutout_padding);
	//   94  190:aload_0         
	//   95  191:aload_1         
	//   96  192:invokevirtual   #237 <Method Resources Context.getResources()>
	//   97  195:getstatic       #253 <Field int android.support.design.R$dimen.mtrl_textinput_box_label_cutout_padding>
	//   98  198:invokevirtual   #248 <Method int Resources.getDimensionPixelOffset(int)>
	//   99  201:putfield        #255 <Field int boxLabelCutoutPaddingPx>
		boxCollapsedPaddingTopPx = ((TintTypedArray) (attributeset)).getDimensionPixelOffset(android.support.design.R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
	//  100  204:aload_0         
	//  101  205:aload_2         
	//  102  206:getstatic       #258 <Field int android.support.design.R$styleable.TextInputLayout_boxCollapsedPaddingTop>
	//  103  209:iconst_0        
	//  104  210:invokevirtual   #261 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  105  213:putfield        #263 <Field int boxCollapsedPaddingTopPx>
		boxCornerRadiusTopStart = ((TintTypedArray) (attributeset)).getDimension(android.support.design.R.styleable.TextInputLayout_boxCornerRadiusTopStart, 0.0F);
	//  106  216:aload_0         
	//  107  217:aload_2         
	//  108  218:getstatic       #266 <Field int android.support.design.R$styleable.TextInputLayout_boxCornerRadiusTopStart>
	//  109  221:fconst_0        
	//  110  222:invokevirtual   #270 <Method float TintTypedArray.getDimension(int, float)>
	//  111  225:putfield        #272 <Field float boxCornerRadiusTopStart>
		boxCornerRadiusTopEnd = ((TintTypedArray) (attributeset)).getDimension(android.support.design.R.styleable.TextInputLayout_boxCornerRadiusTopEnd, 0.0F);
	//  112  228:aload_0         
	//  113  229:aload_2         
	//  114  230:getstatic       #275 <Field int android.support.design.R$styleable.TextInputLayout_boxCornerRadiusTopEnd>
	//  115  233:fconst_0        
	//  116  234:invokevirtual   #270 <Method float TintTypedArray.getDimension(int, float)>
	//  117  237:putfield        #277 <Field float boxCornerRadiusTopEnd>
		boxCornerRadiusBottomEnd = ((TintTypedArray) (attributeset)).getDimension(android.support.design.R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, 0.0F);
	//  118  240:aload_0         
	//  119  241:aload_2         
	//  120  242:getstatic       #280 <Field int android.support.design.R$styleable.TextInputLayout_boxCornerRadiusBottomEnd>
	//  121  245:fconst_0        
	//  122  246:invokevirtual   #270 <Method float TintTypedArray.getDimension(int, float)>
	//  123  249:putfield        #282 <Field float boxCornerRadiusBottomEnd>
		boxCornerRadiusBottomStart = ((TintTypedArray) (attributeset)).getDimension(android.support.design.R.styleable.TextInputLayout_boxCornerRadiusBottomStart, 0.0F);
	//  124  252:aload_0         
	//  125  253:aload_2         
	//  126  254:getstatic       #285 <Field int android.support.design.R$styleable.TextInputLayout_boxCornerRadiusBottomStart>
	//  127  257:fconst_0        
	//  128  258:invokevirtual   #270 <Method float TintTypedArray.getDimension(int, float)>
	//  129  261:putfield        #287 <Field float boxCornerRadiusBottomStart>
		boxBackgroundColor = ((TintTypedArray) (attributeset)).getColor(android.support.design.R.styleable.TextInputLayout_boxBackgroundColor, 0);
	//  130  264:aload_0         
	//  131  265:aload_2         
	//  132  266:getstatic       #290 <Field int android.support.design.R$styleable.TextInputLayout_boxBackgroundColor>
	//  133  269:iconst_0        
	//  134  270:invokevirtual   #293 <Method int TintTypedArray.getColor(int, int)>
	//  135  273:putfield        #295 <Field int boxBackgroundColor>
		focusedStrokeColor = ((TintTypedArray) (attributeset)).getColor(android.support.design.R.styleable.TextInputLayout_boxStrokeColor, 0);
	//  136  276:aload_0         
	//  137  277:aload_2         
	//  138  278:getstatic       #298 <Field int android.support.design.R$styleable.TextInputLayout_boxStrokeColor>
	//  139  281:iconst_0        
	//  140  282:invokevirtual   #293 <Method int TintTypedArray.getColor(int, int)>
	//  141  285:putfield        #300 <Field int focusedStrokeColor>
		boxStrokeWidthDefaultPx = context.getResources().getDimensionPixelSize(android.support.design.R.dimen.mtrl_textinput_box_stroke_width_default);
	//  142  288:aload_0         
	//  143  289:aload_1         
	//  144  290:invokevirtual   #237 <Method Resources Context.getResources()>
	//  145  293:getstatic       #303 <Field int android.support.design.R$dimen.mtrl_textinput_box_stroke_width_default>
	//  146  296:invokevirtual   #306 <Method int Resources.getDimensionPixelSize(int)>
	//  147  299:putfield        #308 <Field int boxStrokeWidthDefaultPx>
		boxStrokeWidthFocusedPx = context.getResources().getDimensionPixelSize(android.support.design.R.dimen.mtrl_textinput_box_stroke_width_focused);
	//  148  302:aload_0         
	//  149  303:aload_1         
	//  150  304:invokevirtual   #237 <Method Resources Context.getResources()>
	//  151  307:getstatic       #311 <Field int android.support.design.R$dimen.mtrl_textinput_box_stroke_width_focused>
	//  152  310:invokevirtual   #306 <Method int Resources.getDimensionPixelSize(int)>
	//  153  313:putfield        #313 <Field int boxStrokeWidthFocusedPx>
		boxStrokeWidthPx = boxStrokeWidthDefaultPx;
	//  154  316:aload_0         
	//  155  317:aload_0         
	//  156  318:getfield        #308 <Field int boxStrokeWidthDefaultPx>
	//  157  321:putfield        #315 <Field int boxStrokeWidthPx>
		setBoxBackgroundMode(((TintTypedArray) (attributeset)).getInt(android.support.design.R.styleable.TextInputLayout_boxBackgroundMode, 0));
	//  158  324:aload_0         
	//  159  325:aload_2         
	//  160  326:getstatic       #318 <Field int android.support.design.R$styleable.TextInputLayout_boxBackgroundMode>
	//  161  329:iconst_0        
	//  162  330:invokevirtual   #321 <Method int TintTypedArray.getInt(int, int)>
	//  163  333:invokevirtual   #324 <Method void setBoxBackgroundMode(int)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.TextInputLayout_android_textColorHint))
	//* 164  336:aload_2         
	//* 165  337:getstatic       #327 <Field int android.support.design.R$styleable.TextInputLayout_android_textColorHint>
	//* 166  340:invokevirtual   #331 <Method boolean TintTypedArray.hasValue(int)>
	//* 167  343:ifeq            367
		{
			ColorStateList colorstatelist = ((TintTypedArray) (attributeset)).getColorStateList(android.support.design.R.styleable.TextInputLayout_android_textColorHint);
	//  168  346:aload_2         
	//  169  347:getstatic       #327 <Field int android.support.design.R$styleable.TextInputLayout_android_textColorHint>
	//  170  350:invokevirtual   #335 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  171  353:astore          8
			focusedTextColor = colorstatelist;
	//  172  355:aload_0         
	//  173  356:aload           8
	//  174  358:putfield        #337 <Field ColorStateList focusedTextColor>
			defaultHintTextColor = colorstatelist;
	//  175  361:aload_0         
	//  176  362:aload           8
	//  177  364:putfield        #339 <Field ColorStateList defaultHintTextColor>
		}
		defaultStrokeColor = ContextCompat.getColor(context, android.support.design.R.color.mtrl_textinput_default_box_stroke_color);
	//  178  367:aload_0         
	//  179  368:aload_1         
	//  180  369:getstatic       #344 <Field int android.support.design.R$color.mtrl_textinput_default_box_stroke_color>
	//  181  372:invokestatic    #349 <Method int ContextCompat.getColor(Context, int)>
	//  182  375:putfield        #351 <Field int defaultStrokeColor>
		disabledColor = ContextCompat.getColor(context, android.support.design.R.color.mtrl_textinput_disabled_color);
	//  183  378:aload_0         
	//  184  379:aload_1         
	//  185  380:getstatic       #354 <Field int android.support.design.R$color.mtrl_textinput_disabled_color>
	//  186  383:invokestatic    #349 <Method int ContextCompat.getColor(Context, int)>
	//  187  386:putfield        #356 <Field int disabledColor>
		hoveredStrokeColor = ContextCompat.getColor(context, android.support.design.R.color.mtrl_textinput_hovered_box_stroke_color);
	//  188  389:aload_0         
	//  189  390:aload_1         
	//  190  391:getstatic       #359 <Field int android.support.design.R$color.mtrl_textinput_hovered_box_stroke_color>
	//  191  394:invokestatic    #349 <Method int ContextCompat.getColor(Context, int)>
	//  192  397:putfield        #361 <Field int hoveredStrokeColor>
		if(((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, -1) != -1)
	//* 193  400:aload_2         
	//* 194  401:getstatic       #364 <Field int android.support.design.R$styleable.TextInputLayout_hintTextAppearance>
	//* 195  404:iconst_m1       
	//* 196  405:invokevirtual   #367 <Method int TintTypedArray.getResourceId(int, int)>
	//* 197  408:iconst_m1       
	//* 198  409:icmpeq          424
			setHintTextAppearance(((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, 0));
	//  199  412:aload_0         
	//  200  413:aload_2         
	//  201  414:getstatic       #364 <Field int android.support.design.R$styleable.TextInputLayout_hintTextAppearance>
	//  202  417:iconst_0        
	//  203  418:invokevirtual   #367 <Method int TintTypedArray.getResourceId(int, int)>
	//  204  421:invokevirtual   #370 <Method void setHintTextAppearance(int)>
		i = ((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TextInputLayout_errorTextAppearance, 0);
	//  205  424:aload_2         
	//  206  425:getstatic       #373 <Field int android.support.design.R$styleable.TextInputLayout_errorTextAppearance>
	//  207  428:iconst_0        
	//  208  429:invokevirtual   #367 <Method int TintTypedArray.getResourceId(int, int)>
	//  209  432:istore_3        
		boolean flag = ((TintTypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.TextInputLayout_errorEnabled, false);
	//  210  433:aload_2         
	//  211  434:getstatic       #376 <Field int android.support.design.R$styleable.TextInputLayout_errorEnabled>
	//  212  437:iconst_0        
	//  213  438:invokevirtual   #213 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  214  441:istore          5
		int j = ((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TextInputLayout_helperTextTextAppearance, 0);
	//  215  443:aload_2         
	//  216  444:getstatic       #379 <Field int android.support.design.R$styleable.TextInputLayout_helperTextTextAppearance>
	//  217  447:iconst_0        
	//  218  448:invokevirtual   #367 <Method int TintTypedArray.getResourceId(int, int)>
	//  219  451:istore          4
		boolean flag1 = ((TintTypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.TextInputLayout_helperTextEnabled, false);
	//  220  453:aload_2         
	//  221  454:getstatic       #382 <Field int android.support.design.R$styleable.TextInputLayout_helperTextEnabled>
	//  222  457:iconst_0        
	//  223  458:invokevirtual   #213 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  224  461:istore          6
		context = ((Context) (((TintTypedArray) (attributeset)).getText(android.support.design.R.styleable.TextInputLayout_helperText)));
	//  225  463:aload_2         
	//  226  464:getstatic       #385 <Field int android.support.design.R$styleable.TextInputLayout_helperText>
	//  227  467:invokevirtual   #222 <Method CharSequence TintTypedArray.getText(int)>
	//  228  470:astore_1        
		boolean flag2 = ((TintTypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.TextInputLayout_counterEnabled, false);
	//  229  471:aload_2         
	//  230  472:getstatic       #388 <Field int android.support.design.R$styleable.TextInputLayout_counterEnabled>
	//  231  475:iconst_0        
	//  232  476:invokevirtual   #213 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  233  479:istore          7
		setCounterMaxLength(((TintTypedArray) (attributeset)).getInt(android.support.design.R.styleable.TextInputLayout_counterMaxLength, -1));
	//  234  481:aload_0         
	//  235  482:aload_2         
	//  236  483:getstatic       #391 <Field int android.support.design.R$styleable.TextInputLayout_counterMaxLength>
	//  237  486:iconst_m1       
	//  238  487:invokevirtual   #321 <Method int TintTypedArray.getInt(int, int)>
	//  239  490:invokevirtual   #394 <Method void setCounterMaxLength(int)>
		counterTextAppearance = ((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TextInputLayout_counterTextAppearance, 0);
	//  240  493:aload_0         
	//  241  494:aload_2         
	//  242  495:getstatic       #397 <Field int android.support.design.R$styleable.TextInputLayout_counterTextAppearance>
	//  243  498:iconst_0        
	//  244  499:invokevirtual   #367 <Method int TintTypedArray.getResourceId(int, int)>
	//  245  502:putfield        #399 <Field int counterTextAppearance>
		counterOverflowTextAppearance = ((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
	//  246  505:aload_0         
	//  247  506:aload_2         
	//  248  507:getstatic       #402 <Field int android.support.design.R$styleable.TextInputLayout_counterOverflowTextAppearance>
	//  249  510:iconst_0        
	//  250  511:invokevirtual   #367 <Method int TintTypedArray.getResourceId(int, int)>
	//  251  514:putfield        #404 <Field int counterOverflowTextAppearance>
		passwordToggleEnabled = ((TintTypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.TextInputLayout_passwordToggleEnabled, false);
	//  252  517:aload_0         
	//  253  518:aload_2         
	//  254  519:getstatic       #407 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleEnabled>
	//  255  522:iconst_0        
	//  256  523:invokevirtual   #213 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  257  526:putfield        #409 <Field boolean passwordToggleEnabled>
		passwordToggleDrawable = ((TintTypedArray) (attributeset)).getDrawable(android.support.design.R.styleable.TextInputLayout_passwordToggleDrawable);
	//  258  529:aload_0         
	//  259  530:aload_2         
	//  260  531:getstatic       #412 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleDrawable>
	//  261  534:invokevirtual   #416 <Method Drawable TintTypedArray.getDrawable(int)>
	//  262  537:putfield        #418 <Field Drawable passwordToggleDrawable>
		passwordToggleContentDesc = ((TintTypedArray) (attributeset)).getText(android.support.design.R.styleable.TextInputLayout_passwordToggleContentDescription);
	//  263  540:aload_0         
	//  264  541:aload_2         
	//  265  542:getstatic       #421 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleContentDescription>
	//  266  545:invokevirtual   #222 <Method CharSequence TintTypedArray.getText(int)>
	//  267  548:putfield        #423 <Field CharSequence passwordToggleContentDesc>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.TextInputLayout_passwordToggleTint))
	//* 268  551:aload_2         
	//* 269  552:getstatic       #426 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTint>
	//* 270  555:invokevirtual   #331 <Method boolean TintTypedArray.hasValue(int)>
	//* 271  558:ifeq            577
		{
			hasPasswordToggleTintList = true;
	//  272  561:aload_0         
	//  273  562:iconst_1        
	//  274  563:putfield        #428 <Field boolean hasPasswordToggleTintList>
			passwordToggleTintList = ((TintTypedArray) (attributeset)).getColorStateList(android.support.design.R.styleable.TextInputLayout_passwordToggleTint);
	//  275  566:aload_0         
	//  276  567:aload_2         
	//  277  568:getstatic       #426 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTint>
	//  278  571:invokevirtual   #335 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  279  574:putfield        #430 <Field ColorStateList passwordToggleTintList>
		}
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.TextInputLayout_passwordToggleTintMode))
	//* 280  577:aload_2         
	//* 281  578:getstatic       #433 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTintMode>
	//* 282  581:invokevirtual   #331 <Method boolean TintTypedArray.hasValue(int)>
	//* 283  584:ifeq            608
		{
			hasPasswordToggleTintMode = true;
	//  284  587:aload_0         
	//  285  588:iconst_1        
	//  286  589:putfield        #435 <Field boolean hasPasswordToggleTintMode>
			passwordToggleTintMode = ViewUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.design.R.styleable.TextInputLayout_passwordToggleTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//  287  592:aload_0         
	//  288  593:aload_2         
	//  289  594:getstatic       #433 <Field int android.support.design.R$styleable.TextInputLayout_passwordToggleTintMode>
	//  290  597:iconst_m1       
	//  291  598:invokevirtual   #321 <Method int TintTypedArray.getInt(int, int)>
	//  292  601:aconst_null     
	//  293  602:invokestatic    #441 <Method android.graphics.PorterDuff$Mode ViewUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  294  605:putfield        #443 <Field android.graphics.PorterDuff$Mode passwordToggleTintMode>
		}
		((TintTypedArray) (attributeset)).recycle();
	//  295  608:aload_2         
	//  296  609:invokevirtual   #446 <Method void TintTypedArray.recycle()>
		setHelperTextEnabled(flag1);
	//  297  612:aload_0         
	//  298  613:iload           6
	//  299  615:invokevirtual   #449 <Method void setHelperTextEnabled(boolean)>
		setHelperText(((CharSequence) (context)));
	//  300  618:aload_0         
	//  301  619:aload_1         
	//  302  620:invokevirtual   #452 <Method void setHelperText(CharSequence)>
		setHelperTextTextAppearance(j);
	//  303  623:aload_0         
	//  304  624:iload           4
	//  305  626:invokevirtual   #455 <Method void setHelperTextTextAppearance(int)>
		setErrorEnabled(flag);
	//  306  629:aload_0         
	//  307  630:iload           5
	//  308  632:invokevirtual   #458 <Method void setErrorEnabled(boolean)>
		setErrorTextAppearance(i);
	//  309  635:aload_0         
	//  310  636:iload_3         
	//  311  637:invokevirtual   #461 <Method void setErrorTextAppearance(int)>
		setCounterEnabled(flag2);
	//  312  640:aload_0         
	//  313  641:iload           7
	//  314  643:invokevirtual   #464 <Method void setCounterEnabled(boolean)>
		applyPasswordToggleTint();
	//  315  646:aload_0         
	//  316  647:invokespecial   #467 <Method void applyPasswordToggleTint()>
		ViewCompat.setImportantForAccessibility(((View) (this)), 2);
	//  317  650:aload_0         
	//  318  651:iconst_2        
	//  319  652:invokestatic    #473 <Method void ViewCompat.setImportantForAccessibility(View, int)>
	//  320  655:return          
	}

	private void applyBoxAttributes()
	{
		if(boxBackground == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #480 <Field GradientDrawable boxBackground>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		setBoxAttributes();
	//    4    8:aload_0         
	//    5    9:invokespecial   #483 <Method void setBoxAttributes()>
		EditText edittext = editText;
	//    6   12:aload_0         
	//    7   13:getfield        #485 <Field EditText editText>
	//    8   16:astore_3        
		if(edittext != null && boxBackgroundMode == 2)
	//*   9   17:aload_3         
	//*  10   18:ifnull          55
	//*  11   21:aload_0         
	//*  12   22:getfield        #487 <Field int boxBackgroundMode>
	//*  13   25:iconst_2        
	//*  14   26:icmpne          55
		{
			if(edittext.getBackground() != null)
	//*  15   29:aload_3         
	//*  16   30:invokevirtual   #493 <Method Drawable EditText.getBackground()>
	//*  17   33:ifnull          47
				editTextOriginalDrawable = editText.getBackground();
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #485 <Field EditText editText>
	//   21   41:invokevirtual   #493 <Method Drawable EditText.getBackground()>
	//   22   44:putfield        #495 <Field Drawable editTextOriginalDrawable>
			ViewCompat.setBackground(((View) (editText)), ((Drawable) (null)));
	//   23   47:aload_0         
	//   24   48:getfield        #485 <Field EditText editText>
	//   25   51:aconst_null     
	//   26   52:invokestatic    #499 <Method void ViewCompat.setBackground(View, Drawable)>
		}
		edittext = editText;
	//   27   55:aload_0         
	//   28   56:getfield        #485 <Field EditText editText>
	//   29   59:astore_3        
		if(edittext != null && boxBackgroundMode == 1)
	//*  30   60:aload_3         
	//*  31   61:ifnull          89
	//*  32   64:aload_0         
	//*  33   65:getfield        #487 <Field int boxBackgroundMode>
	//*  34   68:iconst_1        
	//*  35   69:icmpne          89
		{
			Drawable drawable = editTextOriginalDrawable;
	//   36   72:aload_0         
	//   37   73:getfield        #495 <Field Drawable editTextOriginalDrawable>
	//   38   76:astore          4
			if(drawable != null)
	//*  39   78:aload           4
	//*  40   80:ifnull          89
				ViewCompat.setBackground(((View) (edittext)), drawable);
	//   41   83:aload_3         
	//   42   84:aload           4
	//   43   86:invokestatic    #499 <Method void ViewCompat.setBackground(View, Drawable)>
		}
		int i = boxStrokeWidthPx;
	//   44   89:aload_0         
	//   45   90:getfield        #315 <Field int boxStrokeWidthPx>
	//   46   93:istore_1        
		if(i > -1)
	//*  47   94:iload_1         
	//*  48   95:iconst_m1       
	//*  49   96:icmple          117
		{
			int j = boxStrokeColor;
	//   50   99:aload_0         
	//   51  100:getfield        #501 <Field int boxStrokeColor>
	//   52  103:istore_2        
			if(j != 0)
	//*  53  104:iload_2         
	//*  54  105:ifeq            117
				boxBackground.setStroke(i, j);
	//   55  108:aload_0         
	//   56  109:getfield        #480 <Field GradientDrawable boxBackground>
	//   57  112:iload_1         
	//   58  113:iload_2         
	//   59  114:invokevirtual   #507 <Method void GradientDrawable.setStroke(int, int)>
		}
		boxBackground.setCornerRadii(getCornerRadiiAsArray());
	//   60  117:aload_0         
	//   61  118:getfield        #480 <Field GradientDrawable boxBackground>
	//   62  121:aload_0         
	//   63  122:invokespecial   #511 <Method float[] getCornerRadiiAsArray()>
	//   64  125:invokevirtual   #515 <Method void GradientDrawable.setCornerRadii(float[])>
		boxBackground.setColor(boxBackgroundColor);
	//   65  128:aload_0         
	//   66  129:getfield        #480 <Field GradientDrawable boxBackground>
	//   67  132:aload_0         
	//   68  133:getfield        #295 <Field int boxBackgroundColor>
	//   69  136:invokevirtual   #518 <Method void GradientDrawable.setColor(int)>
		invalidate();
	//   70  139:aload_0         
	//   71  140:invokevirtual   #521 <Method void invalidate()>
	//   72  143:return          
	}

	private void applyCutoutPadding(RectF rectf)
	{
		rectf.left = rectf.left - (float)boxLabelCutoutPaddingPx;
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:getfield        #526 <Field float RectF.left>
	//    3    5:aload_0         
	//    4    6:getfield        #255 <Field int boxLabelCutoutPaddingPx>
	//    5    9:i2f             
	//    6   10:fsub            
	//    7   11:putfield        #526 <Field float RectF.left>
		rectf.top = rectf.top - (float)boxLabelCutoutPaddingPx;
	//    8   14:aload_1         
	//    9   15:aload_1         
	//   10   16:getfield        #529 <Field float RectF.top>
	//   11   19:aload_0         
	//   12   20:getfield        #255 <Field int boxLabelCutoutPaddingPx>
	//   13   23:i2f             
	//   14   24:fsub            
	//   15   25:putfield        #529 <Field float RectF.top>
		rectf.right = rectf.right + (float)boxLabelCutoutPaddingPx;
	//   16   28:aload_1         
	//   17   29:aload_1         
	//   18   30:getfield        #532 <Field float RectF.right>
	//   19   33:aload_0         
	//   20   34:getfield        #255 <Field int boxLabelCutoutPaddingPx>
	//   21   37:i2f             
	//   22   38:fadd            
	//   23   39:putfield        #532 <Field float RectF.right>
		rectf.bottom = rectf.bottom + (float)boxLabelCutoutPaddingPx;
	//   24   42:aload_1         
	//   25   43:aload_1         
	//   26   44:getfield        #535 <Field float RectF.bottom>
	//   27   47:aload_0         
	//   28   48:getfield        #255 <Field int boxLabelCutoutPaddingPx>
	//   29   51:i2f             
	//   30   52:fadd            
	//   31   53:putfield        #535 <Field float RectF.bottom>
	//   32   56:return          
	}

	private void applyPasswordToggleTint()
	{
		if(passwordToggleDrawable != null && (hasPasswordToggleTintList || hasPasswordToggleTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #418 <Field Drawable passwordToggleDrawable>
	//*   2    4:ifnull          103
	//*   3    7:aload_0         
	//*   4    8:getfield        #428 <Field boolean hasPasswordToggleTintList>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #435 <Field boolean hasPasswordToggleTintMode>
	//*   8   18:ifeq            103
		{
			passwordToggleDrawable = DrawableCompat.wrap(passwordToggleDrawable).mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #418 <Field Drawable passwordToggleDrawable>
	//   12   26:invokestatic    #541 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   13   29:invokevirtual   #546 <Method Drawable Drawable.mutate()>
	//   14   32:putfield        #418 <Field Drawable passwordToggleDrawable>
			if(hasPasswordToggleTintList)
	//*  15   35:aload_0         
	//*  16   36:getfield        #428 <Field boolean hasPasswordToggleTintList>
	//*  17   39:ifeq            53
				DrawableCompat.setTintList(passwordToggleDrawable, passwordToggleTintList);
	//   18   42:aload_0         
	//   19   43:getfield        #418 <Field Drawable passwordToggleDrawable>
	//   20   46:aload_0         
	//   21   47:getfield        #430 <Field ColorStateList passwordToggleTintList>
	//   22   50:invokestatic    #550 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(hasPasswordToggleTintMode)
	//*  23   53:aload_0         
	//*  24   54:getfield        #435 <Field boolean hasPasswordToggleTintMode>
	//*  25   57:ifeq            71
				DrawableCompat.setTintMode(passwordToggleDrawable, passwordToggleTintMode);
	//   26   60:aload_0         
	//   27   61:getfield        #418 <Field Drawable passwordToggleDrawable>
	//   28   64:aload_0         
	//   29   65:getfield        #443 <Field android.graphics.PorterDuff$Mode passwordToggleTintMode>
	//   30   68:invokestatic    #554 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			Object obj = ((Object) (passwordToggleView));
	//   31   71:aload_0         
	//   32   72:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   33   75:astore_1        
			if(obj != null)
	//*  34   76:aload_1         
	//*  35   77:ifnull          103
			{
				obj = ((Object) (((CheckableImageButton) (obj)).getDrawable()));
	//   36   80:aload_1         
	//   37   81:invokevirtual   #560 <Method Drawable CheckableImageButton.getDrawable()>
	//   38   84:astore_1        
				Drawable drawable = passwordToggleDrawable;
	//   39   85:aload_0         
	//   40   86:getfield        #418 <Field Drawable passwordToggleDrawable>
	//   41   89:astore_2        
				if(obj != drawable)
	//*  42   90:aload_1         
	//*  43   91:aload_2         
	//*  44   92:if_acmpeq       103
					passwordToggleView.setImageDrawable(drawable);
	//   45   95:aload_0         
	//   46   96:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   47   99:aload_2         
	//   48  100:invokevirtual   #564 <Method void CheckableImageButton.setImageDrawable(Drawable)>
			}
		}
	//   49  103:return          
	}

	private void assignBoxBackgroundByMode()
	{
		int i = boxBackgroundMode;
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field int boxBackgroundMode>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            15
		{
			boxBackground = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #480 <Field GradientDrawable boxBackground>
			return;
	//    8   14:return          
		}
		if(i == 2 && hintEnabled && !(boxBackground instanceof CutoutDrawable))
	//*   9   15:iload_1         
	//*  10   16:iconst_2        
	//*  11   17:icmpne          49
	//*  12   20:aload_0         
	//*  13   21:getfield        #215 <Field boolean hintEnabled>
	//*  14   24:ifeq            49
	//*  15   27:aload_0         
	//*  16   28:getfield        #480 <Field GradientDrawable boxBackground>
	//*  17   31:instanceof      #567 <Class CutoutDrawable>
	//*  18   34:ifne            49
		{
			boxBackground = ((GradientDrawable) (new CutoutDrawable()));
	//   19   37:aload_0         
	//   20   38:new             #567 <Class CutoutDrawable>
	//   21   41:dup             
	//   22   42:invokespecial   #568 <Method void CutoutDrawable()>
	//   23   45:putfield        #480 <Field GradientDrawable boxBackground>
			return;
	//   24   48:return          
		}
		if(!(boxBackground instanceof GradientDrawable))
	//*  25   49:aload_0         
	//*  26   50:getfield        #480 <Field GradientDrawable boxBackground>
	//*  27   53:instanceof      #503 <Class GradientDrawable>
	//*  28   56:ifne            70
			boxBackground = new GradientDrawable();
	//   29   59:aload_0         
	//   30   60:new             #503 <Class GradientDrawable>
	//   31   63:dup             
	//   32   64:invokespecial   #569 <Method void GradientDrawable()>
	//   33   67:putfield        #480 <Field GradientDrawable boxBackground>
	//   34   70:return          
	}

	private int calculateBoxBackgroundTop()
	{
		EditText edittext = editText;
	//    0    0:aload_0         
	//    1    1:getfield        #485 <Field EditText editText>
	//    2    4:astore_1        
		if(edittext == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		switch(boxBackgroundMode)
	//*   7   11:aload_0         
	//*   8   12:getfield        #487 <Field int boxBackgroundMode>
		{
	//*   9   15:tableswitch     1 2: default 36
	//	               1 48
	//	               2 38
		default:
			return 0;
	//   10   36:iconst_0        
	//   11   37:ireturn         

		case 2: // '\002'
			return edittext.getTop() + calculateLabelMarginTop();
	//   12   38:aload_1         
	//   13   39:invokevirtual   #574 <Method int EditText.getTop()>
	//   14   42:aload_0         
	//   15   43:invokespecial   #577 <Method int calculateLabelMarginTop()>
	//   16   46:iadd            
	//   17   47:ireturn         

		case 1: // '\001'
			return edittext.getTop();
	//   18   48:aload_1         
	//   19   49:invokevirtual   #574 <Method int EditText.getTop()>
	//   20   52:ireturn         
		}
	}

	private int calculateCollapsedTextTopBounds()
	{
		switch(boxBackgroundMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #487 <Field int boxBackgroundMode>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 49
	//	               2 33
		default:
			return getPaddingTop();
	//    3   28:aload_0         
	//    4   29:invokevirtual   #581 <Method int getPaddingTop()>
	//    5   32:ireturn         

		case 2: // '\002'
			return getBoxBackground().getBounds().top - calculateLabelMarginTop();
	//    6   33:aload_0         
	//    7   34:invokespecial   #584 <Method Drawable getBoxBackground()>
	//    8   37:invokevirtual   #588 <Method Rect Drawable.getBounds()>
	//    9   40:getfield        #590 <Field int Rect.top>
	//   10   43:aload_0         
	//   11   44:invokespecial   #577 <Method int calculateLabelMarginTop()>
	//   12   47:isub            
	//   13   48:ireturn         

		case 1: // '\001'
			return getBoxBackground().getBounds().top + boxCollapsedPaddingTopPx;
	//   14   49:aload_0         
	//   15   50:invokespecial   #584 <Method Drawable getBoxBackground()>
	//   16   53:invokevirtual   #588 <Method Rect Drawable.getBounds()>
	//   17   56:getfield        #590 <Field int Rect.top>
	//   18   59:aload_0         
	//   19   60:getfield        #263 <Field int boxCollapsedPaddingTopPx>
	//   20   63:iadd            
	//   21   64:ireturn         
		}
	}

	private int calculateLabelMarginTop()
	{
		if(!hintEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field boolean hintEnabled>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		switch(boxBackgroundMode)
	//*   5    9:aload_0         
	//*   6   10:getfield        #487 <Field int boxBackgroundMode>
		{
	//*   7   13:tableswitch     0 2: default 40
	//	               0 53
	//	               1 53
	//	               2 42
		default:
			return 0;
	//    8   40:iconst_0        
	//    9   41:ireturn         

		case 2: // '\002'
			return (int)(collapsingTextHelper.getCollapsedTextHeight() / 2.0F);
	//   10   42:aload_0         
	//   11   43:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   12   46:invokevirtual   #594 <Method float CollapsingTextHelper.getCollapsedTextHeight()>
	//   13   49:fconst_2        
	//   14   50:fdiv            
	//   15   51:f2i             
	//   16   52:ireturn         

		case 0: // '\0'
		case 1: // '\001'
			return (int)collapsingTextHelper.getCollapsedTextHeight();
	//   17   53:aload_0         
	//   18   54:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   19   57:invokevirtual   #594 <Method float CollapsingTextHelper.getCollapsedTextHeight()>
	//   20   60:f2i             
	//   21   61:ireturn         
		}
	}

	private void closeCutout()
	{
		if(cutoutEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #599 <Method boolean cutoutEnabled()>
	//*   2    4:ifeq            17
			((CutoutDrawable)boxBackground).removeCutout();
	//    3    7:aload_0         
	//    4    8:getfield        #480 <Field GradientDrawable boxBackground>
	//    5   11:checkcast       #567 <Class CutoutDrawable>
	//    6   14:invokevirtual   #602 <Method void CutoutDrawable.removeCutout()>
	//    7   17:return          
	}

	private void collapseHint(boolean flag)
	{
		ValueAnimator valueanimator = animator;
	//    0    0:aload_0         
	//    1    1:getfield        #605 <Field ValueAnimator animator>
	//    2    4:astore_2        
		if(valueanimator != null && valueanimator.isRunning())
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #610 <Method boolean ValueAnimator.isRunning()>
	//*   7   13:ifeq            23
			animator.cancel();
	//    8   16:aload_0         
	//    9   17:getfield        #605 <Field ValueAnimator animator>
	//   10   20:invokevirtual   #613 <Method void ValueAnimator.cancel()>
		if(flag && hintAnimationEnabled)
	//*  11   23:iload_1         
	//*  12   24:ifeq            42
	//*  13   27:aload_0         
	//*  14   28:getfield        #231 <Field boolean hintAnimationEnabled>
	//*  15   31:ifeq            42
			animateToExpansionFraction(1.0F);
	//   16   34:aload_0         
	//   17   35:fconst_1        
	//   18   36:invokevirtual   #617 <Method void animateToExpansionFraction(float)>
		else
	//*  19   39:goto            50
			collapsingTextHelper.setExpansionFraction(1.0F);
	//   20   42:aload_0         
	//   21   43:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   22   46:fconst_1        
	//   23   47:invokevirtual   #620 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		hintExpanded = false;
	//   24   50:aload_0         
	//   25   51:iconst_0        
	//   26   52:putfield        #622 <Field boolean hintExpanded>
		if(cutoutEnabled())
	//*  27   55:aload_0         
	//*  28   56:invokespecial   #599 <Method boolean cutoutEnabled()>
	//*  29   59:ifeq            66
			openCutout();
	//   30   62:aload_0         
	//   31   63:invokespecial   #625 <Method void openCutout()>
	//   32   66:return          
	}

	private boolean cutoutEnabled()
	{
		return hintEnabled && !TextUtils.isEmpty(hint) && (boxBackground instanceof CutoutDrawable);
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field boolean hintEnabled>
	//    2    4:ifeq            29
	//    3    7:aload_0         
	//    4    8:getfield        #627 <Field CharSequence hint>
	//    5   11:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    6   14:ifne            29
	//    7   17:aload_0         
	//    8   18:getfield        #480 <Field GradientDrawable boxBackground>
	//    9   21:instanceof      #567 <Class CutoutDrawable>
	//   10   24:ifeq            29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	private void ensureBackgroundDrawableStateWorkaround()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #639 <Field int android.os.Build$VERSION.SDK_INT>
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
		Drawable drawable = editText.getBackground();
	//    9   17:aload_0         
	//   10   18:getfield        #485 <Field EditText editText>
	//   11   21:invokevirtual   #493 <Method Drawable EditText.getBackground()>
	//   12   24:astore_2        
		if(drawable == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       30
			return;
	//   15   29:return          
		if(!hasReconstructedEditTextBackground)
	//*  16   30:aload_0         
	//*  17   31:getfield        #641 <Field boolean hasReconstructedEditTextBackground>
	//*  18   34:ifne            91
		{
			Drawable drawable1 = drawable.getConstantState().newDrawable();
	//   19   37:aload_2         
	//   20   38:invokevirtual   #645 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   21   41:invokevirtual   #650 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   22   44:astore_3        
			if(drawable instanceof DrawableContainer)
	//*  23   45:aload_2         
	//*  24   46:instanceof      #652 <Class DrawableContainer>
	//*  25   49:ifeq            67
				hasReconstructedEditTextBackground = DrawableUtils.setContainerConstantState((DrawableContainer)drawable, drawable1.getConstantState());
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:checkcast       #652 <Class DrawableContainer>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #645 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   31   61:invokestatic    #658 <Method boolean DrawableUtils.setContainerConstantState(DrawableContainer, android.graphics.drawable.Drawable$ConstantState)>
	//   32   64:putfield        #641 <Field boolean hasReconstructedEditTextBackground>
			if(!hasReconstructedEditTextBackground)
	//*  33   67:aload_0         
	//*  34   68:getfield        #641 <Field boolean hasReconstructedEditTextBackground>
	//*  35   71:ifne            91
			{
				ViewCompat.setBackground(((View) (editText)), drawable1);
	//   36   74:aload_0         
	//   37   75:getfield        #485 <Field EditText editText>
	//   38   78:aload_3         
	//   39   79:invokestatic    #499 <Method void ViewCompat.setBackground(View, Drawable)>
				hasReconstructedEditTextBackground = true;
	//   40   82:aload_0         
	//   41   83:iconst_1        
	//   42   84:putfield        #641 <Field boolean hasReconstructedEditTextBackground>
				onApplyBoxBackgroundMode();
	//   43   87:aload_0         
	//   44   88:invokespecial   #661 <Method void onApplyBoxBackgroundMode()>
			}
		}
	//   45   91:return          
	}

	private void expandHint(boolean flag)
	{
		ValueAnimator valueanimator = animator;
	//    0    0:aload_0         
	//    1    1:getfield        #605 <Field ValueAnimator animator>
	//    2    4:astore_2        
		if(valueanimator != null && valueanimator.isRunning())
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #610 <Method boolean ValueAnimator.isRunning()>
	//*   7   13:ifeq            23
			animator.cancel();
	//    8   16:aload_0         
	//    9   17:getfield        #605 <Field ValueAnimator animator>
	//   10   20:invokevirtual   #613 <Method void ValueAnimator.cancel()>
		if(flag && hintAnimationEnabled)
	//*  11   23:iload_1         
	//*  12   24:ifeq            42
	//*  13   27:aload_0         
	//*  14   28:getfield        #231 <Field boolean hintAnimationEnabled>
	//*  15   31:ifeq            42
			animateToExpansionFraction(0.0F);
	//   16   34:aload_0         
	//   17   35:fconst_0        
	//   18   36:invokevirtual   #617 <Method void animateToExpansionFraction(float)>
		else
	//*  19   39:goto            50
			collapsingTextHelper.setExpansionFraction(0.0F);
	//   20   42:aload_0         
	//   21   43:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   22   46:fconst_0        
	//   23   47:invokevirtual   #620 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		if(cutoutEnabled() && ((CutoutDrawable)boxBackground).hasCutout())
	//*  24   50:aload_0         
	//*  25   51:invokespecial   #599 <Method boolean cutoutEnabled()>
	//*  26   54:ifeq            74
	//*  27   57:aload_0         
	//*  28   58:getfield        #480 <Field GradientDrawable boxBackground>
	//*  29   61:checkcast       #567 <Class CutoutDrawable>
	//*  30   64:invokevirtual   #665 <Method boolean CutoutDrawable.hasCutout()>
	//*  31   67:ifeq            74
			closeCutout();
	//   32   70:aload_0         
	//   33   71:invokespecial   #667 <Method void closeCutout()>
		hintExpanded = true;
	//   34   74:aload_0         
	//   35   75:iconst_1        
	//   36   76:putfield        #622 <Field boolean hintExpanded>
	//   37   79:return          
	}

	private Drawable getBoxBackground()
	{
		int i = boxBackgroundMode;
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field int boxBackgroundMode>
	//    2    4:istore_1        
		if(i != 1 && i != 2)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          26
	//*   6   10:iload_1         
	//*   7   11:iconst_2        
	//*   8   12:icmpne          18
	//*   9   15:goto            26
			throw new IllegalStateException();
	//   10   18:new             #670 <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:invokespecial   #671 <Method void IllegalStateException()>
	//   13   25:athrow          
		else
			return ((Drawable) (boxBackground));
	//   14   26:aload_0         
	//   15   27:getfield        #480 <Field GradientDrawable boxBackground>
	//   16   30:areturn         
	}

	private float[] getCornerRadiiAsArray()
	{
		if(!ViewUtils.isLayoutRtl(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #676 <Method boolean ViewUtils.isLayoutRtl(View)>
	//*   2    4:ifne            69
		{
			float f = boxCornerRadiusTopStart;
	//    3    7:aload_0         
	//    4    8:getfield        #272 <Field float boxCornerRadiusTopStart>
	//    5   11:fstore_1        
			float f2 = boxCornerRadiusTopEnd;
	//    6   12:aload_0         
	//    7   13:getfield        #277 <Field float boxCornerRadiusTopEnd>
	//    8   16:fstore_2        
			float f4 = boxCornerRadiusBottomEnd;
	//    9   17:aload_0         
	//   10   18:getfield        #282 <Field float boxCornerRadiusBottomEnd>
	//   11   21:fstore_3        
			float f6 = boxCornerRadiusBottomStart;
	//   12   22:aload_0         
	//   13   23:getfield        #287 <Field float boxCornerRadiusBottomStart>
	//   14   26:fstore          4
			return (new float[] {
				f, f, f2, f2, f4, f4, f6, f6
			});
	//   15   28:bipush          8
	//   16   30:newarray        float[]
	//   17   32:dup             
	//   18   33:iconst_0        
	//   19   34:fload_1         
	//   20   35:fastore         
	//   21   36:dup             
	//   22   37:iconst_1        
	//   23   38:fload_1         
	//   24   39:fastore         
	//   25   40:dup             
	//   26   41:iconst_2        
	//   27   42:fload_2         
	//   28   43:fastore         
	//   29   44:dup             
	//   30   45:iconst_3        
	//   31   46:fload_2         
	//   32   47:fastore         
	//   33   48:dup             
	//   34   49:iconst_4        
	//   35   50:fload_3         
	//   36   51:fastore         
	//   37   52:dup             
	//   38   53:iconst_5        
	//   39   54:fload_3         
	//   40   55:fastore         
	//   41   56:dup             
	//   42   57:bipush          6
	//   43   59:fload           4
	//   44   61:fastore         
	//   45   62:dup             
	//   46   63:bipush          7
	//   47   65:fload           4
	//   48   67:fastore         
	//   49   68:areturn         
		} else
		{
			float f1 = boxCornerRadiusTopEnd;
	//   50   69:aload_0         
	//   51   70:getfield        #277 <Field float boxCornerRadiusTopEnd>
	//   52   73:fstore_1        
			float f3 = boxCornerRadiusTopStart;
	//   53   74:aload_0         
	//   54   75:getfield        #272 <Field float boxCornerRadiusTopStart>
	//   55   78:fstore_2        
			float f5 = boxCornerRadiusBottomStart;
	//   56   79:aload_0         
	//   57   80:getfield        #287 <Field float boxCornerRadiusBottomStart>
	//   58   83:fstore_3        
			float f7 = boxCornerRadiusBottomEnd;
	//   59   84:aload_0         
	//   60   85:getfield        #282 <Field float boxCornerRadiusBottomEnd>
	//   61   88:fstore          4
			return (new float[] {
				f1, f1, f3, f3, f5, f5, f7, f7
			});
	//   62   90:bipush          8
	//   63   92:newarray        float[]
	//   64   94:dup             
	//   65   95:iconst_0        
	//   66   96:fload_1         
	//   67   97:fastore         
	//   68   98:dup             
	//   69   99:iconst_1        
	//   70  100:fload_1         
	//   71  101:fastore         
	//   72  102:dup             
	//   73  103:iconst_2        
	//   74  104:fload_2         
	//   75  105:fastore         
	//   76  106:dup             
	//   77  107:iconst_3        
	//   78  108:fload_2         
	//   79  109:fastore         
	//   80  110:dup             
	//   81  111:iconst_4        
	//   82  112:fload_3         
	//   83  113:fastore         
	//   84  114:dup             
	//   85  115:iconst_5        
	//   86  116:fload_3         
	//   87  117:fastore         
	//   88  118:dup             
	//   89  119:bipush          6
	//   90  121:fload           4
	//   91  123:fastore         
	//   92  124:dup             
	//   93  125:bipush          7
	//   94  127:fload           4
	//   95  129:fastore         
	//   96  130:areturn         
		}
	}

	private boolean hasPasswordTransformation()
	{
		EditText edittext = editText;
	//    0    0:aload_0         
	//    1    1:getfield        #485 <Field EditText editText>
	//    2    4:astore_1        
		return edittext != null && (edittext.getTransformationMethod() instanceof PasswordTransformationMethod);
	//    3    5:aload_1         
	//    4    6:ifnull          21
	//    5    9:aload_1         
	//    6   10:invokevirtual   #681 <Method android.text.method.TransformationMethod EditText.getTransformationMethod()>
	//    7   13:instanceof      #683 <Class PasswordTransformationMethod>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private void onApplyBoxBackgroundMode()
	{
		assignBoxBackgroundByMode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #685 <Method void assignBoxBackgroundByMode()>
		if(boxBackgroundMode != 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #487 <Field int boxBackgroundMode>
	//*   4    8:ifeq            15
			updateInputLayoutMargins();
	//    5   11:aload_0         
	//    6   12:invokespecial   #688 <Method void updateInputLayoutMargins()>
		updateTextInputBoxBounds();
	//    7   15:aload_0         
	//    8   16:invokespecial   #691 <Method void updateTextInputBoxBounds()>
	//    9   19:return          
	}

	private void openCutout()
	{
		if(!cutoutEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #599 <Method boolean cutoutEnabled()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			RectF rectf = tmpRectF;
	//    4    8:aload_0         
	//    5    9:getfield        #143 <Field RectF tmpRectF>
	//    6   12:astore_1        
			collapsingTextHelper.getCollapsedTextActualBounds(rectf);
	//    7   13:aload_0         
	//    8   14:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #694 <Method void CollapsingTextHelper.getCollapsedTextActualBounds(RectF)>
			applyCutoutPadding(rectf);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #696 <Method void applyCutoutPadding(RectF)>
			((CutoutDrawable)boxBackground).setCutout(rectf);
	//   14   26:aload_0         
	//   15   27:getfield        #480 <Field GradientDrawable boxBackground>
	//   16   30:checkcast       #567 <Class CutoutDrawable>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #699 <Method void CutoutDrawable.setCutout(RectF)>
			return;
	//   19   37:return          
		}
	}

	private static void recursiveSetEnabled(ViewGroup viewgroup, boolean flag)
	{
		int j = viewgroup.getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #706 <Method int ViewGroup.getChildCount()>
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
	//   10   14:invokevirtual   #710 <Method View ViewGroup.getChildAt(int)>
	//   11   17:astore          4
			view.setEnabled(flag);
	//   12   19:aload           4
	//   13   21:iload_1         
	//   14   22:invokevirtual   #715 <Method void View.setEnabled(boolean)>
			if(view instanceof ViewGroup)
	//*  15   25:aload           4
	//*  16   27:instanceof      #703 <Class ViewGroup>
	//*  17   30:ifeq            42
				recursiveSetEnabled((ViewGroup)view, flag);
	//   18   33:aload           4
	//   19   35:checkcast       #703 <Class ViewGroup>
	//   20   38:iload_1         
	//   21   39:invokestatic    #717 <Method void recursiveSetEnabled(ViewGroup, boolean)>
		}

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            7
	//   27   49:return          
	}

	private void setBoxAttributes()
	{
		switch(boxBackgroundMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #487 <Field int boxBackgroundMode>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 59
	//	               2 29
		default:
			return;
	//    3   28:return          

		case 2: // '\002'
			if(focusedStrokeColor == 0)
	//*   4   29:aload_0         
	//*   5   30:getfield        #300 <Field int focusedStrokeColor>
	//*   6   33:ifne            64
			{
				focusedStrokeColor = focusedTextColor.getColorForState(getDrawableState(), focusedTextColor.getDefaultColor());
	//    7   36:aload_0         
	//    8   37:aload_0         
	//    9   38:getfield        #337 <Field ColorStateList focusedTextColor>
	//   10   41:aload_0         
	//   11   42:invokevirtual   #721 <Method int[] getDrawableState()>
	//   12   45:aload_0         
	//   13   46:getfield        #337 <Field ColorStateList focusedTextColor>
	//   14   49:invokevirtual   #726 <Method int ColorStateList.getDefaultColor()>
	//   15   52:invokevirtual   #730 <Method int ColorStateList.getColorForState(int[], int)>
	//   16   55:putfield        #300 <Field int focusedStrokeColor>
				return;
	//   17   58:return          
			}
			break;

		case 1: // '\001'
			boxStrokeWidthPx = 0;
	//   18   59:aload_0         
	//   19   60:iconst_0        
	//   20   61:putfield        #315 <Field int boxStrokeWidthPx>
			break;
		}
	//   21   64:return          
	}

	private void setEditText(EditText edittext)
	{
		if(editText == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #485 <Field EditText editText>
	//*   2    4:ifnonnull       232
		{
			if(!(edittext instanceof TextInputEditText))
	//*   3    7:aload_1         
	//*   4    8:instanceof      #734 <Class TextInputEditText>
	//*   5   11:ifne            23
				Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
	//    6   14:ldc1            #36  <String "TextInputLayout">
	//    7   16:ldc2            #736 <String "EditText added is not a TextInputEditText. Please switch to using that class instead.">
	//    8   19:invokestatic    #742 <Method int Log.i(String, String)>
	//    9   22:pop             
			editText = edittext;
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:putfield        #485 <Field EditText editText>
			onApplyBoxBackgroundMode();
	//   13   28:aload_0         
	//   14   29:invokespecial   #661 <Method void onApplyBoxBackgroundMode()>
			setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
	//   15   32:aload_0         
	//   16   33:new             #12  <Class TextInputLayout$AccessibilityDelegate>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:invokespecial   #743 <Method void TextInputLayout$AccessibilityDelegate(TextInputLayout)>
	//   20   41:invokevirtual   #747 <Method void setTextInputAccessibilityDelegate(TextInputLayout$AccessibilityDelegate)>
			if(!hasPasswordTransformation())
	//*  21   44:aload_0         
	//*  22   45:invokespecial   #749 <Method boolean hasPasswordTransformation()>
	//*  23   48:ifne            65
				collapsingTextHelper.setTypefaces(editText.getTypeface());
	//   24   51:aload_0         
	//   25   52:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   26   55:aload_0         
	//   27   56:getfield        #485 <Field EditText editText>
	//   28   59:invokevirtual   #753 <Method Typeface EditText.getTypeface()>
	//   29   62:invokevirtual   #757 <Method void CollapsingTextHelper.setTypefaces(Typeface)>
			collapsingTextHelper.setExpandedTextSize(editText.getTextSize());
	//   30   65:aload_0         
	//   31   66:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   32   69:aload_0         
	//   33   70:getfield        #485 <Field EditText editText>
	//   34   73:invokevirtual   #760 <Method float EditText.getTextSize()>
	//   35   76:invokevirtual   #763 <Method void CollapsingTextHelper.setExpandedTextSize(float)>
			int i = editText.getGravity();
	//   36   79:aload_0         
	//   37   80:getfield        #485 <Field EditText editText>
	//   38   83:invokevirtual   #766 <Method int EditText.getGravity()>
	//   39   86:istore_2        
			collapsingTextHelper.setCollapsedTextGravity(i & 0xffffff8f | 0x30);
	//   40   87:aload_0         
	//   41   88:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   42   91:iload_2         
	//   43   92:bipush          -113
	//   44   94:iand            
	//   45   95:bipush          48
	//   46   97:ior             
	//   47   98:invokevirtual   #188 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
			collapsingTextHelper.setExpandedTextGravity(i);
	//   48  101:aload_0         
	//   49  102:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   50  105:iload_2         
	//   51  106:invokevirtual   #769 <Method void CollapsingTextHelper.setExpandedTextGravity(int)>
			editText.addTextChangedListener(new TextWatcher() {

				public void afterTextChanged(Editable editable)
				{
					TextInputLayout textinputlayout = TextInputLayout.this;
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field TextInputLayout this$0>
				//    2    4:astore_2        
					textinputlayout.updateLabelState(textinputlayout.restoringSavedState ^ true);
				//    3    5:aload_2         
				//    4    6:aload_2         
				//    5    7:invokestatic    #27  <Method boolean TextInputLayout.access$000(TextInputLayout)>
				//    6   10:iconst_1        
				//    7   11:ixor            
				//    8   12:invokevirtual   #31  <Method void TextInputLayout.updateLabelState(boolean)>
					if(counterEnabled)
				//*   9   15:aload_0         
				//*  10   16:getfield        #17  <Field TextInputLayout this$0>
				//*  11   19:getfield        #35  <Field boolean TextInputLayout.counterEnabled>
				//*  12   22:ifeq            38
						updateCounter(editable.length());
				//   13   25:aload_0         
				//   14   26:getfield        #17  <Field TextInputLayout this$0>
				//   15   29:aload_1         
				//   16   30:invokeinterface #41  <Method int Editable.length()>
				//   17   35:invokevirtual   #45  <Method void TextInputLayout.updateCounter(int)>
				//   18   38:return          
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
	//   52  109:aload_0         
	//   53  110:getfield        #485 <Field EditText editText>
	//   54  113:new             #6   <Class TextInputLayout$1>
	//   55  116:dup             
	//   56  117:aload_0         
	//   57  118:invokespecial   #770 <Method void TextInputLayout$1(TextInputLayout)>
	//   58  121:invokevirtual   #774 <Method void EditText.addTextChangedListener(TextWatcher)>
			if(defaultHintTextColor == null)
	//*  59  124:aload_0         
	//*  60  125:getfield        #339 <Field ColorStateList defaultHintTextColor>
	//*  61  128:ifnonnull       142
				defaultHintTextColor = editText.getHintTextColors();
	//   62  131:aload_0         
	//   63  132:aload_0         
	//   64  133:getfield        #485 <Field EditText editText>
	//   65  136:invokevirtual   #778 <Method ColorStateList EditText.getHintTextColors()>
	//   66  139:putfield        #339 <Field ColorStateList defaultHintTextColor>
			if(hintEnabled)
	//*  67  142:aload_0         
	//*  68  143:getfield        #215 <Field boolean hintEnabled>
	//*  69  146:ifeq            191
			{
				if(TextUtils.isEmpty(hint))
	//*  70  149:aload_0         
	//*  71  150:getfield        #627 <Field CharSequence hint>
	//*  72  153:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  73  156:ifeq            186
				{
					originalHint = editText.getHint();
	//   74  159:aload_0         
	//   75  160:aload_0         
	//   76  161:getfield        #485 <Field EditText editText>
	//   77  164:invokevirtual   #782 <Method CharSequence EditText.getHint()>
	//   78  167:putfield        #784 <Field CharSequence originalHint>
					setHint(originalHint);
	//   79  170:aload_0         
	//   80  171:aload_0         
	//   81  172:getfield        #784 <Field CharSequence originalHint>
	//   82  175:invokevirtual   #226 <Method void setHint(CharSequence)>
					editText.setHint(((CharSequence) (null)));
	//   83  178:aload_0         
	//   84  179:getfield        #485 <Field EditText editText>
	//   85  182:aconst_null     
	//   86  183:invokevirtual   #785 <Method void EditText.setHint(CharSequence)>
				}
				isProvidingHint = true;
	//   87  186:aload_0         
	//   88  187:iconst_1        
	//   89  188:putfield        #787 <Field boolean isProvidingHint>
			}
			if(counterView != null)
	//*  90  191:aload_0         
	//*  91  192:getfield        #789 <Field TextView counterView>
	//*  92  195:ifnull          214
				updateCounter(editText.getText().length());
	//   93  198:aload_0         
	//   94  199:aload_0         
	//   95  200:getfield        #485 <Field EditText editText>
	//   96  203:invokevirtual   #792 <Method Editable EditText.getText()>
	//   97  206:invokeinterface #797 <Method int Editable.length()>
	//   98  211:invokevirtual   #800 <Method void updateCounter(int)>
			indicatorViewController.adjustIndicatorPadding();
	//   99  214:aload_0         
	//  100  215:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//  101  218:invokevirtual   #803 <Method void IndicatorViewController.adjustIndicatorPadding()>
			updatePasswordToggleView();
	//  102  221:aload_0         
	//  103  222:invokespecial   #806 <Method void updatePasswordToggleView()>
			updateLabelState(false, true);
	//  104  225:aload_0         
	//  105  226:iconst_0        
	//  106  227:iconst_1        
	//  107  228:invokespecial   #810 <Method void updateLabelState(boolean, boolean)>
			return;
	//  108  231:return          
		} else
		{
			throw new IllegalArgumentException("We already have an EditText, can only have one");
	//  109  232:new             #812 <Class IllegalArgumentException>
	//  110  235:dup             
	//  111  236:ldc2            #814 <String "We already have an EditText, can only have one">
	//  112  239:invokespecial   #817 <Method void IllegalArgumentException(String)>
	//  113  242:athrow          
		}
	}

	private void setHintInternal(CharSequence charsequence)
	{
		if(!TextUtils.equals(charsequence, hint))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #627 <Field CharSequence hint>
	//*   3    5:invokestatic    #822 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*   4    8:ifne            35
		{
			hint = charsequence;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #627 <Field CharSequence hint>
			collapsingTextHelper.setText(charsequence);
	//    8   16:aload_0         
	//    9   17:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #825 <Method void CollapsingTextHelper.setText(CharSequence)>
			if(!hintExpanded)
	//*  12   24:aload_0         
	//*  13   25:getfield        #622 <Field boolean hintExpanded>
	//*  14   28:ifne            35
				openCutout();
	//   15   31:aload_0         
	//   16   32:invokespecial   #625 <Method void openCutout()>
		}
	//   17   35:return          
	}

	private boolean shouldShowPasswordIcon()
	{
		return passwordToggleEnabled && (hasPasswordTransformation() || passwordToggledVisible);
	//    0    0:aload_0         
	//    1    1:getfield        #409 <Field boolean passwordToggleEnabled>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:invokespecial   #749 <Method boolean hasPasswordTransformation()>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:getfield        #828 <Field boolean passwordToggledVisible>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void updateEditTextBackgroundBounds()
	{
		Object obj = ((Object) (editText));
	//    0    0:aload_0         
	//    1    1:getfield        #485 <Field EditText editText>
	//    2    4:astore          5
		if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		Object obj1 = ((Object) (((EditText) (obj)).getBackground()));
	//    6   12:aload           5
	//    7   14:invokevirtual   #493 <Method Drawable EditText.getBackground()>
	//    8   17:astore          6
		if(obj1 == null)
	//*   9   19:aload           6
	//*  10   21:ifnonnull       25
			return;
	//   11   24:return          
		obj = obj1;
	//   12   25:aload           6
	//   13   27:astore          5
		if(DrawableUtils.canSafelyMutateDrawable(((Drawable) (obj1))))
	//*  14   29:aload           6
	//*  15   31:invokestatic    #835 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  16   34:ifeq            44
			obj = ((Object) (((Drawable) (obj1)).mutate()));
	//   17   37:aload           6
	//   18   39:invokevirtual   #546 <Method Drawable Drawable.mutate()>
	//   19   42:astore          5
		obj1 = ((Object) (new Rect()));
	//   20   44:new             #133 <Class Rect>
	//   21   47:dup             
	//   22   48:invokespecial   #136 <Method void Rect()>
	//   23   51:astore          6
		DescendantOffsetUtils.getDescendantRect(((ViewGroup) (this)), ((View) (editText)), ((Rect) (obj1)));
	//   24   53:aload_0         
	//   25   54:aload_0         
	//   26   55:getfield        #485 <Field EditText editText>
	//   27   58:aload           6
	//   28   60:invokestatic    #841 <Method void DescendantOffsetUtils.getDescendantRect(ViewGroup, View, Rect)>
		obj1 = ((Object) (((Drawable) (obj)).getBounds()));
	//   29   63:aload           5
	//   30   65:invokevirtual   #588 <Method Rect Drawable.getBounds()>
	//   31   68:astore          6
		if(((Rect) (obj1)).left != ((Rect) (obj1)).right)
	//*  32   70:aload           6
	//*  33   72:getfield        #843 <Field int Rect.left>
	//*  34   75:aload           6
	//*  35   77:getfield        #845 <Field int Rect.right>
	//*  36   80:icmpeq          151
		{
			Rect rect = new Rect();
	//   37   83:new             #133 <Class Rect>
	//   38   86:dup             
	//   39   87:invokespecial   #136 <Method void Rect()>
	//   40   90:astore          7
			((Drawable) (obj)).getPadding(rect);
	//   41   92:aload           5
	//   42   94:aload           7
	//   43   96:invokevirtual   #849 <Method boolean Drawable.getPadding(Rect)>
	//   44   99:pop             
			int i = ((Rect) (obj1)).left;
	//   45  100:aload           6
	//   46  102:getfield        #843 <Field int Rect.left>
	//   47  105:istore_1        
			int j = rect.left;
	//   48  106:aload           7
	//   49  108:getfield        #843 <Field int Rect.left>
	//   50  111:istore_2        
			int k = ((Rect) (obj1)).right;
	//   51  112:aload           6
	//   52  114:getfield        #845 <Field int Rect.right>
	//   53  117:istore_3        
			int l = rect.right;
	//   54  118:aload           7
	//   55  120:getfield        #845 <Field int Rect.right>
	//   56  123:istore          4
			((Drawable) (obj)).setBounds(i - j, ((Rect) (obj1)).top, k + l * 2, editText.getBottom());
	//   57  125:aload           5
	//   58  127:iload_1         
	//   59  128:iload_2         
	//   60  129:isub            
	//   61  130:aload           6
	//   62  132:getfield        #590 <Field int Rect.top>
	//   63  135:iload_3         
	//   64  136:iload           4
	//   65  138:iconst_2        
	//   66  139:imul            
	//   67  140:iadd            
	//   68  141:aload_0         
	//   69  142:getfield        #485 <Field EditText editText>
	//   70  145:invokevirtual   #852 <Method int EditText.getBottom()>
	//   71  148:invokevirtual   #856 <Method void Drawable.setBounds(int, int, int, int)>
		}
	//   72  151:return          
	}

	private void updateInputLayoutMargins()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)inputFrame.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field FrameLayout inputFrame>
	//    2    4:invokevirtual   #860 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//    3    7:checkcast       #862 <Class android.widget.LinearLayout$LayoutParams>
	//    4   10:astore_2        
		int i = calculateLabelMarginTop();
	//    5   11:aload_0         
	//    6   12:invokespecial   #577 <Method int calculateLabelMarginTop()>
	//    7   15:istore_1        
		if(i != layoutparams.topMargin)
	//*   8   16:iload_1         
	//*   9   17:aload_2         
	//*  10   18:getfield        #865 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//*  11   21:icmpeq          36
		{
			layoutparams.topMargin = i;
	//   12   24:aload_2         
	//   13   25:iload_1         
	//   14   26:putfield        #865 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
			inputFrame.requestLayout();
	//   15   29:aload_0         
	//   16   30:getfield        #167 <Field FrameLayout inputFrame>
	//   17   33:invokevirtual   #868 <Method void FrameLayout.requestLayout()>
		}
	//   18   36:return          
	}

	private void updateLabelState(boolean flag, boolean flag1)
	{
		boolean flag2;
		boolean flag3;
		boolean flag5;
label0:
		{
			boolean flag4 = isEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #871 <Method boolean isEnabled()>
	//    2    4:istore          5
			Object obj = ((Object) (editText));
	//    3    6:aload_0         
	//    4    7:getfield        #485 <Field EditText editText>
	//    5   10:astore          7
			flag3 = true;
	//    6   12:iconst_1        
	//    7   13:istore          4
			if(obj != null && !TextUtils.isEmpty(((CharSequence) (((EditText) (obj)).getText()))))
	//*   8   15:aload           7
	//*   9   17:ifnull          36
	//*  10   20:aload           7
	//*  11   22:invokevirtual   #792 <Method Editable EditText.getText()>
	//*  12   25:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   28:ifne            36
				flag2 = true;
	//   14   31:iconst_1        
	//   15   32:istore_3        
			else
	//*  16   33:goto            38
				flag2 = false;
	//   17   36:iconst_0        
	//   18   37:istore_3        
			obj = ((Object) (editText));
	//   19   38:aload_0         
	//   20   39:getfield        #485 <Field EditText editText>
	//   21   42:astore          7
			if(obj == null || !((EditText) (obj)).hasFocus())
	//*  22   44:aload           7
	//*  23   46:ifnull          60
	//*  24   49:aload           7
	//*  25   51:invokevirtual   #874 <Method boolean EditText.hasFocus()>
	//*  26   54:ifeq            60
	//*  27   57:goto            63
				flag3 = false;
	//   28   60:iconst_0        
	//   29   61:istore          4
			flag5 = indicatorViewController.errorShouldBeShown();
	//   30   63:aload_0         
	//   31   64:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   32   67:invokevirtual   #877 <Method boolean IndicatorViewController.errorShouldBeShown()>
	//   33   70:istore          6
			obj = ((Object) (defaultHintTextColor));
	//   34   72:aload_0         
	//   35   73:getfield        #339 <Field ColorStateList defaultHintTextColor>
	//   36   76:astore          7
			if(obj != null)
	//*  37   78:aload           7
	//*  38   80:ifnull          103
			{
				collapsingTextHelper.setCollapsedTextColor(((ColorStateList) (obj)));
	//   39   83:aload_0         
	//   40   84:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   41   87:aload           7
	//   42   89:invokevirtual   #881 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
				collapsingTextHelper.setExpandedTextColor(defaultHintTextColor);
	//   43   92:aload_0         
	//   44   93:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   45   96:aload_0         
	//   46   97:getfield        #339 <Field ColorStateList defaultHintTextColor>
	//   47  100:invokevirtual   #884 <Method void CollapsingTextHelper.setExpandedTextColor(ColorStateList)>
			}
			if(!flag4)
	//*  48  103:iload           5
	//*  49  105:ifne            139
			{
				collapsingTextHelper.setCollapsedTextColor(ColorStateList.valueOf(disabledColor));
	//   50  108:aload_0         
	//   51  109:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   52  112:aload_0         
	//   53  113:getfield        #356 <Field int disabledColor>
	//   54  116:invokestatic    #887 <Method ColorStateList ColorStateList.valueOf(int)>
	//   55  119:invokevirtual   #881 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
				collapsingTextHelper.setExpandedTextColor(ColorStateList.valueOf(disabledColor));
	//   56  122:aload_0         
	//   57  123:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   58  126:aload_0         
	//   59  127:getfield        #356 <Field int disabledColor>
	//   60  130:invokestatic    #887 <Method ColorStateList ColorStateList.valueOf(int)>
	//   61  133:invokevirtual   #884 <Method void CollapsingTextHelper.setExpandedTextColor(ColorStateList)>
				break label0;
	//   62  136:goto            219
			}
			if(flag5)
	//*  63  139:iload           6
	//*  64  141:ifeq            161
			{
				collapsingTextHelper.setCollapsedTextColor(indicatorViewController.getErrorViewTextColors());
	//   65  144:aload_0         
	//   66  145:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   67  148:aload_0         
	//   68  149:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   69  152:invokevirtual   #890 <Method ColorStateList IndicatorViewController.getErrorViewTextColors()>
	//   70  155:invokevirtual   #881 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
				break label0;
	//   71  158:goto            219
			}
			if(counterOverflowed)
	//*  72  161:aload_0         
	//*  73  162:getfield        #892 <Field boolean counterOverflowed>
	//*  74  165:ifeq            194
			{
				TextView textview = counterView;
	//   75  168:aload_0         
	//   76  169:getfield        #789 <Field TextView counterView>
	//   77  172:astore          7
				if(textview != null)
	//*  78  174:aload           7
	//*  79  176:ifnull          194
				{
					collapsingTextHelper.setCollapsedTextColor(textview.getTextColors());
	//   80  179:aload_0         
	//   81  180:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   82  183:aload           7
	//   83  185:invokevirtual   #897 <Method ColorStateList TextView.getTextColors()>
	//   84  188:invokevirtual   #881 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
					break label0;
	//   85  191:goto            219
				}
			}
			if(flag3)
	//*  86  194:iload           4
	//*  87  196:ifeq            219
			{
				ColorStateList colorstatelist = focusedTextColor;
	//   88  199:aload_0         
	//   89  200:getfield        #337 <Field ColorStateList focusedTextColor>
	//   90  203:astore          7
				if(colorstatelist != null)
	//*  91  205:aload           7
	//*  92  207:ifnull          219
					collapsingTextHelper.setCollapsedTextColor(colorstatelist);
	//   93  210:aload_0         
	//   94  211:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   95  214:aload           7
	//   96  216:invokevirtual   #881 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
			}
		}
		if(!flag2 && (!isEnabled() || !flag3 && !flag5))
	//*  97  219:iload_3         
	//*  98  220:ifne            260
	//*  99  223:aload_0         
	//* 100  224:invokevirtual   #871 <Method boolean isEnabled()>
	//* 101  227:ifeq            243
	//* 102  230:iload           4
	//* 103  232:ifne            260
	//* 104  235:iload           6
	//* 105  237:ifeq            243
	//* 106  240:goto            260
		{
			if(flag1 || !hintExpanded)
	//* 107  243:iload_2         
	//* 108  244:ifne            254
	//* 109  247:aload_0         
	//* 110  248:getfield        #622 <Field boolean hintExpanded>
	//* 111  251:ifne            276
			{
				expandHint(flag);
	//  112  254:aload_0         
	//  113  255:iload_1         
	//  114  256:invokespecial   #899 <Method void expandHint(boolean)>
				return;
	//  115  259:return          
			}
		} else
		if(flag1 || hintExpanded)
	//* 116  260:iload_2         
	//* 117  261:ifne            271
	//* 118  264:aload_0         
	//* 119  265:getfield        #622 <Field boolean hintExpanded>
	//* 120  268:ifeq            276
			collapseHint(flag);
	//  121  271:aload_0         
	//  122  272:iload_1         
	//  123  273:invokespecial   #901 <Method void collapseHint(boolean)>
	//  124  276:return          
	}

	private void updatePasswordToggleView()
	{
		if(editText == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #485 <Field EditText editText>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(shouldShowPasswordIcon())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #903 <Method boolean shouldShowPasswordIcon()>
	//*   6   12:ifeq            260
		{
			if(passwordToggleView == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//*   9   19:ifnonnull       95
			{
				passwordToggleView = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_text_input_password_icon, ((ViewGroup) (inputFrame)), false);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #907 <Method Context getContext()>
	//   13   27:invokestatic    #913 <Method LayoutInflater LayoutInflater.from(Context)>
	//   14   30:getstatic       #918 <Field int android.support.design.R$layout.design_text_input_password_icon>
	//   15   33:aload_0         
	//   16   34:getfield        #167 <Field FrameLayout inputFrame>
	//   17   37:iconst_0        
	//   18   38:invokevirtual   #922 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   19   41:checkcast       #558 <Class CheckableImageButton>
	//   20   44:putfield        #556 <Field CheckableImageButton passwordToggleView>
				passwordToggleView.setImageDrawable(passwordToggleDrawable);
	//   21   47:aload_0         
	//   22   48:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   23   51:aload_0         
	//   24   52:getfield        #418 <Field Drawable passwordToggleDrawable>
	//   25   55:invokevirtual   #564 <Method void CheckableImageButton.setImageDrawable(Drawable)>
				passwordToggleView.setContentDescription(passwordToggleContentDesc);
	//   26   58:aload_0         
	//   27   59:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   28   62:aload_0         
	//   29   63:getfield        #423 <Field CharSequence passwordToggleContentDesc>
	//   30   66:invokevirtual   #925 <Method void CheckableImageButton.setContentDescription(CharSequence)>
				inputFrame.addView(((View) (passwordToggleView)));
	//   31   69:aload_0         
	//   32   70:getfield        #167 <Field FrameLayout inputFrame>
	//   33   73:aload_0         
	//   34   74:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   35   77:invokevirtual   #926 <Method void FrameLayout.addView(View)>
				passwordToggleView.setOnClickListener(new android.view.View.OnClickListener() {

					public void onClick(View view)
					{
						passwordVisibilityToggleRequested(false);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field TextInputLayout this$0>
					//    2    4:iconst_0        
					//    3    5:invokevirtual   #26  <Method void TextInputLayout.passwordVisibilityToggleRequested(boolean)>
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
	//   37   81:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   38   84:new             #8   <Class TextInputLayout$2>
	//   39   87:dup             
	//   40   88:aload_0         
	//   41   89:invokespecial   #927 <Method void TextInputLayout$2(TextInputLayout)>
	//   42   92:invokevirtual   #931 <Method void CheckableImageButton.setOnClickListener(android.view.View$OnClickListener)>
			}
			EditText edittext = editText;
	//   43   95:aload_0         
	//   44   96:getfield        #485 <Field EditText editText>
	//   45   99:astore_1        
			if(edittext != null && ViewCompat.getMinimumHeight(((View) (edittext))) <= 0)
	//*  46  100:aload_1         
	//*  47  101:ifnull          125
	//*  48  104:aload_1         
	//*  49  105:invokestatic    #935 <Method int ViewCompat.getMinimumHeight(View)>
	//*  50  108:ifgt            125
				editText.setMinimumHeight(ViewCompat.getMinimumHeight(((View) (passwordToggleView))));
	//   51  111:aload_0         
	//   52  112:getfield        #485 <Field EditText editText>
	//   53  115:aload_0         
	//   54  116:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   55  119:invokestatic    #935 <Method int ViewCompat.getMinimumHeight(View)>
	//   56  122:invokevirtual   #938 <Method void EditText.setMinimumHeight(int)>
			passwordToggleView.setVisibility(0);
	//   57  125:aload_0         
	//   58  126:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   59  129:iconst_0        
	//   60  130:invokevirtual   #941 <Method void CheckableImageButton.setVisibility(int)>
			passwordToggleView.setChecked(passwordToggledVisible);
	//   61  133:aload_0         
	//   62  134:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   63  137:aload_0         
	//   64  138:getfield        #828 <Field boolean passwordToggledVisible>
	//   65  141:invokevirtual   #944 <Method void CheckableImageButton.setChecked(boolean)>
			if(passwordToggleDummyDrawable == null)
	//*  66  144:aload_0         
	//*  67  145:getfield        #946 <Field Drawable passwordToggleDummyDrawable>
	//*  68  148:ifnonnull       162
				passwordToggleDummyDrawable = ((Drawable) (new ColorDrawable()));
	//   69  151:aload_0         
	//   70  152:new             #948 <Class ColorDrawable>
	//   71  155:dup             
	//   72  156:invokespecial   #949 <Method void ColorDrawable()>
	//   73  159:putfield        #946 <Field Drawable passwordToggleDummyDrawable>
			passwordToggleDummyDrawable.setBounds(0, 0, passwordToggleView.getMeasuredWidth(), 1);
	//   74  162:aload_0         
	//   75  163:getfield        #946 <Field Drawable passwordToggleDummyDrawable>
	//   76  166:iconst_0        
	//   77  167:iconst_0        
	//   78  168:aload_0         
	//   79  169:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   80  172:invokevirtual   #952 <Method int CheckableImageButton.getMeasuredWidth()>
	//   81  175:iconst_1        
	//   82  176:invokevirtual   #856 <Method void Drawable.setBounds(int, int, int, int)>
			Drawable adrawable[] = TextViewCompat.getCompoundDrawablesRelative(((TextView) (editText)));
	//   83  179:aload_0         
	//   84  180:getfield        #485 <Field EditText editText>
	//   85  183:invokestatic    #958 <Method Drawable[] TextViewCompat.getCompoundDrawablesRelative(TextView)>
	//   86  186:astore_1        
			if(adrawable[2] != passwordToggleDummyDrawable)
	//*  87  187:aload_1         
	//*  88  188:iconst_2        
	//*  89  189:aaload          
	//*  90  190:aload_0         
	//*  91  191:getfield        #946 <Field Drawable passwordToggleDummyDrawable>
	//*  92  194:if_acmpeq       204
				originalEditTextEndDrawable = adrawable[2];
	//   93  197:aload_0         
	//   94  198:aload_1         
	//   95  199:iconst_2        
	//   96  200:aaload          
	//   97  201:putfield        #960 <Field Drawable originalEditTextEndDrawable>
			TextViewCompat.setCompoundDrawablesRelative(((TextView) (editText)), adrawable[0], adrawable[1], passwordToggleDummyDrawable, adrawable[3]);
	//   98  204:aload_0         
	//   99  205:getfield        #485 <Field EditText editText>
	//  100  208:aload_1         
	//  101  209:iconst_0        
	//  102  210:aaload          
	//  103  211:aload_1         
	//  104  212:iconst_1        
	//  105  213:aaload          
	//  106  214:aload_0         
	//  107  215:getfield        #946 <Field Drawable passwordToggleDummyDrawable>
	//  108  218:aload_1         
	//  109  219:iconst_3        
	//  110  220:aaload          
	//  111  221:invokestatic    #964 <Method void TextViewCompat.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
			passwordToggleView.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
	//  112  224:aload_0         
	//  113  225:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//  114  228:aload_0         
	//  115  229:getfield        #485 <Field EditText editText>
	//  116  232:invokevirtual   #967 <Method int EditText.getPaddingLeft()>
	//  117  235:aload_0         
	//  118  236:getfield        #485 <Field EditText editText>
	//  119  239:invokevirtual   #968 <Method int EditText.getPaddingTop()>
	//  120  242:aload_0         
	//  121  243:getfield        #485 <Field EditText editText>
	//  122  246:invokevirtual   #971 <Method int EditText.getPaddingRight()>
	//  123  249:aload_0         
	//  124  250:getfield        #485 <Field EditText editText>
	//  125  253:invokevirtual   #974 <Method int EditText.getPaddingBottom()>
	//  126  256:invokevirtual   #977 <Method void CheckableImageButton.setPadding(int, int, int, int)>
			return;
	//  127  259:return          
		}
		CheckableImageButton checkableimagebutton = passwordToggleView;
	//  128  260:aload_0         
	//  129  261:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//  130  264:astore_1        
		if(checkableimagebutton != null && checkableimagebutton.getVisibility() == 0)
	//* 131  265:aload_1         
	//* 132  266:ifnull          285
	//* 133  269:aload_1         
	//* 134  270:invokevirtual   #980 <Method int CheckableImageButton.getVisibility()>
	//* 135  273:ifne            285
			passwordToggleView.setVisibility(8);
	//  136  276:aload_0         
	//  137  277:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//  138  280:bipush          8
	//  139  282:invokevirtual   #941 <Method void CheckableImageButton.setVisibility(int)>
		if(passwordToggleDummyDrawable != null)
	//* 140  285:aload_0         
	//* 141  286:getfield        #946 <Field Drawable passwordToggleDummyDrawable>
	//* 142  289:ifnull          335
		{
			Drawable adrawable1[] = TextViewCompat.getCompoundDrawablesRelative(((TextView) (editText)));
	//  143  292:aload_0         
	//  144  293:getfield        #485 <Field EditText editText>
	//  145  296:invokestatic    #958 <Method Drawable[] TextViewCompat.getCompoundDrawablesRelative(TextView)>
	//  146  299:astore_1        
			if(adrawable1[2] == passwordToggleDummyDrawable)
	//* 147  300:aload_1         
	//* 148  301:iconst_2        
	//* 149  302:aaload          
	//* 150  303:aload_0         
	//* 151  304:getfield        #946 <Field Drawable passwordToggleDummyDrawable>
	//* 152  307:if_acmpne       335
			{
				TextViewCompat.setCompoundDrawablesRelative(((TextView) (editText)), adrawable1[0], adrawable1[1], originalEditTextEndDrawable, adrawable1[3]);
	//  153  310:aload_0         
	//  154  311:getfield        #485 <Field EditText editText>
	//  155  314:aload_1         
	//  156  315:iconst_0        
	//  157  316:aaload          
	//  158  317:aload_1         
	//  159  318:iconst_1        
	//  160  319:aaload          
	//  161  320:aload_0         
	//  162  321:getfield        #960 <Field Drawable originalEditTextEndDrawable>
	//  163  324:aload_1         
	//  164  325:iconst_3        
	//  165  326:aaload          
	//  166  327:invokestatic    #964 <Method void TextViewCompat.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
				passwordToggleDummyDrawable = null;
	//  167  330:aload_0         
	//  168  331:aconst_null     
	//  169  332:putfield        #946 <Field Drawable passwordToggleDummyDrawable>
			}
		}
	//  170  335:return          
	}

	private void updateTextInputBoxBounds()
	{
		if(boxBackgroundMode != 0 && boxBackground != null && editText != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #487 <Field int boxBackgroundMode>
	//*   2    4:ifeq            143
	//*   3    7:aload_0         
	//*   4    8:getfield        #480 <Field GradientDrawable boxBackground>
	//*   5   11:ifnull          143
	//*   6   14:aload_0         
	//*   7   15:getfield        #485 <Field EditText editText>
	//*   8   18:ifnull          143
		{
			if(getRight() == 0)
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #983 <Method int getRight()>
	//*  11   25:ifne            29
				return;
	//   12   28:return          
			int l1 = editText.getLeft();
	//   13   29:aload_0         
	//   14   30:getfield        #485 <Field EditText editText>
	//   15   33:invokevirtual   #986 <Method int EditText.getLeft()>
	//   16   36:istore          8
			int k1 = calculateBoxBackgroundTop();
	//   17   38:aload_0         
	//   18   39:invokespecial   #988 <Method int calculateBoxBackgroundTop()>
	//   19   42:istore          7
			int j1 = editText.getRight();
	//   20   44:aload_0         
	//   21   45:getfield        #485 <Field EditText editText>
	//   22   48:invokevirtual   #989 <Method int EditText.getRight()>
	//   23   51:istore          6
			int i1 = editText.getBottom() + boxBottomOffsetPx;
	//   24   53:aload_0         
	//   25   54:getfield        #485 <Field EditText editText>
	//   26   57:invokevirtual   #852 <Method int EditText.getBottom()>
	//   27   60:aload_0         
	//   28   61:getfield        #250 <Field int boxBottomOffsetPx>
	//   29   64:iadd            
	//   30   65:istore          5
			int l = l1;
	//   31   67:iload           8
	//   32   69:istore          4
			int k = k1;
	//   33   71:iload           7
	//   34   73:istore_3        
			int j = j1;
	//   35   74:iload           6
	//   36   76:istore_2        
			int i = i1;
	//   37   77:iload           5
	//   38   79:istore_1        
			if(boxBackgroundMode == 2)
	//*  39   80:aload_0         
	//*  40   81:getfield        #487 <Field int boxBackgroundMode>
	//*  41   84:iconst_2        
	//*  42   85:icmpne          122
			{
				i = boxStrokeWidthFocusedPx;
	//   43   88:aload_0         
	//   44   89:getfield        #313 <Field int boxStrokeWidthFocusedPx>
	//   45   92:istore_1        
				l = l1 + i / 2;
	//   46   93:iload           8
	//   47   95:iload_1         
	//   48   96:iconst_2        
	//   49   97:idiv            
	//   50   98:iadd            
	//   51   99:istore          4
				k = k1 - i / 2;
	//   52  101:iload           7
	//   53  103:iload_1         
	//   54  104:iconst_2        
	//   55  105:idiv            
	//   56  106:isub            
	//   57  107:istore_3        
				j = j1 - i / 2;
	//   58  108:iload           6
	//   59  110:iload_1         
	//   60  111:iconst_2        
	//   61  112:idiv            
	//   62  113:isub            
	//   63  114:istore_2        
				i = i1 + i / 2;
	//   64  115:iload           5
	//   65  117:iload_1         
	//   66  118:iconst_2        
	//   67  119:idiv            
	//   68  120:iadd            
	//   69  121:istore_1        
			}
			boxBackground.setBounds(l, k, j, i);
	//   70  122:aload_0         
	//   71  123:getfield        #480 <Field GradientDrawable boxBackground>
	//   72  126:iload           4
	//   73  128:iload_3         
	//   74  129:iload_2         
	//   75  130:iload_1         
	//   76  131:invokevirtual   #990 <Method void GradientDrawable.setBounds(int, int, int, int)>
			applyBoxAttributes();
	//   77  134:aload_0         
	//   78  135:invokespecial   #992 <Method void applyBoxAttributes()>
			updateEditTextBackgroundBounds();
	//   79  138:aload_0         
	//   80  139:invokespecial   #994 <Method void updateEditTextBackgroundBounds()>
			return;
	//   81  142:return          
		} else
		{
			return;
	//   82  143:return          
		}
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(view instanceof EditText)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #489 <Class EditText>
	//*   2    4:ifeq            64
		{
			android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams);
	//    3    7:new             #997 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_3         
	//    6   12:invokespecial   #1000 <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    7   15:astore          4
			layoutparams1.gravity = layoutparams1.gravity & 0xffffff8f | 0x10;
	//    8   17:aload           4
	//    9   19:aload           4
	//   10   21:getfield        #1003 <Field int android.widget.FrameLayout$LayoutParams.gravity>
	//   11   24:bipush          -113
	//   12   26:iand            
	//   13   27:bipush          16
	//   14   29:ior             
	//   15   30:putfield        #1003 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			inputFrame.addView(view, ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   16   33:aload_0         
	//   17   34:getfield        #167 <Field FrameLayout inputFrame>
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokevirtual   #1006 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			inputFrame.setLayoutParams(layoutparams);
	//   21   43:aload_0         
	//   22   44:getfield        #167 <Field FrameLayout inputFrame>
	//   23   47:aload_3         
	//   24   48:invokevirtual   #1009 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			updateInputLayoutMargins();
	//   25   51:aload_0         
	//   26   52:invokespecial   #688 <Method void updateInputLayoutMargins()>
			setEditText((EditText)view);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:checkcast       #489 <Class EditText>
	//   30   60:invokespecial   #1011 <Method void setEditText(EditText)>
			return;
	//   31   63:return          
		} else
		{
			super.addView(view, i, layoutparams);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:iload_2         
	//   35   67:aload_3         
	//   36   68:invokespecial   #1013 <Method void LinearLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   37   71:return          
		}
	}

	void animateToExpansionFraction(float f)
	{
		if(collapsingTextHelper.getExpansionFraction() == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//*   2    4:invokevirtual   #1017 <Method float CollapsingTextHelper.getExpansionFraction()>
	//*   3    7:fload_1         
	//*   4    8:fcmpl           
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(animator == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #605 <Field ValueAnimator animator>
	//*   9   17:ifnonnull       67
		{
			animator = new ValueAnimator();
	//   10   20:aload_0         
	//   11   21:new             #607 <Class ValueAnimator>
	//   12   24:dup             
	//   13   25:invokespecial   #1018 <Method void ValueAnimator()>
	//   14   28:putfield        #605 <Field ValueAnimator animator>
			animator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
	//   15   31:aload_0         
	//   16   32:getfield        #605 <Field ValueAnimator animator>
	//   17   35:getstatic       #1021 <Field android.animation.TimeInterpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   18   38:invokevirtual   #1024 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			animator.setDuration(167L);
	//   19   41:aload_0         
	//   20   42:getfield        #605 <Field ValueAnimator animator>
	//   21   45:ldc2w           #1025 <Long 167L>
	//   22   48:invokevirtual   #1030 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   23   51:pop             
			animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					collapsingTextHelper.setExpansionFraction(((Float)valueanimator.getAnimatedValue()).floatValue());
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field TextInputLayout this$0>
				//    2    4:getfield        #27  <Field CollapsingTextHelper TextInputLayout.collapsingTextHelper>
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
	//   25   53:getfield        #605 <Field ValueAnimator animator>
	//   26   56:new             #10  <Class TextInputLayout$3>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:invokespecial   #1031 <Method void TextInputLayout$3(TextInputLayout)>
	//   30   64:invokevirtual   #1035 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
		animator.setFloatValues(new float[] {
			collapsingTextHelper.getExpansionFraction(), f
		});
	//   31   67:aload_0         
	//   32   68:getfield        #605 <Field ValueAnimator animator>
	//   33   71:iconst_2        
	//   34   72:newarray        float[]
	//   35   74:dup             
	//   36   75:iconst_0        
	//   37   76:aload_0         
	//   38   77:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   39   80:invokevirtual   #1017 <Method float CollapsingTextHelper.getExpansionFraction()>
	//   40   83:fastore         
	//   41   84:dup             
	//   42   85:iconst_1        
	//   43   86:fload_1         
	//   44   87:fastore         
	//   45   88:invokevirtual   #1038 <Method void ValueAnimator.setFloatValues(float[])>
		animator.start();
	//   46   91:aload_0         
	//   47   92:getfield        #605 <Field ValueAnimator animator>
	//   48   95:invokevirtual   #1041 <Method void ValueAnimator.start()>
	//   49   98:return          
	}

	boolean cutoutIsOpen()
	{
		return cutoutEnabled() && ((CutoutDrawable)boxBackground).hasCutout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #599 <Method boolean cutoutEnabled()>
	//    2    4:ifeq            22
	//    3    7:aload_0         
	//    4    8:getfield        #480 <Field GradientDrawable boxBackground>
	//    5   11:checkcast       #567 <Class CutoutDrawable>
	//    6   14:invokevirtual   #665 <Method boolean CutoutDrawable.hasCutout()>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public void dispatchProvideAutofillStructure(ViewStructure viewstructure, int i)
	{
		boolean flag;
		Object obj;
		if(originalHint == null)
			break MISSING_BLOCK_LABEL_87;
	//    0    0:aload_0         
	//    1    1:getfield        #784 <Field CharSequence originalHint>
	//    2    4:ifnull          87
		obj = ((Object) (editText));
	//    3    7:aload_0         
	//    4    8:getfield        #485 <Field EditText editText>
	//    5   11:astore          4
		if(obj == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       21
			break MISSING_BLOCK_LABEL_87;
	//    8   18:goto            87
		flag = isProvidingHint;
	//    9   21:aload_0         
	//   10   22:getfield        #787 <Field boolean isProvidingHint>
	//   11   25:istore_3        
		isProvidingHint = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #787 <Field boolean isProvidingHint>
		obj = ((Object) (((EditText) (obj)).getHint()));
	//   15   31:aload           4
	//   16   33:invokevirtual   #782 <Method CharSequence EditText.getHint()>
	//   17   36:astore          4
		editText.setHint(originalHint);
	//   18   38:aload_0         
	//   19   39:getfield        #485 <Field EditText editText>
	//   20   42:aload_0         
	//   21   43:getfield        #784 <Field CharSequence originalHint>
	//   22   46:invokevirtual   #785 <Method void EditText.setHint(CharSequence)>
		super.dispatchProvideAutofillStructure(viewstructure, i);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:iload_2         
	//   26   52:invokespecial   #1046 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
		editText.setHint(((CharSequence) (obj)));
	//   27   55:aload_0         
	//   28   56:getfield        #485 <Field EditText editText>
	//   29   59:aload           4
	//   30   61:invokevirtual   #785 <Method void EditText.setHint(CharSequence)>
		isProvidingHint = flag;
	//   31   64:aload_0         
	//   32   65:iload_3         
	//   33   66:putfield        #787 <Field boolean isProvidingHint>
		return;
	//   34   69:return          
		viewstructure;
	//   35   70:astore_1        
		editText.setHint(((CharSequence) (obj)));
	//   36   71:aload_0         
	//   37   72:getfield        #485 <Field EditText editText>
	//   38   75:aload           4
	//   39   77:invokevirtual   #785 <Method void EditText.setHint(CharSequence)>
		isProvidingHint = flag;
	//   40   80:aload_0         
	//   41   81:iload_3         
	//   42   82:putfield        #787 <Field boolean isProvidingHint>
		throw viewstructure;
	//   43   85:aload_1         
	//   44   86:athrow          
		super.dispatchProvideAutofillStructure(viewstructure, i);
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:iload_2         
	//   48   90:invokespecial   #1046 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
		return;
	//   49   93:return          
	}

	protected void dispatchRestoreInstanceState(SparseArray sparsearray)
	{
		restoringSavedState = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #477 <Field boolean restoringSavedState>
		super.dispatchRestoreInstanceState(sparsearray);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #1050 <Method void LinearLayout.dispatchRestoreInstanceState(SparseArray)>
		restoringSavedState = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #477 <Field boolean restoringSavedState>
	//    9   15:return          
	}

	public void draw(Canvas canvas)
	{
		GradientDrawable gradientdrawable = boxBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #480 <Field GradientDrawable boxBackground>
	//    2    4:astore_2        
		if(gradientdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			gradientdrawable.draw(canvas);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1056 <Method void GradientDrawable.draw(Canvas)>
		super.draw(canvas);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #1057 <Method void LinearLayout.draw(Canvas)>
		if(hintEnabled)
	//*  11   19:aload_0         
	//*  12   20:getfield        #215 <Field boolean hintEnabled>
	//*  13   23:ifeq            34
			collapsingTextHelper.draw(canvas);
	//   14   26:aload_0         
	//   15   27:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #1058 <Method void CollapsingTextHelper.draw(Canvas)>
	//   18   34:return          
	}

	protected void drawableStateChanged()
	{
		if(inDrawableStateChanged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1061 <Field boolean inDrawableStateChanged>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		boolean flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		inDrawableStateChanged = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #1061 <Field boolean inDrawableStateChanged>
		super.drawableStateChanged();
	//    9   15:aload_0         
	//   10   16:invokespecial   #1063 <Method void LinearLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #721 <Method int[] getDrawableState()>
	//   13   23:astore_3        
		if(!ViewCompat.isLaidOut(((View) (this))) || !isEnabled())
	//*  14   24:aload_0         
	//*  15   25:invokestatic    #1066 <Method boolean ViewCompat.isLaidOut(View)>
	//*  16   28:ifeq            41
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #871 <Method boolean isEnabled()>
	//*  19   35:ifeq            41
	//*  20   38:goto            43
			flag1 = false;
	//   21   41:iconst_0        
	//   22   42:istore_2        
		updateLabelState(flag1);
	//   23   43:aload_0         
	//   24   44:iload_2         
	//   25   45:invokevirtual   #1068 <Method void updateLabelState(boolean)>
		updateEditTextBackground();
	//   26   48:aload_0         
	//   27   49:invokevirtual   #1071 <Method void updateEditTextBackground()>
		updateTextInputBoxBounds();
	//   28   52:aload_0         
	//   29   53:invokespecial   #691 <Method void updateTextInputBoxBounds()>
		updateTextInputBoxState();
	//   30   56:aload_0         
	//   31   57:invokevirtual   #1074 <Method void updateTextInputBoxState()>
		CollapsingTextHelper collapsingtexthelper = collapsingTextHelper;
	//   32   60:aload_0         
	//   33   61:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   34   64:astore          4
		boolean flag;
		if(collapsingtexthelper != null)
	//*  35   66:aload           4
	//*  36   68:ifnull          83
			flag = collapsingtexthelper.setState(ai) | false;
	//   37   71:aload           4
	//   38   73:aload_3         
	//   39   74:invokevirtual   #1078 <Method boolean CollapsingTextHelper.setState(int[])>
	//   40   77:iconst_0        
	//   41   78:ior             
	//   42   79:istore_1        
		else
	//*  43   80:goto            85
			flag = false;
	//   44   83:iconst_0        
	//   45   84:istore_1        
		if(flag)
	//*  46   85:iload_1         
	//*  47   86:ifeq            93
			invalidate();
	//   48   89:aload_0         
	//   49   90:invokevirtual   #521 <Method void invalidate()>
		inDrawableStateChanged = false;
	//   50   93:aload_0         
	//   51   94:iconst_0        
	//   52   95:putfield        #1061 <Field boolean inDrawableStateChanged>
	//   53   98:return          
	}

	public int getBoxBackgroundColor()
	{
		return boxBackgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field int boxBackgroundColor>
	//    2    4:ireturn         
	}

	public float getBoxCornerRadiusBottomEnd()
	{
		return boxCornerRadiusBottomEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field float boxCornerRadiusBottomEnd>
	//    2    4:freturn         
	}

	public float getBoxCornerRadiusBottomStart()
	{
		return boxCornerRadiusBottomStart;
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field float boxCornerRadiusBottomStart>
	//    2    4:freturn         
	}

	public float getBoxCornerRadiusTopEnd()
	{
		return boxCornerRadiusTopEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #277 <Field float boxCornerRadiusTopEnd>
	//    2    4:freturn         
	}

	public float getBoxCornerRadiusTopStart()
	{
		return boxCornerRadiusTopStart;
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field float boxCornerRadiusTopStart>
	//    2    4:freturn         
	}

	public int getBoxStrokeColor()
	{
		return focusedStrokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field int focusedStrokeColor>
	//    2    4:ireturn         
	}

	public int getCounterMaxLength()
	{
		return counterMaxLength;
	//    0    0:aload_0         
	//    1    1:getfield        #1087 <Field int counterMaxLength>
	//    2    4:ireturn         
	}

	CharSequence getCounterOverflowDescription()
	{
		if(counterEnabled && counterOverflowed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1091 <Field boolean counterEnabled>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #892 <Field boolean counterOverflowed>
	//*   5   11:ifeq            28
		{
			TextView textview = counterView;
	//    6   14:aload_0         
	//    7   15:getfield        #789 <Field TextView counterView>
	//    8   18:astore_1        
			if(textview != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          28
				return textview.getContentDescription();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #1094 <Method CharSequence TextView.getContentDescription()>
	//   13   27:areturn         
		}
		return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	public ColorStateList getDefaultHintTextColor()
	{
		return defaultHintTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #339 <Field ColorStateList defaultHintTextColor>
	//    2    4:areturn         
	}

	public EditText getEditText()
	{
		return editText;
	//    0    0:aload_0         
	//    1    1:getfield        #485 <Field EditText editText>
	//    2    4:areturn         
	}

	public CharSequence getError()
	{
		if(indicatorViewController.isErrorEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//*   2    4:invokevirtual   #1101 <Method boolean IndicatorViewController.isErrorEnabled()>
	//*   3    7:ifeq            18
			return indicatorViewController.getErrorText();
	//    4   10:aload_0         
	//    5   11:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    6   14:invokevirtual   #1104 <Method CharSequence IndicatorViewController.getErrorText()>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public int getErrorCurrentTextColors()
	{
		return indicatorViewController.getErrorViewCurrentTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:invokevirtual   #1108 <Method int IndicatorViewController.getErrorViewCurrentTextColor()>
	//    3    7:ireturn         
	}

	final int getErrorTextCurrentColor()
	{
		return indicatorViewController.getErrorViewCurrentTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:invokevirtual   #1108 <Method int IndicatorViewController.getErrorViewCurrentTextColor()>
	//    3    7:ireturn         
	}

	public CharSequence getHelperText()
	{
		if(indicatorViewController.isHelperTextEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//*   2    4:invokevirtual   #1113 <Method boolean IndicatorViewController.isHelperTextEnabled()>
	//*   3    7:ifeq            18
			return indicatorViewController.getHelperText();
	//    4   10:aload_0         
	//    5   11:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    6   14:invokevirtual   #1115 <Method CharSequence IndicatorViewController.getHelperText()>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public int getHelperTextCurrentTextColor()
	{
		return indicatorViewController.getHelperTextViewCurrentTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:invokevirtual   #1119 <Method int IndicatorViewController.getHelperTextViewCurrentTextColor()>
	//    3    7:ireturn         
	}

	public CharSequence getHint()
	{
		if(hintEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field boolean hintEnabled>
	//*   2    4:ifeq            12
			return hint;
	//    3    7:aload_0         
	//    4    8:getfield        #627 <Field CharSequence hint>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	final float getHintCollapsedTextHeight()
	{
		return collapsingTextHelper.getCollapsedTextHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:invokevirtual   #594 <Method float CollapsingTextHelper.getCollapsedTextHeight()>
	//    3    7:freturn         
	}

	final int getHintCurrentCollapsedTextColor()
	{
		return collapsingTextHelper.getCurrentCollapsedTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:invokevirtual   #1124 <Method int CollapsingTextHelper.getCurrentCollapsedTextColor()>
	//    3    7:ireturn         
	}

	public CharSequence getPasswordVisibilityToggleContentDescription()
	{
		return passwordToggleContentDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #423 <Field CharSequence passwordToggleContentDesc>
	//    2    4:areturn         
	}

	public Drawable getPasswordVisibilityToggleDrawable()
	{
		return passwordToggleDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #418 <Field Drawable passwordToggleDrawable>
	//    2    4:areturn         
	}

	public Typeface getTypeface()
	{
		return typeface;
	//    0    0:aload_0         
	//    1    1:getfield        #1128 <Field Typeface typeface>
	//    2    4:areturn         
	}

	public boolean isCounterEnabled()
	{
		return counterEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #1091 <Field boolean counterEnabled>
	//    2    4:ireturn         
	}

	public boolean isErrorEnabled()
	{
		return indicatorViewController.isErrorEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:invokevirtual   #1101 <Method boolean IndicatorViewController.isErrorEnabled()>
	//    3    7:ireturn         
	}

	final boolean isHelperTextDisplayed()
	{
		return indicatorViewController.helperTextIsDisplayed();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:invokevirtual   #1133 <Method boolean IndicatorViewController.helperTextIsDisplayed()>
	//    3    7:ireturn         
	}

	public boolean isHelperTextEnabled()
	{
		return indicatorViewController.isHelperTextEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:invokevirtual   #1113 <Method boolean IndicatorViewController.isHelperTextEnabled()>
	//    3    7:ireturn         
	}

	public boolean isHintAnimationEnabled()
	{
		return hintAnimationEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field boolean hintAnimationEnabled>
	//    2    4:ireturn         
	}

	public boolean isHintEnabled()
	{
		return hintEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field boolean hintEnabled>
	//    2    4:ireturn         
	}

	final boolean isHintExpanded()
	{
		return hintExpanded;
	//    0    0:aload_0         
	//    1    1:getfield        #622 <Field boolean hintExpanded>
	//    2    4:ireturn         
	}

	public boolean isPasswordVisibilityToggleEnabled()
	{
		return passwordToggleEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #409 <Field boolean passwordToggleEnabled>
	//    2    4:ireturn         
	}

	boolean isProvidingHint()
	{
		return isProvidingHint;
	//    0    0:aload_0         
	//    1    1:getfield        #787 <Field boolean isProvidingHint>
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
	//    6    8:invokespecial   #1141 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		if(boxBackground != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #480 <Field GradientDrawable boxBackground>
	//*   9   15:ifnull          22
			updateTextInputBoxBounds();
	//   10   18:aload_0         
	//   11   19:invokespecial   #691 <Method void updateTextInputBoxBounds()>
		if(hintEnabled)
	//*  12   22:aload_0         
	//*  13   23:getfield        #215 <Field boolean hintEnabled>
	//*  14   26:ifeq            171
		{
			EditText edittext = editText;
	//   15   29:aload_0         
	//   16   30:getfield        #485 <Field EditText editText>
	//   17   33:astore          7
			if(edittext != null)
	//*  18   35:aload           7
	//*  19   37:ifnull          171
			{
				Rect rect = tmpRect;
	//   20   40:aload_0         
	//   21   41:getfield        #138 <Field Rect tmpRect>
	//   22   44:astore          8
				DescendantOffsetUtils.getDescendantRect(((ViewGroup) (this)), ((View) (edittext)), rect);
	//   23   46:aload_0         
	//   24   47:aload           7
	//   25   49:aload           8
	//   26   51:invokestatic    #841 <Method void DescendantOffsetUtils.getDescendantRect(ViewGroup, View, Rect)>
				i = rect.left + editText.getCompoundPaddingLeft();
	//   27   54:aload           8
	//   28   56:getfield        #843 <Field int Rect.left>
	//   29   59:aload_0         
	//   30   60:getfield        #485 <Field EditText editText>
	//   31   63:invokevirtual   #1144 <Method int EditText.getCompoundPaddingLeft()>
	//   32   66:iadd            
	//   33   67:istore_2        
				k = rect.right - editText.getCompoundPaddingRight();
	//   34   68:aload           8
	//   35   70:getfield        #845 <Field int Rect.right>
	//   36   73:aload_0         
	//   37   74:getfield        #485 <Field EditText editText>
	//   38   77:invokevirtual   #1147 <Method int EditText.getCompoundPaddingRight()>
	//   39   80:isub            
	//   40   81:istore          4
				int i1 = calculateCollapsedTextTopBounds();
	//   41   83:aload_0         
	//   42   84:invokespecial   #1149 <Method int calculateCollapsedTextTopBounds()>
	//   43   87:istore          6
				collapsingTextHelper.setExpandedBounds(i, rect.top + editText.getCompoundPaddingTop(), k, rect.bottom - editText.getCompoundPaddingBottom());
	//   44   89:aload_0         
	//   45   90:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   46   93:iload_2         
	//   47   94:aload           8
	//   48   96:getfield        #590 <Field int Rect.top>
	//   49   99:aload_0         
	//   50  100:getfield        #485 <Field EditText editText>
	//   51  103:invokevirtual   #1152 <Method int EditText.getCompoundPaddingTop()>
	//   52  106:iadd            
	//   53  107:iload           4
	//   54  109:aload           8
	//   55  111:getfield        #1154 <Field int Rect.bottom>
	//   56  114:aload_0         
	//   57  115:getfield        #485 <Field EditText editText>
	//   58  118:invokevirtual   #1157 <Method int EditText.getCompoundPaddingBottom()>
	//   59  121:isub            
	//   60  122:invokevirtual   #1160 <Method void CollapsingTextHelper.setExpandedBounds(int, int, int, int)>
				collapsingTextHelper.setCollapsedBounds(i, i1, k, l - j - getPaddingBottom());
	//   61  125:aload_0         
	//   62  126:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   63  129:iload_2         
	//   64  130:iload           6
	//   65  132:iload           4
	//   66  134:iload           5
	//   67  136:iload_3         
	//   68  137:isub            
	//   69  138:aload_0         
	//   70  139:invokevirtual   #1161 <Method int getPaddingBottom()>
	//   71  142:isub            
	//   72  143:invokevirtual   #1164 <Method void CollapsingTextHelper.setCollapsedBounds(int, int, int, int)>
				collapsingTextHelper.recalculate();
	//   73  146:aload_0         
	//   74  147:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//   75  150:invokevirtual   #1167 <Method void CollapsingTextHelper.recalculate()>
				if(cutoutEnabled() && !hintExpanded)
	//*  76  153:aload_0         
	//*  77  154:invokespecial   #599 <Method boolean cutoutEnabled()>
	//*  78  157:ifeq            171
	//*  79  160:aload_0         
	//*  80  161:getfield        #622 <Field boolean hintExpanded>
	//*  81  164:ifne            171
					openCutout();
	//   82  167:aload_0         
	//   83  168:invokespecial   #625 <Method void openCutout()>
			}
		}
	//   84  171:return          
	}

	protected void onMeasure(int i, int j)
	{
		updatePasswordToggleView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #806 <Method void updatePasswordToggleView()>
		super.onMeasure(i, j);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #1170 <Method void LinearLayout.onMeasure(int, int)>
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
	//    5    9:invokespecial   #1174 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #1178 <Method Parcelable TextInputLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #1174 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
		setError(((SavedState) (parcelable)).error);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #1181 <Field CharSequence TextInputLayout$SavedState.error>
	//   17   31:invokevirtual   #1184 <Method void setError(CharSequence)>
		if(((SavedState) (parcelable)).isPasswordToggledVisible)
	//*  18   34:aload_1         
	//*  19   35:getfield        #1187 <Field boolean TextInputLayout$SavedState.isPasswordToggledVisible>
	//*  20   38:ifeq            46
			passwordVisibilityToggleRequested(true);
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:invokevirtual   #1190 <Method void passwordVisibilityToggleRequested(boolean)>
		requestLayout();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #1191 <Method void requestLayout()>
	//   26   50:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #18  <Class TextInputLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1194 <Method Parcelable LinearLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #1196 <Method void TextInputLayout$SavedState(Parcelable)>
	//    5   11:astore_1        
		if(indicatorViewController.errorShouldBeShown())
	//*   6   12:aload_0         
	//*   7   13:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//*   8   16:invokevirtual   #877 <Method boolean IndicatorViewController.errorShouldBeShown()>
	//*   9   19:ifeq            30
			savedstate.error = getError();
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #1198 <Method CharSequence getError()>
	//   13   27:putfield        #1181 <Field CharSequence TextInputLayout$SavedState.error>
		savedstate.isPasswordToggledVisible = passwordToggledVisible;
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #828 <Field boolean passwordToggledVisible>
	//   17   35:putfield        #1187 <Field boolean TextInputLayout$SavedState.isPasswordToggledVisible>
		return ((Parcelable) (savedstate));
	//   18   38:aload_1         
	//   19   39:areturn         
	}

	public void passwordVisibilityToggleRequested(boolean flag)
	{
		if(passwordToggleEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #409 <Field boolean passwordToggleEnabled>
	//*   2    4:ifeq            83
		{
			int i = editText.getSelectionEnd();
	//    3    7:aload_0         
	//    4    8:getfield        #485 <Field EditText editText>
	//    5   11:invokevirtual   #1201 <Method int EditText.getSelectionEnd()>
	//    6   14:istore_2        
			if(hasPasswordTransformation())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #749 <Method boolean hasPasswordTransformation()>
	//*   9   19:ifeq            38
			{
				editText.setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #485 <Field EditText editText>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #1205 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				passwordToggledVisible = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #828 <Field boolean passwordToggledVisible>
			} else
	//*  17   35:goto            53
			{
				editText.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   18   38:aload_0         
	//   19   39:getfield        #485 <Field EditText editText>
	//   20   42:invokestatic    #1209 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   21   45:invokevirtual   #1205 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				passwordToggledVisible = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #828 <Field boolean passwordToggledVisible>
			}
			passwordToggleView.setChecked(passwordToggledVisible);
	//   25   53:aload_0         
	//   26   54:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   27   57:aload_0         
	//   28   58:getfield        #828 <Field boolean passwordToggledVisible>
	//   29   61:invokevirtual   #944 <Method void CheckableImageButton.setChecked(boolean)>
			if(flag)
	//*  30   64:iload_1         
	//*  31   65:ifeq            75
				passwordToggleView.jumpDrawablesToCurrentState();
	//   32   68:aload_0         
	//   33   69:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//   34   72:invokevirtual   #1212 <Method void CheckableImageButton.jumpDrawablesToCurrentState()>
			editText.setSelection(i);
	//   35   75:aload_0         
	//   36   76:getfield        #485 <Field EditText editText>
	//   37   79:iload_2         
	//   38   80:invokevirtual   #1215 <Method void EditText.setSelection(int)>
		}
	//   39   83:return          
	}

	public void setBoxBackgroundColor(int i)
	{
		if(boxBackgroundColor != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #295 <Field int boxBackgroundColor>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			boxBackgroundColor = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #295 <Field int boxBackgroundColor>
			applyBoxAttributes();
	//    7   13:aload_0         
	//    8   14:invokespecial   #992 <Method void applyBoxAttributes()>
		}
	//    9   17:return          
	}

	public void setBoxBackgroundColorResource(int i)
	{
		setBoxBackgroundColor(ContextCompat.getColor(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #907 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #349 <Method int ContextCompat.getColor(Context, int)>
	//    5    9:invokevirtual   #1221 <Method void setBoxBackgroundColor(int)>
	//    6   12:return          
	}

	public void setBoxBackgroundMode(int i)
	{
		if(i == boxBackgroundMode)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #487 <Field int boxBackgroundMode>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			boxBackgroundMode = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #487 <Field int boxBackgroundMode>
			onApplyBoxBackgroundMode();
	//    8   14:aload_0         
	//    9   15:invokespecial   #661 <Method void onApplyBoxBackgroundMode()>
			return;
	//   10   18:return          
		}
	}

	public void setBoxCornerRadii(float f, float f1, float f2, float f3)
	{
		if(boxCornerRadiusTopStart != f || boxCornerRadiusTopEnd != f1 || boxCornerRadiusBottomEnd != f3 || boxCornerRadiusBottomStart != f2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #272 <Field float boxCornerRadiusTopStart>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifne            37
	//*   5    9:aload_0         
	//*   6   10:getfield        #277 <Field float boxCornerRadiusTopEnd>
	//*   7   13:fload_2         
	//*   8   14:fcmpl           
	//*   9   15:ifne            37
	//*  10   18:aload_0         
	//*  11   19:getfield        #282 <Field float boxCornerRadiusBottomEnd>
	//*  12   22:fload           4
	//*  13   24:fcmpl           
	//*  14   25:ifne            37
	//*  15   28:aload_0         
	//*  16   29:getfield        #287 <Field float boxCornerRadiusBottomStart>
	//*  17   32:fload_3         
	//*  18   33:fcmpl           
	//*  19   34:ifeq            62
		{
			boxCornerRadiusTopStart = f;
	//   20   37:aload_0         
	//   21   38:fload_1         
	//   22   39:putfield        #272 <Field float boxCornerRadiusTopStart>
			boxCornerRadiusTopEnd = f1;
	//   23   42:aload_0         
	//   24   43:fload_2         
	//   25   44:putfield        #277 <Field float boxCornerRadiusTopEnd>
			boxCornerRadiusBottomEnd = f3;
	//   26   47:aload_0         
	//   27   48:fload           4
	//   28   50:putfield        #282 <Field float boxCornerRadiusBottomEnd>
			boxCornerRadiusBottomStart = f2;
	//   29   53:aload_0         
	//   30   54:fload_3         
	//   31   55:putfield        #287 <Field float boxCornerRadiusBottomStart>
			applyBoxAttributes();
	//   32   58:aload_0         
	//   33   59:invokespecial   #992 <Method void applyBoxAttributes()>
		}
	//   34   62:return          
	}

	public void setBoxCornerRadiiResources(int i, int j, int k, int l)
	{
		setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(j), getContext().getResources().getDimension(k), getContext().getResources().getDimension(l));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #907 <Method Context getContext()>
	//    3    5:invokevirtual   #237 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1228 <Method float Resources.getDimension(int)>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #907 <Method Context getContext()>
	//    8   16:invokevirtual   #237 <Method Resources Context.getResources()>
	//    9   19:iload_2         
	//   10   20:invokevirtual   #1228 <Method float Resources.getDimension(int)>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #907 <Method Context getContext()>
	//   13   27:invokevirtual   #237 <Method Resources Context.getResources()>
	//   14   30:iload_3         
	//   15   31:invokevirtual   #1228 <Method float Resources.getDimension(int)>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #907 <Method Context getContext()>
	//   18   38:invokevirtual   #237 <Method Resources Context.getResources()>
	//   19   41:iload           4
	//   20   43:invokevirtual   #1228 <Method float Resources.getDimension(int)>
	//   21   46:invokevirtual   #1230 <Method void setBoxCornerRadii(float, float, float, float)>
	//   22   49:return          
	}

	public void setBoxStrokeColor(int i)
	{
		if(focusedStrokeColor != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #300 <Field int focusedStrokeColor>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			focusedStrokeColor = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #300 <Field int focusedStrokeColor>
			updateTextInputBoxState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #1074 <Method void updateTextInputBoxState()>
		}
	//    9   17:return          
	}

	public void setCounterEnabled(boolean flag)
	{
		if(counterEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1091 <Field boolean counterEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          141
		{
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            119
			{
				counterView = ((TextView) (new AppCompatTextView(getContext())));
	//    6   12:aload_0         
	//    7   13:new             #1233 <Class AppCompatTextView>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #907 <Method Context getContext()>
	//   11   21:invokespecial   #1234 <Method void AppCompatTextView(Context)>
	//   12   24:putfield        #789 <Field TextView counterView>
				counterView.setId(android.support.design.R.id.textinput_counter);
	//   13   27:aload_0         
	//   14   28:getfield        #789 <Field TextView counterView>
	//   15   31:getstatic       #1239 <Field int android.support.design.R$id.textinput_counter>
	//   16   34:invokevirtual   #1242 <Method void TextView.setId(int)>
				Object obj = ((Object) (typeface));
	//   17   37:aload_0         
	//   18   38:getfield        #1128 <Field Typeface typeface>
	//   19   41:astore_2        
				if(obj != null)
	//*  20   42:aload_2         
	//*  21   43:ifnull          54
					counterView.setTypeface(((Typeface) (obj)));
	//   22   46:aload_0         
	//   23   47:getfield        #789 <Field TextView counterView>
	//   24   50:aload_2         
	//   25   51:invokevirtual   #1245 <Method void TextView.setTypeface(Typeface)>
				counterView.setMaxLines(1);
	//   26   54:aload_0         
	//   27   55:getfield        #789 <Field TextView counterView>
	//   28   58:iconst_1        
	//   29   59:invokevirtual   #1248 <Method void TextView.setMaxLines(int)>
				setTextAppearanceCompatWithErrorFallback(counterView, counterTextAppearance);
	//   30   62:aload_0         
	//   31   63:aload_0         
	//   32   64:getfield        #789 <Field TextView counterView>
	//   33   67:aload_0         
	//   34   68:getfield        #399 <Field int counterTextAppearance>
	//   35   71:invokevirtual   #1252 <Method void setTextAppearanceCompatWithErrorFallback(TextView, int)>
				indicatorViewController.addIndicator(counterView, 2);
	//   36   74:aload_0         
	//   37   75:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   38   78:aload_0         
	//   39   79:getfield        #789 <Field TextView counterView>
	//   40   82:iconst_2        
	//   41   83:invokevirtual   #1255 <Method void IndicatorViewController.addIndicator(TextView, int)>
				obj = ((Object) (editText));
	//   42   86:aload_0         
	//   43   87:getfield        #485 <Field EditText editText>
	//   44   90:astore_2        
				if(obj == null)
	//*  45   91:aload_2         
	//*  46   92:ifnonnull       103
					updateCounter(0);
	//   47   95:aload_0         
	//   48   96:iconst_0        
	//   49   97:invokevirtual   #800 <Method void updateCounter(int)>
				else
	//*  50  100:goto            136
					updateCounter(((EditText) (obj)).getText().length());
	//   51  103:aload_0         
	//   52  104:aload_2         
	//   53  105:invokevirtual   #792 <Method Editable EditText.getText()>
	//   54  108:invokeinterface #797 <Method int Editable.length()>
	//   55  113:invokevirtual   #800 <Method void updateCounter(int)>
			} else
	//*  56  116:goto            136
			{
				indicatorViewController.removeIndicator(counterView, 2);
	//   57  119:aload_0         
	//   58  120:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   59  123:aload_0         
	//   60  124:getfield        #789 <Field TextView counterView>
	//   61  127:iconst_2        
	//   62  128:invokevirtual   #1258 <Method void IndicatorViewController.removeIndicator(TextView, int)>
				counterView = null;
	//   63  131:aload_0         
	//   64  132:aconst_null     
	//   65  133:putfield        #789 <Field TextView counterView>
			}
			counterEnabled = flag;
	//   66  136:aload_0         
	//   67  137:iload_1         
	//   68  138:putfield        #1091 <Field boolean counterEnabled>
		}
	//   69  141:return          
	}

	public void setCounterMaxLength(int i)
	{
		if(counterMaxLength != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1087 <Field int counterMaxLength>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          61
		{
			if(i > 0)
	//*   4    8:iload_1         
	//*   5    9:ifle            20
				counterMaxLength = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #1087 <Field int counterMaxLength>
			else
	//*   9   17:goto            25
				counterMaxLength = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #1087 <Field int counterMaxLength>
			if(counterEnabled)
	//*  13   25:aload_0         
	//*  14   26:getfield        #1091 <Field boolean counterEnabled>
	//*  15   29:ifeq            61
			{
				EditText edittext = editText;
	//   16   32:aload_0         
	//   17   33:getfield        #485 <Field EditText editText>
	//   18   36:astore_2        
				if(edittext == null)
	//*  19   37:aload_2         
	//*  20   38:ifnonnull       46
					i = 0;
	//   21   41:iconst_0        
	//   22   42:istore_1        
				else
	//*  23   43:goto            56
					i = edittext.getText().length();
	//   24   46:aload_2         
	//   25   47:invokevirtual   #792 <Method Editable EditText.getText()>
	//   26   50:invokeinterface #797 <Method int Editable.length()>
	//   27   55:istore_1        
				updateCounter(i);
	//   28   56:aload_0         
	//   29   57:iload_1         
	//   30   58:invokevirtual   #800 <Method void updateCounter(int)>
			}
		}
	//   31   61:return          
	}

	public void setDefaultHintTextColor(ColorStateList colorstatelist)
	{
		defaultHintTextColor = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #339 <Field ColorStateList defaultHintTextColor>
		focusedTextColor = colorstatelist;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #337 <Field ColorStateList focusedTextColor>
		if(editText != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #485 <Field EditText editText>
	//*   8   14:ifnull          22
			updateLabelState(false);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #1068 <Method void updateLabelState(boolean)>
	//   12   22:return          
	}

	public void setEnabled(boolean flag)
	{
		recursiveSetEnabled(((ViewGroup) (this)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #717 <Method void recursiveSetEnabled(ViewGroup, boolean)>
		super.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #1260 <Method void LinearLayout.setEnabled(boolean)>
	//    6   10:return          
	}

	public void setError(CharSequence charsequence)
	{
		if(!indicatorViewController.isErrorEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//*   2    4:invokevirtual   #1101 <Method boolean IndicatorViewController.isErrorEnabled()>
	//*   3    7:ifne            23
		{
			if(TextUtils.isEmpty(charsequence))
	//*   4   10:aload_1         
	//*   5   11:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   14:ifeq            18
				return;
	//    7   17:return          
			setErrorEnabled(true);
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #458 <Method void setErrorEnabled(boolean)>
		}
		if(!TextUtils.isEmpty(charsequence))
	//*  11   23:aload_1         
	//*  12   24:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   27:ifne            39
		{
			indicatorViewController.showError(charsequence);
	//   14   30:aload_0         
	//   15   31:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #1263 <Method void IndicatorViewController.showError(CharSequence)>
			return;
	//   18   38:return          
		} else
		{
			indicatorViewController.hideError();
	//   19   39:aload_0         
	//   20   40:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   21   43:invokevirtual   #1266 <Method void IndicatorViewController.hideError()>
			return;
	//   22   46:return          
		}
	}

	public void setErrorEnabled(boolean flag)
	{
		indicatorViewController.setErrorEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1267 <Method void IndicatorViewController.setErrorEnabled(boolean)>
	//    4    8:return          
	}

	public void setErrorTextAppearance(int i)
	{
		indicatorViewController.setErrorTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1269 <Method void IndicatorViewController.setErrorTextAppearance(int)>
	//    4    8:return          
	}

	public void setErrorTextColor(ColorStateList colorstatelist)
	{
		indicatorViewController.setErrorViewTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1273 <Method void IndicatorViewController.setErrorViewTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setHelperText(CharSequence charsequence)
	{
		if(TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            20
		{
			if(isHelperTextEnabled())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #1274 <Method boolean isHelperTextEnabled()>
	//*   5   11:ifeq            40
			{
				setHelperTextEnabled(false);
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #449 <Method void setHelperTextEnabled(boolean)>
				return;
	//    9   19:return          
			}
		} else
		{
			if(!isHelperTextEnabled())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #1274 <Method boolean isHelperTextEnabled()>
	//*  12   24:ifne            32
				setHelperTextEnabled(true);
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #449 <Method void setHelperTextEnabled(boolean)>
			indicatorViewController.showHelper(charsequence);
	//   16   32:aload_0         
	//   17   33:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #1277 <Method void IndicatorViewController.showHelper(CharSequence)>
		}
	//   20   40:return          
	}

	public void setHelperTextColor(ColorStateList colorstatelist)
	{
		indicatorViewController.setHelperTextViewTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1281 <Method void IndicatorViewController.setHelperTextViewTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setHelperTextEnabled(boolean flag)
	{
		indicatorViewController.setHelperTextEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1282 <Method void IndicatorViewController.setHelperTextEnabled(boolean)>
	//    4    8:return          
	}

	public void setHelperTextTextAppearance(int i)
	{
		indicatorViewController.setHelperTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1285 <Method void IndicatorViewController.setHelperTextAppearance(int)>
	//    4    8:return          
	}

	public void setHint(CharSequence charsequence)
	{
		if(hintEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field boolean hintEnabled>
	//*   2    4:ifeq            19
		{
			setHintInternal(charsequence);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1287 <Method void setHintInternal(CharSequence)>
			sendAccessibilityEvent(2048);
	//    6   12:aload_0         
	//    7   13:sipush          2048
	//    8   16:invokevirtual   #1290 <Method void sendAccessibilityEvent(int)>
		}
	//    9   19:return          
	}

	public void setHintAnimationEnabled(boolean flag)
	{
		hintAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #231 <Field boolean hintAnimationEnabled>
	//    3    5:return          
	}

	public void setHintEnabled(boolean flag)
	{
		if(flag != hintEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #215 <Field boolean hintEnabled>
	//*   3    5:icmpeq          121
		{
			hintEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #215 <Field boolean hintEnabled>
			if(!hintEnabled)
	//*   7   13:aload_0         
	//*   8   14:getfield        #215 <Field boolean hintEnabled>
	//*   9   17:ifne            67
			{
				isProvidingHint = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #787 <Field boolean isProvidingHint>
				if(!TextUtils.isEmpty(hint) && TextUtils.isEmpty(editText.getHint()))
	//*  13   25:aload_0         
	//*  14   26:getfield        #627 <Field CharSequence hint>
	//*  15   29:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   32:ifne            59
	//*  17   35:aload_0         
	//*  18   36:getfield        #485 <Field EditText editText>
	//*  19   39:invokevirtual   #782 <Method CharSequence EditText.getHint()>
	//*  20   42:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   45:ifeq            59
					editText.setHint(hint);
	//   22   48:aload_0         
	//   23   49:getfield        #485 <Field EditText editText>
	//   24   52:aload_0         
	//   25   53:getfield        #627 <Field CharSequence hint>
	//   26   56:invokevirtual   #785 <Method void EditText.setHint(CharSequence)>
				setHintInternal(((CharSequence) (null)));
	//   27   59:aload_0         
	//   28   60:aconst_null     
	//   29   61:invokespecial   #1287 <Method void setHintInternal(CharSequence)>
			} else
	//*  30   64:goto            110
			{
				CharSequence charsequence = editText.getHint();
	//   31   67:aload_0         
	//   32   68:getfield        #485 <Field EditText editText>
	//   33   71:invokevirtual   #782 <Method CharSequence EditText.getHint()>
	//   34   74:astore_2        
				if(!TextUtils.isEmpty(charsequence))
	//*  35   75:aload_2         
	//*  36   76:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   79:ifne            105
				{
					if(TextUtils.isEmpty(hint))
	//*  38   82:aload_0         
	//*  39   83:getfield        #627 <Field CharSequence hint>
	//*  40   86:invokestatic    #633 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   89:ifeq            97
						setHint(charsequence);
	//   42   92:aload_0         
	//   43   93:aload_2         
	//   44   94:invokevirtual   #226 <Method void setHint(CharSequence)>
					editText.setHint(((CharSequence) (null)));
	//   45   97:aload_0         
	//   46   98:getfield        #485 <Field EditText editText>
	//   47  101:aconst_null     
	//   48  102:invokevirtual   #785 <Method void EditText.setHint(CharSequence)>
				}
				isProvidingHint = true;
	//   49  105:aload_0         
	//   50  106:iconst_1        
	//   51  107:putfield        #787 <Field boolean isProvidingHint>
			}
			if(editText != null)
	//*  52  110:aload_0         
	//*  53  111:getfield        #485 <Field EditText editText>
	//*  54  114:ifnull          121
				updateInputLayoutMargins();
	//   55  117:aload_0         
	//   56  118:invokespecial   #688 <Method void updateInputLayoutMargins()>
		}
	//   57  121:return          
	}

	public void setHintTextAppearance(int i)
	{
		collapsingTextHelper.setCollapsedTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1295 <Method void CollapsingTextHelper.setCollapsedTextAppearance(int)>
		focusedTextColor = collapsingTextHelper.getCollapsedTextColor();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//    7   13:invokevirtual   #1298 <Method ColorStateList CollapsingTextHelper.getCollapsedTextColor()>
	//    8   16:putfield        #337 <Field ColorStateList focusedTextColor>
		if(editText != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #485 <Field EditText editText>
	//*  11   23:ifnull          35
		{
			updateLabelState(false);
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #1068 <Method void updateLabelState(boolean)>
			updateInputLayoutMargins();
	//   15   31:aload_0         
	//   16   32:invokespecial   #688 <Method void updateInputLayoutMargins()>
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
	//    3    5:invokevirtual   #1301 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1302 <Method CharSequence Resources.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			charsequence = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleContentDescription(charsequence);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1304 <Method void setPasswordVisibilityToggleContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleContentDescription(CharSequence charsequence)
	{
		passwordToggleContentDesc = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #423 <Field CharSequence passwordToggleContentDesc>
		CheckableImageButton checkableimagebutton = passwordToggleView;
	//    3    5:aload_0         
	//    4    6:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//    5    9:astore_2        
		if(checkableimagebutton != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			checkableimagebutton.setContentDescription(charsequence);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #925 <Method void CheckableImageButton.setContentDescription(CharSequence)>
	//   11   19:return          
	}

	public void setPasswordVisibilityToggleDrawable(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #907 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1311 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleDrawable(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1313 <Method void setPasswordVisibilityToggleDrawable(Drawable)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleDrawable(Drawable drawable)
	{
		passwordToggleDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #418 <Field Drawable passwordToggleDrawable>
		CheckableImageButton checkableimagebutton = passwordToggleView;
	//    3    5:aload_0         
	//    4    6:getfield        #556 <Field CheckableImageButton passwordToggleView>
	//    5    9:astore_2        
		if(checkableimagebutton != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			checkableimagebutton.setImageDrawable(drawable);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #564 <Method void CheckableImageButton.setImageDrawable(Drawable)>
	//   11   19:return          
	}

	public void setPasswordVisibilityToggleEnabled(boolean flag)
	{
		if(passwordToggleEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #409 <Field boolean passwordToggleEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          49
		{
			passwordToggleEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #409 <Field boolean passwordToggleEnabled>
			if(!flag && passwordToggledVisible)
	//*   7   13:iload_1         
	//*   8   14:ifne            40
	//*   9   17:aload_0         
	//*  10   18:getfield        #828 <Field boolean passwordToggledVisible>
	//*  11   21:ifeq            40
			{
				EditText edittext = editText;
	//   12   24:aload_0         
	//   13   25:getfield        #485 <Field EditText editText>
	//   14   28:astore_2        
				if(edittext != null)
	//*  15   29:aload_2         
	//*  16   30:ifnull          40
					edittext.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   17   33:aload_2         
	//   18   34:invokestatic    #1209 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   19   37:invokevirtual   #1205 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
			}
			passwordToggledVisible = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #828 <Field boolean passwordToggledVisible>
			updatePasswordToggleView();
	//   23   45:aload_0         
	//   24   46:invokespecial   #806 <Method void updatePasswordToggleView()>
		}
	//   25   49:return          
	}

	public void setPasswordVisibilityToggleTintList(ColorStateList colorstatelist)
	{
		passwordToggleTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #430 <Field ColorStateList passwordToggleTintList>
		hasPasswordToggleTintList = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #428 <Field boolean hasPasswordToggleTintList>
		applyPasswordToggleTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #467 <Method void applyPasswordToggleTint()>
	//    8   14:return          
	}

	public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode)
	{
		passwordToggleTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #443 <Field android.graphics.PorterDuff$Mode passwordToggleTintMode>
		hasPasswordToggleTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #435 <Field boolean hasPasswordToggleTintMode>
		applyPasswordToggleTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #467 <Method void applyPasswordToggleTint()>
	//    8   14:return          
	}

	void setTextAppearanceCompatWithErrorFallback(TextView textview, int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		TextViewCompat.setTextAppearance(textview, i);
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #1322 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		if(android.os.Build.VERSION.SDK_INT < 23)
			break MISSING_BLOCK_LABEL_35;
	//    5    7:getstatic       #639 <Field int android.os.Build$VERSION.SDK_INT>
	//    6   10:bipush          23
	//    7   12:icmplt          35
		i = textview.getTextColors().getDefaultColor();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #897 <Method ColorStateList TextView.getTextColors()>
	//   10   19:invokevirtual   #726 <Method int ColorStateList.getDefaultColor()>
	//   11   22:istore_2        
		if(i == -65281)
	//*  12   23:iload_2         
	//*  13   24:ldc2            #1323 <Int -65281>
	//*  14   27:icmpne          35
		{
			i = ((int) (flag));
	//   15   30:iload_3         
	//   16   31:istore_2        
			break MISSING_BLOCK_LABEL_37;
	//   17   32:goto            37
		}
		i = 0;
	//   18   35:iconst_0        
	//   19   36:istore_2        
_L2:
		if(i != 0)
	//*  20   37:iload_2         
	//*  21   38:ifeq            62
		{
			TextViewCompat.setTextAppearance(textview, android.support.design.R.style.TextAppearance_AppCompat_Caption);
	//   22   41:aload_1         
	//   23   42:getstatic       #1326 <Field int android.support.design.R$style.TextAppearance_AppCompat_Caption>
	//   24   45:invokestatic    #1322 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			textview.setTextColor(ContextCompat.getColor(getContext(), android.support.design.R.color.design_error));
	//   25   48:aload_1         
	//   26   49:aload_0         
	//   27   50:invokevirtual   #907 <Method Context getContext()>
	//   28   53:getstatic       #1329 <Field int android.support.design.R$color.design_error>
	//   29   56:invokestatic    #349 <Method int ContextCompat.getColor(Context, int)>
	//   30   59:invokevirtual   #1332 <Method void TextView.setTextColor(int)>
		}
		return;
	//   31   62:return          
		Exception exception;
		exception;
	//   32   63:astore          4
		i = ((int) (flag));
	//   33   65:iload_3         
	//   34   66:istore_2        
		if(true) goto _L2; else goto _L1
	//   35   67:goto            37
_L1:
	}

	public void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilitydelegate)
	{
		EditText edittext = editText;
	//    0    0:aload_0         
	//    1    1:getfield        #485 <Field EditText editText>
	//    2    4:astore_2        
		if(edittext != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			ViewCompat.setAccessibilityDelegate(((View) (edittext)), ((AccessibilityDelegateCompat) (accessibilitydelegate)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #1336 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//    8   14:return          
	}

	public void setTypeface(Typeface typeface1)
	{
		if(typeface1 != typeface)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #1128 <Field Typeface typeface>
	//*   3    5:if_acmpeq       43
		{
			typeface = typeface1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #1128 <Field Typeface typeface>
			collapsingTextHelper.setTypefaces(typeface1);
	//    7   13:aload_0         
	//    8   14:getfield        #150 <Field CollapsingTextHelper collapsingTextHelper>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #757 <Method void CollapsingTextHelper.setTypefaces(Typeface)>
			indicatorViewController.setTypefaces(typeface1);
	//   11   21:aload_0         
	//   12   22:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #1337 <Method void IndicatorViewController.setTypefaces(Typeface)>
			TextView textview = counterView;
	//   15   29:aload_0         
	//   16   30:getfield        #789 <Field TextView counterView>
	//   17   33:astore_2        
			if(textview != null)
	//*  18   34:aload_2         
	//*  19   35:ifnull          43
				textview.setTypeface(typeface1);
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #1245 <Method void TextView.setTypeface(Typeface)>
		}
	//   23   43:return          
	}

	void updateCounter(int i)
	{
		boolean flag1 = counterOverflowed;
	//    0    0:aload_0         
	//    1    1:getfield        #892 <Field boolean counterOverflowed>
	//    2    4:istore          4
		if(counterMaxLength == -1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #1087 <Field int counterMaxLength>
	//*   5   10:iconst_m1       
	//*   6   11:icmpne          41
		{
			counterView.setText(((CharSequence) (String.valueOf(i))));
	//    7   14:aload_0         
	//    8   15:getfield        #789 <Field TextView counterView>
	//    9   18:iload_1         
	//   10   19:invokestatic    #1342 <Method String String.valueOf(int)>
	//   11   22:invokevirtual   #1343 <Method void TextView.setText(CharSequence)>
			counterView.setContentDescription(((CharSequence) (null)));
	//   12   25:aload_0         
	//   13   26:getfield        #789 <Field TextView counterView>
	//   14   29:aconst_null     
	//   15   30:invokevirtual   #1344 <Method void TextView.setContentDescription(CharSequence)>
			counterOverflowed = false;
	//   16   33:aload_0         
	//   17   34:iconst_0        
	//   18   35:putfield        #892 <Field boolean counterOverflowed>
		} else
	//*  19   38:goto            212
		{
			if(ViewCompat.getAccessibilityLiveRegion(((View) (counterView))) == 1)
	//*  20   41:aload_0         
	//*  21   42:getfield        #789 <Field TextView counterView>
	//*  22   45:invokestatic    #1347 <Method int ViewCompat.getAccessibilityLiveRegion(View)>
	//*  23   48:iconst_1        
	//*  24   49:icmpne          60
				ViewCompat.setAccessibilityLiveRegion(((View) (counterView)), 0);
	//   25   52:aload_0         
	//   26   53:getfield        #789 <Field TextView counterView>
	//   27   56:iconst_0        
	//   28   57:invokestatic    #1350 <Method void ViewCompat.setAccessibilityLiveRegion(View, int)>
			boolean flag;
			if(i > counterMaxLength)
	//*  29   60:iload_1         
	//*  30   61:aload_0         
	//*  31   62:getfield        #1087 <Field int counterMaxLength>
	//*  32   65:icmple          73
				flag = true;
	//   33   68:iconst_1        
	//   34   69:istore_3        
			else
	//*  35   70:goto            75
				flag = false;
	//   36   73:iconst_0        
	//   37   74:istore_3        
			counterOverflowed = flag;
	//   38   75:aload_0         
	//   39   76:iload_3         
	//   40   77:putfield        #892 <Field boolean counterOverflowed>
			flag = counterOverflowed;
	//   41   80:aload_0         
	//   42   81:getfield        #892 <Field boolean counterOverflowed>
	//   43   84:istore_3        
			if(flag1 != flag)
	//*  44   85:iload           4
	//*  45   87:iload_3         
	//*  46   88:icmpeq          136
			{
				TextView textview = counterView;
	//   47   91:aload_0         
	//   48   92:getfield        #789 <Field TextView counterView>
	//   49   95:astore          5
				int j;
				if(flag)
	//*  50   97:iload_3         
	//*  51   98:ifeq            109
					j = counterOverflowTextAppearance;
	//   52  101:aload_0         
	//   53  102:getfield        #404 <Field int counterOverflowTextAppearance>
	//   54  105:istore_2        
				else
	//*  55  106:goto            114
					j = counterTextAppearance;
	//   56  109:aload_0         
	//   57  110:getfield        #399 <Field int counterTextAppearance>
	//   58  113:istore_2        
				setTextAppearanceCompatWithErrorFallback(textview, j);
	//   59  114:aload_0         
	//   60  115:aload           5
	//   61  117:iload_2         
	//   62  118:invokevirtual   #1252 <Method void setTextAppearanceCompatWithErrorFallback(TextView, int)>
				if(counterOverflowed)
	//*  63  121:aload_0         
	//*  64  122:getfield        #892 <Field boolean counterOverflowed>
	//*  65  125:ifeq            136
					ViewCompat.setAccessibilityLiveRegion(((View) (counterView)), 1);
	//   66  128:aload_0         
	//   67  129:getfield        #789 <Field TextView counterView>
	//   68  132:iconst_1        
	//   69  133:invokestatic    #1350 <Method void ViewCompat.setAccessibilityLiveRegion(View, int)>
			}
			counterView.setText(((CharSequence) (getContext().getString(android.support.design.R.string.character_counter_pattern, new Object[] {
				Integer.valueOf(i), Integer.valueOf(counterMaxLength)
			}))));
	//   70  136:aload_0         
	//   71  137:getfield        #789 <Field TextView counterView>
	//   72  140:aload_0         
	//   73  141:invokevirtual   #907 <Method Context getContext()>
	//   74  144:getstatic       #1355 <Field int android.support.design.R$string.character_counter_pattern>
	//   75  147:iconst_2        
	//   76  148:anewarray       Object[]
	//   77  151:dup             
	//   78  152:iconst_0        
	//   79  153:iload_1         
	//   80  154:invokestatic    #1362 <Method Integer Integer.valueOf(int)>
	//   81  157:aastore         
	//   82  158:dup             
	//   83  159:iconst_1        
	//   84  160:aload_0         
	//   85  161:getfield        #1087 <Field int counterMaxLength>
	//   86  164:invokestatic    #1362 <Method Integer Integer.valueOf(int)>
	//   87  167:aastore         
	//   88  168:invokevirtual   #1366 <Method String Context.getString(int, Object[])>
	//   89  171:invokevirtual   #1343 <Method void TextView.setText(CharSequence)>
			counterView.setContentDescription(((CharSequence) (getContext().getString(android.support.design.R.string.character_counter_content_description, new Object[] {
				Integer.valueOf(i), Integer.valueOf(counterMaxLength)
			}))));
	//   90  174:aload_0         
	//   91  175:getfield        #789 <Field TextView counterView>
	//   92  178:aload_0         
	//   93  179:invokevirtual   #907 <Method Context getContext()>
	//   94  182:getstatic       #1369 <Field int android.support.design.R$string.character_counter_content_description>
	//   95  185:iconst_2        
	//   96  186:anewarray       Object[]
	//   97  189:dup             
	//   98  190:iconst_0        
	//   99  191:iload_1         
	//  100  192:invokestatic    #1362 <Method Integer Integer.valueOf(int)>
	//  101  195:aastore         
	//  102  196:dup             
	//  103  197:iconst_1        
	//  104  198:aload_0         
	//  105  199:getfield        #1087 <Field int counterMaxLength>
	//  106  202:invokestatic    #1362 <Method Integer Integer.valueOf(int)>
	//  107  205:aastore         
	//  108  206:invokevirtual   #1366 <Method String Context.getString(int, Object[])>
	//  109  209:invokevirtual   #1344 <Method void TextView.setContentDescription(CharSequence)>
		}
		if(editText != null && flag1 != counterOverflowed)
	//* 110  212:aload_0         
	//* 111  213:getfield        #485 <Field EditText editText>
	//* 112  216:ifnull          241
	//* 113  219:iload           4
	//* 114  221:aload_0         
	//* 115  222:getfield        #892 <Field boolean counterOverflowed>
	//* 116  225:icmpeq          241
		{
			updateLabelState(false);
	//  117  228:aload_0         
	//  118  229:iconst_0        
	//  119  230:invokevirtual   #1068 <Method void updateLabelState(boolean)>
			updateTextInputBoxState();
	//  120  233:aload_0         
	//  121  234:invokevirtual   #1074 <Method void updateTextInputBoxState()>
			updateEditTextBackground();
	//  122  237:aload_0         
	//  123  238:invokevirtual   #1071 <Method void updateEditTextBackground()>
		}
	//  124  241:return          
	}

	void updateEditTextBackground()
	{
		Object obj = ((Object) (editText));
	//    0    0:aload_0         
	//    1    1:getfield        #485 <Field EditText editText>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		Drawable drawable = ((EditText) (obj)).getBackground();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #493 <Method Drawable EditText.getBackground()>
	//    8   14:astore_2        
		if(drawable == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       20
			return;
	//   11   19:return          
		ensureBackgroundDrawableStateWorkaround();
	//   12   20:aload_0         
	//   13   21:invokespecial   #1371 <Method void ensureBackgroundDrawableStateWorkaround()>
		obj = ((Object) (drawable));
	//   14   24:aload_2         
	//   15   25:astore_1        
		if(DrawableUtils.canSafelyMutateDrawable(drawable))
	//*  16   26:aload_2         
	//*  17   27:invokestatic    #835 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  18   30:ifeq            38
			obj = ((Object) (drawable.mutate()));
	//   19   33:aload_2         
	//   20   34:invokevirtual   #546 <Method Drawable Drawable.mutate()>
	//   21   37:astore_1        
		if(indicatorViewController.errorShouldBeShown())
	//*  22   38:aload_0         
	//*  23   39:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//*  24   42:invokevirtual   #877 <Method boolean IndicatorViewController.errorShouldBeShown()>
	//*  25   45:ifeq            66
		{
			((Drawable) (obj)).setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(indicatorViewController.getErrorViewCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   26   48:aload_1         
	//   27   49:aload_0         
	//   28   50:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   29   53:invokevirtual   #1108 <Method int IndicatorViewController.getErrorViewCurrentTextColor()>
	//   30   56:getstatic       #1376 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   31   59:invokestatic    #1382 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   32   62:invokevirtual   #1386 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			return;
	//   33   65:return          
		}
		if(counterOverflowed)
	//*  34   66:aload_0         
	//*  35   67:getfield        #892 <Field boolean counterOverflowed>
	//*  36   70:ifeq            97
		{
			TextView textview = counterView;
	//   37   73:aload_0         
	//   38   74:getfield        #789 <Field TextView counterView>
	//   39   77:astore_2        
			if(textview != null)
	//*  40   78:aload_2         
	//*  41   79:ifnull          97
			{
				((Drawable) (obj)).setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(textview.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokevirtual   #1389 <Method int TextView.getCurrentTextColor()>
	//   45   87:getstatic       #1376 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   46   90:invokestatic    #1382 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   47   93:invokevirtual   #1386 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
				return;
	//   48   96:return          
			}
		}
		DrawableCompat.clearColorFilter(((Drawable) (obj)));
	//   49   97:aload_1         
	//   50   98:invokestatic    #1392 <Method void DrawableCompat.clearColorFilter(Drawable)>
		editText.refreshDrawableState();
	//   51  101:aload_0         
	//   52  102:getfield        #485 <Field EditText editText>
	//   53  105:invokevirtual   #1395 <Method void EditText.refreshDrawableState()>
	//   54  108:return          
	}

	void updateLabelState(boolean flag)
	{
		updateLabelState(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #810 <Method void updateLabelState(boolean, boolean)>
	//    4    6:return          
	}

	void updateTextInputBoxState()
	{
label0:
		{
label1:
			{
				boolean flag;
				boolean flag1;
label2:
				{
					if(boxBackground == null)
						break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #480 <Field GradientDrawable boxBackground>
	//    2    4:ifnull          215
					if(boxBackgroundMode == 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #487 <Field int boxBackgroundMode>
	//*   5   11:ifne            15
						return;
	//    6   14:return          
					EditText edittext = editText;
	//    7   15:aload_0         
	//    8   16:getfield        #485 <Field EditText editText>
	//    9   19:astore_3        
					flag1 = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
					if(edittext != null && edittext.hasFocus())
	//*  12   22:aload_3         
	//*  13   23:ifnull          38
	//*  14   26:aload_3         
	//*  15   27:invokevirtual   #874 <Method boolean EditText.hasFocus()>
	//*  16   30:ifeq            38
						flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_1        
					else
	//*  19   35:goto            40
						flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_1        
					edittext = editText;
	//   22   40:aload_0         
	//   23   41:getfield        #485 <Field EditText editText>
	//   24   44:astore_3        
					if(edittext == null || !edittext.isHovered())
	//*  25   45:aload_3         
	//*  26   46:ifnull          59
	//*  27   49:aload_3         
	//*  28   50:invokevirtual   #1398 <Method boolean EditText.isHovered()>
	//*  29   53:ifeq            59
	//*  30   56:goto            61
						flag1 = false;
	//   31   59:iconst_0        
	//   32   60:istore_2        
					if(boxBackgroundMode != 2)
						break label1;
	//   33   61:aload_0         
	//   34   62:getfield        #487 <Field int boxBackgroundMode>
	//   35   65:iconst_2        
	//   36   66:icmpne          214
					if(!isEnabled())
	//*  37   69:aload_0         
	//*  38   70:invokevirtual   #871 <Method boolean isEnabled()>
	//*  39   73:ifne            87
					{
						boxStrokeColor = disabledColor;
	//   40   76:aload_0         
	//   41   77:aload_0         
	//   42   78:getfield        #356 <Field int disabledColor>
	//   43   81:putfield        #501 <Field int boxStrokeColor>
						break label2;
	//   44   84:goto            176
					}
					if(indicatorViewController.errorShouldBeShown())
	//*  45   87:aload_0         
	//*  46   88:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//*  47   91:invokevirtual   #877 <Method boolean IndicatorViewController.errorShouldBeShown()>
	//*  48   94:ifeq            111
					{
						boxStrokeColor = indicatorViewController.getErrorViewCurrentTextColor();
	//   49   97:aload_0         
	//   50   98:aload_0         
	//   51   99:getfield        #131 <Field IndicatorViewController indicatorViewController>
	//   52  102:invokevirtual   #1108 <Method int IndicatorViewController.getErrorViewCurrentTextColor()>
	//   53  105:putfield        #501 <Field int boxStrokeColor>
						break label2;
	//   54  108:goto            176
					}
					if(counterOverflowed)
	//*  55  111:aload_0         
	//*  56  112:getfield        #892 <Field boolean counterOverflowed>
	//*  57  115:ifeq            138
					{
						TextView textview = counterView;
	//   58  118:aload_0         
	//   59  119:getfield        #789 <Field TextView counterView>
	//   60  122:astore_3        
						if(textview != null)
	//*  61  123:aload_3         
	//*  62  124:ifnull          138
						{
							boxStrokeColor = textview.getCurrentTextColor();
	//   63  127:aload_0         
	//   64  128:aload_3         
	//   65  129:invokevirtual   #1389 <Method int TextView.getCurrentTextColor()>
	//   66  132:putfield        #501 <Field int boxStrokeColor>
							break label2;
	//   67  135:goto            176
						}
					}
					if(flag)
	//*  68  138:iload_1         
	//*  69  139:ifeq            153
						boxStrokeColor = focusedStrokeColor;
	//   70  142:aload_0         
	//   71  143:aload_0         
	//   72  144:getfield        #300 <Field int focusedStrokeColor>
	//   73  147:putfield        #501 <Field int boxStrokeColor>
					else
	//*  74  150:goto            176
					if(flag1)
	//*  75  153:iload_2         
	//*  76  154:ifeq            168
						boxStrokeColor = hoveredStrokeColor;
	//   77  157:aload_0         
	//   78  158:aload_0         
	//   79  159:getfield        #361 <Field int hoveredStrokeColor>
	//   80  162:putfield        #501 <Field int boxStrokeColor>
					else
	//*  81  165:goto            176
						boxStrokeColor = defaultStrokeColor;
	//   82  168:aload_0         
	//   83  169:aload_0         
	//   84  170:getfield        #351 <Field int defaultStrokeColor>
	//   85  173:putfield        #501 <Field int boxStrokeColor>
				}
				if((flag1 || flag) && isEnabled())
	//*  86  176:iload_2         
	//*  87  177:ifne            184
	//*  88  180:iload_1         
	//*  89  181:ifeq            202
	//*  90  184:aload_0         
	//*  91  185:invokevirtual   #871 <Method boolean isEnabled()>
	//*  92  188:ifeq            202
					boxStrokeWidthPx = boxStrokeWidthFocusedPx;
	//   93  191:aload_0         
	//   94  192:aload_0         
	//   95  193:getfield        #313 <Field int boxStrokeWidthFocusedPx>
	//   96  196:putfield        #315 <Field int boxStrokeWidthPx>
				else
	//*  97  199:goto            210
					boxStrokeWidthPx = boxStrokeWidthDefaultPx;
	//   98  202:aload_0         
	//   99  203:aload_0         
	//  100  204:getfield        #308 <Field int boxStrokeWidthDefaultPx>
	//  101  207:putfield        #315 <Field int boxStrokeWidthPx>
				applyBoxAttributes();
	//  102  210:aload_0         
	//  103  211:invokespecial   #992 <Method void applyBoxAttributes()>
			}
			return;
	//  104  214:return          
		}
	//  105  215:return          
	}

	public static final int BOX_BACKGROUND_FILLED = 1;
	public static final int BOX_BACKGROUND_NONE = 0;
	public static final int BOX_BACKGROUND_OUTLINE = 2;
	private static final int INVALID_MAX_LENGTH = -1;
	private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
	private static final String LOG_TAG = "TextInputLayout";
	private ValueAnimator animator;
	private GradientDrawable boxBackground;
	private int boxBackgroundColor;
	private int boxBackgroundMode;
	private final int boxBottomOffsetPx;
	private final int boxCollapsedPaddingTopPx;
	private float boxCornerRadiusBottomEnd;
	private float boxCornerRadiusBottomStart;
	private float boxCornerRadiusTopEnd;
	private float boxCornerRadiusTopStart;
	private final int boxLabelCutoutPaddingPx;
	private int boxStrokeColor;
	private final int boxStrokeWidthDefaultPx;
	private final int boxStrokeWidthFocusedPx;
	private int boxStrokeWidthPx;
	final CollapsingTextHelper collapsingTextHelper;
	boolean counterEnabled;
	private int counterMaxLength;
	private final int counterOverflowTextAppearance;
	private boolean counterOverflowed;
	private final int counterTextAppearance;
	private TextView counterView;
	private ColorStateList defaultHintTextColor;
	private final int defaultStrokeColor;
	private final int disabledColor;
	EditText editText;
	private Drawable editTextOriginalDrawable;
	private int focusedStrokeColor;
	private ColorStateList focusedTextColor;
	private boolean hasPasswordToggleTintList;
	private boolean hasPasswordToggleTintMode;
	private boolean hasReconstructedEditTextBackground;
	private CharSequence hint;
	private boolean hintAnimationEnabled;
	private boolean hintEnabled;
	private boolean hintExpanded;
	private final int hoveredStrokeColor;
	private boolean inDrawableStateChanged;
	private final IndicatorViewController indicatorViewController;
	private final FrameLayout inputFrame;
	private boolean isProvidingHint;
	private Drawable originalEditTextEndDrawable;
	private CharSequence originalHint;
	private CharSequence passwordToggleContentDesc;
	private Drawable passwordToggleDrawable;
	private Drawable passwordToggleDummyDrawable;
	private boolean passwordToggleEnabled;
	private ColorStateList passwordToggleTintList;
	private android.graphics.PorterDuff.Mode passwordToggleTintMode;
	private CheckableImageButton passwordToggleView;
	private boolean passwordToggledVisible;
	private boolean restoringSavedState;
	private final Rect tmpRect;
	private final RectF tmpRectF;
	private Typeface typeface;


/*
	static boolean access$000(TextInputLayout textinputlayout)
	{
		return textinputlayout.restoringSavedState;
	//    0    0:aload_0         
	//    1    1:getfield        #477 <Field boolean restoringSavedState>
	//    2    4:ireturn         
	}

*/
}
