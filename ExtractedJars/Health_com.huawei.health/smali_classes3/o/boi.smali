.class public Lo/boi;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;)I
    .locals 2

    .line 147
    invoke-static {p0}, Lo/boi;->c(Landroid/app/Activity;)I

    move-result v0

    div-int/lit8 v0, v0, 0xc

    return v0
.end method

.method public static a(Landroid/content/Context;F)I
    .locals 4

    .line 61
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 62
    const/4 v3, 0x0

    .line 64
    if-eqz v2, :cond_0

    .line 66
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    .line 68
    :cond_0
    div-float v0, p1, v3

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static b(Landroid/app/Activity;)I
    .locals 2

    .line 105
    invoke-static {p0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v0

    invoke-static {p0}, Lo/boi;->k(Landroid/app/Activity;)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public static c(Landroid/app/Activity;)I
    .locals 2

    .line 78
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 79
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 81
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method public static c(Landroid/content/Context;F)I
    .locals 4

    .line 46
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 47
    const/4 v3, 0x0

    .line 49
    if-eqz v2, :cond_0

    .line 51
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    .line 53
    :cond_0
    mul-float v0, p1, v3

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static d(Landroid/app/Activity;)I
    .locals 2

    .line 91
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 92
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 94
    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    return v0
.end method

.method public static d(Landroid/view/View;IIII)V
    .locals 2

    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 122
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 123
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 124
    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_1

    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 128
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 129
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 130
    goto :goto_0

    .line 131
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v0, :cond_2

    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 134
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 135
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 137
    :cond_2
    :goto_0
    return-void
.end method

.method public static e(Landroid/app/Activity;)I
    .locals 6

    .line 158
    const/4 v3, 0x0

    .line 161
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 162
    const-string v0, "navigation_bar_height"

    const-string v1, "dimen"

    const-string v2, "android"

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 163
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v3, v0

    .line 172
    goto :goto_0

    .line 165
    :catch_0
    move-exception v4

    .line 167
    const-string v0, "DensityUtil"

    const-string v1, "DensityUtil getNavigationBarHeight error NotFoundException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    goto :goto_0

    .line 169
    :catch_1
    move-exception v4

    .line 171
    const-string v0, "DensityUtil"

    const-string v1, "DensityUtil getNavigationBarHeight error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    :goto_0
    return v3
.end method

.method public static i(Landroid/app/Activity;)I
    .locals 5

    .line 224
    if-nez p0, :cond_0

    .line 226
    const/4 v0, -0x1

    return v0

    .line 228
    :cond_0
    const/high16 v0, 0x42400000    # 48.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v3

    .line 230
    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 231
    invoke-virtual {p0}, Landroid/app/Activity;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x10102eb

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    iget v0, v4, Landroid/util/TypedValue;->data:I

    .line 234
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 233
    invoke-static {v0, v1}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v3

    .line 237
    :cond_1
    return v3
.end method

.method public static k(Landroid/app/Activity;)I
    .locals 8

    .line 183
    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    .line 187
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 188
    const-string v0, "com.android.internal.R$dimen"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 189
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    .line 190
    const-string v0, "status_bar_height"

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    .line 191
    invoke-virtual {v6, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 192
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    move-result v0

    move v2, v0

    .line 213
    goto :goto_0

    .line 194
    :catch_0
    move-exception v4

    .line 196
    const-string v0, "DensityUtil"

    const-string v1, "getStatusBarHeight getStatusBarHeight error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    goto :goto_0

    .line 198
    :catch_1
    move-exception v4

    .line 200
    const-string v0, "DensityUtil"

    const-string v1, "getStatusBarHeight IllegalAccessException error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    goto :goto_0

    .line 202
    :catch_2
    move-exception v4

    .line 204
    const-string v0, "DensityUtil"

    const-string v1, "getStatusBarHeight InstantiationException error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    goto :goto_0

    .line 206
    :catch_3
    move-exception v4

    .line 208
    const-string v0, "DensityUtil"

    const-string v1, "getStatusBarHeight NoSuchFieldException error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    goto :goto_0

    .line 210
    :catch_4
    move-exception v4

    .line 212
    const-string v0, "DensityUtil"

    const-string v1, "getStatusBarHeight ClassNotFoundException error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    :goto_0
    return v2
.end method
