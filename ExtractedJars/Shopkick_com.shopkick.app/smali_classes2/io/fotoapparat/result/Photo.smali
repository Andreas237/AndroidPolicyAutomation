.class public final Lio/fotoapparat/result/Photo;
.super Ljava/lang/Object;
.source "Photo.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fotoapparat/result/Photo$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPhoto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Photo.kt\nio/fotoapparat/result/Photo\n*L\n1#1,75:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u0018\u001a\u00020\u0005H\u0016J\u0008\u0010\u0019\u001a\u00020\u001aH\u0016R\u001b\u0010\u0007\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/fotoapparat/result/Photo;",
        "",
        "encodedImage",
        "",
        "rotationDegrees",
        "",
        "([BI)V",
        "decodedBounds",
        "Landroid/graphics/BitmapFactory$Options;",
        "getDecodedBounds",
        "()Landroid/graphics/BitmapFactory$Options;",
        "decodedBounds$delegate",
        "Lkotlin/Lazy;",
        "height",
        "getHeight",
        "()I",
        "width",
        "getWidth",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;

.field public static final Companion:Lio/fotoapparat/result/Photo$Companion;


# instance fields
.field private final decodedBounds$delegate:Lkotlin/Lazy;

.field public final encodedImage:[B
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final rotationDegrees:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-class v2, Lio/fotoapparat/result/Photo;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    const-string v3, "decodedBounds"

    const-string v4, "getDecodedBounds()Landroid/graphics/BitmapFactory$Options;"

    invoke-direct {v1, v2, v3, v4}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lio/fotoapparat/result/Photo;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lio/fotoapparat/result/Photo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/fotoapparat/result/Photo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/fotoapparat/result/Photo;->Companion:Lio/fotoapparat/result/Photo$Companion;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "encodedImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    iput p2, p0, Lio/fotoapparat/result/Photo;->rotationDegrees:I

    .line 39
    new-instance p1, Lio/fotoapparat/result/Photo$decodedBounds$2;

    invoke-direct {p1, p0}, Lio/fotoapparat/result/Photo$decodedBounds$2;-><init>(Lio/fotoapparat/result/Photo;)V

    check-cast p1, Lkotlin/jvm/functions/Function0;

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lio/fotoapparat/result/Photo;->decodedBounds$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic copy$default(Lio/fotoapparat/result/Photo;[BIILjava/lang/Object;)Lio/fotoapparat/result/Photo;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lio/fotoapparat/result/Photo;->rotationDegrees:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/fotoapparat/result/Photo;->copy([BI)Lio/fotoapparat/result/Photo;

    move-result-object p0

    return-object p0
.end method

.method private final getDecodedBounds()Landroid/graphics/BitmapFactory$Options;
    .locals 3

    iget-object v0, p0, Lio/fotoapparat/result/Photo;->decodedBounds$delegate:Lkotlin/Lazy;

    sget-object v1, Lio/fotoapparat/result/Photo;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/BitmapFactory$Options;

    return-object v0
.end method


# virtual methods
.method public final component1()[B
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/fotoapparat/result/Photo;->rotationDegrees:I

    return v0
.end method

.method public final copy([BI)Lio/fotoapparat/result/Photo;
    .locals 1
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "encodedImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/fotoapparat/result/Photo;

    invoke-direct {v0, p1, p2}, Lio/fotoapparat/result/Photo;-><init>([BI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 47
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/result/Photo;

    const/4 v1, 0x1

    if-ne v0, p1, :cond_0

    return v1

    .line 48
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    if-eqz p1, :cond_5

    .line 50
    check-cast p1, Lio/fotoapparat/result/Photo;

    .line 52
    iget-object v0, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    iget-object v3, p1, Lio/fotoapparat/result/Photo;->encodedImage:[B

    invoke-static {v0, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_3

    return v2

    .line 53
    :cond_3
    iget v0, p0, Lio/fotoapparat/result/Photo;->rotationDegrees:I

    iget p1, p1, Lio/fotoapparat/result/Photo;->rotationDegrees:I

    if-eq v0, p1, :cond_4

    return v2

    :cond_4
    return v1

    .line 50
    :cond_5
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type io.fotoapparat.result.Photo"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getHeight()I
    .locals 1

    .line 31
    invoke-direct {p0}, Lio/fotoapparat/result/Photo;->getDecodedBounds()Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 37
    invoke-direct {p0}, Lio/fotoapparat/result/Photo;->getDecodedBounds()Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 59
    iget-object v0, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 60
    iget v1, p0, Lio/fotoapparat/result/Photo;->rotationDegrees:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Photo(encodedImage=ByteArray("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/fotoapparat/result/Photo;->encodedImage:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") rotationDegrees="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/fotoapparat/result/Photo;->rotationDegrees:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
