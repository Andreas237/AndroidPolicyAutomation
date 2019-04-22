// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.support.v4.util.ArraySet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.auth.zzbs;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			zzx, DeviceMetaData

public class zzw extends zzbs
{

	public zzw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzbs()>
		zzbl = ((Set) (new ArraySet(3)));
	//    2    4:aload_0         
	//    3    5:new             #83  <Class ArraySet>
	//    4    8:dup             
	//    5    9:iconst_3        
	//    6   10:invokespecial   #86  <Method void ArraySet(int)>
	//    7   13:putfield        #88  <Field Set zzbl>
		zzy = 1;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #90  <Field int zzy>
	//   11   21:return          
	}

	zzw(Set set, int i, String s, int j, byte abyte0[], PendingIntent pendingintent, DeviceMetaData devicemetadata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzbs()>
		zzbl = set;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #88  <Field Set zzbl>
		zzy = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #90  <Field int zzy>
		zzbx = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #95  <Field String zzbx>
		zzby = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #97  <Field int zzby>
		zzbz = abyte0;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #99  <Field byte[] zzbz>
		zzca = pendingintent;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #101 <Field PendingIntent zzca>
		zzcb = devicemetadata;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #103 <Field DeviceMetaData zzcb>
	//   23   43:return          
	}

	public Map getFieldMappings()
	{
		return ((Map) (zzbk));
	//    0    0:getstatic       #57  <Field HashMap zzbk>
	//    1    3:areturn         
	}

	protected Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		field.getSafeParcelableFieldId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #115 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
		JVM INSTR tableswitch 1 4: default 36
	//	               1 96
	//	               2 91
	//	               3 81
	//	               4 76;
	//    2    4:tableswitch     1 4: default 36
	//	               1 96
	//	               2 91
	//	               3 81
	//	               4 76
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		int i = field.getSafeParcelableFieldId();
	//    3   36:aload_1         
	//    4   37:invokevirtual   #115 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    5   40:istore_2        
		field = ((com.google.android.gms.common.server.response.FastJsonResponse.Field) (new StringBuilder(37)));
	//    6   41:new             #117 <Class StringBuilder>
	//    7   44:dup             
	//    8   45:bipush          37
	//    9   47:invokespecial   #118 <Method void StringBuilder(int)>
	//   10   50:astore_1        
		((StringBuilder) (field)).append("Unknown SafeParcelable id=");
	//   11   51:aload_1         
	//   12   52:ldc1            #120 <String "Unknown SafeParcelable id=">
	//   13   54:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   14   57:pop             
		((StringBuilder) (field)).append(i);
	//   15   58:aload_1         
	//   16   59:iload_2         
	//   17   60:invokevirtual   #127 <Method StringBuilder StringBuilder.append(int)>
	//   18   63:pop             
		throw new IllegalStateException(((StringBuilder) (field)).toString());
	//   19   64:new             #129 <Class IllegalStateException>
	//   20   67:dup             
	//   21   68:aload_1         
	//   22   69:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   23   72:invokespecial   #136 <Method void IllegalStateException(String)>
	//   24   75:athrow          
_L5:
		return ((Object) (zzbz));
	//   25   76:aload_0         
	//   26   77:getfield        #99  <Field byte[] zzbz>
	//   27   80:areturn         
_L4:
		int j = zzby;
	//   28   81:aload_0         
	//   29   82:getfield        #97  <Field int zzby>
	//   30   85:istore_2        
_L7:
		return ((Object) (Integer.valueOf(j)));
	//   31   86:iload_2         
	//   32   87:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   33   90:areturn         
_L3:
		return ((Object) (zzbx));
	//   34   91:aload_0         
	//   35   92:getfield        #95  <Field String zzbx>
	//   36   95:areturn         
_L2:
		j = zzy;
	//   37   96:aload_0         
	//   38   97:getfield        #90  <Field int zzy>
	//   39  100:istore_2        
		if(true) goto _L7; else goto _L6
	//   40  101:goto            86
