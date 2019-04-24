.class Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$3;
.super Lo/buv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->c(FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/buv<Lcom/huawei/health/suggestion/model/RecordAction;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;


# direct methods
.method varargs constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;Ljava/util/List;[I)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$3;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;

    invoke-direct {p0, p2, p3}, Lo/buv;-><init>(Ljava/util/List;[I)V

    return-void
.end method


# virtual methods
.method public d(Lo/bvr;ILcom/huawei/health/suggestion/model/RecordAction;)V
    .locals 3

    .line 202
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_tv_finish_actionname:I

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/RecordAction;->getActionName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 204
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_tv_finish_actionmsg:I

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/RecordAction;->getFinishedAct()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v1, v2}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 205
    invoke-static {p1, p3}, Lo/buw;->b(Lo/bvr;Lcom/huawei/health/suggestion/model/RecordAction;)V

    .line 206
    return-void
.end method

.method public synthetic e(Lo/bvr;ILjava/lang/Object;)V
    .locals 1

    .line 198
    move-object v0, p3

    check-cast v0, Lcom/huawei/health/suggestion/model/RecordAction;

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$3;->d(Lo/bvr;ILcom/huawei/health/suggestion/model/RecordAction;)V

    return-void
.end method
