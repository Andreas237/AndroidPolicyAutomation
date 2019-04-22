// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbs;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			zzv, zzw

public class zzu extends zzbs
{

	public zzu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void zzbs()>
		zzbl = ((Set) (new HashSet(3)));
	//    2    4:aload_0         
	//    3    5:new             #75  <Class HashSet>
	//    4    8:dup             
	//    5    9:iconst_3        
	//    6   10:invokespecial   #78  <Method void HashSet(int)>
	//    7   13:putfield        #80  <Field Set zzbl>
		zzy = 1;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #82  <Field int zzy>
	//   11   21:return          
	}

	zzu(Set set, int i, zzw zzw1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void zzbs()>
		zzbl = set;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #80  <Field Set zzbl>
		zzy = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #82  <Field int zzy>
		zzbv = zzw1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #87  <Field zzw zzbv>
		zzbw = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #89  <Field String zzbw>
		mPackageName = s1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #91  <Field String mPackageName>
	//   17   31:return          
	}

	public void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
	{
		int i = field.getSafeParcelableFieldId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #101 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    2    4:istore          4
		if(i == 2)
	//*   3    6:iload           4
	//*   4    8:iconst_2        
	//*   5    9:icmpne          36
		{
			zzbv = (zzw)fastjsonresponse;
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:checkcast       #53  <Class zzw>
	//    9   17:putfield        #87  <Field zzw zzbv>
			zzbl.add(((Object) (Integer.valueOf(i))));
	//   10   20:aload_0         
	//   11   21:getfield        #80  <Field Set zzbl>
	//   12   24:iload           4
	//   13   26:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   14   29:invokeinterface #113 <Method boolean Set.add(Object)>
	//   15   34:pop             
			return;
	//   16   35:return          
		} else
		{
			throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[] {
				Integer.valueOf(i), ((Object) (fastjsonresponse)).getClass().getCanonicalName()
			}));
	//   17   36:new             #115 <Class IllegalArgumentException>
	//   18   39:dup             
	//   19   40:ldc1            #117 <String "Field with id=%d is not a known custom type. Found %s">
	//   20   42:iconst_2        
	//   21   43:anewarray       Object[]
	//   22   46:dup             
	//   23   47:iconst_0        
	//   24   48:iload           4
	//   25   50:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   26   53:aastore         
	//   27   54:dup             
	//   28   55:iconst_1        
	//   29   56:aload_3         
	//   30   57:invokevirtual   #123 <Method Class Object.getClass()>
	//   31   60:invokevirtual   #129 <Method String Class.getCanonicalName()>
	//   32   63:aastore         
	//   33   64:invokestatic    #135 <Method String String.format(String, Object[])>
	//   34   67:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//   35   70:athrow          
		}
	}

	public Map getFieldMappings()
	{
		return ((Map) (zzbk));
	//    0    0:getstatic       #49  <Field HashMap zzbk>
	//    1    3:areturn         
	}

	protected Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		switch(field.getSafeParcelableFieldId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #101 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
		{
	//*   2    4:tableswitch     1 4: default 36
	//	               1 91
	//	               2 86
	//	               3 81
	//	               4 76
		default:
			int i = field.getSafeParcelableFieldId();
	//    3   36:aload_1         
	//    4   37:invokevirtual   #101 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    5   40:istore_2        
			field = ((com.google.android.gms.common.server.response.FastJsonResponse.Field) (new StringBuilder(37)));
	//    6   41:new             #145 <Class StringBuilder>
	//    7   44:dup             
	//    8   45:bipush          37
	//    9   47:invokespecial   #146 <Method void StringBuilder(int)>
	//   10   50:astore_1        
			((StringBuilder) (field)).append("Unknown SafeParcelable id=");
	//   11   51:aload_1         
	//   12   52:ldc1            #148 <String "Unknown SafeParcelable id=">
	//   13   54:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   14   57:pop             
			((StringBuilder) (field)).append(i);
	//   15   58:aload_1         
	//   16   59:iload_2         
	//   17   60:invokevirtual   #155 <Method StringBuilder StringBuilder.append(int)>
	//   18   63:pop             
			throw new IllegalStateException(((StringBuilder) (field)).toString());
	//   19   64:new             #157 <Class IllegalStateException>
	//   20   67:dup             
	//   21   68:aload_1         
	//   22   69:invokevirtual   #160 <Method String StringBuilder.toString()>
	//   23   72:invokespecial   #161 <Method void IllegalStateException(String)>
	//   24   75:athrow          

		case 4: // '\004'
			return ((Object) (mPackageName));
	//   25   76:aload_0         
	//   26   77:getfield        #91  <Field String mPackageName>
	//   27   80:areturn         

		case 3: // '\003'
			return ((Object) (zzbw));
	//   28   81:aload_0         
	//   29   82:getfield        #89  <Field String zzbw>
	//   30   85:areturn         

		case 2: // '\002'
			return ((Object) (zzbv));
	//   31   86:aload_0         
	//   32   87:getfield        #87  <Field zzw zzbv>
	//   33   90:areturn         

		case 1: // '\001'
			return ((Object) (Integer.valueOf(zzy)));
	//   34   91:aload_0         
	//   35   92:getfield        #82  <Field int zzy>
	//   36   95:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   37   98:areturn         
		}
	}

	protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		return zzbl.contains(((Object) (Integer.valueOf(field.getSafeParcelableFieldId()))));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Set zzbl>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    4    8:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//    5   11:invokeinterface #166 <Method boolean Set.contains(Object)>
	//    6   16:ireturn         
	}

	protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
	{
		int i = field.getSafeParcelableFieldId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #101 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    2    4:istore          4
		switch(i)
	//*   3    6:iload           4
		{
	//*   4    8:tableswitch     3 4: default 32
	//	               3 65
	//	               4 57
		default:
			throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[] {
				Integer.valueOf(i)
			}));
	//    5   32:new             #115 <Class IllegalArgumentException>
	//    6   35:dup             
	//    7   36:ldc1            #170 <String "Field with id=%d is not known to be a string.">
	//    8   38:iconst_1        
	//    9   39:anewarray       Object[]
	//   10   42:dup             
	//   11   43:iconst_0        
	//   12   44:iload           4
	//   13   46:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   14   49:aastore         
	//   15   50:invokestatic    #135 <Method String String.format(String, Object[])>
	//   16   53:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//   17   56:athrow          

		case 4: // '\004'
			mPackageName = s1;
	//   18   57:aload_0         
	//   19   58:aload_3         
	//   20   59:putfield        #91  <Field String mPackageName>
			break;

	//*  21   62:goto            70
		case 3: // '\003'
			zzbw = s1;
	//   22   65:aload_0         
	//   23   66:aload_3         
	//   24   67:putfield        #89  <Field String zzbw>
			break;
		}
		zzbl.add(((Object) (Integer.valueOf(i))));
	//   25   70:aload_0         
	//   26   71:getfield        #80  <Field Set zzbl>
	//   27   74:iload           4
	//   28   76:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   29   79:invokeinterface #113 <Method boolean Set.add(Object)>
	//   30   84:pop             
	//   31   85:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #179 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		Set set = zzbl;
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field Set zzbl>
	//    5    9:astore          4
		if(set.contains(((Object) (Integer.valueOf(1)))))
	//*   6   11:aload           4
	//*   7   13:iconst_1        
	//*   8   14:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//*   9   17:invokeinterface #166 <Method boolean Set.contains(Object)>
	//*  10   22:ifeq            34
			SafeParcelWriter.writeInt(parcel, 1, zzy);
	//   11   25:aload_1         
	//   12   26:iconst_1        
	//   13   27:aload_0         
	//   14   28:getfield        #82  <Field int zzy>
	//   15   31:invokestatic    #183 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		if(set.contains(((Object) (Integer.valueOf(2)))))
	//*  16   34:aload           4
	//*  17   36:iconst_2        
	//*  18   37:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//*  19   40:invokeinterface #166 <Method boolean Set.contains(Object)>
	//*  20   45:ifeq            59
			SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (zzbv)), i, true);
	//   21   48:aload_1         
	//   22   49:iconst_2        
	//   23   50:aload_0         
	//   24   51:getfield        #87  <Field zzw zzbv>
	//   25   54:iload_2         
	//   26   55:iconst_1        
	//   27   56:invokestatic    #187 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		if(set.contains(((Object) (Integer.valueOf(3)))))
	//*  28   59:aload           4
	//*  29   61:iconst_3        
	//*  30   62:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//*  31   65:invokeinterface #166 <Method boolean Set.contains(Object)>
	//*  32   70:ifeq            83
			SafeParcelWriter.writeString(parcel, 3, zzbw, true);
	//   33   73:aload_1         
	//   34   74:iconst_3        
	//   35   75:aload_0         
	//   36   76:getfield        #89  <Field String zzbw>
	//   37   79:iconst_1        
	//   38   80:invokestatic    #191 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		if(set.contains(((Object) (Integer.valueOf(4)))))
	//*  39   83:aload           4
	//*  40   85:iconst_4        
	//*  41   86:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//*  42   89:invokeinterface #166 <Method boolean Set.contains(Object)>
	//*  43   94:ifeq            107
			SafeParcelWriter.writeString(parcel, 4, mPackageName, true);
	//   44   97:aload_1         
	//   45   98:iconst_4        
	//   46   99:aload_0         
	//   47  100:getfield        #91  <Field String mPackageName>
	//   48  103:iconst_1        
	//   49  104:invokestatic    #191 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   50  107:aload_1         
	//   51  108:iload_3         
	//   52  109:invokestatic    #194 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   53  112:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzv();
	private static final HashMap zzbk;
	private String mPackageName;
	private final Set zzbl;
	private zzw zzbv;
	private String zzbw;
	private final int zzy;

	static 
	{
	//    0    0:new             #39  <Class zzv>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void zzv()>
	//    3    7:putstatic       #44  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #46  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #47  <Method void HashMap()>
	//    7   17:astore_0        
		zzbk = hashmap;
	//    8   18:aload_0         
	//    9   19:putstatic       #49  <Field HashMap zzbk>
		hashmap.put("authenticatorInfo", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, com/google/android/gms/auth/api/accounttransfer/zzw))));
	//   10   22:aload_0         
	//   11   23:ldc1            #51  <String "authenticatorInfo">
	//   12   25:ldc1            #51  <String "authenticatorInfo">
	//   13   27:iconst_2        
	//   14   28:ldc1            #53  <Class zzw>
	//   15   30:invokestatic    #59  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forConcreteType(String, int, Class)>
	//   16   33:invokevirtual   #63  <Method Object HashMap.put(Object, Object)>
	//   17   36:pop             
		zzbk.put("signature", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("signature", 3))));
	//   18   37:getstatic       #49  <Field HashMap zzbk>
	//   19   40:ldc1            #65  <String "signature">
	//   20   42:ldc1            #65  <String "signature">
	//   21   44:iconst_3        
	//   22   45:invokestatic    #69  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forString(String, int)>
	//   23   48:invokevirtual   #63  <Method Object HashMap.put(Object, Object)>
	//   24   51:pop             
		zzbk.put("package", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("package", 4))));
	//   25   52:getstatic       #49  <Field HashMap zzbk>
	//   26   55:ldc1            #71  <String "package">
	//   27   57:ldc1            #71  <String "package">
	//   28   59:iconst_4        
	//   29   60:invokestatic    #69  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forString(String, int)>
	//   30   63:invokevirtual   #63  <Method Object HashMap.put(Object, Object)>
	//   31   66:pop             
	//*  32   67:return          
	}
}
