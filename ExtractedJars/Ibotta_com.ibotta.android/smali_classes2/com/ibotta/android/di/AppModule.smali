.class public abstract Lcom/ibotta/android/di/AppModule;
.super Ljava/lang/Object;
.source "AppModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final DEBUG_STATE_PREFS_FILENAME:Ljava/lang/String; = "debug"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static RecentlyViewedOfferHelper(Lcom/ibotta/api/helper/offer/OfferHelper;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 245
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-object v0
.end method

.method public static provideApiLayerNewRelicInterceptor(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 140
    new-instance v0, Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;

    invoke-direct {v0, p0}, Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public static provideApiOkHttpClient(Lokhttp3/OkHttpClient;Lcom/readystatesoftware/chuck/ChuckInterceptor;Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;)Lokhttp3/OkHttpClient;
    .locals 0
    .param p0    # Lokhttp3/OkHttpClient;
        .annotation runtime Ljavax/inject/Named;
            value = "OkHttpClient"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ApiOkHttpClient"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 114
    invoke-virtual {p0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object p0

    .line 115
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p0

    .line 116
    invoke-virtual {p0, p2}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p0

    .line 117
    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p0

    return-object p0
.end method

.method public static provideAppCacheDirInternal(Lcom/ibotta/android/App;)Ljava/io/File;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "AppCacheDirInternal"
    .end annotation

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/App;->getCacheDir()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static provideAppOkHttpClient(Lokhttp3/OkHttpClient;Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;Lcom/readystatesoftware/chuck/ChuckInterceptor;)Lokhttp3/OkHttpClient;
    .locals 0
    .param p0    # Lokhttp3/OkHttpClient;
        .annotation runtime Ljavax/inject/Named;
            value = "OkHttpClient"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "AppOkHttpClient"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 126
    invoke-virtual {p0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object p0

    .line 127
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p0

    .line 128
    invoke-virtual {p0, p2}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p0

    .line 129
    invoke-virtual {p0, p3}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p0

    .line 130
    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p0

    return-object p0
.end method

.method public static provideAppUpgrader(Lcom/ibotta/android/App;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/upgrade/AppUpgrader;
    .locals 1
    .param p1    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 74
    new-instance v0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public static provideAppboy(Landroid/content/Context;)Lcom/appboy/Appboy;
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 212
    invoke-static {p0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p0

    return-object p0
.end method

.method public static provideBackgroundHandler()Landroid/os/Handler;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "background_handler"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 94
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "type_ahead_timeout_handler"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 96
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v1
.end method

.method public static provideBuildProfile(Lcom/ibotta/android/App;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)Lcom/ibotta/android/profile/BuildProfile;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 188
    invoke-static {}, Lcom/ibotta/android/App;->isDebug()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    new-instance v0, Lcom/ibotta/android/profile/IdeBuildProfile;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/profile/IdeBuildProfile;-><init>(Landroid/content/Context;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)V

    goto :goto_0

    .line 199
    :cond_0
    new-instance v0, Lcom/ibotta/android/profile/ReleaseBuildProfile;

    invoke-direct {v0, p0}, Lcom/ibotta/android/profile/ReleaseBuildProfile;-><init>(Landroid/content/Context;)V

    :goto_0
    return-object v0
.end method

.method public static provideChuckInterceptor(Lcom/ibotta/android/App;)Lcom/readystatesoftware/chuck/ChuckInterceptor;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 135
    new-instance v0, Lcom/readystatesoftware/chuck/ChuckInterceptor;

    invoke-direct {v0, p0}, Lcom/readystatesoftware/chuck/ChuckInterceptor;-><init>(Landroid/content/Context;)V

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Lcom/readystatesoftware/chuck/ChuckInterceptor;->showNotification(Z)Lcom/readystatesoftware/chuck/ChuckInterceptor;

    move-result-object p0

    return-object p0
.end method

.method public static provideContext(Lcom/ibotta/android/App;)Landroid/content/Context;
    .locals 0
    .annotation runtime Lcom/ibotta/android/di/AppContext;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/App;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static provideDebugState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/debug/DebugState;
    .locals 1
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsDebugState"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 161
    new-instance v0, Lcom/ibotta/android/state/app/debug/DebugStateImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/debug/DebugStateImpl;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public static provideDebugStateSharedPrefs(Lcom/ibotta/android/App;)Landroid/content/SharedPreferences;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "SharedPrefsDebugState"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    const-string v0, "debug"

    const/4 v1, 0x0

    .line 166
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static provideDefaultOkHttpClient()Lokhttp3/OkHttpClient;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "OkHttpClient"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 106
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public static provideFirebaseInstanceId()Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 217
    invoke-static {}, Lcom/google/firebase/iid/FirebaseInstanceId;->getInstance()Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v0

    return-object v0
.end method

.method public static provideFrontDoorActivities()Ljava/util/Set;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "FrontDoorActivities"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 156
    const-class v0, Lcom/ibotta/android/activity/routing/RoutingActivity;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    invoke-static {v0, v1, v2}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static provideHandler(Lcom/ibotta/android/App;)Landroid/os/Handler;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 84
    invoke-virtual {p0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method public static provideIbottaHeaderInterceptor(Lcom/ibotta/api/ApiContext;Lcom/ibotta/api/HttpHeaders;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 146
    new-instance v0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;

    invoke-interface {p2}, Lcom/ibotta/android/profile/BuildProfile;->isDebugHttpHeaders()Z

    move-result p2

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;-><init>(Lcom/ibotta/api/ApiContext;Lcom/ibotta/api/HttpHeaders;Z)V

    return-object v0
.end method

.method public static provideImageCache(Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/images/ImageCache;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 207
    new-instance v0, Lcom/ibotta/android/images/GlideImageCache;

    invoke-direct {v0, p0}, Lcom/ibotta/android/images/GlideImageCache;-><init>(Lcom/ibotta/android/state/app/debug/DebugState;)V

    return-object v0
.end method

.method public static provideLocale(Landroid/content/Context;)Ljava/util/Locale;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 224
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 225
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object p0

    goto :goto_0

    .line 227
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget-object p0, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    :goto_0
    return-object p0
.end method

.method public static provideLooper(Lcom/ibotta/android/App;)Landroid/os/Looper;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/App;->getMainLooper()Landroid/os/Looper;

    move-result-object p0

    return-object p0
.end method

.method public static provideModulesSaltInterceptor()Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 151
    new-instance v0, Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;-><init>()V

    return-object v0
.end method

.method public static provideProfileDebugStateCallback(Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/profile/ProfileDebugStateCallback;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 171
    new-instance v0, Lcom/ibotta/android/di/AppModule$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AppModule$1;-><init>(Lcom/ibotta/android/state/app/debug/DebugState;)V

    return-object v0
.end method

.method public static provideResources(Lcom/ibotta/android/App;)Landroid/content/res/Resources;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/App;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    return-object p0
.end method

.method public static provideTelephonyManager(Landroid/content/Context;)Landroid/telephony/TelephonyManager;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "phone"

    .line 235
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    return-object p0
.end method

.method public static provideWorkManager()Landroidx/work/WorkManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 240
    invoke-static {}, Landroidx/work/WorkManager;->getInstance()Landroidx/work/WorkManager;

    move-result-object v0

    return-object v0
.end method
