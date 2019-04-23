// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, awg, awp

public final class agh extends awj
{

	public agh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field String a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field Long b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field String c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #28  <Field String d>
		e = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #30  <Field String e>
		f = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #32  <Field Long f>
		g = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #34  <Field Long g>
		h = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #36  <Field String h>
		i = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #38  <Field Long i>
		j = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #40  <Field String j>
		aa = -1;
	//   32   54:aload_0         
	//   33   55:iconst_m1       
	//   34   56:putfield        #44  <Field int aa>
	//   35   59:return          
	}

	protected final int a()
	{
		int l = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field String a>
	//    5    9:astore_3        
		int k = l;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			k = l + awh.b(1, ((String) (obj)));
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #53  <Method int awh.b(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (b));
	//   16   24:aload_0         
	//   17   25:getfield        #24  <Field Long b>
	//   18   28:astore_3        
		l = k;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          46
			l = k + awh.d(2, ((Long) (obj)).longValue());
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokevirtual   #59  <Method long Long.longValue()>
	//   27   41:invokestatic    #62  <Method int awh.d(int, long)>
	//   28   44:iadd            
	//   29   45:istore_2        
		obj = ((Object) (c));
	//   30   46:aload_0         
	//   31   47:getfield        #26  <Field String c>
	//   32   50:astore_3        
		k = l;
	//   33   51:iload_2         
	//   34   52:istore_1        
		if(obj != null)
	//*  35   53:aload_3         
	//*  36   54:ifnull          65
			k = l + awh.b(3, ((String) (obj)));
	//   37   57:iload_2         
	//   38   58:iconst_3        
	//   39   59:aload_3         
	//   40   60:invokestatic    #53  <Method int awh.b(int, String)>
	//   41   63:iadd            
	//   42   64:istore_1        
		obj = ((Object) (d));
	//   43   65:aload_0         
	//   44   66:getfield        #28  <Field String d>
	//   45   69:astore_3        
		l = k;
	//   46   70:iload_1         
	//   47   71:istore_2        
		if(obj != null)
	//*  48   72:aload_3         
	//*  49   73:ifnull          84
			l = k + awh.b(4, ((String) (obj)));
	//   50   76:iload_1         
	//   51   77:iconst_4        
	//   52   78:aload_3         
	//   53   79:invokestatic    #53  <Method int awh.b(int, String)>
	//   54   82:iadd            
	//   55   83:istore_2        
		obj = ((Object) (e));
	//   56   84:aload_0         
	//   57   85:getfield        #30  <Field String e>
	//   58   88:astore_3        
		k = l;
	//   59   89:iload_2         
	//   60   90:istore_1        
		if(obj != null)
	//*  61   91:aload_3         
	//*  62   92:ifnull          103
			k = l + awh.b(5, ((String) (obj)));
	//   63   95:iload_2         
	//   64   96:iconst_5        
	//   65   97:aload_3         
	//   66   98:invokestatic    #53  <Method int awh.b(int, String)>
	//   67  101:iadd            
	//   68  102:istore_1        
		obj = ((Object) (f));
	//   69  103:aload_0         
	//   70  104:getfield        #32  <Field Long f>
	//   71  107:astore_3        
		l = k;
	//   72  108:iload_1         
	//   73  109:istore_2        
		if(obj != null)
	//*  74  110:aload_3         
	//*  75  111:ifnull          126
			l = k + awh.d(6, ((Long) (obj)).longValue());
	//   76  114:iload_1         
	//   77  115:bipush          6
	//   78  117:aload_3         
	//   79  118:invokevirtual   #59  <Method long Long.longValue()>
	//   80  121:invokestatic    #62  <Method int awh.d(int, long)>
	//   81  124:iadd            
	//   82  125:istore_2        
		obj = ((Object) (g));
	//   83  126:aload_0         
	//   84  127:getfield        #34  <Field Long g>
	//   85  130:astore_3        
		k = l;
	//   86  131:iload_2         
	//   87  132:istore_1        
		if(obj != null)
	//*  88  133:aload_3         
	//*  89  134:ifnull          149
			k = l + awh.d(7, ((Long) (obj)).longValue());
	//   90  137:iload_2         
	//   91  138:bipush          7
	//   92  140:aload_3         
	//   93  141:invokevirtual   #59  <Method long Long.longValue()>
	//   94  144:invokestatic    #62  <Method int awh.d(int, long)>
	//   95  147:iadd            
	//   96  148:istore_1        
		obj = ((Object) (h));
	//   97  149:aload_0         
	//   98  150:getfield        #36  <Field String h>
	//   99  153:astore_3        
		l = k;
	//  100  154:iload_1         
	//  101  155:istore_2        
		if(obj != null)
	//* 102  156:aload_3         
	//* 103  157:ifnull          169
			l = k + awh.b(8, ((String) (obj)));
	//  104  160:iload_1         
	//  105  161:bipush          8
	//  106  163:aload_3         
	//  107  164:invokestatic    #53  <Method int awh.b(int, String)>
	//  108  167:iadd            
	//  109  168:istore_2        
		obj = ((Object) (i));
	//  110  169:aload_0         
	//  111  170:getfield        #38  <Field Long i>
	//  112  173:astore_3        
		k = l;
	//  113  174:iload_2         
	//  114  175:istore_1        
		if(obj != null)
	//* 115  176:aload_3         
	//* 116  177:ifnull          192
			k = l + awh.d(9, ((Long) (obj)).longValue());
	//  117  180:iload_2         
	//  118  181:bipush          9
	//  119  183:aload_3         
	//  120  184:invokevirtual   #59  <Method long Long.longValue()>
	//  121  187:invokestatic    #62  <Method int awh.d(int, long)>
	//  122  190:iadd            
	//  123  191:istore_1        
		obj = ((Object) (j));
	//  124  192:aload_0         
	//  125  193:getfield        #40  <Field String j>
	//  126  196:astore_3        
		l = k;
	//  127  197:iload_1         
	//  128  198:istore_2        
		if(obj != null)
	//* 129  199:aload_3         
	//* 130  200:ifnull          212
			l = k + awh.b(10, ((String) (obj)));
	//  131  203:iload_1         
	//  132  204:bipush          10
	//  133  206:aload_3         
	//  134  207:invokestatic    #53  <Method int awh.b(int, String)>
	//  135  210:iadd            
	//  136  211:istore_2        
		return l;
	//  137  212:iload_2         
	//  138  213:ireturn         
	}

	public final awp a(awg awg1)
	{
_L14:
		int k = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method int awg.a()>
	//    2    4:istore_2        
		k;
	//    3    5:iload_2         
		JVM INSTR lookupswitch 11: default 104
	//	               0: 237
	//	               10: 226
	//	               16: 212
	//	               26: 201
	//	               34: 190
	//	               42: 179
	//	               48: 165
	//	               56: 151
	//	               66: 140
	//	               72: 126
	//	               82: 115;
	//    4    6:lookupswitch    11: default 104
	//	               0: 237
	//	               10: 226
	//	               16: 212
	//	               26: 201
	//	               34: 190
	//	               42: 179
	//	               48: 165
	//	               56: 151
	//	               66: 140
	//	               72: 126
	//	               82: 115
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
		if(super.a(awg1, k)) goto _L14; else goto _L13
	//    5  104:aload_0         
	//    6  105:aload_1         
	//    7  106:iload_2         
	//    8  107:invokespecial   #69  <Method boolean awj.a(awg, int)>
	//    9  110:ifne            0
_L13:
		return ((awp) (this));
	//   10  113:aload_0         
	//   11  114:areturn         
_L12:
		j = awg1.e();
	//   12  115:aload_0         
	//   13  116:aload_1         
	//   14  117:invokevirtual   #72  <Method String awg.e()>
	//   15  120:putfield        #40  <Field String j>
		  goto _L14
	//*  16  123:goto            0
_L11:
		i = Long.valueOf(awg1.h());
	//   17  126:aload_0         
	//   18  127:aload_1         
	//   19  128:invokevirtual   #74  <Method long awg.h()>
	//   20  131:invokestatic    #78  <Method Long Long.valueOf(long)>
	//   21  134:putfield        #38  <Field Long i>
		  goto _L14
	//*  22  137:goto            0
_L10:
		h = awg1.e();
	//   23  140:aload_0         
	//   24  141:aload_1         
	//   25  142:invokevirtual   #72  <Method String awg.e()>
	//   26  145:putfield        #36  <Field String h>
		  goto _L14
	//*  27  148:goto            0
_L9:
		g = Long.valueOf(awg1.h());
	//   28  151:aload_0         
	//   29  152:aload_1         
	//   30  153:invokevirtual   #74  <Method long awg.h()>
	//   31  156:invokestatic    #78  <Method Long Long.valueOf(long)>
	//   32  159:putfield        #34  <Field Long g>
		  goto _L14
	//*  33  162:goto            0
_L8:
		f = Long.valueOf(awg1.h());
	//   34  165:aload_0         
	//   35  166:aload_1         
	//   36  167:invokevirtual   #74  <Method long awg.h()>
	//   37  170:invokestatic    #78  <Method Long Long.valueOf(long)>
	//   38  173:putfield        #32  <Field Long f>
		  goto _L14
	//*  39  176:goto            0
_L7:
		e = awg1.e();
	//   40  179:aload_0         
	//   41  180:aload_1         
	//   42  181:invokevirtual   #72  <Method String awg.e()>
	//   43  184:putfield        #30  <Field String e>
		  goto _L14
	//*  44  187:goto            0
_L6:
		d = awg1.e();
	//   45  190:aload_0         
	//   46  191:aload_1         
	//   47  192:invokevirtual   #72  <Method String awg.e()>
	//   48  195:putfield        #28  <Field String d>
		  goto _L14
	//*  49  198:goto            0
_L5:
		c = awg1.e();
	//   50  201:aload_0         
	//   51  202:aload_1         
	//   52  203:invokevirtual   #72  <Method String awg.e()>
	//   53  206:putfield        #26  <Field String c>
		  goto _L14
	//*  54  209:goto            0
_L4:
		b = Long.valueOf(awg1.h());
	//   55  212:aload_0         
	//   56  213:aload_1         
	//   57  214:invokevirtual   #74  <Method long awg.h()>
	//   58  217:invokestatic    #78  <Method Long Long.valueOf(long)>
	//   59  220:putfield        #24  <Field Long b>
		  goto _L14
	//*  60  223:goto            0
_L3:
		a = awg1.e();
	//   61  226:aload_0         
	//   62  227:aload_1         
	//   63  228:invokevirtual   #72  <Method String awg.e()>
	//   64  231:putfield        #22  <Field String a>
		  goto _L14
	//*  65  234:goto            0
_L2:
		return ((awp) (this));
	//   66  237:aload_0         
	//   67  238:areturn         
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String a>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			awh1.a(1, ((String) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #82  <Method void awh.a(int, String)>
		obj = ((Object) (b));
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field Long b>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          33
			awh1.b(2, ((Long) (obj)).longValue());
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #59  <Method long Long.longValue()>
	//   18   30:invokevirtual   #85  <Method void awh.b(int, long)>
		obj = ((Object) (c));
	//   19   33:aload_0         
	//   20   34:getfield        #26  <Field String c>
	//   21   37:astore_2        
		if(obj != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          48
			awh1.a(3, ((String) (obj)));
	//   24   42:aload_1         
	//   25   43:iconst_3        
	//   26   44:aload_2         
	//   27   45:invokevirtual   #82  <Method void awh.a(int, String)>
		obj = ((Object) (d));
	//   28   48:aload_0         
	//   29   49:getfield        #28  <Field String d>
	//   30   52:astore_2        
		if(obj != null)
	//*  31   53:aload_2         
	//*  32   54:ifnull          63
			awh1.a(4, ((String) (obj)));
	//   33   57:aload_1         
	//   34   58:iconst_4        
	//   35   59:aload_2         
	//   36   60:invokevirtual   #82  <Method void awh.a(int, String)>
		obj = ((Object) (e));
	//   37   63:aload_0         
	//   38   64:getfield        #30  <Field String e>
	//   39   67:astore_2        
		if(obj != null)
	//*  40   68:aload_2         
	//*  41   69:ifnull          78
			awh1.a(5, ((String) (obj)));
	//   42   72:aload_1         
	//   43   73:iconst_5        
	//   44   74:aload_2         
	//   45   75:invokevirtual   #82  <Method void awh.a(int, String)>
		obj = ((Object) (f));
	//   46   78:aload_0         
	//   47   79:getfield        #32  <Field Long f>
	//   48   82:astore_2        
		if(obj != null)
	//*  49   83:aload_2         
	//*  50   84:ifnull          97
			awh1.b(6, ((Long) (obj)).longValue());
	//   51   87:aload_1         
	//   52   88:bipush          6
	//   53   90:aload_2         
	//   54   91:invokevirtual   #59  <Method long Long.longValue()>
	//   55   94:invokevirtual   #85  <Method void awh.b(int, long)>
		obj = ((Object) (g));
	//   56   97:aload_0         
	//   57   98:getfield        #34  <Field Long g>
	//   58  101:astore_2        
		if(obj != null)
	//*  59  102:aload_2         
	//*  60  103:ifnull          116
			awh1.b(7, ((Long) (obj)).longValue());
	//   61  106:aload_1         
	//   62  107:bipush          7
	//   63  109:aload_2         
	//   64  110:invokevirtual   #59  <Method long Long.longValue()>
	//   65  113:invokevirtual   #85  <Method void awh.b(int, long)>
		obj = ((Object) (h));
	//   66  116:aload_0         
	//   67  117:getfield        #36  <Field String h>
	//   68  120:astore_2        
		if(obj != null)
	//*  69  121:aload_2         
	//*  70  122:ifnull          132
			awh1.a(8, ((String) (obj)));
	//   71  125:aload_1         
	//   72  126:bipush          8
	//   73  128:aload_2         
	//   74  129:invokevirtual   #82  <Method void awh.a(int, String)>
		obj = ((Object) (i));
	//   75  132:aload_0         
	//   76  133:getfield        #38  <Field Long i>
	//   77  136:astore_2        
		if(obj != null)
	//*  78  137:aload_2         
	//*  79  138:ifnull          151
			awh1.b(9, ((Long) (obj)).longValue());
	//   80  141:aload_1         
	//   81  142:bipush          9
	//   82  144:aload_2         
	//   83  145:invokevirtual   #59  <Method long Long.longValue()>
	//   84  148:invokevirtual   #85  <Method void awh.b(int, long)>
		obj = ((Object) (j));
	//   85  151:aload_0         
	//   86  152:getfield        #40  <Field String j>
	//   87  155:astore_2        
		if(obj != null)
	//*  88  156:aload_2         
	//*  89  157:ifnull          167
			awh1.a(10, ((String) (obj)));
	//   90  160:aload_1         
	//   91  161:bipush          10
	//   92  163:aload_2         
	//   93  164:invokevirtual   #82  <Method void awh.a(int, String)>
		super.a(awh1);
	//   94  167:aload_0         
	//   95  168:aload_1         
	//   96  169:invokespecial   #87  <Method void awj.a(awh)>
	//   97  172:return          
	}

	public String a;
	public Long b;
	private String c;
	private String d;
	private String e;
	private Long f;
	private Long g;
	private String h;
	private Long i;
	private String j;
}
