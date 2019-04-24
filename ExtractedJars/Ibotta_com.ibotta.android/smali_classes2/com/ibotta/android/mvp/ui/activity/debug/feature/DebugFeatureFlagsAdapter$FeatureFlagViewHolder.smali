.class public Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "DebugFeatureFlagsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "FeatureFlagViewHolder"
.end annotation


# instance fields
.field protected dffvFeatureFlag:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 71
    invoke-static {p1}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;->dffvFeatureFlag:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;

    return-void
.end method
