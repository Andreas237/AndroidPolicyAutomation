.class public Lorg/apache/commons/io/input/Tailer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final DEFAULT_BUFSIZE:I = 0x1000

.field private static final DEFAULT_CHARSET:Ljava/nio/charset/Charset;

.field private static final DEFAULT_DELAY_MILLIS:I = 0x3e8

.field private static final RAF_MODE:Ljava/lang/String; = "r"


# instance fields
.field private final cset:Ljava/nio/charset/Charset;

.field private final delayMillis:J

.field private final end:Z

.field private final file:Ljava/io/File;

.field private final inbuf:[B

.field private final listener:Lorg/apache/commons/io/input/TailerListener;

.field private final reOpen:Z

.field private volatile run:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 129
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/io/input/Tailer;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/nio/charset/Charset;Lorg/apache/commons/io/input/TailerListener;JZZI)V
    .locals 1

    .line 253
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 169
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/io/input/Tailer;->run:Z

    .line 254
    iput-object p1, p0, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    .line 255
    iput-wide p4, p0, Lorg/apache/commons/io/input/Tailer;->delayMillis:J

    .line 256
    iput-boolean p6, p0, Lorg/apache/commons/io/input/Tailer;->end:Z

    .line 258
    new-array v0, p8, [B

    iput-object v0, p0, Lorg/apache/commons/io/input/Tailer;->inbuf:[B

    .line 261
    iput-object p3, p0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    .line 262
    invoke-interface {p3, p0}, Lorg/apache/commons/io/input/TailerListener;->init(Lorg/apache/commons/io/input/Tailer;)V

    .line 263
    iput-boolean p7, p0, Lorg/apache/commons/io/input/Tailer;->reOpen:Z

    .line 264
    iput-object p2, p0, Lorg/apache/commons/io/input/Tailer;->cset:Ljava/nio/charset/Charset;

    .line 265
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;)V
    .locals 2

    .line 177
    const-wide/16 v0, 0x3e8

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/apache/commons/io/input/Tailer;-><init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;J)V

    .line 178
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;J)V
    .locals 6

    .line 187
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lorg/apache/commons/io/input/Tailer;-><init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZ)V

    .line 188
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZ)V
    .locals 7

    .line 198
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    const/16 v6, 0x1000

    invoke-direct/range {v0 .. v6}, Lorg/apache/commons/io/input/Tailer;-><init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZI)V

    .line 199
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZI)V
    .locals 8

    .line 224
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    move v7, p6

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lorg/apache/commons/io/input/Tailer;-><init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZZI)V

    .line 225
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZZ)V
    .locals 8

    .line 211
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    move v6, p6

    const/16 v7, 0x1000

    invoke-direct/range {v0 .. v7}, Lorg/apache/commons/io/input/Tailer;-><init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZZI)V

    .line 212
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZZI)V
    .locals 9

    .line 238
    move-object v0, p0

    move-object v1, p1

    sget-object v2, Lorg/apache/commons/io/input/Tailer;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;

    move-object v3, p2

    move-wide v4, p3

    move v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lorg/apache/commons/io/input/Tailer;-><init>(Ljava/io/File;Ljava/nio/charset/Charset;Lorg/apache/commons/io/input/TailerListener;JZZI)V

    .line 239
    return-void
.end method

.method public static create(Ljava/io/File;Ljava/nio/charset/Charset;Lorg/apache/commons/io/input/TailerListener;JZZI)Lorg/apache/commons/io/input/Tailer;
    .locals 11

    .line 314
    new-instance v0, Lorg/apache/commons/io/input/Tailer;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lorg/apache/commons/io/input/Tailer;-><init>(Ljava/io/File;Ljava/nio/charset/Charset;Lorg/apache/commons/io/input/TailerListener;JZZI)V

    move-object v9, v0

    .line 315
    new-instance v10, Ljava/lang/Thread;

    invoke-direct {v10, v9}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 316
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 317
    invoke-virtual {v10}, Ljava/lang/Thread;->start()V

    .line 318
    return-object v9
.end method

.method public static create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;)Lorg/apache/commons/io/input/Tailer;
    .locals 3

    .line 371
    const-wide/16 v0, 0x3e8

    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v1, v2}, Lorg/apache/commons/io/input/Tailer;->create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZ)Lorg/apache/commons/io/input/Tailer;

    move-result-object v0

    return-object v0
.end method

