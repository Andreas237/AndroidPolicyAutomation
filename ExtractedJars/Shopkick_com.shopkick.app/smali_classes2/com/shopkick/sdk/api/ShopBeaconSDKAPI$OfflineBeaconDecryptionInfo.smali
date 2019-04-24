.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;
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
    name = "OfflineBeaconDecryptionInfo"
.end annotation


# instance fields
.field public beaconDecryptionInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDecryptionInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1191
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;
    .locals 2

    .line 1199
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;

    if-eqz p1, :cond_0

    .line 1200
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 1191
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;
    .locals 1

    .line 1195
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 1207
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$OfflineBeaconDecryptionInfo;->beaconDecryptionInfos:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDecryptionInfo;

    invoke-virtual {v1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDecryptionInfo;->postProcess()V

    goto :goto_0

    :cond_0
    return-void
.end method
