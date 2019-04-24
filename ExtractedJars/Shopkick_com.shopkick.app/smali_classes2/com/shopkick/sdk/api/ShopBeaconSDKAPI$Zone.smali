.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;
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
    name = "Zone"
.end annotation


# instance fields
.field public attributes:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public detectionDevices:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$DetectionDevice;",
            ">;"
        }
    .end annotation
.end field

.field public parentZoneId:Ljava/lang/String;

.field public type:Ljava/lang/String;

.field public zoneId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1507
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;
    .locals 2

    .line 1519
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;

    if-eqz p1, :cond_0

    .line 1520
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 1507
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;
    .locals 1

    .line 1515
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 1527
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Zone;->detectionDevices:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$DetectionDevice;

    invoke-virtual {v1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$DetectionDevice;->postProcess()V

    goto :goto_0

    :cond_0
    return-void
.end method
