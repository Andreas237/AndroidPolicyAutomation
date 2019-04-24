.class public final enum Lcom/moat/analytics/mobile/spck/MoatAdEventType;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/moat/analytics/mobile/spck/MoatAdEventType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AD_EVT_COMPLETE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_ENTER_FULLSCREEN:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_EXIT_FULLSCREEN:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_FIRST_QUARTILE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_MID_POINT:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_PAUSED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_PLAYING:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_SKIPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_START:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_STOPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_THIRD_QUARTILE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field public static final enum AD_EVT_VOLUME_CHANGE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

.field private static final synthetic b:[Lcom/moat/analytics/mobile/spck/MoatAdEventType;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_FIRST_QUARTILE"

    const-string v2, "AdVideoFirstQuartile"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_FIRST_QUARTILE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_MID_POINT"

    const-string v2, "AdVideoMidpoint"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_MID_POINT:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_THIRD_QUARTILE"

    const-string v2, "AdVideoThirdQuartile"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_THIRD_QUARTILE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_COMPLETE"

    const-string v2, "AdVideoComplete"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_COMPLETE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_PAUSED"

    const-string v2, "AdPaused"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_PAUSED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_PLAYING"

    const-string v2, "AdPlaying"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_PLAYING:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_START"

    const-string v2, "AdVideoStart"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_START:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_STOPPED"

    const-string v2, "AdStopped"

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_STOPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_SKIPPED"

    const-string v2, "AdSkipped"

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_SKIPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_VOLUME_CHANGE"

    const-string v2, "AdVolumeChange"

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_VOLUME_CHANGE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_ENTER_FULLSCREEN"

    const-string v2, "fullScreen"

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_ENTER_FULLSCREEN:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const-string v1, "AD_EVT_EXIT_FULLSCREEN"

    const-string v2, "exitFullscreen"

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_EXIT_FULLSCREEN:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    const/16 v0, 0xc

    new-array v0, v0, [Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_FIRST_QUARTILE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_MID_POINT:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_THIRD_QUARTILE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_COMPLETE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_PAUSED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_PLAYING:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_START:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_STOPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_SKIPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_VOLUME_CHANGE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_ENTER_FULLSCREEN:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_EXIT_FULLSCREEN:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    aput-object v1, v0, v14

    sput-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->b:[Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->a:Ljava/lang/String;

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/moat/analytics/mobile/spck/MoatAdEventType;
    .locals 5

    if-eqz p0, :cond_1

    invoke-static {}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->values()[Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/moat/analytics/mobile/spck/MoatAdEventType;
    .locals 1

    const-class v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    return-object p0
.end method

.method public static values()[Lcom/moat/analytics/mobile/spck/MoatAdEventType;
    .locals 1

    sget-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->b:[Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    invoke-virtual {v0}, [Lcom/moat/analytics/mobile/spck/MoatAdEventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->a:Ljava/lang/String;

    return-object v0
.end method
