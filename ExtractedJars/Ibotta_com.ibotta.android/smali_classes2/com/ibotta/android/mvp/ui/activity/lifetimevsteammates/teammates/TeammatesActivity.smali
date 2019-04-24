.class public Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "TeammatesActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesRecyclerListener;
.implements Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesView;
.implements Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesRecyclerListener;",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesView;",
        "Lcom/ibotta/android/mvp/ui/misc/CustomToolbarIdentifier;"
    }
.end annotation


# instance fields
.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field protected tlvTeammatesListView:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammatesListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09048e
    .end annotation
.end field

.field protected tvSubtitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09057c
    .end annotation
.end field

.field protected tvSubtitleValue:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090580
    .end annotation
.end field

.field protected tvTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090587
    .end annotation
.end field

.field protected userState:Lcom/ibotta/android/state/user/UserState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initSubtitle()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->tvSubtitle:Landroid/widget/TextView;

    const v1, 0x7f1103c5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private initTitle()V
    .locals 2

    const/4 v0, 0x0

    .line 77
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->tvTitle:Landroid/widget/TextView;

    const v1, 0x7f1103c7

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 50
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 46
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesComponent;
    .locals 1

    .line 60
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/DaggerTeammatesComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/DaggerTeammatesComponent$Builder;

    move-result-object v0

    .line 61
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/DaggerTeammatesComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/DaggerTeammatesComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesView;)V

    .line 62
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/DaggerTeammatesComponent$Builder;->teammatesModule(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesModule;)Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/DaggerTeammatesComponent$Builder;

    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/DaggerTeammatesComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesComponent;

    move-result-object p1

    return-object p1
.end method

.method public getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 31
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesComponent;)V
    .locals 0

    .line 55
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 68
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0070

    .line 70
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->setContentView(I)V

    .line 71
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->initTitle()V

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->initSubtitle()V

    return-void
.end method

.method public onTeammateClicked(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 2

    .line 103
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result p1

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->start(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setFriends(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;)V"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->tlvTeammatesListView:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammatesListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammatesListView;->setListener(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesRecyclerListener;)V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->tlvTeammatesListView:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammatesListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammatesListView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public setSubtitleValue(II)V
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->tvSubtitleValue:Landroid/widget/TextView;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const p1, 0x7f1103c6

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
