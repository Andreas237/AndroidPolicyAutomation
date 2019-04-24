.class public final Lcom/squareup/okhttp/internal/DiskLruCache;
.super Ljava/lang/Object;
.source "DiskLruCache.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/DiskLruCache$Entry;,
        Lcom/squareup/okhttp/internal/DiskLruCache$Editor;,
        Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    }
.end annotation


# static fields
.field static final ANY_SEQUENCE_NUMBER:J = -0x1L

.field private static final CLEAN:Ljava/lang/String; = "CLEAN"

.field private static final DIRTY:Ljava/lang/String; = "DIRTY"

.field static final JOURNAL_FILE:Ljava/lang/String; = "journal"

.field static final JOURNAL_FILE_BACKUP:Ljava/lang/String; = "journal.bkp"

.field static final JOURNAL_FILE_TEMP:Ljava/lang/String; = "journal.tmp"

.field static final LEGAL_KEY_PATTERN:Ljava/util/regex/Pattern;

.field static final MAGIC:Ljava/lang/String; = "libcore.io.DiskLruCache"

.field private static final NULL_SINK:Lokio/Sink;

.field private static final READ:Ljava/lang/String; = "READ"

.field private static final REMOVE:Ljava/lang/String; = "REMOVE"

.field static final VERSION_1:Ljava/lang/String; = "1"


# instance fields
.field private final appVersion:I

.field private final cleanupRunnable:Ljava/lang/Runnable;

.field private final directory:Ljava/io/File;

.field final executorService:Ljava/util/concurrent/ThreadPoolExecutor;

.field private final journalFile:Ljava/io/File;

.field private final journalFileBackup:Ljava/io/File;

.field private final journalFileTmp:Ljava/io/File;

.field private journalWriter:Lokio/BufferedSink;

.field private final lruEntries:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/squareup/okhttp/internal/DiskLruCache$Entry;",
            ">;"
        }
    .end annotation
.end field

.field private maxSize:J

.field private nextSequenceNumber:J

.field private redundantOpCount:I

.field private size:J

.field private final valueCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "[a-z0-9_-]{1,120}"

    .line 92
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/DiskLruCache;->LEGAL_KEY_PATTERN:Ljava/util/regex/Pattern;

    .line 739
    new-instance v0, Lcom/squareup/okhttp/internal/DiskLruCache$2;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$2;-><init>()V

    sput-object v0, Lcom/squareup/okhttp/internal/DiskLruCache;->NULL_SINK:Lokio/Sink;

    return-void
.end method

.method private constructor <init>(Ljava/io/File;IIJ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 179
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, 0x0

    .line 145
    iput-wide v2, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J

    .line 147
    new-instance v4, Ljava/util/LinkedHashMap;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/high16 v7, 0x3f400000    # 0.75f

    invoke-direct {v4, v6, v7, v5}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v4, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    .line 155
    iput-wide v2, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->nextSequenceNumber:J

    .line 158
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v13, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v14, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v14}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-string v3, "OkHttp DiskLruCache"

    invoke-static {v3, v5}, Lcom/squareup/okhttp/internal/Util;->threadFactory(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v15

    const/4 v9, 0x0

    const/4 v10, 0x1

    const-wide/16 v11, 0x3c

    move-object v8, v2

    invoke-direct/range {v8 .. v15}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v2, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 160
    new-instance v2, Lcom/squareup/okhttp/internal/DiskLruCache$1;

    invoke-direct {v2, v0}, Lcom/squareup/okhttp/internal/DiskLruCache$1;-><init>(Lcom/squareup/okhttp/internal/DiskLruCache;)V

    iput-object v2, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    .line 180
    iput-object v1, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->directory:Ljava/io/File;

    move/from16 v2, p2

    .line 181
    iput v2, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->appVersion:I

    .line 182
    new-instance v2, Ljava/io/File;

    const-string v3, "journal"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFile:Ljava/io/File;

    .line 183
    new-instance v2, Ljava/io/File;

    const-string v3, "journal.tmp"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFileTmp:Ljava/io/File;

    .line 184
    new-instance v2, Ljava/io/File;

    const-string v3, "journal.bkp"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFileBackup:Ljava/io/File;

    move/from16 v1, p3

    .line 185
    iput v1, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    move-wide/from16 v1, p4

    .line 186
    iput-wide v1, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->maxSize:J

    return-void
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/internal/DiskLruCache;)Lokio/BufferedSink;
    .locals 0

    .line 85
    iget-object p0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    return-object p0
