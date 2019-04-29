.class Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$1;
.super Ljava/lang/Object;
.source "ArticlesRecyclerViewFragment.java"

# interfaces
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Lcom/rt/mobile/english/data/articles/Breaking;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 0

    .line 137
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/articles/Breaking;",
            ">;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 131
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;

    iput-object p1, p2, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->breakingNews:Lcom/rt/mobile/english/data/Message;

    .line 132
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->reloadData()V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 128
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment$1;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
