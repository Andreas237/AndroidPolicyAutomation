.class public Lcom/huawei/openalliance/ad/n/a;
.super Lcom/huawei/openalliance/ad/n/a/a;


# instance fields
.field private c:Lcom/huawei/openalliance/ad/k/b/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/n/a/a;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    new-instance v0, Lcom/huawei/openalliance/ad/k/c;

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v1

    invoke-static {p1, v1}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/n/a;->c:Lcom/huawei/openalliance/ad/k/b/d;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a;->c:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, p2}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method private d()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getMetaData_()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getApkInfo()Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;

    move-result-object v5

    if-eqz v5, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a;->a:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/c;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v6

    if-eqz v6, :cond_0

    const/4 v4, 0x1

    :cond_0
    if-eqz v4, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a;->c:Lcom/huawei/openalliance/ad/k/b/d;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2, v5}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;Ljava/lang/Integer;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "AppAction"

    const-string v1, "recordOpenFailEvent IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "AppAction"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "recordOpenFailEvent "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    const-string v0, "AppAction"

    const-string v1, "handle app action"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/n/a;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getIntentUri_()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/c;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a;->a:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string v0, "app"

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/n/a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a;->c:Lcom/huawei/openalliance/ad/k/b/d;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTSUCCESS:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;Ljava/lang/Integer;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const-string v0, "AppAction"

    const-string v1, "cannot find target activity"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "AppAction"

    const-string v1, "activity not exist"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v0, "AppAction"

    const-string v1, "handle intent url fail"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/n/a;->d()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/n/a;->b()Z

    move-result v0

    return v0
.end method
