.class public Lcom/yandex/metrica/impl/ob/fd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fc;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private c:Ljava/io/File;

.field private d:Lcom/yandex/metrica/impl/ob/et;

.field private e:Ljava/nio/channels/FileLock;

.field private f:Ljava/io/RandomAccessFile;

.field private g:Ljava/nio/channels/FileChannel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->a:Landroid/content/Context;

    .line 39
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/fd;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public declared-synchronized a()Landroid/database/sqlite/SQLiteDatabase;
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    monitor-enter p0

    .line 45
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/fd;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/fd;->b:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".lock"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/fd;->c:Ljava/io/File;

    .line 46
    new-instance v0, Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/fd;->c:Ljava/io/File;

    const-string v2, "rw"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/fd;->f:Ljava/io/RandomAccessFile;

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/fd;->f:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/fd;->g:Ljava/nio/channels/FileChannel;

    .line 48
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/fd;->g:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/fd;->e:Ljava/nio/channels/FileLock;

    .line 49
    new-instance v0, Lcom/yandex/metrica/impl/ob/et;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/fd;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/fd;->b:Ljava/lang/String;

    invoke-static {}, Lcom/yandex/metrica/impl/ob/eq;->c()Lcom/yandex/metrica/impl/ob/ez;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ob/et;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ez;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/fd;->d:Lcom/yandex/metrica/impl/ob/et;

    .line 51
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/fd;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/et;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 44
    monitor-exit p0

    throw v0

    :catch_0
    const/4 v0, 0x0

    .line 55
    monitor-exit p0

    return-object v0
.end method

.method public declared-synchronized a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_0

    .line 1253
    :try_start_0
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 61
    :catch_0
    :cond_0
    :goto_0
    :try_start_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    .line 62
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->c:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->e:Ljava/nio/channels/FileLock;

    invoke-static {p1}, Lcom/yandex/metrica/impl/u;->a(Ljava/nio/channels/FileLock;)V

    .line 63
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->f:Ljava/io/RandomAccessFile;

    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    .line 64
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->g:Ljava/nio/channels/FileChannel;

    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    const/4 p1, 0x0

    .line 65
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->d:Lcom/yandex/metrica/impl/ob/et;

    .line 66
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->f:Ljava/io/RandomAccessFile;

    .line 67
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->e:Ljava/nio/channels/FileLock;

    .line 68
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/fd;->g:Ljava/nio/channels/FileChannel;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    monitor-exit p0

    return-void

    .line 59
    :goto_1
    monitor-exit p0

    throw p1
.end method
