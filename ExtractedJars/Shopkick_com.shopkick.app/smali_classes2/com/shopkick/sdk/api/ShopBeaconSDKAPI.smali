.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI;
.super Ljava/lang/Object;
.source "ShopBeaconSDKAPI.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZonesByBeaconDataRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequestV2;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconProximityInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconMessageInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconMappingInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesResponseV2;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV6;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV2;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequestV2;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequestV2;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GetOfflineDataVersionsResponseDetails;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GetOfflineDataVersionsResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GetOfflineDataVersionsRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GetOfflineDataResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GetOfflineDataRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GetBeaconInfoResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GetBeaconInfoRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$DetectionDevice;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsRequestV4;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsRequestV3;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsRequestV2;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconsResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconsRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMappingInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetails;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDecryptionInfo;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeResponse;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV3;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequest;,
        Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;
    }
.end annotation


# static fields
.field public static final ACTION_DETECT:Ljava/lang/String; = "detect"

.field public static final ACTION_ENABLE:Ljava/lang/String; = "enable"

.field public static final ATTR_LATITUDE:Ljava/lang/String; = "latitude"

.field public static final ATTR_LONGITUDE:Ljava/lang/String; = "longitude"

.field public static final ATTR_RETAIL_CHAIN_ID:Ljava/lang/String; = "retail.chain_id"

.field public static final ATTR_RETAIL_DEPARTMENT_ID:Ljava/lang/String; = "retail.department_id"

.field public static final ATTR_RETAIL_DISTRICT_ID:Ljava/lang/String; = "retail.district_id"

.field public static final ATTR_RETAIL_STORE_ID:Ljava/lang/String; = "retail.store_id"

.field public static final BTLEProximityLevelCombined:I = 0x8

.field public static final BTLEProximityLevelDefault:I = 0x3

.field public static final BTLEProximityLevelEverything:I = 0x7

.field public static final BTLEProximityLevelImmediate:I = 0x4

.field public static final BTLEProximityLevelLarge:I = 0x5

.field public static final BTLEProximityLevelLargest:I = 0x6

.field public static final BTLEProximityLevelSmall:I = 0x2

.field public static final BTLEProximityLevelSmallest:I = 0x1

.field public static final BTLEProximityLevelUnknown:I = 0x0

.field public static final BackgroundTypeOpenApp:I = 0x1

.field public static final BackgroundTypeShowDeepLink:I = 0x3

.field public static final BackgroundTypeShowOverlay:I = 0x2

.field public static final BeaconDetailsRequestStatusBtleIdNotFound:I = -0x1

.field public static final BeaconDetailsRequestStatusDepartmentMappingNotFound:I = -0x4

.field public static final BeaconDetailsRequestStatusInfoDisabled:I = -0x7

.field public static final BeaconDetailsRequestStatusInsufficientCapabilities:I = -0xa

.field public static final BeaconDetailsRequestStatusLocationDetailsNotFound:I = -0x3

.field public static final BeaconDetailsRequestStatusLocationMappingNotFound:I = -0x2

.field public static final BeaconDetailsRequestStatusMissingChainId:I = -0x5

.field public static final BeaconDetailsRequestStatusOutsideDiagnosticRadius:I = -0x9

.field public static final BeaconDetailsRequestStatusSuccess:I = 0x0

.field public static final BeaconDetailsRequestStatusValidationError:I = -0x8

.field public static final BeaconEventTypeBackgroundMessageShown:I = 0x3

.field public static final BeaconEventTypeBackgroundMessageTapped:I = 0x4

.field public static final BeaconEventTypeBeaconDiscovered:I = 0x1

.field public static final BeaconEventTypeBeaconExpired:I = 0x2

.field public static final BeaconEventTypeForegroundOverlayClickedThrough:I = 0x7

.field public static final BeaconEventTypeForegroundOverlayDismissed:I = 0x6

.field public static final BeaconEventTypeForegroundOverlayShown:I = 0x5

.field public static final BeaconEventTypeUnknown:I = 0x0

.field public static final COMPOSITE_TRIGGER_OR_OPERATOR:Ljava/lang/String; = "or"

.field public static final CampaignTypeBle:I = 0x1

.field public static final CampaignTypeGeofencing:I = 0x2

.field public static final DETECTION_DEVICE_TYPE_BTLE:Ljava/lang/String; = "btle"

.field public static final DETECTION_DEVICE_TYPE_LOCATION:Ljava/lang/String; = "location"

.field public static final DETECTION_DEVICE_TYPE_SHOPKICK_BEACON:Ljava/lang/String; = "shopkick_beacon"

.field public static final DETECTION_DEVICE_TYPE_WIFI:Ljava/lang/String; = "wifi"

.field public static final EventLogStatusFail:I = 0x1

.field public static final EventLogStatusSuccess:I = 0x0

.field public static final ForegroundTypeCopyBackgroundDeepLink:I = 0x1

.field public static final ForegroundTypeCopyBackgroundOverlay:I = 0x2

.field public static final ForegroundTypeCustomDeeplink:I = 0x3

.field public static final ForegroundTypeCustomOverlay:I = 0x4

.field public static final ForegroundTypeSkipForeground:I = 0x5

.field public static final GeofenceEventTypeBackgroundMessageShown:I = 0x3

.field public static final GeofenceEventTypeBackgroundMessageTapped:I = 0x4

.field public static final GeofenceEventTypeEnter:I = 0x1

.field public static final GeofenceEventTypeExit:I = 0x2

.field public static final GeofenceEventTypeForegroundOverlayClickedThrough:I = 0x7

.field public static final GeofenceEventTypeForegroundOverlayDismissed:I = 0x6

.field public static final GeofenceEventTypeForegroundOverlayShown:I = 0x5

.field public static final GeofenceEventTypeUnknown:I = 0x0

.field public static final OfflineDataCategoryBeaconDecryptionInfo:I = 0x1

.field public static final OfflineDataCategoryBeaconMappingInfo:I = 0x2

.field public static final OfflineDataCategoryBeaconMessageInfo:I = 0x4

.field public static final OfflineDataCategoryBeaconProximityInfo:I = 0x3

.field public static final OfflineDataCategoryLocationInfo:I = 0x5

.field public static final OfflineDataStoreSyncTriggerAppSessionStart:I = 0x1

.field public static final OfflineDataStoreSyncTriggerMissingEntity:I = 0x3

.field public static final OfflineDataStoreSyncTriggerSignificantLocationChange:I = 0x2

.field public static final ShopBeaconServerStatusInvalidAccessProfile:I = 0x1

.field public static final ShopBeaconServerStatusSuccess:I = 0x0

.field public static final TRIGGER_TYPE_COMPOSITE:Ljava/lang/String; = "composite"

.field public static final TRIGGER_TYPE_GEO_RADIAL:Ljava/lang/String; = "geo_radial"

.field public static final TRIGGER_TYPE_SHOPKICK_BEACON:Ljava/lang/String; = "shopkick_beacon"

.field public static final TRIGGER_TYPE_ULTRASONIC:Ljava/lang/String; = "ultrasonic"

.field public static final TRIGGER_TYPE_WIFI:Ljava/lang/String; = "wifi"

.field public static final ZONE_TYPE_DEPARTMENT:Ljava/lang/String; = "department"

.field public static final ZONE_TYPE_DISTRICT:Ljava/lang/String; = "district"

.field public static final ZONE_TYPE_STORE:Ljava/lang/String; = "store"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
