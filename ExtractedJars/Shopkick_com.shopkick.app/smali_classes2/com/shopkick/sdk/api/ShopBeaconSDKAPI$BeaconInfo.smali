.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;
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
    name = "BeaconInfo"
.end annotation


# instance fields
.field public batteryLevel:Ljava/lang/Integer;

.field public beaconData:Ljava/lang/String;

.field public btleId:Ljava/lang/Integer;

.field public chainName:Ljava/lang/String;

.field public city:Ljava/lang/String;

.field public country:Ljava/lang/String;

.field public deptId:Ljava/lang/Integer;

.field public deptName:Ljava/lang/String;

.field public latitude:Ljava/lang/Double;

.field public logoImageUrl:Ljava/lang/String;

.field public longitude:Ljava/lang/Double;

.field public notificationText:Ljava/lang/String;

.field public notificationTitle:Ljava/lang/String;

.field public notificationUrl:Ljava/lang/String;

.field public overlayImageUrl:Ljava/lang/String;

.field public overlayText:Ljava/lang/String;

.field public postalCode:Ljava/lang/String;

.field public proximityLevel:Ljava/lang/Integer;

.field public state:Ljava/lang/String;

.field public storeName:Ljava/lang/String;

.field public streetAddress:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 376
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;
    .locals 2

    .line 404
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;

    if-eqz p1, :cond_0

    .line 405
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 376
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;
    .locals 1

    .line 400
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
