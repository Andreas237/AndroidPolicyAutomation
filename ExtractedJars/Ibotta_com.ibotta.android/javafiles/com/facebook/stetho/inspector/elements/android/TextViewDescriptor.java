// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import java.util.*;

final class TextViewDescriptor extends AbstractChainedDescriptor
{
	private final class ElementContext
		implements TextWatcher
	{

		public void afterTextChanged(Editable editable)
		{
			if(editable.length() == 0)
		//*   0    0:aload_1         
		//*   1    1:invokeinterface #32  <Method int Editable.length()>
		//*   2    6:ifne            28
			{
				getHost().onAttributeRemoved(((Object) (mElement)), "text");
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
				getHost().onAttributeModified(((Object) (mElement)), "text", ((Object) (editable)).toString());
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

		private ElementContext()
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

	}


	TextViewDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void AbstractChainedDescriptor()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class IdentityHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void IdentityHashMap()>
	//    6   12:invokestatic    #30  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #32  <Field Map mElementToContextMap>
	//    8   18:return          
	}

	protected void onGetAttributes(TextView textview, AttributeAccumulator attributeaccumulator)
	{
		textview = ((TextView) (textview.getText()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #48  <Method CharSequence TextView.getText()>
	//    2    4:astore_1        
		if(((CharSequence) (textview)).length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #54  <Method int CharSequence.length()>
	//*   5   11:ifeq            28
			attributeaccumulator.store("text", ((CharSequence) (textview)).toString());
	//    6   14:aload_2         
	//    7   15:ldc1            #14  <String "text">
	//    8   17:aload_1         
	//    9   18:invokeinterface #58  <Method String CharSequence.toString()>
	//   10   23:invokeinterface #64  <Method void AttributeAccumulator.store(String, String)>
	//   11   28:return          
	}

	protected volatile void onGetAttributes(Object obj, AttributeAccumulator attributeaccumulator)
	{
		onGetAttributes((TextView)obj, attributeaccumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #44  <Class TextView>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #67  <Method void onGetAttributes(TextView, AttributeAccumulator)>
	//    5    9:return          
	}

	protected void onHook(TextView textview)
	{
		ElementContext elementcontext = new ElementContext();
	//    0    0:new             #9   <Class TextViewDescriptor$ElementContext>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #72  <Method void TextViewDescriptor$ElementContext(TextViewDescriptor, TextViewDescriptor$1)>
	//    5    9:astore_2        
		elementcontext.hook(textview);
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #75  <Method void TextViewDescriptor$ElementContext.hook(TextView)>
		mElementToContextMap.put(((Object) (textview)), ((Object) (elementcontext)));
	//    9   15:aload_0         
	//   10   16:getfield        #32  <Field Map mElementToContextMap>
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   14   26:pop             
	//   15   27:return          
	}

	protected volatile void onHook(Object obj)
	{
		onHook((TextView)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #44  <Class TextView>
	//    3    5:invokevirtual   #84  <Method void onHook(TextView)>
	//    4    8:return          
	}

	protected void onUnhook(TextView textview)
	{
		((ElementContext)mElementToContextMap.remove(((Object) (textview)))).unhook();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Map mElementToContextMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #89  <Method Object Map.remove(Object)>
	//    4   10:checkcast       #9   <Class TextViewDescriptor$ElementContext>
	//    5   13:invokevirtual   #92  <Method void TextViewDescriptor$ElementContext.unhook()>
	//    6   16:return          
	}

	protected volatile void onUnhook(Object obj)
	{
		onUnhook((TextView)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #44  <Class TextView>
	//    3    5:invokevirtual   #94  <Method void onUnhook(TextView)>
	//    4    8:return          
	}

	private static final String TEXT_ATTRIBUTE_NAME = "text";
	private final Map mElementToContextMap = Collections.synchronizedMap(((Map) (new IdentityHashMap())));


/*
	static com.facebook.stetho.inspector.elements.Descriptor.Host access$100(TextViewDescriptor textviewdescriptor)
	{
		return textviewdescriptor.getHost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method com.facebook.stetho.inspector.elements.Descriptor$Host getHost()>
	//    2    4:areturn         
	}

*/


/*
	static com.facebook.stetho.inspector.elements.Descriptor.Host access$200(TextViewDescriptor textviewdescriptor)
	{
		return textviewdescriptor.getHost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method com.facebook.stetho.inspector.elements.Descriptor$Host getHost()>
	//    2    4:areturn         
	}

*/
}
