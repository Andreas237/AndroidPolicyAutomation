.class final Lio/fotoapparat/result/Photo$decodedBounds$2;
.super Lkotlin/jvm/internal/Lambda;
.source "Photo.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/result/Photo;-><init>([BI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/graphics/BitmapFactory$Options;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPhoto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Photo.kt\nio/fotoapparat/result/Photo$decodedBounds$2\n*L\n1#1,75:1\n*E\n"
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
        "Landroid/graphics/BitmapFactory$Options;",
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
.field final synthetic this$0:Lio/fotoapparat/result/Photo;


# direct methods
.method constructor <init>(Lio/fotoapparat/result/Photo;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/result/Photo$decodedBounds$2;->this$0:Lio/fotoapparat/result/Photo;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/graphics/BitmapFactory$Options;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 40
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    .line 41
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 42
    iget-object v1, p0, Lio/fotoapparat/result/Photo$decodedBounds$2;->this$0:Lio/fotoapparat/result/Photo;

    iget-object v1, v1, Lio/fotoapparat/result/Photo;->encodedImage:[B

    iget-object v2, p0, Lio/fotoapparat/result/Photo$decodedBounds$2;->this$0:Lio/fotoapparat/result/Photo;

    iget-object v2, v2, Lio/fotoapparat/result/Photo;->encodedImage:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lio/fotoapparat/result/Photo$decodedBounds$2;->invoke()Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    return-object v0
.end method
