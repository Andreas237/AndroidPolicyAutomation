.class public Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;
.super Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;
.source "BannersRow.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;


# instance fields
.field private isSorted:Z

.field private module:Lcom/ibotta/api/model/base/Module;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->BANNERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;)V

    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->isSorted:Z

    return-void
.end method

.method static synthetic lambda$getModels$0(Lcom/ibotta/api/model/FeatureModel;Lcom/ibotta/api/model/FeatureModel;)I
    .locals 0

    .line 51
    invoke-interface {p0}, Lcom/ibotta/api/model/FeatureModel;->getSortOrder()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, Lcom/ibotta/api/model/FeatureModel;->getSortOrder()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public getModels()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/base/BaseContent;

    .line 41
    instance-of v3, v2, Lcom/ibotta/api/model/FeatureModel;

    if-eqz v3, :cond_1

    .line 42
    check-cast v2, Lcom/ibotta/api/model/FeatureModel;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    iget-boolean v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->isSorted:Z

    if-eqz v3, :cond_2

    invoke-interface {v2}, Lcom/ibotta/api/model/FeatureModel;->getSortOrder()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    iput-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->isSorted:Z

    goto :goto_0

    .line 50
    :cond_3
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->isSorted:Z

    if-eqz v1, :cond_4

    .line 51
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/row/-$$Lambda$BannersRow$zqrvD2315kmhuf_RMw3BjCfp2Eo;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/featured/row/-$$Lambda$BannersRow$zqrvD2315kmhuf_RMw3BjCfp2Eo;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_2

    .line 53
    :cond_4
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    :goto_2
    return-object v0
.end method

.method public getModule()Lcom/ibotta/api/model/base/Module;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->module:Lcom/ibotta/api/model/base/Module;

    return-object v0
.end method

.method public setModule(Lcom/ibotta/api/model/base/Module;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->module:Lcom/ibotta/api/model/base/Module;

    return-void
.end method
