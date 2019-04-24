.class public Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "TeammateActivity.java"

# interfaces
.implements Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;
.implements Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;
.implements Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;
.implements Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateComponent;",
        ">;",
        "Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;",
        "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;",
        "Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TeammateActivity"

.field private static final TAG_API_ERROR:Ljava/lang/String; = "api_error"

.field private static final TAG_FLY_UP_FRIEND_MESSAGE:Ljava/lang/String; = "fly_up_friend_message"

.field private static final TAG_FRIEND_MESSAGE_SUCCESS:Ljava/lang/String; = "friend_message_success"


# instance fields
.field private activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

.field protected apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected flToolbarContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901fa
    .end annotation
.end field

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private friendId:I

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
    .end annotation
.end field

.field private size:Lcom/ibotta/android/views/images/Sizes;

.field protected tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field

.field protected tvdTeammateDetail:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09059d
    .end annotation
.end field

.field protected userState:Lcom/ibotta/android/state/user/UserState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    .line 72
    sget-object v0, Lcom/ibotta/android/views/images/Sizes;->FRIEND_PROFILE_HERO_PIC:Lcom/ibotta/android/views/images/Sizes;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->size:Lcom/ibotta/android/views/images/Sizes;

    return-void
.end method

.method private initGraphDataParams()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;
    .locals 6

    .line 157
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;-><init>()V

    .line 158
    new-instance v1, Lcom/ibotta/android/view/graph/DataSet;

    invoke-direct {v1}, Lcom/ibotta/android/view/graph/DataSet;-><init>()V

    const v2, 0x7f06010e

    .line 159
    invoke-virtual {v1, v2}, Lcom/ibotta/android/view/graph/DataSet;->setColorId(I)V

    .line 161
    new-instance v3, Lcom/ibotta/android/view/graph/DataSet;

    invoke-direct {v3}, Lcom/ibotta/android/view/graph/DataSet;-><init>()V

    const v4, 0x7f0600e9

    .line 162
    invoke-virtual {v3, v4}, Lcom/ibotta/android/view/graph/DataSet;->setColorId(I)V

    .line 164
    new-instance v5, Lcom/ibotta/android/view/graph/LegendItem;

    invoke-direct {v5}, Lcom/ibotta/android/view/graph/LegendItem;-><init>()V

    .line 165
    invoke-virtual {v5, v2}, Lcom/ibotta/android/view/graph/LegendItem;->setColorId(I)V

    const v2, 0x7f1101ae

    .line 166
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/ibotta/android/view/graph/LegendItem;->setLabel(Ljava/lang/String;)V

    .line 168
    new-instance v2, Lcom/ibotta/android/view/graph/LegendItem;

    invoke-direct {v2}, Lcom/ibotta/android/view/graph/LegendItem;-><init>()V

    .line 169
    invoke-virtual {v2, v4}, Lcom/ibotta/android/view/graph/LegendItem;->setColorId(I)V

    .line 171
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->setMyDataSet(Lcom/ibotta/android/view/graph/DataSet;)V

    .line 172
    invoke-virtual {v0, v3}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->setFriendDataSet(Lcom/ibotta/android/view/graph/DataSet;)V

    .line 173
    invoke-virtual {v0, v5}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->setMyLegendItem(Lcom/ibotta/android/view/graph/LegendItem;)V

    .line 174
    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;->setFriendLegendItem(Lcom/ibotta/android/view/graph/LegendItem;)V

    return-object v0
.end method

