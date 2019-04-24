// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.util.Util;

public final class Descriptor
{

	public Descriptor(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		schemeIdUri = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String schemeIdUri>
		value = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String value>
		id = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field String id>
	//   11   19:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          75
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #29  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #29  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((Descriptor)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Descriptor>
	//   16   28:astore_1        
			return Util.areEqual(((Object) (schemeIdUri)), ((Object) (((Descriptor) (obj)).schemeIdUri))) && Util.areEqual(((Object) (value)), ((Object) (((Descriptor) (obj)).value))) && Util.areEqual(((Object) (id)), ((Object) (((Descriptor) (obj)).id)));
	//   17   29:aload_0         
	//   18   30:getfield        #17  <Field String schemeIdUri>
	//   19   33:aload_1         
	//   20   34:getfield        #17  <Field String schemeIdUri>
	//   21   37:invokestatic    #35  <Method boolean Util.areEqual(Object, Object)>
	//   22   40:ifeq            73
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field String value>
	//   25   47:aload_1         
	//   26   48:getfield        #19  <Field String value>
	//   27   51:invokestatic    #35  <Method boolean Util.areEqual(Object, Object)>
	//   28   54:ifeq            73
	//   29   57:aload_0         
	//   30   58:getfield        #21  <Field String id>
	//   31   61:aload_1         
	//   32   62:getfield        #21  <Field String id>
	//   33   65:invokestatic    #35  <Method boolean Util.areEqual(Object, Object)>
	//   34   68:ifeq            73
	//   35   71:iconst_1        
	//   36   72:ireturn         
	//   37   73:iconst_0        
	//   38   74:ireturn         
		} else
		{
			return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
		}
	}

	public int hashCode()
	{
		String s = schemeIdUri;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String schemeIdUri>
	//    2    4:astore          4
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		if(s != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          24
			i = schemeIdUri.hashCode();
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field String schemeIdUri>
	//    9   17:invokevirtual   #41  <Method int String.hashCode()>
	//   10   20:istore_1        
		else
	//*  11   21:goto            26
			i = 0;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		int j;
		if(value != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #19  <Field String value>
	//*  16   30:ifnull          44
			j = value.hashCode();
	//   17   33:aload_0         
	//   18   34:getfield        #19  <Field String value>
	//   19   37:invokevirtual   #41  <Method int String.hashCode()>
	//   20   40:istore_2        
		else
	//*  21   41:goto            46
			j = 0;
	//   22   44:iconst_0        
	//   23   45:istore_2        
		if(id != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #21  <Field String id>
	//*  26   50:ifnull          61
			k = id.hashCode();
	//   27   53:aload_0         
	//   28   54:getfield        #21  <Field String id>
	//   29   57:invokevirtual   #41  <Method int String.hashCode()>
	//   30   60:istore_3        
		return 31 * (i * 31 + j) + k;
	//   31   61:bipush          31
	//   32   63:iload_1         
	//   33   64:bipush          31
	//   34   66:imul            
	//   35   67:iload_2         
	//   36   68:iadd            
	//   37   69:imul            
	//   38   70:iload_3         
	//   39   71:iadd            
	//   40   72:ireturn         
	}

	public final String id;
	public final String schemeIdUri;
	public final String value;
}
