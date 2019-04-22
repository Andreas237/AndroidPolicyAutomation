// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.*;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			NodeDescriptor

public abstract class Descriptor
	implements NodeDescriptor
{
	public static interface Host
		extends ThreadBound
	{

		public abstract Descriptor getDescriptor(Object obj);

		public abstract void onAttributeModified(Object obj, String s, String s1);

		public abstract void onAttributeRemoved(Object obj, String s);
	}


	protected Descriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	protected static Map parseSetAttributesAsTextArg(String s)
	{
		String s2 = "";
	//    0    0:ldc1            #20  <String "">
	//    1    2:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #22  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #23  <Method void StringBuilder()>
	//    5   11:astore          7
		HashMap hashmap = new HashMap();
	//    6   13:new             #25  <Class HashMap>
	//    7   16:dup             
	//    8   17:invokespecial   #26  <Method void HashMap()>
	//    9   20:astore          8
		int j = s.length();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #32  <Method int String.length()>
	//   12   26:istore          4
		String s1 = "";
	//   13   28:ldc1            #20  <String "">
	//   14   30:astore          5
		int i = 0;
	//   15   32:iconst_0        
	//   16   33:istore_2        
		boolean flag = false;
	//   17   34:iconst_0        
	//   18   35:istore_3        
		for(; i < j; i++)
	//*  19   36:iload_2         
	//*  20   37:iload           4
	//*  21   39:icmpge          139
		{
			char c = s.charAt(i);
	//   22   42:aload_0         
	//   23   43:iload_2         
	//   24   44:invokevirtual   #36  <Method char String.charAt(int)>
	//   25   47:istore_1        
			if(c == '=')
	//*  26   48:iload_1         
	//*  27   49:bipush          61
	//*  28   51:icmpne          70
			{
				s2 = stringbuilder.toString();
	//   29   54:aload           7
	//   30   56:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   31   59:astore          6
				stringbuilder.setLength(0);
	//   32   61:aload           7
	//   33   63:iconst_0        
	//   34   64:invokevirtual   #44  <Method void StringBuilder.setLength(int)>
				continue;
	//   35   67:goto            132
			}
			if(c == '"')
	//*  36   70:iload_1         
	//*  37   71:bipush          34
	//*  38   73:icmpne          100
			{
				if(flag)
	//*  39   76:iload_3         
	//*  40   77:ifeq            93
				{
					s1 = stringbuilder.toString();
	//   41   80:aload           7
	//   42   82:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   43   85:astore          5
					stringbuilder.setLength(0);
	//   44   87:aload           7
	//   45   89:iconst_0        
	//   46   90:invokevirtual   #44  <Method void StringBuilder.setLength(int)>
				}
				flag ^= true;
	//   47   93:iload_3         
	//   48   94:iconst_1        
	//   49   95:ixor            
	//   50   96:istore_3        
				continue;
	//   51   97:goto            132
			}
			if(c == ' ' && !flag)
	//*  52  100:iload_1         
	//*  53  101:bipush          32
	//*  54  103:icmpne          125
	//*  55  106:iload_3         
	//*  56  107:ifne            125
				((Map) (hashmap)).put(((Object) (s2)), ((Object) (s1)));
	//   57  110:aload           8
	//   58  112:aload           6
	//   59  114:aload           5
	//   60  116:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//   61  121:pop             
			else
	//*  62  122:goto            132
				stringbuilder.append(c);
	//   63  125:aload           7
	//   64  127:iload_1         
	//   65  128:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//   66  131:pop             
		}

	//   67  132:iload_2         
	//   68  133:iconst_1        
	//   69  134:iadd            
	//   70  135:istore_2        
	//*  71  136:goto            36
		if(!s2.isEmpty() && !s1.isEmpty())
	//*  72  139:aload           6
	//*  73  141:invokevirtual   #58  <Method boolean String.isEmpty()>
	//*  74  144:ifne            167
	//*  75  147:aload           5
	//*  76  149:invokevirtual   #58  <Method boolean String.isEmpty()>
	//*  77  152:ifne            167
			((Map) (hashmap)).put(((Object) (s2)), ((Object) (s1)));
	//   78  155:aload           8
	//   79  157:aload           6
	//   80  159:aload           5
	//   81  161:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//   82  166:pop             
		return ((Map) (hashmap));
	//   83  167:aload           8
	//   84  169:areturn         
	}

	public final boolean checkThreadAccess()
	{
		return getHost().checkThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Descriptor$Host getHost()>
	//    2    4:invokeinterface #67  <Method boolean Descriptor$Host.checkThreadAccess()>
	//    3    9:ireturn         
	}

	protected final Host getHost()
	{
		return mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Descriptor$Host mHost>
	//    2    4:areturn         
	}

	final void initialize(Host host)
	{
		Util.throwIfNull(((Object) (host)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #77  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Util.throwIfNotNull(((Object) (mHost)));
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field Descriptor$Host mHost>
	//    5    9:invokestatic    #81  <Method void Util.throwIfNotNull(Object)>
		mHost = host;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #69  <Field Descriptor$Host mHost>
	//    9   17:return          
	}

	final boolean isInitialized()
	{
		return mHost != null;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Descriptor$Host mHost>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final Object postAndWait(UncheckedCallable uncheckedcallable)
	{
		return getHost().postAndWait(uncheckedcallable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Descriptor$Host getHost()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #86  <Method Object Descriptor$Host.postAndWait(UncheckedCallable)>
	//    4   10:areturn         
	}

	public final void postAndWait(Runnable runnable)
	{
		getHost().postAndWait(runnable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Descriptor$Host getHost()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #90  <Method void Descriptor$Host.postAndWait(Runnable)>
	//    4   10:return          
	}

	public final void postDelayed(Runnable runnable, long l)
	{
		getHost().postDelayed(runnable, l);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Descriptor$Host getHost()>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokeinterface #94  <Method void Descriptor$Host.postDelayed(Runnable, long)>
	//    5   11:return          
	}

	public final void removeCallbacks(Runnable runnable)
	{
		getHost().removeCallbacks(runnable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Descriptor$Host getHost()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #97  <Method void Descriptor$Host.removeCallbacks(Runnable)>
	//    4   10:return          
	}

	public final void verifyThreadAccess()
	{
		getHost().verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Descriptor$Host getHost()>
	//    2    4:invokeinterface #100 <Method void Descriptor$Host.verifyThreadAccess()>
	//    3    9:return          
	}

	private Host mHost;
}
