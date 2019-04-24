// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			RegionTypeTableItem, MapCustomizationErrors, ErrorReason, ErrorSource, 
//			BooleanValueType, FloorPlanListItem, PersistentMapsDestination, PersistentMapIdentifier, 
//			MapCustomizationViewState, RenderPresenter, MissionDetailsViewState, RobotMissionHistoryItem, 
//			MissionMapType, MissionRuntimeEChartEvent, TitleSpecifier, RegionType, 
//			CommandType

public abstract class MapsUIServiceData
{
	private static final class CppProxy extends MapsUIServiceData
	{

		private native void nativeDestroy(long l);

		private native ArrayList native_getBasicRegionTypeTable(long l);

		private native RegionTypeTableItem native_getCustomRegionTypeItem(long l);

		private native MapCustomizationErrors native_getCustomizationErrorMessage(long l);

		private native ArrayList native_getCustomizationOptionsMenu(long l);

		private native String native_getCustomizedMapName(long l);

		private native String native_getDebugInfoMapId(long l);

		private native String native_getDebugInfoVersion(long l);

		private native ErrorReason native_getErrorReason(long l);

		private native ErrorSource native_getErrorSource(long l);

		private native boolean native_getFloorPlanBooleanValue(long l);

		private native BooleanValueType native_getFloorPlanBooleanValueType(long l);

		private native FloorPlanListItem native_getFloorPlanItem(long l);

		private native ArrayList native_getFloorPlanLabeledRegionList(long l);

		private native int native_getFloorPlanListItemIndex(long l);

		private native ArrayList native_getFloorPlanListItems(long l);

		private native PersistentMapsDestination native_getFloorPlanMapsDestination(long l);

		private native PersistentMapIdentifier native_getFloorPlanMapsId(long l);

		private native ArrayList native_getFloorPlanRegionList(long l);

		private native FloorPlanListItem native_getFloorPlanRegionListItem(long l);

		private native ArrayList native_getFloorPlanUnlabeledRegionList(long l);

		private native int native_getHighestLearningPercentage(long l);

		private native boolean native_getIsCustomizationCancelled(long l);

		private native boolean native_getIsMapCustomizationEnabled(long l);

		private native boolean native_getIsMapDirty(long l);

		private native ArrayList native_getListOfRegionNames(long l);

		private native String native_getLocalizedErrorMessageKey(long l);

		private native boolean native_getMapCompleted(long l);

		private native MapCustomizationViewState native_getMapCustomizationViewState(long l);

		private native boolean native_getMapReadyForSetup(long l);

		private native RenderPresenter native_getMapRenderer(long l);

		private native boolean native_getMapZoomResetButtonState(long l);

		private native ArrayList native_getMapsDataStates(long l);

		private native ArrayList native_getMapsViewStates(long l);

		private native MissionDetailsViewState native_getMissionDetailsViewState(long l);

		private native String native_getMissionErrorMessage(long l);

		private native RobotMissionHistoryItem native_getMissionHistoryDetails(long l);

		private native MissionMapType native_getMissionMapType(long l);

		private native boolean native_getMissionMapZoomState(long l);

		private native MissionRuntimeEChartEvent native_getMissionRuntimeChart(long l);

		private native String native_getNonLocalizedErrorMessage(long l);

		private native PersistentMapIdentifier native_getPersistentMapId(long l);

		private native String native_getPersistentMapName(long l);

		private native float native_getPlaybackProgress(long l);

		private native ArrayList native_getRegionTypeTable(long l);

		private native int native_getSelectedRegionLabelCount(long l);

		private native String native_getSelectedRegionLabelName(long l);

		private native int native_getTotalRegionCount(long l);

		private native int native_getUnlabeledRegionCount(long l);

		private native String native_getUsedRegionId(long l);

		private native String native_getUsedRegionName(long l);

		private native TitleSpecifier native_getViewTitle(long l);

		private native int native_getWifiBadRegions(long l);

		private native ArrayList native_getWifiColorLegend(long l);

		private native void native_setActiveFloorMapId(long l, String s);

		private native void native_setActiveFloorRegionIds(long l, ArrayList arraylist);

		private native void native_setCustomizationMapId(long l, PersistentMapIdentifier persistentmapidentifier);

		private native void native_setDirtDetectsHiddenState(long l, boolean flag);

		private native void native_setErrorDismissed(long l, MapCustomizationErrors mapcustomizationerrors);

