.class public Lcom/rt/mobile/english/ui/DrawerFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "DrawerFragment$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/DrawerFragment;Ljava/lang/Object;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "field \'showsItemView\'"

    const v4, 0x7f090167

    .line 10
    invoke-virtual {v0, v2, v4, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 11
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->showsItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'es_videos_ItemView\'"

    const v5, 0x7f09007f

    .line 12
    invoke-virtual {v0, v2, v5, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 13
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->es_videos_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'videos_rt_play_ItemView\'"

    const v6, 0x7f0901af

    .line 14
    invoke-virtual {v0, v2, v6, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 15
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_play_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'videos_rt_online_ItemView\'"

    const v7, 0x7f0901ae

    .line 16
    invoke-virtual {v0, v2, v7, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 17
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_online_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'mediaItemView\'"

    const v8, 0x7f0900da

    .line 18
    invoke-virtual {v0, v2, v8, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 19
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->mediaItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'galleriesItemView\'"

    const v9, 0x7f0900a9

    .line 20
    invoke-virtual {v0, v2, v9, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 21
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->galleriesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'videosItemView\'"

    const v10, 0x7f0901ad

    .line 22
    invoke-virtual {v0, v2, v10, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 23
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->videosItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'liveItemView\'"

    const v11, 0x7f0900cb

    .line 24
    invoke-virtual {v0, v2, v11, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 25
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->liveItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'opedgeView\'"

    const v12, 0x7f090110

    .line 26
    invoke-virtual {v0, v2, v12, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 27
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->opedgeView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'viralView\'"

    const v13, 0x7f0901b2

    .line 28
    invoke-virtual {v0, v2, v13, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 29
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->viralView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'noticiasView\'"

    const v14, 0x7f09010b

    .line 30
    invoke-virtual {v0, v2, v14, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 31
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->noticiasView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'articlesItemView\'"

    const v15, 0x7f090028

    .line 32
    invoke-virtual {v0, v2, v15, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 33
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->articlesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'otherArticlesItemView\'"

    const v14, 0x7f090112

    .line 34
    invoke-virtual {v0, v2, v14, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 35
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->otherArticlesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const-string v3, "field \'fifaItemView\'"

    const v13, 0x7f09009d

    .line 36
    invoke-virtual {v0, v2, v13, v3}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v3

    .line 37
    check-cast v3, Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->fifaItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const/16 v3, 0x11

    .line 38
    new-array v3, v3, [Landroid/view/View;

    const-string v13, "items"

    .line 39
    invoke-virtual {v0, v2, v15, v13}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v13

    const/16 v16, 0x0

    aput-object v13, v3, v16

    const-string v13, "items"

    .line 40
    invoke-virtual {v0, v2, v14, v13}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v13

    const/16 v17, 0x1

    aput-object v13, v3, v17

    const-string v13, "items"

    .line 41
    invoke-virtual {v0, v2, v12, v13}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v13

    const/16 v17, 0x2

    aput-object v13, v3, v17

    const-string v13, "items"

    .line 42
    invoke-virtual {v0, v2, v4, v13}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v13

    const/16 v17, 0x3

    aput-object v13, v3, v17

    const-string v13, "items"

    .line 43
    invoke-virtual {v0, v2, v8, v13}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v13

    const/16 v17, 0x4

    aput-object v13, v3, v17

    const-string v13, "items"

    .line 44
    invoke-virtual {v0, v2, v9, v13}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v13

    const/16 v17, 0x5

    aput-object v13, v3, v17

    const-string v13, "items"

    .line 45
    invoke-virtual {v0, v2, v10, v13}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v13

    const/16 v17, 0x6

    aput-object v13, v3, v17

    const-string v13, "items"

    .line 46
    invoke-virtual {v0, v2, v11, v13}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v13

    const/16 v17, 0x7

    aput-object v13, v3, v17

    const-string v13, "items"

    const v11, 0x7f090031

    .line 47
    invoke-virtual {v0, v2, v11, v13}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/16 v13, 0x8

    aput-object v11, v3, v13

    const-string v11, "items"

    const v13, 0x7f090074

    .line 48
    invoke-virtual {v0, v2, v13, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/16 v13, 0x9

    aput-object v11, v3, v13

    const-string v11, "items"

    const v13, 0x7f090154

    .line 49
    invoke-virtual {v0, v2, v13, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/16 v13, 0xa

    aput-object v11, v3, v13

    const-string v11, "items"

    .line 50
    invoke-virtual {v0, v2, v5, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/16 v13, 0xb

    aput-object v11, v3, v13

    const-string v11, "items"

    .line 51
    invoke-virtual {v0, v2, v7, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/16 v13, 0xc

    aput-object v11, v3, v13

    const-string v11, "items"

    .line 52
    invoke-virtual {v0, v2, v6, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/16 v13, 0xd

    aput-object v11, v3, v13

    const-string v11, "items"

    const v13, 0x7f0901b2

    .line 53
    invoke-virtual {v0, v2, v13, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/16 v13, 0xe

    aput-object v11, v3, v13

    const-string v11, "items"

    const v13, 0x7f09010b

    .line 54
    invoke-virtual {v0, v2, v13, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/16 v13, 0xf

    aput-object v11, v3, v13

    const-string v11, "items"

    const v13, 0x7f09009d

    .line 55
    invoke-virtual {v0, v2, v13, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/16 v13, 0x10

    aput-object v11, v3, v13

    .line 38
    invoke-static {v3}, Lbutterknife/ButterKnife$Finder;->listOf([Landroid/view/View;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->items:Ljava/util/List;

    const/16 v3, 0xf

    .line 56
    new-array v3, v3, [Landroid/view/View;

    const-string v11, "selectableItems"

    .line 57
    invoke-virtual {v0, v2, v15, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    aput-object v11, v3, v16

    const-string v11, "selectableItems"

    .line 58
    invoke-virtual {v0, v2, v14, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/4 v13, 0x1

    aput-object v11, v3, v13

    const-string v11, "selectableItems"

    .line 59
    invoke-virtual {v0, v2, v12, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v11

    const/4 v12, 0x2

    aput-object v11, v3, v12

    const-string v11, "selectableItems"

    .line 60
    invoke-virtual {v0, v2, v4, v11}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/4 v11, 0x3

    aput-object v4, v3, v11

    const-string v4, "selectableItems"

    .line 61
    invoke-virtual {v0, v2, v8, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/4 v8, 0x4

    aput-object v4, v3, v8

    const-string v4, "selectableItems"

    .line 62
    invoke-virtual {v0, v2, v9, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/4 v8, 0x5

    aput-object v4, v3, v8

    const-string v4, "selectableItems"

    .line 63
    invoke-virtual {v0, v2, v10, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/4 v8, 0x6

    aput-object v4, v3, v8

    const-string v4, "selectableItems"

    const v8, 0x7f0900cb

    .line 64
    invoke-virtual {v0, v2, v8, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/4 v8, 0x7

    aput-object v4, v3, v8

    const-string v4, "selectableItems"

    const v8, 0x7f090031

    .line 65
    invoke-virtual {v0, v2, v8, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/16 v8, 0x8

    aput-object v4, v3, v8

    const-string v4, "selectableItems"

    .line 66
    invoke-virtual {v0, v2, v5, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/16 v5, 0x9

    aput-object v4, v3, v5

    const-string v4, "selectableItems"

    .line 67
    invoke-virtual {v0, v2, v7, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/16 v5, 0xa

    aput-object v4, v3, v5

    const-string v4, "selectableItems"

    .line 68
    invoke-virtual {v0, v2, v6, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/16 v5, 0xb

    aput-object v4, v3, v5

    const-string v4, "selectableItems"

    const v5, 0x7f0901b2

    .line 69
    invoke-virtual {v0, v2, v5, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/16 v5, 0xc

    aput-object v4, v3, v5

    const-string v4, "selectableItems"

    const v5, 0x7f09010b

    .line 70
    invoke-virtual {v0, v2, v5, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v4

    const/16 v5, 0xd

    aput-object v4, v3, v5

    const-string v4, "selectableItems"

    const v5, 0x7f09009d

    .line 71
    invoke-virtual {v0, v2, v5, v4}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const/16 v2, 0xe

    aput-object v0, v3, v2

    .line 56
    invoke-static {v3}, Lbutterknife/ButterKnife$Finder;->listOf([Landroid/view/View;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->selectableItems:Ljava/util/List;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/DrawerFragment;)V
    .locals 1

    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->showsItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 76
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->es_videos_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 77
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_play_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 78
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_online_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 79
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->mediaItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 80
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->galleriesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 81
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videosItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 82
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->liveItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 83
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->opedgeView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 84
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->viralView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 85
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->noticiasView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 86
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->articlesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 87
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->otherArticlesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 88
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->fifaItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    .line 89
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->items:Ljava/util/List;

    .line 90
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->selectableItems:Ljava/util/List;

    return-void
.end method
