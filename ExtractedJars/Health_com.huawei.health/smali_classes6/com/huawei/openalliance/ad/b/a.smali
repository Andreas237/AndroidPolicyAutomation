.class public Lcom/huawei/openalliance/ad/b/a;
.super Lcom/huawei/openalliance/ad/b/b;


# instance fields
.field private a:Lcom/huawei/openalliance/ad/e/a/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/b/b;-><init>()V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/b/a;->a:Lcom/huawei/openalliance/ad/e/a/e;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/b/a;->a:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->j()I

    move-result v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/b/a;->a:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-lez v2, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/b/a;->a:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->k()I

    move-result v0

    if-lt v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/b/a;->b()Z

    move-result v0

    return v0
.end method
