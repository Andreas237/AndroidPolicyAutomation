.class public Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;
.super Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;
.source "FeaturedBonusRow.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;


# instance fields
.field private module:Lcom/ibotta/api/model/base/Module;

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 23
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getModels()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    .line 42
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

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

    .line 43
    instance-of v3, v2, Lcom/ibotta/api/model/content/BonusContent;

    if-eqz v3, :cond_1

    .line 44
    check-cast v2, Lcom/ibotta/api/model/content/BonusContent;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public getModule()Lcom/ibotta/api/model/base/Module;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->module:Lcom/ibotta/api/model/base/Module;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public setModule(Lcom/ibotta/api/model/base/Module;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->module:Lcom/ibotta/api/model/base/Module;

    return-void
.end method
