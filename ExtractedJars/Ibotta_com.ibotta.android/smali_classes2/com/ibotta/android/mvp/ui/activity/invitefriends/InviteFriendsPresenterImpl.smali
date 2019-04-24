.class public Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/social/AbstractSocialMvpPresenter;
.source "InviteFriendsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/social/AbstractSocialMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;"
    }
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field protected customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field protected me:Lcom/ibotta/api/model/customer/Customer;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/base/social/AbstractSocialMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/hardware/Hardware;)V

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public checkIfTwitterInstalled()V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->isTwitterInstalled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;->hideTwitterButton()V

    return-void
.end method

.method public getCustomer()Lcom/ibotta/api/model/customer/Customer;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    return-object v0
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 41
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 43
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 44
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 47
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 53
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onBottomButtonsDialogCancelClicked()V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;->cancelBottomButtonsDialog()V

    return-void
.end method

.method public onCopyReferralCodeClicked()V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getFriendCode()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 83
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getFriendCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;->addCodeToClipboard(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onCopyReferralLinkClicked()V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getInviteUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getInviteUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;->addLinkToClipboard(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onFacebookClicked()V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    if-nez v0, :cond_0

    return-void

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->facebookManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->ensureFacebookSession()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->onFacebookAuthSuccess()V

    :cond_1
    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getFriendCode()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getFriendCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;->setReferralCode(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onReferralCodeClicked()V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;->showCopyOptionsDialog()V

    return-void
.end method

.method public onShareClicked()V
    .locals 3

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    if-nez v0, :cond_0

    return-void

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->getShareSubject()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->getShareMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;->showShareChooser(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onTwitterClicked()V
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getInviteMessaging()Lcom/ibotta/api/model/customer/Customer$InviteMessaging;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getInviteMessaging()Lcom/ibotta/api/model/customer/Customer$InviteMessaging;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->getTwitter()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenterImpl;->me:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getInviteMessaging()Lcom/ibotta/api/model/customer/Customer$InviteMessaging;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->getTwitter()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;->doTweet(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
