.class public final Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;
.super Ljava/lang/Object;
.source "PaymentMethodsViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "rows",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "(Lcom/ibotta/android/views/list/IbottaListViewState;)V",
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
.field public static final Companion:Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState$Companion;

.field public static final EMPTY:Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final rows:Lcom/ibotta/android/views/list/IbottaListViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;->Companion:Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState$Companion;

    .line 13
    new-instance v0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;-><init>(Lcom/ibotta/android/views/list/IbottaListViewState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;->EMPTY:Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;-><init>(Lcom/ibotta/android/views/list/IbottaListViewState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/IbottaListViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rows"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;->rows:Lcom/ibotta/android/views/list/IbottaListViewState;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ibotta/android/views/list/IbottaListViewState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 10
    sget-object p1, Lcom/ibotta/android/views/list/IbottaListViewState;->EMPTY:Lcom/ibotta/android/views/list/IbottaListViewState;

    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;-><init>(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method
