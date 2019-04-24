.class public final Lio/fotoapparat/configuration/CameraConfiguration$Companion;
.super Ljava/lang/Object;
.source "CameraConfiguration.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fotoapparat/configuration/CameraConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0007J\u0008\u0010\u0005\u001a\u00020\u0006H\u0007J\u0008\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/fotoapparat/configuration/CameraConfiguration$Companion;",
        "",
        "()V",
        "builder",
        "Lio/fotoapparat/configuration/CameraConfiguration$Builder;",
        "default",
        "Lio/fotoapparat/configuration/CameraConfiguration;",
        "standard",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Lio/fotoapparat/configuration/CameraConfiguration$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final builder()Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 128
    new-instance v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    invoke-direct {v0}, Lio/fotoapparat/configuration/CameraConfiguration$Builder;-><init>()V

    return-object v0
.end method

.method public final default()Lio/fotoapparat/configuration/CameraConfiguration;
    .locals 14
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 122
    new-instance v13, Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3ff

    const/4 v12, 0x0

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Lio/fotoapparat/configuration/CameraConfiguration;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v13
.end method

.method public final standard()Lio/fotoapparat/configuration/CameraConfiguration;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 116
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Companion;

    invoke-virtual {v0}, Lio/fotoapparat/configuration/CameraConfiguration$Companion;->default()Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object v0

    return-object v0
.end method
