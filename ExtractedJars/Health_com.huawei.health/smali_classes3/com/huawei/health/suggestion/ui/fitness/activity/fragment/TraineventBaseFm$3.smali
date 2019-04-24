.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$3;
.super Lo/buv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/buv<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;


# direct methods
.method varargs constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Ljava/util/List;[I)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    invoke-direct {p0, p2, p3}, Lo/buv;-><init>(Ljava/util/List;[I)V

    return-void
.end method


# virtual methods
.method public e(Lo/bvr;ILjava/lang/Object;)V
    .locals 3

    .line 154
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$3;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 155
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_item_rcvtrain_underline:I

    invoke-virtual {p1, v0}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 156
    if-eqz v2, :cond_0

    .line 157
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 160
    :cond_0
    if-nez p2, :cond_1

    .line 161
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    move-object v1, p3

    check-cast v1, Ljava/util/List;

    invoke-static {v0, p1, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lo/bvr;Ljava/util/List;)V

    goto :goto_0

    .line 163
    :cond_1
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 164
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    move-object v1, p3

    check-cast v1, Ljava/util/List;

    invoke-static {v0, p1, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lo/bvr;Ljava/util/List;)V

    goto :goto_0

    .line 166
    :cond_2
    const/4 v0, 0x2

    if-lt p2, v0, :cond_3

    .line 167
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    invoke-static {v0, p1, p2, p3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lo/bvr;ILjava/lang/Object;)V

    .line 169
    :cond_3
    :goto_0
    return-void
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 146
    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
