.class public Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;
.super Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;
.source "FavoriteRetailerRow.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;


# instance fields
.field private module:Lcom/ibotta/api/model/module/RetailerModule;

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 22
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;)V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getModels()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->getModule()Lcom/ibotta/api/model/module/RetailerModule;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->getModule()Lcom/ibotta/api/model/module/RetailerModule;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/module/RetailerModule;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/base/BaseContent;

    .line 42
    instance-of v3, v2, Lcom/ibotta/api/model/OfferModel;

    if-eqz v3, :cond_1

    .line 43
    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public bridge synthetic getModule()Lcom/ibotta/api/model/base/Module;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->getModule()Lcom/ibotta/api/model/module/RetailerModule;

    move-result-object v0

    return-object v0
.end method

.method public getModule()Lcom/ibotta/api/model/module/RetailerModule;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->module:Lcom/ibotta/api/model/module/RetailerModule;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public setModule(Lcom/ibotta/api/model/module/RetailerModule;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->module:Lcom/ibotta/api/model/module/RetailerModule;

    return-void
.end method
