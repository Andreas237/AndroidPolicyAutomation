// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.regions;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amazonaws.regions:
//			Regions, RegionUtils

public final class Region
{

	Region(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void HashMap()>
	//    6   12:putfield        #23  <Field Map c>
	//    7   15:aload_0         
	//    8   16:new             #20  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #21  <Method void HashMap()>
	//   11   23:putfield        #25  <Field Map d>
	//   12   26:aload_0         
	//   13   27:new             #20  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #21  <Method void HashMap()>
	//   16   34:putfield        #27  <Field Map e>
		a = s;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #29  <Field String a>
		if(s1 != null && !s1.isEmpty())
	//*  20   42:aload_2         
	//*  21   43:ifnull          62
	//*  22   46:aload_2         
	//*  23   47:invokevirtual   #35  <Method boolean String.isEmpty()>
	//*  24   50:ifeq            56
	//*  25   53:goto            62
		{
			b = s1;
	//   26   56:aload_0         
	//   27   57:aload_2         
	//   28   58:putfield        #37  <Field String b>
			return;
	//   29   61:return          
		} else
		{
			b = "amazonaws.com";
	//   30   62:aload_0         
	//   31   63:ldc1            #39  <String "amazonaws.com">
	//   32   65:putfield        #37  <Field String b>
			return;
	//   33   68:return          
		}
	}

	public static Region a(Regions regions)
	{
		return RegionUtils.a(regions.getName());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method String Regions.getName()>
	//    2    4:invokestatic    #52  <Method Region RegionUtils.a(String)>
	//    3    7:areturn         
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String a>
	//    2    4:areturn         
	}

	Map b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Map c>
	//    2    4:areturn         
	}

	Map c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Map d>
	//    2    4:areturn         
	}

	Map d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map e>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Region))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Region>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			obj = ((Object) ((Region)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class Region>
	//    7   13:astore_1        
			return a().equals(((Object) (((Region) (obj)).a())));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #60  <Method String a()>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #60  <Method String a()>
	//   12   22:invokevirtual   #62  <Method boolean String.equals(Object)>
	//   13   25:ireturn         
		}
	}

	public int hashCode()
	{
		return a().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method String a()>
	//    2    4:invokevirtual   #66  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method String a()>
	//    2    4:areturn         
	}

	private final String a;
	private final String b;
	private final Map c = new HashMap();
	private final Map d = new HashMap();
	private final Map e = new HashMap();
}
