.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;
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
    name = "NearbyZonesRequestV4"
.end annotation


# instance fields
.field public latitude:Ljava/lang/Double;

.field public longitude:Ljava/lang/Double;

.field public zoneQuery:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1107
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;
    .locals 2

    .line 1117
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;

    if-eqz p1, :cond_0

    .line 1118
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 1107
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;
    .locals 1

    .line 1113
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$NearbyZonesRequestV4;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
