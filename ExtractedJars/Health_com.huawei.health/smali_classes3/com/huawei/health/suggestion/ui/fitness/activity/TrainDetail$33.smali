.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/buv$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 860
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bvr;ILjava/lang/Object;)V
    .locals 4

    .line 863
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/buv;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/buv;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getDescription()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 864
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAdapter.setOnItemClickListener1: null==mAdapter.get(position).getDescription() = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 866
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)I

    .line 867
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->m(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwp;

    move-result-object v0

    add-int/lit8 v1, p2, 0x1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/buv;

    move-result-object v2

    invoke-virtual {v2}, Lo/buv;->getItemCount()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/bwp;->b(II)V

    .line 868
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->m(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwp;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->upShow(Landroid/view/View;)V

    .line 869
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 870
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V

    .line 871
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V

    .line 873
    :goto_0
    return-void
.end method
