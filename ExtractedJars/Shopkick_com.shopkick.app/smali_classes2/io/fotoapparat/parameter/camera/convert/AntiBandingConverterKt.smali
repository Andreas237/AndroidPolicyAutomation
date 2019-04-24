.class public final Lio/fotoapparat/parameter/camera/convert/AntiBandingConverterKt;
.super Ljava/lang/Object;
.source "AntiBandingConverter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "toAntiBandingMode",
        "Lio/fotoapparat/parameter/AntiBandingMode;",
        "",
        "toCode",
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
.method public static final toAntiBandingMode(Ljava/lang/String;)Lio/fotoapparat/parameter/AntiBandingMode;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x1ad6f

    if-eq v0, v1, :cond_3

    const v1, 0x18d8ed

    if-eq v0, v1, :cond_2

    const v1, 0x194d4c

    if-eq v0, v1, :cond_1

    const v1, 0x2dddaf

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "auto"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 16
    sget-object p0, Lio/fotoapparat/parameter/AntiBandingMode$Auto;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$Auto;

    check-cast p0, Lio/fotoapparat/parameter/AntiBandingMode;

    goto :goto_1

    :cond_1
    const-string v0, "60hz"

    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 18
    sget-object p0, Lio/fotoapparat/parameter/AntiBandingMode$HZ60;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$HZ60;

    check-cast p0, Lio/fotoapparat/parameter/AntiBandingMode;

    goto :goto_1

    :cond_2
    const-string v0, "50hz"

    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 17
    sget-object p0, Lio/fotoapparat/parameter/AntiBandingMode$HZ50;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$HZ50;

    check-cast p0, Lio/fotoapparat/parameter/AntiBandingMode;

    goto :goto_1

    :cond_3
    const-string v0, "off"

    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 19
    sget-object p0, Lio/fotoapparat/parameter/AntiBandingMode$None;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$None;

    check-cast p0, Lio/fotoapparat/parameter/AntiBandingMode;

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public static final toCode(Lio/fotoapparat/parameter/AntiBandingMode;)Ljava/lang/String;
    .locals 1
    .param p0    # Lio/fotoapparat/parameter/AntiBandingMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    sget-object v0, Lio/fotoapparat/parameter/AntiBandingMode$Auto;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$Auto;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "auto"

    goto :goto_0

    .line 32
    :cond_0
    sget-object v0, Lio/fotoapparat/parameter/AntiBandingMode$HZ50;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$HZ50;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "50hz"

    goto :goto_0

    .line 33
    :cond_1
    sget-object v0, Lio/fotoapparat/parameter/AntiBandingMode$HZ60;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$HZ60;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "60hz"

    goto :goto_0

    .line 34
    :cond_2
    sget-object v0, Lio/fotoapparat/parameter/AntiBandingMode$None;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$None;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "off"

    :goto_0
    return-object p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
