.class public Lcom/shopkick/app/activities/HomeActivity;
.super Lcom/shopkick/app/activities/BaseActivity;
.source "HomeActivity.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/appboy/events/IEventSubscriber;
.implements Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/shopkick/app/activities/BaseActivity;",
        "Lcom/shopkick/app/util/INotificationObserver;",
        "Lcom/appboy/events/IEventSubscriber<",
        "Lcom/appboy/events/FeedUpdatedEvent;",
        ">;",
        "Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;"
    }
.end annotation


# static fields
.field private static final CONSUME_TOP_INSET_LISTENER:Landroid/view/View$OnApplyWindowInsetsListener;

.field private static final ERROR_DIALOG_REQUEST_CODE:I = 0x3e8

.field public static final EVENT_BADGE_HIDE:Ljava/lang/String; = "EventBadgeHide"

.field public static final EVENT_BADGE_SHOW:Ljava/lang/String; = "EventBadgeShow"

.field private static final LOG_TAG:Ljava/lang/String; = "com.shopkick.app.activities.HomeActivity"

.field public static final PARAM_BADGE_CONTEXT_NAME:Ljava/lang/String; = "paramBadgeContextName"

.field public static final PARAM_BADGE_VALUE:Ljava/lang/String; = "paramBadgeValue"

.field private static final PROFILE_PHOTO_DIAMETER:I = 0x1e


# instance fields
.field private handledLaunchSkLink:Z

.field private kicksCounterController:Lcom/shopkick/app/activities/KicksCounterController;

.field private notificationCenterBadged:Z

.field private optionMenu:Landroid/view/Menu;

.field private placeHolderDrawable:Landroid/graphics/drawable/BitmapDrawable;

.field private profileImageUrl:Ljava/lang/String;

.field private resumeFromKicksCenter:Z

.field private resumeFromNewsfeed:Z

.field private resumeFromSettings:Z

.field private retryProviderInstall:Z

.field private skInternalFeedbackButtonHelper:Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

.field private tabLayout:Landroid/support/design/widget/TabLayout;

.field private tabsPager:Lcom/shopkick/app/view/TabViewPager;

.field private tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 188
    sget-object v0, Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$UnrGyxDASOY-AiiYbwT0AyD6iH0;->INSTANCE:Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$UnrGyxDASOY-AiiYbwT0AyD6iH0;

    sput-object v0, Lcom/shopkick/app/activities/HomeActivity;->CONSUME_TOP_INSET_LISTENER:Landroid/view/View$OnApplyWindowInsetsListener;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Lcom/shopkick/app/activities/BaseActivity;-><init>()V

    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->retryProviderInstall:Z

    .line 99
    iput-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->handledLaunchSkLink:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/activities/HomeActivity;)Ljava/lang/String;
    .locals 0

    .line 73
    iget-object p0, p0, Lcom/shopkick/app/activities/HomeActivity;->profileImageUrl:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/activities/HomeActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->profileImageUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/activities/HomeActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->tryloadingProfileImageFromCache()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/activities/HomeActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->loadThumbnail()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/activities/HomeActivity;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->setHomeAsUpIndicator(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/activities/HomeActivity;I)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->updateBadgingOnTabSelected(I)V

    return-void
.end method

