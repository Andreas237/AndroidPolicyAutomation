// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.*;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			DataHolderCreator, zza

public final class DataHolder extends AbstractSafeParcelable
	implements Closeable
{
	public static class Builder
	{

		static String[] zza(Builder builder1)
		{
			return builder1.zznm;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field String[] zznm>
		//    2    4:areturn         
		}

		static ArrayList zzb(Builder builder1)
		{
			return builder1.zznu;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ArrayList zznu>
		//    2    4:areturn         
		}

		private final boolean zzg(String s)
		{
			Asserts.checkNotNull(((Object) (s)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #65  <Method void Asserts.checkNotNull(Object)>
			return zznx && s.equals(((Object) (zzny)));
		//    2    4:aload_0         
		//    3    5:getfield        #48  <Field boolean zznx>
		//    4    8:ifeq            24
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #50  <Field String zzny>
		//    8   16:invokevirtual   #71  <Method boolean String.equals(Object)>
		//    9   19:ifeq            24
		//   10   22:iconst_1        
		//   11   23:ireturn         
		//   12   24:iconst_0        
		//   13   25:ireturn         
		}

		public DataHolder build(int i)
		{
			return new DataHolder(this, i, ((Bundle) (null)), ((com.google.android.gms.common.data.zza) (null)));
		//    0    0:new             #6   <Class DataHolder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:aconst_null     
		//    5    7:aconst_null     
		//    6    8:invokespecial   #76  <Method void DataHolder(DataHolder$Builder, int, Bundle, zza)>
		//    7   11:areturn         
		}

		public DataHolder build(int i, Bundle bundle)
		{
			return new DataHolder(this, i, bundle, -1, ((com.google.android.gms.common.data.zza) (null)));
		//    0    0:new             #6   <Class DataHolder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:aload_2         
		//    5    7:iconst_m1       
		//    6    8:aconst_null     
		//    7    9:invokespecial   #80  <Method void DataHolder(DataHolder$Builder, int, Bundle, int, zza)>
		//    8   12:areturn         
		}

		public DataHolder build(int i, Bundle bundle, int j)
		{
			return new DataHolder(this, i, bundle, j, ((com.google.android.gms.common.data.zza) (null)));
		//    0    0:new             #6   <Class DataHolder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:aload_2         
		//    5    7:iload_3         
		//    6    8:aconst_null     
		//    7    9:invokespecial   #80  <Method void DataHolder(DataHolder$Builder, int, Bundle, int, zza)>
		//    8   12:areturn         
		}

		public boolean containsRowWithValue(String s, Object obj)
		{
			int j = zznu.size();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ArrayList zznu>
		//    2    4:invokevirtual   #87  <Method int ArrayList.size()>
		//    3    7:istore          4
			for(int i = 0; i < j; i++)
		//*   4    9:iconst_0        
		//*   5   10:istore_3        
		//*   6   11:iload_3         
		//*   7   12:iload           4
		//*   8   14:icmpge          48
				if(Objects.equal(((HashMap)zznu.get(i)).get(((Object) (s))), obj))
		//*   9   17:aload_0         
		//*  10   18:getfield        #39  <Field ArrayList zznu>
		//*  11   21:iload_3         
		//*  12   22:invokevirtual   #91  <Method Object ArrayList.get(int)>
		//*  13   25:checkcast       #43  <Class HashMap>
		//*  14   28:aload_1         
		//*  15   29:invokevirtual   #93  <Method Object HashMap.get(Object)>
		//*  16   32:aload_2         
		//*  17   33:invokestatic    #99  <Method boolean Objects.equal(Object, Object)>
		//*  18   36:ifeq            41
					return true;
		//   19   39:iconst_1        
		//   20   40:ireturn         

		//   21   41:iload_3         
		//   22   42:iconst_1        
		//   23   43:iadd            
		//   24   44:istore_3        
		//*  25   45:goto            11
			return false;
		//   26   48:iconst_0        
		//   27   49:ireturn         
		}

		public Builder descendingSort(String s)
		{
			if(zzg(s))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokespecial   #103 <Method boolean zzg(String)>
		//*   3    5:ifeq            10
			{
				return this;
		//    4    8:aload_0         
		//    5    9:areturn         
			} else
			{
				sort(s);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #106 <Method DataHolder$Builder sort(String)>
		//    9   15:pop             
				Collections.reverse(((List) (zznu)));
		//   10   16:aload_0         
		//   11   17:getfield        #39  <Field ArrayList zznu>
		//   12   20:invokestatic    #112 <Method void Collections.reverse(List)>
				return this;
		//   13   23:aload_0         
		//   14   24:areturn         
			}
		}

		public int getCount()
		{
			return zznu.size();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ArrayList zznu>
		//    2    4:invokevirtual   #87  <Method int ArrayList.size()>
		//    3    7:ireturn         
		}

		public void modifyUniqueRowValue(Object obj, String s, Object obj1)
		{
			if(zznv == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field String zznv>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			obj = ((Object) ((Integer)zznw.get(obj)));
		//    4    8:aload_0         
		//    5    9:getfield        #46  <Field HashMap zznw>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #93  <Method Object HashMap.get(Object)>
		//    8   16:checkcast       #117 <Class Integer>
		//    9   19:astore_1        
			if(obj == null)
		//*  10   20:aload_1         
		//*  11   21:ifnonnull       25
			{
				return;
		//   12   24:return          
			} else
			{
				((HashMap)zznu.get(((Integer) (obj)).intValue())).put(((Object) (s)), obj1);
		//   13   25:aload_0         
		//   14   26:getfield        #39  <Field ArrayList zznu>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #120 <Method int Integer.intValue()>
		//   17   33:invokevirtual   #91  <Method Object ArrayList.get(int)>
		//   18   36:checkcast       #43  <Class HashMap>
		//   19   39:aload_2         
		//   20   40:aload_3         
		//   21   41:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
		//   22   44:pop             
				return;
		//   23   45:return          
			}
		}

		public Builder removeRowsWithValue(String s, Object obj)
		{
			for(int i = zznu.size() - 1; i >= 0; i--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #39  <Field ArrayList zznu>
		//*   2    4:invokevirtual   #87  <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore_3        
		//*   6   10:iload_3         
		//*   7   11:iflt            52
				if(Objects.equal(((HashMap)zznu.get(i)).get(((Object) (s))), obj))
		//*   8   14:aload_0         
		//*   9   15:getfield        #39  <Field ArrayList zznu>
		//*  10   18:iload_3         
		//*  11   19:invokevirtual   #91  <Method Object ArrayList.get(int)>
		//*  12   22:checkcast       #43  <Class HashMap>
		//*  13   25:aload_1         
		//*  14   26:invokevirtual   #93  <Method Object HashMap.get(Object)>
		//*  15   29:aload_2         
		//*  16   30:invokestatic    #99  <Method boolean Objects.equal(Object, Object)>
		//*  17   33:ifeq            45
					zznu.remove(i);
		//   18   36:aload_0         
		//   19   37:getfield        #39  <Field ArrayList zznu>
		//   20   40:iload_3         
		//   21   41:invokevirtual   #129 <Method Object ArrayList.remove(int)>
		//   22   44:pop             

		//   23   45:iload_3         
		//   24   46:iconst_1        
		//   25   47:isub            
		//   26   48:istore_3        
		//*  27   49:goto            10
			return this;
		//   28   52:aload_0         
		//   29   53:areturn         
		}

		public Builder sort(String s)
		{
			if(zzg(s))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokespecial   #103 <Method boolean zzg(String)>
		//*   3    5:ifeq            10
				return this;
		//    4    8:aload_0         
		//    5    9:areturn         
			Collections.sort(((List) (zznu)), ((Comparator) (new zza(s))));
		//    6   10:aload_0         
		//    7   11:getfield        #39  <Field ArrayList zznu>
		//    8   14:new             #131 <Class DataHolder$zza>
		//    9   17:dup             
		//   10   18:aload_1         
		//   11   19:invokespecial   #134 <Method void DataHolder$zza(String)>
		//   12   22:invokestatic    #137 <Method void Collections.sort(List, Comparator)>
			if(zznv != null)
		//*  13   25:aload_0         
		//*  14   26:getfield        #41  <Field String zznv>
		//*  15   29:ifnull          100
			{
				zznw.clear();
		//   16   32:aload_0         
		//   17   33:getfield        #46  <Field HashMap zznw>
		//   18   36:invokevirtual   #140 <Method void HashMap.clear()>
				int i = 0;
		//   19   39:iconst_0        
		//   20   40:istore_2        
				for(int j = zznu.size(); i < j; i++)
		//*  21   41:aload_0         
		//*  22   42:getfield        #39  <Field ArrayList zznu>
		//*  23   45:invokevirtual   #87  <Method int ArrayList.size()>
		//*  24   48:istore_3        
		//*  25   49:iload_2         
		//*  26   50:iload_3         
		//*  27   51:icmpge          100
				{
					Object obj = ((HashMap)zznu.get(i)).get(((Object) (zznv)));
		//   28   54:aload_0         
		//   29   55:getfield        #39  <Field ArrayList zznu>
		//   30   58:iload_2         
		//   31   59:invokevirtual   #91  <Method Object ArrayList.get(int)>
		//   32   62:checkcast       #43  <Class HashMap>
		//   33   65:aload_0         
		//   34   66:getfield        #41  <Field String zznv>
		//   35   69:invokevirtual   #93  <Method Object HashMap.get(Object)>
		//   36   72:astore          4
					if(obj != null)
		//*  37   74:aload           4
		//*  38   76:ifnull          93
						zznw.put(obj, ((Object) (Integer.valueOf(i))));
		//   39   79:aload_0         
		//   40   80:getfield        #46  <Field HashMap zznw>
		//   41   83:aload           4
		//   42   85:iload_2         
		//   43   86:invokestatic    #144 <Method Integer Integer.valueOf(int)>
		//   44   89:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
		//   45   92:pop             
				}

		//   46   93:iload_2         
		//   47   94:iconst_1        
		//   48   95:iadd            
		//   49   96:istore_2        
			}
		//*  50   97:goto            49
			zznx = true;
		//   51  100:aload_0         
		//   52  101:iconst_1        
		//   53  102:putfield        #48  <Field boolean zznx>
			zzny = s;
		//   54  105:aload_0         
		//   55  106:aload_1         
		//   56  107:putfield        #50  <Field String zzny>
			return this;
		//   57  110:aload_0         
		//   58  111:areturn         
		}

		public Builder withRow(ContentValues contentvalues)
		{
			Asserts.checkNotNull(((Object) (contentvalues)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #65  <Method void Asserts.checkNotNull(Object)>
			HashMap hashmap = new HashMap(contentvalues.size());
		//    2    4:new             #43  <Class HashMap>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokevirtual   #149 <Method int ContentValues.size()>
		//    6   12:invokespecial   #152 <Method void HashMap(int)>
		//    7   15:astore_2        
			java.util.Map.Entry entry;
			for(contentvalues = ((ContentValues) (contentvalues.valueSet().iterator())); ((Iterator) (contentvalues)).hasNext(); hashmap.put(((Object) ((String)entry.getKey())), entry.getValue()))
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #156 <Method Set ContentValues.valueSet()>
		//*  10   20:invokeinterface #162 <Method Iterator Set.iterator()>
		//*  11   25:astore_1        
		//*  12   26:aload_1         
		//*  13   27:invokeinterface #168 <Method boolean Iterator.hasNext()>
		//*  14   32:ifeq            68
				entry = (java.util.Map.Entry)((Iterator) (contentvalues)).next();
		//   15   35:aload_1         
		//   16   36:invokeinterface #172 <Method Object Iterator.next()>
		//   17   41:checkcast       #174 <Class java.util.Map$Entry>
		//   18   44:astore_3        

		//   19   45:aload_2         
		//   20   46:aload_3         
		//   21   47:invokeinterface #177 <Method Object java.util.Map$Entry.getKey()>
		//   22   52:checkcast       #67  <Class String>
		//   23   55:aload_3         
		//   24   56:invokeinterface #180 <Method Object java.util.Map$Entry.getValue()>
		//   25   61:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
		//   26   64:pop             
		//*  27   65:goto            26
			return withRow(hashmap);
		//   28   68:aload_0         
		//   29   69:aload_2         
		//   30   70:invokevirtual   #183 <Method DataHolder$Builder withRow(HashMap)>
		//   31   73:areturn         
		}

		public Builder withRow(HashMap hashmap)
		{
			Asserts.checkNotNull(((Object) (hashmap)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #65  <Method void Asserts.checkNotNull(Object)>
			if(zznv != null) goto _L2; else goto _L1
		//    2    4:aload_0         
		//    3    5:getfield        #41  <Field String zznv>
		//    4    8:ifnonnull       16
_L1:
			int i;
			i = -1;
		//    5   11:iconst_m1       
		//    6   12:istore_2        
			break MISSING_BLOCK_LABEL_78;
		//    7   13:goto            78
_L2:
			Integer integer;
			Object obj = hashmap.get(((Object) (zznv)));
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #41  <Field String zznv>
		//   11   21:invokevirtual   #93  <Method Object HashMap.get(Object)>
		//   12   24:astore_3        
			if(obj == null)
		//*  13   25:aload_3         
		//*  14   26:ifnonnull       32
				continue; /* Loop/switch isn't completed */
		//   15   29:goto            11
			integer = (Integer)zznw.get(obj);
		//   16   32:aload_0         
		//   17   33:getfield        #46  <Field HashMap zznw>
		//   18   36:aload_3         
		//   19   37:invokevirtual   #93  <Method Object HashMap.get(Object)>
		//   20   40:checkcast       #117 <Class Integer>
		//   21   43:astore          4
			if(integer != null)
				break; /* Loop/switch isn't completed */
		//   22   45:aload           4
		//   23   47:ifnonnull       72
			zznw.put(obj, ((Object) (Integer.valueOf(zznu.size()))));
		//   24   50:aload_0         
		//   25   51:getfield        #46  <Field HashMap zznw>
		//   26   54:aload_3         
		//   27   55:aload_0         
		//   28   56:getfield        #39  <Field ArrayList zznu>
		//   29   59:invokevirtual   #87  <Method int ArrayList.size()>
		//   30   62:invokestatic    #144 <Method Integer Integer.valueOf(int)>
		//   31   65:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
		//   32   68:pop             
			if(true) goto _L1; else goto _L3
		//   33   69:goto            11
_L3:
			i = integer.intValue();
		//   34   72:aload           4
		//   35   74:invokevirtual   #120 <Method int Integer.intValue()>
		//   36   77:istore_2        
			if(i == -1)
		//*  37   78:iload_2         
		//*  38   79:iconst_m1       
		//*  39   80:icmpne          95
			{
				zznu.add(((Object) (hashmap)));
		//   40   83:aload_0         
		//   41   84:getfield        #39  <Field ArrayList zznu>
		//   42   87:aload_1         
		//   43   88:invokevirtual   #186 <Method boolean ArrayList.add(Object)>
		//   44   91:pop             
			} else
		//*  45   92:goto            113
			{
				zznu.remove(i);
		//   46   95:aload_0         
		//   47   96:getfield        #39  <Field ArrayList zznu>
		//   48   99:iload_2         
		//   49  100:invokevirtual   #129 <Method Object ArrayList.remove(int)>
		//   50  103:pop             
				zznu.add(i, ((Object) (hashmap)));
		//   51  104:aload_0         
		//   52  105:getfield        #39  <Field ArrayList zznu>
		//   53  108:iload_2         
		//   54  109:aload_1         
		//   55  110:invokevirtual   #189 <Method void ArrayList.add(int, Object)>
			}
			zznx = false;
		//   56  113:aload_0         
		//   57  114:iconst_0        
		//   58  115:putfield        #48  <Field boolean zznx>
			return this;
		//   59  118:aload_0         
		//   60  119:areturn         
		}

		private final String zznm[];
		private final ArrayList zznu;
		private final String zznv;
		private final HashMap zznw;
		private boolean zznx;
		private String zzny;

		private Builder(String as[], String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			zznm = (String[])Preconditions.checkNotNull(((Object) (as)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #32  <Class String[]>
		//    6   12:putfield        #34  <Field String[] zznm>
			zznu = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #36  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #37  <Method void ArrayList()>
		//   11   23:putfield        #39  <Field ArrayList zznu>
			zznv = s;
		//   12   26:aload_0         
		//   13   27:aload_2         
		//   14   28:putfield        #41  <Field String zznv>
			zznw = new HashMap();
		//   15   31:aload_0         
		//   16   32:new             #43  <Class HashMap>
		//   17   35:dup             
		//   18   36:invokespecial   #44  <Method void HashMap()>
		//   19   39:putfield        #46  <Field HashMap zznw>
			zznx = false;
		//   20   42:aload_0         
		//   21   43:iconst_0        
		//   22   44:putfield        #48  <Field boolean zznx>
			zzny = null;
		//   23   47:aload_0         
		//   24   48:aconst_null     
		//   25   49:putfield        #50  <Field String zzny>
		//   26   52:return          
		}

		Builder(String as[], String s, com.google.android.gms.common.data.zza zza1)
		{
			this(as, s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #54  <Method void DataHolder$Builder(String[], String)>
		//    4    6:return          
		}
	}

	public static class DataHolderException extends RuntimeException
	{

		public DataHolderException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void RuntimeException(String)>
		//    3    5:return          
		}
	}

	private static final class zza
		implements Comparator
	{

		public final int compare(Object obj, Object obj1)
		{
			obj = ((Object) ((HashMap)obj));
		//    0    0:aload_1         
		//    1    1:checkcast       #32  <Class HashMap>
		//    2    4:astore_1        
			obj1 = ((Object) ((HashMap)obj1));
		//    3    5:aload_2         
		//    4    6:checkcast       #32  <Class HashMap>
		//    5    9:astore_2        
			obj = Preconditions.checkNotNull(((HashMap) (obj)).get(((Object) (zznz))));
		//    6   10:aload_1         
		//    7   11:aload_0         
		//    8   12:getfield        #27  <Field String zznz>
		//    9   15:invokevirtual   #35  <Method Object HashMap.get(Object)>
		//   10   18:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
		//   11   21:astore_1        
			obj1 = Preconditions.checkNotNull(((HashMap) (obj1)).get(((Object) (zznz))));
		//   12   22:aload_2         
		//   13   23:aload_0         
		//   14   24:getfield        #27  <Field String zznz>
		//   15   27:invokevirtual   #35  <Method Object HashMap.get(Object)>
		//   16   30:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
		//   17   33:astore_2        
			if(obj.equals(obj1))
		//*  18   34:aload_1         
		//*  19   35:aload_2         
		//*  20   36:invokevirtual   #39  <Method boolean Object.equals(Object)>
		//*  21   39:ifeq            44
				return 0;
		//   22   42:iconst_0        
		//   23   43:ireturn         
			if(obj instanceof Boolean)
		//*  24   44:aload_1         
		//*  25   45:instanceof      #41  <Class Boolean>
		//*  26   48:ifeq            63
				return ((Boolean)obj).compareTo((Boolean)obj1);
		//   27   51:aload_1         
		//   28   52:checkcast       #41  <Class Boolean>
		//   29   55:aload_2         
		//   30   56:checkcast       #41  <Class Boolean>
		//   31   59:invokevirtual   #45  <Method int Boolean.compareTo(Boolean)>
		//   32   62:ireturn         
			if(obj instanceof Long)
		//*  33   63:aload_1         
		//*  34   64:instanceof      #47  <Class Long>
		//*  35   67:ifeq            82
				return ((Long)obj).compareTo((Long)obj1);
		//   36   70:aload_1         
		//   37   71:checkcast       #47  <Class Long>
		//   38   74:aload_2         
		//   39   75:checkcast       #47  <Class Long>
		//   40   78:invokevirtual   #50  <Method int Long.compareTo(Long)>
		//   41   81:ireturn         
			if(obj instanceof Integer)
		//*  42   82:aload_1         
		//*  43   83:instanceof      #52  <Class Integer>
		//*  44   86:ifeq            101
				return ((Integer)obj).compareTo((Integer)obj1);
		//   45   89:aload_1         
		//   46   90:checkcast       #52  <Class Integer>
		//   47   93:aload_2         
		//   48   94:checkcast       #52  <Class Integer>
		//   49   97:invokevirtual   #55  <Method int Integer.compareTo(Integer)>
		//   50  100:ireturn         
			if(obj instanceof String)
		//*  51  101:aload_1         
		//*  52  102:instanceof      #25  <Class String>
		//*  53  105:ifeq            120
				return ((String)obj).compareTo((String)obj1);
		//   54  108:aload_1         
		//   55  109:checkcast       #25  <Class String>
		//   56  112:aload_2         
		//   57  113:checkcast       #25  <Class String>
		//   58  116:invokevirtual   #58  <Method int String.compareTo(String)>
		//   59  119:ireturn         
			if(obj instanceof Double)
		//*  60  120:aload_1         
		//*  61  121:instanceof      #60  <Class Double>
		//*  62  124:ifeq            139
				return ((Double)obj).compareTo((Double)obj1);
		//   63  127:aload_1         
		//   64  128:checkcast       #60  <Class Double>
		//   65  131:aload_2         
		//   66  132:checkcast       #60  <Class Double>
		//   67  135:invokevirtual   #63  <Method int Double.compareTo(Double)>
		//   68  138:ireturn         
			if(obj instanceof Float)
		//*  69  139:aload_1         
		//*  70  140:instanceof      #65  <Class Float>
		//*  71  143:ifeq            158
			{
				return ((Float)obj).compareTo((Float)obj1);
		//   72  146:aload_1         
		//   73  147:checkcast       #65  <Class Float>
		//   74  150:aload_2         
		//   75  151:checkcast       #65  <Class Float>
		//   76  154:invokevirtual   #68  <Method int Float.compareTo(Float)>
		//   77  157:ireturn         
			} else
			{
				obj = ((Object) (String.valueOf(obj)));
		//   78  158:aload_1         
		//   79  159:invokestatic    #72  <Method String String.valueOf(Object)>
		//   80  162:astore_1        
				obj1 = ((Object) (new StringBuilder(24 + String.valueOf(obj).length())));
		//   81  163:new             #74  <Class StringBuilder>
		//   82  166:dup             
		//   83  167:bipush          24
		//   84  169:aload_1         
		//   85  170:invokestatic    #72  <Method String String.valueOf(Object)>
		//   86  173:invokevirtual   #78  <Method int String.length()>
		//   87  176:iadd            
		//   88  177:invokespecial   #81  <Method void StringBuilder(int)>
		//   89  180:astore_2        
				((StringBuilder) (obj1)).append("Unknown type for lValue ");
		//   90  181:aload_2         
		//   91  182:ldc1            #83  <String "Unknown type for lValue ">
		//   92  184:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
		//   93  187:pop             
				((StringBuilder) (obj1)).append(((String) (obj)));
		//   94  188:aload_2         
		//   95  189:aload_1         
		//   96  190:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
		//   97  193:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
		//   98  194:new             #89  <Class IllegalArgumentException>
		//   99  197:dup             
		//  100  198:aload_2         
		//  101  199:invokevirtual   #93  <Method String StringBuilder.toString()>
		//  102  202:invokespecial   #95  <Method void IllegalArgumentException(String)>
		//  103  205:athrow          
			}
		}

		private final String zznz;

		zza(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zznz = (String)Preconditions.checkNotNull(((Object) (s)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #25  <Class String>
		//    6   12:putfield        #27  <Field String zznz>
		//    7   15:return          
		}
	}


	DataHolder(int i, String as[], CursorWindow acursorwindow[], int j, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void AbstractSafeParcelable()>
		mClosed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #79  <Field boolean mClosed>
		zzns = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #81  <Field boolean zzns>
		zzal = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #83  <Field int zzal>
		zznm = as;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #85  <Field String[] zznm>
		zzno = acursorwindow;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #87  <Field CursorWindow[] zzno>
		zzam = j;
	//   17   29:aload_0         
	//   18   30:iload           4
	//   19   32:putfield        #89  <Field int zzam>
		zznp = bundle;
	//   20   35:aload_0         
	//   21   36:aload           5
	//   22   38:putfield        #91  <Field Bundle zznp>
	//   23   41:return          
	}

	public DataHolder(Cursor cursor, int i, Bundle bundle)
	{
		this(new CursorWrapper(cursor), i, bundle);
	//    0    0:aload_0         
	//    1    1:new             #96  <Class CursorWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #99  <Method void CursorWrapper(Cursor)>
	//    5    9:iload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #102 <Method void DataHolder(CursorWrapper, int, Bundle)>
	//    8   14:return          
	}

	private DataHolder(Builder builder1, int i, Bundle bundle)
	{
		this(Builder.zza(builder1), zza(builder1, -1), i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:invokestatic    #109 <Method CursorWindow[] zza(DataHolder$Builder, int)>
	//    6   10:iload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #112 <Method void DataHolder(String[], CursorWindow[], int, Bundle)>
	//    9   15:return          
	}

	private DataHolder(Builder builder1, int i, Bundle bundle, int j)
	{
		this(Builder.zza(builder1), zza(builder1, j), i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//    3    5:aload_1         
	//    4    6:iload           4
	//    5    8:invokestatic    #109 <Method CursorWindow[] zza(DataHolder$Builder, int)>
	//    6   11:iload_2         
	//    7   12:aload_3         
	//    8   13:invokespecial   #112 <Method void DataHolder(String[], CursorWindow[], int, Bundle)>
	//    9   16:return          
	}

	DataHolder(Builder builder1, int i, Bundle bundle, int j, com.google.android.gms.common.data.zza zza1)
	{
		this(builder1, i, bundle, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #116 <Method void DataHolder(DataHolder$Builder, int, Bundle, int)>
	//    6    9:return          
	}

	DataHolder(Builder builder1, int i, Bundle bundle, com.google.android.gms.common.data.zza zza1)
	{
		this(builder1, i, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #119 <Method void DataHolder(DataHolder$Builder, int, Bundle)>
	//    5    7:return          
	}

	public DataHolder(CursorWrapper cursorwrapper, int i, Bundle bundle)
	{
		this(cursorwrapper.getColumnNames(), zza(cursorwrapper), i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #123 <Method String[] CursorWrapper.getColumnNames()>
	//    3    5:aload_1         
	//    4    6:invokestatic    #126 <Method CursorWindow[] zza(CursorWrapper)>
	//    5    9:iload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #112 <Method void DataHolder(String[], CursorWindow[], int, Bundle)>
	//    8   14:return          
	}

	public DataHolder(String as[], CursorWindow acursorwindow[], int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void AbstractSafeParcelable()>
		mClosed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #79  <Field boolean mClosed>
		zzns = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #81  <Field boolean zzns>
		zzal = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #83  <Field int zzal>
		zznm = (String[])Preconditions.checkNotNull(((Object) (as)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object)>
	//   14   24:checkcast       #133 <Class String[]>
	//   15   27:putfield        #85  <Field String[] zznm>
		zzno = (CursorWindow[])Preconditions.checkNotNull(((Object) (acursorwindow)));
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object)>
	//   19   35:checkcast       #134 <Class CursorWindow[]>
	//   20   38:putfield        #87  <Field CursorWindow[] zzno>
		zzam = i;
	//   21   41:aload_0         
	//   22   42:iload_3         
	//   23   43:putfield        #89  <Field int zzam>
		zznp = bundle;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #91  <Field Bundle zznp>
		validateContents();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #137 <Method void validateContents()>
	//   29   56:return          
	}

	public static Builder builder(String as[])
	{
		return new Builder(as, ((String) (null)), ((com.google.android.gms.common.data.zza) (null)));
	//    0    0:new             #8   <Class DataHolder$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #142 <Method void DataHolder$Builder(String[], String, zza)>
	//    6   10:areturn         
	}

	public static Builder builder(String as[], String s)
	{
		Preconditions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		return new Builder(as, s, ((com.google.android.gms.common.data.zza) (null)));
	//    3    5:new             #8   <Class DataHolder$Builder>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #142 <Method void DataHolder$Builder(String[], String, zza)>
	//    9   15:areturn         
	}

	public static DataHolder empty(int i)
	{
		return empty(i, ((Bundle) (null)));
	//    0    0:iload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #148 <Method DataHolder empty(int, Bundle)>
	//    3    5:areturn         
	}

	public static DataHolder empty(int i, Bundle bundle)
	{
		return new DataHolder(zznt, i, bundle);
	//    0    0:new             #2   <Class DataHolder>
	//    1    3:dup             
	//    2    4:getstatic       #72  <Field DataHolder$Builder zznt>
	//    3    7:iload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #119 <Method void DataHolder(DataHolder$Builder, int, Bundle)>
	//    6   12:areturn         
	}

	private final void zza(String s, int i)
	{
		if(zznn != null && zznn.containsKey(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field Bundle zznn>
	//*   2    4:ifnull          67
	//*   3    7:aload_0         
	//*   4    8:getfield        #151 <Field Bundle zznn>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//*   7   15:ifne            21
	//*   8   18:goto            67
		{
			if(isClosed())
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #161 <Method boolean isClosed()>
	//*  11   25:ifeq            38
				throw new IllegalArgumentException("Buffer is closed.");
	//   12   28:new             #163 <Class IllegalArgumentException>
	//   13   31:dup             
	//   14   32:ldc1            #165 <String "Buffer is closed.">
	//   15   34:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   16   37:athrow          
			if(i >= 0 && i < zznr)
	//*  17   38:iload_2         
	//*  18   39:iflt            54
	//*  19   42:iload_2         
	//*  20   43:aload_0         
	//*  21   44:getfield        #170 <Field int zznr>
	//*  22   47:icmplt          53
	//*  23   50:goto            54
				return;
	//   24   53:return          
			else
				throw new CursorIndexOutOfBoundsException(i, zznr);
	//   25   54:new             #172 <Class CursorIndexOutOfBoundsException>
	//   26   57:dup             
	//   27   58:iload_2         
	//   28   59:aload_0         
	//   29   60:getfield        #170 <Field int zznr>
	//   30   63:invokespecial   #175 <Method void CursorIndexOutOfBoundsException(int, int)>
	//   31   66:athrow          
		}
		s = String.valueOf(((Object) (s)));
	//   32   67:aload_1         
	//   33   68:invokestatic    #179 <Method String String.valueOf(Object)>
	//   34   71:astore_1        
		if(s.length() != 0)
	//*  35   72:aload_1         
	//*  36   73:invokevirtual   #183 <Method int String.length()>
	//*  37   76:ifeq            89
			s = "No such column: ".concat(s);
	//   38   79:ldc1            #185 <String "No such column: ">
	//   39   81:aload_1         
	//   40   82:invokevirtual   #189 <Method String String.concat(String)>
	//   41   85:astore_1        
		else
	//*  42   86:goto            99
			s = new String("No such column: ");
	//   43   89:new             #67  <Class String>
	//   44   92:dup             
	//   45   93:ldc1            #185 <String "No such column: ">
	//   46   95:invokespecial   #190 <Method void String(String)>
	//   47   98:astore_1        
		throw new IllegalArgumentException(s);
	//   48   99:new             #163 <Class IllegalArgumentException>
	//   49  102:dup             
	//   50  103:aload_1         
	//   51  104:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   52  107:athrow          
	}

	private static CursorWindow[] zza(Builder builder1, int i)
	{
		int j;
		boolean flag;
		int l;
		Object obj1;
		Object obj2;
		ArrayList arraylist;
		String as[] = Builder.zza(builder1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//    2    4:astore          9
		flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		if(as.length == 0)
	//*   5    9:aload           9
	//*   6   11:arraylength     
	//*   7   12:ifne            20
			return new CursorWindow[0];
	//    8   15:iconst_0        
	//    9   16:anewarray       CursorWindow[]
	//   10   19:areturn         
		if(i >= 0 && i < Builder.zzb(builder1).size())
	//*  11   20:iload_1         
	//*  12   21:iflt            52
	//*  13   24:iload_1         
	//*  14   25:aload_0         
	//*  15   26:invokestatic    #198 <Method ArrayList DataHolder$Builder.zzb(DataHolder$Builder)>
	//*  16   29:invokevirtual   #203 <Method int ArrayList.size()>
	//*  17   32:icmplt          38
	//*  18   35:goto            52
			obj2 = ((Object) (Builder.zzb(builder1).subList(0, i)));
	//   19   38:aload_0         
	//   20   39:invokestatic    #198 <Method ArrayList DataHolder$Builder.zzb(DataHolder$Builder)>
	//   21   42:iconst_0        
	//   22   43:iload_1         
	//   23   44:invokevirtual   #207 <Method List ArrayList.subList(int, int)>
	//   24   47:astore          11
		else
	//*  25   49:goto            58
			obj2 = ((Object) (Builder.zzb(builder1)));
	//   26   52:aload_0         
	//   27   53:invokestatic    #198 <Method ArrayList DataHolder$Builder.zzb(DataHolder$Builder)>
	//   28   56:astore          11
		l = ((List) (obj2)).size();
	//   29   58:aload           11
	//   30   60:invokeinterface #210 <Method int List.size()>
	//   31   65:istore          5
		obj1 = ((Object) (new CursorWindow(false)));
	//   32   67:new             #194 <Class CursorWindow>
	//   33   70:dup             
	//   34   71:iconst_0        
	//   35   72:invokespecial   #213 <Method void CursorWindow(boolean)>
	//   36   75:astore          10
		arraylist = new ArrayList();
	//   37   77:new             #200 <Class ArrayList>
	//   38   80:dup             
	//   39   81:invokespecial   #214 <Method void ArrayList()>
	//   40   84:astore          12
		arraylist.add(obj1);
	//   41   86:aload           12
	//   42   88:aload           10
	//   43   90:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   44   93:pop             
		((CursorWindow) (obj1)).setNumColumns(Builder.zza(builder1).length);
	//   45   94:aload           10
	//   46   96:aload_0         
	//   47   97:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//   48  100:arraylength     
	//   49  101:invokevirtual   #222 <Method boolean CursorWindow.setNumColumns(int)>
	//   50  104:pop             
		j = 0;
	//   51  105:iconst_0        
	//   52  106:istore_2        
		i = j;
	//   53  107:iload_2         
	//   54  108:istore_1        
_L10:
		if(i >= l) goto _L2; else goto _L1
	//   55  109:iload_1         
	//   56  110:iload           5
	//   57  112:icmpge          759
_L1:
		Object obj = obj1;
	//   58  115:aload           10
	//   59  117:astore          9
		if(((CursorWindow) (obj1)).allocRow())
			break MISSING_BLOCK_LABEL_253;
	//   60  119:aload           10
	//   61  121:invokevirtual   #225 <Method boolean CursorWindow.allocRow()>
	//   62  124:ifne            253
		obj = ((Object) (new StringBuilder(72)));
	//   63  127:new             #227 <Class StringBuilder>
	//   64  130:dup             
	//   65  131:bipush          72
	//   66  133:invokespecial   #230 <Method void StringBuilder(int)>
	//   67  136:astore          9
		((StringBuilder) (obj)).append("Allocating additional cursor window for large data set (row ");
	//   68  138:aload           9
	//   69  140:ldc1            #232 <String "Allocating additional cursor window for large data set (row ">
	//   70  142:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   71  145:pop             
		((StringBuilder) (obj)).append(i);
	//   72  146:aload           9
	//   73  148:iload_1         
	//   74  149:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   75  152:pop             
		((StringBuilder) (obj)).append(")");
	//   76  153:aload           9
	//   77  155:ldc1            #241 <String ")">
	//   78  157:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   79  160:pop             
		Log.d("DataHolder", ((StringBuilder) (obj)).toString());
	//   80  161:ldc1            #243 <String "DataHolder">
	//   81  163:aload           9
	//   82  165:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   83  168:invokestatic    #253 <Method int Log.d(String, String)>
	//   84  171:pop             
		obj1 = ((Object) (new CursorWindow(false)));
	//   85  172:new             #194 <Class CursorWindow>
	//   86  175:dup             
	//   87  176:iconst_0        
	//   88  177:invokespecial   #213 <Method void CursorWindow(boolean)>
	//   89  180:astore          10
		((CursorWindow) (obj1)).setStartPosition(i);
	//   90  182:aload           10
	//   91  184:iload_1         
	//   92  185:invokevirtual   #256 <Method void CursorWindow.setStartPosition(int)>
		((CursorWindow) (obj1)).setNumColumns(Builder.zza(builder1).length);
	//   93  188:aload           10
	//   94  190:aload_0         
	//   95  191:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//   96  194:arraylength     
	//   97  195:invokevirtual   #222 <Method boolean CursorWindow.setNumColumns(int)>
	//   98  198:pop             
		arraylist.add(obj1);
	//   99  199:aload           12
	//  100  201:aload           10
	//  101  203:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//  102  206:pop             
		obj = obj1;
	//  103  207:aload           10
	//  104  209:astore          9
		if(!((CursorWindow) (obj1)).allocRow())
	//* 105  211:aload           10
	//* 106  213:invokevirtual   #225 <Method boolean CursorWindow.allocRow()>
	//* 107  216:ifne            253
		{
			Log.e("DataHolder", "Unable to allocate row to hold data.");
	//  108  219:ldc1            #243 <String "DataHolder">
	//  109  221:ldc2            #258 <String "Unable to allocate row to hold data.">
	//  110  224:invokestatic    #261 <Method int Log.e(String, String)>
	//  111  227:pop             
			arraylist.remove(obj1);
	//  112  228:aload           12
	//  113  230:aload           10
	//  114  232:invokevirtual   #264 <Method boolean ArrayList.remove(Object)>
	//  115  235:pop             
			return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//  116  236:aload           12
	//  117  238:aload           12
	//  118  240:invokevirtual   #203 <Method int ArrayList.size()>
	//  119  243:anewarray       CursorWindow[]
	//  120  246:invokevirtual   #268 <Method Object[] ArrayList.toArray(Object[])>
	//  121  249:checkcast       #134 <Class CursorWindow[]>
	//  122  252:areturn         
		}
		Map map = (Map)((List) (obj2)).get(i);
	//  123  253:aload           11
	//  124  255:iload_1         
	//  125  256:invokeinterface #272 <Method Object List.get(int)>
	//  126  261:checkcast       #274 <Class Map>
	//  127  264:astore          13
		int k;
		boolean flag1;
		k = 0;
	//  128  266:iconst_0        
	//  129  267:istore_3        
		flag1 = true;
	//  130  268:iconst_1        
	//  131  269:istore          6
_L11:
		if(k >= Builder.zza(builder1).length || !flag1) goto _L4; else goto _L3
	//  132  271:iload_3         
	//  133  272:aload_0         
	//  134  273:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//  135  276:arraylength     
	//  136  277:icmpge          594
	//  137  280:iload           6
	//  138  282:ifeq            594
_L3:
		Object obj3;
		obj1 = ((Object) (Builder.zza(builder1)[k]));
	//  139  285:aload_0         
	//  140  286:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//  141  289:iload_3         
	//  142  290:aaload          
	//  143  291:astore          10
		obj3 = map.get(obj1);
	//  144  293:aload           13
	//  145  295:aload           10
	//  146  297:invokeinterface #276 <Method Object Map.get(Object)>
	//  147  302:astore          14
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_321;
	//  148  304:aload           14
	//  149  306:ifnonnull       321
		flag1 = ((CursorWindow) (obj)).putNull(i, k);
	//  150  309:aload           9
	//  151  311:iload_1         
	//  152  312:iload_3         
	//  153  313:invokevirtual   #280 <Method boolean CursorWindow.putNull(int, int)>
	//  154  316:istore          6
		break MISSING_BLOCK_LABEL_782;
	//  155  318:goto            782
		if(obj3 instanceof String)
	//* 156  321:aload           14
	//* 157  323:instanceof      #67  <Class String>
	//* 158  326:ifeq            346
		{
			flag1 = ((CursorWindow) (obj)).putString((String)obj3, i, k);
	//  159  329:aload           9
	//  160  331:aload           14
	//  161  333:checkcast       #67  <Class String>
	//  162  336:iload_1         
	//  163  337:iload_3         
	//  164  338:invokevirtual   #284 <Method boolean CursorWindow.putString(String, int, int)>
	//  165  341:istore          6
			break MISSING_BLOCK_LABEL_782;
	//  166  343:goto            782
		}
		if(!(obj3 instanceof Long)) goto _L6; else goto _L5
	//  167  346:aload           14
	//  168  348:instanceof      #286 <Class Long>
	//  169  351:ifeq            378
_L5:
		long l1 = ((Long)obj3).longValue();
	//  170  354:aload           14
	//  171  356:checkcast       #286 <Class Long>
	//  172  359:invokevirtual   #290 <Method long Long.longValue()>
	//  173  362:lstore          7
_L9:
		flag1 = ((CursorWindow) (obj)).putLong(l1, i, k);
	//  174  364:aload           9
	//  175  366:lload           7
	//  176  368:iload_1         
	//  177  369:iload_3         
	//  178  370:invokevirtual   #294 <Method boolean CursorWindow.putLong(long, int, int)>
	//  179  373:istore          6
		break MISSING_BLOCK_LABEL_782;
	//  180  375:goto            782
_L6:
		if(obj3 instanceof Integer)
	//* 181  378:aload           14
	//* 182  380:instanceof      #296 <Class Integer>
	//* 183  383:ifeq            407
		{
			flag1 = ((CursorWindow) (obj)).putLong(((Integer)obj3).intValue(), i, k);
	//  184  386:aload           9
	//  185  388:aload           14
	//  186  390:checkcast       #296 <Class Integer>
	//  187  393:invokevirtual   #299 <Method int Integer.intValue()>
	//  188  396:i2l             
	//  189  397:iload_1         
	//  190  398:iload_3         
	//  191  399:invokevirtual   #294 <Method boolean CursorWindow.putLong(long, int, int)>
	//  192  402:istore          6
			break MISSING_BLOCK_LABEL_782;
	//  193  404:goto            782
		}
		if(!(obj3 instanceof Boolean)) goto _L8; else goto _L7
	//  194  407:aload           14
	//  195  409:instanceof      #301 <Class Boolean>
	//  196  412:ifeq            432
_L7:
		if(((Boolean)obj3).booleanValue())
	//* 197  415:aload           14
	//* 198  417:checkcast       #301 <Class Boolean>
	//* 199  420:invokevirtual   #304 <Method boolean Boolean.booleanValue()>
	//* 200  423:ifeq            776
			l1 = 1L;
	//  201  426:lconst_1        
	//  202  427:lstore          7
		else
	//* 203  429:goto            364
	//* 204  432:aload           14
	//* 205  434:instanceof      #306 <Class byte[]>
	//* 206  437:ifeq            457
	//* 207  440:aload           9
	//* 208  442:aload           14
	//* 209  444:checkcast       #306 <Class byte[]>
	//* 210  447:iload_1         
	//* 211  448:iload_3         
	//* 212  449:invokevirtual   #310 <Method boolean CursorWindow.putBlob(byte[], int, int)>
	//* 213  452:istore          6
	//* 214  454:goto            782
	//* 215  457:aload           14
	//* 216  459:instanceof      #312 <Class Double>
	//* 217  462:ifeq            485
	//* 218  465:aload           9
	//* 219  467:aload           14
	//* 220  469:checkcast       #312 <Class Double>
	//* 221  472:invokevirtual   #316 <Method double Double.doubleValue()>
	//* 222  475:iload_1         
	//* 223  476:iload_3         
	//* 224  477:invokevirtual   #320 <Method boolean CursorWindow.putDouble(double, int, int)>
	//* 225  480:istore          6
	//* 226  482:goto            782
	//* 227  485:aload           14
	//* 228  487:instanceof      #322 <Class Float>
	//* 229  490:ifeq            514
	//* 230  493:aload           9
	//* 231  495:aload           14
	//* 232  497:checkcast       #322 <Class Float>
	//* 233  500:invokevirtual   #326 <Method float Float.floatValue()>
	//* 234  503:f2d             
	//* 235  504:iload_1         
	//* 236  505:iload_3         
	//* 237  506:invokevirtual   #320 <Method boolean CursorWindow.putDouble(double, int, int)>
	//* 238  509:istore          6
	//* 239  511:goto            782
	//* 240  514:aload           14
	//* 241  516:invokestatic    #179 <Method String String.valueOf(Object)>
	//* 242  519:astore_0        
	//* 243  520:new             #227 <Class StringBuilder>
	//* 244  523:dup             
	//* 245  524:bipush          32
	//* 246  526:aload           10
	//* 247  528:invokestatic    #179 <Method String String.valueOf(Object)>
	//* 248  531:invokevirtual   #183 <Method int String.length()>
	//* 249  534:iadd            
	//* 250  535:aload_0         
	//* 251  536:invokestatic    #179 <Method String String.valueOf(Object)>
	//* 252  539:invokevirtual   #183 <Method int String.length()>
	//* 253  542:iadd            
	//* 254  543:invokespecial   #230 <Method void StringBuilder(int)>
	//* 255  546:astore          9
	//* 256  548:aload           9
	//* 257  550:ldc2            #328 <String "Unsupported object for column ">
	//* 258  553:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 259  556:pop             
	//* 260  557:aload           9
	//* 261  559:aload           10
	//* 262  561:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 263  564:pop             
	//* 264  565:aload           9
	//* 265  567:ldc2            #330 <String ": ">
	//* 266  570:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 267  573:pop             
	//* 268  574:aload           9
	//* 269  576:aload_0         
	//* 270  577:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 271  580:pop             
	//* 272  581:new             #163 <Class IllegalArgumentException>
	//* 273  584:dup             
	//* 274  585:aload           9
	//* 275  587:invokevirtual   #247 <Method String StringBuilder.toString()>
	//* 276  590:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//* 277  593:athrow          
	//* 278  594:iload           6
	//* 279  596:ifne            710
	//* 280  599:iload_2         
	//* 281  600:ifeq            614
	//* 282  603:new             #11  <Class DataHolder$DataHolderException>
	//* 283  606:dup             
	//* 284  607:ldc2            #332 <String "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.">
	//* 285  610:invokespecial   #333 <Method void DataHolder$DataHolderException(String)>
	//* 286  613:athrow          
	//* 287  614:new             #227 <Class StringBuilder>
	//* 288  617:dup             
	//* 289  618:bipush          74
	//* 290  620:invokespecial   #230 <Method void StringBuilder(int)>
	//* 291  623:astore          10
	//* 292  625:aload           10
	//* 293  627:ldc2            #335 <String "Couldn't populate window data for row ">
	//* 294  630:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 295  633:pop             
	//* 296  634:aload           10
	//* 297  636:iload_1         
	//* 298  637:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//* 299  640:pop             
	//* 300  641:aload           10
	//* 301  643:ldc2            #337 <String " - allocating new window.">
	//* 302  646:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 303  649:pop             
	//* 304  650:ldc1            #243 <String "DataHolder">
	//* 305  652:aload           10
	//* 306  654:invokevirtual   #247 <Method String StringBuilder.toString()>
	//* 307  657:invokestatic    #253 <Method int Log.d(String, String)>
	//* 308  660:pop             
	//* 309  661:aload           9
	//* 310  663:invokevirtual   #340 <Method void CursorWindow.freeLastRow()>
	//* 311  666:new             #194 <Class CursorWindow>
	//* 312  669:dup             
	//* 313  670:iconst_0        
	//* 314  671:invokespecial   #213 <Method void CursorWindow(boolean)>
	//* 315  674:astore          9
	//* 316  676:aload           9
	//* 317  678:iload_1         
	//* 318  679:invokevirtual   #256 <Method void CursorWindow.setStartPosition(int)>
	//* 319  682:aload           9
	//* 320  684:aload_0         
	//* 321  685:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//* 322  688:arraylength     
	//* 323  689:invokevirtual   #222 <Method boolean CursorWindow.setNumColumns(int)>
	//* 324  692:pop             
	//* 325  693:aload           12
	//* 326  695:aload           9
	//* 327  697:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//* 328  700:pop             
	//* 329  701:iload_1         
	//* 330  702:iconst_1        
	//* 331  703:isub            
	//* 332  704:istore_1        
	//* 333  705:iconst_1        
	//* 334  706:istore_2        
	//* 335  707:goto            712
	//* 336  710:iconst_0        
	//* 337  711:istore_2        
	//* 338  712:iload_1         
	//* 339  713:iconst_1        
	//* 340  714:iadd            
	//* 341  715:istore_1        
	//* 342  716:aload           9
	//* 343  718:astore          10
	//* 344  720:goto            109
	//* 345  723:astore_0        
	//* 346  724:aload           12
	//* 347  726:invokevirtual   #203 <Method int ArrayList.size()>
	//* 348  729:istore_2        
	//* 349  730:iload           4
	//* 350  732:istore_1        
	//* 351  733:iload_1         
	//* 352  734:iload_2         
	//* 353  735:icmpge          757
	//* 354  738:aload           12
	//* 355  740:iload_1         
	//* 356  741:invokevirtual   #341 <Method Object ArrayList.get(int)>
	//* 357  744:checkcast       #194 <Class CursorWindow>
	//* 358  747:invokevirtual   #344 <Method void CursorWindow.close()>
	//* 359  750:iload_1         
	//* 360  751:iconst_1        
	//* 361  752:iadd            
	//* 362  753:istore_1        
	//* 363  754:goto            733
	//* 364  757:aload_0         
	//* 365  758:athrow          
	//* 366  759:aload           12
	//* 367  761:aload           12
	//* 368  763:invokevirtual   #203 <Method int ArrayList.size()>
	//* 369  766:anewarray       CursorWindow[]
	//* 370  769:invokevirtual   #268 <Method Object[] ArrayList.toArray(Object[])>
	//* 371  772:checkcast       #134 <Class CursorWindow[]>
	//* 372  775:areturn         
			l1 = 0L;
	//  373  776:lconst_0        
	//  374  777:lstore          7
		if(true) goto _L9; else goto _L8
	//  375  779:goto            364
_L8:
		if(obj3 instanceof byte[])
		{
			flag1 = ((CursorWindow) (obj)).putBlob((byte[])obj3, i, k);
			break MISSING_BLOCK_LABEL_782;
		}
		if(obj3 instanceof Double)
		{
			flag1 = ((CursorWindow) (obj)).putDouble(((Double)obj3).doubleValue(), i, k);
			break MISSING_BLOCK_LABEL_782;
		}
		break MISSING_BLOCK_LABEL_485;
_L4:
		if(flag1)
			break MISSING_BLOCK_LABEL_710;
		if(!j)
			break MISSING_BLOCK_LABEL_614;
		throw new DataHolderException("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
		obj1 = ((Object) (new StringBuilder(74)));
		((StringBuilder) (obj1)).append("Couldn't populate window data for row ");
		((StringBuilder) (obj1)).append(i);
		((StringBuilder) (obj1)).append(" - allocating new window.");
		Log.d("DataHolder", ((StringBuilder) (obj1)).toString());
		((CursorWindow) (obj)).freeLastRow();
		obj = ((Object) (new CursorWindow(false)));
		((CursorWindow) (obj)).setStartPosition(i);
		((CursorWindow) (obj)).setNumColumns(Builder.zza(builder1).length);
		arraylist.add(obj);
		i--;
		j = 1;
		break MISSING_BLOCK_LABEL_712;
		j = 0;
		i++;
		obj1 = obj;
		  goto _L10
		if(obj3 instanceof Float)
		{
			flag1 = ((CursorWindow) (obj)).putDouble(((Float)obj3).floatValue(), i, k);
			break MISSING_BLOCK_LABEL_782;
		}
		try
		{
			builder1 = ((Builder) (String.valueOf(obj3)));
			obj = ((Object) (new StringBuilder(32 + String.valueOf(obj1).length() + String.valueOf(((Object) (builder1))).length())));
			((StringBuilder) (obj)).append("Unsupported object for column ");
			((StringBuilder) (obj)).append(((String) (obj1)));
			((StringBuilder) (obj)).append(": ");
			((StringBuilder) (obj)).append(((String) (builder1)));
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		}
		// Misplaced declaration of an exception variable
		catch(Builder builder1)
		{
			j = arraylist.size();
		}
		for(i = ((int) (flag)); i < j; i++)
			((CursorWindow)arraylist.get(i)).close();

		throw builder1;
_L2:
		return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
		k++;
	//  376  782:iload_3         
	//  377  783:iconst_1        
	//  378  784:iadd            
	//  379  785:istore_3        
		  goto _L11
	//* 380  786:goto            271
	}

	private static CursorWindow[] zza(CursorWrapper cursorwrapper)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #200 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #214 <Method void ArrayList()>
	//    3    7:astore          5
		int j;
		CursorWindow cursorwindow;
		j = cursorwrapper.getCount();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #347 <Method int CursorWrapper.getCount()>
	//    6   13:istore_2        
		cursorwindow = cursorwrapper.getWindow();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #351 <Method CursorWindow CursorWrapper.getWindow()>
	//    9   18:astore          4
		if(cursorwindow == null) goto _L2; else goto _L1
	//   10   20:aload           4
	//   11   22:ifnull          185
_L1:
		if(cursorwindow.getStartPosition() != 0) goto _L2; else goto _L3
	//   12   25:aload           4
	//   13   27:invokevirtual   #354 <Method int CursorWindow.getStartPosition()>
	//   14   30:ifne            185
_L3:
		int i;
		cursorwindow.acquireReference();
	//   15   33:aload           4
	//   16   35:invokevirtual   #357 <Method void CursorWindow.acquireReference()>
		cursorwrapper.setWindow(((CursorWindow) (null)));
	//   17   38:aload_0         
	//   18   39:aconst_null     
	//   19   40:invokevirtual   #361 <Method void CursorWrapper.setWindow(CursorWindow)>
		arraylist.add(((Object) (cursorwindow)));
	//   20   43:aload           5
	//   21   45:aload           4
	//   22   47:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   23   50:pop             
		i = cursorwindow.getNumRows();
	//   24   51:aload           4
	//   25   53:invokevirtual   #364 <Method int CursorWindow.getNumRows()>
	//   26   56:istore_1        
	//*  27   57:goto            60
_L5:
		if(i >= j)
			break MISSING_BLOCK_LABEL_155;
	//   28   60:iload_1         
	//   29   61:iload_2         
	//   30   62:icmpge          155
		if(!cursorwrapper.moveToPosition(i))
			break MISSING_BLOCK_LABEL_155;
	//   31   65:aload_0         
	//   32   66:iload_1         
	//   33   67:invokevirtual   #367 <Method boolean CursorWrapper.moveToPosition(int)>
	//   34   70:ifeq            155
		cursorwindow = cursorwrapper.getWindow();
	//   35   73:aload_0         
	//   36   74:invokevirtual   #351 <Method CursorWindow CursorWrapper.getWindow()>
	//   37   77:astore          4
		if(cursorwindow == null)
			break MISSING_BLOCK_LABEL_97;
	//   38   79:aload           4
	//   39   81:ifnull          97
		cursorwindow.acquireReference();
	//   40   84:aload           4
	//   41   86:invokevirtual   #357 <Method void CursorWindow.acquireReference()>
		cursorwrapper.setWindow(((CursorWindow) (null)));
	//   42   89:aload_0         
	//   43   90:aconst_null     
	//   44   91:invokevirtual   #361 <Method void CursorWrapper.setWindow(CursorWindow)>
		break MISSING_BLOCK_LABEL_120;
	//   45   94:goto            120
		cursorwindow = new CursorWindow(false);
	//   46   97:new             #194 <Class CursorWindow>
	//   47  100:dup             
	//   48  101:iconst_0        
	//   49  102:invokespecial   #213 <Method void CursorWindow(boolean)>
	//   50  105:astore          4
		cursorwindow.setStartPosition(i);
	//   51  107:aload           4
	//   52  109:iload_1         
	//   53  110:invokevirtual   #256 <Method void CursorWindow.setStartPosition(int)>
		cursorwrapper.fillWindow(i, cursorwindow);
	//   54  113:aload_0         
	//   55  114:iload_1         
	//   56  115:aload           4
	//   57  117:invokevirtual   #371 <Method void CursorWrapper.fillWindow(int, CursorWindow)>
		int k;
		if(cursorwindow.getNumRows() == 0)
			break MISSING_BLOCK_LABEL_155;
	//   58  120:aload           4
	//   59  122:invokevirtual   #364 <Method int CursorWindow.getNumRows()>
	//   60  125:ifeq            155
		arraylist.add(((Object) (cursorwindow)));
	//   61  128:aload           5
	//   62  130:aload           4
	//   63  132:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   64  135:pop             
		i = cursorwindow.getStartPosition();
	//   65  136:aload           4
	//   66  138:invokevirtual   #354 <Method int CursorWindow.getStartPosition()>
	//   67  141:istore_1        
		k = cursorwindow.getNumRows();
	//   68  142:aload           4
	//   69  144:invokevirtual   #364 <Method int CursorWindow.getNumRows()>
	//   70  147:istore_3        
		i += k;
	//   71  148:iload_1         
	//   72  149:iload_3         
	//   73  150:iadd            
	//   74  151:istore_1        
		continue; /* Loop/switch isn't completed */
	//   75  152:goto            60
		cursorwrapper.close();
	//   76  155:aload_0         
	//   77  156:invokevirtual   #372 <Method void CursorWrapper.close()>
		return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//   78  159:aload           5
	//   79  161:aload           5
	//   80  163:invokevirtual   #203 <Method int ArrayList.size()>
	//   81  166:anewarray       CursorWindow[]
	//   82  169:invokevirtual   #268 <Method Object[] ArrayList.toArray(Object[])>
	//   83  172:checkcast       #134 <Class CursorWindow[]>
	//   84  175:areturn         
		Exception exception;
		exception;
	//   85  176:astore          4
		cursorwrapper.close();
	//   86  178:aload_0         
	//   87  179:invokevirtual   #372 <Method void CursorWrapper.close()>
		throw exception;
	//   88  182:aload           4
	//   89  184:athrow          
_L2:
		i = 0;
	//   90  185:iconst_0        
	//   91  186:istore_1        
		if(true) goto _L5; else goto _L4
	//   92  187:goto            60
_L4:
	}

	public final void clearColumn(String s, int i, int j)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		zzno[j].putNull(i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #280 <Method boolean CursorWindow.putNull(int, int)>
	//   14   24:pop             
	//   15   25:return          
	}

	public final void close()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mClosed) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #79  <Field boolean mClosed>
	//    4    6:ifne            41
_L1:
		mClosed = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #79  <Field boolean mClosed>
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_1        
_L3:
		if(i >= zzno.length)
			break; /* Loop/switch isn't completed */
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:getfield        #87  <Field CursorWindow[] zzno>
	//   13   21:arraylength     
	//   14   22:icmpge          41
		zzno[i].close();
	//   15   25:aload_0         
	//   16   26:getfield        #87  <Field CursorWindow[] zzno>
	//   17   29:iload_1         
	//   18   30:aaload          
	//   19   31:invokevirtual   #344 <Method void CursorWindow.close()>
		i++;
	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
		if(true) goto _L3; else goto _L2
	//   24   38:goto            16
_L2:
		this;
	//   25   41:aload_0         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		return;
	//   27   43:return          
		Exception exception;
		exception;
	//   28   44:astore_2        
		this;
	//   29   45:aload_0         
		JVM INSTR monitorexit ;
	//   30   46:monitorexit     
		throw exception;
	//   31   47:aload_2         
	//   32   48:athrow          
	}

	public final void copyToBuffer(String s, int i, int j, CharArrayBuffer chararraybuffer)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		zzno[j].copyStringToBuffer(i, zznn.getInt(s), chararraybuffer);
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:aload           4
	//   14   23:invokevirtual   #386 <Method void CursorWindow.copyStringToBuffer(int, int, CharArrayBuffer)>
	//   15   26:return          
	}

	public final void disableLeakDetection()
	{
		zzns = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #81  <Field boolean zzns>
	//    3    5:return          
	}

	protected final void finalize()
		throws Throwable
	{
		if(zzns && zzno.length > 0 && !isClosed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field boolean zzns>
	//*   2    4:ifeq            82
	//*   3    7:aload_0         
	//*   4    8:getfield        #87  <Field CursorWindow[] zzno>
	//*   5   11:arraylength     
	//*   6   12:ifle            82
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #161 <Method boolean isClosed()>
	//*   9   19:ifne            82
		{
			close();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #391 <Method void close()>
			String s = ((Object)this).toString();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #394 <Method String Object.toString()>
	//   14   30:astore_1        
			StringBuilder stringbuilder = new StringBuilder(178 + String.valueOf(((Object) (s))).length());
	//   15   31:new             #227 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:sipush          178
	//   18   38:aload_1         
	//   19   39:invokestatic    #179 <Method String String.valueOf(Object)>
	//   20   42:invokevirtual   #183 <Method int String.length()>
	//   21   45:iadd            
	//   22   46:invokespecial   #230 <Method void StringBuilder(int)>
	//   23   49:astore_2        
			stringbuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
	//   24   50:aload_2         
	//   25   51:ldc2            #396 <String "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ">
	//   26   54:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			stringbuilder.append(s);
	//   28   58:aload_2         
	//   29   59:aload_1         
	//   30   60:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			stringbuilder.append(")");
	//   32   64:aload_2         
	//   33   65:ldc1            #241 <String ")">
	//   34   67:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
			Log.e("DataBuffer", stringbuilder.toString());
	//   36   71:ldc2            #398 <String "DataBuffer">
	//   37   74:aload_2         
	//   38   75:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   39   78:invokestatic    #261 <Method int Log.e(String, String)>
	//   40   81:pop             
		}
		((Object)this).finalize();
	//   41   82:aload_0         
	//   42   83:invokespecial   #400 <Method void Object.finalize()>
		return;
	//   43   86:return          
		Exception exception;
		exception;
	//   44   87:astore_1        
		((Object)this).finalize();
	//   45   88:aload_0         
	//   46   89:invokespecial   #400 <Method void Object.finalize()>
		throw exception;
	//   47   92:aload_1         
	//   48   93:athrow          
	}

	public final boolean getBoolean(String s, int i, int j)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		return Long.valueOf(zzno[j].getLong(i, zznn.getInt(s))).longValue() == 1L;
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #406 <Method long CursorWindow.getLong(int, int)>
	//   14   24:invokestatic    #409 <Method Long Long.valueOf(long)>
	//   15   27:invokevirtual   #290 <Method long Long.longValue()>
	//   16   30:lconst_1        
	//   17   31:lcmp            
	//   18   32:ifne            37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public final byte[] getByteArray(String s, int i, int j)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		return zzno[j].getBlob(i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #415 <Method byte[] CursorWindow.getBlob(int, int)>
	//   14   24:areturn         
	}

	public final int getCount()
	{
		return zznr;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field int zznr>
	//    2    4:ireturn         
	}

	public final double getDouble(String s, int i, int j)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		return zzno[j].getDouble(i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #420 <Method double CursorWindow.getDouble(int, int)>
	//   14   24:dreturn         
	}

	public final float getFloat(String s, int i, int j)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		return zzno[j].getFloat(i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #425 <Method float CursorWindow.getFloat(int, int)>
	//   14   24:freturn         
	}

	public final int getInteger(String s, int i, int j)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		return zzno[j].getInt(i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #430 <Method int CursorWindow.getInt(int, int)>
	//   14   24:ireturn         
	}

	public final long getLong(String s, int i, int j)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		return zzno[j].getLong(i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #406 <Method long CursorWindow.getLong(int, int)>
	//   14   24:lreturn         
	}

	public final Bundle getMetadata()
	{
		return zznp;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Bundle zznp>
	//    2    4:areturn         
	}

	public final int getStatusCode()
	{
		return zzam;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int zzam>
	//    2    4:ireturn         
	}

	public final String getString(String s, int i, int j)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		return zzno[j].getString(i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #437 <Method String CursorWindow.getString(int, int)>
	//   14   24:areturn         
	}

	public final int getWindowIndex(int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(i >= 0 && i < zznr)
	//*   2    2:iload_1         
	//*   3    3:iflt            20
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #170 <Field int zznr>
	//*   7   11:icmpge          20
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore          4
		else
	//*  10   17:goto            23
			flag = false;
	//   11   20:iconst_0        
	//   12   21:istore          4
		Preconditions.checkState(flag);
	//   13   23:iload           4
	//   14   25:invokestatic    #442 <Method void Preconditions.checkState(boolean)>
		int j;
		do
		{
			j = k;
	//   15   28:iload_3         
	//   16   29:istore_2        
			if(k >= zznq.length)
				break;
	//   17   30:iload_3         
	//   18   31:aload_0         
	//   19   32:getfield        #444 <Field int[] zznq>
	//   20   35:arraylength     
	//   21   36:icmpge          63
			if(i < zznq[k])
	//*  22   39:iload_1         
	//*  23   40:aload_0         
	//*  24   41:getfield        #444 <Field int[] zznq>
	//*  25   44:iload_3         
	//*  26   45:iaload          
	//*  27   46:icmpge          56
			{
				j = k - 1;
	//   28   49:iload_3         
	//   29   50:iconst_1        
	//   30   51:isub            
	//   31   52:istore_2        
				break;
	//   32   53:goto            63
			}
			k++;
	//   33   56:iload_3         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_3        
		} while(true);
	//   37   60:goto            28
		i = j;
	//   38   63:iload_2         
	//   39   64:istore_1        
		if(j == zznq.length)
	//*  40   65:iload_2         
	//*  41   66:aload_0         
	//*  42   67:getfield        #444 <Field int[] zznq>
	//*  43   70:arraylength     
	//*  44   71:icmpne          78
			i = j - 1;
	//   45   74:iload_2         
	//   46   75:iconst_1        
	//   47   76:isub            
	//   48   77:istore_1        
		return i;
	//   49   78:iload_1         
	//   50   79:ireturn         
	}

	public final boolean hasColumn(String s)
	{
		return zznn.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Bundle zznn>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//    4    8:ireturn         
	}

	public final boolean hasNull(String s, int i, int j)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		return zzno[j].isNull(i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #151 <Field Bundle zznn>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #449 <Method boolean CursorWindow.isNull(int, int)>
	//   14   24:ireturn         
	}

	public final boolean isClosed()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mClosed;
	//    2    2:aload_0         
	//    3    3:getfield        #79  <Field boolean mClosed>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
		this;
	//   10   12:aload_0         
		JVM INSTR monitorexit ;
	//   11   13:monitorexit     
		throw exception;
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public final void logCursorMetadataForDebugging()
	{
		Log.d("DataHolder", "*******************************************");
	//    0    0:ldc1            #243 <String "DataHolder">
	//    1    2:ldc2            #452 <String "*******************************************">
	//    2    5:invokestatic    #253 <Method int Log.d(String, String)>
	//    3    8:pop             
		CursorWindow acursorwindow[] = zzno;
	//    4    9:aload_0         
	//    5   10:getfield        #87  <Field CursorWindow[] zzno>
	//    6   13:astore_3        
		int i = 0;
	//    7   14:iconst_0        
	//    8   15:istore_1        
		int j = acursorwindow.length;
	//    9   16:aload_3         
	//   10   17:arraylength     
	//   11   18:istore_2        
		StringBuilder stringbuilder = new StringBuilder(32);
	//   12   19:new             #227 <Class StringBuilder>
	//   13   22:dup             
	//   14   23:bipush          32
	//   15   25:invokespecial   #230 <Method void StringBuilder(int)>
	//   16   28:astore_3        
		stringbuilder.append("num cursor windows : ");
	//   17   29:aload_3         
	//   18   30:ldc2            #454 <String "num cursor windows : ">
	//   19   33:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
		stringbuilder.append(j);
	//   21   37:aload_3         
	//   22   38:iload_2         
	//   23   39:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   24   42:pop             
		Log.d("DataHolder", stringbuilder.toString());
	//   25   43:ldc1            #243 <String "DataHolder">
	//   26   45:aload_3         
	//   27   46:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   28   49:invokestatic    #253 <Method int Log.d(String, String)>
	//   29   52:pop             
		j = zznr;
	//   30   53:aload_0         
	//   31   54:getfield        #170 <Field int zznr>
	//   32   57:istore_2        
		stringbuilder = new StringBuilder(46);
	//   33   58:new             #227 <Class StringBuilder>
	//   34   61:dup             
	//   35   62:bipush          46
	//   36   64:invokespecial   #230 <Method void StringBuilder(int)>
	//   37   67:astore_3        
		stringbuilder.append("total number of objects in holder: ");
	//   38   68:aload_3         
	//   39   69:ldc2            #456 <String "total number of objects in holder: ">
	//   40   72:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
		stringbuilder.append(j);
	//   42   76:aload_3         
	//   43   77:iload_2         
	//   44   78:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   45   81:pop             
		Log.d("DataHolder", stringbuilder.toString());
	//   46   82:ldc1            #243 <String "DataHolder">
	//   47   84:aload_3         
	//   48   85:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   49   88:invokestatic    #253 <Method int Log.d(String, String)>
	//   50   91:pop             
		j = zznq.length;
	//   51   92:aload_0         
	//   52   93:getfield        #444 <Field int[] zznq>
	//   53   96:arraylength     
	//   54   97:istore_2        
		stringbuilder = new StringBuilder(42);
	//   55   98:new             #227 <Class StringBuilder>
	//   56  101:dup             
	//   57  102:bipush          42
	//   58  104:invokespecial   #230 <Method void StringBuilder(int)>
	//   59  107:astore_3        
		stringbuilder.append("total mumber of windowOffsets: ");
	//   60  108:aload_3         
	//   61  109:ldc2            #458 <String "total mumber of windowOffsets: ">
	//   62  112:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   63  115:pop             
		stringbuilder.append(j);
	//   64  116:aload_3         
	//   65  117:iload_2         
	//   66  118:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   67  121:pop             
		Log.d("DataHolder", stringbuilder.toString());
	//   68  122:ldc1            #243 <String "DataHolder">
	//   69  124:aload_3         
	//   70  125:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   71  128:invokestatic    #253 <Method int Log.d(String, String)>
	//   72  131:pop             
		for(; i < zznq.length; i++)
	//*  73  132:iload_1         
	//*  74  133:aload_0         
	//*  75  134:getfield        #444 <Field int[] zznq>
	//*  76  137:arraylength     
	//*  77  138:icmpge          319
		{
			int k = zznq[i];
	//   78  141:aload_0         
	//   79  142:getfield        #444 <Field int[] zznq>
	//   80  145:iload_1         
	//   81  146:iaload          
	//   82  147:istore_2        
			StringBuilder stringbuilder1 = new StringBuilder(43);
	//   83  148:new             #227 <Class StringBuilder>
	//   84  151:dup             
	//   85  152:bipush          43
	//   86  154:invokespecial   #230 <Method void StringBuilder(int)>
	//   87  157:astore_3        
			stringbuilder1.append("offset for window ");
	//   88  158:aload_3         
	//   89  159:ldc2            #460 <String "offset for window ">
	//   90  162:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   91  165:pop             
			stringbuilder1.append(i);
	//   92  166:aload_3         
	//   93  167:iload_1         
	//   94  168:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   95  171:pop             
			stringbuilder1.append(" : ");
	//   96  172:aload_3         
	//   97  173:ldc2            #462 <String " : ">
	//   98  176:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   99  179:pop             
			stringbuilder1.append(k);
	//  100  180:aload_3         
	//  101  181:iload_2         
	//  102  182:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  103  185:pop             
			Log.d("DataHolder", stringbuilder1.toString());
	//  104  186:ldc1            #243 <String "DataHolder">
	//  105  188:aload_3         
	//  106  189:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  107  192:invokestatic    #253 <Method int Log.d(String, String)>
	//  108  195:pop             
			k = zzno[i].getNumRows();
	//  109  196:aload_0         
	//  110  197:getfield        #87  <Field CursorWindow[] zzno>
	//  111  200:iload_1         
	//  112  201:aaload          
	//  113  202:invokevirtual   #364 <Method int CursorWindow.getNumRows()>
	//  114  205:istore_2        
			stringbuilder1 = new StringBuilder(45);
	//  115  206:new             #227 <Class StringBuilder>
	//  116  209:dup             
	//  117  210:bipush          45
	//  118  212:invokespecial   #230 <Method void StringBuilder(int)>
	//  119  215:astore_3        
			stringbuilder1.append("num rows for window ");
	//  120  216:aload_3         
	//  121  217:ldc2            #464 <String "num rows for window ">
	//  122  220:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  123  223:pop             
			stringbuilder1.append(i);
	//  124  224:aload_3         
	//  125  225:iload_1         
	//  126  226:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  127  229:pop             
			stringbuilder1.append(" : ");
	//  128  230:aload_3         
	//  129  231:ldc2            #462 <String " : ">
	//  130  234:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  131  237:pop             
			stringbuilder1.append(k);
	//  132  238:aload_3         
	//  133  239:iload_2         
	//  134  240:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  135  243:pop             
			Log.d("DataHolder", stringbuilder1.toString());
	//  136  244:ldc1            #243 <String "DataHolder">
	//  137  246:aload_3         
	//  138  247:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  139  250:invokestatic    #253 <Method int Log.d(String, String)>
	//  140  253:pop             
			k = zzno[i].getStartPosition();
	//  141  254:aload_0         
	//  142  255:getfield        #87  <Field CursorWindow[] zzno>
	//  143  258:iload_1         
	//  144  259:aaload          
	//  145  260:invokevirtual   #354 <Method int CursorWindow.getStartPosition()>
	//  146  263:istore_2        
			stringbuilder1 = new StringBuilder(46);
	//  147  264:new             #227 <Class StringBuilder>
	//  148  267:dup             
	//  149  268:bipush          46
	//  150  270:invokespecial   #230 <Method void StringBuilder(int)>
	//  151  273:astore_3        
			stringbuilder1.append("start pos for window ");
	//  152  274:aload_3         
	//  153  275:ldc2            #466 <String "start pos for window ">
	//  154  278:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  155  281:pop             
			stringbuilder1.append(i);
	//  156  282:aload_3         
	//  157  283:iload_1         
	//  158  284:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  159  287:pop             
			stringbuilder1.append(" : ");
	//  160  288:aload_3         
	//  161  289:ldc2            #462 <String " : ">
	//  162  292:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  163  295:pop             
			stringbuilder1.append(k);
	//  164  296:aload_3         
	//  165  297:iload_2         
	//  166  298:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  167  301:pop             
			Log.d("DataHolder", stringbuilder1.toString());
	//  168  302:ldc1            #243 <String "DataHolder">
	//  169  304:aload_3         
	//  170  305:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  171  308:invokestatic    #253 <Method int Log.d(String, String)>
	//  172  311:pop             
		}

	//  173  312:iload_1         
	//  174  313:iconst_1        
	//  175  314:iadd            
	//  176  315:istore_1        
	//* 177  316:goto            132
		Log.d("DataHolder", "*******************************************");
	//  178  319:ldc1            #243 <String "DataHolder">
	//  179  321:ldc2            #452 <String "*******************************************">
	//  180  324:invokestatic    #253 <Method int Log.d(String, String)>
	//  181  327:pop             
	//  182  328:return          
	}

	public final Uri parseUri(String s, int i, int j)
	{
		s = getString(s, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #470 <Method String getString(String, int, int)>
	//    5    7:astore_1        
		if(s == null)
	//*   6    8:aload_1         
	//*   7    9:ifnonnull       14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		else
			return Uri.parse(s);
	//   10   14:aload_1         
	//   11   15:invokestatic    #476 <Method Uri Uri.parse(String)>
	//   12   18:areturn         
	}

	public final void replaceValue(String s, int i, int j, double d)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		zzno[j].putDouble(d, i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:dload           4
	//    9   14:iload_2         
	//   10   15:aload_0         
	//   11   16:getfield        #151 <Field Bundle zznn>
	//   12   19:aload_1         
	//   13   20:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   14   23:invokevirtual   #320 <Method boolean CursorWindow.putDouble(double, int, int)>
	//   15   26:pop             
	//   16   27:return          
	}

	public final void replaceValue(String s, int i, int j, long l)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		zzno[j].putLong(l, i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:lload           4
	//    9   14:iload_2         
	//   10   15:aload_0         
	//   11   16:getfield        #151 <Field Bundle zznn>
	//   12   19:aload_1         
	//   13   20:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   14   23:invokevirtual   #294 <Method boolean CursorWindow.putLong(long, int, int)>
	//   15   26:pop             
	//   16   27:return          
	}

	public final void replaceValue(String s, int i, int j, String s1)
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		zzno[j].putString(s1, i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:aload           4
	//    9   14:iload_2         
	//   10   15:aload_0         
	//   11   16:getfield        #151 <Field Bundle zznn>
	//   12   19:aload_1         
	//   13   20:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   14   23:invokevirtual   #284 <Method boolean CursorWindow.putString(String, int, int)>
	//   15   26:pop             
	//   16   27:return          
	}

	public final void replaceValue(String s, int i, int j, byte abyte0[])
	{
		zza(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #376 <Method void zza(String, int)>
		zzno[j].putBlob(abyte0, i, zznn.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field CursorWindow[] zzno>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:aload           4
	//    9   14:iload_2         
	//   10   15:aload_0         
	//   11   16:getfield        #151 <Field Bundle zznn>
	//   12   19:aload_1         
	//   13   20:invokevirtual   #380 <Method int Bundle.getInt(String)>
	//   14   23:invokevirtual   #310 <Method boolean CursorWindow.putBlob(byte[], int, int)>
	//   15   26:pop             
	//   16   27:return          
	}

	public final void validateContents()
	{
		zznn = new Bundle();
	//    0    0:aload_0         
	//    1    1:new             #153 <Class Bundle>
	//    2    4:dup             
	//    3    5:invokespecial   #482 <Method void Bundle()>
	//    4    8:putfield        #151 <Field Bundle zznn>
		boolean flag = false;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		for(int i = 0; i < zznm.length; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #85  <Field String[] zznm>
	//*  12   20:arraylength     
	//*  13   21:icmpge          45
			zznn.putInt(zznm[i], i);
	//   14   24:aload_0         
	//   15   25:getfield        #151 <Field Bundle zznn>
	//   16   28:aload_0         
	//   17   29:getfield        #85  <Field String[] zznm>
	//   18   32:iload_1         
	//   19   33:aaload          
	//   20   34:iload_1         
	//   21   35:invokevirtual   #485 <Method void Bundle.putInt(String, int)>

	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            15
		zznq = new int[zzno.length];
	//   27   45:aload_0         
	//   28   46:aload_0         
	//   29   47:getfield        #87  <Field CursorWindow[] zzno>
	//   30   50:arraylength     
	//   31   51:newarray        int[]
	//   32   53:putfield        #444 <Field int[] zznq>
		int k = 0;
	//   33   56:iconst_0        
	//   34   57:istore_2        
		for(int j = ((int) (flag)); j < zzno.length; j++)
	//*  35   58:iload_3         
	//*  36   59:istore_1        
	//*  37   60:iload_1         
	//*  38   61:aload_0         
	//*  39   62:getfield        #87  <Field CursorWindow[] zzno>
	//*  40   65:arraylength     
	//*  41   66:icmpge          109
		{
			zznq[j] = k;
	//   42   69:aload_0         
	//   43   70:getfield        #444 <Field int[] zznq>
	//   44   73:iload_1         
	//   45   74:iload_2         
	//   46   75:iastore         
			int l = zzno[j].getStartPosition();
	//   47   76:aload_0         
	//   48   77:getfield        #87  <Field CursorWindow[] zzno>
	//   49   80:iload_1         
	//   50   81:aaload          
	//   51   82:invokevirtual   #354 <Method int CursorWindow.getStartPosition()>
	//   52   85:istore_3        
			k += zzno[j].getNumRows() - (k - l);
	//   53   86:iload_2         
	//   54   87:aload_0         
	//   55   88:getfield        #87  <Field CursorWindow[] zzno>
	//   56   91:iload_1         
	//   57   92:aaload          
	//   58   93:invokevirtual   #364 <Method int CursorWindow.getNumRows()>
	//   59   96:iload_2         
	//   60   97:iload_3         
	//   61   98:isub            
	//   62   99:isub            
	//   63  100:iadd            
	//   64  101:istore_2        
		}

	//   65  102:iload_1         
	//   66  103:iconst_1        
	//   67  104:iadd            
	//   68  105:istore_1        
	//*  69  106:goto            60
		zznr = k;
	//   70  109:aload_0         
	//   71  110:iload_2         
	//   72  111:putfield        #170 <Field int zznr>
	//   73  114:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #493 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeStringArray(parcel, 1, zznm, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #85  <Field String[] zznm>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #497 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 2, ((android.os.Parcelable []) (zzno)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #87  <Field CursorWindow[] zzno>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #501 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
	//   16   26:aload_1         
	//   17   27:iconst_3        
	//   18   28:aload_0         
	//   19   29:invokevirtual   #503 <Method int getStatusCode()>
	//   20   32:invokestatic    #507 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #509 <Method Bundle getMetadata()>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #513 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeInt(parcel, 1000, zzal);
	//   27   45:aload_1         
	//   28   46:sipush          1000
	//   29   49:aload_0         
	//   30   50:getfield        #83  <Field int zzal>
	//   31   53:invokestatic    #507 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   32   56:aload_1         
	//   33   57:iload_3         
	//   34   58:invokestatic    #516 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
		if((i & 1) != 0)
	//*  35   61:iload_2         
	//*  36   62:iconst_1        
	//*  37   63:iand            
	//*  38   64:ifeq            71
			close();
	//   39   67:aload_0         
	//   40   68:invokevirtual   #391 <Method void close()>
	//   41   71:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new DataHolderCreator();
	private static final Builder zznt = new com.google.android.gms.common.data.zza(new String[0], ((String) (null)));
	private boolean mClosed;
	private final int zzal;
	private final int zzam;
	private final String zznm[];
	private Bundle zznn;
	private final CursorWindow zzno[];
	private final Bundle zznp;
	private int zznq[];
	private int zznr;
	private boolean zzns;

	static 
	{
	//    0    0:new             #58  <Class DataHolderCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void DataHolderCreator()>
	//    3    7:putstatic       #63  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:new             #65  <Class zza>
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:anewarray       String[]
	//    8   18:aconst_null     
	//    9   19:invokespecial   #70  <Method void zza(String[], String)>
	//   10   22:putstatic       #72  <Field DataHolder$Builder zznt>
	//*  11   25:return          
	}
}
