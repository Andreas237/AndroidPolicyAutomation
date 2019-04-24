.class public Lo/cjo;
.super Ljava/lang/Object;


# direct methods
.method private static a(JLjava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;)Lorg/json/JSONObject;"
        }
    .end annotation

    if-nez p4, :cond_0

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    :cond_0
    invoke-static {p4}, Lo/cjn;->e(Ljava/util/LinkedHashMap;)Lorg/json/JSONObject;

    move-result-object v2

    :goto_0
    const-string v0, "OnPause"

    :try_start_0
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "_event_duration"

    invoke-virtual {v2, v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    :cond_1
    const-string v0, "_activity_name"

    invoke-virtual {v2, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "EventUtils"

    const-string v1, "getEventContent(): JSONException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-object v2
.end method

.method public static a(Ljava/lang/String;JLjava/util/LinkedHashMap;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;JLjava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;)Lorg/json/JSONObject;"
        }
    .end annotation

    invoke-static {p1, p2, p0, p4, p3}, Lo/cjo;->a(JLjava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lo/cit;Lo/civ;Landroid/content/Context;)V
    .locals 4

    invoke-virtual {p1}, Lo/civ;->c()Z

    move-result v0

    invoke-virtual {p0, v0}, Lo/cit;->c(Z)V

    invoke-virtual {p1}, Lo/civ;->d()Z

    move-result v0

    invoke-virtual {p0, v0}, Lo/cit;->d(Z)V

    invoke-virtual {p1}, Lo/civ;->a()Z

    move-result v0

    invoke-virtual {p0, v0}, Lo/cit;->e(Z)V

    invoke-virtual {p1}, Lo/civ;->e()Z

    move-result v0

    invoke-virtual {p0, v0}, Lo/cit;->b(Z)V

    invoke-virtual {p1}, Lo/civ;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-le v0, v1, :cond_1

    :cond_0
    const-string v0, "HiAnalytics"

    const-string v1, "channel Parameter error!"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0, v0}, Lo/cit;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Lo/cit;->p(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, Lo/civ;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    const-string v0, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}"

    invoke-static {v3, v0}, Lo/cjo;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const-string v0, "HiAnalytics"

    const-string v1, "appid Parameter error!"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Lo/cjx;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cit;->i(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v3}, Lo/cit;->i(Ljava/lang/String;)V

    :goto_1
    invoke-static {p0, p1}, Lo/cjp;->a(Lo/cit;Lo/civ;)V

    return-void
.end method

.method public static a(ILo/cit;)Z
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo/cit;->y()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lo/cjo;->b(ILo/cit;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "HiAnalytics"

    const-string v1, "collectUrl is null or url is empty"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method private static b(ILo/cit;)Z
    .locals 3

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_1
    const-string v1, "oper"

    goto :goto_1

    :pswitch_2
    const-string v1, "maint"

    goto :goto_1

    :goto_0
    const/4 v0, 0x0

    return v0

    :goto_1
    invoke-virtual {p1}, Lo/cit;->y()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :goto_2
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Landroid/content/Context;ILjava/lang/String;Ljava/util/LinkedHashMap;Lo/cit;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/lang/String;Ljava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;Lo/cit;)Z"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p4}, Lo/cjo;->a(ILo/cit;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "HiAnalytics"

    const-string v1, "onEvent context evnetid or value is null or empty"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    invoke-static {p3}, Lo/cjo;->c(Ljava/util/LinkedHashMap;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const-string v0, "HiAnalytics"

    const-string v1, "eventid or value Parameter error !"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/cit;)Z
    .locals 2

    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "HiAnalytics"

    const-string v1, "onEvent context evnetid or value is null or empty"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/high16 v1, 0x10000

    if-le v0, v1, :cond_3

    :cond_2
    const-string v0, "HiAnalytics"

    const-string v1, "eventid or value Parameter error !"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_3
    invoke-virtual {p3}, Lo/cit;->y()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p3}, Lo/cit;->y()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "oper"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const-string v0, "HiAnalytics"

    const-string v1, "collectUrl is null or url is empty"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Ljava/util/LinkedHashMap;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;)Z"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const-string v0, "constants"

    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "_constants"

    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    :cond_2
    const-string v0, "HiAnalytics"

    const-string v1, "the value of map is error"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_3
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    const/16 v1, 0x800

    if-gt v0, v1, :cond_4

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const v1, 0x32000

    if-le v0, v1, :cond_5

    :cond_4
    const-string v0, "HiAnalytics"

    const-string v1, "onevent map value too big!"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_5
    const/4 v0, 0x1

    return v0
.end method
