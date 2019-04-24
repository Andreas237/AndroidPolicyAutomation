.class public final Lcom/ibotta/android/view/video/IbottaVideoView_MembersInjector;
.super Ljava/lang/Object;
.source "IbottaVideoView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/view/video/IbottaVideoView;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/view/video/IbottaVideoView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/view/video/IbottaVideoView;",
            ">;"
        }
    .end annotation

    .line 20
    new-instance v0, Lcom/ibotta/android/view/video/IbottaVideoView_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/view/video/IbottaVideoView_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAppConfig(Lcom/ibotta/android/view/video/IbottaVideoView;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/view/video/IbottaVideoView;)V
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/video/IbottaVideoView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/view/video/IbottaVideoView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/video/IbottaVideoView_MembersInjector;->injectMembers(Lcom/ibotta/android/view/video/IbottaVideoView;)V

    return-void
.end method
