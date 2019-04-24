.class public final Lokhttp3/internal/DiskLruCache;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/DiskLruCache$Entry;,
        Lokhttp3/internal/DiskLruCache$Editor;,
        Lokhttp3/internal/DiskLruCache$Snapshot;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

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

.field private closed:Z

.field private final directory:Ljava/io/File;

.field private final executor:Ljava/util/concurrent/Executor;

.field private final fileSystem:Lokhttp3/internal/io/FileSystem;

.field private hasJournalErrors:Z

.field private initialized:Z

.field private final journalFile:Ljava/io/File;

.field private final journalFileBackup:Ljava/io/File;

.field private final journalFileTmp:Ljava/io/File;

.field private journalWriter:Lokio/BufferedSink;

.field private final lruEntries:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<Ljava/lang/String;Lokhttp3/internal/DiskLruCache$Entry;>;"
        }
    .end annotation
.end field

.field private maxSize:J

.field private mostRecentTrimFailed:Z

.field private nextSequenceNumber:J

.field private redundantOpCount:I

.field private size:J

.field private final valueCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 84
    const-class v0, Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lokhttp3/internal/DiskLruCache;->$assertionsDisabled:Z

    .line 91
    const-string v0, "[a-z0-9_-]{1,120}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/DiskLruCache;->LEGAL_KEY_PATTERN:Ljava/util/regex/Pattern;

    .line 814
    new-instance v0, Lokhttp3/internal/DiskLruCache$4;

    invoke-direct {v0}, Lokhttp3/internal/DiskLruCache$4;-><init>()V

    sput-object v0, Lokhttp3/internal/DiskLruCache;->NULL_SINK:Lokio/Sink;

    return-void
.end method

.method constructor <init>(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLjava/util/concurrent/Executor;)V
    .locals 4

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    .line 147
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x0

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    .line 161
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lokhttp3/internal/DiskLruCache;->nextSequenceNumber:J

    .line 165
    new-instance v0, Lokhttp3/internal/DiskLruCache$1;

    invoke-direct {v0, p0}, Lokhttp3/internal/DiskLruCache$1;-><init>(Lokhttp3/internal/DiskLruCache;)V

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    .line 192
    iput-object p1, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    .line 193
    iput-object p2, p0, Lokhttp3/internal/DiskLruCache;->directory:Ljava/io/File;

    .line 194
    iput p3, p0, Lokhttp3/internal/DiskLruCache;->appVersion:I

    .line 195
    new-instance v0, Ljava/io/File;

    const-string v1, "journal"

    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalFile:Ljava/io/File;

    .line 196
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.tmp"

    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalFileTmp:Ljava/io/File;

    .line 197
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.bkp"

    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalFileBackup:Ljava/io/File;

    .line 198
    iput p4, p0, Lokhttp3/internal/DiskLruCache;->valueCount:I

    .line 199
    iput-wide p5, p0, Lokhttp3/internal/DiskLruCache;->maxSize:J

    .line 200
    iput-object p7, p0, Lokhttp3/internal/DiskLruCache;->executor:Ljava/util/concurrent/Executor;

    .line 201
    return-void
.end method

.method static synthetic access$000(Lokhttp3/internal/DiskLruCache;)Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->initialized:Z

    return v0
.end method

.method static synthetic access$100(Lokhttp3/internal/DiskLruCache;)Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->closed:Z

    return v0
.end method

