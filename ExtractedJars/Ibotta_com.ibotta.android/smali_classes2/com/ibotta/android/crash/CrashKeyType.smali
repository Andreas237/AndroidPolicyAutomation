.class public final enum Lcom/ibotta/android/crash/CrashKeyType;
.super Ljava/lang/Enum;
.source "CrashKeyType.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/crash/CrashKeyType;",
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
        "Lcom/ibotta/android/crash/CrashKeyType;",
        "",
        "(Ljava/lang/String;I)V",
        "HOCKEY_APP_ALPHA_KEY",
        "HOCKEY_APP_BETA_KEY",
        "HOCKEY_APP_BETA_EXT_KEY",
        "HOCKEY_APP_QA_KEY",
        "HOCKEY_APP_RELEASE_KEY",
        "NEW_RELIC_APP_TOKEN",
        "TWITTER_KEY",
        "TWITTER_SECRET",
        "ibotta-crash_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/crash/CrashKeyType;

.field public static final enum HOCKEY_APP_ALPHA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

.field public static final enum HOCKEY_APP_BETA_EXT_KEY:Lcom/ibotta/android/crash/CrashKeyType;

.field public static final enum HOCKEY_APP_BETA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

.field public static final enum HOCKEY_APP_QA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

.field public static final enum HOCKEY_APP_RELEASE_KEY:Lcom/ibotta/android/crash/CrashKeyType;

.field public static final enum NEW_RELIC_APP_TOKEN:Lcom/ibotta/android/crash/CrashKeyType;

.field public static final enum TWITTER_KEY:Lcom/ibotta/android/crash/CrashKeyType;

.field public static final enum TWITTER_SECRET:Lcom/ibotta/android/crash/CrashKeyType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/ibotta/android/crash/CrashKeyType;

    new-instance v1, Lcom/ibotta/android/crash/CrashKeyType;

    const-string v2, "HOCKEY_APP_ALPHA_KEY"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/crash/CrashKeyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_ALPHA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/crash/CrashKeyType;

    const-string v2, "HOCKEY_APP_BETA_KEY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/crash/CrashKeyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_BETA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/crash/CrashKeyType;

    const-string v2, "HOCKEY_APP_BETA_EXT_KEY"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/crash/CrashKeyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_BETA_EXT_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/crash/CrashKeyType;

    const-string v2, "HOCKEY_APP_QA_KEY"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/crash/CrashKeyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_QA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/crash/CrashKeyType;

    const-string v2, "HOCKEY_APP_RELEASE_KEY"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/crash/CrashKeyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_RELEASE_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/crash/CrashKeyType;

    const-string v2, "NEW_RELIC_APP_TOKEN"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/crash/CrashKeyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/crash/CrashKeyType;->NEW_RELIC_APP_TOKEN:Lcom/ibotta/android/crash/CrashKeyType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/crash/CrashKeyType;

    const-string v2, "TWITTER_KEY"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/crash/CrashKeyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/crash/CrashKeyType;->TWITTER_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/crash/CrashKeyType;

    const-string v2, "TWITTER_SECRET"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/crash/CrashKeyType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/crash/CrashKeyType;->TWITTER_SECRET:Lcom/ibotta/android/crash/CrashKeyType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/crash/CrashKeyType;->$VALUES:[Lcom/ibotta/android/crash/CrashKeyType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeyType;
    .locals 1

    const-class v0, Lcom/ibotta/android/crash/CrashKeyType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/crash/CrashKeyType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/crash/CrashKeyType;
    .locals 1

    sget-object v0, Lcom/ibotta/android/crash/CrashKeyType;->$VALUES:[Lcom/ibotta/android/crash/CrashKeyType;

    invoke-virtual {v0}, [Lcom/ibotta/android/crash/CrashKeyType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/crash/CrashKeyType;

    return-object v0
.end method
