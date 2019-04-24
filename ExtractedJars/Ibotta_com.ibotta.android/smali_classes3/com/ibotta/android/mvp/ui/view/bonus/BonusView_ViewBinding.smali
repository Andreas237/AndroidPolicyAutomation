.class public Lcom/ibotta/android/mvp/ui/view/bonus/BonusView_ViewBinding;
.super Ljava/lang/Object;
.source "BonusView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 19
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    const-string v0, "field \'bpvBonusProgress\'"

    .line 26
    const-class v1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    const v2, 0x7f0900c0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    const-string v0, "field \'tvAmount\'"

    .line 27
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904ee

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvAmount:Landroid/widget/TextView;

    const-string v0, "field \'tvName\'"

    .line 28
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvName:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvAmount:Landroid/widget/TextView;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvName:Landroid/widget/TextView;

    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
