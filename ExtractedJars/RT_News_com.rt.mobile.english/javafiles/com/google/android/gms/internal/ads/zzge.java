// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgr, zzha, zzgp, zzakb, 
//			zznk, zzkb, zzni, zzajm, 
//			zzakd

public final class zzge
{

	public zzge(int i, int j, int k, int l, int i1, int j1, int k1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void Object()>
	//    6   12:putfield        #37  <Field Object mLock>
		zzahc = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #39  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #40  <Method void ArrayList()>
	//   11   23:putfield        #42  <Field ArrayList zzahc>
		zzahd = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #39  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #40  <Method void ArrayList()>
	//   16   34:putfield        #44  <Field ArrayList zzahd>
		zzahe = new ArrayList();
	//   17   37:aload_0         
	//   18   38:new             #39  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #40  <Method void ArrayList()>
	//   21   45:putfield        #46  <Field ArrayList zzahe>
		zzahf = 0;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #48  <Field int zzahf>
		zzahg = 0;
	//   25   53:aload_0         
	//   26   54:iconst_0        
	//   27   55:putfield        #50  <Field int zzahg>
		zzahh = 0;
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:putfield        #52  <Field int zzahh>
		zzahj = "";
	//   31   63:aload_0         
	//   32   64:ldc1            #54  <String "">
	//   33   66:putfield        #56  <Field String zzahj>
		zzahk = "";
	//   34   69:aload_0         
	//   35   70:ldc1            #54  <String "">
	//   36   72:putfield        #58  <Field String zzahk>
		zzahl = "";
	//   37   75:aload_0         
	//   38   76:ldc1            #54  <String "">
	//   39   78:putfield        #60  <Field String zzahl>
		zzagx = i;
	//   40   81:aload_0         
	//   41   82:iload_1         
	//   42   83:putfield        #62  <Field int zzagx>
		zzagy = j;
	//   43   86:aload_0         
	//   44   87:iload_2         
	//   45   88:putfield        #64  <Field int zzagy>
		zzagz = k;
	//   46   91:aload_0         
	//   47   92:iload_3         
	//   48   93:putfield        #66  <Field int zzagz>
		zzaha = new zzgr(l);
	//   49   96:aload_0         
	//   50   97:new             #68  <Class zzgr>
	//   51  100:dup             
	//   52  101:iload           4
	//   53  103:invokespecial   #71  <Method void zzgr(int)>
	//   54  106:putfield        #73  <Field zzgr zzaha>
		zzahb = new zzha(i1, j1, k1);
	//   55  109:aload_0         
	//   56  110:new             #75  <Class zzha>
	//   57  113:dup             
	//   58  114:iload           5
	//   59  116:iload           6
	//   60  118:iload           7
	//   61  120:invokespecial   #78  <Method void zzha(int, int, int)>
	//   62  123:putfield        #80  <Field zzha zzahb>
	//   63  126:return          
	}

