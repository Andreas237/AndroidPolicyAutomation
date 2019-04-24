.class public Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;
.super Ljava/lang/Object;
.source "ChangeQuantityActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;

.field private view7f090086:Landroid/view/View;

.field private view7f090232:Landroid/view/View;

.field private view7f090234:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 38
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'ivImage\'"

    .line 39
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902ad

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ivImage:Landroid/widget/ImageView;

    const-string v0, "field \'tvName\'"

    .line 40
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->tvName:Landroid/widget/TextView;

    const-string v0, "field \'tvRules\'"

    .line 41
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09056d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->tvRules:Landroid/widget/TextView;

    const-string v0, "field \'ibDecrement\' and method \'onDecrementClicked\'"

    const v1, 0x7f090232

    .line 42
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ibDecrement\'"

    .line 43
    const-class v3, Landroid/widget/ImageButton;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ibDecrement:Landroid/widget/ImageButton;

    .line 44
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->view7f090232:Landroid/view/View;

    .line 45
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090561

    const-string v1, "field \'tvQuantity\'"

    .line 51
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->tvQuantity:Landroid/widget/TextView;

    const-string v0, "field \'ibIncrement\' and method \'onIncrementClicked\'"

    const v1, 0x7f090234

    .line 52
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ibIncrement\'"

    .line 53
    const-class v3, Landroid/widget/ImageButton;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ibIncrement:Landroid/widget/ImageButton;

    .line 54
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->view7f090234:Landroid/view/View;

    .line 55
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const-string v0, "field \'bDone\' and method \'onDoneClicked\'"

    const v1, 0x7f090086

    .line 61
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bDone\'"

    .line 62
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->bDone:Landroid/widget/Button;

    .line 63
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->view7f090086:Landroid/view/View;

    .line 64
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    const v0, 0x7f0905b9

    const-string v1, "field \'vQuantityTopLine\'"

    .line 70
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->vQuantityTopLine:Landroid/view/View;

    const v0, 0x7f0905b8

    const-string v1, "field \'vQuantityBottomLine\'"

    .line 71
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->vQuantityBottomLine:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 79
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;

    .line 81
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 82
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ivImage:Landroid/widget/ImageView;

    .line 83
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->tvName:Landroid/widget/TextView;

    .line 84
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->tvRules:Landroid/widget/TextView;

    .line 85
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ibDecrement:Landroid/widget/ImageButton;

    .line 86
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->tvQuantity:Landroid/widget/TextView;

    .line 87
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ibIncrement:Landroid/widget/ImageButton;

    .line 88
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->bDone:Landroid/widget/Button;

    .line 89
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->vQuantityTopLine:Landroid/view/View;

    .line 90
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->vQuantityBottomLine:Landroid/view/View;

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->view7f090232:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 93
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->view7f090232:Landroid/view/View;

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->view7f090234:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 95
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->view7f090234:Landroid/view/View;

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->view7f090086:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 97
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;->view7f090086:Landroid/view/View;

    return-void

    .line 78
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
