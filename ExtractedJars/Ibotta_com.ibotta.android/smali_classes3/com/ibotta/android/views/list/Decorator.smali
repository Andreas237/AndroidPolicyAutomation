.class public final Lcom/ibotta/android/views/list/Decorator;
.super Ljava/lang/Object;
.source "IbottaListViewState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/list/Decorator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 (2\u00020\u0001:\u0001(B[\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\u000f\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003J_\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0001J\u0013\u0010#\u001a\u00020\n2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001R\u0013\u0010\u0008\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0013\u0010\u0005\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u00020\u00038\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0010\u00a8\u0006)"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/Decorator;",
        "",
        "size",
        "",
        "marginRight",
        "marginLeft",
        "marginTop",
        "marginBottom",
        "color",
        "shouldShowBottomDecorator",
        "",
        "decoratedContentSet",
        "",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "(IIIIIIZLjava/util/Set;)V",
        "getColor",
        "()I",
        "getDecoratedContentSet",
        "()Ljava/util/Set;",
        "getMarginBottom",
        "getMarginLeft",
        "getMarginRight",
        "getMarginTop",
        "getShouldShowBottomDecorator",
        "()Z",
        "getSize",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
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
.field public static final Companion:Lcom/ibotta/android/views/list/Decorator$Companion;

.field public static final EMPTY:Lcom/ibotta/android/views/list/Decorator;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final color:I

.field private final decoratedContentSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final marginBottom:I

.field private final marginLeft:I

.field private final marginRight:I

.field private final marginTop:I

.field private final shouldShowBottomDecorator:Z

.field private final size:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lcom/ibotta/android/views/list/Decorator$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/list/Decorator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/list/Decorator;->Companion:Lcom/ibotta/android/views/list/Decorator$Companion;

    .line 83
    new-instance v0, Lcom/ibotta/android/views/list/Decorator;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xff

    const/4 v12, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/list/Decorator;->EMPTY:Lcom/ibotta/android/views/list/Decorator;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xff

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIZLjava/util/Set;)V
    .locals 1
    .param p8    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIZ",
            "Ljava/util/Set<",
            "+",
            "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
            ">;)V"
        }
    .end annotation

    const-string v0, "decoratedContentSet"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ibotta/android/views/list/Decorator;->size:I

    iput p2, p0, Lcom/ibotta/android/views/list/Decorator;->marginRight:I

    iput p3, p0, Lcom/ibotta/android/views/list/Decorator;->marginLeft:I

    iput p4, p0, Lcom/ibotta/android/views/list/Decorator;->marginTop:I

    iput p5, p0, Lcom/ibotta/android/views/list/Decorator;->marginBottom:I

    iput p6, p0, Lcom/ibotta/android/views/list/Decorator;->color:I

    iput-boolean p7, p0, Lcom/ibotta/android/views/list/Decorator;->shouldShowBottomDecorator:Z

    iput-object p8, p0, Lcom/ibotta/android/views/list/Decorator;->decoratedContentSet:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 73
    sget v1, Lcom/ibotta/views/R$dimen;->size_0:I

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 74
    sget v2, Lcom/ibotta/views/R$dimen;->size_0:I

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    .line 75
    sget v3, Lcom/ibotta/views/R$dimen;->size_0:I

    goto :goto_2

    :cond_2
    move v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    .line 76
    sget v4, Lcom/ibotta/views/R$dimen;->size_0:I

    goto :goto_3

    :cond_3
    move v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    .line 77
    sget v5, Lcom/ibotta/views/R$dimen;->size_0:I

    goto :goto_4

    :cond_4
    move v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    .line 78
    sget v6, Lcom/ibotta/views/R$color;->transparent:I

    goto :goto_5

    :cond_5
    move v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    const/4 v7, 0x0

    goto :goto_6

    :cond_6
    move v7, p7

    :goto_6
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    .line 80
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    goto :goto_7

    :cond_7
    move-object/from16 v0, p8

    :goto_7
    move-object p1, p0

    move p2, v1

    move p3, v2

    move p4, v3

    move p5, v4

    move p6, v5

    move p7, v6

    move/from16 p8, v7

    move-object/from16 p9, v0

    invoke-direct/range {p1 .. p9}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/list/Decorator;IIIIIIZLjava/util/Set;ILjava/lang/Object;)Lcom/ibotta/android/views/list/Decorator;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/ibotta/android/views/list/Decorator;->size:I

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/ibotta/android/views/list/Decorator;->marginRight:I

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/ibotta/android/views/list/Decorator;->marginLeft:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/ibotta/android/views/list/Decorator;->marginTop:I

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/ibotta/android/views/list/Decorator;->marginBottom:I

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/ibotta/android/views/list/Decorator;->color:I

    goto :goto_5

    :cond_5
    move v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/ibotta/android/views/list/Decorator;->shouldShowBottomDecorator:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/ibotta/android/views/list/Decorator;->decoratedContentSet:Ljava/util/Set;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move p1, v2

    move p2, v3

    move p3, v4

    move p4, v5

    move p5, v6

    move p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lcom/ibotta/android/views/list/Decorator;->copy(IIIIIIZLjava/util/Set;)Lcom/ibotta/android/views/list/Decorator;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->size:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->marginRight:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->marginLeft:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->marginTop:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->marginBottom:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->color:I

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/list/Decorator;->shouldShowBottomDecorator:Z

    return v0
