.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$31;
.super Lo/buv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/buv<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;


# direct methods
.method varargs constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/util/List;[I)V
    .locals 0

    .line 818
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$31;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0, p2, p3}, Lo/buv;-><init>(Ljava/util/List;[I)V

    return-void
.end method


# virtual methods
.method public c(Lo/bvr;ILcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 10

    .line 822
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$31;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v1

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMeasurementValue()I

    move-result v2

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMeasurementType()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;III)Ljava/lang/String;

    move-result-object v9

    .line 823
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_train_title_adv:I

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_train_n_adv:I

    .line 824
    invoke-virtual {v0, v1, v9}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_rec_gap:I

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_second_nogap:I

    .line 826
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGap()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGap()I

    move-result v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 825
    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 827
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$31;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p2, v0, :cond_0

    .line 828
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_train_seg_adv:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    .line 830
    :cond_0
    return-void
.end method

.method public synthetic e(Lo/bvr;ILjava/lang/Object;)V
    .locals 1

    .line 818
    move-object v0, p3

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$31;->c(Lo/bvr;ILcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    return-void
.end method
