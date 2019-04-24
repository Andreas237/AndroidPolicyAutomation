.class public Lo/fhv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile b:Lo/fhv;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILandroid/content/Context;[J)Ljava/lang/String;
    .locals 6

    .line 198
    const-string v4, ""

    .line 199
    if-eqz p2, :cond_2

    array-length v0, p2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 200
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x240c8400

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/dmn;->c(J)[J

    move-result-object v5

    .line 202
    const/4 v0, 0x0

    aget-wide v0, p2, v0

    const/4 v2, 0x0

    aget-wide v2, v5, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 203
    invoke-static {p2}, Lo/dmn;->c([J)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 205
    :cond_0
    if-nez p0, :cond_1

    .line 206
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_suggest_last_week:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 208
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_suggest_last_week:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 212
    :cond_2
    :goto_0
    return-object v4
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 290
    const/4 v3, 0x1

    .line 292
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bodyfat_device:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    const/4 v3, 0x1

    goto :goto_0

    .line 294
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_service_suggest_title:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 295
    const/4 v3, 0x2

    goto :goto_0

    .line 296
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodp_suggest_title:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 297
    const/4 v3, 0x3

    goto :goto_0

    .line 298
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodp_service_suggest_title:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 299
    const/4 v3, 0x4

    goto :goto_0

    .line 300
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bloodsugar_device:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 301
    const/4 v3, 0x5

    goto :goto_0

    .line 302
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodsg_service_suggest_title:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 303
    const/4 v3, 0x6

    .line 305
    :cond_5
    :goto_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 306
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    const-string v0, "type"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    const-string v0, "module"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->bL:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 310
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 224
    new-instance v3, Lo/fib$c;

    invoke-direct {v3, p0}, Lo/fib$c;-><init>(Landroid/content/Context;)V

    .line 225
    const-string v0, "commodityList"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 226
    const-string v0, "commodityTime"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 227
    invoke-virtual {v3, p2}, Lo/fib$c;->a(Ljava/lang/String;)Lo/fib$c;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/fib$c;->b(Ljava/lang/String;)Lo/fib$c;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/fib$c;->b(Ljava/util/List;)Lo/fib$c;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lo/fib$c;->d(J)Lo/fib$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_setting_go_see:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhv$8;

    invoke-direct {v2, p0, v4}, Lo/fhv$8;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v0, v1, v2}, Lo/fib$c;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/fib$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    .line 236
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhv$9;

    invoke-direct {v2, p0, p2}, Lo/fhv$9;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/fib$c;->d(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/fib$c;

    .line 242
    invoke-virtual {v3}, Lo/fib$c;->d()Lo/fib;

    move-result-object v7

    .line 243
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/fib;->setCanceledOnTouchOutside(Z)V

    .line 244
    new-instance v0, Lo/fhv$7;

    invoke-direct {v0, p0, p2}, Lo/fhv$7;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lo/fib;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 253
    const-string v0, "1"

    invoke-static {p0, v0, p2}, Lo/fhv;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    invoke-virtual {v7}, Lo/fib;->show()V

    .line 255
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 6

    .line 106
    const-string v0, "WeightInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGoalSetsDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    new-instance v5, Lo/egv$b;

    invoke-direct {v5, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 110
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_wechat_rank_show_common_title:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_setting_goal_tips:I

    .line 111
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_setting_new_goal:I

    .line 112
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhv$2;

    invoke-direct {v2, p0}, Lo/fhv$2;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    .line 124
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhv$4;

    invoke-direct {v2}, Lo/fhv$4;-><init>()V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 130
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 131
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 132
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 318
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 319
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    const-string v0, "type"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->bC:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 322
    return-void
.end method

.method public static b(Landroid/content/Context;Z)V
    .locals 5

    .line 170
    if-eqz p1, :cond_0

    .line 171
    return-void

    .line 174
    :cond_0
    new-instance v4, Lo/egy$b;

    invoke-direct {v4, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 175
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_smartcard_auto_update_weight_content:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    .line 176
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhv$3;

    invoke-direct {v2}, Lo/fhv$3;-><init>()V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 182
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 183
    new-instance v0, Lo/fhv$10;

    invoke-direct {v0, p0}, Lo/fhv$10;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v0}, Lo/egy;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 190
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 191
    return-void
.end method

.method public static d()Lo/fhv;
    .locals 3

    .line 66
    sget-object v0, Lo/fhv;->b:Lo/fhv;

    if-nez v0, :cond_1

    .line 67
    const-class v1, Lo/fhv;

    monitor-enter v1

    .line 68
    :try_start_0
    sget-object v0, Lo/fhv;->b:Lo/fhv;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Lo/fhv;

    invoke-direct {v0}, Lo/fhv;-><init>()V

    sput-object v0, Lo/fhv;->b:Lo/fhv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 73
    :cond_1
    :goto_0
    sget-object v0, Lo/fhv;->b:Lo/fhv;

    return-object v0
.end method

.method public static d(Landroid/content/Context;)V
    .locals 5

    .line 85
    new-instance v4, Lo/egv$b;

    invoke-direct {v4, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 86
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_me_settings_weight_goal_suggest:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_me_settings_weight_goal_titel:I

    .line 87
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    .line 88
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhv$1;

    invoke-direct {v2}, Lo/fhv$1;-><init>()V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 94
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 95
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 96
    return-void
.end method

.method public static d(Landroid/content/Context;Landroid/os/Message;)V
    .locals 8

    .line 263
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 264
    :cond_0
    const-string v0, "WeightInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showRecommendDialog null == mContext || null ==msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    return-void

    .line 267
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 269
    :sswitch_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bloodsugar_device:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 270
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodsg_suggest_content:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 271
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {p0, v0, v4, v5}, Lo/fhv;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    goto :goto_0

    .line 274
    :sswitch_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodsg_service_suggest_title:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 275
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_bloodsg_service_suggest_content:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 276
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {p0, v0, v6, v7}, Lo/fhv;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 281
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x6e -> :sswitch_0
        0x6f -> :sswitch_1
    .end sparse-switch
.end method

.method public static e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 139
    const-string v0, "WeightInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWeightUserInfoDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const-string v4, "0"

    .line 141
    const/16 v0, 0x2716

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "health_weight_upto_user_info_dialog"

    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 143
    const-string v0, "WeightInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWeightUserInfoDialog sp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    .line 147
    new-instance v0, Lo/fhv$5;

    invoke-direct {v0, p0, p1}, Lo/fhv$5;-><init>(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 164
    goto :goto_0

    .line 165
    :cond_0
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 167
    :goto_0
    return-void
.end method
