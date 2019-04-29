.class public Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "ShowsRecyclerViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ShowsAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field shows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/shows/Show;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/shows/Show;",
            ">;)V"
        }
    .end annotation

    .line 221
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;->this$0:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 222
    iput-object p2, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;->shows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;->shows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 195
    check-cast p1, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;->onBindViewHolder(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;I)V
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;->shows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/shows/Show;

    .line 236
    invoke-static {}, Lcom/rt/mobile/english/Utils;->imageLoader()Lcom/nostra13/universalimageloader/core/ImageLoader;

    move-result-object v0

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/shows/Show;->getImage()Ljava/lang/String;

    move-result-object p2

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v0, p2, p1}, Lcom/nostra13/universalimageloader/core/ImageLoader;->displayImage(Ljava/lang/String;Landroid/widget/ImageView;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 195
    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;
    .locals 2

    .line 227
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0030

    const/4 v1, 0x0

    .line 228
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 230
    new-instance p2, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;Landroid/view/View;)V

    return-object p2
.end method
