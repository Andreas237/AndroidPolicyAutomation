// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

public class TextInputEditText extends AppCompatEditText
{

	public TextInputEditText(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #9   <Method void TextInputEditText(Context, AttributeSet)>
	//    4    6:return          
	}

	public TextInputEditText(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.design.R.attr.editTextStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #16  <Field int android.support.design.R$attr.editTextStyle>
	//    4    6:invokespecial   #19  <Method void TextInputEditText(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public TextInputEditText(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #20  <Method void AppCompatEditText(Context, AttributeSet, int)>
	//    5    7:return          
	}

	private CharSequence getHintFromLayout()
	{
		TextInputLayout textinputlayout = getTextInputLayout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method TextInputLayout getTextInputLayout()>
	//    2    4:astore_1        
		if(textinputlayout != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return textinputlayout.getHint();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #32  <Method CharSequence TextInputLayout.getHint()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	private TextInputLayout getTextInputLayout()
	{
		for(ViewParent viewparent = getParent(); viewparent instanceof View; viewparent = viewparent.getParent())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method ViewParent getParent()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:instanceof      #39  <Class View>
	//*   5    9:ifeq            34
			if(viewparent instanceof TextInputLayout)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #29  <Class TextInputLayout>
	//*   8   16:ifeq            24
				return (TextInputLayout)viewparent;
	//    9   19:aload_1         
	//   10   20:checkcast       #29  <Class TextInputLayout>
	//   11   23:areturn         

	//   12   24:aload_1         
	//   13   25:invokeinterface #42  <Method ViewParent ViewParent.getParent()>
	//   14   30:astore_1        
	//*  15   31:goto            5
		return null;
	//   16   34:aconst_null     
	//   17   35:areturn         
	}

	public CharSequence getHint()
	{
		TextInputLayout textinputlayout = getTextInputLayout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method TextInputLayout getTextInputLayout()>
	//    2    4:astore_1        
		if(textinputlayout != null && textinputlayout.isProvidingHint())
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #46  <Method boolean TextInputLayout.isProvidingHint()>
	//*   7   13:ifeq            21
			return textinputlayout.getHint();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #32  <Method CharSequence TextInputLayout.getHint()>
	//   10   20:areturn         
		else
			return super.getHint();
	//   11   21:aload_0         
	//   12   22:invokespecial   #47  <Method CharSequence AppCompatEditText.getHint()>
	//   13   25:areturn         
	}

	public InputConnection onCreateInputConnection(EditorInfo editorinfo)
	{
		InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method InputConnection AppCompatEditText.onCreateInputConnection(EditorInfo)>
	//    3    5:astore_2        
		if(inputconnection != null && editorinfo.hintText == null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          25
	//*   6   10:aload_1         
	//*   7   11:getfield        #57  <Field CharSequence EditorInfo.hintText>
	//*   8   14:ifnonnull       25
			editorinfo.hintText = getHintFromLayout();
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokespecial   #59  <Method CharSequence getHintFromLayout()>
	//   12   22:putfield        #57  <Field CharSequence EditorInfo.hintText>
		return inputconnection;
	//   13   25:aload_2         
	//   14   26:areturn         
	}
}
