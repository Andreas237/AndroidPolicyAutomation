.class Lcom/huawei/openalliance/ad/j/j$2;
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
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/j;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/j;Lcom/huawei/openalliance/ad/db/bean/SloganRecord;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/j$2;->b:Lcom/huawei/openalliance/ad/j/j;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/j$2;->a:Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j$2;->a:Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j$2;->a:Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getUrl_()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/j$2;->b:Lcom/huawei/openalliance/ad/j/j;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/j/j;->c(Lcom/huawei/openalliance/ad/j/j;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/j/j$2;->a:Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getCreativeType_()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/huawei/openalliance/ad/e/a/e;->c(I)J

    move-result-wide v1

    const-wide/16 v3, 0x400

    mul-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j$2;->a:Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getUrl_()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/j$2;->a:Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getSha256_()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/j$2;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
