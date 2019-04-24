.class public Lo/bph;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Z

.field private static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const/4 v0, 0x0

    sput-boolean v0, Lo/bph;->d:Z

    .line 62
    const/4 v0, 0x0

    sput-boolean v0, Lo/bph;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/app/Activity;)I
    .locals 4

    .line 403
    invoke-static {p0}, Lo/bph;->c(Landroid/app/Activity;)I

    move-result v2

    .line 404
    mul-int/lit8 v0, v2, 0x1

    div-int/lit8 v0, v0, 0x8

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    add-int v3, v0, v1

    .line 405
    return v3
.end method

.method private static b(Landroid/app/Activity;)I
    .locals 2

    .line 460
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 461
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 463
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method private static b(Landroid/app/Activity;I)I
    .locals 5

    .line 429
    invoke-static {p0}, Lo/bph;->b(Landroid/app/Activity;)I

    move-result v2

    .line 431
    div-int/lit8 v0, v2, 0xc

    mul-int/lit8 v3, v0, 0x2

    .line 432
    mul-int/lit8 v0, p1, 0x2

    sub-int v0, v2, v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    sub-int/2addr v0, v3

    div-int/lit8 v4, v0, 0x2

    .line 433
    return v4
.end method

.method public static b(Landroid/app/Activity;Landroid/view/View;)V
    .locals 5

    .line 474
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p0}, Lo/bph;->e(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 476
    :cond_0
    return-void

    .line 478
    :cond_1
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 481
    invoke-static {p0}, Lo/boi;->a(Landroid/app/Activity;)I

    move-result v4

    .line 482
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v4, v0, v4, v1}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 483
    goto :goto_0

    .line 486
    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 488
    :goto_0
    return-void
.end method

.method private static b(Landroid/view/View;IIIII)V
    .locals 0

    .line 360
    invoke-static {p0, p1}, Lo/bph;->c(Landroid/view/View;I)V

    .line 361
    invoke-static {p0, p2, p3, p4, p5}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 362
    return-void
.end method

