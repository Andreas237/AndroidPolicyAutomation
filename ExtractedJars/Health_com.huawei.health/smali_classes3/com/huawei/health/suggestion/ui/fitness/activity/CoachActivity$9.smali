.class Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 355
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$9;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 358
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 360
    :sswitch_0
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 361
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ERROR_TYPE receive:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    goto :goto_0

    .line 364
    :sswitch_1
    move-object v5, p2

    check-cast v5, Lo/dgj;

    .line 365
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$9;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/bwa;->c(Lo/dgj;)V

    .line 366
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$9;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0, v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;Lo/dgj;)V

    .line 367
    goto :goto_0

    .line 369
    :sswitch_2
    move-object v6, p2

    check-cast v6, Lo/dgl;

    .line 370
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$9;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/bwa;->e(Lo/dgl;)V

    .line 371
    goto :goto_0

    .line 373
    :sswitch_3
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 374
    const v0, 0x186a2

    if-ne v7, v0, :cond_0

    .line 375
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$9;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa;->a()V

    .line 381
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_2
        0xb -> :sswitch_1
        0x7f -> :sswitch_0
        0x186a0 -> :sswitch_3
    .end sparse-switch
.end method
