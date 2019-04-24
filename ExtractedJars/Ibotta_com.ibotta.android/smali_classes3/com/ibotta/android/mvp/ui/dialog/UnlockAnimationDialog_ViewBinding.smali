.class public Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog_ViewBinding;
.super Ljava/lang/Object;
.source "UnlockAnimationDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 19
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;

    const-string v0, "field \'uavUnlockAnimation\'"

    .line 26
    const-class v1, Lcom/ibotta/android/view/UnlockAnimationView;

    const v2, 0x7f0905a3

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/view/UnlockAnimationView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->uavUnlockAnimation:Lcom/ibotta/android/view/UnlockAnimationView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;

    .line 36
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->uavUnlockAnimation:Lcom/ibotta/android/view/UnlockAnimationView;

    return-void

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
