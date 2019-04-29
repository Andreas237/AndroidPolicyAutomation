.class Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;
.super Ljava/lang/Object;
.source "BookmarksRecyclerViewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->reloadData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 198
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "((LinearLayoutManager) recyclerView.getLayoutManager()).findLastCompletelyVisibleItemPosition() = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    iget-object v2, v2, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 199
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 198
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition() = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    iget-object v2, v2, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 201
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 200
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->articles:Ljava/util/List;

    .line 203
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ne v0, v1, :cond_0

    .line 204
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "show toolbar"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->access$002(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;Z)Z

    goto :goto_0

    .line 208
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    invoke-static {v0, v2}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->access$002(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;Z)Z

    .line 210
    :goto_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->access$100(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;)V

    return-void
.end method
