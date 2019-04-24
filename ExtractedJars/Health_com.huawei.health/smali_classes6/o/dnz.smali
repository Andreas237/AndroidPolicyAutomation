.class public Lo/dnz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dny;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 38
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 4

    .line 21
    const-string v0, "NULLAccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataExtMgr destroy,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 4

    .line 16
    const-string v0, "NULLAccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataExtMgr init,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    return-void
.end method

.method public e()Lcom/huawei/up/model/UserInfomation;
    .locals 4

    .line 32
    const-string v0, "NULLAccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataExtMgr getUserInfo,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 4

    .line 26
    const-string v0, "NULLAccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NULLAccountDataExtMgr setUserInfo,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    const/4 v0, -0x1

    invoke-static {p2, v0}, Lo/doe;->a(Lo/dod$b$d;I)V

    .line 28
    return-void
.end method