	private static String zza(ArrayList arraylist, int i)
	{
		if(arraylist.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #87  <Method boolean ArrayList.isEmpty()>
	//*   2    4:ifeq            10
			return "";
	//    3    7:ldc1            #54  <String "">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #89  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #90  <Method void StringBuilder()>
	//    8   17:astore_3        
		arraylist = (ArrayList)arraylist;
	//    9   18:aload_0         
	//   10   19:checkcast       #39  <Class ArrayList>
	//   11   22:astore_0        
		int j = arraylist.size();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #94  <Method int ArrayList.size()>
	//   14   27:istore_2        
		i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_1        
		do
		{
			if(i >= j)
				break;
	//   17   30:iload_1         
	//   18   31:iload_2         
	//   19   32:icmpge          72
			Object obj = arraylist.get(i);
	//   20   35:aload_0         
	//   21   36:iload_1         
	//   22   37:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   23   40:astore          4
			i++;
	//   24   42:iload_1         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_1        
			stringbuilder.append((String)obj);
	//   28   46:aload_3         
	//   29   47:aload           4
	//   30   49:checkcast       #100 <Class String>
	//   31   52:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   32   55:pop             
			stringbuilder.append(' ');
	//   33   56:aload_3         
	//   34   57:bipush          32
	//   35   59:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//   36   62:pop             
		} while(stringbuilder.length() <= 100);
	//   37   63:aload_3         
	//   38   64:invokevirtual   #110 <Method int StringBuilder.length()>
	//   39   67:bipush          100
	//   40   69:icmple          30
		stringbuilder.deleteCharAt(stringbuilder.length() - 1);
	//   41   72:aload_3         
	//   42   73:aload_3         
	//   43   74:invokevirtual   #110 <Method int StringBuilder.length()>
	//   44   77:iconst_1        
	//   45   78:isub            
	//   46   79:invokevirtual   #114 <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//   47   82:pop             
		arraylist = ((ArrayList) (stringbuilder.toString()));
	//   48   83:aload_3         
	//   49   84:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   50   87:astore_0        
		if(((String) (arraylist)).length() < 100)
	//*  51   88:aload_0         
	//*  52   89:invokevirtual   #119 <Method int String.length()>
	//*  53   92:bipush          100
	//*  54   94:icmpge          99
			return ((String) (arraylist));
	//   55   97:aload_0         
	//   56   98:areturn         
		else
			return ((String) (arraylist)).substring(0, 100);
	//   57   99:aload_0         
	//   58  100:iconst_0        
	//   59  101:bipush          100
	//   60  103:invokevirtual   #123 <Method String String.substring(int, int)>
	//   61  106:areturn         
	}

	private final void zzc(String s, boolean flag, float f, float f1, float f2, float f3)
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_101;
	//    0    0:aload_1         
	//    1    1:ifnull          101
		if(s.length() < zzagz)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #119 <Method int String.length()>
	//*   4    8:aload_0         
	//*   5    9:getfield        #66  <Field int zzagz>
	//*   6   12:icmpge          16
			return;
	//    7   15:return          
		Object obj = mLock;
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field Object mLock>
	//   10   20:astore          7
		obj;
	//   11   22:aload           7
		JVM INSTR monitorenter ;
	//   12   24:monitorenter    
		zzahc.add(((Object) (s)));
	//   13   25:aload_0         
	//   14   26:getfield        #42  <Field ArrayList zzahc>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #132 <Method boolean ArrayList.add(Object)>
	//   17   33:pop             
		zzahf = zzahf + s.length();
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #48  <Field int zzahf>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #119 <Method int String.length()>
	//   23   43:iadd            
	//   24   44:putfield        #48  <Field int zzahf>
		if(!flag)
			break MISSING_BLOCK_LABEL_91;
	//   25   47:iload_2         
	//   26   48:ifeq            91
		zzahd.add(((Object) (s)));
	//   27   51:aload_0         
	//   28   52:getfield        #44  <Field ArrayList zzahd>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #132 <Method boolean ArrayList.add(Object)>
	//   31   59:pop             
		zzahe.add(((Object) (new zzgp(f, f1, f2, f3, zzahd.size() - 1))));
	//   32   60:aload_0         
	//   33   61:getfield        #46  <Field ArrayList zzahe>
	//   34   64:new             #134 <Class zzgp>
	//   35   67:dup             
	//   36   68:fload_3         
	//   37   69:fload           4
	//   38   71:fload           5
	//   39   73:fload           6
	//   40   75:aload_0         
	//   41   76:getfield        #44  <Field ArrayList zzahd>
	//   42   79:invokevirtual   #94  <Method int ArrayList.size()>
	//   43   82:iconst_1        
	//   44   83:isub            
	//   45   84:invokespecial   #137 <Method void zzgp(float, float, float, float, int)>
	//   46   87:invokevirtual   #132 <Method boolean ArrayList.add(Object)>
	//   47   90:pop             
		obj;
	//   48   91:aload           7
		JVM INSTR monitorexit ;
	//   49   93:monitorexit     
		return;
	//   50   94:return          
		s;
	//   51   95:astore_1        
		obj;
	//   52   96:aload           7
		JVM INSTR monitorexit ;
	//   53   98:monitorexit     
		throw s;
	//   54   99:aload_1         
	//   55  100:athrow          
	//   56  101:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof zzge))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zzge>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(obj == this)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) ((zzge)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzge>
	//   12   20:astore_1        
		return ((zzge) (obj)).zzahj != null && ((zzge) (obj)).zzahj.equals(((Object) (zzahj)));
	//   13   21:aload_1         
	//   14   22:getfield        #56  <Field String zzahj>
	//   15   25:ifnull          44
	//   16   28:aload_1         
	//   17   29:getfield        #56  <Field String zzahj>
	//   18   32:aload_0         
	//   19   33:getfield        #56  <Field String zzahj>
	//   20   36:invokevirtual   #141 <Method boolean String.equals(Object)>
	//   21   39:ifeq            44
	//   22   42:iconst_1        
	//   23   43:ireturn         
	//   24   44:iconst_0        
	//   25   45:ireturn         
	}

