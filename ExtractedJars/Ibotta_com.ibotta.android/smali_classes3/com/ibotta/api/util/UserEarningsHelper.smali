.class public Lcom/ibotta/api/util/UserEarningsHelper;
.super Ljava/lang/Object;
.source "UserEarningsHelper.java"


# static fields
.field private static final EARNINGS_DATE_FORMAT:Ljava/lang/String; = "yyyy-MM"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addMissingEarnings(Ljava/util/Map;Ljava/util/Date;Ljava/util/Date;)Ljava/util/Map;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 28
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    if-eqz v0, :cond_5

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    if-nez p2, :cond_1

    .line 33
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual/range {p2 .. p2}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-lez v7, :cond_2

    return-object v2

    :cond_2
    move-object/from16 v3, p2

    .line 38
    :goto_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v5, "yyyy-MM"

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 40
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 41
    invoke-virtual {v5, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v1, 0x1

    .line 42
    invoke-virtual {v5, v1}, Ljava/util/Calendar;->get(I)I

    move-result v8

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Ljava/util/Calendar;->get(I)I

    move-result v9

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v7, v5

    invoke-virtual/range {v7 .. v13}, Ljava/util/Calendar;->set(IIIIII)V

    .line 44
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 45
    invoke-virtual {v7, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 46
    invoke-virtual {v7, v1}, Ljava/util/Calendar;->get(I)I

    move-result v15

    invoke-virtual {v7, v6}, Ljava/util/Calendar;->get(I)I

    move-result v16

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v14, v7

    invoke-virtual/range {v14 .. v20}, Ljava/util/Calendar;->set(IIIIII)V

    .line 48
    :goto_1
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    cmp-long v3, v8, v10

    if-gtz v3, :cond_4

    .line 49
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 50
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Float;

    if-nez v8, :cond_3

    const/4 v8, 0x0

    .line 52
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    .line 54
    :cond_3
    invoke-interface {v2, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    invoke-virtual {v5, v6, v1}, Ljava/util/Calendar;->add(II)V

    goto :goto_1

    :cond_4
    return-object v2

    :cond_5
    :goto_2
    return-object v2
.end method
