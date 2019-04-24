.class public Lhuawei/widget/HwNumberPicker;
.super Lhuawei/widget/NumberPickerProxy;
.source "SourceFile"


# static fields
.field private static final MAX_STREAMS:I = 0x1

.field private static final SELECTOR_COUNT:I = 0x5

.field private static final SELECTOR_MIDDLE_INDEX:I = 0x2

.field private static final SOUND_LEFT_VOLUME:F = 1.0f

.field private static final SOUND_LOOP:I = 0x0

.field private static final SOUND_PRIORITY:I = 0x0

.field private static final SOUND_RATE:F = 1.0f

.field private static final SOUND_RIGHT_VOLUME:F = 1.0f

.field private static final TAG:Ljava/lang/String; = "fitatc"


# instance fields
.field private baselinePaint:Landroid/graphics/Paint;

.field mDefaultTypeface:Landroid/graphics/Typeface;

.field mHwChineseMediumTypeface:Landroid/graphics/Typeface;

.field mNormalTextSize:I

.field mSelectorTextColor:I

.field mSelectorTextSize:I

.field mSmallTextColor:I

.field private mSoundId:I

.field private mSoundLoadFinished:Z

.field private mSoundPool:Landroid/media/SoundPool;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 42
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwNumberPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 46
    sget v0, Lhuawei/widget/hwnumberpicker/R$attr;->numberPickerStyle:I

    invoke-direct {p0, p1, p2, v0}, Lhuawei/widget/HwNumberPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 50
    invoke-direct {p0, p1, p2, p3}, Lhuawei/widget/NumberPickerProxy;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundId:I

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundLoadFinished:Z

    .line 68
    sget-object v0, Lhuawei/widget/hwnumberpicker/R$styleable;->HwNumberPicker:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 69
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 70
    sget v0, Lhuawei/widget/hwnumberpicker/R$styleable;->HwNumberPicker_selectionDividerHeight:I

    sget v1, Lhuawei/widget/hwnumberpicker/R$dimen;->hwnumberpicker_divider_horizontal_height_emui:I

    .line 71
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 70
    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mSelectionDividerHeight:I

    .line 72
    sget v0, Lhuawei/widget/hwnumberpicker/R$styleable;->HwNumberPicker_selectionDivider:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    .line 74
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhuawei/widget/HwNumberPicker;->mHasSelectorWheel:Z

    .line 75
    sget v0, Lhuawei/widget/hwnumberpicker/R$styleable;->HwNumberPicker_selectionDividersDistance:I

    sget v1, Lhuawei/widget/hwnumberpicker/R$dimen;->hwnumberpicker_select_divider_distance:I

    .line 77
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 75
    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mSelectionDividersDistance:I

    .line 79
    sget v0, Lhuawei/widget/hwnumberpicker/R$styleable;->HwNumberPicker_internalMaxHeight:I

    sget v1, Lhuawei/widget/hwnumberpicker/R$dimen;->hwnumberpicker_max_height:I

    .line 81
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 79
    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mMaxHeight:I

    .line 82
    sget v0, Lhuawei/widget/hwnumberpicker/R$styleable;->HwNumberPicker_internalMinWidth:I

    sget v1, Lhuawei/widget/hwnumberpicker/R$dimen;->hwnumberpicker_min_width:I

    .line 84
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 82
    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mMinWidth:I

    .line 85
    sget v0, Lhuawei/widget/hwnumberpicker/R$styleable;->HwNumberPicker_virtualButtonPressedDrawable:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwNumberPicker;->mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;

    .line 87
    sget v0, Lhuawei/widget/hwnumberpicker/R$dimen;->hwnumberpicker_select_element_height:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mSelectorElementHeight:I

    .line 89
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker;->mDefaultTypeface:Landroid/graphics/Typeface;

    iget v1, p0, Lhuawei/widget/HwNumberPicker;->mNormalTextSize:I

    int-to-float v1, v1

    iget v2, p0, Lhuawei/widget/HwNumberPicker;->mSelectorElementHeight:I

    int-to-float v2, v2

    invoke-direct {p0, v0, v1, v2}, Lhuawei/widget/HwNumberPicker;->getBaseline(Landroid/graphics/Typeface;FF)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mInitialScrollOffset:I

    .line 90
    iget v0, p0, Lhuawei/widget/HwNumberPicker;->mInitialScrollOffset:I

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mCurrentScrollOffset:I

    .line 92
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->setStyle()V

    .line 93
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 94
    return-void
