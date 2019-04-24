.class public Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_ViewBinding;
.super Ljava/lang/Object;
.source "MCommEscortActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    const-string v0, "field \'ivLogo\'"

    .line 28
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b4

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLogo:Landroid/widget/ImageView;

    const-string v0, "field \'tbvTitleBar\'"

    .line 29
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f09044e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'tvMessage\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090548

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->tvMessage:Landroid/widget/TextView;

    const-string v0, "field \'ivLoad1\'"

    .line 31
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad1:Landroid/widget/ImageView;

    const-string v0, "field \'ivLoad2\'"

    .line 32
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b1

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad2:Landroid/widget/ImageView;

    const-string v0, "field \'ivLoad3\'"

    .line 33
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad3:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 41
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLogo:Landroid/widget/ImageView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->tvMessage:Landroid/widget/TextView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad1:Landroid/widget/ImageView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad2:Landroid/widget/ImageView;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad3:Landroid/widget/ImageView;

    return-void

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
