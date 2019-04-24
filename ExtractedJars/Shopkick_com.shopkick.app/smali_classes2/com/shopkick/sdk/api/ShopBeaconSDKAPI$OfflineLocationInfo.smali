.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;
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
    name = "OfflineLocationInfo"
.end annotation


# instance fields
.field public chainId:Ljava/lang/Long;

.field public chainName:Ljava/lang/String;

.field public city:Ljava/lang/String;

.field public country:Ljava/lang/String;

.field public latitude:Ljava/lang/Double;

.field public locationId:Ljava/lang/Long;

.field public longitude:Ljava/lang/Double;

.field public postalCode:Ljava/lang/String;

.field public providerId:Ljava/lang/String;

.field public state:Ljava/lang/String;

.field public streetAddress:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1305
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;
    .locals 2

    .line 1323
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;

    if-eqz p1, :cond_0

    .line 1324
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 1305
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;
    .locals 1

    .line 1319
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineLocationInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
