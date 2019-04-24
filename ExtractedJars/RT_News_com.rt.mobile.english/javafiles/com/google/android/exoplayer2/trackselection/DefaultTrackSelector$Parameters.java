// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Util;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			DefaultTrackSelector

public static final class DefaultTrackSelector$Parameters
	implements Parcelable
{

	private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparsebooleanarray, SparseBooleanArray sparsebooleanarray1)
	{
		int j = sparsebooleanarray.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method int SparseBooleanArray.size()>
	//    2    4:istore_3        
		if(sparsebooleanarray1.size() != j)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #140 <Method int SparseBooleanArray.size()>
	//*   5    9:iload_3         
	//*   6   10:icmpeq          15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          43
			if(sparsebooleanarray1.indexOfKey(sparsebooleanarray.keyAt(i)) < 0)
	//*  14   22:aload_1         
	//*  15   23:aload_0         
	//*  16   24:iload_2         
	//*  17   25:invokevirtual   #144 <Method int SparseBooleanArray.keyAt(int)>
	//*  18   28:invokevirtual   #147 <Method int SparseBooleanArray.indexOfKey(int)>
	//*  19   31:ifge            36
				return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         

	//   22   36:iload_2         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_2        
	//*  26   40:goto            17
		return true;
	//   27   43:iconst_1        
	//   28   44:ireturn         
	}

	private static boolean areSelectionOverridesEqual(SparseArray sparsearray, SparseArray sparsearray1)
	{
		int j = sparsearray.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int SparseArray.size()>
	//    2    4:istore_3        
		if(sparsearray1.size() != j)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #150 <Method int SparseArray.size()>
	//*   5    9:iload_3         
	//*   6   10:icmpeq          15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		for(int i = 0; i < j;)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          72
		{
			int k = sparsearray1.indexOfKey(sparsearray.keyAt(i));
	//   14   22:aload_1         
	//   15   23:aload_0         
	//   16   24:iload_2         
	//   17   25:invokevirtual   #151 <Method int SparseArray.keyAt(int)>
	//   18   28:invokevirtual   #152 <Method int SparseArray.indexOfKey(int)>
	//   19   31:istore          4
			if(k >= 0)
	//*  20   33:iload           4
	//*  21   35:iflt            70
			{
				if(!areSelectionOverridesEqual((Map)sparsearray.valueAt(i), (Map)sparsearray1.valueAt(k)))
	//*  22   38:aload_0         
	//*  23   39:iload_2         
	//*  24   40:invokevirtual   #156 <Method Object SparseArray.valueAt(int)>
	//*  25   43:checkcast       #158 <Class Map>
	//*  26   46:aload_1         
	//*  27   47:iload           4
	//*  28   49:invokevirtual   #156 <Method Object SparseArray.valueAt(int)>
	//*  29   52:checkcast       #158 <Class Map>
	//*  30   55:invokestatic    #161 <Method boolean areSelectionOverridesEqual(Map, Map)>
	//*  31   58:ifne            63
					return false;
	//   32   61:iconst_0        
	//   33   62:ireturn         
				i++;
	//   34   63:iload_2         
	//   35   64:iconst_1        
	//   36   65:iadd            
	//   37   66:istore_2        
			} else
	//*  38   67:goto            17
			{
				return false;
	//   39   70:iconst_0        
	//   40   71:ireturn         
			}
		}

		return true;
	//   41   72:iconst_1        
	//   42   73:ireturn         
	}

	private static boolean areSelectionOverridesEqual(Map map, Map map1)
	{
		int i = map.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #163 <Method int Map.size()>
	//    2    6:istore_2        
		if(map1.size() != i)
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #163 <Method int Map.size()>
	//*   5   13:iload_2         
	//*   6   14:icmpeq          19
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   9   19:aload_0         
	//*  10   20:invokeinterface #167 <Method Set Map.entrySet()>
	//*  11   25:invokeinterface #173 <Method Iterator Set.iterator()>
	//*  12   30:astore_0        
	//*  13   31:aload_0         
	//*  14   32:invokeinterface #179 <Method boolean Iterator.hasNext()>
	//*  15   37:ifeq            94
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   16   40:aload_0         
	//   17   41:invokeinterface #183 <Method Object Iterator.next()>
	//   18   46:checkcast       #185 <Class java.util.Map$Entry>
	//   19   49:astore_3        
			TrackGroupArray trackgrouparray = (TrackGroupArray)entry.getKey();
	//   20   50:aload_3         
	//   21   51:invokeinterface #188 <Method Object java.util.Map$Entry.getKey()>
	//   22   56:checkcast       #190 <Class TrackGroupArray>
	//   23   59:astore          4
			if(!map1.containsKey(((Object) (trackgrouparray))) || !Util.areEqual(entry.getValue(), map1.get(((Object) (trackgrouparray)))))
	//*  24   61:aload_1         
	//*  25   62:aload           4
	//*  26   64:invokeinterface #194 <Method boolean Map.containsKey(Object)>
	//*  27   69:ifeq            92
	//*  28   72:aload_3         
	//*  29   73:invokeinterface #197 <Method Object java.util.Map$Entry.getValue()>
	//*  30   78:aload_1         
	//*  31   79:aload           4
	//*  32   81:invokeinterface #201 <Method Object Map.get(Object)>
	//*  33   86:invokestatic    #205 <Method boolean Util.areEqual(Object, Object)>
	//*  34   89:ifne            31
				return false;
	//   35   92:iconst_0        
	//   36   93:ireturn         
		}

		return true;
	//   37   94:iconst_1        
	//   38   95:ireturn         
	}

	private static SparseArray readSelectionOverrides(Parcel parcel)
	{
		int k = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method int Parcel.readInt()>
	//    2    4:istore_3        
		SparseArray sparsearray = new SparseArray(k);
	//    3    5:new             #54  <Class SparseArray>
	//    4    8:dup             
	//    5    9:iload_3         
	//    6   10:invokespecial   #209 <Method void SparseArray(int)>
	//    7   13:astore          6
		for(int i = 0; i < k; i++)
	//*   8   15:iconst_0        
	//*   9   16:istore_1        
	//*  10   17:iload_1         
	//*  11   18:iload_3         
	//*  12   19:icmpge          108
		{
			int l = parcel.readInt();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #98  <Method int Parcel.readInt()>
	//   15   26:istore          4
			int i1 = parcel.readInt();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #98  <Method int Parcel.readInt()>
	//   18   32:istore          5
			HashMap hashmap = new HashMap(i1);
	//   19   34:new             #211 <Class HashMap>
	//   20   37:dup             
	//   21   38:iload           5
	//   22   40:invokespecial   #212 <Method void HashMap(int)>
	//   23   43:astore          7
			for(int j = 0; j < i1; j++)
	//*  24   45:iconst_0        
	//*  25   46:istore_2        
	//*  26   47:iload_2         
	//*  27   48:iload           5
	//*  28   50:icmpge          92
				((Map) (hashmap)).put(((Object) ((TrackGroupArray)parcel.readParcelable(((Class) (com/google/android/exoplayer2/source/TrackGroupArray)).getClassLoader()))), ((Object) ((erride)parcel.readParcelable(((Class) (com/google/android/exoplayer2/trackselection/DefaultTrackSelector$SelectionOverride)).getClassLoader()))));
	//   29   53:aload           7
	//   30   55:aload_0         
	//   31   56:ldc1            #190 <Class TrackGroupArray>
	//   32   58:invokevirtual   #218 <Method ClassLoader Class.getClassLoader()>
	//   33   61:invokevirtual   #222 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   34   64:checkcast       #190 <Class TrackGroupArray>
	//   35   67:aload_0         
	//   36   68:ldc1            #224 <Class DefaultTrackSelector$SelectionOverride>
	//   37   70:invokevirtual   #218 <Method ClassLoader Class.getClassLoader()>
	//   38   73:invokevirtual   #222 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   39   76:checkcast       #224 <Class DefaultTrackSelector$SelectionOverride>
	//   40   79:invokeinterface #228 <Method Object Map.put(Object, Object)>
	//   41   84:pop             

	//   42   85:iload_2         
	//   43   86:iconst_1        
	//   44   87:iadd            
	//   45   88:istore_2        
	//*  46   89:goto            47
			sparsearray.put(l, ((Object) (hashmap)));
	//   47   92:aload           6
	//   48   94:iload           4
	//   49   96:aload           7
	//   50   98:invokevirtual   #231 <Method void SparseArray.put(int, Object)>
		}

	//   51  101:iload_1         
	//   52  102:iconst_1        
	//   53  103:iadd            
	//   54  104:istore_1        
	//*  55  105:goto            17
		return sparsearray;
	//   56  108:aload           6
	//   57  110:areturn         
	}

	private static void writeSelectionOverridesToParcel(Parcel parcel, SparseArray sparsearray)
	{
		int j = sparsearray.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #150 <Method int SparseArray.size()>
	//    2    4:istore_3        
		parcel.writeInt(j);
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #237 <Method void Parcel.writeInt(int)>
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          131
		{
			int k = sparsearray.keyAt(i);
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #151 <Method int SparseArray.keyAt(int)>
	//   14   22:istore          4
			Object obj = ((Object) ((Map)sparsearray.valueAt(i)));
	//   15   24:aload_1         
	//   16   25:iload_2         
	//   17   26:invokevirtual   #156 <Method Object SparseArray.valueAt(int)>
	//   18   29:checkcast       #158 <Class Map>
	//   19   32:astore          6
			int l = ((Map) (obj)).size();
	//   20   34:aload           6
	//   21   36:invokeinterface #163 <Method int Map.size()>
	//   22   41:istore          5
			parcel.writeInt(k);
	//   23   43:aload_0         
	//   24   44:iload           4
	//   25   46:invokevirtual   #237 <Method void Parcel.writeInt(int)>
			parcel.writeInt(l);
	//   26   49:aload_0         
	//   27   50:iload           5
	//   28   52:invokevirtual   #237 <Method void Parcel.writeInt(int)>
			java.util.Map.Entry entry;
			for(obj = ((Object) (((Map) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext(); parcel.writeParcelable((Parcelable)entry.getValue(), 0))
	//*  29   55:aload           6
	//*  30   57:invokeinterface #167 <Method Set Map.entrySet()>
	//*  31   62:invokeinterface #173 <Method Iterator Set.iterator()>
	//*  32   67:astore          6
	//*  33   69:aload           6
	//*  34   71:invokeinterface #179 <Method boolean Iterator.hasNext()>
	//*  35   76:ifeq            124
			{
				entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   36   79:aload           6
	//   37   81:invokeinterface #183 <Method Object Iterator.next()>
	//   38   86:checkcast       #185 <Class java.util.Map$Entry>
	//   39   89:astore          7
				parcel.writeParcelable((Parcelable)entry.getKey(), 0);
	//   40   91:aload_0         
	//   41   92:aload           7
	//   42   94:invokeinterface #188 <Method Object java.util.Map$Entry.getKey()>
	//   43   99:checkcast       #6   <Class Parcelable>
	//   44  102:iconst_0        
	//   45  103:invokevirtual   #241 <Method void Parcel.writeParcelable(Parcelable, int)>
			}

	//   46  106:aload_0         
	//   47  107:aload           7
	//   48  109:invokeinterface #197 <Method Object java.util.Map$Entry.getValue()>
	//   49  114:checkcast       #6   <Class Parcelable>
	//   50  117:iconst_0        
	//   51  118:invokevirtual   #241 <Method void Parcel.writeParcelable(Parcelable, int)>
		}

	//   52  121:goto            69
	//   53  124:iload_2         
	//   54  125:iconst_1        
	//   55  126:iadd            
	//   56  127:istore_2        
	//*  57  128:goto            12
	//   58  131:return          
	}

	public uilder buildUpon()
	{
		return new uilder(this, ((DefaultTrackSelector._cls1) (null)));
	//    0    0:new             #246 <Class DefaultTrackSelector$ParametersBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #249 <Method void DefaultTrackSelector$ParametersBuilder(DefaultTrackSelector$Parameters, DefaultTrackSelector$1)>
	//    5    9:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          243
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #255 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #255 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((DefaultTrackSelector$Parameters)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class DefaultTrackSelector$Parameters>
	//   16   28:astore_1        
			return selectUndeterminedTextLanguage == ((DefaultTrackSelector$Parameters) (obj)).selectUndeterminedTextLanguage && disabledTextTrackSelectionFlags == ((DefaultTrackSelector$Parameters) (obj)).disabledTextTrackSelectionFlags && forceLowestBitrate == ((DefaultTrackSelector$Parameters) (obj)).forceLowestBitrate && allowMixedMimeAdaptiveness == ((DefaultTrackSelector$Parameters) (obj)).allowMixedMimeAdaptiveness && allowNonSeamlessAdaptiveness == ((DefaultTrackSelector$Parameters) (obj)).allowNonSeamlessAdaptiveness && maxVideoWidth == ((DefaultTrackSelector$Parameters) (obj)).maxVideoWidth && maxVideoHeight == ((DefaultTrackSelector$Parameters) (obj)).maxVideoHeight && exceedVideoConstraintsIfNecessary == ((DefaultTrackSelector$Parameters) (obj)).exceedVideoConstraintsIfNecessary && exceedRendererCapabilitiesIfNecessary == ((DefaultTrackSelector$Parameters) (obj)).exceedRendererCapabilitiesIfNecessary && viewportOrientationMayChange == ((DefaultTrackSelector$Parameters) (obj)).viewportOrientationMayChange && viewportWidth == ((DefaultTrackSelector$Parameters) (obj)).viewportWidth && viewportHeight == ((DefaultTrackSelector$Parameters) (obj)).viewportHeight && maxVideoBitrate == ((DefaultTrackSelector$Parameters) (obj)).maxVideoBitrate && tunnelingAudioSessionId == ((DefaultTrackSelector$Parameters) (obj)).tunnelingAudioSessionId && TextUtils.equals(((CharSequence) (preferredAudioLanguage)), ((CharSequence) (((DefaultTrackSelector$Parameters) (obj)).preferredAudioLanguage))) && TextUtils.equals(((CharSequence) (preferredTextLanguage)), ((CharSequence) (((DefaultTrackSelector$Parameters) (obj)).preferredTextLanguage))) && areRendererDisabledFlagsEqual(rendererDisabledFlags, ((DefaultTrackSelector$Parameters) (obj)).rendererDisabledFlags) && areSelectionOverridesEqual(selectionOverrides, ((DefaultTrackSelector$Parameters) (obj)).selectionOverrides);
	//   17   29:aload_0         
	//   18   30:getfield        #94  <Field boolean selectUndeterminedTextLanguage>
	//   19   33:aload_1         
	//   20   34:getfield        #94  <Field boolean selectUndeterminedTextLanguage>
	//   21   37:icmpne          241
	//   22   40:aload_0         
	//   23   41:getfield        #100 <Field int disabledTextTrackSelectionFlags>
	//   24   44:aload_1         
	//   25   45:getfield        #100 <Field int disabledTextTrackSelectionFlags>
	//   26   48:icmpne          241
	//   27   51:aload_0         
	//   28   52:getfield        #102 <Field boolean forceLowestBitrate>
	//   29   55:aload_1         
	//   30   56:getfield        #102 <Field boolean forceLowestBitrate>
	//   31   59:icmpne          241
	//   32   62:aload_0         
	//   33   63:getfield        #104 <Field boolean allowMixedMimeAdaptiveness>
	//   34   66:aload_1         
	//   35   67:getfield        #104 <Field boolean allowMixedMimeAdaptiveness>
	//   36   70:icmpne          241
	//   37   73:aload_0         
	//   38   74:getfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
	//   39   77:aload_1         
	//   40   78:getfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
	//   41   81:icmpne          241
	//   42   84:aload_0         
	//   43   85:getfield        #108 <Field int maxVideoWidth>
	//   44   88:aload_1         
	//   45   89:getfield        #108 <Field int maxVideoWidth>
	//   46   92:icmpne          241
	//   47   95:aload_0         
	//   48   96:getfield        #110 <Field int maxVideoHeight>
	//   49   99:aload_1         
	//   50  100:getfield        #110 <Field int maxVideoHeight>
	//   51  103:icmpne          241
	//   52  106:aload_0         
	//   53  107:getfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
	//   54  110:aload_1         
	//   55  111:getfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
	//   56  114:icmpne          241
	//   57  117:aload_0         
	//   58  118:getfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
	//   59  121:aload_1         
	//   60  122:getfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
	//   61  125:icmpne          241
	//   62  128:aload_0         
	//   63  129:getfield        #122 <Field boolean viewportOrientationMayChange>
	//   64  132:aload_1         
	//   65  133:getfield        #122 <Field boolean viewportOrientationMayChange>
	//   66  136:icmpne          241
	//   67  139:aload_0         
	//   68  140:getfield        #118 <Field int viewportWidth>
	//   69  143:aload_1         
	//   70  144:getfield        #118 <Field int viewportWidth>
	//   71  147:icmpne          241
	//   72  150:aload_0         
	//   73  151:getfield        #120 <Field int viewportHeight>
	//   74  154:aload_1         
	//   75  155:getfield        #120 <Field int viewportHeight>
	//   76  158:icmpne          241
	//   77  161:aload_0         
	//   78  162:getfield        #112 <Field int maxVideoBitrate>
	//   79  165:aload_1         
	//   80  166:getfield        #112 <Field int maxVideoBitrate>
	//   81  169:icmpne          241
	//   82  172:aload_0         
	//   83  173:getfield        #124 <Field int tunnelingAudioSessionId>
	//   84  176:aload_1         
	//   85  177:getfield        #124 <Field int tunnelingAudioSessionId>
	//   86  180:icmpne          241
	//   87  183:aload_0         
	//   88  184:getfield        #84  <Field String preferredAudioLanguage>
	//   89  187:aload_1         
	//   90  188:getfield        #84  <Field String preferredAudioLanguage>
	//   91  191:invokestatic    #260 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   92  194:ifeq            241
	//   93  197:aload_0         
	//   94  198:getfield        #86  <Field String preferredTextLanguage>
	//   95  201:aload_1         
	//   96  202:getfield        #86  <Field String preferredTextLanguage>
	//   97  205:invokestatic    #260 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   98  208:ifeq            241
	//   99  211:aload_0         
	//  100  212:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
	//  101  215:aload_1         
	//  102  216:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
	//  103  219:invokestatic    #262 <Method boolean areRendererDisabledFlagsEqual(SparseBooleanArray, SparseBooleanArray)>
	//  104  222:ifeq            241
	//  105  225:aload_0         
	//  106  226:getfield        #70  <Field SparseArray selectionOverrides>
	//  107  229:aload_1         
	//  108  230:getfield        #70  <Field SparseArray selectionOverrides>
	//  109  233:invokestatic    #264 <Method boolean areSelectionOverridesEqual(SparseArray, SparseArray)>
	//  110  236:ifeq            241
	//  111  239:iconst_1        
	//  112  240:ireturn         
	//  113  241:iconst_0        
	//  114  242:ireturn         
		} else
		{
			return false;
	//  115  243:iconst_0        
	//  116  244:ireturn         
		}
	}

	public final boolean getRendererDisabled(int i)
	{
		return rendererDisabledFlags.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #268 <Method boolean SparseBooleanArray.get(int)>
	//    4    8:ireturn         
	}

	public final erride getSelectionOverride(int i, TrackGroupArray trackgrouparray)
	{
		Map map = (Map)selectionOverrides.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field SparseArray selectionOverrides>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #272 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #158 <Class Map>
	//    5   11:astore_3        
		if(map != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          27
			return (erride)map.get(((Object) (trackgrouparray)));
	//    8   16:aload_3         
	//    9   17:aload_2         
	//   10   18:invokeinterface #201 <Method Object Map.get(Object)>
	//   11   23:checkcast       #224 <Class DefaultTrackSelector$SelectionOverride>
	//   12   26:areturn         
		else
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
	}

	public final boolean hasSelectionOverride(int i, TrackGroupArray trackgrouparray)
	{
		Map map = (Map)selectionOverrides.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field SparseArray selectionOverrides>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #272 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #158 <Class Map>
	//    5   11:astore_3        
		return map != null && map.containsKey(((Object) (trackgrouparray)));
	//    6   12:aload_3         
	//    7   13:ifnull          28
	//    8   16:aload_3         
	//    9   17:aload_2         
	//   10   18:invokeinterface #194 <Method boolean Map.containsKey(Object)>
	//   11   23:ifeq            28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #278 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #280 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #285 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		writeSelectionOverridesToParcel(parcel, selectionOverrides);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field SparseArray selectionOverrides>
	//    3    5:invokestatic    #289 <Method void writeSelectionOverridesToParcel(Parcel, SparseArray)>
		parcel.writeSparseBooleanArray(rendererDisabledFlags);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
	//    7   13:invokevirtual   #293 <Method void Parcel.writeSparseBooleanArray(SparseBooleanArray)>
		parcel.writeString(preferredAudioLanguage);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #84  <Field String preferredAudioLanguage>
	//   11   21:invokevirtual   #296 <Method void Parcel.writeString(String)>
		parcel.writeString(preferredTextLanguage);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #86  <Field String preferredTextLanguage>
	//   15   29:invokevirtual   #296 <Method void Parcel.writeString(String)>
		Util.writeBoolean(parcel, selectUndeterminedTextLanguage);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #94  <Field boolean selectUndeterminedTextLanguage>
	//   19   37:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
		parcel.writeInt(disabledTextTrackSelectionFlags);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #100 <Field int disabledTextTrackSelectionFlags>
	//   23   45:invokevirtual   #237 <Method void Parcel.writeInt(int)>
		Util.writeBoolean(parcel, forceLowestBitrate);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #102 <Field boolean forceLowestBitrate>
	//   27   53:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
		Util.writeBoolean(parcel, allowMixedMimeAdaptiveness);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #104 <Field boolean allowMixedMimeAdaptiveness>
	//   31   61:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
		Util.writeBoolean(parcel, allowNonSeamlessAdaptiveness);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
	//   35   69:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
		parcel.writeInt(maxVideoWidth);
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #108 <Field int maxVideoWidth>
	//   39   77:invokevirtual   #237 <Method void Parcel.writeInt(int)>
		parcel.writeInt(maxVideoHeight);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #110 <Field int maxVideoHeight>
	//   43   85:invokevirtual   #237 <Method void Parcel.writeInt(int)>
		parcel.writeInt(maxVideoBitrate);
	//   44   88:aload_1         
	//   45   89:aload_0         
	//   46   90:getfield        #112 <Field int maxVideoBitrate>
	//   47   93:invokevirtual   #237 <Method void Parcel.writeInt(int)>
		Util.writeBoolean(parcel, exceedVideoConstraintsIfNecessary);
	//   48   96:aload_1         
	//   49   97:aload_0         
	//   50   98:getfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
	//   51  101:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
		Util.writeBoolean(parcel, exceedRendererCapabilitiesIfNecessary);
	//   52  104:aload_1         
	//   53  105:aload_0         
	//   54  106:getfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
	//   55  109:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
		parcel.writeInt(viewportWidth);
	//   56  112:aload_1         
	//   57  113:aload_0         
	//   58  114:getfield        #118 <Field int viewportWidth>
	//   59  117:invokevirtual   #237 <Method void Parcel.writeInt(int)>
		parcel.writeInt(viewportHeight);
	//   60  120:aload_1         
	//   61  121:aload_0         
	//   62  122:getfield        #120 <Field int viewportHeight>
	//   63  125:invokevirtual   #237 <Method void Parcel.writeInt(int)>
		Util.writeBoolean(parcel, viewportOrientationMayChange);
	//   64  128:aload_1         
	//   65  129:aload_0         
	//   66  130:getfield        #122 <Field boolean viewportOrientationMayChange>
	//   67  133:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
		parcel.writeInt(tunnelingAudioSessionId);
	//   68  136:aload_1         
	//   69  137:aload_0         
	//   70  138:getfield        #124 <Field int tunnelingAudioSessionId>
	//   71  141:invokevirtual   #237 <Method void Parcel.writeInt(int)>
	//   72  144:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public DefaultTrackSelector.Parameters createFromParcel(Parcel parcel)
		{
			return new DefaultTrackSelector.Parameters(parcel);
		//    0    0:new             #9   <Class DefaultTrackSelector$Parameters>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void DefaultTrackSelector$Parameters(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method DefaultTrackSelector$Parameters createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public DefaultTrackSelector.Parameters[] newArray(int i)
		{
			return new DefaultTrackSelector.Parameters[i];
		//    0    0:iload_1         
		//    1    1:anewarray       DefaultTrackSelector.Parameters[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method DefaultTrackSelector$Parameters[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final DefaultTrackSelector$Parameters DEFAULT = new DefaultTrackSelector$Parameters();
	public final boolean allowMixedMimeAdaptiveness;
	public final boolean allowNonSeamlessAdaptiveness;
	public final int disabledTextTrackSelectionFlags;
	public final boolean exceedRendererCapabilitiesIfNecessary;
	public final boolean exceedVideoConstraintsIfNecessary;
	public final boolean forceLowestBitrate;
	public final int maxVideoBitrate;
	public final int maxVideoHeight;
	public final int maxVideoWidth;
	public final String preferredAudioLanguage;
	public final String preferredTextLanguage;
	private final SparseBooleanArray rendererDisabledFlags;
	public final boolean selectUndeterminedTextLanguage;
	private final SparseArray selectionOverrides;
	public final int tunnelingAudioSessionId;
	public final int viewportHeight;
	public final boolean viewportOrientationMayChange;
	public final int viewportWidth;

	static 
	{
	//    0    0:new             #2   <Class DefaultTrackSelector$Parameters>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void DefaultTrackSelector$Parameters()>
	//    3    7:putstatic       #48  <Field DefaultTrackSelector$Parameters DEFAULT>
	//    4   10:new             #11  <Class DefaultTrackSelector$Parameters$1>
	//    5   13:dup             
	//    6   14:invokespecial   #49  <Method void DefaultTrackSelector$Parameters$1()>
	//    7   17:putstatic       #51  <Field android.os.Parcelable$Creator CREATOR>
	//*   8   20:return          
	}


/*
	static SparseArray access$000(DefaultTrackSelector$Parameters defaulttrackselector$parameters)
	{
		return defaulttrackselector$parameters.selectionOverrides;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field SparseArray selectionOverrides>
	//    2    4:areturn         
	}

*/


/*
	static SparseBooleanArray access$100(DefaultTrackSelector$Parameters defaulttrackselector$parameters)
	{
		return defaulttrackselector$parameters.rendererDisabledFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
	//    2    4:areturn         
	}

*/

	private DefaultTrackSelector$Parameters()
	{
		this(new SparseArray(), new SparseBooleanArray(), ((String) (null)), ((String) (null)), false, 0, false, false, true, 0x7fffffff, 0x7fffffff, 0x7fffffff, true, true, 0x7fffffff, 0x7fffffff, true, 0);
	//    0    0:aload_0         
	//    1    1:new             #54  <Class SparseArray>
	//    2    4:dup             
	//    3    5:invokespecial   #55  <Method void SparseArray()>
	//    4    8:new             #57  <Class SparseBooleanArray>
	//    5   11:dup             
	//    6   12:invokespecial   #58  <Method void SparseBooleanArray()>
	//    7   15:aconst_null     
	//    8   16:aconst_null     
	//    9   17:iconst_0        
	//   10   18:iconst_0        
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:iconst_1        
	//   14   22:ldc1            #59  <Int 0x7fffffff>
	//   15   24:ldc1            #59  <Int 0x7fffffff>
	//   16   26:ldc1            #59  <Int 0x7fffffff>
	//   17   28:iconst_1        
	//   18   29:iconst_1        
	//   19   30:ldc1            #59  <Int 0x7fffffff>
	//   20   32:ldc1            #59  <Int 0x7fffffff>
	//   21   34:iconst_1        
	//   22   35:iconst_0        
	//   23   36:invokespecial   #62  <Method void DefaultTrackSelector$Parameters(SparseArray, SparseBooleanArray, String, String, boolean, int, boolean, boolean, boolean, int, int, int, boolean, boolean, int, int, boolean, int)>
	//   24   39:return          
	}

	DefaultTrackSelector$Parameters(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		selectionOverrides = readSelectionOverrides(parcel);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #68  <Method SparseArray readSelectionOverrides(Parcel)>
	//    5    9:putfield        #70  <Field SparseArray selectionOverrides>
		rendererDisabledFlags = parcel.readSparseBooleanArray();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #76  <Method SparseBooleanArray Parcel.readSparseBooleanArray()>
	//    9   17:putfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
		preferredAudioLanguage = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #82  <Method String Parcel.readString()>
	//   13   25:putfield        #84  <Field String preferredAudioLanguage>
		preferredTextLanguage = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #82  <Method String Parcel.readString()>
	//   17   33:putfield        #86  <Field String preferredTextLanguage>
		selectUndeterminedTextLanguage = Util.readBoolean(parcel);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
	//   21   41:putfield        #94  <Field boolean selectUndeterminedTextLanguage>
		disabledTextTrackSelectionFlags = parcel.readInt();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #98  <Method int Parcel.readInt()>
	//   25   49:putfield        #100 <Field int disabledTextTrackSelectionFlags>
		forceLowestBitrate = Util.readBoolean(parcel);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
	//   29   57:putfield        #102 <Field boolean forceLowestBitrate>
		allowMixedMimeAdaptiveness = Util.readBoolean(parcel);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
	//   33   65:putfield        #104 <Field boolean allowMixedMimeAdaptiveness>
		allowNonSeamlessAdaptiveness = Util.readBoolean(parcel);
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
	//   37   73:putfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
		maxVideoWidth = parcel.readInt();
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokevirtual   #98  <Method int Parcel.readInt()>
	//   41   81:putfield        #108 <Field int maxVideoWidth>
		maxVideoHeight = parcel.readInt();
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #98  <Method int Parcel.readInt()>
	//   45   89:putfield        #110 <Field int maxVideoHeight>
		maxVideoBitrate = parcel.readInt();
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:invokevirtual   #98  <Method int Parcel.readInt()>
	//   49   97:putfield        #112 <Field int maxVideoBitrate>
		exceedVideoConstraintsIfNecessary = Util.readBoolean(parcel);
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
	//   53  105:putfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
		exceedRendererCapabilitiesIfNecessary = Util.readBoolean(parcel);
	//   54  108:aload_0         
	//   55  109:aload_1         
	//   56  110:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
	//   57  113:putfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
		viewportWidth = parcel.readInt();
	//   58  116:aload_0         
	//   59  117:aload_1         
	//   60  118:invokevirtual   #98  <Method int Parcel.readInt()>
	//   61  121:putfield        #118 <Field int viewportWidth>
		viewportHeight = parcel.readInt();
	//   62  124:aload_0         
	//   63  125:aload_1         
	//   64  126:invokevirtual   #98  <Method int Parcel.readInt()>
	//   65  129:putfield        #120 <Field int viewportHeight>
		viewportOrientationMayChange = Util.readBoolean(parcel);
	//   66  132:aload_0         
	//   67  133:aload_1         
	//   68  134:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
	//   69  137:putfield        #122 <Field boolean viewportOrientationMayChange>
		tunnelingAudioSessionId = parcel.readInt();
	//   70  140:aload_0         
	//   71  141:aload_1         
	//   72  142:invokevirtual   #98  <Method int Parcel.readInt()>
	//   73  145:putfield        #124 <Field int tunnelingAudioSessionId>
	//   74  148:return          
	}

	DefaultTrackSelector$Parameters(SparseArray sparsearray, SparseBooleanArray sparsebooleanarray, String s, String s1, boolean flag, int i, boolean flag1, 
			boolean flag2, boolean flag3, int j, int k, int l, boolean flag4, boolean flag5, 
			int i1, int j1, boolean flag6, int k1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		selectionOverrides = sparsearray;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #70  <Field SparseArray selectionOverrides>
		rendererDisabledFlags = sparsebooleanarray;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
		preferredAudioLanguage = Util.normalizeLanguageCode(s);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #128 <Method String Util.normalizeLanguageCode(String)>
	//   11   19:putfield        #84  <Field String preferredAudioLanguage>
		preferredTextLanguage = Util.normalizeLanguageCode(s1);
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:invokestatic    #128 <Method String Util.normalizeLanguageCode(String)>
	//   15   28:putfield        #86  <Field String preferredTextLanguage>
		selectUndeterminedTextLanguage = flag;
	//   16   31:aload_0         
	//   17   32:iload           5
	//   18   34:putfield        #94  <Field boolean selectUndeterminedTextLanguage>
		disabledTextTrackSelectionFlags = i;
	//   19   37:aload_0         
	//   20   38:iload           6
	//   21   40:putfield        #100 <Field int disabledTextTrackSelectionFlags>
		forceLowestBitrate = flag1;
	//   22   43:aload_0         
	//   23   44:iload           7
	//   24   46:putfield        #102 <Field boolean forceLowestBitrate>
		allowMixedMimeAdaptiveness = flag2;
	//   25   49:aload_0         
	//   26   50:iload           8
	//   27   52:putfield        #104 <Field boolean allowMixedMimeAdaptiveness>
		allowNonSeamlessAdaptiveness = flag3;
	//   28   55:aload_0         
	//   29   56:iload           9
	//   30   58:putfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
		maxVideoWidth = j;
	//   31   61:aload_0         
	//   32   62:iload           10
	//   33   64:putfield        #108 <Field int maxVideoWidth>
		maxVideoHeight = k;
	//   34   67:aload_0         
	//   35   68:iload           11
	//   36   70:putfield        #110 <Field int maxVideoHeight>
		maxVideoBitrate = l;
	//   37   73:aload_0         
	//   38   74:iload           12
	//   39   76:putfield        #112 <Field int maxVideoBitrate>
		exceedVideoConstraintsIfNecessary = flag4;
	//   40   79:aload_0         
	//   41   80:iload           13
	//   42   82:putfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
		exceedRendererCapabilitiesIfNecessary = flag5;
	//   43   85:aload_0         
	//   44   86:iload           14
	//   45   88:putfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
		viewportWidth = i1;
	//   46   91:aload_0         
	//   47   92:iload           15
	//   48   94:putfield        #118 <Field int viewportWidth>
		viewportHeight = j1;
	//   49   97:aload_0         
	//   50   98:iload           16
	//   51  100:putfield        #120 <Field int viewportHeight>
		viewportOrientationMayChange = flag6;
	//   52  103:aload_0         
	//   53  104:iload           17
	//   54  106:putfield        #122 <Field boolean viewportOrientationMayChange>
		tunnelingAudioSessionId = k1;
	//   55  109:aload_0         
	//   56  110:iload           18
	//   57  112:putfield        #124 <Field int tunnelingAudioSessionId>
	//   58  115:return          
	}
}
