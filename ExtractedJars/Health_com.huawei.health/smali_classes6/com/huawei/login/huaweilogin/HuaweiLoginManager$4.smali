.class final Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasLoginAccount(Landroid/content/Context;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$latch:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 316
    iput-object p1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;->val$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 319
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;->val$context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    .line 321
    const-string v0, "content://com.huawei.hwid.api.provider/has_login"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 322
    const/4 v8, 0x0

    .line 325
    move-object v0, v6

    move-object v1, v7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 326
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 327
    const-string v0, "hasLogin"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    .line 328
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const/4 v0, 0x1

    if-ne v0, v9, :cond_0

    .line 331
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setHasLogin(Z)V

    goto :goto_0

    .line 334
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setHasLogin(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 341
    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 343
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 346
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 349
    goto :goto_2

    .line 347
    :catch_0
    move-exception v9

    .line 348
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 350
    goto :goto_2

    .line 337
    :catch_1
    move-exception v9

    .line 338
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setHasLogin(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 341
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 343
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 346
    :cond_3
    :try_start_3
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 349
    goto :goto_2

    .line 347
    :catch_2
    move-exception v9

    .line 348
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 350
    goto :goto_2

    .line 341
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 343
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 346
    :cond_4
    :try_start_4
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 349
    goto :goto_1

    .line 347
    :catch_3
    move-exception v11

    .line 348
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 350
    :goto_1
    throw v10

    .line 351
    :goto_2
    return-void
.end method
