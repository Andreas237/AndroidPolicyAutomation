.class public Lcom/huawei/health/suggestion/model/FitnessUserInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brw;


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mContext:Landroid/content/Context;

.field private mHwAccountInfo:Lo/dao;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const-class v0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/dao;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mContext:Landroid/content/Context;

    .line 24
    iput-object p2, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    .line 25
    return-void
.end method


# virtual methods
.method public getAge()I
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    invoke-virtual {v0}, Lo/dao;->b()I

    move-result v1

    .line 68
    return v1

    .line 70
    :cond_0
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v0

    return v0
.end method

.method public getGender()I
    .locals 5

    .line 40
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    if-eqz v0, :cond_1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    invoke-virtual {v0}, Lo/dao;->c()I

    move-result v4

    .line 42
    if-nez v4, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 44
    :cond_1
    sget-object v0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---getGender: 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    const/4 v0, 0x1

    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    invoke-virtual {v0}, Lo/dao;->e()I

    move-result v0

    return v0

    .line 53
    :cond_0
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    return v0
.end method

.method public getNicaName()Ljava/lang/String;
    .locals 5

    .line 29
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    invoke-virtual {v0}, Lo/dao;->d()Ljava/lang/String;

    move-result-object v4

    .line 31
    return-object v4

    .line 33
    :cond_0
    sget-object v0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---getNicaName: --"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const-string v0, "--"

    return-object v0
.end method

.method public getPortrait()Landroid/net/Uri;
    .locals 3

    .line 75
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    .line 77
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 78
    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    .line 84
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getWeight()F
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;->mHwAccountInfo:Lo/dao;

    invoke-virtual {v0}, Lo/dao;->a()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    return v0

    .line 61
    :cond_0
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    return v0
.end method
