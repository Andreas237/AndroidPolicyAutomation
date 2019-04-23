// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Environment;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.io.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bsm, bvi, p, bwk, 
//			m, bve, bvf, bvg, 
//			awp, bsj, bsq, wx, 
//			bsf, wi

public final class bse
{

	private bse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean c>
		a = new bsm();
	//    5    9:aload_0         
	//    6   10:new             #22  <Class bsm>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void bsm()>
	//    9   17:putfield        #25  <Field bsm a>
		b = new bvi();
	//   10   20:aload_0         
	//   11   21:new             #27  <Class bvi>
	//   12   24:dup             
	//   13   25:invokespecial   #28  <Method void bvi()>
	//   14   28:putfield        #30  <Field bvi b>
		b();
	//   15   31:aload_0         
	//   16   32:invokespecial   #32  <Method void b()>
	//   17   35:return          
	}

	public bse(bsm bsm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = bsm1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field bsm a>
		bsm1 = ((bsm) (p.cu));
	//    5    9:getstatic       #40  <Field com.google.android.gms.internal.ads.e p.cu>
	//    6   12:astore_1        
		c = ((Boolean)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (bsm1)))).booleanValue();
	//    7   13:aload_0         
	//    8   14:invokestatic    #46  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #51  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   11   21:checkcast       #53  <Class Boolean>
	//   12   24:invokevirtual   #57  <Method boolean Boolean.booleanValue()>
	//   13   27:putfield        #20  <Field boolean c>
		b = new bvi();
	//   14   30:aload_0         
	//   15   31:new             #27  <Class bvi>
	//   16   34:dup             
	//   17   35:invokespecial   #28  <Method void bvi()>
	//   18   38:putfield        #30  <Field bvi b>
		b();
	//   19   41:aload_0         
	//   20   42:invokespecial   #32  <Method void b()>
	//   21   45:return          
	}

	public static bse a()
	{
		return new bse();
	//    0    0:new             #2   <Class bse>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void bse()>
	//    3    7:areturn         
	}

	private final void b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		b.d = new bve();
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field bvi b>
	//    4    6:new             #61  <Class bve>
	//    5    9:dup             
	//    6   10:invokespecial   #62  <Method void bve()>
	//    7   13:putfield        #66  <Field bve bvi.d>
		b.d.b = new bvf();
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field bvi b>
	//   10   20:getfield        #66  <Field bve bvi.d>
	//   11   23:new             #68  <Class bvf>
	//   12   26:dup             
	//   13   27:invokespecial   #69  <Method void bvf()>
	//   14   30:putfield        #72  <Field bvf bve.b>
		b.c = new bvg();
	//   15   33:aload_0         
	//   16   34:getfield        #30  <Field bvi b>
	//   17   37:new             #74  <Class bvg>
	//   18   40:dup             
	//   19   41:invokespecial   #75  <Method void bvg()>
	//   20   44:putfield        #78  <Field bvg bvi.c>
		this;
	//   21   47:aload_0         
		JVM INSTR monitorexit ;
	//   22   48:monitorexit     
		return;
	//   23   49:return          
		Exception exception;
		exception;
	//   24   50:astore_1        
	//*  25   51:aload_0         
		throw exception;
	//   26   52:monitorexit     
	//   27   53:aload_1         
	//   28   54:athrow          
	}

	private final void b(bsj bsj1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		b.b = c();
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field bvi b>
	//    4    6:invokestatic    #82  <Method long[] c()>
	//    5    9:putfield        #85  <Field long[] bvi.b>
		a.a(awp.a(((awp) (b)))).b(bsj1.a()).a();
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field bsm a>
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field bvi b>
	//   10   20:invokestatic    #90  <Method byte[] awp.a(awp)>
	//   11   23:invokevirtual   #93  <Method bsq bsm.a(byte[])>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #98  <Method int bsj.a()>
	//   14   30:invokevirtual   #103 <Method bsq bsq.b(int)>
	//   15   33:invokevirtual   #105 <Method void bsq.a()>
		bsj1 = ((bsj) (String.valueOf(((Object) (Integer.toString(bsj1.a(), 10))))));
	//   16   36:aload_1         
	//   17   37:invokevirtual   #98  <Method int bsj.a()>
	//   18   40:bipush          10
	//   19   42:invokestatic    #111 <Method String Integer.toString(int, int)>
	//   20   45:invokestatic    #117 <Method String String.valueOf(Object)>
	//   21   48:astore_1        
		if(((String) (bsj1)).length() != 0)
	//*  22   49:aload_1         
	//*  23   50:invokevirtual   #120 <Method int String.length()>
	//*  24   53:ifeq            66
		{
			bsj1 = ((bsj) ("Logging Event with event code : ".concat(((String) (bsj1)))));
	//   25   56:ldc1            #122 <String "Logging Event with event code : ">
	//   26   58:aload_1         
	//   27   59:invokevirtual   #126 <Method String String.concat(String)>
	//   28   62:astore_1        
			break MISSING_BLOCK_LABEL_76;
	//   29   63:goto            76
		}
		bsj1 = ((bsj) (new String("Logging Event with event code : ")));
	//   30   66:new             #113 <Class String>
	//   31   69:dup             
	//   32   70:ldc1            #122 <String "Logging Event with event code : ">
	//   33   72:invokespecial   #129 <Method void String(String)>
	//   34   75:astore_1        
		wx.a(((String) (bsj1)));
	//   35   76:aload_1         
	//   36   77:invokestatic    #133 <Method void wx.a(String)>
		this;
	//   37   80:aload_0         
		JVM INSTR monitorexit ;
	//   38   81:monitorexit     
		return;
	//   39   82:return          
		bsj1;
	//   40   83:astore_1        
	//*  41   84:aload_0         
		throw bsj1;
	//   42   85:monitorexit     
	//   43   86:aload_1         
	//   44   87:athrow          
	}

	private final void c(bsj bsj1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj = ((Object) (Environment.getExternalStorageDirectory()));
	//    2    2:invokestatic    #143 <Method File Environment.getExternalStorageDirectory()>
	//    3    5:astore_2        
		if(obj != null)
			break MISSING_BLOCK_LABEL_13;
	//    4    6:aload_2         
	//    5    7:ifnonnull       13
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		obj = ((Object) (new File(((File) (obj)), "clearcut_events.txt")));
	//    9   13:new             #145 <Class File>
	//   10   16:dup             
	//   11   17:aload_2         
	//   12   18:ldc1            #147 <String "clearcut_events.txt">
	//   13   20:invokespecial   #150 <Method void File(File, String)>
	//   14   23:astore_2        
		obj = ((Object) (new FileOutputStream(((File) (obj)), true)));
	//   15   24:new             #152 <Class FileOutputStream>
	//   16   27:dup             
	//   17   28:aload_2         
	//   18   29:iconst_1        
	//   19   30:invokespecial   #155 <Method void FileOutputStream(File, boolean)>
	//   20   33:astore_2        
		((FileOutputStream) (obj)).write(d(bsj1).getBytes());
	//   21   34:aload_2         
	//   22   35:aload_0         
	//   23   36:aload_1         
	//   24   37:invokespecial   #158 <Method String d(bsj)>
	//   25   40:invokevirtual   #162 <Method byte[] String.getBytes()>
	//   26   43:invokevirtual   #166 <Method void FileOutputStream.write(byte[])>
		((FileOutputStream) (obj)).write(10);
	//   27   46:aload_2         
	//   28   47:bipush          10
	//   29   49:invokevirtual   #169 <Method void FileOutputStream.write(int)>
		((FileOutputStream) (obj)).close();
	//   30   52:aload_2         
	//   31   53:invokevirtual   #172 <Method void FileOutputStream.close()>
		this;
	//   32   56:aload_0         
		JVM INSTR monitorexit ;
	//   33   57:monitorexit     
		return;
	//   34   58:return          
_L6:
		wx.a("Could not close Clearcut output stream.");
	//   35   59:ldc1            #174 <String "Could not close Clearcut output stream.">
	//   36   61:invokestatic    #133 <Method void wx.a(String)>
		this;
	//   37   64:aload_0         
		JVM INSTR monitorexit ;
	//   38   65:monitorexit     
		return;
	//   39   66:return          
		bsj1;
	//   40   67:astore_1        
		  goto _L1
	//*  41   68:goto            91
_L5:
		wx.a("Could not write Clearcut to file.");
	//   42   71:ldc1            #176 <String "Could not write Clearcut to file.">
	//   43   73:invokestatic    #133 <Method void wx.a(String)>
		((FileOutputStream) (obj)).close();
	//   44   76:aload_2         
	//   45   77:invokevirtual   #172 <Method void FileOutputStream.close()>
		this;
	//   46   80:aload_0         
		JVM INSTR monitorexit ;
	//   47   81:monitorexit     
		return;
	//   48   82:return          
_L7:
		wx.a("Could not close Clearcut output stream.");
	//   49   83:ldc1            #174 <String "Could not close Clearcut output stream.">
	//   50   85:invokestatic    #133 <Method void wx.a(String)>
		this;
	//   51   88:aload_0         
		JVM INSTR monitorexit ;
	//   52   89:monitorexit     
		return;
	//   53   90:return          
_L1:
		((FileOutputStream) (obj)).close();
	//   54   91:aload_2         
	//   55   92:invokevirtual   #172 <Method void FileOutputStream.close()>
		  goto _L2
	//*  56   95:goto            103
_L8:
		wx.a("Could not close Clearcut output stream.");
	//   57   98:ldc1            #174 <String "Could not close Clearcut output stream.">
	//   58  100:invokestatic    #133 <Method void wx.a(String)>
_L2:
		throw bsj1;
	//   59  103:aload_1         
	//   60  104:athrow          
_L4:
		wx.a("Could not find file for Clearcut");
	//   61  105:ldc1            #178 <String "Could not find file for Clearcut">
	//   62  107:invokestatic    #133 <Method void wx.a(String)>
		this;
	//   63  110:aload_0         
		JVM INSTR monitorexit ;
	//   64  111:monitorexit     
		return;
	//   65  112:return          
		bsj1;
	//   66  113:astore_1        
	//*  67  114:aload_0         
		throw bsj1;
	//   68  115:monitorexit     
	//   69  116:aload_1         
	//   70  117:athrow          
		bsj1;
	//   71  118:astore_1        
		if(true) goto _L4; else goto _L3
	//   72  119:goto            105
_L3:
		bsj1;
	//   73  122:astore_1        
		  goto _L5
	//*  74  123:goto            71
		bsj1;
	//   75  126:astore_1        
		  goto _L6
	//*  76  127:goto            59
		bsj1;
	//   77  130:astore_1        
		  goto _L7
	//*  78  131:goto            83
		IOException ioexception;
		ioexception;
	//   79  134:astore_2        
		  goto _L8
	//*  80  135:goto            98
	}

	private static long[] c()
	{
		NumberFormatException numberformatexception;
		Object obj = ((Object) (p.b()));
	//    0    0:invokestatic    #183 <Method List p.b()>
	//    1    3:astore          5
		ArrayList arraylist = new ArrayList();
	//    2    5:new             #185 <Class ArrayList>
	//    3    8:dup             
	//    4    9:invokespecial   #186 <Method void ArrayList()>
	//    5   12:astore          4
		obj = ((Object) (((List) (obj)).iterator()));
	//    6   14:aload           5
	//    7   16:invokeinterface #192 <Method Iterator List.iterator()>
	//    8   21:astore          5
		int k;
		do
		{
			boolean flag = ((Iterator) (obj)).hasNext();
	//    9   23:aload           5
	//   10   25:invokeinterface #197 <Method boolean Iterator.hasNext()>
	//   11   30:istore_3        
			k = 0;
	//   12   31:iconst_0        
	//   13   32:istore_1        
			int i = 0;
	//   14   33:iconst_0        
	//   15   34:istore_0        
			if(!flag)
				break;
	//   16   35:iload_3         
	//   17   36:ifeq            99
			String as[] = ((String)((Iterator) (obj)).next()).split(",");
	//   18   39:aload           5
	//   19   41:invokeinterface #201 <Method Object Iterator.next()>
	//   20   46:checkcast       #113 <Class String>
	//   21   49:ldc1            #203 <String ",">
	//   22   51:invokevirtual   #207 <Method String[] String.split(String)>
	//   23   54:astore          6
			k = as.length;
	//   24   56:aload           6
	//   25   58:arraylength     
	//   26   59:istore_1        
			while(i < k) 
	//*  27   60:iload_0         
	//*  28   61:iload_1         
	//*  29   62:icmpge          23
			{
				String s = as[i];
	//   30   65:aload           6
	//   31   67:iload_0         
	//   32   68:aaload          
	//   33   69:astore          7
				try
				{
					((List) (arraylist)).add(((Object) (Long.valueOf(s))));
	//   34   71:aload           4
	//   35   73:aload           7
	//   36   75:invokestatic    #212 <Method Long Long.valueOf(String)>
	//   37   78:invokeinterface #216 <Method boolean List.add(Object)>
	//   38   83:pop             
				}
	//*  39   84:goto            92
	//*  40   87:ldc1            #218 <String "Experiment ID is not a number">
	//*  41   89:invokestatic    #133 <Method void wx.a(String)>
	//*  42   92:iload_0         
	//*  43   93:iconst_1        
	//*  44   94:iadd            
	//*  45   95:istore_0        
	//*  46   96:goto            60
	//*  47   99:aload           4
	//*  48  101:invokeinterface #221 <Method int List.size()>
	//*  49  106:newarray        long[]
	//*  50  108:astore          5
	//*  51  110:aload           4
	//*  52  112:checkcast       #185 <Class ArrayList>
	//*  53  115:astore          4
	//*  54  117:aload           4
	//*  55  119:invokevirtual   #222 <Method int ArrayList.size()>
	//*  56  122:istore_2        
	//*  57  123:iconst_0        
	//*  58  124:istore_0        
	//*  59  125:iload_1         
	//*  60  126:iload_2         
	//*  61  127:icmpge          161
	//*  62  130:aload           4
	//*  63  132:iload_1         
	//*  64  133:invokevirtual   #226 <Method Object ArrayList.get(int)>
	//*  65  136:astore          6
	//*  66  138:iload_1         
	//*  67  139:iconst_1        
	//*  68  140:iadd            
	//*  69  141:istore_1        
	//*  70  142:aload           5
	//*  71  144:iload_0         
	//*  72  145:aload           6
	//*  73  147:checkcast       #209 <Class Long>
	//*  74  150:invokevirtual   #230 <Method long Long.longValue()>
	//*  75  153:lastore         
	//*  76  154:iload_0         
	//*  77  155:iconst_1        
	//*  78  156:iadd            
	//*  79  157:istore_0        
	//*  80  158:goto            125
	//*  81  161:aload           5
	//*  82  163:areturn         
				// Misplaced declaration of an exception variable
				catch(NumberFormatException numberformatexception)
				{
					wx.a("Experiment ID is not a number");
				}
				i++;
			}
		} while(true);
		long al[] = new long[((List) (arraylist)).size()];
		arraylist = (ArrayList)arraylist;
		int l = arraylist.size();
		for(int j = 0; k < l; j++)
		{
			Object obj1 = arraylist.get(k);
			k++;
			al[j] = ((Long)obj1).longValue();
		}

		return al;
	//*  83  164:astore          7
	//*  84  166:goto            87
	}

	private final String d(bsj bsj1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		bsj1 = ((bsj) (String.format("id=%s,timestamp=%s,event=%s", new Object[] {
			b.a, Long.valueOf(aw.l().b()), Integer.valueOf(bsj1.a())
		})));
	//    2    2:ldc1            #232 <String "id=%s,timestamp=%s,event=%s">
	//    3    4:iconst_3        
	//    4    5:anewarray       Object[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:aload_0         
	//    8   11:getfield        #30  <Field bvi b>
	//    9   14:getfield        #235 <Field String bvi.a>
	//   10   17:aastore         
	//   11   18:dup             
	//   12   19:iconst_1        
	//   13   20:invokestatic    #241 <Method e aw.l()>
	//   14   23:invokeinterface #245 <Method long e.b()>
	//   15   28:invokestatic    #248 <Method Long Long.valueOf(long)>
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_2        
	//   19   34:aload_1         
	//   20   35:invokevirtual   #98  <Method int bsj.a()>
	//   21   38:invokestatic    #251 <Method Integer Integer.valueOf(int)>
	//   22   41:aastore         
	//   23   42:invokestatic    #255 <Method String String.format(String, Object[])>
	//   24   45:astore_1        
		this;
	//   25   46:aload_0         
		JVM INSTR monitorexit ;
	//   26   47:monitorexit     
		return ((String) (bsj1));
	//   27   48:aload_1         
	//   28   49:areturn         
		bsj1;
	//   29   50:astore_1        
	//*  30   51:aload_0         
		throw bsj1;
	//   31   52:monitorexit     
	//   32   53:aload_1         
	//   33   54:athrow          
	}

	public final void a(bsf bsf1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = c;
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field boolean c>
	//    4    6:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_35;
	//    5    7:iload_2         
	//    6    8:ifeq            35
		bsf1.a(b);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #30  <Field bvi b>
	//   10   16:invokeinterface #263 <Method void bsf.a(bvi)>
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		bsf1;
	//   14   24:astore_1        
		aw.i().a(((Throwable) (bsf1)), "AdMobClearcutLogger.modify");
	//   15   25:invokestatic    #267 <Method wi aw.i()>
	//   16   28:aload_1         
	//   17   29:ldc2            #269 <String "AdMobClearcutLogger.modify">
	//   18   32:invokevirtual   #274 <Method void wi.a(Throwable, String)>
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return;
	//   21   37:return          
		bsf1;
	//   22   38:astore_1        
	//*  23   39:aload_0         
		throw bsf1;
	//   24   40:monitorexit     
	//   25   41:aload_1         
	//   26   42:athrow          
	}

	public final void a(bsj bsj1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = c;
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field boolean c>
	//    4    6:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_2         
	//    6    8:ifne            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		com.google.android.gms.internal.ads.e e1 = p.cv;
	//   10   14:getstatic       #277 <Field com.google.android.gms.internal.ads.e p.cv>
	//   11   17:astore_3        
		if(!((Boolean)com.google.android.gms.internal.ads.bwk.e().a(e1)).booleanValue())
			break MISSING_BLOCK_LABEL_42;
	//   12   18:invokestatic    #46  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   13   21:aload_3         
	//   14   22:invokevirtual   #51  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   15   25:checkcast       #53  <Class Boolean>
	//   16   28:invokevirtual   #57  <Method boolean Boolean.booleanValue()>
	//   17   31:ifeq            42
		c(bsj1);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokespecial   #279 <Method void c(bsj)>
		this;
	//   21   39:aload_0         
		JVM INSTR monitorexit ;
	//   22   40:monitorexit     
		return;
	//   23   41:return          
		b(bsj1);
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:invokespecial   #281 <Method void b(bsj)>
		this;
	//   27   47:aload_0         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		return;
	//   29   49:return          
		bsj1;
	//   30   50:astore_1        
	//*  31   51:aload_0         
		throw bsj1;
	//   32   52:monitorexit     
	//   33   53:aload_1         
	//   34   54:athrow          
	}

	private final bsm a;
	private final bvi b;
	private final boolean c;
}
