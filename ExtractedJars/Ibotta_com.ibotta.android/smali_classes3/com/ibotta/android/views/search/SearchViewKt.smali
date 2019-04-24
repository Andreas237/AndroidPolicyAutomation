.class public final Lcom/ibotta/android/views/search/SearchViewKt;
.super Ljava/lang/Object;
.source "SearchView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\t\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"
    }
    d2 = {
        "HESITATION_DELAY",
        "",
        "ibotta-views_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final HESITATION_DELAY:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 29
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/views/search/SearchViewKt;->HESITATION_DELAY:J

    return-void
.end method

.method public static final synthetic access$getHESITATION_DELAY$p()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/ibotta/android/views/search/SearchViewKt;->HESITATION_DELAY:J

    return-wide v0
.end method
