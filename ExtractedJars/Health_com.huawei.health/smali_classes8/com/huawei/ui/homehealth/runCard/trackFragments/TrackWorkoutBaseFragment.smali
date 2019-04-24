.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lo/esi;


# instance fields
.field protected b:Landroid/support/v4/view/ViewPager;

.field protected c:Landroid/widget/RelativeLayout;

.field private d:Lo/esc;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public b([Landroid/support/v4/app/Fragment;)V
    .locals 2

    .line 75
    new-instance v0, Lo/esc;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lo/esc;-><init>(Landroid/support/v4/app/FragmentManager;[Landroid/support/v4/app/Fragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->d:Lo/esc;

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->b:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->d:Lo/esc;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 78
    return-void
.end method

.method public d(II)V
    .locals 0

    .line 109
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 45
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 46
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
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

    .line 51
    const-string v0, "TimeEat_TrackWorkoutBaseFragmentEnter onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 52
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->layout_fragment_base_sport_setting:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 54
    sget v0, Lcom/huawei/ui/homehealth/R$id;->viewpager_sub_sport_type:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->b:Landroid/support/v4/view/ViewPager;

    .line 55
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_show_more:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->c:Landroid/widget/RelativeLayout;

    .line 65
    invoke-static {}, Lo/esg;->b()Lo/esg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/esg;->b(Lo/esi;)Z

    .line 66
    const-string v0, "TimeEat_TrackWorkoutBaseFragmentLeave onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 68
    return-object v2
.end method

.method public onDestroy()V
    .locals 1

    .line 132
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 133
    invoke-static {}, Lo/esg;->b()Lo/esg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/esg;->d(Lo/esi;)Z

    .line 135
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->c:Landroid/widget/RelativeLayout;

    .line 136
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->d:Lo/esc;

    .line 137
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->b:Landroid/support/v4/view/ViewPager;

    .line 138
    return-void
.end method
