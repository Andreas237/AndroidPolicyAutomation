.class public Lcom/huawei/openalliance/ad/n/c;
.super Lcom/huawei/openalliance/ad/n/a/a;


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/huawei/openalliance/ad/k/b/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/n/a/a;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const-string v0, "appId"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->c:Ljava/lang/String;

    const-string v0, "thirdId"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->d:Ljava/lang/String;

    new-instance v0, Lcom/huawei/openalliance/ad/k/c;

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v1

    invoke-static {p1, v1}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->e:Lcom/huawei/openalliance/ad/k/b/d;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->e:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, p2}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method private d()V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->a:Landroid/content/Context;

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/c;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->e:Lcom/huawei/openalliance/ad/k/b/d;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2, v4}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 7

    const-string v0, "HwMarketAction"

    const-string v1, "handle hw app market action"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.appmarket.appmarket.intent.action.AppDetail.withid"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "appId"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/n/c;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "thirdId"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/n/c;->d:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->a:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const/high16 v0, 0x10000

    invoke-virtual {v5, v4, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string v0, "appmarket"

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/n/c;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/c;->e:Lcom/huawei/openalliance/ad/k/b/d;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTSUCCESS:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;Ljava/lang/Integer;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "HwMarketAction"

    const-string v1, "fail to open market detail page"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/n/c;->d()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/n/c;->b()Z

    move-result v0

    return v0
.end method
