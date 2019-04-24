// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.preference:
//			Preference, PreferenceManager

public abstract class DialogPreference extends Preference
{
	public static interface TargetFragment
	{

		public abstract Preference findPreference(CharSequence charsequence);
	}


	public DialogPreference(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #21  <Method void DialogPreference(Context, AttributeSet)>
	//    4    6:return          
	}

	public DialogPreference(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, TypedArrayUtils.getAttr(context, R.attr.dialogPreferenceStyle, 0x1010091));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getstatic       #27  <Field int R$attr.dialogPreferenceStyle>
	//    5    7:ldc1            #28  <Int 0x1010091>
	//    6    9:invokestatic    #34  <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    7   12:invokespecial   #37  <Method void DialogPreference(Context, AttributeSet, int)>
	//    8   15:return          
	}

	public DialogPreference(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #40  <Method void DialogPreference(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public DialogPreference(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #41  <Method void Preference(Context, AttributeSet, int, int)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.DialogPreference, i, j)));
	//    6    9:aload_1         
	//    7   10:aload_2         
	//    8   11:getstatic       #47  <Field int[] R$styleable.DialogPreference>
	//    9   14:iload_3         
	//   10   15:iload           4
	//   11   17:invokevirtual   #53  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   12   20:astore_1        
		mDialogTitle = ((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.DialogPreference_dialogTitle, R.styleable.DialogPreference_android_dialogTitle)));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:getstatic       #56  <Field int R$styleable.DialogPreference_dialogTitle>
	//   16   26:getstatic       #59  <Field int R$styleable.DialogPreference_android_dialogTitle>
	//   17   29:invokestatic    #63  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   18   32:putfield        #65  <Field CharSequence mDialogTitle>
		if(mDialogTitle == null)
	//*  19   35:aload_0         
	//*  20   36:getfield        #65  <Field CharSequence mDialogTitle>
	//*  21   39:ifnonnull       50
			mDialogTitle = getTitle();
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #69  <Method CharSequence getTitle()>
	//   25   47:putfield        #65  <Field CharSequence mDialogTitle>
		mDialogMessage = ((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.DialogPreference_dialogMessage, R.styleable.DialogPreference_android_dialogMessage)));
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getstatic       #72  <Field int R$styleable.DialogPreference_dialogMessage>
	//   29   55:getstatic       #75  <Field int R$styleable.DialogPreference_android_dialogMessage>
	//   30   58:invokestatic    #63  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   31   61:putfield        #77  <Field CharSequence mDialogMessage>
		mDialogIcon = TypedArrayUtils.getDrawable(((TypedArray) (context)), R.styleable.DialogPreference_dialogIcon, R.styleable.DialogPreference_android_dialogIcon);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getstatic       #80  <Field int R$styleable.DialogPreference_dialogIcon>
	//   35   69:getstatic       #83  <Field int R$styleable.DialogPreference_android_dialogIcon>
	//   36   72:invokestatic    #87  <Method Drawable TypedArrayUtils.getDrawable(TypedArray, int, int)>
	//   37   75:putfield        #89  <Field Drawable mDialogIcon>
		mPositiveButtonText = ((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.DialogPreference_positiveButtonText, R.styleable.DialogPreference_android_positiveButtonText)));
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:getstatic       #92  <Field int R$styleable.DialogPreference_positiveButtonText>
	//   41   83:getstatic       #95  <Field int R$styleable.DialogPreference_android_positiveButtonText>
	//   42   86:invokestatic    #63  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   43   89:putfield        #97  <Field CharSequence mPositiveButtonText>
		mNegativeButtonText = ((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.DialogPreference_negativeButtonText, R.styleable.DialogPreference_android_negativeButtonText)));
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:getstatic       #100 <Field int R$styleable.DialogPreference_negativeButtonText>
	//   47   97:getstatic       #103 <Field int R$styleable.DialogPreference_android_negativeButtonText>
	//   48  100:invokestatic    #63  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   49  103:putfield        #105 <Field CharSequence mNegativeButtonText>
		mDialogLayoutResId = TypedArrayUtils.getResourceId(((TypedArray) (context)), R.styleable.DialogPreference_dialogLayout, R.styleable.DialogPreference_android_dialogLayout, 0);
	//   50  106:aload_0         
	//   51  107:aload_1         
	//   52  108:getstatic       #108 <Field int R$styleable.DialogPreference_dialogLayout>
	//   53  111:getstatic       #111 <Field int R$styleable.DialogPreference_android_dialogLayout>
	//   54  114:iconst_0        
	//   55  115:invokestatic    #115 <Method int TypedArrayUtils.getResourceId(TypedArray, int, int, int)>
	//   56  118:putfield        #117 <Field int mDialogLayoutResId>
		((TypedArray) (context)).recycle();
	//   57  121:aload_1         
	//   58  122:invokevirtual   #123 <Method void TypedArray.recycle()>
	//   59  125:return          
	}

	public Drawable getDialogIcon()
	{
		return mDialogIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Drawable mDialogIcon>
	//    2    4:areturn         
	}

	public int getDialogLayoutResource()
	{
		return mDialogLayoutResId;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int mDialogLayoutResId>
	//    2    4:ireturn         
	}

	public CharSequence getDialogMessage()
	{
		return mDialogMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field CharSequence mDialogMessage>
	//    2    4:areturn         
	}

	public CharSequence getDialogTitle()
	{
		return mDialogTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field CharSequence mDialogTitle>
	//    2    4:areturn         
	}

	public CharSequence getNegativeButtonText()
	{
		return mNegativeButtonText;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CharSequence mNegativeButtonText>
	//    2    4:areturn         
	}

	public CharSequence getPositiveButtonText()
	{
		return mPositiveButtonText;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field CharSequence mPositiveButtonText>
	//    2    4:areturn         
	}

	protected void onClick()
	{
		getPreferenceManager().showDialog(((Preference) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #136 <Method PreferenceManager getPreferenceManager()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #142 <Method void PreferenceManager.showDialog(Preference)>
	//    4    8:return          
	}

	public void setDialogIcon(int i)
	{
		mDialogIcon = ContextCompat.getDrawable(getContext(), i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #148 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #153 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:putfield        #89  <Field Drawable mDialogIcon>
	//    6   12:return          
	}

	public void setDialogIcon(Drawable drawable)
	{
		mDialogIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field Drawable mDialogIcon>
	//    3    5:return          
	}

	public void setDialogLayoutResource(int i)
	{
		mDialogLayoutResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #117 <Field int mDialogLayoutResId>
	//    3    5:return          
	}

	public void setDialogMessage(int i)
	{
		setDialogMessage(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #148 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #159 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #162 <Method void setDialogMessage(CharSequence)>
	//    6   12:return          
	}

	public void setDialogMessage(CharSequence charsequence)
	{
		mDialogMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field CharSequence mDialogMessage>
	//    3    5:return          
	}

	public void setDialogTitle(int i)
	{
		setDialogTitle(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #148 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #159 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #165 <Method void setDialogTitle(CharSequence)>
	//    6   12:return          
	}

	public void setDialogTitle(CharSequence charsequence)
	{
		mDialogTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field CharSequence mDialogTitle>
	//    3    5:return          
	}

	public void setNegativeButtonText(int i)
	{
		setNegativeButtonText(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #148 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #159 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #168 <Method void setNegativeButtonText(CharSequence)>
	//    6   12:return          
	}

	public void setNegativeButtonText(CharSequence charsequence)
	{
		mNegativeButtonText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field CharSequence mNegativeButtonText>
	//    3    5:return          
	}

	public void setPositiveButtonText(int i)
	{
		setPositiveButtonText(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #148 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #159 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #171 <Method void setPositiveButtonText(CharSequence)>
	//    6   12:return          
	}

	public void setPositiveButtonText(CharSequence charsequence)
	{
		mPositiveButtonText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field CharSequence mPositiveButtonText>
	//    3    5:return          
	}

	private Drawable mDialogIcon;
	private int mDialogLayoutResId;
	private CharSequence mDialogMessage;
	private CharSequence mDialogTitle;
	private CharSequence mNegativeButtonText;
	private CharSequence mPositiveButtonText;
}
