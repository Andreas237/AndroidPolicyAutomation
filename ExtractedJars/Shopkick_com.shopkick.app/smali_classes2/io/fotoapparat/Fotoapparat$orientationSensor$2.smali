.class final Lio/fotoapparat/Fotoapparat$orientationSensor$2;
.super Lkotlin/jvm/internal/Lambda;
.source "Fotoapparat.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/Fotoapparat;-><init>(Landroid/content/Context;Lio/fotoapparat/view/CameraRenderer;Lio/fotoapparat/view/FocalPointSelector;Lkotlin/jvm/functions/Function1;Lio/fotoapparat/parameter/ScaleType;Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lio/fotoapparat/concurrent/CameraExecutor;Lio/fotoapparat/log/Logger;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/fotoapparat/hardware/orientation/OrientationSensor;",
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
        "Lio/fotoapparat/hardware/orientation/OrientationSensor;",
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic this$0:Lio/fotoapparat/Fotoapparat;


# direct methods
.method constructor <init>(Lio/fotoapparat/Fotoapparat;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/Fotoapparat$orientationSensor$2;->this$0:Lio/fotoapparat/Fotoapparat;

    iput-object p2, p0, Lio/fotoapparat/Fotoapparat$orientationSensor$2;->$context:Landroid/content/Context;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lio/fotoapparat/hardware/orientation/OrientationSensor;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 67
    new-instance v0, Lio/fotoapparat/hardware/orientation/OrientationSensor;

    .line 68
    iget-object v1, p0, Lio/fotoapparat/Fotoapparat$orientationSensor$2;->$context:Landroid/content/Context;

    .line 69
    iget-object v2, p0, Lio/fotoapparat/Fotoapparat$orientationSensor$2;->this$0:Lio/fotoapparat/Fotoapparat;

    invoke-static {v2}, Lio/fotoapparat/Fotoapparat;->access$getDevice$p(Lio/fotoapparat/Fotoapparat;)Lio/fotoapparat/hardware/Device;

    move-result-object v2

    .line 67
    invoke-direct {v0, v1, v2}, Lio/fotoapparat/hardware/orientation/OrientationSensor;-><init>(Landroid/content/Context;Lio/fotoapparat/hardware/Device;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lio/fotoapparat/Fotoapparat$orientationSensor$2;->invoke()Lio/fotoapparat/hardware/orientation/OrientationSensor;

    move-result-object v0

    return-object v0
.end method
