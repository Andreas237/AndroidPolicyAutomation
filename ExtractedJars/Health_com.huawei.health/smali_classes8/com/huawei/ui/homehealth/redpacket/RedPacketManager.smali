.class public Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;
    }
.end annotation


# static fields
.field private static final CLEAR_ANIMATION:I = 0x2

.field private static final HAVE_ACTIVITY:I = 0x0

.field private static final HAVE_NOT_ACTIVITY:I = 0x753e

.field private static final IS_BETA:Ljava/lang/String; = "isBeta"

.field private static final MIN_CLICK_DELAY_TIME:I = 0x3e8

.field private static final NO_JOIN:I = 0x0

.field private static final PARAM_APP_ID:Ljava/lang/String; = "appId"

.field private static final PARAM_APP_TYPE:Ljava/lang/String; = "appType"

.field private static final PARAM_CONNECTION:Ljava/lang/String; = "Connection"

.field private static final PARAM_CONTENT_LENGTH:Ljava/lang/String; = "Content-Length"

.field private static final PARAM_CONTENT_TYPE:Ljava/lang/String; = "Content-Type"

.field private static final PARAM_HOST:Ljava/lang/String; = "Host"

.field private static final PARAM_IVERSION:Ljava/lang/String; = "iVersion"

.field private static final PARAM_LANGUAGE:Ljava/lang/String; = "language"

.field private static final PARAM_SERVICE_TOKEN:Ljava/lang/String; = "token"

.field private static final PARAM_TS:Ljava/lang/String; = "ts"

.field private static final PARAM_USER_AGENT:Ljava/lang/String; = "User-Agent"

.field private static final PARAM_X_HUID:Ljava/lang/String; = "x-huid"

.field private static final PARAM_X_VERSION:Ljava/lang/String; = "x-version"

.field private static final RED_PACKET_INFO_URL:Ljava/lang/String; = "getRedPacketInfo"

.field private static final START_ANIMATION:I = 0x1

.field private static final TAG:Ljava/lang/String; = "RedPacketManager"


# instance fields
.field private flRedPacket:Landroid/widget/FrameLayout;

.field private isFirst:Z

.field private isNeedRefresh:Z

.field private isRebPacketActivity:Z

.field private ivRedPacket:Landroid/widget/ImageView;

.field private lastClickTime:J

.field private mContext:Landroid/app/Activity;

.field private mFragment:Lcom/huawei/ui/homehealth/HomeFragment;

.field private mHomeFragmentCallback:Lcom/huawei/ui/homehealth/HomeFragment$c;

.field private mLayoutParams:Landroid/view/WindowManager$LayoutParams;

.field private mRedInfoUrl:Ljava/lang/String;

.field private mRedName:Ljava/lang/String;

.field private mRedPackerUrl:Ljava/lang/String;

.field private mRedPacketId:I

.field private mWindowManager:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/huawei/ui/homehealth/HomeFragment$c;Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 2

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isRebPacketActivity:Z

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isNeedRefresh:Z

    .line 100
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->lastClickTime:J

    .line 114
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isFirst:Z

    .line 117
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    .line 118
    iput-object p2, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mHomeFragmentCallback:Lcom/huawei/ui/homehealth/HomeFragment$c;

    .line 119
    iput-object p3, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mFragment:Lcom/huawei/ui/homehealth/HomeFragment;

    .line 120
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->init()V

    .line 121
    return-void
.end method

