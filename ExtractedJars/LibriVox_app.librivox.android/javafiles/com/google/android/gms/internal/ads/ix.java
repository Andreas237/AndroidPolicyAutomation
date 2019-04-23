// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.ag;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			hf, iw, wx, iv, 
//			hg

public final class ix
	implements hf, iw
{

	public ix(iv iv1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = iv1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field iv a>
	//    5    9:aload_0         
	//    6   10:new             #22  <Class HashSet>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void HashSet()>
	//    9   17:putfield        #25  <Field HashSet b>
	//   10   20:return          
	}

	public final void a()
	{
		java.util.AbstractMap.SimpleEntry simpleentry;
		for(Iterator iterator = b.iterator(); iterator.hasNext(); a.b((String)simpleentry.getKey(), (ag)simpleentry.getValue()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field HashSet b>
	//*   2    4:invokevirtual   #30  <Method Iterator HashSet.iterator()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            98
		{
			simpleentry = (java.util.AbstractMap.SimpleEntry)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class java.util.AbstractMap$SimpleEntry>
	//   10   26:astore_3        
			String s = String.valueOf(((Object) (((Object) ((ag)simpleentry.getValue())).toString())));
	//   11   27:aload_3         
	//   12   28:invokevirtual   #45  <Method Object java.util.AbstractMap$SimpleEntry.getValue()>
	//   13   31:checkcast       #47  <Class ag>
	//   14   34:invokevirtual   #51  <Method String Object.toString()>
	//   15   37:invokestatic    #57  <Method String String.valueOf(Object)>
	//   16   40:astore_1        
			if(s.length() != 0)
	//*  17   41:aload_1         
	//*  18   42:invokevirtual   #61  <Method int String.length()>
	//*  19   45:ifeq            58
				s = "Unregistering eventhandler: ".concat(s);
	//   20   48:ldc1            #63  <String "Unregistering eventhandler: ">
	//   21   50:aload_1         
	//   22   51:invokevirtual   #67  <Method String String.concat(String)>
	//   23   54:astore_1        
			else
	//*  24   55:goto            68
				s = new String("Unregistering eventhandler: ");
	//   25   58:new             #53  <Class String>
	//   26   61:dup             
	//   27   62:ldc1            #63  <String "Unregistering eventhandler: ">
	//   28   64:invokespecial   #70  <Method void String(String)>
	//   29   67:astore_1        
			wx.a(s);
	//   30   68:aload_1         
	//   31   69:invokestatic    #74  <Method void wx.a(String)>
		}

	//   32   72:aload_0         
	//   33   73:getfield        #20  <Field iv a>
	//   34   76:aload_3         
	//   35   77:invokevirtual   #77  <Method Object java.util.AbstractMap$SimpleEntry.getKey()>
	//   36   80:checkcast       #53  <Class String>
	//   37   83:aload_3         
	//   38   84:invokevirtual   #45  <Method Object java.util.AbstractMap$SimpleEntry.getValue()>
	//   39   87:checkcast       #47  <Class ag>
	//   40   90:invokeinterface #82  <Method void iv.b(String, ag)>
	//*  41   95:goto            8
		b.clear();
	//   42   98:aload_0         
	//   43   99:getfield        #25  <Field HashSet b>
	//   44  102:invokevirtual   #85  <Method void HashSet.clear()>
	//   45  105:return          
	}

	public final void a(String s, ag ag1)
	{
		a.a(s, ag1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field iv a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #87  <Method void iv.a(String, ag)>
		b.add(((Object) (new java.util.AbstractMap.SimpleEntry(((Object) (s)), ((Object) (ag1))))));
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field HashSet b>
	//    7   15:new             #42  <Class java.util.AbstractMap$SimpleEntry>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #90  <Method void java.util.AbstractMap$SimpleEntry(Object, Object)>
	//   12   24:invokevirtual   #94  <Method boolean HashSet.add(Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public final void a(String s, String s1)
	{
		hg.a(((hf) (this)), s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #100 <Method void hg.a(hf, String, String)>
	//    4    6:return          
	}

	public final void a(String s, Map map)
	{
		hg.a(((hf) (this)), s, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #104 <Method void hg.a(hf, String, Map)>
	//    4    6:return          
	}

	public final void a(String s, JSONObject jsonobject)
	{
		hg.b(((hf) (this)), s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #108 <Method void hg.b(hf, String, JSONObject)>
	//    4    6:return          
	}

	public final void b(String s, ag ag1)
	{
		a.b(s, ag1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field iv a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #82  <Method void iv.b(String, ag)>
		b.remove(((Object) (new java.util.AbstractMap.SimpleEntry(((Object) (s)), ((Object) (ag1))))));
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field HashSet b>
	//    7   15:new             #42  <Class java.util.AbstractMap$SimpleEntry>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #90  <Method void java.util.AbstractMap$SimpleEntry(Object, Object)>
	//   12   24:invokevirtual   #111 <Method boolean HashSet.remove(Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public final void b(String s, JSONObject jsonobject)
	{
		hg.a(((hf) (this)), s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #113 <Method void hg.a(hf, String, JSONObject)>
	//    4    6:return          
	}

	public final void d(String s)
	{
		a.d(s);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field iv a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #116 <Method void iv.d(String)>
	//    4   10:return          
	}

	private final iv a;
	private final HashSet b = new HashSet();
}
