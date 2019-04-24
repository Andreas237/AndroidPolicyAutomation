.class public Lo/byg;
.super Lo/efy;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/animation/ScaleAnimation;

.field private b:Landroid/view/animation/AlphaAnimation;

.field private c:Landroid/view/animation/AnimationSet;

.field private d:Ljava/lang/String;

.field private e:Landroid/content/Context;

.field private f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lo/efy;-><init>(Landroid/content/Context;)V

    .line 65
    iput-object p1, p0, Lo/byg;->e:Landroid/content/Context;

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Lo/efy;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 70
    iput-object p1, p0, Lo/byg;->e:Landroid/content/Context;

    .line 71
    return-void
.end method

.method static synthetic c(Lo/byg;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/byg;->f:I

    return v0
.end method

.method private d(FFFFIII)V
    .locals 9

    .line 83
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/byg;->setAlpha(F)V

    .line 85
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p1, p2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    iput-object v0, p0, Lo/byg;->b:Landroid/view/animation/AlphaAnimation;

    .line 87
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move v1, p3

    move v2, p4

    move v3, p3

    move v4, p4

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    iput-object v0, p0, Lo/byg;->a:Landroid/view/animation/ScaleAnimation;

    .line 89
    new-instance v0, Landroid/view/animation/AnimationSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    iput-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    .line 90
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    iget-object v1, p0, Lo/byg;->b:Landroid/view/animation/AlphaAnimation;

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 91
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    iget-object v1, p0, Lo/byg;->a:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 92
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    int-to-long v1, p5

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 93
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 95
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    new-instance v1, Lo/byg$2;

    move/from16 v2, p7

    invoke-direct {v1, p0, p6, v2}, Lo/byg$2;-><init>(Lo/byg;II)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 125
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    invoke-virtual {p0, v0}, Lo/byg;->startAnimation(Landroid/view/animation/Animation;)V

    .line 126
    return-void
.end method

.method private e(I)V
    .locals 10

    .line 134
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/byg;->setAlpha(F)V

    .line 135
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/byg;->d:Ljava/lang/String;

    .line 136
    if-nez p1, :cond_0

    .line 137
    const-string v0, "GO"

    iput-object v0, p0, Lo/byg;->d:Ljava/lang/String;

    .line 138
    const/4 v0, 0x2

    const/high16 v1, 0x43160000    # 150.0f

    invoke-virtual {p0, v0, v1}, Lo/byg;->setTextSize(IF)V

    .line 139
    const-string v0, "scans-serif-condensed"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/byg;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_0

    .line 141
    :cond_0
    const/4 v0, 0x2

    const/high16 v1, 0x43480000    # 200.0f

    invoke-virtual {p0, v0, v1}, Lo/byg;->setTextSize(IF)V

    .line 142
    iget-object v0, p0, Lo/byg;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v9

    .line 143
    const-string v0, "fonts/Roboto_Medium.ttf"

    invoke-static {v9, v0}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/byg;->setTypeface(Landroid/graphics/Typeface;)V

    .line 145
    :goto_0
    iget-object v0, p0, Lo/byg;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/byg;->setText(Ljava/lang/CharSequence;)V

    .line 147
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lo/byg;->setGravity(I)V

    .line 148
    invoke-virtual {p0}, Lo/byg;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/byg;->setTextColor(I)V

    .line 149
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/byg;->setLayerType(ILandroid/graphics/Paint;)V

    .line 151
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x41200000    # 10.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x41200000    # 10.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    iput-object v0, p0, Lo/byg;->a:Landroid/view/animation/ScaleAnimation;

    .line 153
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    iput-object v0, p0, Lo/byg;->b:Landroid/view/animation/AlphaAnimation;

    .line 154
    new-instance v0, Landroid/view/animation/AnimationSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    iput-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    .line 155
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    iget-object v1, p0, Lo/byg;->b:Landroid/view/animation/AlphaAnimation;

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 156
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    iget-object v1, p0, Lo/byg;->a:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 157
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 158
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 160
    iget-object v0, p0, Lo/byg;->c:Landroid/view/animation/AnimationSet;

    invoke-virtual {p0, v0}, Lo/byg;->startAnimation(Landroid/view/animation/Animation;)V

    .line 162
    return-void
.end method

.method static synthetic e(Lo/byg;FFFFIII)V
    .locals 0

    .line 27
    invoke-direct/range {p0 .. p7}, Lo/byg;->d(FFFFIII)V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 8

    .line 76
    iput p1, p0, Lo/byg;->f:I

    .line 77
    invoke-direct {p0, p1}, Lo/byg;->e(I)V

    .line 78
    move-object v0, p0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x41200000    # 10.0f

    const/high16 v4, 0x3f800000    # 1.0f

    const/16 v5, 0x12c

    const/4 v6, 0x0

    const/16 v7, 0x190

    invoke-direct/range {v0 .. v7}, Lo/byg;->d(FFFFIII)V

    .line 80
    return-void
.end method
