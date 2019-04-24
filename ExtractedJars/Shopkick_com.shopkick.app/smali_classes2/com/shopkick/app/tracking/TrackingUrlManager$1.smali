.class synthetic Lcom/shopkick/app/tracking/TrackingUrlManager$1;
.super Ljava/lang/Object;
.source "TrackingUrlManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tracking/TrackingUrlManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$tracking$TrackingUrlManager$TrackingUrlTaskResultType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 235
    invoke-static {}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->values()[Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$1;->$SwitchMap$com$shopkick$app$tracking$TrackingUrlManager$TrackingUrlTaskResultType:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$1;->$SwitchMap$com$shopkick$app$tracking$TrackingUrlManager$TrackingUrlTaskResultType:[I

    sget-object v1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->INVALID_URL:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    invoke-virtual {v1}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$1;->$SwitchMap$com$shopkick$app$tracking$TrackingUrlManager$TrackingUrlTaskResultType:[I

    sget-object v1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->REQUEST_TIMED_OUT:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    invoke-virtual {v1}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
