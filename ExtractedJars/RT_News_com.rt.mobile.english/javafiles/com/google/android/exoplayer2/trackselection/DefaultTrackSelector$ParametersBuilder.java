// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			DefaultTrackSelector

public static final class DefaultTrackSelector$ParametersBuilder
{

	private static SparseArray cloneSelectionOverrides(SparseArray sparsearray)
	{
		SparseArray sparsearray1 = new SparseArray();
	//    0    0:new             #119 <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void SparseArray()>
	//    3    7:astore_2        
		for(int i = 0; i < sparsearray.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #124 <Method int SparseArray.size()>
	//*   9   15:icmpge          49
			sparsearray1.put(sparsearray.keyAt(i), ((Object) (new HashMap((Map)sparsearray.valueAt(i)))));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #128 <Method int SparseArray.keyAt(int)>
	//   14   24:new             #130 <Class HashMap>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:iload_1         
	//   18   30:invokevirtual   #134 <Method Object SparseArray.valueAt(int)>
	//   19   33:checkcast       #136 <Class Map>
	//   20   36:invokespecial   #139 <Method void HashMap(Map)>
	//   21   39:invokevirtual   #143 <Method void SparseArray.put(int, Object)>

	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
	//*  26   46:goto            10
		return sparsearray1;
	//   27   49:aload_2         
	//   28   50:areturn         
	}

	public DefaultTrackSelector.Parameters build()
	{
		return new DefaultTrackSelector.Parameters(selectionOverrides, rendererDisabledFlags, preferredAudioLanguage, preferredTextLanguage, selectUndeterminedTextLanguage, disabledTextTrackSelectionFlags, forceLowestBitrate, allowMixedMimeAdaptiveness, allowNonSeamlessAdaptiveness, maxVideoWidth, maxVideoHeight, maxVideoBitrate, exceedVideoConstraintsIfNecessary, exceedRendererCapabilitiesIfNecessary, viewportWidth, viewportHeight, viewportOrientationMayChange, tunnelingAudioSessionId);
	//    0    0:new             #36  <Class DefaultTrackSelector$Parameters>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field SparseArray selectionOverrides>
	//    4    8:aload_0         
	//    5    9:getfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
	//    6   12:aload_0         
	//    7   13:getfield        #71  <Field String preferredAudioLanguage>
	//    8   16:aload_0         
	//    9   17:getfield        #74  <Field String preferredTextLanguage>
	//   10   20:aload_0         
	//   11   21:getfield        #77  <Field boolean selectUndeterminedTextLanguage>
	//   12   24:aload_0         
	//   13   25:getfield        #80  <Field int disabledTextTrackSelectionFlags>
	//   14   28:aload_0         
	//   15   29:getfield        #83  <Field boolean forceLowestBitrate>
	//   16   32:aload_0         
	//   17   33:getfield        #86  <Field boolean allowMixedMimeAdaptiveness>
	//   18   36:aload_0         
	//   19   37:getfield        #89  <Field boolean allowNonSeamlessAdaptiveness>
	//   20   40:aload_0         
	//   21   41:getfield        #92  <Field int maxVideoWidth>
	//   22   44:aload_0         
	//   23   45:getfield        #95  <Field int maxVideoHeight>
	//   24   48:aload_0         
	//   25   49:getfield        #98  <Field int maxVideoBitrate>
	//   26   52:aload_0         
	//   27   53:getfield        #101 <Field boolean exceedVideoConstraintsIfNecessary>
	//   28   56:aload_0         
	//   29   57:getfield        #104 <Field boolean exceedRendererCapabilitiesIfNecessary>
	//   30   60:aload_0         
	//   31   61:getfield        #107 <Field int viewportWidth>
	//   32   64:aload_0         
	//   33   65:getfield        #110 <Field int viewportHeight>
	//   34   68:aload_0         
	//   35   69:getfield        #113 <Field boolean viewportOrientationMayChange>
	//   36   72:aload_0         
	//   37   73:getfield        #116 <Field int tunnelingAudioSessionId>
	//   38   76:invokespecial   #150 <Method void DefaultTrackSelector$Parameters(SparseArray, SparseBooleanArray, String, String, boolean, int, boolean, boolean, boolean, int, int, int, boolean, boolean, int, int, boolean, int)>
	//   39   79:areturn         
	}

	public final DefaultTrackSelector$ParametersBuilder clearSelectionOverride(int i, TrackGroupArray trackgrouparray)
	{
		Map map = (Map)selectionOverrides.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SparseArray selectionOverrides>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #155 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #136 <Class Map>
	//    5   11:astore_3        
		if(map != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          55
		{
			if(!map.containsKey(((Object) (trackgrouparray))))
	//*   8   16:aload_3         
	//*   9   17:aload_2         
	//*  10   18:invokeinterface #159 <Method boolean Map.containsKey(Object)>
	//*  11   23:ifne            28
				return this;
	//   12   26:aload_0         
	//   13   27:areturn         
			map.remove(((Object) (trackgrouparray)));
	//   14   28:aload_3         
	//   15   29:aload_2         
	//   16   30:invokeinterface #163 <Method Object Map.remove(Object)>
	//   17   35:pop             
			if(map.isEmpty())
	//*  18   36:aload_3         
	//*  19   37:invokeinterface #167 <Method boolean Map.isEmpty()>
	//*  20   42:ifeq            53
				selectionOverrides.remove(i);
	//   21   45:aload_0         
	//   22   46:getfield        #56  <Field SparseArray selectionOverrides>
	//   23   49:iload_1         
	//   24   50:invokevirtual   #170 <Method void SparseArray.remove(int)>
			return this;
	//   25   53:aload_0         
	//   26   54:areturn         
		} else
		{
			return this;
	//   27   55:aload_0         
	//   28   56:areturn         
		}
	}

	public final DefaultTrackSelector$ParametersBuilder clearSelectionOverrides()
	{
		if(selectionOverrides.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field SparseArray selectionOverrides>
	//*   2    4:invokevirtual   #124 <Method int SparseArray.size()>
	//*   3    7:ifne            12
		{
			return this;
	//    4   10:aload_0         
	//    5   11:areturn         
		} else
		{
			selectionOverrides.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #56  <Field SparseArray selectionOverrides>
	//    8   16:invokevirtual   #175 <Method void SparseArray.clear()>
			return this;
	//    9   19:aload_0         
	//   10   20:areturn         
		}
	}

	public final DefaultTrackSelector$ParametersBuilder clearSelectionOverrides(int i)
	{
		Map map = (Map)selectionOverrides.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SparseArray selectionOverrides>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #155 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #136 <Class Map>
	//    5   11:astore_2        
		if(map != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          37
		{
			if(map.isEmpty())
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #167 <Method boolean Map.isEmpty()>
	//*  10   22:ifeq            27
			{
				return this;
	//   11   25:aload_0         
	//   12   26:areturn         
			} else
			{
				selectionOverrides.remove(i);
	//   13   27:aload_0         
	//   14   28:getfield        #56  <Field SparseArray selectionOverrides>
	//   15   31:iload_1         
	//   16   32:invokevirtual   #170 <Method void SparseArray.remove(int)>
				return this;
	//   17   35:aload_0         
	//   18   36:areturn         
			}
		} else
		{
			return this;
	//   19   37:aload_0         
	//   20   38:areturn         
		}
	}

	public DefaultTrackSelector$ParametersBuilder clearVideoSizeConstraints()
	{
		return setMaxVideoSize(0x7fffffff, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:ldc1            #178 <Int 0x7fffffff>
	//    2    3:ldc1            #178 <Int 0x7fffffff>
	//    3    5:invokevirtual   #182 <Method DefaultTrackSelector$ParametersBuilder setMaxVideoSize(int, int)>
	//    4    8:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder clearViewportSizeConstraints()
	{
		return setViewportSize(0x7fffffff, 0x7fffffff, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #178 <Int 0x7fffffff>
	//    2    3:ldc1            #178 <Int 0x7fffffff>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #187 <Method DefaultTrackSelector$ParametersBuilder setViewportSize(int, int, boolean)>
	//    5    9:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setAllowMixedMimeAdaptiveness(boolean flag)
	{
		allowMixedMimeAdaptiveness = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean allowMixedMimeAdaptiveness>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setAllowNonSeamlessAdaptiveness(boolean flag)
	{
		allowNonSeamlessAdaptiveness = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field boolean allowNonSeamlessAdaptiveness>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setDisabledTextTrackSelectionFlags(int i)
	{
		disabledTextTrackSelectionFlags = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field int disabledTextTrackSelectionFlags>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean flag)
	{
		exceedRendererCapabilitiesIfNecessary = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #104 <Field boolean exceedRendererCapabilitiesIfNecessary>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean flag)
	{
		exceedVideoConstraintsIfNecessary = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field boolean exceedVideoConstraintsIfNecessary>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setForceLowestBitrate(boolean flag)
	{
		forceLowestBitrate = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #83  <Field boolean forceLowestBitrate>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setMaxVideoBitrate(int i)
	{
		maxVideoBitrate = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #98  <Field int maxVideoBitrate>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setMaxVideoSize(int i, int j)
	{
		maxVideoWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #92  <Field int maxVideoWidth>
		maxVideoHeight = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #95  <Field int maxVideoHeight>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setMaxVideoSizeSd()
	{
		return setMaxVideoSize(1279, 719);
	//    0    0:aload_0         
	//    1    1:sipush          1279
	//    2    4:sipush          719
	//    3    7:invokevirtual   #182 <Method DefaultTrackSelector$ParametersBuilder setMaxVideoSize(int, int)>
	//    4   10:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setPreferredAudioLanguage(String s)
	{
		preferredAudioLanguage = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field String preferredAudioLanguage>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setPreferredTextLanguage(String s)
	{
		preferredTextLanguage = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field String preferredTextLanguage>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final DefaultTrackSelector$ParametersBuilder setRendererDisabled(int i, boolean flag)
	{
		if(rendererDisabledFlags.get(i) == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #204 <Method boolean SparseBooleanArray.get(int)>
	//*   4    8:iload_2         
	//*   5    9:icmpne          14
			return this;
	//    6   12:aload_0         
	//    7   13:areturn         
		if(flag)
	//*   8   14:iload_2         
	//*   9   15:ifeq            29
		{
			rendererDisabledFlags.put(i, true);
	//   10   18:aload_0         
	//   11   19:getfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
	//   12   22:iload_1         
	//   13   23:iconst_1        
	//   14   24:invokevirtual   #207 <Method void SparseBooleanArray.put(int, boolean)>
			return this;
	//   15   27:aload_0         
	//   16   28:areturn         
		} else
		{
			rendererDisabledFlags.delete(i);
	//   17   29:aload_0         
	//   18   30:getfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
	//   19   33:iload_1         
	//   20   34:invokevirtual   #210 <Method void SparseBooleanArray.delete(int)>
			return this;
	//   21   37:aload_0         
	//   22   38:areturn         
		}
	}

	public DefaultTrackSelector$ParametersBuilder setSelectUndeterminedTextLanguage(boolean flag)
	{
		selectUndeterminedTextLanguage = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean selectUndeterminedTextLanguage>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final DefaultTrackSelector$ParametersBuilder setSelectionOverride(int i, TrackGroupArray trackgrouparray, DefaultTrackSelector$SelectionOverride defaulttrackselector$selectionoverride)
	{
		Map map = (Map)selectionOverrides.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SparseArray selectionOverrides>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #155 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #136 <Class Map>
	//    5   11:astore          5
		Object obj = ((Object) (map));
	//    6   13:aload           5
	//    7   15:astore          4
		if(map == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       41
		{
			obj = ((Object) (new HashMap()));
	//   10   22:new             #130 <Class HashMap>
	//   11   25:dup             
	//   12   26:invokespecial   #214 <Method void HashMap()>
	//   13   29:astore          4
			selectionOverrides.put(i, obj);
	//   14   31:aload_0         
	//   15   32:getfield        #56  <Field SparseArray selectionOverrides>
	//   16   35:iload_1         
	//   17   36:aload           4
	//   18   38:invokevirtual   #143 <Method void SparseArray.put(int, Object)>
		}
		if(((Map) (obj)).containsKey(((Object) (trackgrouparray))) && Util.areEqual(((Map) (obj)).get(((Object) (trackgrouparray))), ((Object) (defaulttrackselector$selectionoverride))))
	//*  19   41:aload           4
	//*  20   43:aload_2         
	//*  21   44:invokeinterface #159 <Method boolean Map.containsKey(Object)>
	//*  22   49:ifeq            69
	//*  23   52:aload           4
	//*  24   54:aload_2         
	//*  25   55:invokeinterface #216 <Method Object Map.get(Object)>
	//*  26   60:aload_3         
	//*  27   61:invokestatic    #222 <Method boolean Util.areEqual(Object, Object)>
	//*  28   64:ifeq            69
		{
			return this;
	//   29   67:aload_0         
	//   30   68:areturn         
		} else
		{
			((Map) (obj)).put(((Object) (trackgrouparray)), ((Object) (defaulttrackselector$selectionoverride)));
	//   31   69:aload           4
	//   32   71:aload_2         
	//   33   72:aload_3         
	//   34   73:invokeinterface #225 <Method Object Map.put(Object, Object)>
	//   35   78:pop             
			return this;
	//   36   79:aload_0         
	//   37   80:areturn         
		}
	}

	public DefaultTrackSelector$ParametersBuilder setTunnelingAudioSessionId(int i)
	{
		if(tunnelingAudioSessionId != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int tunnelingAudioSessionId>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          15
		{
			tunnelingAudioSessionId = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #116 <Field int tunnelingAudioSessionId>
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		} else
		{
			return this;
	//    9   15:aload_0         
	//   10   16:areturn         
		}
	}

	public DefaultTrackSelector$ParametersBuilder setViewportSize(int i, int j, boolean flag)
	{
		viewportWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #107 <Field int viewportWidth>
		viewportHeight = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #110 <Field int viewportHeight>
		viewportOrientationMayChange = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #113 <Field boolean viewportOrientationMayChange>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public DefaultTrackSelector$ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean flag)
	{
		context = ((Context) (Util.getPhysicalDisplaySize(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #232 <Method Point Util.getPhysicalDisplaySize(Context)>
	//    2    4:astore_1        
		return setViewportSize(((Point) (context)).x, ((Point) (context)).y, flag);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #237 <Field int Point.x>
	//    6   10:aload_1         
	//    7   11:getfield        #240 <Field int Point.y>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #187 <Method DefaultTrackSelector$ParametersBuilder setViewportSize(int, int, boolean)>
	//   10   18:areturn         
	}

	private boolean allowMixedMimeAdaptiveness;
	private boolean allowNonSeamlessAdaptiveness;
	private int disabledTextTrackSelectionFlags;
	private boolean exceedRendererCapabilitiesIfNecessary;
	private boolean exceedVideoConstraintsIfNecessary;
	private boolean forceLowestBitrate;
	private int maxVideoBitrate;
	private int maxVideoHeight;
	private int maxVideoWidth;
	private String preferredAudioLanguage;
	private String preferredTextLanguage;
	private final SparseBooleanArray rendererDisabledFlags;
	private boolean selectUndeterminedTextLanguage;
	private final SparseArray selectionOverrides;
	private int tunnelingAudioSessionId;
	private int viewportHeight;
	private boolean viewportOrientationMayChange;
	private int viewportWidth;

	public DefaultTrackSelector$ParametersBuilder()
	{
		this(DefaultTrackSelector.Parameters.DEFAULT);
	//    0    0:aload_0         
	//    1    1:getstatic       #40  <Field DefaultTrackSelector$Parameters DefaultTrackSelector$Parameters.DEFAULT>
	//    2    4:invokespecial   #43  <Method void DefaultTrackSelector$ParametersBuilder(DefaultTrackSelector$Parameters)>
	//    3    7:return          
	}

	private DefaultTrackSelector$ParametersBuilder(DefaultTrackSelector.Parameters parameters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		selectionOverrides = cloneSelectionOverrides(DefaultTrackSelector.Parameters.access$000(parameters));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #50  <Method SparseArray DefaultTrackSelector$Parameters.access$000(DefaultTrackSelector$Parameters)>
	//    5    9:invokestatic    #54  <Method SparseArray cloneSelectionOverrides(SparseArray)>
	//    6   12:putfield        #56  <Field SparseArray selectionOverrides>
		rendererDisabledFlags = DefaultTrackSelector.Parameters.access$100(parameters).clone();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #60  <Method SparseBooleanArray DefaultTrackSelector$Parameters.access$100(DefaultTrackSelector$Parameters)>
	//   10   20:invokevirtual   #66  <Method SparseBooleanArray SparseBooleanArray.clone()>
	//   11   23:putfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
		preferredAudioLanguage = parameters.preferredAudioLanguage;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:getfield        #70  <Field String DefaultTrackSelector$Parameters.preferredAudioLanguage>
	//   15   31:putfield        #71  <Field String preferredAudioLanguage>
		preferredTextLanguage = parameters.preferredTextLanguage;
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:getfield        #73  <Field String DefaultTrackSelector$Parameters.preferredTextLanguage>
	//   19   39:putfield        #74  <Field String preferredTextLanguage>
		selectUndeterminedTextLanguage = parameters.selectUndeterminedTextLanguage;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:getfield        #76  <Field boolean DefaultTrackSelector$Parameters.selectUndeterminedTextLanguage>
	//   23   47:putfield        #77  <Field boolean selectUndeterminedTextLanguage>
		disabledTextTrackSelectionFlags = parameters.disabledTextTrackSelectionFlags;
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:getfield        #79  <Field int DefaultTrackSelector$Parameters.disabledTextTrackSelectionFlags>
	//   27   55:putfield        #80  <Field int disabledTextTrackSelectionFlags>
		forceLowestBitrate = parameters.forceLowestBitrate;
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:getfield        #82  <Field boolean DefaultTrackSelector$Parameters.forceLowestBitrate>
	//   31   63:putfield        #83  <Field boolean forceLowestBitrate>
		allowMixedMimeAdaptiveness = parameters.allowMixedMimeAdaptiveness;
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:getfield        #85  <Field boolean DefaultTrackSelector$Parameters.allowMixedMimeAdaptiveness>
	//   35   71:putfield        #86  <Field boolean allowMixedMimeAdaptiveness>
		allowNonSeamlessAdaptiveness = parameters.allowNonSeamlessAdaptiveness;
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:getfield        #88  <Field boolean DefaultTrackSelector$Parameters.allowNonSeamlessAdaptiveness>
	//   39   79:putfield        #89  <Field boolean allowNonSeamlessAdaptiveness>
		maxVideoWidth = parameters.maxVideoWidth;
	//   40   82:aload_0         
	//   41   83:aload_1         
	//   42   84:getfield        #91  <Field int DefaultTrackSelector$Parameters.maxVideoWidth>
	//   43   87:putfield        #92  <Field int maxVideoWidth>
		maxVideoHeight = parameters.maxVideoHeight;
	//   44   90:aload_0         
	//   45   91:aload_1         
	//   46   92:getfield        #94  <Field int DefaultTrackSelector$Parameters.maxVideoHeight>
	//   47   95:putfield        #95  <Field int maxVideoHeight>
		maxVideoBitrate = parameters.maxVideoBitrate;
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:getfield        #97  <Field int DefaultTrackSelector$Parameters.maxVideoBitrate>
	//   51  103:putfield        #98  <Field int maxVideoBitrate>
		exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
	//   52  106:aload_0         
	//   53  107:aload_1         
	//   54  108:getfield        #100 <Field boolean DefaultTrackSelector$Parameters.exceedVideoConstraintsIfNecessary>
	//   55  111:putfield        #101 <Field boolean exceedVideoConstraintsIfNecessary>
		exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
	//   56  114:aload_0         
	//   57  115:aload_1         
	//   58  116:getfield        #103 <Field boolean DefaultTrackSelector$Parameters.exceedRendererCapabilitiesIfNecessary>
	//   59  119:putfield        #104 <Field boolean exceedRendererCapabilitiesIfNecessary>
		viewportWidth = parameters.viewportWidth;
	//   60  122:aload_0         
	//   61  123:aload_1         
	//   62  124:getfield        #106 <Field int DefaultTrackSelector$Parameters.viewportWidth>
	//   63  127:putfield        #107 <Field int viewportWidth>
		viewportHeight = parameters.viewportHeight;
	//   64  130:aload_0         
	//   65  131:aload_1         
	//   66  132:getfield        #109 <Field int DefaultTrackSelector$Parameters.viewportHeight>
	//   67  135:putfield        #110 <Field int viewportHeight>
		viewportOrientationMayChange = parameters.viewportOrientationMayChange;
	//   68  138:aload_0         
	//   69  139:aload_1         
	//   70  140:getfield        #112 <Field boolean DefaultTrackSelector$Parameters.viewportOrientationMayChange>
	//   71  143:putfield        #113 <Field boolean viewportOrientationMayChange>
		tunnelingAudioSessionId = parameters.tunnelingAudioSessionId;
	//   72  146:aload_0         
	//   73  147:aload_1         
	//   74  148:getfield        #115 <Field int DefaultTrackSelector$Parameters.tunnelingAudioSessionId>
	//   75  151:putfield        #116 <Field int tunnelingAudioSessionId>
	//   76  154:return          
	}

	DefaultTrackSelector$ParametersBuilder(DefaultTrackSelector.Parameters parameters, DefaultTrackSelector._cls1 _pcls1)
	{
		this(parameters);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void DefaultTrackSelector$ParametersBuilder(DefaultTrackSelector$Parameters)>
	//    3    5:return          
	}
}
