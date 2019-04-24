.class public Lcom/huawei/health/suggestion/model/AccountInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private huid:Ljava/lang/String;

.field private isLogin:Z

.field private serviceToken:Ljava/lang/String;

.field private siteId:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;I)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/AccountInfo;->huid:Ljava/lang/String;

    .line 14
    iput-boolean p2, p0, Lcom/huawei/health/suggestion/model/AccountInfo;->isLogin:Z

    .line 15
    iput-object p3, p0, Lcom/huawei/health/suggestion/model/AccountInfo;->serviceToken:Ljava/lang/String;

    .line 16
    iput p4, p0, Lcom/huawei/health/suggestion/model/AccountInfo;->siteId:I

    .line 17
    return-void
.end method


# virtual methods
.method public acquireHuid()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/AccountInfo;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public acquireServiceToken()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/AccountInfo;->serviceToken:Ljava/lang/String;

    return-object v0
.end method

.method public acquireSiteId()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/health/suggestion/model/AccountInfo;->siteId:I

    return v0
.end method

.method public isLogin()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/AccountInfo;->isLogin:Z

    return v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 39
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 43
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 47
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 51
    return-void
.end method
