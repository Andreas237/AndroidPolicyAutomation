.class public Lfm/jiecao/jcvideoplayer_lib/VideoEvents;
.super Ljava/lang/Object;
.source "VideoEvents.java"


# static fields
.field public static final POINT_AUTO_COMPLETE:I = 0x599a2

.field public static final POINT_AUTO_COMPLETE_FULLSCREEN:I = 0x599a3

.field public static final POINT_CLICK_BLANK:I = 0x5999e

.field public static final POINT_CLICK_BLANK_FULLSCREEN:I = 0x5999f

.field public static final POINT_CLICK_SEEKBAR:I = 0x599a0

.field public static final POINT_CLICK_SEEKBAR_FULLSCREEN:I = 0x599a1

.field public static final POINT_ENTER_FULLSCREEN:I = 0x599a4

.field public static final POINT_QUIT_FULLSCREEN:I = 0x599a5

.field public static final POINT_RESUME:I = 0x599a6

.field public static final POINT_RESUME_FULLSCREEN:I = 0x5999d

.field public static final POINT_START_ICON:I = 0x59999

.field public static final POINT_START_THUMB:I = 0x5999a

.field public static final POINT_STOP:I = 0x5999b

.field public static final POINT_STOP_FULLSCREEN:I = 0x5999c

.field public static final VE_MEDIAPLAYER_FINISH_COMPLETE:I = 0x595b7

.field public static final VE_MEDIAPLAYER_RESIZE:I = 0x595ba

.field public static final VE_MEDIAPLAYER_SEEKCOMPLETE:I = 0x595b9

.field public static final VE_MEDIAPLAYER_UPDATE_BUFFER:I = 0x595b8

.field public static final VE_MEDIAPLAYER_UPDATE_PROGRESS:I = 0x595bb

.field public static final VE_PREPARED:I = 0x595b4

.field public static final VE_START:I = 0x595b1

.field public static final VE_STOP:I = 0x595b2

.field public static final VE_SURFACEHOLDER_CREATED:I = 0x595b5

.field public static final VE_SURFACEHOLDER_FINISH_FULLSCREEN:I = 0x595b6


# instance fields
.field public obj:Ljava/lang/Object;

.field public obj1:Ljava/lang/Object;

.field public type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public setObj(Ljava/lang/Object;)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;
    .locals 0

    .line 107
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->obj:Ljava/lang/Object;

    return-object p0
.end method

.method public setObj1(Ljava/lang/Object;)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;
    .locals 0

    .line 112
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->obj1:Ljava/lang/Object;

    return-object p0
.end method

.method public setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;
    .locals 0

    .line 102
    iput p1, p0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    return-object p0
.end method
