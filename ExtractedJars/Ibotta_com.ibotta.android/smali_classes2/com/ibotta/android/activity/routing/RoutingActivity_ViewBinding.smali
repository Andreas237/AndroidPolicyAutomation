.class public Lcom/ibotta/android/activity/routing/RoutingActivity_ViewBinding;
.super Ljava/lang/Object;
.source "RoutingActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/activity/routing/RoutingActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/activity/routing/RoutingActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-virtual {p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_ViewBinding;-><init>(Lcom/ibotta/android/activity/routing/RoutingActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/activity/routing/RoutingActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_ViewBinding;->target:Lcom/ibotta/android/activity/routing/RoutingActivity;

    const-string v0, "field \'llLoader\'"

    .line 27
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090313

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/activity/routing/RoutingActivity;->llLoader:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvLoadingMessage\'"

    .line 28
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090541

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/activity/routing/RoutingActivity;->tvLoadingMessage:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_ViewBinding;->target:Lcom/ibotta/android/activity/routing/RoutingActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_ViewBinding;->target:Lcom/ibotta/android/activity/routing/RoutingActivity;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/activity/routing/RoutingActivity;->llLoader:Landroid/widget/LinearLayout;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/activity/routing/RoutingActivity;->tvLoadingMessage:Landroid/widget/TextView;

    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
