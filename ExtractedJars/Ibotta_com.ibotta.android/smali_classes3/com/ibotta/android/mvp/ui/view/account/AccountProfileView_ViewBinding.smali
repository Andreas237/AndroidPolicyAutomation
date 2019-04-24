.class public Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;
.super Ljava/lang/Object;
.source "AccountProfileView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;

.field private view7f09008a:Landroid/view/View;

.field private view7f0901ff:Landroid/view/View;

.field private view7f090334:Landroid/view/View;

.field private view7f0905c0:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 31
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;

    const-string v0, "field \'pivProfileImage\'"

    .line 39
    const-class v1, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;

    const v2, 0x7f0903a0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->pivProfileImage:Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;

    const-string v0, "field \'tvName\'"

    .line 40
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvName:Landroid/widget/TextView;

    const-string v0, "field \'tvLifetimeEarnings\'"

    .line 41
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09053f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvLifetimeEarnings:Landroid/widget/TextView;

    const-string v0, "field \'flWithdrawCashAvailable\' and method \'onWithdrawAvailableClicked\'"

    const v1, 0x7f0901ff

    .line 42
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'flWithdrawCashAvailable\'"

    .line 43
    const-class v3, Landroid/widget/FrameLayout;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->flWithdrawCashAvailable:Landroid/widget/FrameLayout;

    .line 44
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f0901ff:Landroid/view/View;

    .line 45
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'llWithdrawCashUnavailable\' and method \'onWithdrawUnavailableClicked\'"

    const v1, 0x7f090334

    .line 51
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'llWithdrawCashUnavailable\'"

    .line 52
    const-class v3, Landroid/widget/LinearLayout;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->llWithdrawCashUnavailable:Landroid/widget/LinearLayout;

    .line 53
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f090334:Landroid/view/View;

    .line 54
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f0904f9

    const-string v1, "field \'tvAvailableCash\'"

    .line 60
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvAvailableCash:Landroid/widget/TextView;

    const v0, 0x7f090593

    const-string v1, "field \'tvUnavailableCash\'"

    .line 61
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvUnavailableCash:Landroid/widget/TextView;

    const v0, 0x7f0903b7

    const-string v1, "field \'prvPendingReceipts\'"

    .line 62
    const-class v2, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->prvPendingReceipts:Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;

    const-string v0, "field \'pepvPendingEarningsProgress\' and method \'onEarningsProgressBarClicked\'"

    const v1, 0x7f0905c0

    .line 63
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'pepvPendingEarningsProgress\'"

    .line 64
    const-class v3, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->pepvPendingEarningsProgress:Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    .line 65
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f0905c0:Landroid/view/View;

    .line 66
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    const v0, 0x7f09008a

    const-string v1, "method \'onQuestionMarkClicked\'"

    .line 72
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 73
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f09008a:Landroid/view/View;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$4;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$4;-><init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_3

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_3
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    .line 87
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;

    .line 89
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->pivProfileImage:Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;

    .line 90
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvName:Landroid/widget/TextView;

    .line 91
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvLifetimeEarnings:Landroid/widget/TextView;

    .line 92
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->flWithdrawCashAvailable:Landroid/widget/FrameLayout;

    .line 93
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->llWithdrawCashUnavailable:Landroid/widget/LinearLayout;

    .line 94
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvAvailableCash:Landroid/widget/TextView;

    .line 95
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvUnavailableCash:Landroid/widget/TextView;

    .line 96
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->prvPendingReceipts:Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;

    .line 97
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->pepvPendingEarningsProgress:Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f0901ff:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 100
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f0901ff:Landroid/view/View;

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f090334:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 102
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f090334:Landroid/view/View;

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f0905c0:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 104
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f0905c0:Landroid/view/View;

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f09008a:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 106
    :goto_3
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;->view7f09008a:Landroid/view/View;

    return-void

    .line 86
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
