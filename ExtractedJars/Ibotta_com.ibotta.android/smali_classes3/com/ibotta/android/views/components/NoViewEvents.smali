.class public final Lcom/ibotta/android/views/components/NoViewEvents;
.super Ljava/lang/Object;
.source "ViewComponent.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewEvents;


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
        "Lcom/ibotta/android/views/components/NoViewEvents;",
        "Lcom/ibotta/android/views/components/ViewEvents;",
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
.field public static final INSTANCE:Lcom/ibotta/android/views/components/NoViewEvents;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    new-instance v0, Lcom/ibotta/android/views/components/NoViewEvents;

    invoke-direct {v0}, Lcom/ibotta/android/views/components/NoViewEvents;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/components/NoViewEvents;->INSTANCE:Lcom/ibotta/android/views/components/NoViewEvents;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
