.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;
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
    name = "GeofenceEventInfo"
.end annotation


# instance fields
.field public campaignId:Ljava/lang/String;

.field public chainId:Ljava/lang/String;

.field public dwellTimeSeconds:Ljava/lang/Long;

.field public eventTimestamp:Ljava/lang/Long;

.field public eventType:Ljava/lang/Integer;

.field public isForeground:Ljava/lang/Boolean;

.field public messageId:Ljava/lang/String;

.field public storeId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 726
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;
    .locals 2

    .line 741
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;

    if-eqz p1, :cond_0

    .line 742
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 726
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;
    .locals 1

    .line 737
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 748
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->isForeground:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->isForeground:Ljava/lang/Boolean;

    :cond_0
    return-void
.end method
