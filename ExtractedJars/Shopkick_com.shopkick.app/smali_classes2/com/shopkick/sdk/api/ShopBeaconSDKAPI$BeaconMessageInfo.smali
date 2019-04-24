.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;
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
    name = "BeaconMessageInfo"
.end annotation


# instance fields
.field public chainId:Ljava/lang/Long;

.field public deptId:Ljava/lang/Long;

.field public endTime:Ljava/lang/Long;

.field public logoImageUrl:Ljava/lang/String;

.field public notificationText:Ljava/lang/String;

.field public notificationTitle:Ljava/lang/String;

.field public notificationUrl:Ljava/lang/String;

.field public overlayImageUrl:Ljava/lang/String;

.field public overlayText:Ljava/lang/String;

.field public startTime:Ljava/lang/Long;

.field public validProximityLevels:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 437
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;
    .locals 2

    .line 455
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;

    if-eqz p1, :cond_0

    .line 456
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 437
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;
    .locals 1

    .line 451
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconMessageInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
