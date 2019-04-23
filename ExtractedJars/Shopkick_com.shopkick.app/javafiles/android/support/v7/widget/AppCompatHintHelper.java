// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

// Referenced classes of package android.support.v7.widget:
//			WithHint

class AppCompatHintHelper
{

	private AppCompatHintHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	static InputConnection onCreateInputConnection(InputConnection inputconnection, EditorInfo editorinfo, View view)
	{
		if(inputconnection != null && editorinfo.hintText == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          55
	//*   2    4:aload_1         
	//*   3    5:getfield        #17  <Field CharSequence EditorInfo.hintText>
	//*   4    8:ifnonnull       55
			for(view = ((View) (view.getParent())); view instanceof View; view = ((View) (((ViewParent) (view)).getParent())))
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #23  <Method ViewParent View.getParent()>
	//*   7   15:astore_2        
	//*   8   16:aload_2         
	//*   9   17:instanceof      #19  <Class View>
	//*  10   20:ifeq            55
				if(view instanceof WithHint)
	//*  11   23:aload_2         
	//*  12   24:instanceof      #25  <Class WithHint>
	//*  13   27:ifeq            45
				{
					editorinfo.hintText = ((WithHint)view).getHint();
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:checkcast       #25  <Class WithHint>
	//   17   35:invokeinterface #29  <Method CharSequence WithHint.getHint()>
	//   18   40:putfield        #17  <Field CharSequence EditorInfo.hintText>
					return inputconnection;
	//   19   43:aload_0         
	//   20   44:areturn         
				}

	//   21   45:aload_2         
	//   22   46:invokeinterface #32  <Method ViewParent ViewParent.getParent()>
	//   23   51:astore_2        
	//*  24   52:goto            16
		return inputconnection;
	//   25   55:aload_0         
	//   26   56:areturn         
	}
}
