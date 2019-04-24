.class public final Lcom/ibotta/android/receiver/LocationChangeReceiver_MembersInjector;
.super Ljava/lang/Object;
.source "LocationChangeReceiver_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/receiver/LocationChangeReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field private final locationStatusDispatcherProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/receiver/LocationChangeReceiver_MembersInjector;->locationStatusDispatcherProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/receiver/LocationChangeReceiver;",
            ">;"
        }
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/receiver/LocationChangeReceiver_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/receiver/LocationChangeReceiver_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectLocationStatusDispatcher(Lcom/ibotta/android/receiver/LocationChangeReceiver;Lcom/ibotta/android/location/LocationStatusDispatcher;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/receiver/LocationChangeReceiver;->locationStatusDispatcher:Lcom/ibotta/android/location/LocationStatusDispatcher;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/receiver/LocationChangeReceiver;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/receiver/LocationChangeReceiver_MembersInjector;->locationStatusDispatcherProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/location/LocationStatusDispatcher;

    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/LocationChangeReceiver_MembersInjector;->injectLocationStatusDispatcher(Lcom/ibotta/android/receiver/LocationChangeReceiver;Lcom/ibotta/android/location/LocationStatusDispatcher;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/receiver/LocationChangeReceiver;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/receiver/LocationChangeReceiver_MembersInjector;->injectMembers(Lcom/ibotta/android/receiver/LocationChangeReceiver;)V

    return-void
.end method
