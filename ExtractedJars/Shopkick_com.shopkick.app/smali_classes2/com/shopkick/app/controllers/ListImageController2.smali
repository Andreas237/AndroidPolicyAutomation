.class public Lcom/shopkick/app/controllers/ListImageController2;
.super Ljava/lang/Object;
.source "ListImageController2.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public flinging:Z

.field listView:Landroid/widget/AbsListView;

.field listener:Lcom/shopkick/app/controllers/IImageControllerCallback2;


# direct methods
.method public constructor <init>(Landroid/widget/AbsListView;Lcom/shopkick/app/controllers/IImageControllerCallback2;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->flinging:Z

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    .line 22
    iput-object p2, p0, Lcom/shopkick/app/controllers/ListImageController2;->listener:Lcom/shopkick/app/controllers/IImageControllerCallback2;

    .line 24
    invoke-virtual {p1, p0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    return-void
.end method

.method private fetchImagesInternal(IZ)V
    .locals 3

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    if-eqz v0, :cond_1

    if-ltz p1, :cond_1

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listener:Lcom/shopkick/app/controllers/IImageControllerCallback2;

    if-nez v0, :cond_0

    goto :goto_0

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    invoke-direct {p0, p1}, Lcom/shopkick/app/controllers/ListImageController2;->getChildPosition(I)I

    move-result v1

    invoke-direct {p0}, Lcom/shopkick/app/controllers/ListImageController2;->getHeadersCount()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 60
    iget-object v1, p0, Lcom/shopkick/app/controllers/ListImageController2;->listener:Lcom/shopkick/app/controllers/IImageControllerCallback2;

    invoke-interface {v1, p1, v0, p2}, Lcom/shopkick/app/controllers/IImageControllerCallback2;->loadImagesForPosition(ILandroid/view/View;Z)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private getChildPosition(I)I
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method private getFootersCount()I
    .locals 2

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    instance-of v1, v0, Landroid/widget/ListView;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFooterViewsCount()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getHeadersCount()I
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    instance-of v1, v0, Landroid/widget/ListView;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getHeaderViewsCount()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isDataPosition(I)Z
    .locals 3

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    instance-of v0, v0, Landroid/widget/ListView;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 39
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ListImageController2;->getHeadersCount()I

    move-result v0

    if-lt p1, v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getCount()I

    move-result v0

    invoke-direct {p0}, Lcom/shopkick/app/controllers/ListImageController2;->getHeadersCount()I

    move-result v2

    sub-int/2addr v0, v2

    .line 40
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ListImageController2;->getFootersCount()I

    move-result v2

    sub-int/2addr v0, v2

    if-ge p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public cancelAll()V
    .locals 2

    .line 70
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listener:Lcom/shopkick/app/controllers/IImageControllerCallback2;

    invoke-interface {v0}, Lcom/shopkick/app/controllers/IImageControllerCallback2;->cancelImageLoading()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :catch_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 76
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 77
    iput-object v1, p0, Lcom/shopkick/app/controllers/ListImageController2;->listView:Landroid/widget/AbsListView;

    .line 79
    :cond_0
    iput-object v1, p0, Lcom/shopkick/app/controllers/ListImageController2;->listener:Lcom/shopkick/app/controllers/IImageControllerCallback2;

    return-void
.end method

.method public fetchImages(I)V
    .locals 1

    .line 51
    iget-boolean v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->flinging:Z

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/controllers/ListImageController2;->fetchImagesInternal(IZ)V

    return-void
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 4

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->listener:Lcom/shopkick/app/controllers/IImageControllerCallback2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/4 p1, 0x1

    .line 113
    iput-boolean p1, p0, Lcom/shopkick/app/controllers/ListImageController2;->flinging:Z

    goto :goto_1

    .line 110
    :pswitch_1
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->flinging:Z

    goto :goto_1

    .line 97
    :pswitch_2
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/ListImageController2;->flinging:Z

    .line 99
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result p2

    .line 102
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getChildCount()I

    move-result p1

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_2

    add-int v2, p2, v1

    .line 104
    invoke-direct {p0, v2}, Lcom/shopkick/app/controllers/ListImageController2;->isDataPosition(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 105
    invoke-direct {p0, v2, v0}, Lcom/shopkick/app/controllers/ListImageController2;->fetchImagesInternal(IZ)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
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
