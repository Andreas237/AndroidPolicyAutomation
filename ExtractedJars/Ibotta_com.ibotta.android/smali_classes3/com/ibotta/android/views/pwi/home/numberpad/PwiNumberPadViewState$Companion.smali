.class public final Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;
.super Ljava/lang/Object;
.source "PwiNumberPadViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;",
        "",
        "()V",
        "DISABLED",
        "Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;",
        "getDISABLED",
        "()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;",
        "ENABLED",
        "getENABLED",
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

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDISABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    invoke-static {}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->access$getDISABLED$cp()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object v0

    return-object v0
.end method

.method public final getENABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    invoke-static {}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->access$getENABLED$cp()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object v0

    return-object v0
.end method
