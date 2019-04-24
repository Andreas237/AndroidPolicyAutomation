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
	//    2    2:invokespecial   #13  <Method void DataBufferIterator(DataBuffer)>
	//    3    5:return          
	}

	public Object next()
	{
		if(!((DataBufferIterator)this).hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #22  <Method boolean DataBufferIterator.hasNext()>
	//*   2    4:ifne            47
		{
			int i = zalk;
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field int zalk>
	//    5   11:istore_1        
			StringBuilder stringbuilder = new StringBuilder(46);
	//    6   12:new             #28  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:bipush          46
	//    9   18:invokespecial   #31  <Method void StringBuilder(int)>
	//   10   21:astore_2        
			stringbuilder.append("Cannot advance the iterator beyond ");
	//   11   22:aload_2         
	//   12   23:ldc1            #33  <String "Cannot advance the iterator beyond ">
	//   13   25:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			stringbuilder.append(i);
	//   15   29:aload_2         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #40  <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
			throw new NoSuchElementException(stringbuilder.toString());
	//   19   35:new             #42  <Class NoSuchElementException>
	//   20   38:dup             
	//   21   39:aload_2         
	//   22   40:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #49  <Method void NoSuchElementException(String)>
	//   24   46:athrow          
		}
		zalk = zalk + 1;
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #26  <Field int zalk>
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:putfield        #26  <Field int zalk>
		if(zalk == 0)
	//*  31   57:aload_0         
	//*  32   58:getfield        #26  <Field int zalk>
	//*  33   61:ifne            149
		{
			zamf = zalj.get(0);
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #53  <Field DataBuffer zalj>
	//   37   69:iconst_0        
	//   38   70:invokeinterface #59  <Method Object DataBuffer.get(int)>
	//   39   75:putfield        #61  <Field Object zamf>
			if(!(zamf instanceof DataBufferRef))
	//*  40   78:aload_0         
	//*  41   79:getfield        #61  <Field Object zamf>
	//*  42   82:instanceof      #63  <Class DataBufferRef>
	//*  43   85:ifne            163
			{
				String s = String.valueOf(((Object) (zamf.getClass())));
	//   44   88:aload_0         
	//   45   89:getfield        #61  <Field Object zamf>
	//   46   92:invokevirtual   #69  <Method Class Object.getClass()>
	//   47   95:invokestatic    #75  <Method String String.valueOf(Object)>
	//   48   98:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s))).length() + 44);
	//   49   99:new             #28  <Class StringBuilder>
	//   50  102:dup             
	//   51  103:aload_2         
	//   52  104:invokestatic    #75  <Method String String.valueOf(Object)>
	//   53  107:invokevirtual   #79  <Method int String.length()>
	//   54  110:bipush          44
	//   55  112:iadd            
	//   56  113:invokespecial   #31  <Method void StringBuilder(int)>
	//   57  116:astore_3        
				stringbuilder1.append("DataBuffer reference of type ");
	//   58  117:aload_3         
	//   59  118:ldc1            #81  <String "DataBuffer reference of type ">
	//   60  120:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   61  123:pop             
				stringbuilder1.append(s);
	//   62  124:aload_3         
	//   63  125:aload_2         
	//   64  126:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   65  129:pop             
				stringbuilder1.append(" is not movable");
	//   66  130:aload_3         
	//   67  131:ldc1            #83  <String " is not movable">
	//   68  133:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   69  136:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//   70  137:new             #85  <Class IllegalStateException>
	//   71  140:dup             
	//   72  141:aload_3         
	//   73  142:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   74  145:invokespecial   #86  <Method void IllegalStateException(String)>
	//   75  148:athrow          
			}
		} else
		{
			((DataBufferRef)zamf).zag(zalk);
	//   76  149:aload_0         
	//   77  150:getfield        #61  <Field Object zamf>
	//   78  153:checkcast       #63  <Class DataBufferRef>
	//   79  156:aload_0         
	//   80  157:getfield        #26  <Field int zalk>
	//   81  160:invokevirtual   #89  <Method void DataBufferRef.zag(int)>
		}
		return zamf;
	//   82  163:aload_0         
	//   83  164:getfield        #61  <Field Object zamf>
	//   84  167:areturn         
	}

	private Object zamf;
}