.method private getPlaceholderDrawable()Landroid/graphics/drawable/BitmapDrawable;
    .locals 3

    .line 656
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->placeHolderDrawable:Landroid/graphics/drawable/BitmapDrawable;

    if-nez v0, :cond_0

    const/16 v0, 0x1e

    .line 659
    invoke-static {v0, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    .line 660
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080254

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x0

    .line 661
    invoke-static {v1, v0, v0, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 662
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iput-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->placeHolderDrawable:Landroid/graphics/drawable/BitmapDrawable;

    .line 664
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->placeHolderDrawable:Landroid/graphics/drawable/BitmapDrawable;

    return-object v0
.end method

.method public static synthetic lambda$handleOnCreate$13(Lcom/shopkick/app/activities/HomeActivity;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->kicksCounterController:Lcom/shopkick/app/activities/KicksCounterController;

    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/activities/KicksCounterController;->setEventLogger(Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 158
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "tabChangedEvent"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 159
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->invalidateOptionsMenu()V

    return-void
.end method

.method static synthetic lambda$static$14(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    .line 189
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    .line 190
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    .line 193
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v3

    invoke-virtual {p0, v1, v3, v2, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 194
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result p0

    .line 195
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v0

    .line 196
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v1

    const/4 v2, 0x0

    .line 197
    invoke-virtual {p1, p0, v2, v0, v1}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$updateNotificationBellIcon$15(Lcom/shopkick/app/activities/HomeActivity;Z)V
    .locals 2

    const v0, 0x7f090022

    if-eqz p1, :cond_1

    .line 907
    iget-boolean v1, p0, Lcom/shopkick/app/activities/HomeActivity;->notificationCenterBadged:Z

    if-nez v1, :cond_1

    .line 908
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->optionMenu:Landroid/view/Menu;

    if-eqz p1, :cond_0

    .line 909
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    const v0, 0x7f08021e

    .line 910
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/16 p1, 0x105

    .line 911
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->logElementImpression(I)V

    :cond_0
    const/4 p1, 0x1

    .line 913
    iput-boolean p1, p0, Lcom/shopkick/app/activities/HomeActivity;->notificationCenterBadged:Z

    goto :goto_0

    :cond_1
    if-nez p1, :cond_3

    .line 914
    iget-boolean p1, p0, Lcom/shopkick/app/activities/HomeActivity;->notificationCenterBadged:Z

    if-eqz p1, :cond_3

    .line 915
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->optionMenu:Landroid/view/Menu;

    if-eqz p1, :cond_2

    .line 916
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    const v0, 0x7f08021d

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/16 p1, 0x104

    .line 917
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->logElementImpression(I)V

    :cond_2
    const/4 p1, 0x0

    .line 919
    iput-boolean p1, p0, Lcom/shopkick/app/activities/HomeActivity;->notificationCenterBadged:Z

    :cond_3
    :goto_0
    return-void
.end method

.method private launchLoginPicker()V
    .locals 4

    .line 736
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 737
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "origin_screen"

    .line 739
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v2

    iget-object v2, v2, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v2, v2, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 738
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 741
    :cond_0
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v3, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 744
    invoke-virtual {p0, v1}, Lcom/shopkick/app/activities/HomeActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method

.method private loadThumbnail()V
    .locals 4

    .line 636
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getThumbnailPhotoUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v1, 0x20

    .line 641
    iget-object v2, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-static {v1, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    .line 642
    invoke-static {p0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/support/v4/app/FragmentActivity;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    new-instance v3, Lcom/shopkick/app/activities/HomeActivity$3;

    invoke-direct {v3, p0, v0}, Lcom/shopkick/app/activities/HomeActivity$3;-><init>(Lcom/shopkick/app/activities/HomeActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    .line 652
    invoke-virtual {v0, v1, v1}, Lcom/shopkick/app/util/GlideRequest;->submit(II)Lcom/bumptech/glide/request/FutureTarget;

    return-void
.end method

.method private logElementImpression(I)V
    .locals 4

    .line 928
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 929
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 930
    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz p1, :cond_0

    .line 931
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 932
    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_0

    .line 935
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 936
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 937
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "Tried to log impression but the current screen is null"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static makeViewConsumeTopWindowInsetsOnly(Landroid/view/View;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 201
    sget-object v0, Lcom/shopkick/app/activities/HomeActivity;->CONSUME_TOP_INSET_LISTENER:Landroid/view/View$OnApplyWindowInsetsListener;

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    return-void
.end method

.method private maybeHandlePnsOrLaunchScreenSkLink()V
    .locals 3

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    .line 286
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 287
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchController;->getAppLaunchState()Lcom/shopkick/app/application/AppLaunchState;

    move-result-object v2

    .line 289
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchController;->handlePNS()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 290
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    const v1, 0x7f100003

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    goto :goto_0

    .line 293
    :cond_0
    iget-object v0, v2, Lcom/shopkick/app/application/AppLaunchState;->shopkickLaunchLink:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, v2, Lcom/shopkick/app/application/AppLaunchState;->shopkickLaunchLink:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 295
    invoke-virtual {v2}, Lcom/shopkick/app/application/AppLaunchState;->reset()V

    goto :goto_0

    .line 298
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->handledLaunchSkLink:Z

    if-nez v0, :cond_2

    iget-object v0, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz v0, :cond_2

    .line 299
    iget-object v0, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->launchScreenSkLink:Ljava/lang/String;

    .line 300
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 303
    iput-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->handledLaunchSkLink:Z

    return-void
.end method

.method private onProviderInstallerNotAvailable()V
    .locals 0

    return-void
.end method

.method private setHomeAsUpIndicator(Landroid/graphics/Bitmap;)V
    .locals 5

    .line 668
    new-instance v0, Lcom/shopkick/app/graphics/BitmapHelpers;

    invoke-direct {v0, p0}, Lcom/shopkick/app/graphics/BitmapHelpers;-><init>(Landroid/content/Context;)V

    .line 669
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 670
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const/16 v4, 0x1e

    .line 671
    invoke-virtual {v0, p1, v4}, Lcom/shopkick/app/graphics/BitmapHelpers;->getRoundBitmapWithBorder(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 670
    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBar;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method private setupBottomTabLayout()V
    .locals 8

    .line 417
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TabLayout;->setTabMode(I)V

    const/4 v0, 0x0

    move v2, v0

    .line 420
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v3}, Landroid/support/design/widget/TabLayout;->getTabCount()I

    move-result v3

    if-ge v2, v3, :cond_8

    .line 421
    iget-object v3, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v3, v2}, Landroid/support/design/widget/TabLayout;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v3

    if-eqz v3, :cond_7

    const v4, 0x7f0c01d6

    .line 423
    invoke-virtual {v3, v4}, Landroid/support/design/widget/TabLayout$Tab;->setCustomView(I)Landroid/support/design/widget/TabLayout$Tab;

    .line 424
    invoke-virtual {v3}, Landroid/support/design/widget/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 426
    iget-object v4, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v4}, Landroid/support/design/widget/TabLayout;->getSelectedTabPosition()I

    move-result v4

    if-ne v2, v4, :cond_0

    .line 427
    invoke-virtual {v3, v1}, Landroid/view/View;->setSelected(Z)V

    .line 431
    :cond_0
    iget-object v4, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v4, v2}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getTabBarItem(I)Lcom/shopkick/app/activities/TabBarItem;

    move-result-object v4

    .line 433
    iget-object v4, v4, Lcom/shopkick/app/activities/TabBarItem;->tabContextName:Ljava/lang/String;

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    const v7, -0x524a5976

    if-eq v6, v7, :cond_4

    const v7, -0x468dd0f7

    if-eq v6, v7, :cond_3

    const v7, 0x2f63d8

    if-eq v6, v7, :cond_2

    const v7, 0x6236395

    if-eq v6, v7, :cond_1

    goto :goto_1

    :cond_1
    const-string v6, "lists"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v1

    goto :goto_2

    :cond_2
    const-string v6, "earn"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, 0x3

    goto :goto_2

    :cond_3
    const-string v6, "invite"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, 0x2

    goto :goto_2

    :cond_4
    const-string v6, "browse"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v0

    goto :goto_2

    :cond_5
    :goto_1
    move v4, v5

    :goto_2
    const/4 v5, 0x0

    packed-switch v4, :pswitch_data_0

    move-object v4, v5

    goto :goto_3

    :pswitch_0
    const v4, 0x7f0802f2

    .line 447
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_3

    :pswitch_1
    const v4, 0x7f0802f5

    .line 443
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_3

    :pswitch_2
    const v4, 0x7f0802f8

    .line 439
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_3

    :pswitch_3
    const v4, 0x7f0802ef

    .line 435
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_3
    const v6, 0x7f09071a

    .line 451
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    if-eqz v4, :cond_6

    .line 453
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    .line 455
    :cond_6
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setupTabLayout()V
    .locals 4

    const/4 v0, 0x0

    .line 399
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->setTabSwipeable(Z)V

    .line 401
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPager:Lcom/shopkick/app/view/TabViewPager;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TabLayout;->setupWithViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 402
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    new-instance v1, Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;

    iget-object v2, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPager:Lcom/shopkick/app/view/TabViewPager;

    iget-object v3, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-direct {v1, p0, p0, v2, v3}, Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;-><init>(Lcom/shopkick/app/activities/HomeActivity;Lcom/shopkick/app/activities/HomeActivity;Landroid/support/v4/view/ViewPager;Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;)V

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TabLayout;->addOnTabSelectedListener(Landroid/support/design/widget/TabLayout$BaseOnTabSelectedListener;)V

    .line 403
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->setupBottomTabLayout()V

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object v0

    .line 407
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->defaultTabContextOverride:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->defaultTabContextOverride:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, "earn"

    .line 409
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    iget-object v2, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    iget-object v3, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPager:Lcom/shopkick/app/view/TabViewPager;

    invoke-virtual {v1, v2, v3, v0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->setCurrentTab(Landroid/support/design/widget/TabLayout;Landroid/support/v4/view/ViewPager;Ljava/lang/String;)V

    .line 412
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->updateBadging()V

    return-void
.end method

.method private tryLoadingThumbnailFromCache()V
    .locals 4

    .line 590
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 591
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->getPlaceholderDrawable()Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 594
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getThumbnailPhotoUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 596
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->tryloadingProfileImageFromCache()V

    return-void

    :cond_1
    const/16 v1, 0x20

    .line 600
    iget-object v2, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-static {v1, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    .line 601
    invoke-static {p0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/support/v4/app/FragmentActivity;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    new-instance v3, Lcom/shopkick/app/activities/HomeActivity$1;

    invoke-direct {v3, p0, v0}, Lcom/shopkick/app/activities/HomeActivity$1;-><init>(Lcom/shopkick/app/activities/HomeActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    .line 616
    invoke-virtual {v0, v1, v1}, Lcom/shopkick/app/util/GlideRequest;->submit(II)Lcom/bumptech/glide/request/FutureTarget;

    return-void
.end method

.method private tryloadingProfileImageFromCache()V
    .locals 3

    .line 620
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->profileImageUrl:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x20

    .line 621
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v0

    .line 622
    invoke-static {p0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/support/v4/app/FragmentActivity;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/activities/HomeActivity;->profileImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/activities/HomeActivity$2;

    invoke-direct {v2, p0}, Lcom/shopkick/app/activities/HomeActivity$2;-><init>(Lcom/shopkick/app/activities/HomeActivity;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    .line 632
    invoke-virtual {v1, v0, v0}, Lcom/shopkick/app/util/GlideRequest;->submit(II)Lcom/bumptech/glide/request/FutureTarget;

    return-void
.end method

.method private updateBadging()V
    .locals 4

    .line 755
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout;->getSelectedTabPosition()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 758
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getTabBarItem(I)Lcom/shopkick/app/activities/TabBarItem;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "browse"

    .line 759
    iget-object v0, v0, Lcom/shopkick/app/activities/TabBarItem;->tabContextName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 761
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getQuickKicksRefreshTimestampMs()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_3

    .line 762
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "browse"

    const-string v1, "EventBadgeShow"

    .line 765
    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/activities/HomeActivity;->setBadgeVisibility(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_0
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method private updateBadgingOnTabSelected(I)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 771
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getTabBarItem(I)Lcom/shopkick/app/activities/TabBarItem;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "browse"

    .line 772
    iget-object p1, p1, Lcom/shopkick/app/activities/TabBarItem;->tabContextName:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const-string p1, "browse"

    const-string v0, "EventBadgeHide"

    .line 775
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/activities/HomeActivity;->setBadgeVisibility(Ljava/lang/String;Ljava/lang/String;)V

    .line 776
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putQuickKicksRefreshTimestampMs(J)V

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method private updateNotificationBellIcon(Z)V
    .locals 1

    .line 905
    new-instance v0, Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$S8roEukmJ2HaVSq5YEoCd2HqILI;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$S8roEukmJ2HaVSq5YEoCd2HqILI;-><init>(Lcom/shopkick/app/activities/HomeActivity;Z)V

    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public acceptAppboyIAM()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getKicksCounterController()Lcom/shopkick/app/activities/KicksCounterController;
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->kicksCounterController:Lcom/shopkick/app/activities/KicksCounterController;

    return-object v0
.end method

.method public getTabLayout()Landroid/support/design/widget/TabLayout;
    .locals 1

    .line 335
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    return-object v0
.end method

.method public getTopScreen()Lcom/shopkick/app/screens/AppScreen;
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    return-object v0
.end method

.method public goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 5

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 347
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    .line 350
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/screens/ScreenInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v1, 0x7f010024

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const p1, 0x7f01002a

    .line 351
    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/activities/HomeActivity;->overridePendingTransition(II)V

    .line 354
    iput-boolean v2, p0, Lcom/shopkick/app/activities/HomeActivity;->resumeFromKicksCenter:Z

    goto :goto_0

    .line 355
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v0

    .line 356
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v3

    const-class v4, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/screens/ScreenInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v3, 0x7f010029

    if-eqz v0, :cond_2

    .line 357
    invoke-virtual {p0, v3, v1}, Lcom/shopkick/app/activities/HomeActivity;->overridePendingTransition(II)V

    .line 358
    iput-boolean v2, p0, Lcom/shopkick/app/activities/HomeActivity;->resumeFromNewsfeed:Z

    goto :goto_0

    .line 359
    :cond_2
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object p1

    .line 360
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v0

    const-class v4, Lcom/shopkick/app/more/MoreScreen;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/screens/ScreenInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 361
    invoke-virtual {p0, v3, v1}, Lcom/shopkick/app/activities/HomeActivity;->overridePendingTransition(II)V

    .line 362
    iput-boolean v2, p0, Lcom/shopkick/app/activities/HomeActivity;->resumeFromSettings:Z

    :cond_3
    :goto_0
    return v2
.end method

.method protected goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 4

    .line 369
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->validatePageIdentifier(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string/jumbo v0, "top"

    .line 376
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v1

    .line 377
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 375
    invoke-static {v0, v1, v2, v3}, Lcom/shopkick/app/application/SKUrlTranslator;->getActivityForSKUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/lang/Class;

    move-result-object v0

    .line 379
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v1

    .line 380
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getParams()Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 379
    invoke-static {v1, v2, v3}, Lcom/shopkick/app/application/SKUrlTranslator;->getScreenForSKUrl(Ljava/lang/String;Ljava/util/Map;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/lang/Class;

    move-result-object v1

    .line 382
    const-class v2, Lcom/shopkick/app/activities/HomeActivity;

    if-eq v0, v2, :cond_1

    .line 383
    new-instance v2, Lcom/shopkick/app/activities/PageIdentifierV2;

    .line 385
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v2, v0, v1, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 386
    invoke-virtual {p0, v2}, Lcom/shopkick/app/activities/HomeActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    goto :goto_0

    .line 389
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    iget-object v2, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    iget-object v3, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPager:Lcom/shopkick/app/view/TabViewPager;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, v2, v3, v1, p1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->setCurrentTab(Landroid/support/design/widget/TabLayout;Landroid/support/v4/view/ViewPager;Ljava/lang/Class;Ljava/util/Map;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method protected handleOnCreate()V
    .locals 12

    .line 108
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnCreate()V

    const v0, 0x7f0c00d6

    .line 110
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->setContentView(I)V

    .line 113
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    .line 114
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v1

    if-eqz v1, :cond_0

    .line 116
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/GoogleApiAvailability;->isUserResolvableError(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x1388

    .line 117
    invoke-virtual {v0, p0, v1, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorDialog(Landroid/app/Activity;II)Landroid/app/Dialog;

    move-result-object v0

    .line 118
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 123
    :cond_0
    invoke-static {p0, p0}, Lcom/google/android/gms/security/ProviderInstaller;->installIfNeededAsync(Landroid/content/Context;Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;)V

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const v0, 0x7f090772

    .line 126
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    .line 128
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 129
    invoke-static {v0}, Lcom/shopkick/app/activities/HomeActivity;->makeViewConsumeTopWindowInsetsOnly(Landroid/view/View;)V

    .line 130
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 131
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 132
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 133
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->tryLoadingThumbnailFromCache()V

    :cond_1
    const v1, 0x7f0903db

    .line 137
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->findViewById(I)Landroid/view/View;

    move-result-object v11

    .line 138
    new-instance v0, Lcom/shopkick/app/activities/KicksCounterController;

    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v5, v1, Lcom/shopkick/app/application/ScreenGlobals;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, v1, Lcom/shopkick/app/application/ScreenGlobals;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v9, p0, Lcom/shopkick/app/activities/HomeActivity;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/shopkick/app/activities/KicksCounterController;-><init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/points/ProfilePoints;Lcom/shopkick/app/rewards/RewardsDataController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/logging/UserEventLogger;Landroid/view/View;)V

    iput-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->kicksCounterController:Lcom/shopkick/app/activities/KicksCounterController;

    const v0, 0x7f09071f

    .line 149
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/TabViewPager;

    iput-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPager:Lcom/shopkick/app/view/TabViewPager;

    .line 150
    new-instance v0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    .line 151
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    const-class v5, Lcom/shopkick/app/activities/HomeActivity;

    const/4 v6, 0x0

    const-class v7, Lcom/shopkick/app/activities/HomeTabBarConfig;

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;-><init>(Landroid/content/Context;Landroid/support/v4/app/FragmentManager;Lcom/shopkick/app/application/ScreenGlobals;Ljava/lang/Class;Ljava/util/Map;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    new-instance v1, Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$JOmBM9yJUvdQY-rtLmCp1y-Xd9E;

    invoke-direct {v1, p0}, Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$JOmBM9yJUvdQY-rtLmCp1y-Xd9E;-><init>(Lcom/shopkick/app/activities/HomeActivity;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->setOnTabScreenChangedListener(Lcom/shopkick/app/adapter/TabFragmentPagerAdapter$OnTabScreenChangedListener;)V

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPager:Lcom/shopkick/app/view/TabViewPager;

    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/TabViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    const v0, 0x7f0906b3

    .line 163
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TabLayout;

    iput-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    .line 164
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->setupTabLayout()V

    const/4 v0, 0x0

    .line 166
    iput-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->notificationCenterBadged:Z

    .line 168
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "APIManagerAuthenticationFailedEvent"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 169
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AppActivityManagerAppForegroundedEvent"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 170
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "ProfilePhotoUpdateSuccessEvent"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 171
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "ProfileInfoUpdatedEvent"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 172
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "ClientAppUIFlagsUpdated"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 173
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "ClientFlagsUpdated"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 174
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "EventBadgeShow"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 175
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "EventBadgeHide"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 176
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->skInternalFeedbackButtonHelper:Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

    iput-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->skInternalFeedbackButtonHelper:Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

    .line 178
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->isFcmFailedRegistering()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 179
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFcmFailedRegistering(Z)V

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    invoke-virtual {v0}, Lcom/shopkick/app/gcm/GCMLifeCycle;->register()V

    :cond_2
    return-void
.end method

.method protected handleOnDestroy()V
    .locals 1

    .line 219
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnDestroy()V

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->kicksCounterController:Lcom/shopkick/app/activities/KicksCounterController;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/KicksCounterController;->destroy()V

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->destroy()V

    return-void
.end method

.method protected handleOnPause()V
    .locals 2

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->kicksCounterController:Lcom/shopkick/app/activities/KicksCounterController;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/KicksCounterController;->cancelKicksCounterAnimation()V

    .line 309
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->shouldShowNotificationCenter(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 310
    invoke-static {p0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    const-class v1, Lcom/appboy/events/FeedUpdatedEvent;

    invoke-virtual {v0, p0, v1}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    .line 312
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 314
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->screenWillHide()V

    .line 315
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->screenDidHide()V

    .line 317
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnPause()V

    return-void
.end method

.method protected handleOnResume()V
    .locals 4

    .line 227
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnResume()V

    .line 229
    invoke-static {}, Lcom/shopkick/app/invite/InviteDataManager;->getInstance()Lcom/shopkick/app/invite/InviteDataManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/invite/InviteDataManager;->refresh()V

    .line 231
    iget-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->retryProviderInstall:Z

    if-eqz v0, :cond_0

    .line 232
    invoke-static {p0, p0}, Lcom/google/android/gms/security/ProviderInstaller;->installIfNeededAsync(Landroid/content/Context;Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;)V

    :cond_0
    const/4 v0, 0x0

    .line 234
    iput-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->retryProviderInstall:Z

    .line 236
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->shouldShowNotificationCenter(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 237
    invoke-static {p0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/appboy/Appboy;->subscribeToFeedUpdates(Lcom/appboy/events/IEventSubscriber;)V

    .line 238
    invoke-static {p0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appboy/Appboy;->requestFeedRefresh()V

    .line 241
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->accountExists()Z

    move-result v1

    if-nez v1, :cond_2

    .line 244
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->launchLoginPicker()V

    goto :goto_0

    .line 246
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 248
    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen;->screenWillShow()V

    .line 249
    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen;->screenDidShow()V

    .line 251
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->kicksCounterController:Lcom/shopkick/app/activities/KicksCounterController;

    invoke-virtual {v1}, Lcom/shopkick/app/activities/KicksCounterController;->maybeShowKicksCounterAnimation()V

    .line 252
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->maybeHandlePnsOrLaunchScreenSkLink()V

    .line 255
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppLaunchController;->onHomescreenResumed()V

    .line 259
    :goto_0
    iget-boolean v1, p0, Lcom/shopkick/app/activities/HomeActivity;->resumeFromKicksCenter:Z

    const v2, 0x7f010024

    if-eqz v1, :cond_4

    const v1, 0x7f01002e

    .line 260
    invoke-virtual {p0, v2, v1}, Lcom/shopkick/app/activities/HomeActivity;->overridePendingTransition(II)V

    .line 261
    iput-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->resumeFromKicksCenter:Z

    goto :goto_1

    .line 262
    :cond_4
    iget-boolean v1, p0, Lcom/shopkick/app/activities/HomeActivity;->resumeFromNewsfeed:Z

    const v3, 0x7f01002d

    if-eqz v1, :cond_5

    .line 263
    invoke-virtual {p0, v2, v3}, Lcom/shopkick/app/activities/HomeActivity;->overridePendingTransition(II)V

    .line 264
    iput-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->resumeFromNewsfeed:Z

    goto :goto_1

    .line 265
    :cond_5
    iget-boolean v1, p0, Lcom/shopkick/app/activities/HomeActivity;->resumeFromSettings:Z

    if-eqz v1, :cond_6

    .line 266
    invoke-virtual {p0, v2, v3}, Lcom/shopkick/app/activities/HomeActivity;->overridePendingTransition(II)V

    .line 267
    iput-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->resumeFromSettings:Z

    :cond_6
    :goto_1
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 274
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/activities/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p2, 0x3e8

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    .line 280
    iput-boolean p1, p0, Lcom/shopkick/app/activities/HomeActivity;->retryProviderInstall:Z

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 580
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 582
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    if-eq v0, v1, :cond_0

    .line 583
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    .line 505
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0002

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 506
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->shouldShowNotificationCenter(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const v0, 0x7f090022

    .line 507
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 508
    iget-boolean v2, p0, Lcom/shopkick/app/activities/HomeActivity;->notificationCenterBadged:Z

    if-eqz v2, :cond_0

    .line 509
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const v2, 0x7f08021e

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/16 v0, 0x105

    .line 510
    invoke-direct {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->logElementImpression(I)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x104

    .line 512
    invoke-direct {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->logElementImpression(I)V

    :cond_1
    :goto_0
    const v0, 0x7f09069f

    .line 515
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showInternalFeedbackButton:Ljava/lang/Boolean;

    .line 516
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f090025

    .line 518
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 519
    iput-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->optionMenu:Landroid/view/Menu;

    return v1
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 681
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "EventBadgeShow"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    goto :goto_1

    :sswitch_1
    const-string v0, "EventBadgeHide"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_2
    const-string v0, "ProfilePhotoUpdateSuccessEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "AppActivityManagerAppForegroundedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_1

    :sswitch_4
    const-string v0, "ProfileInfoUpdatedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_5
    const-string v0, "APIManagerAuthenticationFailedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_1

    :sswitch_6
    const-string v0, "ClientAppUIFlagsUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_7
    const-string v0, "ClientFlagsUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x7

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 713
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->optionMenu:Landroid/view/Menu;

    if-nez p1, :cond_1

    return-void

    :cond_1
    const p2, 0x7f09069f

    .line 716
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showInternalFeedbackButton:Ljava/lang/Boolean;

    .line 717
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 720
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->shouldShowNotificationCenter(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    const p2, 0x7f090022

    if-eqz p1, :cond_2

    .line 721
    invoke-static {p0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/appboy/Appboy;->subscribeToFeedUpdates(Lcom/appboy/events/IEventSubscriber;)V

    .line 722
    invoke-static {p0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p1

    invoke-virtual {p1}, Lcom/appboy/Appboy;->requestFeedRefresh()V

    .line 723
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->optionMenu:Landroid/view/Menu;

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_2

    .line 726
    :cond_2
    invoke-static {p0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p1

    const-class v0, Lcom/appboy/events/FeedUpdatedEvent;

    invoke-virtual {p1, p0, v0}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    .line 727
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->optionMenu:Landroid/view/Menu;

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_2

    :pswitch_1
    if-nez p2, :cond_3

    return-void

    :cond_3
    const-string v0, "paramBadgeContextName"

    .line 707
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_4

    return-void

    .line 710
    :cond_4
    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/activities/HomeActivity;->setBadgeVisibility(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 696
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPager:Lcom/shopkick/app/view/TabViewPager;

    invoke-virtual {p1}, Lcom/shopkick/app/view/TabViewPager;->clearOnPageChangeListeners()V

    .line 697
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout;->clearOnTabSelectedListeners()V

    .line 699
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    iget-object p2, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPager:Lcom/shopkick/app/view/TabViewPager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->reloadTabsPager(Landroid/support/v4/view/ViewPager;)V

    .line 700
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->setupTabLayout()V

    goto :goto_2

    .line 691
    :pswitch_3
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->tryLoadingThumbnailFromCache()V

    goto :goto_2

    .line 687
    :pswitch_4
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->updateBadging()V

    goto :goto_2

    .line 683
    :pswitch_5
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/16 p2, 0x9

    invoke-virtual {p1, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->resetCurrentUserWithReason(I)V

    .line 684
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->launchLoginPicker()V

    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4b45e041 -> :sswitch_7
        -0x36efeb62 -> :sswitch_6
        -0x365cf24e -> :sswitch_5
        0x37893616 -> :sswitch_4
        0x3bb70f74 -> :sswitch_3
        0x498511c9 -> :sswitch_2
        0x7b292a2b -> :sswitch_1
        0x7b2e27e6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 7

    const-string v0, "page_identifier"

    .line 206
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    if-eqz p1, :cond_0

    .line 208
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 210
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "launch home activity with pageId : %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 212
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    .line 210
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 6

    .line 525
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x102002c

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eq p1, v0, :cond_6

    const v0, 0x7f090022

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-eq p1, v0, :cond_4

    const v0, 0x7f090025

    if-eq p1, v0, :cond_1

    const v0, 0x7f09069f

    if-eq p1, v0, :cond_0

    goto/16 :goto_1

    .line 572
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->skInternalFeedbackButtonHelper:Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

    invoke-virtual {p1}, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->giveFeedback()V

    return v4

    .line 541
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    const-string v0, "likes"

    .line 544
    instance-of p1, p1, Lcom/shopkick/app/browse/BrowseScreen;

    if-eqz p1, :cond_3

    const-string v0, "likes"

    .line 547
    :cond_3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v1, "default_tab"

    .line 548
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "origin_element"

    const/16 v1, 0x97

    .line 549
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v5, Lcom/shopkick/app/saves/SavesScreen;

    invoke-direct {v0, v2, v5, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 552
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/HomeActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    .line 554
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 556
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 557
    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedPerformClick(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 558
    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return v4

    .line 561
    :cond_4
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v2, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-direct {p1, v0, v2, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 562
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    .line 564
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    iget-boolean v0, p0, Lcom/shopkick/app/activities/HomeActivity;->notificationCenterBadged:Z

    if-eqz v0, :cond_5

    const/16 v0, 0x105

    goto :goto_0

    :cond_5
    const/16 v0, 0x104

    .line 565
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 567
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 568
    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedPerformClick(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 569
    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return v4

    .line 527
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    if-nez p1, :cond_7

    return v2

    .line 529
    :cond_7
    instance-of v0, p1, Lcom/shopkick/app/store/EarnScreen;

    if-eqz v0, :cond_8

    .line 530
    check-cast p1, Lcom/shopkick/app/store/EarnScreen;

    .line 531
    invoke-virtual {p1}, Lcom/shopkick/app/store/EarnScreen;->shouldStartEarnScreenLesson()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 532
    invoke-virtual {p1}, Lcom/shopkick/app/store/EarnScreen;->getHasFtueChainBeenSearched()Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    .line 536
    :cond_8
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v3, Lcom/shopkick/app/more/MoreScreen;

    invoke-direct {p1, v0, v3, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 538
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :goto_1
    return v2
.end method

.method public onProviderInstallFailed(ILandroid/content/Intent;)V
    .locals 2

    .line 793
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object p2

    .line 794
    invoke-virtual {p2, p1}, Lcom/google/android/gms/common/GoogleApiAvailability;->isUserResolvableError(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x3e8

    .line 797
    new-instance v1, Lcom/shopkick/app/activities/HomeActivity$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/activities/HomeActivity$4;-><init>(Lcom/shopkick/app/activities/HomeActivity;)V

    invoke-virtual {p2, p0, p1, v0, v1}, Lcom/google/android/gms/common/GoogleApiAvailability;->showErrorDialogFragment(Landroid/app/Activity;IILandroid/content/DialogInterface$OnCancelListener;)Z

    goto :goto_0

    .line 815
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/activities/HomeActivity;->onProviderInstallerNotAvailable()V

    :goto_0
    return-void
.end method

.method public onProviderInstalled()V
    .locals 0

    return-void
.end method

.method public setBadgeVisibility(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 463
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getTabIndex(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_0

    return-void

    .line 466
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity;->tabLayout:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v1, v0}, Landroid/support/design/widget/TabLayout;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 467
    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    goto/16 :goto_3

    .line 469
    :cond_1
    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090719

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    const/4 v1, -0x1

    .line 475
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, 0x7b292a2b

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v2, v3, :cond_4

    const v3, 0x7b2e27e6

    if-eq v2, v3, :cond_3

    goto :goto_0

    :cond_3
    const-string v2, "EventBadgeShow"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    move v1, v5

    goto :goto_0

    :cond_4
    const-string v2, "EventBadgeHide"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    move v1, v4

    :cond_5
    :goto_0
    if-eqz v1, :cond_6

    move p2, v5

    goto :goto_1

    :cond_6
    move p2, v4

    .line 486
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    int-to-float p2, p2

    invoke-virtual {v1, p2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    const-wide/16 v1, 0xc8

    invoke-virtual {p2, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 489
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 490
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xef

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x42

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p2, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 491
    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTabContextName(Ljava/lang/String;)V

    .line 492
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_2

    :cond_7
    move v4, v5

    :goto_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBadgesAreOff(Ljava/lang/Boolean;)V

    .line 493
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getBadgesAreOff()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBadgesTurnedOff(Ljava/lang/Boolean;)V

    .line 494
    invoke-virtual {p0}, Lcom/shopkick/app/activities/HomeActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz p1, :cond_8

    .line 496
    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_8
    return-void

    :cond_9
    :goto_3
    return-void
.end method

.method public setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public setTabSwipeable(Z)V
    .locals 1

    .line 395
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity;->tabsPager:Lcom/shopkick/app/view/TabViewPager;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/view/TabViewPager;->setSwipeable(Z)V

    return-void
.end method

.method protected showDefaultActivityView()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public trigger(Lcom/appboy/events/FeedUpdatedEvent;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 885
    invoke-virtual {p1}, Lcom/appboy/events/FeedUpdatedEvent;->getFeedCards()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appboy/models/cards/Card;

    .line 887
    instance-of v1, v0, Lcom/appboy/models/cards/ShortNewsCard;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/appboy/models/cards/Card;->isRead()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 895
    :goto_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->updateNotificationBellIcon(Z)V

    return-void
.end method

.method public bridge synthetic trigger(Ljava/lang/Object;)V
    .locals 0

    .line 73
    check-cast p1, Lcom/appboy/events/FeedUpdatedEvent;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/HomeActivity;->trigger(Lcom/appboy/events/FeedUpdatedEvent;)V

    return-void
.end method
