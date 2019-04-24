.class Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/activities/SplashActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BailOutRunnable"
.end annotation


# instance fields
.field splashActivityWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/SplashActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/SplashActivity;)V
    .locals 1

    .line 569
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 570
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;->splashActivityWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 575
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;->splashActivityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/SplashActivity;

    if-eqz v0, :cond_0

    const/16 v1, 0x4a

    .line 577
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/activities/SplashActivity;->access$500(Lcom/shopkick/app/activities/SplashActivity;Ljava/lang/Integer;)V

    .line 579
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "FailedEventParam"

    .line 580
    sget-object v3, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->TIMEOUT:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    invoke-virtual {v3}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->getValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "HttpStatusCode"

    const/4 v3, 0x0

    .line 581
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "ClientErrorCode"

    .line 582
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    invoke-static {v0, v1}, Lcom/shopkick/app/activities/SplashActivity;->access$600(Lcom/shopkick/app/activities/SplashActivity;Ljava/util/Map;)V

    :cond_0
    return-void
.end method
