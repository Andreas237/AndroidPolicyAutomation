.class public Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity_ViewBinding;
.super Ljava/lang/Object;
.source "NotificationDetailActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;

    const-string v0, "field \'lvItems\'"

    .line 30
    const-class v1, Landroid/widget/ListView;

    const v2, 0x7f090347

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->lvItems:Landroid/widget/ListView;

    const-string v0, "field \'tvEmpty\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09051d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->tvEmpty:Landroid/widget/TextView;

    const-string v0, "field \'svDetailRoot\'"

    .line 32
    const-class v1, Landroid/widget/ScrollView;

    const v2, 0x7f090436

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->svDetailRoot:Landroid/widget/ScrollView;

    const-string v0, "field \'llDetails\'"

    .line 33
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090305

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->llDetails:Landroid/widget/LinearLayout;

    const-string v0, "field \'tcvDetails\'"

    .line 34
    const-class v1, Lcom/ibotta/android/view/common/TextContainerView;

    const v2, 0x7f09044f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/view/common/TextContainerView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->tcvDetails:Lcom/ibotta/android/view/common/TextContainerView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 42
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->lvItems:Landroid/widget/ListView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->tvEmpty:Landroid/widget/TextView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->svDetailRoot:Landroid/widget/ScrollView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->llDetails:Landroid/widget/LinearLayout;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;->tcvDetails:Lcom/ibotta/android/view/common/TextContainerView;

    return-void

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