	public final int getScore()
	{
		return zzahi;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field int zzahi>
	//    2    4:ireturn         
	}

	public final String getSignature()
	{
		return zzahj;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String zzahj>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		return zzahj.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String zzahj>
	//    2    4:invokevirtual   #148 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final String toString()
	{
		int i = zzahg;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int zzahg>
	//    2    4:istore_1        
		int j = zzahi;
	//    3    5:aload_0         
	//    4    6:getfield        #144 <Field int zzahi>
	//    5    9:istore_2        
		int k = zzahf;
	//    6   10:aload_0         
	//    7   11:getfield        #48  <Field int zzahf>
	//    8   14:istore_3        
		String s = zza(zzahc, 100);
	//    9   15:aload_0         
	//   10   16:getfield        #42  <Field ArrayList zzahc>
	//   11   19:bipush          100
	//   12   21:invokestatic    #150 <Method String zza(ArrayList, int)>
	//   13   24:astore          4
		String s1 = zza(zzahd, 100);
	//   14   26:aload_0         
	//   15   27:getfield        #44  <Field ArrayList zzahd>
	//   16   30:bipush          100
	//   17   32:invokestatic    #150 <Method String zza(ArrayList, int)>
	//   18   35:astore          5
		String s2 = zzahj;
	//   19   37:aload_0         
	//   20   38:getfield        #56  <Field String zzahj>
	//   21   41:astore          6
		String s3 = zzahk;
	//   22   43:aload_0         
	//   23   44:getfield        #58  <Field String zzahk>
	//   24   47:astore          7
		String s4 = zzahl;
	//   25   49:aload_0         
	//   26   50:getfield        #60  <Field String zzahl>
	//   27   53:astore          8
		StringBuilder stringbuilder = new StringBuilder(165 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length() + String.valueOf(((Object) (s4))).length());
	//   28   55:new             #89  <Class StringBuilder>
	//   29   58:dup             
	//   30   59:sipush          165
	//   31   62:aload           4
	//   32   64:invokestatic    #154 <Method String String.valueOf(Object)>
	//   33   67:invokevirtual   #119 <Method int String.length()>
	//   34   70:iadd            
	//   35   71:aload           5
	//   36   73:invokestatic    #154 <Method String String.valueOf(Object)>
	//   37   76:invokevirtual   #119 <Method int String.length()>
	//   38   79:iadd            
	//   39   80:aload           6
	//   40   82:invokestatic    #154 <Method String String.valueOf(Object)>
	//   41   85:invokevirtual   #119 <Method int String.length()>
	//   42   88:iadd            
	//   43   89:aload           7
	//   44   91:invokestatic    #154 <Method String String.valueOf(Object)>
	//   45   94:invokevirtual   #119 <Method int String.length()>
	//   46   97:iadd            
	//   47   98:aload           8
	//   48  100:invokestatic    #154 <Method String String.valueOf(Object)>
	//   49  103:invokevirtual   #119 <Method int String.length()>
	//   50  106:iadd            
	//   51  107:invokespecial   #155 <Method void StringBuilder(int)>
	//   52  110:astore          9
		stringbuilder.append("ActivityContent fetchId: ");
	//   53  112:aload           9
	//   54  114:ldc1            #157 <String "ActivityContent fetchId: ">
	//   55  116:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   56  119:pop             
		stringbuilder.append(i);
	//   57  120:aload           9
	//   58  122:iload_1         
	//   59  123:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   60  126:pop             
		stringbuilder.append(" score:");
	//   61  127:aload           9
	//   62  129:ldc1            #161 <String " score:">
	//   63  131:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   64  134:pop             
		stringbuilder.append(j);
	//   65  135:aload           9
	//   66  137:iload_2         
	//   67  138:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   68  141:pop             
		stringbuilder.append(" total_length:");
	//   69  142:aload           9
	//   70  144:ldc1            #163 <String " total_length:">
	//   71  146:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   72  149:pop             
		stringbuilder.append(k);
	//   73  150:aload           9
	//   74  152:iload_3         
	//   75  153:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   76  156:pop             
		stringbuilder.append("\n text: ");
	//   77  157:aload           9
	//   78  159:ldc1            #165 <String "\n text: ">
	//   79  161:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
		stringbuilder.append(s);
	//   81  165:aload           9
	//   82  167:aload           4
	//   83  169:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   84  172:pop             
		stringbuilder.append("\n viewableText");
	//   85  173:aload           9
	//   86  175:ldc1            #167 <String "\n viewableText">
	//   87  177:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   88  180:pop             
		stringbuilder.append(s1);
	//   89  181:aload           9
	//   90  183:aload           5
	//   91  185:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   92  188:pop             
		stringbuilder.append("\n signture: ");
	//   93  189:aload           9
	//   94  191:ldc1            #169 <String "\n signture: ">
	//   95  193:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   96  196:pop             
		stringbuilder.append(s2);
	//   97  197:aload           9
	//   98  199:aload           6
	//   99  201:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  100  204:pop             
		stringbuilder.append("\n viewableSignture: ");
	//  101  205:aload           9
	//  102  207:ldc1            #171 <String "\n viewableSignture: ">
	//  103  209:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  104  212:pop             
		stringbuilder.append(s3);
	//  105  213:aload           9
	//  106  215:aload           7
	//  107  217:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  108  220:pop             
		stringbuilder.append("\n viewableSignatureForVertical: ");
	//  109  221:aload           9
	//  110  223:ldc1            #173 <String "\n viewableSignatureForVertical: ">
	//  111  225:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  112  228:pop             
		stringbuilder.append(s4);
	//  113  229:aload           9
	//  114  231:aload           8
	//  115  233:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  116  236:pop             
		return stringbuilder.toString();
	//  117  237:aload           9
	//  118  239:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  119  242:areturn         
	}

	public final void zza(String s, boolean flag, float f, float f1, float f2, float f3)
	{
		zzc(s, flag, f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:invokespecial   #175 <Method void zzc(String, boolean, float, float, float, float)>
		synchronized(mLock)
	//*   8   13:aload_0         
	//*   9   14:getfield        #37  <Field Object mLock>
	//*  10   17:astore_1        
	//*  11   18:aload_1         
	//*  12   19:monitorenter    
		{
			if(zzahh < 0)
	//*  13   20:aload_0         
	//*  14   21:getfield        #52  <Field int zzahh>
	//*  15   24:ifge            32
				zzakb.zzck("ActivityContent: negative number of WebViews.");
	//   16   27:ldc1            #177 <String "ActivityContent: negative number of WebViews.">
	//   17   29:invokestatic    #183 <Method void zzakb.zzck(String)>
			zzgt();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #186 <Method void zzgt()>
		}
	//   20   36:aload_1         
	//   21   37:monitorexit     
		return;
	//   22   38:return          
		exception;
	//   23   39:astore          7
		s;
	//   24   41:aload_1         
		JVM INSTR monitorexit ;
	//   25   42:monitorexit     
		throw exception;
	//   26   43:aload           7
	//   27   45:athrow          
	}

	public final void zzb(String s, boolean flag, float f, float f1, float f2, float f3)
	{
		zzc(s, flag, f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:invokespecial   #175 <Method void zzc(String, boolean, float, float, float, float)>
	//    8   13:return          
	}

	public final boolean zzgn()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzahh == 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #52  <Field int zzahh>
	//*   7   11:ifne            28
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:aload_2         
	//*  12   20:monitorexit     
	//*  13   21:iload_1         
	//*  14   22:ireturn         
	//*  15   23:astore_3        
	//*  16   24:aload_2         
	//*  17   25:monitorexit     
	//*  18   26:aload_3         
	//*  19   27:athrow          
			flag = false;
	//   20   28:iconst_0        
	//   21   29:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  22   30:goto            19
	}

	public final String zzgo()
	{
		return zzahk;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String zzahk>
	//    2    4:areturn         
	}

	public final String zzgp()
	{
		return zzahl;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String zzahl>
	//    2    4:areturn         
	}

	public final void zzgq()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzahi = zzahi - 100;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #144 <Field int zzahi>
	//    8   12:bipush          100
	//    9   14:isub            
	//   10   15:putfield        #144 <Field int zzahi>
		}
	//   11   18:aload_1         
	//   12   19:monitorexit     
		return;
	//   13   20:return          
		exception;
	//   14   21:astore_2        
		obj;
	//   15   22:aload_1         
		JVM INSTR monitorexit ;
	//   16   23:monitorexit     
		throw exception;
	//   17   24:aload_2         
	//   18   25:athrow          
	}

