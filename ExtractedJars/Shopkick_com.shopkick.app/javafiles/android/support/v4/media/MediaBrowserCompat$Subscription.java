// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatUtils

private static class MediaBrowserCompat$Subscription
{

	public allback getCallback(Bundle bundle)
	{
		for(int i = 0; i < mOptionsList.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #23  <Field List mOptionsList>
	//*   5    7:invokeinterface #32  <Method int List.size()>
	//*   6   12:icmpge          56
			if(MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), bundle))
	//*   7   15:aload_0         
	//*   8   16:getfield        #23  <Field List mOptionsList>
	//*   9   19:iload_2         
	//*  10   20:invokeinterface #36  <Method Object List.get(int)>
	//*  11   25:checkcast       #38  <Class Bundle>
	//*  12   28:aload_1         
	//*  13   29:invokestatic    #44  <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
	//*  14   32:ifeq            49
				return (allback)mCallbacks.get(i);
	//   15   35:aload_0         
	//   16   36:getfield        #21  <Field List mCallbacks>
	//   17   39:iload_2         
	//   18   40:invokeinterface #36  <Method Object List.get(int)>
	//   19   45:checkcast       #46  <Class MediaBrowserCompat$SubscriptionCallback>
	//   20   48:areturn         

	//   21   49:iload_2         
	//   22   50:iconst_1        
	//   23   51:iadd            
	//   24   52:istore_2        
	//*  25   53:goto            2
		return null;
	//   26   56:aconst_null     
	//   27   57:areturn         
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
	//    2    4:invokeinterface #56  <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public void putCallback(Bundle bundle, allback allback)
	{
		for(int i = 0; i < mOptionsList.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #23  <Field List mOptionsList>
	//*   5    7:invokeinterface #32  <Method int List.size()>
	//*   6   12:icmpge          55
			if(MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), bundle))
	//*   7   15:aload_0         
	//*   8   16:getfield        #23  <Field List mOptionsList>
	//*   9   19:iload_3         
	//*  10   20:invokeinterface #36  <Method Object List.get(int)>
	//*  11   25:checkcast       #38  <Class Bundle>
	//*  12   28:aload_1         
	//*  13   29:invokestatic    #44  <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
	//*  14   32:ifeq            48
			{
				mCallbacks.set(i, ((Object) (allback)));
	//   15   35:aload_0         
	//   16   36:getfield        #21  <Field List mCallbacks>
	//   17   39:iload_3         
	//   18   40:aload_2         
	//   19   41:invokeinterface #62  <Method Object List.set(int, Object)>
	//   20   46:pop             
				return;
	//   21   47:return          
			}

	//   22   48:iload_3         
	//   23   49:iconst_1        
	//   24   50:iadd            
	//   25   51:istore_3        
	//*  26   52:goto            2
		mCallbacks.add(((Object) (allback)));
	//   27   55:aload_0         
	//   28   56:getfield        #21  <Field List mCallbacks>
	//   29   59:aload_2         
	//   30   60:invokeinterface #66  <Method boolean List.add(Object)>
	//   31   65:pop             
		mOptionsList.add(((Object) (bundle)));
	//   32   66:aload_0         
	//   33   67:getfield        #23  <Field List mOptionsList>
	//   34   70:aload_1         
	//   35   71:invokeinterface #66  <Method boolean List.add(Object)>
	//   36   76:pop             
	//   37   77:return          
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
