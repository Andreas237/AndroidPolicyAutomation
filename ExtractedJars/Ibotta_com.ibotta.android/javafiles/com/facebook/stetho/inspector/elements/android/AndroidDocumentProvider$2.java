// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.Window;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.Descriptor;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			AndroidDocumentProvider

class AndroidDocumentProvider$2
	implements Accumulator
{

	public void store(Object obj)
	{
		if(obj instanceof Window)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #30  <Class Window>
	//*   2    4:ifeq            21
		{
			val$accumulator.store(((Object) ((Window)obj)));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Accumulator val$accumulator>
	//    5   11:aload_1         
	//    6   12:checkcast       #30  <Class Window>
	//    7   15:invokeinterface #32  <Method void Accumulator.store(Object)>
			return;
	//    8   20:return          
		}
		Descriptor descriptor = getDescriptor(obj);
	//    9   21:aload_0         
	//   10   22:getfield        #20  <Field AndroidDocumentProvider this$0>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #36  <Method Descriptor AndroidDocumentProvider.getDescriptor(Object)>
	//   13   29:astore_2        
		if(descriptor != null)
	//*  14   30:aload_2         
	//*  15   31:ifnull          40
			descriptor.getChildren(obj, ((Accumulator) (this)));
	//   16   34:aload_2         
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:invokevirtual   #42  <Method void Descriptor.getChildren(Object, Accumulator)>
	//   20   40:return          
	}

	final AndroidDocumentProvider this$0;
	final Accumulator val$accumulator;

	AndroidDocumentProvider$2()
	{
		this$0 = final_androiddocumentprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AndroidDocumentProvider this$0>
		val$accumulator = Accumulator.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Accumulator val$accumulator>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
