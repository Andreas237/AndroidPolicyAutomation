.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$5;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$5;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .line 197
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 198
    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 4

    .line 202
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 203
    if-eqz p3, :cond_0

    .line 204
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIsUpDownScrolling"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$5;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Z)Z

    .line 208
    :cond_0
    if-eqz p2, :cond_1

    .line 209
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIsLeftRightScrolling"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$5;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Z)Z

    .line 212
    :cond_1
    return-void
.end method
