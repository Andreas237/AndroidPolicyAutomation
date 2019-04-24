.class public final Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
.super Ljava/lang/Object;
.source "IbottaButtonViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;,
        Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB7\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0013\u0010\u0004\u001a\u00020\u00058\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u00058\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "selected",
        "",
        "contentDescription",
        "",
        "drawableResource",
        "isCircleRipple",
        "showMicroNudge",
        "(ZIIZZ)V",
        "getContentDescription",
        "()I",
        "getDrawableResource",
        "()Z",
        "getSelected",
        "getShowMicroNudge",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Builder",
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
.field public static final Companion:Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Companion;

.field public static EMPTY:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final contentDescription:I

.field private final drawableResource:I

.field private final isCircleRipple:Z

.field private final selected:Z

.field private final showMicroNudge:Z


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->Companion:Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Companion;

    .line 37
    new-instance v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1f

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;-><init>(ZIIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->EMPTY:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

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

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;-><init>(ZIIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZIIZZ)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->selected:Z

    iput p2, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->contentDescription:I

    iput p3, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->drawableResource:I

    iput-boolean p4, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple:Z

    iput-boolean p5, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->showMicroNudge:Z

    return-void
.end method

.method public synthetic constructor <init>(ZIIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    const/4 p7, 0x0

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    move v2, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    move v3, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    const/4 p6, 0x0

    goto :goto_4

    :cond_4
    move p6, p5

    :goto_4
    move-object p1, p0

    move p2, p7

    move p3, v1

    move p4, v2

    move p5, v3

    .line 12
    invoke-direct/range {p1 .. p6}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;-><init>(ZIIZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;ZIIZZILjava/lang/Object;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->selected:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->contentDescription:I

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->drawableResource:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->showMicroNudge:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->copy(ZIIZZ)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->selected:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->contentDescription:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->drawableResource:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->showMicroNudge:Z

    return v0
.end method

.method public final copy(ZIIZZ)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v6, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;-><init>(ZIIZZ)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_6

    instance-of v1, p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    check-cast p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    iget-boolean v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->selected:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->selected:Z

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_5

    iget v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->contentDescription:I

    iget v3, p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->contentDescription:I

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_5

    iget v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->drawableResource:I

    iget v3, p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->drawableResource:I

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_5

    iget-boolean v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple:Z

    if-ne v1, v3, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_5

    iget-boolean v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->showMicroNudge:Z

    iget-boolean p1, p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->showMicroNudge:Z

    if-ne v1, p1, :cond_4

    const/4 p1, 0x1

    goto :goto_4

    :cond_4
    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_5

    goto :goto_5

    :cond_5
    return v2

    :cond_6
    :goto_5
    return v0
.end method

.method public final getContentDescription()I
    .locals 1
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation

    .line 9
    iget v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->contentDescription:I

    return v0
.end method

.method public final getDrawableResource()I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    .line 10
    iget v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->drawableResource:I

    return v0
.end method

.method public final getSelected()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->selected:Z

    return v0
.end method

.method public final getShowMicroNudge()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->showMicroNudge:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->selected:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->contentDescription:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->drawableResource:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->showMicroNudge:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isCircleRipple()Z
    .locals 1

    .line 11
    iget-boolean v0, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IbottaButtonViewState(selected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->selected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", contentDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->contentDescription:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", drawableResource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->drawableResource:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isCircleRipple="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showMicroNudge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->showMicroNudge:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
