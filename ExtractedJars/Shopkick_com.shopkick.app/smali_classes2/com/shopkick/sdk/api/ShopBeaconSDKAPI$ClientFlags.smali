.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;
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
    name = "ClientFlags"
.end annotation


# instance fields
.field public locationRequestHighFastestIntervalMs:Ljava/lang/Integer;

.field public locationRequestHighIntervalMs:Ljava/lang/Integer;

.field public locationRequestLowFastestIntervalMs:Ljava/lang/Integer;

.field public locationRequestLowIntervalMs:Ljava/lang/Integer;

.field public locationRequestMediumFastestIntervalMs:Ljava/lang/Integer;

.field public locationRequestMediumIntervalMs:Ljava/lang/Integer;

.field public useOldIosBtleWalkinDetection:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 631
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;
    .locals 2

    .line 645
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;

    if-eqz p1, :cond_0

    .line 646
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 631
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;
    .locals 1

    .line 641
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 652
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->locationRequestHighIntervalMs:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/16 v0, 0x3e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->locationRequestHighIntervalMs:Ljava/lang/Integer;

    .line 653
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->locationRequestMediumFastestIntervalMs:Ljava/lang/Integer;

    if-nez v0, :cond_1

    const v0, 0xea60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->locationRequestMediumFastestIntervalMs:Ljava/lang/Integer;

    .line 654
    :cond_1
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->locationRequestMediumIntervalMs:Ljava/lang/Integer;

    if-nez v0, :cond_2

    const v0, 0x927c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->locationRequestMediumIntervalMs:Ljava/lang/Integer;

    .line 655
    :cond_2
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->useOldIosBtleWalkinDetection:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->useOldIosBtleWalkinDetection:Ljava/lang/Boolean;

    :cond_3
    return-void
.end method
