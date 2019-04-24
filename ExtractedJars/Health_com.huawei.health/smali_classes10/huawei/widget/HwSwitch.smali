.class public Lhuawei/widget/HwSwitch;
.super Landroid/widget/Switch;
.source "SourceFile"


# static fields
.field private static final HWSTYLE_THUMB_LAYOUT_PADDING:I = 0x2

.field private static final HW_THUMB_ANIMATION_DURATION:I = 0xc8

.field private static final THUMB_POS:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<Lhuawei/widget/HwSwitch;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private static final TOUCH_MODE_DOWN:I = 0x1

.field private static final TOUCH_MODE_DRAGGING:I = 0x2

.field private static final TOUCH_MODE_IDLE:I = 0x0


# instance fields
.field private mMinFlingVelocity:I

.field private mPositionAnimator:Landroid/animation/ObjectAnimator;

.field private mSwitchBottom:I

.field private mSwitchLeft:I

.field private mSwitchRight:I

.field private mSwitchTop:I

.field private mSwitchWidth:I

.field private final mTempRect:Landroid/graphics/Rect;

.field private mThumbDrawable:Landroid/graphics/drawable/Drawable;

.field private mThumbLayoutPadding:I

.field private mThumbPosition:F

.field private mThumbWidth:I

.field private mTouchMode:I

.field private mTouchSlop:I

.field private mTouchX:F

.field private mTouchY:F

.field private mTrackDrawable:Landroid/graphics/drawable/Drawable;

.field private mVelocityTracker:Landroid/view/VelocityTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 471
    new-instance v0, Lhuawei/widget/HwSwitch$1;

    const-string v1, "thumbPos"

    invoke-direct {v0, v1}, Lhuawei/widget/HwSwitch$1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lhuawei/widget/HwSwitch;->THUMB_POS:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 74
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwSwitch;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 78
    invoke-direct {p0, p1, p2}, Landroid/widget/Switch;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 69
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSwitch;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 70
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwSwitch;->mTempRect:Landroid/graphics/Rect;

    .line 79
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 81
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v5, v0, Landroid/util/DisplayMetrics;->density:F

    .line 82
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Lhuawei/widget/HwSwitch;->mThumbLayoutPadding:I

    .line 84
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 87
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lhuawei/widget/HwSwitch;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 88
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 6

    .line 91
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Switch;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 69
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSwitch;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 70
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwSwitch;->mTempRect:Landroid/graphics/Rect;

    .line 93
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 95
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v5, v0, Landroid/util/DisplayMetrics;->density:F

    .line 96
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Lhuawei/widget/HwSwitch;->mThumbLayoutPadding:I

    .line 98
    return-void
.end method

.method static synthetic access$000(Lhuawei/widget/HwSwitch;)F
    .locals 1

    .line 21
    iget v0, p0, Lhuawei/widget/HwSwitch;->mThumbPosition:F

    return v0
.end method

.method static synthetic access$100(Lhuawei/widget/HwSwitch;F)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lhuawei/widget/HwSwitch;->setThumbPosition(F)V

    return-void
.end method

.method private animateThumbToCheckedState(Z)V
    .locals 7

    .line 229
    if-eqz p1, :cond_0

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 230
    :goto_0
    sget-object v0, Lhuawei/widget/HwSwitch;->THUMB_POS:Landroid/util/Property;

    const/4 v1, 0x1

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput v6, v1, v2

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwSwitch;->mPositionAnimator:Landroid/animation/ObjectAnimator;

    .line 232
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mPositionAnimator:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 234
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mPositionAnimator:Landroid/animation/ObjectAnimator;

    new-instance v1, Lo/flf;

    const v2, 0x3dcccccd    # 0.1f

    const/high16 v3, 0x3f800000    # 1.0f

    const v4, 0x3f666666    # 0.9f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3, v4, v5}, Lo/flf;-><init>(FFFF)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 236
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    .line 237
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mPositionAnimator:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V

    goto :goto_1

    .line 239
    :cond_1
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mPositionAnimator:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 241
    :goto_1
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mPositionAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 242
    return-void
.end method

.method private cancelPositionAnimator()V
    .locals 1

    .line 255
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mPositionAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mPositionAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 258
    :cond_0
    return-void
.end method

.method private cancelSuperTouch(Landroid/view/MotionEvent;)V
    .locals 2

    .line 438
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    .line 439
    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 440
    invoke-super {p0, v1}, Landroid/widget/Switch;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 441
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 442
    return-void
