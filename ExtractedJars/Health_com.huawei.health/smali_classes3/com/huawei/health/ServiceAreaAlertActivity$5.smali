.class Lcom/huawei/health/ServiceAreaAlertActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/ServiceAreaAlertActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/ServiceAreaAlertActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/ServiceAreaAlertActivity;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/huawei/health/ServiceAreaAlertActivity$5;->d:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 131
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$5;->d:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-static {v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->e(Lcom/huawei/health/ServiceAreaAlertActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    .line 132
    invoke-static {v4}, Lo/dbf;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 133
    const-string v0, "Login_ServiceAreaAlertActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startBtn setOnClickListener strCountryName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  strCountry = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    const-string v0, "cn"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    const-string v0, "1"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    goto :goto_0

    .line 138
    :cond_0
    const-string v0, "0"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    .line 140
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5}, Lo/dbf;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 141
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$5;->d:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-static {v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->a(Lcom/huawei/health/ServiceAreaAlertActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V

    .line 142
    const-string v0, "Login_ServiceAreaAlertActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeIfInAccountArea HWUserProfileMgr.ACCOUNT_AREA !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 144
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$5;->d:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-static {v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->a(Lcom/huawei/health/ServiceAreaAlertActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V

    .line 145
    const-string v0, "Login_ServiceAreaAlertActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeIfInAccountArea HWUserProfileMgr.NO_ACCOUNT_AREA !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$5;->d:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-static {v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->a(Lcom/huawei/health/ServiceAreaAlertActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v0, v1}, Lo/abi;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 150
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 151
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$5;->d:Lcom/huawei/health/ServiceAreaAlertActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v6}, Lcom/huawei/health/ServiceAreaAlertActivity;->setResult(ILandroid/content/Intent;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$5;->d:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-virtual {v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->finish()V

    .line 153
    return-void
.end method
