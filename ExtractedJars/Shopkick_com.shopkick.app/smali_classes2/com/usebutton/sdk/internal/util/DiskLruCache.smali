.class public final Lcom/usebutton/sdk/internal/util/DiskLruCache;
.super Ljava/lang/Object;
.source "DiskLruCache.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;
    }
.end annotation


# static fields
.field static final ANY_SEQUENCE_NUMBER:J = -0x1L

.field private static final CLEAN:Ljava/lang/String; = "CLEAN"

.field private static final DIRTY:Ljava/lang/String; = "DIRTY"

.field private static final IO_BUFFER_SIZE:I = 0x2000

.field static final JOURNAL_FILE:Ljava/lang/String; = "journal"

.field static final JOURNAL_FILE_TMP:Ljava/lang/String; = "journal.tmp"

.field static final MAGIC:Ljava/lang/String; = "libcore.io.DiskLruCache"

.field private static final READ:Ljava/lang/String; = "READ"

.field private static final REMOVE:Ljava/lang/String; = "REMOVE"

.field public static final UTF_8:Ljava/nio/charset/Charset;

.field static final VERSION_1:Ljava/lang/String; = "1"


# instance fields
.field private final appVersion:I

.field private final cleanupCallable:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final directory:Ljava/io/File;

.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final journalFile:Ljava/io/File;

.field private final journalFileTmp:Ljava/io/File;

.field private journalWriter:Ljava/io/Writer;

.field private final lruEntries:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/util/Entry;",
            ">;"
        }
    .end annotation
.end field

.field private final maxSize:J

.field private nextSequenceNumber:J

.field private redundantOpCount:I

.field private size:J

.field private final valueCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    .line 106
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->UTF_8:Ljava/nio/charset/Charset;

    return-void
.end method

.method private constructor <init>(Ljava/io/File;IIJ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 285
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, 0x0

    .line 155
    iput-wide v2, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J

    .line 157
    new-instance v4, Ljava/util/LinkedHashMap;

    const/4 v5, 0x0

    const/high16 v6, 0x3f400000    # 0.75f

    const/4 v7, 0x1

    invoke-direct {v4, v5, v6, v7}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v4, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    .line 166
    iput-wide v2, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->nextSequenceNumber:J

    .line 265
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v13, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v14, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v14}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v15, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;

    const-string v3, "DiskLruCache"

    invoke-direct {v15, v3}, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x1

    const-wide/16 v11, 0x3c

    move-object v8, v2

    invoke-direct/range {v8 .. v15}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v2, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 268
    new-instance v2, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;

    invoke-direct {v2, v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;-><init>(Lcom/usebutton/sdk/internal/util/DiskLruCache;)V

    iput-object v2, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->cleanupCallable:Ljava/util/concurrent/Callable;

    .line 286
    iput-object v1, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->directory:Ljava/io/File;

    move/from16 v2, p2

    .line 287
    iput v2, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->appVersion:I

    .line 288
    new-instance v2, Ljava/io/File;

    const-string v3, "journal"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFile:Ljava/io/File;

    .line 289
    new-instance v2, Ljava/io/File;

    const-string v3, "journal.tmp"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFileTmp:Ljava/io/File;

    move/from16 v1, p3

    .line 290
    iput v1, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    move-wide/from16 v1, p4

    .line 291
    iput-wide v1, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->maxSize:J

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/util/DiskLruCache;)Ljava/io/Writer;
    .locals 0

    .line 95
    iget-object p0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/util/DiskLruCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 95
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->trimToSize()V

    return-void
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/util/DiskLruCache;)Z
    .locals 0

    .line 95
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalRebuildRequired()Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/util/DiskLruCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 95
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->rebuildJournal()V

    return-void
.end method

.method static synthetic access$402(Lcom/usebutton/sdk/internal/util/DiskLruCache;I)I
    .locals 0

    .line 95
    iput p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->redundantOpCount:I

    return p1
.end method

.method static synthetic access$600(Lcom/usebutton/sdk/internal/util/DiskLruCache;Ljava/lang/String;J)Lcom/usebutton/sdk/internal/util/Editor;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 95
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->edit(Ljava/lang/String;J)Lcom/usebutton/sdk/internal/util/Editor;

    move-result-object p0

    return-object p0
.end method

