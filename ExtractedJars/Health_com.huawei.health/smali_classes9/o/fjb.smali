.class public Lo/fjb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 16

    .line 216
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 217
    if-eqz p1, :cond_0

    .line 218
    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 220
    :cond_0
    return-void

    .line 222
    :cond_1
    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_3

    .line 223
    const-string v0, "SercurityDataCheck"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    if-eqz p1, :cond_2

    .line 225
    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 227
    :cond_2
    return-void

    .line 230
    :cond_3
    const/16 v0, 0x2716

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "health_data_record_health_agree"

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 232
    const-string v0, "true"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 233
    if-eqz p1, :cond_4

    .line 234
    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 236
    :cond_4
    return-void

    .line 239
    :cond_5
    const/16 v0, 0x2729

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "privacy_data_already_show_agree"

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 241
    const-string v0, "true"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 242
    if-eqz p1, :cond_6

    .line 243
    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 245
    :cond_6
    return-void

    .line 247
    :cond_7
    invoke-static/range {p0 .. p0}, Lo/fjb;->c(Landroid/content/Context;)[Z

    move-result-object v7

    .line 248
    const/4 v0, 0x1

    aget-boolean v0, v7, v0

    if-eqz v0, :cond_9

    .line 249
    if-eqz p1, :cond_8

    .line 250
    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 252
    :cond_8
    return-void

    .line 254
    :cond_9
    invoke-static/range {p0 .. p0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_health_data_num"

    move-object/from16 v2, p0

    invoke-virtual {v0, v2, v1}, Lo/dom;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v8

    .line 255
    const/4 v0, 0x3

    if-lt v8, v0, :cond_b

    .line 256
    if-eqz p1, :cond_a

    .line 257
    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 259
    :cond_a
    return-void

    .line 261
    :cond_b
    invoke-static/range {p0 .. p0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_health_data_num"

    move-object/from16 v2, p0

    invoke-virtual {v0, v2, v1}, Lo/dom;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 264
    sget v0, Lcom/huawei/ui/main/R$layout;->securyty_notify_custom_view_dialog:I

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13

    .line 265
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_sport:I

    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    .line 266
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_health:I

    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    .line 267
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_sleep:I

    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/LinearLayout;

    .line 268
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_four:I

    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    .line 269
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 270
    const/16 v0, 0x8

    invoke-virtual {v11, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 271
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 273
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_c

    .line 274
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_health_agreement_china:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 276
    :cond_c
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_health_agreement_oversea:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fhq;->d(Landroid/content/Context;)Lo/fhq;

    move-result-object v14

    .line 280
    new-instance v0, Lo/egw$c;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    .line 281
    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 282
    invoke-virtual {v0, v13}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_disagree:I

    .line 283
    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fjb$10;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v2, v3, v14, v4}, Lo/fjb$10;-><init>(Landroid/content/Context;Lo/fhq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_user_permission_ok:I

    .line 295
    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fjb$3;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v2, v3, v14, v4}, Lo/fjb$3;-><init>(Landroid/content/Context;Lo/fhq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 307
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v15

    .line 308
    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Lo/egw;->setCancelable(Z)V

    .line 309
    invoke-virtual {v15}, Lo/egw;->show()V

    .line 310
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 19

    .line 115
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 116
    return-void

    .line 119
    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_1

    .line 120
    const-string v0, "SercurityDataCheck"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    return-void

    .line 124
    :cond_1
    invoke-static/range {p0 .. p0}, Lo/fjb;->c(Landroid/content/Context;)[Z

    move-result-object v5

    .line 125
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    sget-object v1, Lo/acl$a;->b:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->c(Ljava/lang/String;)Z

    move-result v6

    .line 126
    const/4 v0, 0x1

    aget-boolean v0, v5, v0

    if-nez v0, :cond_2

    if-eqz v6, :cond_2

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    .line 127
    :goto_0
    if-nez v7, :cond_3

    .line 128
    const/16 v0, 0x2716

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "health_data_record_health_agree"

    const-string v2, "false"

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    move-object/from16 v4, p0

    invoke-static {v4, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_1

    .line 131
    :cond_3
    const/16 v0, 0x2716

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "health_data_record_health_agree"

    const-string v2, "true"

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    move-object/from16 v4, p0

    invoke-static {v4, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 136
    :goto_1
    const/4 v0, 0x0

    aget-boolean v0, v5, v0

    if-eqz v0, :cond_4

    if-nez v7, :cond_4

    .line 137
    return-void

    .line 142
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$layout;->securyty_notify_custom_view_dialog:I

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v12

    .line 143
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_sport:I

    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout;

    .line 144
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_sleep:I

    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    .line 145
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_health:I

    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    .line 146
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_four:I

    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    .line 148
    invoke-static/range {p0 .. p0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_sport_data_num"

    move-object/from16 v2, p0

    invoke-virtual {v0, v2, v1}, Lo/dom;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v13

    .line 149
    invoke-static/range {p0 .. p0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_health_data_num"

    move-object/from16 v2, p0

    invoke-virtual {v0, v2, v1}, Lo/dom;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v14

    .line 151
    const/4 v0, 0x0

    aget-boolean v0, v5, v0

    if-nez v0, :cond_5

    const/4 v0, 0x3

    if-ge v13, v0, :cond_5

    const/4 v15, 0x1

    goto :goto_2

    :cond_5
    const/4 v15, 0x0

    .line 152
    :goto_2
    if-eqz v7, :cond_6

    const/4 v0, 0x3

    if-ge v14, v0, :cond_6

    const/16 v16, 0x1

    goto :goto_3

    :cond_6
    const/16 v16, 0x0

    .line 154
    :goto_3
    if-nez v15, :cond_7

    if-nez v16, :cond_7

    .line 155
    return-void

    .line 158
    :cond_7
    if-eqz v15, :cond_8

    const/4 v0, 0x0

    goto :goto_4

    :cond_8
    const/16 v0, 0x8

    :goto_4
    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 159
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 160
    if-eqz v16, :cond_9

    const/4 v0, 0x0

    goto :goto_5

    :cond_9
    const/16 v0, 0x8

    :goto_5
    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 161
    invoke-virtual {v10}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_b

    .line 162
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_a

    .line 163
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_health_agreement_china:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 165
    :cond_a
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_health_agreement_oversea:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    :cond_b
    :goto_6
    invoke-virtual {v8}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_c

    .line 170
    invoke-static/range {p0 .. p0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_sport_data_num"

    move-object/from16 v2, p0

    invoke-virtual {v0, v2, v1}, Lo/dom;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 172
    :cond_c
    invoke-virtual {v10}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_d

    .line 173
    invoke-static/range {p0 .. p0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_health_data_num"

    move-object/from16 v2, p0

    invoke-virtual {v0, v2, v1}, Lo/dom;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 175
    :cond_d
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fhq;->d(Landroid/content/Context;)Lo/fhq;

    move-result-object v17

    .line 176
    new-instance v0, Lo/egw$c;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 177
    invoke-virtual {v0, v12}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_disagree:I

    .line 178
    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fjb$1;

    move-object/from16 v3, v17

    move-object/from16 v4, p0

    invoke-direct {v2, v5, v3, v7, v4}, Lo/fjb$1;-><init>([ZLo/fhq;ZLandroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_user_permission_ok:I

    .line 191
    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fjb$2;

    move-object/from16 v3, v17

    move-object/from16 v4, p0

    invoke-direct {v2, v5, v3, v7, v4}, Lo/fjb$2;-><init>([ZLo/fhq;ZLandroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 204
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v18

    .line 205
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 206
    invoke-virtual/range {v18 .. v18}, Lo/egw;->show()V

    .line 207
    return-void
.end method

.method public static b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 13

    .line 319
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 320
    if-eqz p1, :cond_0

    .line 321
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 323
    :cond_0
    return-void

    .line 325
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p0, :cond_3

    .line 326
    const-string v0, "SercurityDataCheck"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    if-eqz p1, :cond_2

    .line 328
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 330
    :cond_2
    return-void

    .line 332
    :cond_3
    invoke-static {p0}, Lo/fjb;->c(Landroid/content/Context;)[Z

    move-result-object v4

    .line 333
    const/4 v0, 0x1

    aget-boolean v0, v4, v0

    if-eqz v0, :cond_5

    .line 334
    if-eqz p1, :cond_4

    .line 335
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 337
    :cond_4
    return-void

    .line 339
    :cond_5
    invoke-static {p0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_health_data_num"

    invoke-virtual {v0, p0, v1}, Lo/dom;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    .line 340
    const/4 v0, 0x3

    if-lt v5, v0, :cond_7

    .line 341
    if-eqz p1, :cond_6

    .line 342
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 344
    :cond_6
    return-void

    .line 346
    :cond_7
    invoke-static {p0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_health_data_num"

    invoke-virtual {v0, p0, v1}, Lo/dom;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 349
    sget v0, Lcom/huawei/ui/main/R$layout;->securyty_notify_custom_view_dialog:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v10

    .line 350
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_sport:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 351
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_health:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 352
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_sleep:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout;

    .line 353
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_four:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 354
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 355
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 356
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 357
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_8

    .line 358
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_health_agreement_china:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 360
    :cond_8
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_health_agreement_oversea:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 362
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fhq;->d(Landroid/content/Context;)Lo/fhq;

    move-result-object v11

    .line 363
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    .line 364
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 365
    invoke-virtual {v0, v10}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_disagree:I

    .line 366
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fjb$8;

    invoke-direct {v2, v11, p1}, Lo/fjb$8;-><init>(Lo/fhq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_user_permission_ok:I

    .line 375
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fjb$6;

    invoke-direct {v2, v11, p1}, Lo/fjb$6;-><init>(Lo/fhq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 384
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v12

    .line 385
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lo/egw;->setCancelable(Z)V

    .line 386
    invoke-virtual {v12}, Lo/egw;->show()V

    .line 387
    return-void
.end method

.method static synthetic c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-static {p0, p1, p2}, Lo/fjb;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static c(Landroid/content/Context;)[Z
    .locals 8

    .line 397
    const/4 v0, 0x2

    new-array v4, v0, [Z

    .line 398
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fhq;->d(Landroid/content/Context;)Lo/fhq;

    move-result-object v5

    .line 399
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lo/fhq;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 400
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Lo/fhq;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 401
    const-string v0, "SercurityDataCheck"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readPersonalPrivacySettingValue 01 is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const-string v2, " 03 status"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    const-string v0, "true"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    aput-boolean v0, v4, v1

    .line 403
    const-string v0, "true"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const/4 v1, 0x1

    aput-boolean v0, v4, v1

    .line 404
    return-object v4
.end method

.method public static d(ILandroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 12

    .line 42
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 44
    return-void

    .line 47
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 48
    const-string v0, "SercurityDataCheck"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 50
    return-void

    .line 54
    :cond_1
    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-ne p0, v0, :cond_3

    .line 55
    :cond_2
    const-string v0, "SercurityDataCheck"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type==2 || type==3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 57
    return-void

    .line 60
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fhq;->d(Landroid/content/Context;)Lo/fhq;

    move-result-object v4

    .line 61
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lo/fhq;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 62
    const-string v0, "SercurityDataCheck"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showUserInfoDialog data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    const-string v0, "true"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 64
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 65
    return-void

    .line 67
    :cond_4
    invoke-static {p1}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_base_info_num"

    invoke-virtual {v0, p1, v1}, Lo/dom;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    .line 69
    const/4 v0, 0x3

    if-lt v6, v0, :cond_5

    .line 70
    return-void

    .line 72
    :cond_5
    invoke-static {p1}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    const-string v1, "privacy_base_info_num"

    invoke-virtual {v0, p1, v1}, Lo/dom;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 76
    sget v0, Lcom/huawei/ui/main/R$layout;->securyty_notify_custom_view_dialog:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v9

    .line 77
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_two:I

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 78
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_sleep:I

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 79
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_layout_data_health:I

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout;

    .line 80
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 81
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 82
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_personal_profile_agreement:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    .line 84
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 85
    invoke-virtual {v0, v9}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_disagree:I

    .line 86
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fjb$5;

    invoke-direct {v2, v4, p2, p1}, Lo/fjb$5;-><init>(Lo/fhq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_user_permission_ok:I

    .line 95
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fjb$4;

    invoke-direct {v2, v4, p2, p1}, Lo/fjb$4;-><init>(Lo/fhq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v11

    .line 104
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lo/egw;->setCancelable(Z)V

    .line 105
    invoke-virtual {v11}, Lo/egw;->show()V

    .line 106
    return-void
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 409
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 410
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 412
    const-string v0, "agree"

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v2, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 415
    return-void
.end method
