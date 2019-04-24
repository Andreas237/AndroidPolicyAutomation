// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzrl, zzrh

public final class zzrk
{

	private zzrk(List list, Map map, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzbox = Collections.unmodifiableList(list);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #26  <Method List Collections.unmodifiableList(List)>
	//    5    9:putfield        #28  <Field List zzbox>
		zzboy = Collections.unmodifiableMap(map);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokestatic    #32  <Method Map Collections.unmodifiableMap(Map)>
	//    9   17:putfield        #34  <Field Map zzboy>
		version = s;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #36  <Field String version>
		zzph = i;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #38  <Field int zzph>
	//   16   31:return          
	}

	zzrk(List list, Map map, String s, int i, zzrh zzrh)
	{
		this(list, map, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #44  <Method void zzrk(List, Map, String, int)>
	//    6    9:return          
	}

	public static zzrl zztb()
	{
		return new zzrl(((zzrh) (null)));
	//    0    0:new             #48  <Class zzrl>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #51  <Method void zzrl(zzrh)>
	//    4    8:areturn         
	}

	public final String getVersion()
	{
		return version;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String version>
	//    2    4:areturn         
	}

	public final String toString()
	{
		String s = String.valueOf(((Object) (zzbox)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List zzbox>
	//    2    4:invokestatic    #60  <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		String s1 = String.valueOf(((Object) (zzboy)));
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field Map zzboy>
	//    6   12:invokestatic    #60  <Method String String.valueOf(Object)>
	//    7   15:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 17 + String.valueOf(((Object) (s1))).length());
	//    8   16:new             #62  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokestatic    #60  <Method String String.valueOf(Object)>
	//   12   24:invokevirtual   #66  <Method int String.length()>
	//   13   27:bipush          17
	//   14   29:iadd            
	//   15   30:aload_2         
	//   16   31:invokestatic    #60  <Method String String.valueOf(Object)>
	//   17   34:invokevirtual   #66  <Method int String.length()>
	//   18   37:iadd            
	//   19   38:invokespecial   #69  <Method void StringBuilder(int)>
	//   20   41:astore_3        
		stringbuilder.append("Rules: ");
	//   21   42:aload_3         
	//   22   43:ldc1            #71  <String "Rules: ">
	//   23   45:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
		stringbuilder.append(s);
	//   25   49:aload_3         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
		stringbuilder.append("  Macros: ");
	//   29   55:aload_3         
	//   30   56:ldc1            #77  <String "  Macros: ">
	//   31   58:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
		stringbuilder.append(s1);
	//   33   62:aload_3         
	//   34   63:aload_2         
	//   35   64:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   36   67:pop             
		return stringbuilder.toString();
	//   37   68:aload_3         
	//   38   69:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   39   72:areturn         
	}

	public final List zzsg()
	{
		return zzbox;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List zzbox>
	//    2    4:areturn         
	}

	public final Map zztc()
	{
		return zzboy;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Map zzboy>
	//    2    4:areturn         
	}

	private final String version;
	private final List zzbox;
	private final Map zzboy;
	private final int zzph;
}