.method public static create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;J)Lorg/apache/commons/io/input/Tailer;
    .locals 1

    .line 359
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lorg/apache/commons/io/input/Tailer;->create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZ)Lorg/apache/commons/io/input/Tailer;

    move-result-object v0

    return-object v0
.end method

.method public static create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZ)Lorg/apache/commons/io/input/Tailer;
    .locals 6

    .line 332
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    const/16 v5, 0x1000

    invoke-static/range {v0 .. v5}, Lorg/apache/commons/io/input/Tailer;->create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZI)Lorg/apache/commons/io/input/Tailer;

    move-result-object v0

    return-object v0
.end method

.method public static create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZI)Lorg/apache/commons/io/input/Tailer;
    .locals 7

    .line 279
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move v6, p5

    const/4 v5, 0x0

    invoke-static/range {v0 .. v6}, Lorg/apache/commons/io/input/Tailer;->create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZZI)Lorg/apache/commons/io/input/Tailer;

    move-result-object v0

    return-object v0
.end method

.method public static create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZZ)Lorg/apache/commons/io/input/Tailer;
    .locals 7

    .line 347
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move v5, p5

    const/16 v6, 0x1000

    invoke-static/range {v0 .. v6}, Lorg/apache/commons/io/input/Tailer;->create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZZI)Lorg/apache/commons/io/input/Tailer;

    move-result-object v0

    return-object v0
.end method

.method public static create(Ljava/io/File;Lorg/apache/commons/io/input/TailerListener;JZZI)Lorg/apache/commons/io/input/Tailer;
    .locals 8

    .line 296
    move-object v0, p0

    sget-object v1, Lorg/apache/commons/io/input/Tailer;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-static/range {v0 .. v7}, Lorg/apache/commons/io/input/Tailer;->create(Ljava/io/File;Ljava/nio/charset/Charset;Lorg/apache/commons/io/input/TailerListener;JZZI)Lorg/apache/commons/io/input/Tailer;

    move-result-object v0

    return-object v0
.end method

