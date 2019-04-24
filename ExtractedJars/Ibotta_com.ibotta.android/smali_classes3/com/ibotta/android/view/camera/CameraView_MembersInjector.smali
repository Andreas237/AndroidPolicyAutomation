.class public final Lcom/ibotta/android/view/camera/CameraView_MembersInjector;
.super Ljava/lang/Object;
.source "CameraView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/view/camera/CameraView;",
        ">;"
    }
.end annotation


# instance fields
.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
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
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/view/camera/CameraView;",
            ">;"
        }
    .end annotation

    .line 26
    new-instance v0, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectBuildProfile(Lcom/ibotta/android/view/camera/CameraView;Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/view/camera/CameraView;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method

.method public static injectHandler(Lcom/ibotta/android/view/camera/CameraView;Landroid/os/Handler;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/view/camera/CameraView;->handler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/view/camera/CameraView;)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/view/camera/CameraView;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->injectHandler(Lcom/ibotta/android/view/camera/CameraView;Landroid/os/Handler;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/view/camera/CameraView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->injectMembers(Lcom/ibotta/android/view/camera/CameraView;)V

    return-void
.end method
