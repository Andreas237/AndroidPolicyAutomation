.class Lcom/huawei/openalliance/ad/h/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/h/c;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/h/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/h/c;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/h/c$1;->a:Lcom/huawei/openalliance/ad/h/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/c$1;->a:Lcom/huawei/openalliance/ad/h/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/h/c;->b()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/c$1;->a:Lcom/huawei/openalliance/ad/h/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/h/c;->a(Lcom/huawei/openalliance/ad/h/c;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/c$1;->a()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    return-object v0
.end method
