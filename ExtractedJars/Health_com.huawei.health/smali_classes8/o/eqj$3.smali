.class Lo/eqj$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eqj;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eqj;


# direct methods
.method constructor <init>(Lo/eqj;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lo/eqj$3;->b:Lo/eqj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 150
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResult called: rest "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    :cond_0
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleep data is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    return-void

    .line 157
    :cond_1
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResult called: datas size() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 160
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 161
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    return-void

    .line 167
    :cond_2
    const-wide/16 v6, 0x0

    .line 168
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqj$3;->b:Lo/eqj;

    iget-object v0, v0, Lo/eqj;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_hours:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 169
    const-string v9, ""

    .line 170
    const-string v0, "core_sleep_shallow_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 171
    const-string v0, "core_sleep_deep_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 172
    const-string v0, "core_sleep_wake_dream_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 173
    const-string v0, "sleep_core_sleep_noon_duration_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 174
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shallowSum == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", deepSum == "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", dreamSum == "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ", noonDurationSum == "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 175
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ", data.getStartTime() = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 174
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    const-string v14, ""

    .line 177
    if-gtz v10, :cond_3

    if-gtz v11, :cond_3

    if-gtz v12, :cond_3

    if-lez v13, :cond_5

    .line 178
    :cond_3
    add-int v0, v10, v11

    add-int/2addr v0, v12

    add-int v15, v0, v13

    .line 179
    const/16 v0, 0x3c

    if-ge v15, v0, :cond_4

    .line 181
    int-to-double v6, v15

    .line 182
    const-wide v0, 0x3ee4f8b580000000L    # 9.999999747378752E-6

    add-double/2addr v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqj$3;->b:Lo/eqj;

    iget-object v0, v0, Lo/eqj;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 186
    :cond_4
    int-to-double v0, v15

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double v6, v0, v2

    .line 187
    const-wide v0, 0x3ee4f8b580000000L    # 9.999999747378752E-6

    add-double/2addr v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 188
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqj$3;->b:Lo/eqj;

    iget-object v0, v0, Lo/eqj;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_hours:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 190
    :goto_0
    const-string v14, "has_core_sleep"

    .line 191
    goto :goto_1

    .line 192
    :cond_5
    const-string v14, "has_common_sleep"

    .line 193
    const-string v0, "sleep_deep_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 194
    const-string v0, "sleep_shallow_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v16

    .line 195
    add-int v0, v15, v16

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double v17, v0, v2

    .line 196
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpg-double v0, v17, v0

    if-gez v0, :cond_6

    .line 197
    move-wide/from16 v6, v17

    .line 198
    const-wide v0, 0x3ee4f8b580000000L    # 9.999999747378752E-6

    add-double/2addr v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 199
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqj$3;->b:Lo/eqj;

    iget-object v0, v0, Lo/eqj;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    .line 201
    :cond_6
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    div-double v6, v17, v0

    .line 202
    const-wide v0, 0x3ee4f8b580000000L    # 9.999999747378752E-6

    add-double/2addr v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqj$3;->b:Lo/eqj;

    iget-object v0, v0, Lo/eqj;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_hours:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 206
    :goto_1
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object v15, v0

    .line 207
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "M/d"

    invoke-static {v1, v2}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 208
    move-object/from16 v0, v16

    invoke-virtual {v0, v15}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v17

    .line 209
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v18

    .line 210
    const-wide v0, 0x3ee4f8b580000000L    # 9.999999747378752E-6

    add-double v19, v6, v0

    .line 211
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 212
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "!(time.equals(currentTime)),time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqj$3;->b:Lo/eqj;

    iget-object v1, v1, Lo/eqj;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->a:Lo/eqa;

    .line 215
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 216
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqj$3;->b:Lo/eqj;

    iget-object v1, v1, Lo/eqj;->c:Landroid/content/Context;

    .line 217
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_no_device_click:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 218
    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqj$3;->b:Lo/eqj;

    iget-object v1, v1, Lo/eqj;->c:Landroid/content/Context;

    .line 219
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 220
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v5

    .line 221
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show click to see more!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 223
    :cond_7
    const-wide/16 v0, 0x0

    cmpl-double v0, v19, v0

    if-nez v0, :cond_8

    .line 224
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataValue == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqj$3;->b:Lo/eqj;

    iget-object v1, v1, Lo/eqj;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->a:Lo/eqa;

    .line 227
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 228
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqj$3;->b:Lo/eqj;

    iget-object v1, v1, Lo/eqj;->c:Landroid/content/Context;

    .line 229
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_no_device_click:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 230
    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqj$3;->b:Lo/eqj;

    iget-object v1, v1, Lo/eqj;->c:Landroid/content/Context;

    .line 231
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 232
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v5

    .line 233
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show empty view!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 235
    :cond_8
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqj$3;->b:Lo/eqj;

    iget-object v1, v1, Lo/eqj;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    .line 236
    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/epx$d;->a(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 237
    invoke-virtual {v0, v9}, Lo/epx$d;->b(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 238
    invoke-virtual {v0, v8}, Lo/epx$d;->e(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/eqa;->a:Lo/eqa;

    .line 239
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->a:Lo/epx$c;

    .line 240
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    .line 241
    invoke-virtual {v0, v14}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqj$3;->b:Lo/eqj;

    iget-object v1, v1, Lo/eqj;->c:Landroid/content/Context;

    .line 242
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 243
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v5

    .line 244
    invoke-static {}, Lo/eqj;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show data view: data"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqj$3;->b:Lo/eqj;

    invoke-static {v0}, Lo/eqj;->a(Lo/eqj;)Lo/eqj$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/eqj$d;->obtainMessage()Landroid/os/Message;

    move-result-object v21

    .line 249
    const/4 v0, 0x1

    move-object/from16 v1, v21

    iput v0, v1, Landroid/os/Message;->what:I

    .line 250
    move-object/from16 v0, v21

    iput-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 251
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqj$3;->b:Lo/eqj;

    invoke-static {v0}, Lo/eqj;->a(Lo/eqj;)Lo/eqj$d;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/eqj$d;->sendMessage(Landroid/os/Message;)Z

    .line 252
    return-void
.end method
