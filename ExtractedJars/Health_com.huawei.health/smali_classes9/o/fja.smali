.class public Lo/fja;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 2

    .line 208
    const/4 v1, 0x0

    .line 209
    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    const/16 v0, 0x1d

    if-gt p0, v0, :cond_0

    .line 210
    const/4 v1, 0x1

    goto :goto_0

    .line 211
    :cond_0
    const/16 v0, 0x1d

    if-le p0, v0, :cond_1

    const/16 v0, 0x3c

    if-ge p0, v0, :cond_1

    .line 212
    const/4 v1, 0x2

    goto :goto_0

    .line 213
    :cond_1
    const/16 v0, 0x3c

    if-lt p0, v0, :cond_2

    const/16 v0, 0x50

    if-ge p0, v0, :cond_2

    .line 214
    const/4 v1, 0x3

    goto :goto_0

    .line 216
    :cond_2
    const/4 v1, 0x4

    .line 218
    :goto_0
    return v1
.end method

.method public static a(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fix;>;)Z"
        }
    .end annotation

    .line 250
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fix;

    .line 251
    invoke-virtual {v2}, Lo/fix;->d()I

    move-result v0

    if-lez v0, :cond_0

    .line 252
    const/4 v0, 0x1

    return v0

    .line 254
    :cond_0
    goto :goto_0

    .line 255
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static d(I)Ljava/lang/String;
    .locals 2

    .line 223
    const/4 v1, 0x0

    .line 224
    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    const/16 v0, 0x1d

    if-gt p0, v0, :cond_0

    .line 225
    const/4 v1, 0x1

    goto :goto_0

    .line 226
    :cond_0
    const/16 v0, 0x1d

    if-le p0, v0, :cond_1

    const/16 v0, 0x3c

    if-ge p0, v0, :cond_1

    .line 227
    const/4 v1, 0x2

    goto :goto_0

    .line 228
    :cond_1
    const/16 v0, 0x3c

    if-lt p0, v0, :cond_2

    const/16 v0, 0x50

    if-ge p0, v0, :cond_2

    .line 229
    const/4 v1, 0x3

    goto :goto_0

    .line 231
    :cond_2
    const/4 v1, 0x4

    .line 233
    :goto_0
    invoke-static {v1}, Lo/fja;->e(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e(I)Ljava/lang/String;
    .locals 4

    .line 239
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 240
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_relaxed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_item_3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_highly:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
