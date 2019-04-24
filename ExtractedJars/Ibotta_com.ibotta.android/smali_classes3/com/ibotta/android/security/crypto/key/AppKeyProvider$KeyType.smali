.class public final enum Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;
.super Ljava/lang/Enum;
.source "AppKeyProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/security/crypto/key/AppKeyProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "KeyType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum API_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum API_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum APPS_FLYER_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum COMSCORE_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum DEVICE_SECURITY_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum GOOGLE_WEB_CLIENT_ID:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum HOCKEY_APP_ALPHA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum HOCKEY_APP_BETA_EXT_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum HOCKEY_APP_BETA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum HOCKEY_APP_QA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum HOCKEY_APP_RELEASE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum JSON_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum LAUNCH_DARKLY_PROD:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum LAUNCH_DARKLY_TEST:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum NEW_RELIC_APP_TOKEN:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum RADAR_LIVE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum RADAR_TEST_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum SCANDIT_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum STRIPE_LIVE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum STRIPE_TEST_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum TUNE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum TWITTER_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum TWITTER_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

.field public static final enum WINDFALL_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;


# instance fields
.field private obfuscatedKey:[C


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 179
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "API_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$000()[C

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->API_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 180
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "API_SECRET"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$100()[C

    move-result-object v2

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->API_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 181
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "JSON_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$200()[C

    move-result-object v2

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->JSON_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 182
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "LAUNCH_DARKLY_PROD"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$300()[C

    move-result-object v2

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->LAUNCH_DARKLY_PROD:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 183
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "LAUNCH_DARKLY_TEST"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$400()[C

    move-result-object v2

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->LAUNCH_DARKLY_TEST:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 184
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "DEVICE_SECURITY_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$500()[C

    move-result-object v2

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->DEVICE_SECURITY_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 185
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "TWITTER_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$600()[C

    move-result-object v2

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->TWITTER_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 186
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "TWITTER_SECRET"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$700()[C

    move-result-object v2

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->TWITTER_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 187
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "COMSCORE_SECRET"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$800()[C

    move-result-object v2

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->COMSCORE_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 188
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "TUNE_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$900()[C

    move-result-object v2

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->TUNE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 189
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "NEW_RELIC_APP_TOKEN"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1000()[C

    move-result-object v2

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->NEW_RELIC_APP_TOKEN:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 190
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "SCANDIT_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1100()[C

    move-result-object v2

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->SCANDIT_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 191
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "GOOGLE_WEB_CLIENT_ID"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1200()[C

    move-result-object v2

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->GOOGLE_WEB_CLIENT_ID:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 192
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "RADAR_TEST_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1300()[C

    move-result-object v2

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->RADAR_TEST_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 193
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "RADAR_LIVE_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1400()[C

    move-result-object v2

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->RADAR_LIVE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 194
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "STRIPE_LIVE_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1500()[C

    move-result-object v2

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->STRIPE_LIVE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 195
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "STRIPE_TEST_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1600()[C

    move-result-object v2

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->STRIPE_TEST_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 196
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "HOCKEY_APP_ALPHA_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1700()[C

    move-result-object v2

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_ALPHA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 197
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "HOCKEY_APP_BETA_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1800()[C

    move-result-object v2

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_BETA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 198
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "HOCKEY_APP_BETA_EXT_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$1900()[C

    move-result-object v2

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_BETA_EXT_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 199
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "HOCKEY_APP_QA_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$2000()[C

    move-result-object v2

    const/16 v15, 0x14

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_QA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 200
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "HOCKEY_APP_RELEASE_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$2100()[C

    move-result-object v2

    const/16 v15, 0x15

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_RELEASE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 201
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "APPS_FLYER_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$2200()[C

    move-result-object v2

    const/16 v15, 0x16

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->APPS_FLYER_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 202
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const-string v1, "WINDFALL_KEY"

    invoke-static {}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->access$2300()[C

    move-result-object v2

    const/16 v15, 0x17

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;-><init>(Ljava/lang/String;I[C)V

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->WINDFALL_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v0, 0x18

    .line 178
    new-array v0, v0, [Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->API_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->API_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->JSON_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->LAUNCH_DARKLY_PROD:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->LAUNCH_DARKLY_TEST:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->DEVICE_SECURITY_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->TWITTER_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->TWITTER_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->COMSCORE_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->TUNE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->NEW_RELIC_APP_TOKEN:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->SCANDIT_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->GOOGLE_WEB_CLIENT_ID:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->RADAR_TEST_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->RADAR_LIVE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->STRIPE_LIVE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->STRIPE_TEST_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_ALPHA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_BETA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_BETA_EXT_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_QA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_RELEASE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->APPS_FLYER_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->WINDFALL_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->$VALUES:[Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I[C)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([C)V"
        }
    .end annotation

    .line 206
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 207
    iput-object p3, p0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->obfuscatedKey:[C

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;
    .locals 1

    .line 178
    const-class v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;
    .locals 1

    .line 178
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->$VALUES:[Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-virtual {v0}, [Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    return-object v0
.end method


# virtual methods
.method public getObfuscatedKey()[C
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->obfuscatedKey:[C

    return-object v0
.end method
