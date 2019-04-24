// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzs, zzfh, zzfb

final class zzfd
	implements zzs
{

	zzfd(zzfb zzfb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final int sizeOf(Object obj, Object obj1)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class String>
	//    2    4:astore_1        
		obj1 = ((Object) ((zzfh)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #19  <Class zzfh>
	//    5    9:astore_2        
		return ((String) (obj)).length() + ((zzfh) (obj1)).getSize();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #23  <Method int String.length()>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #26  <Method int zzfh.getSize()>
	//   10   18:iadd            
	//   11   19:ireturn         
	}
}
