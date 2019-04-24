.class public final enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;
.super Ljava/lang/Enum;
.source "NewRelicTrackingType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

.field public static final enum CASH_OUT_OPTION_DISABLED:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

.field public static final enum DUPLICATE_OFFER_CATEGORY:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

.field public static final enum EMPTY_GALLERY:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

.field public static final enum NO_OP:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 4
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    const-string v1, "NO_OP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->NO_OP:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    .line 5
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    const-string v1, "DUPLICATE_OFFER_CATEGORY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->DUPLICATE_OFFER_CATEGORY:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    .line 6
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    const-string v1, "CASH_OUT_OPTION_DISABLED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->CASH_OUT_OPTION_DISABLED:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    .line 7
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    const-string v1, "EMPTY_GALLERY"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->EMPTY_GALLERY:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    const/4 v0, 0x4

    .line 3
    new-array v0, v0, [Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->NO_OP:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->DUPLICATE_OFFER_CATEGORY:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->CASH_OUT_OPTION_DISABLED:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->EMPTY_GALLERY:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->$VALUES:[Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->$VALUES:[Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    invoke-virtual {v0}, [Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    return-object v0
.end method
