.class public Lcom/google/android/play/core/splitcompat/SplitCompat;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/play/core/splitcompat/SplitCompat;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/google/android/play/core/splitcompat/c;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/google/android/play/core/splitcompat/SplitCompat;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->c:Ljava/util/Set;

    :try_start_0
    new-instance v0, Lcom/google/android/play/core/splitcompat/c;

    invoke-direct {v0, p1}, Lcom/google/android/play/core/splitcompat/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->b:Lcom/google/android/play/core/splitcompat/c;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance v0, Lcom/google/android/play/core/internal/v;

    const-string v1, "Failed to initialize FileStorage"

    invoke-direct {v0, v1, p1}, Lcom/google/android/play/core/internal/v;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method static synthetic a(Lcom/google/android/play/core/splitcompat/SplitCompat;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/play/core/splitcompat/SplitCompat;->b()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/play/core/splitcompat/SplitCompat;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/play/core/splitcompat/SplitCompat;->a(Landroid/content/Context;Z)Z

    move-result p0

    return p0
.end method

.method private static a(Landroid/content/Context;Z)Z
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    sget-object v0, Lcom/google/android/play/core/splitcompat/SplitCompat;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    new-instance v3, Lcom/google/android/play/core/splitcompat/SplitCompat;

    invoke-direct {v3, p0}, Lcom/google/android/play/core/splitcompat/SplitCompat;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    sget-object v2, Lcom/google/android/play/core/splitcompat/SplitCompat;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/play/core/splitcompat/SplitCompat;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/play/core/internal/w;

    invoke-static {}, Lcom/google/android/play/core/splitcompat/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    new-instance v4, Lcom/google/android/play/core/internal/y;

    iget-object v5, v2, Lcom/google/android/play/core/splitcompat/SplitCompat;->b:Lcom/google/android/play/core/splitcompat/c;

    new-instance v6, Lcom/google/android/play/core/internal/at;

    invoke-direct {v6}, Lcom/google/android/play/core/internal/at;-><init>()V

    invoke-direct {v4, p0, v5, v6}, Lcom/google/android/play/core/internal/y;-><init>(Landroid/content/Context;Lcom/google/android/play/core/splitcompat/c;Lcom/google/android/play/core/internal/at;)V

    iget-object v5, v2, Lcom/google/android/play/core/splitcompat/SplitCompat;->b:Lcom/google/android/play/core/splitcompat/c;

    invoke-direct {v0, p0, v3, v4, v5}, Lcom/google/android/play/core/internal/w;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/play/core/internal/y;Lcom/google/android/play/core/splitcompat/c;)V

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/d;->a(Lcom/google/android/play/core/splitinstall/f;)V

    new-instance v0, Lcom/google/android/play/core/splitcompat/l;

    invoke-direct {v0, v2}, Lcom/google/android/play/core/splitcompat/l;-><init>(Lcom/google/android/play/core/splitcompat/SplitCompat;)V

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/g;->a(Lcom/google/android/play/core/splitinstall/h;)V

    new-instance v0, Lcom/google/android/play/core/splitcompat/m;

    invoke-direct {v0, p0}, Lcom/google/android/play/core/splitcompat/m;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :try_start_0
    invoke-direct {v2, p0, p1}, Lcom/google/android/play/core/splitcompat/SplitCompat;->b(Landroid/content/Context;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    const-string p1, "SplitCompat"

    const-string v0, "Error installing additional splits"

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v1
.end method

.method private static a(Lcom/google/android/play/core/splitcompat/p;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/util/zip/ZipFile;

    invoke-virtual {p0}, Lcom/google/android/play/core/splitcompat/p;->b()Ljava/io/File;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string p0, "classes.dex"

    invoke-virtual {v1, p0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return p0

    :catch_0
    move-exception p0

    move-object v0, v1

    goto :goto_1

    :catch_1
    move-exception p0

    :goto_1
    if-eqz v0, :cond_1

    :try_start_2
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    invoke-static {p0, v0}, Lcom/google/android/play/core/internal/ba;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    throw p0
.end method

.method static synthetic b(Lcom/google/android/play/core/splitcompat/SplitCompat;)Lcom/google/android/play/core/splitcompat/c;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->b:Lcom/google/android/play/core/splitcompat/c;

    return-object p0
.end method

.method private final declared-synchronized b()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->c:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized b(Landroid/content/Context;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    if-eqz p2, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->b:Lcom/google/android/play/core/splitcompat/c;

    invoke-virtual {v0}, Lcom/google/android/play/core/splitcompat/c;->a()V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/play/core/splitcompat/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/android/play/core/splitcompat/n;

    invoke-direct {v1, p0}, Lcom/google/android/play/core/splitcompat/n;-><init>(Lcom/google/android/play/core/splitcompat/SplitCompat;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/play/core/splitcompat/SplitCompat;->c(Landroid/content/Context;Z)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/play/core/splitcompat/p;

    invoke-virtual {v3}, Lcom/google/android/play/core/splitcompat/p;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/play/core/splitinstall/i;->a(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v2, Ljava/util/HashSet;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/play/core/splitcompat/p;

    invoke-virtual {v3}, Lcom/google/android/play/core/splitcompat/p;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/play/core/splitinstall/i;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/google/android/play/core/splitcompat/d;

    iget-object v1, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->b:Lcom/google/android/play/core/splitcompat/c;

    invoke-direct {v0, v1}, Lcom/google/android/play/core/splitcompat/d;-><init>(Lcom/google/android/play/core/splitcompat/c;)V

    invoke-static {}, Lcom/google/android/play/core/internal/aa;->a()Lcom/google/android/play/core/internal/z;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    if-eqz p2, :cond_5

    invoke-virtual {v0}, Lcom/google/android/play/core/splitcompat/d;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Lcom/google/android/play/core/internal/z;->a(Ljava/lang/ClassLoader;Ljava/util/Set;)V

    goto :goto_4

    :cond_5
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/play/core/splitcompat/p;

    invoke-virtual {v0, v5}, Lcom/google/android/play/core/splitcompat/d;->a(Lcom/google/android/play/core/splitcompat/p;)Ljava/util/Set;

    move-result-object v5

    if-nez v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    :cond_6
    invoke-interface {v1, v3, v5}, Lcom/google/android/play/core/internal/z;->a(Ljava/lang/ClassLoader;Ljava/util/Set;)V

    goto :goto_3

    :cond_7
    :goto_4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/play/core/splitcompat/p;

    invoke-static {v5}, Lcom/google/android/play/core/splitcompat/SplitCompat;->a(Lcom/google/android/play/core/splitcompat/p;)Z

    move-result v6

    if-eqz v6, :cond_9

    iget-object v6, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->b:Lcom/google/android/play/core/splitcompat/c;

    invoke-virtual {v5}, Lcom/google/android/play/core/splitcompat/p;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/play/core/splitcompat/c;->c(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v5}, Lcom/google/android/play/core/splitcompat/p;->b()Ljava/io/File;

    move-result-object v7

    invoke-interface {v1, v3, v6, v7, p2}, Lcom/google/android/play/core/internal/z;->a(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_6

    :cond_8
    const/4 v6, 0x0

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v6, 0x1

    :goto_7
    if-eqz v6, :cond_a

    invoke-virtual {v5}, Lcom/google/android/play/core/splitcompat/p;->b()Ljava/io/File;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    const-string v6, "SplitCompat"

    invoke-virtual {v5}, Lcom/google/android/play/core/splitcompat/p;->b()Ljava/io/File;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x18

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string/jumbo v7, "split was not installed "

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_b
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    const-string v3, "addAssetPath"

    const-class v4, Ljava/lang/Integer;

    const-class v5, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v3, v4, v5, v1}, Lcom/google/android/play/core/internal/at;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v3, "SplitCompat"

    const/16 v4, 0x27

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "addAssetPath completed with "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    :cond_c
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/play/core/splitcompat/p;

    invoke-virtual {p2}, Lcom/google/android/play/core/splitcompat/p;->b()Ljava/io/File;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "SplitCompat"

    invoke-virtual {p2}, Lcom/google/android/play/core/splitcompat/p;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1e

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Split \'"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' installation emulated"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->c:Ljava/util/Set;

    invoke-virtual {p2}, Lcom/google/android/play/core/splitcompat/p;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_d
    const-string v1, "SplitCompat"

    invoke-virtual {p2}, Lcom/google/android/play/core/splitcompat/p;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x23

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Split \'"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' installation not emulated."

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_9

    :cond_e
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final c(Landroid/content/Context;Z)Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Z)",
            "Ljava/util/Set<",
            "Lcom/google/android/play/core/splitcompat/p;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget-object v2, p1, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    if-nez v2, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->b:Lcom/google/android/play/core/splitcompat/c;

    invoke-virtual {v0}, Lcom/google/android/play/core/splitcompat/c;->c()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/play/core/splitcompat/p;

    invoke-virtual {v3}, Lcom/google/android/play/core/splitcompat/p;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    if-eqz p2, :cond_2

    iget-object v4, p0, Lcom/google/android/play/core/splitcompat/SplitCompat;->b:Lcom/google/android/play/core/splitcompat/c;

    invoke-virtual {v4, v3}, Lcom/google/android/play/core/splitcompat/c;->f(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-static {}, Lcom/google/android/play/core/splitcompat/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/google/android/play/core/splitcompat/o;

    invoke-direct {p2, p0, v1}, Lcom/google/android/play/core/splitcompat/o;-><init>(Lcom/google/android/play/core/splitcompat/SplitCompat;Ljava/util/Set;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4
    return-object v0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const-string v0, "Cannot load data for application \'%s\'"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static install(Landroid/content/Context;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/play/core/splitcompat/SplitCompat;->a(Landroid/content/Context;Z)Z

    move-result p0

    return p0
.end method
