.class Lcom/huawei/hwid/core/b/a/a$a;
.super Landroid/os/HandlerThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/huawei/hwid/core/b/a/a$b;

.field private b:Lcom/huawei/hwid/core/helper/handler/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/huawei/hwid/core/helper/handler/a;)V
    .locals 1

    .line 533
    invoke-direct {p0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 529
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a$a;->a:Lcom/huawei/hwid/core/b/a/a$b;

    .line 530
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a$a;->b:Lcom/huawei/hwid/core/helper/handler/a;

    .line 534
    iput-object p2, p0, Lcom/huawei/hwid/core/b/a/a$a;->b:Lcom/huawei/hwid/core/helper/handler/a;

    .line 535
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/hwid/core/b/a/a$b;
    .locals 4

    .line 544
    const/16 v2, 0x3e8

    .line 545
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a$a;->a:Lcom/huawei/hwid/core/b/a/a$b;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    move v0, v2

    add-int/lit8 v2, v2, -0x1

    if-lez v0, :cond_0

    .line 547
    const-wide/16 v0, 0x4

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/b/a/a$a;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 550
    goto :goto_0

    .line 548
    :catch_0
    move-exception v3

    .line 549
    const-string v0, "HttpRequest"

    const-string v1, "InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 550
    goto :goto_0

    .line 552
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a$a;->a:Lcom/huawei/hwid/core/b/a/a$b;

    return-object v0
.end method

.method protected onLooperPrepared()V
    .locals 2

    .line 539
    new-instance v0, Lcom/huawei/hwid/core/b/a/a$b;

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a$a;->b:Lcom/huawei/hwid/core/helper/handler/a;

    invoke-direct {v0, v1}, Lcom/huawei/hwid/core/b/a/a$b;-><init>(Lcom/huawei/hwid/core/helper/handler/a;)V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a$a;->a:Lcom/huawei/hwid/core/b/a/a$b;

    .line 540
    invoke-super {p0}, Landroid/os/HandlerThread;->onLooperPrepared()V

    .line 541
    return-void
.end method
