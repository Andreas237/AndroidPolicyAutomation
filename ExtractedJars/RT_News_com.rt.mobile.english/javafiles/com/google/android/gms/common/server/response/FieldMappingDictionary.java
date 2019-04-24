// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FieldMappingDictionaryCreator, FieldMappingDictionaryEntryCreator, FieldMapPairCreator

public class FieldMappingDictionary extends AbstractSafeParcelable
{
	public static class Entry extends AbstractSafeParcelable
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			i = SafeParcelWriter.beginObjectHeader(parcel);
		//    0    0:aload_1         
		//    1    1:invokestatic    #102 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
		//    2    4:istore_2        
			SafeParcelWriter.writeInt(parcel, 1, versionCode);
		//    3    5:aload_1         
		//    4    6:iconst_1        
		//    5    7:aload_0         
		//    6    8:getfield        #42  <Field int versionCode>
		//    7   11:invokestatic    #106 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
			SafeParcelWriter.writeString(parcel, 2, className, false);
		//    8   14:aload_1         
		//    9   15:iconst_2        
		//   10   16:aload_0         
		//   11   17:getfield        #44  <Field String className>
		//   12   20:iconst_0        
		//   13   21:invokestatic    #110 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
			SafeParcelWriter.writeTypedList(parcel, 3, ((java.util.List) (zzxn)), false);
		//   14   24:aload_1         
		//   15   25:iconst_3        
		//   16   26:aload_0         
		//   17   27:getfield        #46  <Field ArrayList zzxn>
		//   18   30:iconst_0        
		//   19   31:invokestatic    #114 <Method void SafeParcelWriter.writeTypedList(Parcel, int, java.util.List, boolean)>
			SafeParcelWriter.finishObjectHeader(parcel, i);
		//   20   34:aload_1         
		//   21   35:iload_2         
		//   22   36:invokestatic    #117 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
		//   23   39:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new FieldMappingDictionaryEntryCreator();
		final String className;
		private final int versionCode;
		final ArrayList zzxn;

		static 
		{
		//    0    0:new             #30  <Class FieldMappingDictionaryEntryCreator>
		//    1    3:dup             
		//    2    4:invokespecial   #33  <Method void FieldMappingDictionaryEntryCreator()>
		//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		Entry(int i, String s, ArrayList arraylist)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
			versionCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #42  <Field int versionCode>
			className = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #44  <Field String className>
			zzxn = arraylist;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #46  <Field ArrayList zzxn>
		//   11   19:return          
		}

