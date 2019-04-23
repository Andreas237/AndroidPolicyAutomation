// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkp, bid, bnw

public final class zzkq extends zzkp
{

	zzkq(Parcel parcel)
	{
		super(parcel.readString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #26  <Method String Parcel.readString()>
	//    3    5:invokespecial   #29  <Method void zzkp(String)>
		a = parcel.readString();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #26  <Method String Parcel.readString()>
	//    7   13:putfield        #31  <Field String a>
		b = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #26  <Method String Parcel.readString()>
	//   11   21:putfield        #33  <Field String b>
	//   12   24:return          
	}

	public zzkq(String s, String s1, String s2)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void zzkp(String)>
		a = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #31  <Field String a>
		b = s2;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #33  <Field String b>
	//    9   15:return          
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          75
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #42  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #42  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((zzkq)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzkq>
	//   16   28:astore_1        
			return c.equals(((Object) (((zzkq) (obj)).c))) && bnw.a(((Object) (a)), ((Object) (((zzkq) (obj)).a))) && bnw.a(((Object) (b)), ((Object) (((zzkq) (obj)).b)));
	//   17   29:aload_0         
	//   18   30:getfield        #45  <Field String c>
	//   19   33:aload_1         
	//   20   34:getfield        #45  <Field String c>
	//   21   37:invokevirtual   #49  <Method boolean String.equals(Object)>
	//   22   40:ifeq            73
	//   23   43:aload_0         
	//   24   44:getfield        #31  <Field String a>
	//   25   47:aload_1         
	//   26   48:getfield        #31  <Field String a>
	//   27   51:invokestatic    #54  <Method boolean bnw.a(Object, Object)>
	//   28   54:ifeq            73
	//   29   57:aload_0         
	//   30   58:getfield        #33  <Field String b>
	//   31   61:aload_1         
	//   32   62:getfield        #33  <Field String b>
	//   33   65:invokestatic    #54  <Method boolean bnw.a(Object, Object)>
	//   34   68:ifeq            73
	//   35   71:iconst_1        
	//   36   72:ireturn         
	//   37   73:iconst_0        
	//   38   74:ireturn         
		} else
		{
			return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
		}
	}

	public final int hashCode()
	{
		int k = c.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String c>
	//    2    4:invokevirtual   #58  <Method int String.hashCode()>
	//    3    7:istore_3        
		String s = a;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field String a>
	//    6   12:astore          4
		int j = 0;
	//    7   14:iconst_0        
	//    8   15:istore_2        
		int i;
		if(s != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          30
			i = s.hashCode();
	//   11   21:aload           4
	//   12   23:invokevirtual   #58  <Method int String.hashCode()>
	//   13   26:istore_1        
		else
	//*  14   27:goto            32
			i = 0;
	//   15   30:iconst_0        
	//   16   31:istore_1        
		s = b;
	//   17   32:aload_0         
	//   18   33:getfield        #33  <Field String b>
	//   19   36:astore          4
		if(s != null)
	//*  20   38:aload           4
	//*  21   40:ifnull          49
			j = s.hashCode();
	//   22   43:aload           4
	//   23   45:invokevirtual   #58  <Method int String.hashCode()>
	//   24   48:istore_2        
		return ((k + 527) * 31 + i) * 31 + j;
	//   25   49:iload_3         
	//   26   50:sipush          527
	//   27   53:iadd            
	//   28   54:bipush          31
	//   29   56:imul            
	//   30   57:iload_1         
	//   31   58:iadd            
	//   32   59:bipush          31
	//   33   61:imul            
	//   34   62:iload_2         
	//   35   63:iadd            
	//   36   64:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(c);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field String c>
	//    3    5:invokevirtual   #63  <Method void Parcel.writeString(String)>
		parcel.writeString(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field String a>
	//    7   13:invokevirtual   #63  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field String b>
	//   11   21:invokevirtual   #63  <Method void Parcel.writeString(String)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bid();
	private final String a;
	private final String b;

	static 
	{
	//    0    0:new             #13  <Class bid>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void bid()>
	//    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
