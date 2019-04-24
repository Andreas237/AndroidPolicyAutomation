.class public final Lcom/ibotta/android/service/debug/DebugOverlayService_MembersInjector;
.super Ljava/lang/Object;
.source "DebugOverlayService_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/service/debug/DebugOverlayService;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/service/debug/DebugOverlayService_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/service/debug/DebugOverlayService;",
            ">;"
        }
    .end annotation

    .line 21
    new-instance v0, Lcom/ibotta/android/service/debug/DebugOverlayService_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/service/debug/DebugOverlayService_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAppHelper(Lcom/ibotta/android/service/debug/DebugOverlayService;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/service/debug/DebugOverlayService;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/service/debug/DebugOverlayService_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/debug/DebugOverlayService_MembersInjector;->injectAppHelper(Lcom/ibotta/android/service/debug/DebugOverlayService;Lcom/ibotta/android/util/AppHelper;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/service/debug/DebugOverlayService;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/debug/DebugOverlayService_MembersInjector;->injectMembers(Lcom/ibotta/android/service/debug/DebugOverlayService;)V

    return-void
.end method
