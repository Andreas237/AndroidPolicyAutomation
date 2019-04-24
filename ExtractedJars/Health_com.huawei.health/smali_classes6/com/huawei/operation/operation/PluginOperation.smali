.class public Lcom/huawei/operation/operation/PluginOperation;
.super Lo/eac;
.source "SourceFile"


# static fields
.field private static volatile mInstantce:Lcom/huawei/operation/operation/PluginOperation;


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/huawei/operation/operation/PluginOperation;->mContext:Landroid/content/Context;

    .line 33
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;
    .locals 4

    .line 21
    sget-object v0, Lcom/huawei/operation/operation/PluginOperation;->mInstantce:Lcom/huawei/operation/operation/PluginOperation;

    if-nez v0, :cond_1

    .line 22
    const-class v2, Lcom/huawei/operation/operation/PluginOperation;

    monitor-enter v2

    .line 23
    :try_start_0
    sget-object v0, Lcom/huawei/operation/operation/PluginOperation;->mInstantce:Lcom/huawei/operation/operation/PluginOperation;

    if-nez v0, :cond_0

    .line 24
    new-instance v0, Lcom/huawei/operation/operation/PluginOperation;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/operation/operation/PluginOperation;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/operation/operation/PluginOperation;->mInstantce:Lcom/huawei/operation/operation/PluginOperation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 28
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/operation/operation/PluginOperation;->mInstantce:Lcom/huawei/operation/operation/PluginOperation;

    return-object v0
.end method


# virtual methods
.method public backToActivityListPage()V
    .locals 0

    .line 75
    invoke-static {}, Lcom/huawei/operation/activity/WebViewActivity;->backToActivityListPage()V

    .line 76
    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 91
    invoke-static {}, Lcom/huawei/operation/activity/WebViewActivity;->getActivity()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public getActivityFlag()Z
    .locals 1

    .line 107
    invoke-static {}, Lcom/huawei/operation/activity/WebViewActivity;->getActiveFlag()Z

    move-result v0

    return v0
.end method

.method public setActivity(Landroid/app/Activity;)V
    .locals 0

    .line 83
    invoke-static {p1}, Lcom/huawei/operation/activity/WebViewActivity;->setActivity(Landroid/app/Activity;)V

    .line 84
    return-void
.end method

.method public setActivityFlag(Z)V
    .locals 0

    .line 99
    invoke-static {p1}, Lcom/huawei/operation/activity/WebViewActivity;->setActiveFlag(Z)V

    .line 100
    return-void
.end method

.method public startOperationWebPage(Ljava/lang/String;)V
    .locals 3

    .line 40
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/operation/operation/PluginOperation;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 41
    const-string v0, "url"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 43
    iget-object v0, p0, Lcom/huawei/operation/operation/PluginOperation;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 44
    return-void
.end method

.method public startOperationWebPageForResult(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 52
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v1, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 53
    const-string v0, "url"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 54
    const/16 v0, 0xa

    invoke-virtual {p1, v1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 55
    return-void
.end method

.method public startOperationWebPageForResult(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 64
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v1, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 65
    const-string v0, "url"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 66
    const-string v0, "title"

    invoke-virtual {v1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    const/16 v0, 0xa

    invoke-virtual {p1, v1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 68
    return-void
.end method
