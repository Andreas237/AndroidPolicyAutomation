.class public final Lcom/microblink/AssetManagerProvider;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "AssetManagerProvider"

.field private static volatile instance:Lcom/microblink/AssetManagerProvider;

.field private static final lock:Ljava/lang/Object;


# instance fields
.field private volatile nativeLoaded:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/AssetManagerProvider;->lock:Ljava/lang/Object;

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/AssetManagerProvider;->nativeLoaded:Z

    return-void
.end method

.method public static getInstance()Lcom/microblink/AssetManagerProvider;
    .locals 2

    sget-object v0, Lcom/microblink/AssetManagerProvider;->instance:Lcom/microblink/AssetManagerProvider;

    if-nez v0, :cond_1

    sget-object v1, Lcom/microblink/AssetManagerProvider;->lock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/microblink/AssetManagerProvider;->instance:Lcom/microblink/AssetManagerProvider;

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/AssetManagerProvider;

    invoke-direct {v0}, Lcom/microblink/AssetManagerProvider;-><init>()V

    sput-object v0, Lcom/microblink/AssetManagerProvider;->instance:Lcom/microblink/AssetManagerProvider;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static native nativeInitialize(Landroid/content/res/AssetManager;)V
    .param p0    # Landroid/content/res/AssetManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method private static native nativeTerminate()V
.end method


# virtual methods
.method protected final finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    invoke-virtual {p0}, Lcom/microblink/AssetManagerProvider;->release()V

    return-void
.end method

.method public final prepare(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lcom/microblink/AssetManagerProvider;->nativeLoaded:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->ensureNativeLibraryLoaded()V

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/AssetManagerProvider;->nativeInitialize(Landroid/content/res/AssetManager;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/microblink/AssetManagerProvider;->nativeLoaded:Z

    :cond_0
    return-void
.end method

.method public final release()V
    .locals 4

    iget-boolean v0, p0, Lcom/microblink/AssetManagerProvider;->nativeLoaded:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/microblink/AssetManagerProvider;->nativeTerminate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "AssetManagerProvider"

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    iput-boolean v0, p0, Lcom/microblink/AssetManagerProvider;->nativeLoaded:Z

    :cond_0
    return-void
.end method
