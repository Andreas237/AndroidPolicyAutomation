// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.e;


// Referenced classes of package android.support.v4.e:
//			e, f

private static abstract class f$d
	implements e
{

	private boolean b(CharSequence charsequence, int i, int j)
	{
		switch(a.a(charsequence, i, j))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field f$c a>
	//*   2    4:aload_1         
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:invokeinterface #26  <Method int f$c.a(CharSequence, int, int)>
		{
	//*   6   12:tableswitch     0 1: default 36
	//	               0 43
	//	               1 41
		default:
			return a();
	//    7   36:aload_0         
	//    8   37:invokevirtual   #29  <Method boolean a()>
	//    9   40:ireturn         

		case 1: // '\001'
			return false;
	//   10   41:iconst_0        
	//   11   42:ireturn         

		case 0: // '\0'
			return true;
	//   12   43:iconst_1        
	//   13   44:ireturn         
		}
	}

	protected abstract boolean a();

	public boolean a(CharSequence charsequence, int i, int j)
	{
		if(charsequence != null && i >= 0 && j >= 0 && charsequence.length() - j >= i)
	//*   0    0:aload_1         
	//*   1    1:ifnull          47
	//*   2    4:iload_2         
	//*   3    5:iflt            47
	//*   4    8:iload_3         
	//*   5    9:iflt            47
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #35  <Method int CharSequence.length()>
	//*   8   18:iload_3         
	//*   9   19:isub            
	//*  10   20:iload_2         
	//*  11   21:icmpge          27
	//*  12   24:goto            47
		{
			if(a == null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #18  <Field f$c a>
	//*  15   31:ifnonnull       39
				return a();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #29  <Method boolean a()>
	//   18   38:ireturn         
			else
				return b(charsequence, i, j);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iload_2         
	//   22   42:iload_3         
	//   23   43:invokespecial   #37  <Method boolean b(CharSequence, int, int)>
	//   24   46:ireturn         
		} else
		{
			throw new IllegalArgumentException();
	//   25   47:new             #39  <Class IllegalArgumentException>
	//   26   50:dup             
	//   27   51:invokespecial   #40  <Method void IllegalArgumentException()>
	//   28   54:athrow          
		}
	}

	private final f$c a;

	public f$d(f$c f$c1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = f$c1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field f$c a>
	//    5    9:return          
	}
}
