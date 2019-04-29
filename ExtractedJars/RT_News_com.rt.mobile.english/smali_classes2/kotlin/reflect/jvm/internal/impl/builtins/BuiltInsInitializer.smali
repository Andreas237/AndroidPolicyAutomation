.class public final Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;
.super Ljava/lang/Object;
.source "BuiltInsInitializer.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBuiltInsInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsInitializer.kt\norg/jetbrains/kotlin/builtins/BuiltInsInitializer\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n*L\n1#1,66:1\n19#2:67\n*E\n*S KotlinDebug\n*F\n+ 1 BuiltInsInitializer.kt\norg/jetbrains/kotlin/builtins/BuiltInsInitializer\n*L\n55#1:67\n*E\n"
.end annotation


# instance fields
.field private final constructor:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "TT;>;"
        }
    .end annotation
.end field

.field private initializationFailed:Ljava/lang/Throwable;

.field private volatile initializing:Z

.field private volatile instance:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->constructor:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method private final declared-synchronized initialize()V
    .locals 5

    monitor-enter p0

    .line 31
    :try_start_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->instance:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;

    if-nez v0, :cond_3

    .line 32
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initializationFailed:Ljava/lang/Throwable;

    if-eqz v0, :cond_1

    .line 33
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Built-in library initialization failed previously: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initializationFailed:Ljava/lang/Throwable;

    if-nez v2, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initializationFailed:Ljava/lang/Throwable;

    .line 33
    invoke-direct {v0, v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 36
    :cond_1
    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initializing:Z

    if-eqz v0, :cond_2

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Built-in library initialization loop"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :cond_2
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initializing:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v0, 0x0

    .line 41
    :try_start_1
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->constructor:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;

    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->instance:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :try_start_2
    iput-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initializing:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 44
    :try_start_3
    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initializationFailed:Ljava/lang/Throwable;

    .line 45
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Built-in library initialization failed. Please ensure you have kotlin-stdlib.jar in the classpath: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 48
    :goto_0
    :try_start_4
    iput-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initializing:Z

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 51
    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    .line 30
    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final get()Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 54
    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initializing:Z

    if-eqz v0, :cond_1

    .line 55
    monitor-enter p0

    .line 56
    :try_start_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->instance:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 57
    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    const-string v0, "Built-ins are not initialized (note: We are under the same lock as initializing and instance)"

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 55
    monitor-exit p0

    throw v0

    .line 61
    :cond_1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->instance:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;

    if-nez v0, :cond_2

    .line 62
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->initialize()V

    .line 64
    :cond_2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;->instance:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;

    if-nez v0, :cond_3

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_3
    return-object v0
.end method
