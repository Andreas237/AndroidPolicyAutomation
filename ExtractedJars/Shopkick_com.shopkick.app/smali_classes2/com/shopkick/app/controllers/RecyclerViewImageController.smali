.class public Lcom/shopkick/app/controllers/RecyclerViewImageController;
.super Ljava/lang/Object;
.source "RecyclerViewImageController.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# static fields
.field private static final SCROLL_DISTANCE_THRESHOLD_TO_ALLOW_IMAGE_FETCHING:I = 0x14


# instance fields
.field private callbackWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;",
            ">;"
        }
    .end annotation
.end field

.field private density:F

.field private disableNetworkFetching:Z

.field private recyclerViewWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->disableNetworkFetching:Z

    .line 26
    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/controllers/RecyclerViewImageController;->register(Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    .line 28
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->density:F

    return-void
.end method

.method private fetchImagesInternal(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;

    .line 68
    :try_start_0
    invoke-interface {v0, p1, p2}, Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;->loadImagesForViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    .line 33
    iget-object v1, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    .line 34
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    if-eqz v1, :cond_0

    .line 36
    invoke-virtual {v1, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->removeModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 37
    iput-object v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    :cond_0
    return-void
.end method

.method public fetchImages(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 1

    .line 58
    iget-boolean v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->disableNetworkFetching:Z

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/controllers/RecyclerViewImageController;->fetchImagesInternal(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V

    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/4 p1, 0x1

    .line 112
    iput-boolean p1, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->disableNetworkFetching:Z

    goto :goto_1

    .line 109
    :pswitch_1
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->disableNetworkFetching:Z

    goto :goto_1

    .line 100
    :pswitch_2
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->disableNetworkFetching:Z

    move p2, v0

    .line 103
    :goto_0
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildCount()I

    move-result v1

    if-ge p2, v1, :cond_1

    .line 104
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 105
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildViewHolder(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/controllers/RecyclerViewImageController;->fetchImagesInternal(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    .line 86
    iget-boolean p1, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->disableNetworkFetching:Z

    if-eqz p1, :cond_0

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x41a00000    # 20.0f

    iget p3, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->density:F

    mul-float/2addr p3, p2

    cmpg-float p1, p1, p3

    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 87
    iput-boolean p1, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->disableNetworkFetching:Z

    :cond_0
    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;

    if-eqz v0, :cond_0

    .line 133
    :try_start_0
    invoke-interface {v0, p1}, Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;->cancelImageLoadingForViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public register(Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 1

    .line 52
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    .line 53
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    .line 54
    invoke-virtual {p2, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    return-void
.end method

.method public unregister()V
    .locals 2

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    .line 44
    iget-object v1, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    if-eqz v1, :cond_0

    .line 46
    invoke-virtual {v1, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->removeModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 47
    iput-object v0, p0, Lcom/shopkick/app/controllers/RecyclerViewImageController;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    :cond_0
    return-void
.end method
