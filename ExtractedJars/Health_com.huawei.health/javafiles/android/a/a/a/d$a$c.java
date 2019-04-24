// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.os.Bundle;

// Referenced classes of package android.a.a.a:
//			d

public static final class d$a$c
	implements d$a$b
{

	private void a(int l, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
		{
			h = h | l;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field int h>
	//    5    9:iload_1         
	//    6   10:ior             
	//    7   11:putfield        #41  <Field int h>
			return;
	//    8   14:return          
		} else
		{
			h = h & ~l;
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #41  <Field int h>
	//   12   20:iload_1         
	//   13   21:iconst_m1       
	//   14   22:ixor            
	//   15   23:iand            
	//   16   24:putfield        #41  <Field int h>
			return;
	//   17   27:return          
		}
	}

	public d$a$a a(d$a$a d$a$a1)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #48  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void Bundle()>
	//    3    7:astore_2        
		if(h != 1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #41  <Field int h>
	//*   6   12:iconst_1        
	//*   7   13:icmpeq          26
			bundle.putInt("flags", h);
	//    8   16:aload_2         
	//    9   17:ldc1            #18  <String "flags">
	//   10   19:aload_0         
	//   11   20:getfield        #41  <Field int h>
	//   12   23:invokevirtual   #73  <Method void Bundle.putInt(String, int)>
		if(i != null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #62  <Field CharSequence i>
	//*  15   30:ifnull          43
			bundle.putCharSequence("inProgressLabel", i);
	//   16   33:aload_2         
	//   17   34:ldc1            #20  <String "inProgressLabel">
	//   18   36:aload_0         
	//   19   37:getfield        #62  <Field CharSequence i>
	//   20   40:invokevirtual   #77  <Method void Bundle.putCharSequence(String, CharSequence)>
		if(j != null)
	//*  21   43:aload_0         
	//*  22   44:getfield        #64  <Field CharSequence j>
	//*  23   47:ifnull          60
			bundle.putCharSequence("confirmLabel", j);
	//   24   50:aload_2         
	//   25   51:ldc1            #23  <String "confirmLabel">
	//   26   53:aload_0         
	//   27   54:getfield        #64  <Field CharSequence j>
	//   28   57:invokevirtual   #77  <Method void Bundle.putCharSequence(String, CharSequence)>
		if(k != null)
	//*  29   60:aload_0         
	//*  30   61:getfield        #66  <Field CharSequence k>
	//*  31   64:ifnull          77
			bundle.putCharSequence("cancelLabel", k);
	//   32   67:aload_2         
	//   33   68:ldc1            #26  <String "cancelLabel">
	//   34   70:aload_0         
	//   35   71:getfield        #66  <Field CharSequence k>
	//   36   74:invokevirtual   #77  <Method void Bundle.putCharSequence(String, CharSequence)>
		d$a$a1.a().putBundle("android.wearable.EXTENSIONS", bundle);
	//   37   77:aload_1         
	//   38   78:invokevirtual   #81  <Method Bundle d$a$a.a()>
	//   39   81:ldc1            #15  <String "android.wearable.EXTENSIONS">
	//   40   83:aload_2         
	//   41   84:invokevirtual   #85  <Method void Bundle.putBundle(String, Bundle)>
		return d$a$a1;
	//   42   87:aload_1         
	//   43   88:areturn         
	}

	public d$a$c a()
	{
		d$a$c d$a$c1 = new d$a$c();
	//    0    0:new             #2   <Class d$a$c>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void d$a$c()>
	//    3    7:astore_1        
		d$a$c1.h = h;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field int h>
	//    7   13:putfield        #41  <Field int h>
		d$a$c1.i = i;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field CharSequence i>
	//   11   21:putfield        #62  <Field CharSequence i>
		d$a$c1.j = j;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #64  <Field CharSequence j>
	//   15   29:putfield        #64  <Field CharSequence j>
		d$a$c1.k = k;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #66  <Field CharSequence k>
	//   19   37:putfield        #66  <Field CharSequence k>
		return d$a$c1;
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	public d$a$c a(CharSequence charsequence)
	{
		i = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field CharSequence i>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$a$c a(boolean flag)
	{
		a(1, flag);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:invokespecial   #91  <Method void a(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public d$a$c b(CharSequence charsequence)
	{
		j = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field CharSequence j>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public boolean b()
	{
		return (h & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int h>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public d$a$c c(CharSequence charsequence)
	{
		k = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field CharSequence k>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CharSequence c()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field CharSequence i>
	//    2    4:areturn         
	}

	public Object clone()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #97  <Method d$a$c a()>
	//    2    4:areturn         
	}

	public CharSequence d()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field CharSequence j>
	//    2    4:areturn         
	}

	public CharSequence e()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field CharSequence k>
	//    2    4:areturn         
	}

	private static final String a = "android.wearable.EXTENSIONS";
	private static final String b = "flags";
	private static final String c = "inProgressLabel";
	private static final String d = "confirmLabel";
	private static final String e = "cancelLabel";
	private static final int f = 1;
	private static final int g = 1;
	private int h;
	private CharSequence i;
	private CharSequence j;
	private CharSequence k;

	public d$a$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		h = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #41  <Field int h>
	//    5    9:return          
	}

	public d$a$c(d.a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		h = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #41  <Field int h>
		a1 = ((d.a) (a1.d().getBundle("android.wearable.EXTENSIONS")));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #46  <Method Bundle d$a.d()>
	//    7   13:ldc1            #15  <String "android.wearable.EXTENSIONS">
	//    8   15:invokevirtual   #52  <Method Bundle Bundle.getBundle(String)>
	//    9   18:astore_1        
		if(a1 != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          64
		{
			h = ((Bundle) (a1)).getInt("flags", 1);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:ldc1            #18  <String "flags">
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #56  <Method int Bundle.getInt(String, int)>
	//   17   31:putfield        #41  <Field int h>
			i = ((Bundle) (a1)).getCharSequence("inProgressLabel");
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:ldc1            #20  <String "inProgressLabel">
	//   21   38:invokevirtual   #60  <Method CharSequence Bundle.getCharSequence(String)>
	//   22   41:putfield        #62  <Field CharSequence i>
			j = ((Bundle) (a1)).getCharSequence("confirmLabel");
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:ldc1            #23  <String "confirmLabel">
	//   26   48:invokevirtual   #60  <Method CharSequence Bundle.getCharSequence(String)>
	//   27   51:putfield        #64  <Field CharSequence j>
			k = ((Bundle) (a1)).getCharSequence("cancelLabel");
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:ldc1            #26  <String "cancelLabel">
	//   31   58:invokevirtual   #60  <Method CharSequence Bundle.getCharSequence(String)>
	//   32   61:putfield        #66  <Field CharSequence k>
		}
	//   33   64:return          
	}
}
