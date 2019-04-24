.class public Lcom/huawei/openalliance/ad/n/b;
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

    iput-object v0, p0, Lcom/huawei/openalliance/ad/n/b;->c:Lcom/huawei/openalliance/ad/k/b/d;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/b;->c:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, p2}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 7

    const-string v0, "AppEnterAction"

    const-string v1, "handle app enter action"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/b;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

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

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getApkInfo()Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;

    move-result-object v5

    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPackageName()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/b;->a:Landroid/content/Context;

    invoke-static {v0, v6}, Lcom/huawei/openalliance/ad/utils/c;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    :cond_0
    if-eqz v4, :cond_1

    const-string v0, "app"

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/n/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/b;->c:Lcom/huawei/openalliance/ad/k/b/d;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/k/b/d;->i(Ljava/lang/Integer;)V

    const/4 v0, 0x1

    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/n/b;->b()Z

    move-result v0

    return v0
.end method
