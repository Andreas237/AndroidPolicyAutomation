.class public Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;
.super Landroid/support/v7/widget/RecyclerView;
.source "SKRecyclerView.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/IUserEventRecyclerView;
.implements Landroid/support/v7/widget/RecyclerView$RecyclerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;
    }
.end annotation


# static fields
.field public static PERCENT_VISIBLE_FOR_IMPRESSION:F = 0.7f


# instance fields
.field private currEndIndex:I

.field private currStartIndex:I

.field private disableActiveViewMarking:Z

.field private inFling:Z

.field private markActiveListener:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;

.field private modules:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p1, 0x7fffffff

    .line 32
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currStartIndex:I

    const/high16 p1, -0x80000000

    .line 33
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currEndIndex:I

    .line 49
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->modules:Ljava/util/HashSet;

    .line 51
    invoke-virtual {p0, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setRecyclerListener(Landroid/support/v7/widget/RecyclerView$RecyclerListener;)V

    const/4 p1, 0x1

    .line 52
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setHasFixedSize(Z)V

    .line 55
    new-instance p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;

    invoke-direct {p1, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;-><init>(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    iput-object p1, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveListener:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;

    .line 56
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveListener:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveViews()V

    return-void
.end method

.method private markActiveViews()V
    .locals 11

    .line 178
    iget-boolean v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->disableActiveViewMarking:Z

    if-eqz v0, :cond_0

    return-void

    .line 182
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v0

    .line 183
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findLastVisibleItemPosition()I

    move-result v1

    .line 186
    iget v2, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currStartIndex:I

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_1

    .line 187
    invoke-direct {p0, v3, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->tryToMarkItemInactive(Landroid/view/View;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 190
    :goto_1
    iget v4, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currEndIndex:I

    if-gt v2, v4, :cond_2

    .line 191
    invoke-direct {p0, v3, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->tryToMarkItemInactive(Landroid/view/View;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const v2, 0x7fffffff

    const/high16 v3, -0x80000000

    const/4 v4, 0x0

    .line 198
    :goto_2
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildCount()I

    move-result v5

    if-ge v4, v5, :cond_9

    .line 199
    invoke-virtual {p0, v4}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 200
    invoke-virtual {p0, v5}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildViewHolder(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v6

    .line 201
    invoke-virtual {v6}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v6

    if-ge v6, v0, :cond_3

    .line 205
    invoke-direct {p0, v5, v6}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->tryToMarkItemInactive(Landroid/view/View;I)V

    goto :goto_4

    :cond_3
    if-le v6, v1, :cond_4

    .line 211
    invoke-direct {p0, v5, v6}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->tryToMarkItemInactive(Landroid/view/View;I)V

    goto :goto_4

    .line 215
    :cond_4
    new-instance v7, Landroid/graphics/Rect;

    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 216
    invoke-virtual {v5, v7}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v8

    .line 218
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v9

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    mul-int/2addr v9, v7

    int-to-float v7, v9

    .line 219
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v9

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v10

    mul-int/2addr v9, v10

    int-to-float v9, v9

    div-float/2addr v7, v9

    if-eqz v8, :cond_7

    .line 220
    sget v8, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->PERCENT_VISIBLE_FOR_IMPRESSION:F

    cmpg-float v7, v7, v8

    if-gez v7, :cond_5

    goto :goto_3

    .line 226
    :cond_5
    invoke-direct {p0, v5, v6}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->tryToMarkItemActive(Landroid/view/View;I)V

    if-le v2, v6, :cond_6

    move v2, v6

    :cond_6
    add-int/lit8 v6, v6, 0x1

    if-ge v3, v6, :cond_8

    move v3, v6

    goto :goto_4

    .line 222
    :cond_7
    :goto_3
    invoke-direct {p0, v5, v6}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->tryToMarkItemInactive(Landroid/view/View;I)V

    :cond_8
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 236
    :cond_9
    iput v2, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currStartIndex:I

    .line 237
    iput v3, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currEndIndex:I

    return-void
.end method

.method private removeMarkActiveListener()V
    .locals 2

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveListener:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;

    if-nez v0, :cond_0

    return-void

    .line 324
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveListener:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    .line 325
    iput-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveListener:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;

    return-void
.end method

.method private tryToMarkItemActive(Landroid/view/View;I)V
    .locals 2

    .line 241
    iget v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currStartIndex:I

    if-lt p2, v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currEndIndex:I

    if-lt p2, v0, :cond_1

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->modules:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;

    .line 243
    invoke-interface {v1, p0, p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;->onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    const p2, 0x7f09084c

    .line 248
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 249
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-direct {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveViews()V

    :cond_2
    return-void
.end method

.method private tryToMarkItemInactive(Landroid/view/View;I)V
    .locals 2

    .line 254
    iget v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currStartIndex:I

    if-lt p2, v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currEndIndex:I

    if-ge p2, v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->modules:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;

    .line 256
    invoke-interface {v1, p0, p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;->onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const p2, 0x7f09084c

    .line 261
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 262
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-direct {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveViews()V

    :cond_1
    return-void
.end method


# virtual methods
.method public addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V
    .locals 1

    .line 64
    invoke-interface {p1, p0}, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;->onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->modules:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public findFirstVisibleItemPosition()I
    .locals 3

    .line 116
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 120
    :cond_0
    instance-of v2, v0, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz v2, :cond_1

    .line 121
    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    return v0

    .line 122
    :cond_1
    instance-of v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    if-eqz v2, :cond_3

    .line 124
    :try_start_0
    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->findFirstVisibleItemPositions([I)[I

    move-result-object v0

    .line 125
    array-length v2, v0

    if-lez v2, :cond_2

    const/4 v2, 0x0

    aget v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return v1

    :catch_0
    return v1

    :cond_3
    return v1
.end method

.method public findLastVisibleItemPosition()I
    .locals 6

    .line 143
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 147
    :cond_0
    instance-of v2, v0, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz v2, :cond_1

    .line 148
    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    return v0

    .line 149
    :cond_1
    instance-of v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    if-eqz v2, :cond_4

    .line 151
    :try_start_0
    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->findLastVisibleItemPositions([I)[I

    move-result-object v0

    .line 155
    array-length v2, v0

    const/4 v3, 0x0

    move v4, v1

    :goto_0
    if-ge v3, v2, :cond_3

    aget v5, v0, v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-le v5, v4, :cond_2

    move v4, v5

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v4

    :catch_0
    return v1

    :cond_4
    return v1
.end method

.method public isIndexActive(I)Z
    .locals 1

    .line 292
    iget-boolean v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->disableActiveViewMarking:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->inFling:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currStartIndex:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currEndIndex:I

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 299
    invoke-super {p0}, Landroid/support/v7/widget/RecyclerView;->onDetachedFromWindow()V

    .line 300
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->removeMarkActiveListener()V

    return-void
.end method

.method public onScrollStateChanged(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x1

    .line 101
    iput-boolean v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->inFling:Z

    goto :goto_0

    .line 94
    :pswitch_1
    iget-boolean v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->inFling:Z

    if-eqz v0, :cond_0

    .line 95
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveViews()V

    const/4 v0, 0x0

    .line 96
    iput-boolean v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->inFling:Z

    .line 104
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->modules:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;

    .line 105
    invoke-interface {v1, p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;->onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V

    goto :goto_1

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onScrolled(II)V
    .locals 2

    .line 80
    iget-boolean v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->inFling:Z

    if-nez v0, :cond_0

    .line 81
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveViews()V

    .line 83
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->modules:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;

    .line 84
    invoke-interface {v1, p0, p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;->onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 2

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->modules:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;

    .line 173
    invoke-interface {v1, p1}, Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;->onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->modules:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public resetActiveViewMarking()V
    .locals 1

    const v0, 0x7fffffff

    .line 286
    iput v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currStartIndex:I

    const/high16 v0, -0x80000000

    .line 287
    iput v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currEndIndex:I

    return-void
.end method

.method public setDisableActiveViewMarking(Z)V
    .locals 1

    .line 272
    iget-boolean v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->disableActiveViewMarking:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 275
    :cond_0
    iput-boolean p1, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->disableActiveViewMarking:Z

    if-eqz p1, :cond_1

    const p1, 0x7fffffff

    .line 277
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currStartIndex:I

    const/high16 p1, -0x80000000

    .line 278
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->currEndIndex:I

    goto :goto_0

    .line 280
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->markActiveViews()V

    :goto_0
    return-void
.end method
