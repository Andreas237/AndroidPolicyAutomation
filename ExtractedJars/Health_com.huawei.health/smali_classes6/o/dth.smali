.class public Lo/dth;
.super Lo/eac;
.source "SourceFile"


# static fields
.field private static volatile d:Lo/dth;


# instance fields
.field private b:Landroid/content/Context;

.field private e:Lo/dti;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    .line 58
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/dth;
    .locals 4

    .line 46
    sget-object v0, Lo/dth;->d:Lo/dth;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 47
    const-class v2, Lo/dth;

    monitor-enter v2

    .line 48
    :try_start_0
    sget-object v0, Lo/dth;->d:Lo/dth;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 49
    new-instance v0, Lo/dth;

    invoke-direct {v0, p0}, Lo/dth;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dth;->d:Lo/dth;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 53
    :cond_1
    :goto_0
    sget-object v0, Lo/dth;->d:Lo/dth;

    return-object v0
.end method

.method public static d(I)Z
    .locals 2

    .line 416
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 417
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "Not Oversea"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    const/4 v0, 0x1

    return v0

    .line 420
    :cond_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    if-gt p0, v0, :cond_1

    if-ltz p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_2

    :cond_1
    const/4 v0, 0x7

    if-eq p0, v0, :cond_2

    const/16 v0, 0x8

    if-ne p0, v0, :cond_3

    .line 421
    :cond_2
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "isSupportRequest is AllowLogin!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    const/4 v0, 0x1

    return v0

    .line 424
    :cond_3
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "Not AllowLogin!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    const/4 v0, 0x0

    return v0
.end method

.method public static g()Z
    .locals 1

    .line 406
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    return v0
.end method

.method public static l()Z
    .locals 1

    .line 433
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private m()V
    .locals 2

    .line 83
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "release()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    invoke-static {}, Lo/dwr;->c()V

    .line 86
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 105
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v1

    .line 106
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 107
    invoke-virtual {v1}, Lo/dwr;->o()V

    .line 109
    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 3

    .line 270
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 271
    return-void

    .line 273
    :cond_0
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "showAchieveReport()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 275
    const-string v0, "com.huawei.pluginachievement.ui.AchieveReportActivity"

    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 276
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 277
    return-void
.end method

.method public a(Landroid/content/Context;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 339
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 340
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "getAnnualReportData context null!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    return-void

    .line 343
    :cond_0
    invoke-static {p1}, Lo/dxo;->d(Landroid/content/Context;)Lo/dxo;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dxo;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 344
    return-void
.end method

.method public b()Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;
    .locals 2

    .line 97
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v1

    .line 98
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 99
    invoke-virtual {v1}, Lo/dwr;->d()Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

    move-result-object v0

    return-object v0

    .line 101
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lo/duj;Landroid/content/Context;)Lo/dwe;
    .locals 2

    .line 217
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "getPersonalData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 219
    :cond_0
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "getPersonalData() callback == null || context == null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    const/4 v0, 0x0

    return-object v0

    .line 222
    :cond_1
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_2

    .line 224
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateKakaMessage() is not supportAchieve!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    const/4 v0, 0x0

    return-object v0

    .line 227
    :cond_2
    invoke-static {p2}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dwr;->b(Lo/duj;Landroid/content/Context;)Lo/dwe;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)I"
        }
    .end annotation

    .line 444
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 446
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "setEvent is not supportAchieve!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    const/4 v0, -0x1

    return v0

    .line 450
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 451
    :cond_1
    const/4 v0, -0x1

    return v0

    .line 453
    :cond_2
    invoke-static {p1}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dwo;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 455
    const/4 v0, 0x0

    return v0
.end method

