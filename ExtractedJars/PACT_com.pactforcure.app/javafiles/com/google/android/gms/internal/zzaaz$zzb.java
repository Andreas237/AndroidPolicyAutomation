// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzaaz

public static final class zzaaz$zzb
{

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof zzaaz$zzb))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzaaz$zzb>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((zzaaz$zzb)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzaaz$zzb>
	//   12   20:astore_1        
			if(mListener != ((zzaaz$zzb) (obj)).mListener || !zzaBB.equals(((Object) (((zzaaz$zzb) (obj)).zzaBB))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #20  <Field Object mListener>
	//*  15   25:aload_1         
	//*  16   26:getfield        #20  <Field Object mListener>
	//*  17   29:if_acmpne       46
	//*  18   32:aload_0         
	//*  19   33:getfield        #22  <Field String zzaBB>
	//*  20   36:aload_1         
	//*  21   37:getfield        #22  <Field String zzaBB>
	//*  22   40:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  23   43:ifne            5
				return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return System.identityHashCode(mListener) * 31 + zzaBB.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object mListener>
	//    2    4:invokestatic    #39  <Method int System.identityHashCode(Object)>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #22  <Field String zzaBB>
	//    7   14:invokevirtual   #41  <Method int String.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	private final Object mListener;
	private final String zzaBB;

	zzaaz$zzb(Object obj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mListener = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Object mListener>
		zzaBB = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String zzaBB>
	//    8   14:return          
	}
}
