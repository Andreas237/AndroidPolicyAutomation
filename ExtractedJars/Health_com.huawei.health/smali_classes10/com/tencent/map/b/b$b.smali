.class public final Lcom/tencent/map/b/b$b;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/map/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private synthetic a:Lcom/tencent/map/b/b;


# direct methods
.method public constructor <init>(Lcom/tencent/map/b/b;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    iget-object v0, v0, Lcom/tencent/map/b/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/map/b/j;->a([B)[B

    move-result-object v5

    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/tencent/map/b/b;->a(Lcom/tencent/map/b/b;Z)Z

    const-string v0, "http://ls.map.soso.com/deflect?c=1"

    const-string v1, "SOSO MAP LBS SDK"

    invoke-static {v0, v1, v5}, Lcom/tencent/map/b/b;->a(Ljava/lang/String;Ljava/lang/String;[B)Lcom/tencent/map/b/n;

    move-result-object v5

    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/map/b/b;->a(Lcom/tencent/map/b/b;Z)Z

    iget-object v0, v5, Lcom/tencent/map/b/n;->a:[B

    invoke-static {v0}, Lcom/tencent/map/b/j;->b([B)[B

    move-result-object v6

    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    iget-object v1, v5, Lcom/tencent/map/b/n;->b:Ljava/lang/String;

    invoke-static {v0, v6, v1}, Lcom/tencent/map/b/b;->a(Lcom/tencent/map/b/b;[BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v5, 0x0

    :goto_0
    add-int/lit8 v5, v5, 0x1

    const/4 v0, 0x3

    if-gt v5, v0, :cond_0

    const-wide/16 v0, 0x7d0

    :try_start_1
    invoke-static {v0, v1}, Lcom/tencent/map/b/b$b;->sleep(J)V

    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    iget-object v0, v0, Lcom/tencent/map/b/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/map/b/j;->a([B)[B

    move-result-object v6

    const-string v0, "http://ls.map.soso.com/deflect?c=1"

    const-string v1, "SOSO MAP LBS SDK"

    invoke-static {v0, v1, v6}, Lcom/tencent/map/b/b;->a(Ljava/lang/String;Ljava/lang/String;[B)Lcom/tencent/map/b/n;

    move-result-object v6

    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/map/b/b;->a(Lcom/tencent/map/b/b;Z)Z

    iget-object v0, v6, Lcom/tencent/map/b/n;->a:[B

    invoke-static {v0}, Lcom/tencent/map/b/j;->b([B)[B

    move-result-object v7

    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    iget-object v1, v6, Lcom/tencent/map/b/n;->b:Ljava/lang/String;

    invoke-static {v0, v7, v1}, Lcom/tencent/map/b/b;->a(Lcom/tencent/map/b/b;[BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/map/b/b;->a(Lcom/tencent/map/b/b;Z)Z

    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    invoke-static {v0}, Lcom/tencent/map/b/b;->a(Lcom/tencent/map/b/b;)Lcom/tencent/map/b/b$a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/b$b;->a:Lcom/tencent/map/b/b;

    invoke-static {v0}, Lcom/tencent/map/b/b;->a(Lcom/tencent/map/b/b;)Lcom/tencent/map/b/b$a;

    move-result-object v0

    const-wide v1, 0x4076800000000000L    # 360.0

    const-wide v3, 0x4076800000000000L    # 360.0

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/tencent/map/b/b$a;->a(DD)V

    :cond_1
    return-void
.end method
