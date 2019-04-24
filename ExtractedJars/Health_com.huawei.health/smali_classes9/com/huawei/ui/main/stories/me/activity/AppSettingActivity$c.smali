.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field b:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Ljava/lang/String;)V
    .locals 1

    .line 671
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 669
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    .line 672
    iput-object p2, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    .line 673
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 712
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "GetNotificatioinSupportCallback onServiceException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 713
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 677
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "initSDK success"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 678
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 679
    return-void

    .line 681
    :cond_0
    move-object v4, p1

    check-cast v4, Landroid/os/Bundle;

    .line 682
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    const-string v1, "getNotificationSupport"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 683
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const-string v1, "notificationSupport"

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z

    .line 684
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSupportNotification :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 685
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 688
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    const-string v1, "getStepsNotifiState"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 689
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const-string v1, "stepsNotifiState"

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z

    .line 690
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOpenRealTimeStep :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z

    .line 693
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    const-string v1, "getGoalNotifiState"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 694
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const-string v1, "goalNotifiState"

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z

    .line 695
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOpenCompleteGoad :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->g(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 696
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->g(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z

    .line 698
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->h(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 699
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enterSetNotification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 700
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->f(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 701
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->g(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z

    .line 702
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z

    .line 704
    :cond_4
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 708
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "GetNotificatioinSupportCallback Failed"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    return-void
.end method