.end method

.method static synthetic access$002(Lhuawei/widget/HwNumberPicker;Z)Z
    .locals 0

    .line 21
    iput-boolean p1, p0, Lhuawei/widget/HwNumberPicker;->mSoundLoadFinished:Z

    return p1
.end method

.method private getBaseline(Landroid/graphics/Typeface;FF)I
    .locals 3

    .line 162
    invoke-direct {p0, p1, p2}, Lhuawei/widget/HwNumberPicker;->getFontMetrics(Landroid/graphics/Typeface;F)Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    .line 163
    iget v0, v2, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, v1

    sub-float v0, p3, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    iget v1, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private getFontMetrics(Landroid/graphics/Typeface;F)Landroid/graphics/Paint$FontMetrics;
    .locals 2

    .line 155
    iget-object v1, p0, Lhuawei/widget/HwNumberPicker;->baselinePaint:Landroid/graphics/Paint;

    .line 156
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 157
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 158
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v0

    return-object v0
.end method

.method private getSelectorValue(I)Ljava/lang/String;
    .locals 6

    .line 179
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getWrapSelectorWheel()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    invoke-direct {p0, p1}, Lhuawei/widget/HwNumberPicker;->getWrappedSelectorIndex(I)I

    move-result p1

    .line 183
    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMinValue()I

    move-result v0

    if-lt p1, v0, :cond_1

    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMaxValue()I

    move-result v0

    if-le p1, v0, :cond_2

    .line 184
    :cond_1
    const-string v5, ""

    goto :goto_0

    .line 186
    :cond_2
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getDisplayedValues()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 187
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getDisplayedValues()[Ljava/lang/String;

    move-result-object v0

    aget-object v5, v0, p1

    goto :goto_0

    .line 189
    :cond_3
    const-string v0, "formatNumber"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 190
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Landroid/widget/NumberPicker;

    .line 189
    invoke-static {p0, v0, v1, v2, v3}, Lo/fkw;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 193
    :goto_0
    return-object v5
.end method

.method private getWrappedSelectorIndex(I)I
    .locals 4

    .line 170
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMaxValue()I

    move-result v0

    if-le p1, v0, :cond_0

    .line 171
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMinValue()I

    move-result v0

    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMaxValue()I

    move-result v1

    sub-int v1, p1, v1

    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMaxValue()I

    move-result v2

    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMinValue()I

    move-result v3

    sub-int/2addr v2, v3

    rem-int/2addr v1, v2

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0

    .line 172
    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMinValue()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 173
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMaxValue()I

    move-result v0

    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMinValue()I

    move-result v1

    sub-int/2addr v1, p1

    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMaxValue()I

    move-result v2

    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getMinValue()I

    move-result v3

    sub-int/2addr v2, v3

    rem-int/2addr v1, v2

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 175
    :cond_1
    return p1
.end method

.method private initSoundPool()V
    .locals 7

    .line 295
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 296
    new-instance v4, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v4}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 297
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Landroid/media/AudioAttributes$Builder;->setLegacyStreamType(I)Landroid/media/AudioAttributes$Builder;

    .line 298
    invoke-virtual {v4}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v5

    .line 300
    new-instance v6, Landroid/media/SoundPool$Builder;

    invoke-direct {v6}, Landroid/media/SoundPool$Builder;-><init>()V

    .line 301
    invoke-virtual {v6, v5}, Landroid/media/SoundPool$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/SoundPool$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/SoundPool$Builder;->setMaxStreams(I)Landroid/media/SoundPool$Builder;

    .line 302
    invoke-virtual {v6}, Landroid/media/SoundPool$Builder;->build()Landroid/media/SoundPool;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    .line 303
    goto :goto_0

    .line 304
    :cond_0
    new-instance v0, Landroid/media/SoundPool;

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/media/SoundPool;-><init>(III)V

    iput-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    .line 306
    :goto_0
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    new-instance v1, Lhuawei/widget/HwNumberPicker$3;

    invoke-direct {v1, p0}, Lhuawei/widget/HwNumberPicker$3;-><init>(Lhuawei/widget/HwNumberPicker;)V

    invoke-virtual {v0, v1}, Landroid/media/SoundPool;->setOnLoadCompleteListener(Landroid/media/SoundPool$OnLoadCompleteListener;)V

    .line 313
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "time_picker"

    const-string v2, "raw"

    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 314
    if-eqz v4, :cond_1

    .line 315
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v4, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundId:I

    goto :goto_1

    .line 317
    :cond_1
    const-string v0, "fitatc"

    const-string v1, "Can\'t find resource id for time_picker."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 319
    :goto_1
    return-void
