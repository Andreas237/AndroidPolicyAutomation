.class public final Lcom/ibotta/android/views/components/NoViewState;
.super Ljava/lang/Object;
.source "ViewComponent.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/ibotta/android/views/components/NoViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "()V",
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
.field public static final INSTANCE:Lcom/ibotta/android/views/components/NoViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Lcom/ibotta/android/views/components/NoViewState;

    invoke-direct {v0}, Lcom/ibotta/android/views/components/NoViewState;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/components/NoViewState;->INSTANCE:Lcom/ibotta/android/views/components/NoViewState;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
