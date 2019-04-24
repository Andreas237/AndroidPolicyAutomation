.class public Lcom/huawei/hwid/api/common/g;
.super Landroid/app/AlertDialog$Builder;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/cloudservice/CloudRequestHandler;

.field private b:Ljava/lang/String;

.field private c:Landroid/content/Context;

.field private d:Landroid/app/AlertDialog;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 6

    .line 33
    invoke-static {p1}, Lcom/huawei/hwid/core/d/l;->a(Landroid/content/Context;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 34
    iput-object p1, p0, Lcom/huawei/hwid/api/common/g;->c:Landroid/content/Context;

    .line 35
    iput-object p4, p0, Lcom/huawei/hwid/api/common/g;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 36
    iput-object p2, p0, Lcom/huawei/hwid/api/common/g;->b:Ljava/lang/String;

    .line 37
    if-eqz p3, :cond_0

    .line 38
    const-string v0, "serviceToken"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/g;->e:Ljava/lang/String;

    .line 39
    const-string v0, "key_app_id_to_web"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/g;->f:Ljava/lang/String;

    .line 41
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/g;->c:Landroid/content/Context;

    const-string v2, "CS_account_manager_array"

    invoke-static {v1, v2}, Lcom/huawei/hwid/core/d/i;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object v4

    .line 42
    new-instance v5, Landroid/widget/ArrayAdapter;

    iget-object v0, p0, Lcom/huawei/hwid/api/common/g;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/g;->c:Landroid/content/Context;

    const-string v2, "cs_listview_item_more_account"

    invoke-static {v1, v2}, Lcom/huawei/hwid/core/d/i;->d(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/hwid/api/common/g;->c:Landroid/content/Context;

    const-string v3, "id_txt"

    .line 43
    invoke-static {v2, v3}, Lcom/huawei/hwid/core/d/i;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-direct {v5, v0, v1, v2, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 44
    new-instance v0, Lcom/huawei/hwid/api/common/g$1;

    invoke-direct {v0, p0, p3}, Lcom/huawei/hwid/api/common/g$1;-><init>(Lcom/huawei/hwid/api/common/g;Landroid/os/Bundle;)V

    invoke-virtual {p0, v5, v0}, Lcom/huawei/hwid/api/common/g;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 65
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/g;)Landroid/content/Context;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/hwid/api/common/g;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/g;)Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/hwid/api/common/g;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 96
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 97
    const-string v0, "result_code"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 98
    iget-object v0, p0, Lcom/huawei/hwid/api/common/g;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 99
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 3

    .line 69
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 70
    const-string v0, "com.huawei.hwid.ACTION_MAIN_SETTINGS"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 71
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    const-string v0, "isGoToWelcome"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 73
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto :goto_0

    .line 74
    :catch_0
    move-exception v2

    .line 75
    const-string v0, "CloudAccountManagerDialog"

    const-string v1, "Exception22"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    :goto_0
    return-void
.end method

.method public a(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 3

    .line 81
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-direct {v2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 82
    const-string v0, "key_service_token_to_web"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/g;->e:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 83
    const-string v0, "key_app_id_to_web"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/g;->f:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 84
    const-string v0, "key_user_account_to_web"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/g;->b:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 85
    invoke-virtual {v2, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 86
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 87
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :cond_0
    goto :goto_0

    .line 90
    :catch_0
    move-exception v2

    .line 91
    const-string v0, "CloudAccountManagerDialog"

    const-string v1, "Exception11"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/hwid/api/common/g;->d:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/api/common/g;->d:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/huawei/hwid/api/common/g;->d:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 105
    :cond_0
    return-void
.end method

.method public show()Landroid/app/AlertDialog;
    .locals 1

    .line 109
    invoke-super {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/g;->d:Landroid/app/AlertDialog;

    .line 110
    iget-object v0, p0, Lcom/huawei/hwid/api/common/g;->d:Landroid/app/AlertDialog;

    return-object v0
.end method
