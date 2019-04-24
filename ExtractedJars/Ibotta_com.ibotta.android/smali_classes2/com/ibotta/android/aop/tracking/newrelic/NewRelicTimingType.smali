.class public final enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;
.super Ljava/lang/Enum;
.source "NewRelicTimingType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

.field public static final enum FIRST_CONTENT:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

.field public static final enum NO_OP:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

.field public static final enum PWI_BARCODE_LOAD:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 4
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    const-string v1, "NO_OP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->NO_OP:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    .line 5
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    const-string v1, "FIRST_CONTENT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->FIRST_CONTENT:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    .line 6
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    const-string v1, "PWI_BARCODE_LOAD"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->PWI_BARCODE_LOAD:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    const/4 v0, 0x3

    .line 3
    new-array v0, v0, [Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->NO_OP:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->FIRST_CONTENT:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->PWI_BARCODE_LOAD:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->$VALUES:[Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->$VALUES:[Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    invoke-virtual {v0}, [Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    return-object v0
.end method
