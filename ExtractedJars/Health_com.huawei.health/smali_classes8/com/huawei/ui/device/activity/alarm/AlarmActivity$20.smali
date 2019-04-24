.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 567
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 570
    const/4 v4, 0x0

    .line 571
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    if-eqz p2, :cond_1

    .line 572
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 573
    const-string v0, "&&"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 574
    const-string v0, "&&"

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 575
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "INTELLIGENT_HOME_LINKAGE split = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    array-length v0, v6

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 578
    const/4 v0, 0x3

    :try_start_0
    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    .line 579
    const/4 v4, 0x0

    goto :goto_0

    .line 581
    :cond_0
    const/4 v4, 0x1

    .line 585
    :goto_0
    goto :goto_1

    .line 583
    :catch_0
    move-exception v7

    .line 584
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "INTELLIGENT_HOME_LINKAGE Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    :cond_1
    :goto_1
    move v5, v4

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20$5;

    invoke-direct {v1, p0, v5}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20$5;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 602
    return-void
.end method