.method private initPresenter()V
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->friendId:I

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;->setFriendId(I)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;->setActivityParcelable(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->initGraphDataParams()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;->setGraphDataParams(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;)V

    return-void
.end method

.method private initToolbarBackgroundColor()V
    .locals 3

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->flToolbarContainer:Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600fc

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setBackgroundColor(I)V

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1202f6

    invoke-virtual {v0, v1}, Landroid/content/Context;->setTheme(I)V

    return-void
.end method

.method private initToolbarValues(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 5

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getProfilePictureUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->ivLogo:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->size:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->tvName:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getFirstName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;I)Landroid/content/Intent;
    .locals 1

    const/4 v0, 0x0

    .line 95
    invoke-static {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->newIntent(Landroid/content/Context;ILcom/ibotta/android/apiandroid/activity/ActivityParcelable;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static newIntent(Landroid/content/Context;ILcom/ibotta/android/apiandroid/activity/ActivityParcelable;)Landroid/content/Intent;
    .locals 2

    .line 99
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "friend_id"

    .line 100
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-eqz p2, :cond_0

    const-string p0, "activity"

    .line 103
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method private onSendMessage(Ljava/lang/String;)V
    .locals 8

    .line 294
    invoke-static {p1}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->isMessageValid(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    iget v6, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->friendId:I

    move-object v5, p0

    move-object v7, p1

    invoke-static/range {v1 .. v7}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->sendFriendMessage(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    const p1, 0x7f1102f8

    .line 298
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->showErrorMessage(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method private setLogoVisible()V
    .locals 5

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->size:Lcom/ibotta/android/views/images/Sizes;

    invoke-virtual {v2}, Lcom/ibotta/android/views/images/Sizes;->getPlaceholderResId()I

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->ivLogo:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->size:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->ivLogo:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public static start(Landroid/content/Context;I)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 91
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->newIntent(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateComponent;
    .locals 1

    .line 115
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;

    move-result-object v0

    .line 116
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;)V

    .line 117
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->teammateModule(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateModule;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;

    move-result-object p1

    .line 118
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/DaggerTeammateComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateComponent;

    move-result-object p1

    return-object p1
.end method

.method public getContext()Landroid/content/Context;
    .locals 0

    return-object p0
.end method

.method public getFlyUpPageCreator(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
    .locals 2

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;

    const-string v1, "fly_up_friend_message"

    invoke-interface {v0, v1, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;->getFlyUpPageCreator(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    move-result-object p1

    return-object p1
.end method

.method public getFlyupCreator(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;
    .locals 8

    .line 191
    new-instance v7, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public getMyRankTitle(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 309
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110437

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 61
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateComponent;)V
    .locals 0

    .line 110
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 123
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "onCreate: %1$s"

    const/4 v1, 0x1

    .line 124
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const v0, 0x7f0c006f

    .line 126
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->setContentView(I)V

    .line 127
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    const/4 v0, 0x0

    .line 129
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 130
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->setLogoVisible()V

    .line 131
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->initToolbarBackgroundColor()V

    if-eqz p1, :cond_0

    const-string v0, "friend_id"

    .line 134
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->friendId:I

    const-string v0, "activity"

    .line 135
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 137
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "friend_id"

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->friendId:I

    .line 138
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 141
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->initPresenter()V

    .line 143
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-lt p1, v0, :cond_2

    .line 144
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/high16 v0, -0x80000000

    .line 145
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 146
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0600fc

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_2
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 231
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0001

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 233
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onFlyUpCancel(Ljava/lang/String;I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onFlyUpPageEvent(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V
    .locals 1

    const-string v0, "fly_up_friend_message"

    .line 277
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 278
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;->getEventId()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 280
    :cond_0
    check-cast p2, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendSendMessageEvent;

    .line 282
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendSendMessageEvent;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->onSendMessage(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onFriendMessageSendFinished(Lcom/ibotta/api/ApiException;)V
    .locals 2
    .param p1    # Lcom/ibotta/api/ApiException;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 325
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->hideSubmittedJobLoading()V

    if-eqz p1, :cond_0

    .line 328
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;

    invoke-virtual {p1}, Lcom/ibotta/api/ApiException;->getDetails()Lcom/ibotta/api/ApiErrorDetails;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;->onFriendMessageFailed(Lcom/ibotta/api/ApiErrorDetails;)V

    goto :goto_0

    .line 330
    :cond_0
    sget-object p1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v0, "friend_message_success"

    invoke-virtual {p1, p0, v0}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    .line 331
    sget-object p1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v0, "fly_up_friend_message"

    invoke-virtual {p1, p0, v0}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    .line 333
    invoke-static {}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->getSuccessDialog()Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object p1

    .line 334
    invoke-virtual {p1, p0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 335
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "friend_message_success"

    invoke-virtual {v0, p0, p1, v1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onFriendMessageSending(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 314
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f1103d4

    .line 316
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->showSubmittedJobLoading(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const p1, 0x7f1103d3

    .line 319
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->showSubmittedJobLoading(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 238
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 240
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;->onNudgeClicked()V

    goto :goto_0

    .line 243
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;->onMessageClicked()V

    .line 247
    :goto_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x7f09035e
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 181
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "friend_id"

    .line 182
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->friendId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->activityParcelable:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    if-eqz v0, :cond_0

    const-string v1, "activity"

    .line 184
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->tvdTeammateDetail:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V

    :cond_0
    return-void
.end method

.method public setTeammate(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 3

    .line 201
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->initToolbarValues(Lcom/ibotta/api/model/customer/Customer;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getLifetimeEarnings()F

    move-result p1

    float-to-double v1, p1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object p1

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->tvdTeammateDetail:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->setTeammate(Ljava/lang/String;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method public showFriendMessageFailed(Lcom/ibotta/api/ApiErrorDetails;)V
    .locals 1

    const-string v0, "api_error"

    .line 267
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->showErrorMessage(Lcom/ibotta/api/ApiErrorDetails;Ljava/lang/String;)V

    return-void
.end method

.method public showMessage(Ljava/lang/String;Ljava/util/Date;)V
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->tvdTeammateDetail:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->showMessage(Ljava/lang/String;Ljava/util/Date;)V

    return-void
.end method

.method public showMessageDialog()V
    .locals 3

    const/4 v0, 0x0

    .line 259
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    .line 260
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 262
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "fly_up_friend_message"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showNudgeClicked()V
    .locals 9

    .line 252
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "fly_up_friend_message"

    invoke-virtual {v0, p0, v1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    .line 253
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    iget v7, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->friendId:I

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v2 .. v8}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->sendFriendMessage(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;ILjava/lang/String;)V

    return-void
.end method
