.class public abstract Lcom/huawei/openalliance/ad/net/http/b/b/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/net/http/b/b/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:Ljava/lang/Object;>Ljava/lang/Object;Lcom/huawei/openalliance/ad/net/http/b/b/h<TR;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/io/InputStream;JLcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/io/InputStream;JLcom/huawei/openalliance/ad/net/http/b/a;)TR;"
        }
    .end annotation

    invoke-static {p2}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/net/http/b/b/a;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz p5, :cond_0

    invoke-interface {p5, v1}, Lcom/huawei/openalliance/ad/net/http/b/a;->a(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method protected abstract a(Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TR;"
        }
    .end annotation
.end method
