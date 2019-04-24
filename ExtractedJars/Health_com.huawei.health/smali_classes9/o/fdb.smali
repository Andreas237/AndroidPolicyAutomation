.class public Lo/fdb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lo/fdb;->c:Landroid/app/Activity;

    .line 45
    return-void
.end method

.method private b(Lo/acu;ILo/fgj$a;)V
    .locals 7

    .line 161
    const/4 v4, 0x2

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 162
    if-eqz p1, :cond_0

    const/16 v0, 0x1e

    if-le p2, v0, :cond_0

    .line 163
    int-to-double v0, p2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/cxh;->d(D)[I

    move-result-object v4

    .line 165
    :cond_0
    new-instance v0, Lo/fgj$c;

    iget-object v1, p0, Lo/fdb;->c:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/fgj$c;-><init>(Landroid/content/Context;)V

    .line 166
    invoke-virtual {v0, p3}, Lo/fgj$c;->d(Lo/fgj$a;)Lo/fgj$c;

    move-result-object v0

    new-instance v1, Lo/fdb$2;

    invoke-direct {v1, p0}, Lo/fdb$2;-><init>(Lo/fdb;)V

    .line 167
    invoke-virtual {v0, v1}, Lo/fgj$c;->c(Lo/fgj$a;)Lo/fgj$c;

    move-result-object v0

    const/4 v1, 0x0

    aget v1, v4, v1

    const/4 v2, 0x1

    aget v2, v4, v2

    .line 174
    invoke-virtual {v0, v1, v2}, Lo/fgj$c;->a(II)Lo/fgj$c;

    move-result-object v0

    .line 175
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fgj$c;->c(Z)Lo/fgj$c;

    move-result-object v5

    .line 176
    invoke-virtual {v5}, Lo/fgj$c;->a()Lo/fgj;

    move-result-object v6

    .line 177
    invoke-virtual {v6}, Lo/fgj;->show()V

    .line 178
    return-void

    nop

    :array_0
    .array-data 4
        0x5
        0x7
    .end array-data
.end method


# virtual methods
.method public a(Ljava/lang/String;Lo/emr;)V
    .locals 2

    .line 80
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lo/fdb;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_weight_add_user:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 83
    :cond_0
    iget-object v0, p0, Lo/fdb;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_weight_edit_user:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 85
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;"
        }
    .end annotation

    .line 54
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 55
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0}, Lo/acs;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 56
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 57
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 58
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 59
    new-instance v6, Lcom/huawei/hihealth/HiTimeInterval;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiTimeInterval;-><init>()V

    .line 60
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setStartTime(J)V

    .line 61
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setEndTime(J)V

    .line 62
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 65
    :cond_0
    return-object v2
.end method

.method public c(Lo/acu;Landroid/view/View;)V
    .locals 1

    .line 69
    if-nez p1, :cond_0

    .line 70
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 72
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 74
    :goto_0
    return-void
.end method

.method public c(Lo/acu;Landroid/widget/TextView;Z)V
    .locals 10

    .line 93
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v8, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo/acu;->d()I

    move-result v8

    .line 94
    :goto_0
    if-eqz p3, :cond_1

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 95
    iget-object v0, p0, Lo/fdb;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_userinfo_please_select:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 97
    :cond_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 98
    const/4 v9, 0x2

    new-array v9, v9, [I

    fill-array-data v9, :array_0

    .line 99
    const/16 v0, 0x1e

    if-le v8, v0, :cond_2

    .line 100
    int-to-double v0, v8

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/cxh;->d(D)[I

    move-result-object v9

    .line 102
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fdb;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft_string:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aget v4, v9, v4

    int-to-double v4, v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fdb;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ins_string:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x1

    aget v4, v9, v4

    int-to-double v4, v4

    .line 103
    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 102
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    const/16 v8, 0xa0

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lo/acu;->d()I

    move-result v8

    .line 106
    :goto_1
    int-to-double v0, v8

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 108
    iget-object v0, p0, Lo/fdb;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v9, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    :goto_2
    return-void

    nop

    :array_0
    .array-data 4
        0x5
        0x7
    .end array-data
.end method

.method public d(Lo/acu;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lo/fgj$a;)V
    .locals 5

    .line 148
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    const-string v0, "AddUserOrEditWeightUserInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showInchDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    invoke-direct {p0, p1, p2, p4}, Lo/fdb;->b(Lo/acu;ILo/fgj$a;)V

    goto :goto_0

    .line 152
    :cond_0
    const-string v0, "AddUserOrEditWeightUserInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showValueSetDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    move v4, p2

    .line 154
    iget-object v0, p0, Lo/fdb;->c:Landroid/app/Activity;

    invoke-static {v0, v4, p3}, Lo/fdr;->b(Landroid/content/Context;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 157
    :goto_0
    return-void
.end method

.method public e(Lo/acu;)Lo/acu;
    .locals 4

    .line 138
    move-object v1, p1

    .line 139
    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v2

    .line 140
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, v2}, Lo/act;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 141
    invoke-virtual {p1, v3}, Lo/acu;->e(Ljava/lang/String;)V

    .line 142
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, v3, v2}, Lo/act;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    return-object v1
.end method

.method public e(Lo/acu;Z)Lo/acu;
    .locals 5

    .line 115
    const/4 v3, 0x0

    .line 117
    if-nez p1, :cond_0

    .line 118
    new-instance v3, Lo/acu;

    invoke-direct {v3}, Lo/acu;-><init>()V

    .line 119
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 120
    invoke-virtual {v3, v4}, Lo/acu;->b(Ljava/lang/String;)V

    .line 121
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/acu;->a(Z)V

    .line 122
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lo/acu;->a(I)V

    .line 123
    goto :goto_0

    .line 124
    :cond_0
    move-object v3, p1

    .line 127
    :goto_0
    if-eqz p2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Lo/acu;->e(B)V

    .line 129
    return-object v3
.end method
