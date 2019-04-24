.class public final Lcom/ibotta/android/views/list/Padding;
.super Ljava/lang/Object;
.source "IbottaListViewState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003R\u0013\u0010\u0006\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0002\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/Padding;",
        "",
        "paddingLeft",
        "",
        "paddingTop",
        "paddingRight",
        "paddingBottom",
        "(IIII)V",
        "getPaddingBottom",
        "()I",
        "getPaddingLeft",
        "getPaddingRight",
        "getPaddingTop",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "withBottomPadding",
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
.field private final paddingBottom:I

.field private final paddingLeft:I

.field private final paddingRight:I

.field private final paddingTop:I


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

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/list/Padding;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ibotta/android/views/list/Padding;->paddingLeft:I

    iput p2, p0, Lcom/ibotta/android/views/list/Padding;->paddingTop:I

    iput p3, p0, Lcom/ibotta/android/views/list/Padding;->paddingRight:I

    iput p4, p0, Lcom/ibotta/android/views/list/Padding;->paddingBottom:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 88
    sget p1, Lcom/ibotta/views/R$dimen;->size_0:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 89
    sget p2, Lcom/ibotta/views/R$dimen;->size_0:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 90
    sget p3, Lcom/ibotta/views/R$dimen;->size_0:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 91
    sget p4, Lcom/ibotta/views/R$dimen;->size_0:I

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/list/Padding;-><init>(IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/list/Padding;IIIIILjava/lang/Object;)Lcom/ibotta/android/views/list/Padding;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/ibotta/android/views/list/Padding;->paddingLeft:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/ibotta/android/views/list/Padding;->paddingTop:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/ibotta/android/views/list/Padding;->paddingRight:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/ibotta/android/views/list/Padding;->paddingBottom:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/list/Padding;->copy(IIII)Lcom/ibotta/android/views/list/Padding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Padding;->paddingLeft:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Padding;->paddingTop:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Padding;->paddingRight:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Padding;->paddingBottom:I

    return v0
.end method

.method public final copy(IIII)Lcom/ibotta/android/views/list/Padding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/ibotta/android/views/list/Padding;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/views/list/Padding;-><init>(IIII)V

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

    instance-of v1, p1, Lcom/ibotta/android/views/list/Padding;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Lcom/ibotta/android/views/list/Padding;

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingLeft:I

    iget v3, p1, Lcom/ibotta/android/views/list/Padding;->paddingLeft:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingTop:I

    iget v3, p1, Lcom/ibotta/android/views/list/Padding;->paddingTop:I

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_4

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingRight:I

    iget v3, p1, Lcom/ibotta/android/views/list/Padding;->paddingRight:I

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_4

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingBottom:I

    iget p1, p1, Lcom/ibotta/android/views/list/Padding;->paddingBottom:I

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

.method public final getPaddingBottom()I
    .locals 1
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    .line 91
    iget v0, p0, Lcom/ibotta/android/views/list/Padding;->paddingBottom:I

    return v0
.end method

.method public final getPaddingLeft()I
    .locals 1
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    .line 88
    iget v0, p0, Lcom/ibotta/android/views/list/Padding;->paddingLeft:I

    return v0
.end method

.method public final getPaddingRight()I
    .locals 1
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    .line 90
    iget v0, p0, Lcom/ibotta/android/views/list/Padding;->paddingRight:I

    return v0
.end method

.method public final getPaddingTop()I
    .locals 1
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    .line 89
    iget v0, p0, Lcom/ibotta/android/views/list/Padding;->paddingTop:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/ibotta/android/views/list/Padding;->paddingLeft:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingTop:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingRight:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingBottom:I

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

    const-string v1, "Padding(paddingLeft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingLeft:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", paddingTop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingTop:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", paddingRight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingRight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", paddingBottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Padding;->paddingBottom:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withBottomPadding(I)Lcom/ibotta/android/views/list/Padding;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v0, p0

    move v4, p1

    .line 93
    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/views/list/Padding;->copy$default(Lcom/ibotta/android/views/list/Padding;IIIIILjava/lang/Object;)Lcom/ibotta/android/views/list/Padding;

    move-result-object p1

    return-object p1
.end method
