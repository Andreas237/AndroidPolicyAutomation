.class public Lcom/shopkick/app/view/SKListView;
.super Landroid/widget/ListView;
.source "SKListView.java"

# interfaces
.implements Lcom/shopkick/app/logging/IUserEventListView;
.implements Landroid/widget/AbsListView$OnScrollListener;
.implements Landroid/widget/AbsListView$RecyclerListener;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private currEndIndex:I

.field private currStartIndex:I

.field private didInitModules:Z

.field private disableActiveViewMarking:Z

.field private displayPositionWithinParent:Ljava/lang/Integer;

.field private inFling:Z

.field private loadingFooter:Landroid/view/View;

.field private loadingFooterShowing:Z

.field private modules:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/view/ISKListViewModule;",
            ">;"
        }
    .end annotation
.end field

.field private onScrollListener:Landroid/widget/AbsListView$OnScrollListener;

.field private recyclerListener:Landroid/widget/AbsListView$RecyclerListener;

.field private reloadFooter:Landroid/view/View;

.field private reloadFooterShowing:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/view/SKListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/view/SKListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p1, 0x7fffffff

    .line 33
    iput p1, p0, Lcom/shopkick/app/view/SKListView;->currStartIndex:I

    const/high16 p1, -0x80000000

    .line 34
    iput p1, p0, Lcom/shopkick/app/view/SKListView;->currEndIndex:I

    .line 50
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/view/SKListView;->modules:Ljava/util/ArrayList;

    return-void
.end method

.method private markActiveViews(II)V
    .locals 8

    .line 171
    iget-boolean v0, p0, Lcom/shopkick/app/view/SKListView;->disableActiveViewMarking:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const v0, 0x7fffffff

    const/high16 v1, -0x80000000

    .line 178
    iget v2, p0, Lcom/shopkick/app/view/SKListView;->currStartIndex:I

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 179
    iget v3, p0, Lcom/shopkick/app/view/SKListView;->currEndIndex:I

    add-int/2addr p1, p2

    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    :goto_0
    if-ge v2, p1, :cond_7

    .line 181
    invoke-virtual {p0, v2}, Lcom/shopkick/app/view/SKListView;->getChildAtDataIndex(I)Landroid/view/View;

    move-result-object p2

    if-nez p2, :cond_1

    .line 184
    invoke-direct {p0, p2, v2}, Lcom/shopkick/app/view/SKListView;->tryToMarkItemInactive(Landroid/view/View;I)V

    goto :goto_2

    .line 190
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v3

    .line 191
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int v5, v3, v4

    .line 193
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKListView;->getHeight()I

    move-result v6

    if-ge v3, v6, :cond_5

    if-gez v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    .line 200
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 201
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v5, v3

    int-to-float v3, v5

    .line 202
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    const v4, 0x3f333333    # 0.7f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_3

    .line 205
    invoke-direct {p0, p2, v2}, Lcom/shopkick/app/view/SKListView;->tryToMarkItemInactive(Landroid/view/View;I)V

    goto :goto_2

    .line 209
    :cond_3
    invoke-direct {p0, p2, v2}, Lcom/shopkick/app/view/SKListView;->tryToMarkItemActive(Landroid/view/View;I)V

    if-le v0, v2, :cond_4

    move v0, v2

    :cond_4
    add-int/lit8 p2, v2, 0x1

    if-ge v1, p2, :cond_6

    move v1, p2

    goto :goto_2

    .line 196
    :cond_5
    :goto_1
    invoke-direct {p0, p2, v2}, Lcom/shopkick/app/view/SKListView;->tryToMarkItemInactive(Landroid/view/View;I)V

    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 220
    :cond_7
    iput v0, p0, Lcom/shopkick/app/view/SKListView;->currStartIndex:I

    .line 221
    iput v1, p0, Lcom/shopkick/app/view/SKListView;->currEndIndex:I

    return-void
.end method

