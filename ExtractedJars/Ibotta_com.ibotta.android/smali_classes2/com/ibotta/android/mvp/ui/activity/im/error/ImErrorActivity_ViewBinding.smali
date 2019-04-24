.class public Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity_ViewBinding;
.super Ljava/lang/Object;
.source "ImErrorActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;

    const-string v0, "field \'clImDetailHeader\'"

    .line 28
    const-class v1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    const v2, 0x7f0900f6

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    const-string v0, "field \'bImTryAgain\'"

    .line 29
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f09008e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->bImTryAgain:Landroid/widget/Button;

    const-string v0, "field \'bImGetHelp\'"

    .line 30
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f09008c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->bImGetHelp:Landroid/widget/Button;

    const-string v0, "field \'tvImErrorMoreInfo\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09052e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->tvImErrorMoreInfo:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 39
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->bImTryAgain:Landroid/widget/Button;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->bImGetHelp:Landroid/widget/Button;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->tvImErrorMoreInfo:Landroid/widget/TextView;

    return-void

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
