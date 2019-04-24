.class public abstract Lcom/usebutton/sdk/internal/views/BaseButton;
.super Landroid/widget/FrameLayout;
.source "BaseButton.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/views/BaseButton$Style;
    }
.end annotation


# instance fields
.field private mContentView:Landroid/view/ViewGroup;

.field protected mDidReportViewed:Z

.field private mDoInvalidateStyling:Ljava/lang/Runnable;

.field private final mHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 67
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/views/BaseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 71
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/views/BaseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p1, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mHandler:Landroid/os/Handler;

    .line 149
    new-instance p1, Lcom/usebutton/sdk/internal/views/BaseButton$1;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/views/BaseButton$1;-><init>(Lcom/usebutton/sdk/internal/views/BaseButton;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mDoInvalidateStyling:Ljava/lang/Runnable;

    .line 76
    invoke-virtual {p0, p2}, Lcom/usebutton/sdk/internal/views/BaseButton;->readAttributes(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 81
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 62
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p1, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mHandler:Landroid/os/Handler;

    .line 149
    new-instance p1, Lcom/usebutton/sdk/internal/views/BaseButton$1;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/views/BaseButton$1;-><init>(Lcom/usebutton/sdk/internal/views/BaseButton;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mDoInvalidateStyling:Ljava/lang/Runnable;

    .line 82
    invoke-virtual {p0, p2}, Lcom/usebutton/sdk/internal/views/BaseButton;->readAttributes(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/views/BaseButton;)Landroid/view/ViewGroup;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mContentView:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private checkReportViewed()V
    .locals 1

    .line 273
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mDidReportViewed:Z

    if-eqz v0, :cond_0

    return-void

    .line 276
    :cond_0
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->isAttachedToWindow(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 277
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->reportViewed()V

    :cond_1
    return-void
.end method

.method public static overrideOrDefault(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 0

    if-eqz p1, :cond_0

    .line 163
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    if-eqz p0, :cond_1

    .line 166
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public declared-synchronized addContentView(Landroid/view/ViewGroup;)V
    .locals 2

    monitor-enter p0

    .line 250
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mContentView:Landroid/view/ViewGroup;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p1, :cond_0

    .line 251
    monitor-exit p0

    return-void

    .line 253
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mContentView:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 254
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mContentView:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/BaseButton;->removeView(Landroid/view/View;)V

    .line 256
    :cond_1
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mContentView:Landroid/view/ViewGroup;

    .line 257
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 258
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    .line 260
    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 262
    :cond_2
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->removeAllViews()V

    .line 263
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/views/BaseButton;->applyStylingAttributes(Landroid/view/ViewGroup;)V

    .line 264
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/views/BaseButton;->addView(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public abstract applyStylingAttributes(Landroid/view/ViewGroup;)V
.end method

.method public abstract getDefaultStyleResource()I
    .annotation build Landroid/support/annotation/StyleRes;
    .end annotation
.end method

.method public abstract getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;
.end method

.method protected invalidateStyling()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mDoInvalidateStyling:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 146
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mDoInvalidateStyling:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 87
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    const/4 v0, 0x0

    .line 88
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mDidReportViewed:Z

    .line 89
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->reportViewed()V

    return-void
.end method

.method public onContent()V
    .locals 1

    const/4 v0, 0x0

    .line 268
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mDidReportViewed:Z

    .line 269
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->checkReportViewed()V

    return-void
.end method

.method protected onReportedView()V
    .locals 1

    const/4 v0, 0x1

    .line 287
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton;->mDidReportViewed:Z

    return-void
.end method

.method public readAttributes(Landroid/util/AttributeSet;)V
    .locals 5
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    const/4 v0, 0x0

    .line 200
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/BaseButton;->setWillNotDraw(Z)V

    .line 201
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton:[I

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getDefaultStyleResource()I

    move-result v3

    invoke-virtual {v1, p1, v2, v0, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 203
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_a

    .line 205
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 207
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_font:I

    if-ne v3, v4, :cond_0

    .line 208
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->font:Ljava/lang/String;

    goto/16 :goto_1

    .line 209
    :cond_0
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_backgroundColor:I

    if-ne v3, v4, :cond_1

    .line 210
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->backgroundColor:Ljava/lang/Integer;

    goto/16 :goto_1

    .line 211
    :cond_1
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_backgroundDrawable:I

    if-ne v3, v4, :cond_2

    .line 212
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->backgroundDrawableResource:Ljava/lang/Integer;

    goto/16 :goto_1

    .line 213
    :cond_2
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_textSize:I

    if-ne v3, v4, :cond_3

    .line 214
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->textSize:Ljava/lang/Integer;

    goto/16 :goto_1

    .line 215
    :cond_3
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_drawablePadding:I

    if-ne v3, v4, :cond_4

    .line 216
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->drawablePadding:Ljava/lang/Integer;

    goto :goto_1

    .line 217
    :cond_4
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_drawablePaddingLeft:I

    if-ne v3, v4, :cond_5

    .line 218
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->drawablePaddingLeft:Ljava/lang/Integer;

    goto :goto_1

    .line 219
    :cond_5
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_drawablePaddingTop:I

    if-ne v3, v4, :cond_6

    .line 220
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->drawablePaddingTop:Ljava/lang/Integer;

    goto :goto_1

    .line 221
    :cond_6
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_drawablePaddingRight:I

    if-ne v3, v4, :cond_7

    .line 222
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->drawablePaddingRight:Ljava/lang/Integer;

    goto :goto_1

    .line 223
    :cond_7
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_drawablePaddingBottom:I

    if-ne v3, v4, :cond_8

    .line 224
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->drawablePaddingBottom:Ljava/lang/Integer;

    goto :goto_1

    .line 225
    :cond_8
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_BaseButton_btn_iconSize:I

    if-ne v3, v4, :cond_9

    .line 226
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v4

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->iconSize:Ljava/lang/Integer;

    :cond_9
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 229
    :cond_a
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method protected abstract reportViewed()V
.end method

.method public setBackgroundColor_Button(I)V
    .locals 1

    .line 100
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->backgroundColor:Ljava/lang/Integer;

    .line 101
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->invalidateStyling()V

    return-void
.end method

.method public setBackgroundDrawable_Button(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 240
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v0

    iput-object p1, v0, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->backgroundDrawable:Landroid/graphics/drawable/Drawable;

    .line 241
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->invalidateStyling()V

    return-void
.end method

.method public setDrawablePadding_Button(I)V
    .locals 1

    .line 112
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->drawablePadding:Ljava/lang/Integer;

    .line 113
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->invalidateStyling()V

    return-void
.end method

.method public setFont_Button(Ljava/lang/String;)V
    .locals 1

    .line 137
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v0

    iput-object p1, v0, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->font:Ljava/lang/String;

    .line 138
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->invalidateStyling()V

    return-void
.end method

.method public setIconSize_Button(I)V
    .locals 1

    .line 125
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/usebutton/sdk/internal/views/BaseButton$Style;->iconSize:Ljava/lang/Integer;

    .line 126
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->invalidateStyling()V

    return-void
.end method
