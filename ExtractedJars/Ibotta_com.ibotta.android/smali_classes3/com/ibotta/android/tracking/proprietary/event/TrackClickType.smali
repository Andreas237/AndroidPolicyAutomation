.class public final enum Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;
.super Ljava/lang/Enum;
.source "TrackClickType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum ACCOUNT_MENU_ITEM:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum BONUS:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum CTA:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum DEAL:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum ELLIPSES:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum MISSPELLING:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum NOT_FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum OFFER:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum RETAILER:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum SEARCH:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum SHOP:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum TILE:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

.field public static final enum UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;


# instance fields
.field private final apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 7
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "ACCOUNT_MENU_ITEM"

    const-string v2, "Account Menu Item"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->ACCOUNT_MENU_ITEM:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 8
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "RETAILER"

    const-string v2, "Retailer"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 9
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "OFFER"

    const-string v2, "Offer"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 10
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "BONUS"

    const-string v2, "Bonus"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 11
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "UNLOCK"

    const-string v2, "Unlock"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 12
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "SHOP"

    const-string v2, "Shop"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 13
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "TILE"

    const-string v2, "Tile"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 14
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "PRODUCT"

    const-string v2, "Product"

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 15
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "DEAL"

    const-string v2, "Deal"

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->DEAL:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 16
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "ELLIPSES"

    const-string v2, "Ellipses"

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->ELLIPSES:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 17
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "CTA"

    const-string v2, "CTA"

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->CTA:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 18
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "CATEGORY"

    const-string v2, "Category"

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 19
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "SEARCH"

    const-string v2, "Search"

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->SEARCH:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 20
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "MISSPELLING"

    const-string v2, "Misspelling"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->MISSPELLING:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 21
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "FAVORITED"

    const-string v2, "Favorited"

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    .line 22
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const-string v1, "NOT_FAVORITED"

    const-string v2, "Not_favorited"

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->NOT_FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v0, 0x10

    .line 6
    new-array v0, v0, [Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->ACCOUNT_MENU_ITEM:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->DEAL:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->ELLIPSES:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->CTA:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->SEARCH:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->MISSPELLING:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->NOT_FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    invoke-virtual {v0}, [Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->apiName:Ljava/lang/String;

    return-object v0
.end method
