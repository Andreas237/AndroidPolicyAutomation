.class public Lcom/usebutton/sdk/internal/util/DiskLink;
.super Lcom/usebutton/sdk/internal/util/ResourceLink;
.source "DiskLink.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/util/ResourceLink<",
        "Landroid/net/Uri;",
        "Lcom/usebutton/sdk/internal/util/Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final APP_VERSION:I = 0x1

.field public static final BUFFER_SIZE:I = 0x1000

.field private static final FLUSH_INTERVAL:J

.field public static final INDEX_IMAGE:I = 0x0

.field private static final TAG:Ljava/lang/String; = "DiskLink"


# instance fields
.field private final mCacheDir:Ljava/io/File;

.field private final mConfiguration:Lcom/usebutton/sdk/internal/functional/Getter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private mDoFlush:Ljava/lang/Runnable;

.field private final mHandler:Landroid/os/Handler;

.field private mMaxItemSize:I

.field private mStore:Lcom/usebutton/sdk/internal/util/DiskLruCache;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 25
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/usebutton/sdk/internal/util/DiskLink;->FLUSH_INTERVAL:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/functional/Getter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;)V"
        }
    .end annotation

    .line 63
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ResourceLink;-><init>()V

    .line 30
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mHandler:Landroid/os/Handler;

    .line 31
    new-instance v0, Lcom/usebutton/sdk/internal/util/DiskLink$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/util/DiskLink$1;-><init>(Lcom/usebutton/sdk/internal/util/DiskLink;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mDoFlush:Ljava/lang/Runnable;

    .line 64
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mCacheDir:Ljava/io/File;

    .line 65
    iput-object p2, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mConfiguration:Lcom/usebutton/sdk/internal/functional/Getter;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/util/DiskLink;)Lcom/usebutton/sdk/internal/util/DiskLruCache;
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLink;->getStore()Lcom/usebutton/sdk/internal/util/DiskLruCache;

    move-result-object p0

    return-object p0
.end method

