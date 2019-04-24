.class public Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;
.super Ljava/lang/Object;
.source "OfferCategoryTab.java"

# interfaces
.implements Lcom/ibotta/android/view/common/TabSelectorView$TabOption;


# instance fields
.field private final offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/OfferCategoryModel;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferCategoryModel;->getShortName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferCategoryModel;->getShortName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferCategoryModel;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    return-object v0
.end method
