.class public Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;
.super Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;
.source "ContentSpotlightDetailsView.java"


# instance fields
.field private contentModel:Lcom/ibotta/api/model/ContentModel;

.field private retailerModel:Lcom/ibotta/api/model/ContentModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 33
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private getDetails(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;
    .locals 4

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->retailerModel:Lcom/ibotta/api/model/ContentModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ContentModel;->getName()Ljava/lang/String;

    move-result-object v0

    .line 58
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result p1

    invoke-interface {v1, p1}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object p1

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p1, v2, v0

    const p1, 0x7f1104ec

    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private onContentSet()V
    .locals 3

    .line 43
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->contentModel:Lcom/ibotta/api/model/ContentModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->contentModel:Lcom/ibotta/api/model/ContentModel;

    check-cast v0, Lcom/ibotta/api/model/BuyableGiftCardModel;

    const/4 v1, 0x0

    .line 46
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->setHasBonuses(Z)V

    .line 47
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;-><init>()V

    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->setBadge(Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;)V

    .line 48
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->getDetails(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->setTerms(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->setCheckProductVisible(Z)V

    return-void

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Content Type is not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->contentModel:Lcom/ibotta/api/model/ContentModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/ContentModel;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public setContentModel(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->contentModel:Lcom/ibotta/api/model/ContentModel;

    .line 38
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->retailerModel:Lcom/ibotta/api/model/ContentModel;

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/ContentSpotlightDetailsView;->onContentSet()V

    return-void
.end method