		Entry(String s, Map map)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
			versionCode = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #42  <Field int versionCode>
			className = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #44  <Field String className>
			if(map == null)
		//*   8   14:aload_2         
		//*   9   15:ifnonnull       23
			{
				s = null;
		//   10   18:aconst_null     
		//   11   19:astore_1        
			} else
		//*  12   20:goto            93
			{
				ArrayList arraylist = new ArrayList();
		//   13   23:new             #53  <Class ArrayList>
		//   14   26:dup             
		//   15   27:invokespecial   #54  <Method void ArrayList()>
		//   16   30:astore_3        
				Iterator iterator = map.keySet().iterator();
		//   17   31:aload_2         
		//   18   32:invokeinterface #60  <Method Set Map.keySet()>
		//   19   37:invokeinterface #66  <Method Iterator Set.iterator()>
		//   20   42:astore          4
				do
				{
					s = ((String) (arraylist));
		//   21   44:aload_3         
		//   22   45:astore_1        
					if(!iterator.hasNext())
						break;
		//   23   46:aload           4
		//   24   48:invokeinterface #72  <Method boolean Iterator.hasNext()>
		//   25   53:ifeq            93
					s = (String)iterator.next();
		//   26   56:aload           4
		//   27   58:invokeinterface #76  <Method Object Iterator.next()>
		//   28   63:checkcast       #78  <Class String>
		//   29   66:astore_1        
					arraylist.add(((Object) (new FieldMapPair(s, (FastJsonResponse.Field)map.get(((Object) (s)))))));
		//   30   67:aload_3         
		//   31   68:new             #80  <Class FieldMappingDictionary$FieldMapPair>
		//   32   71:dup             
		//   33   72:aload_1         
		//   34   73:aload_2         
		//   35   74:aload_1         
		//   36   75:invokeinterface #84  <Method Object Map.get(Object)>
		//   37   80:checkcast       #86  <Class FastJsonResponse$Field>
		//   38   83:invokespecial   #89  <Method void FieldMappingDictionary$FieldMapPair(String, FastJsonResponse$Field)>
		//   39   86:invokevirtual   #93  <Method boolean ArrayList.add(Object)>
		//   40   89:pop             
				} while(true);
		//   41   90:goto            44
			}
			zzxn = ((ArrayList) (s));
		//   42   93:aload_0         
		//   43   94:aload_1         
		//   44   95:putfield        #46  <Field ArrayList zzxn>
		//   45   98:return          
		}
	}

	public static class FieldMapPair extends AbstractSafeParcelable
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			int j = SafeParcelWriter.beginObjectHeader(parcel);
		//    0    0:aload_1         
		//    1    1:invokestatic    #60  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
		//    2    4:istore_3        
			SafeParcelWriter.writeInt(parcel, 1, versionCode);
		//    3    5:aload_1         
		//    4    6:iconst_1        
		//    5    7:aload_0         
		//    6    8:getfield        #42  <Field int versionCode>
		//    7   11:invokestatic    #64  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
			SafeParcelWriter.writeString(parcel, 2, zzxo, false);
		//    8   14:aload_1         
		//    9   15:iconst_2        
		//   10   16:aload_0         
		//   11   17:getfield        #44  <Field String zzxo>
		//   12   20:iconst_0        
		//   13   21:invokestatic    #68  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
			SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (zzxp)), i, false);
		//   14   24:aload_1         
		//   15   25:iconst_3        
		//   16   26:aload_0         
		//   17   27:getfield        #46  <Field FastJsonResponse$Field zzxp>
		//   18   30:iload_2         
		//   19   31:iconst_0        
		//   20   32:invokestatic    #72  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
			SafeParcelWriter.finishObjectHeader(parcel, j);
		//   21   35:aload_1         
		//   22   36:iload_3         
		//   23   37:invokestatic    #75  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
		//   24   40:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new FieldMapPairCreator();
		private final int versionCode;
		final String zzxo;
		final FastJsonResponse.Field zzxp;

		static 
		{
		//    0    0:new             #30  <Class FieldMapPairCreator>
		//    1    3:dup             
		//    2    4:invokespecial   #33  <Method void FieldMapPairCreator()>
		//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		FieldMapPair(int i, String s, FastJsonResponse.Field field)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
			versionCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #42  <Field int versionCode>
			zzxo = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #44  <Field String zzxo>
			zzxp = field;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #46  <Field FastJsonResponse$Field zzxp>
		//   11   19:return          
		}

		FieldMapPair(String s, FastJsonResponse.Field field)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
			versionCode = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #42  <Field int versionCode>
			zzxo = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #44  <Field String zzxo>
			zzxp = field;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #46  <Field FastJsonResponse$Field zzxp>
		//   11   19:return          
		}
	}


	FieldMappingDictionary(int i, ArrayList arraylist, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void AbstractSafeParcelable()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #51  <Field int zzal>
		zzxl = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #53  <Field ArrayList zzxl>
		HashMap hashmap = new HashMap();
	//    8   14:new             #55  <Class HashMap>
	//    9   17:dup             
	//   10   18:invokespecial   #56  <Method void HashMap()>
	//   11   21:astore          7
		int k = arraylist.size();
	//   12   23:aload_2         
	//   13   24:invokevirtual   #62  <Method int ArrayList.size()>
	//   14   27:istore          5
		for(i = 0; i < k; i++)
	//*  15   29:iconst_0        
	//*  16   30:istore_1        
	//*  17   31:iload_1         
	//*  18   32:iload           5
	//*  19   34:icmpge          140
		{
			Entry entry = (Entry)arraylist.get(i);
	//   20   37:aload_2         
	//   21   38:iload_1         
	//   22   39:invokevirtual   #66  <Method Object ArrayList.get(int)>
	//   23   42:checkcast       #6   <Class FieldMappingDictionary$Entry>
	//   24   45:astore          8
			String s1 = entry.className;
	//   25   47:aload           8
	//   26   49:getfield        #69  <Field String FieldMappingDictionary$Entry.className>
	//   27   52:astore          9
			HashMap hashmap1 = new HashMap();
	//   28   54:new             #55  <Class HashMap>
	//   29   57:dup             
	//   30   58:invokespecial   #56  <Method void HashMap()>
	//   31   61:astore          10
			int l = entry.zzxn.size();
	//   32   63:aload           8
	//   33   65:getfield        #72  <Field ArrayList FieldMappingDictionary$Entry.zzxn>
	//   34   68:invokevirtual   #62  <Method int ArrayList.size()>
	//   35   71:istore          6
			for(int j = 0; j < l; j++)
	//*  36   73:iconst_0        
	//*  37   74:istore          4
	//*  38   76:iload           4
	//*  39   78:iload           6
	//*  40   80:icmpge          123
			{
				FieldMapPair fieldmappair = (FieldMapPair)entry.zzxn.get(j);
	//   41   83:aload           8
	//   42   85:getfield        #72  <Field ArrayList FieldMappingDictionary$Entry.zzxn>
	//   43   88:iload           4
	//   44   90:invokevirtual   #66  <Method Object ArrayList.get(int)>
	//   45   93:checkcast       #9   <Class FieldMappingDictionary$FieldMapPair>
	//   46   96:astore          11
				hashmap1.put(((Object) (fieldmappair.zzxo)), ((Object) (fieldmappair.zzxp)));
	//   47   98:aload           10
	//   48  100:aload           11
	//   49  102:getfield        #75  <Field String FieldMappingDictionary$FieldMapPair.zzxo>
	//   50  105:aload           11
	//   51  107:getfield        #79  <Field FastJsonResponse$Field FieldMappingDictionary$FieldMapPair.zzxp>
	//   52  110:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//   53  113:pop             
			}

	//   54  114:iload           4
	//   55  116:iconst_1        
	//   56  117:iadd            
	//   57  118:istore          4
	//*  58  120:goto            76
			hashmap.put(((Object) (s1)), ((Object) (hashmap1)));
	//   59  123:aload           7
	//   60  125:aload           9
	//   61  127:aload           10
	//   62  129:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//   63  132:pop             
		}

	//   64  133:iload_1         
	//   65  134:iconst_1        
	//   66  135:iadd            
	//   67  136:istore_1        
	//*  68  137:goto            31
		zzxk = hashmap;
	//   69  140:aload_0         
	//   70  141:aload           7
	//   71  143:putfield        #85  <Field HashMap zzxk>
		zzxm = (String)Preconditions.checkNotNull(((Object) (s)));
	//   72  146:aload_0         
	//   73  147:aload_3         
	//   74  148:invokestatic    #91  <Method Object Preconditions.checkNotNull(Object)>
	//   75  151:checkcast       #93  <Class String>
	//   76  154:putfield        #95  <Field String zzxm>
		linkFields();
	//   77  157:aload_0         
	//   78  158:invokevirtual   #98  <Method void linkFields()>
	//   79  161:return          
	}

	public FieldMappingDictionary(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void AbstractSafeParcelable()>
		zzal = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #51  <Field int zzal>
		zzxl = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #53  <Field ArrayList zzxl>
		zzxk = new HashMap();
	//    8   14:aload_0         
	//    9   15:new             #55  <Class HashMap>
	//   10   18:dup             
	//   11   19:invokespecial   #56  <Method void HashMap()>
	//   12   22:putfield        #85  <Field HashMap zzxk>
		zzxm = class1.getCanonicalName();
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #109 <Method String Class.getCanonicalName()>
	//   16   30:putfield        #95  <Field String zzxm>
	//   17   33:return          
	}

	public void copyInternalFieldMappings()
	{
		String s;
		HashMap hashmap;
		for(Iterator iterator = zzxk.keySet().iterator(); iterator.hasNext(); zzxk.put(((Object) (s)), ((Object) (hashmap))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field HashMap zzxk>
	//*   2    4:invokevirtual   #115 <Method Set HashMap.keySet()>
	//*   3    7:invokeinterface #121 <Method Iterator Set.iterator()>
	//*   4   12:astore_1        
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            127
		{
			s = (String)iterator.next();
	//    8   22:aload_1         
	//    9   23:invokeinterface #131 <Method Object Iterator.next()>
	//   10   28:checkcast       #93  <Class String>
	//   11   31:astore_2        
			Map map = (Map)zzxk.get(((Object) (s)));
	//   12   32:aload_0         
	//   13   33:getfield        #85  <Field HashMap zzxk>
	//   14   36:aload_2         
	//   15   37:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//   16   40:checkcast       #135 <Class Map>
	//   17   43:astore_3        
			hashmap = new HashMap();
	//   18   44:new             #55  <Class HashMap>
	//   19   47:dup             
	//   20   48:invokespecial   #56  <Method void HashMap()>
	//   21   51:astore          4
			String s1;
			for(Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); hashmap.put(((Object) (s1)), ((Object) (((FastJsonResponse.Field)map.get(((Object) (s1)))).copyForDictionary()))))
	//*  22   53:aload_3         
	//*  23   54:invokeinterface #136 <Method Set Map.keySet()>
	//*  24   59:invokeinterface #121 <Method Iterator Set.iterator()>
	//*  25   64:astore          5
	//*  26   66:aload           5
	//*  27   68:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  28   73:ifeq            113
				s1 = (String)iterator1.next();
	//   29   76:aload           5
	//   30   78:invokeinterface #131 <Method Object Iterator.next()>
	//   31   83:checkcast       #93  <Class String>
	//   32   86:astore          6

	//   33   88:aload           4
	//   34   90:aload           6
	//   35   92:aload_3         
	//   36   93:aload           6
	//   37   95:invokeinterface #137 <Method Object Map.get(Object)>
	//   38  100:checkcast       #139 <Class FastJsonResponse$Field>
	//   39  103:invokevirtual   #143 <Method FastJsonResponse$Field FastJsonResponse$Field.copyForDictionary()>
	//   40  106:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//   41  109:pop             
		}

	//   42  110:goto            66
	//   43  113:aload_0         
	//   44  114:getfield        #85  <Field HashMap zzxk>
	//   45  117:aload_2         
	//   46  118:aload           4
	//   47  120:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//   48  123:pop             
	//*  49  124:goto            13
	//   50  127:return          
	}

	public Map getFieldMapping(Class class1)
	{
		return (Map)zzxk.get(((Object) (class1.getCanonicalName())));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field HashMap zzxk>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method String Class.getCanonicalName()>
	//    4    8:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #135 <Class Map>
	//    6   14:areturn         
	}

	public Map getFieldMapping(String s)
	{
		return (Map)zzxk.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field HashMap zzxk>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #135 <Class Map>
	//    5   11:areturn         
	}

	public String getRootClassName()
	{
		return zzxm;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field String zzxm>
	//    2    4:areturn         
	}

	public boolean hasFieldMappingForClass(Class class1)
	{
		return zzxk.containsKey(((Object) (class1.getCanonicalName())));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field HashMap zzxk>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method String Class.getCanonicalName()>
	//    4    8:invokevirtual   #155 <Method boolean HashMap.containsKey(Object)>
	//    5   11:ireturn         
	}

	public void linkFields()
	{
		for(Iterator iterator = zzxk.keySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field HashMap zzxk>
	//*   2    4:invokevirtual   #115 <Method Set HashMap.keySet()>
	//*   3    7:invokeinterface #121 <Method Iterator Set.iterator()>
	//*   4   12:astore_1        
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            90
		{
			Object obj = ((Object) ((String)iterator.next()));
	//    8   22:aload_1         
	//    9   23:invokeinterface #131 <Method Object Iterator.next()>
	//   10   28:checkcast       #93  <Class String>
	//   11   31:astore_2        
			obj = ((Object) ((Map)zzxk.get(obj)));
	//   12   32:aload_0         
	//   13   33:getfield        #85  <Field HashMap zzxk>
	//   14   36:aload_2         
	//   15   37:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//   16   40:checkcast       #135 <Class Map>
	//   17   43:astore_2        
			Iterator iterator1 = ((Map) (obj)).keySet().iterator();
	//   18   44:aload_2         
	//   19   45:invokeinterface #136 <Method Set Map.keySet()>
	//   20   50:invokeinterface #121 <Method Iterator Set.iterator()>
	//   21   55:astore_3        
			while(iterator1.hasNext()) 
	//*  22   56:aload_3         
	//*  23   57:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  24   62:ifeq            13
				((FastJsonResponse.Field)((Map) (obj)).get(((Object) ((String)iterator1.next())))).setFieldMappingDictionary(this);
	//   25   65:aload_2         
	//   26   66:aload_3         
	//   27   67:invokeinterface #131 <Method Object Iterator.next()>
	//   28   72:checkcast       #93  <Class String>
	//   29   75:invokeinterface #137 <Method Object Map.get(Object)>
	//   30   80:checkcast       #139 <Class FastJsonResponse$Field>
	//   31   83:aload_0         
	//   32   84:invokevirtual   #160 <Method void FastJsonResponse$Field.setFieldMappingDictionary(FieldMappingDictionary)>
		}

	//*  33   87:goto            56
	//   34   90:return          
	}

	public void put(Class class1, Map map)
	{
		zzxk.put(((Object) (class1.getCanonicalName())), ((Object) (map)));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field HashMap zzxk>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method String Class.getCanonicalName()>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #83  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #165 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #166 <Method void StringBuilder()>
	//    3    7:astore_1        
		for(Iterator iterator = zzxk.keySet().iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #85  <Field HashMap zzxk>
	//*   6   12:invokevirtual   #115 <Method Set HashMap.keySet()>
	//*   7   15:invokeinterface #121 <Method Iterator Set.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            137
		{
			Object obj = ((Object) ((String)iterator.next()));
	//   12   30:aload_2         
	//   13   31:invokeinterface #131 <Method Object Iterator.next()>
	//   14   36:checkcast       #93  <Class String>
	//   15   39:astore_3        
			stringbuilder.append(((String) (obj)));
	//   16   40:aload_1         
	//   17   41:aload_3         
	//   18   42:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:pop             
			stringbuilder.append(":\n");
	//   20   46:aload_1         
	//   21   47:ldc1            #172 <String ":\n">
	//   22   49:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
			obj = ((Object) ((Map)zzxk.get(obj)));
	//   24   53:aload_0         
	//   25   54:getfield        #85  <Field HashMap zzxk>
	//   26   57:aload_3         
	//   27   58:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//   28   61:checkcast       #135 <Class Map>
	//   29   64:astore_3        
			Iterator iterator1 = ((Map) (obj)).keySet().iterator();
	//   30   65:aload_3         
	//   31   66:invokeinterface #136 <Method Set Map.keySet()>
	//   32   71:invokeinterface #121 <Method Iterator Set.iterator()>
	//   33   76:astore          4
			while(iterator1.hasNext()) 
	//*  34   78:aload           4
	//*  35   80:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  36   85:ifeq            21
			{
				String s = (String)iterator1.next();
	//   37   88:aload           4
	//   38   90:invokeinterface #131 <Method Object Iterator.next()>
	//   39   95:checkcast       #93  <Class String>
	//   40   98:astore          5
				stringbuilder.append("  ");
	//   41  100:aload_1         
	//   42  101:ldc1            #174 <String "  ">
	//   43  103:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   44  106:pop             
				stringbuilder.append(s);
	//   45  107:aload_1         
	//   46  108:aload           5
	//   47  110:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   48  113:pop             
				stringbuilder.append(": ");
	//   49  114:aload_1         
	//   50  115:ldc1            #176 <String ": ">
	//   51  117:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   52  120:pop             
				stringbuilder.append(((Map) (obj)).get(((Object) (s))));
	//   53  121:aload_1         
	//   54  122:aload_3         
	//   55  123:aload           5
	//   56  125:invokeinterface #137 <Method Object Map.get(Object)>
	//   57  130:invokevirtual   #179 <Method StringBuilder StringBuilder.append(Object)>
	//   58  133:pop             
			}
		}

	//*  59  134:goto            78
		return stringbuilder.toString();
	//   60  137:aload_1         
	//   61  138:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   62  141:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #189 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzal);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field int zzal>
	//    7   11:invokestatic    #193 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #58  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #194 <Method void ArrayList()>
	//   11   21:astore_3        
		String s;
		for(Iterator iterator = zzxk.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new Entry(s, (Map)zzxk.get(((Object) (s))))))))
	//*  12   22:aload_0         
	//*  13   23:getfield        #85  <Field HashMap zzxk>
	//*  14   26:invokevirtual   #115 <Method Set HashMap.keySet()>
	//*  15   29:invokeinterface #121 <Method Iterator Set.iterator()>
	//*  16   34:astore          4
	//*  17   36:aload           4
	//*  18   38:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            87
			s = (String)iterator.next();
	//   20   46:aload           4
	//   21   48:invokeinterface #131 <Method Object Iterator.next()>
	//   22   53:checkcast       #93  <Class String>
	//   23   56:astore          5

	//   24   58:aload_3         
	//   25   59:new             #6   <Class FieldMappingDictionary$Entry>
	//   26   62:dup             
	//   27   63:aload           5
	//   28   65:aload_0         
	//   29   66:getfield        #85  <Field HashMap zzxk>
	//   30   69:aload           5
	//   31   71:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//   32   74:checkcast       #135 <Class Map>
	//   33   77:invokespecial   #197 <Method void FieldMappingDictionary$Entry(String, Map)>
	//   34   80:invokevirtual   #200 <Method boolean ArrayList.add(Object)>
	//   35   83:pop             
	//*  36   84:goto            36
		SafeParcelWriter.writeTypedList(parcel, 2, ((java.util.List) (arraylist)), false);
	//   37   87:aload_1         
	//   38   88:iconst_2        
	//   39   89:aload_3         
	//   40   90:iconst_0        
	//   41   91:invokestatic    #204 <Method void SafeParcelWriter.writeTypedList(Parcel, int, java.util.List, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getRootClassName(), false);
	//   42   94:aload_1         
	//   43   95:iconst_3        
	//   44   96:aload_0         
	//   45   97:invokevirtual   #206 <Method String getRootClassName()>
	//   46  100:iconst_0        
	//   47  101:invokestatic    #210 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   48  104:aload_1         
	//   49  105:iload_2         
	//   50  106:invokestatic    #213 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   51  109:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new FieldMappingDictionaryCreator();
	private final int zzal;
	private final HashMap zzxk;
	private final ArrayList zzxl;
	private final String zzxm;

	static 
	{
	//    0    0:new             #39  <Class FieldMappingDictionaryCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void FieldMappingDictionaryCreator()>
	//    3    7:putstatic       #44  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
