.class public Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding;
.super Ljava/lang/Object;
.source "AddRebatesView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;

.field private view7f09007c:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;

    const-string v0, "field \'ivImage\'"

    .line 32
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902ad

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->ivImage:Landroid/widget/ImageView;

    const-string v0, "field \'tvFoundRebates\'"

    .line 33
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090528

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->tvFoundRebates:Landroid/widget/TextView;

    const-string v0, "field \'bAddRebates\' and method \'onAddRebatesClicked\'"

    const v1, 0x7f09007c

    .line 34
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bAddRebates\'"

    .line 35
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->bAddRebates:Landroid/widget/Button;

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding;->view7f09007c:Landroid/view/View;

    .line 37
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 50
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;

    .line 52
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->ivImage:Landroid/widget/ImageView;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->tvFoundRebates:Landroid/widget/TextView;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->bAddRebates:Landroid/widget/Button;

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding;->view7f09007c:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 57
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView_ViewBinding;->view7f09007c:Landroid/view/View;

    return-void

    .line 49
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
