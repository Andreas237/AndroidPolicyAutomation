.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;
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
    name = "ClientFlagsListResponse"
.end annotation


# instance fields
.field public flags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 679
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;
    .locals 2

    .line 687
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;

    if-eqz p1, :cond_0

    .line 688
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 679
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;
    .locals 1

    .line 683
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 694
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlagsListResponse;->flags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ClientFlags;->postProcess()V

    :cond_0
    return-void
.end method
