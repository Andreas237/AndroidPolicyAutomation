.class public final Lio/fotoapparat/log/LoggersKt;
.super Ljava/lang/Object;
.source "Loggers.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0008\"\u00020\u0001\u00a2\u0006\u0002\u0010\t\u001a\u0006\u0010\n\u001a\u00020\u0001\u00a8\u0006\u000b"
    }
    d2 = {
        "fileLogger",
        "Lio/fotoapparat/log/Logger;",
        "context",
        "Landroid/content/Context;",
        "file",
        "Ljava/io/File;",
        "logcat",
        "loggers",
        "",
        "([Lio/fotoapparat/log/Logger;)Lio/fotoapparat/log/Logger;",
        "none",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final fileLogger(Landroid/content/Context;)Lio/fotoapparat/log/Logger;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    new-instance v0, Ljava/io/File;

    const-string v1, "logs"

    .line 29
    invoke-virtual {p0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const-string v1, "log.txt"

    .line 28
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 33
    invoke-static {v0}, Lio/fotoapparat/log/LoggersKt;->fileLogger(Ljava/io/File;)Lio/fotoapparat/log/Logger;

    move-result-object p0

    return-object p0
.end method

.method public static final fileLogger(Ljava/io/File;)Lio/fotoapparat/log/Logger;
    .locals 2
    .param p0    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "file"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    new-instance v0, Lio/fotoapparat/log/BackgroundThreadLogger;

    new-instance v1, Lio/fotoapparat/log/FileLogger;

    invoke-direct {v1, p0}, Lio/fotoapparat/log/FileLogger;-><init>(Ljava/io/File;)V

    check-cast v1, Lio/fotoapparat/log/Logger;

    invoke-direct {v0, v1}, Lio/fotoapparat/log/BackgroundThreadLogger;-><init>(Lio/fotoapparat/log/Logger;)V

    check-cast v0, Lio/fotoapparat/log/Logger;

    return-object v0
.end method

.method public static final logcat()Lio/fotoapparat/log/Logger;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    new-instance v0, Lio/fotoapparat/log/LogcatLogger;

    invoke-direct {v0}, Lio/fotoapparat/log/LogcatLogger;-><init>()V

    check-cast v0, Lio/fotoapparat/log/Logger;

    return-object v0
.end method

.method public static final varargs loggers([Lio/fotoapparat/log/Logger;)Lio/fotoapparat/log/Logger;
    .locals 1
    .param p0    # [Lio/fotoapparat/log/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "loggers"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    new-instance v0, Lio/fotoapparat/log/CompositeLogger;

    invoke-static {p0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/fotoapparat/log/CompositeLogger;-><init>(Ljava/util/List;)V

    check-cast v0, Lio/fotoapparat/log/Logger;

    return-object v0
.end method

.method public static final none()Lio/fotoapparat/log/Logger;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    new-instance v0, Lio/fotoapparat/log/DummyLogger;

    invoke-direct {v0}, Lio/fotoapparat/log/DummyLogger;-><init>()V

    check-cast v0, Lio/fotoapparat/log/Logger;

    return-object v0
.end method
