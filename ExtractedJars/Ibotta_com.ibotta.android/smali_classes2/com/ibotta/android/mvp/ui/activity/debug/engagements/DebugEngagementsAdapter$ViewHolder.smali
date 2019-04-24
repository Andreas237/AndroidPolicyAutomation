.class public Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "DebugEngagementsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewHolder"
.end annotation


# instance fields
.field protected llRow:Landroid/widget/LinearLayout;

.field protected tvCount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09050f
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field

.field protected tvNumber:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090552
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;)V
    .locals 3

    .line 78
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 80
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;->llRow:Landroid/widget/LinearLayout;

    .line 81
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 83
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 85
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
