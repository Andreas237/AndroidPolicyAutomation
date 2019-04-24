.class public Lcom/huawei/openalliance/ad/n/f;
.super Lcom/huawei/openalliance/ad/n/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/n/a/a;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/f;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/f;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/b;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/f;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/n/f;->b()Z

    move-result v0

    return v0

    :cond_1
    const-string v0, "OuterWebAction"

    const-string v1, "handle outer browser action"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/f;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getDetailUrl_()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/f;->a:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_2

    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/f;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/b;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "OuterWebAction"

    const-string v1, "handleUri, use default browser"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.android.browser"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/f;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    const/high16 v0, 0x10000

    invoke-virtual {v5, v2, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/f;->a:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string v0, "web"

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/n/f;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :cond_4
    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "OuterWebAction"

    const-string v1, "fail to open uri"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/n/f;->b()Z

    move-result v0

    return v0
.end method
