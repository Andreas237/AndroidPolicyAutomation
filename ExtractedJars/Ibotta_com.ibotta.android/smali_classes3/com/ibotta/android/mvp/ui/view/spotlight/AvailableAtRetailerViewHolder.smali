.class public Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "AvailableAtRetailerViewHolder.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field public ivContentImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090284
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/images/ImageCache;Landroid/view/View;)V
    .locals 0
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 23
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 25
    invoke-static {p0, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 26
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->ivContentImage:Landroid/widget/ImageView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    return-void
.end method

.method private loadImageIntoView(Landroid/widget/ImageView;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 3

    .line 41
    invoke-virtual {p1}, Landroid/widget/ImageView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const p2, 0x7f0800aa

    .line 42
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 47
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 48
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getModelCImageUrl()Ljava/lang/String;

    move-result-object p2

    sget-object v2, Lcom/ibotta/android/views/images/Sizes;->MODEL_C_RETAILER_ROW:Lcom/ibotta/android/views/images/Sizes;

    .line 46
    invoke-interface {v0, v1, p2, p1, v2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method


# virtual methods
.method public initImageView(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->ivContentImage:Landroid/widget/ImageView;

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->loadImageIntoView(Landroid/widget/ImageView;Lcom/ibotta/api/model/RetailerModel;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->ivContentImage:Landroid/widget/ImageView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerLogoClickListener;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerLogoClickListener;-><init>(Ljava/lang/Integer;)V

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 33
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->ivContentImage:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 35
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->ivContentImage:Landroid/widget/ImageView;

    const/4 v0, 0x0

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_2

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_2
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 36
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerViewHolder;->ivContentImage:Landroid/widget/ImageView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    return-void
.end method
