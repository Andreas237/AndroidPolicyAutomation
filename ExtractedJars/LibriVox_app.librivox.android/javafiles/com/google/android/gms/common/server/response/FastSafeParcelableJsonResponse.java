// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

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
	//    1    1:invokespecial   #10  <Method void FastJsonResponse()>
	//    2    4:return          
	}

	public Object a(String s)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean b(String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
	//*   6    8:invokevirtual   #25  <Method Class Object.getClass()>
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #30  <Method boolean Class.isInstance(Object)>
	//*   9   15:ifne            20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			obj = ((Object) ((FastJsonResponse)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #4   <Class FastJsonResponse>
	//   14   24:astore_1        
			FastJsonResponse.Field field;
label1:
			do
			{
				for(Iterator iterator = ((FastJsonResponse)this).a().values().iterator(); iterator.hasNext();)
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #33  <Method Map FastJsonResponse.a()>
	//*  17   29:invokeinterface #39  <Method Collection Map.values()>
	//*  18   34:invokeinterface #45  <Method Iterator Collection.iterator()>
	//*  19   39:astore_2        
	//*  20   40:aload_2         
	//*  21   41:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*  22   46:ifeq            105
				{
					field = (FastJsonResponse.Field)iterator.next();
	//   23   49:aload_2         
	//   24   50:invokeinterface #55  <Method Object Iterator.next()>
	//   25   55:checkcast       #57  <Class FastJsonResponse$Field>
	//   26   58:astore_3        
					if(!((FastJsonResponse)this).a(field))
						continue label1;
	//   27   59:aload_0         
	//   28   60:aload_3         
	//   29   61:invokevirtual   #60  <Method boolean FastJsonResponse.a(FastJsonResponse$Field)>
	//   30   64:ifeq            95
					if(((FastJsonResponse) (obj)).a(field))
	//*  31   67:aload_1         
	//*  32   68:aload_3         
	//*  33   69:invokevirtual   #60  <Method boolean FastJsonResponse.a(FastJsonResponse$Field)>
	//*  34   72:ifeq            93
					{
						if(!((FastJsonResponse)this).b(field).equals(((FastJsonResponse) (obj)).b(field)))
	//*  35   75:aload_0         
	//*  36   76:aload_3         
	//*  37   77:invokevirtual   #63  <Method Object FastJsonResponse.b(FastJsonResponse$Field)>
	//*  38   80:aload_1         
	//*  39   81:aload_3         
	//*  40   82:invokevirtual   #63  <Method Object FastJsonResponse.b(FastJsonResponse$Field)>
	//*  41   85:invokevirtual   #65  <Method boolean Object.equals(Object)>
	//*  42   88:ifne            40
							return false;
	//   43   91:iconst_0        
	//   44   92:ireturn         
					} else
					{
						return false;
	//   45   93:iconst_0        
	//   46   94:ireturn         
					}
				}

				break label0;
			} while(!((FastJsonResponse) (obj)).a(field));
	//   47   95:aload_1         
	//   48   96:aload_3         
	//   49   97:invokevirtual   #60  <Method boolean FastJsonResponse.a(FastJsonResponse$Field)>
	//   50  100:ifeq            40
			return false;
	//   51  103:iconst_0        
	//   52  104:ireturn         
		}
		return true;
	//   53  105:iconst_1        
	//   54  106:ireturn         
	}

	public int hashCode()
	{
		Iterator iterator = ((FastJsonResponse)this).a().values().iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Map FastJsonResponse.a()>
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
			if(((FastJsonResponse)this).a(field))
	//*  14   36:aload_0         
	//*  15   37:aload_3         
	//*  16   38:invokevirtual   #60  <Method boolean FastJsonResponse.a(FastJsonResponse$Field)>
	//*  17   41:ifeq            17
				i = i * 31 + ((FastJsonResponse)this).b(field).hashCode();
	//   18   44:iload_1         
	//   19   45:bipush          31
	//   20   47:imul            
	//   21   48:aload_0         
	//   22   49:aload_3         
	//   23   50:invokevirtual   #63  <Method Object FastJsonResponse.b(FastJsonResponse$Field)>
	//   24   53:invokevirtual   #68  <Method int Object.hashCode()>
	//   25   56:iadd            
	//   26   57:istore_1        
		} while(true);
	//   27   58:goto            17
		return i;
	//   28   61:iload_1         
	//   29   62:ireturn         
	}
}
