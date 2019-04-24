.class public Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;
.super Lcom/ibotta/android/mvp/base/social/SocialMvpActivity;
.source "InviteFriendsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;
.implements Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/social/SocialMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;",
        "Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;"
    }
.end annotation


# static fields
.field private static final ACTION_SHEET_OPTION_COPY_REFERRAL_CODE:I = 0x1

.field private static final ACTION_SHEET_OPTION_COPY_REFERRAL_LINK:I = 0x2


# instance fields
.field protected appBarLayout:Landroid/support/design/widget/AppBarLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090029
    .end annotation
.end field

.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

.field protected brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f8
    .end annotation
.end field

.field protected hbvInviteTwitter:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09021e
    .end annotation
.end field

.field protected llInviteFriendsContentContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09030f
    .end annotation
.end field

.field protected tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvInviteDetails:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090536
    .end annotation
.end field

.field protected tvInviteTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090537
    .end annotation
.end field

.field protected tvReferralCode:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090568
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/social/SocialMvpActivity;-><init>()V

    return-void
.end method

.method private buildSheetOptions()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;",
            ">;"
        }
    .end annotation

    .line 120
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 122
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;-><init>()V

    const/4 v2, 0x1

    .line 123
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setId(I)V

    const v2, 0x7f1103ab

    .line 124
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setButtonText(Ljava/lang/String;)V

    .line 125
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;-><init>()V

    const/4 v2, 0x2

    .line 128
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setId(I)V

    const v2, 0x7f1103ac

    .line 129
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setButtonText(Ljava/lang/String;)V

    .line 130
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private checkIfTwitterInstalled()V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;->checkIfTwitterInstalled()V

    return-void
.end method

.method private initInviteDetail()V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tvInviteDetails:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getInviteFriendsCopy()Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initInviteTitle()V
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tvInviteTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getInviteFriendsCopy()Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public addCodeToClipboard(Ljava/lang/String;)V
    .locals 2

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x7f1103b3

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->copyToClipboard(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->showUnlockAnimation()V

    return-void
.end method

.method public addLinkToClipboard(Ljava/lang/String;)V
    .locals 2

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x7f1103b4

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->copyToClipboard(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->showUnlockAnimation()V

    return-void
.end method

.method public cancelBottomButtonsDialog()V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    if-eqz v0, :cond_0

    .line 173
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsComponent;
    .locals 1

    .line 65
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;

    move-result-object v0

    .line 66
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsView;)V

    .line 67
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->inviteFriendsModule(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsModule;)Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;

    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/DaggerInviteFriendsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsComponent;

    move-result-object p1

    return-object p1
.end method

.method public hideTwitterButton()V
    .locals 2

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->hbvInviteTwitter:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;->setVisibility(I)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 37
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsComponent;)V
    .locals 0

    .line 60
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)V

    return-void
.end method

.method public onBottomButtonsDialogOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)V
    .locals 0

    .line 157
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    .line 165
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;->onBottomButtonsDialogCancelClicked()V

    goto :goto_0

    .line 162
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;->onCopyReferralLinkClicked()V

    goto :goto_0

    .line 159
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;->onCopyReferralCodeClicked()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 73
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/social/SocialMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "onCreate: %1$s"

    const/4 v1, 0x1

    .line 74
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v0, "invite_friends"

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/Tracker;->view(Ljava/lang/String;)V

    .line 77
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {p1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackInviteFriendsView()V

    const p1, 0x7f0c0042

    .line 79
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->setContentView(I)V

    .line 80
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->checkIfTwitterInstalled()V

    const p1, 0x7f1103b6

    .line 84
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->setTitle(I)V

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->initInviteTitle()V

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->initInviteDetail()V

    return-void
.end method

.method protected onFacebookClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09021d
        }
    .end annotation

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;->onFacebookClicked()V

    return-void
.end method

.method protected onReferralCodeClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090324
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;->onReferralCodeClicked()V

    return-void
.end method

.method protected onShareClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09021c
        }
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;->onShareClicked()V

    return-void
.end method

.method protected onTwitterClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09021e
        }
    .end annotation

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsPresenter;->onTwitterClicked()V

    return-void
.end method

.method public setReferralCode(Ljava/lang/String;)V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tvReferralCode:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showCopyOptionsDialog()V
    .locals 2

    .line 113
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;)V

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->buildSheetOptions()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->setOptions(Ljava/util/List;)V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->show()V

    return-void
.end method
