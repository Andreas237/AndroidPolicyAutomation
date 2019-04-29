.class public Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "BookmarksRecyclerViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ViewHolder"
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
.end field

.field textView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090191
    .end annotation
.end field

.field final synthetic this$1:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;

.field timeView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090190
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;Landroid/view/View;)V
    .locals 1

    .line 327
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->this$1:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;

    .line 328
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 329
    invoke-static {p0, p2}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 331
    new-instance v0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$1;

    invoke-direct {v0, p0, p1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$1;-><init>(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
