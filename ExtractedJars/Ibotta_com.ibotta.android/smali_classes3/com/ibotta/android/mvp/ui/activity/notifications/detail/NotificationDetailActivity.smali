.class public Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "NotificationDetailActivity.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;
.implements Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$OptionsDialogListener;
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailComponent;",
        ">;",
        "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;",
        "Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$OptionsDialogListener;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;"
    }
.end annotation


# static fields
.field private static final TAG_FLY_UP_DOUBLE_CHECK:Ljava/lang/String; = "fly_up_double_check"

.field private static final TAG_FLY_UP_REPORT_ISSUE:Ljava/lang/String; = "fly_up_report_issue"

.field private static final TAG_GIFT_CARD_EMAIL_RESENT:Ljava/lang/String; = "gift_card_email_resent"

.field private static final TAG_HELP_OPTIONS:Ljava/lang/String; = "help_options"

.field private static final TAG_REPORT_ISSUE_SUCCESS:Ljava/lang/String; = "report_issue_success"


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected llDetails:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090305
    .end annotation
.end field

.field protected lvItems:Landroid/widget/ListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090347
    .end annotation
.end field

.field protected notificationDetailFactory:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected svDetailRoot:Landroid/widget/ScrollView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090436
    .end annotation
.end field

.field protected tcvDetails:Lcom/ibotta/android/view/common/TextContainerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044f
    .end annotation
.end field

