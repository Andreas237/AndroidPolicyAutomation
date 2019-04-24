.class public Lcom/huawei/openalliance/ad/j/i;
.super Lcom/huawei/openalliance/ad/j/g;

# interfaces
.implements Lcom/huawei/openalliance/ad/j/a/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/j/g<Lcom/huawei/openalliance/ad/views/interfaces/b;>;Lcom/huawei/openalliance/ad/j/a/e;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/j/g;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/e;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)V
    .locals 2

    const-string v0, "PPSImageViewPresenter"

    const-string v1, "onMaterialLoaded - begin to load image"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/i;->a:Landroid/content/Context;

    new-instance v1, Lcom/huawei/openalliance/ad/j/i$1;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/j/i$1;-><init>(Lcom/huawei/openalliance/ad/j/i;)V

    invoke-static {v0, p1, v1}, Lcom/huawei/openalliance/ad/utils/o;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/openalliance/ad/utils/o$a;)V

    return-void
.end method
