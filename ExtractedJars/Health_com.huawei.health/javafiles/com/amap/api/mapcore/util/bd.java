// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import java.io.File;

// Referenced classes of package com.amap.api.mapcore.util:
//			bm, cd, cj, cq, 
//			cm, co, cp, ci, 
//			cn, ck, bv, cb, 
//			ch, fd, be, bo

public class bd extends OfflineMapCity
	implements bm, cd
{

	public bd(Context context, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void OfflineMapCity()>
		a = ((ch) (new cj(6, this)));
	//    2    4:aload_0         
	//    3    5:new             #51  <Class cj>
	//    4    8:dup             
	//    5    9:bipush          6
	//    6   11:aload_0         
	//    7   12:invokespecial   #54  <Method void cj(int, bd)>
	//    8   15:putfield        #56  <Field ch a>
		b = ((ch) (new cq(2, this)));
	//    9   18:aload_0         
	//   10   19:new             #58  <Class cq>
	//   11   22:dup             
	//   12   23:iconst_2        
	//   13   24:aload_0         
	//   14   25:invokespecial   #59  <Method void cq(int, bd)>
	//   15   28:putfield        #61  <Field ch b>
		c = ((ch) (new cm(0, this)));
	//   16   31:aload_0         
	//   17   32:new             #63  <Class cm>
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:aload_0         
	//   21   38:invokespecial   #64  <Method void cm(int, bd)>
	//   22   41:putfield        #66  <Field ch c>
		d = ((ch) (new co(3, this)));
	//   23   44:aload_0         
	//   24   45:new             #68  <Class co>
	//   25   48:dup             
	//   26   49:iconst_3        
	//   27   50:aload_0         
	//   28   51:invokespecial   #69  <Method void co(int, bd)>
	//   29   54:putfield        #71  <Field ch d>
		e = ((ch) (new cp(1, this)));
	//   30   57:aload_0         
	//   31   58:new             #73  <Class cp>
	//   32   61:dup             
	//   33   62:iconst_1        
	//   34   63:aload_0         
	//   35   64:invokespecial   #74  <Method void cp(int, bd)>
	//   36   67:putfield        #76  <Field ch e>
		f = ((ch) (new ci(4, this)));
	//   37   70:aload_0         
	//   38   71:new             #78  <Class ci>
	//   39   74:dup             
	//   40   75:iconst_4        
	//   41   76:aload_0         
	//   42   77:invokespecial   #79  <Method void ci(int, bd)>
	//   43   80:putfield        #81  <Field ch f>
		g = ((ch) (new cn(7, this)));
	//   44   83:aload_0         
	//   45   84:new             #83  <Class cn>
	//   46   87:dup             
	//   47   88:bipush          7
	//   48   90:aload_0         
	//   49   91:invokespecial   #84  <Method void cn(int, bd)>
	//   50   94:putfield        #86  <Field ch g>
		h = ((ch) (new ck(-1, this)));
	//   51   97:aload_0         
	//   52   98:new             #88  <Class ck>
	//   53  101:dup             
	//   54  102:iconst_m1       
	//   55  103:aload_0         
	//   56  104:invokespecial   #89  <Method void ck(int, bd)>
	//   57  107:putfield        #91  <Field ch h>
		i = ((ch) (new ck(101, this)));
	//   58  110:aload_0         
	//   59  111:new             #88  <Class ck>
	//   60  114:dup             
	//   61  115:bipush          101
	//   62  117:aload_0         
	//   63  118:invokespecial   #89  <Method void ck(int, bd)>
	//   64  121:putfield        #93  <Field ch i>
		j = ((ch) (new ck(102, this)));
	//   65  124:aload_0         
	//   66  125:new             #88  <Class ck>
	//   67  128:dup             
	//   68  129:bipush          102
	//   69  131:aload_0         
	//   70  132:invokespecial   #89  <Method void ck(int, bd)>
	//   71  135:putfield        #95  <Field ch j>
		k = ((ch) (new ck(103, this)));
	//   72  138:aload_0         
	//   73  139:new             #88  <Class ck>
	//   74  142:dup             
	//   75  143:bipush          103
	//   76  145:aload_0         
	//   77  146:invokespecial   #89  <Method void ck(int, bd)>
	//   78  149:putfield        #97  <Field ch k>
		p = null;
	//   79  152:aload_0         
	//   80  153:aconst_null     
	//   81  154:putfield        #99  <Field String p>
		q = "";
	//   82  157:aload_0         
	//   83  158:ldc1            #101 <String "">
	//   84  160:putfield        #103 <Field String q>
		n = false;
	//   85  163:aload_0         
	//   86  164:iconst_0        
	//   87  165:putfield        #105 <Field boolean n>
		r = 0L;
	//   88  168:aload_0         
	//   89  169:lconst_0        
	//   90  170:putfield        #107 <Field long r>
		m = context;
	//   91  173:aload_0         
	//   92  174:aload_1         
	//   93  175:putfield        #109 <Field Context m>
		a(i1);
	//   94  178:aload_0         
	//   95  179:iload_2         
	//   96  180:invokevirtual   #112 <Method void a(int)>
	//   97  183:return          
	}

	public bd(Context context, OfflineMapCity offlinemapcity)
	{
		this(context, offlinemapcity.getState());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #117 <Method int OfflineMapCity.getState()>
	//    4    6:invokespecial   #119 <Method void bd(Context, int)>
		setCity(offlinemapcity.getCity());
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #123 <Method String OfflineMapCity.getCity()>
	//    8   14:invokevirtual   #127 <Method void setCity(String)>
		setUrl(offlinemapcity.getUrl());
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #130 <Method String OfflineMapCity.getUrl()>
	//   12   22:invokevirtual   #133 <Method void setUrl(String)>
		setState(offlinemapcity.getState());
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #117 <Method int OfflineMapCity.getState()>
	//   16   30:invokevirtual   #136 <Method void setState(int)>
		setCompleteCode(offlinemapcity.getcompleteCode());
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #139 <Method int OfflineMapCity.getcompleteCode()>
	//   20   38:invokevirtual   #142 <Method void setCompleteCode(int)>
		setAdcode(offlinemapcity.getAdcode());
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokevirtual   #145 <Method String OfflineMapCity.getAdcode()>
	//   24   46:invokevirtual   #148 <Method void setAdcode(String)>
		setVersion(offlinemapcity.getVersion());
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #151 <Method String OfflineMapCity.getVersion()>
	//   28   54:invokevirtual   #154 <Method void setVersion(String)>
		setSize(offlinemapcity.getSize());
	//   29   57:aload_0         
	//   30   58:aload_2         
	//   31   59:invokevirtual   #158 <Method long OfflineMapCity.getSize()>
	//   32   62:invokevirtual   #162 <Method void setSize(long)>
		setCode(offlinemapcity.getCode());
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:invokevirtual   #165 <Method String OfflineMapCity.getCode()>
	//   36   70:invokevirtual   #168 <Method void setCode(String)>
		setJianpin(offlinemapcity.getJianpin());
	//   37   73:aload_0         
	//   38   74:aload_2         
	//   39   75:invokevirtual   #171 <Method String OfflineMapCity.getJianpin()>
	//   40   78:invokevirtual   #174 <Method void setJianpin(String)>
		setPinyin(offlinemapcity.getPinyin());
	//   41   81:aload_0         
	//   42   82:aload_2         
	//   43   83:invokevirtual   #177 <Method String OfflineMapCity.getPinyin()>
	//   44   86:invokevirtual   #180 <Method void setPinyin(String)>
		t();
	//   45   89:aload_0         
	//   46   90:invokevirtual   #183 <Method void t()>
	//   47   93:return          
	}

	public bd(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #186 <Method void OfflineMapCity(Parcel)>
		a = ((ch) (new cj(6, this)));
	//    3    5:aload_0         
	//    4    6:new             #51  <Class cj>
	//    5    9:dup             
	//    6   10:bipush          6
	//    7   12:aload_0         
	//    8   13:invokespecial   #54  <Method void cj(int, bd)>
	//    9   16:putfield        #56  <Field ch a>
		b = ((ch) (new cq(2, this)));
	//   10   19:aload_0         
	//   11   20:new             #58  <Class cq>
	//   12   23:dup             
	//   13   24:iconst_2        
	//   14   25:aload_0         
	//   15   26:invokespecial   #59  <Method void cq(int, bd)>
	//   16   29:putfield        #61  <Field ch b>
		c = ((ch) (new cm(0, this)));
	//   17   32:aload_0         
	//   18   33:new             #63  <Class cm>
	//   19   36:dup             
	//   20   37:iconst_0        
	//   21   38:aload_0         
	//   22   39:invokespecial   #64  <Method void cm(int, bd)>
	//   23   42:putfield        #66  <Field ch c>
		d = ((ch) (new co(3, this)));
	//   24   45:aload_0         
	//   25   46:new             #68  <Class co>
	//   26   49:dup             
	//   27   50:iconst_3        
	//   28   51:aload_0         
	//   29   52:invokespecial   #69  <Method void co(int, bd)>
	//   30   55:putfield        #71  <Field ch d>
		e = ((ch) (new cp(1, this)));
	//   31   58:aload_0         
	//   32   59:new             #73  <Class cp>
	//   33   62:dup             
	//   34   63:iconst_1        
	//   35   64:aload_0         
	//   36   65:invokespecial   #74  <Method void cp(int, bd)>
	//   37   68:putfield        #76  <Field ch e>
		f = ((ch) (new ci(4, this)));
	//   38   71:aload_0         
	//   39   72:new             #78  <Class ci>
	//   40   75:dup             
	//   41   76:iconst_4        
	//   42   77:aload_0         
	//   43   78:invokespecial   #79  <Method void ci(int, bd)>
	//   44   81:putfield        #81  <Field ch f>
		g = ((ch) (new cn(7, this)));
	//   45   84:aload_0         
	//   46   85:new             #83  <Class cn>
	//   47   88:dup             
	//   48   89:bipush          7
	//   49   91:aload_0         
	//   50   92:invokespecial   #84  <Method void cn(int, bd)>
	//   51   95:putfield        #86  <Field ch g>
		h = ((ch) (new ck(-1, this)));
	//   52   98:aload_0         
	//   53   99:new             #88  <Class ck>
	//   54  102:dup             
	//   55  103:iconst_m1       
	//   56  104:aload_0         
	//   57  105:invokespecial   #89  <Method void ck(int, bd)>
	//   58  108:putfield        #91  <Field ch h>
		i = ((ch) (new ck(101, this)));
	//   59  111:aload_0         
	//   60  112:new             #88  <Class ck>
	//   61  115:dup             
	//   62  116:bipush          101
	//   63  118:aload_0         
	//   64  119:invokespecial   #89  <Method void ck(int, bd)>
	//   65  122:putfield        #93  <Field ch i>
		j = ((ch) (new ck(102, this)));
	//   66  125:aload_0         
	//   67  126:new             #88  <Class ck>
	//   68  129:dup             
	//   69  130:bipush          102
	//   70  132:aload_0         
	//   71  133:invokespecial   #89  <Method void ck(int, bd)>
	//   72  136:putfield        #95  <Field ch j>
		k = ((ch) (new ck(103, this)));
	//   73  139:aload_0         
	//   74  140:new             #88  <Class ck>
	//   75  143:dup             
	//   76  144:bipush          103
	//   77  146:aload_0         
	//   78  147:invokespecial   #89  <Method void ck(int, bd)>
	//   79  150:putfield        #97  <Field ch k>
		p = null;
	//   80  153:aload_0         
	//   81  154:aconst_null     
	//   82  155:putfield        #99  <Field String p>
		q = "";
	//   83  158:aload_0         
	//   84  159:ldc1            #101 <String "">
	//   85  161:putfield        #103 <Field String q>
		n = false;
	//   86  164:aload_0         
	//   87  165:iconst_0        
	//   88  166:putfield        #105 <Field boolean n>
		r = 0L;
	//   89  169:aload_0         
	//   90  170:lconst_0        
	//   91  171:putfield        #107 <Field long r>
		q = parcel.readString();
	//   92  174:aload_0         
	//   93  175:aload_1         
	//   94  176:invokevirtual   #191 <Method String Parcel.readString()>
	//   95  179:putfield        #103 <Field String q>
	//   96  182:return          
	}

	static long a(bd bd1)
	{
		return bd1.r;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field long r>
	//    2    4:lreturn         
	}

	static long a(bd bd1, long l1)
	{
		bd1.r = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #107 <Field long r>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	private void a(File file, File file1, String s1)
	{
		(new bv()).a(file, file1, -1L, cb.a(file), new bv.a(s1, file) {

			public void a(String s2, String s3)
			{
			//    0    0:return          
			}

			public void a(String s2, String s3, float f1)
			{
				int i1 = c.getcompleteCode();
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field bd c>
			//    2    4:invokevirtual   #34  <Method int bd.getcompleteCode()>
			//    3    7:istore          4
				int j1 = (int)((double)f1 * 0.39000000000000001D + 60D);
			//    4    9:fload_3         
			//    5   10:f2d             
			//    6   11:ldc2w           #35  <Double 0.39000000000000001D>
			//    7   14:dmul            
			//    8   15:ldc2w           #37  <Double 60D>
			//    9   18:dadd            
			//   10   19:d2i             
			//   11   20:istore          5
				if(j1 - i1 > 0 && System.currentTimeMillis() - bd.a(c) > 1000L)
			//*  12   22:iload           5
			//*  13   24:iload           4
			//*  14   26:isub            
			//*  15   27:ifle            68
			//*  16   30:invokestatic    #44  <Method long System.currentTimeMillis()>
			//*  17   33:aload_0         
			//*  18   34:getfield        #20  <Field bd c>
			//*  19   37:invokestatic    #47  <Method long bd.a(bd)>
			//*  20   40:lsub            
			//*  21   41:ldc2w           #48  <Long 1000L>
			//*  22   44:lcmp            
			//*  23   45:ifle            68
				{
					c.setCompleteCode(j1);
			//   24   48:aload_0         
			//   25   49:getfield        #20  <Field bd c>
			//   26   52:iload           5
			//   27   54:invokevirtual   #53  <Method void bd.setCompleteCode(int)>
					bd.a(c, System.currentTimeMillis());
			//   28   57:aload_0         
			//   29   58:getfield        #20  <Field bd c>
			//   30   61:invokestatic    #44  <Method long System.currentTimeMillis()>
			//   31   64:invokestatic    #56  <Method long bd.a(bd, long)>
			//   32   67:pop2            
				}
			//   33   68:return          
			}

			public void a(String s2, String s3, int i1)
			{
				c.l.a(c.k.b());
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field bd c>
			//    2    4:getfield        #61  <Field ch bd.l>
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field bd c>
			//    5   11:getfield        #64  <Field ch bd.k>
			//    6   14:invokevirtual   #68  <Method int ch.b()>
			//    7   17:invokevirtual   #70  <Method void ch.a(int)>
			//    8   20:return          
			}

			public void b(String s2, String s3)
			{
				boolean flag = (new File(a)).delete();
			//    0    0:new             #74  <Class File>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field String a>
			//    4    8:invokespecial   #77  <Method void File(String)>
			//    5   11:invokevirtual   #81  <Method boolean File.delete()>
			//    6   14:istore_3        
				if(!flag)
			//*   7   15:iload_3         
			//*   8   16:ifne            20
					return;
			//    9   19:return          
				try
				{
					cb.b(b);
			//   10   20:aload_0         
			//   11   21:getfield        #24  <Field File b>
			//   12   24:invokestatic    #86  <Method boolean cb.b(File)>
			//   13   27:pop             
					c.setCompleteCode(100);
			//   14   28:aload_0         
			//   15   29:getfield        #20  <Field bd c>
			//   16   32:bipush          100
			//   17   34:invokevirtual   #53  <Method void bd.setCompleteCode(int)>
					c.l.g();
			//   18   37:aload_0         
			//   19   38:getfield        #20  <Field bd c>
			//   20   41:getfield        #61  <Field ch bd.l>
			//   21   44:invokevirtual   #89  <Method void ch.g()>
					return;
			//   22   47:return          
				}
				// Misplaced declaration of an exception variable
				catch(String s2)
			//*  23   48:astore_1        
				{
					c.l.a(c.k.b());
			//   24   49:aload_0         
			//   25   50:getfield        #20  <Field bd c>
			//   26   53:getfield        #61  <Field ch bd.l>
			//   27   56:aload_0         
			//   28   57:getfield        #20  <Field bd c>
			//   29   60:getfield        #64  <Field ch bd.k>
			//   30   63:invokevirtual   #68  <Method int ch.b()>
			//   31   66:invokevirtual   #70  <Method void ch.a(int)>
				}
				return;
			//   32   69:return          
			}

			final String a;
			final File b;
			final bd c;

			
			{
				c = bd.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field bd c>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String a>
				b = file;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field File b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:new             #196 <Class bv>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void bv()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:ldc2w           #198 <Long -1L>
	//    6   12:aload_1         
	//    7   13:invokestatic    #204 <Method long cb.a(File)>
	//    8   16:new             #10  <Class bd$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:aload_1         
	//   13   23:invokespecial   #207 <Method void bd$1(bd, String, File)>
	//   14   26:invokevirtual   #210 <Method long bv.a(File, File, long, long, bv$a)>
	//   15   29:pop2            
	//   16   30:return          
	}

	public String A()
	{
		return getAdcode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #212 <Method String getAdcode()>
	//    2    4:areturn         
	}

	public String B()
	{
		return u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #216 <Method String u()>
	//    2    4:areturn         
	}

	public String C()
	{
		return v();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #220 <Method String v()>
	//    2    4:areturn         
	}

	public String a()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String q>
	//    2    4:areturn         
	}

	public void a(int i1)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    11: default 100
	//	               -1: 103
	//	               0: 114
	//	               1: 125
	//	               2: 136
	//	               3: 147
	//	               4: 158
	//	               6: 169
	//	               7: 180
	//	               101: 191
	//	               102: 202
	//	               103: 213
	//*   2  100:goto            224
		case -1: 
			l = h;
	//    3  103:aload_0         
	//    4  104:aload_0         
	//    5  105:getfield        #91  <Field ch h>
	//    6  108:putfield        #222 <Field ch l>
			break;
	//    7  111:goto            236

		case 0: // '\0'
			l = c;
	//    8  114:aload_0         
	//    9  115:aload_0         
	//   10  116:getfield        #66  <Field ch c>
	//   11  119:putfield        #222 <Field ch l>
			break;
	//   12  122:goto            236

		case 1: // '\001'
			l = e;
	//   13  125:aload_0         
	//   14  126:aload_0         
	//   15  127:getfield        #76  <Field ch e>
	//   16  130:putfield        #222 <Field ch l>
			break;
	//   17  133:goto            236

		case 2: // '\002'
			l = b;
	//   18  136:aload_0         
	//   19  137:aload_0         
	//   20  138:getfield        #61  <Field ch b>
	//   21  141:putfield        #222 <Field ch l>
			break;
	//   22  144:goto            236

		case 3: // '\003'
			l = d;
	//   23  147:aload_0         
	//   24  148:aload_0         
	//   25  149:getfield        #71  <Field ch d>
	//   26  152:putfield        #222 <Field ch l>
			break;
	//   27  155:goto            236

		case 4: // '\004'
			l = f;
	//   28  158:aload_0         
	//   29  159:aload_0         
	//   30  160:getfield        #81  <Field ch f>
	//   31  163:putfield        #222 <Field ch l>
			break;
	//   32  166:goto            236

		case 6: // '\006'
			l = a;
	//   33  169:aload_0         
	//   34  170:aload_0         
	//   35  171:getfield        #56  <Field ch a>
	//   36  174:putfield        #222 <Field ch l>
			break;
	//   37  177:goto            236

		case 7: // '\007'
			l = g;
	//   38  180:aload_0         
	//   39  181:aload_0         
	//   40  182:getfield        #86  <Field ch g>
	//   41  185:putfield        #222 <Field ch l>
			break;
	//   42  188:goto            236

		case 101: // 'e'
			l = i;
	//   43  191:aload_0         
	//   44  192:aload_0         
	//   45  193:getfield        #93  <Field ch i>
	//   46  196:putfield        #222 <Field ch l>
			break;
	//   47  199:goto            236

		case 102: // 'f'
			l = j;
	//   48  202:aload_0         
	//   49  203:aload_0         
	//   50  204:getfield        #95  <Field ch j>
	//   51  207:putfield        #222 <Field ch l>
			break;
	//   52  210:goto            236

		case 103: // 'g'
			l = k;
	//   53  213:aload_0         
	//   54  214:aload_0         
	//   55  215:getfield        #97  <Field ch k>
	//   56  218:putfield        #222 <Field ch l>
			break;
	//   57  221:goto            236

		default:
			if(i1 < 0)
	//*  58  224:iload_1         
	//*  59  225:ifge            236
				l = h;
	//   60  228:aload_0         
	//   61  229:aload_0         
	//   62  230:getfield        #91  <Field ch h>
	//   63  233:putfield        #222 <Field ch l>
			break;
		}
		setState(i1);
	//   64  236:aload_0         
	//   65  237:iload_1         
	//   66  238:invokevirtual   #136 <Method void setState(int)>
	//   67  241:return          
	}

	public void a(long l1)
	{
		long l2 = System.currentTimeMillis();
	//    0    0:invokestatic    #227 <Method long System.currentTimeMillis()>
	//    1    3:lstore_3        
		if(l2 - r > 500L)
	//*   2    4:lload_3         
	//*   3    5:aload_0         
	//*   4    6:getfield        #107 <Field long r>
	//*   5    9:lsub            
	//*   6   10:ldc2w           #228 <Long 500L>
	//*   7   13:lcmp            
	//*   8   14:ifle            41
		{
			if((int)l1 > getcompleteCode())
	//*   9   17:lload_1         
	//*  10   18:l2i             
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #230 <Method int getcompleteCode()>
	//*  13   23:icmple          36
			{
				setCompleteCode((int)l1);
	//   14   26:aload_0         
	//   15   27:lload_1         
	//   16   28:l2i             
	//   17   29:invokevirtual   #142 <Method void setCompleteCode(int)>
				d();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #232 <Method void d()>
			}
			r = l2;
	//   20   36:aload_0         
	//   21   37:lload_3         
	//   22   38:putfield        #107 <Field long r>
		}
	//   23   41:return          
	}

	public void a(long l1, long l2)
	{
		l1 = (100L * l2) / l1;
	//    0    0:ldc2w           #234 <Long 100L>
	//    1    3:lload_3         
	//    2    4:lmul            
	//    3    5:lload_1         
	//    4    6:ldiv            
	//    5    7:lstore_1        
		if((int)l1 != getcompleteCode())
	//*   6    8:lload_1         
	//*   7    9:l2i             
	//*   8   10:aload_0         
	//*   9   11:invokevirtual   #230 <Method int getcompleteCode()>
	//*  10   14:icmpeq          27
		{
			setCompleteCode((int)l1);
	//   11   17:aload_0         
	//   12   18:lload_1         
	//   13   19:l2i             
	//   14   20:invokevirtual   #142 <Method void setCompleteCode(int)>
			d();
	//   15   23:aload_0         
	//   16   24:invokevirtual   #232 <Method void d()>
		}
	//   17   27:return          
	}

	public void a(ce.a a1)
	{
		int i1 = 6;
	//    0    0:bipush          6
	//    1    2:istore_2        
		static class _cls3
		{

			static final int a[];

			static 
			{
				a = new int[ce.a.values().length];
			//    0    0:invokestatic    #18  <Method ce$a[] ce$a.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[ce.a.a.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #23  <Field ce$a ce$a.a>
			//    6   15:invokevirtual   #27  <Method int ce$a.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					a[ce.a.c.ordinal()] = 2;
			//   11   24:getstatic       #20  <Field int[] a>
			//   12   27:getstatic       #30  <Field ce$a ce$a.c>
			//   13   30:invokevirtual   #27  <Method int ce$a.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				try
				{
					a[ce.a.b.ordinal()] = 3;
			//   18   39:getstatic       #20  <Field int[] a>
			//   19   42:getstatic       #33  <Field ce$a ce$a.b>
			//   20   45:invokevirtual   #27  <Method int ce$a.ordinal()>
			//   21   48:iconst_3        
			//   22   49:iastore         
			//   23   50:return          
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls3.a[a1.ordinal()])
	//*   2    3:getstatic       #239 <Field int[] bd$3.a>
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #244 <Method int ce$a.ordinal()>
	//*   5   10:iaload          
		{
	//*   6   11:tableswitch     1 3: default 36
	//	               1 39
	//	               2 50
	//	               3 61
	//*   7   36:goto            69
		case 1: // '\001'
			i1 = j.b();
	//    8   39:aload_0         
	//    9   40:getfield        #95  <Field ch j>
	//   10   43:invokevirtual   #248 <Method int ch.b()>
	//   11   46:istore_2        
			break;

	//*  12   47:goto            69
		case 2: // '\002'
			i1 = k.b();
	//   13   50:aload_0         
	//   14   51:getfield        #97  <Field ch k>
	//   15   54:invokevirtual   #248 <Method int ch.b()>
	//   16   57:istore_2        
			break;

	//*  17   58:goto            69
		case 3: // '\003'
			i1 = i.b();
	//   18   61:aload_0         
	//   19   62:getfield        #93  <Field ch i>
	//   20   65:invokevirtual   #248 <Method int ch.b()>
	//   21   68:istore_2        
			break;
		}
		if(!((Object) (l)).equals(((Object) (c))) && !((Object) (l)).equals(((Object) (b))))
	//*  22   69:aload_0         
	//*  23   70:getfield        #222 <Field ch l>
	//*  24   73:aload_0         
	//*  25   74:getfield        #66  <Field ch c>
	//*  26   77:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*  27   80:ifne            98
	//*  28   83:aload_0         
	//*  29   84:getfield        #222 <Field ch l>
	//*  30   87:aload_0         
	//*  31   88:getfield        #61  <Field ch b>
	//*  32   91:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*  33   94:ifne            98
		{
			return;
	//   34   97:return          
		} else
		{
			l.a(i1);
	//   35   98:aload_0         
	//   36   99:getfield        #222 <Field ch l>
	//   37  102:iload_2         
	//   38  103:invokevirtual   #255 <Method void ch.a(int)>
			return;
	//   39  106:return          
		}
	}

	public void a(ch ch1)
	{
		l = ch1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #222 <Field ch l>
		setState(ch1.b());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #248 <Method int ch.b()>
	//    6   10:invokevirtual   #136 <Method void setState(int)>
	//    7   13:return          
	}

	public void a(String s1)
	{
		q = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field String q>
	//    3    5:return          
	}

	public ch b(int i1)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     101 103: default 28
	//	               101 31
	//	               102 36
	//	               103 41
	//*   2   28:goto            46
		case 101: // 'e'
			return i;
	//    3   31:aload_0         
	//    4   32:getfield        #93  <Field ch i>
	//    5   35:areturn         

		case 102: // 'f'
			return j;
	//    6   36:aload_0         
	//    7   37:getfield        #95  <Field ch j>
	//    8   40:areturn         

		case 103: // 'g'
			return k;
	//    9   41:aload_0         
	//   10   42:getfield        #97  <Field ch k>
	//   11   45:areturn         
		}
		return h;
	//   12   46:aload_0         
	//   13   47:getfield        #91  <Field ch h>
	//   14   50:areturn         
	}

	public String b()
	{
		return getUrl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #258 <Method String getUrl()>
	//    2    4:areturn         
	}

	public void b(String s1)
	{
		((Object) (l)).equals(((Object) (e)));
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field ch l>
	//    2    4:aload_0         
	//    3    5:getfield        #76  <Field ch e>
	//    4    8:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//    5   11:pop             
		q = s1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #103 <Field String q>
		s1 = u();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #216 <Method String u()>
	//   11   21:astore_1        
		Object obj = ((Object) (v()));
	//   12   22:aload_0         
	//   13   23:invokevirtual   #220 <Method String v()>
	//   14   26:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s1))) || TextUtils.isEmpty(((CharSequence) (obj))))
	//*  15   27:aload_1         
	//*  16   28:invokestatic    #264 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   31:ifne            41
	//*  18   34:aload_2         
	//*  19   35:invokestatic    #264 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   38:ifeq            46
		{
			r();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #266 <Method void r()>
			return;
	//   23   45:return          
		}
		obj = ((Object) (new File((new StringBuilder()).append(((String) (obj))).append("/").toString())));
	//   24   46:new             #268 <Class File>
	//   25   49:dup             
	//   26   50:new             #270 <Class StringBuilder>
	//   27   53:dup             
	//   28   54:invokespecial   #271 <Method void StringBuilder()>
	//   29   57:aload_2         
	//   30   58:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:ldc2            #277 <String "/">
	//   32   64:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   34   70:invokespecial   #282 <Method void File(String)>
	//   35   73:astore_2        
		File file = new File((new StringBuilder()).append(fd.a(m)).append(File.separator).append("map/").toString());
	//   36   74:new             #268 <Class File>
	//   37   77:dup             
	//   38   78:new             #270 <Class StringBuilder>
	//   39   81:dup             
	//   40   82:invokespecial   #271 <Method void StringBuilder()>
	//   41   85:aload_0         
	//   42   86:getfield        #109 <Field Context m>
	//   43   89:invokestatic    #287 <Method String fd.a(Context)>
	//   44   92:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   45   95:getstatic       #290 <Field String File.separator>
	//   46   98:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   47  101:ldc2            #292 <String "map/">
	//   48  104:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   49  107:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   50  110:invokespecial   #282 <Method void File(String)>
	//   51  113:astore_3        
		File file1 = new File(fd.a(m));
	//   52  114:new             #268 <Class File>
	//   53  117:dup             
	//   54  118:aload_0         
	//   55  119:getfield        #109 <Field Context m>
	//   56  122:invokestatic    #287 <Method String fd.a(Context)>
	//   57  125:invokespecial   #282 <Method void File(String)>
	//   58  128:astore          4
		if(!file1.exists() && !file1.mkdir())
	//*  59  130:aload           4
	//*  60  132:invokevirtual   #296 <Method boolean File.exists()>
	//*  61  135:ifne            147
	//*  62  138:aload           4
	//*  63  140:invokevirtual   #299 <Method boolean File.mkdir()>
	//*  64  143:ifne            147
			return;
	//   65  146:return          
		if(!file.exists() && !file.mkdir())
	//*  66  147:aload_3         
	//*  67  148:invokevirtual   #296 <Method boolean File.exists()>
	//*  68  151:ifne            162
	//*  69  154:aload_3         
	//*  70  155:invokevirtual   #299 <Method boolean File.mkdir()>
	//*  71  158:ifne            162
		{
			return;
	//   72  161:return          
		} else
		{
			a(((File) (obj)), file, s1);
	//   73  162:aload_0         
	//   74  163:aload_2         
	//   75  164:aload_3         
	//   76  165:aload_1         
	//   77  166:invokespecial   #301 <Method void a(File, File, String)>
			return;
	//   78  169:return          
		}
	}

	public ch c()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field ch l>
	//    2    4:areturn         
	}

	public void d()
	{
		be be1 = be.a(m);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Context m>
	//    2    4:invokestatic    #307 <Method be be.a(Context)>
	//    3    7:astore_1        
		if(be1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			be1.c(this);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #310 <Method void be.c(bd)>
	//    9   17:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void e()
	{
		be be1 = be.a(m);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Context m>
	//    2    4:invokestatic    #307 <Method be be.a(Context)>
	//    3    7:astore_1        
		if(be1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
		{
			be1.e(this);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #313 <Method void be.e(bd)>
			d();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #232 <Method void d()>
		}
	//   11   21:return          
	}

	public void f()
	{
		cb.a((new StringBuilder()).append("CityOperation current State==>").append(c().b()).toString());
	//    0    0:new             #270 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #271 <Method void StringBuilder()>
	//    3    7:ldc2            #315 <String "CityOperation current State==>">
	//    4   10:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #317 <Method ch c()>
	//    7   17:invokevirtual   #248 <Method int ch.b()>
	//    8   20:invokevirtual   #320 <Method StringBuilder StringBuilder.append(int)>
	//    9   23:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   10   26:invokestatic    #322 <Method void cb.a(String)>
		if(((Object) (l)).equals(((Object) (d))))
	//*  11   29:aload_0         
	//*  12   30:getfield        #222 <Field ch l>
	//*  13   33:aload_0         
	//*  14   34:getfield        #71  <Field ch d>
	//*  15   37:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*  16   40:ifeq            51
		{
			l.d();
	//   17   43:aload_0         
	//   18   44:getfield        #222 <Field ch l>
	//   19   47:invokevirtual   #323 <Method void ch.d()>
			return;
	//   20   50:return          
		}
		if(((Object) (l)).equals(((Object) (c))))
	//*  21   51:aload_0         
	//*  22   52:getfield        #222 <Field ch l>
	//*  23   55:aload_0         
	//*  24   56:getfield        #66  <Field ch c>
	//*  25   59:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*  26   62:ifeq            73
		{
			l.e();
	//   27   65:aload_0         
	//   28   66:getfield        #222 <Field ch l>
	//   29   69:invokevirtual   #325 <Method void ch.e()>
			return;
	//   30   72:return          
		}
		if(((Object) (l)).equals(((Object) (g))) || ((Object) (l)).equals(((Object) (h))))
	//*  31   73:aload_0         
	//*  32   74:getfield        #222 <Field ch l>
	//*  33   77:aload_0         
	//*  34   78:getfield        #86  <Field ch g>
	//*  35   81:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*  36   84:ifne            101
	//*  37   87:aload_0         
	//*  38   88:getfield        #222 <Field ch l>
	//*  39   91:aload_0         
	//*  40   92:getfield        #91  <Field ch h>
	//*  41   95:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*  42   98:ifeq            111
		{
			k();
	//   43  101:aload_0         
	//   44  102:invokevirtual   #327 <Method void k()>
			n = true;
	//   45  105:aload_0         
	//   46  106:iconst_1        
	//   47  107:putfield        #105 <Field boolean n>
			return;
	//   48  110:return          
		}
		if(((Object) (l)).equals(((Object) (j))) || ((Object) (l)).equals(((Object) (i))) || l.a(k))
	//*  49  111:aload_0         
	//*  50  112:getfield        #222 <Field ch l>
	//*  51  115:aload_0         
	//*  52  116:getfield        #95  <Field ch j>
	//*  53  119:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*  54  122:ifne            153
	//*  55  125:aload_0         
	//*  56  126:getfield        #222 <Field ch l>
	//*  57  129:aload_0         
	//*  58  130:getfield        #93  <Field ch i>
	//*  59  133:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*  60  136:ifne            153
	//*  61  139:aload_0         
	//*  62  140:getfield        #222 <Field ch l>
	//*  63  143:aload_0         
	//*  64  144:getfield        #97  <Field ch k>
	//*  65  147:invokevirtual   #330 <Method boolean ch.a(ch)>
	//*  66  150:ifeq            161
		{
			l.c();
	//   67  153:aload_0         
	//   68  154:getfield        #222 <Field ch l>
	//   69  157:invokevirtual   #332 <Method void ch.c()>
			return;
	//   70  160:return          
		} else
		{
			c().h();
	//   71  161:aload_0         
	//   72  162:invokevirtual   #317 <Method ch c()>
	//   73  165:invokevirtual   #334 <Method void ch.h()>
			return;
	//   74  168:return          
		}
	}

	public void g()
	{
		l.e();
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field ch l>
	//    2    4:invokevirtual   #325 <Method void ch.e()>
	//    3    7:return          
	}

	public void h()
	{
		l.a(k.b());
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field ch l>
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field ch k>
	//    4    8:invokevirtual   #248 <Method int ch.b()>
	//    5   11:invokevirtual   #255 <Method void ch.a(int)>
	//    6   14:return          
	}

	public void i()
	{
		l.a();
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field ch l>
	//    2    4:invokevirtual   #336 <Method void ch.a()>
		if(n)
	//*   3    7:aload_0         
	//*   4    8:getfield        #105 <Field boolean n>
	//*   5   11:ifeq            21
			l.h();
	//    6   14:aload_0         
	//    7   15:getfield        #222 <Field ch l>
	//    8   18:invokevirtual   #334 <Method void ch.h()>
		n = false;
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:putfield        #105 <Field boolean n>
	//   12   26:return          
	}

	public void j()
	{
		((Object) (l)).equals(((Object) (f)));
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field ch l>
	//    2    4:aload_0         
	//    3    5:getfield        #81  <Field ch f>
	//    4    8:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//    5   11:pop             
		l.f();
	//    6   12:aload_0         
	//    7   13:getfield        #222 <Field ch l>
	//    8   16:invokevirtual   #338 <Method void ch.f()>
	//    9   19:return          
	}

	public void k()
	{
		be be1 = be.a(m);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Context m>
	//    2    4:invokestatic    #307 <Method be be.a(Context)>
	//    3    7:astore_1        
		if(be1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			be1.a(this);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #340 <Method void be.a(bd)>
	//    9   17:return          
	}

	public void l()
	{
		be be1 = be.a(m);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Context m>
	//    2    4:invokestatic    #307 <Method be be.a(Context)>
	//    3    7:astore_1        
		if(be1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			be1.b(this);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #342 <Method void be.b(bd)>
	//    9   17:return          
	}

	public void m()
	{
		be be1 = be.a(m);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Context m>
	//    2    4:invokestatic    #307 <Method be be.a(Context)>
	//    3    7:astore_1        
		if(be1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			be1.d(this);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #344 <Method void be.d(bd)>
	//    9   17:return          
	}

	public void n()
	{
		r = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #107 <Field long r>
		if(!((Object) (l)).equals(((Object) (b))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #222 <Field ch l>
	//*   5    9:aload_0         
	//*   6   10:getfield        #61  <Field ch b>
	//*   7   13:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*   8   16:ifne            25
			cb.a("state must be waiting when download onStart");
	//    9   19:ldc2            #346 <String "state must be waiting when download onStart">
	//   10   22:invokestatic    #322 <Method void cb.a(String)>
		l.c();
	//   11   25:aload_0         
	//   12   26:getfield        #222 <Field ch l>
	//   13   29:invokevirtual   #332 <Method void ch.c()>
	//   14   32:return          
	}

	public void o()
	{
		if(!((Object) (l)).equals(((Object) (c))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #222 <Field ch l>
	//*   2    4:aload_0         
	//*   3    5:getfield        #66  <Field ch c>
	//*   4    8:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//*   5   11:ifne            20
			cb.a("state must be Loading when download onFinish");
	//    6   14:ldc2            #348 <String "state must be Loading when download onFinish">
	//    7   17:invokestatic    #322 <Method void cb.a(String)>
		l.g();
	//    8   20:aload_0         
	//    9   21:getfield        #222 <Field ch l>
	//   10   24:invokevirtual   #350 <Method void ch.g()>
	//   11   27:return          
	}

	public void p()
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #351 <Method void e()>
	//    2    4:return          
	}

	public void q()
	{
		r = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #107 <Field long r>
		setCompleteCode(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #142 <Method void setCompleteCode(int)>
		((Object) (l)).equals(((Object) (e)));
	//    6   10:aload_0         
	//    7   11:getfield        #222 <Field ch l>
	//    8   14:aload_0         
	//    9   15:getfield        #76  <Field ch e>
	//   10   18:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//   11   21:pop             
		l.c();
	//   12   22:aload_0         
	//   13   23:getfield        #222 <Field ch l>
	//   14   26:invokevirtual   #332 <Method void ch.c()>
	//   15   29:return          
	}

	public void r()
	{
		((Object) (l)).equals(((Object) (e)));
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field ch l>
	//    2    4:aload_0         
	//    3    5:getfield        #76  <Field ch e>
	//    4    8:invokevirtual   #254 <Method boolean Object.equals(Object)>
	//    5   11:pop             
		l.a(h.b());
	//    6   12:aload_0         
	//    7   13:getfield        #222 <Field ch l>
	//    8   16:aload_0         
	//    9   17:getfield        #91  <Field ch h>
	//   10   20:invokevirtual   #248 <Method int ch.b()>
	//   11   23:invokevirtual   #255 <Method void ch.a(int)>
	//   12   26:return          
	}

	public void s()
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #351 <Method void e()>
	//    2    4:return          
	}

	protected void t()
	{
		String s1 = be.a;
	//    0    0:getstatic       #354 <Field String be.a>
	//    1    3:astore_1        
		String s2 = cb.c(getUrl());
	//    2    4:aload_0         
	//    3    5:invokevirtual   #258 <Method String getUrl()>
	//    4    8:invokestatic    #357 <Method String cb.c(String)>
	//    5   11:astore_2        
		if(s2 != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          51
		{
			p = (new StringBuilder()).append(s1).append(s2).append(".zip").append(".tmp").toString();
	//    8   16:aload_0         
	//    9   17:new             #270 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #271 <Method void StringBuilder()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:ldc2            #359 <String ".zip">
	//   17   35:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:ldc2            #361 <String ".tmp">
	//   19   41:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   21   47:putfield        #99  <Field String p>
			return;
	//   22   50:return          
		} else
		{
			p = (new StringBuilder()).append(s1).append(getPinyin()).append(".zip").append(".tmp").toString();
	//   23   51:aload_0         
	//   24   52:new             #270 <Class StringBuilder>
	//   25   55:dup             
	//   26   56:invokespecial   #271 <Method void StringBuilder()>
	//   27   59:aload_1         
	//   28   60:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:aload_0         
	//   30   64:invokevirtual   #362 <Method String getPinyin()>
	//   31   67:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:ldc2            #359 <String ".zip">
	//   33   73:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   34   76:ldc2            #361 <String ".tmp">
	//   35   79:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   36   82:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   37   85:putfield        #99  <Field String p>
			return;
	//   38   88:return          
		}
	}

	public String u()
	{
		if(TextUtils.isEmpty(((CharSequence) (p))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field String p>
	//*   2    4:invokestatic    #264 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return p.substring(0, p.lastIndexOf("."));
	//    6   12:aload_0         
	//    7   13:getfield        #99  <Field String p>
	//    8   16:iconst_0        
	//    9   17:aload_0         
	//   10   18:getfield        #99  <Field String p>
	//   11   21:ldc2            #364 <String ".">
	//   12   24:invokevirtual   #370 <Method int String.lastIndexOf(String)>
	//   13   27:invokevirtual   #374 <Method String String.substring(int, int)>
	//   14   30:areturn         
	}

	public String v()
	{
		if(TextUtils.isEmpty(((CharSequence) (p))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field String p>
	//*   2    4:invokestatic    #264 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            12
		{
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		} else
		{
			String s1 = u();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #216 <Method String u()>
	//    8   16:astore_1        
			return s1.substring(0, s1.lastIndexOf('.'));
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:aload_1         
	//   12   20:bipush          46
	//   13   22:invokevirtual   #377 <Method int String.lastIndexOf(int)>
	//   14   25:invokevirtual   #374 <Method String String.substring(int, int)>
	//   15   28:areturn         
		}
	}

	public boolean w()
	{
		return (double)cb.a() >= (double)getSize() * 2.5D - (double)((long)getcompleteCode() * getSize()) ? false : false;
	//    0    0:invokestatic    #380 <Method long cb.a()>
	//    1    3:l2d             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #381 <Method long getSize()>
	//    4    8:l2d             
	//    5    9:ldc2w           #382 <Double 2.5D>
	//    6   12:dmul            
	//    7   13:aload_0         
	//    8   14:invokevirtual   #230 <Method int getcompleteCode()>
	//    9   17:i2l             
	//   10   18:aload_0         
	//   11   19:invokevirtual   #381 <Method long getSize()>
	//   12   22:lmul            
	//   13   23:l2d             
	//   14   24:dsub            
	//   15   25:dcmpg           
	//   16   26:ifge            31
	//   17   29:iconst_0        
	//   18   30:ireturn         
	//   19   31:iconst_0        
	//   20   32:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		super.writeToParcel(parcel, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #387 <Method void OfflineMapCity.writeToParcel(Parcel, int)>
		parcel.writeString(q);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #103 <Field String q>
	//    7   11:invokevirtual   #390 <Method void Parcel.writeString(String)>
	//    8   14:return          
	}

	public bo x()
	{
		setState(l.b());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #222 <Field ch l>
	//    3    5:invokevirtual   #248 <Method int ch.b()>
	//    4    8:invokevirtual   #136 <Method void setState(int)>
		bo bo1 = new bo(((OfflineMapCity) (this)), m);
	//    5   11:new             #394 <Class bo>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #109 <Field Context m>
	//   10   20:invokespecial   #397 <Method void bo(OfflineMapCity, Context)>
	//   11   23:astore_1        
		bo1.a(a());
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #399 <Method String a()>
	//   15   29:invokevirtual   #400 <Method void bo.a(String)>
		cb.a((new StringBuilder()).append("vMapFileNames: ").append(a()).toString());
	//   16   32:new             #270 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #271 <Method void StringBuilder()>
	//   19   39:ldc2            #402 <String "vMapFileNames: ">
	//   20   42:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #399 <Method String a()>
	//   23   49:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   25   55:invokestatic    #322 <Method void cb.a(String)>
		return bo1;
	//   26   58:aload_1         
	//   27   59:areturn         
	}

	public boolean y()
	{
		return w();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #405 <Method boolean w()>
	//    2    4:ireturn         
	}

	public String z()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #408 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #409 <Method void StringBuffer()>
	//    3    7:astore_1        
		String s1 = cb.c(getUrl());
	//    4    8:aload_0         
	//    5    9:invokevirtual   #258 <Method String getUrl()>
	//    6   12:invokestatic    #357 <Method String cb.c(String)>
	//    7   15:astore_2        
		if(s1 != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          29
			stringbuffer.append(s1);
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #412 <Method StringBuffer StringBuffer.append(String)>
	//   13   25:pop             
		else
	//*  14   26:goto            38
			stringbuffer.append(getPinyin());
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #362 <Method String getPinyin()>
	//   18   34:invokevirtual   #412 <Method StringBuffer StringBuffer.append(String)>
	//   19   37:pop             
		stringbuffer.append(".zip");
	//   20   38:aload_1         
	//   21   39:ldc2            #359 <String ".zip">
	//   22   42:invokevirtual   #412 <Method StringBuffer StringBuffer.append(String)>
	//   23   45:pop             
		return stringbuffer.toString();
	//   24   46:aload_1         
	//   25   47:invokevirtual   #413 <Method String StringBuffer.toString()>
	//   26   50:areturn         
	}

	public static final android.os.Parcelable.Creator o = new android.os.Parcelable.Creator() {

		public bd a(Parcel parcel)
		{
			return new bd(parcel);
		//    0    0:new             #9   <Class bd>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void bd(Parcel)>
		//    4    8:areturn         
		}

		public bd[] a(int i1)
		{
			return new bd[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       bd[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method bd a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method bd[] a(int)>
		//    3    5:areturn         
		}

	}
;
	public final ch a;
	public final ch b;
	public final ch c;
	public final ch d;
	public final ch e;
	public final ch f;
	public final ch g;
	public final ch h;
	public final ch i;
	public final ch j;
	public final ch k;
	ch l;
	Context m;
	boolean n;
	private String p;
	private String q;
	private long r;

	static 
	{
	//    0    0:new             #12  <Class bd$2>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void bd$2()>
	//    3    7:putstatic       #46  <Field android.os.Parcelable$Creator o>
	//*   4   10:return          
	}
}
