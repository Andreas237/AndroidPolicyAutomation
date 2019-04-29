.class public Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "ArticlesAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/ArticlesAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ArticleViewHolder"
.end annotation


# instance fields
.field PlayIcon:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090121
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field imageView:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900b5
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field pictureFrame:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09011d
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field pipeView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09011f
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field summaryView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09017a
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field textView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090191
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field final synthetic this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

.field timeView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090190
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field titleView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090195
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/ArticlesAdapter;Landroid/view/View;)V
    .locals 1

    .line 280
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    .line 281
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 283
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->itemView:Landroid/view/View;

    instance-of v0, v0, Lcom/google/android/gms/ads/AdView;

    if-nez v0, :cond_0

    .line 284
    invoke-static {p0, p2}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 285
    new-instance v0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;

    invoke-direct {v0, p0, p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;-><init>(Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;Lcom/rt/mobile/english/ui/ArticlesAdapter;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method
