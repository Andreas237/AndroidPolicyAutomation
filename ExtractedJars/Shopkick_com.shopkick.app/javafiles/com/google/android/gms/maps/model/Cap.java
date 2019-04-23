// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzb, BitmapDescriptor, CustomCap, RoundCap, 
//			SquareCap, ButtCap

public class Cap extends AbstractSafeParcelable
{

	protected Cap(int i)
	{
		this(i, ((BitmapDescriptor) (null)), ((Float) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #48  <Method void Cap(int, BitmapDescriptor, Float)>
	//    5    7:return          
	}

	Cap(int i, IBinder ibinder, Float float1)
	{
		if(ibinder == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			ibinder = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            21
			ibinder = ((IBinder) (new BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder))));
	//    5    9:new             #53  <Class BitmapDescriptor>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:invokestatic    #59  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   17:invokespecial   #62  <Method void BitmapDescriptor(IObjectWrapper)>
	//   10   20:astore_2        
		this(i, ((BitmapDescriptor) (ibinder)), float1);
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokespecial   #48  <Method void Cap(int, BitmapDescriptor, Float)>
	//   16   28:return          
	}

	private Cap(int i, BitmapDescriptor bitmapdescriptor, Float float1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void AbstractSafeParcelable()>
		boolean flag;
		if(float1 != null && float1.floatValue() > 0.0F)
	//*   2    4:aload_3         
	//*   3    5:ifnull          23
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #71  <Method float Float.floatValue()>
	//*   6   12:fconst_0        
	//*   7   13:fcmpl           
	//*   8   14:ifle            23
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore          4
		else
	//*  11   20:goto            26
			flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          4
		boolean flag1;
		if(i == 3 && (bitmapdescriptor == null || !flag))
	//*  14   26:iload_1         
	//*  15   27:iconst_3        
	//*  16   28:icmpne          49
	//*  17   31:aload_2         
	//*  18   32:ifnull          43
	//*  19   35:iload           4
	//*  20   37:ifeq            43
	//*  21   40:goto            49
			flag1 = false;
	//   22   43:iconst_0        
	//   23   44:istore          5
		else
	//*  24   46:goto            52
			flag1 = true;
	//   25   49:iconst_1        
	//   26   50:istore          5
		Preconditions.checkArgument(flag1, ((Object) (String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[] {
			Integer.valueOf(i), bitmapdescriptor, float1
		}))));
	//   27   52:iload           5
	//   28   54:ldc1            #73  <String "Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s">
	//   29   56:iconst_3        
	//   30   57:anewarray       Object[]
	//   31   60:dup             
	//   32   61:iconst_0        
	//   33   62:iload_1         
	//   34   63:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   35   66:aastore         
	//   36   67:dup             
	//   37   68:iconst_1        
	//   38   69:aload_2         
	//   39   70:aastore         
	//   40   71:dup             
	//   41   72:iconst_2        
	//   42   73:aload_3         
	//   43   74:aastore         
	//   44   75:invokestatic    #87  <Method String String.format(String, Object[])>
	//   45   78:invokestatic    #93  <Method void Preconditions.checkArgument(boolean, Object)>
		type = i;
	//   46   81:aload_0         
	//   47   82:iload_1         
	//   48   83:putfield        #95  <Field int type>
		bitmapDescriptor = bitmapdescriptor;
	//   49   86:aload_0         
	//   50   87:aload_2         
	//   51   88:putfield        #97  <Field BitmapDescriptor bitmapDescriptor>
		zzcm = float1;
	//   52   91:aload_0         
	//   53   92:aload_3         
	//   54   93:putfield        #99  <Field Float zzcm>
	//   55   96:return          
	}

	protected Cap(BitmapDescriptor bitmapdescriptor, float f)
	{
		this(3, bitmapdescriptor, Float.valueOf(f));
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_1         
	//    3    3:fload_2         
	//    4    4:invokestatic    #104 <Method Float Float.valueOf(float)>
	//    5    7:invokespecial   #48  <Method void Cap(int, BitmapDescriptor, Float)>
	//    6   10:return          
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
		return type == ((Cap) (obj)).type && Objects.equal(((Object) (bitmapDescriptor)), ((Object) (((Cap) (obj)).bitmapDescriptor))) && Objects.equal(((Object) (zzcm)), ((Object) (((Cap) (obj)).zzcm)));
	//   13   21:aload_0         
	//   14   22:getfield        #95  <Field int type>
	//   15   25:aload_1         
	//   16   26:getfield        #95  <Field int type>
	//   17   29:icmpne          62
	//   18   32:aload_0         
	//   19   33:getfield        #97  <Field BitmapDescriptor bitmapDescriptor>
	//   20   36:aload_1         
	//   21   37:getfield        #97  <Field BitmapDescriptor bitmapDescriptor>
	//   22   40:invokestatic    #112 <Method boolean Objects.equal(Object, Object)>
	//   23   43:ifeq            62
	//   24   46:aload_0         
	//   25   47:getfield        #99  <Field Float zzcm>
	//   26   50:aload_1         
	//   27   51:getfield        #99  <Field Float zzcm>
	//   28   54:invokestatic    #112 <Method boolean Objects.equal(Object, Object)>
	//   29   57:ifeq            62
	//   30   60:iconst_1        
	//   31   61:ireturn         
	//   32   62:iconst_0        
	//   33   63:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(type), bitmapDescriptor, zzcm
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #95  <Field int type>
	//    6   10:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #97  <Field BitmapDescriptor bitmapDescriptor>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #99  <Field Float zzcm>
	//   17   27:aastore         
	//   18   28:invokestatic    #117 <Method int Objects.hashCode(Object[])>
	//   19   31:ireturn         
	}

