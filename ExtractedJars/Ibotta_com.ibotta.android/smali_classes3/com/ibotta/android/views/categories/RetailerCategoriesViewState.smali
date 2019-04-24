.class public final Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;
.super Ljava/lang/Object;
.source "RetailerCategoriesViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/categories/RetailerCategoriesViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "titleBarViewState",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "categories",
        "",
        "Lcom/ibotta/android/views/categories/RetailerCategoryViewState;",
        "(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)V",
        "getCategories",
        "()Ljava/util/List;",
        "getTitleBarViewState",
        "()Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
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
.field public static final Companion:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState$Companion;

.field public static final EMPTY:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/categories/RetailerCategoryViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->Companion:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState$Companion;

    .line 11
    new-instance v0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->EMPTY:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/base/title/TitleBarViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/categories/RetailerCategoryViewState;",
            ">;)V"
        }
    .end annotation

    const-string v0, "titleBarViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categories"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    iput-object p2, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->categories:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 7
    sget-object p1, Lcom/ibotta/android/views/base/title/TitleBarViewState;->EMPTY:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;ILjava/lang/Object;)Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->categories:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->copy(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/categories/RetailerCategoryViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->categories:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;
    .locals 1
    .param p1    # Lcom/ibotta/android/views/base/title/TitleBarViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/categories/RetailerCategoryViewState;",
            ">;)",
            "Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "titleBarViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categories"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    iget-object v1, p1, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->categories:Ljava/util/List;

    iget-object p1, p1, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->categories:Ljava/util/List;

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

.method public final getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/categories/RetailerCategoryViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->categories:Ljava/util/List;

    return-object v0
.end method

.method public final getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->categories:Ljava/util/List;

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

    const-string v1, "RetailerCategoriesViewState(titleBarViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", categories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->categories:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
