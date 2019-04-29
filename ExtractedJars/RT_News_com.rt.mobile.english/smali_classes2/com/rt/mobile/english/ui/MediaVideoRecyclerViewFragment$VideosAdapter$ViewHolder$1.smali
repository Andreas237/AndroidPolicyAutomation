.class Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder$1;
.super Ljava/lang/Object;
.source "MediaVideoRecyclerViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;

.field final synthetic val$this$1:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder$1;->val$this$1:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 222
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;->this$0:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;->getPosition()I

    move-result v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;->videoEpisodes:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;->access$000(Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;ILjava/util/List;)V

    return-void
.end method
