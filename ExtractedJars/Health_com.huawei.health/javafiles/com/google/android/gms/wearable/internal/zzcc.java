// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcd

public class zzcc extends zza
	implements Node
{

	public zzcc(String s, String s1, int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		zzGV = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field String zzGV>
		zzakb = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field String zzakb>
		zzbUN = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #34  <Field int zzbUN>
		zzbUO = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #36  <Field boolean zzbUO>
	//   14   25:return          
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof zzcc))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zzcc>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ((zzcc)obj).zzGV.equals(((Object) (zzGV)));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class zzcc>
	//    7   13:getfield        #30  <Field String zzGV>
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field String zzGV>
	//   10   20:invokevirtual   #42  <Method boolean String.equals(Object)>
	//   11   23:ireturn         
	}

	public String getDisplayName()
	{
		return zzakb;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String zzakb>
	//    2    4:areturn         
	}

	public int getHopCount()
	{
		return zzbUN;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int zzbUN>
	//    2    4:ireturn         
	}

	public String getId()
	{
		return zzGV;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzGV>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return zzGV.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzGV>
	//    2    4:invokevirtual   #50  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public boolean isNearby()
	{
		return zzbUO;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zzbUO>
	//    2    4:ireturn         
	}

	public String toString()
	{
		String s = zzakb;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String zzakb>
	//    2    4:astore          4
		String s1 = zzGV;
	//    3    6:aload_0         
	//    4    7:getfield        #30  <Field String zzGV>
	//    5   10:astore          5
		int i = zzbUN;
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field int zzbUN>
	//    8   16:istore_1        
		boolean flag = zzbUO;
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field boolean zzbUO>
	//   11   21:istore_3        
		int j = String.valueOf(((Object) (s))).length();
	//   12   22:aload           4
	//   13   24:invokestatic    #57  <Method String String.valueOf(Object)>
	//   14   27:invokevirtual   #60  <Method int String.length()>
	//   15   30:istore_2        
		return (new StringBuilder(String.valueOf(((Object) (s1))).length() + (j + 45))).append("Node{").append(s).append(", id=").append(s1).append(", hops=").append(i).append(", isNearby=").append(flag).append("}").toString();
	//   16   31:new             #62  <Class StringBuilder>
	//   17   34:dup             
	//   18   35:aload           5
	//   19   37:invokestatic    #57  <Method String String.valueOf(Object)>
	//   20   40:invokevirtual   #60  <Method int String.length()>
	//   21   43:iload_2         
	//   22   44:bipush          45
	//   23   46:iadd            
	//   24   47:iadd            
	//   25   48:invokespecial   #65  <Method void StringBuilder(int)>
	//   26   51:ldc1            #67  <String "Node{">
	//   27   53:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:aload           4
	//   29   58:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:ldc1            #73  <String ", id=">
	//   31   63:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   32   66:aload           5
	//   33   68:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   34   71:ldc1            #75  <String ", hops=">
	//   35   73:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   36   76:iload_1         
	//   37   77:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   38   80:ldc1            #80  <String ", isNearby=">
	//   39   82:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   40   85:iload_3         
	//   41   86:invokevirtual   #83  <Method StringBuilder StringBuilder.append(boolean)>
	//   42   89:ldc1            #85  <String "}">
	//   43   91:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   44   94:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   45   97:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzcd.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #93  <Method void com.google.android.gms.wearable.internal.zzcd.zza(zzcc, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzcd();
	private final String zzGV;
	private final String zzakb;
	private final int zzbUN;
	private final boolean zzbUO;

	static 
	{
	//    0    0:new             #20  <Class zzcd>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzcd()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
