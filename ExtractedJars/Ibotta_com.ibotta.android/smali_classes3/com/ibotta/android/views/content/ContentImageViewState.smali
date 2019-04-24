.class public final Lcom/ibotta/android/views/content/ContentImageViewState;
.super Ljava/lang/Object;
.source "ContentImageViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/content/ContentImageViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u0000 !2\u00020\u0001:\u0001!B9\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J=\u0010\u001a\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\""
    }
    d2 = {
        "Lcom/ibotta/android/views/content/ContentImageViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "imageUrl",
        "",
        "imagePaddingRLT",
        "",
        "imageHeight",
        "imageScaleType",
        "Lcom/ibotta/android/views/content/ScaleType;",
        "glideSize",
        "Lcom/ibotta/android/views/images/Sizes;",
        "(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;)V",
        "getGlideSize",
        "()Lcom/ibotta/android/views/images/Sizes;",
        "getImageHeight",
        "()I",
        "getImagePaddingRLT",
        "getImageScaleType",
        "()Lcom/ibotta/android/views/content/ScaleType;",
        "getImageUrl",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "Companion",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lcom/ibotta/android/views/content/ContentImageViewState$Companion;

.field private static final EMPTY:Lcom/ibotta/android/views/content/ContentImageViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final glideSize:Lcom/ibotta/android/views/images/Sizes;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final imageHeight:I

.field private final imagePaddingRLT:I

.field private final imageScaleType:Lcom/ibotta/android/views/content/ScaleType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final imageUrl:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/ibotta/android/views/content/ContentImageViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/content/ContentImageViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/content/ContentImageViewState;->Companion:Lcom/ibotta/android/views/content/ContentImageViewState$Companion;

    .line 20
    new-instance v0, Lcom/ibotta/android/views/content/ContentImageViewState;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1f

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/ibotta/android/views/content/ContentImageViewState;-><init>(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/content/ContentImageViewState;->EMPTY:Lcom/ibotta/android/views/content/ContentImageViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/content/ContentImageViewState;-><init>(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/content/ScaleType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/views/images/Sizes;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "imageScaleType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "glideSize"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageUrl:Ljava/lang/String;

    iput p2, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imagePaddingRLT:I

    iput p3, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageHeight:I

    iput-object p4, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageScaleType:Lcom/ibotta/android/views/content/ScaleType;

    iput-object p5, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->glideSize:Lcom/ibotta/android/views/images/Sizes;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p1, 0x0

    .line 13
    check-cast p1, Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    const/4 p7, 0x0

    goto :goto_0

    :cond_1
    move p7, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    move v0, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    .line 16
    sget-object p4, Lcom/ibotta/android/views/content/ScaleType;->FIT_CENTER:Lcom/ibotta/android/views/content/ScaleType;

    move-object v1, p4

    goto :goto_2

    :cond_3
    move-object v1, p4

    :goto_2
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    .line 17
    sget-object p5, Lcom/ibotta/android/views/images/Sizes;->DEFAULT:Lcom/ibotta/android/views/images/Sizes;

    move-object v2, p5

    goto :goto_3

    :cond_4
    move-object v2, p5

    :goto_3
    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-direct/range {p2 .. p7}, Lcom/ibotta/android/views/content/ContentImageViewState;-><init>(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;)V

    return-void
.end method

.method public static final synthetic access$getEMPTY$cp()Lcom/ibotta/android/views/content/ContentImageViewState;
    .locals 1

    .line 12
    sget-object v0, Lcom/ibotta/android/views/content/ContentImageViewState;->EMPTY:Lcom/ibotta/android/views/content/ContentImageViewState;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/content/ContentImageViewState;Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;ILjava/lang/Object;)Lcom/ibotta/android/views/content/ContentImageViewState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imagePaddingRLT:I

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageHeight:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageScaleType:Lcom/ibotta/android/views/content/ScaleType;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->glideSize:Lcom/ibotta/android/views/images/Sizes;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/ibotta/android/views/content/ContentImageViewState;->copy(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;)Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imagePaddingRLT:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageHeight:I

    return v0
.end method

.method public final component4()Lcom/ibotta/android/views/content/ScaleType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageScaleType:Lcom/ibotta/android/views/content/ScaleType;

    return-object v0
.end method

.method public final component5()Lcom/ibotta/android/views/images/Sizes;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->glideSize:Lcom/ibotta/android/views/images/Sizes;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;)Lcom/ibotta/android/views/content/ContentImageViewState;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/content/ScaleType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/views/images/Sizes;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "imageScaleType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "glideSize"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/content/ContentImageViewState;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/views/content/ContentImageViewState;-><init>(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_3

    instance-of v1, p1, Lcom/ibotta/android/views/content/ContentImageViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/ibotta/android/views/content/ContentImageViewState;

    iget-object v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/content/ContentImageViewState;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imagePaddingRLT:I

    iget v3, p1, Lcom/ibotta/android/views/content/ContentImageViewState;->imagePaddingRLT:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    iget v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageHeight:I

    iget v3, p1, Lcom/ibotta/android/views/content/ContentImageViewState;->imageHeight:I

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageScaleType:Lcom/ibotta/android/views/content/ScaleType;

    iget-object v3, p1, Lcom/ibotta/android/views/content/ContentImageViewState;->imageScaleType:Lcom/ibotta/android/views/content/ScaleType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->glideSize:Lcom/ibotta/android/views/images/Sizes;

    iget-object p1, p1, Lcom/ibotta/android/views/content/ContentImageViewState;->glideSize:Lcom/ibotta/android/views/images/Sizes;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v0
.end method

.method public final getGlideSize()Lcom/ibotta/android/views/images/Sizes;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->glideSize:Lcom/ibotta/android/views/images/Sizes;

    return-object v0
.end method

.method public final getImageHeight()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageHeight:I

    return v0
.end method

.method public final getImagePaddingRLT()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imagePaddingRLT:I

    return v0
.end method

.method public final getImageScaleType()Lcom/ibotta/android/views/content/ScaleType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageScaleType:Lcom/ibotta/android/views/content/ScaleType;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imagePaddingRLT:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageHeight:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageScaleType:Lcom/ibotta/android/views/content/ScaleType;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->glideSize:Lcom/ibotta/android/views/images/Sizes;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentImageViewState(imageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imagePaddingRLT="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imagePaddingRLT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", imageHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", imageScaleType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->imageScaleType:Lcom/ibotta/android/views/content/ScaleType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", glideSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/content/ContentImageViewState;->glideSize:Lcom/ibotta/android/views/images/Sizes;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
