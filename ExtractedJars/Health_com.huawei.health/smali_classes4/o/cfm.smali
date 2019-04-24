.class public Lo/cfm;
.super Landroid/widget/BaseExpandableListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cfm$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;"
        }
    .end annotation
.end field

.field private b:Lo/cft;

.field private c:Landroid/app/Activity;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cfm;->d:Ljava/util/ArrayList;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cfm;->a:Ljava/util/HashMap;

    .line 50
    iput-object p1, p0, Lo/cfm;->c:Landroid/app/Activity;

    .line 51
    iput-object p2, p0, Lo/cfm;->d:Ljava/util/ArrayList;

    .line 52
    iput-object p3, p0, Lo/cfm;->a:Ljava/util/HashMap;

    .line 53
    return-void
.end method

.method private e(I)Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lo/cfm;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Ljava/util/HashMap;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;)V"
        }
    .end annotation

    .line 219
    iput-object p1, p0, Lo/cfm;->a:Ljava/util/HashMap;

    .line 220
    iput-object p2, p0, Lo/cfm;->d:Ljava/util/ArrayList;

    .line 221
    invoke-virtual {p0}, Lo/cfm;->notifyDataSetChanged()V

    .line 222
    return-void
.end method

.method public getChild(II)Ljava/lang/Object;
    .locals 2

    .line 61
    iget-object v0, p0, Lo/cfm;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    invoke-virtual {v0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    invoke-virtual {v0}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .line 70
    int-to-long v0, p2

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 16

    .line 78
    const/4 v0, 0x0

    move-object/from16 v1, p4

    if-ne v0, v1, :cond_0

    .line 80
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfm;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_child:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/RelativeLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p4

    .line 81
    new-instance v6, Lo/cga;

    move-object/from16 v0, p4

    invoke-direct {v6, v0}, Lo/cga;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual/range {p4 .. p4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cga;

    .line 87
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfm;->a:Ljava/util/HashMap;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 88
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfm;->a:Ljava/util/HashMap;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    move/from16 v1, p2

    invoke-virtual {v6, v0, v1}, Lo/cga;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;I)V

    .line 89
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v8

    .line 90
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getcompleteCode()I

    move-result v9

    .line 91
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v10

    .line 93
    new-instance v11, Ljava/text/DecimalFormat;

    const-string v0, "0.0"

    invoke-direct {v11, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getSize()J

    move-result-wide v12

    .line 95
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getSize()J

    move-result-wide v0

    long-to-float v0, v0

    const/high16 v1, 0x49800000    # 1048576.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-virtual {v11, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v14

    .line 96
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_city_size:I

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/cfm;->e(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v14, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 97
    invoke-virtual {v6}, Lo/cga;->b()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    invoke-virtual {v6}, Lo/cga;->d()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    const-string v0, "OfflineMapAllCitysAdapter"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getView() city:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, "formatSize:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v15, v1, v2

    const-string v2, ",state:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 105
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",progress:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 107
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 99
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfm;->c:Landroid/app/Activity;

    invoke-virtual {v6, v0, v8, v9}, Lo/cga;->c(Landroid/content/Context;II)V

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfm;->c:Landroid/app/Activity;

    instance-of v0, v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    if-eqz v0, :cond_1

    .line 111
    new-instance v0, Lo/cft;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cfm;->c:Landroid/app/Activity;

    check-cast v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    move v2, v8

    move-object v3, v10

    move-wide v4, v12

    invoke-direct/range {v0 .. v5}, Lo/cft;-><init>(Landroid/content/Context;ILjava/lang/String;J)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cfm;->b:Lo/cft;

    .line 112
    invoke-virtual {v6}, Lo/cga;->e()Lo/egd;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cfm;->b:Lo/cft;

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    :cond_1
    return-object p4
.end method

.method public getChildrenCount(I)I
    .locals 2

    .line 128
    iget-object v0, p0, Lo/cfm;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/cfm;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getGroup(I)Ljava/lang/Object;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/cfm;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;

    invoke-virtual {v0}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->getProvinceName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 1

    .line 152
    iget-object v0, p0, Lo/cfm;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getGroupId(I)J
    .locals 2

    .line 161
    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupType(I)I
    .locals 1

    .line 140
    invoke-super {p0, p1}, Landroid/widget/BaseExpandableListAdapter;->getGroupType(I)I

    move-result v0

    return v0
.end method

.method public getGroupTypeCount()I
    .locals 1

    .line 146
    invoke-super {p0}, Landroid/widget/BaseExpandableListAdapter;->getGroupTypeCount()I

    move-result v0

    return v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 169
    if-nez p3, :cond_0

    .line 171
    new-instance v3, Lo/cfm$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/cfm$a;-><init>(Lo/cfm$4;)V

    .line 172
    iget-object v0, p0, Lo/cfm;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_group:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/RelativeLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object p3, v0

    check-cast p3, Landroid/widget/RelativeLayout;

    .line 173
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->group_text:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v3, v0}, Lo/cfm$a;->a(Lo/cfm$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 174
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->group_image:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v3, v0}, Lo/cfm$a;->d(Lo/cfm$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 175
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->offline_group_view:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v3, v0}, Lo/cfm$a;->c(Lo/cfm$a;Landroid/view/View;)Landroid/view/View;

    .line 176
    invoke-virtual {p3, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 180
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/cfm$a;

    .line 182
    :goto_0
    invoke-static {v3}, Lo/cfm$a;->c(Lo/cfm$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cfm;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;

    invoke-virtual {v1}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->getProvinceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    iget-object v0, p0, Lo/cfm;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 185
    invoke-static {v3}, Lo/cfm$a;->e(Lo/cfm$a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 187
    :cond_1
    invoke-static {v3}, Lo/cfm$a;->e(Lo/cfm$a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 189
    :goto_1
    if-eqz p2, :cond_2

    .line 191
    invoke-static {v3}, Lo/cfm$a;->b(Lo/cfm$a;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_list_dropdownarrow_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 195
    :cond_2
    invoke-static {v3}, Lo/cfm$a;->b(Lo/cfm$a;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_list_dropdownarrow_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 197
    :goto_2
    return-object p3
.end method

.method public hasStableIds()Z
    .locals 1

    .line 206
    const/4 v0, 0x1

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .line 215
    const/4 v0, 0x1

    return v0
.end method
