.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;
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
    name = "Message"
.end annotation


# instance fields
.field public backgroundType:Ljava/lang/Integer;

.field public campaignId:Ljava/lang/String;

.field public end:Ljava/lang/Long;

.field public foregroundDeepLink:Ljava/lang/String;

.field public foregroundType:Ljava/lang/Integer;

.field public logoImageUrl:Ljava/lang/String;

.field public maxProximityInMeters:Ljava/lang/Double;

.field public messageId:Ljava/lang/String;

.field public notificationDeepLink:Ljava/lang/String;

.field public notificationLogoImageUrl:Ljava/lang/String;

.field public notificationOverlayImageUrl:Ljava/lang/String;

.field public notificationOverlayText:Ljava/lang/String;

.field public notificationText:Ljava/lang/String;

.field public notificationTitle:Ljava/lang/String;

.field public notificationUrl:Ljava/lang/String;

.field public overlayImageUrl:Ljava/lang/String;

.field public overlayText:Ljava/lang/String;

.field public start:Ljava/lang/Long;

.field public zoneQuery:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1028
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;
    .locals 2

    .line 1054
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;

    if-eqz p1, :cond_0

    .line 1055
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 1028
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;
    .locals 1

    .line 1050
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
