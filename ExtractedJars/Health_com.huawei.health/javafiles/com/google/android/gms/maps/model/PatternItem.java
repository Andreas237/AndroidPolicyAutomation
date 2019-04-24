// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzi, Dash, Dot, Gap

public class PatternItem extends zza
{

	public PatternItem(int i, Float float1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		boolean flag;
		if(i == 1 || float1 != null && float1.floatValue() >= 0.0F)
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          22
	//*   5    9:aload_2         
	//*   6   10:ifnull          27
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #40  <Method float Float.floatValue()>
	//*   9   17:fconst_0        
	//*  10   18:fcmpl           
	//*  11   19:iflt            27
			flag = true;
	//   12   22:iconst_1        
	//   13   23:istore_3        
		else
	//*  14   24:goto            29
			flag = false;
	//   15   27:iconst_0        
	//   16   28:istore_3        
		String s = String.valueOf(((Object) (float1)));
	//   17   29:aload_2         
	//   18   30:invokestatic    #46  <Method String String.valueOf(Object)>
	//   19   33:astore          4
		zzac.zzb(flag, ((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 45)).append("Invalid PatternItem: type=").append(i).append(" length=").append(s).toString())));
	//   20   35:iload_3         
	//   21   36:new             #48  <Class StringBuilder>
	//   22   39:dup             
	//   23   40:aload           4
	//   24   42:invokestatic    #46  <Method String String.valueOf(Object)>
	//   25   45:invokevirtual   #52  <Method int String.length()>
	//   26   48:bipush          45
	//   27   50:iadd            
	//   28   51:invokespecial   #55  <Method void StringBuilder(int)>
	//   29   54:ldc1            #57  <String "Invalid PatternItem: type=">
	//   30   56:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:iload_1         
	//   32   60:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   33   63:ldc1            #66  <String " length=">
	//   34   65:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:aload           4
	//   36   70:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   38   76:invokestatic    #75  <Method void zzac.zzb(boolean, Object)>
		type = i;
	//   39   79:aload_0         
	//   40   80:iload_1         
	//   41   81:putfield        #77  <Field int type>
		zzbpJ = float1;
	//   42   84:aload_0         
	//   43   85:aload_2         
	//   44   86:putfield        #79  <Field Float zzbpJ>
	//   45   89:return          
	}

	static List zzI(List list)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList(list.size());
	//    4    6:new             #84  <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokeinterface #89  <Method int List.size()>
	//    8   16:invokespecial   #90  <Method void ArrayList(int)>
	//    9   19:astore_1        
		for(Iterator iterator = list.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (list))))
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #94  <Method Iterator List.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            71
		{
			list = ((List) ((PatternItem)iterator.next()));
	//   16   36:aload_2         
	//   17   37:invokeinterface #104 <Method Object Iterator.next()>
	//   18   42:checkcast       #2   <Class PatternItem>
	//   19   45:astore_0        
			if(list == null)
	//*  20   46:aload_0         
	//*  21   47:ifnonnull       55
				list = null;
	//   22   50:aconst_null     
	//   23   51:astore_0        
			else
	//*  24   52:goto            60
				list = ((List) (((PatternItem) (list)).zzJO()));
	//   25   55:aload_0         
	//   26   56:invokespecial   #108 <Method PatternItem zzJO()>
	//   27   59:astore_0        
		}

	//   28   60:aload_1         
	//   29   61:aload_0         
	//   30   62:invokeinterface #112 <Method boolean List.add(Object)>
	//   31   67:pop             
	//*  32   68:goto            27
		return ((List) (arraylist));
	//   33   71:aload_1         
	//   34   72:areturn         
	}

	private PatternItem zzJO()
	{
		switch(type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field int type>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 35
	//	               1 50
	//	               2 58
	//*   3   32:goto            73
		case 0: // '\0'
			return ((PatternItem) (new Dash(zzbpJ.floatValue())));
	//    4   35:new             #117 <Class Dash>
	//    5   38:dup             
	//    6   39:aload_0         
	//    7   40:getfield        #79  <Field Float zzbpJ>
	//    8   43:invokevirtual   #40  <Method float Float.floatValue()>
	//    9   46:invokespecial   #120 <Method void Dash(float)>
	//   10   49:areturn         

		case 1: // '\001'
			return ((PatternItem) (new Dot()));
	//   11   50:new             #122 <Class Dot>
	//   12   53:dup             
	//   13   54:invokespecial   #123 <Method void Dot()>
	//   14   57:areturn         

		case 2: // '\002'
			return ((PatternItem) (new Gap(zzbpJ.floatValue())));
	//   15   58:new             #125 <Class Gap>
	//   16   61:dup             
	//   17   62:aload_0         
	//   18   63:getfield        #79  <Field Float zzbpJ>
	//   19   66:invokevirtual   #40  <Method float Float.floatValue()>
	//   20   69:invokespecial   #126 <Method void Gap(float)>
	//   21   72:areturn         
		}
		String s = TAG;
	//   22   73:getstatic       #24  <Field String TAG>
	//   23   76:astore_2        
		int i = type;
	//   24   77:aload_0         
	//   25   78:getfield        #77  <Field int type>
	//   26   81:istore_1        
		Log.w(s, (new StringBuilder(37)).append("Unknown PatternItem type: ").append(i).toString());
	//   27   82:aload_2         
	//   28   83:new             #48  <Class StringBuilder>
	//   29   86:dup             
	//   30   87:bipush          37
	//   31   89:invokespecial   #55  <Method void StringBuilder(int)>
	//   32   92:ldc1            #128 <String "Unknown PatternItem type: ">
	//   33   94:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   34   97:iload_1         
	//   35   98:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   36  101:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   37  104:invokestatic    #134 <Method int Log.w(String, String)>
	//   38  107:pop             
		return this;
	//   39  108:aload_0         
	//   40  109:areturn         
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
		if(!(obj instanceof PatternItem))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PatternItem>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((PatternItem)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PatternItem>
	//   12   20:astore_1        
		return type == ((PatternItem) (obj)).type && zzaa.equal(((Object) (zzbpJ)), ((Object) (((PatternItem) (obj)).zzbpJ)));
	//   13   21:aload_0         
	//   14   22:getfield        #77  <Field int type>
	//   15   25:aload_1         
	//   16   26:getfield        #77  <Field int type>
	//   17   29:icmpne          48
	//   18   32:aload_0         
	//   19   33:getfield        #79  <Field Float zzbpJ>
	//   20   36:aload_1         
	//   21   37:getfield        #79  <Field Float zzbpJ>
	//   22   40:invokestatic    #141 <Method boolean zzaa.equal(Object, Object)>
	//   23   43:ifeq            48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int type>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Integer.valueOf(type), zzbpJ
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #77  <Field int type>
	//    6   10:invokestatic    #150 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #79  <Field Float zzbpJ>
	//   12   20:aastore         
	//   13   21:invokestatic    #153 <Method int zzaa.hashCode(Object[])>
	//   14   24:ireturn         
	}

	public String toString()
	{
		int i = type;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int type>
	//    2    4:istore_1        
		String s = String.valueOf(((Object) (zzbpJ)));
	//    3    5:aload_0         
	//    4    6:getfield        #79  <Field Float zzbpJ>
	//    5    9:invokestatic    #46  <Method String String.valueOf(Object)>
	//    6   12:astore_2        
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 39)).append("[PatternItem: type=").append(i).append(" length=").append(s).append("]").toString();
	//    7   13:new             #48  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokestatic    #46  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #52  <Method int String.length()>
	//   12   24:bipush          39
	//   13   26:iadd            
	//   14   27:invokespecial   #55  <Method void StringBuilder(int)>
	//   15   30:ldc1            #155 <String "[PatternItem: type=">
	//   16   32:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:iload_1         
	//   18   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   19   39:ldc1            #66  <String " length=">
	//   20   41:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:aload_2         
	//   22   45:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:ldc1            #157 <String "]">
	//   24   50:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   26   56:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzi.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #163 <Method void com.google.android.gms.maps.model.zzi.zza(PatternItem, Parcel, int)>
	//    4    6:return          
	}

	public Float zzJN()
	{
		return zzbpJ;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Float zzbpJ>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzi();
	private static final String TAG = ((Class) (com/google/android/gms/maps/model/PatternItem)).getSimpleName();
	private final int type;
	private final Float zzbpJ;

	static 
	{
	//    0    0:ldc1            #2   <Class PatternItem>
	//    1    2:invokevirtual   #22  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #24  <Field String TAG>
	//    3    8:new             #26  <Class zzi>
	//    4   11:dup             
	//    5   12:invokespecial   #29  <Method void zzi()>
	//    6   15:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   7   18:return          
	}
}
