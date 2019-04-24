.class final Lio/fotoapparat/result/PendingResult$transform$transformTask$1;
.super Ljava/lang/Object;
.source "PendingResult.kt"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/result/PendingResult;->transform(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/result/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "TV;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0004\n\u0002\u0008\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\u0008\u0000\u0010\u0001\"\u0004\u0008\u0001\u0010\u0002H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "R",
        "T",
        "call",
        "()Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $transformer:Lkotlin/jvm/functions/Function1;

.field final synthetic this$0:Lio/fotoapparat/result/PendingResult;


# direct methods
.method constructor <init>(Lio/fotoapparat/result/PendingResult;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/result/PendingResult$transform$transformTask$1;->this$0:Lio/fotoapparat/result/PendingResult;

    iput-object p2, p0, Lio/fotoapparat/result/PendingResult$transform$transformTask$1;->$transformer:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult$transform$transformTask$1;->$transformer:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lio/fotoapparat/result/PendingResult$transform$transformTask$1;->this$0:Lio/fotoapparat/result/PendingResult;

    invoke-static {v1}, Lio/fotoapparat/result/PendingResult;->access$getFuture$p(Lio/fotoapparat/result/PendingResult;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
