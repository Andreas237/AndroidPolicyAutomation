.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:I

.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;I)V
    .locals 1

    .line 619
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 617
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;->b:I

    .line 620
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;->b:I

    .line 621
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;->c:Ljava/lang/ref/WeakReference;

    .line 622
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;ILcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;)V
    .locals 0

    .line 615
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;I)V

    return-void
.end method

.method private b(ILjava/lang/Object;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V
    .locals 4

    .line 649
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 650
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeMeasure Message is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    return-void

    .line 653
    :cond_0
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeMeasure objData.toString()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "err_code"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    const v0, 0x186a0

    if-ne v0, p1, :cond_1

    .line 655
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WearSDK.getInstance().unRegisterNotificationPress(mCallBack)!  mCallBack hashcode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->t(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-static {p3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->t(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aks;->s(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 658
    :cond_1
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message is not right!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    :goto_0
    return-void
.end method

.method private d(ILjava/lang/Object;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V
    .locals 4

    .line 670
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 671
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHeartRateReportStatus callback objData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    return-void

    .line 675
    :cond_0
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHeartRateReportStatus callback objData is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openMeasure objData.toString()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "err_code"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    const v0, 0x186a0

    if-ne v0, p1, :cond_1

    .line 678
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WearSDK.getInstance().registerNotificationPress(mCallBack)!  mCallBack hashcode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->t(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-static {p3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->t(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aks;->l(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 681
    :cond_1
    const/4 v0, 0x4

    invoke-virtual {p3, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 684
    :goto_0
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    .line 626
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 627
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;->b:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 629
    :sswitch_0
    invoke-direct {p0, p1, p2, v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;->d(ILjava/lang/Object;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    .line 630
    goto :goto_1

    .line 632
    :sswitch_1
    invoke-direct {p0, p1, p2, v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;->b(ILjava/lang/Object;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    .line 633
    goto :goto_1

    .line 635
    :goto_0
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCallbacktype err mCallbacktype = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    goto :goto_1

    .line 639
    :cond_0
    const-string v0, "StressGameBindService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StressGameBindService is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
