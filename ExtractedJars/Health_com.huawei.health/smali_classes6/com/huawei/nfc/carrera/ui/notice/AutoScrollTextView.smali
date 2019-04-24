.class public Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;
.super Landroid/widget/ViewSwitcher;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ViewSwitcher$ViewFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;
    }
.end annotation


# static fields
.field private static final DEFAULT_COLOR:Ljava/lang/String; = "000000"

.field private static final DEFAULT_SIZE:I = 0xc

.field private static final DELAY_TIME:I = 0x1388

.field private static final RUN_MARQUEE:I = 0x1002

.field private static final RUN_SWITCH:I = 0x1001

.field private static final START_DELAY:I = 0x1f4

.field private static final TAG:Ljava/lang/String; = "AutoScrollTextView"


# instance fields
.field private isRunning:Z

.field private mContext:Landroid/content/Context;

.field private mCurrentPosition:I

.field private mHandler:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field

.field private mInDown:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

.field private mInUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

.field mLastTime:J

.field private mNext:I

.field private mNoticeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;"
        }
    .end annotation
.end field

.field private mOutDown:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

.field private mOutUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

.field private mTextColor:Ljava/lang/String;

.field private textView:Landroid/widget/TextView;

.field private timer:Ljava/util/Timer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 96
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 97
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 101
    invoke-direct {p0, p1, p2}, Landroid/widget/ViewSwitcher;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 77
    const-string v0, "000000"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mTextColor:Ljava/lang/String;

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNoticeList:Ljava/util/List;

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mCurrentPosition:I

    .line 86
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNext:I

    .line 92
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mLastTime:J

    .line 327
    new-instance v0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$2;-><init>(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mHandler:Landroid/os/Handler;

    .line 102
    sget-object v0, Lcom/huawei/wallet/R$styleable;->AutoScrollTextView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 103
    sget v0, Lcom/huawei/wallet/R$styleable;->AutoScrollTextView_text_color:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mTextColor:Ljava/lang/String;

    .line 104
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 106
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mContext:Landroid/content/Context;

    .line 107
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->init()V

    .line 108
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Landroid/os/Handler;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Ljava/util/List;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNoticeList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mCurrentPosition:I

    return v0
.end method

.method static synthetic access$202(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;I)I
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mCurrentPosition:I

    return p1
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNext:I

    return v0
.end method

.method static synthetic access$302(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;I)I
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNext:I

    return p1
.end method

.method static synthetic access$308(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)I
    .locals 2

    .line 38
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNext:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNext:I

    return v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Landroid/content/Context;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)Landroid/widget/TextView;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->textView:Landroid/widget/TextView;

    return-object v0
.end method

