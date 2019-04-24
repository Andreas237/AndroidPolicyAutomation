.class public Lcom/huawei/pay/ui/util/UiUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Landroid/app/Activity;Landroid/view/View;FI)V
    .locals 0

    .line 27
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/pay/ui/util/UiUtil;->setViewMargin(Landroid/app/Activity;Landroid/view/View;FI)V

    return-void
.end method

.method public static getScreenHeight(Landroid/app/Activity;)I
    .locals 2

    .line 49
    if-eqz p0, :cond_0

    .line 50
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 51
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 52
    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    return v0

    .line 54
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static getScreenWith(Landroid/app/Activity;)I
    .locals 2

    .line 65
    if-eqz p0, :cond_0

    .line 66
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 67
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 68
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0

    .line 70
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static setDialogView(Landroid/content/Context;Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 35
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 37
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    .line 39
    :cond_0
    return-void
.end method

.method public static setOrangeButtonBackground(Landroid/content/Context;Landroid/widget/Button;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 129
    if-nez p0, :cond_0

    .line 130
    const-string v0, "setOrangeButtonBackground,but context is null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 131
    return-void

    .line 133
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->btn_background_emui5:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 134
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$color;->white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 135
    return-void
.end method

.method public static setOrangeButtonBackground(Landroid/content/Context;Lo/egd;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 139
    if-nez p0, :cond_0

    .line 140
    const-string v0, "setOrangeButtonBackground,but context is null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 141
    return-void

    .line 143
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->btn_background_emui5:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/egd;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 144
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$color;->white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lo/egd;->setTextColor(I)V

    .line 145
    return-void
.end method

.method private static setViewMargin(Landroid/app/Activity;Landroid/view/View;FI)V
    .locals 5

    .line 120
    invoke-static {p0}, Lcom/huawei/pay/ui/util/UiUtil;->getScreenHeight(Landroid/app/Activity;)I

    move-result v2

    .line 121
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 122
    int-to-float v0, v2

    mul-float/2addr v0, p2

    int-to-float v1, p3

    sub-float/2addr v0, v1

    float-to-int v4, v0

    .line 123
    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 124
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 125
    return-void
.end method

.method public static setViewMargin(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;F)V
    .locals 10

    .line 81
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 82
    :cond_0
    return-void

    .line 84
    :cond_1
    new-instance v7, Landroid/graphics/Rect;

    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 85
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_2

    .line 86
    invoke-virtual {p1, v7}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setViewMargin rect top="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v7, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 88
    iget v0, v7, Landroid/graphics/Rect;->top:I

    if-lez v0, :cond_2

    .line 89
    iget v0, v7, Landroid/graphics/Rect;->top:I

    invoke-static {p0, p2, p3, v0}, Lcom/huawei/pay/ui/util/UiUtil;->setViewMargin(Landroid/app/Activity;Landroid/view/View;FI)V

    .line 90
    return-void

    .line 95
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v8

    .line 97
    new-instance v0, Lcom/huawei/pay/ui/util/UiUtil$1;

    move-object v1, p1

    move-object v2, v7

    move-object v3, p0

    move-object v4, p2

    move v5, p3

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/huawei/pay/ui/util/UiUtil$1;-><init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/app/Activity;Landroid/view/View;FLandroid/view/ViewTreeObserver;)V

    move-object v9, v0

    .line 116
    invoke-virtual {v8, v9}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 117
    return-void
.end method
