.class public final enum Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
.super Ljava/lang/Enum;
.source "ClickType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum ACCOUNT_MENU_ITEM:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum BONUS:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum CTA:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum DEAL:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum ELLIPSES:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum MISSPELLING:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum NOT_FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum OFFER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum RETAILER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum SEARCH:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum TILE:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field public static final enum UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;


# instance fields
.field private final trackClickType:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 9
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "ACCOUNT_MENU_ITEM"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->ACCOUNT_MENU_ITEM:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->ACCOUNT_MENU_ITEM:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 10
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "OFFER"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 11
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "RETAILER"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 12
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "BONUS"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 13
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "UNLOCK"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 14
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "SHOP"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 15
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "TILE"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 16
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "PRODUCT"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 17
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "DEAL"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->DEAL:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->DEAL:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 18
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "ELLIPSES"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->ELLIPSES:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->ELLIPSES:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 19
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "CTA"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->CTA:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->CTA:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 20
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "CATEGORY"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 21
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "SEARCH"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->SEARCH:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SEARCH:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 22
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "MISSPELLING"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->MISSPELLING:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->MISSPELLING:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 23
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "FAVORITED"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 24
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const-string v1, "NOT_FAVORITED"

    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->NOT_FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;-><init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->NOT_FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const/16 v0, 0x10

    .line 8
    new-array v0, v0, [Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->ACCOUNT_MENU_ITEM:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->DEAL:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->ELLIPSES:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->CTA:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SEARCH:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->MISSPELLING:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->NOT_FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;",
            ")V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->trackClickType:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 44
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
    .locals 1

    .line 8
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
    .locals 1

    .line 8
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v0}, [Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    return-object v0
.end method


# virtual methods
.method public getTrackClickType()Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->trackClickType:Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    return-object v0
.end method
