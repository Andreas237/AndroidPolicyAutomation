.class public final enum Lcom/ibotta/android/search/SuggestedSearchMode;
.super Ljava/lang/Enum;
.source "SuggestedSearchItemsReducer.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/search/SuggestedSearchMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/ibotta/android/search/SuggestedSearchMode;",
        "",
        "(Ljava/lang/String;I)V",
        "RECENT_ONLY",
        "TYPE_AHEAD",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/search/SuggestedSearchMode;

.field public static final enum RECENT_ONLY:Lcom/ibotta/android/search/SuggestedSearchMode;

.field public static final enum TYPE_AHEAD:Lcom/ibotta/android/search/SuggestedSearchMode;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/ibotta/android/search/SuggestedSearchMode;

    new-instance v1, Lcom/ibotta/android/search/SuggestedSearchMode;

    const-string v2, "RECENT_ONLY"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/search/SuggestedSearchMode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/search/SuggestedSearchMode;->RECENT_ONLY:Lcom/ibotta/android/search/SuggestedSearchMode;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/search/SuggestedSearchMode;

    const-string v2, "TYPE_AHEAD"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/search/SuggestedSearchMode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/search/SuggestedSearchMode;->TYPE_AHEAD:Lcom/ibotta/android/search/SuggestedSearchMode;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/search/SuggestedSearchMode;->$VALUES:[Lcom/ibotta/android/search/SuggestedSearchMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/search/SuggestedSearchMode;
    .locals 1

    const-class v0, Lcom/ibotta/android/search/SuggestedSearchMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/SuggestedSearchMode;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/search/SuggestedSearchMode;
    .locals 1

    sget-object v0, Lcom/ibotta/android/search/SuggestedSearchMode;->$VALUES:[Lcom/ibotta/android/search/SuggestedSearchMode;

    invoke-virtual {v0}, [Lcom/ibotta/android/search/SuggestedSearchMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/search/SuggestedSearchMode;

    return-object v0
.end method
