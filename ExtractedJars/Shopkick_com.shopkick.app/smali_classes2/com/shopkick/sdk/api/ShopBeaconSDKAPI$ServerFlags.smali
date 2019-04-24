.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ShopBeaconSDKAPI.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/api/ShopBeaconSDKAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ServerFlags"
.end annotation


# instance fields
.field public beaconEmptyScanLimit:Ljava/lang/Integer;

.field public beaconExpirationTimeoutSeconds:Ljava/lang/Integer;

.field public beaconProximityPaddingDb:Ljava/lang/Integer;

.field public beaconStartScanRadiusMeters:Ljava/lang/Integer;

.field public bleScanIntervalSeconds:Ljava/lang/Integer;

.field public bleScanLengthBackgroundSeconds:Ljava/lang/Integer;

.field public bleScanLengthIntervalBackgroundSeconds:Ljava/lang/Integer;

.field public bleScanLengthSeconds:Ljava/lang/Integer;

.field public bleScanStartRadiusMeters:Ljava/lang/Integer;

.field public geofenceLimit:Ljava/lang/Integer;

.field public loggingQueueLimit:Ljava/lang/Integer;

.field public zoneListenerWarningLimit:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1354
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
    .locals 2

    .line 1373
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    if-eqz p1, :cond_0

    .line 1374
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 1354
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
    .locals 1

    .line 1369
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 4

    .line 1380
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->beaconEmptyScanLimit:Ljava/lang/Integer;

    const/16 v1, 0xa

    if-nez v0, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->beaconEmptyScanLimit:Ljava/lang/Integer;

    .line 1381
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->beaconExpirationTimeoutSeconds:Ljava/lang/Integer;

    if-nez v0, :cond_1

    const/16 v0, 0x12c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->beaconExpirationTimeoutSeconds:Ljava/lang/Integer;

    .line 1382
    :cond_1
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->beaconProximityPaddingDb:Ljava/lang/Integer;

    const/4 v2, 0x5

    if-nez v0, :cond_2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->beaconProximityPaddingDb:Ljava/lang/Integer;

    .line 1383
    :cond_2
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->beaconStartScanRadiusMeters:Ljava/lang/Integer;

    const/16 v3, 0x96

    if-nez v0, :cond_3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->beaconStartScanRadiusMeters:Ljava/lang/Integer;

    .line 1384
    :cond_3
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanIntervalSeconds:Ljava/lang/Integer;

    if-nez v0, :cond_4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanIntervalSeconds:Ljava/lang/Integer;

    .line 1385
    :cond_4
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanLengthBackgroundSeconds:Ljava/lang/Integer;

    if-nez v0, :cond_5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanLengthBackgroundSeconds:Ljava/lang/Integer;

    .line 1386
    :cond_5
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanLengthIntervalBackgroundSeconds:Ljava/lang/Integer;

    if-nez v0, :cond_6

    const/16 v0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanLengthIntervalBackgroundSeconds:Ljava/lang/Integer;

    .line 1387
    :cond_6
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanLengthSeconds:Ljava/lang/Integer;

    if-nez v0, :cond_7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanLengthSeconds:Ljava/lang/Integer;

    .line 1388
    :cond_7
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanStartRadiusMeters:Ljava/lang/Integer;

    if-nez v0, :cond_8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanStartRadiusMeters:Ljava/lang/Integer;

    .line 1389
    :cond_8
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->geofenceLimit:Ljava/lang/Integer;

    if-nez v0, :cond_9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->geofenceLimit:Ljava/lang/Integer;

    .line 1390
    :cond_9
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->loggingQueueLimit:Ljava/lang/Integer;

    if-nez v0, :cond_a

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->loggingQueueLimit:Ljava/lang/Integer;

    .line 1391
    :cond_a
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->zoneListenerWarningLimit:Ljava/lang/Integer;

    if-nez v0, :cond_b

    const/16 v0, 0x1f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->zoneListenerWarningLimit:Ljava/lang/Integer;

    :cond_b
    return-void
.end method
