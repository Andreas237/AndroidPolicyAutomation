// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.auth.zzbs;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			zzs

public class zzr extends zzbs
{

	public zzr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void zzbs()>
		zzy = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #75  <Field int zzy>
	//    5    9:return          
	}

	zzr(int i, List list, List list1, List list2, List list3, List list4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void zzbs()>
		zzy = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #75  <Field int zzy>
		zzbq = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #81  <Field List zzbq>
		zzbr = list1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #83  <Field List zzbr>
		zzbs = list2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #85  <Field List zzbs>
		zzbt = list3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #87  <Field List zzbt>
		zzbu = list4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #89  <Field List zzbu>
	//   20   37:return          
	}

	public Map getFieldMappings()
	{
		return ((Map) (zzbp));
	//    0    0:getstatic       #51  <Field ArrayMap zzbp>
	//    1    3:areturn         
	}

	protected Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		switch(field.getSafeParcelableFieldId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #102 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
		{
	//*   2    4:tableswitch     1 6: default 44
	//	               1 109
	//	               2 104
	//	               3 99
	//	               4 94
	//	               5 89
	//	               6 84
		default:
			int i = field.getSafeParcelableFieldId();
	//    3   44:aload_1         
	//    4   45:invokevirtual   #102 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    5   48:istore_2        
			field = ((com.google.android.gms.common.server.response.FastJsonResponse.Field) (new StringBuilder(37)));
	//    6   49:new             #104 <Class StringBuilder>
	//    7   52:dup             
	//    8   53:bipush          37
	//    9   55:invokespecial   #107 <Method void StringBuilder(int)>
	//   10   58:astore_1        
			((StringBuilder) (field)).append("Unknown SafeParcelable id=");
	//   11   59:aload_1         
	//   12   60:ldc1            #109 <String "Unknown SafeParcelable id=">
	//   13   62:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   14   65:pop             
			((StringBuilder) (field)).append(i);
	//   15   66:aload_1         
	//   16   67:iload_2         
	//   17   68:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//   18   71:pop             
			throw new IllegalStateException(((StringBuilder) (field)).toString());
	//   19   72:new             #118 <Class IllegalStateException>
	//   20   75:dup             
	//   21   76:aload_1         
	//   22   77:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   23   80:invokespecial   #125 <Method void IllegalStateException(String)>
	//   24   83:athrow          

		case 6: // '\006'
			return ((Object) (zzbu));
	//   25   84:aload_0         
	//   26   85:getfield        #89  <Field List zzbu>
	//   27   88:areturn         

		case 5: // '\005'
			return ((Object) (zzbt));
	//   28   89:aload_0         
	//   29   90:getfield        #87  <Field List zzbt>
	//   30   93:areturn         

		case 4: // '\004'
			return ((Object) (zzbs));
	//   31   94:aload_0         
	//   32   95:getfield        #85  <Field List zzbs>
	//   33   98:areturn         

		case 3: // '\003'
			return ((Object) (zzbr));
	//   34   99:aload_0         
	//   35  100:getfield        #83  <Field List zzbr>
	//   36  103:areturn         

		case 2: // '\002'
			return ((Object) (zzbq));
	//   37  104:aload_0         
	//   38  105:getfield        #81  <Field List zzbq>
	//   39  108:areturn         

		case 1: // '\001'
			return ((Object) (Integer.valueOf(zzy)));
	//   40  109:aload_0         
	//   41  110:getfield        #75  <Field int zzy>
	//   42  113:invokestatic    #131 <Method Integer Integer.valueOf(int)>
	//   43  116:areturn         
		}
	}

	protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		int i = field.getSafeParcelableFieldId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #102 <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    2    4:istore          4
		switch(i)
	//*   3    6:iload           4
		{
	//*   4    8:tableswitch     2 6: default 44
	//	               2 93
	//	               3 87
	//	               4 81
	//	               5 75
	//	               6 69
		default:
			throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[] {
				Integer.valueOf(i)
			}));
	//    5   44:new             #137 <Class IllegalArgumentException>
	//    6   47:dup             
	//    7   48:ldc1            #139 <String "Field with id=%d is not known to be a string list.">
	//    8   50:iconst_1        
	//    9   51:anewarray       Object[]
	//   10   54:dup             
	//   11   55:iconst_0        
	//   12   56:iload           4
	//   13   58:invokestatic    #131 <Method Integer Integer.valueOf(int)>
	//   14   61:aastore         
	//   15   62:invokestatic    #147 <Method String String.format(String, Object[])>
	//   16   65:invokespecial   #148 <Method void IllegalArgumentException(String)>
	//   17   68:athrow          

		case 6: // '\006'
			zzbu = ((List) (arraylist));
	//   18   69:aload_0         
	//   19   70:aload_3         
	//   20   71:putfield        #89  <Field List zzbu>
			return;
	//   21   74:return          

		case 5: // '\005'
			zzbt = ((List) (arraylist));
	//   22   75:aload_0         
	//   23   76:aload_3         
	//   24   77:putfield        #87  <Field List zzbt>
			return;
	//   25   80:return          

		case 4: // '\004'
			zzbs = ((List) (arraylist));
	//   26   81:aload_0         
	//   27   82:aload_3         
	//   28   83:putfield        #85  <Field List zzbs>
			return;
	//   29   86:return          

		case 3: // '\003'
			zzbr = ((List) (arraylist));
	//   30   87:aload_0         
	//   31   88:aload_3         
	//   32   89:putfield        #83  <Field List zzbr>
			return;
	//   33   92:return          

		case 2: // '\002'
			zzbq = ((List) (arraylist));
	//   34   93:aload_0         
	//   35   94:aload_3         
	//   36   95:putfield        #81  <Field List zzbq>
			return;
	//   37   98:return          
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #157 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzy);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #75  <Field int zzy>
	//    7   11:invokestatic    #161 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeStringList(parcel, 2, zzbq, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #81  <Field List zzbq>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #165 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeStringList(parcel, 3, zzbr, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #83  <Field List zzbr>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #165 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeStringList(parcel, 4, zzbs, false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #85  <Field List zzbs>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #165 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeStringList(parcel, 5, zzbt, false);
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:getfield        #87  <Field List zzbt>
	//   30   50:iconst_0        
	//   31   51:invokestatic    #165 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeStringList(parcel, 6, zzbu, false);
	//   32   54:aload_1         
	//   33   55:bipush          6
	//   34   57:aload_0         
	//   35   58:getfield        #89  <Field List zzbu>
	//   36   61:iconst_0        
	//   37   62:invokestatic    #165 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   38   65:aload_1         
	//   39   66:iload_2         
	//   40   67:invokestatic    #168 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   41   70:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzs();
	private static final ArrayMap zzbp;
	private List zzbq;
	private List zzbr;
	private List zzbs;
	private List zzbt;
	private List zzbu;
	private final int zzy;

	static 
	{
	//    0    0:new             #41  <Class zzs>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void zzs()>
	//    3    7:putstatic       #46  <Field android.os.Parcelable$Creator CREATOR>
		ArrayMap arraymap = new ArrayMap();
	//    4   10:new             #48  <Class ArrayMap>
	//    5   13:dup             
	//    6   14:invokespecial   #49  <Method void ArrayMap()>
	//    7   17:astore_0        
		zzbp = arraymap;
	//    8   18:aload_0         
	//    9   19:putstatic       #51  <Field ArrayMap zzbp>
		arraymap.put("registered", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("registered", 2))));
	//   10   22:aload_0         
	//   11   23:ldc1            #53  <String "registered">
	//   12   25:ldc1            #53  <String "registered">
	//   13   27:iconst_2        
	//   14   28:invokestatic    #59  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings(String, int)>
	//   15   31:invokevirtual   #63  <Method Object ArrayMap.put(Object, Object)>
	//   16   34:pop             
		zzbp.put("in_progress", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("in_progress", 3))));
	//   17   35:getstatic       #51  <Field ArrayMap zzbp>
	//   18   38:ldc1            #65  <String "in_progress">
	//   19   40:ldc1            #65  <String "in_progress">
	//   20   42:iconst_3        
	//   21   43:invokestatic    #59  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings(String, int)>
	//   22   46:invokevirtual   #63  <Method Object ArrayMap.put(Object, Object)>
	//   23   49:pop             
		zzbp.put("success", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("success", 4))));
	//   24   50:getstatic       #51  <Field ArrayMap zzbp>
	//   25   53:ldc1            #67  <String "success">
	//   26   55:ldc1            #67  <String "success">
	//   27   57:iconst_4        
	//   28   58:invokestatic    #59  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings(String, int)>
	//   29   61:invokevirtual   #63  <Method Object ArrayMap.put(Object, Object)>
	//   30   64:pop             
		zzbp.put("failed", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("failed", 5))));
	//   31   65:getstatic       #51  <Field ArrayMap zzbp>
	//   32   68:ldc1            #69  <String "failed">
	//   33   70:ldc1            #69  <String "failed">
	//   34   72:iconst_5        
	//   35   73:invokestatic    #59  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings(String, int)>
	//   36   76:invokevirtual   #63  <Method Object ArrayMap.put(Object, Object)>
	//   37   79:pop             
		zzbp.put("escrowed", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("escrowed", 6))));
	//   38   80:getstatic       #51  <Field ArrayMap zzbp>
	//   39   83:ldc1            #71  <String "escrowed">
	//   40   85:ldc1            #71  <String "escrowed">
	//   41   87:bipush          6
	//   42   89:invokestatic    #59  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings(String, int)>
	//   43   92:invokevirtual   #63  <Method Object ArrayMap.put(Object, Object)>
	//   44   95:pop             
	//*  45   96:return          
	}
}
