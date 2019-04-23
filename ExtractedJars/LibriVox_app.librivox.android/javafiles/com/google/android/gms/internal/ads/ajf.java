// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiw, ano, aoi, aiv, 
//			ajh

public final class ajf
{

	public ajf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		b = ((ConcurrentMap) (new ConcurrentHashMap()));
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #31  <Field ConcurrentMap b>
	//    7   15:return          
	}

	public final ajh a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ajh c>
	//    2    4:areturn         
	}

	protected final ajh a(Object obj, ano ano1)
	{
		byte abyte0[];
		switch(aiw.a[ano1.e().ordinal()])
	//*   0    0:getstatic       #40  <Field int[] aiw.a>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #46  <Method aoi ano.e()>
	//*   3    7:invokevirtual   #52  <Method int aoi.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 4: default 40
	//	               1 79
	//	               2 79
	//	               3 57
	//	               4 50
		default:
			throw new GeneralSecurityException("unknown output prefix type");
	//    6   40:new             #54  <Class GeneralSecurityException>
	//    7   43:dup             
	//    8   44:ldc1            #56  <String "unknown output prefix type">
	//    9   46:invokespecial   #59  <Method void GeneralSecurityException(String)>
	//   10   49:athrow          

		case 4: // '\004'
			abyte0 = aiv.a;
	//   11   50:getstatic       #64  <Field byte[] aiv.a>
	//   12   53:astore_3        
			break;

	//*  13   54:goto            98
		case 3: // '\003'
			abyte0 = ByteBuffer.allocate(5).put((byte)1).putInt(ano1.d()).array();
	//   14   57:iconst_5        
	//   15   58:invokestatic    #70  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   16   61:iconst_1        
	//   17   62:invokevirtual   #74  <Method ByteBuffer ByteBuffer.put(byte)>
	//   18   65:aload_2         
	//   19   66:invokevirtual   #77  <Method int ano.d()>
	//   20   69:invokevirtual   #80  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   21   72:invokevirtual   #84  <Method byte[] ByteBuffer.array()>
	//   22   75:astore_3        
			break;

	//*  23   76:goto            98
		case 1: // '\001'
		case 2: // '\002'
			abyte0 = ByteBuffer.allocate(5).put((byte)0).putInt(ano1.d()).array();
	//   24   79:iconst_5        
	//   25   80:invokestatic    #70  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   26   83:iconst_0        
	//   27   84:invokevirtual   #74  <Method ByteBuffer ByteBuffer.put(byte)>
	//   28   87:aload_2         
	//   29   88:invokevirtual   #77  <Method int ano.d()>
	//   30   91:invokevirtual   #80  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   31   94:invokevirtual   #84  <Method byte[] ByteBuffer.array()>
	//   32   97:astore_3        
			break;
		}
		obj = ((Object) (new ajh(obj, abyte0, ano1.c(), ano1.e())));
	//   33   98:new             #86  <Class ajh>
	//   34  101:dup             
	//   35  102:aload_1         
	//   36  103:aload_3         
	//   37  104:aload_2         
	//   38  105:invokevirtual   #89  <Method and ano.c()>
	//   39  108:aload_2         
	//   40  109:invokevirtual   #46  <Method aoi ano.e()>
	//   41  112:invokespecial   #92  <Method void ajh(Object, byte[], and, aoi)>
	//   42  115:astore_1        
		Object obj1 = ((Object) (new ArrayList()));
	//   43  116:new             #94  <Class ArrayList>
	//   44  119:dup             
	//   45  120:invokespecial   #95  <Method void ArrayList()>
	//   46  123:astore_3        
		((List) (obj1)).add(obj);
	//   47  124:aload_3         
	//   48  125:aload_1         
	//   49  126:invokeinterface #101 <Method boolean List.add(Object)>
	//   50  131:pop             
		ano1 = ((ano) (new String(((ajh) (obj)).b(), a)));
	//   51  132:new             #103 <Class String>
	//   52  135:dup             
	//   53  136:aload_1         
	//   54  137:invokevirtual   #105 <Method byte[] ajh.b()>
	//   55  140:getstatic       #22  <Field Charset a>
	//   56  143:invokespecial   #108 <Method void String(byte[], Charset)>
	//   57  146:astore_2        
		obj1 = ((Object) ((List)b.put(((Object) (ano1)), ((Object) (Collections.unmodifiableList(((List) (obj1))))))));
	//   58  147:aload_0         
	//   59  148:getfield        #31  <Field ConcurrentMap b>
	//   60  151:aload_2         
	//   61  152:aload_3         
	//   62  153:invokestatic    #114 <Method List Collections.unmodifiableList(List)>
	//   63  156:invokeinterface #119 <Method Object ConcurrentMap.put(Object, Object)>
	//   64  161:checkcast       #97  <Class List>
	//   65  164:astore_3        
		if(obj1 != null)
	//*  66  165:aload_3         
	//*  67  166:ifnull          212
		{
			ArrayList arraylist = new ArrayList();
	//   68  169:new             #94  <Class ArrayList>
	//   69  172:dup             
	//   70  173:invokespecial   #95  <Method void ArrayList()>
	//   71  176:astore          4
			((List) (arraylist)).addAll(((Collection) (obj1)));
	//   72  178:aload           4
	//   73  180:aload_3         
	//   74  181:invokeinterface #123 <Method boolean List.addAll(Collection)>
	//   75  186:pop             
			((List) (arraylist)).add(obj);
	//   76  187:aload           4
	//   77  189:aload_1         
	//   78  190:invokeinterface #101 <Method boolean List.add(Object)>
	//   79  195:pop             
			b.put(((Object) (ano1)), ((Object) (Collections.unmodifiableList(((List) (arraylist))))));
	//   80  196:aload_0         
	//   81  197:getfield        #31  <Field ConcurrentMap b>
	//   82  200:aload_2         
	//   83  201:aload           4
	//   84  203:invokestatic    #114 <Method List Collections.unmodifiableList(List)>
	//   85  206:invokeinterface #119 <Method Object ConcurrentMap.put(Object, Object)>
	//   86  211:pop             
		}
		return ((ajh) (obj));
	//   87  212:aload_1         
	//   88  213:areturn         
	}

	protected final void a(ajh ajh1)
	{
		c = ajh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field ajh c>
	//    3    5:return          
	}

	public final Collection b()
	{
		return b.values();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ConcurrentMap b>
	//    2    4:invokeinterface #128 <Method Collection ConcurrentMap.values()>
	//    3    9:areturn         
	}

	private static final Charset a = Charset.forName("UTF-8");
	private ConcurrentMap b;
	private ajh c;

	static 
	{
	//    0    0:ldc1            #14  <String "UTF-8">
	//    1    2:invokestatic    #20  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #22  <Field Charset a>
	//*   3    8:return          
	}
}
