// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ble, zzfs, bnk, bhl, 
//			bgd, bgx, bjt, bks, 
//			bil, bld

public final class bkw
{

	public bkw(long l, ble ble1, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		d = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #21  <Field long d>
		b = ble1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #23  <Field ble b>
		Object obj = ((Object) (ble1.a.d));
	//    8   14:aload_3         
	//    9   15:getfield        #28  <Field zzfs ble.a>
	//   10   18:getfield        #33  <Field String zzfs.d>
	//   11   21:astore          9
		boolean flag4 = bnk.c(((String) (obj)));
	//   12   23:aload           9
	//   13   25:invokestatic    #38  <Method boolean bnk.c(String)>
	//   14   28:istore          8
		int i = 0;
	//   15   30:iconst_0        
	//   16   31:istore          7
		boolean flag2;
		if(!flag4 && !"application/ttml+xml".equals(obj))
	//*  17   33:iload           8
	//*  18   35:ifne            57
	//*  19   38:ldc1            #40  <String "application/ttml+xml">
	//*  20   40:aload           9
	//*  21   42:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  22   45:ifeq            51
	//*  23   48:goto            57
			flag2 = false;
	//   24   51:iconst_0        
	//   25   52:istore          6
		else
	//*  26   54:goto            60
			flag2 = true;
	//   27   57:iconst_1        
	//   28   58:istore          6
		if(flag2)
	//*  29   60:iload           6
	//*  30   62:ifeq            73
		{
			a = null;
	//   31   65:aload_0         
	//   32   66:aconst_null     
	//   33   67:putfield        #48  <Field bjt a>
		} else
	//*  34   70:goto            215
		{
			if("application/x-rawcc".equals(obj))
	//*  35   73:ldc1            #50  <String "application/x-rawcc">
	//*  36   75:aload           9
	//*  37   77:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  38   80:ifeq            99
			{
				obj = ((Object) (new bhl(ble1.a)));
	//   39   83:new             #52  <Class bhl>
	//   40   86:dup             
	//   41   87:aload_3         
	//   42   88:getfield        #28  <Field zzfs ble.a>
	//   43   91:invokespecial   #55  <Method void bhl(zzfs)>
	//   44   94:astore          9
			} else
	//*  45   96:goto            198
			{
				boolean flag3;
				if(!((String) (obj)).startsWith("video/webm") && !((String) (obj)).startsWith("audio/webm") && !((String) (obj)).startsWith("application/webm"))
	//*  46   99:aload           9
	//*  47  101:ldc1            #57  <String "video/webm">
	//*  48  103:invokevirtual   #60  <Method boolean String.startsWith(String)>
	//*  49  106:ifne            138
	//*  50  109:aload           9
	//*  51  111:ldc1            #62  <String "audio/webm">
	//*  52  113:invokevirtual   #60  <Method boolean String.startsWith(String)>
	//*  53  116:ifne            138
	//*  54  119:aload           9
	//*  55  121:ldc1            #64  <String "application/webm">
	//*  56  123:invokevirtual   #60  <Method boolean String.startsWith(String)>
	//*  57  126:ifeq            132
	//*  58  129:goto            138
					flag3 = false;
	//   59  132:iconst_0        
	//   60  133:istore          6
				else
	//*  61  135:goto            141
					flag3 = true;
	//   62  138:iconst_1        
	//   63  139:istore          6
				if(flag3)
	//*  64  141:iload           6
	//*  65  143:ifeq            159
				{
					obj = ((Object) (new bgd(1)));
	//   66  146:new             #66  <Class bgd>
	//   67  149:dup             
	//   68  150:iconst_1        
	//   69  151:invokespecial   #69  <Method void bgd(int)>
	//   70  154:astore          9
				} else
	//*  71  156:goto            198
				{
					byte byte0 = ((byte) (i));
	//   72  159:iload           7
	//   73  161:istore          6
					if(flag)
	//*  74  163:iload           4
	//*  75  165:ifeq            171
						byte0 = 4;
	//   76  168:iconst_4        
	//   77  169:istore          6
					i = ((int) (byte0));
	//   78  171:iload           6
	//   79  173:istore          7
					if(flag1)
	//*  80  175:iload           5
	//*  81  177:ifeq            187
						i = byte0 | 8;
	//   82  180:iload           6
	//   83  182:bipush          8
	//   84  184:ior             
	//   85  185:istore          7
					obj = ((Object) (new bgx(i)));
	//   86  187:new             #71  <Class bgx>
	//   87  190:dup             
	//   88  191:iload           7
	//   89  193:invokespecial   #72  <Method void bgx(int)>
	//   90  196:astore          9
				}
			}
			a = new bjt(((bfm) (obj)), ble1.a);
	//   91  198:aload_0         
	//   92  199:new             #74  <Class bjt>
	//   93  202:dup             
	//   94  203:aload           9
	//   95  205:aload_3         
	//   96  206:getfield        #28  <Field zzfs ble.a>
	//   97  209:invokespecial   #77  <Method void bjt(bfm, zzfs)>
	//   98  212:putfield        #48  <Field bjt a>
		}
		c = ble1.e();
	//   99  215:aload_0         
	//  100  216:aload_3         
	//  101  217:invokevirtual   #80  <Method bks ble.e()>
	//  102  220:putfield        #82  <Field bks c>
	//  103  223:return          
	}

	public final int a()
	{
		return c.a() + e;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field bks c>
	//    2    4:invokeinterface #88  <Method int bks.a()>
	//    3    9:aload_0         
	//    4   10:getfield        #90  <Field int e>
	//    5   13:iadd            
	//    6   14:ireturn         
	}

