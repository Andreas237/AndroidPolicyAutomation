.class public Lo/cjp;
.super Ljava/lang/Object;


# direct methods
.method public static a(Lo/cit;Lo/civ;)V
    .locals 2

    invoke-virtual {p1}, Lo/civ;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lo/civ;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1000

    if-gt v0, v1, :cond_0

    invoke-virtual {p1}, Lo/civ;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cit;->g(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "HiAnalytics"

    const-string v1, "androidId Parameter error!"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0, v0}, Lo/cit;->g(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, Lo/civ;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo/civ;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1000

    if-gt v0, v1, :cond_1

    invoke-virtual {p1}, Lo/civ;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cit;->h(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v0, "HiAnalytics"

    const-string v1, "IMEI Parameter error!"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0, v0}, Lo/cit;->h(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p1}, Lo/civ;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lo/civ;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1000

    if-gt v0, v1, :cond_2

    invoke-virtual {p1}, Lo/civ;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cit;->k(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const-string v0, "HiAnalytics"

    const-string v1, "UDID Parameter error!"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0, v0}, Lo/cit;->k(Ljava/lang/String;)V

    :goto_2
    return-void
.end method
