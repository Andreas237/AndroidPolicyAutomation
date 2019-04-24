.class public Lcom/ibotta/android/fragment/home/NotificationActionProvider;
.super Landroid/support/v4/view/ActionProvider;
.source "NotificationActionProvider.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final notifCountMgr:Lcom/ibotta/android/async/notification/NotificationCountManager;

.field private onClickListener:Landroid/view/View$OnClickListener;

.field private tvNotificationCount:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Landroid/support/v4/view/ActionProvider;-><init>(Landroid/content/Context;)V

    .line 25
    new-instance p1, Lcom/ibotta/android/async/notification/NotificationCountManager;

    invoke-direct {p1, p2, p3}, Lcom/ibotta/android/async/notification/NotificationCountManager;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    iput-object p1, p0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->notifCountMgr:Lcom/ibotta/android/async/notification/NotificationCountManager;

    return-void
.end method

.method private initViews()V
    .locals 3

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->tvNotificationCount:Landroid/widget/TextView;

    if-nez v0, :cond_0

    return-void

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->notifCountMgr:Lcom/ibotta/android/async/notification/NotificationCountManager;

    invoke-virtual {v0}, Lcom/ibotta/android/async/notification/NotificationCountManager;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 57
    iget-object v1, p0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->tvNotificationCount:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 58
    iget-object v1, p0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->tvNotificationCount:Landroid/widget/TextView;

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->tvNotificationCount:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$onCreateActionView$0(Lcom/ibotta/android/fragment/home/NotificationActionProvider;Landroid/view/View;)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->onClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 43
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onCreateActionView()Landroid/view/View;
    .locals 3

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0132

    const/4 v2, 0x0

    .line 39
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090551

    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->tvNotificationCount:Landroid/widget/TextView;

    .line 41
    new-instance v1, Lcom/ibotta/android/fragment/home/-$$Lambda$NotificationActionProvider$blAmB-Zcjp2CQbUy6dFaJ7MG0PI;

    invoke-direct {v1, p0}, Lcom/ibotta/android/fragment/home/-$$Lambda$NotificationActionProvider$blAmB-Zcjp2CQbUy6dFaJ7MG0PI;-><init>(Lcom/ibotta/android/fragment/home/NotificationActionProvider;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    check-cast v2, Landroid/view/View;

    invoke-static {v2, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 46
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->initViews()V

    return-object v0
.end method

.method public refresh()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->initViews()V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/fragment/home/NotificationActionProvider;->onClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method
