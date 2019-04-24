.class final Lio/fotoapparat/preview/PreviewStream$start$1;
.super Ljava/lang/Object;
.source "PreviewStream.kt"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/preview/PreviewStream;->start()V
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
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "data",
        "",
        "kotlin.jvm.PlatformType",
        "<anonymous parameter 1>",
        "Landroid/hardware/Camera;",
        "onPreviewFrame"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fotoapparat/preview/PreviewStream;


# direct methods
.method constructor <init>(Lio/fotoapparat/preview/PreviewStream;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/preview/PreviewStream$start$1;->this$0:Lio/fotoapparat/preview/PreviewStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 1

    .line 51
    iget-object p2, p0, Lio/fotoapparat/preview/PreviewStream$start$1;->this$0:Lio/fotoapparat/preview/PreviewStream;

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p1}, Lio/fotoapparat/preview/PreviewStream;->access$dispatchFrameOnBackgroundThread(Lio/fotoapparat/preview/PreviewStream;[B)V

    return-void
.end method
