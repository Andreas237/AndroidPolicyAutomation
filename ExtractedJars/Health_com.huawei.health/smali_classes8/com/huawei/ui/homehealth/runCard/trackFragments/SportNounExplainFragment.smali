.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ExpandableListView;

.field private b:Lo/erx;

.field private c:[Ljava/lang/String;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/esj;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;

.field private f:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->d:Ljava/util/List;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->c:[Ljava/lang/String;

    .line 37
    return-void
.end method

.method private a(I)V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-ltz p1, :cond_0

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->a:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/esj;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/esj;->d(Z)V

    .line 126
    :cond_0
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 4

    .line 82
    const-string v0, "SportNounExplainFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    sget v0, Lcom/huawei/ui/homehealth/R$id;->list_sport_noun_explain_simplify:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ExpandableListView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->a:Landroid/widget/ExpandableListView;

    .line 84
    new-instance v0, Lo/erx;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/erx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->b:Lo/erx;

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->a:Landroid/widget/ExpandableListView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->b:Lo/erx;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->b:Lo/erx;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/erx;->e(Ljava/util/List;)V

    .line 89
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->b()V

    .line 90
    return-void
.end method

.method private b()V
    .locals 4

    .line 102
    const-string v0, "SportNounExplainFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTouchListenner"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->a:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment$2;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 119
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;)Ljava/util/List;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->d:Ljava/util/List;

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 56
    const-string v0, "SportNounExplainFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->c:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->c:[Ljava/lang/String;

    .line 60
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 62
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_main_watch_heart_rate_string:I

    .line 63
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_pluginmotiontrack_detail_title_step:I

    .line 64
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_pluginmotiontrack_detail_running_posture:I

    .line 65
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_Fitness_terms_title_train:I

    .line 66
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_Fitness_terms_title_swim:I

    .line 67
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->c:[Ljava/lang/String;

    .line 72
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->c:[Ljava/lang/String;

    array-length v0, v0

    if-ge v5, v0, :cond_1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->d:Ljava/util/List;

    new-instance v1, Lo/esj;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->c:[Ljava/lang/String;

    aget-object v2, v2, v5

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->e:Landroid/content/Context;

    invoke-direct {v1, v2, v5, v3}, Lo/esj;-><init>(Ljava/lang/String;ILandroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 77
    :cond_1
    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
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

    .line 43
    const-string v0, "SportNounExplainFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->fragment_sport_noun_explain_list:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->f:Landroid/view/View;

    .line 45
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->e:Landroid/content/Context;

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->d()V

    .line 48
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->f:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->a(Landroid/view/View;)V

    .line 49
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->a(I)V

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->f:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 4

    .line 95
    const-string v0, "SportNounExplainFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 97
    return-void
.end method
