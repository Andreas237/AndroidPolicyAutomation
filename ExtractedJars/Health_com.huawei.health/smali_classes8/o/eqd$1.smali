.class Lo/eqd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eqd;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eqd;


# direct methods
.method constructor <init>(Lo/eqd;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lo/eqd$1;->e:Lo/eqd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 25

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eqd;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-onResult enter, get data"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 136
    move-object/from16 v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 138
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 139
    :cond_0
    invoke-static {}, Lo/eqd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas none"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->d(Lo/eqd;)Lo/epx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 141
    invoke-static {}, Lo/eqd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show empty view!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->d(Lo/eqd;)Lo/epx;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    invoke-virtual {v0, v1}, Lo/epx;->b(Lo/epx$c;)V

    .line 143
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->d(Lo/eqd;)Lo/epx;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx;->d(Ljava/lang/String;)V

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->a(Lo/eqd;)Lo/eqd$e;

    move-result-object v0

    invoke-virtual {v0}, Lo/eqd$e;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 146
    const/4 v0, 0x6

    iput v0, v6, Landroid/os/Message;->what:I

    .line 147
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->d(Lo/eqd;)Lo/epx;

    move-result-object v0

    iput-object v0, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 148
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->a(Lo/eqd;)Lo/eqd$e;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/eqd$e;->sendMessage(Landroid/os/Message;)Z

    .line 150
    :cond_1
    return-void

    .line 153
    :cond_2
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 154
    invoke-static {}, Lo/eqd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "map none"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    return-void

    .line 167
    :cond_3
    new-instance v14, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v14}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 169
    const/16 v0, 0x7d8

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 170
    const/4 v0, 0x0

    if-eq v0, v15, :cond_5

    .line 171
    move-object v6, v15

    check-cast v6, Ljava/util/List;

    .line 172
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/hihealth/HiHealthData;

    .line 173
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_4

    .line 174
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_4

    .line 175
    move-object/from16 v14, v17

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_healthdata_bloodsugar_before_breakfast:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eqd;->c(Lo/eqd;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    :cond_4
    goto :goto_0

    .line 181
    :cond_5
    const/16 v0, 0x7d9

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 182
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_7

    .line 183
    move-object/from16 v7, v16

    check-cast v7, Ljava/util/List;

    .line 184
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/HiHealthData;

    .line 185
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_6

    .line 186
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_6

    .line 187
    move-object/from16 v14, v18

    .line 188
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_healthdata_bloodsugar_after_breakfast:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eqd;->c(Lo/eqd;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    :cond_6
    goto :goto_1

    .line 193
    :cond_7
    const/16 v0, 0x7da

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 194
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_9

    .line 195
    move-object/from16 v8, v17

    check-cast v8, Ljava/util/List;

    .line 196
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/huawei/hihealth/HiHealthData;

    .line 197
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_8

    .line 198
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_8

    .line 199
    move-object/from16 v14, v19

    .line 200
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_healthdata_bloodsugar_before_lunch:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eqd;->c(Lo/eqd;Ljava/lang/String;)Ljava/lang/String;

    .line 202
    :cond_8
    goto :goto_2

    .line 205
    :cond_9
    const/16 v0, 0x7db

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 206
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_b

    .line 207
    move-object/from16 v9, v18

    check-cast v9, Ljava/util/List;

    .line 208
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_3
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/hihealth/HiHealthData;

    .line 209
    invoke-virtual/range {v20 .. v20}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_a

    .line 210
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {v20 .. v20}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_a

    .line 211
    move-object/from16 v14, v20

    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_healthdata_bloodsugar_after_lunch:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eqd;->c(Lo/eqd;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    :cond_a
    goto :goto_3

    .line 217
    :cond_b
    const/16 v0, 0x7dc

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 218
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_d

    .line 219
    move-object/from16 v10, v19

    check-cast v10, Ljava/util/List;

    .line 220
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_4
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/huawei/hihealth/HiHealthData;

    .line 221
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_c

    .line 222
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {v21 .. v21}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_c

    .line 223
    move-object/from16 v14, v21

    .line 224
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_healthdata_bloodsugar_before_dinner:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eqd;->c(Lo/eqd;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    :cond_c
    goto :goto_4

    .line 229
    :cond_d
    const/16 v0, 0x7dd

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v20

    .line 230
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_f

    .line 231
    move-object/from16 v11, v20

    check-cast v11, Ljava/util/List;

    .line 232
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_5
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lcom/huawei/hihealth/HiHealthData;

    .line 233
    invoke-virtual/range {v22 .. v22}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_e

    .line 234
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {v22 .. v22}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_e

    .line 235
    move-object/from16 v14, v22

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_healthdata_bloodsugar_after_dinner:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eqd;->c(Lo/eqd;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    :cond_e
    goto :goto_5

    .line 241
    :cond_f
    const/16 v0, 0x7de

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v21

    .line 242
    const/4 v0, 0x0

    move-object/from16 v1, v21

    if-eq v0, v1, :cond_11

    .line 243
    move-object/from16 v12, v21

    check-cast v12, Ljava/util/List;

    .line 244
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_6
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lcom/huawei/hihealth/HiHealthData;

    .line 245
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_10

    .line 246
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {v23 .. v23}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_10

    .line 247
    move-object/from16 v14, v23

    .line 248
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_healthdata_bloodsugar_before_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eqd;->c(Lo/eqd;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    :cond_10
    goto :goto_6

    .line 253
    :cond_11
    const/16 v0, 0x7df

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v22

    .line 254
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-eq v0, v1, :cond_13

    .line 255
    move-object/from16 v13, v22

    check-cast v13, Ljava/util/List;

    .line 256
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_7
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Lcom/huawei/hihealth/HiHealthData;

    .line 257
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_12

    .line 258
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_12

    .line 259
    move-object/from16 v14, v24

    .line 260
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_healthdata_bloodsugar_early_morning:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eqd;->c(Lo/eqd;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    :cond_12
    goto :goto_7

    .line 265
    :cond_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_14

    .line 267
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->d(Lo/eqd;)Lo/epx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_14

    .line 268
    invoke-static {}, Lo/eqd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set empty view for Dnurse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->d(Lo/eqd;)Lo/epx;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    invoke-virtual {v0, v1}, Lo/epx;->b(Lo/epx$c;)V

    .line 270
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->d(Lo/eqd;)Lo/epx;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqd$1;->e:Lo/eqd;

    iget-object v1, v1, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx;->d(Ljava/lang/String;)V

    .line 272
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->a(Lo/eqd;)Lo/eqd$e;

    move-result-object v0

    invoke-virtual {v0}, Lo/eqd$e;->obtainMessage()Landroid/os/Message;

    move-result-object v23

    .line 273
    const/4 v0, 0x6

    move-object/from16 v1, v23

    iput v0, v1, Landroid/os/Message;->what:I

    .line 274
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->d(Lo/eqd;)Lo/epx;

    move-result-object v0

    move-object/from16 v1, v23

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 275
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    invoke-static {v0}, Lo/eqd;->a(Lo/eqd;)Lo/eqd$e;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lo/eqd$e;->sendMessage(Landroid/os/Message;)Z

    .line 277
    return-void

    .line 281
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqd$1;->e:Lo/eqd;

    const-string v1, "point_value"

    invoke-virtual {v14, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-static {v0, v1, v2, v3, v4}, Lo/eqd;->c(Lo/eqd;DJ)V

    .line 282
    invoke-static {}, Lo/eqd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show data view: data"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "point_value"

    invoke-virtual {v14, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    return-void
.end method
