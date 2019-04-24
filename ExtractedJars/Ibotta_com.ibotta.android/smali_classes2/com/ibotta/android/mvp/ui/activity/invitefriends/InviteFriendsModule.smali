.class public Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "InviteFriendsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;",
        ">;"
    }
.end annotation


# instance fields
.field private final inviteFriendsView:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;->inviteFriendsView:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    return-void
.end method


# virtual methods
.method public provideFacebookManager(Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/social/facebook/FacebookManager;
    .locals 11
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 52
    new-instance v9, Lcom/ibotta/android/social/facebook/FacebookManager;

    move-object v10, p0

    iget-object v0, v10, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;->inviteFriendsView:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

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

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 40
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method