.method private readLines(Ljava/io/RandomAccessFile;)J
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 514
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x40

    invoke-direct {v4, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/4 v5, 0x0

    .line 515
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->getFilePointer()J

    move-result-wide v6

    .line 516
    move-wide v8, v6

    .line 518
    const/4 v11, 0x0

    .line 519
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/io/input/Tailer;->getRun()Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->inbuf:[B

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v0

    move v10, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 520
    const/4 v12, 0x0

    :goto_1
    if-ge v12, v10, :cond_2

    .line 521
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->inbuf:[B

    aget-byte v13, v0, v12

    .line 522
    sparse-switch v13, :sswitch_data_0

    goto :goto_2

    .line 524
    :sswitch_0
    const/4 v11, 0x0

    .line 525
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    new-instance v1, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lorg/apache/commons/io/input/Tailer;->cset:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-interface {v0, v1}, Lorg/apache/commons/io/input/TailerListener;->handle(Ljava/lang/String;)V

    .line 526
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 527
    int-to-long v0, v12

    add-long/2addr v0, v6

    const-wide/16 v2, 0x1

    add-long v8, v0, v2

    .line 528
    goto :goto_3

    .line 530
    :sswitch_1
    if-eqz v11, :cond_0

    .line 531
    const/16 v0, 0xd

    invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 533
    :cond_0
    const/4 v11, 0x1

    .line 534
    goto :goto_3

    .line 536
    :goto_2
    if-eqz v11, :cond_1

    .line 537
    const/4 v11, 0x0

    .line 538
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    new-instance v1, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lorg/apache/commons/io/input/Tailer;->cset:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-interface {v0, v1}, Lorg/apache/commons/io/input/TailerListener;->handle(Ljava/lang/String;)V

    .line 539
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 540
    int-to-long v0, v12

    add-long/2addr v0, v6

    const-wide/16 v2, 0x1

    add-long v8, v0, v2

    .line 542
    :cond_1
    invoke-virtual {v4, v13}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 520
    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 545
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->getFilePointer()J

    move-result-wide v6

    goto/16 :goto_0

    .line 548
    :cond_3
    move-object/from16 v0, p1

    invoke-virtual {v0, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 550
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    instance-of v0, v0, Lorg/apache/commons/io/input/TailerListenerAdapter;

    if-eqz v0, :cond_4

    .line 551
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    check-cast v0, Lorg/apache/commons/io/input/TailerListenerAdapter;

    invoke-virtual {v0}, Lorg/apache/commons/io/input/TailerListenerAdapter;->endOfFileReached()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 554
    :cond_4
    move-wide v12, v8

    .line 555
    if-eqz v4, :cond_5

    nop

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 554
    :cond_5
    return-wide v12

    .line 514
    :catch_0
    move-exception v6

    move-object v5, v6

    :try_start_1
    throw v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 555
    :catchall_0
    move-exception v15

    if-eqz v4, :cond_7

    if-eqz v5, :cond_6

    :try_start_2
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-exception v16

    move-object/from16 v0, v16

    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V

    :cond_7
    :goto_4
    throw v15

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0xd -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public getDelay()J
    .locals 2

    .line 399
    iget-wide v0, p0, Lorg/apache/commons/io/input/Tailer;->delayMillis:J

    return-wide v0
.end method

.method public getFile()Ljava/io/File;
    .locals 1

    .line 380
    iget-object v0, p0, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    return-object v0
.end method

.method protected getRun()Z
    .locals 1

    .line 390
    iget-boolean v0, p0, Lorg/apache/commons/io/input/Tailer;->run:Z

    return v0
.end method

.method public run()V
    .locals 18

    .line 407
    const/4 v3, 0x0

    .line 409
    const-wide/16 v4, 0x0

    .line 410
    const-wide/16 v6, 0x0

    .line 412
    :goto_0
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/io/input/Tailer;->getRun()Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v0

    if-eqz v0, :cond_2

    if-nez v3, :cond_2

    .line 414
    :try_start_1
    new-instance v0, Ljava/io/RandomAccessFile;

    move-object/from16 v1, p0

    iget-object v1, v1, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    const-string v2, "r"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v3, v0

    .line 417
    goto :goto_1

    .line 415
    :catch_0
    move-exception v8

    .line 416
    move-object/from16 v0, p0

    :try_start_2
    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    invoke-interface {v0}, Lorg/apache/commons/io/input/TailerListener;->fileNotFound()V

    .line 418
    :goto_1
    if-nez v3, :cond_0

    .line 419
    move-object/from16 v0, p0

    iget-wide v0, v0, Lorg/apache/commons/io/input/Tailer;->delayMillis:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0

    .line 422
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/commons/io/input/Tailer;->end:Z

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v6

    goto :goto_2

    :cond_1
    const-wide/16 v6, 0x0

    .line 423
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    .line 424
    invoke-virtual {v3, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    goto :goto_0

    .line 427
    :cond_2
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/io/input/Tailer;->getRun()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 428
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    invoke-static {v0, v4, v5}, Lorg/apache/commons/io/FileUtils;->isFileNewer(Ljava/io/File;J)Z

    move-result v8

    .line 430
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v9

    .line 431
    cmp-long v0, v9, v6

    if-gez v0, :cond_6

    .line 433
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    invoke-interface {v0}, Lorg/apache/commons/io/input/TailerListener;->fileRotated()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 436
    move-object v11, v3

    const/4 v12, 0x0

    .line 437
    :try_start_3
    new-instance v0, Ljava/io/RandomAccessFile;

    move-object/from16 v1, p0

    iget-object v1, v1, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    const-string v2, "r"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v3, v0

    .line 441
    move-object/from16 v0, p0

    :try_start_4
    invoke-direct {v0, v11}, Lorg/apache/commons/io/input/Tailer;->readLines(Ljava/io/RandomAccessFile;)J
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 444
    goto :goto_4

    .line 442
    :catch_1
    move-exception v13

    .line 443
    move-object/from16 v0, p0

    :try_start_5
    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    invoke-interface {v0, v13}, Lorg/apache/commons/io/input/TailerListener;->handle(Ljava/lang/Exception;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 445
    :goto_4
    const-wide/16 v6, 0x0

    .line 446
    if-eqz v11, :cond_5

    nop

    :try_start_6
    invoke-virtual {v11}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_8
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_6

    .line 436
    :catch_2
    move-exception v13

    move-object v12, v13

    :try_start_7
    throw v13
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 446
    :catchall_0
    move-exception v14

    if-eqz v11, :cond_4

    if-eqz v12, :cond_3

    :try_start_8
    invoke-virtual {v11}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_5

    :catch_3
    move-exception v15

    :try_start_9
    invoke-virtual {v12, v15}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_3
    invoke-virtual {v11}, Ljava/io/RandomAccessFile;->close()V

    :cond_4
    :goto_5
    throw v14
    :try_end_9
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 450
    :cond_5
    :goto_6
    goto/16 :goto_3

    .line 446
    :catch_4
    move-exception v11

    .line 448
    move-object/from16 v0, p0

    :try_start_a
    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    invoke-interface {v0}, Lorg/apache/commons/io/input/TailerListener;->fileNotFound()V

    .line 449
    move-object/from16 v0, p0

    iget-wide v0, v0, Lorg/apache/commons/io/input/Tailer;->delayMillis:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 451
    goto/16 :goto_3

    .line 455
    :cond_6
    cmp-long v0, v9, v6

    if-lez v0, :cond_7

    .line 457
    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lorg/apache/commons/io/input/Tailer;->readLines(Ljava/io/RandomAccessFile;)J

    move-result-wide v6

    .line 458
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    goto :goto_7

    .line 459
    :cond_7
    if-eqz v8, :cond_8

    .line 464
    const-wide/16 v6, 0x0

    .line 465
    invoke-virtual {v3, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 468
    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lorg/apache/commons/io/input/Tailer;->readLines(Ljava/io/RandomAccessFile;)J

    move-result-wide v6

    .line 469
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    .line 472
    :cond_8
    :goto_7
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/commons/io/input/Tailer;->reOpen:Z

    if-eqz v0, :cond_9

    if-eqz v3, :cond_9

    .line 473
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    .line 475
    :cond_9
    move-object/from16 v0, p0

    iget-wide v0, v0, Lorg/apache/commons/io/input/Tailer;->delayMillis:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 476
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/io/input/Tailer;->getRun()Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lorg/apache/commons/io/input/Tailer;->reOpen:Z

    if-eqz v0, :cond_a

    .line 477
    new-instance v0, Ljava/io/RandomAccessFile;

    move-object/from16 v1, p0

    iget-object v1, v1, Lorg/apache/commons/io/input/Tailer;->file:Ljava/io/File;

    const-string v2, "r"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v3, v0

    .line 478
    invoke-virtual {v3, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_6
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_8
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 480
    :cond_a
    goto/16 :goto_3

    .line 488
    :cond_b
    if-eqz v3, :cond_c

    .line 489
    :try_start_b
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    .line 494
    :cond_c
    goto :goto_8

    .line 492
    :catch_5
    move-exception v4

    .line 493
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    invoke-interface {v0, v4}, Lorg/apache/commons/io/input/TailerListener;->handle(Ljava/lang/Exception;)V

    .line 495
    :goto_8
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/io/input/Tailer;->stop()V

    .line 496
    goto :goto_c

    .line 481
    :catch_6
    move-exception v4

    .line 482
    :try_start_c
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 483
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    invoke-interface {v0, v4}, Lorg/apache/commons/io/input/TailerListener;->handle(Ljava/lang/Exception;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 488
    if-eqz v3, :cond_d

    .line 489
    :try_start_d
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    .line 494
    :cond_d
    goto :goto_9

    .line 492
    :catch_7
    move-exception v4

    .line 493
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    invoke-interface {v0, v4}, Lorg/apache/commons/io/input/TailerListener;->handle(Ljava/lang/Exception;)V

    .line 495
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/io/input/Tailer;->stop()V

    .line 496
    goto :goto_c

    .line 484
    :catch_8
    move-exception v4

    .line 485
    move-object/from16 v0, p0

    :try_start_e
    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    invoke-interface {v0, v4}, Lorg/apache/commons/io/input/TailerListener;->handle(Ljava/lang/Exception;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 488
    if-eqz v3, :cond_e

    .line 489
    :try_start_f
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9

    .line 494
    :cond_e
    goto :goto_a

    .line 492
    :catch_9
    move-exception v4

    .line 493
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    invoke-interface {v0, v4}, Lorg/apache/commons/io/input/TailerListener;->handle(Ljava/lang/Exception;)V

    .line 495
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/io/input/Tailer;->stop()V

    .line 496
    goto :goto_c

    .line 487
    :catchall_1
    move-exception v16

    .line 488
    if-eqz v3, :cond_f

    .line 489
    :try_start_10
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_a

    .line 494
    :cond_f
    goto :goto_b

    .line 492
    :catch_a
    move-exception v17

    .line 493
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/io/input/Tailer;->listener:Lorg/apache/commons/io/input/TailerListener;

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Lorg/apache/commons/io/input/TailerListener;->handle(Ljava/lang/Exception;)V

    .line 495
    :goto_b
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/io/input/Tailer;->stop()V

    throw v16

    .line 497
    :goto_c
    return-void
.end method

.method public stop()V
    .locals 1

    .line 503
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/commons/io/input/Tailer;->run:Z

    .line 504
    return-void
.end method
