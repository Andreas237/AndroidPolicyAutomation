.class public Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "KicksActivityReceiptDetailsReceiptImagesViewConfigurator.java"


# static fields
.field private static final CORNER_RADIUS_DIP:I = 0xa

.field private static final IMAGE_SIZE_DIP:I = 0x46

.field private static final LOG_TAG:Ljava/lang/String; = "RECEIPT IMAGES"


# instance fields
.field private activityWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/KicksActivity;",
            ">;"
        }
    .end annotation
.end field

.field private fragmentWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;",
            ">;"
        }
    .end annotation
.end field

.field private receipts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/activities/KicksActivity;Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 36
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;->activityWeakReference:Ljava/lang/ref/WeakReference;

    .line 37
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;->fragmentWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 4

    const v0, 0x7f09058a

    .line 90
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    .line 91
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;->receipts:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 92
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 93
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v3}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/shopkick/app/util/GlideRequests;->clear(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00f3

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 9

    if-nez p2, :cond_0

    return-void

    :cond_0
    const p2, 0x7f09058a

    .line 77
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    const/16 v0, 0x46

    .line 78
    invoke-static {v0, p2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v0

    const/16 v1, 0xa

    .line 79
    invoke-static {v1, p2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    .line 80
    :goto_0
    iget-object v4, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;->receipts:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 81
    invoke-virtual {p2, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 82
    iget-object v5, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;->receipts:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;->thumbnailUrl:Ljava/lang/String;

    .line 84
    iget-object v6, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v6}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v6

    invoke-virtual {v6}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    invoke-virtual {v5, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/shopkick/app/util/GlideRequest;->override(I)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    const/4 v6, 0x2

    new-array v6, v6, [Lcom/bumptech/glide/load/Transformation;

    new-instance v7, Lcom/bumptech/glide/load/resource/bitmap/FitCenter;

    invoke-direct {v7}, Lcom/bumptech/glide/load/resource/bitmap/FitCenter;-><init>()V

    aput-object v7, v6, v2

    new-instance v7, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v7, v1}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    const/4 v8, 0x1

    aput-object v7, v6, v8

    invoke-virtual {v5, v6}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    .line 47
    iget-object p2, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/activities/KicksActivity;

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;->fragmentWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;

    if-eqz p2, :cond_3

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const v1, 0x7f09058a

    .line 52
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090589

    .line 53
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const/16 v3, 0x8

    .line 55
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 57
    invoke-virtual {p2}, Lcom/shopkick/app/activities/KicksActivity;->getReceiptImageItems()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;->receipts:Ljava/util/List;

    const/4 p2, 0x0

    move-object v3, p1

    move p1, p2

    .line 58
    :goto_0
    iget-object v4, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;->receipts:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge p1, v4, :cond_2

    if-lez p1, :cond_1

    .line 60
    new-instance v3, Landroid/widget/ImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 61
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 63
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    const v4, 0x7f080194

    .line 64
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 66
    :cond_1
    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 67
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_1
    return-void
.end method
