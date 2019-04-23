// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkp, bib, bnw

public final class zzkm extends zzkp
{

	zzkm(Parcel parcel)
	{
		super("COMM");
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "COMM">
	//    2    3:invokespecial   #26  <Method void zzkp(String)>
		d = parcel.readString();
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #32  <Method String Parcel.readString()>
	//    6   11:putfield        #34  <Field String d>
		a = parcel.readString();
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #32  <Method String Parcel.readString()>
	//   10   19:putfield        #36  <Field String a>
		b = parcel.readString();
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #32  <Method String Parcel.readString()>
	//   14   27:putfield        #38  <Field String b>
	//   15   30:return          
	}

	public zzkm(String s, String s1, String s2)
	{
		super("COMM");
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "COMM">
	//    2    3:invokespecial   #26  <Method void zzkp(String)>
		d = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #34  <Field String d>
		a = s1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #36  <Field String a>
		b = s2;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #38  <Field String b>
	//   12   21:return          
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
	//*   8   12:invokevirtual   #47  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #47  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((zzkm)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzkm>
	//   16   28:astore_1        
			return bnw.a(((Object) (a)), ((Object) (((zzkm) (obj)).a))) && bnw.a(((Object) (d)), ((Object) (((zzkm) (obj)).d))) && bnw.a(((Object) (b)), ((Object) (((zzkm) (obj)).b)));
	//   17   29:aload_0         
	//   18   30:getfield        #36  <Field String a>
	//   19   33:aload_1         
	//   20   34:getfield        #36  <Field String a>
	//   21   37:invokestatic    #52  <Method boolean bnw.a(Object, Object)>
	//   22   40:ifeq            73
	//   23   43:aload_0         
	//   24   44:getfield        #34  <Field String d>
	//   25   47:aload_1         
	//   26   48:getfield        #34  <Field String d>
	//   27   51:invokestatic    #52  <Method boolean bnw.a(Object, Object)>
	//   28   54:ifeq            73
	//   29   57:aload_0         
	//   30   58:getfield        #38  <Field String b>
	//   31   61:aload_1         
	//   32   62:getfield        #38  <Field String b>
	//   33   65:invokestatic    #52  <Method boolean bnw.a(Object, Object)>
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
		String s = d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String d>
	//    2    4:astore          4
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		if(s != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          22
			i = s.hashCode();
	//    7   13:aload           4
	//    8   15:invokevirtual   #58  <Method int String.hashCode()>
	//    9   18:istore_1        
		else
	//*  10   19:goto            24
			i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		s = a;
	//   13   24:aload_0         
	//   14   25:getfield        #36  <Field String a>
	//   15   28:astore          4
		int j;
		if(s != null)
	//*  16   30:aload           4
	//*  17   32:ifnull          44
			j = s.hashCode();
	//   18   35:aload           4
	//   19   37:invokevirtual   #58  <Method int String.hashCode()>
	//   20   40:istore_2        
		else
	//*  21   41:goto            46
			j = 0;
	//   22   44:iconst_0        
	//   23   45:istore_2        
		s = b;
	//   24   46:aload_0         
	//   25   47:getfield        #38  <Field String b>
	//   26   50:astore          4
		if(s != null)
	//*  27   52:aload           4
	//*  28   54:ifnull          63
			k = s.hashCode();
	//   29   57:aload           4
	//   30   59:invokevirtual   #58  <Method int String.hashCode()>
	//   31   62:istore_3        
		return ((i + 527) * 31 + j) * 31 + k;
	//   32   63:iload_1         
	//   33   64:sipush          527
	//   34   67:iadd            
	//   35   68:bipush          31
	//   36   70:imul            
	//   37   71:iload_2         
	//   38   72:iadd            
	//   39   73:bipush          31
	//   40   75:imul            
	//   41   76:iload_3         
	//   42   77:iadd            
	//   43   78:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(c);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field String c>
	//    3    5:invokevirtual   #66  <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field String d>
	//    7   13:invokevirtual   #66  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field String b>
	//   11   21:invokevirtual   #66  <Method void Parcel.writeString(String)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bib();
	public final String a;
	public final String b;
	private final String d;

	static 
	{
	//    0    0:new             #14  <Class bib>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void bib()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
