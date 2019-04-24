.class public Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity_ViewBinding;
.super Ljava/lang/Object;
.source "DebugMenuActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 19
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;

    const-string v0, "field \'rvMenu\'"

    .line 26
    const-class v1, Landroid/support/v7/widget/RecyclerView;

    const v2, 0x7f0903da

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/RecyclerView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->rvMenu:Landroid/support/v7/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;

    .line 36
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuActivity;->rvMenu:Landroid/support/v7/widget/RecyclerView;

    return-void

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
