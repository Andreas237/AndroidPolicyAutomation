.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;
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
    name = "OfflineDataEntity"
.end annotation


# instance fields
.field public dataCategory:Ljava/lang/Integer;

.field public entityKey:Ljava/lang/String;

.field public entityVersion:Ljava/lang/String;

.field public offlineBeaconDecrytInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;

.field public offlineBeaconMappingInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconMappingInfo;

.field public offlineBeaconMessageInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconMessageInfo;

.field public offlineBeaconProximityInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconProximityInfo;

.field public offlineLocationInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1274
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;
    .locals 2

    .line 1289
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;

    if-eqz p1, :cond_0

    .line 1290
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 1274
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;
    .locals 1

    .line 1285
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 1296
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;->offlineBeaconDecrytInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;->postProcess()V

    .line 1297
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;->offlineBeaconMappingInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconMappingInfo;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconMappingInfo;->postProcess()V

    .line 1298
    :cond_1
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;->offlineBeaconMessageInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconMessageInfo;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconMessageInfo;->postProcess()V

    .line 1299
    :cond_2
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;->offlineBeaconProximityInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconProximityInfo;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconProximityInfo;->postProcess()V

    .line 1300
    :cond_3
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineDataEntity;->offlineLocationInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;->postProcess()V

    :cond_4
    return-void
.end method
