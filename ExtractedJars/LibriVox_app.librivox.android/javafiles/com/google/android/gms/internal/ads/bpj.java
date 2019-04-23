// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.gmsg.f;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bpt, bpo, bpp, bpq, 
//			bps, hw, bpk, bpl, 
//			abu, box, bov, wx, 
//			iv, vt, bpm, abs, 
//			bpn, im

public final class bpj
	implements bpt
{

	public bpj(box box1, hw hw1, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class bpo>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #32  <Method void bpo(bpj)>
	//    7   13:putfield        #34  <Field ag f>
	//    8   16:aload_0         
	//    9   17:new             #36  <Class bpp>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #37  <Method void bpp(bpj)>
	//   13   25:putfield        #39  <Field ag g>
	//   14   28:aload_0         
	//   15   29:new             #41  <Class bpq>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #42  <Method void bpq(bpj)>
	//   19   37:putfield        #44  <Field ag h>
	//   20   40:aload_0         
	//   21   41:new             #46  <Class bps>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokespecial   #47  <Method void bps(bpj)>
	//   25   49:putfield        #49  <Field ag i>
		a = box1;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #51  <Field box a>
		b = context;
	//   29   57:aload_0         
	//   30   58:aload_3         
	//   31   59:putfield        #53  <Field Context b>
		c = new f(b);
	//   32   62:aload_0         
	//   33   63:new             #55  <Class f>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:getfield        #53  <Field Context b>
	//   37   71:invokespecial   #58  <Method void f(Context)>
	//   38   74:putfield        #60  <Field f c>
		d = hw1.b(((bad) (null)));
	//   39   77:aload_0         
	//   40   78:aload_2         
	//   41   79:aconst_null     
	//   42   80:invokevirtual   #65  <Method im hw.b(bad)>
	//   43   83:putfield        #67  <Field im d>
		((abu) (d)).a(((abt) (new bpk(this))), ((abr) (new bpl(this))));
	//   44   86:aload_0         
	//   45   87:getfield        #67  <Field im d>
	//   46   90:new             #69  <Class bpk>
	//   47   93:dup             
	//   48   94:aload_0         
	//   49   95:invokespecial   #70  <Method void bpk(bpj)>
	//   50   98:new             #72  <Class bpl>
	//   51  101:dup             
	//   52  102:aload_0         
	//   53  103:invokespecial   #73  <Method void bpl(bpj)>
	//   54  106:invokevirtual   #78  <Method void abu.a(abt, abr)>
		box1 = ((box) (String.valueOf(((Object) (a.a.d())))));
	//   55  109:aload_0         
	//   56  110:getfield        #51  <Field box a>
	//   57  113:getfield        #83  <Field bov box.a>
	//   58  116:invokevirtual   #88  <Method String bov.d()>
	//   59  119:invokestatic    #94  <Method String String.valueOf(Object)>
	//   60  122:astore_1        
		if(((String) (box1)).length() != 0)
	//*  61  123:aload_1         
	//*  62  124:invokevirtual   #98  <Method int String.length()>
	//*  63  127:ifeq            140
			box1 = ((box) ("Core JS tracking ad unit: ".concat(((String) (box1)))));
	//   64  130:ldc1            #100 <String "Core JS tracking ad unit: ">
	//   65  132:aload_1         
	//   66  133:invokevirtual   #104 <Method String String.concat(String)>
	//   67  136:astore_1        
		else
	//*  68  137:goto            150
			box1 = ((box) (new String("Core JS tracking ad unit: ")));
	//   69  140:new             #90  <Class String>
	//   70  143:dup             
	//   71  144:ldc1            #100 <String "Core JS tracking ad unit: ">
	//   72  146:invokespecial   #107 <Method void String(String)>
	//   73  149:astore_1        
		wx.b(((String) (box1)));
	//   74  150:aload_1         
	//   75  151:invokestatic    #111 <Method void wx.b(String)>
	//   76  154:return          
	}

	static box a(bpj bpj1)
	{
		return bpj1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field box a>
	//    2    4:areturn         
	}

	static boolean a(bpj bpj1, boolean flag)
	{
		bpj1.e = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #116 <Field boolean e>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	static f b(bpj bpj1)
	{
		return bpj1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field f c>
	//    2    4:areturn         
	}

	final void a(iv iv1)
	{
		iv1.a("/updateActiveView", f);
	//    0    0:aload_1         
	//    1    1:ldc1            #120 <String "/updateActiveView">
	//    2    3:aload_0         
	//    3    4:getfield        #34  <Field ag f>
	//    4    7:invokeinterface #125 <Method void iv.a(String, ag)>
		iv1.a("/untrackActiveViewUnit", g);
	//    5   12:aload_1         
	//    6   13:ldc1            #127 <String "/untrackActiveViewUnit">
	//    7   15:aload_0         
	//    8   16:getfield        #39  <Field ag g>
	//    9   19:invokeinterface #125 <Method void iv.a(String, ag)>
		iv1.a("/visibilityChanged", h);
	//   10   24:aload_1         
	//   11   25:ldc1            #129 <String "/visibilityChanged">
	//   12   27:aload_0         
	//   13   28:getfield        #44  <Field ag h>
	//   14   31:invokeinterface #125 <Method void iv.a(String, ag)>
		if(aw.E().a(b))
	//*  15   36:invokestatic    #135 <Method vt aw.E()>
	//*  16   39:aload_0         
	//*  17   40:getfield        #53  <Field Context b>
	//*  18   43:invokevirtual   #140 <Method boolean vt.a(Context)>
	//*  19   46:ifeq            61
			iv1.a("/logScionEvent", i);
	//   20   49:aload_1         
	//   21   50:ldc1            #142 <String "/logScionEvent">
	//   22   52:aload_0         
	//   23   53:getfield        #49  <Field ag i>
	//   24   56:invokeinterface #125 <Method void iv.a(String, ag)>
	//   25   61:return          
	}

	public final void a(JSONObject jsonobject, boolean flag)
	{
		((abu) (d)).a(((abt) (new bpm(this, jsonobject))), ((abr) (new abs())));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field im d>
	//    2    4:new             #145 <Class bpm>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #148 <Method void bpm(bpj, JSONObject)>
	//    7   13:new             #150 <Class abs>
	//    8   16:dup             
	//    9   17:invokespecial   #151 <Method void abs()>
	//   10   20:invokevirtual   #78  <Method void abu.a(abt, abr)>
	//   11   23:return          
	}

	public final boolean a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field boolean e>
	//    2    4:ireturn         
	}

	public final void b()
	{
		((abu) (d)).a(((abt) (new bpn(this))), ((abr) (new abs())));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field im d>
	//    2    4:new             #154 <Class bpn>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #155 <Method void bpn(bpj)>
	//    6   12:new             #150 <Class abs>
	//    7   15:dup             
	//    8   16:invokespecial   #151 <Method void abs()>
	//    9   19:invokevirtual   #78  <Method void abu.a(abt, abr)>
		d.a();
	//   10   22:aload_0         
	//   11   23:getfield        #67  <Field im d>
	//   12   26:invokevirtual   #159 <Method void im.a()>
	//   13   29:return          
	}

	final void b(iv iv1)
	{
		iv1.b("/visibilityChanged", h);
	//    0    0:aload_1         
	//    1    1:ldc1            #129 <String "/visibilityChanged">
	//    2    3:aload_0         
	//    3    4:getfield        #44  <Field ag h>
	//    4    7:invokeinterface #161 <Method void iv.b(String, ag)>
		iv1.b("/untrackActiveViewUnit", g);
	//    5   12:aload_1         
	//    6   13:ldc1            #127 <String "/untrackActiveViewUnit">
	//    7   15:aload_0         
	//    8   16:getfield        #39  <Field ag g>
	//    9   19:invokeinterface #161 <Method void iv.b(String, ag)>
		iv1.b("/updateActiveView", f);
	//   10   24:aload_1         
	//   11   25:ldc1            #120 <String "/updateActiveView">
	//   12   27:aload_0         
	//   13   28:getfield        #34  <Field ag f>
	//   14   31:invokeinterface #161 <Method void iv.b(String, ag)>
		if(aw.E().a(b))
	//*  15   36:invokestatic    #135 <Method vt aw.E()>
	//*  16   39:aload_0         
	//*  17   40:getfield        #53  <Field Context b>
	//*  18   43:invokevirtual   #140 <Method boolean vt.a(Context)>
	//*  19   46:ifeq            61
			iv1.b("/logScionEvent", i);
	//   20   49:aload_1         
	//   21   50:ldc1            #142 <String "/logScionEvent">
	//   22   52:aload_0         
	//   23   53:getfield        #49  <Field ag i>
	//   24   56:invokeinterface #161 <Method void iv.b(String, ag)>
	//   25   61:return          
	}

	private final box a;
	private final Context b;
	private final f c;
	private im d;
	private boolean e;
	private final ag f = new bpo(this);
	private final ag g = new bpp(this);
	private final ag h = new bpq(this);
	private final ag i = new bps(this);
}
