.class Lcom/huawei/hwid/api/common/a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/a;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/a;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/a;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/huawei/hwid/api/common/a$2;->a:Lcom/huawei/hwid/api/common/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 246
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$2;->a:Lcom/huawei/hwid/api/common/a;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->f(Lcom/huawei/hwid/api/common/a;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v4

    .line 247
    const-string v0, "AIDLClientManager"

    const-string v1, "startService await"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    if-nez v4, :cond_0

    .line 249
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$2;->a:Lcom/huawei/hwid/api/common/a;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->g(Lcom/huawei/hwid/api/common/a;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    :cond_0
    goto :goto_0

    .line 251
    :catch_0
    move-exception v4

    .line 252
    const-string v0, "AIDLClientManager"

    const-string v1, "serviceStartDownLatch InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$2;->a:Lcom/huawei/hwid/api/common/a;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->g(Lcom/huawei/hwid/api/common/a;)V

    .line 255
    :goto_0
    return-void
.end method
