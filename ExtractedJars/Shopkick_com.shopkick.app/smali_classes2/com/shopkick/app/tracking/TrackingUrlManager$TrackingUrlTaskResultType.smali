.class public final enum Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;
.super Ljava/lang/Enum;
.source "TrackingUrlManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tracking/TrackingUrlManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TrackingUrlTaskResultType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

.field public static final enum INVALID_URL:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

.field public static final enum OTHER:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

.field public static final enum REQUEST_TIMED_OUT:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

.field public static final enum SUCCESS:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 246
    new-instance v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->SUCCESS:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    .line 247
    new-instance v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    const-string v1, "INVALID_URL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->INVALID_URL:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    .line 248
    new-instance v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    const-string v1, "REQUEST_TIMED_OUT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->REQUEST_TIMED_OUT:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    .line 249
    new-instance v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    const-string v1, "OTHER"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->OTHER:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    const/4 v0, 0x4

    .line 245
    new-array v0, v0, [Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    sget-object v1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->SUCCESS:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->INVALID_URL:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->REQUEST_TIMED_OUT:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->OTHER:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->$VALUES:[Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 245
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;
    .locals 1

    .line 245
    const-class v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;
    .locals 1

    .line 245
    sget-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->$VALUES:[Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    invoke-virtual {v0}, [Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    return-object v0
.end method
