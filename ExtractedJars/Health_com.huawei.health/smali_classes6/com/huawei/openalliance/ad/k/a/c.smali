.class public Lcom/huawei/openalliance/ad/k/a/c;
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

    const-string v0, "AppPromoteAdFilter"

    return-object v0
.end method

.method protected a(Lcom/huawei/openalliance/ad/beans/metadata/Content;)Z
    .locals 5

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getMetaData()Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/k/a/c;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "metaData is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getIntent__()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a/c;->a:Landroid/content/Context;

    invoke-static {v0, v3}, Lcom/huawei/openalliance/ad/utils/c;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    if-nez v4, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
