// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.t;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$4 extends w
{

	public Character a(a a1)
		throws IOException
	{
		if(a1.f() == b.i)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #22  <Method b a.f()>
	//*   2    4:getstatic       #28  <Field b b.i>
	//*   3    7:if_acmpne       16
		{
			a1.j();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #31  <Method void a.j()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		a1 = ((a) (a1.h()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #35  <Method String a.h()>
	//   10   20:astore_1        
		if(((String) (a1)).length() != 1)
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #41  <Method int String.length()>
	//*  13   25:iconst_1        
	//*  14   26:icmpeq          70
		{
			a1 = ((a) (String.valueOf(((Object) (a1)))));
	//   15   29:aload_1         
	//   16   30:invokestatic    #45  <Method String String.valueOf(Object)>
	//   17   33:astore_1        
			if(((String) (a1)).length() != 0)
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #41  <Method int String.length()>
	//*  20   38:ifeq            51
				a1 = ((a) ("Expecting character, got: ".concat(((String) (a1)))));
	//   21   41:ldc1            #47  <String "Expecting character, got: ">
	//   22   43:aload_1         
	//   23   44:invokevirtual   #51  <Method String String.concat(String)>
	//   24   47:astore_1        
			else
	//*  25   48:goto            61
				a1 = ((a) (new String("Expecting character, got: ")));
	//   26   51:new             #37  <Class String>
	//   27   54:dup             
	//   28   55:ldc1            #47  <String "Expecting character, got: ">
	//   29   57:invokespecial   #54  <Method void String(String)>
	//   30   60:astore_1        
			throw new t(((String) (a1)));
	//   31   61:new             #56  <Class t>
	//   32   64:dup             
	//   33   65:aload_1         
	//   34   66:invokespecial   #57  <Method void t(String)>
	//   35   69:athrow          
		} else
		{
			return Character.valueOf(((String) (a1)).charAt(0));
	//   36   70:aload_1         
	//   37   71:iconst_0        
	//   38   72:invokevirtual   #61  <Method char String.charAt(int)>
	//   39   75:invokestatic    #66  <Method Character Character.valueOf(char)>
	//   40   78:areturn         
		}
	}

	public void a(c c1, Character character)
		throws IOException
	{
		if(character == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			character = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			character = ((Character) (String.valueOf(((Object) (character)))));
	//    5    9:aload_2         
	//    6   10:invokestatic    #45  <Method String String.valueOf(Object)>
	//    7   13:astore_2        
		c1.b(((String) (character)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #74  <Method c c.b(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #78  <Method Character a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Character)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #63  <Class Character>
	//    4    6:invokevirtual   #82  <Method void a(c, Character)>
	//    5    9:return          
	}

	m$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
