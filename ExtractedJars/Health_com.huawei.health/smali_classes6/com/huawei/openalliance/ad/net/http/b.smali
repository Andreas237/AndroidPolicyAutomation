.class public abstract Lcom/huawei/openalliance/ad/net/http/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/net/http/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/openalliance/ad/net/http/d;Lcom/huawei/openalliance/ad/net/http/a;ILjava/io/InputStream;JLcom/huawei/openalliance/ad/net/http/Response;)V
    .locals 7

    iget-object v0, p2, Lcom/huawei/openalliance/ad/net/http/a;->j:Lcom/huawei/openalliance/ad/net/http/b/b/d;

    if-eqz v0, :cond_0

    iget-object v6, p2, Lcom/huawei/openalliance/ad/net/http/a;->j:Lcom/huawei/openalliance/ad/net/http/b/b/d;

    goto :goto_0

    :cond_0
    iget-object v0, p2, Lcom/huawei/openalliance/ad/net/http/a;->b:Ljava/lang/Class;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/net/http/b/b/h$a;->a(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/b/b/h;

    move-result-object v6

    :goto_0
    move-object v0, v6

    move v1, p3

    move-object v2, p4

    move-wide v3, p5

    iget-object v5, p1, Lcom/huawei/openalliance/ad/net/http/d;->f:Lcom/huawei/openalliance/ad/net/http/b/a;

    invoke-interface/range {v0 .. v5}, Lcom/huawei/openalliance/ad/net/http/b/b/h;->a(ILjava/io/InputStream;JLcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p7, v0}, Lcom/huawei/openalliance/ad/net/http/Response;->a(Ljava/lang/Object;)V

    return-void
.end method
