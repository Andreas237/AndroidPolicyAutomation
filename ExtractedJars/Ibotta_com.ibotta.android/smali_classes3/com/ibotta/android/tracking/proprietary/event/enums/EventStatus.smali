.class public final enum Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;
.super Ljava/lang/Enum;
.source "EventStatus.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

.field public static final enum ERROR:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

.field public static final enum IN_FLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

.field public static final enum NEW:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

.field public static final enum SENT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 7
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    const-string v1, "NEW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->NEW:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    .line 8
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    const-string v1, "IN_FLIGHT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->IN_FLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    .line 9
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    const-string v1, "SENT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->SENT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    .line 10
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    const-string v1, "ERROR"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->ERROR:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    const/4 v0, 0x4

    .line 6
    new-array v0, v0, [Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->NEW:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->IN_FLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->SENT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->ERROR:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

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

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 20
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    invoke-virtual {v0}, [Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    return-object v0
.end method
