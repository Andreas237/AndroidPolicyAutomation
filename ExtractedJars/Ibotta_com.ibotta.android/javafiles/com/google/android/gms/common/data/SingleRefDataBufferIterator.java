// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//			DataBufferIterator, DataBuffer, DataBufferRef

public class SingleRefDataBufferIterator extends DataBufferIterator
{

	public SingleRefDataBufferIterator(DataBuffer databuffer)
	{
		super(databuffer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void DataBufferIterator(DataBuffer)>
	//    3    5:return          
	}

	public Object next()
	{
		if(((DataBufferIterator)this).hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method boolean DataBufferIterator.hasNext()>
	//*   2    4:ifeq            130
		{
			mPosition = mPosition + 1;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int mPosition>
	//    6   12:iconst_1        
	//    7   13:iadd            
	//    8   14:putfield        #25  <Field int mPosition>
			if(mPosition == 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #25  <Field int mPosition>
	//*  11   21:ifne            111
			{
				zzoj = mDataBuffer.get(0);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #29  <Field DataBuffer mDataBuffer>
	//   15   29:iconst_0        
	//   16   30:invokeinterface #35  <Method Object DataBuffer.get(int)>
	//   17   35:putfield        #37  <Field Object zzoj>
				Object obj = zzoj;
	//   18   38:aload_0         
	//   19   39:getfield        #37  <Field Object zzoj>
	//   20   42:astore_2        
				if(!(obj instanceof DataBufferRef))
	//*  21   43:aload_2         
	//*  22   44:instanceof      #39  <Class DataBufferRef>
	//*  23   47:ifeq            53
	//*  24   50:goto            125
				{
					obj = ((Object) (String.valueOf(((Object) (obj.getClass())))));
	//   25   53:aload_2         
	//   26   54:invokevirtual   #45  <Method Class Object.getClass()>
	//   27   57:invokestatic    #51  <Method String String.valueOf(Object)>
	//   28   60:astore_2        
					StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(obj).length() + 44);
	//   29   61:new             #53  <Class StringBuilder>
	//   30   64:dup             
	//   31   65:aload_2         
	//   32   66:invokestatic    #51  <Method String String.valueOf(Object)>
	//   33   69:invokevirtual   #57  <Method int String.length()>
	//   34   72:bipush          44
	//   35   74:iadd            
	//   36   75:invokespecial   #60  <Method void StringBuilder(int)>
	//   37   78:astore_3        
					stringbuilder1.append("DataBuffer reference of type ");
	//   38   79:aload_3         
	//   39   80:ldc1            #62  <String "DataBuffer reference of type ">
	//   40   82:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   41   85:pop             
					stringbuilder1.append(((String) (obj)));
	//   42   86:aload_3         
	//   43   87:aload_2         
	//   44   88:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
					stringbuilder1.append(" is not movable");
	//   46   92:aload_3         
	//   47   93:ldc1            #68  <String " is not movable">
	//   48   95:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   49   98:pop             
					throw new IllegalStateException(stringbuilder1.toString());
	//   50   99:new             #70  <Class IllegalStateException>
	//   51  102:dup             
	//   52  103:aload_3         
	//   53  104:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   54  107:invokespecial   #77  <Method void IllegalStateException(String)>
	//   55  110:athrow          
				}
			} else
			{
				((DataBufferRef)zzoj).setDataRow(mPosition);
	//   56  111:aload_0         
	//   57  112:getfield        #37  <Field Object zzoj>
	//   58  115:checkcast       #39  <Class DataBufferRef>
	//   59  118:aload_0         
	//   60  119:getfield        #25  <Field int mPosition>
	//   61  122:invokevirtual   #80  <Method void DataBufferRef.setDataRow(int)>
			}
			return zzoj;
	//   62  125:aload_0         
	//   63  126:getfield        #37  <Field Object zzoj>
	//   64  129:areturn         
		} else
		{
			int i = mPosition;
	//   65  130:aload_0         
	//   66  131:getfield        #25  <Field int mPosition>
	//   67  134:istore_1        
			StringBuilder stringbuilder = new StringBuilder(46);
	//   68  135:new             #53  <Class StringBuilder>
	//   69  138:dup             
	//   70  139:bipush          46
	//   71  141:invokespecial   #60  <Method void StringBuilder(int)>
	//   72  144:astore_2        
			stringbuilder.append("Cannot advance the iterator beyond ");
	//   73  145:aload_2         
	//   74  146:ldc1            #82  <String "Cannot advance the iterator beyond ">
	//   75  148:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   76  151:pop             
			stringbuilder.append(i);
	//   77  152:aload_2         
	//   78  153:iload_1         
	//   79  154:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   80  157:pop             
			throw new NoSuchElementException(stringbuilder.toString());
	//   81  158:new             #87  <Class NoSuchElementException>
	//   82  161:dup             
	//   83  162:aload_2         
	//   84  163:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   85  166:invokespecial   #88  <Method void NoSuchElementException(String)>
	//   86  169:athrow          
		}
	}

	private Object zzoj;
}
