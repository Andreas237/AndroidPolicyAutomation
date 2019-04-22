// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.facebook.stetho.common.Util;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			TextViewDescriptor

private final class TextViewDescriptor$ElementContext
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		if(editable.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #32  <Method int Editable.length()>
	//*   2    6:ifne            28
		{
			TextViewDescriptor.access$100(TextViewDescriptor.this).onAttributeRemoved(((Object) (mElement)), "text");
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field TextViewDescriptor this$0>
	//    5   13:invokestatic    #36  <Method com.facebook.stetho.inspector.elements.Descriptor$Host TextViewDescriptor.access$100(TextViewDescriptor)>
	//    6   16:aload_0         
	//    7   17:getfield        #38  <Field TextView mElement>
	//    8   20:ldc1            #40  <String "text">
	//    9   22:invokeinterface #46  <Method void com.facebook.stetho.inspector.elements.Descriptor$Host.onAttributeRemoved(Object, String)>
			return;
	//   10   27:return          
		} else
		{
			TextViewDescriptor.access$200(TextViewDescriptor.this).onAttributeModified(((Object) (mElement)), "text", ((Object) (editable)).toString());
	//   11   28:aload_0         
	//   12   29:getfield        #17  <Field TextViewDescriptor this$0>
	//   13   32:invokestatic    #49  <Method com.facebook.stetho.inspector.elements.Descriptor$Host TextViewDescriptor.access$200(TextViewDescriptor)>
	//   14   35:aload_0         
	//   15   36:getfield        #38  <Field TextView mElement>
	//   16   39:ldc1            #40  <String "text">
	//   17   41:aload_1         
	//   18   42:invokevirtual   #53  <Method String Object.toString()>
	//   19   45:invokeinterface #57  <Method void com.facebook.stetho.inspector.elements.Descriptor$Host.onAttributeModified(Object, String, String)>
			return;
	//   20   50:return          
		}
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void hook(TextView textview)
	{
		mElement = (TextView)Util.throwIfNull(((Object) (textview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #67  <Method Object Util.throwIfNull(Object)>
	//    3    5:checkcast       #69  <Class TextView>
	//    4    8:putfield        #38  <Field TextView mElement>
		mElement.addTextChangedListener(((TextWatcher) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field TextView mElement>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #73  <Method void TextView.addTextChangedListener(TextWatcher)>
	//    9   19:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void unhook()
	{
		TextView textview = mElement;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field TextView mElement>
	//    2    4:astore_1        
		if(textview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			textview.removeTextChangedListener(((TextWatcher) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #78  <Method void TextView.removeTextChangedListener(TextWatcher)>
			mElement = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #38  <Field TextView mElement>
		}
	//   11   19:return          
	}

	private TextView mElement;
	final TextViewDescriptor this$0;

	private TextViewDescriptor$ElementContext()
	{
		this$0 = TextViewDescriptor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TextViewDescriptor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	TextViewDescriptor$ElementContext(TextViewDescriptor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void TextViewDescriptor$ElementContext(TextViewDescriptor)>
	//    3    5:return          
	}
}