	public String toString()
	{
		int i = type;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int type>
	//    2    4:istore_1        
		StringBuilder stringbuilder = new StringBuilder(23);
	//    3    5:new             #121 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          23
	//    6   11:invokespecial   #123 <Method void StringBuilder(int)>
	//    7   14:astore_2        
		stringbuilder.append("[Cap: type=");
	//    8   15:aload_2         
	//    9   16:ldc1            #125 <String "[Cap: type=">
	//   10   18:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(i);
	//   12   22:aload_2         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   15   27:pop             
		stringbuilder.append("]");
	//   16   28:aload_2         
	//   17   29:ldc1            #134 <String "]">
	//   18   31:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		return stringbuilder.toString();
	//   20   35:aload_2         
	//   21   36:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   22   39:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #144 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 2, type);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #95  <Field int type>
	//    7   11:invokestatic    #148 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		Object obj = ((Object) (bitmapDescriptor));
	//    8   14:aload_0         
	//    9   15:getfield        #97  <Field BitmapDescriptor bitmapDescriptor>
	//   10   18:astore_3        
		if(obj == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       28
			obj = null;
	//   13   23:aconst_null     
	//   14   24:astore_3        
		else
	//*  15   25:goto            38
			obj = ((Object) (((BitmapDescriptor) (obj)).zza().asBinder()));
	//   16   28:aload_3         
	//   17   29:invokevirtual   #152 <Method IObjectWrapper BitmapDescriptor.zza()>
	//   18   32:invokeinterface #158 <Method IBinder IObjectWrapper.asBinder()>
	//   19   37:astore_3        
		SafeParcelWriter.writeIBinder(parcel, 3, ((IBinder) (obj)), false);
	//   20   38:aload_1         
	//   21   39:iconst_3        
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokestatic    #162 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeFloatObject(parcel, 4, zzcm, false);
	//   25   45:aload_1         
	//   26   46:iconst_4        
	//   27   47:aload_0         
	//   28   48:getfield        #99  <Field Float zzcm>
	//   29   51:iconst_0        
	//   30   52:invokestatic    #166 <Method void SafeParcelWriter.writeFloatObject(Parcel, int, Float, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   31   55:aload_1         
	//   32   56:iload_2         
	//   33   57:invokestatic    #169 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   34   60:return          
	}

	final Cap zzg()
	{
		int i = type;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int type>
	//    2    4:istore_1        
		switch(i)
	//*   3    5:iload_1         
		{
	//*   4    6:tableswitch     0 3: default 36
	//	               0 109
	//	               1 101
	//	               2 93
	//	               3 74
		default:
			String s = TAG;
	//    5   36:getstatic       #173 <Field String TAG>
	//    6   39:astore_2        
			StringBuilder stringbuilder = new StringBuilder(29);
	//    7   40:new             #121 <Class StringBuilder>
	//    8   43:dup             
	//    9   44:bipush          29
	//   10   46:invokespecial   #123 <Method void StringBuilder(int)>
	//   11   49:astore_3        
			stringbuilder.append("Unknown Cap type: ");
	//   12   50:aload_3         
	//   13   51:ldc1            #175 <String "Unknown Cap type: ">
	//   14   53:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   15   56:pop             
			stringbuilder.append(i);
	//   16   57:aload_3         
	//   17   58:iload_1         
	//   18   59:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   19   62:pop             
			Log.w(s, stringbuilder.toString());
	//   20   63:aload_2         
	//   21   64:aload_3         
	//   22   65:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   23   68:invokestatic    #181 <Method int Log.w(String, String)>
	//   24   71:pop             
			return this;
	//   25   72:aload_0         
	//   26   73:areturn         

		case 3: // '\003'
			return ((Cap) (new CustomCap(bitmapDescriptor, zzcm.floatValue())));
	//   27   74:new             #183 <Class CustomCap>
	//   28   77:dup             
	//   29   78:aload_0         
	//   30   79:getfield        #97  <Field BitmapDescriptor bitmapDescriptor>
	//   31   82:aload_0         
	//   32   83:getfield        #99  <Field Float zzcm>
	//   33   86:invokevirtual   #71  <Method float Float.floatValue()>
	//   34   89:invokespecial   #185 <Method void CustomCap(BitmapDescriptor, float)>
	//   35   92:areturn         

		case 2: // '\002'
			return ((Cap) (new RoundCap()));
	//   36   93:new             #187 <Class RoundCap>
	//   37   96:dup             
	//   38   97:invokespecial   #188 <Method void RoundCap()>
	//   39  100:areturn         

		case 1: // '\001'
			return ((Cap) (new SquareCap()));
	//   40  101:new             #190 <Class SquareCap>
	//   41  104:dup             
	//   42  105:invokespecial   #191 <Method void SquareCap()>
	//   43  108:areturn         

		case 0: // '\0'
			return ((Cap) (new ButtCap()));
	//   44  109:new             #193 <Class ButtCap>
	//   45  112:dup             
	//   46  113:invokespecial   #194 <Method void ButtCap()>
	//   47  116:areturn         
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	private static final String TAG = "Cap";
	private final BitmapDescriptor bitmapDescriptor;
	private final int type;
	private final Float zzcm;

	static 
	{
	//    0    0:new             #38  <Class zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void zzb()>
	//    3    7:putstatic       #43  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
