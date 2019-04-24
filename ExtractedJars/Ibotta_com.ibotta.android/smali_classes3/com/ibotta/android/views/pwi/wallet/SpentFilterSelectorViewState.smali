.class public final Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;
.super Ljava/lang/Object;
.source "SpentFilterSelectorViewState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012$\u0008\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0008J%\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003J9\u0010\u000f\u001a\u00020\u00002$\u0008\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR-\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;",
        "",
        "transactionAmountByTypeMap",
        "Ljava/util/HashMap;",
        "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
        "",
        "Lkotlin/collections/HashMap;",
        "selectedFilterType",
        "(Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)V",
        "getSelectedFilterType",
        "()Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
        "getTransactionAmountByTypeMap",
        "()Ljava/util/HashMap;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final selectedFilterType:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final transactionAmountByTypeMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;-><init>(Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)V
    .locals 1
    .param p1    # Ljava/util/HashMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/pwi/wallet/SpentFilter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
            ")V"
        }
    .end annotation

    const-string v0, "transactionAmountByTypeMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedFilterType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->transactionAmountByTypeMap:Ljava/util/HashMap;

    iput-object p2, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->selectedFilterType:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 9
    new-instance p1, Ljava/util/HashMap;

    invoke-static {}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->values()[Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    move-result-object p4

    array-length p4, p4

    invoke-direct {p1, p4}, Ljava/util/HashMap;-><init>(I)V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 10
    sget-object p2, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;-><init>(Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;ILjava/lang/Object;)Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->transactionAmountByTypeMap:Ljava/util/HashMap;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->selectedFilterType:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->copy(Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->transactionAmountByTypeMap:Ljava/util/HashMap;

    return-object v0
.end method

.method public final component2()Lcom/ibotta/android/views/pwi/wallet/SpentFilter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->selectedFilterType:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    return-object v0
.end method

.method public final copy(Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;
    .locals 1
    .param p1    # Ljava/util/HashMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/pwi/wallet/SpentFilter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
            ")",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "transactionAmountByTypeMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedFilterType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;-><init>(Ljava/util/HashMap;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->transactionAmountByTypeMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->transactionAmountByTypeMap:Ljava/util/HashMap;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->selectedFilterType:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    iget-object p1, p1, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->selectedFilterType:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

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

.method public final getSelectedFilterType()Lcom/ibotta/android/views/pwi/wallet/SpentFilter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->selectedFilterType:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    return-object v0
.end method

.method public final getTransactionAmountByTypeMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->transactionAmountByTypeMap:Ljava/util/HashMap;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->transactionAmountByTypeMap:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->selectedFilterType:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

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

    const-string v1, "SpentFilterSelectorViewState(transactionAmountByTypeMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->transactionAmountByTypeMap:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedFilterType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->selectedFilterType:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
