.class public Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "GetScansForLocationV2Response.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public chainId:Ljava/lang/String;

.field public chainName:Ljava/lang/String;

.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

.field public locationId:Ljava/lang/String;

.field public scanTiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;
    .locals 2

    .line 38
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;

    if-eqz p1, :cond_0

    .line 39
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetScansForLocationV2Response;->scanTiles:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->postProcess()V

    goto :goto_0

    :cond_1
    return-void
.end method
