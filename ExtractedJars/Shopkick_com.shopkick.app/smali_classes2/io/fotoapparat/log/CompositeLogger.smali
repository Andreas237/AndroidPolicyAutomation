.class public final Lio/fotoapparat/log/CompositeLogger;
.super Ljava/lang/Object;
.source "CompositeLogger.kt"

# interfaces
.implements Lio/fotoapparat/log/Logger;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCompositeLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeLogger.kt\nio/fotoapparat/log/CompositeLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n1561#2,2:14\n*E\n*S KotlinDebug\n*F\n+ 1 CompositeLogger.kt\nio/fotoapparat/log/CompositeLogger\n*L\n9#1,2:14\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lio/fotoapparat/log/CompositeLogger;",
        "Lio/fotoapparat/log/Logger;",
        "loggers",
        "",
        "(Ljava/util/List;)V",
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
.field private final loggers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/fotoapparat/log/Logger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/fotoapparat/log/Logger;",
            ">;)V"
        }
    .end annotation

    const-string v0, "loggers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/log/CompositeLogger;->loggers:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public log(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lio/fotoapparat/log/CompositeLogger;->loggers:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/fotoapparat/log/Logger;

    .line 9
    invoke-interface {v1, p1}, Lio/fotoapparat/log/Logger;->log(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public recordMethod()V
    .locals 0

    .line 6
    invoke-static {p0}, Lio/fotoapparat/log/Logger$DefaultImpls;->recordMethod(Lio/fotoapparat/log/Logger;)V

    return-void
.end method
