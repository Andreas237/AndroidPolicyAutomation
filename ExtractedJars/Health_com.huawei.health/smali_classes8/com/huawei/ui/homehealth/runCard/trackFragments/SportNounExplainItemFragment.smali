.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/esd;>;"
        }
    .end annotation
.end field

.field private c:Lo/esf;

.field private d:I

.field private e:Landroid/widget/ListView;

.field private g:Landroid/view/View;

.field private k:Lo/esb;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->d:I

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    .line 40
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->d:I

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    .line 44
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->d:I

    .line 45
    return-void
.end method

.method private d()V
    .locals 4

    .line 66
    const-string v0, "SportNounExplainItemFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    .line 71
    :cond_0
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->d:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 73
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->k:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    .line 74
    goto :goto_0

    .line 76
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->k:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    .line 77
    goto :goto_0

    .line 79
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->k:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->e()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    .line 80
    goto :goto_0

    .line 82
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->k:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    .line 83
    goto :goto_0

    .line 85
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->k:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    .line 86
    .line 91
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private d(Landroid/view/View;)V
    .locals 4

    .line 96
    const-string v0, "SportNounExplainItemFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    sget v0, Lcom/huawei/ui/homehealth/R$id;->list_sport_noun_explain_listview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->e:Landroid/widget/ListView;

    .line 98
    new-instance v0, Lo/esf;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->b:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lo/esf;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->c:Lo/esf;

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->c:Lo/esf;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 102
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

    .line 53
    const-string v0, "SportNounExplainItemFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->fragment_sport_noun_explain_list_item:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->g:Landroid/view/View;

    .line 55
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->a:Landroid/content/Context;

    .line 56
    new-instance v0, Lo/esb;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/esb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->k:Lo/esb;

    .line 58
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->d()V

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->g:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->d(Landroid/view/View;)V

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;->g:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 4

    .line 107
    const-string v0, "SportNounExplainItemFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 109
    return-void
.end method
