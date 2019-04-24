.class public Lcom/ibotta/android/view/offer/category/OfferCategory;
.super Ljava/lang/Object;
.source "OfferCategory.java"


# static fields
.field public static ALL:Lcom/ibotta/android/view/offer/category/OfferCategory;

.field public static WHATS_HOT:Lcom/ibotta/android/view/offer/category/OfferCategory;

.field public static WHATS_NEW:Lcom/ibotta/android/view/offer/category/OfferCategory;

.field public static YOU_MIGHT_LIKE:Lcom/ibotta/android/view/offer/category/OfferCategory;


# instance fields
.field private categoryIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private defaultViewState:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private sortData:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 21
    new-instance v0, Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-direct {v0}, Lcom/ibotta/android/view/offer/category/OfferCategory;-><init>()V

    sput-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->ALL:Lcom/ibotta/android/view/offer/category/OfferCategory;

    .line 22
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->ALL:Lcom/ibotta/android/view/offer/category/OfferCategory;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setCategoryId(I)V

    .line 23
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->ALL:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const v2, 0x7f110139

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setName(Ljava/lang/String;)V

    .line 24
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->ALL:Lcom/ibotta/android/view/offer/category/OfferCategory;

    const-string v1, "aaaaaaaaaa"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setSortData(Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-direct {v0}, Lcom/ibotta/android/view/offer/category/OfferCategory;-><init>()V

    sput-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->YOU_MIGHT_LIKE:Lcom/ibotta/android/view/offer/category/OfferCategory;

    .line 27
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->YOU_MIGHT_LIKE:Lcom/ibotta/android/view/offer/category/OfferCategory;

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setCategoryId(I)V

    .line 28
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->YOU_MIGHT_LIKE:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const v2, 0x7f11016f

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setName(Ljava/lang/String;)V

    .line 29
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->YOU_MIGHT_LIKE:Lcom/ibotta/android/view/offer/category/OfferCategory;

    const-string v1, "aaaaaaaaab"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setSortData(Ljava/lang/String;)V

    .line 30
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->YOU_MIGHT_LIKE:Lcom/ibotta/android/view/offer/category/OfferCategory;

    sget-object v1, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->PREVIEW:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setDefaultViewState(Ljava/lang/String;)V

    .line 32
    new-instance v0, Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-direct {v0}, Lcom/ibotta/android/view/offer/category/OfferCategory;-><init>()V

    sput-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_HOT:Lcom/ibotta/android/view/offer/category/OfferCategory;

    .line 33
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_HOT:Lcom/ibotta/android/view/offer/category/OfferCategory;

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setCategoryId(I)V

    .line 34
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_HOT:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const v2, 0x7f110193

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setName(Ljava/lang/String;)V

    .line 35
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_HOT:Lcom/ibotta/android/view/offer/category/OfferCategory;

    const-string v1, "aaaaaaaaac"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setSortData(Ljava/lang/String;)V

    .line 36
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_HOT:Lcom/ibotta/android/view/offer/category/OfferCategory;

    sget-object v1, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->PREVIEW:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setDefaultViewState(Ljava/lang/String;)V

    .line 38
    new-instance v0, Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-direct {v0}, Lcom/ibotta/android/view/offer/category/OfferCategory;-><init>()V

    sput-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_NEW:Lcom/ibotta/android/view/offer/category/OfferCategory;

    .line 39
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_NEW:Lcom/ibotta/android/view/offer/category/OfferCategory;

    const/4 v1, -0x4

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setCategoryId(I)V

    .line 40
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_NEW:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const v2, 0x7f1101b7

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setName(Ljava/lang/String;)V

    .line 41
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_NEW:Lcom/ibotta/android/view/offer/category/OfferCategory;

    const-string v1, "aaaaaaaaad"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setSortData(Ljava/lang/String;)V

    .line 42
    sget-object v0, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_NEW:Lcom/ibotta/android/view/offer/category/OfferCategory;

    sget-object v1, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->PREVIEW:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setDefaultViewState(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->categoryIds:Ljava/util/Set;

    return-void
.end method

.method public static fromCategory(Lcom/ibotta/api/model/offer/Category;)Lcom/ibotta/android/view/offer/category/OfferCategory;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 111
    :cond_0
    new-instance v0, Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-direct {v0}, Lcom/ibotta/android/view/offer/category/OfferCategory;-><init>()V

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Category;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setCategoryId(I)V

    .line 113
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Category;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setName(Ljava/lang/String;)V

    .line 114
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Category;->getSortData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setSortData(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Category;->getDefaultViewState()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->setDefaultViewState(Ljava/lang/String;)V

    return-object v0
.end method

.method public static toCategory(Lcom/ibotta/android/view/offer/category/OfferCategory;)Lcom/ibotta/api/model/offer/Category;
    .locals 2

    .line 121
    new-instance v0, Lcom/ibotta/api/model/offer/Category;

    invoke-direct {v0}, Lcom/ibotta/api/model/offer/Category;-><init>()V

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/Category;->setId(I)V

    .line 124
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/Category;->setName(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getSortData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/Category;->setSortData(Ljava/lang/String;)V

    .line 126
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getDefaultViewState()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/api/model/offer/Category;->setDefaultViewState(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getCategoryId()I
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->categoryIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->categoryIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public getDefaultViewState()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->defaultViewState:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getCategoryId()I

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSortData()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->sortData:Ljava/lang/String;

    return-object v0
.end method

.method public isAll()Z
    .locals 2

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v0

    sget-object v1, Lcom/ibotta/android/view/offer/category/OfferCategory;->ALL:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-virtual {v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isWhatsHot()Z
    .locals 2

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v0

    sget-object v1, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_HOT:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-virtual {v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isWhatsNew()Z
    .locals 2

    .line 99
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v0

    sget-object v1, Lcom/ibotta/android/view/offer/category/OfferCategory;->WHATS_NEW:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-virtual {v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isYouMightLike()Z
    .locals 2

    .line 103
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v0

    sget-object v1, Lcom/ibotta/android/view/offer/category/OfferCategory;->YOU_MIGHT_LIKE:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-virtual {v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setCategoryId(I)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->categoryIds:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setDefaultViewState(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->defaultViewState:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->name:Ljava/lang/String;

    return-void
.end method

.method public setSortData(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/ibotta/android/view/offer/category/OfferCategory;->sortData:Ljava/lang/String;

    return-void
.end method