.method private checkNotClosed()V
    .locals 2

    .line 654
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    if-eqz v0, :cond_0

    return-void

    .line 655
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cache is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static closeQuietly(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 237
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception p0

    .line 239
    throw p0

    :catch_1
    :cond_0
    :goto_0
    return-void
.end method

.method private static copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;II)[TT;"
        }
    .end annotation

    .line 171
    array-length v0, p0

    if-gt p1, p2, :cond_1

    if-ltz p1, :cond_0

    if-gt p1, v0, :cond_0

    sub-int/2addr p2, p1

    sub-int/2addr v0, p1

    .line 179
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 181
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 182
    invoke-static {p0, p1, p2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    .line 176
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0

    .line 173
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static deleteContents(Ljava/io/File;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 250
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 254
    array-length p0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_2

    aget-object v2, v0, v1

    .line 255
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 256
    invoke-static {v2}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->deleteContents(Ljava/io/File;)V

    .line 258
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 259
    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "failed to delete file: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return-void

    .line 252
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not a directory: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static deleteIfExists(Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 450
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 451
    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method private declared-synchronized edit(Ljava/lang/String;J)Lcom/usebutton/sdk/internal/util/Editor;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 505
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->checkNotClosed()V

    .line 506
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->validateKey(Ljava/lang/String;)V

    .line 507
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/util/Entry;

    const-wide/16 v1, -0x1

    cmp-long v1, p2, v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    .line 508
    iget-wide v3, v0, Lcom/usebutton/sdk/internal/util/Entry;->sequenceNumber:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p2, v3, p2

    if-eqz p2, :cond_1

    .line 510
    :cond_0
    monitor-exit p0

    return-object v2

    :cond_1
    if-nez v0, :cond_2

    .line 513
    :try_start_1
    new-instance v0, Lcom/usebutton/sdk/internal/util/Entry;

    iget-object p2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->directory:Ljava/io/File;

    iget p3, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    invoke-direct {v0, p1, p2, p3}, Lcom/usebutton/sdk/internal/util/Entry;-><init>(Ljava/lang/String;Ljava/io/File;I)V

    .line 514
    iget-object p2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 515
    :cond_2
    iget-object p2, v0, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_3

    .line 516
    monitor-exit p0

    return-object v2

    .line 519
    :cond_3
    :goto_0
    :try_start_2
    new-instance p2, Lcom/usebutton/sdk/internal/util/Editor;

    invoke-direct {p2, v0, p0}, Lcom/usebutton/sdk/internal/util/Editor;-><init>(Lcom/usebutton/sdk/internal/util/Entry;Lcom/usebutton/sdk/internal/util/DiskLruCache;)V

    .line 520
    iput-object p2, v0, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    .line 523
    iget-object p3, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DIRTY "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 524
    iget-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    invoke-virtual {p1}, Ljava/io/Writer;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 525
    monitor-exit p0

    return-object p2

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 711
    new-instance v0, Ljava/io/InputStreamReader;

    sget-object v1, Lcom/usebutton/sdk/internal/util/DiskLruCache;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->readFully(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private journalRebuildRequired()Z
    .locals 2

    .line 608
    iget v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->redundantOpCount:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    .line 609
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

.method public static open(Ljava/io/File;IIJ)Lcom/usebutton/sdk/internal/util/DiskLruCache;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-lez v0, :cond_2

    if-lez p2, :cond_1

    .line 313
    new-instance v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/usebutton/sdk/internal/util/DiskLruCache;-><init>(Ljava/io/File;IIJ)V

    .line 314
    iget-object v1, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 316
    :try_start_0
    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->readJournal()V

    .line 317
    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->processJournal()V

    .line 318
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/FileWriter;

    iget-object v3, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFile:Ljava/io/File;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    const/16 v3, 0x2000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 322
    :catch_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->delete()V

    .line 327
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 328
    new-instance v0, Lcom/usebutton/sdk/internal/util/DiskLruCache;

    move-object v4, v0

    move-object v5, p0

    move v6, p1

    move v7, p2

    move-wide v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/usebutton/sdk/internal/util/DiskLruCache;-><init>(Ljava/io/File;IIJ)V

    .line 329
    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->rebuildJournal()V

    return-object v0

    .line 309
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p1, "valueCount <= 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 306
    :cond_2
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

    .line 398
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFileTmp:Ljava/io/File;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    .line 399
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 400
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/util/Entry;

    .line 401
    iget-object v2, v1, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 402
    :goto_1
    iget v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    if-ge v3, v2, :cond_0

    .line 403
    iget-wide v4, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J

    iget-object v2, v1, Lcom/usebutton/sdk/internal/util/Entry;->lengths:[J

    aget-wide v6, v2, v3

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 406
    iput-object v2, v1, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    .line 407
    :goto_2
    iget v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    if-ge v3, v2, :cond_2

    .line 408
    invoke-virtual {v1, v3}, Lcom/usebutton/sdk/internal/util/Entry;->getCleanFile(I)Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    .line 409
    invoke-virtual {v1, v3}, Lcom/usebutton/sdk/internal/util/Entry;->getDirtyFile(I)Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 411
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 215
    :goto_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    const/16 v2, 0xa

    if-ne v1, v2, :cond_1

    .line 224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-lez p0, :cond_0

    add-int/lit8 p0, p0, -0x1

    .line 225
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v1

    const/16 v2, 0xd

    if-ne v1, v2, :cond_0

    .line 226
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 228
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    int-to-char v1, v1

    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 217
    :cond_2
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0
.end method

.method public static readFully(Ljava/io/Reader;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 191
    :try_start_0
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    const/16 v1, 0x400

    .line 192
    new-array v1, v1, [C

    .line 194
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    .line 195
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/StringWriter;->write([CII)V

    goto :goto_0

    .line 197
    :cond_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    invoke-virtual {p0}, Ljava/io/Reader;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Ljava/io/Reader;->close()V

    throw v0
.end method

.method private readJournal()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 334
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/16 v2, 0x2000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 336
    :try_start_0
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    .line 337
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v2

    .line 338
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    .line 339
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v4

    .line 340
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "libcore.io.DiskLruCache"

    .line 341
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "1"

    .line 342
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget v6, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->appVersion:I

    .line 343
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget v3, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    .line 344
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, ""

    .line 345
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    .line 352
    :goto_0
    :try_start_1
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->readJournalLine(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 358
    :catch_0
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    .line 346
    :cond_0
    :try_start_2
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
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v1

    .line 358
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->closeQuietly(Ljava/io/Closeable;)V

    throw v1
.end method

.method private readJournalLine(Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, " "

    .line 363
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 364
    array-length v1, v0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_5

    const/4 v1, 0x1

    .line 368
    aget-object v3, v0, v1

    const/4 v4, 0x0

    .line 369
    aget-object v5, v0, v4

    const-string v6, "REMOVE"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    array-length v5, v0

    if-ne v5, v2, :cond_0

    .line 370
    iget-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 374
    :cond_0
    iget-object v5, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/usebutton/sdk/internal/util/Entry;

    if-nez v5, :cond_1

    .line 376
    new-instance v5, Lcom/usebutton/sdk/internal/util/Entry;

    iget-object v6, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->directory:Ljava/io/File;

    iget v7, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    invoke-direct {v5, v3, v6, v7}, Lcom/usebutton/sdk/internal/util/Entry;-><init>(Ljava/lang/String;Ljava/io/File;I)V

    .line 377
    iget-object v6, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v3, v5}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    :cond_1
    aget-object v3, v0, v4

    const-string v6, "CLEAN"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    array-length v3, v0

    iget v6, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    add-int/2addr v6, v2

    if-ne v3, v6, :cond_2

    .line 381
    iput-boolean v1, v5, Lcom/usebutton/sdk/internal/util/Entry;->readable:Z

    const/4 p1, 0x0

    .line 382
    iput-object p1, v5, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    .line 383
    array-length p1, v0

    invoke-static {v0, v2, p1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {v5, p1}, Lcom/usebutton/sdk/internal/util/Entry;->setLengths([Ljava/lang/String;)V

    goto :goto_0

    .line 384
    :cond_2
    aget-object v1, v0, v4

    const-string v3, "DIRTY"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    array-length v1, v0

    if-ne v1, v2, :cond_3

    .line 385
    new-instance p1, Lcom/usebutton/sdk/internal/util/Editor;

    invoke-direct {p1, v5, p0}, Lcom/usebutton/sdk/internal/util/Editor;-><init>(Lcom/usebutton/sdk/internal/util/Entry;Lcom/usebutton/sdk/internal/util/DiskLruCache;)V

    iput-object p1, v5, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    goto :goto_0

    .line 386
    :cond_3
    aget-object v1, v0, v4

    const-string v3, "READ"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    array-length v0, v0

    if-ne v0, v2, :cond_4

    :goto_0
    return-void

    .line 389
    :cond_4
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

    .line 365
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
.end method

.method private declared-synchronized rebuildJournal()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 421
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    if-eqz v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 425
    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/FileWriter;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFileTmp:Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    const/16 v2, 0x2000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    const-string v1, "libcore.io.DiskLruCache"

    .line 426
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "\n"

    .line 427
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "1"

    .line 428
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "\n"

    .line 429
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 430
    iget v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->appVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "\n"

    .line 431
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 432
    iget v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "\n"

    .line 433
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "\n"

    .line 434
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 436
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

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

    check-cast v3, Lcom/usebutton/sdk/internal/util/Entry;

    .line 437
    iget-object v4, v3, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    const/16 v5, 0xa

    if-eqz v4, :cond_1

    .line 438
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "DIRTY "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Lcom/usebutton/sdk/internal/util/Entry;->key:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_0

    .line 440
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CLEAN "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v3, Lcom/usebutton/sdk/internal/util/Entry;->key:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/util/Entry;->getLengths()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_0

    .line 444
    :cond_2
    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 445
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFileTmp:Ljava/io/File;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFile:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 446
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/FileWriter;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalFile:Ljava/io/File;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private trimToSize()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 686
    :goto_0
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J

    iget-wide v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->maxSize:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 688
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 689
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->remove(Ljava/lang/String;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private validateKey(Ljava/lang/String;)V
    .locals 3

    const-string v0, " "

    .line 704
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\r"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 705
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "keys must not contain spaces or newlines: \""

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
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 672
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 673
    monitor-exit p0

    return-void

    .line 675
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/util/Entry;

    .line 676
    iget-object v2, v1, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    if-eqz v2, :cond_1

    .line 677
    iget-object v1, v1, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/util/Editor;->abort()V

    goto :goto_0

    .line 680
    :cond_2
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->trimToSize()V

    .line 681
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    const/4 v0, 0x0

    .line 682
    iput-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 683
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected declared-synchronized completeEdit(Lcom/usebutton/sdk/internal/util/Editor;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 553
    :try_start_0
    iget-object v0, p1, Lcom/usebutton/sdk/internal/util/Editor;->entry:Lcom/usebutton/sdk/internal/util/Entry;

    .line 554
    iget-object v1, v0, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    if-ne v1, p1, :cond_9

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    .line 559
    iget-boolean v2, v0, Lcom/usebutton/sdk/internal/util/Entry;->readable:Z

    if-nez v2, :cond_1

    move v2, v1

    .line 560
    :goto_0
    iget v3, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    if-ge v2, v3, :cond_1

    .line 561
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/util/Entry;->getDirtyFile(I)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 562
    :cond_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/util/Editor;->abort()V

    .line 563
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "edit didn\'t create file "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 568
    :cond_1
    :goto_1
    iget p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    if-ge v1, p1, :cond_4

    .line 569
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/Entry;->getDirtyFile(I)Ljava/io/File;

    move-result-object p1

    if-eqz p2, :cond_2

    .line 571
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 572
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/Entry;->getCleanFile(I)Ljava/io/File;

    move-result-object v2

    .line 573
    invoke-virtual {p1, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 574
    iget-object p1, v0, Lcom/usebutton/sdk/internal/util/Entry;->lengths:[J

    aget-wide v3, p1, v1

    .line 575
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v5

    .line 576
    iget-object p1, v0, Lcom/usebutton/sdk/internal/util/Entry;->lengths:[J

    aput-wide v5, p1, v1

    .line 577
    iget-wide v7, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J

    sub-long/2addr v7, v3

    add-long/2addr v7, v5

    iput-wide v7, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J

    goto :goto_2

    .line 580
    :cond_2
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->deleteIfExists(Ljava/io/File;)V

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 584
    :cond_4
    iget p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->redundantOpCount:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->redundantOpCount:I

    const/4 p1, 0x0

    .line 585
    iput-object p1, v0, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    .line 586
    iget-boolean p1, v0, Lcom/usebutton/sdk/internal/util/Entry;->readable:Z

    or-int/2addr p1, p2

    const/16 v2, 0xa

    if-eqz p1, :cond_5

    .line 587
    iput-boolean v1, v0, Lcom/usebutton/sdk/internal/util/Entry;->readable:Z

    .line 588
    iget-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CLEAN "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/usebutton/sdk/internal/util/Entry;->key:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/util/Entry;->getLengths()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    if-eqz p2, :cond_6

    .line 590
    iget-wide p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->nextSequenceNumber:J

    const-wide/16 v1, 0x1

    add-long/2addr v1, p1

    iput-wide v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->nextSequenceNumber:J

    iput-wide p1, v0, Lcom/usebutton/sdk/internal/util/Entry;->sequenceNumber:J

    goto :goto_3

    .line 593
    :cond_5
    iget-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    iget-object p2, v0, Lcom/usebutton/sdk/internal/util/Entry;->key:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    iget-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "REMOVE "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/util/Entry;->key:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 597
    :cond_6
    :goto_3
    iget-wide p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J

    iget-wide v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->maxSize:J

    cmp-long p1, p1, v0

    if-gtz p1, :cond_7

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalRebuildRequired()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 598
    :cond_7
    iget-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->executorService:Ljava/util/concurrent/ExecutorService;

    iget-object p2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->cleanupCallable:Ljava/util/concurrent/Callable;

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 600
    :cond_8
    monitor-exit p0

    return-void

    .line 555
    :cond_9
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public delete()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 699
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->close()V

    .line 700
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->directory:Ljava/io/File;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->deleteContents(Ljava/io/File;)V

    return-void
.end method

.method public edit(Ljava/lang/String;)Lcom/usebutton/sdk/internal/util/Editor;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, -0x1

    .line 501
    invoke-direct {p0, p1, v0, v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->edit(Ljava/lang/String;J)Lcom/usebutton/sdk/internal/util/Editor;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 663
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->checkNotClosed()V

    .line 664
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->trimToSize()V

    .line 665
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 666
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized get(Ljava/lang/String;)Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 461
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->checkNotClosed()V

    .line 462
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->validateKey(Ljava/lang/String;)V

    .line 463
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/util/Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 465
    monitor-exit p0

    return-object v1

    .line 468
    :cond_0
    :try_start_1
    iget-boolean v2, v0, Lcom/usebutton/sdk/internal/util/Entry;->readable:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_1

    .line 469
    monitor-exit p0

    return-object v1

    .line 477
    :cond_1
    :try_start_2
    iget v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    new-array v8, v2, [Ljava/io/InputStream;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x0

    .line 479
    :goto_0
    :try_start_3
    iget v3, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    if-ge v2, v3, :cond_2

    .line 480
    new-instance v3, Ljava/io/FileInputStream;

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/util/Entry;->getCleanFile(I)Ljava/io/File;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    aput-object v3, v8, v2
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 487
    :cond_2
    :try_start_4
    iget v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->redundantOpCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->redundantOpCount:I

    .line 488
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "READ "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 489
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalRebuildRequired()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 490
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->executorService:Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->cleanupCallable:Ljava/util/concurrent/Callable;

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 493
    :cond_3
    new-instance v1, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;

    iget-wide v6, v0, Lcom/usebutton/sdk/internal/util/Entry;->sequenceNumber:J

    const/4 v9, 0x0

    move-object v3, v1

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v3 .. v9}, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;-><init>(Lcom/usebutton/sdk/internal/util/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;Lcom/usebutton/sdk/internal/util/DiskLruCache$1;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object v1

    .line 484
    :catch_0
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getDirectory()Ljava/io/File;
    .locals 1

    .line 532
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->directory:Ljava/io/File;

    return-object v0
.end method

.method public isClosed()Z
    .locals 1

    .line 650
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public maxSize()J
    .locals 2

    .line 540
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->maxSize:J

    return-wide v0
.end method

.method public declared-synchronized remove(Ljava/lang/String;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 619
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->checkNotClosed()V

    .line 620
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->validateKey(Ljava/lang/String;)V

    .line 621
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/util/Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 622
    iget-object v2, v0, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    if-eqz v2, :cond_0

    goto :goto_1

    .line 626
    :cond_0
    :goto_0
    iget v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->valueCount:I

    if-ge v1, v2, :cond_2

    .line 627
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/Entry;->getCleanFile(I)Ljava/io/File;

    move-result-object v2

    .line 628
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 631
    iget-wide v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J

    iget-object v4, v0, Lcom/usebutton/sdk/internal/util/Entry;->lengths:[J

    aget-wide v5, v4, v1

    sub-long/2addr v2, v5

    iput-wide v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J

    .line 632
    iget-object v2, v0, Lcom/usebutton/sdk/internal/util/Entry;->lengths:[J

    const-wide/16 v3, 0x0

    aput-wide v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 629
    :cond_1
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "failed to delete "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 635
    :cond_2
    iget v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->redundantOpCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->redundantOpCount:I

    .line 636
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalWriter:Ljava/io/Writer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "REMOVE "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 637
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->journalRebuildRequired()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 640
    iget-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->executorService:Ljava/util/concurrent/ExecutorService;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->cleanupCallable:Ljava/util/concurrent/Callable;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 643
    :cond_3
    monitor-exit p0

    return v1

    .line 623
    :cond_4
    :goto_1
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized size()J
    .locals 2

    monitor-enter p0

    .line 549
    :try_start_0
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
