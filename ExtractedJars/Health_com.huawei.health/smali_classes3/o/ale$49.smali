.class Lo/ale$49;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->a(Lcom/huawei/common/GuardianAccount;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/common/GuardianAccount;

.field final synthetic b:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;Lcom/huawei/common/GuardianAccount;)V
    .locals 0

    .line 3482
    iput-object p1, p0, Lo/ale$49;->b:Lo/ale;

    iput-object p2, p0, Lo/ale$49;->a:Lcom/huawei/common/GuardianAccount;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 3485
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "authorize kid account."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3486
    iget-object v0, p0, Lo/ale$49;->a:Lcom/huawei/common/GuardianAccount;

    invoke-virtual {v0}, Lcom/huawei/common/GuardianAccount;->fetchGuardianUserID()Ljava/lang/String;

    move-result-object v4

    .line 3487
    iget-object v0, p0, Lo/ale$49;->a:Lcom/huawei/common/GuardianAccount;

    invoke-virtual {v0}, Lcom/huawei/common/GuardianAccount;->fetchGuardianUserAccount()Ljava/lang/String;

    move-result-object v5

    .line 3488
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v6

    .line 3489
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u76d1\u62a4\u4eba\u8d26\u53f7:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ale$49;->a:Lcom/huawei/common/GuardianAccount;

    invoke-virtual {v3}, Lcom/huawei/common/GuardianAccount;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3491
    invoke-static {}, Lcom/huawei/cloudservice/CloudAccountManager;->getPwdVerifyIntent()Landroid/content/Intent;

    move-result-object v7

    .line 3492
    const-string v0, "userId"

    invoke-virtual {v7, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3493
    const-string v0, "userName"

    invoke-virtual {v7, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3494
    const-string v0, "siteId"

    invoke-virtual {v7, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 3496
    const-string v0, "type"

    const-string v1, "granted"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3497
    iget-object v0, p0, Lo/ale$49;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->N(Lo/ale;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x1773

    invoke-virtual {v0, v7, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 3498
    return-void
.end method
