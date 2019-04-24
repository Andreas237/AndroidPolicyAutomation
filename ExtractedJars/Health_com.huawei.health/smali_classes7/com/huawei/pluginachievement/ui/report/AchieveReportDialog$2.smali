.class Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$2;->b:Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 289
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 259
    if-eqz p2, :cond_4

    .line 260
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

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

    .line 262
    move-object v4, p2

    :try_start_0
    check-cast v4, Ljava/util/List;

    .line 263
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 264
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$2;->b:Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->a(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;

    .line 266
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 267
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUserName()Ljava/lang/String;

    move-result-object v5

    .line 268
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 269
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$2;->b:Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/hihealth/HiUserInfo;->setName(Ljava/lang/String;)V

    goto :goto_0

    .line 271
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserNameFromLocal userName is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$2;->b:Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->b(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUserPicPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setHeadImgUrl(Ljava/lang/String;)V

    .line 275
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$2;->b:Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->a(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 276
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$2;->b:Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->a(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 278
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 283
    :cond_3
    :goto_1
    goto :goto_2

    .line 281
    :catch_0
    move-exception v4

    .line 282
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserNameFromLocal data ClassCastException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    :cond_4
    :goto_2
    return-void
.end method
