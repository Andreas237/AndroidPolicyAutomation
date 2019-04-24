// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzb, BitmapDescriptor, ButtCap, SquareCap, 
//			RoundCap, CustomCap

public class Cap extends zza
{

	protected Cap(int i)
	{
		this(i, ((BitmapDescriptor) (null)), ((Float) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #38  <Method void Cap(int, BitmapDescriptor, Float)>
	//    5    7:return          
	}

	Cap(int i, IBinder ibinder, Float float1)
	{
		this(i, zzeh(ibinder), float1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #43  <Method BitmapDescriptor zzeh(IBinder)>
	//    4    6:aload_3         
	//    5    7:invokespecial   #38  <Method void Cap(int, BitmapDescriptor, Float)>
	//    6   10:return          
	}

	private Cap(int i, BitmapDescriptor bitmapdescriptor, Float float1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void zza()>
		int j;
		if(float1 != null && float1.floatValue() > 0.0F)
	//*   2    4:aload_3         
	//*   3    5:ifnull          23
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #51  <Method float Float.floatValue()>
	//*   6   12:fconst_0        
	//*   7   13:fcmpl           
	//*   8   14:ifle            23
			j = 1;
	//    9   17:iconst_1        
	//   10   18:istore          4
		else
	//*  11   20:goto            26
			j = 0;
	//   12   23:iconst_0        
	//   13   24:istore          4
		boolean flag;
		if(i != 3 || bitmapdescriptor != null && j)
	//*  14   26:iload_1         
	//*  15   27:iconst_3        
	//*  16   28:icmpne          40
	//*  17   31:aload_2         
	//*  18   32:ifnull          46
	//*  19   35:iload           4
	//*  20   37:ifeq            46
			flag = true;
	//   21   40:iconst_1        
	//   22   41:istore          5
		else
	//*  23   43:goto            49
			flag = false;
	//   24   46:iconst_0        
	//   25   47:istore          5
		String s = String.valueOf(((Object) (bitmapdescriptor)));
	//   26   49:aload_2         
	//   27   50:invokestatic    #57  <Method String String.valueOf(Object)>
	//   28   53:astore          6
		String s1 = String.valueOf(((Object) (float1)));
	//   29   55:aload_3         
	//   30   56:invokestatic    #57  <Method String String.valueOf(Object)>
	//   31   59:astore          7
		j = String.valueOf(((Object) (s))).length();
	//   32   61:aload           6
	//   33   63:invokestatic    #57  <Method String String.valueOf(Object)>
	//   34   66:invokevirtual   #61  <Method int String.length()>
	//   35   69:istore          4
		zzac.zzb(flag, ((Object) ((new StringBuilder(String.valueOf(((Object) (s1))).length() + (j + 63))).append("Invalid Cap: type=").append(i).append(" bitmapDescriptor=").append(s).append(" bitmapRefWidth=").append(s1).toString())));
	//   36   71:iload           5
	//   37   73:new             #63  <Class StringBuilder>
	//   38   76:dup             
	//   39   77:aload           7
	//   40   79:invokestatic    #57  <Method String String.valueOf(Object)>
	//   41   82:invokevirtual   #61  <Method int String.length()>
	//   42   85:iload           4
	//   43   87:bipush          63
	//   44   89:iadd            
	//   45   90:iadd            
	//   46   91:invokespecial   #65  <Method void StringBuilder(int)>
	//   47   94:ldc1            #67  <String "Invalid Cap: type=">
	//   48   96:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   49   99:iload_1         
	//   50  100:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   51  103:ldc1            #76  <String " bitmapDescriptor=">
	//   52  105:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   53  108:aload           6
	//   54  110:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   55  113:ldc1            #78  <String " bitmapRefWidth=">
	//   56  115:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   57  118:aload           7
	//   58  120:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   59  123:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   60  126:invokestatic    #87  <Method void zzac.zzb(boolean, Object)>
		type = i;
	//   61  129:aload_0         
	//   62  130:iload_1         
	//   63  131:putfield        #89  <Field int type>
		bitmapDescriptor = bitmapdescriptor;
	//   64  134:aload_0         
	//   65  135:aload_2         
	//   66  136:putfield        #91  <Field BitmapDescriptor bitmapDescriptor>
		zzbpe = float1;
	//   67  139:aload_0         
	//   68  140:aload_3         
	//   69  141:putfield        #93  <Field Float zzbpe>
	//   70  144:return          
	}

	protected Cap(BitmapDescriptor bitmapdescriptor, float f)
	{
		this(3, bitmapdescriptor, Float.valueOf(f));
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_1         
	//    3    3:fload_2         
	//    4    4:invokestatic    #98  <Method Float Float.valueOf(float)>
	//    5    7:invokespecial   #38  <Method void Cap(int, BitmapDescriptor, Float)>
	//    6   10:return          
	}

	private static BitmapDescriptor zzeh(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(ibinder));
	//    4    6:new             #100 <Class BitmapDescriptor>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokestatic    #106 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//    8   14:invokespecial   #109 <Method void BitmapDescriptor(IObjectWrapper)>
	//    9   17:areturn         
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
		if(!(obj instanceof Cap))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Cap>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((Cap)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class Cap>
	//   12   20:astore_1        
		return type == ((Cap) (obj)).type && zzaa.equal(((Object) (bitmapDescriptor)), ((Object) (((Cap) (obj)).bitmapDescriptor))) && zzaa.equal(((Object) (zzbpe)), ((Object) (((Cap) (obj)).zzbpe)));
	//   13   21:aload_0         
	//   14   22:getfield        #89  <Field int type>
	//   15   25:aload_1         
	//   16   26:getfield        #89  <Field int type>
	//   17   29:icmpne          62
	//   18   32:aload_0         
	//   19   33:getfield        #91  <Field BitmapDescriptor bitmapDescriptor>
	//   20   36:aload_1         
	//   21   37:getfield        #91  <Field BitmapDescriptor bitmapDescriptor>
	//   22   40:invokestatic    #118 <Method boolean zzaa.equal(Object, Object)>
	//   23   43:ifeq            62
	//   24   46:aload_0         
	//   25   47:getfield        #93  <Field Float zzbpe>
	//   26   50:aload_1         
	//   27   51:getfield        #93  <Field Float zzbpe>
	//   28   54:invokestatic    #118 <Method boolean zzaa.equal(Object, Object)>
	//   29   57:ifeq            62
	//   30   60:iconst_1        
	//   31   61:ireturn         
	//   32   62:iconst_0        
	//   33   63:ireturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int type>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Integer.valueOf(type), bitmapDescriptor, zzbpe
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #89  <Field int type>
	//    6   10:invokestatic    #127 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #91  <Field BitmapDescriptor bitmapDescriptor>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #93  <Field Float zzbpe>
	//   17   27:aastore         
	//   18   28:invokestatic    #130 <Method int zzaa.hashCode(Object[])>
	//   19   31:ireturn         
	}

	public String toString()
	{
		int i = type;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int type>
	//    2    4:istore_1        
		return (new StringBuilder(23)).append("[Cap: type=").append(i).append("]").toString();
	//    3    5:new             #63  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          23
	//    6   11:invokespecial   #65  <Method void StringBuilder(int)>
	//    7   14:ldc1            #132 <String "[Cap: type=">
	//    8   16:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   11   23:ldc1            #134 <String "]">
	//   12   25:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   14   31:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzb.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #140 <Method void com.google.android.gms.maps.model.zzb.zza(Cap, Parcel, int)>
	//    4    6:return          
	}

	public Float zzJH()
	{
		return zzbpe;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Float zzbpe>
	//    2    4:areturn         
	}

	IBinder zzJI()
	{
		if(bitmapDescriptor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field BitmapDescriptor bitmapDescriptor>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return bitmapDescriptor.zzJm().asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #91  <Field BitmapDescriptor bitmapDescriptor>
	//    7   13:invokevirtual   #148 <Method IObjectWrapper BitmapDescriptor.zzJm()>
	//    8   16:invokeinterface #153 <Method IBinder IObjectWrapper.asBinder()>
	//    9   21:areturn         
	}

	Cap zzJJ()
	{
		switch(type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int type>
		{
	//*   2    4:tableswitch     0 3: default 36
	//	               0 39
	//	               1 47
	//	               2 55
	//	               3 63
	//*   3   36:goto            82
		case 0: // '\0'
			return ((Cap) (new ButtCap()));
	//    4   39:new             #157 <Class ButtCap>
	//    5   42:dup             
	//    6   43:invokespecial   #158 <Method void ButtCap()>
	//    7   46:areturn         

		case 1: // '\001'
			return ((Cap) (new SquareCap()));
	//    8   47:new             #160 <Class SquareCap>
	//    9   50:dup             
	//   10   51:invokespecial   #161 <Method void SquareCap()>
	//   11   54:areturn         

		case 2: // '\002'
			return ((Cap) (new RoundCap()));
	//   12   55:new             #163 <Class RoundCap>
	//   13   58:dup             
	//   14   59:invokespecial   #164 <Method void RoundCap()>
	//   15   62:areturn         

		case 3: // '\003'
			return ((Cap) (new CustomCap(bitmapDescriptor, zzbpe.floatValue())));
	//   16   63:new             #166 <Class CustomCap>
	//   17   66:dup             
	//   18   67:aload_0         
	//   19   68:getfield        #91  <Field BitmapDescriptor bitmapDescriptor>
	//   20   71:aload_0         
	//   21   72:getfield        #93  <Field Float zzbpe>
	//   22   75:invokevirtual   #51  <Method float Float.floatValue()>
	//   23   78:invokespecial   #168 <Method void CustomCap(BitmapDescriptor, float)>
	//   24   81:areturn         
		}
		String s = TAG;
	//   25   82:getstatic       #26  <Field String TAG>
	//   26   85:astore_2        
		int i = type;
	//   27   86:aload_0         
	//   28   87:getfield        #89  <Field int type>
	//   29   90:istore_1        
		Log.w(s, (new StringBuilder(29)).append("Unknown Cap type: ").append(i).toString());
	//   30   91:aload_2         
	//   31   92:new             #63  <Class StringBuilder>
	//   32   95:dup             
	//   33   96:bipush          29
	//   34   98:invokespecial   #65  <Method void StringBuilder(int)>
	//   35  101:ldc1            #170 <String "Unknown Cap type: ">
	//   36  103:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   37  106:iload_1         
	//   38  107:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   39  110:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   40  113:invokestatic    #176 <Method int Log.w(String, String)>
	//   41  116:pop             
		return this;
	//   42  117:aload_0         
	//   43  118:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	private static final String TAG = ((Class) (com/google/android/gms/maps/model/Cap)).getSimpleName();
	private final BitmapDescriptor bitmapDescriptor;
	private final int type;
	private final Float zzbpe;

	static 
	{
	//    0    0:ldc1            #2   <Class Cap>
	//    1    2:invokevirtual   #24  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #26  <Field String TAG>
	//    3    8:new             #28  <Class zzb>
	//    4   11:dup             
	//    5   12:invokespecial   #31  <Method void zzb()>
	//    6   15:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   7   18:return          
	}
}
