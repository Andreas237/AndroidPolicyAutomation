.class Lcom/huawei/openalliance/ad/j/j$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/j;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/openalliance/ad/j/j;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/j;I)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/j$3;->b:Lcom/huawei/openalliance/ad/j/j;

    iput p2, p0, Lcom/huawei/openalliance/ad/j/j$3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j$3;->b:Lcom/huawei/openalliance/ad/j/j;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/j/j;->d(Lcom/huawei/openalliance/ad/j/j;)Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/j/j$3;->a:I

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/o;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/j$3;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
