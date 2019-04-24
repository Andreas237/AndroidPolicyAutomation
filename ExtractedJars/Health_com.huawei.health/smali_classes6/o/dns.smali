.class public Lo/dns;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dnr;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 40
    const-string v0, "NULLAccountDataMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataMgr sync,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 4

    .line 18
    const-string v0, "NULLAccountDataMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataMgr init,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    return-void
.end method

.method public b()Lcom/huawei/up/model/UserInfomation;
    .locals 4

    .line 28
    const-string v0, "NULLAccountDataMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataMgr getUserInfo,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 4

    .line 23
    const-string v0, "NULLAccountDataMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataMgr destroy,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    return-void
.end method

.method public b(Lo/dod$e$b;)V
    .locals 4

    .line 45
    const-string v0, "NULLAccountDataMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataMgr sync,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void
.end method

.method public d(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 4

    .line 34
    const-string v0, "NULLAccountDataMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataMgr setUserInfo,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    const/4 v0, -0x1

    invoke-static {p2, v0}, Lo/doe;->a(Lo/dod$b$d;I)V

    .line 36
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 50
    const-string v0, "NULLAccountDataMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataMgr setNameByAccount,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void
.end method

.method public e()Z
    .locals 1

    .line 55
    const/4 v0, 0x0

    return v0
.end method
