.class public Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ListItemWrapper.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

.field public productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

.field public tile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field public type:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;
    .locals 2

    .line 36
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;

    if-eqz p1, :cond_0

    .line 37
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;
    .locals 1

    .line 31
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->tile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->postProcess()V

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->postProcess()V

    .line 49
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->postProcess()V

    :cond_2
    return-void
.end method
