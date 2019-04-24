.class public final Lio/fotoapparat/result/PhotoResult;
.super Ljava/lang/Object;
.source "PhotoResult.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fotoapparat/result/PhotoResult$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0008\u0000\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u0008\u001a\u00020\tJ(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0018\u0008\u0002\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0007J\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/fotoapparat/result/PhotoResult;",
        "",
        "pendingResult",
        "Lio/fotoapparat/result/PendingResult;",
        "Lio/fotoapparat/result/Photo;",
        "(Lio/fotoapparat/result/PendingResult;)V",
        "saveToFile",
        "",
        "file",
        "Ljava/io/File;",
        "toBitmap",
        "Lio/fotoapparat/result/BitmapPhoto;",
        "sizeTransformer",
        "Lkotlin/Function1;",
        "Lio/fotoapparat/parameter/Resolution;",
        "Lio/fotoapparat/result/transformer/ResolutionTransformer;",
        "toPendingResult",
        "Companion",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/fotoapparat/result/PhotoResult$Companion;


# instance fields
.field private final pendingResult:Lio/fotoapparat/result/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/fotoapparat/result/PendingResult<",
            "Lio/fotoapparat/result/Photo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/fotoapparat/result/PhotoResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/fotoapparat/result/PhotoResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/fotoapparat/result/PhotoResult;->Companion:Lio/fotoapparat/result/PhotoResult$Companion;

    return-void
.end method

.method public constructor <init>(Lio/fotoapparat/result/PendingResult;)V
    .locals 1
    .param p1    # Lio/fotoapparat/result/PendingResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fotoapparat/result/PendingResult<",
            "Lio/fotoapparat/result/Photo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pendingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/result/PhotoResult;->pendingResult:Lio/fotoapparat/result/PendingResult;

    return-void
.end method

.method public static synthetic toBitmap$default(Lio/fotoapparat/result/PhotoResult;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/result/PendingResult;
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 29
    invoke-static {}, Lio/fotoapparat/result/transformer/ResolutionTransformersKt;->originalResolution()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lio/fotoapparat/result/PhotoResult;->toBitmap(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/result/PendingResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final saveToFile(Ljava/io/File;)Lio/fotoapparat/result/PendingResult;
    .locals 3
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lio/fotoapparat/result/PendingResult<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lio/fotoapparat/result/PhotoResult;->pendingResult:Lio/fotoapparat/result/PendingResult;

    new-instance v1, Lio/fotoapparat/result/transformer/SaveToFileTransformer;

    .line 42
    sget-object v2, Lio/fotoapparat/exif/ExifWriter;->INSTANCE:Lio/fotoapparat/exif/ExifWriter;

    check-cast v2, Lio/fotoapparat/exif/ExifOrientationWriter;

    .line 40
    invoke-direct {v1, p1, v2}, Lio/fotoapparat/result/transformer/SaveToFileTransformer;-><init>(Ljava/io/File;Lio/fotoapparat/exif/ExifOrientationWriter;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lio/fotoapparat/result/PendingResult;->transform(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/result/PendingResult;

    move-result-object p1

    return-object p1
.end method

.method public final toBitmap()Lio/fotoapparat/result/PendingResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/fotoapparat/result/PendingResult<",
            "Lio/fotoapparat/result/BitmapPhoto;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lio/fotoapparat/result/PhotoResult;->toBitmap$default(Lio/fotoapparat/result/PhotoResult;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/result/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final toBitmap(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/result/PendingResult;
    .locals 2
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/parameter/Resolution;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)",
            "Lio/fotoapparat/result/PendingResult<",
            "Lio/fotoapparat/result/BitmapPhoto;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "sizeTransformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lio/fotoapparat/result/PhotoResult;->pendingResult:Lio/fotoapparat/result/PendingResult;

    new-instance v1, Lio/fotoapparat/result/transformer/BitmapPhotoTransformer;

    invoke-direct {v1, p1}, Lio/fotoapparat/result/transformer/BitmapPhotoTransformer;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lio/fotoapparat/result/PendingResult;->transform(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/result/PendingResult;

    move-result-object p1

    return-object p1
.end method

.method public final toPendingResult()Lio/fotoapparat/result/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/fotoapparat/result/PendingResult<",
            "Lio/fotoapparat/result/Photo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 48
    iget-object v0, p0, Lio/fotoapparat/result/PhotoResult;->pendingResult:Lio/fotoapparat/result/PendingResult;

    return-object v0
.end method
