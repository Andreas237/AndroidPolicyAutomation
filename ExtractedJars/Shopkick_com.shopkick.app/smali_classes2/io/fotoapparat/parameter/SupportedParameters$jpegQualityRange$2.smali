.class final Lio/fotoapparat/parameter/SupportedParameters$jpegQualityRange$2;
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
        "Lkotlin/ranges/IntRange;",
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
        "Lkotlin/ranges/IntRange;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/fotoapparat/parameter/SupportedParameters$jpegQualityRange$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/fotoapparat/parameter/SupportedParameters$jpegQualityRange$2;

    invoke-direct {v0}, Lio/fotoapparat/parameter/SupportedParameters$jpegQualityRange$2;-><init>()V

    sput-object v0, Lio/fotoapparat/parameter/SupportedParameters$jpegQualityRange$2;->INSTANCE:Lio/fotoapparat/parameter/SupportedParameters$jpegQualityRange$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters$jpegQualityRange$2;->invoke()Lkotlin/ranges/IntRange;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lkotlin/ranges/IntRange;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 84
    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/16 v2, 0x64

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    return-object v0
.end method
