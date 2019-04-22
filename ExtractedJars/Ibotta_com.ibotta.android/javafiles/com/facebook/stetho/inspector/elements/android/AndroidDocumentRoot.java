// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Application;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.NodeType;

final class AndroidDocumentRoot extends AbstractChainedDescriptor
{

	public AndroidDocumentRoot(Application application)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AbstractChainedDescriptor()>
		mApplication = (Application)Util.throwIfNull(((Object) (application)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #18  <Method Object Util.throwIfNull(Object)>
	//    5    9:checkcast       #20  <Class Application>
	//    6   12:putfield        #22  <Field Application mApplication>
	//    7   15:return          
	}

	protected void onGetChildren(AndroidDocumentRoot androiddocumentroot, Accumulator accumulator)
	{
		accumulator.store(((Object) (mApplication)));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Application mApplication>
	//    3    5:invokeinterface #31  <Method void Accumulator.store(Object)>
	//    4   10:return          
	}

	protected volatile void onGetChildren(Object obj, Accumulator accumulator)
	{
		onGetChildren((AndroidDocumentRoot)obj, accumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class AndroidDocumentRoot>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #36  <Method void onGetChildren(AndroidDocumentRoot, Accumulator)>
	//    5    9:return          
	}

	protected String onGetNodeName(AndroidDocumentRoot androiddocumentroot)
	{
		return "root";
	//    0    0:ldc1            #40  <String "root">
	//    1    2:areturn         
	}

	protected volatile String onGetNodeName(Object obj)
	{
		return onGetNodeName((AndroidDocumentRoot)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class AndroidDocumentRoot>
	//    3    5:invokevirtual   #43  <Method String onGetNodeName(AndroidDocumentRoot)>
	//    4    8:areturn         
	}

	protected NodeType onGetNodeType(AndroidDocumentRoot androiddocumentroot)
	{
		return NodeType.DOCUMENT_NODE;
	//    0    0:getstatic       #51  <Field NodeType NodeType.DOCUMENT_NODE>
	//    1    3:areturn         
	}

	protected volatile NodeType onGetNodeType(Object obj)
	{
		return onGetNodeType((AndroidDocumentRoot)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class AndroidDocumentRoot>
	//    3    5:invokevirtual   #54  <Method NodeType onGetNodeType(AndroidDocumentRoot)>
	//    4    8:areturn         
	}

	private final Application mApplication;
}
