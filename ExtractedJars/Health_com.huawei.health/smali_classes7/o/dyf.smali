.class public Lo/dyf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILo/dvq;)Z
    .locals 3

    .line 92
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 94
    :pswitch_0
    invoke-virtual {p1}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->p(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    const/4 v2, 0x1

    goto/16 :goto_1

    .line 97
    :cond_0
    const/4 v2, 0x0

    .line 99
    goto/16 :goto_1

    .line 101
    :pswitch_1
    invoke-virtual {p1}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->o(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    const/4 v2, 0x1

    goto/16 :goto_1

    .line 104
    :cond_1
    const/4 v2, 0x0

    .line 106
    goto/16 :goto_1

    .line 108
    :pswitch_2
    invoke-virtual {p1}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dzo;->d(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 109
    const/4 v2, 0x1

    goto/16 :goto_1

    .line 111
    :cond_2
    const/4 v2, 0x0

    .line 113
    goto/16 :goto_1

    .line 115
    :pswitch_3
    invoke-virtual {p1}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->o(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 116
    const/4 v2, 0x1

    goto/16 :goto_1

    .line 118
    :cond_3
    const/4 v2, 0x0

    .line 120
    goto :goto_1

    .line 122
    :pswitch_4
    invoke-virtual {p1}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->o(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 123
    const/4 v2, 0x1

    goto :goto_1

    .line 125
    :cond_4
    const/4 v2, 0x0

    .line 127
    goto :goto_1

    .line 129
    :pswitch_5
    invoke-virtual {p1}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->o(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 130
    const/4 v2, 0x1

    goto :goto_1

    .line 132
    :cond_5
    const/4 v2, 0x0

    .line 134
    goto :goto_1

    .line 136
    :pswitch_6
    invoke-virtual {p1}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->o(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 137
    const/4 v2, 0x1

    goto :goto_1

    .line 139
    :cond_6
    const/4 v2, 0x0

    .line 141
    goto :goto_1

    .line 143
    :pswitch_7
    invoke-virtual {p1}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/dzo;->d(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzo;->k(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 144
    const/4 v2, 0x1

    goto :goto_1

    .line 146
    :cond_7
    const/4 v2, 0x0

    .line 148
    goto :goto_1

    .line 150
    :goto_0
    const/4 v2, 0x0

    .line 153
    :goto_1
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public static d(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dvq;>;)Ljava/util/ArrayList<Lo/dyw;>;"
        }
    .end annotation

    .line 50
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 51
    const-string v0, "PLGACHIEVE_AchieveKakaInitLayoutManager"

    const-string v1, "kakaTaskInfos is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-static {p0, v2}, Lo/dyf;->e(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 57
    return-object v2
.end method

.method public static d(Lo/dvq;)Lo/dzb;
    .locals 2

    .line 67
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 70
    :cond_0
    new-instance v1, Lo/dzb;

    invoke-direct {v1}, Lo/dzb;-><init>()V

    .line 71
    invoke-virtual {p0}, Lo/dvq;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dzb;->e(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dzb;->a(Ljava/lang/String;)V

    .line 73
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/dzb;->e(I)V

    .line 74
    invoke-virtual {p0}, Lo/dvq;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dzb;->b(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p0}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dzb;->c(Ljava/lang/String;)V

    .line 76
    invoke-virtual {p0}, Lo/dvq;->r()I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dzb;->a(I)V

    .line 77
    invoke-virtual {p0}, Lo/dvq;->f()I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dzb;->d(I)V

    .line 79
    return-object v1
.end method

.method private static d(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 204
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_hwh_home_achievement_kaka_special_task:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_newbie:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_task_type_title_login:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_task_type_title_sport:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_task_type_title_record:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_share:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_device_setting_other:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    return-void
.end method

.method public static e(Ljava/util/List;I)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dvq;>;I)Ljava/util/ArrayList<Lo/dyw;>;"
        }
    .end annotation

    .line 165
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 166
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 167
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 168
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvq;

    .line 169
    invoke-virtual {v6}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v7

    .line 170
    invoke-static {v7}, Lo/dzo;->l(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 171
    goto :goto_0

    .line 173
    :cond_0
    const v0, 0x1fbda

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    invoke-virtual {v6}, Lo/dvq;->k()I

    move-result v0

    if-lez v0, :cond_1

    .line 175
    const-string v0, "PLGACHIEVE_AchieveKakaInitLayoutManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "acquireTaskFrequency()="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dvq;->k()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 179
    :cond_1
    invoke-static {p1, v6}, Lo/dyf;->a(ILo/dvq;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 180
    new-instance v8, Lo/dyw;

    invoke-direct {v8}, Lo/dyw;-><init>()V

    .line 181
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/dyw;->d(I)V

    .line 182
    invoke-virtual {v8, v7}, Lo/dyw;->e(Ljava/lang/String;)V

    .line 183
    invoke-static {v6}, Lo/dyf;->d(Lo/dvq;)Lo/dzb;

    move-result-object v9

    .line 184
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/dzb;->d(Ljava/lang/String;)V

    .line 185
    invoke-virtual {v8, v9}, Lo/dyw;->b(Lo/dzb;)V

    .line 186
    const/4 v0, 0x5

    if-ne v0, p1, :cond_2

    invoke-static {v7}, Lo/dzo;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 187
    invoke-virtual {v6}, Lo/dvq;->p()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dzo;->b(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 188
    goto/16 :goto_0

    .line 191
    :cond_2
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    :cond_3
    goto/16 :goto_0

    .line 194
    :cond_4
    return-object v4
.end method

.method public static e(Ljava/lang/String;)Lo/dyw;
    .locals 2

    .line 249
    new-instance v1, Lo/dyw;

    invoke-direct {v1}, Lo/dyw;-><init>()V

    .line 250
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dyw;->d(I)V

    .line 251
    invoke-virtual {v1, p0}, Lo/dyw;->a(Ljava/lang/String;)V

    .line 252
    const-string v0, ""

    invoke-virtual {v1, v0}, Lo/dyw;->e(Ljava/lang/String;)V

    .line 253
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dyw;->b(Lo/dzb;)V

    .line 254
    return-object v1
.end method

.method private static e(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dvq;>;Ljava/util/ArrayList<Lo/dyw;>;)V"
        }
    .end annotation

    .line 216
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 217
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "NEWBIE"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 218
    const/4 v4, 0x0

    .line 219
    const-string v0, "done"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    const/4 v4, 0x1

    .line 222
    :cond_0
    invoke-static {v2}, Lo/dyf;->d(Ljava/util/ArrayList;)V

    .line 223
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_4

    .line 224
    const/4 v0, 0x1

    if-ne v5, v0, :cond_1

    if-nez v4, :cond_1

    .line 225
    goto :goto_2

    .line 227
    :cond_1
    invoke-static {p0, v5}, Lo/dyf;->e(Ljava/util/List;I)Ljava/util/ArrayList;

    move-result-object v6

    .line 228
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 229
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 230
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/dyf;->e(Ljava/lang/String;)Lo/dyw;

    move-result-object v8

    .line 231
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v7, :cond_3

    .line 233
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dyw;

    .line 234
    add-int/lit8 v0, v7, -0x1

    if-ne v9, v0, :cond_2

    .line 235
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lo/dyw;->c(Z)V

    .line 237
    :cond_2
    invoke-virtual {p1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 223
    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 241
    :cond_4
    return-void
.end method