	public final void zzgr()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzahh = zzahh - 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #52  <Field int zzahh>
	//    8   12:iconst_1        
	//    9   13:isub            
	//   10   14:putfield        #52  <Field int zzahh>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void zzgs()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzahh = zzahh + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #52  <Field int zzahh>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #52  <Field int zzahh>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void zzgt()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			int i = zzahf;
	//    5    7:aload_0         
	//    6    8:getfield        #48  <Field int zzahf>
	//    7   11:istore_1        
			int j = zzahg;
	//    8   12:aload_0         
	//    9   13:getfield        #50  <Field int zzahg>
	//   10   16:istore_2        
			i = i * zzagx + j * zzagy;
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #62  <Field int zzagx>
	//   14   22:imul            
	//   15   23:iload_2         
	//   16   24:aload_0         
	//   17   25:getfield        #64  <Field int zzagy>
	//   18   28:imul            
	//   19   29:iadd            
	//   20   30:istore_1        
			if(i > zzahi)
	//*  21   31:iload_1         
	//*  22   32:aload_0         
	//*  23   33:getfield        #144 <Field int zzahi>
	//*  24   36:icmple          161
			{
				zzahi = i;
	//   25   39:aload_0         
	//   26   40:iload_1         
	//   27   41:putfield        #144 <Field int zzahi>
				zzna zzna = zznk.zzawq;
	//   28   44:getstatic       #199 <Field zzna zznk.zzawq>
	//   29   47:astore          4
				if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() && !zzbv.zzeo().zzqh().zzqu())
	//*  30   49:invokestatic    #205 <Method zzni zzkb.zzik()>
	//*  31   52:aload           4
	//*  32   54:invokevirtual   #211 <Method Object zzni.zzd(zzna)>
	//*  33   57:checkcast       #213 <Class Boolean>
	//*  34   60:invokevirtual   #216 <Method boolean Boolean.booleanValue()>
	//*  35   63:ifeq            108
	//*  36   66:invokestatic    #222 <Method zzajm zzbv.zzeo()>
	//*  37   69:invokevirtual   #228 <Method zzakd zzajm.zzqh()>
	//*  38   72:invokevirtual   #233 <Method boolean zzakd.zzqu()>
	//*  39   75:ifne            108
				{
					zzahj = zzaha.zza(zzahc);
	//   40   78:aload_0         
	//   41   79:aload_0         
	//   42   80:getfield        #73  <Field zzgr zzaha>
	//   43   83:aload_0         
	//   44   84:getfield        #42  <Field ArrayList zzahc>
	//   45   87:invokevirtual   #236 <Method String zzgr.zza(ArrayList)>
	//   46   90:putfield        #56  <Field String zzahj>
					zzahk = zzaha.zza(zzahd);
	//   47   93:aload_0         
	//   48   94:aload_0         
	//   49   95:getfield        #73  <Field zzgr zzaha>
	//   50   98:aload_0         
	//   51   99:getfield        #44  <Field ArrayList zzahd>
	//   52  102:invokevirtual   #236 <Method String zzgr.zza(ArrayList)>
	//   53  105:putfield        #58  <Field String zzahk>
				}
				zzna = zznk.zzaws;
	//   54  108:getstatic       #239 <Field zzna zznk.zzaws>
	//   55  111:astore          4
				if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() && !zzbv.zzeo().zzqh().zzqw())
	//*  56  113:invokestatic    #205 <Method zzni zzkb.zzik()>
	//*  57  116:aload           4
	//*  58  118:invokevirtual   #211 <Method Object zzni.zzd(zzna)>
	//*  59  121:checkcast       #213 <Class Boolean>
	//*  60  124:invokevirtual   #216 <Method boolean Boolean.booleanValue()>
	//*  61  127:ifeq            161
	//*  62  130:invokestatic    #222 <Method zzajm zzbv.zzeo()>
	//*  63  133:invokevirtual   #228 <Method zzakd zzajm.zzqh()>
	//*  64  136:invokevirtual   #242 <Method boolean zzakd.zzqw()>
	//*  65  139:ifne            161
					zzahl = zzahb.zza(zzahd, zzahe);
	//   66  142:aload_0         
	//   67  143:aload_0         
	//   68  144:getfield        #80  <Field zzha zzahb>
	//   69  147:aload_0         
	//   70  148:getfield        #44  <Field ArrayList zzahd>
	//   71  151:aload_0         
	//   72  152:getfield        #46  <Field ArrayList zzahe>
	//   73  155:invokevirtual   #245 <Method String zzha.zza(ArrayList, ArrayList)>
	//   74  158:putfield        #60  <Field String zzahl>
			}
		}
	//   75  161:aload_3         
	//   76  162:monitorexit     
		return;
	//   77  163:return          
		exception;
	//   78  164:astore          4
		obj;
	//   79  166:aload_3         
		JVM INSTR monitorexit ;
	//   80  167:monitorexit     
		throw exception;
	//   81  168:aload           4
	//   82  170:athrow          
	}

	final int zzgu()
	{
		return zzahf;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int zzahf>
	//    2    4:ireturn         
	}

	public final void zzo(int i)
	{
		zzahg = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field int zzahg>
	//    3    5:return          
	}

	private final Object mLock = new Object();
	private final int zzagx;
	private final int zzagy;
	private final int zzagz;
	private final zzgr zzaha;
	private final zzha zzahb;
	private ArrayList zzahc;
	private ArrayList zzahd;
	private ArrayList zzahe;
	private int zzahf;
	private int zzahg;
	private int zzahh;
	private int zzahi;
	private String zzahj;
	private String zzahk;
	private String zzahl;
}
