.class public Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;
.super Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;
.source "ProductSpotlightDetailsView.java"


# instance fields
.field private productModel:Lcom/ibotta/api/model/ProductModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 27
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private onProductSet()V
    .locals 1

    const/4 v0, 0x0

    .line 41
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;->setHasBonuses(Z)V

    .line 42
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;-><init>()V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;->setBadge(Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;)V

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;->setTerms(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public setProductModel(Lcom/ibotta/api/model/ProductModel;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;->productModel:Lcom/ibotta/api/model/ProductModel;

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ProductSpotlightDetailsView;->onProductSet()V

    return-void
.end method