		private native void native_setFloorPlanListItemMode(long l, HashSet hashset);

		private native void native_setFloorPlanListMapId(long l, String s);

		private native void native_setFloorPlanListMapVersionId(long l, String s);

		private native void native_setFloorPlanMapsDestination(long l, PersistentMapsDestination persistentmapsdestination);

		private native void native_setFloorPlanSelectionListItem(long l, FloorPlanListItem floorplanlistitem, int i);

		private native void native_setMissionMapType(long l, MissionMapType missionmaptype);

		private native void native_setNewMapName(long l, String s);

		private native void native_setPlatformViewDimensions(long l, HashMap hashmap);

		private native void native_setPlaybackProgress(long l, float f);

		private native void native_setRegionNamePlaceHolder(long l, String s);

		private native void native_setRegionTypeChange(long l, RegionType regiontype, String s);

		private native void native_setRenameRegion(long l, String s, String s1);

		private native void native_setRunActionCommandType(long l, CommandType commandtype);

		private native void native_setRunActionMapId(long l, PersistentMapIdentifier persistentmapidentifier);

		private native void native_setSelectedRegionNamePlaceHolder(long l, String s);

		private native void native_setToggleRegionSelectionId(long l, String s);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #149 <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #151 <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #154 <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #158 <Method void Object.finalize()>
		//    4    8:return          
		}

