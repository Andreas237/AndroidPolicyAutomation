.class Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/https/HttpResCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(ILjava/lang/String;)V
    .locals 9

    .line 190
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConfigureModulesFromCloud  resCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_6

    .line 194
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 195
    const-string v0, "resultCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 196
    if-eqz v5, :cond_5

    .line 197
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpPost result:resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    const-string v0, "0"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    const-string v1, "pageModuleList"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v1, v0, :cond_1

    .line 202
    :cond_0
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no pageModuleList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    return-void

    .line 206
    :cond_1
    :try_start_1
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 209
    const/4 v7, 0x0

    .line 210
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v7}, Lo/eur;->a(Lorg/json/JSONObject;)Lo/euo;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Lo/euo;)Lo/euo;

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lo/euo;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lo/euo;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 218
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OPERATION_CONFIGURE_MODULES_SAVE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 223
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;->a:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->i(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 230
    :cond_5
    goto :goto_1

    .line 228
    :catch_0
    move-exception v4

    .line 229
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! JSONException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    goto :goto_1

    .line 232
    :cond_6
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resCode Error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    :goto_1
    return-void
.end method
