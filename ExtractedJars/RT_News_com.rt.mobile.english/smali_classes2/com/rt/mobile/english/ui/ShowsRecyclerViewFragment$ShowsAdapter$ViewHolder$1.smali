.class Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder$1;
.super Ljava/lang/Object;
.source "ShowsRecyclerViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;

.field final synthetic val$this$1:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder$1;->val$this$1:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 214
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;->this$0:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;->shows:Ljava/util/List;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;

    invoke-virtual {v1}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;->getPosition()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/shows/Show;

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;->access$000(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;Lcom/rt/mobile/english/data/shows/Show;)V

    return-void
.end method
