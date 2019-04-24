.class public final Lcom/google/android/play/core/internal/w;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/splitinstall/f;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/play/core/splitcompat/c;

.field private final c:Lcom/google/android/play/core/internal/y;

.field private final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/play/core/internal/y;Lcom/google/android/play/core/splitcompat/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/internal/w;->a:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/play/core/internal/w;->b:Lcom/google/android/play/core/splitcompat/c;

    iput-object p3, p0, Lcom/google/android/play/core/internal/w;->c:Lcom/google/android/play/core/internal/y;

    iput-object p2, p0, Lcom/google/android/play/core/internal/w;->d:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/internal/w;)Lcom/google/android/play/core/internal/y;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/w;->c:Lcom/google/android/play/core/internal/y;

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/play/core/internal/w;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/play/core/internal/w;->a(Ljava/util/List;)V

    return-void
.end method

.method private static synthetic a(Ljava/lang/Throwable;Ljava/io/InputStream;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p0, p1}, Lcom/google/android/play/core/internal/ba;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method private final a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    const-string/jumbo v1, "split_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/internal/w;->b:Lcom/google/android/play/core/splitcompat/c;

    invoke-virtual {v2, v1}, Lcom/google/android/play/core/splitcompat/c;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/google/android/play/core/internal/w;->b:Lcom/google/android/play/core/splitcompat/c;

    invoke-virtual {v3, v1}, Lcom/google/android/play/core/splitcompat/c;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/io/BufferedInputStream;

    new-instance v3, Ljava/io/FileInputStream;

    iget-object v4, p0, Lcom/google/android/play/core/internal/w;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    const-string v5, "r"

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v1, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v2, 0x1000

    :try_start_1
    new-array v2, v2, [B

    :goto_1
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-lez v4, :cond_1

    const/4 v5, 0x0

    invoke-virtual {v3, v2, v5, v4}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_1
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/w;->a(Ljava/lang/Throwable;Ljava/io/InputStream;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v2, v0

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    move-object v6, v2

    move-object v2, p1

    move-object p1, v6

    :goto_2
    if-eqz v2, :cond_2

    :try_start_4
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catch_1
    move-exception v3

    :try_start_5
    invoke-static {v2, v3}, Lcom/google/android/play/core/internal/ba;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_2
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    :goto_3
    throw p1
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    goto :goto_4

    :catch_2
    move-exception p1

    move-object v0, p1

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_4
    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/w;->a(Ljava/lang/Throwable;Ljava/io/InputStream;)V

    throw p1

    :cond_3
    return-void
.end method

.method static synthetic b(Lcom/google/android/play/core/internal/w;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/w;->a:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/List;Lcom/google/android/play/core/splitinstall/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;",
            "Lcom/google/android/play/core/splitinstall/e;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/play/core/splitcompat/SplitCompat;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/internal/w;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/play/core/internal/x;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/play/core/internal/x;-><init>(Lcom/google/android/play/core/internal/w;Ljava/util/List;Lcom/google/android/play/core/splitinstall/e;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Ingestion should only be called in SplitCompat mode."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
