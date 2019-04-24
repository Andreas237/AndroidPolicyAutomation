.class Lo/bvn$4;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bvn;-><init>(Ljava/util/List;Landroid/support/v7/widget/RecyclerView;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bvn;

.field final synthetic e:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method constructor <init>(Lo/bvn;Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lo/bvn$4;->c:Lo/bvn;

    iput-object p2, p0, Lo/bvn$4;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 2

    .line 41
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 42
    iget-object v0, p0, Lo/bvn$4;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bvn$4;->c:Lo/bvn;

    invoke-static {v0}, Lo/bvn;->d(Lo/bvn;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 43
    iget-object v0, p0, Lo/bvn$4;->c:Lo/bvn;

    invoke-static {v0}, Lo/bvn;->e(Lo/bvn;)Lo/bvn$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lo/bvn$4;->c:Lo/bvn;

    invoke-static {v0}, Lo/bvn;->e(Lo/bvn;)Lo/bvn$b;

    move-result-object v0

    invoke-interface {v0}, Lo/bvn$b;->d()V

    .line 47
    :cond_0
    return-void
.end method
