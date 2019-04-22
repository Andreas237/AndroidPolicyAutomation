// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Dialog;
import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			HighlightableDescriptor, AndroidDescriptorHost

final class DialogDescriptor extends AbstractChainedDescriptor
	implements HighlightableDescriptor
{

	DialogDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractChainedDescriptor()>
	//    2    4:return          
	}

	public View getViewForHighlighting(Object obj)
	{
		com.facebook.stetho.inspector.elements.Descriptor.Host host = getHost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method com.facebook.stetho.inspector.elements.Descriptor$Host getHost()>
	//    2    4:astore_2        
		if(host instanceof AndroidDescriptorHost)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #21  <Class AndroidDescriptorHost>
	//*   5    9:ifeq            31
		{
			obj = ((Object) ((Dialog)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #23  <Class Dialog>
	//    8   16:astore_1        
			return ((AndroidDescriptorHost)host).getHighlightingView(((Object) (((Dialog) (obj)).getWindow())));
	//    9   17:aload_2         
	//   10   18:checkcast       #21  <Class AndroidDescriptorHost>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #27  <Method android.view.Window Dialog.getWindow()>
	//   13   25:invokeinterface #30  <Method View AndroidDescriptorHost.getHighlightingView(Object)>
	//   14   30:areturn         
		} else
		{
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
		}
	}

	protected void onGetChildren(Dialog dialog, Accumulator accumulator)
	{
		dialog = ((Dialog) (dialog.getWindow()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method android.view.Window Dialog.getWindow()>
	//    2    4:astore_1        
		if(dialog != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			accumulator.store(((Object) (dialog)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #39  <Method void Accumulator.store(Object)>
	//    8   16:return          
	}

	protected volatile void onGetChildren(Object obj, Accumulator accumulator)
	{
		onGetChildren((Dialog)obj, accumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class Dialog>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #44  <Method void onGetChildren(Dialog, Accumulator)>
	//    5    9:return          
	}
}
