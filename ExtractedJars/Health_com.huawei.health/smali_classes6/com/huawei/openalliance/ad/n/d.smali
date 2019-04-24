.class public Lcom/huawei/openalliance/ad/n/d;
.super Lcom/huawei/openalliance/ad/n/a/a;


# instance fields
.field private final c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/n/a/a;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    iput-boolean p3, p0, Lcom/huawei/openalliance/ad/n/d;->c:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/d;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/n/d;->b()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "InnerWebAction"

    const-string v1, "handle inner web action"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/d;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/n/d;->a:Landroid/content/Context;

    iget-boolean v2, p0, Lcom/huawei/openalliance/ad/n/d;->c:Z

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;-><init>(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Landroid/content/Context;Z)V

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getLandingUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/n/d;->b()Z

    move-result v0

    return v0

    :cond_1
    const-string v0, "web"

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/n/d;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/huawei/openalliance/ad/n/d;->a(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)Z

    move-result v0

    return v0
.end method

.method protected a(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)Z
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/d;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/inter/a;->a()Lcom/huawei/openalliance/ad/inter/listeners/LandingPageAction;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/d;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/b;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v3, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/d;->a:Landroid/content/Context;

    invoke-interface {v2, v0, p1}, Lcom/huawei/openalliance/ad/inter/listeners/LandingPageAction;->openLandingPage(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "InnerWebAction"

    const-string v1, "openLandingPage Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0, v4}, Lcom/huawei/openalliance/ad/g/c;->a(ILjava/lang/Throwable;)V

    new-instance v5, Lcom/huawei/openalliance/ad/d/b;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/d;->a:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/openalliance/ad/d/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v4}, Lcom/huawei/openalliance/ad/d/b;->a(Ljava/lang/Throwable;)V

    :goto_0
    if-nez v3, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/n/d;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/d;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/b;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/d;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/d;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/a/a;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)V

    const/4 v0, 0x1

    return v0

    :cond_4
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/n/d;->b()Z

    move-result v0

    return v0
.end method
