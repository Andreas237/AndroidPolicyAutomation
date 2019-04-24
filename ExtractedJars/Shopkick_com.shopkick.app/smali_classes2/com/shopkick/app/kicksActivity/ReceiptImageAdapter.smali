.class public Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "ReceiptImageAdapter.java"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Receipt Image Adapter"


# instance fields
.field private imagePaths:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;",
            ">;"
        }
    .end annotation
.end field

.field private inflater:Landroid/view/LayoutInflater;

.field private parentLayout:Landroid/view/View;

.field private viewStack:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 37
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->viewStack:Ljava/util/Map;

    .line 39
    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->imagePaths:Ljava/util/List;

    .line 40
    iput-object p2, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->parentLayout:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 3

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->viewStack:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const v2, 0x7f09058b

    .line 48
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 49
    iget-object v2, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->parentLayout:Landroid/view/View;

    invoke-static {v2, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/view/View;Landroid/view/View;)V

    goto :goto_0

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->viewStack:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 106
    move-object v0, p3

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->viewStack:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p3, Landroid/view/View;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->imagePaths:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 5

    .line 68
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->viewStack:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->inflater:Landroid/view/LayoutInflater;

    const v2, 0x7f0c0165

    invoke-virtual {v0, v2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 73
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->viewStack:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :goto_0
    const v2, 0x7f090628

    .line 77
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    .line 78
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const v3, 0x7f09058b

    .line 80
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 81
    invoke-virtual {v3}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v4, :cond_1

    const/16 p2, 0x8

    .line 82
    invoke-virtual {v2, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_1

    .line 84
    :cond_1
    iget-object v4, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->imagePaths:Ljava/util/List;

    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;->imageUrl:Ljava/lang/String;

    .line 85
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 86
    new-instance v1, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter$1;

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter$1;-><init>(Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;Landroid/widget/ProgressBar;)V

    .line 97
    iget-object v2, p0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->parentLayout:Landroid/view/View;

    invoke-static {v2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/util/GlideRequest;->fitCenter()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 100
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 62
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
