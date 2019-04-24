.class public final enum Lcom/ibotta/android/ilv/ListType;
.super Ljava/lang/Enum;
.source "IbottaListViewStyleReducer.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/ilv/ListType;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/ibotta/android/ilv/ListType;",
        "",
        "(Ljava/lang/String;I)V",
        "GALLERY",
        "MODULES",
        "SEARCH",
        "OFFER_TAG_SEARCH",
        "VERTICAL",
        "RETAILER_SIDE_SCROLLER",
        "OFFER_SIDE_SCROLLER",
        "SUGGESTED_SEARCH_TERMS",
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
.field private static final synthetic $VALUES:[Lcom/ibotta/android/ilv/ListType;

.field public static final enum GALLERY:Lcom/ibotta/android/ilv/ListType;

.field public static final enum MODULES:Lcom/ibotta/android/ilv/ListType;

.field public static final enum OFFER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

.field public static final enum OFFER_TAG_SEARCH:Lcom/ibotta/android/ilv/ListType;

.field public static final enum RETAILER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

.field public static final enum SEARCH:Lcom/ibotta/android/ilv/ListType;

.field public static final enum SUGGESTED_SEARCH_TERMS:Lcom/ibotta/android/ilv/ListType;

.field public static final enum VERTICAL:Lcom/ibotta/android/ilv/ListType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/ibotta/android/ilv/ListType;

    new-instance v1, Lcom/ibotta/android/ilv/ListType;

    const-string v2, "GALLERY"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/ilv/ListType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/ilv/ListType;->GALLERY:Lcom/ibotta/android/ilv/ListType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/ilv/ListType;

    const-string v2, "MODULES"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/ilv/ListType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/ilv/ListType;->MODULES:Lcom/ibotta/android/ilv/ListType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/ilv/ListType;

    const-string v2, "SEARCH"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/ilv/ListType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/ilv/ListType;->SEARCH:Lcom/ibotta/android/ilv/ListType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/ilv/ListType;

    const-string v2, "OFFER_TAG_SEARCH"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/ilv/ListType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/ilv/ListType;->OFFER_TAG_SEARCH:Lcom/ibotta/android/ilv/ListType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/ilv/ListType;

    const-string v2, "VERTICAL"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/ilv/ListType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/ilv/ListType;->VERTICAL:Lcom/ibotta/android/ilv/ListType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/ilv/ListType;

    const-string v2, "RETAILER_SIDE_SCROLLER"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/ilv/ListType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/ilv/ListType;->RETAILER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/ilv/ListType;

    const-string v2, "OFFER_SIDE_SCROLLER"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/ilv/ListType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/ilv/ListType;->OFFER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/ilv/ListType;

    const-string v2, "SUGGESTED_SEARCH_TERMS"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/ilv/ListType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/ilv/ListType;->SUGGESTED_SEARCH_TERMS:Lcom/ibotta/android/ilv/ListType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/ilv/ListType;->$VALUES:[Lcom/ibotta/android/ilv/ListType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/ilv/ListType;
    .locals 1

    const-class v0, Lcom/ibotta/android/ilv/ListType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/ilv/ListType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/ilv/ListType;
    .locals 1

    sget-object v0, Lcom/ibotta/android/ilv/ListType;->$VALUES:[Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v0}, [Lcom/ibotta/android/ilv/ListType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/ilv/ListType;

    return-object v0
.end method
