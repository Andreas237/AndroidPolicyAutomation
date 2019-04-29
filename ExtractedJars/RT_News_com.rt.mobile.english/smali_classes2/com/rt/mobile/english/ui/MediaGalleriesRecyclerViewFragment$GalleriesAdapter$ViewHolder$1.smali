.class Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder$1;
.super Ljava/lang/Object;
.source "MediaGalleriesRecyclerViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;

.field final synthetic val$this$1:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter;)V
    .locals 0

    .line 218
    iput-object p1, p0, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder$1;->val$this$1:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 221
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter;->this$0:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;->getPosition()I

    move-result v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment$GalleriesAdapter;->galleries:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment;->access$000(Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment;ILjava/util/List;)V

    return-void
.end method
