.class public Lcom/usebutton/sdk/DropinButton;
.super Lcom/usebutton/sdk/internal/views/BaseButton;
.source "DropinButton.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/DropinButton$DropinStyle;
    }
.end annotation


# static fields
.field public static final FACTOR_TITLE_TO_LABEL:F = 0.78f

.field private static final TAG:Ljava/lang/String; = "DropinButton"

.field public static final TEXT_STYLE_LOWER:I = 0x1

.field public static final TEXT_STYLE_NORMAL:I = 0x0

.field public static final TEXT_STYLE_UPPER:I = 0x10


# instance fields
.field private mAction:Lcom/usebutton/sdk/action/ButtonAction;

.field private mPresenter:Lcom/usebutton/sdk/internal/views/DropinPresenter;

.field private mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 128
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/DropinButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 132
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/DropinButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 136
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/views/BaseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 142
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/usebutton/sdk/internal/views/BaseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private addEditButtonPreview()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 455
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$layout;->btn_preview_two_line:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/DropinButton;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/PreviewView;

    .line 456
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->getIcon()Lcom/usebutton/sdk/internal/views/AssetImageView;

    move-result-object v1

    .line 457
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/usebutton/sdk/R$drawable;->btn_ic_app_button:I

    invoke-static {v2, v3}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 459
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->getTitle()Landroid/widget/TextView;

    move-result-object v1

    const-string v2, "PREVIEW"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 460
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->getLabel()Landroid/widget/TextView;

    move-result-object v1

    const-string v2, "Lorem ipsum doler sit amet."

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 461
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/DropinButton;->addContentView(Landroid/view/ViewGroup;)V

    return-void
.end method

