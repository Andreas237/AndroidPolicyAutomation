.class public final Lio/fotoapparat/parameter/camera/convert/FocusModeConverterKt;
.super Ljava/lang/Object;
.source "FocusModeConverter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toCode",
        "",
        "Lio/fotoapparat/parameter/FocusMode;",
        "toFocusMode",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final toCode(Lio/fotoapparat/parameter/FocusMode;)Ljava/lang/String;
    .locals 1
    .param p0    # Lio/fotoapparat/parameter/FocusMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Edof;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Edof;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "edof"

    goto :goto_0

    .line 36
    :cond_0
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Auto;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Auto;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "auto"

    goto :goto_0

    .line 37
    :cond_1
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Macro;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Macro;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "macro"

    goto :goto_0

    .line 38
    :cond_2
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Fixed;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Fixed;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "fixed"

    goto :goto_0

    .line 39
    :cond_3
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Infinity;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Infinity;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p0, "infinity"

    goto :goto_0

    .line 40
    :cond_4
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p0, "continuous-video"

    goto :goto_0

    .line 41
    :cond_5
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "continuous-picture"

    :goto_0
    return-object p0

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final toFocusMode(Ljava/lang/String;)Lio/fotoapparat/parameter/FocusMode;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "continuous-picture"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 23
    sget-object p0, Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;

    check-cast p0, Lio/fotoapparat/parameter/FocusMode;

    goto :goto_1

    :sswitch_1
    const-string v0, "infinity"

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 21
    sget-object p0, Lio/fotoapparat/parameter/FocusMode$Infinity;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Infinity;

    check-cast p0, Lio/fotoapparat/parameter/FocusMode;

    goto :goto_1

    :sswitch_2
    const-string v0, "macro"

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 19
    sget-object p0, Lio/fotoapparat/parameter/FocusMode$Macro;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Macro;

    check-cast p0, Lio/fotoapparat/parameter/FocusMode;

    goto :goto_1

    :sswitch_3
    const-string v0, "fixed"

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 20
    sget-object p0, Lio/fotoapparat/parameter/FocusMode$Fixed;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Fixed;

    check-cast p0, Lio/fotoapparat/parameter/FocusMode;

    goto :goto_1

    :sswitch_4
    const-string v0, "edof"

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 17
    sget-object p0, Lio/fotoapparat/parameter/FocusMode$Edof;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Edof;

    check-cast p0, Lio/fotoapparat/parameter/FocusMode;

    goto :goto_1

    :sswitch_5
    const-string v0, "auto"

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 18
    sget-object p0, Lio/fotoapparat/parameter/FocusMode$Auto;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Auto;

    check-cast p0, Lio/fotoapparat/parameter/FocusMode;

    goto :goto_1

    :sswitch_6
    const-string v0, "continuous-video"

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 22
    sget-object p0, Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;

    check-cast p0, Lio/fotoapparat/parameter/FocusMode;

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0xb99cbc3 -> :sswitch_6
        0x2dddaf -> :sswitch_5
        0x2f6eb6 -> :sswitch_4
        0x5cee774 -> :sswitch_3
        0x62d9bcc -> :sswitch_2
        0xa526a28 -> :sswitch_1
        0x363d9440 -> :sswitch_0
    .end sparse-switch
.end method
