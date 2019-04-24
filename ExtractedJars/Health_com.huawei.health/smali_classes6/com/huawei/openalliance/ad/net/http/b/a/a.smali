.class public abstract Lcom/huawei/openalliance/ad/net/http/b/a/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/net/http/b/a/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:Ljava/lang/Object;>Ljava/lang/Object;Lcom/huawei/openalliance/ad/net/http/b/a/d<TP;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/lang/Object;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;)Ljava/lang/String;"
        }
    .end annotation
.end method

.method public a(Ljava/lang/Object;Lcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;Lcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/String;"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/huawei/openalliance/ad/net/http/b/a;->a(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/net/http/b/a/a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
