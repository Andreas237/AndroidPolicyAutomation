.class final Lio/fotoapparat/concurrent/CameraExecutor$execute$future$1;
.super Ljava/lang/Object;
.source "CameraExecutor.kt"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/concurrent/CameraExecutor;->execute(Lio/fotoapparat/concurrent/CameraExecutor$Operation;)Ljava/util/concurrent/Future;
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
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0004\n\u0002\u0008\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\u0008\u0000\u0010\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
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
.field final synthetic $operation:Lio/fotoapparat/concurrent/CameraExecutor$Operation;


# direct methods
.method constructor <init>(Lio/fotoapparat/concurrent/CameraExecutor$Operation;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/concurrent/CameraExecutor$execute$future$1;->$operation:Lio/fotoapparat/concurrent/CameraExecutor$Operation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lio/fotoapparat/concurrent/CameraExecutor$execute$future$1;->$operation:Lio/fotoapparat/concurrent/CameraExecutor$Operation;

    invoke-virtual {v0}, Lio/fotoapparat/concurrent/CameraExecutor$Operation;->getFunction()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
