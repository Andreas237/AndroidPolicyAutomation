.class public Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "ShowEpisodesRecyclerViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;
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

.field textView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090191
    .end annotation
.end field

.field final synthetic this$1:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;Landroid/view/View;)V
    .locals 1

    .line 213
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;

    .line 214
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 215
    invoke-static {p0, p2}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 217
    new-instance v0, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder$1;

    invoke-direct {v0, p0, p1}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder$1;-><init>(Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter$ViewHolder;Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment$EpisodesAdapter;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
