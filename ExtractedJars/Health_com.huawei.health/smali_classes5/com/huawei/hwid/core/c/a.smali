.class public Lcom/huawei/hwid/core/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/huawei/hwid/core/c/a;


# instance fields
.field private a:Landroid/content/SharedPreferences;

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-string v0, "HwAccount"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/c/a;->a:Landroid/content/SharedPreferences;

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/c/a;->c:Landroid/content/Context;

    .line 39
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;
    .locals 3

    const-class v2, Lcom/huawei/hwid/core/c/a;

    monitor-enter v2

    .line 43
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/core/c/a;->b:Lcom/huawei/hwid/core/c/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 44
    new-instance v0, Lcom/huawei/hwid/core/c/a;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/core/c/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwid/core/c/a;->b:Lcom/huawei/hwid/core/c/a;

    .line 46
    :cond_0
    sget-object v0, Lcom/huawei/hwid/core/c/a;->b:Lcom/huawei/hwid/core/c/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;I)I
    .locals 2

    .line 62
    iget-object v0, p0, Lcom/huawei/hwid/core/c/a;->a:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/core/c/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 50
    iget-object v0, p0, Lcom/huawei/hwid/core/c/a;->a:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/core/c/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p2

    .line 51
    :goto_0
    const-string v0, "rkey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    return-object v2

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/core/c/a;->c:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 55
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 56
    move-object v2, v3

    .line 58
    :cond_2
    return-object v2
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/huawei/hwid/core/c/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 118
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 119
    invoke-interface {v1, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 121
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 5

    .line 98
    iget-object v0, p0, Lcom/huawei/hwid/core/c/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 99
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 100
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_0

    .line 101
    :cond_0
    instance-of v0, p2, Ljava/lang/Integer;

    if-nez v0, :cond_1

    instance-of v0, p2, Ljava/lang/Short;

    if-nez v0, :cond_1

    instance-of v0, p2, Ljava/lang/Byte;

    if-eqz v0, :cond_2

    .line 102
    :cond_1
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 103
    :cond_2
    instance-of v0, p2, Ljava/lang/Long;

    if-eqz v0, :cond_3

    .line 104
    move-object v0, p2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {v2, p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 105
    :cond_3
    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_4

    .line 106
    move-object v0, p2

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 107
    :cond_4
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_5

    .line 108
    move-object v0, p2

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 109
    double-to-float v0, v3

    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 110
    goto :goto_0

    :cond_5
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    .line 111
    move-object v0, p2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 113
    :cond_6
    :goto_0
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/huawei/hwid/core/c/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 71
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 72
    iget-object v0, p0, Lcom/huawei/hwid/core/c/a;->c:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 74
    :cond_0
    return-void
.end method
