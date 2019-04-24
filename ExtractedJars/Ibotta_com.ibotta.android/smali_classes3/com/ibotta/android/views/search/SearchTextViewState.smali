.class public final Lcom/ibotta/android/views/search/SearchTextViewState;
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
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B?\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0008\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000c\u00a8\u0006 "
    }
    d2 = {
        "Lcom/ibotta/android/views/search/SearchTextViewState;",
        "Lcom/ibotta/android/views/search/SearchViewState;",
        "searchText",
        "",
        "hint",
        "leftIcon",
        "",
        "rightIcon",
        "leftIconDesc",
        "rightIconDesc",
        "(Ljava/lang/String;Ljava/lang/String;IIII)V",
        "getHint",
        "()Ljava/lang/String;",
        "getLeftIcon",
        "()I",
        "getLeftIconDesc",
        "getRightIcon",
        "getRightIconDesc",
        "getSearchText",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
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
.field private final hint:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final leftIcon:I

.field private final leftIconDesc:I

.field private final rightIcon:I

.field private final rightIconDesc:I

.field private final searchText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIII)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "searchText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, v0}, Lcom/ibotta/android/views/search/SearchViewState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->searchText:Ljava/lang/String;

    iput-object p2, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->hint:Ljava/lang/String;

    iput p3, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->leftIcon:I

    iput p4, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->rightIcon:I

    iput p5, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->leftIconDesc:I

    iput p6, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->rightIconDesc:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const-string p1, ""

    move-object v1, p1

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_1

    .line 37
    sget p3, Lcom/ibotta/views/R$drawable;->svg_search:I

    move v3, p3

    goto :goto_1

    :cond_1
    move v3, p3

    :goto_1
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_2

    .line 38
    sget p4, Lcom/ibotta/views/R$drawable;->svg_barcode_scan:I

    move v4, p4

    goto :goto_2

    :cond_2
    move v4, p4

    :goto_2
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_3

    .line 39
    sget p5, Lcom/ibotta/views/R$string;->search:I

    move v5, p5

    goto :goto_3

    :cond_3
    move v5, p5

    :goto_3
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_4

    .line 40
    sget p6, Lcom/ibotta/views/R$string;->search_by_barcode:I

    move v6, p6

    goto :goto_4

    :cond_4
    move v6, p6

    :goto_4
    move-object v0, p0

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/search/SearchTextViewState;-><init>(Ljava/lang/String;Ljava/lang/String;IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/search/SearchTextViewState;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/Object;)Lcom/ibotta/android/views/search/SearchTextViewState;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->searchText:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->hint:Ljava/lang/String;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIcon()I

    move-result p3

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIcon()I

    move-result p4

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIconDesc()I

    move-result p5

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIconDesc()I

    move-result p6

    :cond_5
    move v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/ibotta/android/views/search/SearchTextViewState;->copy(Ljava/lang/String;Ljava/lang/String;IIII)Lcom/ibotta/android/views/search/SearchTextViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->searchText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->hint:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIcon()I

    move-result v0

    return v0
.end method

.method public final component4()I
    .locals 1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIcon()I

    move-result v0

    return v0
.end method

.method public final component5()I
    .locals 1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIconDesc()I

    move-result v0

    return v0
.end method

.method public final component6()I
    .locals 1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIconDesc()I

    move-result v0

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;IIII)Lcom/ibotta/android/views/search/SearchTextViewState;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "searchText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/search/SearchTextViewState;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/views/search/SearchTextViewState;-><init>(Ljava/lang/String;Ljava/lang/String;IIII)V

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

    instance-of v1, p1, Lcom/ibotta/android/views/search/SearchTextViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Lcom/ibotta/android/views/search/SearchTextViewState;

    iget-object v1, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->searchText:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/search/SearchTextViewState;->searchText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->hint:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/search/SearchTextViewState;->hint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIcon()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIcon()I

    move-result v3

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIcon()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIcon()I

    move-result v3

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIconDesc()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIconDesc()I

    move-result v3

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIconDesc()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIconDesc()I

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

.method public final getHint()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->hint:Ljava/lang/String;

    return-object v0
.end method

.method public getLeftIcon()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->leftIcon:I

    return v0
.end method

.method public getLeftIconDesc()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->leftIconDesc:I

    return v0
.end method

.method public getRightIcon()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->rightIcon:I

    return v0
.end method

.method public getRightIconDesc()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->rightIconDesc:I

    return v0
.end method

.method public final getSearchText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->searchText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->searchText:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->hint:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIcon()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIcon()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIconDesc()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIconDesc()I

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

    const-string v1, "SearchTextViewState(searchText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->searchText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/search/SearchTextViewState;->hint:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", leftIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rightIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leftIconDesc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getLeftIconDesc()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rightIconDesc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchTextViewState;->getRightIconDesc()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
