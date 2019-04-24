.class public Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ImConnectedModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;",
        ">;"
    }
.end annotation


# instance fields
.field private final vc:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;Lcom/ibotta/android/views/components/ViewComponent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    return-void
.end method


# virtual methods
.method public providePresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;
    .locals 11
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 35
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;

    move-object v10, p0

    iget-object v2, v10, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    move-object v0, v9

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-object v9
.end method
