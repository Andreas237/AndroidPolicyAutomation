.class public Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "TeamworkModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;",
        ">;"
    }
.end annotation


# instance fields
.field private final teamworkView:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;->teamworkView:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    return-void
.end method

.method public static provideTeamworkReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/account/teamwork/TeamworkReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 40
    new-instance v0, Lcom/ibotta/android/account/teamwork/TeamworkReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/account/teamwork/TeamworkReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public provideCallbackManager()Lcom/facebook/CallbackManager;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 77
    invoke-static {}, Lcom/facebook/CallbackManager$Factory;->create()Lcom/facebook/CallbackManager;

    move-result-object v0

    return-object v0
.end method

.method public provideFacebookManager(Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/social/facebook/FacebookManager;
    .locals 11
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 64
    new-instance v9, Lcom/ibotta/android/social/facebook/FacebookManager;

    move-object v10, p0

    iget-object v0, v10, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;->teamworkView:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    move-object v0, v9

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/social/facebook/FacebookManager;-><init>(Landroid/app/Activity;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v9
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;Lcom/ibotta/android/account/teamwork/TeamworkReducer;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;
    .locals 8
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 51
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;Lcom/ibotta/android/account/teamwork/TeamworkReducer;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v7
.end method

.method public provideTeamworkLoadStrategy(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V

    return-object v0
.end method
