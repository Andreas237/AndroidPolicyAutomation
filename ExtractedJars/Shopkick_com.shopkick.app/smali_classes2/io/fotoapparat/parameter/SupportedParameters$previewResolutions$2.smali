.class final Lio/fotoapparat/parameter/SupportedParameters$previewResolutions$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SupportedParameters.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/parameter/SupportedParameters;-><init>(Landroid/hardware/Camera$Parameters;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/List<",
        "Landroid/hardware/Camera$Size;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a6\u0012\u0014\u0012\u0012 \u0004*\u0008\u0018\u00010\u0002R\u00020\u00030\u0002R\u00020\u0003 \u0004*\u001a\u0012\u0014\u0012\u0012 \u0004*\u0008\u0018\u00010\u0002R\u00020\u00030\u0002R\u00020\u0003\u0018\u00010\u00050\u0001H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroid/hardware/Camera$Size;",
        "Landroid/hardware/Camera;",
        "kotlin.jvm.PlatformType",
        "",
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
.field final synthetic this$0:Lio/fotoapparat/parameter/SupportedParameters;


# direct methods
.method constructor <init>(Lio/fotoapparat/parameter/SupportedParameters;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/parameter/SupportedParameters$previewResolutions$2;->this$0:Lio/fotoapparat/parameter/SupportedParameters;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters$previewResolutions$2;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/hardware/Camera$Size;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lio/fotoapparat/parameter/SupportedParameters$previewResolutions$2;->this$0:Lio/fotoapparat/parameter/SupportedParameters;

    invoke-static {v0}, Lio/fotoapparat/parameter/SupportedParameters;->access$getCameraParameters$p(Lio/fotoapparat/parameter/SupportedParameters;)Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
