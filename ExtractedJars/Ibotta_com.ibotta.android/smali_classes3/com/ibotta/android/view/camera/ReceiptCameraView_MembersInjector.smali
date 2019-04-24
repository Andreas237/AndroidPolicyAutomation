.class public final Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;
.super Ljava/lang/Object;
.source "ReceiptCameraView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/view/camera/ReceiptCameraView;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

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

.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p5, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/view/camera/ReceiptCameraView;",
            ">;"
        }
    .end annotation

    .line 46
    new-instance v6, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static injectAppConfig(Lcom/ibotta/android/view/camera/ReceiptCameraView;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method public static injectAppHelper(Lcom/ibotta/android/view/camera/ReceiptCameraView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectHardware(Lcom/ibotta/android/view/camera/ReceiptCameraView;Lcom/ibotta/android/hardware/Hardware;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/view/camera/ReceiptCameraView;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/view/camera/CameraView;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/CameraView_MembersInjector;->injectHandler(Lcom/ibotta/android/view/camera/CameraView;Landroid/os/Handler;)V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/view/camera/ReceiptCameraView;Lcom/ibotta/android/util/AppHelper;)V

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/view/camera/ReceiptCameraView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/hardware/Hardware;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->injectHardware(Lcom/ibotta/android/view/camera/ReceiptCameraView;Lcom/ibotta/android/hardware/Hardware;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/view/camera/ReceiptCameraView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/camera/ReceiptCameraView_MembersInjector;->injectMembers(Lcom/ibotta/android/view/camera/ReceiptCameraView;)V

    return-void
.end method