_L6:
	}

	protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		return zzbl.contains(((Object) (Integer.valueOf(field.getSafeParcelableFieldId()))));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Set zzbl>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    4    8:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//    5   11:invokeinterface #150 <Method boolean Set.contains(Object)>
	//    6   16:ireturn         
	}

	protected void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, byte abyte0[])
	{
		int i = field.getSafeParcelableFieldId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #115 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    2    4:istore          4
		if(i == 4)
	//*   3    6:iload           4
	//*   4    8:iconst_4        
	//*   5    9:icmpne          33
		{
			zzbz = abyte0;
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:putfield        #99  <Field byte[] zzbz>
			zzbl.add(((Object) (Integer.valueOf(i))));
	//    9   17:aload_0         
	//   10   18:getfield        #88  <Field Set zzbl>
	//   11   21:iload           4
	//   12   23:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   13   26:invokeinterface #155 <Method boolean Set.add(Object)>
	//   14   31:pop             
			return;
	//   15   32:return          
		} else
		{
			field = ((com.google.android.gms.common.server.response.FastJsonResponse.Field) (new StringBuilder(59)));
	//   16   33:new             #117 <Class StringBuilder>
	//   17   36:dup             
	//   18   37:bipush          59
	//   19   39:invokespecial   #118 <Method void StringBuilder(int)>
	//   20   42:astore_1        
			((StringBuilder) (field)).append("Field with id=");
	//   21   43:aload_1         
	//   22   44:ldc1            #157 <String "Field with id=">
	//   23   46:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
			((StringBuilder) (field)).append(i);
	//   25   50:aload_1         
	//   26   51:iload           4
	//   27   53:invokevirtual   #127 <Method StringBuilder StringBuilder.append(int)>
	//   28   56:pop             
			((StringBuilder) (field)).append(" is not known to be an byte array.");
	//   29   57:aload_1         
	//   30   58:ldc1            #159 <String " is not known to be an byte array.">
	//   31   60:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
			throw new IllegalArgumentException(((StringBuilder) (field)).toString());
	//   33   64:new             #161 <Class IllegalArgumentException>
	//   34   67:dup             
	//   35   68:aload_1         
	//   36   69:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   37   72:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   38   75:athrow          
		}
	}

	protected void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
	{
		int j = field.getSafeParcelableFieldId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #115 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    2    4:istore          4
		if(j == 3)
	//*   3    6:iload           4
	//*   4    8:iconst_3        
	//*   5    9:icmpne          33
		{
			zzby = i;
	//    6   12:aload_0         
	//    7   13:iload_3         
	//    8   14:putfield        #97  <Field int zzby>
			zzbl.add(((Object) (Integer.valueOf(j))));
	//    9   17:aload_0         
	//   10   18:getfield        #88  <Field Set zzbl>
	//   11   21:iload           4
	//   12   23:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   13   26:invokeinterface #155 <Method boolean Set.add(Object)>
	//   14   31:pop             
			return;
	//   15   32:return          
		} else
		{
			field = ((com.google.android.gms.common.server.response.FastJsonResponse.Field) (new StringBuilder(52)));
	//   16   33:new             #117 <Class StringBuilder>
	//   17   36:dup             
	//   18   37:bipush          52
	//   19   39:invokespecial   #118 <Method void StringBuilder(int)>
	//   20   42:astore_1        
			((StringBuilder) (field)).append("Field with id=");
	//   21   43:aload_1         
	//   22   44:ldc1            #157 <String "Field with id=">
	//   23   46:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
			((StringBuilder) (field)).append(j);
	//   25   50:aload_1         
	//   26   51:iload           4
	//   27   53:invokevirtual   #127 <Method StringBuilder StringBuilder.append(int)>
	//   28   56:pop             
			((StringBuilder) (field)).append(" is not known to be an int.");
	//   29   57:aload_1         
	//   30   58:ldc1            #167 <String " is not known to be an int.">
	//   31   60:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
			throw new IllegalArgumentException(((StringBuilder) (field)).toString());
	//   33   64:new             #161 <Class IllegalArgumentException>
	//   34   67:dup             
	//   35   68:aload_1         
	//   36   69:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   37   72:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   38   75:athrow          
		}
	}

	protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
	{
		int i = field.getSafeParcelableFieldId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #115 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    2    4:istore          4
		if(i == 2)
	//*   3    6:iload           4
	//*   4    8:iconst_2        
	//*   5    9:icmpne          33
		{
			zzbx = s1;
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:putfield        #95  <Field String zzbx>
			zzbl.add(((Object) (Integer.valueOf(i))));
	//    9   17:aload_0         
	//   10   18:getfield        #88  <Field Set zzbl>
	//   11   21:iload           4
	//   12   23:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   13   26:invokeinterface #155 <Method boolean Set.add(Object)>
	//   14   31:pop             
			return;
	//   15   32:return          
		} else
		{
			throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[] {
				Integer.valueOf(i)
			}));
	//   16   33:new             #161 <Class IllegalArgumentException>
	//   17   36:dup             
	//   18   37:ldc1            #172 <String "Field with id=%d is not known to be a string.">
	//   19   39:iconst_1        
	//   20   40:anewarray       Object[]
	//   21   43:dup             
	//   22   44:iconst_0        
	//   23   45:iload           4
	//   24   47:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   25   50:aastore         
	//   26   51:invokestatic    #180 <Method String String.format(String, Object[])>
	//   27   54:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   28   57:athrow          
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #189 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		Set set = zzbl;
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field Set zzbl>
	//    5    9:astore          4
		if(set.contains(((Object) (Integer.valueOf(1)))))
	//*   6   11:aload           4
	//*   7   13:iconst_1        
	//*   8   14:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*   9   17:invokeinterface #150 <Method boolean Set.contains(Object)>
	//*  10   22:ifeq            34
			SafeParcelWriter.writeInt(parcel, 1, zzy);
	//   11   25:aload_1         
	//   12   26:iconst_1        
	//   13   27:aload_0         
	//   14   28:getfield        #90  <Field int zzy>
	//   15   31:invokestatic    #193 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		if(set.contains(((Object) (Integer.valueOf(2)))))
	//*  16   34:aload           4
	//*  17   36:iconst_2        
	//*  18   37:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  19   40:invokeinterface #150 <Method boolean Set.contains(Object)>
	//*  20   45:ifeq            58
			SafeParcelWriter.writeString(parcel, 2, zzbx, true);
	//   21   48:aload_1         
	//   22   49:iconst_2        
	//   23   50:aload_0         
	//   24   51:getfield        #95  <Field String zzbx>
	//   25   54:iconst_1        
	//   26   55:invokestatic    #197 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		if(set.contains(((Object) (Integer.valueOf(3)))))
	//*  27   58:aload           4
	//*  28   60:iconst_3        
	//*  29   61:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  30   64:invokeinterface #150 <Method boolean Set.contains(Object)>
	//*  31   69:ifeq            81
			SafeParcelWriter.writeInt(parcel, 3, zzby);
	//   32   72:aload_1         
	//   33   73:iconst_3        
	//   34   74:aload_0         
	//   35   75:getfield        #97  <Field int zzby>
	//   36   78:invokestatic    #193 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		if(set.contains(((Object) (Integer.valueOf(4)))))
	//*  37   81:aload           4
	//*  38   83:iconst_4        
	//*  39   84:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  40   87:invokeinterface #150 <Method boolean Set.contains(Object)>
	//*  41   92:ifeq            105
			SafeParcelWriter.writeByteArray(parcel, 4, zzbz, true);
	//   42   95:aload_1         
	//   43   96:iconst_4        
	//   44   97:aload_0         
	//   45   98:getfield        #99  <Field byte[] zzbz>
	//   46  101:iconst_1        
	//   47  102:invokestatic    #201 <Method void SafeParcelWriter.writeByteArray(Parcel, int, byte[], boolean)>
		if(set.contains(((Object) (Integer.valueOf(5)))))
	//*  48  105:aload           4
	//*  49  107:iconst_5        
	//*  50  108:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  51  111:invokeinterface #150 <Method boolean Set.contains(Object)>
	//*  52  116:ifeq            130
			SafeParcelWriter.writeParcelable(parcel, 5, ((android.os.Parcelable) (zzca)), i, true);
	//   53  119:aload_1         
	//   54  120:iconst_5        
	//   55  121:aload_0         
	//   56  122:getfield        #101 <Field PendingIntent zzca>
	//   57  125:iload_2         
	//   58  126:iconst_1        
	//   59  127:invokestatic    #205 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		if(set.contains(((Object) (Integer.valueOf(6)))))
	//*  60  130:aload           4
	//*  61  132:bipush          6
	//*  62  134:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  63  137:invokeinterface #150 <Method boolean Set.contains(Object)>
	//*  64  142:ifeq            157
			SafeParcelWriter.writeParcelable(parcel, 6, ((android.os.Parcelable) (zzcb)), i, true);
	//   65  145:aload_1         
	//   66  146:bipush          6
	//   67  148:aload_0         
	//   68  149:getfield        #103 <Field DeviceMetaData zzcb>
	//   69  152:iload_2         
	//   70  153:iconst_1        
	//   71  154:invokestatic    #205 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   72  157:aload_1         
	//   73  158:iload_3         
	//   74  159:invokestatic    #208 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   75  162:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzx();
	private static final HashMap zzbk;
	private final Set zzbl;
	private String zzbx;
	private int zzby;
	private byte zzbz[];
	private PendingIntent zzca;
	private DeviceMetaData zzcb;
	private final int zzy;

	static 
	{
	//    0    0:new             #47  <Class zzx>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void zzx()>
	//    3    7:putstatic       #52  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #54  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #55  <Method void HashMap()>
	//    7   17:astore_0        
		zzbk = hashmap;
	//    8   18:aload_0         
	//    9   19:putstatic       #57  <Field HashMap zzbk>
		hashmap.put("accountType", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("accountType", 2))));
	//   10   22:aload_0         
	//   11   23:ldc1            #59  <String "accountType">
	//   12   25:ldc1            #59  <String "accountType">
	//   13   27:iconst_2        
	//   14   28:invokestatic    #65  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forString(String, int)>
	//   15   31:invokevirtual   #69  <Method Object HashMap.put(Object, Object)>
	//   16   34:pop             
		zzbk.put("status", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("status", 3))));
	//   17   35:getstatic       #57  <Field HashMap zzbk>
	//   18   38:ldc1            #71  <String "status">
	//   19   40:ldc1            #71  <String "status">
	//   20   42:iconst_3        
	//   21   43:invokestatic    #74  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forInteger(String, int)>
	//   22   46:invokevirtual   #69  <Method Object HashMap.put(Object, Object)>
	//   23   49:pop             
		zzbk.put("transferBytes", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forBase64("transferBytes", 4))));
	//   24   50:getstatic       #57  <Field HashMap zzbk>
	//   25   53:ldc1            #76  <String "transferBytes">
	//   26   55:ldc1            #76  <String "transferBytes">
	//   27   57:iconst_4        
	//   28   58:invokestatic    #79  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forBase64(String, int)>
	//   29   61:invokevirtual   #69  <Method Object HashMap.put(Object, Object)>
	//   30   64:pop             
	//*  31   65:return          
	}
}
