// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.*;
import android.os.Handler;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bhn, bnj, bdv, bef, 
//			bet, bdy, zzfs, bnk, 
//			bnw, bhq, bhm, bej, 
//			bcq, bcs, bdo, bek, 
//			beo, bfb, bfh, bdx, 
//			bdu, bdk

public final class ber extends bhn
	implements bnj
{

	public ber(bhq bhq1)
	{
		this(bhq1, ((bfh) (null)), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_1        
	//    4    4:invokespecial   #29  <Method void ber(bhq, bfh, boolean)>
	//    5    7:return          
	}

	private ber(bhq bhq1, bfh bfh, boolean flag)
	{
		this(bhq1, ((bfh) (null)), true, ((Handler) (null)), ((bdx) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_1        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #33  <Method void ber(bhq, bfh, boolean, Handler, bdx)>
	//    7    9:return          
	}

	private ber(bhq bhq1, bfh bfh, boolean flag, Handler handler, bdx bdx)
	{
		this(bhq1, ((bfh) (null)), true, ((Handler) (null)), ((bdx) (null)), ((bdu) (null)), new bdv[0]);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_1        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:iconst_0        
	//    8    8:anewarray       bdv[]
	//    9   11:invokespecial   #38  <Method void ber(bhq, bfh, boolean, Handler, bdx, bdu, bdv[])>
	//   10   14:return          
	}

	private transient ber(bhq bhq1, bfh bfh, boolean flag, Handler handler, bdx bdx, bdu bdu, bdv abdv[])
	{
		super(1, bhq1, bfh, flag);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:iload_3         
	//    5    5:invokespecial   #41  <Method void bhn(int, bhq, bfh, boolean)>
		c = new bef(((bdu) (null)), abdv, ((bel) (new bet(this, ((bes) (null))))));
	//    6    8:aload_0         
	//    7    9:new             #43  <Class bef>
	//    8   12:dup             
	//    9   13:aconst_null     
	//   10   14:aload           7
	//   11   16:new             #45  <Class bet>
	//   12   19:dup             
	//   13   20:aload_0         
	//   14   21:aconst_null     
	//   15   22:invokespecial   #48  <Method void bet(ber, bes)>
	//   16   25:invokespecial   #51  <Method void bef(bdu, bdv[], bel)>
	//   17   28:putfield        #53  <Field bef c>
		b = new bdy(((Handler) (null)), ((bdx) (null)));
	//   18   31:aload_0         
	//   19   32:new             #55  <Class bdy>
	//   20   35:dup             
	//   21   36:aconst_null     
	//   22   37:aconst_null     
	//   23   38:invokespecial   #58  <Method void bdy(Handler, bdx)>
	//   24   41:putfield        #60  <Field bdy b>
	//   25   44:return          
	}

	static bdy a(ber ber1)
	{
		return ber1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field bdy b>
	//    2    4:areturn         
	}

	protected static void a(int k, long l, long l1)
	{
	//    0    0:return          
	}

	static boolean a(ber ber1, boolean flag)
	{
		ber1.j = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #66  <Field boolean j>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	private final boolean a(String s)
	{
		return c.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field bef c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #69  <Method boolean bef.a(String)>
	//    4    8:ireturn         
	}

	protected static void b(int k)
	{
	//    0    0:return          
	}

	protected static void v()
	{
	//    0    0:return          
	}

	protected final int a(bhq bhq1, zzfs zzfs1)
	{
		byte byte0;
		boolean flag;
		byte byte2;
label0:
		{
			String s = zzfs1.e;
	//    0    0:aload_2         
	//    1    1:getfield        #78  <Field String zzfs.e>
	//    2    4:astore          8
			if(!bnk.a(s))
	//*   3    6:aload           8
	//*   4    8:invokestatic    #81  <Method boolean bnk.a(String)>
	//*   5   11:ifne            16
				return 0;
	//    6   14:iconst_0        
	//    7   15:ireturn         
			if(bnw.a >= 21)
	//*   8   16:getstatic       #85  <Field int bnw.a>
	//*   9   19:bipush          21
	//*  10   21:icmplt          30
				byte0 = 16;
	//   11   24:bipush          16
	//   12   26:istore_3        
			else
	//*  13   27:goto            32
				byte0 = 0;
	//   14   30:iconst_0        
	//   15   31:istore_3        
			boolean flag2 = a(s);
	//   16   32:aload_0         
	//   17   33:aload           8
	//   18   35:invokespecial   #86  <Method boolean a(String)>
	//   19   38:istore          7
			byte2 = 3;
	//   20   40:iconst_3        
	//   21   41:istore          5
			if(flag2 && bhq1.a() != null)
	//*  22   43:iload           7
	//*  23   45:ifeq            63
	//*  24   48:aload_1         
	//*  25   49:invokeinterface #91  <Method bhm bhq.a()>
	//*  26   54:ifnull          63
				return byte0 | 4 | 3;
	//   27   57:iload_3         
	//   28   58:iconst_4        
	//   29   59:ior             
	//   30   60:iconst_3        
	//   31   61:ior             
	//   32   62:ireturn         
			bhq1 = ((bhq) (bhq1.a(s, false)));
	//   33   63:aload_1         
	//   34   64:aload           8
	//   35   66:iconst_0        
	//   36   67:invokeinterface #94  <Method bhm bhq.a(String, boolean)>
	//   37   72:astore_1        
			boolean flag1 = true;
	//   38   73:iconst_1        
	//   39   74:istore          6
			if(bhq1 == null)
	//*  40   76:aload_1         
	//*  41   77:ifnonnull       82
				return 1;
	//   42   80:iconst_1        
	//   43   81:ireturn         
			flag = flag1;
	//   44   82:iload           6
	//   45   84:istore          4
			if(bnw.a < 21)
				break label0;
	//   46   86:getstatic       #85  <Field int bnw.a>
	//   47   89:bipush          21
	//   48   91:icmplt          146
			if(zzfs1.o == -1 || ((bhm) (bhq1)).a(zzfs1.o))
	//*  49   94:aload_2         
	//*  50   95:getfield        #97  <Field int zzfs.o>
	//*  51   98:iconst_m1       
	//*  52   99:icmpeq          113
	//*  53  102:aload_1         
	//*  54  103:aload_2         
	//*  55  104:getfield        #97  <Field int zzfs.o>
	//*  56  107:invokevirtual   #102 <Method boolean bhm.a(int)>
	//*  57  110:ifeq            143
			{
				flag = flag1;
	//   58  113:iload           6
	//   59  115:istore          4
				if(zzfs1.n == -1)
					break label0;
	//   60  117:aload_2         
	//   61  118:getfield        #105 <Field int zzfs.n>
	//   62  121:iconst_m1       
	//   63  122:icmpeq          146
				if(((bhm) (bhq1)).b(zzfs1.n))
	//*  64  125:aload_1         
	//*  65  126:aload_2         
	//*  66  127:getfield        #105 <Field int zzfs.n>
	//*  67  130:invokevirtual   #107 <Method boolean bhm.b(int)>
	//*  68  133:ifeq            143
				{
					flag = flag1;
	//   69  136:iload           6
	//   70  138:istore          4
					break label0;
	//   71  140:goto            146
				}
			}
			flag = false;
	//   72  143:iconst_0        
	//   73  144:istore          4
		}
		byte byte1;
		if(flag)
	//*  74  146:iload           4
	//*  75  148:ifeq            158
			byte1 = byte2;
	//   76  151:iload           5
	//   77  153:istore          4
		else
	//*  78  155:goto            161
			byte1 = 2;
	//   79  158:iconst_2        
	//   80  159:istore          4
		return byte0 | 4 | byte1;
	//   81  161:iload_3         
	//   82  162:iconst_4        
	//   83  163:ior             
	//   84  164:iload           4
	//   85  166:ior             
	//   86  167:ireturn         
	}

	public final bdk a(bdk bdk)
	{
		return c.a(bdk);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field bef c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method bdk bef.a(bdk)>
	//    4    8:areturn         
	}

	protected final bhm a(bhq bhq1, zzfs zzfs1, boolean flag)
	{
		if(a(zzfs1.e))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:getfield        #78  <Field String zzfs.e>
	//*   3    5:invokespecial   #86  <Method boolean a(String)>
	//*   4    8:ifeq            32
		{
			bhm bhm1 = bhq1.a();
	//    5   11:aload_1         
	//    6   12:invokeinterface #91  <Method bhm bhq.a()>
	//    7   17:astore          4
			if(bhm1 != null)
	//*   8   19:aload           4
	//*   9   21:ifnull          32
			{
				d = true;
	//   10   24:aload_0         
	//   11   25:iconst_1        
	//   12   26:putfield        #113 <Field boolean d>
				return bhm1;
	//   13   29:aload           4
	//   14   31:areturn         
			}
		}
		d = false;
	//   15   32:aload_0         
	//   16   33:iconst_0        
	//   17   34:putfield        #113 <Field boolean d>
		return super.a(bhq1, zzfs1, flag);
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:aload_2         
	//   21   40:iload_3         
	//   22   41:invokespecial   #115 <Method bhm bhn.a(bhq, zzfs, boolean)>
	//   23   44:areturn         
	}

	public final void a(int k, Object obj)
	{
		switch(k)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     2 3: default 24
	//	               2 48
	//	               3 31
		default:
			super.a(k, obj);
	//    2   24:aload_0         
	//    3   25:iload_1         
	//    4   26:aload_2         
	//    5   27:invokespecial   #118 <Method void bhn.a(int, Object)>
			return;
	//    6   30:return          

		case 3: // '\003'
			k = ((Integer)obj).intValue();
	//    7   31:aload_2         
	//    8   32:checkcast       #120 <Class Integer>
	//    9   35:invokevirtual   #124 <Method int Integer.intValue()>
	//   10   38:istore_1        
			c.a(k);
	//   11   39:aload_0         
	//   12   40:getfield        #53  <Field bef c>
	//   13   43:iload_1         
	//   14   44:invokevirtual   #126 <Method void bef.a(int)>
			return;
	//   15   47:return          

		case 2: // '\002'
			c.a(((Float)obj).floatValue());
	//   16   48:aload_0         
	//   17   49:getfield        #53  <Field bef c>
	//   18   52:aload_2         
	//   19   53:checkcast       #128 <Class Float>
	//   20   56:invokevirtual   #132 <Method float Float.floatValue()>
	//   21   59:invokevirtual   #135 <Method void bef.a(float)>
			return;
	//   22   62:return          
		}
	}

	protected final void a(long l, boolean flag)
	{
		super.a(l, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #138 <Method void bhn.a(long, boolean)>
		c.i();
	//    4    6:aload_0         
	//    5    7:getfield        #53  <Field bef c>
	//    6   10:invokevirtual   #140 <Method void bef.i()>
		i = l;
	//    7   13:aload_0         
	//    8   14:lload_1         
	//    9   15:putfield        #142 <Field long i>
		j = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #66  <Field boolean j>
	//   13   23:return          
	}

	protected final void a(MediaCodec mediacodec, MediaFormat mediaformat)
	{
		int i1;
		int j1;
label0:
		{
			mediacodec = ((MediaCodec) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field MediaFormat f>
	//    2    4:astore_1        
			boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
			boolean flag;
			if(mediacodec != null)
	//*   5    8:aload_1         
	//*   6    9:ifnull          17
				flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
			else
	//*   9   14:goto            19
				flag = false;
	//   10   17:iconst_0        
	//   11   18:istore_3        
			if(flag)
	//*  12   19:iload_3         
	//*  13   20:ifeq            36
				mediacodec = ((MediaCodec) (f.getString("mime")));
	//   14   23:aload_0         
	//   15   24:getfield        #147 <Field MediaFormat f>
	//   16   27:ldc1            #149 <String "mime">
	//   17   29:invokevirtual   #155 <Method String MediaFormat.getString(String)>
	//   18   32:astore_1        
			else
	//*  19   33:goto            39
				mediacodec = "audio/raw";
	//   20   36:ldc1            #157 <String "audio/raw">
	//   21   38:astore_1        
			if(flag)
	//*  22   39:iload_3         
	//*  23   40:ifeq            48
				mediaformat = f;
	//   24   43:aload_0         
	//   25   44:getfield        #147 <Field MediaFormat f>
	//   26   47:astore_2        
			i1 = mediaformat.getInteger("channel-count");
	//   27   48:aload_2         
	//   28   49:ldc1            #159 <String "channel-count">
	//   29   51:invokevirtual   #163 <Method int MediaFormat.getInteger(String)>
	//   30   54:istore          5
			j1 = mediaformat.getInteger("sample-rate");
	//   31   56:aload_2         
	//   32   57:ldc1            #165 <String "sample-rate">
	//   33   59:invokevirtual   #163 <Method int MediaFormat.getInteger(String)>
	//   34   62:istore          6
			if(e && i1 == 6)
	//*  35   64:aload_0         
	//*  36   65:getfield        #167 <Field boolean e>
	//*  37   68:ifeq            118
	//*  38   71:iload           5
	//*  39   73:bipush          6
	//*  40   75:icmpne          118
			{
				int k = h;
	//   41   78:aload_0         
	//   42   79:getfield        #169 <Field int h>
	//   43   82:istore_3        
				if(k < 6)
	//*  44   83:iload_3         
	//*  45   84:bipush          6
	//*  46   86:icmpge          118
				{
					mediaformat = ((MediaFormat) (new int[k]));
	//   47   89:iload_3         
	//   48   90:newarray        int[]
	//   49   92:astore_2        
					for(int l = ((int) (flag1)); l < h; l++)
	//*  50   93:iload           4
	//*  51   95:istore_3        
	//*  52   96:iload_3         
	//*  53   97:aload_0         
	//*  54   98:getfield        #169 <Field int h>
	//*  55  101:icmpge          115
						mediaformat[l] = l;
	//   56  104:aload_2         
	//   57  105:iload_3         
	//   58  106:iload_3         
	//   59  107:iastore         

	//   60  108:iload_3         
	//   61  109:iconst_1        
	//   62  110:iadd            
	//   63  111:istore_3        
					break label0;
	//   64  112:goto            96
				}
			}
	//*  65  115:goto            120
			mediaformat = null;
	//   66  118:aconst_null     
	//   67  119:astore_2        
		}
		try
		{
			c.a(((String) (mediacodec)), i1, j1, g, 0, ((int []) (mediaformat)));
	//   68  120:aload_0         
	//   69  121:getfield        #53  <Field bef c>
	//   70  124:aload_1         
	//   71  125:iload           5
	//   72  127:iload           6
	//   73  129:aload_0         
	//   74  130:getfield        #171 <Field int g>
	//   75  133:iconst_0        
	//   76  134:aload_2         
	//   77  135:invokevirtual   #174 <Method void bef.a(String, int, int, int, int, int[])>
			return;
	//   78  138:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediaCodec mediacodec)
	//*  79  139:astore_1        
		{
			throw bcs.a(((Exception) (mediacodec)), ((bcq)this).r());
	//   80  140:aload_1         
	//   81  141:aload_0         
	//   82  142:invokevirtual   #179 <Method int bcq.r()>
	//   83  145:invokestatic    #184 <Method bcs bcs.a(Exception, int)>
	//   84  148:athrow          
		}
	}

	protected final void a(bhm bhm1, MediaCodec mediacodec, zzfs zzfs1, MediaCrypto mediacrypto)
	{
		bhm1 = ((bhm) (bhm1.a));
	//    0    0:aload_1         
	//    1    1:getfield        #187 <Field String bhm.a>
	//    2    4:astore_1        
		boolean flag;
		if(bnw.a < 24 && "OMX.SEC.aac.dec".equals(((Object) (bhm1))) && "samsung".equals(((Object) (bnw.c))) && (bnw.b.startsWith("zeroflte") || bnw.b.startsWith("herolte") || bnw.b.startsWith("heroqlte")))
	//*   3    5:getstatic       #85  <Field int bnw.a>
	//*   4    8:bipush          24
	//*   5   10:icmpge          72
	//*   6   13:ldc1            #189 <String "OMX.SEC.aac.dec">
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #195 <Method boolean String.equals(Object)>
	//*   9   19:ifeq            72
	//*  10   22:ldc1            #197 <String "samsung">
	//*  11   24:getstatic       #199 <Field String bnw.c>
	//*  12   27:invokevirtual   #195 <Method boolean String.equals(Object)>
	//*  13   30:ifeq            72
	//*  14   33:getstatic       #201 <Field String bnw.b>
	//*  15   36:ldc1            #203 <String "zeroflte">
	//*  16   38:invokevirtual   #206 <Method boolean String.startsWith(String)>
	//*  17   41:ifne            66
	//*  18   44:getstatic       #201 <Field String bnw.b>
	//*  19   47:ldc1            #208 <String "herolte">
	//*  20   49:invokevirtual   #206 <Method boolean String.startsWith(String)>
	//*  21   52:ifne            66
	//*  22   55:getstatic       #201 <Field String bnw.b>
	//*  23   58:ldc1            #210 <String "heroqlte">
	//*  24   60:invokevirtual   #206 <Method boolean String.startsWith(String)>
	//*  25   63:ifeq            72
			flag = true;
	//   26   66:iconst_1        
	//   27   67:istore          5
		else
	//*  28   69:goto            75
			flag = false;
	//   29   72:iconst_0        
	//   30   73:istore          5
		e = flag;
	//   31   75:aload_0         
	//   32   76:iload           5
	//   33   78:putfield        #167 <Field boolean e>
		if(d)
	//*  34   81:aload_0         
	//*  35   82:getfield        #113 <Field boolean d>
	//*  36   85:ifeq            132
		{
			f = zzfs1.b();
	//   37   88:aload_0         
	//   38   89:aload_3         
	//   39   90:invokevirtual   #213 <Method MediaFormat zzfs.b()>
	//   40   93:putfield        #147 <Field MediaFormat f>
			f.setString("mime", "audio/raw");
	//   41   96:aload_0         
	//   42   97:getfield        #147 <Field MediaFormat f>
	//   43  100:ldc1            #149 <String "mime">
	//   44  102:ldc1            #157 <String "audio/raw">
	//   45  104:invokevirtual   #217 <Method void MediaFormat.setString(String, String)>
			mediacodec.configure(f, ((android.view.Surface) (null)), ((MediaCrypto) (null)), 0);
	//   46  107:aload_2         
	//   47  108:aload_0         
	//   48  109:getfield        #147 <Field MediaFormat f>
	//   49  112:aconst_null     
	//   50  113:aconst_null     
	//   51  114:iconst_0        
	//   52  115:invokevirtual   #223 <Method void MediaCodec.configure(MediaFormat, android.view.Surface, MediaCrypto, int)>
			f.setString("mime", zzfs1.e);
	//   53  118:aload_0         
	//   54  119:getfield        #147 <Field MediaFormat f>
	//   55  122:ldc1            #149 <String "mime">
	//   56  124:aload_3         
	//   57  125:getfield        #78  <Field String zzfs.e>
	//   58  128:invokevirtual   #217 <Method void MediaFormat.setString(String, String)>
			return;
	//   59  131:return          
		} else
		{
			mediacodec.configure(zzfs1.b(), ((android.view.Surface) (null)), ((MediaCrypto) (null)), 0);
	//   60  132:aload_2         
	//   61  133:aload_3         
	//   62  134:invokevirtual   #213 <Method MediaFormat zzfs.b()>
	//   63  137:aconst_null     
	//   64  138:aconst_null     
	//   65  139:iconst_0        
	//   66  140:invokevirtual   #223 <Method void MediaCodec.configure(MediaFormat, android.view.Surface, MediaCrypto, int)>
			f = null;
	//   67  143:aload_0         
	//   68  144:aconst_null     
	//   69  145:putfield        #147 <Field MediaFormat f>
			return;
	//   70  148:return          
		}
	}

	protected final void a(String s, long l, long l1)
	{
		b.a(s, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field bdy b>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #226 <Method void bdy.a(String, long, long)>
	//    6   11:return          
	}

	protected final void a(boolean flag)
	{
		super.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #229 <Method void bhn.a(boolean)>
		b.a(a);
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field bdy b>
	//    5    9:aload_0         
	//    6   10:getfield        #232 <Field bfb a>
	//    7   13:invokevirtual   #235 <Method void bdy.a(bfb)>
		int k = ((bcq)this).q().b;
	//    8   16:aload_0         
	//    9   17:invokevirtual   #239 <Method bdo bcq.q()>
	//   10   20:getfield        #243 <Field int bdo.b>
	//   11   23:istore_2        
		if(k != 0)
	//*  12   24:iload_2         
	//*  13   25:ifeq            37
		{
			c.b(k);
	//   14   28:aload_0         
	//   15   29:getfield        #53  <Field bef c>
	//   16   32:iload_2         
	//   17   33:invokevirtual   #245 <Method void bef.b(int)>
			return;
	//   18   36:return          
		} else
		{
			c.g();
	//   19   37:aload_0         
	//   20   38:getfield        #53  <Field bef c>
	//   21   41:invokevirtual   #247 <Method void bef.g()>
			return;
	//   22   44:return          
		}
	}

	protected final boolean a(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, int k, 
			int i1, long l2, boolean flag)
	{
		if(d && (i1 & 2) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field boolean d>
	//*   2    4:ifeq            24
	//*   3    7:iload           8
	//*   4    9:iconst_2        
	//*   5   10:iand            
	//*   6   11:ifeq            24
		{
			mediacodec.releaseOutputBuffer(k, false);
	//    7   14:aload           5
	//    8   16:iload           7
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #256 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
			return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
		}
		if(flag)
	//*  13   24:iload           11
	//*  14   26:ifeq            64
		{
			mediacodec.releaseOutputBuffer(k, false);
	//   15   29:aload           5
	//   16   31:iload           7
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #256 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
			mediacodec = ((MediaCodec) (a));
	//   19   37:aload_0         
	//   20   38:getfield        #232 <Field bfb a>
	//   21   41:astore          5
			mediacodec.e = ((bfb) (mediacodec)).e + 1;
	//   22   43:aload           5
	//   23   45:aload           5
	//   24   47:getfield        #260 <Field int bfb.e>
	//   25   50:iconst_1        
	//   26   51:iadd            
	//   27   52:putfield        #260 <Field int bfb.e>
			c.b();
	//   28   55:aload_0         
	//   29   56:getfield        #53  <Field bef c>
	//   30   59:invokevirtual   #262 <Method void bef.b()>
			return true;
	//   31   62:iconst_1        
	//   32   63:ireturn         
		}
		if(!c.a(bytebuffer, l2))
			break MISSING_BLOCK_LABEL_106;
	//   33   64:aload_0         
	//   34   65:getfield        #53  <Field bef c>
	//   35   68:aload           6
	//   36   70:lload           9
	//   37   72:invokevirtual   #265 <Method boolean bef.a(ByteBuffer, long)>
	//   38   75:ifeq            106
		mediacodec.releaseOutputBuffer(k, false);
	//   39   78:aload           5
	//   40   80:iload           7
	//   41   82:iconst_0        
	//   42   83:invokevirtual   #256 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		mediacodec = ((MediaCodec) (a));
	//   43   86:aload_0         
	//   44   87:getfield        #232 <Field bfb a>
	//   45   90:astore          5
		mediacodec.d = ((bfb) (mediacodec)).d + 1;
	//   46   92:aload           5
	//   47   94:aload           5
	//   48   96:getfield        #267 <Field int bfb.d>
	//   49   99:iconst_1        
	//   50  100:iadd            
	//   51  101:putfield        #267 <Field int bfb.d>
		return true;
	//   52  104:iconst_1        
	//   53  105:ireturn         
		return false;
	//   54  106:iconst_0        
	//   55  107:ireturn         
		mediacodec;
	//   56  108:astore          5
		break MISSING_BLOCK_LABEL_115;
	//   57  110:goto            115
		mediacodec;
	//   58  113:astore          5
		throw bcs.a(((Exception) (mediacodec)), ((bcq)this).r());
	//   59  115:aload           5
	//   60  117:aload_0         
	//   61  118:invokevirtual   #179 <Method int bcq.r()>
	//   62  121:invokestatic    #184 <Method bcs bcs.a(Exception, int)>
	//   63  124:athrow          
	}

	protected final void b(zzfs zzfs1)
	{
		super.b(zzfs1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #270 <Method void bhn.b(zzfs)>
		b.a(zzfs1);
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field bdy b>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #272 <Method void bdy.a(zzfs)>
		int k;
		if("audio/raw".equals(((Object) (zzfs1.e))))
	//*   7   13:ldc1            #157 <String "audio/raw">
	//*   8   15:aload_1         
	//*   9   16:getfield        #78  <Field String zzfs.e>
	//*  10   19:invokevirtual   #195 <Method boolean String.equals(Object)>
	//*  11   22:ifeq            33
			k = zzfs1.p;
	//   12   25:aload_1         
	//   13   26:getfield        #275 <Field int zzfs.p>
	//   14   29:istore_2        
		else
	//*  15   30:goto            35
			k = 2;
	//   16   33:iconst_2        
	//   17   34:istore_2        
		g = k;
	//   18   35:aload_0         
	//   19   36:iload_2         
	//   20   37:putfield        #171 <Field int g>
		h = zzfs1.n;
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:getfield        #105 <Field int zzfs.n>
	//   24   45:putfield        #169 <Field int h>
	//   25   48:return          
	}

	public final bnj c()
	{
		return ((bnj) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected final void n()
	{
		super.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #278 <Method void bhn.n()>
		c.a();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field bef c>
	//    4    8:invokevirtual   #280 <Method void bef.a()>
	//    5   11:return          
	}

	protected final void o()
	{
		c.h();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field bef c>
	//    2    4:invokevirtual   #282 <Method void bef.h()>
		super.o();
	//    3    7:aload_0         
	//    4    8:invokespecial   #284 <Method void bhn.o()>
	//    5   11:return          
	}

	protected final void p()
	{
		c.j();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field bef c>
	//    2    4:invokevirtual   #286 <Method void bef.j()>
		super.p();
	//    3    7:aload_0         
	//    4    8:invokespecial   #288 <Method void bhn.p()>
		a.a();
	//    5   11:aload_0         
	//    6   12:getfield        #232 <Field bfb a>
	//    7   15:invokevirtual   #289 <Method void bfb.a()>
		b.b(a);
	//    8   18:aload_0         
	//    9   19:getfield        #60  <Field bdy b>
	//   10   22:aload_0         
	//   11   23:getfield        #232 <Field bfb a>
	//   12   26:invokevirtual   #291 <Method void bdy.b(bfb)>
		return;
	//   13   29:return          
		Exception exception;
		exception;
	//   14   30:astore_1        
		a.a();
	//   15   31:aload_0         
	//   16   32:getfield        #232 <Field bfb a>
	//   17   35:invokevirtual   #289 <Method void bfb.a()>
		b.b(a);
	//   18   38:aload_0         
	//   19   39:getfield        #60  <Field bdy b>
	//   20   42:aload_0         
	//   21   43:getfield        #232 <Field bfb a>
	//   22   46:invokevirtual   #291 <Method void bdy.b(bfb)>
		throw exception;
	//   23   49:aload_1         
	//   24   50:athrow          
		exception;
	//   25   51:astore_1        
		super.p();
	//   26   52:aload_0         
	//   27   53:invokespecial   #288 <Method void bhn.p()>
		a.a();
	//   28   56:aload_0         
	//   29   57:getfield        #232 <Field bfb a>
	//   30   60:invokevirtual   #289 <Method void bfb.a()>
		b.b(a);
	//   31   63:aload_0         
	//   32   64:getfield        #60  <Field bdy b>
	//   33   67:aload_0         
	//   34   68:getfield        #232 <Field bfb a>
	//   35   71:invokevirtual   #291 <Method void bdy.b(bfb)>
		throw exception;
	//   36   74:aload_1         
	//   37   75:athrow          
		exception;
	//   38   76:astore_1        
		a.a();
	//   39   77:aload_0         
	//   40   78:getfield        #232 <Field bfb a>
	//   41   81:invokevirtual   #289 <Method void bfb.a()>
		b.b(a);
	//   42   84:aload_0         
	//   43   85:getfield        #60  <Field bdy b>
	//   44   88:aload_0         
	//   45   89:getfield        #232 <Field bfb a>
	//   46   92:invokevirtual   #291 <Method void bdy.b(bfb)>
		throw exception;
	//   47   95:aload_1         
	//   48   96:athrow          
	}

	public final boolean t()
	{
		return c.e() || super.t();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field bef c>
	//    2    4:invokevirtual   #295 <Method boolean bef.e()>
	//    3    7:ifne            22
	//    4   10:aload_0         
	//    5   11:invokespecial   #297 <Method boolean bhn.t()>
	//    6   14:ifeq            20
	//    7   17:goto            22
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:iconst_1        
	//   11   23:ireturn         
	}

	public final boolean u()
	{
		return super.u() && c.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #300 <Method boolean bhn.u()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field bef c>
	//    5   11:invokevirtual   #302 <Method boolean bef.d()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public final long w()
	{
		long l = c.a(((bhn)this).u());
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field bef c>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #300 <Method boolean bhn.u()>
	//    4    8:invokevirtual   #307 <Method long bef.a(boolean)>
	//    5   11:lstore_1        
		if(l != 0x0L)
	//*   6   12:lload_1         
	//*   7   13:ldc2w           #308 <Long 0x0L>
	//*   8   16:lcmp            
	//*   9   17:ifeq            49
		{
			if(!j)
	//*  10   20:aload_0         
	//*  11   21:getfield        #66  <Field boolean j>
	//*  12   24:ifeq            30
	//*  13   27:goto            39
				l = Math.max(i, l);
	//   14   30:aload_0         
	//   15   31:getfield        #142 <Field long i>
	//   16   34:lload_1         
	//   17   35:invokestatic    #315 <Method long Math.max(long, long)>
	//   18   38:lstore_1        
			i = l;
	//   19   39:aload_0         
	//   20   40:lload_1         
	//   21   41:putfield        #142 <Field long i>
			j = false;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #66  <Field boolean j>
		}
		return i;
	//   25   49:aload_0         
	//   26   50:getfield        #142 <Field long i>
	//   27   53:lreturn         
	}

	public final bdk x()
	{
		return c.f();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field bef c>
	//    2    4:invokevirtual   #319 <Method bdk bef.f()>
	//    3    7:areturn         
	}

	protected final void y()
	{
		try
		{
			c.c();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field bef c>
	//    2    4:invokevirtual   #322 <Method void bef.c()>
			return;
	//    3    7:return          
		}
		catch(beo beo1)
	//*   4    8:astore_1        
		{
			throw bcs.a(((Exception) (beo1)), ((bcq)this).r());
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #179 <Method int bcq.r()>
	//    8   14:invokestatic    #184 <Method bcs bcs.a(Exception, int)>
	//    9   17:athrow          
		}
	}

	private final bdy b;
	private final bef c;
	private boolean d;
	private boolean e;
	private MediaFormat f;
	private int g;
	private int h;
	private long i;
	private boolean j;
}
