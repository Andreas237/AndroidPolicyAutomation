.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;
.super Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;
.source "SourceFile"


# instance fields
.field a:[Landroid/support/v4/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;-><init>()V

    .line 23
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/support/v4/app/Fragment;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;->a:[Landroid/support/v4/app/Fragment;

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 27
    invoke-super {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 28
    const-string v0, "Track_TrackBikeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 34
    const-string v0, "TimeEat_TrackBikeFragmentEnter onCreateView TrackBikeFragment"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 36
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v3

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;->a:[Landroid/support/v4/app/Fragment;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-direct {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 38
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 40
    const-string v0, "KEY_FRAGMENT_BASE_TYPE"

    const/4 v1, 0x3

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 41
    const-string v0, "KEY_OUTDOOR"

    const/16 v1, 0x103

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;->a:[Landroid/support/v4/app/Fragment;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, v4}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;->a:[Landroid/support/v4/app/Fragment;

    invoke-super {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->b([Landroid/support/v4/app/Fragment;)V

    .line 45
    const-string v0, "TimeEat_TrackBikeFragmentLeave onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 46
    return-object v3
.end method

.method public onDestroy()V
    .locals 4

    .line 52
    invoke-super {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->onDestroy()V

    .line 53
    const-string v0, "Track_TrackBikeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;->a:[Landroid/support/v4/app/Fragment;

    .line 56
    return-void
.end method
