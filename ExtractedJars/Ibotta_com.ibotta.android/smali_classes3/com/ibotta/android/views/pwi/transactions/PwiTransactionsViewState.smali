.class public final Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;
.super Ljava/lang/Object;
.source "PwiTransactionsViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u0000 $2\u00020\u0001:\u0001$BQ\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000eJ\u000f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003JU\u0010\u001d\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013\u00a8\u0006%"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "rows",
        "",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
        "isWallet",
        "",
        "manageAllTransactionsVisibility",
        "Lcom/ibotta/android/views/components/Visibility;",
        "spentFilterText",
        "",
        "spentFilterVisibility",
        "emptyTransactionsText",
        "isSpentFilterOff",
        "(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Z)V",
        "getEmptyTransactionsText",
        "()Ljava/lang/String;",
        "()Z",
        "getManageAllTransactionsVisibility",
        "()Lcom/ibotta/android/views/components/Visibility;",
        "getSpentFilterText",
        "getSpentFilterVisibility",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
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
.field public static final Companion:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState$Companion;

.field public static final EMPTY:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final emptyTransactionsText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final isSpentFilterOff:Z

.field private final isWallet:Z

.field private final manageAllTransactionsVisibility:Lcom/ibotta/android/views/components/Visibility;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final spentFilterText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final spentFilterVisibility:Lcom/ibotta/android/views/components/Visibility;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->Companion:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState$Companion;

    .line 21
    new-instance v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x7f

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;-><init>(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->EMPTY:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x7f

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;-><init>(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/components/Visibility;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/views/components/Visibility;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
            ">;Z",
            "Lcom/ibotta/android/views/components/Visibility;",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/views/components/Visibility;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const-string v0, "rows"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manageAllTransactionsVisibility"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spentFilterText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spentFilterVisibility"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emptyTransactionsText"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->rows:Ljava/util/List;

    iput-boolean p2, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet:Z

    iput-object p3, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->manageAllTransactionsVisibility:Lcom/ibotta/android/views/components/Visibility;

    iput-object p4, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterText:Ljava/lang/String;

    iput-object p5, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterVisibility:Lcom/ibotta/android/views/components/Visibility;

    iput-object p6, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->emptyTransactionsText:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_1

    .line 12
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<com.ibotta.android.views.pwi.transactions.PwiTransactionRowViewState>"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v0, p1

    :goto_0
    and-int/lit8 v1, p8, 0x2

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    move v1, p2

    :goto_1
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_3

    .line 14
    sget-object v2, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_2

    :cond_3
    move-object v2, p3

    :goto_2
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_4

    const-string v3, ""

    goto :goto_3

    :cond_4
    move-object v3, p4

    :goto_3
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_5

    .line 16
    sget-object v4, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_4

    :cond_5
    move-object v4, p5

    :goto_4
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_6

    const-string v5, ""

    goto :goto_5

    :cond_6
    move-object v5, p6

    :goto_5
    and-int/lit8 v6, p8, 0x40

    if-eqz v6, :cond_7

    const/4 v6, 0x1

    goto :goto_6

    :cond_7
    move v6, p7

    :goto_6
    move-object p1, p0

    move-object p2, v0

    move p3, v1

    move-object p4, v2

    move-object p5, v3

    move-object p6, v4

    move-object p7, v5

    move p8, v6

    .line 18
    invoke-direct/range {p1 .. p8}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;-><init>(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;ZILjava/lang/Object;)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->rows:Ljava/util/List;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-boolean p2, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet:Z

    :cond_1
    move p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->manageAllTransactionsVisibility:Lcom/ibotta/android/views/components/Visibility;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterText:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterVisibility:Lcom/ibotta/android/views/components/Visibility;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->emptyTransactionsText:Ljava/lang/String;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-boolean p7, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff:Z

    :cond_6
    move v4, p7

    move-object p2, p0

    move-object p3, p1

    move p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    move p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->copy(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Z)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->rows:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet:Z

    return v0
.end method

.method public final component3()Lcom/ibotta/android/views/components/Visibility;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->manageAllTransactionsVisibility:Lcom/ibotta/android/views/components/Visibility;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/ibotta/android/views/components/Visibility;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterVisibility:Lcom/ibotta/android/views/components/Visibility;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->emptyTransactionsText:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff:Z

    return v0
.end method

.method public final copy(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Z)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;
    .locals 9
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/components/Visibility;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/views/components/Visibility;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
            ">;Z",
            "Lcom/ibotta/android/views/components/Visibility;",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/views/components/Visibility;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "rows"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manageAllTransactionsVisibility"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spentFilterText"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spentFilterVisibility"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emptyTransactionsText"

    move-object v7, p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    move-object v1, v0

    move v3, p2

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;-><init>(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Z)V

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

    instance-of v1, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->rows:Ljava/util/List;

    iget-object v3, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->rows:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet:Z

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->manageAllTransactionsVisibility:Lcom/ibotta/android/views/components/Visibility;

    iget-object v3, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->manageAllTransactionsVisibility:Lcom/ibotta/android/views/components/Visibility;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterText:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterVisibility:Lcom/ibotta/android/views/components/Visibility;

    iget-object v3, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterVisibility:Lcom/ibotta/android/views/components/Visibility;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->emptyTransactionsText:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->emptyTransactionsText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff:Z

    iget-boolean p1, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff:Z

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v0
.end method

.method public final getEmptyTransactionsText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->emptyTransactionsText:Ljava/lang/String;

    return-object v0
.end method

.method public final getManageAllTransactionsVisibility()Lcom/ibotta/android/views/components/Visibility;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->manageAllTransactionsVisibility:Lcom/ibotta/android/views/components/Visibility;

    return-object v0
.end method

.method public final getSpentFilterText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSpentFilterVisibility()Lcom/ibotta/android/views/components/Visibility;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterVisibility:Lcom/ibotta/android/views/components/Visibility;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->rows:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->manageAllTransactionsVisibility:Lcom/ibotta/android/views/components/Visibility;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterText:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterVisibility:Lcom/ibotta/android/views/components/Visibility;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->emptyTransactionsText:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff:Z

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    :cond_6
    add-int/2addr v0, v1

    return v0
.end method

.method public final isSpentFilterOff()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff:Z

    return v0
.end method

.method public final isWallet()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PwiTransactionsViewState(rows="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->rows:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isWallet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", manageAllTransactionsVisibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->manageAllTransactionsVisibility:Lcom/ibotta/android/views/components/Visibility;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spentFilterText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", spentFilterVisibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->spentFilterVisibility:Lcom/ibotta/android/views/components/Visibility;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", emptyTransactionsText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->emptyTransactionsText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isSpentFilterOff="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
