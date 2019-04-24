.class public Lcom/huawei/wallet/model/unicard/BankAppInfo;
.super Lcom/huawei/wallet/model/unicard/BaseInfo;
.source "SourceFile"


# instance fields
.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/wallet/model/unicard/BaseInfo;-><init>()V

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/wallet/model/unicard/BankAppInfo;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 66
    if-nez p1, :cond_0

    .line 68
    const/4 v0, 0x0

    return v0

    .line 70
    :cond_0
    instance-of v0, p1, Lcom/huawei/wallet/model/unicard/BankAppInfo;

    if-nez v0, :cond_1

    .line 72
    const/4 v0, 0x0

    return v0

    .line 74
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/huawei/wallet/model/unicard/BankAppInfo;

    .line 75
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/BankAppInfo;->c:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/wallet/model/unicard/BankAppInfo;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 77
    const/4 v0, 0x0

    return v0

    .line 79
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/wallet/model/unicard/BankAppInfo;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
