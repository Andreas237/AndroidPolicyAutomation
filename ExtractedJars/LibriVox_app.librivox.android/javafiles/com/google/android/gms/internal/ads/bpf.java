// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.ag;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bpt, bpg, bph, bpi, 
//			afn, box, bov, wx

public final class bpf
	implements bpt
{

	public bpf(box box1, afn afn1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class bpg>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #25  <Method void bpg(bpf)>
	//    7   13:putfield        #27  <Field ag c>
	//    8   16:aload_0         
	//    9   17:new             #29  <Class bph>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #30  <Method void bph(bpf)>
	//   13   25:putfield        #32  <Field ag d>
	//   14   28:aload_0         
	//   15   29:new             #34  <Class bpi>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #35  <Method void bpi(bpf)>
	//   19   37:putfield        #37  <Field ag e>
		a = box1;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:putfield        #39  <Field box a>
		b = afn1;
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:putfield        #41  <Field afn b>
		box1 = ((box) (b));
	//   26   50:aload_0         
	//   27   51:getfield        #41  <Field afn b>
	//   28   54:astore_1        
		((afn) (box1)).a("/updateActiveView", c);
	//   29   55:aload_1         
	//   30   56:ldc1            #43  <String "/updateActiveView">
	//   31   58:aload_0         
	//   32   59:getfield        #27  <Field ag c>
	//   33   62:invokeinterface #48  <Method void afn.a(String, ag)>
		((afn) (box1)).a("/untrackActiveViewUnit", d);
	//   34   67:aload_1         
	//   35   68:ldc1            #50  <String "/untrackActiveViewUnit">
	//   36   70:aload_0         
	//   37   71:getfield        #32  <Field ag d>
	//   38   74:invokeinterface #48  <Method void afn.a(String, ag)>
		((afn) (box1)).a("/visibilityChanged", e);
	//   39   79:aload_1         
	//   40   80:ldc1            #52  <String "/visibilityChanged">
	//   41   82:aload_0         
	//   42   83:getfield        #37  <Field ag e>
	//   43   86:invokeinterface #48  <Method void afn.a(String, ag)>
		box1 = ((box) (String.valueOf(((Object) (a.a.d())))));
	//   44   91:aload_0         
	//   45   92:getfield        #39  <Field box a>
	//   46   95:getfield        #57  <Field bov box.a>
	//   47   98:invokevirtual   #62  <Method String bov.d()>
	//   48  101:invokestatic    #68  <Method String String.valueOf(Object)>
	//   49  104:astore_1        
		if(((String) (box1)).length() != 0)
	//*  50  105:aload_1         
	//*  51  106:invokevirtual   #72  <Method int String.length()>
	//*  52  109:ifeq            122
			box1 = ((box) ("Custom JS tracking ad unit: ".concat(((String) (box1)))));
	//   53  112:ldc1            #74  <String "Custom JS tracking ad unit: ">
	//   54  114:aload_1         
	//   55  115:invokevirtual   #78  <Method String String.concat(String)>
	//   56  118:astore_1        
		else
	//*  57  119:goto            132
			box1 = ((box) (new String("Custom JS tracking ad unit: ")));
	//   58  122:new             #64  <Class String>
	//   59  125:dup             
	//   60  126:ldc1            #74  <String "Custom JS tracking ad unit: ">
	//   61  128:invokespecial   #81  <Method void String(String)>
	//   62  131:astore_1        
		wx.b(((String) (box1)));
	//   63  132:aload_1         
	//   64  133:invokestatic    #85  <Method void wx.b(String)>
	//   65  136:return          
	}

	static box a(bpf bpf1)
	{
		return bpf1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field box a>
	//    2    4:areturn         
	}

	public final void a(JSONObject jsonobject, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            17
		{
			b.b("AFMA_updateActiveView", jsonobject);
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field afn b>
	//    4    8:ldc1            #90  <String "AFMA_updateActiveView">
	//    5   10:aload_1         
	//    6   11:invokeinterface #93  <Method void afn.b(String, JSONObject)>
			return;
	//    7   16:return          
		} else
		{
			a.b(((bpt) (this)));
	//    8   17:aload_0         
	//    9   18:getfield        #39  <Field box a>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #96  <Method void box.b(bpt)>
			return;
	//   12   25:return          
		}
	}

	public final boolean a()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final void b()
	{
		afn afn1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field afn b>
	//    2    4:astore_1        
		afn1.b("/visibilityChanged", e);
	//    3    5:aload_1         
	//    4    6:ldc1            #52  <String "/visibilityChanged">
	//    5    8:aload_0         
	//    6    9:getfield        #37  <Field ag e>
	//    7   12:invokeinterface #99  <Method void afn.b(String, ag)>
		afn1.b("/untrackActiveViewUnit", d);
	//    8   17:aload_1         
	//    9   18:ldc1            #50  <String "/untrackActiveViewUnit">
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field ag d>
	//   12   24:invokeinterface #99  <Method void afn.b(String, ag)>
		afn1.b("/updateActiveView", c);
	//   13   29:aload_1         
	//   14   30:ldc1            #43  <String "/updateActiveView">
	//   15   32:aload_0         
	//   16   33:getfield        #27  <Field ag c>
	//   17   36:invokeinterface #99  <Method void afn.b(String, ag)>
	//   18   41:return          
	}

	private final box a;
	private final afn b;
	private final ag c = new bpg(this);
	private final ag d = new bph(this);
	private final ag e = new bpi(this);
}
