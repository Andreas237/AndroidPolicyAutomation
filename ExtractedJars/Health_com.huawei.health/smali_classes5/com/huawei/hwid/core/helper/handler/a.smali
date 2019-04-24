.class public Lcom/huawei/hwid/core/helper/handler/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/huawei/hwid/core/helper/handler/a;->b:Landroid/content/Context;

    .line 51
    return-void
.end method

.method private a(II)Ljava/lang/String;
    .locals 3

    .line 145
    const/4 v2, 0x0

    .line 147
    const/16 v0, 0x3ef

    if-ne v0, p1, :cond_0

    .line 148
    iget-object v0, p0, Lcom/huawei/hwid/core/helper/handler/a;->b:Landroid/content/Context;

    const-string v1, "CS_network_connect_error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/core/helper/handler/a;->b:Landroid/content/Context;

    const-string v1, "CS_ERR_for_cannot_conn_service"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 153
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/core/helper/handler/a;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 0

    .line 54
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0

    .line 57
    return-void
.end method

.method public c(Landroid/os/Bundle;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Bundle;)Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 30
    const-string v0, "UIHandlerErrCodeList"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 31
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 34
    :cond_0
    return-object v1
.end method

.method public d(Landroid/os/Bundle;)Z
    .locals 1

    .line 39
    const-string v0, "isUIHandlerAllErrCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 12

    .line 62
    const-string v0, "responseCode"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 63
    const-string v0, "resultCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 68
    const-string v0, "errorCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/b/a/b;->a(Landroid/os/Bundle;I)I

    move-result v4

    .line 69
    const-string v0, "errorDesc"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 72
    const/16 v0, 0xbb8

    if-ne v0, v2, :cond_0

    .line 74
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 75
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "token invalid"

    const/16 v1, 0x1003

    invoke-direct {v7, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 76
    const-string v0, "requestError"

    invoke-virtual {v6, v0, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 77
    invoke-virtual {p0, v6}, Lcom/huawei/hwid/core/helper/handler/a;->b(Landroid/os/Bundle;)V

    .line 78
    goto/16 :goto_2

    :cond_0
    const/16 v0, 0xc8

    if-eq v0, v2, :cond_1

    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->d(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 80
    :cond_1
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->c(Landroid/os/Bundle;)Ljava/util/ArrayList;

    move-result-object v6

    .line 83
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 85
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 87
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->d(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 89
    :cond_2
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 90
    const/4 v0, 0x0

    if-ne v0, v3, :cond_3

    .line 91
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->a(Landroid/os/Bundle;)V

    goto :goto_0

    .line 93
    :cond_3
    new-instance v8, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v8, v4, v5}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 94
    const-string v0, "requestError"

    invoke-virtual {v7, v0, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 95
    const-string v0, "isRequestSuccess"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 96
    invoke-virtual {p0, v7}, Lcom/huawei/hwid/core/helper/handler/a;->b(Landroid/os/Bundle;)V

    .line 100
    :goto_0
    goto :goto_1

    .line 109
    :cond_4
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 110
    new-instance v8, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-static {v5}, Lcom/huawei/hwid/core/encrypt/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v4, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 111
    const-string v0, "requestError"

    invoke-virtual {v7, v0, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 112
    invoke-virtual {p0, v7}, Lcom/huawei/hwid/core/helper/handler/a;->b(Landroid/os/Bundle;)V

    .line 114
    :goto_1
    goto :goto_2

    .line 117
    :cond_5
    move v6, v2

    .line 118
    const-string v7, ""

    .line 119
    move v8, v3

    .line 120
    const/16 v0, 0x133

    if-ne v6, v0, :cond_6

    .line 121
    const v8, 0x42c21d0

    .line 123
    :cond_6
    const-string v0, "RequestManager"

    const-string v1, "network is unavailable, code = "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    invoke-direct {p0, v6, v8}, Lcom/huawei/hwid/core/helper/handler/a;->a(II)Ljava/lang/String;

    move-result-object v7

    .line 132
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 133
    new-instance v10, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v10, v6, v7}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 134
    const-string v0, "requestError"

    invoke-virtual {v9, v0, v10}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 136
    const-string v0, "yyyy/MM/dd HH:mm:ss:SSS"

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 137
    invoke-virtual {p0, v9}, Lcom/huawei/hwid/core/helper/handler/a;->b(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    :goto_2
    goto :goto_3

    .line 139
    :catch_0
    move-exception v2

    .line 140
    const-string v0, "RequestCallback"

    const-string v1, "Throwable"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    :goto_3
    return-void
.end method
