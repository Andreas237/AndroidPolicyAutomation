.class public final Lio/fotoapparat/exif/ExifWriter;
.super Ljava/lang/Object;
.source "ExifWriter.kt"

# interfaces
.implements Lio/fotoapparat/exif/ExifOrientationWriter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExifWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExifWriter.kt\nio/fotoapparat/exif/ExifWriter\n*L\n1#1,40:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lio/fotoapparat/exif/ExifWriter;",
        "Lio/fotoapparat/exif/ExifOrientationWriter;",
        "()V",
        "toExifOrientation",
        "",
        "rotationDegrees",
        "writeExifOrientation",
        "",
        "file",
        "Ljava/io/File;",
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
.field public static final INSTANCE:Lio/fotoapparat/exif/ExifWriter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lio/fotoapparat/exif/ExifWriter;

    invoke-direct {v0}, Lio/fotoapparat/exif/ExifWriter;-><init>()V

    sput-object v0, Lio/fotoapparat/exif/ExifWriter;->INSTANCE:Lio/fotoapparat/exif/ExifWriter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final toExifOrientation(I)I
    .locals 1

    rsub-int p1, p1, 0x168

    .line 29
    rem-int/lit16 p1, p1, 0x168

    const/16 v0, 0x5a

    if-eq p1, v0, :cond_2

    const/16 v0, 0xb4

    if-eq p1, v0, :cond_1

    const/16 v0, 0x10e

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    goto :goto_0

    :cond_1
    const/4 p1, 0x3

    goto :goto_0

    :cond_2
    const/4 p1, 0x6

    :goto_0
    return p1
.end method


# virtual methods
.method public writeExifOrientation(Ljava/io/File;I)V
    .locals 2
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fotoapparat/exception/FileSaveException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    :try_start_0
    new-instance v0, Landroidx/exifinterface/media/ExifInterface;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/exifinterface/media/ExifInterface;-><init>(Ljava/lang/String;)V

    const-string p1, "Orientation"

    .line 19
    sget-object v1, Lio/fotoapparat/exif/ExifWriter;->INSTANCE:Lio/fotoapparat/exif/ExifWriter;

    invoke-direct {v1, p2}, Lio/fotoapparat/exif/ExifWriter;->toExifOrientation(I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    .line 17
    invoke-virtual {v0, p1, p2}, Landroidx/exifinterface/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v0}, Landroidx/exifinterface/media/ExifInterface;->saveAttributes()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 24
    new-instance p2, Lio/fotoapparat/exception/FileSaveException;

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {p2, p1}, Lio/fotoapparat/exception/FileSaveException;-><init>(Ljava/lang/Throwable;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
.end method
