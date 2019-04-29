.class public Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "MediaVideoRecyclerViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "VideosAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;

.field videoEpisodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/videos/VideoEpisode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/videos/VideoEpisode;",
            ">;)V"
        }
    .end annotation

    .line 229
    iput-object p1, p0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;->this$0:Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 230
    iput-object p2, p0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;->videoEpisodes:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;->videoEpisodes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 205
    check-cast p1, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;->onBindViewHolder(Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;I)V
    .locals 2

    .line 243
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;->videoEpisodes:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/videos/VideoEpisode;

    .line 244
    iget-object v0, p1, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    invoke-static {}, Lcom/rt/mobile/english/Utils;->imageLoader()Lcom/nostra13/universalimageloader/core/ImageLoader;

    move-result-object v0

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getImage()Ljava/lang/String;

    move-result-object p2

    iget-object p1, p1, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v0, p2, p1}, Lcom/nostra13/universalimageloader/core/ImageLoader;->displayImage(Ljava/lang/String;Landroid/widget/ImageView;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 205
    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;
    .locals 2

    .line 235
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0031

    const/4 v1, 0x0

    .line 236
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 238
    new-instance p2, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment$VideosAdapter;Landroid/view/View;)V

    return-object p2
.end method
