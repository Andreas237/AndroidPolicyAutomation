.class Lcom/huawei/openalliance/ad/j/l$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/l;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Lcom/huawei/openalliance/ad/constant/AdLoadMode;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/j/l;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/l;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/l$1;->a:Lcom/huawei/openalliance/ad/j/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/constant/AdLoadMode;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/l$1;->a:Lcom/huawei/openalliance/ad/j/l;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/j/l;->a(Lcom/huawei/openalliance/ad/j/l;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->c()Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/l$1;->a()Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    move-result-object v0

    return-object v0
.end method
