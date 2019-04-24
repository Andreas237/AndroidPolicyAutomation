.class public final enum Lcom/microblink/Retailer;
.super Ljava/lang/Enum;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/Retailer;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/Retailer;

.field public static final enum ACME:Lcom/microblink/Retailer;

.field public static final enum ALBERTSONS:Lcom/microblink/Retailer;

.field public static final enum ALBERTSONS_1:Lcom/microblink/Retailer;

.field public static final enum ALBERTSONS_2:Lcom/microblink/Retailer;

.field public static final enum ALBERTSONS_3:Lcom/microblink/Retailer;

.field public static final enum AMAZON:Lcom/microblink/Retailer;

.field public static final enum BABIES_R_US:Lcom/microblink/Retailer;

.field public static final enum BED_BATH:Lcom/microblink/Retailer;

.field public static final enum BESTBUY:Lcom/microblink/Retailer;

.field public static final enum BJS_WHOLESALE:Lcom/microblink/Retailer;

.field public static final enum COSTCO:Lcom/microblink/Retailer;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/Retailer;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum CVS:Lcom/microblink/Retailer;

.field public static final enum DUANE_READE:Lcom/microblink/Retailer;

.field public static final enum FAMILY_DOLLAR:Lcom/microblink/Retailer;

.field public static final enum FRED_MEYER:Lcom/microblink/Retailer;

.field public static final enum FRYS:Lcom/microblink/Retailer;

.field public static final enum GIANT:Lcom/microblink/Retailer;

.field public static final enum HARRIS_TEETER:Lcom/microblink/Retailer;

.field public static final enum HEB:Lcom/microblink/Retailer;

.field public static final enum HOME_DEPOT:Lcom/microblink/Retailer;

.field public static final enum HYVEE:Lcom/microblink/Retailer;

.field public static final enum JEWEL_OSCO:Lcom/microblink/Retailer;

.field public static final enum KING_SOOPERS:Lcom/microblink/Retailer;

.field public static final enum KMART:Lcom/microblink/Retailer;

.field public static final enum KOHLS:Lcom/microblink/Retailer;

.field public static final enum KROGER:Lcom/microblink/Retailer;

.field public static final enum LOWES:Lcom/microblink/Retailer;

.field public static final enum MACYS:Lcom/microblink/Retailer;

.field public static final enum MARSHALLS:Lcom/microblink/Retailer;

.field public static final enum MEIJER:Lcom/microblink/Retailer;

.field public static final enum MILITARY_COMMISSARY:Lcom/microblink/Retailer;

.field public static final enum OFFICE_DEPOT:Lcom/microblink/Retailer;

.field public static final enum OFFICE_MAX:Lcom/microblink/Retailer;

.field public static final enum PETCO:Lcom/microblink/Retailer;

.field public static final enum PETSMART:Lcom/microblink/Retailer;

.field public static final enum PUBLIX:Lcom/microblink/Retailer;

.field public static final enum SAFEWAY:Lcom/microblink/Retailer;

.field public static final enum SAFEWAY_1:Lcom/microblink/Retailer;

.field public static final enum SAFEWAY_2:Lcom/microblink/Retailer;

.field public static final enum SAMS_CLUB:Lcom/microblink/Retailer;

.field public static final enum SEARS:Lcom/microblink/Retailer;

.field public static final enum SHAWS:Lcom/microblink/Retailer;

.field public static final enum SHOPRITE:Lcom/microblink/Retailer;

.field public static final enum SMITHS:Lcom/microblink/Retailer;

.field public static final enum SPROUTS:Lcom/microblink/Retailer;

.field public static final enum STAPES:Lcom/microblink/Retailer;

.field public static final enum STAR_MARKET:Lcom/microblink/Retailer;

.field public static final enum STOP_N_SHOP:Lcom/microblink/Retailer;

.field public static final enum TARGET:Lcom/microblink/Retailer;

.field public static final enum TOYS_R_US:Lcom/microblink/Retailer;

.field public static final enum TRADER_JOES:Lcom/microblink/Retailer;

.field public static final enum UNKNOWN:Lcom/microblink/Retailer;

.field public static final enum WALGREENS:Lcom/microblink/Retailer;

.field public static final enum WALMART:Lcom/microblink/Retailer;

