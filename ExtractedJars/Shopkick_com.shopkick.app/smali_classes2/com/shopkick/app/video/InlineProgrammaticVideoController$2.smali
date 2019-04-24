.class synthetic Lcom/shopkick/app/video/InlineProgrammaticVideoController$2;
.super Ljava/lang/Object;
.source "InlineProgrammaticVideoController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/video/InlineProgrammaticVideoController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 440
    invoke-static {}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->values()[Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/video/InlineProgrammaticVideoController$2;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/video/InlineProgrammaticVideoController$2;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ERROR:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/video/InlineProgrammaticVideoController$2;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->COMPLETE:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