	public final int a(long l)
	{
		return c.a(l, d) + e;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field bks c>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field long d>
	//    5    9:invokeinterface #94  <Method int bks.a(long, long)>
	//    6   14:aload_0         
	//    7   15:getfield        #90  <Field int e>
	//    8   18:iadd            
	//    9   19:ireturn         
	}

	public final long a(int i)
	{
		return c.a(i - e);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field bks c>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #90  <Field int e>
	//    5    9:isub            
	//    6   10:invokeinterface #97  <Method long bks.a(int)>
	//    7   15:lreturn         
	}

	public final void a(long l, ble ble1)
	{
		bks bks1 = b.e();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ble b>
	//    2    4:invokevirtual   #80  <Method bks ble.e()>
	//    3    7:astore          8
		bks bks2 = ble1.e();
	//    4    9:aload_3         
	//    5   10:invokevirtual   #80  <Method bks ble.e()>
	//    6   13:astore          9
		d = l;
	//    7   15:aload_0         
	//    8   16:lload_1         
	//    9   17:putfield        #21  <Field long d>
		b = ble1;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #23  <Field ble b>
		if(bks1 == null)
	//*  13   25:aload           8
	//*  14   27:ifnonnull       31
			return;
	//   15   30:return          
		c = bks2;
	//   16   31:aload_0         
	//   17   32:aload           9
	//   18   34:putfield        #82  <Field bks c>
		if(!bks1.b())
	//*  19   37:aload           8
	//*  20   39:invokeinterface #101 <Method boolean bks.b()>
	//*  21   44:ifne            48
			return;
	//   22   47:return          
		int i = bks1.a(d);
	//   23   48:aload           8
	//   24   50:aload_0         
	//   25   51:getfield        #21  <Field long d>
	//   26   54:invokeinterface #103 <Method int bks.a(long)>
	//   27   59:istore          4
		if(i == 0)
	//*  28   61:iload           4
	//*  29   63:ifne            67
			return;
	//   30   66:return          
		i = (bks1.a() + i) - 1;
	//   31   67:aload           8
	//   32   69:invokeinterface #88  <Method int bks.a()>
	//   33   74:iload           4
	//   34   76:iadd            
	//   35   77:iconst_1        
	//   36   78:isub            
	//   37   79:istore          4
		l = bks1.a(i) + bks1.a(i, d);
	//   38   81:aload           8
	//   39   83:iload           4
	//   40   85:invokeinterface #97  <Method long bks.a(int)>
	//   41   90:aload           8
	//   42   92:iload           4
	//   43   94:aload_0         
	//   44   95:getfield        #21  <Field long d>
	//   45   98:invokeinterface #106 <Method long bks.a(int, long)>
	//   46  103:ladd            
	//   47  104:lstore_1        
		int j = bks2.a();
	//   48  105:aload           9
	//   49  107:invokeinterface #88  <Method int bks.a()>
	//   50  112:istore          5
		long l1 = bks2.a(j);
	//   51  114:aload           9
	//   52  116:iload           5
	//   53  118:invokeinterface #97  <Method long bks.a(int)>
	//   54  123:lstore          6
		if(l == l1)
	//*  55  125:lload_1         
	//*  56  126:lload           6
	//*  57  128:lcmp            
	//*  58  129:ifne            149
		{
			e = e + ((i + 1) - j);
	//   59  132:aload_0         
	//   60  133:aload_0         
	//   61  134:getfield        #90  <Field int e>
	//   62  137:iload           4
	//   63  139:iconst_1        
	//   64  140:iadd            
	//   65  141:iload           5
	//   66  143:isub            
	//   67  144:iadd            
	//   68  145:putfield        #90  <Field int e>
			return;
	//   69  148:return          
		}
		if(l >= l1)
	//*  70  149:lload_1         
	//*  71  150:lload           6
	//*  72  152:lcmp            
	//*  73  153:iflt            182
		{
			e = e + (bks1.a(l1, d) - j);
	//   74  156:aload_0         
	//   75  157:aload_0         
	//   76  158:getfield        #90  <Field int e>
	//   77  161:aload           8
	//   78  163:lload           6
	//   79  165:aload_0         
	//   80  166:getfield        #21  <Field long d>
	//   81  169:invokeinterface #94  <Method int bks.a(long, long)>
	//   82  174:iload           5
	//   83  176:isub            
	//   84  177:iadd            
	//   85  178:putfield        #90  <Field int e>
			return;
	//   86  181:return          
		} else
		{
			throw new bil();
	//   87  182:new             #108 <Class bil>
	//   88  185:dup             
	//   89  186:invokespecial   #109 <Method void bil()>
	//   90  189:athrow          
		}
	}

	public final int b()
	{
		return c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field bks c>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field long d>
	//    4    8:invokeinterface #103 <Method int bks.a(long)>
	//    5   13:ireturn         
	}

	public final long b(int i)
	{
		return a(i) + c.a(i - e, d);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #110 <Method long a(int)>
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field bks c>
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #90  <Field int e>
	//    8   14:isub            
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field long d>
	//   11   19:invokeinterface #106 <Method long bks.a(int, long)>
	//   12   24:ladd            
	//   13   25:lreturn         
	}

	public final bld c(int i)
	{
		return c.b(i - e);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field bks c>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #90  <Field int e>
	//    5    9:isub            
	//    6   10:invokeinterface #113 <Method bld bks.b(int)>
	//    7   15:areturn         
	}

	public final bjt a;
	public ble b;
	public bks c;
	private long d;
	private int e;
}
