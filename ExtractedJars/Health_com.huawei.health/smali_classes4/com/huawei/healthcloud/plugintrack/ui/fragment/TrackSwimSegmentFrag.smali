.class public Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8
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

    .line 29
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 31
    const-string v0, "Track_TrackSwimPaceFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_fragment_swim_segment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 34
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->list_segments:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ListView;

    .line 37
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    .line 38
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d()Lo/cgt;

    move-result-object v7

    .line 40
    if-eqz v7, :cond_1

    .line 41
    invoke-virtual {v7}, Lo/cgt;->t()Z

    move-result v0

    if-nez v0, :cond_1

    .line 42
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    new-instance v0, Lo/cgw;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v7}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishSwimSegments()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/cgw;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v5, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_0

    .line 45
    :cond_0
    new-instance v0, Lo/cgw;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v7}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSwimSegments()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/cgw;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v5, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 51
    :cond_1
    :goto_0
    return-object v4
.end method
