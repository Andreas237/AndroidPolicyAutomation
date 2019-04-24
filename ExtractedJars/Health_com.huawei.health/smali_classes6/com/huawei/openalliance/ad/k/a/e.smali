.class public abstract Lcom/huawei/openalliance/ad/k/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/a/g;


# instance fields
.field protected a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/a/e;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method protected abstract a()Ljava/lang/String;
.end method

.method protected abstract a(Lcom/huawei/openalliance/ad/beans/metadata/Content;)Z
.end method

.method public a(Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)Z
    .locals 6

    if-nez p3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/k/a/e;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "filterContents adType: %d contentid: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getContentid__()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0, p3}, Lcom/huawei/openalliance/ad/k/a/e;->a(Lcom/huawei/openalliance/ad/beans/metadata/Content;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/k/a/e;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "contentid %s is discarded"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getContentid__()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return v5
.end method
