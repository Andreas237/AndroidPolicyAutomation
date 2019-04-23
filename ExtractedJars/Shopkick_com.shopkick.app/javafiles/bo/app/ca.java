// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IPutIntoJson;
import java.util.UUID;

public final class ca
	implements IPutIntoJson
{

	public ca(UUID uuid)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = uuid;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field UUID a>
		b = uuid.toString();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #24  <Method String UUID.toString()>
	//    8   14:putfield        #26  <Field String b>
	//    9   17:return          
	}

	public static ca a()
	{
		return new ca(UUID.randomUUID());
	//    0    0:new             #2   <Class ca>
	//    1    3:dup             
	//    2    4:invokestatic    #32  <Method UUID UUID.randomUUID()>
	//    3    7:invokespecial   #34  <Method void ca(UUID)>
	//    4   10:areturn         
	}

	public static ca a(String s)
	{
		return new ca(UUID.fromString(s));
	//    0    0:new             #2   <Class ca>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #39  <Method UUID UUID.fromString(String)>
	//    4    8:invokespecial   #34  <Method void ca(UUID)>
	//    5   11:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String b>
	//    2    4:areturn         
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
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          42
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #45  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #45  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            42
		{
			obj = ((Object) ((ca)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class ca>
	//   15   29:astore_1        
			return a.equals(((Object) (((ca) (obj)).a)));
	//   16   30:aload_0         
	//   17   31:getfield        #18  <Field UUID a>
	//   18   34:aload_1         
	//   19   35:getfield        #18  <Field UUID a>
	//   20   38:invokevirtual   #47  <Method boolean UUID.equals(Object)>
	//   21   41:ireturn         
		} else
		{
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		}
	}

	public Object forJsonPut()
	{
		return ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method String b()>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return a.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field UUID a>
	//    2    4:invokevirtual   #55  <Method int UUID.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String b>
	//    2    4:areturn         
	}

	private final UUID a;
	private final String b;
}
