.class public Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "OfflineDataEntity.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public btleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfflineBTLEInfo;

.field public chainInfo:Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

.field public dataCategory:Ljava/lang/Integer;

.field public entityKey:Ljava/lang/String;

.field public entityVersion:Ljava/lang/String;

.field public rewardInfo:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

.field public scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

.field public shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

.field public ultrasonicInfo:Lcom/shopkick/app/fetchers/api/skapi/OfflineUltrasonicInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;
    .locals 2

    .line 41
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    if-eqz p1, :cond_0

    .line 42
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->btleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfflineBTLEInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/OfflineBTLEInfo;->postProcess()V

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->rewardInfo:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->postProcess()V

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->chainInfo:Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->postProcess()V

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->ultrasonicInfo:Lcom/shopkick/app/fetchers/api/skapi/OfflineUltrasonicInfo;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/OfflineUltrasonicInfo;->postProcess()V

    .line 56
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->postProcess()V

    .line 57
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->postProcess()V

    :cond_5
    return-void
.end method
