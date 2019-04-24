.class public final Lo/yv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/yv$b;,
        Lo/yv$a;
    }
.end annotation


# instance fields
.field private a:Lo/zs;

.field private b:Ljava/lang/String;

.field private c:Lo/zo;

.field private d:Lo/yv$b;

.field private e:Landroid/content/Context;

.field private f:Lo/zl;

.field private g:Lo/zk;

.field private h:Ljava/lang/String;

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    new-instance v0, Lo/yv$b;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/yv$b;-><init>(Lo/yv;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/yv;->d:Lo/yv$b;

    .line 141
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/yv;->i:Ljava/util/Map;

    .line 172
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/zs;)V
    .locals 2

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    new-instance v0, Lo/yv$b;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/yv$b;-><init>(Lo/yv;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/yv;->d:Lo/yv$b;

    .line 141
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/yv;->i:Ljava/util/Map;

    .line 183
    if-eqz p1, :cond_0

    .line 185
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/yv;->e:Landroid/content/Context;

    .line 187
    invoke-static {}, Lo/zm;->d()Lo/zm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/zm;->b(Landroid/content/Context;)V

    .line 189
    goto :goto_0

    .line 193
    :cond_0
    const-string v0, "GrsSdkCacheManager mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 194
    return-void

    .line 197
    :goto_0
    iput-object p2, p0, Lo/yv;->a:Lo/zs;

    .line 200
    invoke-static {}, Lo/zh;->b()Lo/zo;

    move-result-object v0

    iput-object v0, p0, Lo/yv;->c:Lo/zo;

    .line 201
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1034
    const-string v2, ""

    .line 1036
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1038
    const-string v0, "isSpExpire jsonValue is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 1039
    return-object v2

    .line 1046
    :cond_0
    const-string v0, "getServiceNameUrl jsonResult is right."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1050
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1052
    invoke-virtual {v3, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 1054
    invoke-virtual {v4, p3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 1055
    goto :goto_0

    .line 1056
    :catch_0
    move-exception v3

    .line 1058
    const-string v0, "getServiceNameUrl JSONException: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 1059
    return-object v2

    .line 1066
    :goto_0
    return-object v2
.end method

.method static synthetic a(Lo/yv;)Ljava/lang/String;
    .locals 1

    .line 752
    invoke-direct {p0}, Lo/yv;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/yv;Z)Ljava/lang/String;
    .locals 1

    .line 671
    invoke-direct {p0, p1}, Lo/yv;->e(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Z)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 717
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getUrlsFromSp isJudgeExpire ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 720
    const/4 v3, 0x0

    .line 721
    iget-object v0, p0, Lo/yv;->a:Lo/zs;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/aar;->b(Lo/zs;ZZ)Ljava/lang/String;

    move-result-object v4

    .line 723
    iget-object v0, p0, Lo/yv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/aan;->d(Landroid/content/Context;)Lo/aan;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v4, v1}, Lo/aan;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 724
    iget-object v0, p0, Lo/yv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/aan;->d(Landroid/content/Context;)Lo/aan;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "time"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/aan;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 725
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getUrlFromSp "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "sp value is not exist."

    goto :goto_0

    :cond_0
    const-string v1, "sp value is exist."

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 725
    .line 726
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 728
    invoke-direct {p0, v6}, Lo/yv;->d(Ljava/lang/String;)Z

    move-result v7

    .line 729
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getUrlFromSp isExpire ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 732
    if-eqz p1, :cond_1

    if-nez v7, :cond_2

    .line 734
    :cond_1
    const-string v0, "getServiceNameUrls"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 735
    iget-object v0, p0, Lo/yv;->b:Ljava/lang/String;

    invoke-direct {p0, v5, v0}, Lo/yv;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 739
    :cond_2
    if-nez p1, :cond_3

    if-eqz v7, :cond_3

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 741
    const-string v0, "getUrlFromSp isExpire "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 743
    :cond_3
    return-object v3
.end method

.method private a(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1262
    const-string v0, "notifyQuerySuccessCall urls "

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1263
    iget-object v0, p0, Lo/yv;->f:Lo/zl;

    if-eqz v0, :cond_0

    .line 1265
    iget-object v0, p0, Lo/yv;->f:Lo/zl;

    invoke-interface {v0, p1}, Lo/zl;->d(Ljava/util/Map;)V

    .line 1266
    goto :goto_0

    .line 1269
    :cond_0
    const-string v0, "notifyQuerySuccessCall iQueryUrlsCallBack is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 1271
    :goto_0
    return-void
.end method

.method private a(Lo/aaa;)V
    .locals 4

    .line 1162
    invoke-virtual {p1}, Lo/aaa;->d()Ljava/lang/String;

    move-result-object v2

    .line 1163
    invoke-virtual {p1}, Lo/aaa;->e()Ljava/lang/String;

    move-result-object v3

    .line 1164
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1166
    const-string v0, "getGrsUrl onRequestResponse server jsonResult is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 1167
    goto :goto_0

    .line 1171
    :cond_0
    const-string v0, "getGrsUrl onRequestResponse server query success, save to sp."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1173
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrl onRequestResponse server jsonResult-> "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1174
    invoke-direct {p0, v2}, Lo/yv;->b(Ljava/lang/String;)V

    .line 1175
    invoke-direct {p0, v3}, Lo/yv;->h(Ljava/lang/String;)V

    .line 1177
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .line 1187
    invoke-static {}, Lo/zm;->d()Lo/zm;

    move-result-object v0

    invoke-virtual {v0}, Lo/zm;->e()Landroid/content/Context;

    move-result-object v4

    .line 1188
    invoke-static {v4}, Lo/aan;->d(Landroid/content/Context;)Lo/aan;

    move-result-object v0

    iget-object v1, p0, Lo/yv;->a:Lo/zs;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lo/aar;->b(Lo/zs;ZZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/aan;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1189
    return-void
.end method

.method static synthetic b(Lo/yv;Lo/aaa;)V
    .locals 0

    .line 1160
    invoke-direct {p0, p1}, Lo/yv;->a(Lo/aaa;)V

    return-void
.end method

.method private c()Ljava/lang/String;
    .locals 4

    .line 767
    invoke-direct {p0}, Lo/yv;->e()Ljava/util/Map;

    move-result-object v2

    .line 768
    const-string v3, ""

    .line 769
    iget-object v0, p0, Lo/yv;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 770
    invoke-static {v2}, Lo/aar;->d(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/yv;->h:Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 771
    iget-object v0, p0, Lo/yv;->h:Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 773
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onLocalQueryGrsSuccess parse json ok serviceNameUrl ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 774
    return-object v3
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 1081
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1083
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1085
    const-string v0, "isSpExpire jsonValue is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 1086
    return-object v2

    .line 1093
    :cond_0
    const-string v0, "getServiceNameUrl jsonResult is right."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1097
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1099
    invoke-virtual {v3, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 1102
    if-nez v4, :cond_1

    .line 1103
    const-string v0, "getServiceNameUrls jsObject null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1104
    return-object v2

    .line 1106
    :cond_1
    :try_start_1
    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    .line 1108
    goto :goto_0

    .line 1109
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1110
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1111
    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1108
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-nez v0, :cond_2

    .line 1113
    goto :goto_1

    .line 1114
    :catch_0
    move-exception v3

    .line 1116
    const-string v0, "getServiceNameUrl JSONException: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 1117
    return-object v2

    .line 1124
    :goto_1
    return-object v2
.end method

.method static synthetic c(Lo/yv;)Lo/yv$b;
    .locals 1

    .line 124
    iget-object v0, p0, Lo/yv;->d:Lo/yv$b;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 290
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/yv;->e(Z)Ljava/lang/String;

    move-result-object v2

    .line 293
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    const-string v0, "dealWithMesg local sp get serviceUrl is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 297
    invoke-direct {p0}, Lo/yv;->c()Ljava/lang/String;

    move-result-object v2

    .line 300
    goto :goto_0

    .line 303
    :cond_0
    const-string v0, "dealWithMesg local sp get serviceUrl is not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 306
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 308
    const-string v0, "dealWithMesg local serviceUrl is not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 310
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    .line 311
    const-string v1, "900"

    invoke-virtual {v0, p1, v1}, Lo/zp;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    invoke-direct {p0, v2}, Lo/yv;->g(Ljava/lang/String;)V

    .line 314
    goto :goto_1

    .line 318
    :cond_1
    const-string v0, "dealWithMesg local sp and config serviceUrl is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 320
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    .line 321
    const-string v1, "900"

    invoke-virtual {v0, p1, v1}, Lo/zp;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    const/16 v0, 0x2c1

    invoke-direct {p0, v0}, Lo/yv;->d(I)V

    .line 325
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/yv;Landroid/os/Message;)V
    .locals 0

    .line 224
    invoke-direct {p0, p1}, Lo/yv;->d(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lo/yv;Ljava/lang/String;)V
    .locals 0

    .line 1185
    invoke-direct {p0, p1}, Lo/yv;->b(Ljava/lang/String;)V

    return-void
.end method

.method private c(ZLo/aaa;)V
    .locals 2

    .line 510
    if-eqz p1, :cond_1

    .line 512
    invoke-virtual {p2}, Lo/aaa;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 515
    const-string v0, "getGrsUrl reportServerQuerySuccess."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 516
    goto :goto_0

    .line 520
    :cond_0
    const-string v0, "getGrsUrl reportServerQueryError."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 522
    goto :goto_0

    .line 526
    :cond_1
    const-string v0, "getGrsUrl isRespSuccess reportServerQueryError."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 528
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/yv;Z)Ljava/util/Map;
    .locals 1

    .line 715
    invoke-direct {p0, p1}, Lo/yv;->a(Z)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private d(I)V
    .locals 2

    .line 1222
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "notfiyQueryFailCall code ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1223
    iget-object v0, p0, Lo/yv;->g:Lo/zk;

    if-eqz v0, :cond_0

    .line 1225
    iget-object v0, p0, Lo/yv;->g:Lo/zk;

    invoke-interface {v0, p1}, Lo/zk;->a(I)V

    .line 1226
    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/yv;->f:Lo/zl;

    if-eqz v0, :cond_1

    .line 1227
    iget-object v0, p0, Lo/yv;->f:Lo/zl;

    invoke-interface {v0, p1}, Lo/zl;->a(I)V

    .line 1228
    goto :goto_0

    .line 1231
    :cond_1
    const-string v0, "notfiyQueryFailCall iQueryGrsInfoCallBack is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 1233
    :goto_0
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 5

    .line 227
    const-string v0, "dealWithMesg."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 228
    if-nez p1, :cond_0

    .line 230
    const-string v0, "dealWithMesg msg is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 231
    return-void

    .line 234
    :cond_0
    iget v2, p1, Landroid/os/Message;->what:I

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dealWithMesg what--->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 238
    const/16 v0, 0x2bc

    if-ne v0, v2, :cond_1

    .line 241
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dealWithMesg mEventId -> "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 245
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/zp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 247
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dealWithMesg mtimeOutStatus ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 250
    const-string v0, "-900"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 252
    invoke-direct {p0, v3}, Lo/yv;->c(Ljava/lang/String;)V

    .line 254
    goto/16 :goto_0

    .line 255
    :cond_1
    const/16 v0, 0x2c2

    if-ne v0, v2, :cond_2

    .line 258
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 260
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dealWithMesg mEventId -> "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 262
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/zp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dealWithMesg mtimeOutStatus ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 267
    const-string v0, "-900"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 269
    invoke-direct {p0, v3}, Lo/yv;->e(Ljava/lang/String;)V

    .line 271
    goto :goto_0

    .line 272
    :cond_2
    const/16 v0, 0x7d0

    if-ne v0, v2, :cond_3

    .line 274
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 275
    invoke-direct {p0, v3}, Lo/yv;->g(Ljava/lang/String;)V

    .line 276
    goto :goto_0

    .line 277
    :cond_3
    const/16 v0, 0x7d2

    if-ne v0, v2, :cond_4

    .line 279
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    .line 280
    invoke-direct {p0, v3}, Lo/yv;->a(Ljava/util/Map;)V

    .line 281
    goto :goto_0

    .line 282
    :cond_4
    const/16 v0, 0x7d1

    if-ne v0, v2, :cond_5

    .line 284
    const/16 v0, 0x2c1

    invoke-direct {p0, v0}, Lo/yv;->d(I)V

    .line 286
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/yv;Ljava/lang/String;)V
    .locals 0

    .line 1208
    invoke-direct {p0, p1}, Lo/yv;->i(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/yv;Ljava/util/Map;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lo/yv;->i:Ljava/util/Map;

    return-void
.end method

.method static synthetic d(Lo/yv;ZLo/aaa;)V
    .locals 0

    .line 509
    invoke-direct {p0, p1, p2}, Lo/yv;->c(ZLo/aaa;)V

    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 8

    .line 989
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 991
    const-string v0, "isSpExpire spValue is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 992
    const/4 v0, 0x1

    return v0

    .line 1000
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 1001
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 1002
    sub-long v0, v4, v6

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 1004
    const-string v0, "isSpExpire false."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1005
    const/4 v0, 0x0

    return v0

    .line 1009
    :cond_1
    const-string v0, "isSpExpire true."

    const/4 v1, 0x0

    :try_start_1
    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1016
    goto :goto_0

    :catch_0
    move-exception v4

    .line 1017
    const-string v0, "isSpExpire spValue NumberFormatException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1019
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic d(Lo/yv;Lo/aaa;)Z
    .locals 1

    .line 501
    invoke-direct {p0, p1}, Lo/yv;->e(Lo/aaa;)Z

    move-result v0

    return v0
.end method

.method private d(Z)Z
    .locals 2

    .line 939
    if-eqz p1, :cond_0

    .line 940
    iget-object v0, p0, Lo/yv;->f:Lo/zl;

    if-nez v0, :cond_1

    .line 942
    const-string v0, "isParameterOk iQueryUrlsCallBack is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 943
    const/4 v0, 0x0

    return v0

    .line 946
    :cond_0
    iget-object v0, p0, Lo/yv;->g:Lo/zk;

    if-nez v0, :cond_1

    .line 948
    const-string v0, "isParameterOk iObtainGrsInfoCallBack is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 949
    const/4 v0, 0x0

    return v0

    .line 955
    :cond_1
    iget-object v0, p0, Lo/yv;->e:Landroid/content/Context;

    if-nez v0, :cond_2

    .line 957
    const-string v0, "isParameterOk mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 958
    const/16 v0, 0x2be

    invoke-direct {p0, v0}, Lo/yv;->d(I)V

    .line 959
    const/4 v0, 0x0

    return v0

    .line 963
    :cond_2
    iget-object v0, p0, Lo/yv;->a:Lo/zs;

    if-nez v0, :cond_3

    .line 965
    const-string v0, "isParameterOk grsParams is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 966
    const/16 v0, 0x2bf

    invoke-direct {p0, v0}, Lo/yv;->d(I)V

    .line 967
    const/4 v0, 0x0

    return v0

    .line 970
    :cond_3
    iget-object v0, p0, Lo/yv;->a:Lo/zs;

    invoke-virtual {v0}, Lo/zs;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 972
    const-string v0, "isParameterOk grsParams appName is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 973
    const/16 v0, 0x2c0

    invoke-direct {p0, v0}, Lo/yv;->d(I)V

    .line 974
    const/4 v0, 0x0

    return v0

    .line 976
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private e(Z)Ljava/lang/String;
    .locals 8

    .line 673
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getUrlFromSp isJudgeExpire ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 675
    const-string v3, ""

    .line 684
    iget-object v0, p0, Lo/yv;->a:Lo/zs;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/aar;->b(Lo/zs;ZZ)Ljava/lang/String;

    move-result-object v4

    .line 686
    iget-object v0, p0, Lo/yv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/aan;->d(Landroid/content/Context;)Lo/aan;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v4, v1}, Lo/aan;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 687
    iget-object v0, p0, Lo/yv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/aan;->d(Landroid/content/Context;)Lo/aan;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "time"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/aan;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 688
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getUrlFromSp "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "sp value is not exist."

    goto :goto_0

    :cond_0
    const-string v1, "sp value is exist."

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 688
    .line 689
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 691
    invoke-direct {p0, v6}, Lo/yv;->d(Ljava/lang/String;)Z

    move-result v7

    .line 692
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getUrlFromSp isExpire ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 695
    if-eqz p1, :cond_1

    if-nez v7, :cond_2

    .line 697
    :cond_1
    iget-object v0, p0, Lo/yv;->b:Ljava/lang/String;

    iget-object v1, p0, Lo/yv;->h:Ljava/lang/String;

    invoke-direct {p0, v5, v0, v1}, Lo/yv;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 701
    :cond_2
    if-nez p1, :cond_3

    if-eqz v7, :cond_3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 703
    const-string v0, "getUrlFromSp isExpire "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 705
    :cond_3
    return-object v3
.end method

.method private e()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 919
    new-instance v4, Lo/zn;

    iget-object v0, p0, Lo/yv;->a:Lo/zs;

    invoke-virtual {v0}, Lo/zs;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/yv;->a:Lo/zs;

    invoke-virtual {v1}, Lo/zs;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/yv;->a:Lo/zs;

    invoke-virtual {v2}, Lo/zs;->k()Ljava/lang/String;

    move-result-object v2

    .line 920
    iget-object v3, p0, Lo/yv;->a:Lo/zs;

    invoke-virtual {v3}, Lo/zs;->d()Ljava/lang/String;

    move-result-object v3

    .line 919
    invoke-direct {v4, v0, v1, v2, v3}, Lo/zn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 918
    .line 922
    invoke-static {}, Lo/zm;->d()Lo/zm;

    move-result-object v0

    invoke-virtual {v0}, Lo/zm;->e()Landroid/content/Context;

    move-result-object v5

    .line 924
    new-instance v6, Lo/yv$a;

    iget-object v0, p0, Lo/yv;->b:Ljava/lang/String;

    invoke-direct {v6, p0, v0}, Lo/yv$a;-><init>(Lo/yv;Ljava/lang/String;)V

    .line 926
    invoke-virtual {v4, v5, v6}, Lo/zn;->b(Landroid/content/Context;Lo/zj;)V

    .line 928
    invoke-virtual {v6}, Lo/yv$a;->c()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/yv;)Ljava/util/Map;
    .locals 1

    .line 915
    invoke-direct {p0}, Lo/yv;->e()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .line 329
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/yv;->a(Z)Ljava/util/Map;

    move-result-object v2

    .line 332
    invoke-static {v2}, Lo/aar;->d(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 334
    const-string v0, "dealWithMesg local sp get serviceUrl is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 336
    invoke-direct {p0}, Lo/yv;->e()Ljava/util/Map;

    move-result-object v2

    .line 339
    goto :goto_0

    .line 342
    :cond_0
    const-string v0, "dealWithMesg local sp get serviceUrl is not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 345
    :goto_0
    invoke-static {v2}, Lo/aar;->d(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 347
    const-string v0, "dealWithMesg local serviceUrl is not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 349
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    .line 350
    const-string v1, "900"

    invoke-virtual {v0, p1, v1}, Lo/zp;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    invoke-direct {p0, v2}, Lo/yv;->a(Ljava/util/Map;)V

    .line 353
    goto :goto_1

    .line 357
    :cond_1
    const-string v0, "dealWithMesg local sp and config serviceUrl is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 359
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    .line 360
    const-string v1, "900"

    invoke-virtual {v0, p1, v1}, Lo/zp;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    const/16 v0, 0x2c1

    invoke-direct {p0, v0}, Lo/yv;->d(I)V

    .line 364
    :goto_1
    return-void
.end method

.method private e(Lo/aaa;)Z
    .locals 2

    .line 502
    if-eqz p1, :cond_1

    .line 503
    invoke-virtual {p1}, Lo/aaa;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lo/aaa;->b()I

    move-result v0

    if-nez v0, :cond_1

    .line 504
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 506
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private g(Ljava/lang/String;)V
    .locals 2

    .line 1243
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "notifyQuerySuccessCall url ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1244
    iget-object v0, p0, Lo/yv;->g:Lo/zk;

    if-eqz v0, :cond_0

    .line 1246
    iget-object v0, p0, Lo/yv;->g:Lo/zk;

    invoke-interface {v0, p1}, Lo/zk;->c(Ljava/lang/String;)V

    .line 1247
    goto :goto_0

    .line 1250
    :cond_0
    const-string v0, "notifyQuerySuccessCall iQueryGrsInfoCallBack is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 1252
    :goto_0
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 6

    .line 1198
    invoke-static {}, Lo/zm;->d()Lo/zm;

    move-result-object v0

    invoke-virtual {v0}, Lo/zm;->e()Landroid/content/Context;

    move-result-object v5

    .line 1199
    invoke-static {v5}, Lo/aan;->d(Landroid/content/Context;)Lo/aan;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lo/yv;->a:Lo/zs;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lo/aar;->b(Lo/zs;ZZ)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "time"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/aan;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1200
    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 3

    .line 1210
    invoke-static {}, Lo/zm;->d()Lo/zm;

    move-result-object v0

    invoke-virtual {v0}, Lo/zm;->e()Landroid/content/Context;

    move-result-object v2

    .line 1211
    invoke-static {v2}, Lo/aan;->d(Landroid/content/Context;)Lo/aan;

    move-result-object v0

    const-string v1, "cp"

    invoke-virtual {v0, v1, p1}, Lo/aan;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1212
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1414
    invoke-virtual {p0, p1}, Lo/yv;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 1415
    const-string v0, "HwGrsTest getUrl"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1416
    const-string v3, ""

    .line 1417
    invoke-static {v2}, Lo/aar;->d(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1418
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 1420
    :cond_0
    return-object v3
.end method

.method public a(Ljava/lang/String;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalThreadStateException;
        }
    .end annotation

    .line 1443
    invoke-static {}, Lo/aar;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1444
    const-string v0, "getUrls is not allow InMainThread, please use this in new thread!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 1445
    new-instance v0, Ljava/lang/IllegalThreadStateException;

    const-string v1, "getUrls is not allow InMainThread, please use this in new thread!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalThreadStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1448
    :cond_0
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 1451
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/yv$3;

    invoke-direct {v1, p0, p1, v2}, Lo/yv$3;-><init>(Lo/yv;Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1480
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 1483
    :try_start_0
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1484
    goto :goto_0

    :catch_0
    move-exception v3

    .line 1485
    const-string v0, "latch.await InterruptedException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 1488
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getUrla[0]--->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo/yv;->i:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 1489
    iget-object v0, p0, Lo/yv;->i:Ljava/util/Map;

    return-object v0
.end method

.method public b(Ljava/lang/String;Lo/zl;)V
    .locals 11

    .line 540
    iput-object p1, p0, Lo/yv;->b:Ljava/lang/String;

    .line 542
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrls serviceName-->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 544
    iput-object p2, p0, Lo/yv;->f:Lo/zl;

    .line 546
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/yv;->d(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 548
    const-string v0, "getGrsUrls Parameter error."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 549
    return-void

    .line 553
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/yv;->a(Z)Ljava/util/Map;

    move-result-object v5

    .line 556
    invoke-static {v5}, Lo/aar;->d(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 558
    const-string v0, "getGrsUrls sp query success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 559
    invoke-direct {p0, v5}, Lo/yv;->a(Ljava/util/Map;)V

    .line 560
    return-void

    .line 563
    :cond_1
    const-string v0, "getGrsUrls sp query fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 566
    iget-object v0, p0, Lo/yv;->c:Lo/zo;

    if-nez v0, :cond_2

    .line 568
    const-string v0, "getGrsUrls grsServerBean is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 569
    const/16 v0, 0x2bd

    invoke-direct {p0, v0}, Lo/yv;->d(I)V

    .line 570
    return-void

    .line 573
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 575
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 577
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrls start server query eventId ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 579
    iget-object v0, p0, Lo/yv;->d:Lo/yv$b;

    invoke-virtual {v0}, Lo/yv$b;->obtainMessage()Landroid/os/Message;

    move-result-object v9

    .line 580
    const/16 v0, 0x2c2

    iput v0, v9, Landroid/os/Message;->what:I

    .line 581
    iput-object v8, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 582
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    const-string v1, "-900"

    invoke-virtual {v0, v8, v1}, Lo/zp;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 583
    iget-object v0, p0, Lo/yv;->d:Lo/yv$b;

    iget-object v1, p0, Lo/yv;->c:Lo/zo;

    invoke-virtual {v1}, Lo/zo;->e()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v0, v9, v1, v2}, Lo/yv$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 585
    new-instance v10, Lo/aaf;

    invoke-direct {v10}, Lo/aaf;-><init>()V

    .line 586
    iget-object v0, p0, Lo/yv;->a:Lo/zs;

    iget-object v1, p0, Lo/yv;->c:Lo/zo;

    new-instance v2, Lo/yv$2;

    invoke-direct {v2, p0, v8, v6, v7}, Lo/yv$2;-><init>(Lo/yv;Ljava/lang/String;J)V

    invoke-interface {v10, v0, v1, v2}, Lo/zz;->a(Lo/zs;Lo/zo;Lo/aah;)V

    .line 662
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lo/zk;)V
    .locals 11

    .line 377
    iput-object p1, p0, Lo/yv;->b:Ljava/lang/String;

    .line 379
    iput-object p2, p0, Lo/yv;->h:Ljava/lang/String;

    .line 381
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrl serviceName-->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , mKey--->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/yv;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 383
    iput-object p3, p0, Lo/yv;->g:Lo/zk;

    .line 385
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/yv;->d(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 387
    const-string v0, "getGrsUrl Parameter error."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 388
    return-void

    .line 392
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/yv;->e(Z)Ljava/lang/String;

    move-result-object v5

    .line 395
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 397
    const-string v0, "getGrsUrl sp query success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 398
    invoke-direct {p0, v5}, Lo/yv;->g(Ljava/lang/String;)V

    .line 399
    return-void

    .line 401
    :cond_1
    const-string v0, "getGrsUrl sp query fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 404
    iget-object v0, p0, Lo/yv;->c:Lo/zo;

    if-nez v0, :cond_2

    .line 406
    const-string v0, "getGrsUrl grsServerBean is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 407
    const/16 v0, 0x2bd

    invoke-direct {p0, v0}, Lo/yv;->d(I)V

    .line 408
    return-void

    .line 411
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 413
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 415
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrl start server query eventId ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 417
    iget-object v0, p0, Lo/yv;->d:Lo/yv$b;

    invoke-virtual {v0}, Lo/yv$b;->obtainMessage()Landroid/os/Message;

    move-result-object v9

    .line 418
    const/16 v0, 0x2bc

    iput v0, v9, Landroid/os/Message;->what:I

    .line 419
    iput-object v8, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 420
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    const-string v1, "-900"

    invoke-virtual {v0, v8, v1}, Lo/zp;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    iget-object v0, p0, Lo/yv;->d:Lo/yv$b;

    iget-object v1, p0, Lo/yv;->c:Lo/zo;

    invoke-virtual {v1}, Lo/zo;->e()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v0, v9, v1, v2}, Lo/yv$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 423
    new-instance v10, Lo/aaf;

    invoke-direct {v10}, Lo/aaf;-><init>()V

    .line 424
    iget-object v0, p0, Lo/yv;->a:Lo/zs;

    iget-object v1, p0, Lo/yv;->c:Lo/zo;

    new-instance v2, Lo/yv$4;

    invoke-direct {v2, p0, v8, v6, v7}, Lo/yv$4;-><init>(Lo/yv;Ljava/lang/String;J)V

    invoke-interface {v10, v0, v1, v2}, Lo/zz;->a(Lo/zs;Lo/zo;Lo/aah;)V

    .line 499
    return-void
.end method
