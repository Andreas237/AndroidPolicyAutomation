.class Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V
    .locals 0

    .line 719
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$6;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 752
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 753
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 722
    if-eqz p2, :cond_4

    .line 723
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fetchUserData data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    move-object v4, p2

    :try_start_0
    check-cast v4, Ljava/util/List;

    .line 726
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 727
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 728
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$6;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;

    .line 729
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 730
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUserName()Ljava/lang/String;

    move-result-object v5

    .line 731
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 732
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$6;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->s(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/hihealth/HiUserInfo;->setName(Ljava/lang/String;)V

    goto :goto_0

    .line 734
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserNameFromLocal userName is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 736
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$6;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->s(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUserPicPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setHeadImgUrl(Ljava/lang/String;)V

    .line 738
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$6;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->r(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 739
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$6;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->r(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 741
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 746
    :cond_3
    :goto_1
    goto :goto_2

    .line 744
    :catch_0
    move-exception v4

    .line 745
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserNameFromLocal data ClassCastException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 748
    :cond_4
    :goto_2
    return-void
.end method
