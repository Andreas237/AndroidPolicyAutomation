.class public Lcom/huawei/hwid/core/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwid/core/datatype/a;>;"
        }
    .end annotation
.end field

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/d/a;->a:Ljava/util/Map;

    .line 40
    const-string v0, ""

    sput-object v0, Lcom/huawei/hwid/core/d/a;->b:Ljava/lang/String;

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/hwid/core/d/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AB09070647056445"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 52
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/a;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 53
    sget-object v0, Lcom/huawei/hwid/core/d/a;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwid/core/datatype/a;

    .line 54
    const-string v3, ""

    .line 55
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 56
    sget-object v0, Lcom/huawei/hwid/core/d/a;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/core/datatype/a;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/a;->a()Ljava/lang/String;

    move-result-object v3

    .line 58
    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    const-string v3, "7000000"

    .line 62
    :cond_1
    :try_start_0
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_0

    .line 63
    :catch_0
    move-exception v4

    .line 64
    const-string v0, "AppInfoUtil"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v3, "7000000"

    .line 67
    :goto_0
    const-string v0, "AppInfoUtil"

    const-string v1, "getAppChannel"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    return-object v3
.end method

.method private static declared-synchronized a(Landroid/content/Context;)V
    .locals 4

    const-class v3, Lcom/huawei/hwid/core/d/a;

    monitor-enter v3

    .line 44
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/a;->b(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/a;->a:Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    goto :goto_0

    .line 45
    :catch_0
    move-exception v2

    .line 46
    const-string v0, "AppInfoUtil"

    const-string v1, "initAppInfos error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :goto_0
    monitor-exit v3

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v3

    throw p0
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    .line 86
    sget-object v0, Lcom/huawei/hwid/core/d/a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 90
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 91
    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 92
    invoke-static {v1}, Lcom/huawei/hwid/core/d/b;->a([B)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/a;->b:Ljava/lang/String;

    .line 94
    :cond_0
    sget-object v0, Lcom/huawei/hwid/core/d/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 77
    sput-object p1, Lcom/huawei/hwid/core/d/a;->b:Ljava/lang/String;

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/hwid/core/d/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwid/core/d/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Landroid/content/Context;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwid/core/datatype/a;>;"
        }
    .end annotation

    .line 198
    const-string v0, "AppInfoUtil"

    const-string v1, "initAppInfos"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "appinfo"

    invoke-static {p0, v1}, Lcom/huawei/hwid/core/d/i;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    .line 200
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 201
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 202
    return-object v3

    .line 205
    :cond_0
    :try_start_0
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->getEventType()I

    move-result v4

    .line 206
    new-instance v5, Lcom/huawei/hwid/core/datatype/a;

    invoke-direct {v5}, Lcom/huawei/hwid/core/datatype/a;-><init>()V

    .line 208
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v4, :cond_4

    .line 209
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v6

    .line 210
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_1

    .line 212
    :pswitch_0
    goto :goto_1

    .line 214
    :pswitch_1
    const-string v0, "appID"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwid/core/datatype/a;->c(Ljava/lang/String;)V

    goto :goto_1

    .line 216
    :cond_1
    const-string v0, "reqClientType"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 217
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwid/core/datatype/a;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 218
    :cond_2
    const-string v0, "defaultChannel"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 219
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwid/core/datatype/a;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 223
    :pswitch_2
    const-string v0, "appInfo"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 224
    invoke-virtual {v5}, Lcom/huawei/hwid/core/datatype/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    new-instance v5, Lcom/huawei/hwid/core/datatype/a;

    invoke-direct {v5}, Lcom/huawei/hwid/core/datatype/a;-><init>()V

    .line 231
    :cond_3
    :goto_1
    :pswitch_3
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->next()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    .line 232
    goto/16 :goto_0

    .line 236
    :cond_4
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V

    .line 237
    goto :goto_2

    .line 233
    :catch_0
    move-exception v4

    .line 234
    const-string v0, "AppInfoUtil"

    const-string v1, "initAppInfos error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V

    .line 237
    goto :goto_2

    .line 236
    :catchall_0
    move-exception v7

    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V

    throw v7

    .line 239
    :goto_2
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static c()Ljava/lang/String;
    .locals 1

    .line 82
    const-string v0, "99E790F6FBA9FDA8"

    return-object v0
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 113
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.huawei.hwid"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    :cond_0
    const-string p1, "com.huawei.hwid"

    .line 117
    :cond_1
    sget-object v0, Lcom/huawei/hwid/core/d/a;->a:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    sget-object v0, Lcom/huawei/hwid/core/d/a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 118
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/core/d/a;->a(Landroid/content/Context;)V

    .line 120
    :cond_3
    return-object p1
.end method
