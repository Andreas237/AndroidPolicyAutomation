.class public Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/io/Serializable;Ljava/util/Comparator<Ljava/lang/Object;>;"
    }
.end annotation


# static fields
.field private static final a:J = 0x1ded1cbb2029f4e1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 12

    .line 2242
    move-object v4, p1

    check-cast v4, Lcom/huawei/feedback/bean/f;

    .line 2244
    move-object v5, p2

    check-cast v5, Lcom/huawei/feedback/bean/f;

    .line 2246
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 2247
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-nez v0, :cond_2

    .line 2248
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 2250
    invoke-virtual {v5}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-eqz v0, :cond_2

    .line 2251
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 2252
    :cond_2
    invoke-static {v4, v5}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->a(Lcom/huawei/feedback/bean/f;Lcom/huawei/feedback/bean/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2253
    const/4 v0, -0x1

    return v0

    .line 2254
    :cond_3
    invoke-static {v4, v5}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Lcom/huawei/feedback/bean/f;Lcom/huawei/feedback/bean/f;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2255
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->p()Ljava/lang/String;

    move-result-object v6

    .line 2256
    invoke-virtual {v5}, Lcom/huawei/feedback/bean/f;->p()Ljava/lang/String;

    move-result-object v7

    .line 2257
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/M/d HH:mm"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v8, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2261
    :try_start_0
    invoke-virtual {v8, v6}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v9

    .line 2262
    invoke-virtual {v8, v7}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    .line 2264
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 2265
    const/4 v0, -0x1

    return v0

    .line 2266
    :cond_4
    :try_start_1
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_5

    .line 2267
    const/4 v0, 0x1

    return v0

    .line 2268
    :cond_5
    :try_start_2
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    .line 2269
    const/4 v0, 0x0

    return v0

    .line 2274
    :cond_6
    goto :goto_0

    .line 2271
    :catch_0
    move-exception v11

    .line 2273
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "ParseException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2276
    :goto_0
    goto :goto_1

    .line 2277
    :cond_7
    const/4 v0, 0x0

    return v0

    .line 2280
    :goto_1
    const/4 v0, 0x0

    return v0
.end method
