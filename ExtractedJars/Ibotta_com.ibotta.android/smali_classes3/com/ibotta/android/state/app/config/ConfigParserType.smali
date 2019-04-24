.class public abstract enum Lcom/ibotta/android/state/app/config/ConfigParserType;
.super Ljava/lang/Enum;
.source "ConfigParserType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/state/app/config/ConfigParserType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum CACHE_OVERRIDES:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum CATEGORY_SETTINGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum DEVICE_AUTHENTICATION:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum EXPIRING_BANNER_VARIANTS:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum FAVORITE_RETAILER_SETTINGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum FEATURE_FLAGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum FEATURE_OPS_KILL_SWITCH:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum FLOAT:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum GALLERY_WHATS_HOT:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum GALLERY_WHATS_NEW:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum GREETING_SCHEDULE:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum INTEGER_LIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum INVITE_FRIENDS_COPY:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum LONG:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum MVT_WINNERS:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum OCR_DEVICE_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum OS_DEPRECATION:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum PARTNER_APP_TRACKING:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum PAYPAL:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum PICTURE_SIZE_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum QUESTS_HEADER_INFO:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum RECEIPT_FOCUS_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum SEMVER_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum STORE_SELECTOR_REQS:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum STORE_SELECTOR_V5_REQS:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum STRING:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum TRACKING:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum TRACKING_CLIENTS:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum USER_PROGRESS_COPY:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum VENMO:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field public static final enum YOU_MIGHT_LIKE:Lcom/ibotta/android/state/app/config/ConfigParserType;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 66
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$1;

    const-string v1, "STRING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/state/app/config/ConfigParserType$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STRING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 77
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$2;

    const-string v1, "INTEGER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/state/app/config/ConfigParserType$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 88
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$3;

    const-string v1, "LONG"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/state/app/config/ConfigParserType$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->LONG:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 99
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$4;

    const-string v1, "FLOAT"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/state/app/config/ConfigParserType$4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->FLOAT:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 110
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$5;

    const-string v1, "BOOLEAN"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/state/app/config/ConfigParserType$5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 121
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$6;

    const-string v1, "VENMO"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/android/state/app/config/ConfigParserType$6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->VENMO:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 132
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$7;

    const-string v1, "PAYPAL"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/android/state/app/config/ConfigParserType$7;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->PAYPAL:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 144
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$8;

    const-string v1, "OS_DEPRECATION"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/android/state/app/config/ConfigParserType$8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->OS_DEPRECATION:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 156
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$9;

    const-string v1, "TRACKING"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/ibotta/android/state/app/config/ConfigParserType$9;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->TRACKING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 168
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$10;

    const-string v1, "CATEGORY_SETTINGS"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lcom/ibotta/android/state/app/config/ConfigParserType$10;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->CATEGORY_SETTINGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 180
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$11;

    const-string v1, "FAVORITE_RETAILER_SETTINGS"

    const/16 v12, 0xa

    invoke-direct {v0, v1, v12}, Lcom/ibotta/android/state/app/config/ConfigParserType$11;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->FAVORITE_RETAILER_SETTINGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 192
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$12;

    const-string v1, "DEVICE_AUTHENTICATION"

    const/16 v13, 0xb

    invoke-direct {v0, v1, v13}, Lcom/ibotta/android/state/app/config/ConfigParserType$12;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->DEVICE_AUTHENTICATION:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 204
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$13;

    const-string v1, "GALLERY_WHATS_HOT"

    const/16 v14, 0xc

    invoke-direct {v0, v1, v14}, Lcom/ibotta/android/state/app/config/ConfigParserType$13;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->GALLERY_WHATS_HOT:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 216
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$14;

    const-string v1, "PICTURE_SIZE_BLACKLIST"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$14;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->PICTURE_SIZE_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 228
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$15;

    const-string v1, "RECEIPT_FOCUS_BLACKLIST"

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$15;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->RECEIPT_FOCUS_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 240
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$16;

    const-string v1, "SEMVER_BLACKLIST"

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$16;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->SEMVER_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 258
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$17;

    const-string v1, "USER_PROGRESS_COPY"

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$17;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->USER_PROGRESS_COPY:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 270
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$18;

    const-string v1, "GREETING_SCHEDULE"

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$18;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->GREETING_SCHEDULE:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 282
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$19;

    const-string v1, "STORE_SELECTOR_REQS"

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$19;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STORE_SELECTOR_REQS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 294
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$20;

    const-string v1, "STORE_SELECTOR_V5_REQS"

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STORE_SELECTOR_V5_REQS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 306
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$21;

    const-string v1, "CACHE_OVERRIDES"

    const/16 v15, 0x14

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$21;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->CACHE_OVERRIDES:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 322
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$22;

    const-string v1, "YOU_MIGHT_LIKE"

    const/16 v15, 0x15

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$22;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->YOU_MIGHT_LIKE:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 334
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$23;

    const-string v1, "GALLERY_WHATS_NEW"

    const/16 v15, 0x16

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$23;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->GALLERY_WHATS_NEW:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 346
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$24;

    const-string v1, "INVITE_FRIENDS_COPY"

    const/16 v15, 0x17

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$24;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INVITE_FRIENDS_COPY:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 358
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$25;

    const-string v1, "EXPIRING_BANNER_VARIANTS"

    const/16 v15, 0x18

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$25;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->EXPIRING_BANNER_VARIANTS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 371
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$26;

    const-string v1, "OCR_DEVICE_BLACKLIST"

    const/16 v15, 0x19

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$26;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->OCR_DEVICE_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 383
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$27;

    const-string v1, "PARTNER_APP_TRACKING"

    const/16 v15, 0x1a

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$27;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->PARTNER_APP_TRACKING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 395
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$28;

    const-string v1, "FEATURE_OPS_KILL_SWITCH"

    const/16 v15, 0x1b

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$28;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->FEATURE_OPS_KILL_SWITCH:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 407
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$29;

    const-string v1, "QUESTS_HEADER_INFO"

    const/16 v15, 0x1c

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$29;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->QUESTS_HEADER_INFO:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 419
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$30;

    const-string v1, "INTEGER_LIST"

    const/16 v15, 0x1d

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$30;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER_LIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 431
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$31;

    const-string v1, "MVT_WINNERS"

    const/16 v15, 0x1e

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$31;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->MVT_WINNERS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 443
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$32;

    const-string v1, "FEATURE_FLAGS"

    const/16 v15, 0x1f

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$32;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->FEATURE_FLAGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 455
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigParserType$33;

    const-string v1, "TRACKING_CLIENTS"

    const/16 v15, 0x20

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/state/app/config/ConfigParserType$33;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->TRACKING_CLIENTS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v0, 0x21

    .line 65
    new-array v0, v0, [Lcom/ibotta/android/state/app/config/ConfigParserType;

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->STRING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->LONG:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->FLOAT:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->VENMO:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->PAYPAL:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->OS_DEPRECATION:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->TRACKING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->CATEGORY_SETTINGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->FAVORITE_RETAILER_SETTINGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->DEVICE_AUTHENTICATION:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->GALLERY_WHATS_HOT:Lcom/ibotta/android/state/app/config/ConfigParserType;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->PICTURE_SIZE_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->RECEIPT_FOCUS_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->SEMVER_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->USER_PROGRESS_COPY:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->GREETING_SCHEDULE:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->STORE_SELECTOR_REQS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->STORE_SELECTOR_V5_REQS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->CACHE_OVERRIDES:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->YOU_MIGHT_LIKE:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->GALLERY_WHATS_NEW:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->INVITE_FRIENDS_COPY:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->EXPIRING_BANNER_VARIANTS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->OCR_DEVICE_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->PARTNER_APP_TRACKING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->FEATURE_OPS_KILL_SWITCH:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->QUESTS_HEADER_INFO:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER_LIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->MVT_WINNERS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->FEATURE_FLAGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->TRACKING_CLIENTS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->$VALUES:[Lcom/ibotta/android/state/app/config/ConfigParserType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 65
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/ibotta/android/state/app/config/ConfigParserType$1;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/state/app/config/ConfigParserType;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/ConfigParserType;
    .locals 1

    .line 65
    const-class v0, Lcom/ibotta/android/state/app/config/ConfigParserType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/ConfigParserType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/state/app/config/ConfigParserType;
    .locals 1

    .line 65
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->$VALUES:[Lcom/ibotta/android/state/app/config/ConfigParserType;

    invoke-virtual {v0}, [Lcom/ibotta/android/state/app/config/ConfigParserType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/state/app/config/ConfigParserType;

    return-object v0
.end method


# virtual methods
.method public abstract createConfigParser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/config/ConfigParser;
.end method
