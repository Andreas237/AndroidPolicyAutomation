// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			DiscoveredAsset, AdvancedWifiSettings, AppInfoEvent, AssetInfo, 
//			DiscoveredWifiAsset, WifiProvisioningStatus, DiscoveryState, DiscoveryType, 
//			SkuType, ProvisioningType, RobotDiscoveryListItem, Error

public abstract class AssetSetupUIServiceData
{
	private static final class CppProxy extends AssetSetupUIServiceData
	{

		private native void nativeDestroy(long l);

		private native DiscoveredAsset native_discoveredAssetBeingProvisioned(long l);

		private native AdvancedWifiSettings native_getAdvancedWifiSettings(long l);

		private native AppInfoEvent native_getAppInfo(long l);

		private native AssetInfo native_getAssetBeingReprovisioned(long l);

		private native DiscoveredWifiAsset native_getAssetDiscoveredOnHomeNetwork(long l);

		private native String native_getAssetName(long l);

		private native String native_getCurrentApSsid(long l);

		private native WifiProvisioningStatus native_getCurrentProvisioningStatus(long l);

		private native ArrayList native_getDataStateChangelist(long l);

		private native DiscoveredAsset native_getDiscoveredAsset(long l);

		private native AssetInfo native_getDiscoveredAssetInfo(long l);

		private native ArrayList native_getDiscoveredBleAssets(long l);

		private native ArrayList native_getDiscoveredWifiAssets(long l);

		private native ArrayList native_getDiscoveryFilterForAssets(long l);

		private native int native_getDiscoveryIdForListItemsPresentation(long l);

		private native ArrayList native_getDiscoveryListItems(long l);

		private native DiscoveryState native_getDiscoveryState(long l);

		private native DiscoveryType native_getDiscoveryTypeForListItemsPresentation(long l);

		private native HashSet native_getDiscoveryTypesForSelectRobotPresentationEnd(long l);

		private native HashSet native_getDiscoveryTypesForSelectRobotPresentationStart(long l);

		private native String native_getHomeWifiBssid(long l);

		private native String native_getHomeWifiSsid(long l);

		private native SkuType native_getPlaceholderSkuType(long l);

		private native ProvisioningType native_getProvisioningType(long l);

		private native ProvisioningType native_getProvisioningTypeToTransitionTo(long l);

		private native RobotDiscoveryListItem native_getSelectedDiscoveryListItem(long l);

		private native int native_getSelectedRobotListItemIndex(long l);

		private native String native_getSoftApSsid(long l);

		private native ArrayList native_getViewStateChangelist(long l);

		private native byte native_getWifiChannel(long l);

		private native String native_getWifiPassword(long l);

		private native Error native_getWifiProvisioningError(long l);

		private native boolean native_isTridentRobot(long l);

		private native void native_setAdvancedWifiSettings(long l, AdvancedWifiSettings advancedwifisettings);

		private native void native_setAppInfo(long l, AppInfoEvent appinfoevent);

		private native void native_setAssetBeingReprovisioned(long l, AssetInfo assetinfo);

		private native void native_setAssetName(long l, String s);

		private native void native_setCurrentApSsid(long l, String s);

		private native void native_setDiscoveredAsset(long l, DiscoveredAsset discoveredasset);

		private native void native_setDiscoveredAssetForProvisioning(long l, DiscoveredAsset discoveredasset);

		private native void native_setDiscoveredAssetInfo(long l, AssetInfo assetinfo);

		private native void native_setDiscoveredBleAssets(long l, ArrayList arraylist);

		private native void native_setDiscoveredWifiAssets(long l, ArrayList arraylist);

		private native void native_setDiscoveryFilterForAssets(long l, ArrayList arraylist);

		private native void native_setDiscoveryIdForListItemsPresentation(long l, int i);

		private native void native_setDiscoveryListItems(long l, ArrayList arraylist);

		private native void native_setDiscoveryState(long l, DiscoveryState discoverystate);

