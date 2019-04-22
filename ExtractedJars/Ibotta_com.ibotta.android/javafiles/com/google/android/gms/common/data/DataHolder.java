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
			Object obj;
			Asserts.checkNotNull(((Object) (hashmap)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #65  <Method void Asserts.checkNotNull(Object)>
			obj = ((Object) (zznv));
		//    2    4:aload_0         
		//    3    5:getfield        #41  <Field String zznv>
		//    4    8:astore_3        
			if(obj != null) goto _L2; else goto _L1
		//    5    9:aload_3         
		//    6   10:ifnonnull       18
_L1:
			int i;
			i = -1;
		//    7   13:iconst_m1       
		//    8   14:istore_2        
			break MISSING_BLOCK_LABEL_77;
		//    9   15:goto            77
_L2:
			Integer integer;
			obj = hashmap.get(obj);
		//   10   18:aload_1         
		//   11   19:aload_3         
		//   12   20:invokevirtual   #93  <Method Object HashMap.get(Object)>
		//   13   23:astore_3        
			if(obj == null)
		//*  14   24:aload_3         
		//*  15   25:ifnonnull       31
				continue; /* Loop/switch isn't completed */
		//   16   28:goto            13
			integer = (Integer)zznw.get(obj);
		//   17   31:aload_0         
		//   18   32:getfield        #46  <Field HashMap zznw>
		//   19   35:aload_3         
		//   20   36:invokevirtual   #93  <Method Object HashMap.get(Object)>
		//   21   39:checkcast       #117 <Class Integer>
		//   22   42:astore          4
			if(integer != null)
				break; /* Loop/switch isn't completed */
		//   23   44:aload           4
		//   24   46:ifnonnull       71
			zznw.put(obj, ((Object) (Integer.valueOf(zznu.size()))));
		//   25   49:aload_0         
		//   26   50:getfield        #46  <Field HashMap zznw>
		//   27   53:aload_3         
		//   28   54:aload_0         
		//   29   55:getfield        #39  <Field ArrayList zznu>
		//   30   58:invokevirtual   #87  <Method int ArrayList.size()>
		//   31   61:invokestatic    #144 <Method Integer Integer.valueOf(int)>
		//   32   64:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
		//   33   67:pop             
			if(true) goto _L1; else goto _L3
		//   34   68:goto            13
_L3:
			i = integer.intValue();
		//   35   71:aload           4
		//   36   73:invokevirtual   #120 <Method int Integer.intValue()>
		//   37   76:istore_2        
			if(i == -1)
		//*  38   77:iload_2         
		//*  39   78:iconst_m1       
		//*  40   79:icmpne          94
			{
				zznu.add(((Object) (hashmap)));
		//   41   82:aload_0         
		//   42   83:getfield        #39  <Field ArrayList zznu>
		//   43   86:aload_1         
		//   44   87:invokevirtual   #186 <Method boolean ArrayList.add(Object)>
		//   45   90:pop             
			} else
		//*  46   91:goto            112
			{
				zznu.remove(i);
		//   47   94:aload_0         
		//   48   95:getfield        #39  <Field ArrayList zznu>
		//   49   98:iload_2         
		//   50   99:invokevirtual   #129 <Method Object ArrayList.remove(int)>
		//   51  102:pop             
				zznu.add(i, ((Object) (hashmap)));
		//   52  103:aload_0         
		//   53  104:getfield        #39  <Field ArrayList zznu>
		//   54  107:iload_2         
		//   55  108:aload_1         
		//   56  109:invokevirtual   #189 <Method void ArrayList.add(int, Object)>
			}
			zznx = false;
		//   57  112:aload_0         
		//   58  113:iconst_0        
		//   59  114:putfield        #48  <Field boolean zznx>
			return this;
		//   60  117:aload_0         
		//   61  118:areturn         
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
				obj1 = ((Object) (new StringBuilder(String.valueOf(obj).length() + 24)));
		//   81  163:new             #74  <Class StringBuilder>
		//   82  166:dup             
		//   83  167:aload_1         
		//   84  168:invokestatic    #72  <Method String String.valueOf(Object)>
		//   85  171:invokevirtual   #78  <Method int String.length()>
		//   86  174:bipush          24
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
		Bundle bundle = zznn;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Bundle zznn>
	//    2    4:astore_3        
		if(bundle != null && bundle.containsKey(s))
	//*   3    5:aload_3         
	//*   4    6:ifnull          63
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//*   8   14:ifne            20
	//*   9   17:goto            63
			if(!isClosed())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #161 <Method boolean isClosed()>
	//*  12   24:ifne            53
			{
				if(i >= 0 && i < zznr)
	//*  13   27:iload_2         
	//*  14   28:iflt            40
	//*  15   31:iload_2         
	//*  16   32:aload_0         
	//*  17   33:getfield        #163 <Field int zznr>
	//*  18   36:icmpge          40
					return;
	//   19   39:return          
				else
					throw new CursorIndexOutOfBoundsException(i, zznr);
	//   20   40:new             #165 <Class CursorIndexOutOfBoundsException>
	//   21   43:dup             
	//   22   44:iload_2         
	//   23   45:aload_0         
	//   24   46:getfield        #163 <Field int zznr>
	//   25   49:invokespecial   #168 <Method void CursorIndexOutOfBoundsException(int, int)>
	//   26   52:athrow          
			} else
			{
				throw new IllegalArgumentException("Buffer is closed.");
	//   27   53:new             #170 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:ldc1            #172 <String "Buffer is closed.">
	//   30   59:invokespecial   #175 <Method void IllegalArgumentException(String)>
	//   31   62:athrow          
			}
		s = String.valueOf(((Object) (s)));
	//   32   63:aload_1         
	//   33   64:invokestatic    #179 <Method String String.valueOf(Object)>
	//   34   67:astore_1        
		if(s.length() != 0)
	//*  35   68:aload_1         
	//*  36   69:invokevirtual   #183 <Method int String.length()>
	//*  37   72:ifeq            85
			s = "No such column: ".concat(s);
	//   38   75:ldc1            #185 <String "No such column: ">
	//   39   77:aload_1         
	//   40   78:invokevirtual   #189 <Method String String.concat(String)>
	//   41   81:astore_1        
		else
	//*  42   82:goto            95
			s = new String("No such column: ");
	//   43   85:new             #67  <Class String>
	//   44   88:dup             
	//   45   89:ldc1            #185 <String "No such column: ">
	//   46   91:invokespecial   #190 <Method void String(String)>
	//   47   94:astore_1        
		throw new IllegalArgumentException(s);
	//   48   95:new             #170 <Class IllegalArgumentException>
	//   49   98:dup             
	//   50   99:aload_1         
	//   51  100:invokespecial   #175 <Method void IllegalArgumentException(String)>
	//   52  103:athrow          
	}

	private static CursorWindow[] zza(Builder builder1, int i)
	{
		boolean flag;
		boolean flag1;
		int i1;
		Object obj1;
		Object obj2;
		ArrayList arraylist;
		int j = Builder.zza(builder1).length;
	//    0    0:aload_0         
	//    1    1:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//    2    4:arraylength     
	//    3    5:istore_2        
		flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          4
		if(j == 0)
	//*   6    9:iload_2         
	//*   7   10:ifne            18
			return new CursorWindow[0];
	//    8   13:iconst_0        
	//    9   14:anewarray       CursorWindow[]
	//   10   17:areturn         
		if(i >= 0 && i < Builder.zzb(builder1).size())
	//*  11   18:iload_1         
	//*  12   19:iflt            50
	//*  13   22:iload_1         
	//*  14   23:aload_0         
	//*  15   24:invokestatic    #198 <Method ArrayList DataHolder$Builder.zzb(DataHolder$Builder)>
	//*  16   27:invokevirtual   #203 <Method int ArrayList.size()>
	//*  17   30:icmplt          36
	//*  18   33:goto            50
			obj2 = ((Object) (Builder.zzb(builder1).subList(0, i)));
	//   19   36:aload_0         
	//   20   37:invokestatic    #198 <Method ArrayList DataHolder$Builder.zzb(DataHolder$Builder)>
	//   21   40:iconst_0        
	//   22   41:iload_1         
	//   23   42:invokevirtual   #207 <Method List ArrayList.subList(int, int)>
	//   24   45:astore          11
		else
	//*  25   47:goto            56
			obj2 = ((Object) (Builder.zzb(builder1)));
	//   26   50:aload_0         
	//   27   51:invokestatic    #198 <Method ArrayList DataHolder$Builder.zzb(DataHolder$Builder)>
	//   28   54:astore          11
		i1 = ((List) (obj2)).size();
	//   29   56:aload           11
	//   30   58:invokeinterface #210 <Method int List.size()>
	//   31   63:istore          5
		obj1 = ((Object) (new CursorWindow(false)));
	//   32   65:new             #194 <Class CursorWindow>
	//   33   68:dup             
	//   34   69:iconst_0        
	//   35   70:invokespecial   #213 <Method void CursorWindow(boolean)>
	//   36   73:astore          10
		arraylist = new ArrayList();
	//   37   75:new             #200 <Class ArrayList>
	//   38   78:dup             
	//   39   79:invokespecial   #214 <Method void ArrayList()>
	//   40   82:astore          12
		arraylist.add(obj1);
	//   41   84:aload           12
	//   42   86:aload           10
	//   43   88:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   44   91:pop             
		((CursorWindow) (obj1)).setNumColumns(Builder.zza(builder1).length);
	//   45   92:aload           10
	//   46   94:aload_0         
	//   47   95:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//   48   98:arraylength     
	//   49   99:invokevirtual   #222 <Method boolean CursorWindow.setNumColumns(int)>
	//   50  102:pop             
		i = 0;
	//   51  103:iconst_0        
	//   52  104:istore_1        
		flag = false;
	//   53  105:iconst_0        
	//   54  106:istore_2        
_L10:
		if(i >= i1) goto _L2; else goto _L1
	//   55  107:iload_1         
	//   56  108:iload           5
	//   57  110:icmpge          757
_L1:
		Object obj = obj1;
	//   58  113:aload           10
	//   59  115:astore          9
		if(((CursorWindow) (obj1)).allocRow())
			break MISSING_BLOCK_LABEL_251;
	//   60  117:aload           10
	//   61  119:invokevirtual   #225 <Method boolean CursorWindow.allocRow()>
	//   62  122:ifne            251
		obj = ((Object) (new StringBuilder(72)));
	//   63  125:new             #227 <Class StringBuilder>
	//   64  128:dup             
	//   65  129:bipush          72
	//   66  131:invokespecial   #230 <Method void StringBuilder(int)>
	//   67  134:astore          9
		((StringBuilder) (obj)).append("Allocating additional cursor window for large data set (row ");
	//   68  136:aload           9
	//   69  138:ldc1            #232 <String "Allocating additional cursor window for large data set (row ">
	//   70  140:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   71  143:pop             
		((StringBuilder) (obj)).append(i);
	//   72  144:aload           9
	//   73  146:iload_1         
	//   74  147:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   75  150:pop             
		((StringBuilder) (obj)).append(")");
	//   76  151:aload           9
	//   77  153:ldc1            #241 <String ")">
	//   78  155:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   79  158:pop             
		Log.d("DataHolder", ((StringBuilder) (obj)).toString());
	//   80  159:ldc1            #243 <String "DataHolder">
	//   81  161:aload           9
	//   82  163:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   83  166:invokestatic    #253 <Method int Log.d(String, String)>
	//   84  169:pop             
		obj1 = ((Object) (new CursorWindow(false)));
	//   85  170:new             #194 <Class CursorWindow>
	//   86  173:dup             
	//   87  174:iconst_0        
	//   88  175:invokespecial   #213 <Method void CursorWindow(boolean)>
	//   89  178:astore          10
		((CursorWindow) (obj1)).setStartPosition(i);
	//   90  180:aload           10
	//   91  182:iload_1         
	//   92  183:invokevirtual   #256 <Method void CursorWindow.setStartPosition(int)>
		((CursorWindow) (obj1)).setNumColumns(Builder.zza(builder1).length);
	//   93  186:aload           10
	//   94  188:aload_0         
	//   95  189:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//   96  192:arraylength     
	//   97  193:invokevirtual   #222 <Method boolean CursorWindow.setNumColumns(int)>
	//   98  196:pop             
		arraylist.add(obj1);
	//   99  197:aload           12
	//  100  199:aload           10
	//  101  201:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//  102  204:pop             
		obj = obj1;
	//  103  205:aload           10
	//  104  207:astore          9
		if(!((CursorWindow) (obj1)).allocRow())
	//* 105  209:aload           10
	//* 106  211:invokevirtual   #225 <Method boolean CursorWindow.allocRow()>
	//* 107  214:ifne            251
		{
			Log.e("DataHolder", "Unable to allocate row to hold data.");
	//  108  217:ldc1            #243 <String "DataHolder">
	//  109  219:ldc2            #258 <String "Unable to allocate row to hold data.">
	//  110  222:invokestatic    #261 <Method int Log.e(String, String)>
	//  111  225:pop             
			arraylist.remove(obj1);
	//  112  226:aload           12
	//  113  228:aload           10
	//  114  230:invokevirtual   #264 <Method boolean ArrayList.remove(Object)>
	//  115  233:pop             
			return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//  116  234:aload           12
	//  117  236:aload           12
	//  118  238:invokevirtual   #203 <Method int ArrayList.size()>
	//  119  241:anewarray       CursorWindow[]
	//  120  244:invokevirtual   #268 <Method Object[] ArrayList.toArray(Object[])>
	//  121  247:checkcast       #134 <Class CursorWindow[]>
	//  122  250:areturn         
		}
		Map map = (Map)((List) (obj2)).get(i);
	//  123  251:aload           11
	//  124  253:iload_1         
	//  125  254:invokeinterface #272 <Method Object List.get(int)>
	//  126  259:checkcast       #274 <Class Map>
	//  127  262:astore          13
		int l;
		boolean flag2;
		l = 0;
	//  128  264:iconst_0        
	//  129  265:istore_3        
		flag2 = true;
	//  130  266:iconst_1        
	//  131  267:istore          6
_L11:
		if(l >= Builder.zza(builder1).length || !flag2) goto _L4; else goto _L3
	//  132  269:iload_3         
	//  133  270:aload_0         
	//  134  271:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//  135  274:arraylength     
	//  136  275:icmpge          592
	//  137  278:iload           6
	//  138  280:ifeq            592
_L3:
		Object obj3;
		obj1 = ((Object) (Builder.zza(builder1)[l]));
	//  139  283:aload_0         
	//  140  284:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//  141  287:iload_3         
	//  142  288:aaload          
	//  143  289:astore          10
		obj3 = map.get(obj1);
	//  144  291:aload           13
	//  145  293:aload           10
	//  146  295:invokeinterface #276 <Method Object Map.get(Object)>
	//  147  300:astore          14
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_319;
	//  148  302:aload           14
	//  149  304:ifnonnull       319
		flag2 = ((CursorWindow) (obj)).putNull(i, l);
	//  150  307:aload           9
	//  151  309:iload_1         
	//  152  310:iload_3         
	//  153  311:invokevirtual   #280 <Method boolean CursorWindow.putNull(int, int)>
	//  154  314:istore          6
		break MISSING_BLOCK_LABEL_780;
	//  155  316:goto            780
		if(obj3 instanceof String)
	//* 156  319:aload           14
	//* 157  321:instanceof      #67  <Class String>
	//* 158  324:ifeq            344
		{
			flag2 = ((CursorWindow) (obj)).putString((String)obj3, i, l);
	//  159  327:aload           9
	//  160  329:aload           14
	//  161  331:checkcast       #67  <Class String>
	//  162  334:iload_1         
	//  163  335:iload_3         
	//  164  336:invokevirtual   #284 <Method boolean CursorWindow.putString(String, int, int)>
	//  165  339:istore          6
			break MISSING_BLOCK_LABEL_780;
	//  166  341:goto            780
		}
		if(!(obj3 instanceof Long)) goto _L6; else goto _L5
	//  167  344:aload           14
	//  168  346:instanceof      #286 <Class Long>
	//  169  349:ifeq            376
_L5:
		long l1 = ((Long)obj3).longValue();
	//  170  352:aload           14
	//  171  354:checkcast       #286 <Class Long>
	//  172  357:invokevirtual   #290 <Method long Long.longValue()>
	//  173  360:lstore          7
_L9:
		flag2 = ((CursorWindow) (obj)).putLong(l1, i, l);
	//  174  362:aload           9
	//  175  364:lload           7
	//  176  366:iload_1         
	//  177  367:iload_3         
	//  178  368:invokevirtual   #294 <Method boolean CursorWindow.putLong(long, int, int)>
	//  179  371:istore          6
		break MISSING_BLOCK_LABEL_780;
	//  180  373:goto            780
_L6:
		if(obj3 instanceof Integer)
	//* 181  376:aload           14
	//* 182  378:instanceof      #296 <Class Integer>
	//* 183  381:ifeq            405
		{
			flag2 = ((CursorWindow) (obj)).putLong(((Integer)obj3).intValue(), i, l);
	//  184  384:aload           9
	//  185  386:aload           14
	//  186  388:checkcast       #296 <Class Integer>
	//  187  391:invokevirtual   #299 <Method int Integer.intValue()>
	//  188  394:i2l             
	//  189  395:iload_1         
	//  190  396:iload_3         
	//  191  397:invokevirtual   #294 <Method boolean CursorWindow.putLong(long, int, int)>
	//  192  400:istore          6
			break MISSING_BLOCK_LABEL_780;
	//  193  402:goto            780
		}
		if(!(obj3 instanceof Boolean)) goto _L8; else goto _L7
	//  194  405:aload           14
	//  195  407:instanceof      #301 <Class Boolean>
	//  196  410:ifeq            430
_L7:
		if(((Boolean)obj3).booleanValue())
	//* 197  413:aload           14
	//* 198  415:checkcast       #301 <Class Boolean>
	//* 199  418:invokevirtual   #304 <Method boolean Boolean.booleanValue()>
	//* 200  421:ifeq            774
			l1 = 1L;
	//  201  424:lconst_1        
	//  202  425:lstore          7
		else
	//* 203  427:goto            362
	//* 204  430:aload           14
	//* 205  432:instanceof      #306 <Class byte[]>
	//* 206  435:ifeq            455
	//* 207  438:aload           9
	//* 208  440:aload           14
	//* 209  442:checkcast       #306 <Class byte[]>
	//* 210  445:iload_1         
	//* 211  446:iload_3         
	//* 212  447:invokevirtual   #310 <Method boolean CursorWindow.putBlob(byte[], int, int)>
	//* 213  450:istore          6
	//* 214  452:goto            780
	//* 215  455:aload           14
	//* 216  457:instanceof      #312 <Class Double>
	//* 217  460:ifeq            483
	//* 218  463:aload           9
	//* 219  465:aload           14
	//* 220  467:checkcast       #312 <Class Double>
	//* 221  470:invokevirtual   #316 <Method double Double.doubleValue()>
	//* 222  473:iload_1         
	//* 223  474:iload_3         
	//* 224  475:invokevirtual   #320 <Method boolean CursorWindow.putDouble(double, int, int)>
	//* 225  478:istore          6
	//* 226  480:goto            780
	//* 227  483:aload           14
	//* 228  485:instanceof      #322 <Class Float>
	//* 229  488:ifeq            512
	//* 230  491:aload           9
	//* 231  493:aload           14
	//* 232  495:checkcast       #322 <Class Float>
	//* 233  498:invokevirtual   #326 <Method float Float.floatValue()>
	//* 234  501:f2d             
	//* 235  502:iload_1         
	//* 236  503:iload_3         
	//* 237  504:invokevirtual   #320 <Method boolean CursorWindow.putDouble(double, int, int)>
	//* 238  507:istore          6
	//* 239  509:goto            780
	//* 240  512:aload           14
	//* 241  514:invokestatic    #179 <Method String String.valueOf(Object)>
	//* 242  517:astore_0        
	//* 243  518:new             #227 <Class StringBuilder>
	//* 244  521:dup             
	//* 245  522:aload           10
	//* 246  524:invokestatic    #179 <Method String String.valueOf(Object)>
	//* 247  527:invokevirtual   #183 <Method int String.length()>
	//* 248  530:bipush          32
	//* 249  532:iadd            
	//* 250  533:aload_0         
	//* 251  534:invokestatic    #179 <Method String String.valueOf(Object)>
	//* 252  537:invokevirtual   #183 <Method int String.length()>
	//* 253  540:iadd            
	//* 254  541:invokespecial   #230 <Method void StringBuilder(int)>
	//* 255  544:astore          9
	//* 256  546:aload           9
	//* 257  548:ldc2            #328 <String "Unsupported object for column ">
	//* 258  551:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 259  554:pop             
	//* 260  555:aload           9
	//* 261  557:aload           10
	//* 262  559:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 263  562:pop             
	//* 264  563:aload           9
	//* 265  565:ldc2            #330 <String ": ">
	//* 266  568:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 267  571:pop             
	//* 268  572:aload           9
	//* 269  574:aload_0         
	//* 270  575:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 271  578:pop             
	//* 272  579:new             #170 <Class IllegalArgumentException>
	//* 273  582:dup             
	//* 274  583:aload           9
	//* 275  585:invokevirtual   #247 <Method String StringBuilder.toString()>
	//* 276  588:invokespecial   #175 <Method void IllegalArgumentException(String)>
	//* 277  591:athrow          
	//* 278  592:iload           6
	//* 279  594:ifne            708
	//* 280  597:iload_2         
	//* 281  598:ifne            697
	//* 282  601:new             #227 <Class StringBuilder>
	//* 283  604:dup             
	//* 284  605:bipush          74
	//* 285  607:invokespecial   #230 <Method void StringBuilder(int)>
	//* 286  610:astore          10
	//* 287  612:aload           10
	//* 288  614:ldc2            #332 <String "Couldn't populate window data for row ">
	//* 289  617:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 290  620:pop             
	//* 291  621:aload           10
	//* 292  623:iload_1         
	//* 293  624:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//* 294  627:pop             
	//* 295  628:aload           10
	//* 296  630:ldc2            #334 <String " - allocating new window.">
	//* 297  633:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//* 298  636:pop             
	//* 299  637:ldc1            #243 <String "DataHolder">
	//* 300  639:aload           10
	//* 301  641:invokevirtual   #247 <Method String StringBuilder.toString()>
	//* 302  644:invokestatic    #253 <Method int Log.d(String, String)>
	//* 303  647:pop             
	//* 304  648:aload           9
	//* 305  650:invokevirtual   #337 <Method void CursorWindow.freeLastRow()>
	//* 306  653:new             #194 <Class CursorWindow>
	//* 307  656:dup             
	//* 308  657:iconst_0        
	//* 309  658:invokespecial   #213 <Method void CursorWindow(boolean)>
	//* 310  661:astore          9
	//* 311  663:aload           9
	//* 312  665:iload_1         
	//* 313  666:invokevirtual   #256 <Method void CursorWindow.setStartPosition(int)>
	//* 314  669:aload           9
	//* 315  671:aload_0         
	//* 316  672:invokestatic    #106 <Method String[] DataHolder$Builder.zza(DataHolder$Builder)>
	//* 317  675:arraylength     
	//* 318  676:invokevirtual   #222 <Method boolean CursorWindow.setNumColumns(int)>
	//* 319  679:pop             
	//* 320  680:aload           12
	//* 321  682:aload           9
	//* 322  684:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//* 323  687:pop             
	//* 324  688:iload_1         
	//* 325  689:iconst_1        
	//* 326  690:isub            
	//* 327  691:istore_1        
	//* 328  692:iconst_1        
	//* 329  693:istore_2        
	//* 330  694:goto            710
	//* 331  697:new             #11  <Class DataHolder$DataHolderException>
	//* 332  700:dup             
	//* 333  701:ldc2            #339 <String "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.">
	//* 334  704:invokespecial   #340 <Method void DataHolder$DataHolderException(String)>
	//* 335  707:athrow          
	//* 336  708:iconst_0        
	//* 337  709:istore_2        
	//* 338  710:iload_1         
	//* 339  711:iconst_1        
	//* 340  712:iadd            
	//* 341  713:istore_1        
	//* 342  714:aload           9
	//* 343  716:astore          10
	//* 344  718:goto            107
	//* 345  721:astore_0        
	//* 346  722:aload           12
	//* 347  724:invokevirtual   #203 <Method int ArrayList.size()>
	//* 348  727:istore_2        
	//* 349  728:iload           4
	//* 350  730:istore_1        
	//* 351  731:iload_1         
	//* 352  732:iload_2         
	//* 353  733:icmpge          755
	//* 354  736:aload           12
	//* 355  738:iload_1         
	//* 356  739:invokevirtual   #341 <Method Object ArrayList.get(int)>
	//* 357  742:checkcast       #194 <Class CursorWindow>
	//* 358  745:invokevirtual   #344 <Method void CursorWindow.close()>
	//* 359  748:iload_1         
	//* 360  749:iconst_1        
	//* 361  750:iadd            
	//* 362  751:istore_1        
	//* 363  752:goto            731
	//* 364  755:aload_0         
	//* 365  756:athrow          
	//* 366  757:aload           12
	//* 367  759:aload           12
	//* 368  761:invokevirtual   #203 <Method int ArrayList.size()>
	//* 369  764:anewarray       CursorWindow[]
	//* 370  767:invokevirtual   #268 <Method Object[] ArrayList.toArray(Object[])>
	//* 371  770:checkcast       #134 <Class CursorWindow[]>
	//* 372  773:areturn         
			l1 = 0L;
	//  373  774:lconst_0        
	//  374  775:lstore          7
		if(true) goto _L9; else goto _L8
	//  375  777:goto            362
_L8:
		if(obj3 instanceof byte[])
		{
			flag2 = ((CursorWindow) (obj)).putBlob((byte[])obj3, i, l);
			break MISSING_BLOCK_LABEL_780;
		}
		if(obj3 instanceof Double)
		{
			flag2 = ((CursorWindow) (obj)).putDouble(((Double)obj3).doubleValue(), i, l);
			break MISSING_BLOCK_LABEL_780;
		}
		break MISSING_BLOCK_LABEL_483;
_L4:
		if(flag2)
			break MISSING_BLOCK_LABEL_708;
		if(flag)
			break MISSING_BLOCK_LABEL_697;
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
		flag = true;
		break MISSING_BLOCK_LABEL_710;
		throw new DataHolderException("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
		flag = false;
		i++;
		obj1 = obj;
		  goto _L10
		if(obj3 instanceof Float)
		{
			flag2 = ((CursorWindow) (obj)).putDouble(((Float)obj3).floatValue(), i, l);
			break MISSING_BLOCK_LABEL_780;
		}
		int k;
		try
		{
			builder1 = ((Builder) (String.valueOf(obj3)));
			obj = ((Object) (new StringBuilder(String.valueOf(obj1).length() + 32 + String.valueOf(((Object) (builder1))).length())));
			((StringBuilder) (obj)).append("Unsupported object for column ");
			((StringBuilder) (obj)).append(((String) (obj1)));
			((StringBuilder) (obj)).append(": ");
			((StringBuilder) (obj)).append(((String) (builder1)));
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		}
		// Misplaced declaration of an exception variable
		catch(Builder builder1)
		{
			k = arraylist.size();
		}
		for(i = ((int) (flag1)); i < k; i++)
			((CursorWindow)arraylist.get(i)).close();

		throw builder1;
_L2:
		return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
		l++;
	//  376  780:iload_3         
	//  377  781:iconst_1        
	//  378  782:iadd            
	//  379  783:istore_3        
		  goto _L11
	//* 380  784:goto            269
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
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 178);
	//   15   31:new             #227 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:aload_1         
	//   18   36:invokestatic    #179 <Method String String.valueOf(Object)>
	//   19   39:invokevirtual   #183 <Method int String.length()>
	//   20   42:sipush          178
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
	//    1    1:getfield        #163 <Field int zznr>
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
	//*   6    8:getfield        #163 <Field int zznr>
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
			int ai[] = zznq;
	//   15   28:aload_0         
	//   16   29:getfield        #444 <Field int[] zznq>
	//   17   32:astore          5
			j = k;
	//   18   34:iload_3         
	//   19   35:istore_2        
			if(k >= ai.length)
				break;
	//   20   36:iload_3         
	//   21   37:aload           5
	//   22   39:arraylength     
	//   23   40:icmpge          65
			if(i < ai[k])
	//*  24   43:iload_1         
	//*  25   44:aload           5
	//*  26   46:iload_3         
	//*  27   47:iaload          
	//*  28   48:icmpge          58
			{
				j = k - 1;
	//   29   51:iload_3         
	//   30   52:iconst_1        
	//   31   53:isub            
	//   32   54:istore_2        
				break;
	//   33   55:goto            65
			}
			k++;
	//   34   58:iload_3         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:istore_3        
		} while(true);
	//   38   62:goto            28
		i = j;
	//   39   65:iload_2         
	//   40   66:istore_1        
		if(j == zznq.length)
	//*  41   67:iload_2         
	//*  42   68:aload_0         
	//*  43   69:getfield        #444 <Field int[] zznq>
	//*  44   72:arraylength     
	//*  45   73:icmpne          80
			i = j - 1;
	//   46   76:iload_2         
	//   47   77:iconst_1        
	//   48   78:isub            
	//   49   79:istore_1        
		return i;
	//   50   80:iload_1         
	//   51   81:ireturn         
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
		int i = zzno.length;
	//    4    9:aload_0         
	//    5   10:getfield        #87  <Field CursorWindow[] zzno>
	//    6   13:arraylength     
	//    7   14:istore_1        
		StringBuilder stringbuilder = new StringBuilder(32);
	//    8   15:new             #227 <Class StringBuilder>
	//    9   18:dup             
	//   10   19:bipush          32
	//   11   21:invokespecial   #230 <Method void StringBuilder(int)>
	//   12   24:astore_3        
		stringbuilder.append("num cursor windows : ");
	//   13   25:aload_3         
	//   14   26:ldc2            #454 <String "num cursor windows : ">
	//   15   29:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(i);
	//   17   33:aload_3         
	//   18   34:iload_1         
	//   19   35:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   20   38:pop             
		Log.d("DataHolder", stringbuilder.toString());
	//   21   39:ldc1            #243 <String "DataHolder">
	//   22   41:aload_3         
	//   23   42:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   24   45:invokestatic    #253 <Method int Log.d(String, String)>
	//   25   48:pop             
		i = zznr;
	//   26   49:aload_0         
	//   27   50:getfield        #163 <Field int zznr>
	//   28   53:istore_1        
		stringbuilder = new StringBuilder(46);
	//   29   54:new             #227 <Class StringBuilder>
	//   30   57:dup             
	//   31   58:bipush          46
	//   32   60:invokespecial   #230 <Method void StringBuilder(int)>
	//   33   63:astore_3        
		stringbuilder.append("total number of objects in holder: ");
	//   34   64:aload_3         
	//   35   65:ldc2            #456 <String "total number of objects in holder: ">
	//   36   68:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		stringbuilder.append(i);
	//   38   72:aload_3         
	//   39   73:iload_1         
	//   40   74:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   41   77:pop             
		Log.d("DataHolder", stringbuilder.toString());
	//   42   78:ldc1            #243 <String "DataHolder">
	//   43   80:aload_3         
	//   44   81:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   45   84:invokestatic    #253 <Method int Log.d(String, String)>
	//   46   87:pop             
		i = zznq.length;
	//   47   88:aload_0         
	//   48   89:getfield        #444 <Field int[] zznq>
	//   49   92:arraylength     
	//   50   93:istore_1        
		stringbuilder = new StringBuilder(42);
	//   51   94:new             #227 <Class StringBuilder>
	//   52   97:dup             
	//   53   98:bipush          42
	//   54  100:invokespecial   #230 <Method void StringBuilder(int)>
	//   55  103:astore_3        
		stringbuilder.append("total mumber of windowOffsets: ");
	//   56  104:aload_3         
	//   57  105:ldc2            #458 <String "total mumber of windowOffsets: ">
	//   58  108:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
		stringbuilder.append(i);
	//   60  112:aload_3         
	//   61  113:iload_1         
	//   62  114:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   63  117:pop             
		Log.d("DataHolder", stringbuilder.toString());
	//   64  118:ldc1            #243 <String "DataHolder">
	//   65  120:aload_3         
	//   66  121:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   67  124:invokestatic    #253 <Method int Log.d(String, String)>
	//   68  127:pop             
		i = 0;
	//   69  128:iconst_0        
	//   70  129:istore_1        
		do
		{
			int ai[] = zznq;
	//   71  130:aload_0         
	//   72  131:getfield        #444 <Field int[] zznq>
	//   73  134:astore_3        
			if(i < ai.length)
	//*  74  135:iload_1         
	//*  75  136:aload_3         
	//*  76  137:arraylength     
	//*  77  138:icmpge          316
			{
				int j = ai[i];
	//   78  141:aload_3         
	//   79  142:iload_1         
	//   80  143:iaload          
	//   81  144:istore_2        
				StringBuilder stringbuilder1 = new StringBuilder(43);
	//   82  145:new             #227 <Class StringBuilder>
	//   83  148:dup             
	//   84  149:bipush          43
	//   85  151:invokespecial   #230 <Method void StringBuilder(int)>
	//   86  154:astore_3        
				stringbuilder1.append("offset for window ");
	//   87  155:aload_3         
	//   88  156:ldc2            #460 <String "offset for window ">
	//   89  159:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   90  162:pop             
				stringbuilder1.append(i);
	//   91  163:aload_3         
	//   92  164:iload_1         
	//   93  165:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   94  168:pop             
				stringbuilder1.append(" : ");
	//   95  169:aload_3         
	//   96  170:ldc2            #462 <String " : ">
	//   97  173:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   98  176:pop             
				stringbuilder1.append(j);
	//   99  177:aload_3         
	//  100  178:iload_2         
	//  101  179:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  102  182:pop             
				Log.d("DataHolder", stringbuilder1.toString());
	//  103  183:ldc1            #243 <String "DataHolder">
	//  104  185:aload_3         
	//  105  186:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  106  189:invokestatic    #253 <Method int Log.d(String, String)>
	//  107  192:pop             
				j = zzno[i].getNumRows();
	//  108  193:aload_0         
	//  109  194:getfield        #87  <Field CursorWindow[] zzno>
	//  110  197:iload_1         
	//  111  198:aaload          
	//  112  199:invokevirtual   #364 <Method int CursorWindow.getNumRows()>
	//  113  202:istore_2        
				stringbuilder1 = new StringBuilder(45);
	//  114  203:new             #227 <Class StringBuilder>
	//  115  206:dup             
	//  116  207:bipush          45
	//  117  209:invokespecial   #230 <Method void StringBuilder(int)>
	//  118  212:astore_3        
				stringbuilder1.append("num rows for window ");
	//  119  213:aload_3         
	//  120  214:ldc2            #464 <String "num rows for window ">
	//  121  217:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  122  220:pop             
				stringbuilder1.append(i);
	//  123  221:aload_3         
	//  124  222:iload_1         
	//  125  223:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  126  226:pop             
				stringbuilder1.append(" : ");
	//  127  227:aload_3         
	//  128  228:ldc2            #462 <String " : ">
	//  129  231:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  130  234:pop             
				stringbuilder1.append(j);
	//  131  235:aload_3         
	//  132  236:iload_2         
	//  133  237:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  134  240:pop             
				Log.d("DataHolder", stringbuilder1.toString());
	//  135  241:ldc1            #243 <String "DataHolder">
	//  136  243:aload_3         
	//  137  244:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  138  247:invokestatic    #253 <Method int Log.d(String, String)>
	//  139  250:pop             
				j = zzno[i].getStartPosition();
	//  140  251:aload_0         
	//  141  252:getfield        #87  <Field CursorWindow[] zzno>
	//  142  255:iload_1         
	//  143  256:aaload          
	//  144  257:invokevirtual   #354 <Method int CursorWindow.getStartPosition()>
	//  145  260:istore_2        
				stringbuilder1 = new StringBuilder(46);
	//  146  261:new             #227 <Class StringBuilder>
	//  147  264:dup             
	//  148  265:bipush          46
	//  149  267:invokespecial   #230 <Method void StringBuilder(int)>
	//  150  270:astore_3        
				stringbuilder1.append("start pos for window ");
	//  151  271:aload_3         
	//  152  272:ldc2            #466 <String "start pos for window ">
	//  153  275:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  154  278:pop             
				stringbuilder1.append(i);
	//  155  279:aload_3         
	//  156  280:iload_1         
	//  157  281:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  158  284:pop             
				stringbuilder1.append(" : ");
	//  159  285:aload_3         
	//  160  286:ldc2            #462 <String " : ">
	//  161  289:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  162  292:pop             
				stringbuilder1.append(j);
	//  163  293:aload_3         
	//  164  294:iload_2         
	//  165  295:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  166  298:pop             
				Log.d("DataHolder", stringbuilder1.toString());
	//  167  299:ldc1            #243 <String "DataHolder">
	//  168  301:aload_3         
	//  169  302:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  170  305:invokestatic    #253 <Method int Log.d(String, String)>
	//  171  308:pop             
				i++;
	//  172  309:iload_1         
	//  173  310:iconst_1        
	//  174  311:iadd            
	//  175  312:istore_1        
			} else
	//* 176  313:goto            130
			{
				Log.d("DataHolder", "*******************************************");
	//  177  316:ldc1            #243 <String "DataHolder">
	//  178  318:ldc2            #452 <String "*******************************************">
	//  179  321:invokestatic    #253 <Method int Log.d(String, String)>
	//  180  324:pop             
				return;
	//  181  325:return          
			}
		} while(true);
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
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		do
		{
			String as[] = zznm;
	//    9   15:aload_0         
	//   10   16:getfield        #85  <Field String[] zznm>
	//   11   19:astore          4
			if(i >= as.length)
				break;
	//   12   21:iload_1         
	//   13   22:aload           4
	//   14   24:arraylength     
	//   15   25:icmpge          47
			zznn.putInt(as[i], i);
	//   16   28:aload_0         
	//   17   29:getfield        #151 <Field Bundle zznn>
	//   18   32:aload           4
	//   19   34:iload_1         
	//   20   35:aaload          
	//   21   36:iload_1         
	//   22   37:invokevirtual   #485 <Method void Bundle.putInt(String, int)>
			i++;
	//   23   40:iload_1         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore_1        
		} while(true);
	//   27   44:goto            15
		zznq = new int[zzno.length];
	//   28   47:aload_0         
	//   29   48:aload_0         
	//   30   49:getfield        #87  <Field CursorWindow[] zzno>
	//   31   52:arraylength     
	//   32   53:newarray        int[]
	//   33   55:putfield        #444 <Field int[] zznq>
		int j = 0;
	//   34   58:iconst_0        
	//   35   59:istore_2        
		i = ((int) (flag));
	//   36   60:iload_3         
	//   37   61:istore_1        
		do
		{
			CursorWindow acursorwindow[] = zzno;
	//   38   62:aload_0         
	//   39   63:getfield        #87  <Field CursorWindow[] zzno>
	//   40   66:astore          4
			if(i < acursorwindow.length)
	//*  41   68:iload_1         
	//*  42   69:aload           4
	//*  43   71:arraylength     
	//*  44   72:icmpge          113
			{
				zznq[i] = j;
	//   45   75:aload_0         
	//   46   76:getfield        #444 <Field int[] zznq>
	//   47   79:iload_1         
	//   48   80:iload_2         
	//   49   81:iastore         
				int k = acursorwindow[i].getStartPosition();
	//   50   82:aload           4
	//   51   84:iload_1         
	//   52   85:aaload          
	//   53   86:invokevirtual   #354 <Method int CursorWindow.getStartPosition()>
	//   54   89:istore_3        
				j += zzno[i].getNumRows() - (j - k);
	//   55   90:iload_2         
	//   56   91:aload_0         
	//   57   92:getfield        #87  <Field CursorWindow[] zzno>
	//   58   95:iload_1         
	//   59   96:aaload          
	//   60   97:invokevirtual   #364 <Method int CursorWindow.getNumRows()>
	//   61  100:iload_2         
	//   62  101:iload_3         
	//   63  102:isub            
	//   64  103:isub            
	//   65  104:iadd            
	//   66  105:istore_2        
				i++;
	//   67  106:iload_1         
	//   68  107:iconst_1        
	//   69  108:iadd            
	//   70  109:istore_1        
			} else
	//*  71  110:goto            62
			{
				zznr = j;
	//   72  113:aload_0         
	//   73  114:iload_2         
	//   74  115:putfield        #163 <Field int zznr>
				return;
	//   75  118:return          
			}
		} while(true);
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
