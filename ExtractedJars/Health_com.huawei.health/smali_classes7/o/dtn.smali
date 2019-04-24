.class public Lo/dtn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 89
    const-string v2, ""

    .line 90
    invoke-static {p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v3

    .line 91
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 92
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "getLoginInfo"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 93
    invoke-interface {v3, v4}, Lo/dti;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 94
    const-string v0, "huid"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 96
    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    const-string v0, "SharedPreferenceUtil"

    const-string v1, "getSharedPreference huid null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const-string v0, ""

    return-object v0

    .line 100
    :cond_1
    invoke-static {p0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v4

    .line 101
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/duk;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 104
    :cond_2
    const-string v0, "SharedPreferenceUtil"

    const-string v1, "mAchieveDBManager is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v0, ""

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 147
    invoke-static {p0, p1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 148
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    return-object p2

    .line 151
    :cond_0
    return-object v1
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 132
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 133
    :cond_0
    return-void

    .line 135
    :cond_1
    invoke-static {p0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/duk;->deleteSharedPreference(Ljava/lang/String;)I

    .line 136
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 73
    const-string v3, ""

    .line 74
    invoke-static {p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v4

    .line 75
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 76
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "getLoginInfo"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 77
    invoke-interface {v4, v5}, Lo/dti;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    .line 78
    const-string v0, "huid"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 80
    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    const-string v0, "SharedPreferenceUtil"

    const-string v1, "setSharedPreference huid null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    return-void

    .line 85
    :cond_1
    invoke-static {p0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/duk;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 86
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 119
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 120
    :cond_0
    return-void

    .line 122
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    .line 123
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 124
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 125
    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    .line 126
    invoke-static {p0, v3, v4}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    :cond_2
    goto :goto_0

    .line 129
    :cond_3
    return-void
.end method