.end method

.method private clearThumbDrawableBound()V
    .locals 6

    .line 199
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v5

    .line 200
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 201
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 202
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 203
    return-void
.end method

.method private constrain(FFF)F
    .locals 1

    .line 449
    cmpg-float v0, p1, p2

    if-gez v0, :cond_0

    move v0, p2

    goto :goto_0

    :cond_0
    cmpl-float v0, p1, p3

    if-lez v0, :cond_1

    move v0, p3

    goto :goto_0

    :cond_1
    move v0, p1

    :goto_0
    return v0
.end method

.method private drawPadding()V
    .locals 16

    .line 102
    const-string v0, "mSwitchLeft"

    const-class v1, Landroid/widget/Switch;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lhuawei/widget/HwSwitch;->mSwitchLeft:I

    .line 103
    const-string v0, "mSwitchTop"

    const-class v1, Landroid/widget/Switch;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lhuawei/widget/HwSwitch;->mSwitchTop:I

    .line 104
    const-string v0, "mSwitchRight"

    const-class v1, Landroid/widget/Switch;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lhuawei/widget/HwSwitch;->mSwitchRight:I

    .line 105
    const-string v0, "mSwitchBottom"

    const-class v1, Landroid/widget/Switch;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lhuawei/widget/HwSwitch;->mSwitchBottom:I

    .line 107
    move-object/from16 v0, p0

    iget-object v5, v0, Lhuawei/widget/HwSwitch;->mTempRect:Landroid/graphics/Rect;

    .line 108
    move-object/from16 v0, p0

    iget v6, v0, Lhuawei/widget/HwSwitch;->mSwitchLeft:I

    .line 109
    move-object/from16 v0, p0

    iget v7, v0, Lhuawei/widget/HwSwitch;->mSwitchTop:I

    .line 110
    move-object/from16 v0, p0

    iget v8, v0, Lhuawei/widget/HwSwitch;->mSwitchRight:I

    .line 111
    move-object/from16 v0, p0

    iget v9, v0, Lhuawei/widget/HwSwitch;->mSwitchBottom:I

    .line 113
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 114
    const-string v0, "mThumbDrawable"

    const-class v1, Landroid/widget/Switch;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    move-object/from16 v1, p0

    iput-object v0, v1, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    .line 116
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mTrackDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    .line 117
    const-string v0, "mTrackDrawable"

    const-class v1, Landroid/widget/Switch;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    move-object/from16 v1, p0

    iput-object v0, v1, Lhuawei/widget/HwSwitch;->mTrackDrawable:Landroid/graphics/drawable/Drawable;

    .line 120
    :cond_1
    const-string v0, "mThumbWidth"

    const-class v1, Landroid/widget/Switch;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lhuawei/widget/HwSwitch;->mThumbWidth:I

    .line 122
    invoke-direct/range {p0 .. p0}, Lhuawei/widget/HwSwitch;->getThumbOffset()I

    move-result v0

    add-int v10, v6, v0

    .line 125
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwSwitch;->mThumbLayoutPadding:I

    add-int/2addr v10, v0

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    .line 130
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    const-string v1, "getOpticalInsets"

    const-class v2, Landroid/graphics/drawable/DrawableContainer;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v3, v4, v2}, Lo/fkw;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/graphics/Insets;

    .line 131
    if-eqz v12, :cond_2

    .line 132
    move-object v11, v12

    goto :goto_0

    .line 134
    :cond_2
    sget-object v11, Landroid/graphics/Insets;->NONE:Landroid/graphics/Insets;

    .line 136
    :goto_0
    goto :goto_1

    .line 137
    :cond_3
    sget-object v11, Landroid/graphics/Insets;->NONE:Landroid/graphics/Insets;

    .line 141
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mTrackDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mTrackDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 145
    iget v0, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v10, v0

    .line 148
    move v12, v6

    .line 149
    move v13, v7

    .line 150
    move v14, v8

    .line 151
    move v15, v9

    .line 152
    sget-object v0, Landroid/graphics/Insets;->NONE:Landroid/graphics/Insets;

    if-eq v11, v0, :cond_7

    .line 153
    iget v0, v11, Landroid/graphics/Insets;->left:I

    iget v1, v5, Landroid/graphics/Rect;->left:I

    if-le v0, v1, :cond_4

    .line 154
    iget v0, v11, Landroid/graphics/Insets;->left:I

    iget v1, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    add-int/2addr v12, v0

    .line 156
    :cond_4
    iget v0, v11, Landroid/graphics/Insets;->top:I

    iget v1, v5, Landroid/graphics/Rect;->top:I

    if-le v0, v1, :cond_5

    .line 157
    iget v0, v11, Landroid/graphics/Insets;->top:I

    iget v1, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v1

    add-int/2addr v13, v0

    .line 159
    :cond_5
    iget v0, v11, Landroid/graphics/Insets;->right:I

    iget v1, v5, Landroid/graphics/Rect;->right:I

    if-le v0, v1, :cond_6

    .line 160
    iget v0, v11, Landroid/graphics/Insets;->right:I

    iget v1, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v1

    sub-int/2addr v14, v0

    .line 162
    :cond_6
    iget v0, v11, Landroid/graphics/Insets;->bottom:I

    iget v1, v5, Landroid/graphics/Rect;->bottom:I

    if-le v0, v1, :cond_7

    .line 163
    iget v0, v11, Landroid/graphics/Insets;->bottom:I

    iget v1, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v1

    sub-int/2addr v15, v0

    .line 166
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mTrackDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v12, v13, v14, v15}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 170
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 172
    iget v0, v5, Landroid/graphics/Rect;->left:I

    sub-int v12, v10, v0

    .line 173
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwSwitch;->mThumbWidth:I

    add-int/2addr v0, v10

    iget v1, v5, Landroid/graphics/Rect;->right:I

    add-int v13, v0, v1

    .line 175
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v14

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 177
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v12, v7, v13, v9}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v14}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 180
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwSwitch;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v15

    .line 181
    if-eqz v15, :cond_a

    .line 182
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_9

    .line 183
    invoke-virtual {v15, v12, v7, v13, v9}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V

    goto :goto_2

    .line 185
    :cond_9
    invoke-virtual {v15, v12, v7, v13, v9}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 189
    :cond_a
    :goto_2
    return-void
