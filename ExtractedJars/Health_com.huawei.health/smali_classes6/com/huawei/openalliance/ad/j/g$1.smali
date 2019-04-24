.class Lcom/huawei/openalliance/ad/j/g$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/g;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:Z

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/openalliance/ad/j/g;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/g;Ljava/lang/String;JZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/g$1;->e:Lcom/huawei/openalliance/ad/j/g;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/g$1;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcom/huawei/openalliance/ad/j/g$1;->b:J

    iput-boolean p5, p0, Lcom/huawei/openalliance/ad/j/g$1;->c:Z

    iput-object p6, p0, Lcom/huawei/openalliance/ad/j/g$1;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g$1;->a:Ljava/lang/String;

    iget-wide v1, p0, Lcom/huawei/openalliance/ad/j/g$1;->b:J

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/j/g$1;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/g$1;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/g$1;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