.end method

.method public final component8()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/list/Decorator;->decoratedContentSet:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(IIIIIIZLjava/util/Set;)Lcom/ibotta/android/views/list/Decorator;
    .locals 10
    .param p8    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIZ",
            "Ljava/util/Set<",
            "+",
            "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
            ">;)",
            "Lcom/ibotta/android/views/list/Decorator;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "decoratedContentSet"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/list/Decorator;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_8

    instance-of v1, p1, Lcom/ibotta/android/views/list/Decorator;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    check-cast p1, Lcom/ibotta/android/views/list/Decorator;

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->size:I

    iget v3, p1, Lcom/ibotta/android/views/list/Decorator;->size:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_7

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginRight:I

    iget v3, p1, Lcom/ibotta/android/views/list/Decorator;->marginRight:I

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_7

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginLeft:I

    iget v3, p1, Lcom/ibotta/android/views/list/Decorator;->marginLeft:I

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_7

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginTop:I

    iget v3, p1, Lcom/ibotta/android/views/list/Decorator;->marginTop:I

    if-ne v1, v3, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_7

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginBottom:I

    iget v3, p1, Lcom/ibotta/android/views/list/Decorator;->marginBottom:I

    if-ne v1, v3, :cond_4

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    if-eqz v1, :cond_7

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->color:I

    iget v3, p1, Lcom/ibotta/android/views/list/Decorator;->color:I

    if-ne v1, v3, :cond_5

    const/4 v1, 0x1

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    :goto_5
    if-eqz v1, :cond_7

    iget-boolean v1, p0, Lcom/ibotta/android/views/list/Decorator;->shouldShowBottomDecorator:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/list/Decorator;->shouldShowBottomDecorator:Z

    if-ne v1, v3, :cond_6

    const/4 v1, 0x1

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    :goto_6
    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/ibotta/android/views/list/Decorator;->decoratedContentSet:Ljava/util/Set;

    iget-object p1, p1, Lcom/ibotta/android/views/list/Decorator;->decoratedContentSet:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_7

    :cond_7
    return v2

    :cond_8
    :goto_7
    return v0
.end method

.method public final getColor()I
    .locals 1
    .annotation build Landroid/support/annotation/ColorRes;
    .end annotation

    .line 78
    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->color:I

    return v0
.end method

.method public final getDecoratedContentSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/views/list/Decorator;->decoratedContentSet:Ljava/util/Set;

    return-object v0
.end method

.method public final getMarginBottom()I
    .locals 1
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    .line 77
    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->marginBottom:I

    return v0
.end method

.method public final getMarginLeft()I
    .locals 1
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    .line 75
    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->marginLeft:I

    return v0
.end method

.method public final getMarginRight()I
    .locals 1
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    .line 74
    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->marginRight:I

    return v0
.end method

.method public final getMarginTop()I
    .locals 1
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    .line 76
    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->marginTop:I

    return v0
.end method

.method public final getShouldShowBottomDecorator()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lcom/ibotta/android/views/list/Decorator;->shouldShowBottomDecorator:Z

    return v0
.end method

.method public final getSize()I
    .locals 1
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    .line 73
    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->size:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/ibotta/android/views/list/Decorator;->size:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginRight:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginLeft:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginTop:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginBottom:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->color:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ibotta/android/views/list/Decorator;->shouldShowBottomDecorator:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ibotta/android/views/list/Decorator;->decoratedContentSet:Ljava/util/Set;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Decorator(size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", marginRight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginRight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", marginLeft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginLeft:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", marginTop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginTop:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", marginBottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->marginBottom:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/list/Decorator;->color:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowBottomDecorator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/list/Decorator;->shouldShowBottomDecorator:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", decoratedContentSet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/list/Decorator;->decoratedContentSet:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
