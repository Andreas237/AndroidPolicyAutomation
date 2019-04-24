.class public Lo/cfq;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private b:Landroid/app/Activity;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation
.end field

.field private e:Lo/cft;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Ljava/util/List<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cfq;->c:Ljava/util/List;

    .line 40
    iput-object p1, p0, Lo/cfq;->b:Landroid/app/Activity;

    .line 41
    iput-object p2, p0, Lo/cfq;->c:Ljava/util/List;

    .line 42
    return-void
.end method

.method private d(I)Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/cfq;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 46
    iput-object p1, p0, Lo/cfq;->c:Ljava/util/List;

    .line 47
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 52
    iget-object v0, p0, Lo/cfq;->c:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/cfq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/cfq;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 64
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 14

    .line 71
    if-nez p2, :cond_0

    .line 73
    iget-object v0, p0, Lo/cfq;->b:Landroid/app/Activity;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_child_some:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/RelativeLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 74
    new-instance v6, Lo/cga;

    move-object/from16 v0, p2

    invoke-direct {v6, v0}, Lo/cga;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cga;

    .line 81
    :goto_0
    iget-object v0, p0, Lo/cfq;->c:Ljava/util/List;

    invoke-virtual {v6, v0, p1}, Lo/cga;->e(Ljava/util/List;I)V

    .line 83
    iget-object v0, p0, Lo/cfq;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 84
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v8

    .line 85
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getcompleteCode()I

    move-result v9

    .line 86
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v10

    .line 88
    new-instance v11, Ljava/text/DecimalFormat;

    const-string v0, "0.0"

    invoke-direct {v11, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 89
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getSize()J

    move-result-wide v0

    long-to-float v0, v0

    const/high16 v1, 0x49800000    # 1048576.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-virtual {v11, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v12

    .line 90
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_city_size:I

    invoke-direct {p0, v0}, Lo/cfq;->d(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 91
    invoke-virtual {v6}, Lo/cga;->b()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    invoke-virtual {v6}, Lo/cga;->d()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    const-string v0, "OfflineMapSomeCitysAdapter"

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

    aput-object v13, v1, v2

    const-string v2, ",state:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",progress:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lo/cfq;->b:Landroid/app/Activity;

    invoke-virtual {v6, v0, v8, v9}, Lo/cga;->c(Landroid/content/Context;II)V

    .line 95
    iget-object v0, p0, Lo/cfq;->b:Landroid/app/Activity;

    instance-of v0, v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    if-eqz v0, :cond_1

    .line 97
    new-instance v0, Lo/cft;

    iget-object v1, p0, Lo/cfq;->b:Landroid/app/Activity;

    check-cast v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    move v2, v8

    move-object v3, v10

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lo/cft;-><init>(Landroid/content/Context;ILjava/lang/String;J)V

    iput-object v0, p0, Lo/cfq;->e:Lo/cft;

    .line 98
    invoke-virtual {v6}, Lo/cga;->e()Lo/egd;

    move-result-object v0

    iget-object v1, p0, Lo/cfq;->e:Lo/cft;

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    :cond_1
    return-object p2
.end method
