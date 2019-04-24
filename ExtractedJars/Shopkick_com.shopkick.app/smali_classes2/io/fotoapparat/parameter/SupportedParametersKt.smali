.class public final Lio/fotoapparat/parameter/SupportedParametersKt;
.super Ljava/lang/Object;
.source "SupportedParameters.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\"\u0014\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "supportedSensitivitiesKeys",
        "",
        "",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final supportedSensitivitiesKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "iso-values"

    const-string v1, "iso-mode-values"

    const-string v2, "iso-speed-values"

    const-string v3, "nv-picture-iso-values"

    .line 109
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lio/fotoapparat/parameter/SupportedParametersKt;->supportedSensitivitiesKeys:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$getSupportedSensitivitiesKeys$p()Ljava/util/List;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lio/fotoapparat/parameter/SupportedParametersKt;->supportedSensitivitiesKeys:Ljava/util/List;

    return-object v0
.end method
