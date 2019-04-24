.class public Lo/elx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static b:[I

.field private static c:I

.field private static d:I

.field private static e:[F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/elx;->b:[I

    .line 21
    const/4 v0, 0x5

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    sput-object v0, Lo/elx;->e:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Landroid/content/Context;)V
    .locals 6

    .line 122
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 123
    return-void

    .line 125
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:style/Theme.Emui.NoActionBar"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 126
    move-object v5, p0

    check-cast v5, Landroid/app/Activity;

    .line 127
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    invoke-static {}, Lcom/huawei/ui/commonui/base/BaseActivity;->isMIUI()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    const/4 v0, 0x1

    invoke-static {v0, v5}, Lcom/huawei/ui/commonui/base/BaseActivity;->setMIUIStatusBarMode(ZLandroid/app/Activity;)V

    .line 130
    return-void

    .line 132
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    invoke-static {}, Lcom/huawei/ui/commonui/base/BaseActivity;->isFlyme()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 134
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/base/BaseActivity;->setMeizuStatusBarDarkIcon(Landroid/view/Window;Z)Z

    .line 135
    return-void

    .line 137
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_4

    .line 138
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 139
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x2400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 142
    :cond_3
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->color_statusBar_bg_transparent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 145
    :cond_4
    :goto_0
    return-void
.end method

.method public static c(Landroid/content/Context;)F
    .locals 1

    .line 39
    const/high16 v0, 0x42a80000    # 84.0f

    invoke-static {p0, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method public static d(Landroid/content/Context;)V
    .locals 6

    .line 96
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 97
    return-void

    .line 99
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:style/Theme.Emui.NoActionBar"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 100
    move-object v5, p0

    check-cast v5, Landroid/app/Activity;

    .line 101
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    invoke-static {}, Lcom/huawei/ui/commonui/base/BaseActivity;->isMIUI()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    const/4 v0, 0x0

    invoke-static {v0, v5}, Lcom/huawei/ui/commonui/base/BaseActivity;->setMIUIStatusBarMode(ZLandroid/app/Activity;)V

    .line 104
    return-void

    .line 106
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    invoke-static {}, Lcom/huawei/ui/commonui/base/BaseActivity;->isFlyme()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 108
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/base/BaseActivity;->setMeizuStatusBarDarkIcon(Landroid/view/Window;Z)Z

    .line 109
    return-void

    .line 111
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_4

    .line 112
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 113
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 116
    :cond_3
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 119
    :cond_4
    :goto_0
    return-void
.end method

.method public static e()V
    .locals 5

    .line 46
    const-string v0, "UIHLH_ScrollUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    const/4 v4, 0x0

    :goto_0
    sget-object v0, Lo/elx;->b:[I

    array-length v0, v0

    if-ge v4, v0, :cond_0

    .line 48
    sget-object v0, Lo/elx;->b:[I

    const/4 v1, 0x0

    aput v1, v0, v4

    .line 49
    sget-object v0, Lo/elx;->e:[F

    const/4 v1, 0x0

    aput v1, v0, v4

    .line 47
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 51
    :cond_0
    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 0

    .line 148
    invoke-static {p0}, Lo/elx;->b(Landroid/content/Context;)V

    .line 149
    return-void
.end method

.method public static e(Landroid/content/Context;Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)V
    .locals 4

    .line 60
    invoke-static {p0}, Lo/elx;->c(Landroid/content/Context;)F

    move-result v3

    .line 61
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->hw_show_color_text_main_title_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    sput v0, Lo/elx;->c:I

    .line 62
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->user_profile_level_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    sput v0, Lo/elx;->a:I

    .line 63
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_color_white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    sput v0, Lo/elx;->d:I

    .line 64
    sget-object v0, Lo/elx;->b:[I

    aget v0, v0, p2

    if-gtz v0, :cond_0

    .line 65
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(IF)V

    .line 66
    sget v0, Lo/elx;->d:I

    sget v1, Lo/elx;->d:I

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v2, v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(FII)V

    .line 67
    invoke-static {p0}, Lo/elx;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 68
    :cond_0
    sget-object v0, Lo/elx;->b:[I

    aget v0, v0, p2

    if-lez v0, :cond_1

    sget-object v0, Lo/elx;->b:[I

    aget v0, v0, p2

    int-to-float v0, v0

    cmpg-float v0, v0, v3

    if-gez v0, :cond_1

    .line 69
    sget-object v0, Lo/elx;->e:[F

    aget v0, v0, p2

    sget v1, Lo/elx;->d:I

    sget v2, Lo/elx;->d:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(FII)V

    .line 70
    invoke-static {p0}, Lo/elx;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 71
    :cond_1
    sget-object v0, Lo/elx;->b:[I

    aget v0, v0, p2

    int-to-float v0, v0

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_2

    sget-object v0, Lo/elx;->b:[I

    aget v0, v0, p2

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v3

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 72
    invoke-static {p0}, Lo/elx;->b(Landroid/content/Context;)V

    .line 73
    sget-object v0, Lo/elx;->e:[F

    aget v0, v0, p2

    sget v1, Lo/elx;->a:I

    sget v2, Lo/elx;->c:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(FII)V

    .line 75
    :cond_2
    :goto_0
    sget-object v0, Lo/elx;->b:[I

    aget v0, v0, p2

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v3

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    sget-object v0, Lo/elx;->b:[I

    aget v0, v0, p2

    if-lez v0, :cond_3

    .line 76
    sget v0, Lo/elx;->d:I

    sget-object v1, Lo/elx;->b:[I

    aget v1, v1, p2

    mul-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    div-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(IF)V

    goto :goto_1

    .line 77
    :cond_3
    sget-object v0, Lo/elx;->b:[I

    aget v0, v0, p2

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v3

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_4

    .line 78
    invoke-static {p0}, Lo/elx;->b(Landroid/content/Context;)V

    .line 79
    sget v0, Lo/elx;->a:I

    sget v1, Lo/elx;->c:I

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v2, v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(FII)V

    .line 80
    sget v0, Lo/elx;->d:I

    const/high16 v1, 0x437f0000    # 255.0f

    invoke-virtual {p1, v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(IF)V

    .line 82
    :cond_4
    :goto_1
    return-void
.end method
