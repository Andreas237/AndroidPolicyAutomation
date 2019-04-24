.class public Lcom/huawei/cloudservice/opensdk/OutReturn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addFailCode(Landroid/os/Bundle;I)Landroid/os/Bundle;
    .locals 1

    .line 150
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 151
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 153
    :cond_0
    const-string v0, "ret_code"

    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 154
    return-object p0
.end method

.method public static addSuccessCode(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    .line 142
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 143
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 145
    :cond_0
    const-string v0, "ret_code"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 146
    return-object p0
.end method

.method public static creatParamErrRet(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 134
    const/16 v0, 0x7d0

    invoke-static {v0, p0}, Lcom/huawei/cloudservice/opensdk/OutReturn;->creatReturn(ILjava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public static creatReturn(ILjava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .line 127
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 128
    const-string v0, "ret_code"

    invoke-virtual {v1, v0, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 129
    const-string v0, "err_info"

    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    return-object v1
.end method

.method public static creatRunTimeErrRet(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 138
    const/16 v0, 0x64

    invoke-static {v0, p0}, Lcom/huawei/cloudservice/opensdk/OutReturn;->creatReturn(ILjava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public static final getAccessToken(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    .line 91
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 92
    const-string v0, ""

    return-object v0

    .line 94
    :cond_0
    const-string v0, "access_token"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final getErrInfo(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    .line 51
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 52
    const-string v0, ""

    return-object v0

    .line 54
    :cond_0
    const-string v0, "err_info"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final getNSPSTATUS(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 2

    .line 83
    invoke-static {p0}, Lcom/huawei/cloudservice/opensdk/OutReturn;->getRetHeads(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    .line 84
    const-string v0, "NSP_STATUS"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    const-string v0, "NSP_STATUS"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 87
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static final getRetCode(Landroid/os/Bundle;)I
    .locals 2

    .line 44
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 45
    const/4 v0, -0x1

    return v0

    .line 47
    :cond_0
    const-string v0, "ret_code"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static final getRetContent(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    .line 65
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 66
    const-string v0, ""

    return-object v0

    .line 68
    :cond_0
    const-string v0, "res_content"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final getRetHeads(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    .line 72
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 73
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0

    .line 75
    :cond_0
    const-string v0, "res_head"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 76
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 77
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0

    .line 79
    :cond_1
    return-object v1
.end method

.method public static final getRetResCode(Landroid/os/Bundle;)I
    .locals 1

    .line 58
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 59
    const/4 v0, -0x1

    return v0

    .line 61
    :cond_0
    const-string v0, "res_code"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static isRequestSuccess(Landroid/os/Bundle;)Z
    .locals 2

    .line 98
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 99
    const/4 v0, 0x0

    return v0

    .line 101
    :cond_0
    invoke-static {p0}, Lcom/huawei/cloudservice/opensdk/OutReturn;->getRetCode(Landroid/os/Bundle;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
