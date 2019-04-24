.class public Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity_ViewBinding;
.super Ljava/lang/Object;
.source "ImConnectedActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;

    const-string v0, "field \'clImDetailHeader\'"

    .line 28
    const-class v1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    const v2, 0x7f0900f6

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    const-string v0, "field \'bReceiptUpload\'"

    .line 29
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f09009a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->bReceiptUpload:Landroid/widget/Button;

    const-string v0, "field \'tvNoCashBack\'"

    .line 30
    const-class v1, Lcom/ibotta/android/views/base/text/LinkTextView;

    const v2, 0x7f09054f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/base/text/LinkTextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->tvNoCashBack:Lcom/ibotta/android/views/base/text/LinkTextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->bReceiptUpload:Landroid/widget/Button;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->tvNoCashBack:Lcom/ibotta/android/views/base/text/LinkTextView;

    return-void

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
