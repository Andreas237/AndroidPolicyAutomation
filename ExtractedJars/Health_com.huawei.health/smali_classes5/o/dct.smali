.class public Lo/dct;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 6

    .line 432
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalSteps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    const-string v0, "goal_steps_perference"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 435
    const/4 v5, 0x0

    .line 436
    if-eqz v4, :cond_0

    .line 437
    const-string v0, "goal_steps"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 439
    :cond_0
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getStepsTarget= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    return v5
.end method

.method static synthetic a(Lo/dcx;Lo/ddb;)V
    .locals 0

    .line 28
    invoke-static {p0, p1}, Lo/dct;->e(Lo/dcx;Lo/ddb;)V

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 150
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 152
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 154
    invoke-interface {v4}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v6

    .line 155
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 156
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 157
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 158
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-class v2, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    .line 159
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 160
    invoke-virtual {v9}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 161
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 164
    :cond_0
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "need to encrypt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v1

    invoke-virtual {v9}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v2

    invoke-virtual {v9}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lo/dec;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    :cond_1
    :goto_1
    goto/16 :goto_0

    .line 169
    :cond_2
    return-object v5

    .line 170
    :catch_0
    move-exception v4

    .line 171
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllSharedPreferencesById exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 122
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 123
    const-string v0, ""

    invoke-interface {v4, p2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 124
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 126
    const-string v0, ""

    return-object v0

    .line 128
    :cond_0
    :try_start_1
    invoke-virtual {v6}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 130
    invoke-virtual {v6}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getValue()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    .line 133
    :cond_1
    :try_start_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v1

    invoke-virtual {v6}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dec;->a(ILjava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    return-object v0

    .line 136
    :catch_0
    move-exception v4

    .line 137
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSharedPreference exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 101
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 102
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 103
    invoke-interface {v2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v3

    .line 104
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 105
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 107
    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 109
    goto :goto_0

    .line 110
    :cond_0
    return-object v1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V
    .locals 2

    .line 316
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dct$4;

    invoke-direct {v1, p0, p1, p2}, Lo/dct$4;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 340
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)I
    .locals 3

    .line 200
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 201
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 202
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 203
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    const/4 v0, 0x0

    return v0

    .line 206
    :cond_0
    const v0, 0x31128

    return v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .line 184
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 185
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 186
    invoke-interface {v2, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 187
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    const/4 v0, 0x0

    return v0

    .line 190
    :cond_0
    const v0, 0x31128

    return v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    .locals 8

    .line 45
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 47
    const-string v0, ""

    invoke-interface {v4, p2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 50
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    new-instance v6, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    invoke-direct {v6}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;-><init>()V

    .line 52
    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    iget v0, p4, Lo/dcy;->c:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 53
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    iget v1, p4, Lo/dcy;->c:I

    invoke-virtual {v0, v1, p3}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setValue(Ljava/lang/String;)V

    .line 54
    iget v0, p4, Lo/dcy;->c:I

    invoke-virtual {v6, v0}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setEncryptType(I)V

    goto/16 :goto_0

    .line 57
    :cond_0
    invoke-virtual {v6, p3}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setValue(Ljava/lang/String;)V

    .line 58
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setEncryptType(I)V

    goto :goto_0

    .line 61
    :cond_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 63
    const v0, 0x31128

    return v0

    .line 66
    :cond_2
    const/4 v0, 0x0

    if-ne v0, p4, :cond_3

    :try_start_1
    invoke-virtual {v6}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 67
    const v0, 0x30d44

    return v0

    .line 69
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p4, :cond_4

    :try_start_2
    invoke-virtual {v6}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v0

    iget v1, p4, Lo/dcy;->c:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-eq v0, v1, :cond_4

    .line 70
    const v0, 0x30d44

    return v0

    .line 72
    :cond_4
    :try_start_3
    invoke-virtual {v6}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 73
    invoke-virtual {v6, p3}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setValue(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :cond_5
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v1

    invoke-virtual {v0, v1, p3}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setValue(Ljava/lang/String;)V

    .line 76
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "need to encrypt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    :goto_0
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    .line 82
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, p2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 83
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-result v0

    if-eqz v0, :cond_6

    .line 84
    const/4 v0, 0x0

    return v0

    .line 86
    :cond_6
    const v0, 0x31128

    return v0

    .line 87
    :catch_0
    move-exception v4

    .line 88
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSharedPreference exception1."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    const v0, 0x31128

    return v0
.end method

.method public static e(Landroid/content/Context;I)V
    .locals 6

    .line 419
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goalSteps="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    const-string v0, "goal_steps_perference"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 421
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    .line 422
    if-eqz v5, :cond_0

    .line 423
    const-string v0, "goal_steps"

    invoke-interface {v5, v0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 424
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 426
    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V
    .locals 7

    .line 220
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dct$1;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lo/dct$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Ljava/lang/String;Lo/dcx;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 281
    return-void
.end method

.method private static e(Lo/dcx;Lo/ddb;)V
    .locals 1

    .line 410
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 411
    invoke-interface {p0, p1}, Lo/dcx;->onProcessed(Lo/ddb;)V

    .line 413
    :cond_0
    return-void
.end method