.end method

.method static synthetic access$100(Lcom/squareup/okhttp/internal/DiskLruCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 85
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->trimToSize()V

    return-void
.end method

.method static synthetic access$1900(Lcom/squareup/okhttp/internal/DiskLruCache;Ljava/lang/String;J)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 85
    invoke-direct {p0, p1, p2, p3}, Lcom/squareup/okhttp/internal/DiskLruCache;->edit(Ljava/lang/String;J)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/internal/DiskLruCache;)Z
    .locals 0

    .line 85
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->journalRebuildRequired()Z

    move-result p0

    return p0
.end method

.method static synthetic access$2000(Lokio/Source;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 85
    invoke-static {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->sourceToString(Lokio/Source;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$2100(Lcom/squareup/okhttp/internal/DiskLruCache;)I
    .locals 0

    .line 85
    iget p0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    return p0
.end method

.method static synthetic access$2200(Lcom/squareup/okhttp/internal/DiskLruCache;)Ljava/io/File;
    .locals 0

    .line 85
    iget-object p0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->directory:Ljava/io/File;

    return-object p0
.end method

.method static synthetic access$2300()Lokio/Sink;
    .locals 1

    .line 85
    sget-object v0, Lcom/squareup/okhttp/internal/DiskLruCache;->NULL_SINK:Lokio/Sink;

    return-object v0
.end method

.method static synthetic access$2400(Lcom/squareup/okhttp/internal/DiskLruCache;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 85
    invoke-direct {p0, p1, p2}, Lcom/squareup/okhttp/internal/DiskLruCache;->completeEdit(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;Z)V

    return-void
.end method

.method static synthetic access$2500(Lcom/squareup/okhttp/internal/DiskLruCache;Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 85
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/DiskLruCache;->removeEntry(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/internal/DiskLruCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 85
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->rebuildJournal()V

    return-void
.end method

.method static synthetic access$402(Lcom/squareup/okhttp/internal/DiskLruCache;I)I
    .locals 0

    .line 85
    iput p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I

    return p1
.end method

.method private checkNotClosed()V
    .locals 2

    .line 622
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    if-eqz v0, :cond_0

    return-void

    .line 623
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cache is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private declared-synchronized completeEdit(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 509
    :try_start_0
    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->access$1600(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    move-result-object v0

    .line 510
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$700(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v1

    if-ne v1, p1, :cond_a

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    .line 515
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$600(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z

    move-result v2

    if-nez v2, :cond_2

    move v2, v1

    .line 516
    :goto_0
    iget v3, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    if-ge v2, v3, :cond_2

    .line 517
    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->access$1700(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)[Z

    move-result-object v3

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_1

    .line 521
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1200(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 522
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->abort()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 523
    monitor-exit p0

    return-void

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 518
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->abort()V

    .line 519
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Newly created entry didn\'t create value for index "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 528
    :cond_2
    :goto_1
    iget p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    if-ge v1, p1, :cond_5

    .line 529
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1200(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object p1

    aget-object p1, p1, v1

    if-eqz p2, :cond_3

    .line 531
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 532
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1100(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v2

    aget-object v2, v2, v1

    .line 533
    invoke-virtual {p1, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 534
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1000(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[J

    move-result-object p1

    aget-wide v3, p1, v1

    .line 535
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v5

    .line 536
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1000(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[J

    move-result-object p1

    aput-wide v5, p1, v1

    .line 537
    iget-wide v7, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J

    sub-long/2addr v7, v3

    add-long/2addr v7, v5

    iput-wide v7, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J

    goto :goto_2

    .line 540
    :cond_3
    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 544
    :cond_5
    iget p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I

    const/4 p1, 0x0

    .line 545
    invoke-static {v0, p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$702(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    .line 546
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$600(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z

    move-result p1

    or-int/2addr p1, p2

    const/16 v2, 0xa

    const/16 v3, 0x20

    if-eqz p1, :cond_6

    .line 547
    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$602(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;Z)Z

    .line 548
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string v1, "CLEAN"

    invoke-interface {p1, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object p1

    invoke-interface {p1, v3}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 549
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1300(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 550
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->getLengths()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 551
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {p1, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    if-eqz p2, :cond_7

    .line 553
    iget-wide p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->nextSequenceNumber:J

    const-wide/16 v1, 0x1

    add-long/2addr v1, p1

    iput-wide v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->nextSequenceNumber:J

    invoke-static {v0, p1, p2}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1402(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;J)J

    goto :goto_3

    .line 556
    :cond_6
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1300(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string p2, "REMOVE"

    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object p1

    invoke-interface {p1, v3}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 558
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1300(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 559
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {p1, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 561
    :cond_7
    :goto_3
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {p1}, Lokio/BufferedSink;->flush()V

    .line 563
    iget-wide p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J

    iget-wide v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->maxSize:J

    cmp-long p1, p1, v0

    if-gtz p1, :cond_8

    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->journalRebuildRequired()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 564
    :cond_8
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object p2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 566
    :cond_9
    monitor-exit p0

    return-void

    .line 511
    :cond_a
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private static deleteIfExists(Ljava/io/File;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 385
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 386
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "failed to delete "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method private declared-synchronized edit(Ljava/lang/String;J)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 454
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->checkNotClosed()V

    .line 455
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/DiskLruCache;->validateKey(Ljava/lang/String;)V

    .line 456
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    const-wide/16 v1, -0x1

    cmp-long v1, p2, v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    .line 457
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1400(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p2, v3, p2

    if-eqz p2, :cond_1

    .line 459
    :cond_0
    monitor-exit p0

    return-object v2

    :cond_1
    if-nez v0, :cond_2

    .line 462
    :try_start_1
    new-instance v0, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    invoke-direct {v0, p0, p1, v2}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;-><init>(Lcom/squareup/okhttp/internal/DiskLruCache;Ljava/lang/String;Lcom/squareup/okhttp/internal/DiskLruCache$1;)V

    .line 463
    iget-object p2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 464
    :cond_2
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$700(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_3

    .line 465
    monitor-exit p0

    return-object v2

    .line 468
    :cond_3
    :goto_0
    :try_start_2
    new-instance p2, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    invoke-direct {p2, p0, v0, v2}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;-><init>(Lcom/squareup/okhttp/internal/DiskLruCache;Lcom/squareup/okhttp/internal/DiskLruCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$1;)V

    .line 469
    invoke-static {v0, p2}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$702(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    .line 472
    iget-object p3, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string v0, "DIRTY"

    invoke-interface {p3, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object p3

    const/16 v0, 0x20

    invoke-interface {p3, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    move-result-object p3

    invoke-interface {p3, p1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object p1

    const/16 p3, 0xa

    invoke-interface {p1, p3}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 473
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {p1}, Lokio/BufferedSink;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 474
    monitor-exit p0

    return-object p2

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private journalRebuildRequired()Z
    .locals 2

    .line 574
    iget v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static open(Ljava/io/File;IIJ)Lcom/squareup/okhttp/internal/DiskLruCache;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-lez v0, :cond_4

    if-lez p2, :cond_3

    .line 208
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.bkp"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 209
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 210
    new-instance v1, Ljava/io/File;

    const-string v2, "journal"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 212
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 213
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 215
    invoke-static {v0, v1, v2}, Lcom/squareup/okhttp/internal/DiskLruCache;->renameTo(Ljava/io/File;Ljava/io/File;Z)V

    .line 220
    :cond_1
    :goto_0
    new-instance v0, Lcom/squareup/okhttp/internal/DiskLruCache;

    move-object v3, v0

    move-object v4, p0

    move v5, p1

    move v6, p2

    move-wide v7, p3

    invoke-direct/range {v3 .. v8}, Lcom/squareup/okhttp/internal/DiskLruCache;-><init>(Ljava/io/File;IIJ)V

    .line 221
    iget-object v1, v0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 223
    :try_start_0
    invoke-direct {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->readJournal()V

    .line 224
    invoke-direct {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->processJournal()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    .line 227
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DiskLruCache "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " is corrupt: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", removing"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/squareup/okhttp/internal/Platform;->logW(Ljava/lang/String;)V

    .line 229
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->delete()V

    .line 234
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 235
    new-instance v0, Lcom/squareup/okhttp/internal/DiskLruCache;

    move-object v3, v0

    move-object v4, p0

    move v5, p1

    move v6, p2

    move-wide v7, p3

    invoke-direct/range {v3 .. v8}, Lcom/squareup/okhttp/internal/DiskLruCache;-><init>(Ljava/io/File;IIJ)V

    .line 236
    invoke-direct {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->rebuildJournal()V

    return-object v0

    .line 204
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p1, "valueCount <= 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 201
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "maxSize <= 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private processJournal()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 323
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFileTmp:Ljava/io/File;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    .line 324
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 325
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    .line 326
    invoke-static {v1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$700(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 327
    :goto_1
    iget v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    if-ge v3, v2, :cond_0

    .line 328
    iget-wide v4, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J

    invoke-static {v1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1000(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[J

    move-result-object v2

    aget-wide v6, v2, v3

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 331
    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$702(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    .line 332
    :goto_2
    iget v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    if-ge v3, v2, :cond_2

    .line 333
    invoke-static {v1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1100(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v2

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/squareup/okhttp/internal/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    .line 334
    invoke-static {v1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1200(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v2

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/squareup/okhttp/internal/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 336
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private readJournal()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 241
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-static {v0}, Lokio/Okio;->source(Ljava/io/File;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    .line 243
    :try_start_0
    invoke-interface {v0}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v1

    .line 244
    invoke-interface {v0}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v2

    .line 245
    invoke-interface {v0}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v3

    .line 246
    invoke-interface {v0}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v4

    .line 247
    invoke-interface {v0}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v5

    const-string v6, "libcore.io.DiskLruCache"

    .line 248
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "1"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget v6, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->appVersion:I

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget v3, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, ""

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    const/4 v1, 0x0

    .line 260
    :goto_0
    :try_start_1
    invoke-interface {v0}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/squareup/okhttp/internal/DiskLruCache;->readJournalLine(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 266
    :catch_0
    :try_start_2
    iget-object v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->size()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I

    .line 269
    invoke-interface {v0}, Lokio/BufferedSource;->exhausted()Z

    move-result v1

    if-nez v1, :cond_0

    .line 270
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->rebuildJournal()V

    goto :goto_1

    .line 272
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-static {v1}, Lokio/Okio;->appendingSink(Ljava/io/File;)Lokio/Sink;

    move-result-object v1

    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v1

    iput-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 275
    :goto_1
    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    .line 253
    :cond_1
    :try_start_3
    new-instance v3, Ljava/io/IOException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "unexpected journal header: ["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v1

    .line 275
    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    throw v1
.end method

.method private readJournalLine(Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x20

    .line 280
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_6

    add-int/lit8 v3, v1, 0x1

    .line 286
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-ne v0, v2, :cond_0

    .line 289
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x6

    if-ne v1, v4, :cond_1

    const-string v4, "REMOVE"

    .line 290
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 291
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 295
    :cond_0
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 298
    :cond_1
    iget-object v4, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    const/4 v5, 0x0

    if-nez v4, :cond_2

    .line 300
    new-instance v4, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    invoke-direct {v4, p0, v3, v5}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;-><init>(Lcom/squareup/okhttp/internal/DiskLruCache;Ljava/lang/String;Lcom/squareup/okhttp/internal/DiskLruCache$1;)V

    .line 301
    iget-object v6, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v3, v4}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const/4 v3, 0x5

    if-eq v0, v2, :cond_3

    if-ne v1, v3, :cond_3

    const-string v6, "CLEAN"

    .line 304
    invoke-virtual {p1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 305
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 306
    invoke-static {v4, v1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$602(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;Z)Z

    .line 307
    invoke-static {v4, v5}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$702(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    .line 308
    invoke-static {v4, p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$800(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;[Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    if-ne v0, v2, :cond_4

    if-ne v1, v3, :cond_4

    const-string v3, "DIRTY"

    .line 309
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 310
    new-instance p1, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    invoke-direct {p1, p0, v4, v5}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;-><init>(Lcom/squareup/okhttp/internal/DiskLruCache;Lcom/squareup/okhttp/internal/DiskLruCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$1;)V

    invoke-static {v4, p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$702(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    goto :goto_0

    :cond_4
    if-ne v0, v2, :cond_5

    const/4 v0, 0x4

    if-ne v1, v0, :cond_5

    const-string v0, "READ"

    .line 311
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_0
    return-void

    .line 314
    :cond_5
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unexpected journal line: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 282
    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unexpected journal line: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private declared-synchronized rebuildJournal()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 346
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->close()V

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFileTmp:Ljava/io/File;

    invoke-static {v0}, Lokio/Okio;->sink(Ljava/io/File;)Lokio/Sink;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v1, "libcore.io.DiskLruCache"

    .line 352
    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v1

    const/16 v2, 0xa

    invoke-interface {v1, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    const-string v1, "1"

    .line 353
    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v1

    invoke-interface {v1, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 354
    iget v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->appVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v1

    invoke-interface {v1, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 355
    iget v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v1

    invoke-interface {v1, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 356
    invoke-interface {v0, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 358
    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    .line 359
    invoke-static {v3}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$700(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v4

    const/16 v5, 0x20

    if-eqz v4, :cond_1

    const-string v4, "DIRTY"

    .line 360
    invoke-interface {v0, v4}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v4

    invoke-interface {v4, v5}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 361
    invoke-static {v3}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1300(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 362
    invoke-interface {v0, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    goto :goto_0

    :cond_1
    const-string v4, "CLEAN"

    .line 364
    invoke-interface {v0, v4}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v4

    invoke-interface {v4, v5}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 365
    invoke-static {v3}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1300(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 366
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->getLengths()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 367
    invoke-interface {v0, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 371
    :cond_2
    :try_start_2
    invoke-interface {v0}, Lokio/BufferedSink;->close()V

    .line 374
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 375
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFile:Ljava/io/File;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFileBackup:Ljava/io/File;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/squareup/okhttp/internal/DiskLruCache;->renameTo(Ljava/io/File;Ljava/io/File;Z)V

    .line 377
    :cond_3
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFileTmp:Ljava/io/File;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFile:Ljava/io/File;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/squareup/okhttp/internal/DiskLruCache;->renameTo(Ljava/io/File;Ljava/io/File;Z)V

    .line 378
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFileBackup:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 380
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-static {v0}, Lokio/Okio;->appendingSink(Ljava/io/File;)Lokio/Sink;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 381
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    .line 371
    :try_start_3
    invoke-interface {v0}, Lokio/BufferedSink;->close()V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private removeEntry(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 594
    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$700(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 595
    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$700(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->access$1802(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;Z)Z

    :cond_0
    const/4 v0, 0x0

    .line 598
    :goto_0
    iget v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    if-ge v0, v2, :cond_1

    .line 599
    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1100(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v2

    aget-object v2, v2, v0

    .line 600
    invoke-static {v2}, Lcom/squareup/okhttp/internal/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    .line 601
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J

    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1000(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[J

    move-result-object v4

    aget-wide v5, v4, v0

    sub-long/2addr v2, v5

    iput-wide v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J

    .line 602
    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1000(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[J

    move-result-object v2

    const-wide/16 v3, 0x0

    aput-wide v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 605
    :cond_1
    iget v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I

    .line 606
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string v2, "REMOVE"

    invoke-interface {v0, v2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v2, 0x20

    invoke-interface {v0, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    move-result-object v0

    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1300(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v2, 0xa

    invoke-interface {v0, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 607
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1300(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->journalRebuildRequired()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 610
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    return v1
.end method

.method private static renameTo(Ljava/io/File;Ljava/io/File;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 392
    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    .line 394
    :cond_0
    invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    .line 395
    :cond_1
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0
.end method

.method private static sourceToString(Lokio/Source;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 688
    :try_start_0
    invoke-static {p0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    invoke-interface {v0}, Lokio/BufferedSource;->readUtf8()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 690
    invoke-static {p0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {p0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    throw v0
.end method

.method private trimToSize()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 651
    :goto_0
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J

    iget-wide v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->maxSize:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 652
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    .line 653
    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->removeEntry(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private validateKey(Ljava/lang/String;)V
    .locals 3

    .line 679
    sget-object v0, Lcom/squareup/okhttp/internal/DiskLruCache;->LEGAL_KEY_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 680
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 681
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "keys must match regex [a-z0-9_-]{1,120}: \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 636
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 637
    monitor-exit p0

    return-void

    .line 640
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    new-array v1, v1, [Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 641
    invoke-static {v3}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$700(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 642
    invoke-static {v3}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$700(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v3

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->abort()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 645
    :cond_2
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->trimToSize()V

    .line 646
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->close()V

    const/4 v0, 0x0

    .line 647
    iput-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 648
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public delete()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 663
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->close()V

    .line 664
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->directory:Ljava/io/File;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->deleteContents(Ljava/io/File;)V

    return-void
.end method

.method public edit(Ljava/lang/String;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, -0x1

    .line 450
    invoke-direct {p0, p1, v0, v1}, Lcom/squareup/okhttp/internal/DiskLruCache;->edit(Ljava/lang/String;J)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized evictAll()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 673
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    new-array v1, v1, [Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/okhttp/internal/DiskLruCache$Entry;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 674
    invoke-direct {p0, v3}, Lcom/squareup/okhttp/internal/DiskLruCache;->removeEntry(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 676
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 629
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->checkNotClosed()V

    .line 630
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->trimToSize()V

    .line 631
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 632
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized get(Ljava/lang/String;)Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 405
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->checkNotClosed()V

    .line 406
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/DiskLruCache;->validateKey(Ljava/lang/String;)V

    .line 407
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 409
    monitor-exit p0

    return-object v1

    .line 412
    :cond_0
    :try_start_1
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$600(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_1

    .line 413
    monitor-exit p0

    return-object v1

    .line 419
    :cond_1
    :try_start_2
    iget v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    new-array v8, v2, [Lokio/Source;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x0

    move v3, v2

    .line 421
    :goto_0
    :try_start_3
    iget v4, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    if-ge v3, v4, :cond_2

    .line 422
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1100(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v4

    aget-object v4, v4, v3

    invoke-static {v4}, Lokio/Okio;->source(Ljava/io/File;)Lokio/Source;

    move-result-object v4

    aput-object v4, v8, v3
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 436
    :cond_2
    :try_start_4
    iget v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I

    .line 437
    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string v2, "READ"

    invoke-interface {v1, v2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v1

    const/16 v2, 0x20

    invoke-interface {v1, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    move-result-object v1

    invoke-interface {v1, p1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v1

    const/16 v2, 0xa

    invoke-interface {v1, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 438
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->journalRebuildRequired()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 439
    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 442
    :cond_3
    new-instance v1, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1400(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)J

    move-result-wide v6

    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;->access$1000(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)[J

    move-result-object v9

    const/4 v10, 0x0

    move-object v3, v1

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v3 .. v10}, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;-><init>(Lcom/squareup/okhttp/internal/DiskLruCache;Ljava/lang/String;J[Lokio/Source;[JLcom/squareup/okhttp/internal/DiskLruCache$1;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object v1

    .line 426
    :catch_0
    :goto_1
    :try_start_5
    iget p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->valueCount:I

    if-ge v2, p1, :cond_4

    .line 427
    aget-object p1, v8, v2

    if-eqz p1, :cond_4

    .line 428
    aget-object p1, v8, v2

    invoke-static {p1}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 433
    :cond_4
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getDirectory()Ljava/io/File;
    .locals 1

    .line 479
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->directory:Ljava/io/File;

    return-object v0
.end method

.method public declared-synchronized getMaxSize()J
    .locals 2

    monitor-enter p0

    .line 487
    :try_start_0
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->maxSize:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isClosed()Z
    .locals 1

    .line 618
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public declared-synchronized remove(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 586
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/DiskLruCache;->checkNotClosed()V

    .line 587
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/DiskLruCache;->validateKey(Ljava/lang/String;)V

    .line 588
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/squareup/okhttp/internal/DiskLruCache$Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 589
    monitor-exit p0

    return p1

    .line 590
    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/DiskLruCache;->removeEntry(Lcom/squareup/okhttp/internal/DiskLruCache$Entry;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setMaxSize(J)V
    .locals 0

    monitor-enter p0

    .line 495
    :try_start_0
    iput-wide p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->maxSize:J

    .line 496
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object p2, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 497
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized size()J
    .locals 2

    monitor-enter p0

    .line 505
    :try_start_0
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache;->size:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
