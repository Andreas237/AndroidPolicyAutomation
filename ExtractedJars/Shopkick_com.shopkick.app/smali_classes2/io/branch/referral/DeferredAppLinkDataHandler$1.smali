.class final Lio/branch/referral/DeferredAppLinkDataHandler$1;
.super Ljava/lang/Object;
.source "DeferredAppLinkDataHandler.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/DeferredAppLinkDataHandler;->fetchDeferredAppLinkData(Landroid/content/Context;Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;)Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$AppLinkDataClass:Ljava/lang/Class;

.field final synthetic val$callback:Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;


# direct methods
.method constructor <init>(Ljava/lang/Class;Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lio/branch/referral/DeferredAppLinkDataHandler$1;->val$AppLinkDataClass:Ljava/lang/Class;

    iput-object p2, p0, Lio/branch/referral/DeferredAppLinkDataHandler$1;->val$callback:Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 33
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onDeferredAppLinkDataFetched"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    aget-object v0, p3, p1

    if-eqz v0, :cond_1

    .line 35
    iget-object v0, p0, Lio/branch/referral/DeferredAppLinkDataHandler$1;->val$AppLinkDataClass:Ljava/lang/Class;

    aget-object p3, p3, p1

    invoke-virtual {v0, p3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    .line 36
    iget-object v0, p0, Lio/branch/referral/DeferredAppLinkDataHandler$1;->val$AppLinkDataClass:Ljava/lang/Class;

    const-string v1, "getArgumentBundle"

    new-array v2, p1, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 37
    const-class v1, Landroid/os/Bundle;

    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v0, p3, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    if-eqz p1, :cond_0

    const-string p3, "com.facebook.platform.APPLINK_NATIVE_URL"

    .line 40
    invoke-virtual {p1, p3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    .line 43
    :goto_0
    iget-object p3, p0, Lio/branch/referral/DeferredAppLinkDataHandler$1;->val$callback:Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;

    if-eqz p3, :cond_2

    .line 44
    invoke-interface {p3, p1}, Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;->onAppLinkFetchFinished(Ljava/lang/String;)V

    goto :goto_1

    .line 48
    :cond_1
    iget-object p1, p0, Lio/branch/referral/DeferredAppLinkDataHandler$1;->val$callback:Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;

    if-eqz p1, :cond_2

    .line 49
    invoke-interface {p1, p2}, Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;->onAppLinkFetchFinished(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-object p2
.end method
