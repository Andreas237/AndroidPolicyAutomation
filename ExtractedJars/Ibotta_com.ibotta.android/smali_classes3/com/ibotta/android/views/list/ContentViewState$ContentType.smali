.class public final enum Lcom/ibotta/android/views/list/ContentViewState$ContentType;
.super Ljava/lang/Enum;
.source "ContentViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/list/ContentViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ContentType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0013\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "",
        "(Ljava/lang/String;I)V",
        "LOADING",
        "INFO_ROW",
        "TITLE",
        "CONTENT_ROW",
        "CONTENT_CARD",
        "NO_RESULTS",
        "HORIZONTAL_LIST",
        "RETAILER_CARD",
        "BANNER",
        "WALLET_ROW",
        "PAYMENT_METHOD_ROW_HOME",
        "PAYMENT_METHOD_ROW_WALLET",
        "PWI_RETAILER",
        "REDEEM_RETAILERS",
        "SEARCH_SUGGESTION",
        "SUGGESTION_TITLE",
        "DECORATOR",
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
.field private static final synthetic $VALUES:[Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum BANNER:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum CONTENT_CARD:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum CONTENT_ROW:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum DECORATOR:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum HORIZONTAL_LIST:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum INFO_ROW:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum LOADING:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum NO_RESULTS:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum PAYMENT_METHOD_ROW_HOME:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum PAYMENT_METHOD_ROW_WALLET:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum PWI_RETAILER:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum REDEEM_RETAILERS:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum RETAILER_CARD:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum SEARCH_SUGGESTION:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum SUGGESTION_TITLE:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum TITLE:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

.field public static final enum WALLET_ROW:Lcom/ibotta/android/views/list/ContentViewState$ContentType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x11

    new-array v0, v0, [Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "LOADING"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->LOADING:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "INFO_ROW"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->INFO_ROW:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "TITLE"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->TITLE:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "CONTENT_ROW"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->CONTENT_ROW:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "CONTENT_CARD"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->CONTENT_CARD:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "NO_RESULTS"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->NO_RESULTS:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "HORIZONTAL_LIST"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->HORIZONTAL_LIST:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "RETAILER_CARD"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->RETAILER_CARD:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "BANNER"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->BANNER:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "WALLET_ROW"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->WALLET_ROW:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "PAYMENT_METHOD_ROW_HOME"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->PAYMENT_METHOD_ROW_HOME:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "PAYMENT_METHOD_ROW_WALLET"

    const/16 v3, 0xb

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->PAYMENT_METHOD_ROW_WALLET:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "PWI_RETAILER"

    const/16 v3, 0xc

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->PWI_RETAILER:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "REDEEM_RETAILERS"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->REDEEM_RETAILERS:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "SEARCH_SUGGESTION"

    const/16 v3, 0xe

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->SEARCH_SUGGESTION:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "SUGGESTION_TITLE"

    const/16 v3, 0xf

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->SUGGESTION_TITLE:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    new-instance v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const-string v2, "DECORATOR"

    const/16 v3, 0x10

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->DECORATOR:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->$VALUES:[Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .locals 1

    const-class v0, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->$VALUES:[Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    invoke-virtual {v0}, [Lcom/ibotta/android/views/list/ContentViewState$ContentType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    return-object v0
.end method
