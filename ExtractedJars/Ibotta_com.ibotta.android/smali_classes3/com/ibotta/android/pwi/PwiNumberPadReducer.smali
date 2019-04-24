.class public final Lcom/ibotta/android/pwi/PwiNumberPadReducer;
.super Ljava/lang/Object;
.source "PwiNumberPadReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/pwi/PwiNumberPadReducer;",
        "",
        "()V",
        "create",
        "Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;",
        "enabled",
        "",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Z)Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 8
    sget-object p1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;->getENABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 9
    sget-object p1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;->getDISABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
