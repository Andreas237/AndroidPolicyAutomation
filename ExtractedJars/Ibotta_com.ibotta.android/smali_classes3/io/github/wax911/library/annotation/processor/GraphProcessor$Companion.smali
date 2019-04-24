.class public final Lio/github/wax911/library/annotation/processor/GraphProcessor$Companion;
.super Ljava/lang/Object;
.source "GraphProcessor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/wax911/library/annotation/processor/GraphProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGraphProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphProcessor.kt\nio/github/wax911/library/annotation/processor/GraphProcessor$Companion\n*L\n1#1,126:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/github/wax911/library/annotation/processor/GraphProcessor$Companion;",
        "",
        "()V",
        "defaultDirectory",
        "",
        "defaultExtension",
        "instance",
        "Lio/github/wax911/library/annotation/processor/GraphProcessor;",
        "lock",
        "getInstance",
        "assetManager",
        "Landroid/content/res/AssetManager;",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 100
    invoke-direct {p0}, Lio/github/wax911/library/annotation/processor/GraphProcessor$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance(Landroid/content/res/AssetManager;)Lio/github/wax911/library/annotation/processor/GraphProcessor;
    .locals 3
    .param p1    # Landroid/content/res/AssetManager;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 110
    invoke-static {}, Lio/github/wax911/library/annotation/processor/GraphProcessor;->access$getInstance$cp()Lio/github/wax911/library/annotation/processor/GraphProcessor;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 114
    :cond_0
    invoke-static {}, Lio/github/wax911/library/annotation/processor/GraphProcessor;->access$getLock$cp()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 115
    :try_start_0
    invoke-static {}, Lio/github/wax911/library/annotation/processor/GraphProcessor;->access$getInstance$cp()Lio/github/wax911/library/annotation/processor/GraphProcessor;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 119
    :cond_1
    new-instance v1, Lio/github/wax911/library/annotation/processor/GraphProcessor;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/github/wax911/library/annotation/processor/GraphProcessor;-><init>(Landroid/content/res/AssetManager;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 120
    invoke-static {v1}, Lio/github/wax911/library/annotation/processor/GraphProcessor;->access$setInstance$cp(Lio/github/wax911/library/annotation/processor/GraphProcessor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
