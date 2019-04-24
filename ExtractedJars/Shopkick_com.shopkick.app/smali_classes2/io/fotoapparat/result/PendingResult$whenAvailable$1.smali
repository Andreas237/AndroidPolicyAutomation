.class final Lio/fotoapparat/result/PendingResult$whenAvailable$1;
.super Ljava/lang/Object;
.source "PendingResult.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/result/PendingResult;->whenAvailable(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;

.field final synthetic this$0:Lio/fotoapparat/result/PendingResult;


# direct methods
.method constructor <init>(Lio/fotoapparat/result/PendingResult;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/result/PendingResult$whenAvailable$1;->this$0:Lio/fotoapparat/result/PendingResult;

    iput-object p2, p0, Lio/fotoapparat/result/PendingResult$whenAvailable$1;->$callback:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 75
    :try_start_0
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult$whenAvailable$1;->this$0:Lio/fotoapparat/result/PendingResult;

    invoke-static {v0}, Lio/fotoapparat/result/PendingResult;->access$getResultUnsafe$p(Lio/fotoapparat/result/PendingResult;)Ljava/lang/Object;

    move-result-object v0

    .line 76
    new-instance v1, Lio/fotoapparat/result/PendingResult$whenAvailable$1$1;

    invoke-direct {v1, p0, v0}, Lio/fotoapparat/result/PendingResult$whenAvailable$1$1;-><init>(Lio/fotoapparat/result/PendingResult$whenAvailable$1;Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Lio/fotoapparat/result/PendingResultKt;->access$notifyOnMainThread(Lkotlin/jvm/functions/Function0;)V
    :try_end_0
    .catch Lio/fotoapparat/exception/UnableToDecodeBitmapException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 89
    :catch_0
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult$whenAvailable$1;->this$0:Lio/fotoapparat/result/PendingResult;

    invoke-static {v0}, Lio/fotoapparat/result/PendingResult;->access$getLogger$p(Lio/fotoapparat/result/PendingResult;)Lio/fotoapparat/log/Logger;

    move-result-object v0

    const-string v1, "Couldn\'t deliver pending result: Operation failed internally."

    invoke-interface {v0, v1}, Lio/fotoapparat/log/Logger;->log(Ljava/lang/String;)V

    .line 90
    new-instance v0, Lio/fotoapparat/result/PendingResult$whenAvailable$1$3;

    invoke-direct {v0, p0}, Lio/fotoapparat/result/PendingResult$whenAvailable$1$3;-><init>(Lio/fotoapparat/result/PendingResult$whenAvailable$1;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lio/fotoapparat/result/PendingResultKt;->access$notifyOnMainThread(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    .line 87
    :catch_1
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult$whenAvailable$1;->this$0:Lio/fotoapparat/result/PendingResult;

    invoke-static {v0}, Lio/fotoapparat/result/PendingResult;->access$getLogger$p(Lio/fotoapparat/result/PendingResult;)Lio/fotoapparat/log/Logger;

    move-result-object v0

    const-string v1, "Couldn\'t deliver pending result: Camera operation was cancelled."

    invoke-interface {v0, v1}, Lio/fotoapparat/log/Logger;->log(Ljava/lang/String;)V

    goto :goto_0

    .line 85
    :catch_2
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult$whenAvailable$1;->this$0:Lio/fotoapparat/result/PendingResult;

    invoke-static {v0}, Lio/fotoapparat/result/PendingResult;->access$getLogger$p(Lio/fotoapparat/result/PendingResult;)Lio/fotoapparat/log/Logger;

    move-result-object v0

    const-string v1, "Couldn\'t deliver pending result: Camera stopped before delivering result."

    invoke-interface {v0, v1}, Lio/fotoapparat/log/Logger;->log(Ljava/lang/String;)V

    goto :goto_0

    .line 80
    :catch_3
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult$whenAvailable$1;->this$0:Lio/fotoapparat/result/PendingResult;

    invoke-static {v0}, Lio/fotoapparat/result/PendingResult;->access$getLogger$p(Lio/fotoapparat/result/PendingResult;)Lio/fotoapparat/log/Logger;

    move-result-object v0

    const-string v1, "Couldn\'t decode bitmap from byte array"

    invoke-interface {v0, v1}, Lio/fotoapparat/log/Logger;->log(Ljava/lang/String;)V

    .line 81
    new-instance v0, Lio/fotoapparat/result/PendingResult$whenAvailable$1$2;

    invoke-direct {v0, p0}, Lio/fotoapparat/result/PendingResult$whenAvailable$1$2;-><init>(Lio/fotoapparat/result/PendingResult$whenAvailable$1;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lio/fotoapparat/result/PendingResultKt;->access$notifyOnMainThread(Lkotlin/jvm/functions/Function0;)V

    :goto_0
    return-void
.end method
