.class public Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity_ViewBinding;
.super Ljava/lang/Object;
.source "EngagementActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;

    const-string v0, "field \'llRoot\'"

    .line 27
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090327

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->llRoot:Landroid/widget/LinearLayout;

    const-string v0, "field \'flContent\'"

    .line 28
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901ec

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->flContent:Landroid/widget/FrameLayout;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->llRoot:Landroid/widget/LinearLayout;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->flContent:Landroid/widget/FrameLayout;

    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