.method public c(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 253
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "getPersonalMedalData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 255
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "context == null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    const/4 v0, 0x0

    return-object v0

    .line 258
    :cond_0
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 260
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "getPersonalMedalData() is not supportAchieve!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const/4 v0, 0x0

    return-object v0

    .line 263
    :cond_1
    invoke-static {p1}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->f()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 3

    .line 115
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "popAchieveDialog()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 117
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "popAchieveDialog() Context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    return-void

    .line 120
    :cond_0
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 122
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "popAchieveDialog() is not supportAchieve!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    return-void

    .line 125
    :cond_1
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v2

    .line 126
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 127
    invoke-virtual {v2}, Lo/dwr;->m()V

    goto :goto_0

    .line 129
    :cond_2
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "mAchieveDataManager is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    :goto_0
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 389
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 390
    return-void

    .line 392
    :cond_0
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "showLotteryShareActivity()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 394
    const-string v0, "com.huawei.pluginachievement.ui.AchieveLotteryShareActivity"

    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 395
    const-string v0, "imgUrl"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 396
    const-string v0, "awardName"

    invoke-virtual {v2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 397
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 398
    return-void
.end method

.method public d()Lo/dti;
    .locals 1

    .line 76
    iget-object v0, p0, Lo/dth;->e:Lo/dti;

    return-object v0
.end method

.method public d(Landroid/content/Context;)Lo/dwe;
    .locals 2

    .line 231
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "getPersonalData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 233
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "getPersonalData() callback == null || context == null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    const/4 v0, 0x0

    return-object v0

    .line 236
    :cond_0
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 238
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "getPersonalDataFromSQL() is not supportAchieve!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    const/4 v0, 0x0

    return-object v0

    .line 241
    :cond_1
    invoke-static {p1}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dwr;->a(Landroid/content/Context;)Lo/dwe;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/content/Context;III)V
    .locals 3

    .line 368
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 369
    return-void

    .line 371
    :cond_0
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "showReportActivity()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 373
    const-string v0, "com.huawei.pluginachievement.ui.report.ReportActivity"

    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 374
    const-string v0, "max_report_no"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 375
    const-string v0, "min_report_no"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 376
    const-string v0, "report_stype"

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 377
    const/high16 v0, 0x10800000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 378
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 379
    return-void
.end method

.method public e()Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;
    .locals 2

    .line 89
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v1

    .line 90
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 91
    invoke-virtual {v1}, Lo/dwr;->b()Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;

    move-result-object v0

    return-object v0

    .line 93
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Landroid/content/Context;)V
    .locals 3

    .line 283
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 284
    return-void

    .line 286
    :cond_0
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "showAchieveKaKa()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 288
    const-string v0, "com.huawei.pluginachievement.ui.AchieveKaKaActivity"

    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 289
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 290
    return-void
.end method

.method public f(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 353
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 354
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "getAnnualInitalData context null!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    const-string v0, ""

    return-object v0

    .line 357
    :cond_0
    invoke-static {p1}, Lo/dxo;->d(Landroid/content/Context;)Lo/dxo;

    move-result-object v0

    invoke-virtual {v0}, Lo/dxo;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()V
    .locals 2

    .line 158
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateReportMessage()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 160
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateReportMessage() Context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    return-void

    .line 163
    :cond_0
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 165
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateReportMessage() is not supportAchieve!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    return-void

    .line 168
    :cond_1
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->q()V

    .line 169
    return-void
.end method

.method public finish()V
    .locals 2

    .line 62
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "finish()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    invoke-direct {p0}, Lo/dth;->m()V

    .line 64
    invoke-super {p0}, Lo/eac;->finish()V

    .line 65
    return-void
.end method

.method public g(Landroid/content/Context;)V
    .locals 3

    .line 322
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 323
    return-void

    .line 325
    :cond_0
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "showAchieveLevel()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 327
    const-string v0, "com.huawei.pluginachievement.ui.AchieveLevelMainActivity"

    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 329
    return-void
.end method

.method public synthetic getAdapter()Lo/eab;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 2

    .line 196
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateHistoryBestMessage()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 198
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateHistoryBestMessage() Context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    return-void

    .line 201
    :cond_0
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 203
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateHistoryBestMessage() is not supportAchieve!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    return-void

    .line 206
    :cond_1
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->y()V

    .line 207
    return-void
.end method

.method public h(Landroid/content/Context;)V
    .locals 3

    .line 296
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 297
    return-void

    .line 299
    :cond_0
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "showAchieveHistoryBest()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 301
    const-string v0, "com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity"

    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 302
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 303
    return-void
.end method

.method public i()V
    .locals 2

    .line 177
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateKakaMessage()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 179
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateKakaMessage() Context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    return-void

    .line 182
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "generateKakaMessage() is not supportAchieve!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    return-void

    .line 187
    :cond_1
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->x()V

    .line 188
    return-void
.end method

.method public k()V
    .locals 3

    .line 134
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "popAchieveDialog()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 136
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "popAchieveDialog() Context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    return-void

    .line 139
    :cond_0
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 141
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "popAchieveDialog() is not supportAchieve!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    return-void

    .line 144
    :cond_1
    iget-object v0, p0, Lo/dth;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v2

    .line 145
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 146
    invoke-virtual {v2}, Lo/dwr;->p()V

    goto :goto_0

    .line 148
    :cond_2
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "mAchieveDataManager is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :goto_0
    return-void
.end method

.method public k(Landroid/content/Context;)V
    .locals 3

    .line 309
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 310
    return-void

    .line 312
    :cond_0
    const-string v0, "PLGACHIEVE_PluginAchieve"

    const-string v1, "showAchieveMedal()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 314
    const-string v0, "com.huawei.pluginachievement.ui.AchieveMedalNewActivity"

    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 315
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 316
    return-void
.end method

.method public setAdapter(Lo/eab;)V
    .locals 1

    .line 69
    invoke-super {p0, p1}, Lo/eac;->setAdapter(Lo/eab;)V

    .line 70
    instance-of v0, p1, Lo/dti;

    if-eqz v0, :cond_0

    .line 71
    move-object v0, p1

    check-cast v0, Lo/dti;

    iput-object v0, p0, Lo/dth;->e:Lo/dti;

    .line 73
    :cond_0
    return-void
.end method
