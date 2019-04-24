.class synthetic Lcom/shopkick/app/video/VideoController$1;
.super Ljava/lang/Object;
.source "VideoController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/video/VideoController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

.field static final synthetic $SwitchMap$com$appscend$media$events$APSMediaEvent$APSMediaEventState:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 819
    invoke-static {}, Lcom/appscend/media/events/APSMediaEvent$APSMediaEventState;->values()[Lcom/appscend/media/events/APSMediaEvent$APSMediaEventState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$events$APSMediaEvent$APSMediaEventState:[I

    const/4 v0, 0x1

    :try_start_0
    sget-object v1, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$events$APSMediaEvent$APSMediaEventState:[I

    sget-object v2, Lcom/appscend/media/events/APSMediaEvent$APSMediaEventState;->APSMediaEventStateFailed:Lcom/appscend/media/events/APSMediaEvent$APSMediaEventState;

    invoke-virtual {v2}, Lcom/appscend/media/events/APSMediaEvent$APSMediaEventState;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 663
    :catch_0
    invoke-static {}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->values()[Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    move-result-object v1

    array-length v1, v1

    new-array v1, v1, [I

    sput-object v1, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    :try_start_1
    sget-object v1, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v2, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->BUFFER_START:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v2}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->BUFFER_END:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->LAUNCH:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->RESUME:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->START:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v0, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->PAUSE:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v0, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->COMPLETE:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v0, Lcom/shopkick/app/video/VideoController$1;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    sget-object v1, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ERROR:Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;

    invoke-virtual {v1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    return-void
.end method
