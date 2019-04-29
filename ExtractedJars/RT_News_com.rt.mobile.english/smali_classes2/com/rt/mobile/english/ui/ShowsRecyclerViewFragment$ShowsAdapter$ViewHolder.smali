.class public Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "ShowsRecyclerViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ViewHolder"
.end annotation


# instance fields
.field imageView:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900b5
    .end annotation
.end field

.field final synthetic this$1:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;Landroid/view/View;)V
    .locals 1

    .line 207
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;

    .line 208
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 209
    invoke-static {p0, p2}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 211
    new-instance v0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder$1;

    invoke-direct {v0, p0, p1}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder$1;-><init>(Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public getImageView()Landroid/widget/ImageView;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment$ShowsAdapter$ViewHolder;->imageView:Landroid/widget/ImageView;

    return-object v0
.end method
