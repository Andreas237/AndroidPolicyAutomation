.class public Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "GalleriesRecyclerViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "GalleriesAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field galleries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/galleries/Gallery;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/galleries/Gallery;",
            ">;)V"
        }
    .end annotation

    .line 228
    iput-object p1, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;->this$0:Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 229
    iput-object p2, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;->galleries:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;->galleries:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 204
    check-cast p1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;->onBindViewHolder(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;I)V
    .locals 2

    .line 242
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;->galleries:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/galleries/Gallery;

    .line 243
    iget-object v0, p1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/galleries/Gallery;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    invoke-static {}, Lcom/rt/mobile/english/Utils;->imageLoader()Lcom/nostra13/universalimageloader/core/ImageLoader;

    move-result-object v0

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/galleries/Gallery;->getImage()Ljava/lang/String;

    move-result-object p2

    iget-object p1, p1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v0, p2, p1}, Lcom/nostra13/universalimageloader/core/ImageLoader;->displayImage(Ljava/lang/String;Landroid/widget/ImageView;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 204
    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;
    .locals 2

    .line 234
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c002c

    const/4 v1, 0x0

    .line 235
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 237
    new-instance p2, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter;Landroid/view/View;)V

    return-object p2
.end method
