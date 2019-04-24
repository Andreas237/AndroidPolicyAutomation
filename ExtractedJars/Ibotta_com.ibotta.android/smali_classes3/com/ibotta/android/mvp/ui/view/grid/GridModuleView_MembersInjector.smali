.class public final Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView_MembersInjector;
.super Ljava/lang/Object;
.source "GridModuleView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;",
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

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

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
            "Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;",
            ">;"
        }
    .end annotation

    .line 20
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;)V
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;Lcom/ibotta/android/util/AppHelper;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;)V

    return-void
.end method
