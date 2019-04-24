.class public Lcom/huawei/pluginachievement/ui/MyMedalFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lo/dyq;


# instance fields
.field private a:Landroid/support/v7/widget/RecyclerView;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Landroid/app/Activity;

.field private f:Landroid/widget/LinearLayout;

.field private g:Lo/dya;

.field private h:Landroid/support/v7/widget/LinearLayoutManager;

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lo/dvz;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->c:I

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/String;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->e:Landroid/app/Activity;

    check-cast v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-virtual {v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e(Ljava/lang/String;)V

    .line 120
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 47
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->e:Landroid/app/Activity;

    .line 48
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "position"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->c:I

    .line 49
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "kind"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->d:Ljava/lang/String;

    .line 50
    const-string v0, "PLGACHIEVE_MyMedalFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCreate() kind="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "leibie="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "secondtab"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 53
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->e:Landroid/app/Activity;

    check-cast v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e()Ljava/util/Map;

    move-result-object v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->d:Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->b:Ljava/util/ArrayList;

    .line 57
    :cond_0
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "secondtab"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->b:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    :goto_0
    goto :goto_1

    .line 60
    :catch_0
    move-exception v3

    .line 61
    const-string v0, "PLGACHIEVE_MyMedalFragment"

    const-string v1, "onCreate ArrayIndexOutOfBoundsException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->e:Landroid/app/Activity;

    check-cast v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->k:Ljava/util/Map;

    .line 64
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7
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

    .line 69
    sget v0, Lcom/huawei/pluginachievement/R$layout;->medal_content_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 70
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_rv:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->a:Landroid/support/v7/widget/RecyclerView;

    .line 71
    sget v0, Lcom/huawei/pluginachievement/R$id;->no_medal_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->f:Landroid/widget/LinearLayout;

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 73
    const/4 v4, 0x0

    .line 74
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 76
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->k:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->k:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->k:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 77
    const/4 v4, 0x1

    .line 74
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 80
    :cond_1
    if-eqz v4, :cond_3

    .line 81
    const-string v0, "PLGACHIEVE_MyMedalFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCreateView() secondtab tostring = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " flags ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 83
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 84
    const/4 v6, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 85
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 87
    :cond_2
    new-instance v0, Lo/dya;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->k:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v5}, Lo/dya;-><init>(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->g:Lo/dya;

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->g:Lo/dya;

    invoke-virtual {v0, p0}, Lo/dya;->c(Lo/dyq;)V

    .line 89
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->h:Landroid/support/v7/widget/LinearLayoutManager;

    .line 91
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->h:Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 92
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->h:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->g:Lo/dya;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->a:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/DefaultItemAnimator;

    invoke-direct {v1}, Landroid/support/v7/widget/DefaultItemAnimator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 100
    :goto_2
    goto :goto_3

    .line 101
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 103
    :goto_3
    return-object v3
.end method

.method public onDestroy()V
    .locals 0

    .line 108
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 109
    return-void
.end method
