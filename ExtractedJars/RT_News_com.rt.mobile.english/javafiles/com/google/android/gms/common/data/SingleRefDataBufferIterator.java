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
		if(!((DataBufferIterator)this).hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method boolean DataBufferIterator.hasNext()>
	//*   2    4:ifne            47
		{
			int i = mPosition;
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field int mPosition>
	//    5   11:istore_1        
			StringBuilder stringbuilder = new StringBuilder(46);
	//    6   12:new             #27  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:bipush          46
	//    9   18:invokespecial   #30  <Method void StringBuilder(int)>
	//   10   21:astore_2        
			stringbuilder.append("Cannot advance the iterator beyond ");
	//   11   22:aload_2         
	//   12   23:ldc1            #32  <String "Cannot advance the iterator beyond ">
	//   13   25:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			stringbuilder.append(i);
	//   15   29:aload_2         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #39  <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
			throw new NoSuchElementException(stringbuilder.toString());
	//   19   35:new             #41  <Class NoSuchElementException>
	//   20   38:dup             
	//   21   39:aload_2         
	//   22   40:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #48  <Method void NoSuchElementException(String)>
	//   24   46:athrow          
		}
		mPosition = mPosition + 1;
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #25  <Field int mPosition>
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:putfield        #25  <Field int mPosition>
		if(mPosition == 0)
	//*  31   57:aload_0         
	//*  32   58:getfield        #25  <Field int mPosition>
	//*  33   61:ifne            149
		{
			zzoj = mDataBuffer.get(0);
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #52  <Field DataBuffer mDataBuffer>
	//   37   69:iconst_0        
	//   38   70:invokeinterface #58  <Method Object DataBuffer.get(int)>
	//   39   75:putfield        #60  <Field Object zzoj>
			if(!(zzoj instanceof DataBufferRef))
	//*  40   78:aload_0         
	//*  41   79:getfield        #60  <Field Object zzoj>
	//*  42   82:instanceof      #62  <Class DataBufferRef>
	//*  43   85:ifne            163
			{
				String s = String.valueOf(((Object) (zzoj.getClass())));
	//   44   88:aload_0         
	//   45   89:getfield        #60  <Field Object zzoj>
	//   46   92:invokevirtual   #68  <Method Class Object.getClass()>
	//   47   95:invokestatic    #74  <Method String String.valueOf(Object)>
	//   48   98:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder(44 + String.valueOf(((Object) (s))).length());
	//   49   99:new             #27  <Class StringBuilder>
	//   50  102:dup             
	//   51  103:bipush          44
	//   52  105:aload_2         
	//   53  106:invokestatic    #74  <Method String String.valueOf(Object)>
	//   54  109:invokevirtual   #78  <Method int String.length()>
	//   55  112:iadd            
	//   56  113:invokespecial   #30  <Method void StringBuilder(int)>
	//   57  116:astore_3        
				stringbuilder1.append("DataBuffer reference of type ");
	//   58  117:aload_3         
	//   59  118:ldc1            #80  <String "DataBuffer reference of type ">
	//   60  120:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   61  123:pop             
				stringbuilder1.append(s);
	//   62  124:aload_3         
	//   63  125:aload_2         
	//   64  126:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   65  129:pop             
				stringbuilder1.append(" is not movable");
	//   66  130:aload_3         
	//   67  131:ldc1            #82  <String " is not movable">
	//   68  133:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   69  136:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//   70  137:new             #84  <Class IllegalStateException>
	//   71  140:dup             
	//   72  141:aload_3         
	//   73  142:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   74  145:invokespecial   #85  <Method void IllegalStateException(String)>
	//   75  148:athrow          
			}
		} else
		{
			((DataBufferRef)zzoj).setDataRow(mPosition);
	//   76  149:aload_0         
	//   77  150:getfield        #60  <Field Object zzoj>
	//   78  153:checkcast       #62  <Class DataBufferRef>
	//   79  156:aload_0         
	//   80  157:getfield        #25  <Field int mPosition>
	//   81  160:invokevirtual   #88  <Method void DataBufferRef.setDataRow(int)>
		}
		return zzoj;
	//   82  163:aload_0         
	//   83  164:getfield        #60  <Field Object zzoj>
	//   84  167:areturn         
	}

	private Object zzoj;
}
