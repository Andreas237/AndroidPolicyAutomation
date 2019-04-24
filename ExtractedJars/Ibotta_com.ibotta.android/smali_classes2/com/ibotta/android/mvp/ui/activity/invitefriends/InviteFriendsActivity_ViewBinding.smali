.class public Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;
.super Ljava/lang/Object;
.source "InviteFriendsActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;

.field private view7f09021c:Landroid/view/View;

.field private view7f09021d:Landroid/view/View;

.field private view7f09021e:Landroid/view/View;

.field private view7f090324:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;

    const-string v0, "field \'tvInviteTitle\'"

    .line 40
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090537

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tvInviteTitle:Landroid/widget/TextView;

    const-string v0, "field \'tvInviteDetails\'"

    .line 41
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090536

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tvInviteDetails:Landroid/widget/TextView;

    const-string v0, "field \'tvReferralCode\'"

    .line 42
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090568

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tvReferralCode:Landroid/widget/TextView;

    const-string v0, "field \'hbvInviteTwitter\' and method \'onTwitterClicked\'"

    const v1, 0x7f09021e

    .line 43
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'hbvInviteTwitter\'"

    .line 44
    const-class v3, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->hbvInviteTwitter:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    .line 45
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f09021e:Landroid/view/View;

    .line 46
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090029

    const-string v1, "field \'appBarLayout\'"

    .line 52
    const-class v2, Landroid/support/design/widget/AppBarLayout;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/AppBarLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    const v0, 0x7f0900f8

    const-string v1, "field \'clRegularContainer\'"

    .line 53
    const-class v2, Landroid/support/design/widget/CoordinatorLayout;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/CoordinatorLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;

    const v0, 0x7f09030f

    const-string v1, "field \'llInviteFriendsContentContainer\'"

    .line 54
    const-class v2, Landroid/widget/LinearLayout;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->llInviteFriendsContentContainer:Landroid/widget/LinearLayout;

    const v0, 0x7f090324

    const-string v1, "method \'onReferralCodeClicked\'"

    .line 55
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f090324:Landroid/view/View;

    .line 57
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f09021d

    const-string v1, "method \'onFacebookClicked\'"

    .line 63
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f09021d:Landroid/view/View;

    .line 65
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    const v0, 0x7f09021c

    const-string v1, "method \'onShareClicked\'"

    .line 71
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 72
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f09021c:Landroid/view/View;

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$4;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$4;-><init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)V

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

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    .line 86
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;

    .line 88
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tvInviteTitle:Landroid/widget/TextView;

    .line 89
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tvInviteDetails:Landroid/widget/TextView;

    .line 90
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->tvReferralCode:Landroid/widget/TextView;

    .line 91
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->hbvInviteTwitter:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    .line 92
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->appBarLayout:Landroid/support/design/widget/AppBarLayout;

    .line 93
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->clRegularContainer:Landroid/support/design/widget/CoordinatorLayout;

    .line 94
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->llInviteFriendsContentContainer:Landroid/widget/LinearLayout;

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f09021e:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 97
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f09021e:Landroid/view/View;

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f090324:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 99
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f090324:Landroid/view/View;

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f09021d:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 101
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f09021d:Landroid/view/View;

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f09021c:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 103
    :goto_3
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;->view7f09021c:Landroid/view/View;

    return-void

    .line 85
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