.method static synthetic access$002(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedInfoUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isRebPacketActivity:Z

    return v0
.end method

.method static synthetic access$102(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Z)Z
    .locals 0

    .line 53
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isRebPacketActivity:Z

    return p1
.end method

.method static synthetic access$200(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)J
    .locals 2

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->timeToDate(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$302(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedPackerUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$402(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;I)I
    .locals 0

    .line 53
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedPacketId:I

    return p1
.end method

.method static synthetic access$502(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedName:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$600(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Landroid/app/Activity;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->loadImage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Landroid/widget/ImageView;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    return-object v0
.end method

.method private dip2px(Landroid/content/Context;F)I
    .locals 3

    .line 407
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 408
    mul-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private getUTCTime()J
    .locals 5

    .line 368
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    .line 369
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 370
    invoke-virtual {v4, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 371
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private init()V
    .locals 4

    .line 124
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    const-string v0, "RedPacketManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Utils.isOversea()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isRebPacketActivity:Z

    .line 128
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->hintWindow()V

    .line 129
    return-void

    .line 131
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$1;-><init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 144
    return-void
.end method

.method private initImage()V
    .locals 8

    .line 265
    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    .line 266
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v6, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 268
    const/16 v0, 0x11

    iput v0, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v6}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 271
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    .line 272
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    .line 273
    const/high16 v1, 0x42300000    # 44.0f

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const/high16 v2, 0x42580000    # 54.0f

    invoke-direct {p0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v7, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 274
    const/16 v0, 0x11

    iput v0, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {p0, v2, v3}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {p0, v3, v4}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {p0, v4, v5}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 281
    :cond_0
    return-void
.end method

.method private initWindow()V
    .locals 3

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mWindowManager:Landroid/view/WindowManager;

    .line 249
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    const v1, 0x800055

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x28

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const/high16 v2, 0x428c0000    # 70.0f

    invoke-direct {p0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const/high16 v2, 0x428c0000    # 70.0f

    invoke-direct {p0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const/high16 v2, 0x41700000    # 15.0f

    invoke-direct {p0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-direct {p0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->dip2px(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 258
    return-void
.end method

.method private loadImage(Ljava/lang/String;)V
    .locals 2

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/app/Activity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/Target;

    .line 380
    :cond_0
    return-void
.end method

.method private timeToDate(Ljava/lang/String;)J
    .locals 8

    .line 394
    const-wide/16 v4, -0x1

    .line 395
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 397
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 398
    invoke-virtual {v6, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 402
    :cond_0
    goto :goto_0

    .line 400
    :catch_0
    move-exception v7

    .line 401
    const-string v0, "RedPacketManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    :goto_0
    return-wide v4
.end method


# virtual methods
.method public closeWindow()V
    .locals 2

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mWindowManager:Landroid/view/WindowManager;

    if-eqz v0, :cond_2

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mWindowManager:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 331
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    .line 333
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mWindowManager:Landroid/view/WindowManager;

    .line 336
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->ivRedPacket:Landroid/widget/ImageView;

    .line 337
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    .line 338
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 339
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    .line 340
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mFragment:Lcom/huawei/ui/homehealth/HomeFragment;

    .line 341
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mHomeFragmentCallback:Lcom/huawei/ui/homehealth/HomeFragment$c;

    .line 342
    return-void
.end method

.method public fetchRedPacketInfo()V
    .locals 9

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedInfoUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    const-string v0, "RedPacketManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TextUtils.isEmpty(mRedInfoUrl)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isRebPacketActivity:Z

    .line 153
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->hintWindow()V

    .line 154
    return-void

    .line 156
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedInfoUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/activity/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "getRedPacketInfo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 157
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 158
    const-string v0, "token"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    const-string v0, "appId"

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 162
    :cond_1
    const-string v0, "appId"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    :goto_0
    const-string v0, "appType"

    invoke-static {}, Lcom/huawei/operation/utils/OperationUtils;->getAppType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    const-string v0, "iVersion"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const-string v0, "language"

    const-string v1, "zh_CN"

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const-string v0, "ts"

    invoke-direct {p0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->getUTCTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 169
    const-string v0, "isBeta"

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 171
    :cond_2
    const-string v0, "isBeta"

    const-string v1, "0"

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    :goto_1
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 175
    const-string v0, "Connection"

    const-string v1, "keep-alive"

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    const-string v0, "x-version"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-static {v1}, Lo/dbf;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const-string v0, "x-huid"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    const-string v0, "Host"

    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    goto :goto_3

    .line 180
    :catch_0
    move-exception v7

    .line 181
    const-string v0, "RedPacketManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v8, "hwlf.hwcloudtest.cn:10180"

    goto :goto_2

    :cond_3
    const-string v8, "healthactivity.hicloud.com"

    .line 183
    :goto_2
    const-string v0, "Host"

    invoke-virtual {v6, v0, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    :goto_3
    const-string v0, "User-Agent"

    const-string v1, "Apache-HttpClient/4.2.6 (java 1.5)"

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    new-instance v1, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;-><init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)V

    invoke-static {v0, v4, v5, v6, v1}, Lcom/huawei/operation/https/HttpUtils;->postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/operation/https/HttpResCallBack;)I

    .line 242
    return-void
.end method

.method public hintWindow()V
    .locals 2

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mWindowManager:Landroid/view/WindowManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mWindowManager:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 320
    :cond_0
    return-void
.end method

.method public isNeedRefresh()Z
    .locals 1

    .line 383
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isNeedRefresh:Z

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 346
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->lastClickTime:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedPackerUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 347
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->lastClickTime:J

    .line 348
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isNeedRefresh:Z

    .line 349
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 350
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedPackerUrl:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 353
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 354
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    const-string v0, "redName"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedName:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    const-string v0, "redPacketId"

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mRedPacketId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    sget-object v2, Lo/dae;->bK:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mHomeFragmentCallback:Lcom/huawei/ui/homehealth/HomeFragment$c;

    if-eqz v0, :cond_0

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mHomeFragmentCallback:Lcom/huawei/ui/homehealth/HomeFragment$c;

    invoke-interface {v0}, Lcom/huawei/ui/homehealth/HomeFragment$c;->i()V

    .line 362
    :cond_0
    return-void
.end method

.method public setNeedRefresh(Z)V
    .locals 0

    .line 387
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isNeedRefresh:Z

    .line 388
    return-void
.end method

.method public showWindow()V
    .locals 4

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mContext:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_2

    .line 288
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isRebPacketActivity:Z

    if-eqz v0, :cond_2

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mWindowManager:Landroid/view/WindowManager;

    if-nez v0, :cond_0

    .line 290
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->initWindow()V

    .line 292
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    if-nez v0, :cond_1

    .line 293
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->initImage()V

    .line 295
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mWindowManager:Landroid/view/WindowManager;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mFragment:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mWindowManager:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->flRedPacket:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isFirst:Z

    if-eqz v0, :cond_2

    .line 298
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isFirst:Z

    .line 299
    new-instance v3, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;-><init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$1;)V

    .line 300
    const/4 v0, 0x1

    const-wide/16 v1, 0x3e8

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 301
    const/4 v0, 0x1

    const-wide/16 v1, 0xbb8

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 302
    const/4 v0, 0x1

    const-wide/16 v1, 0x1388

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 303
    const/4 v0, 0x2

    const-wide/16 v1, 0x1b58

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 309
    :cond_2
    return-void
.end method
