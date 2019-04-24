.class Lcom/shopkick/app/presence/AudioThreadController$AudioThread;
.super Ljava/lang/Thread;
.source "AudioThreadController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/AudioThreadController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioThread"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/AudioThreadController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/AudioThreadController;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method private processAudioThreadEventQueue()V
    .locals 1

    .line 361
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$1400(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$1400(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 362
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$1400(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Message;

    :goto_0
    if-eqz v0, :cond_2

    .line 364
    invoke-virtual {v0}, Landroid/os/Message;->getCallback()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 366
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 368
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 370
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$1400(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Message;

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_2
    return-void
.end method

.method private queueRunLoop()V
    .locals 1

    .line 320
    :catch_0
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$300(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 321
    invoke-direct {p0}, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->processAudioThreadEventQueue()V

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$300(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 324
    :cond_0
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 325
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    .line 326
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    :goto_1
    return-void
.end method

.method private readAudioFile()V
    .locals 5

    const/4 v0, 0x0

    .line 426
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    .line 427
    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 428
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1700(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 429
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 430
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v2

    :catch_0
    :cond_0
    const/4 v1, 0x0

    move v2, v1

    .line 439
    :goto_0
    :try_start_1
    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1100(Lcom/shopkick/app/presence/AudioThreadController;)[S

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v4

    aput-short v4, v3, v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 446
    :catch_1
    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v4}, Lcom/shopkick/app/presence/AudioThreadController;->access$1100(Lcom/shopkick/app/presence/AudioThreadController;)[S

    move-result-object v4

    invoke-virtual {v3, v4, v2, v1}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->audioReceived([SIZ)V

    .line 449
    :try_start_2
    invoke-virtual {v0}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    .line 451
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private regularRunLoop(Z)V
    .locals 4

    .line 333
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$600(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableUltrasonicWalkins:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 337
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$300(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 341
    invoke-direct {p0}, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->processAudioThreadEventQueue()V

    .line 342
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$800(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/SKAudioRecord;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$1100(Lcom/shopkick/app/presence/AudioThreadController;)[S

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1000(Lcom/shopkick/app/presence/AudioThreadController;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/SKAudioRecord;->read([SII)I

    move-result v0

    .line 344
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$300(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    .line 346
    const-class v0, Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "read returned ERROR_INVALID_OPERATION"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    .line 348
    const-class v0, Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "read returned ERROR_BAD_VALUE"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    if-lez v0, :cond_0

    .line 354
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$1100(Lcom/shopkick/app/presence/AudioThreadController;)[S

    move-result-object v2

    invoke-virtual {v1, v2, v0, p1}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->audioReceived([SIZ)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private writeAudioToFile()V
    .locals 5

    const/4 v0, 0x0

    .line 377
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$1500(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->canWrite()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 378
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$1500(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1300(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 379
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 380
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 386
    :catch_0
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$300(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 387
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$800(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/SKAudioRecord;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$1100(Lcom/shopkick/app/presence/AudioThreadController;)[S

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1600(Lcom/shopkick/app/presence/AudioThreadController;)I

    move-result v3

    iget-object v4, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v4}, Lcom/shopkick/app/presence/AudioThreadController;->access$1000(Lcom/shopkick/app/presence/AudioThreadController;)I

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/shopkick/app/presence/SKAudioRecord;->read([SII)I

    move-result v1

    .line 388
    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$300(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x3

    if-ne v1, v2, :cond_1

    .line 390
    const-class v1, Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "read returned ERROR_INVALID_OPERATION"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const/4 v2, -0x2

    if-ne v1, v2, :cond_2

    .line 392
    const-class v1, Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "read returned ERROR_BAD_VALUE"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    if-lez v1, :cond_0

    .line 398
    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$1600(Lcom/shopkick/app/presence/AudioThreadController;)I

    move-result v3

    add-int/2addr v3, v1

    invoke-static {v2, v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1602(Lcom/shopkick/app/presence/AudioThreadController;I)I

    .line 400
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$1600(Lcom/shopkick/app/presence/AudioThreadController;)I

    move-result v1

    const v2, 0x32000

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    .line 401
    :goto_1
    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$1600(Lcom/shopkick/app/presence/AudioThreadController;)I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 403
    :try_start_1
    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$1100(Lcom/shopkick/app/presence/AudioThreadController;)[S

    move-result-object v2

    aget-short v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeShort(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v2

    .line 405
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 416
    :cond_3
    :try_start_2
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 417
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    .line 419
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :goto_3
    return-void
.end method


# virtual methods
.method public isReady(J)Z
    .locals 2

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$400(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 309
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    monitor-enter v0

    .line 311
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 314
    :catch_0
    :goto_0
    :try_start_1
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 316
    :cond_0
    :goto_2
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {p1}, Lcom/shopkick/app/presence/AudioThreadController;->access$400(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result p1

    return p1
.end method

.method public run()V
    .locals 7

    .line 244
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$200(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 251
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$300(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$402(Lcom/shopkick/app/presence/AudioThreadController;Z)Z

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$502(Lcom/shopkick/app/presence/AudioThreadController;Z)Z

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$600(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$600(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$600(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useStereoAudio:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_0
    move v0, v1

    .line 260
    :goto_1
    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$700(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/AudioRecordFactory;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/shopkick/app/presence/AudioRecordFactory;->initializeAudioRecord(Z)Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;

    move-result-object v2

    .line 261
    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    iget-object v4, v2, Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;->ar:Lcom/shopkick/app/presence/SKAudioRecord;

    invoke-static {v3, v4}, Lcom/shopkick/app/presence/AudioThreadController;->access$802(Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/presence/SKAudioRecord;)Lcom/shopkick/app/presence/SKAudioRecord;

    .line 262
    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$800(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/SKAudioRecord;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$800(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/SKAudioRecord;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/presence/SKAudioRecord;->getState()I

    move-result v3

    if-ne v3, v4, :cond_1

    .line 263
    iget-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    iget v2, v2, Lcom/shopkick/app/presence/AudioRecordFactory$AudioRecordAndBufferSize;->bufferSize:I

    invoke-static {v3, v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$902(Lcom/shopkick/app/presence/AudioThreadController;I)I

    .line 264
    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$900(Lcom/shopkick/app/presence/AudioThreadController;)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-static {v2, v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1002(Lcom/shopkick/app/presence/AudioThreadController;I)I

    .line 268
    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$900(Lcom/shopkick/app/presence/AudioThreadController;)I

    move-result v3

    new-array v3, v3, [S

    invoke-static {v2, v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1102(Lcom/shopkick/app/presence/AudioThreadController;[S)[S

    .line 270
    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2, v4}, Lcom/shopkick/app/presence/AudioThreadController;->access$402(Lcom/shopkick/app/presence/AudioThreadController;Z)Z

    .line 273
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$400(Lcom/shopkick/app/presence/AudioThreadController;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 274
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$800(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/SKAudioRecord;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/presence/SKAudioRecord;->startRecording()V

    .line 276
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v1

    const-wide v4, 0x40e5888000000000L    # 44100.0

    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v2}, Lcom/shopkick/app/presence/AudioThreadController;->access$1200(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    move-result-object v2

    iget-object v6, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v6}, Lcom/shopkick/app/presence/AudioThreadController;->access$1300(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v4, v5, v2, v6}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->initialize(DLcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;Ljava/lang/String;)V

    .line 278
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v2

    monitor-enter v2

    .line 279
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 280
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    invoke-direct {p0, v0}, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->regularRunLoop(Z)V

    .line 290
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$800(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/SKAudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/SKAudioRecord;->stop()V

    .line 291
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->reset()V

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$800(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/SKAudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/SKAudioRecord;->release()V

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0, v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$802(Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/presence/SKAudioRecord;)Lcom/shopkick/app/presence/SKAudioRecord;

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0, v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1102(Lcom/shopkick/app/presence/AudioThreadController;[S)[S

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 280
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 296
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0, v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$802(Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/presence/SKAudioRecord;)Lcom/shopkick/app/presence/SKAudioRecord;

    .line 297
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0, v3}, Lcom/shopkick/app/presence/AudioThreadController;->access$1102(Lcom/shopkick/app/presence/AudioThreadController;[S)[S

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->access$302(Lcom/shopkick/app/presence/AudioThreadController;Z)Z

    .line 299
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0, v4}, Lcom/shopkick/app/presence/AudioThreadController;->access$502(Lcom/shopkick/app/presence/AudioThreadController;Z)Z

    .line 303
    :cond_3
    :goto_2
    invoke-direct {p0}, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->queueRunLoop()V

    goto/16 :goto_0

    :cond_4
    return-void
.end method
