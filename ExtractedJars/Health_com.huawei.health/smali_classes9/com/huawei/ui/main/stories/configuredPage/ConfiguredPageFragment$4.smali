.class Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 4

    .line 304
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConfigureActivityList fail:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 310
    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v4

    .line 312
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConfigureActivityList success:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 316
    const-string v0, "resultCode"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 317
    if-eqz v6, :cond_5

    .line 318
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpPost result:resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    const-string v0, "0"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    const-string v1, "pageActivityList"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v1, v0, :cond_1

    .line 323
    :cond_0
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no pageActivityList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 324
    return-void

    .line 328
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    const-string v1, "currentTime"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 329
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "activityCurrentTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->m(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mPageType: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    new-instance v7, Lo/dcy;

    invoke-direct {v7}, Lo/dcy;-><init>()V

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OPERATION_ACTIVITY_CURRENT_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->m(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->n(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 336
    const/4 v8, 0x0

    .line 337
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 338
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->p(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lo/eur;

    invoke-static {v8}, Lo/eur;->b(Lorg/json/JSONObject;)Lo/eup;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Lo/eup;)Lo/eup;

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lo/eup;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->n(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lo/eup;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 337
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 345
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OPERATION_CONFIGURE_ACTIVITIES_SAVE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 350
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->n(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Ljava/util/List;)Ljava/util/List;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 358
    :cond_5
    goto :goto_1

    .line 355
    :catch_0
    move-exception v5

    .line 357
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! JSONException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;->b:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->t(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 361
    return-void
.end method
