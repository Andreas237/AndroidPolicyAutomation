.class Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder$1;
.super Ljava/lang/Object;
.source "VideoEpisodesRecyclerViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;

.field final synthetic val$this$1:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder$1;->val$this$1:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 247
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter;->this$0:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;->getPosition()I

    move-result v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment$VideosAdapter;->videoEpisodes:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;->access$000(Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;ILjava/util/List;)V

    return-void
.end method
