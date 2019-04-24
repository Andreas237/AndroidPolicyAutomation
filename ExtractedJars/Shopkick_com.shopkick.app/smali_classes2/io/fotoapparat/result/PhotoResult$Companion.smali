.class public final Lio/fotoapparat/result/PhotoResult$Companion;
.super Ljava/lang/Object;
.source "PhotoResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fotoapparat/result/PhotoResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\tH\u0000\u00a2\u0006\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/fotoapparat/result/PhotoResult$Companion;",
        "",
        "()V",
        "fromFuture",
        "Lio/fotoapparat/result/PhotoResult;",
        "photoFuture",
        "Ljava/util/concurrent/Future;",
        "Lio/fotoapparat/result/Photo;",
        "logger",
        "Lio/fotoapparat/log/Logger;",
        "fromFuture$fotoapparat_release",
        "fotoapparat_release"
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

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lio/fotoapparat/result/PhotoResult$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromFuture$fotoapparat_release(Ljava/util/concurrent/Future;Lio/fotoapparat/log/Logger;)Lio/fotoapparat/result/PhotoResult;
    .locals 2
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/log/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "Lio/fotoapparat/result/Photo;",
            ">;",
            "Lio/fotoapparat/log/Logger;",
            ")",
            "Lio/fotoapparat/result/PhotoResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "photoFuture"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    new-instance v0, Lio/fotoapparat/result/PhotoResult;

    .line 62
    sget-object v1, Lio/fotoapparat/result/PendingResult;->Companion:Lio/fotoapparat/result/PendingResult$Companion;

    invoke-virtual {v1, p1, p2}, Lio/fotoapparat/result/PendingResult$Companion;->fromFuture$fotoapparat_release(Ljava/util/concurrent/Future;Lio/fotoapparat/log/Logger;)Lio/fotoapparat/result/PendingResult;

    move-result-object p1

    .line 61
    invoke-direct {v0, p1}, Lio/fotoapparat/result/PhotoResult;-><init>(Lio/fotoapparat/result/PendingResult;)V

    return-object v0
.end method
