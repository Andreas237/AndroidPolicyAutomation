// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;


public final class Preconditions
{

	private Preconditions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object checkNotNull(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException();
	//    4    6:new             #13  <Class NullPointerException>
	//    5    9:dup             
	//    6   10:invokespecial   #14  <Method void NullPointerException()>
	//    7   13:athrow          
	}

	public static Object checkNotNull(Object obj, String s)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException(s);
	//    4    6:new             #13  <Class NullPointerException>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #20  <Method void NullPointerException(String)>
	//    8   14:athrow          
	}

	public static Object checkNotNull(Object obj, String s, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       86
		{
			if(s.contains("%s"))
	//*   2    4:aload_1         
	//*   3    5:ldc1            #24  <String "%s">
	//*   4    7:invokevirtual   #30  <Method boolean String.contains(CharSequence)>
	//*   5   10:ifeq            76
			{
				if(s.indexOf("%s") == s.lastIndexOf("%s"))
	//*   6   13:aload_1         
	//*   7   14:ldc1            #24  <String "%s">
	//*   8   16:invokevirtual   #34  <Method int String.indexOf(String)>
	//*   9   19:aload_1         
	//*  10   20:ldc1            #24  <String "%s">
	//*  11   22:invokevirtual   #37  <Method int String.lastIndexOf(String)>
	//*  12   25:icmpne          66
				{
					if(obj1 instanceof Class)
	//*  13   28:aload_2         
	//*  14   29:instanceof      #39  <Class Class>
	//*  15   32:ifeq            46
						obj = ((Object) (((Class)obj1).getCanonicalName()));
	//   16   35:aload_2         
	//   17   36:checkcast       #39  <Class Class>
	//   18   39:invokevirtual   #43  <Method String Class.getCanonicalName()>
	//   19   42:astore_0        
					else
	//*  20   43:goto            51
						obj = ((Object) (String.valueOf(obj1)));
	//   21   46:aload_2         
	//   22   47:invokestatic    #47  <Method String String.valueOf(Object)>
	//   23   50:astore_0        
					throw new NullPointerException(s.replace("%s", ((CharSequence) (obj))));
	//   24   51:new             #13  <Class NullPointerException>
	//   25   54:dup             
	//   26   55:aload_1         
	//   27   56:ldc1            #24  <String "%s">
	//   28   58:aload_0         
	//   29   59:invokevirtual   #51  <Method String String.replace(CharSequence, CharSequence)>
	//   30   62:invokespecial   #20  <Method void NullPointerException(String)>
	//   31   65:athrow          
				} else
				{
					throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
	//   32   66:new             #53  <Class IllegalArgumentException>
	//   33   69:dup             
	//   34   70:ldc1            #55  <String "errorMessageTemplate has more than one format specifier">
	//   35   72:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   36   75:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
	//   37   76:new             #53  <Class IllegalArgumentException>
	//   38   79:dup             
	//   39   80:ldc1            #58  <String "errorMessageTemplate has no format specifiers">
	//   40   82:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   41   85:athrow          
			}
		} else
		{
			return obj;
	//   42   86:aload_0         
	//   43   87:areturn         
		}
	}
}
