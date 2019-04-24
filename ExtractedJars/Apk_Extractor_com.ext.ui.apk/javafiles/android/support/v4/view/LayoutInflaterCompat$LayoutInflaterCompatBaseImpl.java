// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//			LayoutInflaterCompat, LayoutInflaterFactory

static class LayoutInflaterCompat$LayoutInflaterCompatBaseImpl
{

	public LayoutInflaterFactory getFactory(LayoutInflater layoutinflater)
	{
		layoutinflater = ((LayoutInflater) (layoutinflater.getFactory()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #19  <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//    2    4:astore_1        
		if(layoutinflater instanceof LayoutInflaterCompat.Factory2Wrapper)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #21  <Class LayoutInflaterCompat$Factory2Wrapper>
	//*   5    9:ifeq            20
			return ((LayoutInflaterCompat.Factory2Wrapper)layoutinflater).mDelegateFactory;
	//    6   12:aload_1         
	//    7   13:checkcast       #21  <Class LayoutInflaterCompat$Factory2Wrapper>
	//    8   16:getfield        #25  <Field LayoutInflaterFactory LayoutInflaterCompat$Factory2Wrapper.mDelegateFactory>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
	{
		if(layoutinflaterfactory != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          20
			layoutinflaterfactory = ((LayoutInflaterFactory) (new LayoutInflaterCompat.Factory2Wrapper(layoutinflaterfactory)));
	//    2    4:new             #21  <Class LayoutInflaterCompat$Factory2Wrapper>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #30  <Method void LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #34  <Method void setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
	//*  11   19:return          
			layoutinflaterfactory = null;
	//   12   20:aconst_null     
	//   13   21:astore_2        
		setFactory2(layoutinflater, ((android.view.LayoutInflater.Factory2) (layoutinflaterfactory)));
	//*  14   22:goto            13
	}

	public void setFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
	{
		layoutinflater.setFactory2(factory2);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #37  <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
		android.view.LayoutInflater.Factory factory = layoutinflater.getFactory();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #19  <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//    5    9:astore_3        
		if(factory instanceof android.view.LayoutInflater.Factory2)
	//*   6   10:aload_3         
	//*   7   11:instanceof      #39  <Class android.view.LayoutInflater$Factory2>
	//*   8   14:ifeq            26
		{
			LayoutInflaterCompat.forceSetFactory2(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:checkcast       #39  <Class android.view.LayoutInflater$Factory2>
	//   12   22:invokestatic    #42  <Method void LayoutInflaterCompat.forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return;
	//   13   25:return          
		} else
		{
			LayoutInflaterCompat.forceSetFactory2(layoutinflater, factory2);
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokestatic    #42  <Method void LayoutInflaterCompat.forceSetFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return;
	//   17   31:return          
		}
	}

	LayoutInflaterCompat$LayoutInflaterCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
