.class public Lcom/huawei/feedback/ui/ar;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "feedback/NotchScreenUtil"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Landroid/app/Activity;)Z
    .locals 9

    .line 103
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    .line 104
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    .line 106
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 107
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 109
    invoke-virtual {v3, v4}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 112
    :cond_0
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 114
    new-instance v6, Landroid/util/DisplayMetrics;

    invoke-direct {v6}, Landroid/util/DisplayMetrics;-><init>()V

    .line 115
    invoke-virtual {v3, v6}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 117
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 119
    invoke-static {p0}, Lcom/huawei/feedback/ui/ar;->b(Landroid/content/Context;)[I

    move-result-object v0

    const/4 v1, 0x1

    aget v8, v0, v1

    .line 122
    add-int v0, v5, v8

    div-int/lit8 v0, v0, 0x2

    add-int v1, v7, v8

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 6

    .line 33
    const/4 v2, 0x0

    .line 36
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 37
    const-string v0, "com.huawei.android.util.HwNotchSizeUtil"

    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 38
    const-string v0, "hasNotchInScreen"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 39
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    move v2, v0

    .line 56
    goto :goto_0

    .line 41
    :catch_0
    move-exception v3

    .line 43
    const-string v0, "feedback/NotchScreenUtil"

    const-string v1, "ClassNotFoundException getNotchSize"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    goto :goto_0

    .line 45
    :catch_1
    move-exception v3

    .line 47
    const-string v0, "feedback/NotchScreenUtil"

    const-string v1, "NoSuchMethodException getNotchSize"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    goto :goto_0

    .line 49
    :catch_2
    move-exception v3

    .line 51
    const-string v0, "feedback/NotchScreenUtil"

    const-string v1, "IllegalAccessException getNotchSize"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    goto :goto_0

    .line 53
    :catch_3
    move-exception v3

    .line 55
    const-string v0, "feedback/NotchScreenUtil"

    const-string v1, "InvocationTargetException getNotchSize"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    :goto_0
    return v2
.end method

.method static a(Landroid/view/View;)Z
    .locals 3

    .line 133
    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 134
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 135
    const/4 v0, 0x0

    aget v2, v1, v0

    .line 136
    if-nez v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static b(Landroid/app/Activity;)Z
    .locals 10

    .line 147
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    .line 148
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    .line 150
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 151
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 153
    invoke-virtual {v3, v4}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 156
    :cond_0
    iget v5, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 157
    iget v6, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 159
    new-instance v7, Landroid/util/DisplayMetrics;

    invoke-direct {v7}, Landroid/util/DisplayMetrics;-><init>()V

    .line 160
    invoke-virtual {v3, v7}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 162
    iget v8, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 163
    iget v9, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 165
    if-ne v8, v5, :cond_1

    if-ne v9, v6, :cond_1

    .line 167
    const/4 v0, 0x0

    return v0

    .line 170
    :cond_1
    mul-int/lit8 v0, v8, 0x2

    if-eq v0, v5, :cond_2

    mul-int/lit8 v0, v9, 0x2

    if-eq v0, v6, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static b(Landroid/content/Context;)[I
    .locals 6

    .line 68
    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    .line 71
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 72
    const-string v0, "com.huawei.android.util.HwNotchSizeUtil"

    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 73
    const-string v0, "getNotchSize"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 74
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    check-cast v0, [I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    move-object v2, v0

    .line 91
    goto :goto_0

    .line 76
    :catch_0
    move-exception v3

    .line 78
    const-string v0, "feedback/NotchScreenUtil"

    const-string v1, "ClassNotFoundException getNotchSize"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    goto :goto_0

    .line 80
    :catch_1
    move-exception v3

    .line 82
    const-string v0, "feedback/NotchScreenUtil"

    const-string v1, "NoSuchMethodException getNotchSize"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    goto :goto_0

    .line 84
    :catch_2
    move-exception v3

    .line 86
    const-string v0, "feedback/NotchScreenUtil"

    const-string v1, "IllegalAccessException getNotchSize"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    goto :goto_0

    .line 88
    :catch_3
    move-exception v3

    .line 90
    const-string v0, "feedback/NotchScreenUtil"

    const-string v1, "InvocationTargetException getNotchSize"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :goto_0
    return-object v2

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method
