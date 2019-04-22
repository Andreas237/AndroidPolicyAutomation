// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.Util;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Descriptor, ChainedDescriptor, AttributeAccumulator, NodeType, 
//			StyleAccumulator

public abstract class AbstractChainedDescriptor extends Descriptor
	implements ChainedDescriptor
{

	public AbstractChainedDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Descriptor()>
	//    2    4:return          
	}

	public final void getAttributes(Object obj, AttributeAccumulator attributeaccumulator)
	{
		mSuper.getAttributes(obj, attributeaccumulator);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #20  <Method void Descriptor.getAttributes(Object, AttributeAccumulator)>
		onGetAttributes(obj, attributeaccumulator);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #23  <Method void onGetAttributes(Object, AttributeAccumulator)>
	//    9   15:return          
	}

	public final void getChildren(Object obj, Accumulator accumulator)
	{
		mSuper.getChildren(obj, accumulator);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #27  <Method void Descriptor.getChildren(Object, Accumulator)>
		onGetChildren(obj, accumulator);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #30  <Method void onGetChildren(Object, Accumulator)>
	//    9   15:return          
	}

	public final String getLocalName(Object obj)
	{
		return onGetLocalName(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #37  <Method String onGetLocalName(Object)>
	//    3    5:areturn         
	}

	public final String getNodeName(Object obj)
	{
		return onGetNodeName(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method String onGetNodeName(Object)>
	//    3    5:areturn         
	}

	public final NodeType getNodeType(Object obj)
	{
		return onGetNodeType(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #46  <Method NodeType onGetNodeType(Object)>
	//    3    5:areturn         
	}

	public final String getNodeValue(Object obj)
	{
		return onGetNodeValue(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method String onGetNodeValue(Object)>
	//    3    5:areturn         
	}

	public final void getStyles(Object obj, StyleAccumulator styleaccumulator)
	{
		mSuper.getStyles(obj, styleaccumulator);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #54  <Method void Descriptor.getStyles(Object, StyleAccumulator)>
		onGetStyles(obj, styleaccumulator);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #57  <Method void onGetStyles(Object, StyleAccumulator)>
	//    9   15:return          
	}

	final Descriptor getSuper()
	{
		return mSuper;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Descriptor mSuper>
	//    2    4:areturn         
	}

	public final void hook(Object obj)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method void verifyThreadAccess()>
		mSuper.hook(obj);
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Descriptor mSuper>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #66  <Method void Descriptor.hook(Object)>
		onHook(obj);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #69  <Method void onHook(Object)>
	//    9   17:return          
	}

	protected void onGetAttributes(Object obj, AttributeAccumulator attributeaccumulator)
	{
	//    0    0:return          
	}

	protected void onGetChildren(Object obj, Accumulator accumulator)
	{
	//    0    0:return          
	}

	protected String onGetLocalName(Object obj)
	{
		return mSuper.getLocalName(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method String Descriptor.getLocalName(Object)>
	//    4    8:areturn         
	}

	protected String onGetNodeName(Object obj)
	{
		return mSuper.getNodeName(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method String Descriptor.getNodeName(Object)>
	//    4    8:areturn         
	}

	protected NodeType onGetNodeType(Object obj)
	{
		return mSuper.getNodeType(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #78  <Method NodeType Descriptor.getNodeType(Object)>
	//    4    8:areturn         
	}

	public String onGetNodeValue(Object obj)
	{
		return mSuper.getNodeValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #82  <Method String Descriptor.getNodeValue(Object)>
	//    4    8:areturn         
	}

	protected void onGetStyles(Object obj, StyleAccumulator styleaccumulator)
	{
	//    0    0:return          
	}

	protected void onHook(Object obj)
	{
	//    0    0:return          
	}

	protected void onSetAttributesAsText(Object obj, String s)
	{
		mSuper.setAttributesAsText(obj, s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #90  <Method void Descriptor.setAttributesAsText(Object, String)>
	//    5    9:return          
	}

	protected void onUnhook(Object obj)
	{
	//    0    0:return          
	}

	public final void setAttributesAsText(Object obj, String s)
	{
		onSetAttributesAsText(obj, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #94  <Method void onSetAttributesAsText(Object, String)>
	//    4    6:return          
	}

	public void setSuper(Descriptor descriptor)
	{
		Util.throwIfNull(((Object) (descriptor)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #102 <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Descriptor descriptor1 = mSuper;
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field Descriptor mSuper>
	//    5    9:astore_2        
		if(descriptor != descriptor1)
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:if_acmpeq       33
		{
			if(descriptor1 == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       25
			{
				mSuper = descriptor;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #18  <Field Descriptor mSuper>
				return;
	//   14   24:return          
			} else
			{
				throw new IllegalStateException();
	//   15   25:new             #104 <Class IllegalStateException>
	//   16   28:dup             
	//   17   29:invokespecial   #105 <Method void IllegalStateException()>
	//   18   32:athrow          
			}
		} else
		{
			return;
	//   19   33:return          
		}
	}

	public final void unhook(Object obj)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method void verifyThreadAccess()>
		onUnhook(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #108 <Method void onUnhook(Object)>
		mSuper.unhook(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Descriptor mSuper>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #110 <Method void Descriptor.unhook(Object)>
	//    9   17:return          
	}

	private Descriptor mSuper;
}
