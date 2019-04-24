.class public Lcom/huawei/ui/commonui/base/BaseActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"


# static fields
.field public static final CLEAN_ACTIVITY:Ljava/lang/String; = "com.huawei.commonui.CLEAN_ACTIVITY"

.field private static final TAG:Ljava/lang/String;

.field private static mBIAnalyticsUtil:Lo/cxf; = null


# instance fields
.field private localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

.field private mBroadcast:Landroid/content/BroadcastReceiver;

.field private mIntentFilter:Landroid/content/IntentFilter;

.field private themeId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const-class v0, Lcom/huawei/ui/commonui/base/BaseActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    .line 48
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBIAnalyticsUtil:Lo/cxf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->themeId:I

    .line 50
    new-instance v0, Lcom/huawei/ui/commonui/base/BaseActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/commonui/base/BaseActivity$4;-><init>(Lcom/huawei/ui/commonui/base/BaseActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBroadcast:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 36
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static isFlyme()Z
    .locals 2

    .line 247
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "meizu"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    const/4 v0, 0x1

    return v0

    .line 250
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isMIUI()Z
    .locals 2

    .line 239
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "xiaomi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    const/4 v0, 0x1

    return v0

    .line 242
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static setMIUIStatusBarMode(ZLandroid/app/Activity;)V
    .locals 9

    .line 269
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    .line 271
    const/4 v5, 0x0

    .line 272
    const-string v0, "android.view.MiuiWindowManager$LayoutParams"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 273
    const-string v0, "EXTRA_FLAG_STATUS_BAR_DARK_MODE"

    invoke-virtual {v6, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    .line 274
    invoke-virtual {v7, v6}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v5

    .line 275
    const-string v0, "setExtraFlags"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    .line 276
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    if-eqz p0, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v8, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    .line 287
    goto/16 :goto_1

    .line 277
    :catch_0
    move-exception v5

    .line 278
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "xiaomi setStatusBarDarkIcon: failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/NoSuchFieldException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    goto/16 :goto_1

    .line 279
    :catch_1
    move-exception v5

    .line 280
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "xiaomi setStatusBarDarkIcon: failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    goto :goto_1

    .line 281
    :catch_2
    move-exception v5

    .line 282
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "xiaomi setStatusBarDarkIcon: failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    goto :goto_1

    .line 283
    :catch_3
    move-exception v5

    .line 284
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "xiaomi setStatusBarDarkIcon: failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    goto :goto_1

    .line 285
    :catch_4
    move-exception v5

    .line 286
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "xiaomi setStatusBarDarkIcon: failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/reflect/InvocationTargetException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    :goto_1
    return-void
.end method

.method public static setMIUITranslucentStatus(ZLandroid/view/Window;)V
    .locals 4

    .line 255
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 256
    return-void

    .line 258
    :cond_0
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    .line 259
    const/high16 v3, 0x4000000

    .line 260
    if-eqz p0, :cond_1

    .line 261
    iget v0, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v1, 0x4000000

    or-int/2addr v0, v1

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    goto :goto_0

    .line 263
    :cond_1
    iget v0, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    const v1, -0x4000001

    and-int/2addr v0, v1

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 265
    :goto_0
    invoke-virtual {p1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 266
    return-void
.end method

.method public static setMeizuStatusBarDarkIcon(Landroid/view/Window;Z)Z
    .locals 10

    .line 291
    const/4 v4, 0x0

    .line 292
    if-eqz p0, :cond_1

    .line 294
    :try_start_0
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 295
    const-class v0, Landroid/view/WindowManager$LayoutParams;

    const-string v1, "MEIZU_FLAG_DARK_STATUS_BAR_ICON"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    .line 296
    const-class v0, Landroid/view/WindowManager$LayoutParams;

    const-string v1, "meizuFlags"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    .line 297
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 298
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 299
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v8

    .line 300
    invoke-virtual {v7, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v9

    .line 301
    if-eqz p1, :cond_0

    .line 302
    or-int/2addr v9, v8

    goto :goto_0

    .line 304
    :cond_0
    xor-int/lit8 v0, v8, -0x1

    and-int/2addr v9, v0

    .line 306
    :goto_0
    invoke-virtual {v7, v5, v9}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 307
    invoke-virtual {p0, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 308
    const/4 v4, 0x1

    .line 313
    goto :goto_1

    .line 309
    :catch_0
    move-exception v5

    .line 310
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "meizu setStatusBarDarkIcon: failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/NoSuchFieldException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    goto :goto_1

    .line 311
    :catch_1
    move-exception v5

    .line 312
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "meizu setStatusBarDarkIcon: failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    :cond_1
    :goto_1
    return v4
.end method


# virtual methods
.method protected initSystemBar()V
    .locals 3

    .line 198
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    if-ne v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 200
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 201
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 202
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    .line 204
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    const/high16 v2, 0x4000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 206
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x2400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 211
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    if-ne v0, v1, :cond_6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_6

    .line 213
    iget v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->themeId:I

    if-nez v0, :cond_2

    invoke-static {}, Lcom/huawei/ui/commonui/base/BaseActivity;->isMIUI()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 215
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/huawei/ui/commonui/base/BaseActivity;->setMIUITranslucentStatus(ZLandroid/view/Window;)V

    .line 216
    const/4 v0, 0x1

    invoke-static {v0, p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->setMIUIStatusBarMode(ZLandroid/app/Activity;)V

    .line 217
    return-void

    .line 218
    :cond_2
    iget v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->themeId:I

    if-nez v0, :cond_3

    invoke-static {}, Lcom/huawei/ui/commonui/base/BaseActivity;->isFlyme()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 220
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    const/high16 v2, 0x4000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 221
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/base/BaseActivity;->setMeizuStatusBarDarkIcon(Landroid/view/Window;Z)Z

    .line 222
    return-void

    .line 225
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 226
    iget v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->themeId:I

    if-nez v0, :cond_4

    .line 227
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 228
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_1

    .line 230
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_white_0alpha:I

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 233
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x2400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 236
    :cond_6
    return-void
.end method

.method protected loadApplicationTheme()V
    .locals 6

    .line 100
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 101
    if-nez v4, :cond_0

    .line 102
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadApplicationTheme() if (theme == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    return-void

    .line 108
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    if-ne v0, v1, :cond_1

    .line 110
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:style/Theme.Emui.NoActionBar"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->themeId:I

    goto :goto_0

    .line 112
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "WearTheme"

    const-string v2, "style"

    const-string v3, "com.huawei.bone"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->themeId:I

    .line 134
    :goto_0
    iget v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->themeId:I

    if-nez v0, :cond_2

    .line 135
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate if (themeId == 0)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 137
    :cond_2
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate if (themeId == 0) ELSE themeId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->themeId:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->themeId:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/base/BaseActivity;->setTheme(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    :goto_1
    goto :goto_2

    .line 141
    :catch_0
    move-exception v5

    .line 142
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "catch (Exception e)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    :goto_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 65
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/ebm;->d(Landroid/content/Context;)V

    .line 69
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 72
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBIAnalyticsUtil:Lo/cxf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 73
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBIAnalyticsUtil:Lo/cxf;

    .line 77
    :cond_1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->mIntentFilter:Landroid/content/IntentFilter;

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->mIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 79
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBroadcast:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->mIntentFilter:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 85
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->loadApplicationTheme()V

    .line 86
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->initSystemBar()V

    .line 88
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 89
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->common_color_white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 92
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000b

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 93
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 169
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V

    .line 172
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/ebm;->b(Landroid/content/Context;)V

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBroadcast:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 178
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBIAnalyticsUtil:Lo/cxf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 179
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBIAnalyticsUtil:Lo/cxf;

    invoke-virtual {v0, p0}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 181
    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 160
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 162
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBIAnalyticsUtil:Lo/cxf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 163
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBIAnalyticsUtil:Lo/cxf;

    invoke-virtual {v0, p0}, Lo/cxf;->e(Landroid/content/Context;)V

    .line 165
    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 321
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 323
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 148
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 152
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBIAnalyticsUtil:Lo/cxf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 153
    sget-object v0, Lcom/huawei/ui/commonui/base/BaseActivity;->mBIAnalyticsUtil:Lo/cxf;

    invoke-virtual {v0, p0}, Lo/cxf;->a(Landroid/content/Context;)V

    .line 156
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 185
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStart()V

    .line 186
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 190
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStop()V

    .line 191
    return-void
.end method
