.class public final Lcom/yandex/metrica/impl/as;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/as$b;,
        Lcom/yandex/metrica/impl/as$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/yandex/metrica/impl/ob/ls;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/ls<",
            "Ljava/lang/Integer;",
            "Lcom/yandex/metrica/impl/as$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lcom/yandex/metrica/impl/ob/ls;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/ls<",
            "Lcom/yandex/metrica/impl/as$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 215
    new-instance v0, Lcom/yandex/metrica/impl/as$1;

    sget-object v1, Lcom/yandex/metrica/impl/as$a;->d:Lcom/yandex/metrica/impl/as$a;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/as$1;-><init>(Lcom/yandex/metrica/impl/as$a;)V

    sput-object v0, Lcom/yandex/metrica/impl/as;->a:Lcom/yandex/metrica/impl/ob/ls;

    .line 223
    new-instance v0, Lcom/yandex/metrica/impl/as$2;

    const/4 v1, 0x2

    .line 224
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/as$2;-><init>(Ljava/lang/Integer;)V

    sput-object v0, Lcom/yandex/metrica/impl/as;->b:Lcom/yandex/metrica/impl/ob/ls;

    return-void
.end method

.method public static a(Z)J
    .locals 4

    .line 263
    :try_start_0
    invoke-static {p0}, Lcom/yandex/metrica/impl/as;->b(Z)Landroid/os/StatFs;

    move-result-object p0

    .line 264
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v0, v0

    .line 265
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockSize()I

    move-result p0

    int-to-long v2, p0

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x400

    .line 266
    div-long/2addr v0, v2
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/a;
    .locals 6
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 112
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 114
    invoke-static {p0}, Lcom/yandex/metrica/impl/as;->b(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    .line 116
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 117
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 119
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float v2, v2

    div-float v3, v2, v0

    int-to-float v1, v1

    div-float v4, v1, v0

    .line 122
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    const/high16 v4, 0x43200000    # 160.0f

    mul-float/2addr v0, v4

    div-float/2addr v2, v0

    div-float/2addr v1, v0

    mul-float/2addr v2, v2

    mul-float/2addr v1, v1

    add-float/2addr v2, v1

    float-to-double v0, v2

    .line 128
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide/high16 v4, 0x402e000000000000L    # 15.0

    cmpl-double v2, v0, v4

    if-ltz v2, :cond_0

    .line 1145
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v2, "android.hardware.touchscreen"

    invoke-virtual {p0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    .line 131
    sget-object p0, Lcom/yandex/metrica/a;->c:Lcom/yandex/metrica/a;

    return-object p0

    :cond_1
    const-wide/high16 v4, 0x401c000000000000L    # 7.0

    cmpl-double p0, v0, v4

    if-gez p0, :cond_3

    const/high16 p0, 0x44160000    # 600.0f

    cmpl-float p0, v3, p0

    if-ltz p0, :cond_2

    goto :goto_1

    .line 138
    :cond_2
    sget-object p0, Lcom/yandex/metrica/a;->a:Lcom/yandex/metrica/a;

    return-object p0

    .line 135
    :cond_3
    :goto_1
    sget-object p0, Lcom/yandex/metrica/a;->b:Lcom/yandex/metrica/a;

    return-object p0
.end method

.method public static a(Ljava/util/Locale;)Ljava/lang/String;
    .locals 3
    .param p0    # Ljava/util/Locale;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 199
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    .line 200
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 202
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x15

    .line 203
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    invoke-virtual {p0}, Ljava/util/Locale;->getScript()Ljava/lang/String;

    move-result-object p0

    .line 205
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x2d

    .line 206
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    const/16 p0, 0x5f

    .line 210
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;)Landroid/graphics/Point;
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    const-string v0, "window"

    .line 151
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowManager;

    .line 152
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    .line 156
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 158
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 159
    invoke-virtual {p0, v0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 160
    iget p0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 161
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    move v5, v0

    move v0, p0

    move p0, v5

    goto :goto_0

    .line 163
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    .line 166
    :try_start_0
    const-class v0, Landroid/view/Display;

    const-string v1, "getRawHeight"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 167
    const-class v1, Landroid/view/Display;

    const-string v3, "getRawWidth"

    new-array v4, v2, [Ljava/lang/Class;

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 168
    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 169
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move p0, v0

    move v0, v1

    goto :goto_0

    .line 172
    :catch_0
    invoke-virtual {p0}, Landroid/view/Display;->getWidth()I

    move-result v0

    .line 173
    invoke-virtual {p0}, Landroid/view/Display;->getHeight()I

    move-result p0

    goto :goto_0

    .line 177
    :cond_1
    invoke-virtual {p0}, Landroid/view/Display;->getWidth()I

    move-result v0

    .line 178
    invoke-virtual {p0}, Landroid/view/Display;->getHeight()I

    move-result p0

    .line 181
    :goto_0
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1, v0, p0}, Landroid/graphics/Point;-><init>(II)V

    return-object v1
.end method

.method public static b(Z)Landroid/os/StatFs;
    .locals 1

    if-nez p0, :cond_0

    .line 275
    new-instance p0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    return-object p0

    .line 278
    :cond_0
    new-instance p0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public static c(Z)J
    .locals 4

    .line 283
    :try_start_0
    invoke-static {p0}, Lcom/yandex/metrica/impl/as;->b(Z)Landroid/os/StatFs;

    move-result-object p0

    .line 284
    invoke-virtual {p0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    .line 285
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockSize()I

    move-result p0

    int-to-long v2, p0

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x400

    .line 287
    div-long/2addr v0, v2
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 4

    .line 186
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "level"

    const/4 v2, -0x1

    .line 188
    invoke-virtual {p0, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v3, "scale"

    .line 189
    invoke-virtual {p0, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-ltz v0, :cond_0

    if-lez p0, :cond_0

    int-to-float v0, v0

    int-to-float p0, p0

    div-float/2addr v0, p0

    const/high16 p0, 0x42c80000    # 100.0f

    mul-float/2addr v0, p0

    .line 191
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public static d(Landroid/content/Context;)Lcom/yandex/metrica/impl/as$a;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "connectivity"

    .line 234
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 236
    sget-object v1, Lcom/yandex/metrica/impl/as$a;->d:Lcom/yandex/metrica/impl/as$a;

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    .line 2046
    invoke-static {p0, v2}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    if-eqz v0, :cond_1

    .line 239
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 242
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    sget-object v0, Lcom/yandex/metrica/impl/as;->a:Lcom/yandex/metrica/impl/ob/ls;

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/ls;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/yandex/metrica/impl/as$a;

    goto :goto_0

    .line 245
    :cond_0
    sget-object v1, Lcom/yandex/metrica/impl/as$a;->c:Lcom/yandex/metrica/impl/as$a;

    :cond_1
    :goto_0
    return-object v1
.end method

.method public static e(Landroid/content/Context;)I
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 258
    sget-object v0, Lcom/yandex/metrica/impl/as;->b:Lcom/yandex/metrica/impl/ob/ls;

    invoke-static {p0}, Lcom/yandex/metrica/impl/as;->d(Landroid/content/Context;)Lcom/yandex/metrica/impl/as$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/ls;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method
