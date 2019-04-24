.class public Lo/cga;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lo/cfz;

.field private c:Lo/egd;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->city_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cga;->a:Landroid/widget/TextView;

    .line 33
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->city_size:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cga;->d:Landroid/widget/TextView;

    .line 34
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->offline_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cga;->e:Landroid/view/View;

    .line 35
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->city_status:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/cfz;

    iput-object v0, p0, Lo/cga;->b:Lo/cfz;

    .line 36
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    iput-object v0, p0, Lo/cga;->c:Lo/egd;

    .line 37
    invoke-virtual {p1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 38
    return-void
.end method


# virtual methods
.method public b()Landroid/widget/TextView;
    .locals 1

    .line 103
    iget-object v0, p0, Lo/cga;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method public b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;I)V
    .locals 2

    .line 125
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 126
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 127
    iget-object v0, p0, Lo/cga;->e:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 129
    :cond_0
    iget-object v0, p0, Lo/cga;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 132
    :cond_1
    :goto_0
    return-void
.end method

.method public c(Landroid/content/Context;II)V
    .locals 5

    .line 41
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    .line 44
    :sswitch_0
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_finish:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->e(Ljava/lang/String;)V

    .line 45
    goto/16 :goto_0

    .line 48
    :sswitch_1
    invoke-static {p1}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lo/cga;->c:Lo/egd;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/egd;->setPadding(IIII)V

    .line 50
    iget-object v0, p0, Lo/cga;->c:Lo/egd;

    const/4 v1, 0x1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {v0, v1, v2}, Lo/egd;->setTextSize(IF)V

    .line 52
    :cond_0
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_uziping:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lo/cfz;->e(Ljava/lang/String;I)V

    .line 53
    goto/16 :goto_0

    .line 56
    :sswitch_2
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_waiting:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->d(Ljava/lang/String;)V

    .line 57
    goto/16 :goto_0

    .line 62
    :sswitch_3
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_pause:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lo/cfz;->d(Ljava/lang/String;I)V

    .line 63
    goto/16 :goto_0

    .line 66
    :sswitch_4
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    invoke-virtual {v0, p3}, Lo/cfz;->b(I)V

    .line 67
    goto :goto_0

    .line 70
    :sswitch_5
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_big_error:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->d(Ljava/lang/String;)V

    .line 71
    goto :goto_0

    .line 74
    :sswitch_6
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_start:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->b(Ljava/lang/String;)V

    .line 75
    goto :goto_0

    .line 78
    :sswitch_7
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_stop:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lo/cfz;->d(Ljava/lang/String;I)V

    .line 79
    goto :goto_0

    .line 82
    :sswitch_8
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_amap_error:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->d(Ljava/lang/String;)V

    .line 83
    goto :goto_0

    .line 87
    :sswitch_9
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_update:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->d(Ljava/lang/String;)V

    .line 88
    goto :goto_0

    .line 91
    :sswitch_a
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_error:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->d(Ljava/lang/String;)V

    .line 92
    goto :goto_0

    .line 95
    :sswitch_b
    iget-object v0, p0, Lo/cga;->b:Lo/cfz;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_save_error:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->d(Ljava/lang/String;)V

    .line 96
    .line 100
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_5
        0x0 -> :sswitch_4
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_0
        0x5 -> :sswitch_7
        0x6 -> :sswitch_6
        0x7 -> :sswitch_9
        0xa -> :sswitch_9
        0x65 -> :sswitch_3
        0x66 -> :sswitch_8
        0x67 -> :sswitch_b
        0x3ea -> :sswitch_a
    .end sparse-switch
.end method

.method public d()Landroid/widget/TextView;
    .locals 1

    .line 107
    iget-object v0, p0, Lo/cga;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method public e()Lo/egd;
    .locals 1

    .line 111
    iget-object v0, p0, Lo/cga;->c:Lo/egd;

    return-object v0
.end method

.method public e(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;I)V"
        }
    .end annotation

    .line 115
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 116
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 117
    iget-object v0, p0, Lo/cga;->e:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 119
    :cond_0
    iget-object v0, p0, Lo/cga;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 122
    :cond_1
    :goto_0
    return-void
.end method