.field protected tvEmpty:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09051d
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private hideContent()V
    .locals 2

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->lvItems:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->svDetailRoot:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    const-string v1, "notification"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->setNotification(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)V

    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 118
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->setNotification(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 58
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailComponent;
    .locals 1

    .line 80
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;

    move-result-object v0

    .line 81
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;)V

    .line 82
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->notificationDetailModule(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;

    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailComponent;

    move-result-object p1

    return-object p1
.end method

.method public createDetail(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;
    .locals 4

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->notificationDetailFactory:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;

    invoke-interface {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;->createActivityDetail(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    move-result-object p1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->lvItems:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->tvEmpty:Landroid/widget/TextView;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->setItemsView(Landroid/widget/ListView;Landroid/widget/TextView;)V

    .line 171
    invoke-interface {p1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getLayout()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 173
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 174
    invoke-interface {p1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isCustomContainer()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->tcvDetails:Lcom/ibotta/android/view/common/TextContainerView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/ibotta/android/view/common/TextContainerView;->setVisibility(I)V

    .line 176
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->llDetails:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 178
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->tcvDetails:Lcom/ibotta/android/view/common/TextContainerView;

    invoke-virtual {v1, v3}, Lcom/ibotta/android/view/common/TextContainerView;->setVisibility(I)V

    .line 179
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->tcvDetails:Lcom/ibotta/android/view/common/TextContainerView;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/view/common/TextContainerView;->addBodyChild(Landroid/view/View;)V

    .line 183
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->llDetails:Landroid/widget/LinearLayout;

    invoke-interface {p1, v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->setParentView(Landroid/view/View;)V

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->tcvDetails:Lcom/ibotta/android/view/common/TextContainerView;

    invoke-interface {p1, v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->setTextContainerView(Lcom/ibotta/android/view/common/TextContainerView;)V

    return-object p1
.end method

.method public getFlyUpPageCreator(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "fly_up_double_check"

    .line 318
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 319
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    .line 320
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->getDetail()Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 319
    invoke-interface {p1, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    .line 321
    new-instance v0, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;

    invoke-direct {v0, p0, p2, v1, p1}, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    :cond_0
    const-string v0, "fly_up_report_issue"

    .line 322
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, 0x7f11005b

    .line 323
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 324
    new-instance v0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const-string v2, ""

    invoke-direct {v0, v1, p2, p1, v2}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-object v0

    :cond_1
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 58
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailComponent;)V
    .locals 0

    .line 88
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 93
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c0053

    .line 95
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->setContentView(I)V

    .line 96
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->hideContent()V

    .line 99
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->loadState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 6

    .line 131
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    .line 134
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->getDetail()Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    move-result-object v1

    .line 136
    invoke-interface {v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isResendGiftCardEmail()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    .line 137
    invoke-interface {v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isViewReceipt()Z

    move-result v2

    if-nez v2, :cond_1

    .line 138
    invoke-interface {v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isReportIssue()Z

    move-result v2

    if-nez v2, :cond_1

    .line 139
    invoke-interface {v1}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isVisitSupport()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const v1, 0x7f090034

    const v2, 0x7f11003e

    .line 141
    invoke-interface {p1, v4, v1, v4, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    .line 142
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080265

    const/4 v5, 0x0

    invoke-static {v1, v2, v5}, Landroid/support/graphics/drawable/VectorDrawableCompat;->create(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/support/graphics/drawable/VectorDrawableCompat;

    move-result-object v1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    const/4 p1, 0x1

    :goto_1
    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :cond_3
    :goto_2
    return v3
.end method

.method public onFlyUpCancel(Ljava/lang/String;I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onFlyUpPageEvent(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V
    .locals 2

    const-string v0, "fly_up_double_check"

    .line 332
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;->getEventId()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 333
    sget-object p1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string p2, "fly_up_double_check"

    invoke-virtual {p1, p0, p2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    .line 334
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->onDoubleCheckContinueClicked()V

    goto :goto_0

    :cond_0
    const-string v0, "fly_up_report_issue"

    .line 335
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 336
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;->getEventId()I

    move-result p1

    if-ne p1, v1, :cond_1

    .line 337
    sget-object p1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v0, "fly_up_report_issue"

    invoke-virtual {p1, p0, v0}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    .line 338
    check-cast p2, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;

    invoke-virtual {p2}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;->getInput()Ljava/lang/String;

    move-result-object p1

    .line 339
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->onReportIssueSubmitClicked(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onOptionSelected(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;I)V
    .locals 1

    .line 284
    instance-of v0, p1, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;

    if-nez v0, :cond_0

    return-void

    .line 288
    :cond_0
    check-cast p1, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;

    .line 289
    invoke-virtual {p1, p2}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->fromIndex(I)Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 292
    sget-object p2, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity$1;->$SwitchMap$com$ibotta$android$fragment$activity$ActivityHelpOptionsDialogFragment$HelpOption:[I

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 303
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->onSupportClicked()V

    goto :goto_0

    .line 300
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->onReportIssueClicked()V

    goto :goto_0

    .line 297
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->onViewReceiptClicked()V

    goto :goto_0

    .line 294
    :pswitch_3
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->onResendGiftCardEmail()V

    :cond_1
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onOptionsCancel()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 152
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090034

    if-ne v0, v1, :cond_0

    .line 153
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->onHelpClicked()V

    const/4 p1, 0x1

    return p1

    .line 157
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 124
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "notification"

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->getNotification()Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 104
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onStart()V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->getDetail()Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->onFragmentResume()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->getDetail()Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->onFragmentPause()V

    .line 111
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onStop()V

    return-void
.end method

.method public setDetailsVisible(Z)V
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->svDetailRoot:Landroid/widget/ScrollView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ScrollView;->setVisibility(I)V

    return-void
.end method

.method public setItemsVisible(Z)V
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->lvItems:Landroid/widget/ListView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setVisibility(I)V

    return-void
.end method

.method public showDoubleCheckDialog()V
    .locals 3

    const/4 v0, 0x0

    .line 251
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    .line 252
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 253
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "fly_up_double_check"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showHelpCenter()V
    .locals 1

    .line 258
    new-instance v0, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showHelpDialog()V
    .locals 4

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;->getDetail()Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    move-result-object v0

    .line 203
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 206
    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isResendGiftCardEmail()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 207
    sget-object v2, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->RESEND_GIFT_CARD:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isViewReceipt()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getReceiptUrls()[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getReceiptUrls()[Ljava/lang/String;

    move-result-object v2

    array-length v2, v2

    if-lez v2, :cond_2

    .line 211
    sget-object v2, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->VIEW_RECEIPT:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 215
    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object v2

    invoke-static {p0, v3, v2}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v2

    goto :goto_0

    .line 216
    :cond_1
    invoke-static {p0}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v2

    .line 217
    :goto_0
    invoke-virtual {v2}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameCaps()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 220
    :goto_1
    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isReportIssue()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 221
    sget-object v3, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->REPORT_ISSUE:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    :cond_3
    invoke-interface {v0}, Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;->isVisitSupport()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 225
    sget-object v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->HELP_CENTER:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    :cond_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    .line 229
    invoke-static {v0, v2}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->newInstance([Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;Ljava/lang/String;)Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;

    move-result-object v0

    .line 230
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 232
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "help_options"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showReceiptViewer([Ljava/lang/String;)V
    .locals 1

    .line 245
    new-instance v0, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showReportIssueDialog()V
    .locals 3

    const/4 v0, 0x0

    .line 263
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    .line 264
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 265
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "fly_up_report_issue"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showReportIssueError()V
    .locals 2

    const v0, 0x7f11005a

    .line 270
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;

    move-result-object v0

    .line 271
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    invoke-virtual {v1, p0, v0}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;)V

    return-void
.end method

.method public showReportIssueSuccess()V
    .locals 3

    const v0, 0x7f1101d6

    .line 277
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 276
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;

    move-result-object v0

    const/4 v1, 0x1

    .line 278
    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->setCancelable(Z)V

    .line 279
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "report_issue_success"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showResendGiftCardSuccess()V
    .locals 3

    const/4 v0, 0x1

    const-wide/32 v1, 0x7f110460

    .line 237
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->newInstance(ZJ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object v0

    .line 239
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 240
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "gift_card_email_resent"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method
