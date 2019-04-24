// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatUtils

private static class MediaBrowserCompat$Subscription
{

	public allback getCallback(Context context, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			bundle.setClassLoader(context.getClassLoader());
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method ClassLoader Context.getClassLoader()>
	//    5    9:invokevirtual   #38  <Method void Bundle.setClassLoader(ClassLoader)>
		for(int i = 0; i < mOptionsList.size(); i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_3        
	//*   8   14:iload_3         
	//*   9   15:aload_0         
	//*  10   16:getfield        #23  <Field List mOptionsList>
	//*  11   19:invokeinterface #44  <Method int List.size()>
	//*  12   24:icmpge          68
			if(MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), bundle))
	//*  13   27:aload_0         
	//*  14   28:getfield        #23  <Field List mOptionsList>
	//*  15   31:iload_3         
	//*  16   32:invokeinterface #48  <Method Object List.get(int)>
	//*  17   37:checkcast       #34  <Class Bundle>
	//*  18   40:aload_2         
	//*  19   41:invokestatic    #54  <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
	//*  20   44:ifeq            61
				return (allback)mCallbacks.get(i);
	//   21   47:aload_0         
	//   22   48:getfield        #21  <Field List mCallbacks>
	//   23   51:iload_3         
	//   24   52:invokeinterface #48  <Method Object List.get(int)>
	//   25   57:checkcast       #56  <Class MediaBrowserCompat$SubscriptionCallback>
	//   26   60:areturn         

	//   27   61:iload_3         
	//   28   62:iconst_1        
	//   29   63:iadd            
	//   30   64:istore_3        
	//*  31   65:goto            14
		return null;
	//   32   68:aconst_null     
	//   33   69:areturn         
	}

	public List getCallbacks()
	{
		return mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mCallbacks>
	//    2    4:areturn         
	}

	public List getOptionsList()
	{
		return mOptionsList;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List mOptionsList>
	//    2    4:areturn         
	}

	public boolean isEmpty()
	{
		return mCallbacks.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mCallbacks>
	//    2    4:invokeinterface #66  <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public void putCallback(Context context, Bundle bundle, allback allback)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			bundle.setClassLoader(context.getClassLoader());
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method ClassLoader Context.getClassLoader()>
	//    5    9:invokevirtual   #38  <Method void Bundle.setClassLoader(ClassLoader)>
		for(int i = 0; i < mOptionsList.size(); i++)
	//*   6   12:iconst_0        
	//*   7   13:istore          4
	//*   8   15:iload           4
	//*   9   17:aload_0         
	//*  10   18:getfield        #23  <Field List mOptionsList>
	//*  11   21:invokeinterface #44  <Method int List.size()>
	//*  12   26:icmpge          73
			if(MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), bundle))
	//*  13   29:aload_0         
	//*  14   30:getfield        #23  <Field List mOptionsList>
	//*  15   33:iload           4
	//*  16   35:invokeinterface #48  <Method Object List.get(int)>
	//*  17   40:checkcast       #34  <Class Bundle>
	//*  18   43:aload_2         
	//*  19   44:invokestatic    #54  <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
	//*  20   47:ifeq            64
			{
				mCallbacks.set(i, ((Object) (allback)));
	//   21   50:aload_0         
	//   22   51:getfield        #21  <Field List mCallbacks>
	//   23   54:iload           4
	//   24   56:aload_3         
	//   25   57:invokeinterface #72  <Method Object List.set(int, Object)>
	//   26   62:pop             
				return;
	//   27   63:return          
			}

	//   28   64:iload           4
	//   29   66:iconst_1        
	//   30   67:iadd            
	//   31   68:istore          4
	//*  32   70:goto            15
		mCallbacks.add(((Object) (allback)));
	//   33   73:aload_0         
	//   34   74:getfield        #21  <Field List mCallbacks>
	//   35   77:aload_3         
	//   36   78:invokeinterface #76  <Method boolean List.add(Object)>
	//   37   83:pop             
		mOptionsList.add(((Object) (bundle)));
	//   38   84:aload_0         
	//   39   85:getfield        #23  <Field List mOptionsList>
	//   40   88:aload_2         
	//   41   89:invokeinterface #76  <Method boolean List.add(Object)>
	//   42   94:pop             
	//   43   95:return          
	}

	private final List mCallbacks = new ArrayList();
	private final List mOptionsList = new ArrayList();

	public MediaBrowserCompat$Subscription()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field List mCallbacks>
	//    7   15:aload_0         
	//    8   16:new             #18  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #19  <Method void ArrayList()>
	//   11   23:putfield        #23  <Field List mOptionsList>
	//   12   26:return          
	}
}
