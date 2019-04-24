.class public final Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;
.super Ljava/lang/Object;
.source "NetworkChangeReceiver_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/receiver/NetworkChangeReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;"
        }
    .end annotation
.end field

.field private final pixelTrackingManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/receiver/NetworkChangeReceiver;",
            ">;"
        }
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectHardware(Lcom/ibotta/android/receiver/NetworkChangeReceiver;Lcom/ibotta/android/hardware/Hardware;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->hardware:Lcom/ibotta/android/hardware/Hardware;

    return-void
.end method

.method public static injectPixelTrackingManager(Lcom/ibotta/android/receiver/NetworkChangeReceiver;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/receiver/NetworkChangeReceiver;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/receiver/NetworkChangeReceiver;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/hardware/Hardware;

    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;->injectHardware(Lcom/ibotta/android/receiver/NetworkChangeReceiver;Lcom/ibotta/android/hardware/Hardware;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/receiver/NetworkChangeReceiver;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/receiver/NetworkChangeReceiver_MembersInjector;->injectMembers(Lcom/ibotta/android/receiver/NetworkChangeReceiver;)V

    return-void
.end method
