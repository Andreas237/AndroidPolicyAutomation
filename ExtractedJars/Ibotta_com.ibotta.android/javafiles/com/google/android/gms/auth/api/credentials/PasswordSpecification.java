// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.security.SecureRandom;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			zzm

public final class PasswordSpecification extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static final class zzd
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
						throw new zze(String.valueOf(((Object) (s1))).concat(" must only contain ASCII printable characters"));
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
				throw new zze(String.valueOf(((Object) (s1))).concat(" cannot be null or empty"));
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

		public final zzd zzd(int i, int j)
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

		public final zzd zzd(String s, int i)
		{
			s = ((String) (zzd(s, "requiredChars")));
		//    0    0:aload_1         
		//    1    1:ldc1            #89  <String "requiredChars">
		//    2    3:invokestatic    #91  <Method TreeSet zzd(String, String)>
		//    3    6:astore_1        
			zzdj.add(((Object) (PasswordSpecification.zze(((Collection) (s))))));
		//    4    7:aload_0         
		//    5    8:getfield        #32  <Field List zzdj>
		//    6   11:aload_1         
		//    7   12:invokestatic    #94  <Method String PasswordSpecification.zze(Collection)>
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

		public final zzd zze(String s)
		{
			zzdp.addAll(((Collection) (zzd(s, "allowedChars"))));
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field TreeSet zzdp>
		//    2    4:aload_1         
		//    3    5:ldc1            #106 <String "allowedChars">
		//    4    7:invokestatic    #91  <Method TreeSet zzd(String, String)>
		//    5   10:invokevirtual   #110 <Method boolean TreeSet.addAll(Collection)>
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
								throw new zze(stringbuilder.toString());
		//   86  179:new             #68  <Class PasswordSpecification$zze>
		//   87  182:dup             
		//   88  183:aload           5
		//   89  185:invokevirtual   #152 <Method String StringBuilder.toString()>
		//   90  188:invokespecial   #80  <Method void PasswordSpecification$zze(String)>
		//   91  191:athrow          
							}
						}
					}

					return new PasswordSpecification(PasswordSpecification.zze(((Collection) (zzdp))), zzdj, zzdk, zzdl, zzdm);
		//   92  192:new             #6   <Class PasswordSpecification>
		//   93  195:dup             
		//   94  196:aload_0         
		//   95  197:getfield        #27  <Field TreeSet zzdp>
		//   96  200:invokestatic    #94  <Method String PasswordSpecification.zze(Collection)>
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
					throw new zze("required character count cannot be greater than the max password size");
		//  107  223:new             #68  <Class PasswordSpecification$zze>
		//  108  226:dup             
		//  109  227:ldc1            #157 <String "required character count cannot be greater than the max password size">
		//  110  229:invokespecial   #80  <Method void PasswordSpecification$zze(String)>
		//  111  232:athrow          
				}
			} else
			{
				throw new zze("no allowed characters specified");
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

		public zzd()
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

	public static final class zze extends Error
	{

		public zze(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Error(String)>
		//    3    5:return          
		}
	}


	PasswordSpecification(String s, List list, List list1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void AbstractSafeParcelable()>
		zzdi = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #96  <Field String zzdi>
		zzdj = Collections.unmodifiableList(list);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #102 <Method List Collections.unmodifiableList(List)>
	//    8   14:putfield        #104 <Field List zzdj>
		zzdk = Collections.unmodifiableList(list1);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokestatic    #102 <Method List Collections.unmodifiableList(List)>
	//   12   22:putfield        #106 <Field List zzdk>
		zzdl = i;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #108 <Field int zzdl>
		zzdm = j;
	//   16   31:aload_0         
	//   17   32:iload           5
	//   18   34:putfield        #110 <Field int zzdm>
		s = ((String) (new int[95]));
	//   19   37:bipush          95
	//   20   39:newarray        int[]
	//   21   41:astore_1        
		Arrays.fill(((int []) (s)), -1);
	//   22   42:aload_1         
	//   23   43:iconst_m1       
	//   24   44:invokestatic    #116 <Method void Arrays.fill(int[], int)>
		list = ((List) (zzdj.iterator()));
	//   25   47:aload_0         
	//   26   48:getfield        #104 <Field List zzdj>
	//   27   51:invokeinterface #122 <Method Iterator List.iterator()>
	//   28   56:astore_2        
		for(i = 0; ((Iterator) (list)).hasNext(); i++)
	//*  29   57:iconst_0        
	//*  30   58:istore          4
	//*  31   60:aload_2         
	//*  32   61:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//*  33   66:ifeq            125
		{
			list1 = ((List) (((String)((Iterator) (list)).next()).toCharArray()));
	//   34   69:aload_2         
	//   35   70:invokeinterface #132 <Method Object Iterator.next()>
	//   36   75:checkcast       #134 <Class String>
	//   37   78:invokevirtual   #138 <Method char[] String.toCharArray()>
	//   38   81:astore_3        
			int k = list1.length;
	//   39   82:aload_3         
	//   40   83:arraylength     
	//   41   84:istore          6
			for(j = 0; j < k; j++)
	//*  42   86:iconst_0        
	//*  43   87:istore          5
	//*  44   89:iload           5
	//*  45   91:iload           6
	//*  46   93:icmpge          116
				s[list1[j] - 32] = i;
	//   47   96:aload_1         
	//   48   97:aload_3         
	//   49   98:iload           5
	//   50  100:caload          
	//   51  101:bipush          32
	//   52  103:isub            
	//   53  104:iload           4
	//   54  106:iastore         

	//   55  107:iload           5
	//   56  109:iconst_1        
	//   57  110:iadd            
	//   58  111:istore          5
		}

	//   59  113:goto            89
	//   60  116:iload           4
	//   61  118:iconst_1        
	//   62  119:iadd            
	//   63  120:istore          4
	//*  64  122:goto            60
		zzdn = ((int []) (s));
	//   65  125:aload_0         
	//   66  126:aload_1         
	//   67  127:putfield        #140 <Field int[] zzdn>
	//   68  130:aload_0         
	//   69  131:new             #142 <Class SecureRandom>
	//   70  134:dup             
	//   71  135:invokespecial   #143 <Method void SecureRandom()>
	//   72  138:putfield        #145 <Field Random zzdo>
	//   73  141:return          
	}

	private static String zzd(Collection collection)
	{
		char ac[] = new char[collection.size()];
	//    0    0:aload_0         
	//    1    1:invokeinterface #156 <Method int Collection.size()>
	//    2    6:newarray        char[]
	//    3    8:astore_2        
		collection = ((Collection) (collection.iterator()));
	//    4    9:aload_0         
	//    5   10:invokeinterface #157 <Method Iterator Collection.iterator()>
	//    6   15:astore_0        
		for(int i = 0; ((Iterator) (collection)).hasNext(); i++)
	//*   7   16:iconst_0        
	//*   8   17:istore_1        
	//*   9   18:aload_0         
	//*  10   19:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//*  11   24:ifeq            49
			ac[i] = ((Character)((Iterator) (collection)).next()).charValue();
	//   12   27:aload_2         
	//   13   28:iload_1         
	//   14   29:aload_0         
	//   15   30:invokeinterface #132 <Method Object Iterator.next()>
	//   16   35:checkcast       #159 <Class Character>
	//   17   38:invokevirtual   #163 <Method char Character.charValue()>
	//   18   41:castore         

	//   19   42:iload_1         
	//   20   43:iconst_1        
	//   21   44:iadd            
	//   22   45:istore_1        
	//*  23   46:goto            18
		return new String(ac);
	//   24   49:new             #134 <Class String>
	//   25   52:dup             
	//   26   53:aload_2         
	//   27   54:invokespecial   #166 <Method void String(char[])>
	//   28   57:areturn         
	}

	private static boolean zzd(int i, int j, int k)
	{
		return i < 32 || i > 126;
	//    0    0:iload_0         
	//    1    1:bipush          32
	//    2    3:icmplt          17
	//    3    6:iload_0         
	//    4    7:bipush          126
	//    5    9:icmple          15
	//    6   12:goto            17
	//    7   15:iconst_0        
	//    8   16:ireturn         
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	static String zze(Collection collection)
	{
		return zzd(collection);
	//    0    0:aload_0         
	//    1    1:invokestatic    #170 <Method String zzd(Collection)>
	//    2    4:areturn         
	}

	static boolean zze(int i, int j, int k)
	{
		return zzd(i, 32, 126);
	//    0    0:iload_0         
	//    1    1:bipush          32
	//    2    3:bipush          126
	//    3    5:invokestatic    #172 <Method boolean zzd(int, int, int)>
	//    4    8:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #180 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 1, zzdi, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #96  <Field String zzdi>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #184 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeStringList(parcel, 2, zzdj, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #104 <Field List zzdj>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #188 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeIntegerList(parcel, 3, zzdk, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #106 <Field List zzdk>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #191 <Method void SafeParcelWriter.writeIntegerList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeInt(parcel, 4, zzdl);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:getfield        #108 <Field int zzdl>
	//   25   41:invokestatic    #195 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 5, zzdm);
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:getfield        #110 <Field int zzdm>
	//   30   50:invokestatic    #195 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   31   53:aload_1         
	//   32   54:iload_2         
	//   33   55:invokestatic    #198 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   34   58:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzm();
	public static final PasswordSpecification zzdg = (new zzd()).zzd(12, 16).zze("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").zzd("abcdefghijkmnopqrstxyz", 1).zzd("ABCDEFGHJKLMNPQRSTXY", 1).zzd("3456789", 1).zzj();
	private static final PasswordSpecification zzdh = (new zzd()).zzd(12, 16).zze("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").zzd("abcdefghijklmnopqrstuvwxyz", 1).zzd("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).zzd("1234567890", 1).zzj();
	private final String zzdi;
	private final List zzdj;
	private final List zzdk;
	private final int zzdl;
	private final int zzdm;
	private final int zzdn[];
	private final Random zzdo = new SecureRandom();

	static 
	{
	//    0    0:new             #50  <Class zzm>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void zzm()>
	//    3    7:putstatic       #55  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:new             #8   <Class PasswordSpecification$zzd>
	//    5   13:dup             
	//    6   14:invokespecial   #56  <Method void PasswordSpecification$zzd()>
	//    7   17:bipush          12
	//    8   19:bipush          16
	//    9   21:invokevirtual   #59  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zzd(int, int)>
	//   10   24:ldc1            #61  <String "abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789">
	//   11   26:invokevirtual   #64  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zze(String)>
	//   12   29:ldc1            #66  <String "abcdefghijkmnopqrstxyz">
	//   13   31:iconst_1        
	//   14   32:invokevirtual   #69  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zzd(String, int)>
	//   15   35:ldc1            #71  <String "ABCDEFGHJKLMNPQRSTXY">
	//   16   37:iconst_1        
	//   17   38:invokevirtual   #69  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zzd(String, int)>
	//   18   41:ldc1            #73  <String "3456789">
	//   19   43:iconst_1        
	//   20   44:invokevirtual   #69  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zzd(String, int)>
	//   21   47:invokevirtual   #77  <Method PasswordSpecification PasswordSpecification$zzd.zzj()>
	//   22   50:putstatic       #79  <Field PasswordSpecification zzdg>
	//   23   53:new             #8   <Class PasswordSpecification$zzd>
	//   24   56:dup             
	//   25   57:invokespecial   #56  <Method void PasswordSpecification$zzd()>
	//   26   60:bipush          12
	//   27   62:bipush          16
	//   28   64:invokevirtual   #59  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zzd(int, int)>
	//   29   67:ldc1            #81  <String "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890">
	//   30   69:invokevirtual   #64  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zze(String)>
	//   31   72:ldc1            #83  <String "abcdefghijklmnopqrstuvwxyz">
	//   32   74:iconst_1        
	//   33   75:invokevirtual   #69  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zzd(String, int)>
	//   34   78:ldc1            #85  <String "ABCDEFGHIJKLMNOPQRSTUVWXYZ">
	//   35   80:iconst_1        
	//   36   81:invokevirtual   #69  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zzd(String, int)>
	//   37   84:ldc1            #87  <String "1234567890">
	//   38   86:iconst_1        
	//   39   87:invokevirtual   #69  <Method PasswordSpecification$zzd PasswordSpecification$zzd.zzd(String, int)>
	//   40   90:invokevirtual   #77  <Method PasswordSpecification PasswordSpecification$zzd.zzj()>
	//   41   93:putstatic       #89  <Field PasswordSpecification zzdh>
	//*  42   96:return          
	}
}
