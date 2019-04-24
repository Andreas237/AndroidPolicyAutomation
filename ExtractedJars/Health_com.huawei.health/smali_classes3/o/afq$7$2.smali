.class Lo/afq$7$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afq$7;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/afq$7;


# direct methods
.method constructor <init>(Lo/afq$7;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lo/afq$7$2;->a:Lo/afq$7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 13

    .line 441
    const v0, 0x30d40

    if-ne p1, v0, :cond_7

    .line 442
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager toDownloadFileList resultcode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/agx;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v1, v1, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v1}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 444
    sget-object v5, Lo/agx;->a:Ljava/lang/String;

    .line 445
    iget-object v0, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v0, v0, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v0}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v0, v0, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v0}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 446
    sget-object v5, Lo/agx;->c:Ljava/lang/String;

    .line 448
    :cond_0
    iget-object v0, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v0, v0, Lo/afq$7;->a:Lo/afq;

    invoke-static {v0}, Lo/afq;->e(Lo/afq;)Lo/aey;

    move-result-object v0

    iget-object v1, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v1, v1, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v1}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aey;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 449
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    const-string v1, "SHA-256"

    invoke-virtual {v0, v4, v1}, Lo/afn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 450
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 451
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resultObject.getFileId():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v3, v3, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v3}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v0, v0, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v0}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 454
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "libs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "am16.dex"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 455
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 456
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 457
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    iget-object v1, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v1, v1, Lo/afq$7;->a:Lo/afq;

    invoke-static {v1}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v1

    invoke-virtual {v0, v4, v5, v1}, Lo/afn;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 458
    iget-object v0, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v0, v0, Lo/afq$7;->a:Lo/afq;

    iget-object v1, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v1, v1, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v1}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/afq;->d(Lo/afq;Ljava/lang/String;)V

    goto :goto_1

    .line 460
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager toDownloadFileList HonourDeviceConstants DEVICE_GOODIX Resource exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    new-instance v10, Ljava/io/File;

    sget-object v0, Lo/ahd;->c:Ljava/lang/String;

    invoke-direct {v10, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 463
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 464
    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    move-result v11

    .line 465
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HonourDeviceConstants DEVICE_GOODIX Cache Path Make"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    :cond_2
    :try_start_0
    sget-object v0, Lo/ahd;->e:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v4, v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 471
    goto :goto_0

    .line 469
    :catch_0
    move-exception v11

    .line 470
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager toDownloadFileList cp fail:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    :goto_0
    return-void

    .line 474
    :goto_1
    goto/16 :goto_2

    .line 475
    :cond_3
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    iget-object v1, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v1, v1, Lo/afq$7;->a:Lo/afq;

    invoke-static {v1}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v1

    invoke-virtual {v0, v4, v5, v1}, Lo/afn;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 476
    iget-object v0, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v0, v0, Lo/afq$7;->a:Lo/afq;

    iget-object v1, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v1, v1, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v1}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/afq;->d(Lo/afq;Ljava/lang/String;)V

    goto :goto_2

    .line 479
    :cond_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the download check hash is fail, hash_value="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " hash_value_zip="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 481
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 482
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v9

    .line 483
    if-eqz v9, :cond_5

    .line 484
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the zip file hash value is wrong, so delete zhe zip file success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 486
    :cond_5
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the zip file hash value is wrong, so delete zhe zip file fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    :cond_6
    :goto_2
    goto :goto_3

    .line 491
    :cond_7
    sget-object v4, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 492
    :try_start_1
    iget-object v0, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v0, v0, Lo/afq$7;->a:Lo/afq;

    invoke-static {v0}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 493
    iget-object v0, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v0, v0, Lo/afq$7;->a:Lo/afq;

    invoke-static {v0}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v0

    iget-object v1, p0, Lo/afq$7$2;->a:Lo/afq$7;

    iget-object v1, v1, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v1}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lo/aff;->onResult(ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 495
    :cond_8
    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v12

    monitor-exit v4

    throw v12

    .line 497
    :goto_3
    return-void
.end method
