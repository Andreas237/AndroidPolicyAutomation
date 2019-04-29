.class Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder$1;
.super Ljava/lang/Object;
.source "ShowEpisodesRecyclerViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;

.field final synthetic val$this$1:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder$1;->val$this$1:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 220
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;->this$0:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder$1;->this$2:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;->getPosition()I

    move-result v0

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->access$000(Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;I)V

    return-void
.end method
