.class public Lcom/huawei/hihealthservice/auth/HiAuthManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/auth/IAuth;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/auth/HiAuthManager$Instance;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Debug_HiAuthManager"

.field private static mContext:Landroid/content/Context; = null


# instance fields
.field private rawQueryManager:Lo/cqn;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    sget-object v0, Lcom/huawei/hihealthservice/auth/HiAuthManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAuthManager;->rawQueryManager:Lo/cqn;

    .line 32
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hihealthservice/auth/HiAuthManager$1;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/hihealthservice/auth/HiAuthManager;-><init>()V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/auth/HiAuthManager;
    .locals 1

    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/auth/HiAuthManager;->mContext:Landroid/content/Context;

    .line 44
    sget-object v0, Lcom/huawei/hihealthservice/auth/HiAuthManager$Instance;->instance:Lcom/huawei/hihealthservice/auth/HiAuthManager;

    return-object v0
.end method

.method private isNotExist(IILjava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hihealthservice/auth/HiAuthException;
        }
    .end annotation

    .line 91
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 92
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkReadAuth permissions is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const/4 v0, 0x0

    return v0

    .line 95
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 96
    invoke-static {}, Lo/cqr;->a()Lo/cqr;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cqr;->b(II)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 97
    invoke-static {}, Lo/cqr;->a()Lo/cqr;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v6}, Lo/cqr;->d(IILjava/lang/String;)Z

    move-result v4

    .line 98
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkReadAuth permissions from cache, isExist = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAuthManager;->rawQueryManager:Lo/cqn;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1, v6}, Lo/cqn;->e(IIILjava/lang/String;)Z

    move-result v4

    .line 101
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkReadAuth permissions from database, isExist = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :goto_1
    if-nez v4, :cond_2

    .line 104
    const/4 v0, 0x1

    return v0

    .line 106
    :cond_2
    goto :goto_0

    .line 107
    :cond_3
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public checkDeleteAuth(II[I)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hihealthservice/auth/HiAuthException;
        }
    .end annotation

    .line 112
    invoke-static {p3}, Lo/cni;->d([I)Ljava/util/List;

    move-result-object v4

    .line 113
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDeleteAuth permissions are "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDeleteAuth permissions is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void

    .line 120
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 121
    invoke-static {}, Lo/cqr;->a()Lo/cqr;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cqr;->b(II)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 122
    invoke-static {}, Lo/cqr;->a()Lo/cqr;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v7}, Lo/cqr;->d(IILjava/lang/String;)Z

    move-result v5

    .line 123
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDeleteAuth permissions from cache, isExist = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAuthManager;->rawQueryManager:Lo/cqn;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1, v7}, Lo/cqn;->e(IIILjava/lang/String;)Z

    move-result v5

    .line 126
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDeleteAuth permissions from database, isExist = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :goto_1
    if-nez v5, :cond_2

    .line 129
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDeleteAuth permissions is not exist, permissions = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    new-instance v0, Lcom/huawei/hihealthservice/auth/HiAuthException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkDeleteAuth fail not exist permission : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/auth/HiAuthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :cond_2
    goto/16 :goto_0

    .line 133
    :cond_3
    return-void
.end method

.method public checkInsertAuth(IILjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hihealthservice/auth/HiAuthException;
        }
    .end annotation

    .line 49
    invoke-static {p3}, Lo/cni;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 50
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInsertAuth permissions are "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInsertAuth permissions is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    return-void

    .line 57
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 58
    invoke-static {}, Lo/cqr;->a()Lo/cqr;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cqr;->b(II)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 59
    invoke-static {}, Lo/cqr;->a()Lo/cqr;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v7}, Lo/cqr;->d(IILjava/lang/String;)Z

    move-result v5

    .line 60
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInsertAuth permissions from cache, isExist = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAuthManager;->rawQueryManager:Lo/cqn;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1, v7}, Lo/cqn;->e(IIILjava/lang/String;)Z

    move-result v5

    .line 63
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInsertAuth permissions from database, isExist = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    :goto_1
    if-nez v5, :cond_2

    .line 66
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInsertAuth permissions is not exist, permissions = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    new-instance v0, Lcom/huawei/hihealthservice/auth/HiAuthException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkInsertAuth fail not exist permission : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/auth/HiAuthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_2
    goto/16 :goto_0

    .line 70
    :cond_3
    return-void
.end method

.method public checkReadAuth(II[I)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hihealthservice/auth/HiAuthException;
        }
    .end annotation

    .line 74
    invoke-static {p3}, Lo/cni;->c([I)Ljava/util/List;

    move-result-object v4

    .line 75
    invoke-static {p3}, Lo/cni;->a([I)Ljava/util/List;

    move-result-object v5

    .line 76
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkReadAuth permissions are "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " or "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v5}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkReadAuth permissions is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    return-void

    .line 81
    :cond_0
    invoke-direct {p0, p1, p2, v4}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->isNotExist(IILjava/util/List;)Z

    move-result v6

    .line 82
    invoke-direct {p0, p1, p2, v5}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->isNotExist(IILjava/util/List;)Z

    move-result v7

    .line 83
    if-eqz v6, :cond_1

    if-eqz v7, :cond_1

    .line 84
    const-string v0, "Debug_HiAuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkReadAuth permissions is not exist, permissions = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    new-instance v0, Lcom/huawei/hihealthservice/auth/HiAuthException;

    const-string v1, "checkReadAuth fail not exist permission : 16842758"

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/auth/HiAuthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_1
    return-void
.end method
