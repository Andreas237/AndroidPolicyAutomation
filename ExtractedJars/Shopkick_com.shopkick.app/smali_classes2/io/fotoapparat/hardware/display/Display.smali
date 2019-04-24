.class public Lio/fotoapparat/hardware/display/Display;
.super Ljava/lang/Object;
.source "Display.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0008\u001a\u00020\tH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lio/fotoapparat/hardware/display/Display;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "display",
        "Landroid/view/Display;",
        "kotlin.jvm.PlatformType",
        "getOrientation",
        "Lio/fotoapparat/hardware/orientation/Orientation;",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final display:Landroid/view/Display;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-static {p1}, Lio/fotoapparat/hardware/display/DisplayKt;->access$getDisplay(Landroid/content/Context;)Landroid/view/Display;

    move-result-object p1

    iput-object p1, p0, Lio/fotoapparat/hardware/display/Display;->display:Landroid/view/Display;

    return-void
.end method


# virtual methods
.method public getOrientation()Lio/fotoapparat/hardware/orientation/Orientation;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    iget-object v0, p0, Lio/fotoapparat/hardware/display/Display;->display:Landroid/view/Display;

    const-string v1, "display"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 27
    sget-object v0, Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;->INSTANCE:Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;

    check-cast v0, Lio/fotoapparat/hardware/orientation/Orientation;

    goto :goto_0

    .line 26
    :pswitch_0
    sget-object v0, Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$ReverseLandscape;->INSTANCE:Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$ReverseLandscape;

    check-cast v0, Lio/fotoapparat/hardware/orientation/Orientation;

    goto :goto_0

    .line 25
    :pswitch_1
    sget-object v0, Lio/fotoapparat/hardware/orientation/Orientation$Vertical$ReversePortrait;->INSTANCE:Lio/fotoapparat/hardware/orientation/Orientation$Vertical$ReversePortrait;

    check-cast v0, Lio/fotoapparat/hardware/orientation/Orientation;

    goto :goto_0

    .line 24
    :pswitch_2
    sget-object v0, Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$Landscape;->INSTANCE:Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$Landscape;

    check-cast v0, Lio/fotoapparat/hardware/orientation/Orientation;

    goto :goto_0

    .line 23
    :pswitch_3
    sget-object v0, Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;->INSTANCE:Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;

    check-cast v0, Lio/fotoapparat/hardware/orientation/Orientation;

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
