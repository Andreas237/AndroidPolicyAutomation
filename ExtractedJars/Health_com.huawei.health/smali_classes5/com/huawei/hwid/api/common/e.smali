.class public Lcom/huawei/hwid/api/common/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InlinedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/api/common/e$b;,
        Lcom/huawei/hwid/api/common/e$a;
    }
.end annotation


# static fields
.field private static b:Ljava/lang/Object;

.field private static d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Landroid/content/BroadcastReceiver;>;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/huawei/hwid/core/datatype/HwAccount;

.field private c:Landroid/app/AlertDialog;

.field private e:Landroid/content/Context;

.field private f:Lcom/huawei/cloudservice/CloudRequestHandler;

.field private g:Ljava/lang/String;

.field private h:Lcom/huawei/cloudservice/CloudRequestHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 75
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hwid/api/common/e;->b:Ljava/lang/Object;

    .line 77
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 90
    new-instance v0, Lcom/huawei/hwid/api/common/e$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/api/common/e$1;-><init>(Lcom/huawei/hwid/api/common/e;)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/e;->h:Lcom/huawei/cloudservice/CloudRequestHandler;

    return-void
.end method

.method public static a([Lcom/huawei/cloudservice/CloudAccount;Ljava/lang/String;)I
    .locals 2

    .line 259
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    array-length v0, p0

    if-lez v0, :cond_1

    .line 260
    const/4 v1, 0x0

    :goto_0
    array-length v0, p0

    if-ge v1, v0, :cond_1

    .line 261
    aget-object v0, p0, v1

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 262
    return v1

    .line 260
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 266
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private a(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1142
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1143
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1144
    const-string v0, "CloudAccountImpl"

    const-string v1, "Photo is existed "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1145
    return-object v2

    .line 1147
    :cond_0
    const-string v0, "CloudAccountImpl"

    const-string v1, "Photo is not existed "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1148
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/e;)Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->g:Ljava/lang/String;

    return-object v0
.end method

.method private a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    .line 1153
    move-object v2, p1

    .line 1155
    const-string v3, ""

    .line 1159
    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    const/16 v0, 0x3e7

    if-gt p2, v0, :cond_0

    .line 1160
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 1162
    :cond_0
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "\\{0\\}"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const/4 v0, 0x1

    aput-object v3, v4, v0

    .line 1163
    invoke-static {v2, v4}, Lcom/huawei/hwid/core/d/j;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/app/Activity;Lcom/huawei/cloudservice/LoginHandler;ILjava/lang/String;)V
    .locals 4

    .line 212
    const v0, 0x138de24

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid apk version is low"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is low version"

    const/16 v1, 0x23

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 215
    invoke-interface {p1, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 216
    goto/16 :goto_0

    .line 217
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 218
    const-string v0, "CloudAccountImpl"

    const-string v1, "loginChannel can\'t be null!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "loginChannel can\'t be null!"

    const/16 v1, 0xc

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 220
    invoke-interface {p1, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 221
    return-void

    .line 223
    :cond_1
    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->a(Lcom/huawei/cloudservice/LoginHandler;)V

    .line 225
    invoke-static {p3}, Lcom/huawei/hwid/core/d/d;->a(Ljava/lang/String;)V

    .line 226
    invoke-static {p0}, Lcom/huawei/hwid/core/a/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/a/a;->a(Ljava/lang/String;)V

    .line 228
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 230
    const-class v0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 231
    const-string v0, "requestTokenType"

    invoke-virtual {v2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 232
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 233
    const-string v0, "isFromApk"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 234
    const-string v0, "IS_LOGIN_BY_ACTIVITY"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 235
    const-string v0, "bundle"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 237
    const/high16 v0, 0x100000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 238
    invoke-virtual {p0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 240
    :goto_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V
    .locals 3

    const-class v2, Lcom/huawei/hwid/api/common/e;

    monitor-enter v2

    .line 1798
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/ArrayList;

    .line 1799
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 1800
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1802
    :cond_0
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1803
    sget-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1804
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1546
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/e;->c(Landroid/content/Context;Landroid/content/Intent;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v1

    .line 1547
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-static {v1}, Lcom/huawei/hwid/core/d/b;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1548
    invoke-static {p0}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;)V

    .line 1550
    invoke-static {p0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-interface {v0, p0, v1}, Lcom/huawei/hwid/b/b;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    .line 1556
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;ILcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 3

    .line 112
    invoke-static {p0, p3}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    const-string v0, "CloudAccountImpl"

    const-string v1, "setLogoutIntent: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    return-void

    .line 116
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 117
    const-string v0, "CloudAccountImpl"

    const-string v1, "setLogoutIntent:can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 119
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 120
    return-void

    .line 122
    :cond_1
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 123
    const-string v0, "CloudAccountImpl"

    const-string v1, "setLogoutIntent:hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 125
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 126
    return-void

    .line 128
    :cond_2
    const v0, 0x135c8b0

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 129
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid version must be higher than 2.3.2"

    const/16 v1, 0x23

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 130
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 131
    const-string v0, "CloudAccountImpl"

    const-string v1, "apk version is low"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    return-void

    .line 134
    :cond_3
    const/4 v0, 0x0

    if-gt v0, p2, :cond_4

    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 135
    :cond_4
    const-string v0, "CloudAccountImpl"

    const-string v1, "priority or intent is  invalid!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "parameter can not be empty,  priority should not be less than 0, Intent must be valid"

    const/16 v1, 0xc

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 137
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 138
    return-void

    .line 140
    :cond_5
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Landroid/content/Intent;ILcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 141
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 7

    .line 1748
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    sget-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1749
    :cond_0
    const-string v0, "CloudAccountImpl"

    const-string v1, "context, bundle or broadcast is null, can\'t remove broadcast"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1750
    return-void

    .line 1752
    :cond_1
    const-string v0, "LoginBroadcastReceiver"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 1753
    const-string v0, "LogoutBroadcastReceiver"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 1754
    const-string v0, "FingerBroadcastReceiver"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 1755
    const-string v0, "OpenLoginBroadcastReceiver"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 1756
    const-string v0, "BindSafePhoneBroadcastReceiver"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 1757
    if-eqz v2, :cond_2

    .line 1758
    const-string v0, "LoginBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1760
    :cond_2
    if-eqz v3, :cond_3

    .line 1761
    const-string v0, "LogoutBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1763
    :cond_3
    if-eqz v4, :cond_4

    .line 1764
    const-string v0, "FingerBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1766
    :cond_4
    if-eqz v5, :cond_5

    .line 1767
    const-string v0, "OpenLoginBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1769
    :cond_5
    if-eqz v6, :cond_6

    .line 1770
    const-string v0, "BindSafePhoneBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1772
    :cond_6
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 4

    .line 1880
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1881
    return-void

    .line 1883
    :cond_0
    invoke-static {p0, p2}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1884
    const-string v0, "CloudAccountImpl"

    const-string v1, "initial: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1885
    return-void

    .line 1887
    :cond_1
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1888
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_no_network_content"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1890
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1891
    const-string v0, "CloudAccountImpl"

    const-string v1, "error: have no network"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1892
    return-void

    .line 1894
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/vermanager/b;->a(Landroid/content/Context;)Lcom/huawei/hwid/vermanager/b;

    .line 1895
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1896
    const v0, 0x135c0e0

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1897
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid low update"

    const/16 v1, 0x23

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1898
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1899
    const-string v0, "CloudAccountImpl"

    const-string v1, "apk version is low"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1900
    goto :goto_0

    .line 1901
    :cond_3
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1902
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 1903
    const-string v0, "versionName"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1904
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 1905
    return-void

    .line 1908
    :cond_4
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1909
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1910
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1911
    const-string v0, "updateApk"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1913
    :goto_0
    invoke-static {p0}, Lcom/huawei/hwid/api/common/e;->e(Landroid/content/Context;)V

    .line 1914
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/apkimpl/a;->b(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 1915
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 5

    .line 1500
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 1501
    const-string v0, "com.huawei.hwid.ACTION.BINDSAFEPHONE.SUCCESS"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1503
    sget-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    const-string v1, "BindSafePhoneBroadcastReceiver"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1504
    const-string v0, "BindSafePhoneBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1506
    :cond_0
    new-instance v3, Lcom/huawei/hwid/api/common/d;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hwid/api/common/d;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1508
    :try_start_0
    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1509
    const-string v0, "BindSafePhoneBroadcastReceiver"

    invoke-static {v3, v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1512
    goto :goto_0

    .line 1510
    :catch_0
    move-exception v4

    .line 1511
    const-string v0, "CloudAccountImpl"

    const-string v1, "BroadcastReceiver components are not allowed to register to receive intents"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1513
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;Lcom/huawei/hwid/core/a/b;)V
    .locals 5

    .line 454
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 455
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    return-void

    .line 458
    :cond_0
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 459
    const-string v0, "com.huawei.cloudserive.loginSuccess"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 460
    const-string v0, "com.huawei.cloudserive.loginFailed"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 461
    const-string v0, "com.huawei.cloudserive.loginCancel"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 463
    sget-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    const-string v1, "LoginBroadcastReceiver"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 464
    const-string v0, "LoginBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 467
    :cond_1
    new-instance v3, Lcom/huawei/hwid/api/common/e$a;

    invoke-direct {v3, p0, p1, p2}, Lcom/huawei/hwid/api/common/e$a;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;Lcom/huawei/hwid/core/a/b;)V

    .line 469
    :try_start_0
    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 470
    const-string v0, "LoginBroadcastReceiver"

    invoke-static {v3, v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 473
    goto :goto_0

    .line 471
    :catch_0
    move-exception v4

    .line 472
    const-string v0, "CloudAccountImpl"

    const-string v1, "BroadcastReceiver components are not allowed to register to receive intents"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;Ljava/lang/String;)V
    .locals 5

    .line 1722
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 1723
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1724
    return-void

    .line 1726
    :cond_0
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 1727
    const-string v0, "com.huawei.hwid.opensdk.smsauth.success"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1728
    const-string v0, "com.huawei.hwid.opensdk.smsauth.quicklogin.SUCCESS"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1729
    const-string v0, "com.huawei.hwid.opensdk.smsauth.quicklogin.fail"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1730
    const-string v0, "com.huawei.hwid.opensdk.switch.other"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1732
    sget-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    const-string v1, "OpenLoginBroadcastReceiver"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1733
    const-string v0, "OpenLoginBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1735
    :cond_1
    new-instance v3, Lcom/huawei/hwid/api/common/n;

    invoke-direct {v3, p0, p1, p2}, Lcom/huawei/hwid/api/common/n;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;Ljava/lang/String;)V

    .line 1737
    :try_start_0
    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1738
    const-string v0, "OpenLoginBroadcastReceiver"

    invoke-static {v3, v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1741
    goto :goto_0

    .line 1739
    :catch_0
    move-exception v4

    .line 1740
    const-string v0, "CloudAccountImpl"

    const-string v1, "BroadcastReceiver components are not allowed to register to receive intents"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1742
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 4

    .line 152
    invoke-static {p0, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 153
    const-string v0, "CloudAccountImpl"

    const-string v1, "getAccountsByType: context or handler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    return-void

    .line 157
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 158
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use huawei checkIsUseHuaweiAccount"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 160
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 161
    return-void

    .line 163
    :cond_1
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 164
    const-string v0, "CloudAccountImpl"

    const-string v1, "huaweiid  is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 166
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 167
    return-void

    .line 170
    :cond_2
    invoke-static {p3}, Lcom/huawei/hwid/api/common/o;->a(Lcom/huawei/cloudservice/LoginHandler;)V

    .line 171
    invoke-static {p0}, Lcom/huawei/hwid/api/common/e;->e(Landroid/content/Context;)V

    .line 175
    const/4 v2, 0x0

    .line 176
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 178
    const-string v0, "loginChannel"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    goto :goto_0

    .line 180
    :cond_3
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 183
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_4

    .line 184
    const-string v0, "CloudAccountImpl"

    const-string v1, "loginChannel can\'t be null!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "loginChannel can\'t be null!"

    const/16 v1, 0xc

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 186
    invoke-interface {p3, v3}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 187
    return-void

    .line 191
    :cond_4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 192
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 195
    :cond_5
    invoke-static {p0, p1, p3}, Lcom/huawei/hwid/api/common/e;->c(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 196
    return-void

    .line 199
    :cond_6
    invoke-static {p0}, Lcom/huawei/hwid/api/common/e;->f(Landroid/content/Context;)V

    .line 202
    invoke-static {p1}, Lcom/huawei/hwid/core/d/d;->a(Ljava/lang/String;)V

    .line 203
    invoke-static {p0}, Lcom/huawei/hwid/core/a/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/a/a;->a(Ljava/lang/String;)V

    .line 207
    const-string v0, ""

    invoke-static {p0, p1, v0, p2, p3}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 208
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 5

    .line 1326
    invoke-static {p0, p2}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1327
    const-string v0, "CloudAccountImpl"

    const-string v1, "logoutHwIDByUserID: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1328
    return-void

    .line 1331
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1332
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 1333
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "userId is empty"

    const/16 v1, 0xc

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1334
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1336
    :cond_1
    const-string v0, "CloudAccountImpl"

    const-string v1, "userId is empty"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1337
    return-void

    .line 1340
    :cond_2
    const-string v0, "com.huawei.hwid.ACTION_LOGOUT_FOR_APP"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1342
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v2

    .line 1343
    const/4 v3, 0x0

    .line 1345
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 1346
    invoke-virtual {v2}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v3

    .line 1349
    :cond_3
    const-string v0, "com.huawei.hwid.ACTION_LOGOUT_FOR_APP_BY_USERID"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1351
    invoke-static {p0, p2}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1352
    const-string v0, "CloudAccountImpl"

    const-string v1, "start logout listener"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1354
    :cond_4
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not send broadcast"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1356
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_5

    .line 1357
    invoke-virtual {v3}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    goto :goto_1

    .line 1360
    :cond_5
    const-string v4, ""

    .line 1361
    const/4 v0, 0x0

    if-eq v0, p3, :cond_6

    .line 1362
    const-string v0, "accountName"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1363
    invoke-static {p0, p1, v4, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1366
    :cond_6
    :goto_1
    goto :goto_2

    .line 1367
    :cond_7
    const/4 v0, 0x0

    if-eq v0, p2, :cond_8

    .line 1368
    const-string v0, "CloudAccountImpl"

    const-string v1, "HwID is not install or version isn\'t support this port!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1369
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "HwID is not install or version isn\'t support this port!"

    const/16 v1, 0x14

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1370
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1373
    :cond_8
    :goto_2
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 4

    .line 708
    invoke-static {p0, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 709
    const-string v0, "CloudAccountImpl"

    const-string v1, "quickLogin: context or loginHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 710
    return-void

    .line 712
    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 713
    invoke-static {p1}, Lcom/huawei/hwid/core/d/d;->a(Ljava/lang/String;)V

    .line 714
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 715
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_no_network_content"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 717
    invoke-interface {p2, v3}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 718
    return-void

    .line 719
    :cond_1
    const/16 v0, -0x3e7

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 720
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_sim_card_unavailable"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 722
    invoke-interface {p2, v3}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 723
    return-void

    .line 726
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 727
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 728
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 729
    invoke-interface {p2, v3}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 730
    return-void

    .line 732
    :cond_3
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 736
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 737
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 738
    invoke-interface {p2, v3}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 739
    return-void

    .line 742
    :cond_4
    invoke-static {p0}, Lcom/huawei/hwid/api/common/e;->e(Landroid/content/Context;)V

    .line 743
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 744
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 747
    :cond_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-gt v0, v1, :cond_6

    .line 748
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.permission.SEND_SMS"

    const-string v2, "com.huawei.hwid"

    invoke-static {v0, v1, v2}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 749
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "no permission to send sms"

    const/16 v1, 0x11

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 750
    invoke-interface {p2, v3}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 751
    return-void

    .line 754
    :cond_6
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 755
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 4

    .line 1474
    const-string v0, "CloudAccountImpl"

    const-string v1, "handlerLogout"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1476
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.hwid.ACTION_LOGOUT_FOR_APP"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1479
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1480
    const-string v0, "userId"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1484
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1485
    new-instance v3, Landroid/accounts/Account;

    const-string v0, "com.huawei.hwid"

    invoke-direct {v3, p2, v0}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1486
    const-string v0, "account"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1489
    :cond_1
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1490
    const/4 v0, 0x0

    invoke-static {p0, v2, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Landroid/content/Intent;I)V

    .line 1491
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 7

    .line 1186
    invoke-static {p0, p5}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1187
    const-string v0, "CloudAccountImpl"

    const-string v1, "checkPassWord: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1188
    return-void

    .line 1190
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1191
    :cond_1
    const-string v0, "CloudAccountImpl"

    const-string v1, "error: parameter is invalid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1192
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "parameter is invalid"

    const/16 v1, 0xc

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1193
    invoke-interface {p5, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1194
    return-void

    .line 1197
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1198
    const-string v0, "CloudAccountImpl"

    const-string v1, "error: have no network"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1199
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_no_network_content"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1201
    invoke-interface {p5, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1202
    return-void

    .line 1205
    :cond_3
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1206
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1207
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1208
    invoke-interface {p5, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1209
    return-void

    .line 1212
    :cond_4
    invoke-static {p3}, Lcom/huawei/hwid/core/d/b;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1213
    const-string v0, "CloudAccountImpl"

    const-string v1, "this is third account"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 1215
    const-string v0, "isSuccess"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1216
    invoke-interface {p5, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 1217
    return-void

    .line 1221
    :cond_5
    const/4 v0, 0x0

    if-ne v0, p3, :cond_6

    .line 1222
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 1225
    :cond_6
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/g;

    move-object v1, p0

    move-object v2, p1

    invoke-static {p2}, Lcom/huawei/hwid/core/encrypt/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwid/core/b/a/a/g;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 1226
    invoke-virtual {v6, p0, v6, p1, p5}, Lcom/huawei/hwid/core/b/a/a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1228
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 13

    .line 1808
    move-object/from16 v0, p8

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1809
    const-string v0, "CloudAccountImpl"

    const-string v1, "checkPasswordByUserId: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1810
    return-void

    .line 1812
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1813
    :cond_1
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "the param is invalid"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1814
    const-string v0, "CloudAccountImpl"

    const-string v1, "userId or password is empty"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1815
    return-void

    .line 1817
    :cond_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1818
    :cond_3
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "the param is invalid"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1819
    const-string v0, "CloudAccountImpl"

    const-string v1, "tokenType is empty or not equals"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1820
    return-void

    .line 1822
    :cond_4
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1823
    :cond_5
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "the param is invalid"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1824
    const-string v0, "CloudAccountImpl"

    const-string v1, "deviceId or deviceType is empty"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1825
    return-void

    .line 1827
    :cond_6
    invoke-static/range {p4 .. p4}, Lcom/huawei/hwid/core/d/b;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1828
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "third account is not allowed to verify password"

    const/16 v2, 0x1a

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1829
    const-string v0, "CloudAccountImpl"

    const-string v1, "third account is not allowed to verify password"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1830
    return-void

    .line 1832
    :cond_7
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 1833
    new-instance v10, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_no_network_content"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v10, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1835
    move-object/from16 v0, p8

    invoke-interface {v0, v10}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1836
    const-string v0, "CloudAccountImpl"

    const-string v1, "error: have no network"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1837
    return-void

    .line 1839
    :cond_8
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1840
    const-string v0, "CloudAccountImpl"

    const-string v1, "checkIsUseHuaweiAccount false can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1841
    new-instance v10, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v10, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1842
    move-object/from16 v0, p8

    invoke-interface {v0, v10}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1843
    return-void

    .line 1845
    :cond_9
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 1849
    const-string v0, "CloudAccountImpl"

    const-string v1, "checkIsInstallHuaweiAccount false hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1850
    new-instance v10, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v10, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1851
    move-object/from16 v0, p8

    invoke-interface {v0, v10}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1852
    return-void

    .line 1855
    :cond_a
    const/4 v10, 0x7

    .line 1856
    const/4 v0, 0x0

    move-object/from16 v1, p9

    if-eq v0, v1, :cond_b

    .line 1857
    const-string v0, "reqClientType"

    move-object/from16 v1, p9

    const/4 v2, 0x7

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v10

    .line 1860
    :cond_b
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v11

    .line 1861
    const-string v0, "com.huawei.android.permission.ANTITHEFT"

    invoke-virtual {v11, v0, p1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1862
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "permission is deny"

    const/16 v2, 0x1b

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1863
    const-string v0, "CloudAccountImpl"

    const-string v1, "permission is deny"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1864
    return-void

    .line 1866
    :cond_c
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/e;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    invoke-static/range {p3 .. p3}, Lcom/huawei/hwid/core/encrypt/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "0"

    move v6, v10

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hwid/core/b/a/a/e;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v0

    .line 1868
    const/4 v0, 0x0

    move-object/from16 v1, p8

    invoke-virtual {v12, p0, v12, v0, v1}, Lcom/huawei/hwid/core/b/a/a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1869
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;ZLcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 6

    .line 1568
    invoke-static {p0, p3}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1569
    const-string v0, "CloudAccountImpl"

    const-string v1, "checkHwIDPassword: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1570
    return-void

    .line 1572
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 1573
    const-string v0, "CloudAccountImpl"

    const-string v1, "cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1574
    return-void

    .line 1577
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1578
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "the param is invalid"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1579
    const-string v0, "CloudAccountImpl"

    const-string v1, "userId is empty"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1580
    return-void

    .line 1583
    :cond_2
    const/4 v0, 0x0

    if-ne v0, p4, :cond_3

    .line 1584
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "the param is invalid"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1585
    const-string v0, "CloudAccountImpl"

    const-string v1, "bundle is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1586
    return-void

    .line 1589
    :cond_3
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1590
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use hwid checkIsUseHuaweiAccount false"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1591
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1592
    invoke-interface {p3, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1593
    return-void

    .line 1596
    :cond_4
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1600
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit checkIsInstallHuaweiAccount"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1601
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1602
    invoke-interface {p3, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1603
    return-void

    .line 1606
    :cond_5
    const-string v3, ""

    .line 1607
    const-string v0, "CloudAccountImpl"

    const-string v1, "checkHwIDPassword"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1611
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v4

    .line 1612
    const/4 v0, 0x0

    if-ne v0, v4, :cond_6

    .line 1613
    const-string v0, "accountType"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1614
    const-string v0, "CloudAccountImpl"

    const-string v1, "get accountType from bundle"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1616
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1617
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "the param is invalid"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1618
    const-string v0, "CloudAccountImpl"

    const-string v1, "userId  actp is error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1619
    return-void

    .line 1622
    :cond_6
    invoke-virtual {v4}, Lcom/huawei/cloudservice/CloudAccount;->getAccountType()Ljava/lang/String;

    move-result-object v3

    .line 1626
    :cond_7
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 1628
    invoke-static {p0, p3}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1631
    const-string v0, "userId"

    invoke-virtual {v5, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1633
    const-string v0, "accountType"

    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1635
    const-string v0, "requestTokenType"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1636
    const-string v0, "startway"

    const/4 v1, 0x3

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1637
    const-string v0, "use_finger"

    invoke-virtual {v5, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1639
    const-string v0, "receive_package"

    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1640
    invoke-virtual {v5, p4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1642
    const-string v0, "bindOperation"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1643
    const-string v0, "onlyBindPhoneForThird"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1644
    const-string v0, "startway"

    const/16 v1, 0x8

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1647
    :cond_8
    const-string v0, "com.huawei.hwid.FINGER_AUTH"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1648
    const-string v0, "com.huawei.hwid.FINGER_AUTH"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1649
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 1650
    :cond_9
    const-string v0, "com.huawei.hwid.UID_AUTH"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1651
    const-string v0, "com.huawei.hwid.UID_AUTH"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1652
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 1654
    :cond_a
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "check pwd activity is null"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1655
    const-string v0, "CloudAccountImpl"

    const-string v1, "check pwd activity is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1656
    return-void

    .line 1659
    :goto_0
    const/4 v0, 0x0

    invoke-static {p0, v5, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Landroid/content/Intent;I)V

    .line 1660
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/e;Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/e;Lcom/huawei/hwid/core/datatype/HwAccount;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/e;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/e;Ljava/lang/String;Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e;->a(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    return-void
.end method

.method private a(Lcom/huawei/hwid/core/datatype/HwAccount;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 310
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/HwAccount;Landroid/content/Context;)V
    .locals 0

    .line 70
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/e;->b(Lcom/huawei/hwid/core/datatype/HwAccount;Landroid/content/Context;)V

    return-void
.end method

.method private a(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 14

    .line 1041
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1042
    const-string v4, "7"

    .line 1043
    const-string v5, "1"

    .line 1044
    const-string v0, "userID"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    const-string v0, "reqClientType"

    invoke-virtual {v3, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1046
    const-string v0, "fileCnt"

    invoke-virtual {v3, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1047
    const-string v0, "ver"

    const-string v1, "12000"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1048
    invoke-static {}, Lcom/huawei/hwid/core/b/a/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->e()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwid/api/common/e;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    .line 1049
    invoke-static/range {p2 .. p2}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1050
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_no_network_content"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v7, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1052
    move-object/from16 v0, p3

    invoke-interface {v0, v7}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1053
    const-string v0, "CloudAccountImpl"

    const-string v1, "error: have no network"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1054
    return-void

    .line 1056
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/e;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    invoke-static {v2, v0, v6, v3, v1}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1057
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 1058
    invoke-static {v7, v8}, Lcom/huawei/hwid/core/d/f;->a(Ljava/lang/String;Landroid/content/Intent;)Landroid/content/Intent;

    .line 1059
    invoke-virtual {v8}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    .line 1060
    if-nez v9, :cond_1

    const-string v10, ""

    goto :goto_0

    :cond_1
    const-string v0, "fileUrlB"

    const-string v1, ""

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1061
    :goto_0
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1062
    const-string v11, "upload headPic faild"

    .line 1063
    invoke-virtual {v8}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v12

    .line 1064
    if-eqz v12, :cond_2

    .line 1065
    const-string v0, "errorDesc"

    invoke-virtual {v12, v0, v11}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1067
    :cond_2
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    move-object v2, v11

    const/16 v1, 0x25

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    move-object v13, v0

    .line 1069
    move-object/from16 v0, p3

    invoke-interface {v0, v13}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1070
    return-void

    .line 1072
    :cond_3
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 1073
    const-string v0, "isSuccess"

    const/4 v1, 0x1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1074
    const-string v0, "url"

    invoke-virtual {v11, v0, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1075
    move-object/from16 v0, p3

    invoke-interface {v0, v11}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 1077
    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/cloudservice/IntentResultHandler;)Z
    .locals 3

    .line 1707
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 1708
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 1709
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1710
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "context is null"

    const/16 v1, 0xc

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1711
    invoke-interface {p1, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1712
    const/4 v0, 0x0

    return v0

    .line 1714
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1716
    :cond_1
    const-string v0, "CloudAccountImpl"

    const-string v1, "loginHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1717
    const/4 v0, 0x0

    return v0
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;)Z
    .locals 3

    .line 1685
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 1686
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 1687
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1688
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "context is null"

    const/16 v1, 0xc

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1689
    invoke-interface {p1, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1690
    const/4 v0, 0x0

    return v0

    .line 1692
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1694
    :cond_1
    const-string v0, "CloudAccountImpl"

    const-string v1, "loginHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1695
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    .line 693
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 694
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 695
    const/4 v0, 0x0

    return v0

    .line 697
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/huawei/hwid/b/b;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;)[Lcom/huawei/cloudservice/CloudAccount;
    .locals 5

    .line 276
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 277
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/huawei/cloudservice/CloudAccount;

    return-object v0

    .line 294
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/c/a;->b()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v2

    .line 295
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 296
    const/4 v0, 0x1

    new-array v3, v0, [Lcom/huawei/cloudservice/CloudAccount;

    .line 297
    new-instance v4, Lcom/huawei/hwid/api/common/e;

    invoke-direct {v4}, Lcom/huawei/hwid/api/common/e;-><init>()V

    .line 298
    invoke-direct {v4, v2}, Lcom/huawei/hwid/api/common/e;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 299
    new-instance v0, Lcom/huawei/cloudservice/CloudAccount;

    invoke-direct {v0, v4}, Lcom/huawei/cloudservice/CloudAccount;-><init>(Lcom/huawei/hwid/api/common/e;)V

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 300
    return-object v3

    .line 302
    :cond_1
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwAccount is null error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/huawei/cloudservice/CloudAccount;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/e;)Landroid/content/Context;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->e:Landroid/content/Context;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/cloudservice/CloudAccount;
    .locals 4

    .line 817
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 818
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 819
    const/4 v0, 0x0

    return-object v0

    .line 821
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 822
    const-string v0, "CloudAccountImpl"

    const-string v1, "get account by userID failed, the userID is null!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 823
    const/4 v0, 0x0

    return-object v0

    .line 825
    :cond_1
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 826
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 827
    const/4 v0, 0x0

    return-object v0

    .line 829
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 830
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 831
    const/4 v0, 0x0

    return-object v0

    .line 834
    :cond_3
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/b;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v2

    .line 835
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 836
    new-instance v3, Lcom/huawei/hwid/api/common/e;

    invoke-direct {v3}, Lcom/huawei/hwid/api/common/e;-><init>()V

    .line 837
    invoke-direct {v3, v2}, Lcom/huawei/hwid/api/common/e;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 838
    const-string v0, "CloudAccountImpl"

    const-string v1, "get account by userID success!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    new-instance v0, Lcom/huawei/cloudservice/CloudAccount;

    invoke-direct {v0, v3}, Lcom/huawei/cloudservice/CloudAccount;-><init>(Lcom/huawei/hwid/api/common/e;)V

    return-object v0

    .line 841
    :cond_4
    const-string v0, "CloudAccountImpl"

    const-string v1, "get account by userID failed, there is no matching account!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 842
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic b(Landroid/content/Context;Landroid/content/Intent;)Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 1

    .line 70
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/e;->c(Landroid/content/Context;Landroid/content/Intent;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 3

    .line 432
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 433
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    return-void

    .line 436
    :cond_0
    const-string v0, "CloudAccountImpl"

    const-string v1, "clear all accout data"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 442
    const-string v0, ""

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 443
    invoke-static {p0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-interface {v0, p0, v2}, Lcom/huawei/hwid/b/b;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 444
    return-void
.end method

.method public static b(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 3

    .line 1918
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1919
    const-string v0, "CloudAccountImpl"

    const-string v1, "updateHwID bunlde is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1920
    return-void

    .line 1922
    :cond_0
    invoke-static {p0, p2}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1923
    const-string v0, "CloudAccountImpl"

    const-string v1, "updateHwID context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1924
    return-void

    .line 1926
    :cond_1
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1927
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_no_network_content"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1929
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1930
    const-string v0, "CloudAccountImpl"

    const-string v1, "error: have no network"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1931
    return-void

    .line 1933
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1934
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/apkimpl/a;->b(Landroid/content/Context;Landroid/os/Bundle;)V

    goto :goto_0

    .line 1936
    :cond_3
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1937
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1938
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1939
    const-string v0, "updateApk"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1940
    return-void

    .line 1942
    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 5

    .line 1522
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 1523
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1524
    return-void

    .line 1526
    :cond_0
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 1527
    const-string v0, "com.huawei.cloudserive.fingerSuccess"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1528
    const-string v0, "com.huawei.cloudserive.fingerCancel"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1530
    sget-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    const-string v1, "FingerBroadcastReceiver"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1531
    const-string v0, "FingerBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1533
    :cond_1
    new-instance v3, Lcom/huawei/hwid/api/common/i;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hwid/api/common/i;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1535
    :try_start_0
    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1536
    const-string v0, "FingerBroadcastReceiver"

    invoke-static {v3, v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1539
    goto :goto_0

    .line 1537
    :catch_0
    move-exception v4

    .line 1538
    const-string v0, "CloudAccountImpl"

    const-string v1, "BroadcastReceiver components are not allowed to register to receive intents"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1540
    :goto_0
    return-void
.end method

.method private b(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 8

    .line 1128
    const-string v0, "CloudAccountImpl"

    const-string v1, "syncUserInfo enter"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1129
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1130
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_no_network_content"

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v7, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1132
    invoke-interface {p3, v7}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1133
    const-string v0, "CloudAccountImpl"

    const-string v1, "error: have no network"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1134
    return-void

    .line 1136
    :cond_0
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/f;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v1

    move-object v4, p2

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwid/core/b/a/a/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;Landroid/os/Bundle;)V

    move-object v7, v0

    .line 1137
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->e()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwid/core/b/a/a;->c(I)V

    .line 1138
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, p1, v7, v0, p3}, Lcom/huawei/hwid/core/b/a/a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1139
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 4

    .line 852
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 853
    :cond_0
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 854
    return-void

    .line 856
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 857
    const-string v0, "CloudAccountImpl"

    const-string v1, "get account by userID failed, the userID is null!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 858
    return-void

    .line 860
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 861
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 862
    return-void

    .line 864
    :cond_3
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 865
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 866
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "hwid is not exit"

    const/16 v2, 0x22

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 867
    return-void

    .line 870
    :cond_4
    new-instance v0, Lcom/huawei/hwid/b;

    invoke-static {}, Lcom/huawei/hwid/d;->a()Lcom/huawei/hwid/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwid/b;-><init>(Lcom/huawei/hwid/c;)V

    new-instance v1, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;-><init>(Z)V

    new-instance v3, Lcom/huawei/hwid/api/common/e$2;

    invoke-direct {v3, p2, p1}, Lcom/huawei/hwid/api/common/e$2;-><init>(Lcom/huawei/cloudservice/LoginHandler;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwid/b;->a(Lcom/huawei/hwid/UseCase;Lcom/huawei/hwid/UseCase$RequestValues;Lcom/huawei/hwid/UseCase$a;)V

    .line 906
    return-void
.end method

.method private static b(Lcom/huawei/hwid/core/datatype/HwAccount;Landroid/content/Context;)V
    .locals 2

    .line 2118
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/HwAccount;->o()Ljava/lang/String;

    move-result-object v1

    .line 2119
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2120
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    .line 2121
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 2122
    const-string v1, ""

    .line 2124
    :cond_1
    invoke-virtual {p0, v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->n(Ljava/lang/String;)V

    .line 2126
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwid/api/common/e;)Lcom/huawei/cloudservice/CloudRequestHandler;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->f:Lcom/huawei/cloudservice/CloudRequestHandler;

    return-object v0
.end method

.method private static c(Landroid/content/Context;Landroid/content/Intent;)Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 3

    .line 636
    const/4 v1, 0x0

    .line 637
    const-string v0, "hwaccount"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 638
    const-string v0, "hwaccount"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/hwid/core/datatype/HwAccount;

    goto :goto_0

    .line 639
    :cond_0
    const-string v0, "accountBundle"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 640
    const-string v0, "accountBundle"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 641
    invoke-static {p0, v2}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Landroid/os/Bundle;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v1

    .line 642
    goto :goto_0

    :cond_1
    const-string v0, "bundle"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 643
    const-string v0, "bundle"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 644
    invoke-static {p0, v2}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Landroid/os/Bundle;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v1

    .line 646
    :cond_2
    :goto_0
    return-object v1
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 655
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 656
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 657
    const-string v0, ""

    return-object v0

    .line 659
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 663
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 664
    const-string v0, ""

    return-object v0

    .line 666
    :cond_1
    const-string v2, ""

    .line 667
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    .line 668
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 672
    :cond_2
    return-object v2
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1308
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1309
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 1312
    :cond_0
    const-string v0, "tokenType"

    invoke-static {p0, v0, p1}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1314
    :goto_0
    return-object p1
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)Z
    .locals 3

    .line 243
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 244
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "tokenType is not the same as package name"

    const/16 v1, 0xc

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 245
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 246
    const/4 v0, 0x0

    return v0

    .line 248
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static d()Landroid/content/Intent;
    .locals 2

    .line 1997
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1998
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1999
    const-string v0, "com.huawei.hwid.ACTION_UNIFY_PASSWORD_VERIFY"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2000
    return-object v1
.end method

.method private static d(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 5

    .line 1377
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 1378
    const-string v0, "CloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1379
    return-void

    .line 1381
    :cond_0
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 1382
    const-string v0, "com.huawei.hwid.ACTION_LOGOUT_CANCEL"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1383
    const-string v0, "com.huawei.hwid.ACTION_LOGOUT_FAIL"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1384
    const-string v0, "com.huawei.hwid.ACTION_REMOVE_ACCOUNT"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1386
    sget-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    const-string v1, "LogoutBroadcastReceiver"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1387
    const-string v0, "LogoutBroadcastReceiver"

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1389
    :cond_1
    new-instance v3, Lcom/huawei/hwid/api/common/e$b;

    invoke-direct {v3, p0, p1}, Lcom/huawei/hwid/api/common/e$b;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1391
    :try_start_0
    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1392
    const-string v0, "LogoutBroadcastReceiver"

    invoke-static {v3, v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1395
    goto :goto_0

    .line 1393
    :catch_0
    move-exception v4

    .line 1394
    const-string v0, "CloudAccountImpl"

    const-string v1, "BroadcastReceiver components are not allowed to register to receive intents"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1396
    :goto_0
    return-void
.end method

.method private static declared-synchronized d(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 9

    const-class v8, Lcom/huawei/hwid/api/common/e;

    monitor-enter v8

    .line 1776
    const/4 v2, 0x0

    .line 1777
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/api/common/e;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    .line 1778
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1779
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1780
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/content/BroadcastReceiver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1782
    :try_start_1
    invoke-virtual {p0, v6}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1783
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1784
    const/4 v2, 0x1

    .line 1788
    goto :goto_1

    .line 1785
    :catch_0
    move-exception v7

    .line 1787
    const-string v0, "CloudAccountImpl"

    const-string v1, "Exception"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1789
    :goto_1
    goto :goto_0

    .line 1790
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1791
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1794
    :cond_1
    monitor-exit v8

    return v2

    :catchall_0
    move-exception p0

    monitor-exit v8

    throw p0
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    .line 70
    sget-object v0, Lcom/huawei/hwid/api/common/e;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public static declared-synchronized e(Landroid/content/Context;)V
    .locals 1

    const-class v0, Lcom/huawei/hwid/api/common/e;

    monitor-enter v0

    .line 1168
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b/e;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1169
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private e(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 2045
    const-string v0, "AuthAppListIntent"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2046
    const v0, 0x138ddc0

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    return v0

    .line 2047
    :cond_0
    const-string v0, "remoteAuthIntent"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "serviceCountryChangeIntent"

    .line 2048
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2049
    :cond_1
    const v0, 0x138d5f0

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    return v0

    .line 2050
    :cond_2
    const v0, 0x138d9d8

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2051
    const/4 v0, 0x1

    return v0

    .line 2053
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private static f(Landroid/content/Context;)V
    .locals 4

    .line 356
    new-instance v0, Lcom/huawei/hwid/b;

    invoke-static {}, Lcom/huawei/hwid/d;->a()Lcom/huawei/hwid/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwid/b;-><init>(Lcom/huawei/hwid/c;)V

    new-instance v1, Lcom/huawei/hwid/usecase/InitDataUseCase;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/usecase/InitDataUseCase;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/huawei/hwid/usecase/InitDataUseCase$RequestValues;

    invoke-direct {v2}, Lcom/huawei/hwid/usecase/InitDataUseCase$RequestValues;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwid/b;->a(Lcom/huawei/hwid/UseCase;Lcom/huawei/hwid/UseCase$RequestValues;Lcom/huawei/hwid/UseCase$a;)V

    .line 358
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)Landroid/app/AlertDialog;
    .locals 3

    .line 1954
    if-nez p3, :cond_0

    .line 1955
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 1957
    :cond_0
    new-instance v2, Lcom/huawei/hwid/api/common/p;

    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v2, p1, p4, v0}, Lcom/huawei/hwid/api/common/p;-><init>(Landroid/app/Activity;Lcom/huawei/cloudservice/CloudRequestHandler;Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 1958
    const-string v0, "serviceToken"

    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1959
    const-string v0, "deviceId"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1960
    const-string v0, "deviceType"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1961
    const-string v0, "siteId"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->e()I

    move-result v1

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1962
    invoke-static {p1, p2, p3, v2}, Lcom/huawei/hwid/api/common/a/a;->a(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/e;->c:Landroid/app/AlertDialog;

    .line 1963
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->c:Landroid/app/AlertDialog;

    return-object v0
.end method

.method public a()Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 1

    .line 682
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    return-object v0
.end method

.method public a(Landroid/content/Context;ILcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 3

    .line 2099
    const-string v2, ""

    .line 2100
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 2101
    const-string v2, "realNameInfoIntent"

    goto :goto_0

    .line 2102
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p2, :cond_1

    .line 2103
    const-string v2, "simpleIdentyVerifyIntent"

    goto :goto_0

    .line 2104
    :cond_1
    const/4 v0, 0x2

    if-ne v0, p2, :cond_2

    .line 2105
    const-string v2, "identyCamVerifyIntent"

    goto :goto_0

    .line 2106
    :cond_2
    const/4 v0, 0x3

    if-ne v0, p2, :cond_3

    .line 2107
    const-string v2, "bindCardVerifyIntent"

    goto :goto_0

    .line 2108
    :cond_3
    const/4 v0, 0x4

    if-ne v0, p2, :cond_4

    .line 2109
    const-string v2, "bindSecurityAccountIntent"

    goto :goto_0

    .line 2111
    :cond_4
    const-string v0, "CloudAccountImpl"

    const-string v1, "flag is invalid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2112
    return-void

    .line 2114
    :goto_0
    invoke-virtual {p0, p1, v2, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/IntentResultHandler;)V

    .line 2115
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 3

    .line 969
    invoke-static {p1, p3}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 970
    const-string v0, "CloudAccountImpl"

    const-string v1, "getUserInfo: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 971
    return-void

    .line 973
    :cond_0
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 974
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 975
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 976
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 977
    return-void

    .line 979
    :cond_1
    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 983
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 984
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 985
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 986
    return-void

    .line 989
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v2

    .line 991
    invoke-static {p1, v2, p2, p3}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 992
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 4

    .line 2004
    invoke-static {p1, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Lcom/huawei/cloudservice/IntentResultHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2005
    const-string v0, "CloudAccountImpl"

    const-string v1, "getAccountsByType: context or handler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2006
    return-void

    .line 2008
    :cond_0
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2009
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use hwid checkIsUseHuaweiAccount false"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2010
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2011
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2012
    return-void

    .line 2014
    :cond_1
    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2015
    const-string v0, "CloudAccountImpl"

    const-string v1, "false hwid is not exit checkIsInstallHuaweiAccount"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2016
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2017
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2018
    return-void

    .line 2020
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwid/api/common/e;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2021
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid version is low"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2022
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is low version"

    const/16 v1, 0x23

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2023
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2024
    return-void

    .line 2027
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 2028
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not login"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2029
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not login"

    const/16 v1, 0x1f

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2030
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2031
    return-void

    .line 2034
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v2

    .line 2035
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2036
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not login"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2037
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not login"

    const/16 v1, 0x1f

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2038
    invoke-interface {p3, v3}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2039
    return-void

    .line 2041
    :cond_5
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, p2, v2, v0, p3}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/IntentResultHandler;)V

    .line 2042
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 10

    .line 768
    invoke-static {p1, p5}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 769
    const-string v0, "CloudAccountImpl"

    const-string v1, "serviceTokenAuth: context or requestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 770
    return-void

    .line 772
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-gez p4, :cond_2

    .line 773
    :cond_1
    const-string v0, "CloudAccountImpl"

    const-string v1, "error: parameter tokenType or st is invalid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 774
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "parameter is invalid"

    const/16 v1, 0xc

    invoke-direct {v7, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 775
    invoke-interface {p5, v7}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 776
    return-void

    .line 778
    :cond_2
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 779
    const-string v0, "CloudAccountImpl"

    const-string v1, " have no network"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 780
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_no_network_content"

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v7, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 782
    invoke-interface {p5, v7}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 783
    return-void

    .line 785
    :cond_3
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 786
    const-string v0, "CloudAccountImpl"

    const-string v1, "checkIsUseHuaweiAccount false can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 787
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v7, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 788
    invoke-interface {p5, v7}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 789
    return-void

    .line 791
    :cond_4
    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 792
    const-string v0, "CloudAccountImpl"

    const-string v1, "huawei is not exit checkIsInstallHuaweiAccount false"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 793
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v7, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 794
    invoke-interface {p5, v7}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 795
    return-void

    .line 798
    :cond_5
    invoke-static {p2}, Lcom/huawei/hwid/core/d/d;->a(Ljava/lang/String;)V

    .line 799
    const-string v7, ""

    .line 800
    const-string v8, ""

    .line 801
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 802
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->i()Ljava/lang/String;

    move-result-object v7

    .line 803
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->k()Ljava/lang/String;

    move-result-object v8

    .line 805
    :cond_6
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/d;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, v7

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwid/core/b/a/a/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    move-object v9, v0

    .line 806
    const/4 v0, 0x0

    invoke-virtual {v9, p1, v9, v0, p5}, Lcom/huawei/hwid/core/b/a/a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 807
    return-void
.end method

.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)Z
    .locals 3

    .line 1001
    const-string v0, "CloudAccountImpl"

    const-string v1, "updateUserInfo enter"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1002
    invoke-static {p1, p3}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p2, :cond_1

    .line 1003
    :cond_0
    const-string v0, "CloudAccountImpl"

    const-string v1, "updataUserinfo: context or cloudRequestHandler or info is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1004
    const/4 v0, 0x0

    return v0

    .line 1006
    :cond_1
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1007
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1008
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1009
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1010
    const/4 v0, 0x0

    return v0

    .line 1012
    :cond_2
    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1016
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1017
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1018
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1019
    const/4 v0, 0x0

    return v0

    .line 1022
    :cond_3
    const v0, 0x135c0e0

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1023
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid apk version is low"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1024
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is low version"

    const/16 v1, 0x23

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1025
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1026
    const/4 v0, 0x0

    return v0

    .line 1029
    :cond_4
    new-instance v0, Lcom/huawei/hwid/api/common/e$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e$3;-><init>(Lcom/huawei/hwid/api/common/e;Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1035
    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/e$3;->start()V

    .line 1037
    const/4 v0, 0x1

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 914
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)Z
    .locals 7

    .line 1086
    invoke-static {p1, p3}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1087
    :cond_0
    const-string v0, "CloudAccountImpl"

    const-string v1, "updataUserinfo: context or cloudRequestHandler or info is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1088
    const/4 v0, 0x0

    return v0

    .line 1090
    :cond_1
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1091
    const-string v0, "CloudAccountImpl"

    const-string v1, "can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1092
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1093
    invoke-interface {p3, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1094
    const/4 v0, 0x0

    return v0

    .line 1096
    :cond_2
    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1100
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1101
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1102
    invoke-interface {p3, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1103
    const/4 v0, 0x0

    return v0

    .line 1106
    :cond_3
    const v0, 0x135c0e0

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1107
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid apk version is low"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1108
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is low version"

    const/16 v1, 0x23

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1109
    invoke-interface {p3, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1110
    const/4 v0, 0x0

    return v0

    .line 1113
    :cond_4
    invoke-direct {p0, p2}, Lcom/huawei/hwid/api/common/e;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_5

    .line 1114
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "head pic not exist"

    const/16 v1, 0x2f

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 1115
    invoke-interface {p3, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1116
    const/4 v0, 0x0

    return v0

    .line 1119
    :cond_5
    iput-object p2, p0, Lcom/huawei/hwid/api/common/e;->g:Ljava/lang/String;

    .line 1120
    iput-object p1, p0, Lcom/huawei/hwid/api/common/e;->e:Landroid/content/Context;

    .line 1121
    iput-object p3, p0, Lcom/huawei/hwid/api/common/e;->f:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 1122
    move-object v0, p0

    move-object v1, p1

    iget-object v2, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->h()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v3}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->e()I

    move-result v4

    iget-object v5, p0, Lcom/huawei/hwid/api/common/e;->h:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1124
    const/4 v0, 0x1

    return v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 2

    .line 921
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->q()Landroid/os/Bundle;

    move-result-object v1

    .line 922
    return-object v1
.end method

.method public c(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 4

    .line 2057
    invoke-static {p1, p2}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2058
    const-string v0, "CloudAccountImpl"

    const-string v1, "getUserInfo: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2059
    return-void

    .line 2061
    :cond_0
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2062
    const-string v0, "CloudAccountImpl"

    const-string v1, "checkIsUseHuaweiAccount can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2063
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2064
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2065
    return-void

    .line 2067
    :cond_1
    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2068
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit checkIsInstallHuaweiAccount"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2069
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2070
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2071
    return-void

    .line 2074
    :cond_2
    const v0, 0x138d9d8

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2075
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid version is low"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2076
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is low version"

    const/16 v1, 0x23

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2077
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2078
    return-void

    .line 2081
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 2082
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not login"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2083
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not login"

    const/16 v1, 0x1f

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2084
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2085
    return-void

    .line 2088
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v2

    .line 2089
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2090
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not login"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2091
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not login"

    const/16 v1, 0x1f

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 2092
    invoke-interface {p2, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 2093
    return-void

    .line 2095
    :cond_5
    invoke-static {p1, v2, p2}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 2096
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 4

    .line 931
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 932
    const-string v0, "CloudAccountImpl"

    const-string v1, "cloudAccountimpl context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 933
    return-void

    .line 935
    :cond_0
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 936
    const-string v0, "CloudAccountImpl"

    const-string v1, "install apk logout"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 937
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e;->a:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 945
    :cond_1
    const-string v0, ""

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 946
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 947
    invoke-static {p1}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-interface {v0, p1, v2}, Lcom/huawei/hwid/b/b;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 949
    invoke-static {}, Lcom/huawei/hwid/api/common/o;->a()Lcom/huawei/cloudservice/LoginHandler;

    move-result-object v3

    .line 950
    const-string v0, "CloudAccountImpl"

    const-string v1, "gethandle"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 952
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 955
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/huawei/cloudservice/CloudAccount;

    const/4 v1, -0x1

    invoke-interface {v3, v0, v1}, Lcom/huawei/cloudservice/LoginHandler;->onLogout([Lcom/huawei/cloudservice/CloudAccount;I)V

    .line 958
    :cond_2
    return-void
.end method
