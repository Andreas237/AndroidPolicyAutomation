.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;
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
    name = "BeaconDiscoveryInfo"
.end annotation


# instance fields
.field public batteryLife:Ljava/lang/Integer;

.field public beaconData:Ljava/lang/String;

.field public btleId:Ljava/lang/Integer;

.field public campaignId:Ljava/lang/Long;

.field public chainId:Ljava/lang/Long;

.field public departmentId:Ljava/lang/Integer;

.field public dwellTime:Ljava/lang/Integer;

.field public isForeground:Ljava/lang/Boolean;

.field public proximityLevel:Ljava/lang/Integer;

.field public shouldLog:Ljava/lang/Boolean;

.field public signalStrength:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 323
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;
    .locals 2

    .line 341
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    if-eqz p1, :cond_0

    .line 342
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 323
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;
    .locals 1

    .line 337
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 348
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->isForeground:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->isForeground:Ljava/lang/Boolean;

    .line 349
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->shouldLog:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->shouldLog:Ljava/lang/Boolean;

    :cond_1
    return-void
.end method
