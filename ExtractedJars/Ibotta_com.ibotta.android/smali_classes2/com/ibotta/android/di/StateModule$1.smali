.class Lcom/ibotta/android/di/StateModule$1;
.super Ljava/lang/Object;
.source "StateModule.java"

# interfaces
.implements Lcom/ibotta/android/location/LocationStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/di/StateModule;->provideUserState(Landroid/content/Context;Lcom/appboy/Appboy;Lcom/ibotta/android/state/app/UserStateAppCallback;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/state/user/UserState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$userState:Lcom/ibotta/android/state/user/UserStateImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/state/user/UserStateImpl;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule$1;->val$userState:Lcom/ibotta/android/state/user/UserStateImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$1;->val$userState:Lcom/ibotta/android/state/user/UserStateImpl;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/user/UserStateImpl;->setLastLocation(Landroid/location/Location;)V

    return-void
.end method

.method public onLocationStatusChanged(Z)V
    .locals 0

    return-void
.end method
