.class public Lcom/huawei/openalliance/ad/m/a/e;
.super Lcom/huawei/openalliance/ad/m/a/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/m/a/b;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->C()I

    move-result v0

    int-to-long v0, v0

    invoke-super {p0, v0, v1}, Lcom/huawei/openalliance/ad/m/a/b;->a(J)V

    return-void
.end method
