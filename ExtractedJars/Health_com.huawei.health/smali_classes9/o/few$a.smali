.class Lo/few$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/few;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field b:I

.field final synthetic c:Lo/few;


# direct methods
.method private constructor <init>(Lo/few;)V
    .locals 0

    .line 608
    iput-object p1, p0, Lo/few$a;->c:Lo/few;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/few;Lo/few$1;)V
    .locals 0

    .line 608
    invoke-direct {p0, p1}, Lo/few$a;-><init>(Lo/few;)V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 3

    .line 643
    iget v0, p0, Lo/few$a;->b:I

    if-nez v0, :cond_0

    .line 644
    return-void

    .line 646
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 647
    if-eqz v1, :cond_1

    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->b(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 648
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    .line 649
    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->a(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p2, v2}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 650
    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->a(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 651
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    .line 652
    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->b(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p2, v2}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 654
    :cond_2
    :goto_0
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 5

    .line 614
    iput p2, p0, Lo/few$a;->b:I

    .line 615
    if-eqz p2, :cond_0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 616
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 617
    if-eqz v2, :cond_1

    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->b(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 618
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    .line 619
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v4

    .line 620
    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->a(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v4, v3}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 621
    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->a(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 622
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    .line 623
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v4

    .line 624
    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->b(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v4, v3}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 629
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->g(Lo/few;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 630
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->h(Lo/few;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 631
    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->h(Lo/few;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 634
    :cond_3
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v0

    if-nez v0, :cond_4

    .line 635
    iget-object v0, p0, Lo/few$a;->c:Lo/few;

    invoke-static {v0}, Lo/few;->h(Lo/few;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 638
    :cond_4
    return-void
.end method
