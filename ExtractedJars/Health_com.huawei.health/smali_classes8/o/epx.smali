.class public Lo/epx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/epx$d;,
        Lo/epx$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Comparable<Lo/epx;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field public b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:Lo/eqa;

.field private k:I

.field private l:Lo/epx$c;


# direct methods
.method public constructor <init>(Lo/epx$d;)V
    .locals 1

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    invoke-static {p1}, Lo/epx$d;->c(Lo/epx$d;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epx;->a:Ljava/lang/String;

    .line 149
    invoke-static {p1}, Lo/epx$d;->d(Lo/epx$d;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epx;->f:Ljava/lang/String;

    .line 150
    invoke-static {p1}, Lo/epx$d;->b(Lo/epx$d;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epx;->e:Ljava/lang/String;

    .line 151
    invoke-static {p1}, Lo/epx$d;->a(Lo/epx$d;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epx;->c:Ljava/lang/String;

    .line 152
    invoke-static {p1}, Lo/epx$d;->e(Lo/epx$d;)I

    move-result v0

    iput v0, p0, Lo/epx;->k:I

    .line 153
    invoke-static {p1}, Lo/epx$d;->f(Lo/epx$d;)I

    move-result v0

    iput v0, p0, Lo/epx;->g:I

    .line 154
    invoke-static {p1}, Lo/epx$d;->k(Lo/epx$d;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epx;->d:Ljava/lang/String;

    .line 155
    invoke-static {p1}, Lo/epx$d;->g(Lo/epx$d;)I

    move-result v0

    iput v0, p0, Lo/epx;->h:I

    .line 156
    invoke-static {p1}, Lo/epx$d;->h(Lo/epx$d;)Lo/eqa;

    move-result-object v0

    iput-object v0, p0, Lo/epx;->i:Lo/eqa;

    .line 157
    invoke-static {p1}, Lo/epx$d;->i(Lo/epx$d;)Lo/epx$c;

    move-result-object v0

    iput-object v0, p0, Lo/epx;->l:Lo/epx$c;

    .line 158
    iget-object v0, p1, Lo/epx$d;->a:Landroid/content/Context;

    iput-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    .line 159
    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 3

    .line 349
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 350
    const/4 v0, 0x1

    return v0

    .line 351
    :catch_0
    move-exception v2

    .line 352
    const/4 v0, 0x0

    return v0

    .line 353
    :catch_1
    move-exception v2

    .line 354
    const/4 v0, 0x0

    return v0
.end method

.method private m()Z
    .locals 11

    .line 310
    const-wide/16 v4, 0x0

    .line 311
    invoke-static {}, Lo/ddn;->e()Ljava/lang/String;

    move-result-object v6

    .line 313
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v6}, Lo/epx;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 314
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 317
    :cond_0
    const-string v0, "FunctionSetBean"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportsCardRedDot: lastSyncTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "in_sport_history_activity_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 320
    const/4 v8, 0x0

    .line 322
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    const-string v0, ""

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "##"

    .line 323
    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 324
    const-string v0, "##"

    invoke-virtual {v7, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v8, v0, v1

    .line 327
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    const-string v0, ""

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v6}, Lo/epx;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 328
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 329
    const-string v0, "FunctionSetBean"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportsCardRedDot: intoActivityTimeLong = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    cmp-long v0, v4, v9

    if-lez v0, :cond_2

    .line 333
    const/4 v0, 0x1

    return v0

    .line 335
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 338
    :cond_3
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v4

    if-nez v0, :cond_4

    .line 340
    const/4 v0, 0x0

    return v0

    .line 344
    :cond_4
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Lo/epx;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lo/epx;->f:Ljava/lang/String;

    return-object v0
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 5

    .line 265
    const-string v0, "FunctionSetBean"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeCardIndex; key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " index = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 267
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 268
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 267
    invoke-static {p1, v0, p2, v1, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 269
    return-void
.end method

.method public b(Lo/epx$c;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lo/epx;->l:Lo/epx$c;

    .line 262
    return-void
.end method

.method public c(Lo/epx;)I
    .locals 2
    .param p1    # Lo/epx;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 55
    iget v0, p0, Lo/epx;->h:I

    invoke-virtual {p1}, Lo/epx;->k()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 56
    const/4 v0, 0x0

    return v0

    .line 59
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/epx;->e:Ljava/lang/String;

    return-object v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 20
    move-object v0, p1

    check-cast v0, Lo/epx;

    invoke-virtual {p0, v0}, Lo/epx;->c(Lo/epx;)I

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Lo/epx;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lo/epx;->f:Ljava/lang/String;

    .line 215
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lo/epx;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 2

    .line 222
    iput p1, p0, Lo/epx;->h:I

    .line 225
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->t:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 228
    :cond_0
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->q:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 231
    :cond_1
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_one_level_menu_settings_item_text_id14:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 232
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->y:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 234
    :cond_2
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 235
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->w:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 237
    :cond_3
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 238
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->s:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 240
    :cond_4
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 241
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->r:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 244
    :cond_5
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->z:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 246
    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 37
    if-nez p1, :cond_0

    .line 38
    const/4 v0, 0x0

    return v0

    .line 40
    :cond_0
    instance-of v0, p1, Lo/epx;

    if-nez v0, :cond_1

    .line 41
    const/4 v0, 0x0

    return v0

    .line 43
    :cond_1
    move-object v2, p1

    check-cast v2, Lo/epx;

    .line 45
    invoke-virtual {v2}, Lo/epx;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lo/epx;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 3

    .line 272
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->t:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/epx;->h:I

    goto/16 :goto_0

    .line 275
    :cond_0
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 276
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->q:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/epx;->h:I

    goto/16 :goto_0

    .line 278
    :cond_1
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_one_level_menu_settings_item_text_id14:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 279
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->y:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/epx;->h:I

    goto/16 :goto_0

    .line 281
    :cond_2
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 282
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->w:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/epx;->h:I

    goto/16 :goto_0

    .line 284
    :cond_3
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 285
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->s:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/epx;->h:I

    goto :goto_0

    .line 287
    :cond_4
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epx;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 288
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->r:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/epx;->h:I

    goto :goto_0

    .line 291
    :cond_5
    iget-object v0, p0, Lo/epx;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->z:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/epx;->h:I

    .line 293
    :goto_0
    return-void
.end method

.method public g()Lo/eqa;
    .locals 1

    .line 249
    iget-object v0, p0, Lo/epx;->i:Lo/eqa;

    return-object v0
.end method

.method public h()Lo/epx$c;
    .locals 1

    .line 257
    iget-object v0, p0, Lo/epx;->l:Lo/epx$c;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 50
    invoke-virtual {p0}, Lo/epx;->k()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 2

    .line 296
    sget-object v0, Lo/eqa;->e:Lo/eqa;

    invoke-virtual {p0}, Lo/epx;->g()Lo/eqa;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 297
    invoke-direct {p0}, Lo/epx;->m()Z

    move-result v0

    return v0

    .line 306
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k()I
    .locals 1

    .line 218
    iget v0, p0, Lo/epx;->h:I

    return v0
.end method
