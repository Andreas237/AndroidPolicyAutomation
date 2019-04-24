.class public final enum Lcom/ibotta/android/search/SearchAction;
.super Ljava/lang/Enum;
.source "SearchReducer.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/search/SearchAction;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ibotta/android/search/SearchAction;",
        "",
        "(Ljava/lang/String;I)V",
        "INIT_SEARCH",
        "EXIT_SEARCH",
        "FOCUS_SEARCH",
        "CLEAR_SEARCH",
        "SEARCH",
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
.field private static final synthetic $VALUES:[Lcom/ibotta/android/search/SearchAction;

.field public static final enum CLEAR_SEARCH:Lcom/ibotta/android/search/SearchAction;

.field public static final enum EXIT_SEARCH:Lcom/ibotta/android/search/SearchAction;

.field public static final enum FOCUS_SEARCH:Lcom/ibotta/android/search/SearchAction;

.field public static final enum INIT_SEARCH:Lcom/ibotta/android/search/SearchAction;

.field public static final enum SEARCH:Lcom/ibotta/android/search/SearchAction;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/ibotta/android/search/SearchAction;

    new-instance v1, Lcom/ibotta/android/search/SearchAction;

    const-string v2, "INIT_SEARCH"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/search/SearchAction;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/search/SearchAction;->INIT_SEARCH:Lcom/ibotta/android/search/SearchAction;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/search/SearchAction;

    const-string v2, "EXIT_SEARCH"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/search/SearchAction;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/search/SearchAction;->EXIT_SEARCH:Lcom/ibotta/android/search/SearchAction;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/search/SearchAction;

    const-string v2, "FOCUS_SEARCH"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/search/SearchAction;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/search/SearchAction;->FOCUS_SEARCH:Lcom/ibotta/android/search/SearchAction;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/search/SearchAction;

    const-string v2, "CLEAR_SEARCH"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/search/SearchAction;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/search/SearchAction;->CLEAR_SEARCH:Lcom/ibotta/android/search/SearchAction;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/search/SearchAction;

    const-string v2, "SEARCH"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/search/SearchAction;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/search/SearchAction;->SEARCH:Lcom/ibotta/android/search/SearchAction;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/search/SearchAction;->$VALUES:[Lcom/ibotta/android/search/SearchAction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/search/SearchAction;
    .locals 1

    const-class v0, Lcom/ibotta/android/search/SearchAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/SearchAction;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/search/SearchAction;
    .locals 1

    sget-object v0, Lcom/ibotta/android/search/SearchAction;->$VALUES:[Lcom/ibotta/android/search/SearchAction;

    invoke-virtual {v0}, [Lcom/ibotta/android/search/SearchAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/search/SearchAction;

    return-object v0
.end method
