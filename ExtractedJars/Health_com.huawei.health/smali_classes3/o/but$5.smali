.class Lo/but$5;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/but;-><init>(Landroid/support/v7/widget/RecyclerView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/but;


# direct methods
.method constructor <init>(Lo/but;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lo/but$5;->c:Lo/but;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 4

    .line 41
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 42
    const/4 v0, 0x1

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/but$5;->c:Lo/but;

    invoke-static {v0}, Lo/but;->a(Lo/but;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lo/but$5;->c:Lo/but;

    invoke-static {v0}, Lo/but;->b(Lo/but;)Lo/but$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 44
    const-string v0, "FitnessTopicRecyAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "method:loadMore()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    iget-object v0, p0, Lo/but$5;->c:Lo/but;

    invoke-static {v0}, Lo/but;->b(Lo/but;)Lo/but$d;

    move-result-object v0

    invoke-interface {v0}, Lo/but$d;->e()V

    .line 48
    :cond_0
    return-void
.end method
