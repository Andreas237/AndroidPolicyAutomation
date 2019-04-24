.class public Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;
.super Ljava/lang/Object;
.source "TeamworkActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

.field private view7f09007d:Landroid/view/View;

.field private view7f09021f:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    const-string v0, "field \'llContainer\'"

    .line 40
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090330

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->llContainer:Landroid/widget/LinearLayout;

    const-string v0, "field \'rvTeammates\'"

    .line 41
    const-class v1, Landroid/support/v7/widget/RecyclerView;

    const v2, 0x7f0903df

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->rvTeammates:Landroid/support/v7/widget/RecyclerView;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 42
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'bplvRecycler\'"

    .line 43
    const-class v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;

    const v2, 0x7f0900bf

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bplvRecycler:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;

    const-string v0, "field \'bdvBonusDetail\'"

    .line 44
    const-class v1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    const v2, 0x7f0900b6

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bdvBonusDetail:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    const-string v0, "field \'bAddTeammates\' and method \'onAddTeammatesClicked\'"

    const v1, 0x7f09007d

    .line 45
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bAddTeammates\'"

    .line 46
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bAddTeammates:Landroid/widget/Button;

    .line 47
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;->view7f09007d:Landroid/view/View;

    .line 48
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'hbvFacebook\' and method \'onFacebookSignInClicked\'"

    const v1, 0x7f09021f

    .line 54
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'hbvFacebook\'"

    .line 55
    const-class v3, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->hbvFacebook:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    .line 56
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;->view7f09021f:Landroid/view/View;

    .line 57
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f09044c

    const-string v1, "field \'tbvTeammatesTitle\'"

    .line 63
    const-class v2, Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->tbvTeammatesTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    const v0, 0x7f0901d8

    const-string v1, "field \'evEmptyView\'"

    .line 64
    const-class v2, Lcom/ibotta/android/views/empty/EmptyView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/empty/EmptyView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 72
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    .line 74
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->llContainer:Landroid/widget/LinearLayout;

    .line 75
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->rvTeammates:Landroid/support/v7/widget/RecyclerView;

    .line 76
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 77
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bplvRecycler:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;

    .line 78
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bdvBonusDetail:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    .line 79
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->bAddTeammates:Landroid/widget/Button;

    .line 80
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->hbvFacebook:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    .line 81
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->tbvTeammatesTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 82
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;->view7f09007d:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 85
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;->view7f09007d:Landroid/view/View;

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;->view7f09021f:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 87
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_ViewBinding;->view7f09021f:Landroid/view/View;

    return-void

    .line 71
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