.method static synthetic access$200(Lokhttp3/internal/DiskLruCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->trimToSize()V

    return-void
.end method

.method static synthetic access$2100(Lokhttp3/internal/DiskLruCache;)Ljava/util/LinkedHashMap;
    .locals 1

    .line 84
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method static synthetic access$2300(Lokhttp3/internal/DiskLruCache;Ljava/lang/String;J)Lokhttp3/internal/DiskLruCache$Editor;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/DiskLruCache;->edit(Ljava/lang/String;J)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2400(Lokhttp3/internal/DiskLruCache;)I
    .locals 1

    .line 84
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->valueCount:I

    return v0
.end method

.method static synthetic access$2500(Lokhttp3/internal/DiskLruCache;)Lokhttp3/internal/io/FileSystem;
    .locals 1

    .line 84
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    return-object v0
.end method

.method static synthetic access$2600()Lokio/Sink;
    .locals 1

    .line 84
    sget-object v0, Lokhttp3/internal/DiskLruCache;->NULL_SINK:Lokio/Sink;

    return-object v0
.end method

.method static synthetic access$2700(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Editor;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/DiskLruCache;->completeEdit(Lokhttp3/internal/DiskLruCache$Editor;Z)V

    return-void
.end method

.method static synthetic access$2800(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Entry;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    invoke-direct {p0, p1}, Lokhttp3/internal/DiskLruCache;->removeEntry(Lokhttp3/internal/DiskLruCache$Entry;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$2900(Lokhttp3/internal/DiskLruCache;)Ljava/io/File;
    .locals 1

    .line 84
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->directory:Ljava/io/File;

    return-object v0
.end method

.method static synthetic access$302(Lokhttp3/internal/DiskLruCache;Z)Z
    .locals 0

    .line 84
    iput-boolean p1, p0, Lokhttp3/internal/DiskLruCache;->mostRecentTrimFailed:Z

    return p1
.end method

.method static synthetic access$400(Lokhttp3/internal/DiskLruCache;)Z
    .locals 1

    .line 84
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->journalRebuildRequired()Z

    move-result v0

    return v0
.end method

.method static synthetic access$500(Lokhttp3/internal/DiskLruCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->rebuildJournal()V

    return-void
.end method

.method static synthetic access$602(Lokhttp3/internal/DiskLruCache;I)I
    .locals 0

    .line 84
    iput p1, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    return p1
.end method

.method static synthetic access$702(Lokhttp3/internal/DiskLruCache;Z)Z
    .locals 0

    .line 84
    iput-boolean p1, p0, Lokhttp3/internal/DiskLruCache;->hasJournalErrors:Z

    return p1
.end method

.method private declared-synchronized checkNotClosed()V
    .locals 3

    monitor-enter p0

    .line 634
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 635
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cache is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 637
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private declared-synchronized completeEdit(Lokhttp3/internal/DiskLruCache$Editor;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 519
    :try_start_0
    invoke-static {p1}, Lokhttp3/internal/DiskLruCache$Editor;->access$1800(Lokhttp3/internal/DiskLruCache$Editor;)Lokhttp3/internal/DiskLruCache$Entry;

    move-result-object v4

    .line 520
    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 521
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 525
    :cond_0
    if-eqz p2, :cond_3

    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$900(Lokhttp3/internal/DiskLruCache$Entry;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 526
    const/4 v5, 0x0

    :goto_0
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->valueCount:I

    if-ge v5, v0, :cond_3

    .line 527
    invoke-static {p1}, Lokhttp3/internal/DiskLruCache$Editor;->access$1900(Lokhttp3/internal/DiskLruCache$Editor;)[Z

    move-result-object v0

    aget-boolean v0, v0, v5

    if-nez v0, :cond_1

    .line 528
    invoke-virtual {p1}, Lokhttp3/internal/DiskLruCache$Editor;->abort()V

    .line 529
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Newly created entry didn\'t create value for index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 531
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$1500(Lokhttp3/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v1

    aget-object v1, v1, v5

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->exists(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 532
    invoke-virtual {p1}, Lokhttp3/internal/DiskLruCache$Editor;->abort()V

    .line 533
    monitor-exit p0

    return-void

    .line 526
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 538
    :cond_3
    const/4 v5, 0x0

    :goto_1
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->valueCount:I

    if-ge v5, v0, :cond_6

    .line 539
    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$1500(Lokhttp3/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v0

    aget-object v6, v0, v5

    .line 540
    if-eqz p2, :cond_4

    .line 541
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    invoke-interface {v0, v6}, Lokhttp3/internal/io/FileSystem;->exists(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 542
    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$1400(Lokhttp3/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v0

    aget-object v7, v0, v5

    .line 543
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    invoke-interface {v0, v6, v7}, Lokhttp3/internal/io/FileSystem;->rename(Ljava/io/File;Ljava/io/File;)V

    .line 544
    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$1300(Lokhttp3/internal/DiskLruCache$Entry;)[J

    move-result-object v0

    aget-wide v8, v0, v5

    .line 545
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    invoke-interface {v0, v7}, Lokhttp3/internal/io/FileSystem;->size(Ljava/io/File;)J

    move-result-wide v10

    .line 546
    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$1300(Lokhttp3/internal/DiskLruCache$Entry;)[J

    move-result-object v0

    aput-wide v10, v0, v5

    .line 547
    iget-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    sub-long/2addr v0, v8

    add-long/2addr v0, v10

    iput-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    .line 548
    goto :goto_2

    .line 550
    :cond_4
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    invoke-interface {v0, v6}, Lokhttp3/internal/io/FileSystem;->delete(Ljava/io/File;)V

    .line 538
    :cond_5
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 554
    :cond_6
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    .line 555
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$1002(Lokhttp3/internal/DiskLruCache$Entry;Lokhttp3/internal/DiskLruCache$Editor;)Lokhttp3/internal/DiskLruCache$Editor;

    .line 556
    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$900(Lokhttp3/internal/DiskLruCache$Entry;)Z

    move-result v0

    or-int/2addr v0, p2

    if-eqz v0, :cond_7

    .line 557
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$902(Lokhttp3/internal/DiskLruCache$Entry;Z)Z

    .line 558
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string v1, "CLEAN"

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 559
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$1600(Lokhttp3/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 560
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-virtual {v4, v0}, Lokhttp3/internal/DiskLruCache$Entry;->writeLengths(Lokio/BufferedSink;)V

    .line 561
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 562
    if-eqz p2, :cond_8

    .line 563
    iget-wide v0, p0, Lokhttp3/internal/DiskLruCache;->nextSequenceNumber:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lokhttp3/internal/DiskLruCache;->nextSequenceNumber:J

    invoke-static {v4, v0, v1}, Lokhttp3/internal/DiskLruCache$Entry;->access$1702(Lokhttp3/internal/DiskLruCache$Entry;J)J

    goto :goto_3

    .line 566
    :cond_7
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$1600(Lokhttp3/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string v1, "REMOVE"

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 568
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-static {v4}, Lokhttp3/internal/DiskLruCache$Entry;->access$1600(Lokhttp3/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 569
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 571
    :cond_8
    :goto_3
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->flush()V

    .line 573
    iget-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    iget-wide v2, p0, Lokhttp3/internal/DiskLruCache;->maxSize:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_9

    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->journalRebuildRequired()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 574
    :cond_9
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->executor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 576
    :cond_a
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static create(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJ)Lokhttp3/internal/DiskLruCache;
    .locals 9

    .line 250
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-gtz v0, :cond_0

    .line 251
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxSize <= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 253
    :cond_0
    if-gtz p3, :cond_1

    .line 254
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "valueCount <= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 258
    :cond_1
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-string v1, "OkHttp DiskLruCache"

    .line 259
    const/4 v2, 0x1

    invoke-static {v1, v2}, Lokhttp3/internal/Util;->threadFactory(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object v8, v0

    .line 261
    new-instance v0, Lokhttp3/internal/DiskLruCache;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-wide v5, p4

    move-object v7, v8

    invoke-direct/range {v0 .. v7}, Lokhttp3/internal/DiskLruCache;-><init>(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLjava/util/concurrent/Executor;)V

    return-object v0
.end method

.method private declared-synchronized edit(Ljava/lang/String;J)Lokhttp3/internal/DiskLruCache$Editor;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 451
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache;->initialize()V

    .line 453
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->checkNotClosed()V

    .line 454
    invoke-direct {p0, p1}, Lokhttp3/internal/DiskLruCache;->validateKey(Ljava/lang/String;)V

    .line 455
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lokhttp3/internal/DiskLruCache$Entry;

    .line 456
    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-eqz v0, :cond_1

    if-eqz v2, :cond_0

    .line 457
    invoke-static {v2}, Lokhttp3/internal/DiskLruCache$Entry;->access$1700(Lokhttp3/internal/DiskLruCache$Entry;)J

    move-result-wide v0

    cmp-long v0, v0, p2

    if-eqz v0, :cond_1

    .line 458
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 460
    :cond_1
    if-eqz v2, :cond_2

    invoke-static {v2}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 461
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 463
    :cond_2
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->mostRecentTrimFailed:Z

    if-eqz v0, :cond_3

    .line 465
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->executor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 466
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 470
    :cond_3
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string v1, "DIRTY"

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    move-result-object v0

    invoke-interface {v0, p1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 471
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->flush()V

    .line 473
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->hasJournalErrors:Z

    if-eqz v0, :cond_4

    .line 474
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 477
    :cond_4
    if-nez v2, :cond_5

    .line 478
    new-instance v2, Lokhttp3/internal/DiskLruCache$Entry;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p1, v0}, Lokhttp3/internal/DiskLruCache$Entry;-><init>(Lokhttp3/internal/DiskLruCache;Ljava/lang/String;Lokhttp3/internal/DiskLruCache$1;)V

    .line 479
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    :cond_5
    new-instance v3, Lokhttp3/internal/DiskLruCache$Editor;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v2, v0}, Lokhttp3/internal/DiskLruCache$Editor;-><init>(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Entry;Lokhttp3/internal/DiskLruCache$1;)V

    .line 482
    invoke-static {v2, v3}, Lokhttp3/internal/DiskLruCache$Entry;->access$1002(Lokhttp3/internal/DiskLruCache$Entry;Lokhttp3/internal/DiskLruCache$Editor;)Lokhttp3/internal/DiskLruCache$Editor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 483
    monitor-exit p0

    return-object v3

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private journalRebuildRequired()Z
    .locals 3

    .line 583
    const/16 v2, 0x7d0

    .line 584
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget v0, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    .line 585
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

.method private newJournalWriter()Lokio/BufferedSink;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 304
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->appendingSink(Ljava/io/File;)Lokio/Sink;

    move-result-object v2

    .line 305
    new-instance v3, Lokhttp3/internal/DiskLruCache$2;

    invoke-direct {v3, p0, v2}, Lokhttp3/internal/DiskLruCache$2;-><init>(Lokhttp3/internal/DiskLruCache;Lokio/Sink;)V

    .line 311
    invoke-static {v3}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    return-object v0
.end method

.method private processJournal()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 358
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFileTmp:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->delete(Ljava/io/File;)V

    .line 359
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 360
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lokhttp3/internal/DiskLruCache$Entry;

    .line 361
    invoke-static {v5}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    if-nez v0, :cond_1

    .line 362
    const/4 v6, 0x0

    :goto_1
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->valueCount:I

    if-ge v6, v0, :cond_0

    .line 363
    iget-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    invoke-static {v5}, Lokhttp3/internal/DiskLruCache$Entry;->access$1300(Lokhttp3/internal/DiskLruCache$Entry;)[J

    move-result-object v2

    aget-wide v2, v2, v6

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    .line 362
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    goto :goto_3

    .line 366
    :cond_1
    const/4 v0, 0x0

    invoke-static {v5, v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$1002(Lokhttp3/internal/DiskLruCache$Entry;Lokhttp3/internal/DiskLruCache$Editor;)Lokhttp3/internal/DiskLruCache$Editor;

    .line 367
    const/4 v6, 0x0

    :goto_2
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->valueCount:I

    if-ge v6, v0, :cond_2

    .line 368
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    invoke-static {v5}, Lokhttp3/internal/DiskLruCache$Entry;->access$1400(Lokhttp3/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v1

    aget-object v1, v1, v6

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->delete(Ljava/io/File;)V

    .line 369
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    invoke-static {v5}, Lokhttp3/internal/DiskLruCache$Entry;->access$1500(Lokhttp3/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v1

    aget-object v1, v1, v6

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->delete(Ljava/io/File;)V

    .line 367
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 371
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 373
    :goto_3
    goto :goto_0

    .line 374
    :cond_3
    return-void
.end method

.method private readJournal()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 265
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->source(Ljava/io/File;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v3

    .line 267
    :try_start_0
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v4

    .line 268
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v5

    .line 269
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v6

    .line 270
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v7

    .line 271
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v8

    .line 272
    const-string v0, "libcore.io.DiskLruCache"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "1"

    .line 273
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lokhttp3/internal/DiskLruCache;->appVersion:I

    .line 274
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lokhttp3/internal/DiskLruCache;->valueCount:I

    .line 275
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    .line 276
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 277
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected journal header: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 281
    :cond_1
    const/4 v9, 0x0

    .line 284
    :goto_0
    :try_start_1
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lokhttp3/internal/DiskLruCache;->readJournalLine(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 285
    add-int/lit8 v9, v9, 0x1

    .line 288
    goto :goto_0

    .line 286
    :catch_0
    move-exception v10

    .line 287
    .line 290
    :try_start_2
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    sub-int v0, v9, v0

    iput v0, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    .line 293
    invoke-interface {v3}, Lokio/BufferedSource;->exhausted()Z

    move-result v0

    if-nez v0, :cond_2

    .line 294
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->rebuildJournal()V

    goto :goto_1

    .line 296
    :cond_2
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->newJournalWriter()Lokio/BufferedSink;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 299
    :goto_1
    invoke-static {v3}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 300
    goto :goto_2

    .line 299
    :catchall_0
    move-exception v11

    invoke-static {v3}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    throw v11

    .line 301
    :goto_2
    return-void
.end method

.method private readJournalLine(Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 315
    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    .line 316
    const/4 v0, -0x1

    if-ne v3, v0, :cond_0

    .line 317
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected journal line: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 320
    :cond_0
    add-int/lit8 v4, v3, 0x1

    .line 321
    const/16 v0, 0x20

    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    .line 323
    const/4 v0, -0x1

    if-ne v5, v0, :cond_1

    .line 324
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 325
    const-string v0, "REMOVE"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v3, v0, :cond_2

    const-string v0, "REMOVE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 326
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    return-void

    .line 330
    :cond_1
    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 333
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lokhttp3/internal/DiskLruCache$Entry;

    .line 334
    if-nez v7, :cond_3

    .line 335
    new-instance v7, Lokhttp3/internal/DiskLruCache$Entry;

    const/4 v0, 0x0

    invoke-direct {v7, p0, v6, v0}, Lokhttp3/internal/DiskLruCache$Entry;-><init>(Lokhttp3/internal/DiskLruCache;Ljava/lang/String;Lokhttp3/internal/DiskLruCache$1;)V

    .line 336
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v6, v7}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    :cond_3
    const/4 v0, -0x1

    if-eq v5, v0, :cond_4

    const-string v0, "CLEAN"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v3, v0, :cond_4

    const-string v0, "CLEAN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 340
    add-int/lit8 v0, v5, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 341
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$902(Lokhttp3/internal/DiskLruCache$Entry;Z)Z

    .line 342
    const/4 v0, 0x0

    invoke-static {v7, v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$1002(Lokhttp3/internal/DiskLruCache$Entry;Lokhttp3/internal/DiskLruCache$Editor;)Lokhttp3/internal/DiskLruCache$Editor;

    .line 343
    invoke-static {v7, v8}, Lokhttp3/internal/DiskLruCache$Entry;->access$1100(Lokhttp3/internal/DiskLruCache$Entry;[Ljava/lang/String;)V

    .line 344
    goto :goto_0

    :cond_4
    const/4 v0, -0x1

    if-ne v5, v0, :cond_5

    const-string v0, "DIRTY"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v3, v0, :cond_5

    const-string v0, "DIRTY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 345
    new-instance v0, Lokhttp3/internal/DiskLruCache$Editor;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v7, v1}, Lokhttp3/internal/DiskLruCache$Editor;-><init>(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Entry;Lokhttp3/internal/DiskLruCache$1;)V

    invoke-static {v7, v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$1002(Lokhttp3/internal/DiskLruCache$Entry;Lokhttp3/internal/DiskLruCache$Editor;)Lokhttp3/internal/DiskLruCache$Editor;

    goto :goto_0

    .line 346
    :cond_5
    const/4 v0, -0x1

    if-ne v5, v0, :cond_6

    const-string v0, "READ"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v3, v0, :cond_6

    const-string v0, "READ"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    .line 349
    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected journal line: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 351
    :goto_0
    return-void
.end method

.method private declared-synchronized rebuildJournal()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 381
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    if-eqz v0, :cond_0

    .line 382
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->close()V

    .line 385
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFileTmp:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->sink(Ljava/io/File;)Lokio/Sink;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 387
    const-string v0, "libcore.io.DiskLruCache"

    :try_start_1
    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 388
    const-string v0, "1"

    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 389
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->appVersion:I

    int-to-long v0, v0

    invoke-interface {v3, v0, v1}, Lokio/BufferedSink;->writeDecimalLong(J)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 390
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->valueCount:I

    int-to-long v0, v0

    invoke-interface {v3, v0, v1}, Lokio/BufferedSink;->writeDecimalLong(J)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 391
    const/16 v0, 0xa

    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 393
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lokhttp3/internal/DiskLruCache$Entry;

    .line 394
    invoke-static {v5}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 395
    const-string v0, "DIRTY"

    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 396
    invoke-static {v5}, Lokhttp3/internal/DiskLruCache$Entry;->access$1600(Lokhttp3/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 397
    const/16 v0, 0xa

    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    goto :goto_1

    .line 399
    :cond_1
    const-string v0, "CLEAN"

    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 400
    invoke-static {v5}, Lokhttp3/internal/DiskLruCache$Entry;->access$1600(Lokhttp3/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 401
    invoke-virtual {v5, v3}, Lokhttp3/internal/DiskLruCache$Entry;->writeLengths(Lokio/BufferedSink;)V

    .line 402
    const/16 v0, 0xa

    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 404
    :goto_1
    goto :goto_0

    .line 406
    :cond_2
    :try_start_2
    invoke-interface {v3}, Lokio/BufferedSink;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 407
    goto :goto_2

    .line 406
    :catchall_0
    move-exception v6

    :try_start_3
    invoke-interface {v3}, Lokio/BufferedSink;->close()V

    throw v6

    .line 409
    :goto_2
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->exists(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 410
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFile:Ljava/io/File;

    iget-object v2, p0, Lokhttp3/internal/DiskLruCache;->journalFileBackup:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lokhttp3/internal/io/FileSystem;->rename(Ljava/io/File;Ljava/io/File;)V

    .line 412
    :cond_3
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFileTmp:Ljava/io/File;

    iget-object v2, p0, Lokhttp3/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lokhttp3/internal/io/FileSystem;->rename(Ljava/io/File;Ljava/io/File;)V

    .line 413
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFileBackup:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->delete(Ljava/io/File;)V

    .line 415
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->newJournalWriter()Lokio/BufferedSink;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    .line 416
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->hasJournalErrors:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 417
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method private removeEntry(Lokhttp3/internal/DiskLruCache$Entry;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 607
    invoke-static {p1}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 608
    invoke-static {p1}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lokhttp3/internal/DiskLruCache$Editor;->access$2002(Lokhttp3/internal/DiskLruCache$Editor;Z)Z

    .line 611
    :cond_0
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->valueCount:I

    if-ge v4, v0, :cond_1

    .line 612
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    invoke-static {p1}, Lokhttp3/internal/DiskLruCache$Entry;->access$1400(Lokhttp3/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v1

    aget-object v1, v1, v4

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->delete(Ljava/io/File;)V

    .line 613
    iget-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    invoke-static {p1}, Lokhttp3/internal/DiskLruCache$Entry;->access$1300(Lokhttp3/internal/DiskLruCache$Entry;)[J

    move-result-object v2

    aget-wide v2, v2, v4

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    .line 614
    invoke-static {p1}, Lokhttp3/internal/DiskLruCache$Entry;->access$1300(Lokhttp3/internal/DiskLruCache$Entry;)[J

    move-result-object v0

    const-wide/16 v1, 0x0

    aput-wide v1, v0, v4

    .line 611
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 617
    :cond_1
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    .line 618
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string v1, "REMOVE"

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    move-result-object v0

    invoke-static {p1}, Lokhttp3/internal/DiskLruCache$Entry;->access$1600(Lokhttp3/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 619
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Lokhttp3/internal/DiskLruCache$Entry;->access$1600(Lokhttp3/internal/DiskLruCache$Entry;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->journalRebuildRequired()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 622
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->executor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 625
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private trimToSize()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 667
    :goto_0
    iget-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    iget-wide v2, p0, Lokhttp3/internal/DiskLruCache;->maxSize:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 668
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lokhttp3/internal/DiskLruCache$Entry;

    .line 669
    invoke-direct {p0, v4}, Lokhttp3/internal/DiskLruCache;->removeEntry(Lokhttp3/internal/DiskLruCache$Entry;)Z

    .line 670
    goto :goto_0

    .line 671
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->mostRecentTrimFailed:Z

    .line 672
    return-void
.end method

.method private validateKey(Ljava/lang/String;)V
    .locals 4

    .line 697
    sget-object v0, Lokhttp3/internal/DiskLruCache;->LEGAL_KEY_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 698
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    .line 699
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "keys must match regex [a-z0-9_-]{1,120}: \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 702
    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 650
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->initialized:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->closed:Z

    if-eqz v0, :cond_1

    .line 651
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->closed:Z

    .line 652
    monitor-exit p0

    return-void

    .line 655
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    new-array v1, v1, [Lokhttp3/internal/DiskLruCache$Entry;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Lokhttp3/internal/DiskLruCache$Entry;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 656
    invoke-static {v5}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 657
    invoke-static {v5}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache$Editor;->abort()V

    .line 655
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 660
    :cond_3
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->trimToSize()V

    .line 661
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->close()V

    .line 662
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    .line 663
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 664
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public delete()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 679
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache;->close()V

    .line 680
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->directory:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->deleteContents(Ljava/io/File;)V

    .line 681
    return-void
.end method

.method public edit(Ljava/lang/String;)Lokhttp3/internal/DiskLruCache$Editor;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 447
    const-wide/16 v0, -0x1

    invoke-direct {p0, p1, v0, v1}, Lokhttp3/internal/DiskLruCache;->edit(Ljava/lang/String;J)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized evictAll()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 688
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache;->initialize()V

    .line 690
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    new-array v1, v1, [Lokhttp3/internal/DiskLruCache$Entry;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Lokhttp3/internal/DiskLruCache$Entry;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 691
    invoke-direct {p0, v5}, Lokhttp3/internal/DiskLruCache;->removeEntry(Lokhttp3/internal/DiskLruCache$Entry;)Z

    .line 690
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 693
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->mostRecentTrimFailed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 694
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized flush()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 641
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->initialized:Z

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    .line 643
    :cond_0
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->checkNotClosed()V

    .line 644
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->trimToSize()V

    .line 645
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 646
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized get(Ljava/lang/String;)Lokhttp3/internal/DiskLruCache$Snapshot;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 424
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache;->initialize()V

    .line 426
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->checkNotClosed()V

    .line 427
    invoke-direct {p0, p1}, Lokhttp3/internal/DiskLruCache;->validateKey(Ljava/lang/String;)V

    .line 428
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lokhttp3/internal/DiskLruCache$Entry;

    .line 429
    if-eqz v2, :cond_0

    invoke-static {v2}, Lokhttp3/internal/DiskLruCache$Entry;->access$900(Lokhttp3/internal/DiskLruCache$Entry;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 431
    :cond_1
    invoke-virtual {v2}, Lokhttp3/internal/DiskLruCache$Entry;->snapshot()Lokhttp3/internal/DiskLruCache$Snapshot;

    move-result-object v3

    .line 432
    if-nez v3, :cond_2

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 434
    :cond_2
    iget v0, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/DiskLruCache;->redundantOpCount:I

    .line 435
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->journalWriter:Lokio/BufferedSink;

    const-string v1, "READ"

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    move-result-object v0

    invoke-interface {v0, p1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 436
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->journalRebuildRequired()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 437
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->executor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 440
    :cond_3
    monitor-exit p0

    return-object v3

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getDirectory()Ljava/io/File;
    .locals 1

    .line 488
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->directory:Ljava/io/File;

    return-object v0
.end method

.method public declared-synchronized getMaxSize()J
    .locals 3

    monitor-enter p0

    .line 495
    :try_start_0
    iget-wide v0, p0, Lokhttp3/internal/DiskLruCache;->maxSize:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized initialize()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 204
    :try_start_0
    sget-boolean v0, Lokhttp3/internal/DiskLruCache;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 206
    :cond_0
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->initialized:Z

    if-eqz v0, :cond_1

    .line 207
    monitor-exit p0

    return-void

    .line 211
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFileBackup:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->exists(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 213
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->exists(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 214
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFileBackup:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->delete(Ljava/io/File;)V

    goto :goto_0

    .line 216
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFileBackup:Ljava/io/File;

    iget-object v2, p0, Lokhttp3/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lokhttp3/internal/io/FileSystem;->rename(Ljava/io/File;Ljava/io/File;)V

    .line 221
    :cond_3
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->fileSystem:Lokhttp3/internal/io/FileSystem;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->exists(Ljava/io/File;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_4

    .line 223
    :try_start_1
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->readJournal()V

    .line 224
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->processJournal()V

    .line 225
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->initialized:Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    monitor-exit p0

    return-void

    .line 227
    :catch_0
    move-exception v3

    .line 228
    :try_start_2
    invoke-static {}, Lokhttp3/internal/Platform;->get()Lokhttp3/internal/Platform;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DiskLruCache "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/DiskLruCache;->directory:Ljava/io/File;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is corrupt: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 229
    invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", removing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 228
    invoke-virtual {v0, v1}, Lokhttp3/internal/Platform;->logW(Ljava/lang/String;)V

    .line 230
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache;->delete()V

    .line 231
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->closed:Z

    .line 235
    :cond_4
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->rebuildJournal()V

    .line 237
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->initialized:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 238
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public declared-synchronized isClosed()Z
    .locals 2

    monitor-enter p0

    .line 630
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized remove(Ljava/lang/String;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 595
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache;->initialize()V

    .line 597
    invoke-direct {p0}, Lokhttp3/internal/DiskLruCache;->checkNotClosed()V

    .line 598
    invoke-direct {p0, p1}, Lokhttp3/internal/DiskLruCache;->validateKey(Ljava/lang/String;)V

    .line 599
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lokhttp3/internal/DiskLruCache$Entry;

    .line 600
    if-nez v4, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 601
    :cond_0
    invoke-direct {p0, v4}, Lokhttp3/internal/DiskLruCache;->removeEntry(Lokhttp3/internal/DiskLruCache$Entry;)Z

    move-result v5

    .line 602
    if-eqz v5, :cond_1

    iget-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J

    iget-wide v2, p0, Lokhttp3/internal/DiskLruCache;->maxSize:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->mostRecentTrimFailed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 603
    :cond_1
    monitor-exit p0

    return v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setMaxSize(J)V
    .locals 2

    monitor-enter p0

    .line 503
    :try_start_0
    iput-wide p1, p0, Lokhttp3/internal/DiskLruCache;->maxSize:J

    .line 504
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache;->initialized:Z

    if-eqz v0, :cond_0

    .line 505
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache;->executor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 507
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized size()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 514
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache;->initialize()V

    .line 515
    iget-wide v0, p0, Lokhttp3/internal/DiskLruCache;->size:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized snapshots()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Lokhttp3/internal/DiskLruCache$Snapshot;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 720
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache;->initialize()V

    .line 721
    new-instance v0, Lokhttp3/internal/DiskLruCache$3;

    invoke-direct {v0, p0}, Lokhttp3/internal/DiskLruCache$3;-><init>(Lokhttp3/internal/DiskLruCache;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method
