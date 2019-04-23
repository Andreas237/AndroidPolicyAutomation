// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.SimpleArrayMap;

public final class CachedHashCodeArrayMap extends ArrayMap
{

	public CachedHashCodeArrayMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ArrayMap()>
	//    2    4:return          
	}

	public void clear()
	{
		hashCode = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #15  <Field int hashCode>
		super.clear();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void ArrayMap.clear()>
	//    5    9:return          
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field int hashCode>
	//*   2    4:ifne            15
			hashCode = super.hashCode();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #20  <Method int ArrayMap.hashCode()>
	//    6   12:putfield        #15  <Field int hashCode>
		return hashCode;
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field int hashCode>
	//    9   19:ireturn         
	}

	public Object put(Object obj, Object obj1)
	{
		hashCode = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #15  <Field int hashCode>
		return super.put(obj, obj1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #24  <Method Object ArrayMap.put(Object, Object)>
	//    7   11:areturn         
	}

	public void putAll(SimpleArrayMap simplearraymap)
	{
		hashCode = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #15  <Field int hashCode>
		super.putAll(simplearraymap);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #30  <Method void ArrayMap.putAll(SimpleArrayMap)>
	//    6   10:return          
	}

	public Object removeAt(int i)
	{
		hashCode = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #15  <Field int hashCode>
		return super.removeAt(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #35  <Method Object ArrayMap.removeAt(int)>
	//    6   10:areturn         
	}

	public Object setValueAt(int i, Object obj)
	{
		hashCode = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #15  <Field int hashCode>
		return super.setValueAt(i, obj);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #40  <Method Object ArrayMap.setValueAt(int, Object)>
	//    7   11:areturn         
	}

	private int hashCode;
}
