.class public Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ImConnectModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;",
        ">;"
    }
.end annotation


# instance fields
.field private final imConnectVs:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;Lcom/ibotta/android/views/components/ViewComponent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;->imConnectVs:Lcom/ibotta/android/views/components/ViewComponent;

    return-void
.end method


# virtual methods
.method public providePresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;
    .locals 8
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 30
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;->imConnectVs:Lcom/ibotta/android/views/components/ViewComponent;

    move-object v0, v7

    move-object v1, p1

    move-object v3, p3

    move-object v4, p2

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object v7
.end method
