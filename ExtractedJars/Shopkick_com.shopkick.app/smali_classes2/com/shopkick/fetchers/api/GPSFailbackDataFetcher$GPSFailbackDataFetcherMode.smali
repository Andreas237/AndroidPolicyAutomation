.class public final enum Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;
.super Ljava/lang/Enum;
.source "GPSFailbackDataFetcher.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "GPSFailbackDataFetcherMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

.field public static final enum Offline:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

.field public static final enum Online:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

.field public static final enum Undetermined:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 27
    new-instance v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    const-string v1, "Undetermined"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Undetermined:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    .line 28
    new-instance v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    const-string v1, "Online"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Online:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    .line 29
    new-instance v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    const-string v1, "Offline"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Offline:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    const/4 v0, 0x3

    .line 26
    new-array v0, v0, [Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    sget-object v1, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Undetermined:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Online:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Offline:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->$VALUES:[Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;
    .locals 1

    .line 26
    const-class v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;
    .locals 1

    .line 26
    sget-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->$VALUES:[Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    invoke-virtual {v0}, [Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    return-object v0
.end method
