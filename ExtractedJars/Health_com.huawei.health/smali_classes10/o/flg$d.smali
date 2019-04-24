.class Lo/flg$d;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lo/flg;


# direct methods
.method private constructor <init>(Lo/flg;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lo/flg$d;->d:Lo/flg;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/flg;Lo/flg$3;)V
    .locals 0

    .line 272
    invoke-direct {p0, p1}, Lo/flg$d;-><init>(Lo/flg;)V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .line 302
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 303
    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 8

    .line 275
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 276
    iget-object v0, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v0}, Lo/flg;->a(Lo/flg;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 277
    const-string v0, "HwSubHeader"

    const-string v1, "no use the stick function"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    return-void

    .line 280
    :cond_0
    iget-object v0, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v0}, Lo/flg;->d(Lo/flg;)Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/support/v7/widget/LinearLayoutManager;

    .line 281
    invoke-virtual {v3}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v4

    .line 282
    iget-object v0, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v0, v4}, Lo/flg;->a(Lo/flg;I)I

    .line 283
    invoke-virtual {v3}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v5

    .line 284
    move v6, v4

    :goto_0
    add-int v0, v4, v5

    if-ge v6, v0, :cond_4

    .line 285
    if-lez v6, :cond_3

    iget-object v0, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v0}, Lo/flg;->e(Lo/flg;)Lo/flg$a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/flg$a;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 286
    iget-object v0, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v0}, Lo/flg;->d(Lo/flg;)Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v7

    .line 287
    iget-object v0, p0, Lo/flg$d;->d:Lo/flg;

    iget-object v1, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v1}, Lo/flg;->b(Lo/flg;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lo/flg;->b(Lo/flg;I)I

    .line 288
    if-eqz v7, :cond_2

    .line 289
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v1}, Lo/flg;->c(Lo/flg;)I

    move-result v1

    if-gt v0, v1, :cond_1

    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v0

    if-lez v0, :cond_1

    .line 290
    iget-object v0, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v0}, Lo/flg;->b(Lo/flg;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v1}, Lo/flg;->c(Lo/flg;)I

    move-result v1

    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v1, v2

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setY(F)V

    goto :goto_1

    .line 292
    :cond_1
    iget-object v0, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v0}, Lo/flg;->b(Lo/flg;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setY(F)V

    .line 295
    :cond_2
    :goto_1
    iget-object v0, p0, Lo/flg$d;->d:Lo/flg;

    invoke-static {v0}, Lo/flg;->k(Lo/flg;)V

    .line 296
    goto :goto_2

    .line 284
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 299
    :cond_4
    :goto_2
    return-void
.end method
