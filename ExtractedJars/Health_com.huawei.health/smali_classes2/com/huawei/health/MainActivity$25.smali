.class Lcom/huawei/health/MainActivity$25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 1277
    iput-object p1, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1280
    iget-object v0, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->n(Lcom/huawei/health/MainActivity;)Lo/alh;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1281
    iget-object v0, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    new-instance v1, Lo/alh;

    iget-object v2, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v2}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lo/alh;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->d(Lcom/huawei/health/MainActivity;Lo/alh;)Lo/alh;

    .line 1283
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->n(Lcom/huawei/health/MainActivity;)Lo/alh;

    move-result-object v0

    invoke-virtual {v0}, Lo/alh;->a()Z

    move-result v4

    .line 1284
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdvDialog  queryIsShowBindDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1285
    if-nez v4, :cond_2

    .line 1287
    iget-object v0, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2719

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_first_in"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1289
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdvDialog isFirstIn = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1290
    const-string v0, "health_is_first_in"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1291
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdvDialog getHomeDialogMessage after wechat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1292
    iget-object v0, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->o(Lcom/huawei/health/MainActivity;)Lo/alj;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1293
    iget-object v0, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->o(Lcom/huawei/health/MainActivity;)Lo/alj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->f(Lcom/huawei/health/MainActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/alj;->a(Landroid/os/Handler;)V

    .line 1294
    invoke-static {}, Lcom/huawei/health/MainActivity;->f()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 1295
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity$25;->b:Lcom/huawei/health/MainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->a(Lcom/huawei/health/MainActivity;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1296
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    :goto_0
    goto :goto_1

    .line 1298
    :cond_1
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdvDialog adInteactor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1302
    :cond_2
    :goto_1
    return-void
.end method