.method private getKey(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 142
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getStore()Lcom/usebutton/sdk/internal/util/DiskLruCache;
    .locals 5
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mStore:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mConfiguration:Lcom/usebutton/sdk/internal/functional/Getter;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/functional/Getter;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Configuration;

    .line 51
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getCacheImageGlobalSizeBytes()I

    move-result v1

    .line 53
    :try_start_0
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mCacheDir:Ljava/io/File;

    const-string v4, "com.usebutton.assets"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    int-to-long v3, v1

    const/4 v1, 0x1

    .line 54
    invoke-static {v2, v1, v1, v3, v4}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->open(Ljava/io/File;IIJ)Lcom/usebutton/sdk/internal/util/DiskLruCache;

    move-result-object v1

    iput-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mStore:Lcom/usebutton/sdk/internal/util/DiskLruCache;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "DiskLink"

    const-string v3, "Couldn\'t create cache."

    .line 56
    invoke-static {v2, v3, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    :goto_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getCacheImageMaxSizeBytes()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mMaxItemSize:I

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mStore:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    return-object v0
.end method

.method private scheduleFlush()V
    .locals 4

    .line 137
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mDoFlush:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 138
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mDoFlush:Ljava/lang/Runnable;

    sget-wide v2, Lcom/usebutton/sdk/internal/util/DiskLink;->FLUSH_INTERVAL:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public doGet(Landroid/net/Uri;)Lcom/usebutton/sdk/internal/util/Data;
    .locals 6
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 72
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLink;->getStore()Lcom/usebutton/sdk/internal/util/DiskLruCache;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 73
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->isClosed()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_5

    .line 78
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/util/DiskLink;->getKey(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->get(Ljava/lang/String;)Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 99
    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->closeQuietly(Ljava/io/Closeable;)V

    return-object v1

    :cond_1
    const/4 v2, 0x0

    .line 83
    :try_start_1
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->getInputStream(I)Ljava/io/InputStream;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    :try_start_2
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v4, 0x1000

    .line 86
    new-array v4, v4, [B

    .line 88
    :goto_0
    invoke-virtual {v0, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-gez v5, :cond_2

    const-string v2, "DiskLink"

    .line 92
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Get hit for image: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    new-instance v2, Lcom/usebutton/sdk/internal/util/Data;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/usebutton/sdk/internal/util/Data;-><init>([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->closeQuietly(Ljava/io/Closeable;)V

    return-object v2

    .line 90
    :cond_2
    :try_start_3
    invoke-virtual {v3, v4, v2, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_4

    :catch_2
    move-exception v2

    move-object v0, v1

    :goto_1
    :try_start_4
    const-string v3, "DiskLink"

    .line 97
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Ran out of memory while reading asset for url: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_3
    move-exception v2

    move-object v0, v1

    :goto_2
    const-string v3, "DiskLink"

    .line 95
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception while reading cached value for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 99
    :goto_3
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->closeQuietly(Ljava/io/Closeable;)V

    return-object v1

    :catchall_1
    move-exception p1

    :goto_4
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->closeQuietly(Ljava/io/Closeable;)V

    throw p1

    :cond_3
    :goto_5
    return-object v1
.end method

.method public bridge synthetic doGet(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 20
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/util/DiskLink;->doGet(Landroid/net/Uri;)Lcom/usebutton/sdk/internal/util/Data;

    move-result-object p1

    return-object p1
.end method

.method public doPut(Landroid/net/Uri;Lcom/usebutton/sdk/internal/util/Data;)V
    .locals 6
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/util/Data;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 106
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLink;->getStore()Lcom/usebutton/sdk/internal/util/DiskLruCache;

    move-result-object v0

    if-eqz p2, :cond_3

    .line 108
    iget-object v1, p2, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    .line 111
    :cond_0
    iget-object v1, p2, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    array-length v1, v1

    iget v2, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mMaxItemSize:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-le v1, v2, :cond_1

    .line 112
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Rejecting %d bytes for %s, greater than per item limit %d bytes."

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object p2, p2, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    array-length p2, p2

    .line 113
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v5

    aput-object p1, v2, v4

    iget p1, p0, Lcom/usebutton/sdk/internal/util/DiskLink;->mMaxItemSize:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    .line 112
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "DiskLink"

    .line 114
    invoke-static {p2, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 118
    :cond_1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/util/DiskLink;->getKey(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    .line 119
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->get(Ljava/lang/String;)Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;

    move-result-object v2

    if-nez v2, :cond_2

    .line 121
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->edit(Ljava/lang/String;)Lcom/usebutton/sdk/internal/util/Editor;

    move-result-object v0

    .line 122
    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, v5}, Lcom/usebutton/sdk/internal/util/Editor;->newOutputStream(I)Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 123
    iget-object v2, p2, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    invoke-virtual {v1, v2}, Ljava/io/BufferedOutputStream;->write([B)V

    .line 124
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V

    .line 125
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/util/Editor;->commit()V

    .line 126
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLink;->scheduleFlush()V

    const-string v0, "DiskLink"

    .line 127
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "Put %d bytes for URL: %s"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object p2, p2, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    array-length p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v3, v5

    aput-object p1, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 129
    :cond_2
    invoke-virtual {v2, v5}, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->getInputStream(I)Ljava/io/InputStream;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    const-string v0, "DiskLink"

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception while writing data for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic doPut(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 20
    check-cast p1, Landroid/net/Uri;

    check-cast p2, Lcom/usebutton/sdk/internal/util/Data;

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/util/DiskLink;->doPut(Landroid/net/Uri;Lcom/usebutton/sdk/internal/util/Data;)V

    return-void
.end method

.method public declared-synchronized size()I
    .locals 2

    monitor-enter p0

    .line 147
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/DiskLink;->getStore()Lcom/usebutton/sdk/internal/util/DiskLruCache;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 148
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->size()J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
