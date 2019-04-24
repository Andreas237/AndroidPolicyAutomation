.class Lo/ale$25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->g(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ale;

.field final synthetic d:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lo/ale;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1761
    iput-object p1, p0, Lo/ale$25;->c:Lo/ale;

    iput-object p2, p0, Lo/ale$25;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProcessed(Lo/ddb;)V
    .locals 5

    .line 1764
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: loginByAccountType = 3 accountWear siteId 222 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$25;->c:Lo/ale;

    invoke-static {v2}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1765
    iget-object v0, p0, Lo/ale$25;->c:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->updateAppTypeBySiteID(I)V

    .line 1767
    :try_start_0
    iget-object v0, p0, Lo/ale$25;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1770
    goto :goto_0

    .line 1768
    :catch_0
    move-exception v4

    .line 1769
    iget-object v0, p0, Lo/ale$25;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1771
    :goto_0
    return-void
.end method
