.class Lcom/huawei/openalliance/ad/j/j$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/j;->b()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Lcom/huawei/openalliance/ad/db/bean/SloganRecord;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/j/j;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/j;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/j$1;->a:Lcom/huawei/openalliance/ad/j/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/db/bean/SloganRecord;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j$1;->a:Lcom/huawei/openalliance/ad/j/j;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/j/j;->b(Lcom/huawei/openalliance/ad/j/j;)Lcom/huawei/openalliance/ad/e/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/j$1;->a:Lcom/huawei/openalliance/ad/j/j;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/j/j;->a(Lcom/huawei/openalliance/ad/j/j;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/d;->a(I)Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/j$1;->a()Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    move-result-object v0

    return-object v0
.end method
