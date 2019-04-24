.class public Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "DebugMenuAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "MoreItemViewHolder"
.end annotation


# instance fields
.field protected ivLeftIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902af
    .end annotation
.end field

.field tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field

.field public vRow:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 107
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 108
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;->vRow:Landroid/view/View;

    .line 109
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method