.method private getPresenter()Lcom/usebutton/sdk/internal/views/DropinPresenter;
    .locals 2

    .line 446
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mPresenter:Lcom/usebutton/sdk/internal/views/DropinPresenter;

    if-nez v0, :cond_0

    .line 447
    new-instance v0, Lcom/usebutton/sdk/internal/views/DropinPresenter;

    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/DropinButton;)V

    iput-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mPresenter:Lcom/usebutton/sdk/internal/views/DropinPresenter;

    .line 449
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mPresenter:Lcom/usebutton/sdk/internal/views/DropinPresenter;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized applyStylingAttributes(Landroid/view/ViewGroup;)V
    .locals 9

    monitor-enter p0

    .line 198
    :try_start_0
    check-cast p1, Lcom/usebutton/sdk/internal/views/PreviewView;

    .line 206
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/views/PreviewView;->getIcon()Lcom/usebutton/sdk/internal/views/AssetImageView;

    move-result-object v0

    .line 207
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/views/PreviewView;->getTitle()Landroid/widget/TextView;

    move-result-object v1

    .line 208
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/views/PreviewView;->getLabel()Landroid/widget/TextView;

    move-result-object v2

    .line 209
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/views/PreviewView;->getLoadingView()Landroid/view/View;

    move-result-object v3

    .line 212
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x1

    invoke-direct {v4, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v4}, Lcom/usebutton/sdk/internal/views/PreviewView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 213
    invoke-static {p0}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->getMinimumWidth(Landroid/view/View;)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/usebutton/sdk/internal/views/PreviewView;->setMinimumWidth(I)V

    .line 214
    invoke-static {p0}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->getMinimumHeight(Landroid/view/View;)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/usebutton/sdk/internal/views/PreviewView;->setMinimumHeight(I)V

    .line 215
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    .line 216
    invoke-static {v4}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$200(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v5}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$300(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/usebutton/sdk/DropinButton;->overrideOrDefault(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v4

    iget-object v5, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    .line 217
    invoke-static {v5}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$200(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v6}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$400(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/usebutton/sdk/DropinButton;->overrideOrDefault(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v5

    iget-object v6, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    .line 218
    invoke-static {v6}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$200(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v6

    iget-object v7, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v7}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$500(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/usebutton/sdk/DropinButton;->overrideOrDefault(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v6

    iget-object v7, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    .line 219
    invoke-static {v7}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$200(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v7

    iget-object v8, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v8}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$600(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/usebutton/sdk/DropinButton;->overrideOrDefault(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v7

    .line 215
    invoke-virtual {p1, v4, v5, v6, v7}, Lcom/usebutton/sdk/internal/views/PreviewView;->setPadding(IIII)V

    .line 221
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->backgroundColor:Ljava/lang/Integer;

    if-eqz v4, :cond_0

    .line 222
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->backgroundColor:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/usebutton/sdk/internal/views/PreviewView;->setBackgroundColor(I)V

    .line 226
    :cond_0
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->backgroundDrawableResource:Ljava/lang/Integer;

    if-eqz v4, :cond_1

    .line 227
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->backgroundDrawableResource:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/usebutton/sdk/internal/views/PreviewView;->setBackgroundResource(I)V

    goto :goto_0

    .line 229
    :cond_1
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->backgroundDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {p1, v4}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 234
    :goto_0
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->textSize:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 235
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v4}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$800(Lcom/usebutton/sdk/DropinButton$DropinStyle;)I

    move-result v4

    const/4 v6, 0x1

    and-int/2addr v4, v6

    if-eqz v4, :cond_2

    .line 236
    new-instance v4, Lcom/usebutton/sdk/internal/views/AllLowercaseTransformationMethod;

    invoke-direct {v4}, Lcom/usebutton/sdk/internal/views/AllLowercaseTransformationMethod;-><init>()V

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 238
    :cond_2
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v4}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$800(Lcom/usebutton/sdk/DropinButton$DropinStyle;)I

    move-result v4

    and-int/lit8 v4, v4, 0x10

    if-eqz v4, :cond_3

    .line 239
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 243
    :cond_3
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x8

    .line 244
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 246
    :cond_4
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 247
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->textSize:Ljava/lang/Integer;

    .line 248
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    const v7, 0x3f47ae14    # 0.78f

    mul-float v4, v4, v7

    .line 247
    invoke-virtual {v1, v5, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    :goto_1
    if-eqz v3, :cond_5

    .line 251
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 252
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->textSize:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 256
    :cond_5
    iget-object v3, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v3}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$700(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 257
    iget-object v3, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v3}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$700(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p1, v3}, Lcom/usebutton/sdk/internal/views/PreviewView;->setGravity(I)V

    .line 259
    :cond_6
    iget-object v3, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v3}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$100(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 260
    iget-object v3, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v3}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$100(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 261
    iget-object v3, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v3}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$100(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 263
    :cond_7
    iget-object v3, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v3, v3, Lcom/usebutton/sdk/DropinButton$DropinStyle;->font:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_8

    .line 265
    :try_start_1
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->font:Ljava/lang/String;

    invoke-static {v3, v4}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    .line 266
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 267
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "DropinButton"

    .line 269
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Instructed to load custom font from assets, but could not find asset with name: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->font:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 276
    :cond_8
    :goto_2
    iget-object v1, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v1, v1, Lcom/usebutton/sdk/DropinButton$DropinStyle;->iconSize:Ljava/lang/Integer;

    if-eqz v1, :cond_c

    .line 277
    iget-object v1, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v1, v1, Lcom/usebutton/sdk/DropinButton$DropinStyle;->iconSize:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_9

    const/4 v1, 0x4

    .line 278
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setVisibility(I)V

    goto :goto_3

    .line 280
    :cond_9
    invoke-virtual {v0, v5}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setVisibility(I)V

    .line 282
    :goto_3
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 283
    iget-object v2, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v2, v2, Lcom/usebutton/sdk/DropinButton$DropinStyle;->iconSize:Ljava/lang/Integer;

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v2, v2, Lcom/usebutton/sdk/DropinButton$DropinStyle;->iconSize:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_4

    :cond_a
    const/4 v2, 0x0

    :goto_4
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getPaddingTop()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 284
    iget-object v2, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v2, v2, Lcom/usebutton/sdk/DropinButton$DropinStyle;->iconSize:Ljava/lang/Integer;

    if-eqz v2, :cond_b

    iget-object v2, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v2, v2, Lcom/usebutton/sdk/DropinButton$DropinStyle;->iconSize:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_5

    :cond_b
    const/4 v2, 0x0

    :goto_5
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getPaddingLeft()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getPaddingRight()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 285
    iget-object v2, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v2, v2, Lcom/usebutton/sdk/DropinButton$DropinStyle;->drawablePadding:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v3, v3, Lcom/usebutton/sdk/DropinButton$DropinStyle;->drawablePaddingLeft:Ljava/lang/Integer;

    .line 286
    invoke-static {v2, v3}, Lcom/usebutton/sdk/DropinButton;->overrideOrDefault(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v2

    iget-object v3, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v3, v3, Lcom/usebutton/sdk/DropinButton$DropinStyle;->drawablePadding:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->drawablePaddingTop:Ljava/lang/Integer;

    .line 287
    invoke-static {v3, v4}, Lcom/usebutton/sdk/DropinButton;->overrideOrDefault(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v3

    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v4, v4, Lcom/usebutton/sdk/DropinButton$DropinStyle;->drawablePadding:Ljava/lang/Integer;

    iget-object v7, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v7, v7, Lcom/usebutton/sdk/DropinButton$DropinStyle;->drawablePaddingRight:Ljava/lang/Integer;

    .line 288
    invoke-static {v4, v7}, Lcom/usebutton/sdk/DropinButton;->overrideOrDefault(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v4

    iget-object v7, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v7, v7, Lcom/usebutton/sdk/DropinButton$DropinStyle;->drawablePadding:Ljava/lang/Integer;

    iget-object v8, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    iget-object v8, v8, Lcom/usebutton/sdk/DropinButton$DropinStyle;->drawablePaddingBottom:Ljava/lang/Integer;

    .line 289
    invoke-static {v7, v8}, Lcom/usebutton/sdk/DropinButton;->overrideOrDefault(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v7

    .line 285
    invoke-virtual {v1, v2, v3, v4, v7}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 291
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 293
    :cond_c
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v0}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$900(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Z

    move-result v0

    if-nez v0, :cond_d

    const/4 v0, 0x1

    goto :goto_6

    :cond_d
    const/4 v0, 0x0

    :goto_6
    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->setEnabled(Z)V

    .line 294
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v0}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$900(Lcom/usebutton/sdk/DropinButton$DropinStyle;)Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v5, 0x1

    :cond_e
    invoke-virtual {p1, v5}, Lcom/usebutton/sdk/internal/views/PreviewView;->setClickable(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 295
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getDefaultStyleResource()I
    .locals 1
    .annotation build Landroid/support/annotation/StyleRes;
    .end annotation

    .line 192
    sget v0, Lcom/usebutton/sdk/R$style;->BtnDropinButton:I

    return v0
.end method

.method public getStyle()Lcom/usebutton/sdk/DropinButton$DropinStyle;
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    if-nez v0, :cond_0

    .line 149
    new-instance v0, Lcom/usebutton/sdk/DropinButton$DropinStyle;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;-><init>(Lcom/usebutton/sdk/DropinButton$1;)V

    iput-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    return-object v0
.end method

.method public bridge synthetic getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;
    .locals 1

    .line 94
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->getStyle()Lcom/usebutton/sdk/DropinButton$DropinStyle;

    move-result-object v0

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 438
    invoke-super {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->onAttachedToWindow()V

    .line 439
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 440
    invoke-direct {p0}, Lcom/usebutton/sdk/DropinButton;->addEditButtonPreview()V

    return-void

    :cond_0
    return-void
.end method

.method public prepareWithAction(Lcom/usebutton/sdk/action/ButtonAction;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/action/ButtonAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 465
    iput-object p1, p0, Lcom/usebutton/sdk/DropinButton;->mAction:Lcom/usebutton/sdk/action/ButtonAction;

    .line 466
    invoke-direct {p0}, Lcom/usebutton/sdk/DropinButton;->getPresenter()Lcom/usebutton/sdk/internal/views/DropinPresenter;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->prepareWithAction(Lcom/usebutton/sdk/DropinButton;Lcom/usebutton/sdk/action/ButtonAction;)V

    return-void
.end method

.method public readAttributes(Landroid/util/AttributeSet;)V
    .locals 5

    .line 157
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/views/BaseButton;->readAttributes(Landroid/util/AttributeSet;)V

    .line 158
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton:[I

    .line 159
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->getDefaultStyleResource()I

    move-result v2

    const/4 v3, 0x0

    .line 158
    invoke-virtual {v0, p1, v1, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 161
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_9

    .line 163
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 165
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton_btn_textColor:I

    if-ne v2, v4, :cond_0

    .line 166
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$102(Lcom/usebutton/sdk/DropinButton$DropinStyle;Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    goto/16 :goto_1

    .line 167
    :cond_0
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton_btn_padding:I

    if-ne v2, v4, :cond_1

    .line 168
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$202(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    goto/16 :goto_1

    .line 169
    :cond_1
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton_btn_paddingLeft:I

    if-ne v2, v4, :cond_2

    .line 170
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$302(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    goto :goto_1

    .line 171
    :cond_2
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton_btn_paddingTop:I

    if-ne v2, v4, :cond_3

    .line 172
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$402(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    goto :goto_1

    .line 173
    :cond_3
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton_btn_paddingRight:I

    if-ne v2, v4, :cond_4

    .line 174
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$502(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    goto :goto_1

    .line 175
    :cond_4
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton_btn_paddingBottom:I

    if-ne v2, v4, :cond_5

    .line 176
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$602(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    goto :goto_1

    .line 177
    :cond_5
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton_btn_gravity:I

    if-ne v2, v4, :cond_6

    .line 178
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$702(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    goto :goto_1

    .line 179
    :cond_6
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton_btn_textStyle:I

    if-ne v2, v4, :cond_7

    .line 180
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-static {v4, v2}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$802(Lcom/usebutton/sdk/DropinButton$DropinStyle;I)I

    goto :goto_1

    .line 181
    :cond_7
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_DropinButton_btn_interactionDisabled:I

    if-ne v2, v4, :cond_8

    .line 182
    iget-object v4, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-static {v4, v2}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$902(Lcom/usebutton/sdk/DropinButton$DropinStyle;Z)Z

    :cond_8
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 185
    :cond_9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method protected reportViewed()V
    .locals 1

    .line 471
    invoke-direct {p0}, Lcom/usebutton/sdk/DropinButton;->getPresenter()Lcom/usebutton/sdk/internal/views/DropinPresenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->onReportViewed()V

    return-void
.end method

.method public setGravity_Button(I)V
    .locals 1

    .line 391
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$702(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 392
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setInteractionDisabled_Button(Z)V
    .locals 1

    .line 403
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v0, p1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$902(Lcom/usebutton/sdk/DropinButton$DropinStyle;Z)Z

    .line 404
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setMinimumHeight(I)V
    .locals 0

    .line 425
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/views/BaseButton;->setMinimumHeight(I)V

    .line 426
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setMinimumWidth(I)V
    .locals 0

    .line 432
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/views/BaseButton;->setMinimumWidth(I)V

    .line 433
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setPaddingBottom_Button(I)V
    .locals 1

    .line 356
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$602(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 357
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setPaddingLeft_Button(I)V
    .locals 1

    .line 368
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$302(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 369
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setPaddingRight_Button(I)V
    .locals 1

    .line 344
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$502(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 345
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setPaddingTop_Button(I)V
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$402(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 333
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setPadding_Button(I)V
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$202(Lcom/usebutton/sdk/DropinButton$DropinStyle;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 321
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setStyle_Button(I)V
    .locals 1

    .line 418
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v0, p1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$802(Lcom/usebutton/sdk/DropinButton$DropinStyle;I)I

    .line 419
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setTextColorStates_Button(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {v0, p1}, Lcom/usebutton/sdk/DropinButton$DropinStyle;->access$102(Lcom/usebutton/sdk/DropinButton$DropinStyle;Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 307
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public setTextSize_Button(I)V
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/usebutton/sdk/DropinButton;->mStyle:Lcom/usebutton/sdk/DropinButton$DropinStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/usebutton/sdk/DropinButton$DropinStyle;->textSize:Ljava/lang/Integer;

    .line 381
    invoke-virtual {p0}, Lcom/usebutton/sdk/DropinButton;->invalidateStyling()V

    return-void
.end method

.method public test_setPresenter(Lcom/usebutton/sdk/internal/views/DropinPresenter;)V
    .locals 0

    .line 476
    iput-object p1, p0, Lcom/usebutton/sdk/DropinButton;->mPresenter:Lcom/usebutton/sdk/internal/views/DropinPresenter;

    return-void
.end method
