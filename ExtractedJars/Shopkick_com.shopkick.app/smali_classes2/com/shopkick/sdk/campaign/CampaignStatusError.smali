.class public final enum Lcom/shopkick/sdk/campaign/CampaignStatusError;
.super Ljava/lang/Enum;
.source "CampaignStatusError.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/campaign/CampaignStatusError;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/campaign/CampaignStatusError;

.field public static final enum GOOGLE_PLAY_SERVICES_DISABLED:Lcom/shopkick/sdk/campaign/CampaignStatusError;

.field public static final enum GOOGLE_PLAY_SERVICES_OUT_OF_DATE:Lcom/shopkick/sdk/campaign/CampaignStatusError;

.field public static final enum GOOGLE_PLAY_SERVICES_UNAVAILABLE:Lcom/shopkick/sdk/campaign/CampaignStatusError;

.field public static final enum LOCATION_DISABLED:Lcom/shopkick/sdk/campaign/CampaignStatusError;

.field public static final enum NETWORK_ERROR:Lcom/shopkick/sdk/campaign/CampaignStatusError;

.field public static final enum UNKNOWN_ERROR:Lcom/shopkick/sdk/campaign/CampaignStatusError;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 12
    new-instance v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;

    const-string v1, "NETWORK_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/campaign/CampaignStatusError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;->NETWORK_ERROR:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    .line 16
    new-instance v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;

    const-string v1, "GOOGLE_PLAY_SERVICES_UNAVAILABLE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/campaign/CampaignStatusError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;->GOOGLE_PLAY_SERVICES_UNAVAILABLE:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    .line 20
    new-instance v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;

    const-string v1, "GOOGLE_PLAY_SERVICES_OUT_OF_DATE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/campaign/CampaignStatusError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;->GOOGLE_PLAY_SERVICES_OUT_OF_DATE:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    .line 24
    new-instance v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;

    const-string v1, "GOOGLE_PLAY_SERVICES_DISABLED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/sdk/campaign/CampaignStatusError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;->GOOGLE_PLAY_SERVICES_DISABLED:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    .line 28
    new-instance v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;

    const-string v1, "LOCATION_DISABLED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/sdk/campaign/CampaignStatusError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;->LOCATION_DISABLED:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    .line 32
    new-instance v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;

    const-string v1, "UNKNOWN_ERROR"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/shopkick/sdk/campaign/CampaignStatusError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;->UNKNOWN_ERROR:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    const/4 v0, 0x6

    .line 8
    new-array v0, v0, [Lcom/shopkick/sdk/campaign/CampaignStatusError;

    sget-object v1, Lcom/shopkick/sdk/campaign/CampaignStatusError;->NETWORK_ERROR:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/campaign/CampaignStatusError;->GOOGLE_PLAY_SERVICES_UNAVAILABLE:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/campaign/CampaignStatusError;->GOOGLE_PLAY_SERVICES_OUT_OF_DATE:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/sdk/campaign/CampaignStatusError;->GOOGLE_PLAY_SERVICES_DISABLED:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/sdk/campaign/CampaignStatusError;->LOCATION_DISABLED:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    aput-object v1, v0, v6

    sget-object v1, Lcom/shopkick/sdk/campaign/CampaignStatusError;->UNKNOWN_ERROR:Lcom/shopkick/sdk/campaign/CampaignStatusError;

    aput-object v1, v0, v7

    sput-object v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;->$VALUES:[Lcom/shopkick/sdk/campaign/CampaignStatusError;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/campaign/CampaignStatusError;
    .locals 1

    .line 8
    const-class v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/campaign/CampaignStatusError;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/campaign/CampaignStatusError;
    .locals 1

    .line 8
    sget-object v0, Lcom/shopkick/sdk/campaign/CampaignStatusError;->$VALUES:[Lcom/shopkick/sdk/campaign/CampaignStatusError;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/campaign/CampaignStatusError;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/campaign/CampaignStatusError;

    return-object v0
.end method
