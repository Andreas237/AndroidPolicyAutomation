.class public Lcom/huawei/openalliance/ad/j/d;
.super Lcom/huawei/openalliance/ad/j/k;


# direct methods
.method public constructor <init>(Lcom/huawei/openalliance/ad/e/a/e;Lcom/huawei/openalliance/ad/f/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/j/k;-><init>(Lcom/huawei/openalliance/ad/e/a/e;Lcom/huawei/openalliance/ad/f/a;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 6

    new-instance v0, Lcom/huawei/openalliance/ad/j/d$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/d$1;-><init>(Lcom/huawei/openalliance/ad/j/d;)V

    const-wide/16 v1, 0x12c

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    new-instance v0, Lcom/huawei/openalliance/ad/j/d$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/d$2;-><init>(Lcom/huawei/openalliance/ad/j/d;)V

    const/16 v1, 0x7d0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {p0, v3, v4}, Lcom/huawei/openalliance/ad/j/d;->b(J)V

    int-to-long v0, v5

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/j/d;->a(J)V

    return-void
.end method