.end method

.method private getTargetCheckedState()Z
    .locals 2

    .line 445
    iget v0, p0, Lhuawei/widget/HwSwitch;->mThumbPosition:F

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getThumbOffset()I
    .locals 3

    .line 269
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->isRtlLocale()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    iget v0, p0, Lhuawei/widget/HwSwitch;->mThumbPosition:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v2, v1, v0

    goto :goto_0

    .line 273
    :cond_0
    iget v2, p0, Lhuawei/widget/HwSwitch;->mThumbPosition:F

    .line 275
    :goto_0
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->getThumbScrollRange()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private getThumbScrollRange()I
    .locals 8

    .line 280
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mTrackDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 281
    iget-object v5, p0, Lhuawei/widget/HwSwitch;->mTempRect:Landroid/graphics/Rect;

    .line 282
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mTrackDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 285
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 286
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    const-string v1, "getOpticalInsets"

    const-class v2, Landroid/graphics/drawable/DrawableContainer;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v3, v4, v2}, Lo/fkw;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/graphics/Insets;

    .line 287
    if-eqz v7, :cond_0

    .line 288
    move-object v6, v7

    goto :goto_0

    .line 290
    :cond_0
    sget-object v6, Landroid/graphics/Insets;->NONE:Landroid/graphics/Insets;

    .line 292
    :goto_0
    goto :goto_1

    .line 293
    :cond_1
    sget-object v6, Landroid/graphics/Insets;->NONE:Landroid/graphics/Insets;

    .line 295
    :goto_1
    const-string v0, "mSwitchWidth"

    const-class v1, Landroid/widget/Switch;

    invoke-static {p0, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSwitch;->mSwitchWidth:I

    .line 296
    iget v0, p0, Lhuawei/widget/HwSwitch;->mSwitchWidth:I

    iget v1, p0, Lhuawei/widget/HwSwitch;->mThumbWidth:I

    sub-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v1

    iget v1, v6, Landroid/graphics/Insets;->left:I

    sub-int/2addr v0, v1

    iget v1, v6, Landroid/graphics/Insets;->right:I

    sub-int/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwSwitch;->mThumbLayoutPadding:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    return v0

    .line 299
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private hitThumb(FF)Z
    .locals 7

    .line 307
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 308
    const/4 v0, 0x0

    return v0

    .line 311
    :cond_0
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->getThumbOffset()I

    move-result v2

    .line 312
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lhuawei/widget/HwSwitch;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 313
    const-string v0, "mTouchSlop"

    const-class v1, Landroid/widget/Switch;

    invoke-static {p0, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSwitch;->mTouchSlop:I

    .line 314
    iget v0, p0, Lhuawei/widget/HwSwitch;->mSwitchTop:I

    iget v1, p0, Lhuawei/widget/HwSwitch;->mTouchSlop:I

    sub-int v3, v0, v1

    .line 315
    iget v0, p0, Lhuawei/widget/HwSwitch;->mSwitchLeft:I

    add-int/2addr v0, v2

    iget v1, p0, Lhuawei/widget/HwSwitch;->mTouchSlop:I

    sub-int v4, v0, v1

    .line 316
    iget v0, p0, Lhuawei/widget/HwSwitch;->mThumbWidth:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lhuawei/widget/HwSwitch;->mTempRect:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lhuawei/widget/HwSwitch;->mTempRect:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwSwitch;->mTouchSlop:I

    add-int v5, v0, v1

    .line 318
    iget v0, p0, Lhuawei/widget/HwSwitch;->mSwitchBottom:I

    iget v1, p0, Lhuawei/widget/HwSwitch;->mTouchSlop:I

    add-int v6, v0, v1

    .line 319
    int-to-float v0, v4

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    int-to-float v0, v5

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    int-to-float v0, v3

    cmpl-float v0, p2, v0

    if-lez v0, :cond_1

    int-to-float v0, v6

    cmpg-float v0, p2, v0

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isLayoutRtl()Z
    .locals 2

    .line 464
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 465
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 467
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private isRtlLocale()Z
    .locals 2

    .line 453
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 454
    const-string v0, "ar"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fa"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "iw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ug"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ur"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->isLayoutRtl()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private setThumbPosition(F)V
    .locals 0

    .line 250
    iput p1, p0, Lhuawei/widget/HwSwitch;->mThumbPosition:F

    .line 251
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->invalidate()V

    .line 252
    return-void
.end method

.method private stopDrag(Landroid/view/MotionEvent;)V
    .locals 6

    .line 405
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/widget/HwSwitch;->mTouchMode:I

    .line 409
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 410
    :goto_0
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->isChecked()Z

    move-result v3

    .line 412
    if-eqz v2, :cond_5

    .line 413
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mVelocityTracker:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 414
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v5

    .line 415
    const-string v0, "mMinFlingVelocity"

    const-class v1, Landroid/widget/Switch;

    invoke-static {p0, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSwitch;->mMinFlingVelocity:I

    .line 416
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSwitch;->mMinFlingVelocity:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 418
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->isRtlLocale()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-lez v0, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    goto :goto_2

    .line 421
    :cond_4
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->getTargetCheckedState()Z

    move-result v4

    .line 423
    :goto_2
    goto :goto_3

    .line 424
    :cond_5
    move v4, v3

    .line 427
    :goto_3
    if-eq v4, v3, :cond_6

    .line 428
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSwitch;->playSoundEffect(I)V

    .line 431
    :cond_6
    invoke-virtual {p0, v4}, Lhuawei/widget/HwSwitch;->setChecked(Z)V

    .line 434
    invoke-direct {p0, p1}, Lhuawei/widget/HwSwitch;->cancelSuperTouch(Landroid/view/MotionEvent;)V

    .line 435
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 193
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->drawPadding()V

    .line 194
    invoke-super {p0, p1}, Landroid/widget/Switch;->onDraw(Landroid/graphics/Canvas;)V

    .line 195
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->clearThumbDrawableBound()V

    .line 196
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 324
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 325
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    .line 326
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_2

    .line 328
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    .line 329
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 330
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-direct {p0, v4, v5}, Lhuawei/widget/HwSwitch;->hitThumb(FF)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 331
    const/4 v0, 0x1

    iput v0, p0, Lhuawei/widget/HwSwitch;->mTouchMode:I

    .line 332
    iput v4, p0, Lhuawei/widget/HwSwitch;->mTouchX:F

    .line 333
    iput v5, p0, Lhuawei/widget/HwSwitch;->mTouchY:F

    goto/16 :goto_2

    .line 338
    :pswitch_1
    iget v0, p0, Lhuawei/widget/HwSwitch;->mTouchMode:I

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_1

    .line 341
    :pswitch_2
    goto/16 :goto_1

    .line 343
    :pswitch_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    .line 344
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 345
    const-string v0, "mTouchSlop"

    const-class v1, Landroid/widget/Switch;

    invoke-static {p0, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSwitch;->mTouchSlop:I

    .line 346
    iget v0, p0, Lhuawei/widget/HwSwitch;->mTouchX:F

    sub-float v0, v4, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSwitch;->mTouchSlop:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_0

    iget v0, p0, Lhuawei/widget/HwSwitch;->mTouchY:F

    sub-float v0, v5, v0

    .line 347
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lhuawei/widget/HwSwitch;->mTouchSlop:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 348
    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lhuawei/widget/HwSwitch;->mTouchMode:I

    .line 349
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 350
    iput v4, p0, Lhuawei/widget/HwSwitch;->mTouchX:F

    .line 351
    iput v5, p0, Lhuawei/widget/HwSwitch;->mTouchY:F

    .line 352
    const/4 v0, 0x1

    return v0

    .line 357
    :pswitch_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    .line 358
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->getThumbScrollRange()I

    move-result v5

    .line 359
    iget v0, p0, Lhuawei/widget/HwSwitch;->mTouchX:F

    sub-float v6, v4, v0

    .line 361
    if-eqz v5, :cond_1

    .line 362
    int-to-float v0, v5

    div-float v7, v6, v0

    goto :goto_0

    .line 366
    :cond_1
    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_2

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_2
    const/high16 v7, -0x40800000    # -1.0f

    .line 368
    :goto_0
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->isLayoutRtl()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 369
    neg-float v7, v7

    .line 371
    :cond_3
    iget v0, p0, Lhuawei/widget/HwSwitch;->mThumbPosition:F

    add-float/2addr v0, v7

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v2}, Lhuawei/widget/HwSwitch;->constrain(FFF)F

    move-result v8

    .line 372
    iget v0, p0, Lhuawei/widget/HwSwitch;->mThumbPosition:F

    cmpl-float v0, v8, v0

    if-eqz v0, :cond_4

    .line 373
    iput v4, p0, Lhuawei/widget/HwSwitch;->mTouchX:F

    .line 374
    invoke-direct {p0, v8}, Lhuawei/widget/HwSwitch;->setThumbPosition(F)V

    .line 376
    :cond_4
    const/4 v0, 0x1

    return v0

    .line 379
    :cond_5
    :goto_1
    goto :goto_2

    .line 383
    :pswitch_5
    iget v0, p0, Lhuawei/widget/HwSwitch;->mTouchMode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 384
    invoke-direct {p0, p1}, Lhuawei/widget/HwSwitch;->stopDrag(Landroid/view/MotionEvent;)V

    .line 386
    invoke-super {p0, p1}, Landroid/widget/Switch;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 387
    const/4 v0, 0x1

    return v0

    .line 389
    :cond_6
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/widget/HwSwitch;->mTouchMode:I

    .line 390
    iget-object v0, p0, Lhuawei/widget/HwSwitch;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 391
    .line 396
    :cond_7
    :goto_2
    invoke-super {p0, p1}, Landroid/widget/Switch;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_5
        :pswitch_1
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public setChecked(Z)V
    .locals 2

    .line 207
    invoke-super {p0, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 210
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->isChecked()Z

    move-result p1

    .line 211
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    .line 212
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    invoke-direct {p0, p1}, Lhuawei/widget/HwSwitch;->animateThumbToCheckedState(Z)V

    goto :goto_2

    .line 215
    :cond_0
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->cancelPositionAnimator()V

    .line 216
    if-eqz p1, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lhuawei/widget/HwSwitch;->setThumbPosition(F)V

    goto :goto_2

    .line 219
    :cond_2
    invoke-virtual {p0}, Lhuawei/widget/HwSwitch;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 220
    invoke-direct {p0, p1}, Lhuawei/widget/HwSwitch;->animateThumbToCheckedState(Z)V

    goto :goto_2

    .line 222
    :cond_3
    invoke-direct {p0}, Lhuawei/widget/HwSwitch;->cancelPositionAnimator()V

    .line 223
    if-eqz p1, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p0, v0}, Lhuawei/widget/HwSwitch;->setThumbPosition(F)V

    .line 226
    :goto_2
    return-void
.end method
