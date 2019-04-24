.class public Lo/fdr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Landroid/view/View$OnClickListener;
    .locals 1

    .line 271
    new-instance v0, Lo/fdr$9;

    invoke-direct {v0}, Lo/fdr$9;-><init>()V

    .line 277
    return-object v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 492
    new-instance v4, Lo/egy$b;

    invoke-direct {v4, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 494
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_plugin_device_selection_click_bind_my_device_select:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_ok_button:I

    .line 495
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fdr$8;

    invoke-direct {v2, p0, p1}, Lo/fdr$8;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_cancle_button:I

    .line 506
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fdr$7;

    invoke-direct {v2}, Lo/fdr$7;-><init>()V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 511
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 512
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 513
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 2

    .line 109
    const-string v0, "default"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 110
    invoke-static {p0, p1}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 111
    if-eqz v1, :cond_0

    .line 112
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 114
    :cond_0
    goto :goto_0

    .line 115
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_personal_head:I

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 117
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 2

    .line 81
    if-eqz p2, :cond_0

    .line 82
    invoke-virtual {p1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 86
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 88
    invoke-virtual {p1}, Lo/acu;->i()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 89
    sget v0, Lcom/huawei/ui/main/R$drawable;->health_spineer_setting_selector:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 91
    :cond_1
    invoke-virtual {p1}, Lo/acu;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 92
    invoke-virtual {p1}, Lo/acu;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p3}, Lo/fdr;->a(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {p1}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_3

    .line 95
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_personal_head:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 97
    :cond_3
    invoke-virtual {p1}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lo/dbk;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 101
    :goto_0
    return-void
.end method

.method static synthetic a(ZLandroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    .line 67
    invoke-static {p0, p1, p2}, Lo/fdr;->b(ZLandroid/widget/ImageView;Landroid/widget/ImageView;)V

    return-void
.end method

.method public static b(Landroid/content/Context;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 9

    .line 195
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_healthdata_weight_userinfo_dialog_set:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 196
    sget v0, Lcom/huawei/ui/main/R$id;->weight_wheelView:I

    invoke-static {v4, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fha;

    .line 197
    invoke-static {p0}, Lo/fdr;->e(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/fha;->setWheelData(Ljava/util/List;)V

    .line 198
    new-instance v0, Lo/fgq;

    invoke-direct {v0, p0}, Lo/fgq;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v0}, Lo/fha;->setWheelAdapter(Lo/fgt;)V

    .line 199
    sget-object v0, Lo/fha$d;->d:Lo/fha$d;

    invoke-virtual {v5, v0}, Lo/fha;->setSkin(Lo/fha$d;)V

    .line 200
    const/4 v0, 0x5

    invoke-virtual {v5, v0}, Lo/fha;->setWheelSize(I)V

    .line 201
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/fha;->setLoop(Z)V

    .line 203
    const/16 v0, 0x32

    if-lt p1, v0, :cond_0

    .line 204
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiUserInfo.getHeight()="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    add-int/lit8 v2, p1, -0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    add-int/lit8 v0, p1, -0x32

    invoke-virtual {v5, v0}, Lo/fha;->setSelection(I)V

    goto :goto_0

    .line 207
    :cond_0
    const/16 v0, 0x6e

    invoke-virtual {v5, v0}, Lo/fha;->setSelection(I)V

    .line 210
    :goto_0
    new-instance v6, Lo/fha$c;

    invoke-direct {v6}, Lo/fha$c;-><init>()V

    .line 211
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->hw_show_set_step_progress_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/fha$c;->e:I

    .line 212
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->hw_show_color_text_10_persent_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/fha$c;->a:I

    .line 214
    invoke-virtual {v5, v6}, Lo/fha;->setStyle(Lo/fha$c;)V

    .line 216
    new-instance v8, Lo/egw$c;

    invoke-direct {v8, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 217
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height:I

    invoke-virtual {v8, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 218
    invoke-virtual {v0, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lo/fdr$4;

    invoke-direct {v2, v5, p2}, Lo/fdr$4;-><init>(Lo/fha;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 219
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    .line 227
    invoke-static {}, Lo/fdr;->a()Landroid/view/View$OnClickListener;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 228
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 229
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 231
    return-void
.end method

.method private static b(ZLandroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 1

    .line 177
    if-eqz p0, :cond_0

    .line 178
    sget v0, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 179
    sget v0, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 181
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 182
    sget v0, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 185
    :goto_0
    return-void
.end method

.method public static b()Z
    .locals 8

    .line 520
    const/4 v4, 0x0

    .line 521
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v5

    .line 522
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 523
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acu;

    .line 524
    invoke-virtual {v7}, Lo/acu;->b()I

    move-result v0

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    invoke-virtual {v7}, Lo/acu;->b()I

    move-result v0

    const/16 v1, 0x41

    if-le v0, v1, :cond_1

    .line 525
    :cond_0
    const/4 v4, 0x1

    .line 522
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 528
    :cond_2
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAble status is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    return v4
.end method

.method public static b(III)Z
    .locals 7

    .line 282
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 283
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 284
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 285
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 286
    const/4 v6, 0x0

    .line 287
    if-le p0, v3, :cond_0

    .line 288
    const/4 v6, 0x1

    .line 290
    :cond_0
    if-ne p0, v3, :cond_1

    if-le p1, v4, :cond_1

    .line 291
    const/4 v6, 0x1

    .line 293
    :cond_1
    if-ne p0, v3, :cond_2

    if-ne p1, v4, :cond_2

    if-le p2, v5, :cond_2

    .line 294
    const/4 v6, 0x1

    .line 296
    :cond_2
    return v6
.end method

.method public static c(Landroid/content/Context;IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 248
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 249
    sget v0, Lcom/huawei/ui/main/R$layout;->userinfo_date_select:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 250
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_datepicker:I

    invoke-static {v4, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fgi;

    .line 252
    new-instance v7, Lo/egw$c;

    invoke-direct {v7, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 253
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_birthday:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 254
    invoke-virtual {v0, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lo/fdr$1;

    invoke-direct {v2, p4, v5}, Lo/fdr$1;-><init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lo/fgi;)V

    .line 255
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    .line 262
    invoke-static {}, Lo/fdr;->a()Landroid/view/View$OnClickListener;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 263
    invoke-virtual {v7}, Lo/egw$c;->e()Lo/egw;

    move-result-object v6

    .line 264
    invoke-virtual {v5, p1}, Lo/fgi;->setSelectedYear(I)V

    .line 265
    invoke-virtual {v5, p2}, Lo/fgi;->setSelectedMonth(I)V

    .line 266
    invoke-virtual {v5, p3}, Lo/fgi;->setSelectedDay(I)V

    .line 267
    invoke-virtual {v6}, Lo/egw;->show()V

    .line 268
    return-void
.end method

.method public static d(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lo/acn;)Lo/acn;
    .locals 15

    .line 392
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    .line 394
    invoke-virtual/range {p3 .. p3}, Lo/acn;->d()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    invoke-virtual/range {p3 .. p3}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    invoke-static/range {p3 .. p3}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 395
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 396
    move-object/from16 v0, p1

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    .line 417
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v5

    .line 420
    invoke-virtual/range {p3 .. p3}, Lo/acn;->u()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual/range {p3 .. p3}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_2

    .line 421
    invoke-virtual/range {p3 .. p3}, Lo/acn;->u()I

    move-result v6

    .line 422
    invoke-virtual/range {p3 .. p3}, Lo/acn;->q()I

    move-result v7

    .line 423
    invoke-virtual/range {p3 .. p3}, Lo/acn;->t()B

    move-result v8

    goto :goto_0

    .line 425
    :cond_2
    invoke-virtual {v5}, Lo/acu;->b()I

    move-result v6

    .line 426
    invoke-virtual {v5}, Lo/acu;->d()I

    move-result v7

    .line 427
    invoke-virtual {v5}, Lo/acu;->c()B

    move-result v8

    .line 429
    :goto_0
    invoke-virtual/range {p3 .. p3}, Lo/acn;->f()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/acm;->b(D)I

    move-result v9

    .line 430
    invoke-virtual/range {p3 .. p3}, Lo/acn;->b()D

    move-result-wide v0

    invoke-static {v8, v0, v1, v6}, Lo/acm;->a(BDI)I

    move-result v10

    .line 431
    int-to-double v0, v7

    invoke-virtual/range {p3 .. p3}, Lo/acn;->g()D

    move-result-wide v2

    invoke-static {v8, v0, v1, v2, v3}, Lo/acm;->c(BDD)I

    move-result v11

    .line 432
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0, v9, v10, v11}, Lo/acs;->a(III)Ljava/lang/String;

    move-result-object v12

    .line 433
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the health advice is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_body_fit_score_suggestion:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    .line 435
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mid_weight_score:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/egb;

    .line 436
    invoke-virtual {v13, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 438
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 439
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "CN"

    invoke-virtual {v4}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual/range {p3 .. p3}, Lo/acn;->l()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    invoke-static {}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 440
    :cond_3
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 442
    invoke-virtual/range {p3 .. p3}, Lo/acn;->l()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 444
    :cond_4
    move-object/from16 v0, p1

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 450
    :goto_1
    return-object p3
.end method

.method public static d(Landroid/content/Context;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 9

    .line 128
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGenderPickerDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    new-instance v4, Lo/acu;

    invoke-direct {v4}, Lo/acu;-><init>()V

    .line 130
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/LayoutInflater;

    .line 131
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_gender_view:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 132
    invoke-static {v6, p1, v4}, Lo/fdr;->e(Landroid/view/View;ZLo/acu;)V

    .line 134
    new-instance v8, Lo/egw$c;

    invoke-direct {v8, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 135
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_gender:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 136
    invoke-virtual {v0, v6}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lo/fdr$3;

    invoke-direct {v2, v4, p2}, Lo/fdr$3;-><init>(Lo/acu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 137
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    .line 147
    invoke-static {}, Lo/fdr;->a()Landroid/view/View$OnClickListener;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 148
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 149
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 151
    return-void
.end method

.method private static e(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 235
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 236
    const/16 v5, 0x32

    :goto_0
    const/16 v0, 0xfb

    if-ge v5, v0, :cond_0

    .line 237
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 238
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 240
    :cond_0
    return-object v4
.end method

.method private static e(Landroid/view/View;ZLo/acu;)V
    .locals 5

    .line 154
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_view_layout1:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 155
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_view_layout2:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 156
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_imgview1:I

    invoke-static {p0, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 157
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_imgview2:I

    invoke-static {p0, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 158
    invoke-static {p1, v3, v4}, Lo/fdr;->b(ZLandroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 159
    new-instance v0, Lo/fdr$2;

    invoke-direct {v0, p2, v3, v4}, Lo/fdr$2;-><init>(Lo/acu;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    new-instance v0, Lo/fdr$5;

    invoke-direct {v0, p2, v3, v4}, Lo/fdr$5;-><init>(Lo/acu;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    return-void
.end method
