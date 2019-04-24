.class public Lcom/huawei/ui/homehealth/EmptyFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 30
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/EmptyFragment;->e:I

    return-void
.end method

.method private d(Landroid/view/View;I)V
    .locals 4

    .line 62
    iget v0, p0, Lcom/huawei/ui/homehealth/EmptyFragment;->e:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 63
    return-void

    .line 66
    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->statusbar_panel:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 68
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 69
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v3, v0, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 70
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/EmptyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result p2

    .line 73
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v3, v0, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 74
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    :goto_0
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 29
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 80
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super {v0, v1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 81
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityCreated, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/homehealth/EmptyFragment;->e:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 85
    return-void

    .line 88
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/EmptyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->swiperefreshlayout:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    .line 89
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->getRecyclerView()Landroid/support/v7/widget/RecyclerView;

    move-result-object v17

    .line 91
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 92
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 94
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/EmptyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v20

    .line 95
    new-instance v0, Lo/epe;

    move-object/from16 v1, v20

    move-object/from16 v2, v18

    invoke-direct {v0, v1, v2}, Lo/epe;-><init>(Landroid/content/Context;Ljava/util/List;)V

    move-object/from16 v21, v0

    .line 96
    move-object/from16 v0, v17

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    invoke-static {v0, v1, v2}, Lo/epa;->e(Landroid/support/v7/widget/RecyclerView;Landroid/content/Context;Lo/epe;)V

    .line 98
    new-instance v0, Lo/epg;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lo/epg;-><init>(Landroid/content/Context;)V

    move-object/from16 v22, v0

    .line 99
    new-instance v0, Lo/esz;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lo/esz;-><init>(Landroid/content/Context;)V

    move-object/from16 v23, v0

    .line 100
    new-instance v0, Lo/esu;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lo/esu;-><init>(Landroid/content/Context;)V

    move-object/from16 v24, v0

    .line 101
    new-instance v0, Lo/ept;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lo/ept;-><init>(Landroid/content/Context;)V

    move-object/from16 v25, v0

    .line 102
    new-instance v0, Lo/etj;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lo/etj;-><init>(Landroid/content/Context;)V

    move-object/from16 v26, v0

    .line 103
    new-instance v0, Lo/etj;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lo/etj;-><init>(Landroid/content/Context;)V

    move-object/from16 v27, v0

    .line 104
    new-instance v0, Lo/esn;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lo/esn;-><init>(Landroid/content/Context;)V

    move-object/from16 v28, v0

    .line 106
    move-object/from16 v0, v20

    move-object/from16 v1, v24

    move-object/from16 v2, v22

    move-object/from16 v3, v25

    move-object/from16 v6, v23

    move-object/from16 v7, v26

    move-object/from16 v8, v27

    move-object/from16 v11, v19

    move-object/from16 v12, v18

    move-object/from16 v13, v17

    move-object/from16 v14, v21

    move-object/from16 v15, v28

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v15}, Lo/epa;->a(Landroid/content/Context;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v7/widget/RecyclerView;Lo/epe;Lo/eqv;)V

    .line 123
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 4

    .line 34
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 35
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAttach, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 41
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 46
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->swipe_recycleview_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 49
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/EmptyFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v5

    .line 50
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 51
    const-string v0, "position"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/EmptyFragment;->e:I

    .line 52
    const-string v0, "statusBarHeight"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 53
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statusBarHeight="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", position="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/EmptyFragment;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    invoke-direct {p0, v4, v6}, Lcom/huawei/ui/homehealth/EmptyFragment;->d(Landroid/view/View;I)V

    .line 57
    :cond_0
    return-object v4
.end method

.method public onDestroy()V
    .locals 4

    .line 157
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 158
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    return-void
.end method

.method public onDestroyView()V
    .locals 4

    .line 151
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 152
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroyView, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    return-void
.end method

.method public onDetach()V
    .locals 4

    .line 163
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 164
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDetach, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 139
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 140
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 133
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 134
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 127
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 128
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 145
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 146
    const-string v0, "UIHLH_EmptyFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStop, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    return-void
.end method
