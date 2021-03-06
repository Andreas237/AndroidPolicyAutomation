.class public Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "GetPopularItemsListResponse.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

.field public popularItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;"
        }
    .end annotation
.end field

.field public taxonomyNodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;",
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

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;
    .locals 2

    .line 36
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;

    if-eqz p1, :cond_0

    .line 37
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->postProcess()V
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

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;
    .locals 1

    .line 31
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->popularItems:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->postProcess()V

    goto :goto_0

    .line 51
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->taxonomyNodes:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->postProcess()V

    goto :goto_1

    :cond_2
    return-void
.end method
