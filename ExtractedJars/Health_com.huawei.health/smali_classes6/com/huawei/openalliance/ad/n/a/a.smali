.class public abstract Lcom/huawei/openalliance/ad/n/a/a;
.super Ljava/lang/Object;


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

.field private c:Ljava/lang/String;

.field private d:Lcom/huawei/openalliance/ad/n/a/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/n/a/a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/n/a/a;->c:Ljava/lang/String;

    iput-object p1, p0, Lcom/huawei/openalliance/ad/n/a/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/n/a/a;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/n/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/n/a/a;->d:Lcom/huawei/openalliance/ad/n/a/a;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/n/a/a;->c:Ljava/lang/String;

    return-void
.end method

.method public abstract a()Z
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a/a;->d:Lcom/huawei/openalliance/ad/n/a/a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a/a;->d:Lcom/huawei/openalliance/ad/n/a/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/n/a/a;->a()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a/a;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a/a;->d:Lcom/huawei/openalliance/ad/n/a/a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a/a;->d:Lcom/huawei/openalliance/ad/n/a/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/n/a/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/n/a/a;->c:Ljava/lang/String;

    return-object v0
.end method
