.class public Lcom/huawei/hwid/api/common/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/cloudservice/LoginHandler;

.field private static b:Z

.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/hwid/api/common/o;->b:Z

    return-void
.end method

.method public static a()Lcom/huawei/cloudservice/LoginHandler;
    .locals 1

    .line 49
    sget-object v0, Lcom/huawei/hwid/api/common/o;->a:Lcom/huawei/cloudservice/LoginHandler;

    return-object v0
.end method

.method static a(Landroid/content/Context;Landroid/os/Bundle;)Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 15

    .line 152
    new-instance v2, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    .line 153
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    .line 154
    const-string v0, "accountName"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 155
    const-string v0, "userId"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 156
    const-string v0, "deviceId"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 157
    const-string v0, "subDeviceId"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 158
    const-string v0, "deviceType"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 159
    const-string v0, "siteId"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 160
    const-string v0, "serviceToken"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 161
    const-string v0, "accountType"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 162
    const-string v0, "loginUserName"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 163
    const-string v0, "countryIsoCode"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 164
    const-string v0, "uuid"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 165
    invoke-virtual {v2, v3}, Lcom/huawei/hwid/core/datatype/HwAccount;->b(Ljava/lang/String;)V

    .line 166
    invoke-virtual {v2, v5}, Lcom/huawei/hwid/core/datatype/HwAccount;->h(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v2, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->i(Ljava/lang/String;)V

    .line 168
    invoke-virtual {v2, v7}, Lcom/huawei/hwid/core/datatype/HwAccount;->j(Ljava/lang/String;)V

    .line 169
    invoke-virtual {v2, v8}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(I)V

    .line 170
    invoke-virtual {v2, v9}, Lcom/huawei/hwid/core/datatype/HwAccount;->f(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v2, v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->d(Ljava/lang/String;)V

    .line 173
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v14

    .line 174
    invoke-virtual {v2, v14}, Lcom/huawei/hwid/core/datatype/HwAccount;->c(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v2, v10}, Lcom/huawei/hwid/core/datatype/HwAccount;->g(Ljava/lang/String;)V

    .line 176
    invoke-virtual {v2, v11}, Lcom/huawei/hwid/core/datatype/HwAccount;->k(Ljava/lang/String;)V

    .line 177
    invoke-virtual {v2, v12}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v2, v13}, Lcom/huawei/hwid/core/datatype/HwAccount;->n(Ljava/lang/String;)V

    .line 180
    :cond_0
    return-object v2
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 82
    sget-object v0, Lcom/huawei/hwid/api/common/o;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    const-string v0, "curName"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/f;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 85
    :cond_0
    const-string v0, "SDKUtil"

    const-string v1, "getCurrentLoginUserName"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    sget-object v0, Lcom/huawei/hwid/api/common/o;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-class v2, Lcom/huawei/hwid/api/common/o;

    monitor-enter v2

    .line 76
    :try_start_0
    sput-object p1, Lcom/huawei/hwid/api/common/o;->c:Ljava/lang/String;

    .line 77
    const-string v0, "curName"

    sget-object v1, Lcom/huawei/hwid/api/common/o;->c:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, "SDKUtil"

    const-string v1, "setCurrentLoginUserName"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized a(Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 3

    const-class v2, Lcom/huawei/hwid/api/common/o;

    monitor-enter v2

    .line 44
    :try_start_0
    sput-object p0, Lcom/huawei/hwid/api/common/o;->a:Lcom/huawei/cloudservice/LoginHandler;

    .line 45
    const-string v0, "SDKUtil"

    const-string v1, "setHandler, mHandler is "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static a(Landroid/content/Context;I)Z
    .locals 3

    .line 110
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 111
    const-string v0, "SDKUtil"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const/4 v0, 0x0

    return v0

    .line 115
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->d(Landroid/content/Context;)I

    move-result v2

    .line 116
    if-ge v2, p1, :cond_1

    .line 117
    const/4 v0, 0x1

    return v0

    .line 119
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 3

    .line 223
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 224
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 225
    const/high16 v0, 0x10000

    invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    .line 226
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 227
    const/4 v0, 0x1

    return v0

    .line 230
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z
    .locals 3

    .line 130
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 131
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 132
    const-string v0, "SDKUtil"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "context is null"

    const/16 v1, 0xc

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 134
    invoke-interface {p1, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 135
    const/4 v0, 0x0

    return v0

    .line 137
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 139
    :cond_1
    const-string v0, "SDKUtil"

    const-string v1, "requestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .line 96
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 97
    const-string v0, "SDKUtil"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->j(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 184
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 186
    const-string v0, "com.huawei.hwid"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 187
    iget-object v4, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 188
    const-string v0, "SDKUtil"

    const-string v1, "versionName "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 189
    return-object v4

    .line 191
    :catch_0
    move-exception v3

    .line 192
    const-string v0, "SDKUtil"

    const-string v1, "NameNotFoundException getVersionTag error = "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    goto :goto_0

    .line 193
    :catch_1
    move-exception v3

    .line 194
    const-string v0, "SDKUtil"

    const-string v1, "Exception getVersionTag error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    :goto_0
    const-string v0, ""

    return-object v0
.end method

.method public static d(Landroid/content/Context;)I
    .locals 5

    .line 200
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 202
    const-string v0, "com.huawei.hwid"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 203
    iget v4, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 204
    const-string v0, "SDKUtil"

    const-string v1, "versionCode "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 205
    return v4

    .line 207
    :catch_0
    move-exception v3

    .line 208
    const-string v0, "SDKUtil"

    const-string v1, "NameNotFoundException error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    goto :goto_0

    .line 209
    :catch_1
    move-exception v3

    .line 210
    const-string v0, "SDKUtil"

    const-string v1, "Exception error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
