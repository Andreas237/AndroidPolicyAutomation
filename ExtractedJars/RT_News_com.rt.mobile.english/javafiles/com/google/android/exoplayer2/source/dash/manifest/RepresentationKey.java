// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;


public final class RepresentationKey
	implements Comparable
{

	public RepresentationKey(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		periodIndex = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int periodIndex>
		adaptationSetIndex = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int adaptationSetIndex>
		representationIndex = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field int representationIndex>
	//   11   19:return          
	}

	public int compareTo(RepresentationKey representationkey)
	{
		int j = periodIndex - representationkey.periodIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int periodIndex>
	//    2    4:aload_1         
	//    3    5:getfield        #18  <Field int periodIndex>
	//    4    8:isub            
	//    5    9:istore_3        
		int i = j;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(j == 0)
	//*   8   12:iload_3         
	//*   9   13:ifne            42
		{
			int k = adaptationSetIndex - representationkey.adaptationSetIndex;
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field int adaptationSetIndex>
	//   12   20:aload_1         
	//   13   21:getfield        #20  <Field int adaptationSetIndex>
	//   14   24:isub            
	//   15   25:istore_3        
			i = k;
	//   16   26:iload_3         
	//   17   27:istore_2        
			if(k == 0)
	//*  18   28:iload_3         
	//*  19   29:ifne            42
				i = representationIndex - representationkey.representationIndex;
	//   20   32:aload_0         
	//   21   33:getfield        #22  <Field int representationIndex>
	//   22   36:aload_1         
	//   23   37:getfield        #22  <Field int representationIndex>
	//   24   40:isub            
	//   25   41:istore_2        
		}
		return i;
	//   26   42:iload_2         
	//   27   43:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((RepresentationKey)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class RepresentationKey>
	//    3    5:invokevirtual   #30  <Method int compareTo(RepresentationKey)>
	//    4    8:ireturn         
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
	//*   6    8:ifnull          66
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #37  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #37  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((RepresentationKey)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class RepresentationKey>
	//   16   28:astore_1        
			return periodIndex == ((RepresentationKey) (obj)).periodIndex && adaptationSetIndex == ((RepresentationKey) (obj)).adaptationSetIndex && representationIndex == ((RepresentationKey) (obj)).representationIndex;
	//   17   29:aload_0         
	//   18   30:getfield        #18  <Field int periodIndex>
	//   19   33:aload_1         
	//   20   34:getfield        #18  <Field int periodIndex>
	//   21   37:icmpne          64
	//   22   40:aload_0         
	//   23   41:getfield        #20  <Field int adaptationSetIndex>
	//   24   44:aload_1         
	//   25   45:getfield        #20  <Field int adaptationSetIndex>
	//   26   48:icmpne          64
	//   27   51:aload_0         
	//   28   52:getfield        #22  <Field int representationIndex>
	//   29   55:aload_1         
	//   30   56:getfield        #22  <Field int representationIndex>
	//   31   59:icmpne          64
	//   32   62:iconst_1        
	//   33   63:ireturn         
	//   34   64:iconst_0        
	//   35   65:ireturn         
		} else
		{
			return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		}
	}

	public int hashCode()
	{
		return 31 * (periodIndex * 31 + adaptationSetIndex) + representationIndex;
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:getfield        #18  <Field int periodIndex>
	//    3    6:bipush          31
	//    4    8:imul            
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field int adaptationSetIndex>
	//    7   13:iadd            
	//    8   14:imul            
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field int representationIndex>
	//   11   19:iadd            
	//   12   20:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #43  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(periodIndex);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field int periodIndex>
	//    7   13:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//    8   16:pop             
		stringbuilder.append(".");
	//    9   17:aload_1         
	//   10   18:ldc1            #50  <String ".">
	//   11   20:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(adaptationSetIndex);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #20  <Field int adaptationSetIndex>
	//   16   29:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		stringbuilder.append(".");
	//   18   33:aload_1         
	//   19   34:ldc1            #50  <String ".">
	//   20   36:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(representationIndex);
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #22  <Field int representationIndex>
	//   25   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public final int adaptationSetIndex;
	public final int periodIndex;
	public final int representationIndex;
}
