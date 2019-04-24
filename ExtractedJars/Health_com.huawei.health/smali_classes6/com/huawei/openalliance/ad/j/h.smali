.class public Lcom/huawei/openalliance/ad/j/h;
.super Lcom/huawei/openalliance/ad/j/g;

# interfaces
.implements Lcom/huawei/openalliance/ad/j/a/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/j/g<Lcom/huawei/openalliance/ad/views/interfaces/a;>;Lcom/huawei/openalliance/ad/j/a/d;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/j/g;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/e;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)V
    .locals 2

    const-string v0, "PPSGifViewPresenter"

    const-string v1, "onMaterialLoaded"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/h;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/views/interfaces/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1

    invoke-super {p0}, Lcom/huawei/openalliance/ad/j/g;->c()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/h;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/a;->e()V

    return-void
.end method
