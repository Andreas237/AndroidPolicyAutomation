.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;
.super Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;
.source "SourceFile"


# instance fields
.field private a:F

.field private d:F

.field e:[Landroid/support/v4/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)F
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->d:F

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;F)F
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->d:F

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;F)F
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->a:F

    return p1
.end method

.method private c()V
    .locals 5

    .line 138
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 140
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->d:F

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->a:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v3, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x0

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 141
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->e()V

    .line 143
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-direct {v4, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 144
    const/16 v0, 0x3e9

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 145
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$anim;->track_run_more_info_open:I

    sget v2, Lcom/huawei/ui/homehealth/R$anim;->track_run_more_info_open_stay:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->overridePendingTransition(II)V

    .line 148
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->e()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->c:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$1;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 135
    return-void
.end method

.method private e()V
    .locals 5

    .line 151
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 152
    const-string v0, "sportType"

    const/16 v1, 0x102

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    sget-object v0, Lo/dae;->ie:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 154
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 155
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->c()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 45
    invoke-super {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 46
    const-string v0, "Track_TrackRunFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6
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

    .line 52
    const-string v0, "TimeEat_TrackRunFragmentEnter onCreateView TrackRunFragment"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 54
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v4

    .line 56
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 58
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->d()V

    .line 63
    :cond_0
    const-string v0, "Track_TrackRunFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceOriginalClass() is  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v2

    invoke-virtual {v2}, Lo/fgb;->c()Lo/cmj;

    move-result-object v2

    invoke-virtual {v2}, Lo/cmj;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/support/v4/app/Fragment;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->e:[Landroid/support/v4/app/Fragment;

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->e:[Landroid/support/v4/app/Fragment;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-direct {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 66
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 67
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 69
    const-string v0, "KEY_FRAGMENT_BASE_TYPE"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 70
    const-string v0, "KEY_OUTDOOR"

    const/16 v1, 0x102

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 72
    :cond_1
    const-string v0, "KEY_FRAGMENT_BASE_TYPE"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 73
    const-string v0, "KEY_OUTDOOR"

    const/16 v1, 0x102

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 74
    const-string v0, "KEY_INDOOR"

    const/16 v1, 0x108

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 77
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->e:[Landroid/support/v4/app/Fragment;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, v5}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->e:[Landroid/support/v4/app/Fragment;

    invoke-super {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->b([Landroid/support/v4/app/Fragment;)V

    .line 81
    const-string v0, "TimeEat_TrackRunFragmentLeave onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 82
    return-object v4
.end method

.method public onDestroy()V
    .locals 4

    .line 160
    invoke-super {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWorkoutBaseFragment;->onDestroy()V

    .line 161
    const-string v0, "Track_TrackRunFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->e:[Landroid/support/v4/app/Fragment;

    .line 164
    return-void
.end method
