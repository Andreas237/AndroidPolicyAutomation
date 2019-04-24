.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$10;
.super Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$10;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 0

    .line 213
    invoke-super {p0}, Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;->onChanged()V

    .line 214
    return-void
.end method

.method public onItemRangeChanged(II)V
    .locals 0

    .line 218
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;->onItemRangeChanged(II)V

    .line 219
    return-void
.end method

.method public onItemRangeChanged(IILjava/lang/Object;)V
    .locals 0

    .line 223
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;->onItemRangeChanged(IILjava/lang/Object;)V

    .line 224
    return-void
.end method

.method public onItemRangeInserted(II)V
    .locals 0

    .line 228
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;->onItemRangeInserted(II)V

    .line 229
    return-void
.end method

.method public onItemRangeMoved(III)V
    .locals 0

    .line 238
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;->onItemRangeMoved(III)V

    .line 239
    return-void
.end method

.method public onItemRangeRemoved(II)V
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$10;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Lo/bvn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bvn;->e(I)V

    .line 234
    return-void
.end method