.field public static final enum WALMART_QR:Lcom/microblink/Retailer;

.field public static final enum WEGMANS:Lcom/microblink/Retailer;

.field public static final enum WHOLE_FOODS:Lcom/microblink/Retailer;

.field public static final enum WINCO:Lcom/microblink/Retailer;

.field public static final enum WINNDIXIE:Lcom/microblink/Retailer;


# instance fields
.field private final bannerId:I

.field private retailerId:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "ACME"

    const/4 v2, 0x0

    const/16 v3, 0x74

    const/16 v4, 0x11

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->ACME:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "ALBERTSONS"

    const/4 v3, 0x1

    const/16 v4, 0x14

    const/16 v5, 0x66

    invoke-direct {v0, v1, v3, v5, v4}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->ALBERTSONS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "ALBERTSONS_1"

    const/4 v5, 0x2

    const/16 v6, 0x84

    invoke-direct {v0, v1, v5, v6, v4}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->ALBERTSONS_1:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "ALBERTSONS_2"

    const/4 v6, 0x3

    const/16 v7, 0x85

    invoke-direct {v0, v1, v6, v7, v4}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->ALBERTSONS_2:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "ALBERTSONS_3"

    const/4 v7, 0x4

    const/16 v8, 0x86

    invoke-direct {v0, v1, v7, v8, v4}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->ALBERTSONS_3:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "AMAZON"

    const/4 v7, 0x5

    const/16 v8, 0x21c3

    invoke-direct {v0, v1, v7, v3, v8}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->AMAZON:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "BABIES_R_US"

    const/16 v7, 0x1b

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8, v7, v7}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->BABIES_R_US:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "BED_BATH"

    const/4 v8, 0x7

    const/16 v9, 0xc8

    invoke-direct {v0, v1, v8, v5, v9}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->BED_BATH:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "BESTBUY"

    const/16 v8, 0x8

    const/16 v9, 0x12c

    invoke-direct {v0, v1, v8, v6, v9}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->BESTBUY:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "BJS_WHOLESALE"

    const/16 v9, 0x9

    const/16 v10, 0x64

    const/16 v11, 0x2d

    invoke-direct {v0, v1, v9, v10, v11}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->BJS_WHOLESALE:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "COSTCO"

    const/16 v9, 0xa

    const/16 v10, 0x1d

    invoke-direct {v0, v1, v9, v10, v5}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->COSTCO:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "CVS"

    const/16 v10, 0xb

    const/16 v11, 0x67

    invoke-direct {v0, v1, v10, v11, v6}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->CVS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "DUANE_READE"

    const/16 v11, 0x12

    const/16 v12, 0xc

    const/16 v13, 0x65

    invoke-direct {v0, v1, v12, v13, v11}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->DUANE_READE:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "FAMILY_DOLLAR"

    const/16 v13, 0xd

    const/16 v14, 0x6b

    const/16 v15, 0x6b

    invoke-direct {v0, v1, v13, v14, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->FAMILY_DOLLAR:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "FRED_MEYER"

    const/16 v13, 0xe

    const/16 v14, 0x6c

    const/16 v15, 0x35

    invoke-direct {v0, v1, v13, v14, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->FRED_MEYER:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "FRYS"

    const/16 v13, 0xf

    const/16 v14, 0x81

    const/16 v15, 0x3c

    invoke-direct {v0, v1, v13, v14, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->FRYS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "GIANT"

    const/16 v14, 0x10

    const/16 v15, 0x80

    const/16 v6, 0x3a

    invoke-direct {v0, v1, v14, v15, v6}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->GIANT:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "HARRIS_TEETER"

    const/16 v6, 0x11

    const/16 v14, 0x7b

    const/16 v15, 0x21

    invoke-direct {v0, v1, v6, v14, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->HARRIS_TEETER:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "HEB"

    const/16 v6, 0x75

    const/16 v14, 0x2c

    invoke-direct {v0, v1, v11, v6, v14}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->HEB:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "HOME_DEPOT"

    const/16 v6, 0x16

    const/16 v14, 0x13

    const/16 v15, 0xdc

    invoke-direct {v0, v1, v14, v6, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->HOME_DEPOT:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "HYVEE"

    const/16 v14, 0x7d

    const/16 v15, 0x38

    invoke-direct {v0, v1, v4, v14, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->HYVEE:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "JEWEL_OSCO"

    const/16 v14, 0x17

    const/16 v15, 0x15

    const/16 v5, 0x73

    invoke-direct {v0, v1, v15, v5, v14}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->JEWEL_OSCO:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "KING_SOOPERS"

    const/16 v5, 0x94

    const/16 v15, 0x24

    invoke-direct {v0, v1, v6, v5, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->KING_SOOPERS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "KMART"

    const/16 v5, 0x64

    invoke-direct {v0, v1, v14, v9, v5}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->KMART:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "KOHLS"

    const/16 v5, 0x18

    const/16 v15, 0x6e

    invoke-direct {v0, v1, v5, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->KOHLS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "KROGER"

    const/16 v5, 0x19

    const/16 v15, 0x6f

    const/4 v2, 0x6

    invoke-direct {v0, v1, v5, v15, v2}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->KROGER:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "LOWES"

    const/16 v2, 0x1a

    const/16 v15, 0x1c

    const/16 v10, 0x1c

    invoke-direct {v0, v1, v2, v15, v10}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->LOWES:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "MACYS"

    invoke-direct {v0, v1, v7, v12, v12}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->MACYS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "MARSHALLS"

    const/16 v2, 0x1c

    const/16 v10, 0x6d

    const/16 v15, 0x6d

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->MARSHALLS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "MEIJER"

    const/16 v2, 0x1d

    const/16 v10, 0x70

    const/16 v15, 0x13

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->MEIJER:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "MILITARY_COMMISSARY"

    const/16 v2, 0x1e

    const/16 v10, 0x7c

    const/16 v15, 0x30

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->MILITARY_COMMISSARY:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "OFFICE_DEPOT"

    const/16 v2, 0x1f

    const/16 v10, 0x1f

    const/16 v15, 0x1f

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->OFFICE_DEPOT:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "OFFICE_MAX"

    const/16 v2, 0x20

    invoke-direct {v0, v1, v2, v13, v13}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->OFFICE_MAX:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "PETCO"

    const/16 v2, 0x21

    const/16 v10, 0x6a

    const/16 v15, 0x6a

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->PETCO:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "PETSMART"

    const/16 v2, 0x22

    const/16 v10, 0x69

    const/16 v15, 0x69

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->PETSMART:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "PUBLIX"

    const/16 v2, 0x23

    const/16 v10, 0x76

    const/4 v15, 0x7

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->PUBLIX:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "SAFEWAY"

    const/16 v2, 0x24

    const/16 v10, 0x77

    invoke-direct {v0, v1, v2, v10, v8}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->SAFEWAY:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "SAFEWAY_1"

    const/16 v2, 0x25

    const/16 v10, 0x87

    invoke-direct {v0, v1, v2, v10, v8}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->SAFEWAY_1:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "SAFEWAY_2"

    const/16 v2, 0x26

    const/16 v10, 0x88

    invoke-direct {v0, v1, v2, v10, v8}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->SAFEWAY_2:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "SAMS_CLUB"

    const/16 v2, 0x27

    const/16 v10, 0x63

    invoke-direct {v0, v1, v2, v10, v8}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->SAMS_CLUB:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "SHAWS"

    const/16 v2, 0x28

    const/16 v10, 0x71

    const/16 v15, 0x1a

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->SHAWS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "SEARS"

    const/16 v2, 0x29

    const/16 v10, 0xb4

    invoke-direct {v0, v1, v2, v11, v10}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->SEARS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "SHOPRITE"

    const/16 v2, 0x2a

    const/16 v10, 0x78

    invoke-direct {v0, v1, v2, v10, v6}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->SHOPRITE:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "SMITHS"

    const/16 v2, 0x2b

    const/16 v10, 0x82

    const/16 v15, 0x2a

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->SMITHS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "SPROUTS"

    const/16 v2, 0x2c

    const/16 v10, 0x7f

    const/16 v15, 0x36

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->SPROUTS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "STAPES"

    const/16 v2, 0x2d

    invoke-direct {v0, v1, v2, v4, v4}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->STAPES:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "STAR_MARKET"

    const/16 v2, 0x2e

    const/16 v10, 0x72

    invoke-direct {v0, v1, v2, v10, v5}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->STAR_MARKET:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "STOP_N_SHOP"

    const/16 v2, 0x2f

    const/16 v10, 0x79

    const/16 v15, 0x2e

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->STOP_N_SHOP:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "TARGET"

    const/16 v2, 0x30

    const/16 v10, 0x15

    invoke-direct {v0, v1, v2, v10, v3}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->TARGET:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "TOYS_R_US"

    const/16 v2, 0x31

    invoke-direct {v0, v1, v2, v14, v14}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->TOYS_R_US:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "TRADER_JOES"

    const/16 v2, 0x32

    const/16 v10, 0x68

    const/16 v15, 0x68

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->TRADER_JOES:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "WALGREENS"

    const/16 v2, 0x33

    const/16 v10, 0x18

    invoke-direct {v0, v1, v2, v10, v9}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->WALGREENS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "WALMART"

    const/16 v2, 0x34

    const/16 v10, 0xb

    invoke-direct {v0, v1, v2, v5, v10}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->WALMART:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "WINCO"

    const/16 v2, 0x35

    const/16 v10, 0x6e

    const/16 v15, 0x33

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->WINCO:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "WINNDIXIE"

    const/16 v2, 0x36

    const/16 v10, 0x7a

    const/16 v15, 0x2f

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->WINNDIXIE:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "WEGMANS"

    const/16 v2, 0x37

    const/16 v10, 0x7e

    const/16 v15, 0x34

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->WEGMANS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "WHOLE_FOODS"

    const/16 v2, 0x38

    const/16 v10, 0x83

    const/16 v15, 0x37

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->WHOLE_FOODS:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "WALMART_QR"

    const/16 v2, 0x39

    const/16 v10, 0x95

    const/16 v15, 0xb

    invoke-direct {v0, v1, v2, v10, v15}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->WALMART_QR:Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer;

    const-string v1, "UNKNOWN"

    const/16 v2, 0x3a

    const/4 v10, 0x0

    invoke-direct {v0, v1, v2, v10, v10}, Lcom/microblink/Retailer;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    const/16 v0, 0x3b

    new-array v0, v0, [Lcom/microblink/Retailer;

    sget-object v1, Lcom/microblink/Retailer;->ACME:Lcom/microblink/Retailer;

    aput-object v1, v0, v10

    sget-object v1, Lcom/microblink/Retailer;->ALBERTSONS:Lcom/microblink/Retailer;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/Retailer;->ALBERTSONS_1:Lcom/microblink/Retailer;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->ALBERTSONS_2:Lcom/microblink/Retailer;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->ALBERTSONS_3:Lcom/microblink/Retailer;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->AMAZON:Lcom/microblink/Retailer;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->BABIES_R_US:Lcom/microblink/Retailer;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->BED_BATH:Lcom/microblink/Retailer;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->BESTBUY:Lcom/microblink/Retailer;

    aput-object v1, v0, v8

    sget-object v1, Lcom/microblink/Retailer;->BJS_WHOLESALE:Lcom/microblink/Retailer;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->COSTCO:Lcom/microblink/Retailer;

    aput-object v1, v0, v9

    sget-object v1, Lcom/microblink/Retailer;->CVS:Lcom/microblink/Retailer;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->DUANE_READE:Lcom/microblink/Retailer;

    aput-object v1, v0, v12

    sget-object v1, Lcom/microblink/Retailer;->FAMILY_DOLLAR:Lcom/microblink/Retailer;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->FRED_MEYER:Lcom/microblink/Retailer;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->FRYS:Lcom/microblink/Retailer;

    aput-object v1, v0, v13

    sget-object v1, Lcom/microblink/Retailer;->GIANT:Lcom/microblink/Retailer;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->HARRIS_TEETER:Lcom/microblink/Retailer;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->HEB:Lcom/microblink/Retailer;

    aput-object v1, v0, v11

    sget-object v1, Lcom/microblink/Retailer;->HOME_DEPOT:Lcom/microblink/Retailer;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->HYVEE:Lcom/microblink/Retailer;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/Retailer;->JEWEL_OSCO:Lcom/microblink/Retailer;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->KING_SOOPERS:Lcom/microblink/Retailer;

    aput-object v1, v0, v6

    sget-object v1, Lcom/microblink/Retailer;->KMART:Lcom/microblink/Retailer;

    aput-object v1, v0, v14

    sget-object v1, Lcom/microblink/Retailer;->KOHLS:Lcom/microblink/Retailer;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->KROGER:Lcom/microblink/Retailer;

    aput-object v1, v0, v5

    sget-object v1, Lcom/microblink/Retailer;->LOWES:Lcom/microblink/Retailer;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->MACYS:Lcom/microblink/Retailer;

    aput-object v1, v0, v7

    sget-object v1, Lcom/microblink/Retailer;->MARSHALLS:Lcom/microblink/Retailer;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->MEIJER:Lcom/microblink/Retailer;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->MILITARY_COMMISSARY:Lcom/microblink/Retailer;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->OFFICE_DEPOT:Lcom/microblink/Retailer;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->OFFICE_MAX:Lcom/microblink/Retailer;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->PETCO:Lcom/microblink/Retailer;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->PETSMART:Lcom/microblink/Retailer;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->PUBLIX:Lcom/microblink/Retailer;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->SAFEWAY:Lcom/microblink/Retailer;

    const/16 v2, 0x24

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->SAFEWAY_1:Lcom/microblink/Retailer;

    const/16 v2, 0x25

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->SAFEWAY_2:Lcom/microblink/Retailer;

    const/16 v2, 0x26

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->SAMS_CLUB:Lcom/microblink/Retailer;

    const/16 v2, 0x27

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->SHAWS:Lcom/microblink/Retailer;

    const/16 v2, 0x28

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->SEARS:Lcom/microblink/Retailer;

    const/16 v2, 0x29

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->SHOPRITE:Lcom/microblink/Retailer;

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->SMITHS:Lcom/microblink/Retailer;

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->SPROUTS:Lcom/microblink/Retailer;

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->STAPES:Lcom/microblink/Retailer;

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->STAR_MARKET:Lcom/microblink/Retailer;

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->STOP_N_SHOP:Lcom/microblink/Retailer;

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->TARGET:Lcom/microblink/Retailer;

    const/16 v2, 0x30

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->TOYS_R_US:Lcom/microblink/Retailer;

    const/16 v2, 0x31

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->TRADER_JOES:Lcom/microblink/Retailer;

    const/16 v2, 0x32

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->WALGREENS:Lcom/microblink/Retailer;

    const/16 v2, 0x33

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->WALMART:Lcom/microblink/Retailer;

    const/16 v2, 0x34

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->WINCO:Lcom/microblink/Retailer;

    const/16 v2, 0x35

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->WINNDIXIE:Lcom/microblink/Retailer;

    const/16 v2, 0x36

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->WEGMANS:Lcom/microblink/Retailer;

    const/16 v2, 0x37

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->WHOLE_FOODS:Lcom/microblink/Retailer;

    const/16 v2, 0x38

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->WALMART_QR:Lcom/microblink/Retailer;

    const/16 v2, 0x39

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    sput-object v0, Lcom/microblink/Retailer;->$VALUES:[Lcom/microblink/Retailer;

    new-instance v0, Lcom/microblink/Retailer$1;

    invoke-direct {v0}, Lcom/microblink/Retailer$1;-><init>()V

    sput-object v0, Lcom/microblink/Retailer;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/microblink/Retailer;->retailerId:I

    iput p4, p0, Lcom/microblink/Retailer;->bannerId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/Retailer;
    .locals 1

    const-class v0, Lcom/microblink/Retailer;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/Retailer;

    return-object p0
.end method

.method public static values()[Lcom/microblink/Retailer;
    .locals 1

    sget-object v0, Lcom/microblink/Retailer;->$VALUES:[Lcom/microblink/Retailer;

    invoke-virtual {v0}, [Lcom/microblink/Retailer;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/Retailer;

    return-object v0
.end method


# virtual methods
.method public final bannerId()I
    .locals 1

    iget v0, p0, Lcom/microblink/Retailer;->bannerId:I

    return v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final id()I
    .locals 1

    iget v0, p0, Lcom/microblink/Retailer;->retailerId:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p0}, Lcom/microblink/Retailer;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
