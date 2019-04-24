.class public Lcom/huawei/openalliance/ad/m/a/f;
.super Lcom/huawei/openalliance/ad/m/a/b;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/m/a/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/m/a/b;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/huawei/openalliance/ad/m/a/a;

    invoke-direct {v0, p1}, Lcom/huawei/openalliance/ad/m/a/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/m/a/f;->b:Lcom/huawei/openalliance/ad/m/a/a/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/f;->b:Lcom/huawei/openalliance/ad/m/a/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/m/a/a/a;->b()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/f;->b:Lcom/huawei/openalliance/ad/m/a/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/m/a/a/a;->a()V

    return-void
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/f;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->A()I

    move-result v0

    int-to-long v0, v0

    invoke-super {p0, v0, v1}, Lcom/huawei/openalliance/ad/m/a/b;->a(J)V

    return-void
.end method