.end method

.method private releaseSoundPool()V
    .locals 1

    .line 322
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    .line 324
    const/4 v0, 0x0

    iput-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    .line 325
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundId:I

    .line 326
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundLoadFinished:Z

    .line 328
    :cond_0
    return-void
.end method


# virtual methods
.method protected drawWheelInputText(Landroid/graphics/Canvas;)V
    .locals 17

    .line 198
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwNumberPicker;->updateValue()V

    .line 200
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lhuawei/widget/HwNumberPicker;->mHideWheelUntilFocused:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwNumberPicker;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 201
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwNumberPicker;->getRight()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwNumberPicker;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    int-to-float v6, v0

    .line 202
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwNumberPicker;->mCurrentScrollOffset:I

    int-to-float v7, v0

    .line 204
    const-string v0, "mScrollState"

    const-class v1, Landroid/widget/NumberPicker;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 205
    const-string v0, "mDecrementVirtualButtonPressed"

    const-class v1, Landroid/widget/NumberPicker;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    .line 207
    const-string v0, "mIncrementVirtualButtonPressed"

    const-class v1, Landroid/widget/NumberPicker;

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    .line 211
    if-eqz v5, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    if-nez v8, :cond_3

    .line 213
    if-eqz v9, :cond_2

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;

    sget-object v1, Lhuawei/widget/HwNumberPicker;->PRESSED_STATE_SET:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwNumberPicker;->getRight()I

    move-result v1

    move-object/from16 v2, p0

    iget v2, v2, Lhuawei/widget/HwNumberPicker;->mTopSelectionDividerTop:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 218
    :cond_2
    if-eqz v10, :cond_3

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;

    sget-object v1, Lhuawei/widget/HwNumberPicker;->PRESSED_STATE_SET:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mBottomSelectionDividerBottom:I

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwNumberPicker;->getRight()I

    move-result v2

    .line 221
    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwNumberPicker;->getBottom()I

    move-result v3

    .line 220
    const/4 v4, 0x0

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 222
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 227
    :cond_3
    if-eqz v5, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    .line 229
    move-object/from16 v0, p0

    iget v11, v0, Lhuawei/widget/HwNumberPicker;->mTopSelectionDividerTop:I

    .line 230
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectionDividerHeight:I

    add-int v12, v11, v0

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwNumberPicker;->getRight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v11, v1, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 235
    move-object/from16 v0, p0

    iget v13, v0, Lhuawei/widget/HwNumberPicker;->mBottomSelectionDividerBottom:I

    .line 236
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectionDividerHeight:I

    sub-int v14, v13, v0

    .line 237
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p0}, Lhuawei/widget/HwNumberPicker;->getRight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v14, v1, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 238
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 241
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mDefaultTypeface:Landroid/graphics/Typeface;

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mNormalTextSize:I

    int-to-float v1, v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lhuawei/widget/HwNumberPicker;->getFontMetrics(Landroid/graphics/Typeface;F)Landroid/graphics/Paint$FontMetrics;

    move-result-object v11

    .line 242
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mDefaultTypeface:Landroid/graphics/Typeface;

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mNormalTextSize:I

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget v2, v2, Lhuawei/widget/HwNumberPicker;->mSelectorElementHeight:I

    int-to-float v2, v2

    move-object/from16 v3, p0

    invoke-direct {v3, v0, v1, v2}, Lhuawei/widget/HwNumberPicker;->getBaseline(Landroid/graphics/Typeface;FF)I

    move-result v12

    .line 243
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mHwChineseMediumTypeface:Landroid/graphics/Typeface;

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mSelectorTextSize:I

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget v2, v2, Lhuawei/widget/HwNumberPicker;->mSelectionDividersDistance:I

    int-to-float v2, v2

    move-object/from16 v3, p0

    invoke-direct {v3, v0, v1, v2}, Lhuawei/widget/HwNumberPicker;->getBaseline(Landroid/graphics/Typeface;FF)I

    move-result v13

    .line 246
    const/4 v14, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectorIndices:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    add-int/lit8 v15, v0, -0x1

    :goto_1
    const/4 v0, 0x5

    if-ge v14, v0, :cond_b

    .line 247
    move v0, v15

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lhuawei/widget/HwNumberPicker;->getSelectorValue(I)Ljava/lang/String;

    move-result-object v16

    .line 253
    if-eqz v5, :cond_5

    const/4 v0, 0x2

    if-ne v14, v0, :cond_6

    :cond_5
    const/4 v0, 0x2

    if-ne v14, v0, :cond_a

    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mInputText:Landroid/widget/EditText;

    .line 254
    invoke-virtual {v0}, Landroid/widget/EditText;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_a

    .line 257
    :cond_6
    const/4 v0, 0x2

    if-ne v14, v0, :cond_7

    .line 258
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectorWheelPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mSelectorTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 259
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectorWheelPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mSelectorTextColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 260
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectorWheelPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget-object v1, v1, Lhuawei/widget/HwNumberPicker;->mHwChineseMediumTypeface:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 263
    iget v0, v11, Landroid/graphics/Paint$FontMetrics;->ascent:F

    int-to-float v1, v13

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mSelectionDividerHeight:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    add-float/2addr v7, v0

    goto :goto_2

    .line 266
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectorWheelPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mNormalTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 267
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectorWheelPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mSmallTextColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 268
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectorWheelPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget-object v1, v1, Lhuawei/widget/HwNumberPicker;->mDefaultTypeface:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 269
    if-nez v14, :cond_8

    .line 270
    int-to-float v0, v12

    sub-float/2addr v7, v0

    .line 271
    iget v0, v11, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v7, v0

    goto :goto_2

    .line 274
    :cond_8
    const/4 v0, 0x3

    if-ne v14, v0, :cond_9

    .line 278
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectionDividersDistance:I

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mSelectorElementHeight:I

    sub-int/2addr v0, v1

    sub-int/2addr v0, v13

    int-to-float v0, v0

    iget v1, v11, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mSelectorElementHeight:I

    int-to-float v1, v1

    iget v2, v11, Landroid/graphics/Paint$FontMetrics;->ascent:F

    add-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, v11, Landroid/graphics/Paint$FontMetrics;->bottom:F

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lhuawei/widget/HwNumberPicker;->mSelectionDividerHeight:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    add-float/2addr v7, v0

    .line 287
    :cond_9
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectorWheelPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    invoke-virtual {v1, v2, v6, v7, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 290
    :cond_a
    move-object/from16 v0, p0

    iget v0, v0, Lhuawei/widget/HwNumberPicker;->mSelectorElementHeight:I

    int-to-float v0, v0

    add-float/2addr v7, v0

    .line 246
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_1

    .line 292
    :cond_b
    return-void
.end method

.method protected initialize()V
    .locals 4

    .line 98
    invoke-super {p0}, Lhuawei/widget/NumberPickerProxy;->initialize()V

    .line 101
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 102
    sget v0, Lhuawei/widget/hwnumberpicker/R$color;->hwnumberpicker_select_text_color:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mSelectorTextColor:I

    .line 103
    sget v0, Lhuawei/widget/hwnumberpicker/R$dimen;->hwnumberpicker_select_textsize_emui:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mSelectorTextSize:I

    .line 104
    const-string v0, "sans-serif-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwNumberPicker;->mHwChineseMediumTypeface:Landroid/graphics/Typeface;

    .line 105
    sget v0, Lhuawei/widget/hwnumberpicker/R$dimen;->hwnumberpicker_normal_textsize_emui:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mNormalTextSize:I

    .line 106
    sget v0, Lhuawei/widget/hwnumberpicker/R$color;->hwnumberpicker_normal_text_color:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwNumberPicker;->mSmallTextColor:I

    .line 107
    const/4 v0, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwNumberPicker;->mDefaultTypeface:Landroid/graphics/Typeface;

    .line 109
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwNumberPicker;->baselinePaint:Landroid/graphics/Paint;

    .line 111
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker;->mInputText:Landroid/widget/EditText;

    iget v1, p0, Lhuawei/widget/HwNumberPicker;->mSelectorTextSize:I

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/EditText;->setTextSize(IF)V

    .line 112
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker;->mInputText:Landroid/widget/EditText;

    iget-object v1, p0, Lhuawei/widget/HwNumberPicker;->mHwChineseMediumTypeface:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 113
    new-instance v0, Lhuawei/widget/HwNumberPicker$1;

    invoke-direct {v0, p0}, Lhuawei/widget/HwNumberPicker$1;-><init>(Lhuawei/widget/HwNumberPicker;)V

    invoke-virtual {p0, v0}, Lhuawei/widget/HwNumberPicker;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    new-instance v0, Lhuawei/widget/HwNumberPicker$2;

    invoke-direct {v0, p0}, Lhuawei/widget/HwNumberPicker$2;-><init>(Lhuawei/widget/HwNumberPicker;)V

    invoke-virtual {p0, v0}, Lhuawei/widget/HwNumberPicker;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 125
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 139
    invoke-super {p0}, Lhuawei/widget/NumberPickerProxy;->onAttachedToWindow()V

    .line 140
    invoke-direct {p0}, Lhuawei/widget/HwNumberPicker;->initSoundPool()V

    .line 141
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 145
    invoke-super {p0}, Lhuawei/widget/NumberPickerProxy;->onDetachedFromWindow()V

    .line 146
    invoke-direct {p0}, Lhuawei/widget/HwNumberPicker;->releaseSoundPool()V

    .line 147
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 134
    invoke-virtual {p0, p1}, Lhuawei/widget/HwNumberPicker;->drawWheelInputText(Landroid/graphics/Canvas;)V

    .line 135
    return-void
.end method

.method protected onValueChangeInner(Landroid/widget/NumberPicker;II)V
    .locals 0

    .line 151
    invoke-virtual {p0}, Lhuawei/widget/HwNumberPicker;->playSound()V

    .line 152
    return-void
.end method

.method protected playSound()V
    .locals 7

    .line 331
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    if-eqz v0, :cond_0

    iget v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundId:I

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundLoadFinished:Z

    if-nez v0, :cond_1

    .line 332
    :cond_0
    const-string v0, "fitatc"

    const-string v1, "SoundPool is not initialized properly!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 333
    return-void

    .line 335
    :cond_1
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker;->mSoundPool:Landroid/media/SoundPool;

    iget v1, p0, Lhuawei/widget/HwNumberPicker;->mSoundId:I

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v6}, Landroid/media/SoundPool;->play(IFFIIF)I

    .line 337
    return-void
.end method