.method public static b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V
    .locals 6

    .line 104
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 106
    :cond_0
    return-void

    .line 108
    :cond_1
    invoke-static {p1}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 110
    invoke-static {p1}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v4

    .line 111
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 112
    instance-of v0, v5, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v0, :cond_2

    .line 115
    move-object v0, v5

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_0

    .line 117
    :cond_2
    instance-of v0, v5, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_3

    .line 119
    move-object v0, v5

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 122
    :cond_3
    :goto_0
    const/4 v0, -0x1

    iput v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 123
    const/4 v0, -0x2

    iput v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 124
    int-to-double v0, v4

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 125
    invoke-static {p1}, Lo/boi;->i(Landroid/app/Activity;)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p1}, Lo/boi;->k(Landroid/app/Activity;)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 126
    invoke-virtual {p0, v5}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    goto :goto_2

    .line 130
    :cond_4
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 131
    instance-of v0, v4, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v0, :cond_5

    .line 134
    move-object v0, v4

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_1

    .line 136
    :cond_5
    instance-of v0, v4, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_6

    .line 138
    move-object v0, v4

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v1, 0x11

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 140
    :cond_6
    :goto_1
    const/high16 v0, 0x43b40000    # 360.0f

    invoke-static {p1, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 141
    invoke-static {p1}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v0

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 142
    invoke-static {p1}, Lo/boi;->i(Landroid/app/Activity;)I

    move-result v0

    neg-int v0, v0

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 143
    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    :goto_2
    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    .line 89
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    .line 90
    iget v0, v2, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static c(Landroid/app/Activity;)I
    .locals 5

    .line 443
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->a()I

    move-result v1

    .line 444
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->g()I

    move-result v2

    .line 446
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 448
    invoke-static {p0}, Lo/bph;->b(Landroid/app/Activity;)I

    move-result v4

    .line 450
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public static c(Landroid/app/Activity;Landroid/view/View;)V
    .locals 2

    .line 246
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 248
    :cond_0
    return-void

    .line 251
    :cond_1
    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 254
    invoke-static {p0}, Lo/bph;->c(Landroid/app/Activity;)I

    move-result v1

    .line 255
    const/high16 v0, 0x42000000    # 32.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    sub-int/2addr v1, v0

    .line 256
    invoke-static {p1, v1}, Lo/bph;->c(Landroid/view/View;I)V

    .line 257
    return-void

    .line 261
    :cond_2
    invoke-static {p0}, Lo/bph;->e(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 263
    invoke-static {p0}, Lo/bph;->d(Landroid/app/Activity;)I

    move-result v1

    .line 264
    invoke-static {p1, v1}, Lo/bph;->c(Landroid/view/View;I)V

    .line 266
    :cond_3
    return-void
.end method

.method public static c(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 278
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 280
    :cond_0
    return-void

    .line 282
    :cond_1
    invoke-static {p0}, Lo/bph;->e(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 284
    invoke-static {p0, p1, p2}, Lo/bph;->d(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V

    goto :goto_0

    .line 288
    :cond_2
    invoke-static {p1}, Lo/bph;->d(Landroid/view/View;)V

    .line 289
    invoke-static {p2}, Lo/bph;->d(Landroid/view/View;)V

    .line 291
    :goto_0
    return-void
.end method

.method private static c(Landroid/app/Activity;Landroid/widget/ImageView;ZII)V
    .locals 9

    .line 220
    invoke-static {p0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v4

    .line 221
    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 223
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_search_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 225
    if-eqz p2, :cond_0

    move v7, v6

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .line 226
    :goto_0
    int-to-double v0, v4

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    double-to-int v0, v0

    sub-int/2addr v0, p3

    sub-int/2addr v0, p4

    sub-int v8, v0, v7

    .line 227
    if-gez v8, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    move v8, v0

    .line 229
    if-eqz p2, :cond_2

    if-ge v8, v6, :cond_2

    .line 231
    move v8, v6

    .line 234
    :cond_2
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    move v0, v8

    :goto_2
    iput v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 235
    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 236
    return-void
.end method

.method public static c(Landroid/view/View;I)V
    .locals 1

    .line 369
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 370
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 371
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 372
    return-void
.end method

.method public static c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V
    .locals 6

    .line 163
    if-eqz p0, :cond_0

    if-nez p2, :cond_1

    .line 165
    :cond_0
    return-void

    .line 167
    :cond_1
    invoke-static {p2}, Lo/boi;->i(Landroid/app/Activity;)I

    move-result v2

    .line 168
    invoke-static {p2}, Lo/boi;->k(Landroid/app/Activity;)I

    move-result v3

    .line 169
    invoke-static {p2}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 172
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 173
    instance-of v0, v4, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v0, :cond_2

    .line 175
    move-object v0, v4

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_0

    .line 177
    :cond_2
    instance-of v0, v4, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_3

    .line 179
    move-object v0, v4

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v1, 0x11

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 182
    :cond_3
    :goto_0
    const/high16 v0, 0x43b40000    # 360.0f

    invoke-static {p2, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 184
    invoke-static {p2}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v0

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 185
    if-eqz p3, :cond_4

    neg-int v5, v2

    goto :goto_1

    :cond_4
    sub-int v5, v3, v2

    .line 186
    :goto_1
    if-gez v5, :cond_5

    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    move v0, v5

    :goto_2
    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 187
    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 188
    goto :goto_4

    .line 192
    :cond_6
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 193
    instance-of v0, v4, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v0, :cond_7

    .line 195
    move-object v0, v4

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_3

    .line 197
    :cond_7
    instance-of v0, v4, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_8

    .line 199
    move-object v0, v4

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 202
    :cond_8
    :goto_3
    const/4 v0, -0x1

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 203
    const/4 v0, -0x2

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 204
    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 207
    :goto_4
    invoke-static {p2, p1, p3, v2, v3}, Lo/bph;->c(Landroid/app/Activity;Landroid/widget/ImageView;ZII)V

    .line 208
    return-void
.end method

.method private static d(Landroid/app/Activity;)I
    .locals 4

    .line 382
    invoke-static {p0}, Lo/bph;->c(Landroid/app/Activity;)I

    move-result v2

    .line 384
    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 386
    mul-int/lit8 v0, v2, 0x6

    div-int/lit8 v0, v0, 0x8

    const/high16 v1, 0x42400000    # 48.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int v3, v0, v1

    goto :goto_0

    .line 390
    :cond_0
    mul-int/lit8 v0, v2, 0x6

    div-int/lit8 v0, v0, 0x8

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int v3, v0, v1

    .line 392
    :goto_0
    return v3
.end method

.method private static d(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V
    .locals 9

    .line 305
    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    invoke-static {p0}, Lo/bph;->d(Landroid/app/Activity;)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int v6, v0, v1

    .line 308
    invoke-static {p0}, Lo/bph;->a(Landroid/app/Activity;)I

    move-result v7

    .line 309
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 311
    invoke-static {p0, v6}, Lo/bph;->b(Landroid/app/Activity;I)I

    move-result v7

    goto :goto_0

    .line 316
    :cond_0
    invoke-static {p0}, Lo/bph;->c(Landroid/app/Activity;)I

    move-result v8

    .line 318
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 320
    div-int/lit8 v0, v8, 0x2

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int v6, v0, v1

    .line 321
    invoke-static {p0, v6}, Lo/bph;->e(Landroid/app/Activity;I)I

    move-result v7

    goto :goto_0

    .line 325
    :cond_1
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v7

    .line 326
    div-int/lit8 v0, v8, 0x2

    sub-int/2addr v0, v7

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int v6, v0, v1

    .line 329
    :cond_2
    :goto_0
    move-object v0, p1

    move v1, v6

    move v2, v7

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-static {p0, v3}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/bph;->b(Landroid/view/View;IIIII)V

    .line 330
    move-object v0, p2

    move v1, v6

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {p0, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    move v4, v7

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/bph;->b(Landroid/view/View;IIIII)V

    .line 331
    return-void
.end method

.method private static d(Landroid/view/View;)V
    .locals 2

    .line 340
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_0

    .line 342
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 343
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 344
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 346
    :cond_0
    return-void
.end method

.method private static e(Landroid/app/Activity;I)I
    .locals 4

    .line 416
    invoke-static {p0}, Lo/bph;->b(Landroid/app/Activity;)I

    move-result v2

    .line 417
    mul-int/lit8 v0, p1, 0x2

    sub-int v0, v2, v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v3, v0, 0x2

    .line 418
    return v3
.end method

.method public static e(Landroid/app/Activity;)Z
    .locals 5

    .line 498
    const/4 v2, 0x0

    .line 499
    const/4 v3, 0x0

    .line 502
    const-string v0, "android.content.Intent"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 503
    const-string v0, "getHwFlags"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 504
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6

    move-result v0

    move v2, v0

    .line 533
    goto :goto_0

    .line 506
    :catch_0
    move-exception v4

    .line 508
    const-string v0, "PadUtil"

    const-string v1, "isSplitActivity ClassNotFoundException"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    goto :goto_0

    .line 510
    :catch_1
    move-exception v4

    .line 512
    const-string v0, "PadUtil"

    const-string v1, "isSplitActivity NoSuchMethodException"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    goto :goto_0

    .line 514
    :catch_2
    move-exception v4

    .line 516
    const-string v0, "PadUtil"

    const-string v1, "isSplitActivity IllegalAccessException"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    goto :goto_0

    .line 518
    :catch_3
    move-exception v4

    .line 520
    const-string v0, "PadUtil"

    const-string v1, "isSplitActivity IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    goto :goto_0

    .line 522
    :catch_4
    move-exception v4

    .line 524
    const-string v0, "PadUtil"

    const-string v1, "isSplitActivity InvocationTargetException"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    goto :goto_0

    .line 526
    :catch_5
    move-exception v4

    .line 528
    const-string v0, "PadUtil"

    const-string v1, "isSplitActivity RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    goto :goto_0

    .line 530
    :catch_6
    move-exception v4

    .line 532
    const-string v0, "PadUtil"

    const-string v1, "isSplitActivity Exception"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    :goto_0
    and-int/lit8 v0, v2, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 2

    .line 71
    sget-boolean v0, Lo/bph;->d:Z

    if-eqz v0, :cond_0

    .line 73
    sget-boolean v0, Lo/bph;->c:Z

    return v0

    .line 76
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$bool;->sns_config_is_pad:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    sput-boolean v0, Lo/bph;->c:Z

    .line 77
    const/4 v0, 0x1

    sput-boolean v0, Lo/bph;->d:Z

    .line 78
    sget-boolean v0, Lo/bph;->c:Z

    return v0
.end method
