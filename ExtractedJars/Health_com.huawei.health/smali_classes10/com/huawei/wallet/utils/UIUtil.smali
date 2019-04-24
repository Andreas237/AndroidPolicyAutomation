.class public Lcom/huawei/wallet/utils/UIUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI10;,
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI9;,
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI8;,
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI7;,
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI6;,
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI5;,
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI4;,
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI3;,
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI2;,
        Lcom/huawei/wallet/utils/UIUtil$UIUtilSAI1;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Landroid/view/View;)V
    .locals 8

    .line 77
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 79
    :cond_0
    return-void

    .line 82
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 83
    sget v0, Lcom/huawei/base/R$bool;->IsNeedReset:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 85
    new-instance v3, Landroid/util/DisplayMetrics;

    invoke-direct {v3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 86
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 87
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 88
    iget v5, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 89
    if-ge v4, v5, :cond_2

    goto :goto_0

    :cond_2
    move v4, v5

    .line 90
    :goto_0
    mul-int/lit8 v0, v4, 0x6

    div-int/lit8 v6, v0, 0x8

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " resetButtonMargin screenWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    .line 93
    iput v6, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 94
    invoke-virtual {p1, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    :cond_3
    return-void
.end method

.method public static a(Landroid/app/Activity;)Z
    .locals 2

    .line 46
    invoke-virtual {p0}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v1

    .line 47
    const/4 v0, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(Landroid/app/Activity;Landroid/view/ViewGroup;Z)V
    .locals 13

    .line 108
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 110
    :cond_0
    return-void

    .line 112
    :cond_1
    const/4 v6, 0x0

    .line 113
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    .line 114
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v8, v0, Landroid/util/DisplayMetrics;->density:F

    .line 115
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 117
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v0, v0

    mul-float v9, v0, v8

    .line 118
    const/high16 v0, 0x41400000    # 12.0f

    div-float v0, v9, v0

    float-to-int v6, v0

    .line 119
    const/high16 v0, 0x41300000    # 11.0f

    mul-float/2addr v0, v9

    const/high16 v1, 0x41400000    # 12.0f

    div-float/2addr v0, v1

    float-to-int v10, v0

    .line 120
    const/4 v0, 0x3

    new-array v11, v0, [Landroid/graphics/drawable/ColorDrawable;

    .line 121
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/base/R$color;->black_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    const/4 v1, 0x0

    aput-object v0, v11, v1

    .line 122
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/base/R$color;->hwpay_bg_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    const/4 v1, 0x1

    aput-object v0, v11, v1

    .line 123
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/base/R$color;->black_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    const/4 v1, 0x2

    aput-object v0, v11, v1

    .line 125
    new-instance v12, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v12, v11}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 126
    move-object v0, v12

    move v4, v10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    .line 127
    move-object v0, v12

    move v2, v6

    move v4, v6

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    .line 128
    move-object v0, v12

    move v2, v10

    const/4 v1, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    .line 129
    invoke-virtual {p1, v12}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 130
    goto :goto_0

    .line 133
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 135
    :goto_0
    if-eqz p2, :cond_3

    .line 137
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v1

    invoke-virtual {p1, v6, v0, v6, v1}, Landroid/view/ViewGroup;->setPadding(IIII)V

    goto :goto_1

    .line 141
    :cond_3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 142
    iput v6, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 143
    iput v6, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 144
    invoke-virtual {p1, v9}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    :goto_1
    return-void
.end method

.method public static c(Landroid/app/Activity;)V
    .locals 2

    .line 57
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$bool;->IsSupportOrientation:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_0

    .line 63
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 65
    :goto_0
    return-void
.end method
