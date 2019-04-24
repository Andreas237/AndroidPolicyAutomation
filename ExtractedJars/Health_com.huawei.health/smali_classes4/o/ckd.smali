.class public Lo/ckd;
.super Lo/ckc;


# static fields
.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lo/ckd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/ckd;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo/ckc;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/SharedPreferences;Landroid/content/Context;)[Lo/ckd;
    .locals 8

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lo/ckd;

    return-object v0

    :cond_0
    const-string v0, "events"

    const-string v1, ""

    invoke-static {p0, v0, v1}, Lo/cjs;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    :try_start_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v0, Lo/ckd;->c:Ljava/lang/String;

    const-string v1, "JSONException happened when events turn to JSONArray"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    const/4 v0, 0x0

    new-array v0, v0, [Lo/ckd;

    return-object v0

    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_8

    const/4 v6, 0x0

    :try_start_1
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    if-eqz v6, :cond_7

    new-instance v7, Lo/ckd;

    invoke-direct {v7}, Lo/ckd;-><init>()V

    const-string v0, "event"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    const-string v0, ""

    goto :goto_2

    :cond_3
    const-string v0, "event"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, v7, Lo/ckd;->b:Ljava/lang/String;

    const-string v0, "content"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    const-string v0, ""

    goto :goto_3

    :cond_4
    const-string v0, "content"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/cka;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    iput-object v0, v7, Lo/ckd;->e:Ljava/lang/String;

    const-string v0, "eventtime"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    const-string v0, ""

    goto :goto_4

    :cond_5
    const-string v0, "eventtime"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    iput-object v0, v7, Lo/ckd;->d:Ljava/lang/String;

    const-string v0, "type"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    const-string v0, ""

    goto :goto_5

    :cond_6
    const-string v0, "type"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    iput-object v0, v7, Lo/ckd;->a:Ljava/lang/String;

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_7
    goto :goto_6

    :catch_1
    move-exception v7

    sget-object v0, Lo/ckd;->c:Ljava/lang/String;

    const-string v1, "JSONException happened when create data for report"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_8
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    new-array v5, v0, [Lo/ckd;

    invoke-interface {v4, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ckd;

    return-object v0
.end method


# virtual methods
.method public c(Landroid/content/SharedPreferences;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    const-string v0, "events"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lo/cjs;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    :goto_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "event"

    iget-object v1, p0, Lo/ckd;->b:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "content"

    iget-object v1, p0, Lo/ckd;->e:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "eventtime"

    iget-object v1, p0, Lo/ckd;->d:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "type"

    iget-object v1, p0, Lo/ckd;->a:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v0, "events"

    invoke-interface {v5, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v0, "events"

    invoke-interface {v5, v0, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    sget-object v0, Lo/ckd;->c:Ljava/lang/String;

    const-string v1, "saveInSp(): JSONException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method
