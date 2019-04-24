.class public final enum Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;
.super Ljava/lang/Enum;
.source "ContentTrackingPayload.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TrackingContent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

.field public static final enum OFFER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

.field public static final enum PRODUCT:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

.field public static final enum RETAILER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

.field public static final enum SUGGESTED_SEARCH_TERM:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 21
    new-instance v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    const-string v1, "OFFER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->OFFER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    new-instance v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    const-string v1, "RETAILER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->RETAILER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    new-instance v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    const-string v1, "PRODUCT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->PRODUCT:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    new-instance v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    const-string v1, "SUGGESTED_SEARCH_TERM"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->SUGGESTED_SEARCH_TERM:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    const/4 v0, 0x4

    .line 20
    new-array v0, v0, [Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    sget-object v1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->OFFER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->RETAILER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->PRODUCT:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->SUGGESTED_SEARCH_TERM:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->$VALUES:[Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;
    .locals 1

    .line 20
    const-class v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;
    .locals 1

    .line 20
    sget-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->$VALUES:[Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-virtual {v0}, [Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    return-object v0
.end method
