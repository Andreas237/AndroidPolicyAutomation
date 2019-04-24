.class public Lcom/ibotta/android/util/AppHelperImpl;
.super Ljava/lang/Object;
.source "AppHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/util/AppHelper;


# instance fields
.field private final context:Landroid/content/Context;

.field private final expirationRulesSupplier:Lcom/ibotta/android/util/ExpirationRulesSupplier;

.field private final handler:Landroid/os/Handler;

.field private final hardware:Lcom/ibotta/android/hardware/Hardware;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lcom/ibotta/android/util/AppHelperImpl;->expirationRulesSupplier:Lcom/ibotta/android/util/ExpirationRulesSupplier;

    .line 62
    iput-object p3, p0, Lcom/ibotta/android/util/AppHelperImpl;->hardware:Lcom/ibotta/android/hardware/Hardware;

    .line 63
    iput-object p4, p0, Lcom/ibotta/android/util/AppHelperImpl;->handler:Landroid/os/Handler;

    return-void
.end method

.method private createViewUriIntentWithoutIbotta(Landroid/net/Uri;)Landroid/content/Intent;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/NoSuitableIntentException;
        }
    .end annotation

    .line 477
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 478
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 480
    iget-object v1, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    .line 481
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 484
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$DjnDZN8TIgn49OzD9-dD15wcnzY;

    invoke-direct {v1, p0}, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$DjnDZN8TIgn49OzD9-dD15wcnzY;-><init>(Lcom/ibotta/android/util/AppHelperImpl;)V

    .line 485
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$a0HS_iy7cxIaWC4ohFaFZEeW8Jc;

    invoke-direct {v1, p1}, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$a0HS_iy7cxIaWC4ohFaFZEeW8Jc;-><init>(Landroid/net/Uri;)V

    .line 486
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 492
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 494
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 497
    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    sget v1, Lcom/ibotta/android/util/R$string;->common_open_with:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    .line 495
    :cond_0
    new-instance v0, Lcom/ibotta/android/util/NoSuitableIntentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No Intent found for uri: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/util/NoSuitableIntentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic lambda$createViewUriIntentWithoutIbotta$1(Lcom/ibotta/android/util/AppHelperImpl;Landroid/content/pm/ResolveInfo;)Z
    .locals 1

    .line 485
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method static synthetic lambda$createViewUriIntentWithoutIbotta$2(Landroid/net/Uri;Landroid/content/pm/ResolveInfo;)Landroid/content/Intent;
    .locals 2

    .line 487
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 488
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 489
    iget-object p0, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object p0, p0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public static synthetic lambda$showSoftKeyboardAsyncFocus$0(Lcom/ibotta/android/util/AppHelperImpl;Landroid/view/View;)V
    .locals 1

    .line 346
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    const/4 v0, 0x1

    .line 347
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/util/AppHelperImpl;->showSoftKeyboard(Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public calcAspectRatio(FF)F
    .locals 2

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-eqz v1, :cond_1

    cmpl-float v1, p2, v0

    if-nez v1, :cond_0

    goto :goto_0

    .line 312
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    div-float/2addr v0, p1

    return v0

    :cond_1
    :goto_0
    return v0
.end method

.method public copyToClipboard(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "clipboard"

    .line 223
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 224
    invoke-static {p1, p2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    .line 225
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void
.end method

.method public getArrayOfInts(Ljava/util/Set;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)[I"
        }
    .end annotation

    .line 528
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [I

    .line 530
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 531
    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getBestImgUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->isScreenLayoutLarge()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 268
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object p1, p2

    :cond_1
    return-object p1
.end method

.method public getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 258
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/util/AppHelperImpl;->getBestImgUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getColor(I)I
    .locals 1

    .line 373
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method public getColorStateList(Landroid/content/res/Resources;I)Landroid/content/res/ColorStateList;
    .locals 2

    .line 380
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 381
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/Resources;->getColorStateList(ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_0

    .line 383
    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getCurrentTime()J
    .locals 2

    .line 513
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    .line 73
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public getDrawable(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 435
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 436
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    .line 438
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getGooglePlayServicesAvailability()I
    .locals 2

    .line 166
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method public getHtml(Ljava/lang/String;)Landroid/text/Spanned;
    .locals 2

    .line 393
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 394
    invoke-static {p1, v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    goto :goto_0

    .line 396
    :cond_0
    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getLargestOfferImageUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 239
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object v0

    .line 240
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 241
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getUrl()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getOsVersion()I
    .locals 1

    .line 68
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method public varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 565
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getTailingDigits(II)I
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const-string v1, "%%0%1$dd"

    const/4 v2, 0x1

    .line 424
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 425
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 426
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 428
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public hideSoftKeyboard(Landroid/view/View;)V
    .locals 2

    .line 358
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "input_method"

    .line 361
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 362
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void
.end method

.method public isAppInstalled(Ljava/lang/String;)Z
    .locals 3

    .line 177
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v2, 0x80

    .line 184
    :try_start_0
    invoke-virtual {v0, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    :catch_0
    return v1
.end method

.method public isComponentEnabled(Ljava/lang/Class;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 140
    new-instance v2, Landroid/content/ComponentName;

    iget-object v3, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-direct {v2, v3, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 141
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public isEmpty(Ljava/lang/String;)Z
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Contract;
        value = "null -> true"
    .end annotation

    if-eqz p1, :cond_1

    .line 508
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public isGooglePlayServicesAvailable()Z
    .locals 1

    .line 156
    invoke-virtual {p0}, Lcom/ibotta/android/util/AppHelperImpl;->getGooglePlayServicesAvailability()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isOfferExpiring(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 503
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->expirationRulesSupplier:Lcom/ibotta/android/util/ExpirationRulesSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/util/ExpirationRulesSupplier;->getExpiringThresholdHours()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/util/AppHelperImpl;->isWithinDays(Ljava/util/Date;I)Z

    move-result p1

    return p1
.end method

.method public isTwitterInstalled()Z
    .locals 1

    const-string v0, "com.twitter.android"

    .line 207
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/AppHelperImpl;->isAppInstalled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isVenmoInstalled()Z
    .locals 1

    const-string v0, "com.venmo"

    .line 198
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/AppHelperImpl;->isAppInstalled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isWithinDays(Ljava/util/Date;I)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    mul-int/lit8 p2, p2, 0x3c

    mul-int/lit8 p2, p2, 0x3c

    mul-int/lit16 p2, p2, 0x3e8

    int-to-long v1, p2

    .line 90
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    invoke-virtual {p0}, Lcom/ibotta/android/util/AppHelperImpl;->getCurrentTime()J

    move-result-wide v3

    sub-long/2addr p1, v3

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    cmp-long v3, p1, v1

    if-gez v3, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public mapItemsToItemRows(Ljava/util/List;I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ItemType:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TItemType;>;I)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "TItemType;>;>;"
        }
    .end annotation

    .line 539
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 543
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_2

    if-ne v3, p2, :cond_0

    if-eqz v2, :cond_0

    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x0

    :cond_0
    if-nez v3, :cond_1

    .line 550
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 553
    :cond_1
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 554
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 555
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public openUriExternally(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x0

    .line 453
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/ibotta/android/util/AppHelperImpl;->openUriExternally(Landroid/app/Activity;Landroid/net/Uri;Z)V
    :try_end_0
    .catch Lcom/ibotta/android/util/NoSuitableIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 455
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public openUriExternally(Landroid/app/Activity;Landroid/net/Uri;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/NoSuitableIntentException;
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-eqz p3, :cond_1

    .line 467
    invoke-direct {p0, p2}, Lcom/ibotta/android/util/AppHelperImpl;->createViewUriIntentWithoutIbotta(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p2

    goto :goto_0

    .line 469
    :cond_1
    new-instance p3, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {p3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 470
    invoke-virtual {p3, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-object p2, p3

    .line 473
    :goto_0
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public openUrlExternally(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 446
    invoke-virtual {p0, p2}, Lcom/ibotta/android/util/AppHelperImpl;->parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 447
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/util/AppHelperImpl;->openUriExternally(Landroid/app/Activity;Landroid/net/Uri;)V

    return-void
.end method

.method public parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;
    .locals 4

    .line 103
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to parse Uri: %1$s"

    const/4 v2, 0x1

    .line 105
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public parseUrlForQueryParam(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 571
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/AppHelperImpl;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 572
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 574
    invoke-virtual {p0, p2}, Lcom/ibotta/android/util/AppHelperImpl;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 575
    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V
    .locals 0

    .line 518
    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 520
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 522
    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public setComponentEnabled(Ljava/lang/Class;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;Z)V"
        }
    .end annotation

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "Setting component enabled state: %1$s, %2$b"

    const/4 v2, 0x2

    .line 120
    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    new-instance v1, Landroid/content/ComponentName;

    iget-object v3, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    invoke-direct {v1, v3, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-eqz p2, :cond_0

    const/4 v2, 0x1

    .line 124
    :cond_0
    invoke-virtual {v0, v1, v2, v5}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    :cond_1
    return-void
.end method

.method public showSoftKeyboard(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    .line 322
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/util/AppHelperImpl;->showSoftKeyboard(Landroid/view/View;I)V

    return-void
.end method

.method public showSoftKeyboard(Landroid/view/View;I)V
    .locals 2

    .line 333
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->context:Landroid/content/Context;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    .line 335
    invoke-virtual {v0, p1, p2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_0
    return-void
.end method

.method public showSoftKeyboardAsyncFocus(Landroid/view/View;)V
    .locals 2

    .line 345
    iget-object v0, p0, Lcom/ibotta/android/util/AppHelperImpl;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$lRjTjxSfU-V6lUEU6gGKXKDcDuo;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$lRjTjxSfU-V6lUEU6gGKXKDcDuo;-><init>(Lcom/ibotta/android/util/AppHelperImpl;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public toHexColor(I)Ljava/lang/String;
    .locals 6

    .line 283
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/AppHelperImpl;->getColor(I)I

    move-result p1

    .line 284
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    .line 285
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 286
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    const/4 v2, 0x3

    .line 287
    new-array v2, v2, [I

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v0, 0x1

    aput v1, v2, v0

    const/4 v0, 0x2

    aput p1, v2, v0

    const-string p1, ""

    .line 290
    array-length v1, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v2, v3

    .line 291
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    .line 292
    :goto_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v5, v0, :cond_0

    .line 293
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "0"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 295
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 297
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
