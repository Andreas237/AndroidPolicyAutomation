.class public Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;
.super Ljava/lang/Object;
.source "DebugSettingsActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

.field private view7f090051:Landroid/view/View;

.field private view7f090085:Landroid/view/View;

.field private view7f090440:Landroid/view/View;

.field private view7f090442:Landroid/view/View;

.field private view7f090443:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

    const-string v0, "field \'tbUseDebugApi\' and method \'onUseDebugApiChecked\'"

    const v1, 0x7f090443

    .line 41
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'tbUseDebugApi\'"

    .line 42
    const-class v3, Landroid/support/v7/widget/SwitchCompat;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/SwitchCompat;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbUseDebugApi:Landroid/support/v7/widget/SwitchCompat;

    .line 43
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090443:Landroid/view/View;

    .line 44
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'actvHostname\' and method \'onHostnameClicked\'"

    const v1, 0x7f090051

    .line 50
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'actvHostname\'"

    .line 51
    const-class v3, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->actvHostname:Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    .line 52
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090051:Landroid/view/View;

    .line 53
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f0904f7

    const-string v1, "field \'tvApiUrl\'"

    .line 59
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tvApiUrl:Landroid/widget/TextView;

    const-string v0, "field \'tbIgnoreUpdates\' and method \'onIgnoreUpdatesChecked\'"

    const v1, 0x7f090440

    .line 60
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'tbIgnoreUpdates\'"

    .line 61
    const-class v3, Landroid/support/v7/widget/SwitchCompat;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/SwitchCompat;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbIgnoreUpdates:Landroid/support/v7/widget/SwitchCompat;

    .line 62
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090440:Landroid/view/View;

    .line 63
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    const-string v0, "field \'tbTMonitor\' and method \'onTMonitorChecked\'"

    const v1, 0x7f090442

    .line 69
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'tbTMonitor\'"

    .line 70
    const-class v3, Landroid/support/v7/widget/SwitchCompat;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/SwitchCompat;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbTMonitor:Landroid/support/v7/widget/SwitchCompat;

    .line 71
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090442:Landroid/view/View;

    .line 72
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$4;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$4;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_3
    const v0, 0x7f0903e1

    const-string v1, "field \'sColumns\'"

    .line 78
    const-class v2, Landroid/widget/Spinner;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->sColumns:Landroid/widget/Spinner;

    const v0, 0x7f090085

    const-string v1, "method \'onDebugHttpClicked\'"

    .line 79
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 80
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090085:Landroid/view/View;

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$5;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding$5;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_4

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_4
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_4
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

    if-eqz v0, :cond_5

    const/4 v1, 0x0

    .line 94
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;

    .line 96
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbUseDebugApi:Landroid/support/v7/widget/SwitchCompat;

    .line 97
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->actvHostname:Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    .line 98
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tvApiUrl:Landroid/widget/TextView;

    .line 99
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbIgnoreUpdates:Landroid/support/v7/widget/SwitchCompat;

    .line 100
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbTMonitor:Landroid/support/v7/widget/SwitchCompat;

    .line 101
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->sColumns:Landroid/widget/Spinner;

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090443:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 104
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090443:Landroid/view/View;

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090051:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 106
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090051:Landroid/view/View;

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090440:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 108
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090440:Landroid/view/View;

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090442:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 110
    :goto_3
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090442:Landroid/view/View;

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090085:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_4

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_4
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 112
    :goto_4
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity_ViewBinding;->view7f090085:Landroid/view/View;

    return-void

    .line 93
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
