.class public final enum Lcom/ibotta/android/windfall/retailer/WindfallRetailer;
.super Ljava/lang/Enum;
.source "WindfallRetailer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/windfall/retailer/WindfallRetailer;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum ACME:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum ALBERTSONS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum BJS_WHOLESALE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum COSTCO:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum CVS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum DUANE_READE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum FRED_MEYER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum FRYS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum GIANT_PA_WV_MD_VA:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum HARRIS_TEETER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum HEB:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum HYVEE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum JEWEL_OSCO:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum KING_SOOPERS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum KROGER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum MEIJER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum MILITARY_COMMISARY:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum PUBLIX:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum SAFEWAY:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum SAMS_CLUB:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum SHAWS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum SHOPRITE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum SMITHS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum SPROUTS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum STAR_MARKET:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum STOP_N_SHOP:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum TARGET:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum WALGREENS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum WALMART:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum WALMART_QR:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum WEGMANS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum WHOLE_FOODS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum WINCO:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

.field public static final enum WINN_DIXIE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;


# instance fields
.field private final ibottaRetailerId:I

.field private final windfallRetailer:Lcom/microblink/Retailer;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 12
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "ACME"

    sget-object v2, Lcom/microblink/Retailer;->ACME:Lcom/microblink/Retailer;

    const/4 v3, 0x0

    const/16 v4, 0xd5

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->ACME:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 13
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "ALBERTSONS"

    sget-object v2, Lcom/microblink/Retailer;->ALBERTSONS:Lcom/microblink/Retailer;

    const/4 v3, 0x1

    const/16 v4, 0xd4

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->ALBERTSONS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 15
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "BJS_WHOLESALE"

    sget-object v2, Lcom/microblink/Retailer;->BJS_WHOLESALE:Lcom/microblink/Retailer;

    const/4 v4, 0x2

    const/16 v5, 0xc1

    invoke-direct {v0, v1, v4, v5, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->BJS_WHOLESALE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 17
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "COSTCO"

    sget-object v2, Lcom/microblink/Retailer;->COSTCO:Lcom/microblink/Retailer;

    const/4 v5, 0x3

    const/16 v6, 0x2e

    invoke-direct {v0, v1, v5, v6, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->COSTCO:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 18
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "CVS"

    sget-object v2, Lcom/microblink/Retailer;->CVS:Lcom/microblink/Retailer;

    const/16 v6, 0xa

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v6, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->CVS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 20
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "DUANE_READE"

    sget-object v2, Lcom/microblink/Retailer;->DUANE_READE:Lcom/microblink/Retailer;

    const/4 v8, 0x6

    const/4 v9, 0x5

    invoke-direct {v0, v1, v9, v8, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->DUANE_READE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 22
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "FRED_MEYER"

    sget-object v2, Lcom/microblink/Retailer;->FRED_MEYER:Lcom/microblink/Retailer;

    const/16 v10, 0xd

    invoke-direct {v0, v1, v8, v10, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->FRED_MEYER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 23
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "FRYS"

    sget-object v2, Lcom/microblink/Retailer;->FRYS:Lcom/microblink/Retailer;

    const/16 v11, 0x10

    const/4 v12, 0x7

    invoke-direct {v0, v1, v12, v11, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->FRYS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 25
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "GIANT_PA_WV_MD_VA"

    sget-object v2, Lcom/microblink/Retailer;->GIANT:Lcom/microblink/Retailer;

    const/16 v13, 0x8

    const/16 v14, 0x86

    invoke-direct {v0, v1, v13, v14, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->GIANT_PA_WV_MD_VA:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 26
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "HARRIS_TEETER"

    sget-object v2, Lcom/microblink/Retailer;->HARRIS_TEETER:Lcom/microblink/Retailer;

    const/16 v13, 0x1d

    const/16 v14, 0x9

    invoke-direct {v0, v1, v14, v13, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->HARRIS_TEETER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 27
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "HEB"

    sget-object v2, Lcom/microblink/Retailer;->HEB:Lcom/microblink/Retailer;

    const/16 v15, 0x19

    invoke-direct {v0, v1, v6, v15, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->HEB:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 28
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "HYVEE"

    sget-object v2, Lcom/microblink/Retailer;->HYVEE:Lcom/microblink/Retailer;

    const/16 v6, 0x1e

    const/16 v8, 0xb

    invoke-direct {v0, v1, v8, v6, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->HYVEE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 30
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "JEWEL_OSCO"

    sget-object v2, Lcom/microblink/Retailer;->JEWEL_OSCO:Lcom/microblink/Retailer;

    const/16 v8, 0xc

    const/16 v6, 0xd6

    invoke-direct {v0, v1, v8, v6, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->JEWEL_OSCO:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 31
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "KING_SOOPERS"

    sget-object v2, Lcom/microblink/Retailer;->KING_SOOPERS:Lcom/microblink/Retailer;

    invoke-direct {v0, v1, v10, v3, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->KING_SOOPERS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 32
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "KROGER"

    sget-object v2, Lcom/microblink/Retailer;->KROGER:Lcom/microblink/Retailer;

    const/16 v6, 0xe

    invoke-direct {v0, v1, v6, v12, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->KROGER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 33
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "MEIJER"

    sget-object v2, Lcom/microblink/Retailer;->MEIJER:Lcom/microblink/Retailer;

    const/16 v6, 0xf

    const/16 v8, 0x13

    invoke-direct {v0, v1, v6, v8, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->MEIJER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 34
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "MILITARY_COMMISARY"

    sget-object v2, Lcom/microblink/Retailer;->MILITARY_COMMISSARY:Lcom/microblink/Retailer;

    const/16 v8, 0x20

    invoke-direct {v0, v1, v11, v8, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->MILITARY_COMMISARY:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 37
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "PUBLIX"

    sget-object v2, Lcom/microblink/Retailer;->PUBLIX:Lcom/microblink/Retailer;

    const/16 v8, 0x11

    invoke-direct {v0, v1, v8, v14, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->PUBLIX:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 41
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "SAFEWAY"

    sget-object v2, Lcom/microblink/Retailer;->SAFEWAY:Lcom/microblink/Retailer;

    const/16 v8, 0x12

    invoke-direct {v0, v1, v8, v4, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SAFEWAY:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 42
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "SAMS_CLUB"

    sget-object v2, Lcom/microblink/Retailer;->SAMS_CLUB:Lcom/microblink/Retailer;

    const/16 v8, 0x13

    const/16 v11, 0x2f

    invoke-direct {v0, v1, v8, v11, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SAMS_CLUB:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 43
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "SHAWS"

    sget-object v2, Lcom/microblink/Retailer;->SHAWS:Lcom/microblink/Retailer;

    const/16 v8, 0x14

    const/16 v11, 0xd7

    invoke-direct {v0, v1, v8, v11, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SHAWS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 44
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "SHOPRITE"

    sget-object v2, Lcom/microblink/Retailer;->SHOPRITE:Lcom/microblink/Retailer;

    const/16 v8, 0x15

    const/16 v11, 0x18

    invoke-direct {v0, v1, v8, v11, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SHOPRITE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 45
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "SMITHS"

    sget-object v2, Lcom/microblink/Retailer;->SMITHS:Lcom/microblink/Retailer;

    const/16 v8, 0x16

    invoke-direct {v0, v1, v8, v6, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SMITHS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 46
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "SPROUTS"

    sget-object v2, Lcom/microblink/Retailer;->SPROUTS:Lcom/microblink/Retailer;

    const/16 v8, 0x17

    const/16 v11, 0x63

    invoke-direct {v0, v1, v8, v11, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SPROUTS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 47
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "STAR_MARKET"

    sget-object v2, Lcom/microblink/Retailer;->STAR_MARKET:Lcom/microblink/Retailer;

    const/16 v8, 0x18

    const/16 v11, 0xd8

    invoke-direct {v0, v1, v8, v11, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->STAR_MARKET:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 48
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "STOP_N_SHOP"

    sget-object v2, Lcom/microblink/Retailer;->STOP_N_SHOP:Lcom/microblink/Retailer;

    const/16 v8, 0x17

    invoke-direct {v0, v1, v15, v8, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->STOP_N_SHOP:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 49
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "TARGET"

    sget-object v2, Lcom/microblink/Retailer;->TARGET:Lcom/microblink/Retailer;

    const/16 v8, 0x1a

    invoke-direct {v0, v1, v8, v5, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->TARGET:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 50
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "WALGREENS"

    sget-object v2, Lcom/microblink/Retailer;->WALGREENS:Lcom/microblink/Retailer;

    const/16 v8, 0x1b

    invoke-direct {v0, v1, v8, v9, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WALGREENS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 51
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "WALMART"

    sget-object v2, Lcom/microblink/Retailer;->WALMART:Lcom/microblink/Retailer;

    const/16 v8, 0x1c

    invoke-direct {v0, v1, v8, v7, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WALMART:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 52
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "WALMART_QR"

    sget-object v2, Lcom/microblink/Retailer;->WALMART_QR:Lcom/microblink/Retailer;

    invoke-direct {v0, v1, v13, v7, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WALMART_QR:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 53
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "WEGMANS"

    sget-object v2, Lcom/microblink/Retailer;->WEGMANS:Lcom/microblink/Retailer;

    const/16 v8, 0x2b

    const/16 v11, 0x1e

    invoke-direct {v0, v1, v11, v8, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WEGMANS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 54
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "WHOLE_FOODS"

    sget-object v2, Lcom/microblink/Retailer;->WHOLE_FOODS:Lcom/microblink/Retailer;

    const/16 v8, 0x1f

    const/16 v11, 0x30

    invoke-direct {v0, v1, v8, v11, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WHOLE_FOODS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 55
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "WINCO"

    sget-object v2, Lcom/microblink/Retailer;->WINCO:Lcom/microblink/Retailer;

    const/16 v8, 0x20

    const/16 v11, 0x27

    invoke-direct {v0, v1, v8, v11, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WINCO:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    .line 56
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const-string v1, "WINN_DIXIE"

    sget-object v2, Lcom/microblink/Retailer;->WINNDIXIE:Lcom/microblink/Retailer;

    const/16 v8, 0x21

    const/16 v11, 0x28

    invoke-direct {v0, v1, v8, v11, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;-><init>(Ljava/lang/String;IILcom/microblink/Retailer;)V

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WINN_DIXIE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v0, 0x22

    .line 10
    new-array v0, v0, [Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->ACME:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->ALBERTSONS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->BJS_WHOLESALE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->COSTCO:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->CVS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->DUANE_READE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->FRED_MEYER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->FRYS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->GIANT_PA_WV_MD_VA:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->HARRIS_TEETER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->HEB:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->HYVEE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->JEWEL_OSCO:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->KING_SOOPERS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->KROGER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->MEIJER:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->MILITARY_COMMISARY:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->PUBLIX:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SAFEWAY:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SAMS_CLUB:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SHAWS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SHOPRITE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SMITHS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->SPROUTS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->STAR_MARKET:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->STOP_N_SHOP:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v15

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->TARGET:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WALGREENS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WALMART:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WALMART_QR:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WEGMANS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WHOLE_FOODS:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WINCO:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WINN_DIXIE:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->$VALUES:[Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILcom/microblink/Retailer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/microblink/Retailer;",
            ")V"
        }
    .end annotation

    .line 61
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 62
    iput p3, p0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->ibottaRetailerId:I

    .line 63
    iput-object p4, p0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->windfallRetailer:Lcom/microblink/Retailer;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/windfall/retailer/WindfallRetailer;
    .locals 1

    .line 10
    const-class v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/windfall/retailer/WindfallRetailer;
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->$VALUES:[Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    invoke-virtual {v0}, [Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    return-object v0
.end method


# virtual methods
.method public getIbottaRetailerId()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->ibottaRetailerId:I

    return v0
.end method

.method public getWindfallRetailer()Lcom/microblink/Retailer;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->windfallRetailer:Lcom/microblink/Retailer;

    return-object v0
.end method
