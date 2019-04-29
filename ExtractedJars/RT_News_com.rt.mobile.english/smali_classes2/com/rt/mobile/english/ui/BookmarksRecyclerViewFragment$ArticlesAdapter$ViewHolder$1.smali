.class Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$1;
.super Ljava/lang/Object;
.source "BookmarksRecyclerViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;

.field final synthetic val$this$1:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;)V
    .locals 0

    .line 331
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$1;->val$this$1:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 334
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->getPosition()I

    move-result v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->articles:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->access$200(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;ILjava/util/List;)V

    return-void
.end method
