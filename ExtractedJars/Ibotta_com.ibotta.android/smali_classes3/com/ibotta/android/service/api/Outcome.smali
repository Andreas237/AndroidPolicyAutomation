.class public final enum Lcom/ibotta/android/service/api/Outcome;
.super Ljava/lang/Enum;
.source "Outcome.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/service/api/Outcome;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/service/api/Outcome;

.field public static final enum AUTH_LOST:Lcom/ibotta/android/service/api/Outcome;

.field public static final enum DEPRECATED:Lcom/ibotta/android/service/api/Outcome;

.field public static final enum ERROR:Lcom/ibotta/android/service/api/Outcome;

.field public static final enum MAINTENANCE_MODE:Lcom/ibotta/android/service/api/Outcome;

.field public static final enum NETWORK_LOST:Lcom/ibotta/android/service/api/Outcome;

.field public static final enum OFFER_EXPIRED:Lcom/ibotta/android/service/api/Outcome;

.field public static final enum SUCCESS:Lcom/ibotta/android/service/api/Outcome;

.field public static final enum UNKNOWN:Lcom/ibotta/android/service/api/Outcome;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 7
    new-instance v0, Lcom/ibotta/android/service/api/Outcome;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/service/api/Outcome;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    .line 8
    new-instance v0, Lcom/ibotta/android/service/api/Outcome;

    const-string v1, "SUCCESS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/service/api/Outcome;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    .line 9
    new-instance v0, Lcom/ibotta/android/service/api/Outcome;

    const-string v1, "AUTH_LOST"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/service/api/Outcome;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/api/Outcome;->AUTH_LOST:Lcom/ibotta/android/service/api/Outcome;

    .line 10
    new-instance v0, Lcom/ibotta/android/service/api/Outcome;

    const-string v1, "MAINTENANCE_MODE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/service/api/Outcome;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/api/Outcome;->MAINTENANCE_MODE:Lcom/ibotta/android/service/api/Outcome;

    .line 11
    new-instance v0, Lcom/ibotta/android/service/api/Outcome;

    const-string v1, "OFFER_EXPIRED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/service/api/Outcome;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/api/Outcome;->OFFER_EXPIRED:Lcom/ibotta/android/service/api/Outcome;

    .line 12
    new-instance v0, Lcom/ibotta/android/service/api/Outcome;

    const-string v1, "NETWORK_LOST"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/android/service/api/Outcome;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/api/Outcome;->NETWORK_LOST:Lcom/ibotta/android/service/api/Outcome;

    .line 13
    new-instance v0, Lcom/ibotta/android/service/api/Outcome;

    const-string v1, "ERROR"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/android/service/api/Outcome;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/api/Outcome;->ERROR:Lcom/ibotta/android/service/api/Outcome;

    .line 14
    new-instance v0, Lcom/ibotta/android/service/api/Outcome;

    const-string v1, "DEPRECATED"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/android/service/api/Outcome;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/service/api/Outcome;->DEPRECATED:Lcom/ibotta/android/service/api/Outcome;

    const/16 v0, 0x8

    .line 6
    new-array v0, v0, [Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->AUTH_LOST:Lcom/ibotta/android/service/api/Outcome;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->MAINTENANCE_MODE:Lcom/ibotta/android/service/api/Outcome;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->OFFER_EXPIRED:Lcom/ibotta/android/service/api/Outcome;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->NETWORK_LOST:Lcom/ibotta/android/service/api/Outcome;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->ERROR:Lcom/ibotta/android/service/api/Outcome;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->DEPRECATED:Lcom/ibotta/android/service/api/Outcome;

    aput-object v1, v0, v9

    sput-object v0, Lcom/ibotta/android/service/api/Outcome;->$VALUES:[Lcom/ibotta/android/service/api/Outcome;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/service/api/Outcome;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/android/service/api/Outcome;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/api/Outcome;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/service/api/Outcome;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->$VALUES:[Lcom/ibotta/android/service/api/Outcome;

    invoke-virtual {v0}, [Lcom/ibotta/android/service/api/Outcome;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/service/api/Outcome;

    return-object v0
.end method
