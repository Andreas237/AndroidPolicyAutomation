.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;
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
    name = "RawBeaconData"
.end annotation


# instance fields
.field public beaconData:Ljava/lang/String;

.field public signalStrength:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1334
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;
    .locals 2

    .line 1343
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;

    if-eqz p1, :cond_0

    .line 1344
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 1334
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;
    .locals 1

    .line 1339
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$RawBeaconData;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
