.class Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/report/ReportActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/pluginachievement/ui/report/ReportActivity;>;"
        }
    .end annotation
.end field

.field private d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V
    .locals 1

    .line 349
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 346
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->a:Ljava/lang/ref/WeakReference;

    .line 350
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->a:Ljava/lang/ref/WeakReference;

    .line 351
    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 2

    .line 375
    const-string v0, "PLGACHIEVE_ReportActivity"

    const-string v1, "fetchGoalInfo failure"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    const/16 v1, 0x2710

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;I)I

    .line 377
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 378
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 380
    :cond_0
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 5

    .line 355
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    .line 356
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    if-eqz v0, :cond_0

    if-nez p2, :cond_1

    .line 357
    :cond_0
    const-string v0, "PLGACHIEVE_ReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mActivity or data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    return-void

    .line 360
    :cond_1
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 361
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fetchGoalInfo_data_stepGoal "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 363
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;I)I

    goto :goto_0

    .line 365
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    const/16 v1, 0x2710

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;I)I

    .line 367
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 368
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 371
    :cond_3
    return-void
.end method
