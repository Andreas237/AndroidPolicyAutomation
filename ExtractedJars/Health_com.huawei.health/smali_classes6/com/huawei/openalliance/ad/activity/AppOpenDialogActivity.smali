.class public Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;
.super Landroid/app/Activity;

# interfaces
.implements Lcom/huawei/openalliance/ad/download/app/d$a;


# instance fields
.field private a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field private b:I

.field private c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private c()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->finish()V

    return-void
.end method

.method private d()V
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    new-instance v3, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v0

    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v0

    invoke-direct {v3, p0, v0}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-interface {v3, v0}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getIntentUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v4, v0}, Lcom/huawei/openalliance/ad/utils/c;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {p0, v4}, Lcom/huawei/openalliance/ad/utils/c;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x2

    goto :goto_0

    :cond_0
    const/4 v6, 0x1

    :goto_0
    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v0, v1, v2}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-static {p0, v4}, Lcom/huawei/openalliance/ad/utils/c;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/huawei/openalliance/ad/k/b/d;->i(Ljava/lang/Integer;)V

    const-string v0, "app"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v3, v1, v2, v0}, Lcom/huawei/openalliance/ad/k/b/d;->a(IILjava/lang/String;)V

    :cond_1
    goto :goto_1

    :cond_2
    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTSUCCESS:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v3, v0, v1, v2}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;Ljava/lang/Integer;)V

    const-string v0, "app"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v3, v1, v2, v0}, Lcom/huawei/openalliance/ad/k/b/d;->a(IILjava/lang/String;)V

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->finish()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->d()V

    return-void
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    sget v0, Lcom/huawei/openalliance/ad/R$layout;->activity_app_open_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->setContentView(I)V

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    const-string v0, "appinfo"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    const-string v0, "app_download_source"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->b:I

    const-string v0, "contentRecord"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "AppOpenDialogActivity"

    const-string v1, "fail to get app info, class cast exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->c()V

    return-void

    :catch_1
    move-exception v2

    const-string v0, "AppOpenDialogActivity"

    const-string v1, "fail to get app info"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->c()V

    return-void

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-static {p0, v0, p0}, Lcom/huawei/openalliance/ad/download/app/d;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/app/d$a;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/AppOpenDialogActivity;->c()V

    :goto_1
    return-void
.end method
