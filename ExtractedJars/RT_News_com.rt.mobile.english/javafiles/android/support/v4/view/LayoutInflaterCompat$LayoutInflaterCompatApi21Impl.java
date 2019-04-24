// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//			LayoutInflaterCompat, LayoutInflaterFactory

static class LayoutInflaterCompat$LayoutInflaterCompatApi21Impl extends LayoutInflaterCompat.LayoutInflaterCompatBaseImpl
{

	public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
	{
		if(layoutinflaterfactory != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          16
			layoutinflaterfactory = ((LayoutInflaterFactory) (new LayoutInflaterCompat.Factory2Wrapper(layoutinflaterfactory)));
	//    2    4:new             #19  <Class LayoutInflaterCompat$Factory2Wrapper>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #22  <Method void LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			layoutinflaterfactory = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		layoutinflater.setFactory2(((android.view.LayoutInflater.Factory2) (layoutinflaterfactory)));
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #28  <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
	//   13   23:return          
	}

	public void setFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
	{
		layoutinflater.setFactory2(factory2);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #28  <Method void LayoutInflater.setFactory2(android.view.LayoutInflater$Factory2)>
	//    3    5:return          
	}

	LayoutInflaterCompat$LayoutInflaterCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void LayoutInflaterCompat$LayoutInflaterCompatBaseImpl()>
	//    2    4:return          
	}
}
