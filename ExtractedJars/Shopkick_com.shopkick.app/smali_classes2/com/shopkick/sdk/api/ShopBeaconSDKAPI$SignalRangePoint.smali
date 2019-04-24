.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;
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
    name = "SignalRangePoint"
.end annotation


# instance fields
.field public distance:Ljava/lang/Double;

.field public proximityLevel:Ljava/lang/Integer;

.field public signalStrength:Ljava/lang/Double;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1454
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;
    .locals 2

    .line 1464
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;

    if-eqz p1, :cond_0

    .line 1465
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 1454
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;
    .locals 1

    .line 1460
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
