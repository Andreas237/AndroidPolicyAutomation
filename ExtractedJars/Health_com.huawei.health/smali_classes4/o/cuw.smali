.class public Lo/cuw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/huawei/hihealthservice/auth/HiUserAuth;)I
    .locals 7

    .line 64
    if-nez p1, :cond_0

    .line 65
    const/4 v0, 0x0

    return v0

    .line 67
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/auth/HiUserAuth;->getScope()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 68
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 69
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    const/4 v0, 0x1

    return v0

    .line 68
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 73
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Lcom/huawei/hihealthservice/auth/HiAuthorization;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/auth/HiAuthorization;)Ljava/util/List<Lo/coa;>;"
        }
    .end annotation

    .line 28
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 29
    const/4 v0, 0x0

    return-object v0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/auth/HiAuthorization;->getScopes()Ljava/util/List;

    move-result-object v4

    .line 33
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 34
    :cond_1
    const-string v0, "Debug_HiAuthUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiscopes is nulll or empty hisopes = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    const/4 v0, 0x0

    return-object v0

    .line 38
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 39
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealthservice/auth/HiScope;

    .line 40
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/auth/HiScope;->getPermissions()[Ljava/lang/String;

    move-result-object v8

    .line 41
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    array-length v0, v8

    if-gtz v0, :cond_4

    .line 42
    :cond_3
    const-string v0, "Debug_HiAuthUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "permissions is nulll or empty permissions = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_4
    move-object v9, v8

    array-length v10, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_6

    aget-object v12, v9, v11

    .line 47
    invoke-static {v12}, Lo/cni;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 48
    goto :goto_2

    .line 51
    :cond_5
    new-instance v13, Lo/coa;

    invoke-direct {v13}, Lo/coa;-><init>()V

    .line 52
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/auth/HiScope;->getId()I

    move-result v0

    invoke-virtual {v13, v0}, Lo/coa;->e(I)V

    .line 53
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/auth/HiScope;->getUri()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/coa;->a(Ljava/lang/String;)V

    .line 54
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/auth/HiScope;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/coa;->b(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v13, v12}, Lo/coa;->e(Ljava/lang/String;)V

    .line 56
    invoke-interface {v5, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 58
    :cond_6
    goto/16 :goto_0

    .line 60
    :cond_7
    return-object v5
.end method
