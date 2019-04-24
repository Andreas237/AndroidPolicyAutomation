.class public final Lio/fotoapparat/log/BackgroundThreadLogger;
.super Ljava/lang/Object;
.source "BackgroundThreadLogger.kt"

# interfaces
.implements Lio/fotoapparat/log/Logger;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/fotoapparat/log/BackgroundThreadLogger;",
        "Lio/fotoapparat/log/Logger;",
        "logger",
        "(Lio/fotoapparat/log/Logger;)V",
        "log",
        "",
        "message",
        "",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final logger:Lio/fotoapparat/log/Logger;


# direct methods
.method public constructor <init>(Lio/fotoapparat/log/Logger;)V
    .locals 1
    .param p1    # Lio/fotoapparat/log/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/log/BackgroundThreadLogger;->logger:Lio/fotoapparat/log/Logger;

    return-void
.end method

.method public static final synthetic access$getLogger$p(Lio/fotoapparat/log/BackgroundThreadLogger;)Lio/fotoapparat/log/Logger;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    iget-object p0, p0, Lio/fotoapparat/log/BackgroundThreadLogger;->logger:Lio/fotoapparat/log/Logger;

    return-object p0
.end method


# virtual methods
.method public log(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    new-instance v0, Lio/fotoapparat/log/BackgroundThreadLogger$log$1;

    invoke-direct {v0, p0, p1}, Lio/fotoapparat/log/BackgroundThreadLogger$log$1;-><init>(Lio/fotoapparat/log/BackgroundThreadLogger;Ljava/lang/String;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lio/fotoapparat/hardware/ExecutorKt;->executeLoggingThread(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public recordMethod()V
    .locals 0

    .line 8
    invoke-static {p0}, Lio/fotoapparat/log/Logger$DefaultImpls;->recordMethod(Lio/fotoapparat/log/Logger;)V

    return-void
.end method
