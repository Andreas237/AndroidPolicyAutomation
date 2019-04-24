.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;
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
    name = "BTLEPhoneHomeRequestV2"
.end annotation


# instance fields
.field public beaconDatas:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public latitude:Ljava/lang/Double;

.field public longitude:Ljava/lang/Double;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 158
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;
    .locals 2

    .line 168
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;

    if-eqz p1, :cond_0

    .line 169
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 158
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;
    .locals 1

    .line 164
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
