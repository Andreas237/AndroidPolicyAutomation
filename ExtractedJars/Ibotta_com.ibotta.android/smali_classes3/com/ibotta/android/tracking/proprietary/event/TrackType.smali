.class public final enum Lcom/ibotta/android/tracking/proprietary/event/TrackType;
.super Ljava/lang/Enum;
.source "TrackType.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/proprietary/event/TrackType$TrackTypeException;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/tracking/proprietary/event/TrackType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum ABTEST:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum ACCOUNT:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum BONUS:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum DEAL:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum DEEPLINK:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum LAUNCH_APP:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum MODULE:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum MY_EARNINGS:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum NOTIFICATION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum OFFER:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum PARTNER_APP:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum PROMO:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum QUEST:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum REGISTRATION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum RETAILER:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum REWARD:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum SEARCH:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum SESSION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum SETTINGS:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

.field public static final enum TILE:Lcom/ibotta/android/tracking/proprietary/event/TrackType;


# instance fields
.field private final name:Ljava/lang/String;

.field private final requiredFields:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 14
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "SEARCH"

    const-string v2, "search"

    const-string v3, "context"

    const-string v4, "event_at"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->SEARCH:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 20
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "OFFER"

    const-string v2, "offer"

    const-string v3, "context"

    const-string v5, "event_at"

    const-string v6, "offer_id"

    filled-new-array {v3, v5, v6}, [Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 27
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "REWARD"

    const-string v2, "reward"

    const-string v3, "context"

    const-string v6, "event_at"

    const-string v7, "offer_reward_id"

    filled-new-array {v3, v6, v7}, [Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x2

    invoke-direct {v0, v1, v6, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->REWARD:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 34
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "PROMO"

    const-string v2, "promo"

    const-string v3, "context"

    const-string v7, "event_at"

    const-string v8, "offer_id"

    const-string v9, "promo_id"

    filled-new-array {v3, v7, v8, v9}, [Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x3

    invoke-direct {v0, v1, v7, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->PROMO:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 42
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "TILE"

    const-string v2, "tile"

    const-string v3, "context"

    const-string v8, "event_at"

    const-string v9, "tile_id"

    filled-new-array {v3, v8, v9}, [Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x4

    invoke-direct {v0, v1, v8, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 49
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "BONUS"

    const-string v2, "bonus"

    const-string v3, "context"

    const-string v9, "event_at"

    const-string v10, "bonus_id"

    filled-new-array {v3, v9, v10}, [Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x5

    invoke-direct {v0, v1, v9, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 56
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "RETAILER"

    const-string v2, "retailer"

    const-string v3, "context"

    const-string v10, "event_at"

    const-string v11, "retailer_id"

    filled-new-array {v3, v10, v11}, [Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x6

    invoke-direct {v0, v1, v10, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 63
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "SESSION"

    const-string v2, "session"

    const-string v3, "context"

    const-string v11, "event_at"

    filled-new-array {v3, v11}, [Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x7

    invoke-direct {v0, v1, v11, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->SESSION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 69
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "ABTEST"

    const-string v2, "abtest"

    const-string v3, "context"

    const-string v12, "event_at"

    const-string v13, "test"

    const-string v14, "variant"

    filled-new-array {v3, v12, v13, v14}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x8

    invoke-direct {v0, v1, v12, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->ABTEST:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 77
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "LAUNCH_APP"

    const-string v2, "launch_app"

    const-string v3, "context"

    const-string v13, "event_at"

    const-string v14, "retailer_id"

    filled-new-array {v3, v13, v14}, [Ljava/lang/String;

    move-result-object v3

    const/16 v13, 0x9

    invoke-direct {v0, v1, v13, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->LAUNCH_APP:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 84
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "REGISTRATION"

    const-string v2, "registration"

    const-string v3, "context"

    const-string v14, "event_at"

    filled-new-array {v3, v14}, [Ljava/lang/String;

    move-result-object v3

    const/16 v14, 0xa

    invoke-direct {v0, v1, v14, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->REGISTRATION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 90
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "DEEPLINK"

    const-string v2, "deeplink"

    const-string v3, "context"

    const-string v15, "event_at"

    filled-new-array {v3, v15}, [Ljava/lang/String;

    move-result-object v3

    const/16 v15, 0xb

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->DEEPLINK:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 96
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "PRODUCT"

    const-string v2, "product"

    const-string v3, "context"

    const-string v15, "event_at"

    filled-new-array {v3, v15}, [Ljava/lang/String;

    move-result-object v3

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 102
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "DEAL"

    const-string v2, "deal"

    const-string v3, "context"

    const-string v15, "event_at"

    filled-new-array {v3, v15}, [Ljava/lang/String;

    move-result-object v3

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->DEAL:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 108
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "MODULE"

    const-string v2, "module"

    const-string v3, "context"

    const-string v15, "event_at"

    filled-new-array {v3, v15}, [Ljava/lang/String;

    move-result-object v3

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->MODULE:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 114
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "PARTNER_APP"

    const-string v2, "partner_app"

    const-string v3, "context"

    const-string v15, "event_at"

    filled-new-array {v3, v15}, [Ljava/lang/String;

    move-result-object v3

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->PARTNER_APP:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 120
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "QUEST"

    const-string v2, "quest"

    const-string v3, "context"

    const-string v15, "event_at"

    const-string v14, "bonus_id"

    const-string v13, "quest_state"

    filled-new-array {v3, v15, v14, v13}, [Ljava/lang/String;

    move-result-object v3

    const/16 v13, 0x10

    invoke-direct {v0, v1, v13, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->QUEST:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 128
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "CATEGORY"

    const-string v2, "category"

    const-string v3, "context"

    const-string v13, "event_at"

    const-string v14, "category_id"

    const-string v15, "category_type"

    filled-new-array {v3, v13, v14, v15}, [Ljava/lang/String;

    move-result-object v3

    const/16 v13, 0x11

    invoke-direct {v0, v1, v13, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 136
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "NOTIFICATION"

    const-string v2, "notification"

    const-string v3, "context"

    const-string v13, "clicked"

    filled-new-array {v3, v13}, [Ljava/lang/String;

    move-result-object v3

    const/16 v13, 0x12

    invoke-direct {v0, v1, v13, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->NOTIFICATION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 140
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "ACCOUNT"

    const-string v2, "account"

    const-string v3, "context"

    const-string v13, "event_at"

    const-string v14, "context_detail"

    filled-new-array {v3, v13, v14}, [Ljava/lang/String;

    move-result-object v3

    const/16 v13, 0x13

    invoke-direct {v0, v1, v13, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->ACCOUNT:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 145
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "MY_EARNINGS"

    const-string v2, "my_earnings"

    const-string v3, "context"

    const-string v13, "event_at"

    filled-new-array {v3, v13}, [Ljava/lang/String;

    move-result-object v3

    const/16 v13, 0x14

    invoke-direct {v0, v1, v13, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->MY_EARNINGS:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    .line 149
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const-string v1, "SETTINGS"

    const-string v2, "settings"

    const-string v3, "context"

    const-string v13, "event_at"

    filled-new-array {v3, v13}, [Ljava/lang/String;

    move-result-object v3

    const/16 v13, 0x15

    invoke-direct {v0, v1, v13, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->SETTINGS:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v0, 0x16

    .line 13
    new-array v0, v0, [Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->SEARCH:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->REWARD:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->PROMO:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->SESSION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->ABTEST:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->LAUNCH_APP:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->REGISTRATION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->DEEPLINK:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->DEAL:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->MODULE:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->PARTNER_APP:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->QUEST:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->NOTIFICATION:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->ACCOUNT:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->MY_EARNINGS:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->SETTINGS:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 157
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 158
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->name:Ljava/lang/String;

    .line 159
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->requiredFields:[Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/TrackType;
    .locals 1

    .line 13
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/tracking/proprietary/event/TrackType;
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    invoke-virtual {v0}, [Lcom/ibotta/android/tracking/proprietary/event/TrackType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRequiredFields()[Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->requiredFields:[Ljava/lang/String;

    return-object v0
.end method

.method public validate(Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;)Z
    .locals 5

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->requiredFields:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 175
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 176
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 177
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 178
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->getParams()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 180
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 184
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_5

    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "One or more required params missing for: "

    .line 189
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " - "

    .line 191
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    .line 194
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 195
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v1, v3, :cond_3

    const-string v3, ", "

    .line 198
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 202
    :cond_4
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/TrackType$TrackTypeException;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackType$TrackTypeException;-><init>(Lcom/ibotta/android/tracking/proprietary/event/TrackType;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :cond_5
    return p1
.end method