.method private createAnim(FFZZ)Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;
    .locals 7

    .line 123
    new-instance v0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;-><init>(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;FFZZ)V

    move-object v6, v0

    .line 124
    const-wide/16 v0, 0x12c

    invoke-virtual {v6, v0, v1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->setDuration(J)V

    .line 125
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->setFillAfter(Z)V

    .line 126
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 127
    return-object v6
.end method

.method public static dipToPX(Landroid/content/Context;F)I
    .locals 2

    .line 186
    .line 187
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    .line 186
    return v0
.end method

.method private init()V
    .locals 4

    .line 112
    invoke-virtual {p0, p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setFactory(Landroid/widget/ViewSwitcher$ViewFactory;)V

    .line 113
    const/high16 v0, -0x3d4c0000    # -90.0f

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->createAnim(FFZZ)Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mInUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    .line 114
    const/4 v0, 0x0

    const/high16 v1, 0x42b40000    # 90.0f

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->createAnim(FFZZ)Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mOutUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    .line 115
    const/high16 v0, 0x42b40000    # 90.0f

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->createAnim(FFZZ)Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mInDown:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    .line 116
    const/4 v0, 0x0

    const/high16 v1, -0x3d4c0000    # -90.0f

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->createAnim(FFZZ)Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mOutDown:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    .line 117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mInUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mOutUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setOutAnimation(Landroid/view/animation/Animation;)V

    .line 119
    return-void
.end method

.method public static setAutoSize(Landroid/content/Context;Landroid/widget/TextView;F)V
    .locals 2

    .line 192
    invoke-static {p0, p2}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->sp2px(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 193
    return-void
.end method

.method public static sp2px(Landroid/content/Context;F)I
    .locals 3

    .line 197
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 198
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private start()V
    .locals 6

    .line 360
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNoticeList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 362
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNoticeList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->getContent()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mContext:Landroid/content/Context;

    const/high16 v2, 0x41700000    # 15.0f

    invoke-static {v1, v2}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->sp2px(Landroid/content/Context;F)I

    move-result v1

    const-string v2, "FZYOUH_508R--GB1-4"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->buildText(Ljava/lang/CharSequence;ILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setView(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 366
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->timer:Ljava/util/Timer;

    if-nez v0, :cond_1

    .line 368
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->timer:Ljava/util/Timer;

    .line 370
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->timer:Ljava/util/Timer;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$3;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$3;-><init>(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1388

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 384
    :goto_0
    return-void
.end method


# virtual methods
.method public buildText(Ljava/lang/CharSequence;ILjava/lang/String;)Landroid/text/SpannableString;
    .locals 7

    .line 393
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 394
    const/high16 v5, -0x1000000

    .line 397
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mTextColor:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 399
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mTextColor:Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 405
    :cond_0
    goto :goto_0

    .line 402
    :catch_0
    move-exception v6

    .line 404
    const-string v0, "AutoScrollTextView"

    const-string v1, "color parse error IllegalArgumentException!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 406
    :goto_0
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 407
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v4, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 408
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {v0, p2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v4, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 409
    new-instance v0, Landroid/text/style/TypefaceSpan;

    invoke-direct {v0, p3}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v4, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 411
    return-object v4
.end method

.method public getCurrentPosition()I
    .locals 1

    .line 388
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mCurrentPosition:I

    return v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .line 293
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getCurrentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public makeView()Landroid/view/View;
    .locals 4

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->nfc_card_notice_text_view:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public next()V
    .locals 2

    .line 215
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getInAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mInUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    if-eq v0, v1, :cond_0

    .line 217
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mInUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 219
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getOutAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mOutUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    if-eq v0, v1, :cond_1

    .line 221
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mOutUp:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setOutAnimation(Landroid/view/animation/Animation;)V

    .line 223
    :cond_1
    return-void
.end method

.method public previous()V
    .locals 2

    .line 203
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getInAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mInDown:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    if-eq v0, v1, :cond_0

    .line 205
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mInDown:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 207
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getOutAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mOutDown:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    if-eq v0, v1, :cond_1

    .line 209
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mOutDown:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setOutAnimation(Landroid/view/animation/Animation;)V

    .line 211
    :cond_1
    return-void
.end method

.method public setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;)V"
        }
    .end annotation

    .line 298
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNoticeList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNoticeList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 302
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNoticeList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 303
    return-void
.end method

.method public setView(Ljava/lang/CharSequence;)V
    .locals 7

    .line 140
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getNextView()Landroid/view/View;

    move-result-object v4

    .line 141
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 142
    return-void

    .line 144
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->tv_notice_text:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->textView:Landroid/widget/TextView;

    .line 145
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->textView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->textView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 150
    sget v0, Lcom/huawei/wallet/R$id;->iv_notice_arrow:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 151
    const/4 v6, 0x0

    .line 152
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNoticeList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getCurrentPosition()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 154
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mNoticeList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getCurrentPosition()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->getClickUrl()Ljava/lang/String;

    move-result-object v6

    .line 157
    :cond_1
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 159
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 163
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 167
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->showNext()V

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->timer:Ljava/util/Timer;

    if-nez v0, :cond_3

    .line 172
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->timer:Ljava/util/Timer;

    .line 174
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->timer:Ljava/util/Timer;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$1;-><init>(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 182
    return-void
.end method

.method public startAutoRun()V
    .locals 1

    .line 309
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->isRunning:Z

    if-nez v0, :cond_0

    .line 311
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->start()V

    .line 312
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->isRunning:Z

    .line 314
    :cond_0
    return-void
.end method

.method public stopAutoRun()V
    .locals 2

    .line 318
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 320
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 321
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->timer:Ljava/util/Timer;

    .line 322
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->isRunning:Z

    .line 323
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 325
    :cond_0
    return-void
.end method
