// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			auk

public final class awq extends auk
{

	public awq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void auk()>
		a = "E";
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <String "E">
	//    4    7:putfield        #19  <Field String a>
		b = -1L;
	//    5   10:aload_0         
	//    6   11:ldc2w           #20  <Long -1L>
	//    7   14:putfield        #23  <Field long b>
		c = "E";
	//    8   17:aload_0         
	//    9   18:ldc1            #17  <String "E">
	//   10   20:putfield        #25  <Field String c>
		d = "E";
	//   11   23:aload_0         
	//   12   24:ldc1            #17  <String "E">
	//   13   26:putfield        #27  <Field String d>
		e = "E";
	//   14   29:aload_0         
	//   15   30:ldc1            #17  <String "E">
	//   16   32:putfield        #29  <Field String e>
	//   17   35:return          
	}

	public awq(String s)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void awq()>
		((auk)this).a(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #34  <Method void auk.a(String)>
	//    5    9:return          
	}

	protected final HashMap a()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #37  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put(((Object) (Integer.valueOf(0))), ((Object) (a)));
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field String a>
	//    9   17:invokevirtual   #48  <Method Object HashMap.put(Object, Object)>
	//   10   20:pop             
		hashmap.put(((Object) (Integer.valueOf(4))), ((Object) (e)));
	//   11   21:aload_1         
	//   12   22:iconst_4        
	//   13   23:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   14   26:aload_0         
	//   15   27:getfield        #29  <Field String e>
	//   16   30:invokevirtual   #48  <Method Object HashMap.put(Object, Object)>
	//   17   33:pop             
		hashmap.put(((Object) (Integer.valueOf(3))), ((Object) (d)));
	//   18   34:aload_1         
	//   19   35:iconst_3        
	//   20   36:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   21   39:aload_0         
	//   22   40:getfield        #27  <Field String d>
	//   23   43:invokevirtual   #48  <Method Object HashMap.put(Object, Object)>
	//   24   46:pop             
		hashmap.put(((Object) (Integer.valueOf(2))), ((Object) (c)));
	//   25   47:aload_1         
	//   26   48:iconst_2        
	//   27   49:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   28   52:aload_0         
	//   29   53:getfield        #25  <Field String c>
	//   30   56:invokevirtual   #48  <Method Object HashMap.put(Object, Object)>
	//   31   59:pop             
		hashmap.put(((Object) (Integer.valueOf(1))), ((Object) (Long.valueOf(b))));
	//   32   60:aload_1         
	//   33   61:iconst_1        
	//   34   62:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   35   65:aload_0         
	//   36   66:getfield        #23  <Field long b>
	//   37   69:invokestatic    #53  <Method Long Long.valueOf(long)>
	//   38   72:invokevirtual   #48  <Method Object HashMap.put(Object, Object)>
	//   39   75:pop             
		return hashmap;
	//   40   76:aload_1         
	//   41   77:areturn         
	}

	protected final void a(String s)
	{
		HashMap hashmap = b(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #56  <Method HashMap b(String)>
	//    2    4:astore          4
		if(hashmap != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          195
		{
			if(hashmap.get(((Object) (Integer.valueOf(0)))) == null)
	//*   5   11:aload           4
	//*   6   13:iconst_0        
	//*   7   14:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//*   8   17:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//*   9   20:ifnonnull       29
				s = "E";
	//   10   23:ldc1            #17  <String "E">
	//   11   25:astore_1        
			else
	//*  12   26:goto            42
				s = (String)hashmap.get(((Object) (Integer.valueOf(0))));
	//   13   29:aload           4
	//   14   31:iconst_0        
	//   15   32:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   16   35:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   17   38:checkcast       #62  <Class String>
	//   18   41:astore_1        
			a = s;
	//   19   42:aload_0         
	//   20   43:aload_1         
	//   21   44:putfield        #19  <Field String a>
			long l;
			if(hashmap.get(((Object) (Integer.valueOf(1)))) == null)
	//*  22   47:aload           4
	//*  23   49:iconst_1        
	//*  24   50:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//*  25   53:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//*  26   56:ifnonnull       66
				l = -1L;
	//   27   59:ldc2w           #20  <Long -1L>
	//   28   62:lstore_2        
			else
	//*  29   63:goto            82
				l = ((Long)hashmap.get(((Object) (Integer.valueOf(1))))).longValue();
	//   30   66:aload           4
	//   31   68:iconst_1        
	//   32   69:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   33   72:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   34   75:checkcast       #50  <Class Long>
	//   35   78:invokevirtual   #66  <Method long Long.longValue()>
	//   36   81:lstore_2        
			b = l;
	//   37   82:aload_0         
	//   38   83:lload_2         
	//   39   84:putfield        #23  <Field long b>
			if(hashmap.get(((Object) (Integer.valueOf(2)))) == null)
	//*  40   87:aload           4
	//*  41   89:iconst_2        
	//*  42   90:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//*  43   93:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//*  44   96:ifnonnull       105
				s = "E";
	//   45   99:ldc1            #17  <String "E">
	//   46  101:astore_1        
			else
	//*  47  102:goto            118
				s = (String)hashmap.get(((Object) (Integer.valueOf(2))));
	//   48  105:aload           4
	//   49  107:iconst_2        
	//   50  108:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   51  111:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   52  114:checkcast       #62  <Class String>
	//   53  117:astore_1        
			c = s;
	//   54  118:aload_0         
	//   55  119:aload_1         
	//   56  120:putfield        #25  <Field String c>
			if(hashmap.get(((Object) (Integer.valueOf(3)))) == null)
	//*  57  123:aload           4
	//*  58  125:iconst_3        
	//*  59  126:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//*  60  129:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//*  61  132:ifnonnull       141
				s = "E";
	//   62  135:ldc1            #17  <String "E">
	//   63  137:astore_1        
			else
	//*  64  138:goto            154
				s = (String)hashmap.get(((Object) (Integer.valueOf(3))));
	//   65  141:aload           4
	//   66  143:iconst_3        
	//   67  144:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   68  147:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   69  150:checkcast       #62  <Class String>
	//   70  153:astore_1        
			d = s;
	//   71  154:aload_0         
	//   72  155:aload_1         
	//   73  156:putfield        #27  <Field String d>
			if(hashmap.get(((Object) (Integer.valueOf(4)))) == null)
	//*  74  159:aload           4
	//*  75  161:iconst_4        
	//*  76  162:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//*  77  165:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//*  78  168:ifnonnull       177
				s = "E";
	//   79  171:ldc1            #17  <String "E">
	//   80  173:astore_1        
			else
	//*  81  174:goto            190
				s = (String)hashmap.get(((Object) (Integer.valueOf(4))));
	//   82  177:aload           4
	//   83  179:iconst_4        
	//   84  180:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   85  183:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   86  186:checkcast       #62  <Class String>
	//   87  189:astore_1        
			e = s;
	//   88  190:aload_0         
	//   89  191:aload_1         
	//   90  192:putfield        #29  <Field String e>
		}
	//   91  195:return          
	}

	public String a;
	public long b;
	public String c;
	public String d;
	public String e;
}
