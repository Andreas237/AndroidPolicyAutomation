.class final Lio/fotoapparat/log/FileLogger$writer$2;
.super Lkotlin/jvm/internal/Lambda;
.source "FileLogger.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/log/FileLogger;-><init>(Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/io/FileWriter;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Ljava/io/FileWriter;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fotoapparat/log/FileLogger;


# direct methods
.method constructor <init>(Lio/fotoapparat/log/FileLogger;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/log/FileLogger$writer$2;->this$0:Lio/fotoapparat/log/FileLogger;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/io/FileWriter;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    new-instance v0, Ljava/io/FileWriter;

    iget-object v1, p0, Lio/fotoapparat/log/FileLogger$writer$2;->this$0:Lio/fotoapparat/log/FileLogger;

    invoke-static {v1}, Lio/fotoapparat/log/FileLogger;->access$getFile$p(Lio/fotoapparat/log/FileLogger;)Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lio/fotoapparat/log/FileLogger$writer$2;->invoke()Ljava/io/FileWriter;

    move-result-object v0

    return-object v0
.end method
