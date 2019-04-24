.class Lo/bwy$4;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwy;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bwy;


# direct methods
.method constructor <init>(Lo/bwy;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/bwy$4;->e:Lo/bwy;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 2

    .line 61
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 62
    const/4 v0, 0x1

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bwy$4;->e:Lo/bwy;

    invoke-static {v0}, Lo/bwy;->a(Lo/bwy;)Lo/bum;

    move-result-object v0

    invoke-virtual {v0}, Lo/bum;->d()I

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lo/bwy$4;->e:Lo/bwy;

    invoke-static {v0}, Lo/bwy;->b(Lo/bwy;)Lo/bwy$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/bwy$4;->e:Lo/bwy;

    invoke-static {v0}, Lo/bwy;->b(Lo/bwy;)Lo/bwy$b;

    move-result-object v0

    invoke-interface {v0}, Lo/bwy$b;->b()V

    .line 67
    :cond_0
    return-void
.end method
