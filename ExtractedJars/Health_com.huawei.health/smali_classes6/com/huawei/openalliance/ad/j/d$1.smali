.class Lcom/huawei/openalliance/ad/j/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/d;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/Long;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/j/d;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/d;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/d$1;->a:Lcom/huawei/openalliance/ad/j/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/d$1;->a:Lcom/huawei/openalliance/ad/j/d;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/d;->a:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/d$1;->a()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
