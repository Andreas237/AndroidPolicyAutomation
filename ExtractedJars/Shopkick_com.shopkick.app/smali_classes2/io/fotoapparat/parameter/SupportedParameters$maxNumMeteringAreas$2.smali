.class final Lio/fotoapparat/parameter/SupportedParameters$maxNumMeteringAreas$2;
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
        "Ljava/lang/Integer;",
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
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
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

    iput-object p1, p0, Lio/fotoapparat/parameter/SupportedParameters$maxNumMeteringAreas$2;->this$0:Lio/fotoapparat/parameter/SupportedParameters;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()I
    .locals 1

    .line 105
    iget-object v0, p0, Lio/fotoapparat/parameter/SupportedParameters$maxNumMeteringAreas$2;->this$0:Lio/fotoapparat/parameter/SupportedParameters;

    invoke-static {v0}, Lio/fotoapparat/parameter/SupportedParameters;->access$getCameraParameters$p(Lio/fotoapparat/parameter/SupportedParameters;)Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getMaxNumMeteringAreas()I

    move-result v0

    return v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters$maxNumMeteringAreas$2;->invoke()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
