.class public Lo/djl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/login/ui/login/LoginInit;

.field private static b:Lcom/huawei/up/model/UserInfomation;


# instance fields
.field e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const/4 v0, 0x0

    sput-object v0, Lo/djl;->a:Lcom/huawei/login/ui/login/LoginInit;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const-class v0, Lo/djl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/djl;->e:Ljava/lang/String;

    return-void
.end method

.method public static a()V
    .locals 1

    .line 44
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lo/ebk;->b()V

    .line 46
    return-void
.end method

.method public static b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 49
    new-instance v0, Lo/djl$3;

    invoke-direct {v0, p3}, Lo/djl$3;-><init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 64
    invoke-static {p2}, Lo/ebk;->c(Z)V

    .line 65
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v1

    .line 66
    invoke-virtual {v1, v0}, Lo/ebk;->setAdapter(Lo/eab;)V

    .line 67
    invoke-virtual {v1, p1, p0}, Lo/ebk;->c(Lo/dav;Landroid/content/Context;)V

    .line 69
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/dao;
    .locals 3

    .line 83
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    sput-object v0, Lo/djl;->a:Lcom/huawei/login/ui/login/LoginInit;

    .line 84
    sget-object v0, Lo/djl;->a:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    new-instance v1, Lo/dao;

    invoke-direct {v1}, Lo/dao;-><init>()V

    .line 86
    sget-object v0, Lo/djl;->a:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dao;->e(Ljava/lang/String;)V

    .line 87
    sget-object v0, Lo/djl;->a:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    invoke-virtual {v1, v0}, Lo/dao;->a(Z)V

    .line 88
    sget-object v0, Lo/djl;->a:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dao;->a(Ljava/lang/String;)V

    .line 89
    sget-object v0, Lo/djl;->a:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dao;->b(I)V

    .line 90
    invoke-static {p0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    invoke-static {p0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    .line 91
    if-eqz v2, :cond_0

    .line 92
    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dao;->d(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dao;->c(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dao;->a(I)V

    .line 95
    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    invoke-virtual {v1, v0}, Lo/dao;->a(F)V

    .line 96
    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dao;->c(I)V

    .line 97
    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dao;->d(I)V

    .line 100
    :cond_0
    return-object v1

    .line 102
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/content/Context;ILo/dav;)V
    .locals 1

    .line 34
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v0

    .line 35
    invoke-virtual {v0, p0, p1, p2}, Lo/ebk;->a(Landroid/content/Context;ILo/dav;)V

    .line 36
    return-void
.end method

.method public static e(Landroid/content/Context;Lo/dau;)V
    .locals 2

    .line 78
    invoke-static {p0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    sput-object v0, Lo/djl;->b:Lcom/huawei/up/model/UserInfomation;

    .line 79
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v0

    sget-object v1, Lo/djl;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0, p0, p1, v1}, Lo/ebk;->a(Landroid/content/Context;Lo/dau;Lcom/huawei/up/model/UserInfomation;)V

    .line 80
    return-void
.end method
