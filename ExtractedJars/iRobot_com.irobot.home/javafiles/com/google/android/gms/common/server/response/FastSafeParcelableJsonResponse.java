// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FastJsonResponse

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse
	implements SafeParcelable
{

	public FastSafeParcelableJsonResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void FastJsonResponse()>
	//    2    4:return          
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
				return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
			if(!((Object)this).getClass().isInstance(obj))
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #24  <Method Class Object.getClass()>
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #29  <Method boolean Class.isInstance(Object)>
	//*   9   15:ifne            20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			obj = ((Object) ((FastJsonResponse)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #4   <Class FastJsonResponse>
	//   14   24:astore_1        
			Iterator iterator = ((FastJsonResponse)this).getFieldMappings().values().iterator();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #33  <Method Map FastJsonResponse.getFieldMappings()>
	//   17   29:invokeinterface #39  <Method Collection Map.values()>
	//   18   34:invokeinterface #45  <Method Iterator Collection.iterator()>
	//   19   39:astore_2        
			FastJsonResponse.Field field;
label1:
			do
			{
				do
				{
					if(!iterator.hasNext())
						break label0;
	//   20   40:aload_2         
	//   21   41:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//   22   46:ifeq            103
					field = (FastJsonResponse.Field)iterator.next();
	//   23   49:aload_2         
	//   24   50:invokeinterface #55  <Method Object Iterator.next()>
	//   25   55:checkcast       #57  <Class FastJsonResponse$Field>
	//   26   58:astore_3        
					if(!((FastJsonResponse)this).isFieldSet(field))
						continue label1;
	//   27   59:aload_0         
	//   28   60:aload_3         
	//   29   61:invokevirtual   #61  <Method boolean FastJsonResponse.isFieldSet(FastJsonResponse$Field)>
	//   30   64:ifeq            93
				} while(((FastJsonResponse) (obj)).isFieldSet(field) && ((FastJsonResponse)this).getFieldValue(field).equals(((FastJsonResponse) (obj)).getFieldValue(field)));
	//   31   67:aload_1         
	//   32   68:aload_3         
	//   33   69:invokevirtual   #61  <Method boolean FastJsonResponse.isFieldSet(FastJsonResponse$Field)>
	//   34   72:ifeq            91
	//   35   75:aload_0         
	//   36   76:aload_3         
	//   37   77:invokevirtual   #65  <Method Object FastJsonResponse.getFieldValue(FastJsonResponse$Field)>
	//   38   80:aload_1         
	//   39   81:aload_3         
	//   40   82:invokevirtual   #65  <Method Object FastJsonResponse.getFieldValue(FastJsonResponse$Field)>
	//   41   85:invokevirtual   #67  <Method boolean Object.equals(Object)>
	//   42   88:ifne            40
				return false;
	//   43   91:iconst_0        
	//   44   92:ireturn         
			} while(!((FastJsonResponse) (obj)).isFieldSet(field));
	//   45   93:aload_1         
	//   46   94:aload_3         
	//   47   95:invokevirtual   #61  <Method boolean FastJsonResponse.isFieldSet(FastJsonResponse$Field)>
	//   48   98:ifeq            40
			return false;
	//   49  101:iconst_0        
	//   50  102:ireturn         
		}
		return true;
	//   51  103:iconst_1        
	//   52  104:ireturn         
	}

	public Object getValueObject(String s)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int hashCode()
	{
		Iterator iterator = ((FastJsonResponse)this).getFieldMappings().values().iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Map FastJsonResponse.getFieldMappings()>
	//    2    4:invokeinterface #39  <Method Collection Map.values()>
	//    3    9:invokeinterface #45  <Method Iterator Collection.iterator()>
	//    4   14:astore_2        
		int i = 0;
	//    5   15:iconst_0        
	//    6   16:istore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   17:aload_2         
	//    8   18:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            61
			FastJsonResponse.Field field = (FastJsonResponse.Field)iterator.next();
	//   10   26:aload_2         
	//   11   27:invokeinterface #55  <Method Object Iterator.next()>
	//   12   32:checkcast       #57  <Class FastJsonResponse$Field>
	//   13   35:astore_3        
			if(((FastJsonResponse)this).isFieldSet(field))
	//*  14   36:aload_0         
	//*  15   37:aload_3         
	//*  16   38:invokevirtual   #61  <Method boolean FastJsonResponse.isFieldSet(FastJsonResponse$Field)>
	//*  17   41:ifeq            17
				i = i * 31 + ((FastJsonResponse)this).getFieldValue(field).hashCode();
	//   18   44:iload_1         
	//   19   45:bipush          31
	//   20   47:imul            
	//   21   48:aload_0         
	//   22   49:aload_3         
	//   23   50:invokevirtual   #65  <Method Object FastJsonResponse.getFieldValue(FastJsonResponse$Field)>
	//   24   53:invokevirtual   #73  <Method int Object.hashCode()>
	//   25   56:iadd            
	//   26   57:istore_1        
		} while(true);
	//   27   58:goto            17
		return i;
	//   28   61:iload_1         
	//   29   62:ireturn         
	}

	public boolean isPrimitiveFieldSet(String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public byte[] toByteArray()
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #83  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		writeToParcel(parcel, 0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #87  <Method void writeToParcel(Parcel, int)>
		byte abyte0[] = parcel.marshall();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #90  <Method byte[] Parcel.marshall()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #93  <Method void Parcel.recycle()>
		return abyte0;
	//   11   19:aload_2         
	//   12   20:areturn         
	}
}
