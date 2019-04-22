// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.text.TextUtils;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			PasswordSpecification

public static final class PasswordSpecification$zzd
{

	private static TreeSet zzd(String s, String s1)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #46  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            85
		{
			TreeSet treeset = new TreeSet();
	//    3    7:new             #24  <Class TreeSet>
	//    4   10:dup             
	//    5   11:invokespecial   #25  <Method void TreeSet()>
	//    6   14:astore          5
			s = ((String) (s.toCharArray()));
	//    7   16:aload_0         
	//    8   17:invokevirtual   #52  <Method char[] String.toCharArray()>
	//    9   20:astore_0        
			int j = s.length;
	//   10   21:aload_0         
	//   11   22:arraylength     
	//   12   23:istore          4
			for(int i = 0; i < j;)
	//*  13   25:iconst_0        
	//*  14   26:istore_3        
	//*  15   27:iload_3         
	//*  16   28:iload           4
	//*  17   30:icmpge          82
			{
				char c = s[i];
	//   18   33:aload_0         
	//   19   34:iload_3         
	//   20   35:caload          
	//   21   36:istore_2        
				if(!PasswordSpecification.zze(((int) (c)), 32, 126))
	//*  22   37:iload_2         
	//*  23   38:bipush          32
	//*  24   40:bipush          126
	//*  25   42:invokestatic    #56  <Method boolean PasswordSpecification.zze(int, int, int)>
	//*  26   45:ifne            65
				{
					treeset.add(((Object) (Character.valueOf(c))));
	//   27   48:aload           5
	//   28   50:iload_2         
	//   29   51:invokestatic    #62  <Method Character Character.valueOf(char)>
	//   30   54:invokevirtual   #66  <Method boolean TreeSet.add(Object)>
	//   31   57:pop             
					i++;
	//   32   58:iload_3         
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:istore_3        
				} else
	//*  36   62:goto            27
				{
					throw new PasswordSpecification$zze(String.valueOf(((Object) (s1))).concat(" must only contain ASCII printable characters"));
	//   37   65:new             #68  <Class PasswordSpecification$zze>
	//   38   68:dup             
	//   39   69:aload_1         
	//   40   70:invokestatic    #71  <Method String String.valueOf(Object)>
	//   41   73:ldc1            #73  <String " must only contain ASCII printable characters">
	//   42   75:invokevirtual   #77  <Method String String.concat(String)>
	//   43   78:invokespecial   #80  <Method void PasswordSpecification$zze(String)>
	//   44   81:athrow          
				}
			}

			return treeset;
	//   45   82:aload           5
	//   46   84:areturn         
		} else
		{
			throw new PasswordSpecification$zze(String.valueOf(((Object) (s1))).concat(" cannot be null or empty"));
	//   47   85:new             #68  <Class PasswordSpecification$zze>
	//   48   88:dup             
	//   49   89:aload_1         
	//   50   90:invokestatic    #71  <Method String String.valueOf(Object)>
	//   51   93:ldc1            #82  <String " cannot be null or empty">
	//   52   95:invokevirtual   #77  <Method String String.concat(String)>
	//   53   98:invokespecial   #80  <Method void PasswordSpecification$zze(String)>
	//   54  101:athrow          
		}
	}

	public final PasswordSpecification$zzd zzd(int i, int j)
	{
		zzdl = 12;
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:putfield        #36  <Field int zzdl>
		zzdm = 16;
	//    3    6:aload_0         
	//    4    7:bipush          16
	//    5    9:putfield        #38  <Field int zzdm>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final PasswordSpecification$zzd zzd(String s, int i)
	{
		s = ((String) (zzd(s, "requiredChars")));
	//    0    0:aload_1         
	//    1    1:ldc1            #89  <String "requiredChars">
	//    2    3:invokestatic    #91  <Method TreeSet zzd(String, String)>
	//    3    6:astore_1        
		zzdj.add(((Object) (PasswordSpecification.zze(((java.util.Collection) (s))))));
	//    4    7:aload_0         
	//    5    8:getfield        #32  <Field List zzdj>
	//    6   11:aload_1         
	//    7   12:invokestatic    #94  <Method String PasswordSpecification.zze(java.util.Collection)>
	//    8   15:invokeinterface #97  <Method boolean List.add(Object)>
	//    9   20:pop             
		zzdk.add(((Object) (Integer.valueOf(1))));
	//   10   21:aload_0         
	//   11   22:getfield        #34  <Field List zzdk>
	//   12   25:iconst_1        
	//   13   26:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//   14   29:invokeinterface #97  <Method boolean List.add(Object)>
	//   15   34:pop             
		return this;
	//   16   35:aload_0         
	//   17   36:areturn         
	}

	public final PasswordSpecification$zzd zze(String s)
	{
		zzdp.addAll(((java.util.Collection) (zzd(s, "allowedChars"))));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field TreeSet zzdp>
	//    2    4:aload_1         
	//    3    5:ldc1            #106 <String "allowedChars">
	//    4    7:invokestatic    #91  <Method TreeSet zzd(String, String)>
	//    5   10:invokevirtual   #110 <Method boolean TreeSet.addAll(java.util.Collection)>
	//    6   13:pop             
		return this;
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	public final PasswordSpecification zzj()
	{
		if(!zzdp.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field TreeSet zzdp>
	//*   2    4:invokevirtual   #115 <Method boolean TreeSet.isEmpty()>
	//*   3    7:ifne            233
		{
			Iterator iterator = zzdk.iterator();
	//    4   10:aload_0         
	//    5   11:getfield        #34  <Field List zzdk>
	//    6   14:invokeinterface #119 <Method Iterator List.iterator()>
	//    7   19:astore          5
			int i;
			for(i = 0; iterator.hasNext(); i += ((Integer)iterator.next()).intValue());
	//    8   21:iconst_0        
	//    9   22:istore_2        
	//   10   23:aload           5
	//   11   25:invokeinterface #124 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            52
	//   13   33:iload_2         
	//   14   34:aload           5
	//   15   36:invokeinterface #128 <Method Object Iterator.next()>
	//   16   41:checkcast       #99  <Class Integer>
	//   17   44:invokevirtual   #132 <Method int Integer.intValue()>
	//   18   47:iadd            
	//   19   48:istore_2        
	//*  20   49:goto            23
			if(i <= zzdm)
	//*  21   52:iload_2         
	//*  22   53:aload_0         
	//*  23   54:getfield        #38  <Field int zzdm>
	//*  24   57:icmpgt          223
			{
				boolean aflag[] = new boolean[95];
	//   25   60:bipush          95
	//   26   62:newarray        boolean[]
	//   27   64:astore          5
				for(Iterator iterator1 = zzdj.iterator(); iterator1.hasNext();)
	//*  28   66:aload_0         
	//*  29   67:getfield        #32  <Field List zzdj>
	//*  30   70:invokeinterface #119 <Method Iterator List.iterator()>
	//*  31   75:astore          6
	//*  32   77:aload           6
	//*  33   79:invokeinterface #124 <Method boolean Iterator.hasNext()>
	//*  34   84:ifeq            192
				{
					char ac[] = ((String)iterator1.next()).toCharArray();
	//   35   87:aload           6
	//   36   89:invokeinterface #128 <Method Object Iterator.next()>
	//   37   94:checkcast       #48  <Class String>
	//   38   97:invokevirtual   #52  <Method char[] String.toCharArray()>
	//   39  100:astore          7
					int k = ac.length;
	//   40  102:aload           7
	//   41  104:arraylength     
	//   42  105:istore_3        
					int j = 0;
	//   43  106:iconst_0        
	//   44  107:istore_2        
					while(j < k) 
	//*  45  108:iload_2         
	//*  46  109:iload_3         
	//*  47  110:icmpge          77
					{
						char c = ac[j];
	//   48  113:aload           7
	//   49  115:iload_2         
	//   50  116:caload          
	//   51  117:istore_1        
						int l = c - 32;
	//   52  118:iload_1         
	//   53  119:bipush          32
	//   54  121:isub            
	//   55  122:istore          4
						if(!aflag[l])
	//*  56  124:aload           5
	//*  57  126:iload           4
	//*  58  128:baload          
	//*  59  129:ifne            145
						{
							aflag[l] = true;
	//   60  132:aload           5
	//   61  134:iload           4
	//   62  136:iconst_1        
	//   63  137:bastore         
							j++;
	//   64  138:iload_2         
	//   65  139:iconst_1        
	//   66  140:iadd            
	//   67  141:istore_2        
						} else
	//*  68  142:goto            108
						{
							StringBuilder stringbuilder = new StringBuilder(58);
	//   69  145:new             #134 <Class StringBuilder>
	//   70  148:dup             
	//   71  149:bipush          58
	//   72  151:invokespecial   #137 <Method void StringBuilder(int)>
	//   73  154:astore          5
							stringbuilder.append("character ");
	//   74  156:aload           5
	//   75  158:ldc1            #139 <String "character ">
	//   76  160:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   77  163:pop             
							stringbuilder.append(c);
	//   78  164:aload           5
	//   79  166:iload_1         
	//   80  167:invokevirtual   #146 <Method StringBuilder StringBuilder.append(char)>
	//   81  170:pop             
							stringbuilder.append(" occurs in more than one required character set");
	//   82  171:aload           5
	//   83  173:ldc1            #148 <String " occurs in more than one required character set">
	//   84  175:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   85  178:pop             
							throw new PasswordSpecification$zze(stringbuilder.toString());
	//   86  179:new             #68  <Class PasswordSpecification$zze>
	//   87  182:dup             
	//   88  183:aload           5
	//   89  185:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   90  188:invokespecial   #80  <Method void PasswordSpecification$zze(String)>
	//   91  191:athrow          
						}
					}
				}

				return new PasswordSpecification(PasswordSpecification.zze(((java.util.Collection) (zzdp))), zzdj, zzdk, zzdl, zzdm);
	//   92  192:new             #6   <Class PasswordSpecification>
	//   93  195:dup             
	//   94  196:aload_0         
	//   95  197:getfield        #27  <Field TreeSet zzdp>
	//   96  200:invokestatic    #94  <Method String PasswordSpecification.zze(java.util.Collection)>
	//   97  203:aload_0         
	//   98  204:getfield        #32  <Field List zzdj>
	//   99  207:aload_0         
	//  100  208:getfield        #34  <Field List zzdk>
	//  101  211:aload_0         
	//  102  212:getfield        #36  <Field int zzdl>
	//  103  215:aload_0         
	//  104  216:getfield        #38  <Field int zzdm>
	//  105  219:invokespecial   #155 <Method void PasswordSpecification(String, List, List, int, int)>
	//  106  222:areturn         
			} else
			{
				throw new PasswordSpecification$zze("required character count cannot be greater than the max password size");
	//  107  223:new             #68  <Class PasswordSpecification$zze>
	//  108  226:dup             
	//  109  227:ldc1            #157 <String "required character count cannot be greater than the max password size">
	//  110  229:invokespecial   #80  <Method void PasswordSpecification$zze(String)>
	//  111  232:athrow          
			}
		} else
		{
			throw new PasswordSpecification$zze("no allowed characters specified");
	//  112  233:new             #68  <Class PasswordSpecification$zze>
	//  113  236:dup             
	//  114  237:ldc1            #159 <String "no allowed characters specified">
	//  115  239:invokespecial   #80  <Method void PasswordSpecification$zze(String)>
	//  116  242:athrow          
		}
	}

	private final List zzdj = new ArrayList();
	private final List zzdk = new ArrayList();
	private int zzdl;
	private int zzdm;
	private final TreeSet zzdp = new TreeSet();

	public PasswordSpecification$zzd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class TreeSet>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void TreeSet()>
	//    6   12:putfield        #27  <Field TreeSet zzdp>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void ArrayList()>
	//   11   23:putfield        #32  <Field List zzdj>
	//   12   26:aload_0         
	//   13   27:new             #29  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #30  <Method void ArrayList()>
	//   16   34:putfield        #34  <Field List zzdk>
		zzdl = 12;
	//   17   37:aload_0         
	//   18   38:bipush          12
	//   19   40:putfield        #36  <Field int zzdl>
		zzdm = 16;
	//   20   43:aload_0         
	//   21   44:bipush          16
	//   22   46:putfield        #38  <Field int zzdm>
	//   23   49:return          
	}
}
