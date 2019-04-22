// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ListUtil;
import com.facebook.stetho.common.Util;
import java.util.List;

public final class ElementInfo
{

	public ElementInfo(Object obj, Object obj1, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		element = Util.throwIfNull(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method Object Util.throwIfNull(Object)>
	//    5    9:putfield        #24  <Field Object element>
		parentElement = obj1;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #26  <Field Object parentElement>
		children = ListUtil.copyToImmutableList(list);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokestatic    #32  <Method List ListUtil.copyToImmutableList(List)>
	//   12   22:putfield        #34  <Field List children>
	//   13   25:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj instanceof ElementInfo)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ElementInfo>
	//*   7   11:ifeq            59
		{
			obj = ((Object) ((ElementInfo)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class ElementInfo>
	//   10   18:astore_1        
			return element == ((ElementInfo) (obj)).element && parentElement == ((ElementInfo) (obj)).parentElement && ListUtil.identityEquals(children, ((ElementInfo) (obj)).children);
	//   11   19:aload_0         
	//   12   20:getfield        #24  <Field Object element>
	//   13   23:aload_1         
	//   14   24:getfield        #24  <Field Object element>
	//   15   27:if_acmpne       57
	//   16   30:aload_0         
	//   17   31:getfield        #26  <Field Object parentElement>
	//   18   34:aload_1         
	//   19   35:getfield        #26  <Field Object parentElement>
	//   20   38:if_acmpne       57
	//   21   41:aload_0         
	//   22   42:getfield        #34  <Field List children>
	//   23   45:aload_1         
	//   24   46:getfield        #34  <Field List children>
	//   25   49:invokestatic    #43  <Method boolean ListUtil.identityEquals(List, List)>
	//   26   52:ifeq            57
	//   27   55:iconst_1        
	//   28   56:ireturn         
	//   29   57:iconst_0        
	//   30   58:ireturn         
		} else
		{
			return false;
	//   31   59:iconst_0        
	//   32   60:ireturn         
		}
	}

	public final List children;
	public final Object element;
	public final Object parentElement;
}
