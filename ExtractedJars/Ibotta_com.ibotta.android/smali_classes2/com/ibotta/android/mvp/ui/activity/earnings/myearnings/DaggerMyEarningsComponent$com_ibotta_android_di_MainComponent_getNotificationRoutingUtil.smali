.class Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;
.super Ljava/lang/Object;
.source "DaggerMyEarningsComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getNotificationRoutingUtil"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 445
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 446
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;
    .locals 2

    .line 451
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 452
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationRoutingUtil()Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 451
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 441
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;->get()Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;

    move-result-object v0

    return-object v0
.end method
