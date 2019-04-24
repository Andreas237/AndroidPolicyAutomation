.class final Lio/fotoapparat/preview/PreviewStream$dispatchFrameOnBackgroundThread$1;
.super Ljava/lang/Object;
.source "PreviewStream.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/preview/PreviewStream;->dispatchFrameOnBackgroundThread([B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPreviewStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewStream.kt\nio/fotoapparat/preview/PreviewStream$dispatchFrameOnBackgroundThread$1\n*L\n1#1,133:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic $data:[B

.field final synthetic this$0:Lio/fotoapparat/preview/PreviewStream;


# direct methods
.method constructor <init>(Lio/fotoapparat/preview/PreviewStream;[B)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/preview/PreviewStream$dispatchFrameOnBackgroundThread$1;->this$0:Lio/fotoapparat/preview/PreviewStream;

    iput-object p2, p0, Lio/fotoapparat/preview/PreviewStream$dispatchFrameOnBackgroundThread$1;->$data:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 91
    iget-object v0, p0, Lio/fotoapparat/preview/PreviewStream$dispatchFrameOnBackgroundThread$1;->this$0:Lio/fotoapparat/preview/PreviewStream;

    invoke-static {v0}, Lio/fotoapparat/preview/PreviewStream;->access$getFrameProcessors$p(Lio/fotoapparat/preview/PreviewStream;)Ljava/util/LinkedHashSet;

    move-result-object v0

    monitor-enter v0

    .line 92
    :try_start_0
    iget-object v1, p0, Lio/fotoapparat/preview/PreviewStream$dispatchFrameOnBackgroundThread$1;->this$0:Lio/fotoapparat/preview/PreviewStream;

    iget-object v2, p0, Lio/fotoapparat/preview/PreviewStream$dispatchFrameOnBackgroundThread$1;->$data:[B

    invoke-static {v1, v2}, Lio/fotoapparat/preview/PreviewStream;->access$dispatchFrame(Lio/fotoapparat/preview/PreviewStream;[B)V

    .line 93
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
