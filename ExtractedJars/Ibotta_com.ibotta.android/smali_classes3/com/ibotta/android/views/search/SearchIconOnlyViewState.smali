.class public final Lcom/ibotta/android/views/search/SearchIconOnlyViewState;
.super Lcom/ibotta/android/views/search/SearchViewState;
.source "SearchViewComponent.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/ibotta/android/views/search/SearchIconOnlyViewState;",
        "Lcom/ibotta/android/views/search/SearchViewState;",
        "leftIcon",
        "",
        "rightIcon",
        "leftIconDesc",
        "rightIconDesc",
        "(IIII)V",
        "getLeftIcon",
        "()I",
        "getLeftIconDesc",
        "getRightIcon",
        "getRightIconDesc",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final leftIcon:I

.field private final leftIconDesc:I

.field private final rightIcon:I

.field private final rightIconDesc:I


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 1

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, v0}, Lcom/ibotta/android/views/search/SearchViewState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->leftIcon:I

    iput p2, p0, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->rightIcon:I

    iput p3, p0, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->leftIconDesc:I

    iput p4, p0, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->rightIconDesc:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 26
    sget p1, Lcom/ibotta/views/R$drawable;->svg_search:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 27
    sget p2, Lcom/ibotta/views/R$drawable;->svg_barcode_scan:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 28
    sget p3, Lcom/ibotta/views/R$string;->search:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 29
    sget p4, Lcom/ibotta/views/R$string;->search_by_barcode:I

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;-><init>(IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/search/SearchIconOnlyViewState;IIIIILjava/lang/Object;)Lcom/ibotta/android/views/search/SearchIconOnlyViewState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIcon()I

    move-result p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIcon()I

    move-result p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIconDesc()I

    move-result p3

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIconDesc()I

    move-result p4

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->copy(IIII)Lcom/ibotta/android/views/search/SearchIconOnlyViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIcon()I

    move-result v0

    return v0
.end method

.method public final component2()I
    .locals 1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIcon()I

    move-result v0

    return v0
.end method

.method public final component3()I
    .locals 1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIconDesc()I

    move-result v0

    return v0
.end method

.method public final component4()I
    .locals 1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIconDesc()I

    move-result v0

    return v0
.end method

.method public final copy(IIII)Lcom/ibotta/android/views/search/SearchIconOnlyViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;-><init>(IIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_5

    instance-of v1, p1, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIcon()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIcon()I

    move-result v3

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIcon()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIcon()I

    move-result v3

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIconDesc()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIconDesc()I

    move-result v3

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIconDesc()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIconDesc()I

    move-result p1

    if-ne v1, p1, :cond_3

    const/4 p1, 0x1

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    :goto_3
    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    return v2

    :cond_5
    :goto_4
    return v0
.end method

.method public getLeftIcon()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->leftIcon:I

    return v0
.end method

.method public getLeftIconDesc()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->leftIconDesc:I

    return v0
.end method

.method public getRightIcon()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->rightIcon:I

    return v0
.end method

.method public getRightIconDesc()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->rightIconDesc:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIcon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIcon()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIconDesc()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIconDesc()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SearchIconOnlyViewState(leftIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rightIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leftIconDesc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getLeftIconDesc()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rightIconDesc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;->getRightIconDesc()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
