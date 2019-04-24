.class final Lio/fotoapparat/concurrent/CameraExecutor$cleanUpCancelledTasks$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CameraExecutor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/concurrent/CameraExecutor;->cleanUpCancelledTasks()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/concurrent/Future<",
        "*>;",
        "Ljava/lang/Boolean;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Ljava/util/concurrent/Future;",
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
.field final synthetic this$0:Lio/fotoapparat/concurrent/CameraExecutor;


# direct methods
.method constructor <init>(Lio/fotoapparat/concurrent/CameraExecutor;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/concurrent/CameraExecutor$cleanUpCancelledTasks$1;->this$0:Lio/fotoapparat/concurrent/CameraExecutor;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 15
    check-cast p1, Ljava/util/concurrent/Future;

    invoke-virtual {p0, p1}, Lio/fotoapparat/concurrent/CameraExecutor$cleanUpCancelledTasks$1;->invoke(Ljava/util/concurrent/Future;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/concurrent/Future;)Z
    .locals 1
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lio/fotoapparat/concurrent/CameraExecutor$cleanUpCancelledTasks$1;->this$0:Lio/fotoapparat/concurrent/CameraExecutor;

    invoke-static {v0, p1}, Lio/fotoapparat/concurrent/CameraExecutor;->access$isPending$p(Lio/fotoapparat/concurrent/CameraExecutor;Ljava/util/concurrent/Future;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