		public ArrayList getBasicRegionTypeTable()
		{
			return native_getBasicRegionTypeTable(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #162 <Method ArrayList native_getBasicRegionTypeTable(long)>
		//    4    8:areturn         
		}

		public RegionTypeTableItem getCustomRegionTypeItem()
		{
			return native_getCustomRegionTypeItem(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #168 <Method RegionTypeTableItem native_getCustomRegionTypeItem(long)>
		//    4    8:areturn         
		}

		public MapCustomizationErrors getCustomizationErrorMessage()
		{
			return native_getCustomizationErrorMessage(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #172 <Method MapCustomizationErrors native_getCustomizationErrorMessage(long)>
		//    4    8:areturn         
		}

		public ArrayList getCustomizationOptionsMenu()
		{
			return native_getCustomizationOptionsMenu(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #175 <Method ArrayList native_getCustomizationOptionsMenu(long)>
		//    4    8:areturn         
		}

		public String getCustomizedMapName()
		{
			return native_getCustomizedMapName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #180 <Method String native_getCustomizedMapName(long)>
		//    4    8:areturn         
		}

		public String getDebugInfoMapId()
		{
			return native_getDebugInfoMapId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #183 <Method String native_getDebugInfoMapId(long)>
		//    4    8:areturn         
		}

		public String getDebugInfoVersion()
		{
			return native_getDebugInfoVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #186 <Method String native_getDebugInfoVersion(long)>
		//    4    8:areturn         
		}

		public ErrorReason getErrorReason()
		{
			return native_getErrorReason(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #190 <Method ErrorReason native_getErrorReason(long)>
		//    4    8:areturn         
		}

		public ErrorSource getErrorSource()
		{
			return native_getErrorSource(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #194 <Method ErrorSource native_getErrorSource(long)>
		//    4    8:areturn         
		}

		public boolean getFloorPlanBooleanValue()
		{
			return native_getFloorPlanBooleanValue(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #198 <Method boolean native_getFloorPlanBooleanValue(long)>
		//    4    8:ireturn         
		}

		public BooleanValueType getFloorPlanBooleanValueType()
		{
			return native_getFloorPlanBooleanValueType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #202 <Method BooleanValueType native_getFloorPlanBooleanValueType(long)>
		//    4    8:areturn         
		}

		public FloorPlanListItem getFloorPlanItem()
		{
			return native_getFloorPlanItem(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #206 <Method FloorPlanListItem native_getFloorPlanItem(long)>
		//    4    8:areturn         
		}

		public ArrayList getFloorPlanLabeledRegionList()
		{
			return native_getFloorPlanLabeledRegionList(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #209 <Method ArrayList native_getFloorPlanLabeledRegionList(long)>
		//    4    8:areturn         
		}

		public int getFloorPlanListItemIndex()
		{
			return native_getFloorPlanListItemIndex(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #214 <Method int native_getFloorPlanListItemIndex(long)>
		//    4    8:ireturn         
		}

		public ArrayList getFloorPlanListItems()
		{
			return native_getFloorPlanListItems(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #217 <Method ArrayList native_getFloorPlanListItems(long)>
		//    4    8:areturn         
		}

		public PersistentMapsDestination getFloorPlanMapsDestination()
		{
			return native_getFloorPlanMapsDestination(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #222 <Method PersistentMapsDestination native_getFloorPlanMapsDestination(long)>
		//    4    8:areturn         
		}

		public PersistentMapIdentifier getFloorPlanMapsId()
		{
			return native_getFloorPlanMapsId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #226 <Method PersistentMapIdentifier native_getFloorPlanMapsId(long)>
		//    4    8:areturn         
		}

		public ArrayList getFloorPlanRegionList()
		{
			return native_getFloorPlanRegionList(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #229 <Method ArrayList native_getFloorPlanRegionList(long)>
		//    4    8:areturn         
		}

		public FloorPlanListItem getFloorPlanRegionListItem()
		{
			return native_getFloorPlanRegionListItem(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #232 <Method FloorPlanListItem native_getFloorPlanRegionListItem(long)>
		//    4    8:areturn         
		}

		public ArrayList getFloorPlanUnlabeledRegionList()
		{
			return native_getFloorPlanUnlabeledRegionList(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #235 <Method ArrayList native_getFloorPlanUnlabeledRegionList(long)>
		//    4    8:areturn         
		}

		public int getHighestLearningPercentage()
		{
			return native_getHighestLearningPercentage(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #238 <Method int native_getHighestLearningPercentage(long)>
		//    4    8:ireturn         
		}

		public boolean getIsCustomizationCancelled()
		{
			return native_getIsCustomizationCancelled(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #241 <Method boolean native_getIsCustomizationCancelled(long)>
		//    4    8:ireturn         
		}

		public boolean getIsMapCustomizationEnabled()
		{
			return native_getIsMapCustomizationEnabled(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #244 <Method boolean native_getIsMapCustomizationEnabled(long)>
		//    4    8:ireturn         
		}

		public boolean getIsMapDirty()
		{
			return native_getIsMapDirty(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #247 <Method boolean native_getIsMapDirty(long)>
		//    4    8:ireturn         
		}

		public ArrayList getListOfRegionNames()
		{
			return native_getListOfRegionNames(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #250 <Method ArrayList native_getListOfRegionNames(long)>
		//    4    8:areturn         
		}

		public String getLocalizedErrorMessageKey()
		{
			return native_getLocalizedErrorMessageKey(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #254 <Method String native_getLocalizedErrorMessageKey(long)>
		//    4    8:areturn         
		}

		public boolean getMapCompleted()
		{
			return native_getMapCompleted(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #257 <Method boolean native_getMapCompleted(long)>
		//    4    8:ireturn         
		}

		public MapCustomizationViewState getMapCustomizationViewState()
		{
			return native_getMapCustomizationViewState(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #261 <Method MapCustomizationViewState native_getMapCustomizationViewState(long)>
		//    4    8:areturn         
		}

		public boolean getMapReadyForSetup()
		{
			return native_getMapReadyForSetup(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #264 <Method boolean native_getMapReadyForSetup(long)>
		//    4    8:ireturn         
		}

		public RenderPresenter getMapRenderer()
		{
			return native_getMapRenderer(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #268 <Method RenderPresenter native_getMapRenderer(long)>
		//    4    8:areturn         
		}

		public boolean getMapZoomResetButtonState()
		{
			return native_getMapZoomResetButtonState(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #271 <Method boolean native_getMapZoomResetButtonState(long)>
		//    4    8:ireturn         
		}

		public ArrayList getMapsDataStates()
		{
			return native_getMapsDataStates(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #274 <Method ArrayList native_getMapsDataStates(long)>
		//    4    8:areturn         
		}

		public ArrayList getMapsViewStates()
		{
			return native_getMapsViewStates(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #278 <Method ArrayList native_getMapsViewStates(long)>
		//    4    8:areturn         
		}

		public MissionDetailsViewState getMissionDetailsViewState()
		{
			return native_getMissionDetailsViewState(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #283 <Method MissionDetailsViewState native_getMissionDetailsViewState(long)>
		//    4    8:areturn         
		}

		public String getMissionErrorMessage()
		{
			return native_getMissionErrorMessage(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #286 <Method String native_getMissionErrorMessage(long)>
		//    4    8:areturn         
		}

		public RobotMissionHistoryItem getMissionHistoryDetails()
		{
			return native_getMissionHistoryDetails(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #290 <Method RobotMissionHistoryItem native_getMissionHistoryDetails(long)>
		//    4    8:areturn         
		}

		public MissionMapType getMissionMapType()
		{
			return native_getMissionMapType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #294 <Method MissionMapType native_getMissionMapType(long)>
		//    4    8:areturn         
		}

		public boolean getMissionMapZoomState()
		{
			return native_getMissionMapZoomState(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #297 <Method boolean native_getMissionMapZoomState(long)>
		//    4    8:ireturn         
		}

		public MissionRuntimeEChartEvent getMissionRuntimeChart()
		{
			return native_getMissionRuntimeChart(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #301 <Method MissionRuntimeEChartEvent native_getMissionRuntimeChart(long)>
		//    4    8:areturn         
		}

		public String getNonLocalizedErrorMessage()
		{
			return native_getNonLocalizedErrorMessage(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #304 <Method String native_getNonLocalizedErrorMessage(long)>
		//    4    8:areturn         
		}

		public PersistentMapIdentifier getPersistentMapId()
		{
			return native_getPersistentMapId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #307 <Method PersistentMapIdentifier native_getPersistentMapId(long)>
		//    4    8:areturn         
		}

		public String getPersistentMapName()
		{
			return native_getPersistentMapName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #310 <Method String native_getPersistentMapName(long)>
		//    4    8:areturn         
		}

		public float getPlaybackProgress()
		{
			return native_getPlaybackProgress(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #314 <Method float native_getPlaybackProgress(long)>
		//    4    8:freturn         
		}

		public ArrayList getRegionTypeTable()
		{
			return native_getRegionTypeTable(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #317 <Method ArrayList native_getRegionTypeTable(long)>
		//    4    8:areturn         
		}

		public int getSelectedRegionLabelCount()
		{
			return native_getSelectedRegionLabelCount(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #320 <Method int native_getSelectedRegionLabelCount(long)>
		//    4    8:ireturn         
		}

		public String getSelectedRegionLabelName()
		{
			return native_getSelectedRegionLabelName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #323 <Method String native_getSelectedRegionLabelName(long)>
		//    4    8:areturn         
		}

		public int getTotalRegionCount()
		{
			return native_getTotalRegionCount(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #326 <Method int native_getTotalRegionCount(long)>
		//    4    8:ireturn         
		}

		public int getUnlabeledRegionCount()
		{
			return native_getUnlabeledRegionCount(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #329 <Method int native_getUnlabeledRegionCount(long)>
		//    4    8:ireturn         
		}

		public String getUsedRegionId()
		{
			return native_getUsedRegionId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #332 <Method String native_getUsedRegionId(long)>
		//    4    8:areturn         
		}

		public String getUsedRegionName()
		{
			return native_getUsedRegionName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #335 <Method String native_getUsedRegionName(long)>
		//    4    8:areturn         
		}

		public TitleSpecifier getViewTitle()
		{
			return native_getViewTitle(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #339 <Method TitleSpecifier native_getViewTitle(long)>
		//    4    8:areturn         
		}

		public int getWifiBadRegions()
		{
			return native_getWifiBadRegions(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #342 <Method int native_getWifiBadRegions(long)>
		//    4    8:ireturn         
		}

		public ArrayList getWifiColorLegend()
		{
			return native_getWifiColorLegend(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #345 <Method ArrayList native_getWifiColorLegend(long)>
		//    4    8:areturn         
		}

		public void setActiveFloorMapId(String s)
		{
			native_setActiveFloorMapId(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #349 <Method void native_setActiveFloorMapId(long, String)>
		//    5    9:return          
		}

		public void setActiveFloorRegionIds(ArrayList arraylist)
		{
			native_setActiveFloorRegionIds(nativeRef, arraylist);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #353 <Method void native_setActiveFloorRegionIds(long, ArrayList)>
		//    5    9:return          
		}

		public void setCustomizationMapId(PersistentMapIdentifier persistentmapidentifier)
		{
			native_setCustomizationMapId(nativeRef, persistentmapidentifier);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #358 <Method void native_setCustomizationMapId(long, PersistentMapIdentifier)>
		//    5    9:return          
		}

		public void setDirtDetectsHiddenState(boolean flag)
		{
			native_setDirtDetectsHiddenState(nativeRef, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #361 <Method void native_setDirtDetectsHiddenState(long, boolean)>
		//    5    9:return          
		}

		public void setErrorDismissed(MapCustomizationErrors mapcustomizationerrors)
		{
			native_setErrorDismissed(nativeRef, mapcustomizationerrors);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #365 <Method void native_setErrorDismissed(long, MapCustomizationErrors)>
		//    5    9:return          
		}

		public void setFloorPlanListItemMode(HashSet hashset)
		{
			native_setFloorPlanListItemMode(nativeRef, hashset);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #369 <Method void native_setFloorPlanListItemMode(long, HashSet)>
		//    5    9:return          
		}

		public void setFloorPlanListMapId(String s)
		{
			native_setFloorPlanListMapId(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #373 <Method void native_setFloorPlanListMapId(long, String)>
		//    5    9:return          
		}

		public void setFloorPlanListMapVersionId(String s)
		{
			native_setFloorPlanListMapVersionId(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #376 <Method void native_setFloorPlanListMapVersionId(long, String)>
		//    5    9:return          
		}

		public void setFloorPlanMapsDestination(PersistentMapsDestination persistentmapsdestination)
		{
			native_setFloorPlanMapsDestination(nativeRef, persistentmapsdestination);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #380 <Method void native_setFloorPlanMapsDestination(long, PersistentMapsDestination)>
		//    5    9:return          
		}

		public void setFloorPlanSelectionListItem(FloorPlanListItem floorplanlistitem, int i)
		{
			native_setFloorPlanSelectionListItem(nativeRef, floorplanlistitem, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #384 <Method void native_setFloorPlanSelectionListItem(long, FloorPlanListItem, int)>
		//    6   10:return          
		}

		public void setMissionMapType(MissionMapType missionmaptype)
		{
			native_setMissionMapType(nativeRef, missionmaptype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #388 <Method void native_setMissionMapType(long, MissionMapType)>
		//    5    9:return          
		}

		public void setNewMapName(String s)
		{
			native_setNewMapName(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #391 <Method void native_setNewMapName(long, String)>
		//    5    9:return          
		}

		public void setPlatformViewDimensions(HashMap hashmap)
		{
			native_setPlatformViewDimensions(nativeRef, hashmap);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #395 <Method void native_setPlatformViewDimensions(long, HashMap)>
		//    5    9:return          
		}

		public void setPlaybackProgress(float f)
		{
			native_setPlaybackProgress(nativeRef, f);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:fload_1         
		//    4    6:invokespecial   #400 <Method void native_setPlaybackProgress(long, float)>
		//    5    9:return          
		}

		public void setRegionNamePlaceHolder(String s)
		{
			native_setRegionNamePlaceHolder(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #403 <Method void native_setRegionNamePlaceHolder(long, String)>
		//    5    9:return          
		}

		public void setRegionTypeChange(RegionType regiontype, String s)
		{
			native_setRegionTypeChange(nativeRef, regiontype, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #407 <Method void native_setRegionTypeChange(long, RegionType, String)>
		//    6   10:return          
		}

		public void setRenameRegion(String s, String s1)
		{
			native_setRenameRegion(nativeRef, s, s1);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #411 <Method void native_setRenameRegion(long, String, String)>
		//    6   10:return          
		}

		public void setRunActionCommandType(CommandType commandtype)
		{
			native_setRunActionCommandType(nativeRef, commandtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #415 <Method void native_setRunActionCommandType(long, CommandType)>
		//    5    9:return          
		}

		public void setRunActionMapId(PersistentMapIdentifier persistentmapidentifier)
		{
			native_setRunActionMapId(nativeRef, persistentmapidentifier);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #418 <Method void native_setRunActionMapId(long, PersistentMapIdentifier)>
		//    5    9:return          
		}

		public void setSelectedRegionNamePlaceHolder(String s)
		{
			native_setSelectedRegionNamePlaceHolder(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #421 <Method void native_setSelectedRegionNamePlaceHolder(long, String)>
		//    5    9:return          
		}

		public void setToggleRegionSelectionId(String s)
		{
			native_setToggleRegionSelectionId(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #424 <Method void native_setToggleRegionSelectionId(long, String)>
		//    5    9:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void MapsUIServiceData()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public MapsUIServiceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native MapsUIServiceData create();

	public abstract ArrayList getBasicRegionTypeTable();

	public abstract RegionTypeTableItem getCustomRegionTypeItem();

	public abstract MapCustomizationErrors getCustomizationErrorMessage();

	public abstract ArrayList getCustomizationOptionsMenu();

	public abstract String getCustomizedMapName();

	public abstract String getDebugInfoMapId();

	public abstract String getDebugInfoVersion();

	public abstract ErrorReason getErrorReason();

	public abstract ErrorSource getErrorSource();

	public abstract boolean getFloorPlanBooleanValue();

	public abstract BooleanValueType getFloorPlanBooleanValueType();

	public abstract FloorPlanListItem getFloorPlanItem();

	public abstract ArrayList getFloorPlanLabeledRegionList();

	public abstract int getFloorPlanListItemIndex();

	public abstract ArrayList getFloorPlanListItems();

	public abstract PersistentMapsDestination getFloorPlanMapsDestination();

	public abstract PersistentMapIdentifier getFloorPlanMapsId();

	public abstract ArrayList getFloorPlanRegionList();

	public abstract FloorPlanListItem getFloorPlanRegionListItem();

	public abstract ArrayList getFloorPlanUnlabeledRegionList();

	public abstract int getHighestLearningPercentage();

	public abstract boolean getIsCustomizationCancelled();

	public abstract boolean getIsMapCustomizationEnabled();

	public abstract boolean getIsMapDirty();

	public abstract ArrayList getListOfRegionNames();

	public abstract String getLocalizedErrorMessageKey();

	public abstract boolean getMapCompleted();

	public abstract MapCustomizationViewState getMapCustomizationViewState();

	public abstract boolean getMapReadyForSetup();

	public abstract RenderPresenter getMapRenderer();

	public abstract boolean getMapZoomResetButtonState();

	public abstract ArrayList getMapsDataStates();

	public abstract ArrayList getMapsViewStates();

	public abstract MissionDetailsViewState getMissionDetailsViewState();

	public abstract String getMissionErrorMessage();

	public abstract RobotMissionHistoryItem getMissionHistoryDetails();

	public abstract MissionMapType getMissionMapType();

	public abstract boolean getMissionMapZoomState();

	public abstract MissionRuntimeEChartEvent getMissionRuntimeChart();

	public abstract String getNonLocalizedErrorMessage();

	public abstract PersistentMapIdentifier getPersistentMapId();

	public abstract String getPersistentMapName();

	public abstract float getPlaybackProgress();

	public abstract ArrayList getRegionTypeTable();

	public abstract int getSelectedRegionLabelCount();

	public abstract String getSelectedRegionLabelName();

	public abstract int getTotalRegionCount();

	public abstract int getUnlabeledRegionCount();

	public abstract String getUsedRegionId();

	public abstract String getUsedRegionName();

	public abstract TitleSpecifier getViewTitle();

	public abstract int getWifiBadRegions();

	public abstract ArrayList getWifiColorLegend();

	public abstract void setActiveFloorMapId(String s);

	public abstract void setActiveFloorRegionIds(ArrayList arraylist);

	public abstract void setCustomizationMapId(PersistentMapIdentifier persistentmapidentifier);

	public abstract void setDirtDetectsHiddenState(boolean flag);

	public abstract void setErrorDismissed(MapCustomizationErrors mapcustomizationerrors);

	public abstract void setFloorPlanListItemMode(HashSet hashset);

	public abstract void setFloorPlanListMapId(String s);

	public abstract void setFloorPlanListMapVersionId(String s);

	public abstract void setFloorPlanMapsDestination(PersistentMapsDestination persistentmapsdestination);

	public abstract void setFloorPlanSelectionListItem(FloorPlanListItem floorplanlistitem, int i);

	public abstract void setMissionMapType(MissionMapType missionmaptype);

	public abstract void setNewMapName(String s);

	public abstract void setPlatformViewDimensions(HashMap hashmap);

	public abstract void setPlaybackProgress(float f);

	public abstract void setRegionNamePlaceHolder(String s);

	public abstract void setRegionTypeChange(RegionType regiontype, String s);

	public abstract void setRenameRegion(String s, String s1);

	public abstract void setRunActionCommandType(CommandType commandtype);

	public abstract void setRunActionMapId(PersistentMapIdentifier persistentmapidentifier);

	public abstract void setSelectedRegionNamePlaceHolder(String s);

	public abstract void setToggleRegionSelectionId(String s);
}
