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
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void AppCompatEditText(Context)>
	//    3    5:return          
	}

	public TextInputEditText(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void AppCompatEditText(Context, AttributeSet)>
	//    4    6:return          
	}

	public TextInputEditText(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #15  <Method void AppCompatEditText(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public InputConnection onCreateInputConnection(EditorInfo editorinfo)
	{
		InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method InputConnection AppCompatEditText.onCreateInputConnection(EditorInfo)>
	//    3    5:astore_3        
		if(inputconnection == null || editorinfo.hintText != null) goto _L2; else goto _L1
	//    4    6:aload_3         
	//    5    7:ifnull          47
	//    6   10:aload_1         
	//    7   11:getfield        #25  <Field CharSequence EditorInfo.hintText>
	//    8   14:ifnonnull       47
_L1:
		ViewParent viewparent = getParent();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #29  <Method ViewParent getParent()>
	//   11   21:astore_2        
_L7:
		if(!(viewparent instanceof View)) goto _L2; else goto _L3
	//   12   22:aload_2         
	//   13   23:instanceof      #31  <Class View>
	//   14   26:ifeq            47
_L3:
		if(!(viewparent instanceof TextInputLayout)) goto _L5; else goto _L4
	//   15   29:aload_2         
	//   16   30:instanceof      #33  <Class TextInputLayout>
	//   17   33:ifeq            49
_L4:
		editorinfo.hintText = ((TextInputLayout)viewparent).getHint();
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:checkcast       #33  <Class TextInputLayout>
	//   21   41:invokevirtual   #37  <Method CharSequence TextInputLayout.getHint()>
	//   22   44:putfield        #25  <Field CharSequence EditorInfo.hintText>
_L2:
		return inputconnection;
	//   23   47:aload_3         
	//   24   48:areturn         
_L5:
		viewparent = viewparent.getParent();
	//   25   49:aload_2         
	//   26   50:invokeinterface #40  <Method ViewParent ViewParent.getParent()>
	//   27   55:astore_2        
		if(true) goto _L7; else goto _L6
	//   28   56:goto            22
_L6:
	}
}
