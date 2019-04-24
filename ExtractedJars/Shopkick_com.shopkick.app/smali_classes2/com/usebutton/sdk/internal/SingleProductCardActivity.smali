.class public Lcom/usebutton/sdk/internal/SingleProductCardActivity;
.super Lcom/usebutton/sdk/internal/BaseCardActivity;
.source "SingleProductCardActivity.java"


# static fields
.field public static final EXTRA_PRODUCT:Ljava/lang/String; = "product"


# instance fields
.field private mCarousel:Landroid/support/v4/view/ViewPager;

.field private mFooter:Lcom/usebutton/sdk/internal/models/Footer;

.field private mImageAdapter:Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;

.field final mOnClickListener:Lcom/usebutton/sdk/internal/util/Receiver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;"
        }
    .end annotation
.end field

.field private mProduct:Lcom/usebutton/sdk/internal/models/Product;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;-><init>()V

    .line 81
    new-instance v0, Lcom/usebutton/sdk/internal/SingleProductCardActivity$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity$1;-><init>(Lcom/usebutton/sdk/internal/SingleProductCardActivity;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mOnClickListener:Lcom/usebutton/sdk/internal/util/Receiver;

    return-void
.end method

.method private bindFooter()V
    .locals 3

    .line 77
    sget v0, Lcom/usebutton/sdk/R$id;->promo_footer:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;

    .line 78
    iget-object v1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mOnClickListener:Lcom/usebutton/sdk/internal/util/Receiver;

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setFooter(Lcom/usebutton/sdk/internal/models/Footer;Lcom/usebutton/sdk/internal/util/Receiver;)V

    return-void
.end method

.method public static intentForPromotion(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Product;Lcom/usebutton/sdk/internal/models/Footer;)Landroid/content/Intent;
    .locals 2

    .line 35
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/usebutton/sdk/internal/SingleProductCardActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "meta_info"

    .line 36
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "product"

    .line 37
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "footer"

    .line 38
    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method public bind(Lcom/usebutton/sdk/internal/models/MetaInfo;)V
    .locals 3

    .line 62
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "product"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Product;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    .line 63
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "footer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Footer;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    .line 65
    sget p1, Lcom/usebutton/sdk/R$id;->promo_carousel:I

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v4/view/ViewPager;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mCarousel:Landroid/support/v4/view/ViewPager;

    .line 66
    new-instance p1, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getImageLoader()Lcom/usebutton/sdk/internal/ImageLoader;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Product;->getImages()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Product;->shouldPadImages()Z

    move-result v2

    invoke-direct {p1, v0, v1, v2}, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;-><init>(Lcom/usebutton/sdk/internal/ImageLoader;Ljava/util/List;Z)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mImageAdapter:Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;

    .line 67
    iget-object p1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mCarousel:Landroid/support/v4/view/ViewPager;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mImageAdapter:Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 69
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->bindFooter()V

    .line 70
    sget p1, Lcom/usebutton/sdk/R$id;->promo_product_title:I

    iget-object v0, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Product;->getTitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->setText(ILcom/usebutton/sdk/internal/models/Text;)V

    .line 71
    sget p1, Lcom/usebutton/sdk/R$id;->promo_product_subtitle:I

    iget-object v0, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Product;->getSubtitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->setText(ILcom/usebutton/sdk/internal/models/Text;)V

    .line 72
    sget p1, Lcom/usebutton/sdk/R$id;->promo_product_description:I

    iget-object v0, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Product;->getDescription()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->setText(ILcom/usebutton/sdk/internal/models/Text;)V

    .line 73
    sget p1, Lcom/usebutton/sdk/R$id;->promo_page_indicator:I

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/views/PagerIndicator;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mCarousel:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->setPager(Landroid/support/v4/view/ViewPager;)V

    return-void
.end method

.method public collectAssets()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;"
        }
    .end annotation

    .line 93
    invoke-super {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->collectAssets()Ljava/util/List;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Footer;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/Arrays;->addIfNotNull(Ljava/util/List;Ljava/lang/Object;)V

    return-object v0
.end method

.method protected getCardDismissedEvent()Ljava/lang/String;
    .locals 1

    const-string v0, "btn:inventory-preview-card-dismissed"

    return-object v0
.end method

.method protected getCardSpecificEventProperties()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 105
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getCardViewedEvent()Ljava/lang/String;
    .locals 1

    const-string v0, "btn:inventory-preview-card-displayed"

    return-object v0
.end method

.method public getContentLayoutId()I
    .locals 1

    .line 57
    sget v0, Lcom/usebutton/sdk/R$layout;->btn_promotion_card_product:I

    return v0
.end method

.method public onAssetsReady()V
    .locals 0

    .line 100
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->bindFooter()V

    return-void
.end method

.method protected onStart()V
    .locals 4

    .line 44
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->mDidTrackViewed:Z

    if-nez v0, :cond_0

    const-string v0, "Product Card presented: (Action ID: %s)"

    const/4 v1, 0x1

    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->getPromotionId()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    :cond_0
    invoke-super {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->onStart()V

    return-void
.end method

.method public shouldBindAndShowContent(Lcom/usebutton/sdk/internal/models/MetaInfo;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
