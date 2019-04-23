// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw

public final class blb
{

	public blb(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field String b>
		c = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #19  <Field String c>
	//   11   19:return          
	}

	public final boolean equals(Object obj)
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
	//*   8   12:invokevirtual   #26  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #26  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((blb)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class blb>
	//   16   28:astore_1        
			return bnw.a(((Object) (a)), ((Object) (((blb) (obj)).a))) && bnw.a(((Object) (b)), ((Object) (((blb) (obj)).b))) && bnw.a(((Object) (c)), ((Object) (((blb) (obj)).c)));
	//   17   29:aload_0         
	//   18   30:getfield        #15  <Field String a>
	//   19   33:aload_1         
	//   20   34:getfield        #15  <Field String a>
	//   21   37:invokestatic    #31  <Method boolean bnw.a(Object, Object)>
	//   22   40:ifeq            73
	//   23   43:aload_0         
	//   24   44:getfield        #17  <Field String b>
	//   25   47:aload_1         
	//   26   48:getfield        #17  <Field String b>
	//   27   51:invokestatic    #31  <Method boolean bnw.a(Object, Object)>
	//   28   54:ifeq            73
	//   29   57:aload_0         
	//   30   58:getfield        #19  <Field String c>
	//   31   61:aload_1         
	//   32   62:getfield        #19  <Field String c>
	//   33   65:invokestatic    #31  <Method boolean bnw.a(Object, Object)>
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

	public final int hashCode()
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String a>
	//    2    4:astore          4
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		if(s != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          22
			i = s.hashCode();
	//    7   13:aload           4
	//    8   15:invokevirtual   #37  <Method int String.hashCode()>
	//    9   18:istore_1        
		else
	//*  10   19:goto            24
			i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		s = b;
	//   13   24:aload_0         
	//   14   25:getfield        #17  <Field String b>
	//   15   28:astore          4
		int j;
		if(s != null)
	//*  16   30:aload           4
	//*  17   32:ifnull          44
			j = s.hashCode();
	//   18   35:aload           4
	//   19   37:invokevirtual   #37  <Method int String.hashCode()>
	//   20   40:istore_2        
		else
	//*  21   41:goto            46
			j = 0;
	//   22   44:iconst_0        
	//   23   45:istore_2        
		s = c;
	//   24   46:aload_0         
	//   25   47:getfield        #19  <Field String c>
	//   26   50:astore          4
		if(s != null)
	//*  27   52:aload           4
	//*  28   54:ifnull          63
			k = s.hashCode();
	//   29   57:aload           4
	//   30   59:invokevirtual   #37  <Method int String.hashCode()>
	//   31   62:istore_3        
		return (i * 31 + j) * 31 + k;
	//   32   63:iload_1         
	//   33   64:bipush          31
	//   34   66:imul            
	//   35   67:iload_2         
	//   36   68:iadd            
	//   37   69:bipush          31
	//   38   71:imul            
	//   39   72:iload_3         
	//   40   73:iadd            
	//   41   74:ireturn         
	}

	public final String a;
	public final String b;
	private final String c;
}
