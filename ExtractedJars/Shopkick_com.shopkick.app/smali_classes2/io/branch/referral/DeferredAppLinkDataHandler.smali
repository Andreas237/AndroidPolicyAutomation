.class Lio/branch/referral/DeferredAppLinkDataHandler;
.super Ljava/lang/Object;
.source "DeferredAppLinkDataHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;
    }
.end annotation


# static fields
.field private static final NATIVE_URL_KEY:Ljava/lang/String; = "com.facebook.platform.APPLINK_NATIVE_URL"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fetchDeferredAppLinkData(Landroid/content/Context;Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;)Ljava/lang/Boolean;
    .locals 10

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.facebook.FacebookSdk"

    .line 22
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "sdkInitialize"

    const/4 v3, 0x1

    .line 23
    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    aput-object v5, v4, v0

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 24
    new-array v2, v3, [Ljava/lang/Object;

    aput-object p0, v2, v0

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "com.facebook.applinks.AppLinkData"

    .line 26
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "com.facebook.applinks.AppLinkData$CompletionHandler"

    .line 27
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v5, "fetchDeferredAppLinkData"

    const/4 v6, 0x3

    .line 28
    new-array v7, v6, [Ljava/lang/Class;

    const-class v8, Landroid/content/Context;

    aput-object v8, v7, v0

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v3

    const/4 v8, 0x2

    aput-object v2, v7, v8

    invoke-virtual {v1, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 30
    new-instance v7, Lio/branch/referral/DeferredAppLinkDataHandler$1;

    invoke-direct {v7, v1, p1}, Lio/branch/referral/DeferredAppLinkDataHandler$1;-><init>(Ljava/lang/Class;Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;)V

    .line 56
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    new-array v1, v3, [Ljava/lang/Class;

    aput-object v2, v1, v0

    invoke-static {p1, v1, v7}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    .line 60
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "facebook_app_id"

    const-string/jumbo v7, "string"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v2, v7, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 61
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    new-array v2, v6, [Ljava/lang/Object;

    aput-object p0, v2, v0

    aput-object v1, v2, v3

    aput-object p1, v2, v8

    invoke-virtual {v5, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v3

    .line 70
    :catch_0
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
