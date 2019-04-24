.class public Lo/ete;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Ljava/lang/String;)J
    .locals 8

    .line 43
    const-wide/16 v4, 0x0

    .line 45
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 46
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 48
    :try_start_0
    invoke-virtual {v6, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    .line 49
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 52
    goto :goto_0

    .line 50
    :catch_0
    move-exception v7

    .line 51
    const-string v0, "PreviewActivityComparator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u683c\u5f0f\u65e5\u671f\u51fa\u9519:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    :goto_0
    return-wide v4
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    .line 26
    instance-of v0, p1, Lo/fil;

    if-eqz v0, :cond_1

    instance-of v0, p2, Lo/fil;

    if-eqz v0, :cond_1

    .line 27
    move-object v1, p1

    check-cast v1, Lo/fil;

    .line 28
    move-object v2, p2

    check-cast v2, Lo/fil;

    .line 29
    invoke-virtual {v1}, Lo/fil;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Lo/fil;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {v1}, Lo/fil;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ete;->b(Ljava/lang/String;)J

    move-result-wide v3

    .line 31
    invoke-virtual {v2}, Lo/fil;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ete;->b(Ljava/lang/String;)J

    move-result-wide v5

    .line 32
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    return v0

    .line 34
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 37
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
