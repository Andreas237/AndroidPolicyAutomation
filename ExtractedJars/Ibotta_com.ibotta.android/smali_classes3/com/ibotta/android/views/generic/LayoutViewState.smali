.class public final Lcom/ibotta/android/views/generic/LayoutViewState;
.super Ljava/lang/Object;
.source "LayoutViewState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ibotta/android/views/generic/LayoutViewState;",
        "",
        "width",
        "Lcom/ibotta/android/views/generic/LayoutAttribute;",
        "height",
        "(Lcom/ibotta/android/views/generic/LayoutAttribute;Lcom/ibotta/android/views/generic/LayoutAttribute;)V",
        "getHeight",
        "()Lcom/ibotta/android/views/generic/LayoutAttribute;",
        "getWidth",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final height:Lcom/ibotta/android/views/generic/LayoutAttribute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final width:Lcom/ibotta/android/views/generic/LayoutAttribute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/generic/LayoutAttribute;Lcom/ibotta/android/views/generic/LayoutAttribute;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/generic/LayoutAttribute;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/generic/LayoutAttribute;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "width"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "height"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->width:Lcom/ibotta/android/views/generic/LayoutAttribute;

    iput-object p2, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->height:Lcom/ibotta/android/views/generic/LayoutAttribute;

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/views/generic/LayoutAttribute;Lcom/ibotta/android/views/generic/LayoutAttribute;ILjava/lang/Object;)Lcom/ibotta/android/views/generic/LayoutViewState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->width:Lcom/ibotta/android/views/generic/LayoutAttribute;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->height:Lcom/ibotta/android/views/generic/LayoutAttribute;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/generic/LayoutViewState;->copy(Lcom/ibotta/android/views/generic/LayoutAttribute;Lcom/ibotta/android/views/generic/LayoutAttribute;)Lcom/ibotta/android/views/generic/LayoutViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/ibotta/android/views/generic/LayoutAttribute;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->width:Lcom/ibotta/android/views/generic/LayoutAttribute;

    return-object v0
.end method

.method public final component2()Lcom/ibotta/android/views/generic/LayoutAttribute;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->height:Lcom/ibotta/android/views/generic/LayoutAttribute;

    return-object v0
.end method

.method public final copy(Lcom/ibotta/android/views/generic/LayoutAttribute;Lcom/ibotta/android/views/generic/LayoutAttribute;)Lcom/ibotta/android/views/generic/LayoutViewState;
    .locals 1
    .param p1    # Lcom/ibotta/android/views/generic/LayoutAttribute;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/generic/LayoutAttribute;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "width"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "height"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/generic/LayoutViewState;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/views/generic/LayoutViewState;-><init>(Lcom/ibotta/android/views/generic/LayoutAttribute;Lcom/ibotta/android/views/generic/LayoutAttribute;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lcom/ibotta/android/views/generic/LayoutViewState;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/android/views/generic/LayoutViewState;

    iget-object v0, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->width:Lcom/ibotta/android/views/generic/LayoutAttribute;

    iget-object v1, p1, Lcom/ibotta/android/views/generic/LayoutViewState;->width:Lcom/ibotta/android/views/generic/LayoutAttribute;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->height:Lcom/ibotta/android/views/generic/LayoutAttribute;

    iget-object p1, p1, Lcom/ibotta/android/views/generic/LayoutViewState;->height:Lcom/ibotta/android/views/generic/LayoutAttribute;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final getHeight()Lcom/ibotta/android/views/generic/LayoutAttribute;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->height:Lcom/ibotta/android/views/generic/LayoutAttribute;

    return-object v0
.end method

.method public final getWidth()Lcom/ibotta/android/views/generic/LayoutAttribute;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->width:Lcom/ibotta/android/views/generic/LayoutAttribute;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->width:Lcom/ibotta/android/views/generic/LayoutAttribute;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->height:Lcom/ibotta/android/views/generic/LayoutAttribute;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LayoutViewState(width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->width:Lcom/ibotta/android/views/generic/LayoutAttribute;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/generic/LayoutViewState;->height:Lcom/ibotta/android/views/generic/LayoutAttribute;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