		private native void native_setDiscoveryTypeForListItemsPresentation(long l, DiscoveryType discoverytype);

		private native void native_setDiscoveryTypesForSelectRobotPresentationEnd(long l, HashSet hashset);

		private native void native_setDiscoveryTypesForSelectRobotPresentationStart(long l, HashSet hashset);

		private native void native_setHomeWifiBssid(long l, String s);

		private native void native_setHomeWifiSsid(long l, String s);

		private native void native_setPlaceholderSkuType(long l, SkuType skutype);

		private native void native_setProvisioningType(long l, ProvisioningType provisioningtype);

		private native void native_setProvisioningTypeToTransitionTo(long l, ProvisioningType provisioningtype);

		private native void native_setSelectedDiscoveryListItem(long l, RobotDiscoveryListItem robotdiscoverylistitem);

		private native void native_setSelectedRobotListItemIndex(long l, int i);

		private native void native_setSoftApSsid(long l, String s);

		private native void native_setWifiChannel(long l, byte byte0);

		private native void native_setWifiPassword(long l, String s);

		private native boolean native_shouldWarn5GHZ(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #134 <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #136 <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public DiscoveredAsset discoveredAssetBeingProvisioned()
		{
			return native_discoveredAssetBeingProvisioned(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #140 <Method DiscoveredAsset native_discoveredAssetBeingProvisioned(long)>
		//    4    8:areturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #143 <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #147 <Method void Object.finalize()>
		//    4    8:return          
		}

		public AdvancedWifiSettings getAdvancedWifiSettings()
		{
			return native_getAdvancedWifiSettings(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #151 <Method AdvancedWifiSettings native_getAdvancedWifiSettings(long)>
		//    4    8:areturn         
		}

		public AppInfoEvent getAppInfo()
		{
			return native_getAppInfo(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #155 <Method AppInfoEvent native_getAppInfo(long)>
		//    4    8:areturn         
		}

		public AssetInfo getAssetBeingReprovisioned()
		{
			return native_getAssetBeingReprovisioned(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #159 <Method AssetInfo native_getAssetBeingReprovisioned(long)>
		//    4    8:areturn         
		}

		public DiscoveredWifiAsset getAssetDiscoveredOnHomeNetwork()
		{
			return native_getAssetDiscoveredOnHomeNetwork(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #163 <Method DiscoveredWifiAsset native_getAssetDiscoveredOnHomeNetwork(long)>
		//    4    8:areturn         
		}

		public String getAssetName()
		{
			return native_getAssetName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #167 <Method String native_getAssetName(long)>
		//    4    8:areturn         
		}

		public String getCurrentApSsid()
		{
			return native_getCurrentApSsid(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #170 <Method String native_getCurrentApSsid(long)>
		//    4    8:areturn         
		}

		public WifiProvisioningStatus getCurrentProvisioningStatus()
		{
			return native_getCurrentProvisioningStatus(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #174 <Method WifiProvisioningStatus native_getCurrentProvisioningStatus(long)>
		//    4    8:areturn         
		}

		public ArrayList getDataStateChangelist()
		{
			return native_getDataStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #178 <Method ArrayList native_getDataStateChangelist(long)>
		//    4    8:areturn         
		}

		public DiscoveredAsset getDiscoveredAsset()
		{
			return native_getDiscoveredAsset(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #183 <Method DiscoveredAsset native_getDiscoveredAsset(long)>
		//    4    8:areturn         
		}

		public AssetInfo getDiscoveredAssetInfo()
		{
			return native_getDiscoveredAssetInfo(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #186 <Method AssetInfo native_getDiscoveredAssetInfo(long)>
		//    4    8:areturn         
		}

		public ArrayList getDiscoveredBleAssets()
		{
			return native_getDiscoveredBleAssets(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #189 <Method ArrayList native_getDiscoveredBleAssets(long)>
		//    4    8:areturn         
		}

		public ArrayList getDiscoveredWifiAssets()
		{
			return native_getDiscoveredWifiAssets(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #193 <Method ArrayList native_getDiscoveredWifiAssets(long)>
		//    4    8:areturn         
		}

		public ArrayList getDiscoveryFilterForAssets()
		{
			return native_getDiscoveryFilterForAssets(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #196 <Method ArrayList native_getDiscoveryFilterForAssets(long)>
		//    4    8:areturn         
		}

		public int getDiscoveryIdForListItemsPresentation()
		{
			return native_getDiscoveryIdForListItemsPresentation(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #201 <Method int native_getDiscoveryIdForListItemsPresentation(long)>
		//    4    8:ireturn         
		}

		public ArrayList getDiscoveryListItems()
		{
			return native_getDiscoveryListItems(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #204 <Method ArrayList native_getDiscoveryListItems(long)>
		//    4    8:areturn         
		}

		public DiscoveryState getDiscoveryState()
		{
			return native_getDiscoveryState(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #209 <Method DiscoveryState native_getDiscoveryState(long)>
		//    4    8:areturn         
		}

		public DiscoveryType getDiscoveryTypeForListItemsPresentation()
		{
			return native_getDiscoveryTypeForListItemsPresentation(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #213 <Method DiscoveryType native_getDiscoveryTypeForListItemsPresentation(long)>
		//    4    8:areturn         
		}

		public HashSet getDiscoveryTypesForSelectRobotPresentationEnd()
		{
			return native_getDiscoveryTypesForSelectRobotPresentationEnd(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #217 <Method HashSet native_getDiscoveryTypesForSelectRobotPresentationEnd(long)>
		//    4    8:areturn         
		}

		public HashSet getDiscoveryTypesForSelectRobotPresentationStart()
		{
			return native_getDiscoveryTypesForSelectRobotPresentationStart(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #221 <Method HashSet native_getDiscoveryTypesForSelectRobotPresentationStart(long)>
		//    4    8:areturn         
		}

		public String getHomeWifiBssid()
		{
			return native_getHomeWifiBssid(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #224 <Method String native_getHomeWifiBssid(long)>
		//    4    8:areturn         
		}

		public String getHomeWifiSsid()
		{
			return native_getHomeWifiSsid(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #227 <Method String native_getHomeWifiSsid(long)>
		//    4    8:areturn         
		}

		public SkuType getPlaceholderSkuType()
		{
			return native_getPlaceholderSkuType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #231 <Method SkuType native_getPlaceholderSkuType(long)>
		//    4    8:areturn         
		}

		public ProvisioningType getProvisioningType()
		{
			return native_getProvisioningType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #235 <Method ProvisioningType native_getProvisioningType(long)>
		//    4    8:areturn         
		}

		public ProvisioningType getProvisioningTypeToTransitionTo()
		{
			return native_getProvisioningTypeToTransitionTo(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #238 <Method ProvisioningType native_getProvisioningTypeToTransitionTo(long)>
		//    4    8:areturn         
		}

		public RobotDiscoveryListItem getSelectedDiscoveryListItem()
		{
			return native_getSelectedDiscoveryListItem(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #242 <Method RobotDiscoveryListItem native_getSelectedDiscoveryListItem(long)>
		//    4    8:areturn         
		}

		public int getSelectedRobotListItemIndex()
		{
			return native_getSelectedRobotListItemIndex(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #245 <Method int native_getSelectedRobotListItemIndex(long)>
		//    4    8:ireturn         
		}

		public String getSoftApSsid()
		{
			return native_getSoftApSsid(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #248 <Method String native_getSoftApSsid(long)>
		//    4    8:areturn         
		}

		public ArrayList getViewStateChangelist()
		{
			return native_getViewStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #251 <Method ArrayList native_getViewStateChangelist(long)>
		//    4    8:areturn         
		}

		public byte getWifiChannel()
		{
			return native_getWifiChannel(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #256 <Method byte native_getWifiChannel(long)>
		//    4    8:ireturn         
		}

		public String getWifiPassword()
		{
			return native_getWifiPassword(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #259 <Method String native_getWifiPassword(long)>
		//    4    8:areturn         
		}

		public Error getWifiProvisioningError()
		{
			return native_getWifiProvisioningError(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #263 <Method Error native_getWifiProvisioningError(long)>
		//    4    8:areturn         
		}

		public boolean isTridentRobot()
		{
			return native_isTridentRobot(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #267 <Method boolean native_isTridentRobot(long)>
		//    4    8:ireturn         
		}

		public void setAdvancedWifiSettings(AdvancedWifiSettings advancedwifisettings)
		{
			native_setAdvancedWifiSettings(nativeRef, advancedwifisettings);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #271 <Method void native_setAdvancedWifiSettings(long, AdvancedWifiSettings)>
		//    5    9:return          
		}

		public void setAppInfo(AppInfoEvent appinfoevent)
		{
			native_setAppInfo(nativeRef, appinfoevent);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #275 <Method void native_setAppInfo(long, AppInfoEvent)>
		//    5    9:return          
		}

		public void setAssetBeingReprovisioned(AssetInfo assetinfo)
		{
			native_setAssetBeingReprovisioned(nativeRef, assetinfo);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #279 <Method void native_setAssetBeingReprovisioned(long, AssetInfo)>
		//    5    9:return          
		}

		public void setAssetName(String s)
		{
			native_setAssetName(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #282 <Method void native_setAssetName(long, String)>
		//    5    9:return          
		}

		public void setCurrentApSsid(String s)
		{
			native_setCurrentApSsid(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #285 <Method void native_setCurrentApSsid(long, String)>
		//    5    9:return          
		}

		public void setDiscoveredAsset(DiscoveredAsset discoveredasset)
		{
			native_setDiscoveredAsset(nativeRef, discoveredasset);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #289 <Method void native_setDiscoveredAsset(long, DiscoveredAsset)>
		//    5    9:return          
		}

		public void setDiscoveredAssetForProvisioning(DiscoveredAsset discoveredasset)
		{
			native_setDiscoveredAssetForProvisioning(nativeRef, discoveredasset);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #292 <Method void native_setDiscoveredAssetForProvisioning(long, DiscoveredAsset)>
		//    5    9:return          
		}

		public void setDiscoveredAssetInfo(AssetInfo assetinfo)
		{
			native_setDiscoveredAssetInfo(nativeRef, assetinfo);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #295 <Method void native_setDiscoveredAssetInfo(long, AssetInfo)>
		//    5    9:return          
		}

		public void setDiscoveredBleAssets(ArrayList arraylist)
		{
			native_setDiscoveredBleAssets(nativeRef, arraylist);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #299 <Method void native_setDiscoveredBleAssets(long, ArrayList)>
		//    5    9:return          
		}

		public void setDiscoveredWifiAssets(ArrayList arraylist)
		{
			native_setDiscoveredWifiAssets(nativeRef, arraylist);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #303 <Method void native_setDiscoveredWifiAssets(long, ArrayList)>
		//    5    9:return          
		}

		public void setDiscoveryFilterForAssets(ArrayList arraylist)
		{
			native_setDiscoveryFilterForAssets(nativeRef, arraylist);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #306 <Method void native_setDiscoveryFilterForAssets(long, ArrayList)>
		//    5    9:return          
		}

		public void setDiscoveryIdForListItemsPresentation(int i)
		{
			native_setDiscoveryIdForListItemsPresentation(nativeRef, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #311 <Method void native_setDiscoveryIdForListItemsPresentation(long, int)>
		//    5    9:return          
		}

		public void setDiscoveryListItems(ArrayList arraylist)
		{
			native_setDiscoveryListItems(nativeRef, arraylist);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #314 <Method void native_setDiscoveryListItems(long, ArrayList)>
		//    5    9:return          
		}

		public void setDiscoveryState(DiscoveryState discoverystate)
		{
			native_setDiscoveryState(nativeRef, discoverystate);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #319 <Method void native_setDiscoveryState(long, DiscoveryState)>
		//    5    9:return          
		}

		public void setDiscoveryTypeForListItemsPresentation(DiscoveryType discoverytype)
		{
			native_setDiscoveryTypeForListItemsPresentation(nativeRef, discoverytype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #323 <Method void native_setDiscoveryTypeForListItemsPresentation(long, DiscoveryType)>
		//    5    9:return          
		}

		public void setDiscoveryTypesForSelectRobotPresentationEnd(HashSet hashset)
		{
			native_setDiscoveryTypesForSelectRobotPresentationEnd(nativeRef, hashset);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #327 <Method void native_setDiscoveryTypesForSelectRobotPresentationEnd(long, HashSet)>
		//    5    9:return          
		}

		public void setDiscoveryTypesForSelectRobotPresentationStart(HashSet hashset)
		{
			native_setDiscoveryTypesForSelectRobotPresentationStart(nativeRef, hashset);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #331 <Method void native_setDiscoveryTypesForSelectRobotPresentationStart(long, HashSet)>
		//    5    9:return          
		}

		public void setHomeWifiBssid(String s)
		{
			native_setHomeWifiBssid(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #334 <Method void native_setHomeWifiBssid(long, String)>
		//    5    9:return          
		}

		public void setHomeWifiSsid(String s)
		{
			native_setHomeWifiSsid(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #337 <Method void native_setHomeWifiSsid(long, String)>
		//    5    9:return          
		}

		public void setPlaceholderSkuType(SkuType skutype)
		{
			native_setPlaceholderSkuType(nativeRef, skutype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #341 <Method void native_setPlaceholderSkuType(long, SkuType)>
		//    5    9:return          
		}

		public void setProvisioningType(ProvisioningType provisioningtype)
		{
			native_setProvisioningType(nativeRef, provisioningtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #345 <Method void native_setProvisioningType(long, ProvisioningType)>
		//    5    9:return          
		}

		public void setProvisioningTypeToTransitionTo(ProvisioningType provisioningtype)
		{
			native_setProvisioningTypeToTransitionTo(nativeRef, provisioningtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #348 <Method void native_setProvisioningTypeToTransitionTo(long, ProvisioningType)>
		//    5    9:return          
		}

		public void setSelectedDiscoveryListItem(RobotDiscoveryListItem robotdiscoverylistitem)
		{
			native_setSelectedDiscoveryListItem(nativeRef, robotdiscoverylistitem);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #352 <Method void native_setSelectedDiscoveryListItem(long, RobotDiscoveryListItem)>
		//    5    9:return          
		}

		public void setSelectedRobotListItemIndex(int i)
		{
			native_setSelectedRobotListItemIndex(nativeRef, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #355 <Method void native_setSelectedRobotListItemIndex(long, int)>
		//    5    9:return          
		}

		public void setSoftApSsid(String s)
		{
			native_setSoftApSsid(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #358 <Method void native_setSoftApSsid(long, String)>
		//    5    9:return          
		}

		public void setWifiChannel(byte byte0)
		{
			native_setWifiChannel(nativeRef, byte0);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #362 <Method void native_setWifiChannel(long, byte)>
		//    5    9:return          
		}

		public void setWifiPassword(String s)
		{
			native_setWifiPassword(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #365 <Method void native_setWifiPassword(long, String)>
		//    5    9:return          
		}

		public boolean shouldWarn5GHZ()
		{
			return native_shouldWarn5GHZ(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #368 <Method boolean native_shouldWarn5GHZ(long)>
		//    4    8:ireturn         
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
		//    1    1:invokespecial   #19  <Method void AssetSetupUIServiceData()>
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


	public AssetSetupUIServiceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native AssetSetupUIServiceData create();

	public abstract DiscoveredAsset discoveredAssetBeingProvisioned();

	public abstract AdvancedWifiSettings getAdvancedWifiSettings();

	public abstract AppInfoEvent getAppInfo();

	public abstract AssetInfo getAssetBeingReprovisioned();

	public abstract DiscoveredWifiAsset getAssetDiscoveredOnHomeNetwork();

	public abstract String getAssetName();

	public abstract String getCurrentApSsid();

	public abstract WifiProvisioningStatus getCurrentProvisioningStatus();

	public abstract ArrayList getDataStateChangelist();

	public abstract DiscoveredAsset getDiscoveredAsset();

	public abstract AssetInfo getDiscoveredAssetInfo();

	public abstract ArrayList getDiscoveredBleAssets();

	public abstract ArrayList getDiscoveredWifiAssets();

	public abstract ArrayList getDiscoveryFilterForAssets();

	public abstract int getDiscoveryIdForListItemsPresentation();

	public abstract ArrayList getDiscoveryListItems();

	public abstract DiscoveryState getDiscoveryState();

	public abstract DiscoveryType getDiscoveryTypeForListItemsPresentation();

	public abstract HashSet getDiscoveryTypesForSelectRobotPresentationEnd();

	public abstract HashSet getDiscoveryTypesForSelectRobotPresentationStart();

	public abstract String getHomeWifiBssid();

	public abstract String getHomeWifiSsid();

	public abstract SkuType getPlaceholderSkuType();

	public abstract ProvisioningType getProvisioningType();

	public abstract ProvisioningType getProvisioningTypeToTransitionTo();

	public abstract RobotDiscoveryListItem getSelectedDiscoveryListItem();

	public abstract int getSelectedRobotListItemIndex();

	public abstract String getSoftApSsid();

	public abstract ArrayList getViewStateChangelist();

	public abstract byte getWifiChannel();

	public abstract String getWifiPassword();

	public abstract Error getWifiProvisioningError();

	public abstract boolean isTridentRobot();

	public abstract void setAdvancedWifiSettings(AdvancedWifiSettings advancedwifisettings);

	public abstract void setAppInfo(AppInfoEvent appinfoevent);

	public abstract void setAssetBeingReprovisioned(AssetInfo assetinfo);

	public abstract void setAssetName(String s);

	public abstract void setCurrentApSsid(String s);

	public abstract void setDiscoveredAsset(DiscoveredAsset discoveredasset);

	public abstract void setDiscoveredAssetForProvisioning(DiscoveredAsset discoveredasset);

	public abstract void setDiscoveredAssetInfo(AssetInfo assetinfo);

	public abstract void setDiscoveredBleAssets(ArrayList arraylist);

	public abstract void setDiscoveredWifiAssets(ArrayList arraylist);

	public abstract void setDiscoveryFilterForAssets(ArrayList arraylist);

	public abstract void setDiscoveryIdForListItemsPresentation(int i);

	public abstract void setDiscoveryListItems(ArrayList arraylist);

	public abstract void setDiscoveryState(DiscoveryState discoverystate);

	public abstract void setDiscoveryTypeForListItemsPresentation(DiscoveryType discoverytype);

	public abstract void setDiscoveryTypesForSelectRobotPresentationEnd(HashSet hashset);

	public abstract void setDiscoveryTypesForSelectRobotPresentationStart(HashSet hashset);

	public abstract void setHomeWifiBssid(String s);

	public abstract void setHomeWifiSsid(String s);

	public abstract void setPlaceholderSkuType(SkuType skutype);

	public abstract void setProvisioningType(ProvisioningType provisioningtype);

	public abstract void setProvisioningTypeToTransitionTo(ProvisioningType provisioningtype);

	public abstract void setSelectedDiscoveryListItem(RobotDiscoveryListItem robotdiscoverylistitem);

	public abstract void setSelectedRobotListItemIndex(int i);

	public abstract void setSoftApSsid(String s);

	public abstract void setWifiChannel(byte byte0);

	public abstract void setWifiPassword(String s);

	public abstract boolean shouldWarn5GHZ();
}