.method private tryToMarkItemActive(Landroid/view/View;I)V
    .locals 2

    .line 225
    iget v0, p0, Lcom/shopkick/app/view/SKListView;->currStartIndex:I

    if-lt p2, v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/view/SKListView;->currEndIndex:I

    if-lt p2, v0, :cond_1

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->modules:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/ISKListViewModule;

    .line 227
    invoke-interface {v1, p0, p1, p2}, Lcom/shopkick/app/view/ISKListViewModule;->onItemActive(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private tryToMarkItemInactive(Landroid/view/View;I)V
    .locals 2

    .line 233
    iget v0, p0, Lcom/shopkick/app/view/SKListView;->currStartIndex:I

    if-lt p2, v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/view/SKListView;->currEndIndex:I

    if-ge p2, v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->modules:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/ISKListViewModule;

    .line 235
    invoke-interface {v1, p0, p1, p2}, Lcom/shopkick/app/view/ISKListViewModule;->onItemInactive(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public addModule(Lcom/shopkick/app/view/ISKListViewModule;)V
    .locals 1

    .line 82
    invoke-interface {p1, p0}, Lcom/shopkick/app/view/ISKListViewModule;->onAttach(Lcom/shopkick/app/logging/IUserEventListView;)V

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->modules:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    iget-boolean p1, p0, Lcom/shopkick/app/view/SKListView;->didInitModules:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 85
    iput-boolean p1, p0, Lcom/shopkick/app/view/SKListView;->didInitModules:Z

    .line 86
    invoke-super {p0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 87
    invoke-super {p0, p0}, Landroid/widget/ListView;->setRecyclerListener(Landroid/widget/AbsListView$RecyclerListener;)V

    :cond_0
    return-void
.end method

.method public clearAllModules()V
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->modules:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public getChildAtDataIndex(I)Landroid/view/View;
    .locals 1

    .line 58
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKListView;->getFirstVisiblePosition()I

    move-result v0

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKListView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getDirection()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getDisplayPositionWithinParent()Ljava/lang/Integer;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->displayPositionWithinParent:Ljava/lang/Integer;

    return-object v0
.end method

.method public hideLoadingFooter()V
    .locals 2

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->loadingFooter:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/shopkick/app/view/SKListView;->loadingFooterShowing:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 294
    iput-boolean v1, p0, Lcom/shopkick/app/view/SKListView;->loadingFooterShowing:Z

    const v1, 0x7f090433

    .line 295
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public hideReloadFooter()V
    .locals 3

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooter:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/shopkick/app/view/SKListView;->reloadFooterShowing:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 309
    iput-boolean v1, p0, Lcom/shopkick/app/view/SKListView;->reloadFooterShowing:Z

    const v1, 0x7f090255

    .line 310
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 311
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooter:Landroid/view/View;

    const v2, 0x7f0905a8

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public isIndexActive(I)Z
    .locals 1

    .line 167
    iget-boolean v0, p0, Lcom/shopkick/app/view/SKListView;->disableActiveViewMarking:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/view/SKListView;->inFling:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/view/SKListView;->currStartIndex:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/view/SKListView;->currEndIndex:I

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isShowingReloadFooter()Z
    .locals 1

    .line 316
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooter:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooterShowing:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onMovedToScrapHeap(Landroid/view/View;)V
    .locals 2

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->modules:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/ISKListViewModule;

    .line 250
    invoke-interface {v1, p0, p1}, Lcom/shopkick/app/view/ISKListViewModule;->onMovedToScrapHeap(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;)V

    goto :goto_0

    .line 252
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->recyclerListener:Landroid/widget/AbsListView$RecyclerListener;

    if-eqz v0, :cond_1

    .line 253
    invoke-interface {v0, p1}, Landroid/widget/AbsListView$RecyclerListener;->onMovedToScrapHeap(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .line 110
    iget-boolean p1, p0, Lcom/shopkick/app/view/SKListView;->inFling:Z

    if-nez p1, :cond_0

    .line 111
    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/view/SKListView;->markActiveViews(II)V

    .line 113
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/view/SKListView;->modules:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/ISKListViewModule;

    .line 114
    invoke-interface {v0, p0, p2, p3, p4}, Lcom/shopkick/app/view/ISKListViewModule;->onScroll(Lcom/shopkick/app/logging/IUserEventListView;III)V

    goto :goto_0

    .line 116
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/view/SKListView;->onScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz p1, :cond_2

    .line 117
    invoke-interface {p1, p0, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    :cond_2
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x1

    .line 134
    iput-boolean p1, p0, Lcom/shopkick/app/view/SKListView;->inFling:Z

    goto :goto_0

    .line 127
    :pswitch_1
    iget-boolean p1, p0, Lcom/shopkick/app/view/SKListView;->inFling:Z

    if-eqz p1, :cond_0

    .line 128
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKListView;->getFirstVisiblePosition()I

    move-result p1

    invoke-virtual {p0}, Lcom/shopkick/app/view/SKListView;->getChildCount()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/view/SKListView;->markActiveViews(II)V

    const/4 p1, 0x0

    .line 129
    iput-boolean p1, p0, Lcom/shopkick/app/view/SKListView;->inFling:Z

    .line 137
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/view/SKListView;->modules:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/ISKListViewModule;

    .line 138
    invoke-interface {v0, p0, p2}, Lcom/shopkick/app/view/ISKListViewModule;->onScrollStateChanged(Lcom/shopkick/app/logging/IUserEventListView;I)V

    goto :goto_1

    .line 140
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/view/SKListView;->onScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz p1, :cond_2

    .line 141
    invoke-interface {p1, p0, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public removeModule(Lcom/shopkick/app/view/ISKListViewModule;)V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->modules:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public resetActiveViewMarking()V
    .locals 1

    const v0, 0x7fffffff

    .line 161
    iput v0, p0, Lcom/shopkick/app/view/SKListView;->currStartIndex:I

    const/high16 v0, -0x80000000

    .line 162
    iput v0, p0, Lcom/shopkick/app/view/SKListView;->currEndIndex:I

    return-void
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 24
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 5

    .line 259
    instance-of v0, p1, Lcom/shopkick/app/view/PagingListAdapter;

    if-eqz v0, :cond_2

    .line 266
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKListView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 267
    iget-object v1, p0, Lcom/shopkick/app/view/SKListView;->loadingFooter:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v1, :cond_0

    const v1, 0x7f0c010d

    .line 268
    invoke-virtual {v0, v1, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/view/SKListView;->loadingFooter:Landroid/view/View;

    .line 269
    iget-object v1, p0, Lcom/shopkick/app/view/SKListView;->loadingFooter:Landroid/view/View;

    invoke-virtual {p0, v1, v2, v4}, Lcom/shopkick/app/view/SKListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 270
    iput-boolean v4, p0, Lcom/shopkick/app/view/SKListView;->loadingFooterShowing:Z

    .line 273
    :cond_0
    instance-of v1, p1, Lcom/shopkick/app/view/PagingReloadAdapter;

    if-eqz v1, :cond_1

    .line 274
    iget-object v1, p0, Lcom/shopkick/app/view/SKListView;->reloadFooter:Landroid/view/View;

    if-nez v1, :cond_1

    const v1, 0x7f0c0180

    .line 275
    invoke-virtual {v0, v1, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooter:Landroid/view/View;

    .line 276
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooter:Landroid/view/View;

    invoke-virtual {p0, v0, v2, v4}, Lcom/shopkick/app/view/SKListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 277
    iput-boolean v4, p0, Lcom/shopkick/app/view/SKListView;->reloadFooterShowing:Z

    .line 278
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooter:Landroid/view/View;

    const v1, 0x7f0905a8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lcom/shopkick/app/view/PagingReloadAdapter;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKListView;->hideReloadFooter()V

    .line 282
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void

    .line 260
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/shopkick/app/view/PagingListAdapter;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " must use adapter of type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v1, Lcom/shopkick/app/view/PagingListAdapter;

    .line 261
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDisableActiveViewMarking(Z)V
    .locals 1

    .line 147
    iget-boolean v0, p0, Lcom/shopkick/app/view/SKListView;->disableActiveViewMarking:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 150
    :cond_0
    iput-boolean p1, p0, Lcom/shopkick/app/view/SKListView;->disableActiveViewMarking:Z

    if-eqz p1, :cond_1

    const p1, 0x7fffffff

    .line 152
    iput p1, p0, Lcom/shopkick/app/view/SKListView;->currStartIndex:I

    const/high16 p1, -0x80000000

    .line 153
    iput p1, p0, Lcom/shopkick/app/view/SKListView;->currEndIndex:I

    goto :goto_0

    .line 155
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKListView;->getFirstVisiblePosition()I

    move-result p1

    invoke-virtual {p0}, Lcom/shopkick/app/view/SKListView;->getChildCount()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/view/SKListView;->markActiveViews(II)V

    :goto_0
    return-void
.end method

.method public setDisplayPositionWithinParent(Ljava/lang/Integer;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/shopkick/app/view/SKListView;->displayPositionWithinParent:Ljava/lang/Integer;

    return-void
.end method

.method public setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/shopkick/app/view/SKListView;->onScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    .line 105
    invoke-super {p0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    return-void
.end method

.method public setRecyclerListener(Landroid/widget/AbsListView$RecyclerListener;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/shopkick/app/view/SKListView;->recyclerListener:Landroid/widget/AbsListView$RecyclerListener;

    .line 244
    invoke-super {p0, p0}, Landroid/widget/ListView;->setRecyclerListener(Landroid/widget/AbsListView$RecyclerListener;)V

    return-void
.end method

.method public showLoadingFooter()V
    .locals 2

    .line 286
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->loadingFooter:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/shopkick/app/view/SKListView;->loadingFooterShowing:Z

    if-nez v1, :cond_0

    const v1, 0x7f090433

    .line 287
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x1

    .line 288
    iput-boolean v0, p0, Lcom/shopkick/app/view/SKListView;->loadingFooterShowing:Z

    :cond_0
    return-void
.end method

.method public showReloadFooter()V
    .locals 3

    .line 300
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooter:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/shopkick/app/view/SKListView;->reloadFooterShowing:Z

    if-nez v1, :cond_0

    const v1, 0x7f090255

    .line 301
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooter:Landroid/view/View;

    const v2, 0x7f0905a8

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x1

    .line 303
    iput-boolean v0, p0, Lcom/shopkick/app/view/SKListView;->reloadFooterShowing:Z

    :cond_0
    return-void
.end method
