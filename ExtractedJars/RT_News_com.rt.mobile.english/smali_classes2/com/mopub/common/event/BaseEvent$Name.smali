.class public final enum Lcom/mopub/common/event/BaseEvent$Name;
.super Ljava/lang/Enum;
.source "BaseEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/event/BaseEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Name"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/common/event/BaseEvent$Name;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum AD_DWELL_TIME:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum AD_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum DOWNLOAD_BUFFERING:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum DOWNLOAD_FINISHED:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum DOWNLOAD_START:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum DOWNLOAD_VIDEO_READY:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum ERROR_DURING_PLAYBACK:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum ERROR_FAILED_TO_PLAY:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum IMPRESSION_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;


# instance fields
.field private final mName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 64
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "AD_REQUEST"

    const-string v2, "ad_request"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->AD_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    .line 65
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "IMPRESSION_REQUEST"

    const-string v2, "impression_request"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->IMPRESSION_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    .line 66
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "CLICK_REQUEST"

    const-string v2, "click_request"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    .line 69
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "DOWNLOAD_START"

    const-string v2, "download_start"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->DOWNLOAD_START:Lcom/mopub/common/event/BaseEvent$Name;

    .line 70
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "DOWNLOAD_VIDEO_READY"

    const-string v2, "download_video_ready"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->DOWNLOAD_VIDEO_READY:Lcom/mopub/common/event/BaseEvent$Name;

    .line 71
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "DOWNLOAD_BUFFERING"

    const-string v2, "download_video_buffering"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->DOWNLOAD_BUFFERING:Lcom/mopub/common/event/BaseEvent$Name;

    .line 72
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "DOWNLOAD_FINISHED"

    const-string v2, "download_finished"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->DOWNLOAD_FINISHED:Lcom/mopub/common/event/BaseEvent$Name;

    .line 73
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "ERROR_DURING_PLAYBACK"

    const-string v2, "error_during_playback"

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->ERROR_DURING_PLAYBACK:Lcom/mopub/common/event/BaseEvent$Name;

    .line 74
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "ERROR_FAILED_TO_PLAY"

    const-string v2, "error_failed_to_play"

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->ERROR_FAILED_TO_PLAY:Lcom/mopub/common/event/BaseEvent$Name;

    .line 77
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "AD_DWELL_TIME"

    const-string v2, "clickthrough_dwell_time"

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->AD_DWELL_TIME:Lcom/mopub/common/event/BaseEvent$Name;

    const/16 v0, 0xa

    .line 62
    new-array v0, v0, [Lcom/mopub/common/event/BaseEvent$Name;

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->AD_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->IMPRESSION_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->DOWNLOAD_START:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->DOWNLOAD_VIDEO_READY:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->DOWNLOAD_BUFFERING:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v8

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->DOWNLOAD_FINISHED:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v9

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->ERROR_DURING_PLAYBACK:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v10

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->ERROR_FAILED_TO_PLAY:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v11

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->AD_DWELL_TIME:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v12

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->$VALUES:[Lcom/mopub/common/event/BaseEvent$Name;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 81
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 82
    iput-object p3, p0, Lcom/mopub/common/event/BaseEvent$Name;->mName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$Name;
    .locals 1

    .line 62
    const-class v0, Lcom/mopub/common/event/BaseEvent$Name;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/common/event/BaseEvent$Name;

    return-object p0
.end method

.method public static values()[Lcom/mopub/common/event/BaseEvent$Name;
    .locals 1

    .line 62
    sget-object v0, Lcom/mopub/common/event/BaseEvent$Name;->$VALUES:[Lcom/mopub/common/event/BaseEvent$Name;

    invoke-virtual {v0}, [Lcom/mopub/common/event/BaseEvent$Name;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/event/BaseEvent$Name;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent$Name;->mName:Ljava/lang/String;

    return-object v0
.end method
