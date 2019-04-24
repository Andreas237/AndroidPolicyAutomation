.class public final Lcom/ibotta/android/views/content/SummaryContentViewState$Companion;
.super Ljava/lang/Object;
.source "SummaryContentViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/content/SummaryContentViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/views/content/SummaryContentViewState$Companion;",
        "",
        "()V",
        "EMPTY",
        "Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "getEMPTY",
        "()Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "setEMPTY",
        "(Lcom/ibotta/android/views/content/SummaryContentViewState;)V",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/views/content/SummaryContentViewState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getEMPTY()Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    invoke-static {}, Lcom/ibotta/android/views/content/SummaryContentViewState;->access$getEMPTY$cp()Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v0

    return-object v0
.end method

.method public final setEMPTY(Lcom/ibotta/android/views/content/SummaryContentViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/content/SummaryContentViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-static {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->access$setEMPTY$cp(Lcom/ibotta/android/views/content/SummaryContentViewState;)V

    return-void
.end method
