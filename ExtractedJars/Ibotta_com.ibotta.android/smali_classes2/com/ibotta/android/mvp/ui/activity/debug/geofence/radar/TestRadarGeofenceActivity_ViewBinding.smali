.class public Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;
.super Ljava/lang/Object;
.source "TestRadarGeofenceActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;

.field private view7f090456:Landroid/view/View;

.field private view7f090457:Landroid/view/View;

.field private view7f09049f:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;

    const-string v0, "field \'tvTriggerRadarInfo\'"

    .line 38
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904a0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->tvTriggerRadarInfo:Landroid/widget/TextView;

    const-string v0, "field \'pbTriggerRadarProgress\'"

    .line 39
    const-class v1, Landroid/widget/ProgressBar;

    const v2, 0x7f0904a1

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->pbTriggerRadarProgress:Landroid/widget/ProgressBar;

    const-string v0, "field \'switchUseRadarTestApi\' and method \'onRadarUseTestApiTapped\'"

    const v1, 0x7f090456

    .line 40
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'switchUseRadarTestApi\'"

    .line 41
    const-class v3, Landroid/support/v7/widget/SwitchCompat;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/SwitchCompat;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->switchUseRadarTestApi:Landroid/support/v7/widget/SwitchCompat;

    .line 42
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->view7f090456:Landroid/view/View;

    .line 43
    check-cast v0, Landroid/widget/CompoundButton;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const-string v0, "field \'switchEnabledNotifications\' and method \'onRadarEnableNotificationsTapped\'"

    const v1, 0x7f090457

    .line 49
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'switchEnabledNotifications\'"

    .line 50
    const-class v3, Landroid/support/v7/widget/SwitchCompat;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/SwitchCompat;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->switchEnabledNotifications:Landroid/support/v7/widget/SwitchCompat;

    .line 51
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->view7f090457:Landroid/view/View;

    .line 52
    check-cast v0, Landroid/widget/CompoundButton;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const-string v0, "method \'onRadarGeofenceButtonTapped\'"

    const v1, 0x7f09049f

    .line 58
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 59
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->view7f09049f:Landroid/view/View;

    .line 60
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding$3;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;)V

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

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 73
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;

    .line 75
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->tvTriggerRadarInfo:Landroid/widget/TextView;

    .line 76
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->pbTriggerRadarProgress:Landroid/widget/ProgressBar;

    .line 77
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->switchUseRadarTestApi:Landroid/support/v7/widget/SwitchCompat;

    .line 78
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->switchEnabledNotifications:Landroid/support/v7/widget/SwitchCompat;

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->view7f090456:Landroid/view/View;

    check-cast v0, Landroid/widget/CompoundButton;

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 81
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->view7f090456:Landroid/view/View;

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->view7f090457:Landroid/view/View;

    check-cast v0, Landroid/widget/CompoundButton;

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 83
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->view7f090457:Landroid/view/View;

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->view7f09049f:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 85
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity_ViewBinding;->view7f09049f:Landroid/view/View;

    return-void

    .line 72
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
