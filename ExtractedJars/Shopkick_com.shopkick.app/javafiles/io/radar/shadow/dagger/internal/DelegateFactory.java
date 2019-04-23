// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Factory

public final class DelegateFactory
	implements Factory
{

	public DelegateFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public Object get()
	{
		Provider provider = _flddelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Provider _flddelegate>
	//    2    4:astore_1        
		if(provider != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return provider.get();
	//    5    9:aload_1         
	//    6   10:invokeinterface #23  <Method Object Provider.get()>
	//    7   15:areturn         
		else
			throw new IllegalStateException();
	//    8   16:new             #25  <Class IllegalStateException>
	//    9   19:dup             
	//   10   20:invokespecial   #26  <Method void IllegalStateException()>
	//   11   23:athrow          
	}

	public void setDelegatedProvider(Provider provider)
	{
		if(provider != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
		{
			if(_flddelegate == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field Provider _flddelegate>
	//*   4    8:ifnonnull       17
			{
				_flddelegate = provider;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #19  <Field Provider _flddelegate>
				return;
	//    8   16:return          
			} else
			{
				throw new IllegalStateException();
	//    9   17:new             #25  <Class IllegalStateException>
	//   10   20:dup             
	//   11   21:invokespecial   #26  <Method void IllegalStateException()>
	//   12   24:athrow          
			}
		} else
		{
			throw new IllegalArgumentException();
	//   13   25:new             #32  <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:invokespecial   #33  <Method void IllegalArgumentException()>
	//   16   32:athrow          
		}
	}

	private Provider _flddelegate;
}
