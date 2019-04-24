.class public Lcom/huawei/openalliance/ad/k/a/d;
.super Lcom/huawei/openalliance/ad/k/a/e;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/a/e;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "AppPropagandaFilter"

    return-object v0
.end method

.method protected a(Lcom/huawei/openalliance/ad/beans/metadata/Content;)Z
    .locals 7

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getMetaData()Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/k/a/d;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "isNeedDiscard metaData is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getApkInfo()Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/k/a/d;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "isNeedDiscard apkInfo is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a/d;->a:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/c;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getIntent__()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a/d;->a:Landroid/content/Context;

    invoke-static {v0, v5}, Lcom/huawei/openalliance/ad/utils/c;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    if-nez v6, :cond_2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/k/a/d;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "isNeedDiscard intent check fail"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method
