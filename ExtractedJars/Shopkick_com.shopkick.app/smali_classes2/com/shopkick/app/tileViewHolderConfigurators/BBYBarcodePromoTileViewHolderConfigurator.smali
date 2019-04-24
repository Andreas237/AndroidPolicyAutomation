.class public Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "BBYBarcodePromoTileViewHolderConfigurator.java"


# static fields
.field private static final BBY_PROMO_1X_DP_HEIGHT:I = 0x140

.field private static final BBY_PROMO_1X_DP_WIDTH:I = 0x140


# instance fields
.field private clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/url/URLDispatcher;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ")V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 37
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 38
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 39
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->screenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f090689

    .line 92
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    const v0, 0x7f09068d

    .line 93
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0029

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    const v0, 0x7f090689

    .line 85
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 86
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->shopkickAffiliateBarcodeImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const v0, 0x7f09068d

    .line 87
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 88
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->shopperIdBarcodeImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 53
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    if-nez p2, :cond_0

    return-void

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->clientFlags:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBBYBrightnessEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v0, :cond_1

    .line 61
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/controllers/WindowBrightnessController;->setScreenBrightnessToMaximum(Landroid/view/Window;)V

    .line 64
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 v1, 0x140

    invoke-static {v0, v1, v1}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    const v0, 0x7f090708

    .line 68
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f09068a

    .line 69
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->shopkickAffiliateBarcode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f090690

    .line 70
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->shopperIdBarcode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f090767

    .line 72
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 73
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 74
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/shopkick/app/widget/SKTypeface;->getDefaultTypeface(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const v0, 0x7f090689

    .line 77
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const v0, 0x7f09068d

    .line 78
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 81
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-direct {v0, v1, p2}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
