.class public Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "TestRadarGeofenceActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;"
    }
.end annotation


# instance fields
.field protected pbTriggerRadarProgress:Landroid/widget/ProgressBar;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904a1
    .end annotation
.end field

.field switchEnabledNotifications:Landroid/support/v7/widget/SwitchCompat;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090457
    .end annotation
.end field

.field switchUseRadarTestApi:Landroid/support/v7/widget/SwitchCompat;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090456
    .end annotation
.end field

.field protected tvTriggerRadarInfo:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904a0
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 20
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceComponent;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 41
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/DaggerTestRadarGeofenceComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/DaggerTestRadarGeofenceComponent$Builder;

    move-result-object v0

    .line 42
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/DaggerTestRadarGeofenceComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/DaggerTestRadarGeofenceComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;)V

    .line 43
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/DaggerTestRadarGeofenceComponent$Builder;->testRadarGeofenceModule(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceModule;)Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/DaggerTestRadarGeofenceComponent$Builder;

    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/DaggerTestRadarGeofenceComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceComponent;

    move-result-object p1

    return-object p1
.end method

.method protected getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceComponent;)V
    .locals 0

    .line 29
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 34
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0073

    .line 35
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->setContentView(I)V

    .line 36
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    return-void
.end method

.method protected onRadarEnableNotificationsTapped(Z)V
    .locals 1
    .annotation runtime Lbutterknife/OnCheckedChanged;
        value = {
            0x7f090457
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;->onRadarEnableTestNotificationsTapped(Z)V

    return-void
.end method

.method protected onRadarGeofenceButtonTapped()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09049f
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;->onRadarTrackOnceTapped()V

    return-void
.end method

.method protected onRadarUseTestApiTapped(Z)V
    .locals 1
    .annotation runtime Lbutterknife/OnCheckedChanged;
        value = {
            0x7f090456
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;->onRadarUseTestApiTapped(Z)V

    return-void
.end method

.method public showEnableTestNotifications(Z)V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->switchEnabledNotifications:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    return-void
.end method

.method public showLoading(Z)V
    .locals 4

    xor-int/lit8 v0, p1, 0x1

    .line 75
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->tvTriggerRadarInfo:Landroid/widget/TextView;

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->pbTriggerRadarProgress:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x4

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public showTrackOnceInfo(Ljava/lang/String;)V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->tvTriggerRadarInfo:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showUseTestApi(Z)V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;->switchUseRadarTestApi:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    return-void
.end method
