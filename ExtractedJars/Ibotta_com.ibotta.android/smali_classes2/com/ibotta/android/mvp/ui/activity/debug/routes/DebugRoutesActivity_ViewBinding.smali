.class public Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;
.super Ljava/lang/Object;
.source "DebugRoutesActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;

.field private view7f090088:Landroid/view/View;

.field private view7f090097:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;

    const-string v0, "field \'trRetailers\'"

    .line 34
    const-class v1, Landroid/widget/TableRow;

    const v2, 0x7f090499

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TableRow;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trRetailers:Landroid/widget/TableRow;

    const-string v0, "field \'trOffers\'"

    .line 35
    const-class v1, Landroid/widget/TableRow;

    const v2, 0x7f090497

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TableRow;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trOffers:Landroid/widget/TableRow;

    const-string v0, "field \'trOfferCategories\'"

    .line 36
    const-class v1, Landroid/widget/TableRow;

    const v2, 0x7f090496

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TableRow;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trOfferCategories:Landroid/widget/TableRow;

    const-string v0, "field \'trRetailerCategories\'"

    .line 37
    const-class v1, Landroid/widget/TableRow;

    const v2, 0x7f090498

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TableRow;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trRetailerCategories:Landroid/widget/TableRow;

    const-string v0, "field \'trBonuses\'"

    .line 38
    const-class v1, Landroid/widget/TableRow;

    const v2, 0x7f090495

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TableRow;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trBonuses:Landroid/widget/TableRow;

    const-string v0, "field \'sRoutes\'"

    .line 39
    const-class v1, Landroid/widget/Spinner;

    const v2, 0x7f0903e9

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRoutes:Landroid/widget/Spinner;

    const-string v0, "field \'sRetailers\'"

    .line 40
    const-class v1, Landroid/widget/Spinner;

    const v2, 0x7f0903e8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailers:Landroid/widget/Spinner;

    const-string v0, "field \'sOffers\'"

    .line 41
    const-class v1, Landroid/widget/Spinner;

    const v2, 0x7f0903e6

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOffers:Landroid/widget/Spinner;

    const-string v0, "field \'sOfferCategories\'"

    .line 42
    const-class v1, Landroid/widget/Spinner;

    const v2, 0x7f0903e5

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOfferCategories:Landroid/widget/Spinner;

    const-string v0, "field \'sRetailerCategories\'"

    .line 43
    const-class v1, Landroid/widget/Spinner;

    const v2, 0x7f0903e7

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailerCategories:Landroid/widget/Spinner;

    const-string v0, "field \'sBonuses\'"

    .line 44
    const-class v1, Landroid/widget/Spinner;

    const v2, 0x7f0903e0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sBonuses:Landroid/widget/Spinner;

    const-string v0, "field \'etRoute\'"

    .line 45
    const-class v1, Landroid/widget/EditText;

    const v2, 0x7f0901d4

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->etRoute:Landroid/widget/EditText;

    const-string v0, "method \'onNotifyClicked\'"

    const v1, 0x7f090097

    .line 46
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 47
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;->view7f090097:Landroid/view/View;

    .line 48
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090088

    const-string v1, "method \'onGoClicked\'"

    .line 54
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 55
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;->view7f090088:Landroid/view/View;

    .line 56
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_1

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 69
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;

    .line 71
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trRetailers:Landroid/widget/TableRow;

    .line 72
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trOffers:Landroid/widget/TableRow;

    .line 73
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trOfferCategories:Landroid/widget/TableRow;

    .line 74
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trRetailerCategories:Landroid/widget/TableRow;

    .line 75
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trBonuses:Landroid/widget/TableRow;

    .line 76
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRoutes:Landroid/widget/Spinner;

    .line 77
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailers:Landroid/widget/Spinner;

    .line 78
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOffers:Landroid/widget/Spinner;

    .line 79
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOfferCategories:Landroid/widget/Spinner;

    .line 80
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailerCategories:Landroid/widget/Spinner;

    .line 81
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sBonuses:Landroid/widget/Spinner;

    .line 82
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->etRoute:Landroid/widget/EditText;

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;->view7f090097:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 85
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;->view7f090097:Landroid/view/View;

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;->view7f090088:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 87
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity_ViewBinding;->view7f090088:Landroid/view/View;

    return-void

    .line 68
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
