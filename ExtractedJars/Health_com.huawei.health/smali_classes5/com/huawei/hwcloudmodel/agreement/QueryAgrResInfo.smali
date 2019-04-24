.class public Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private agrType:I

.field private country:Ljava/lang/String;

.field private isAgree:Z

.field private language:Ljava/lang/String;

.field private latestVersion:J

.field private needSign:Z

.field private signTime:J

.field private version:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isAgree()Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->isAgree:Z

    return v0
.end method

.method public isNeedSign()Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->needSign:Z

    return v0
.end method

.method public obtainAgrType()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->agrType:I

    return v0
.end method

.method public obtainCountry()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->country:Ljava/lang/String;

    return-object v0
.end method

.method public obtainLanguage()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->language:Ljava/lang/String;

    return-object v0
.end method

.method public obtainLatestVersion()J
    .locals 2

    .line 97
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->latestVersion:J

    return-wide v0
.end method

.method public obtainSignTime()J
    .locals 2

    .line 81
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->signTime:J

    return-wide v0
.end method

.method public obtainVersion()J
    .locals 2

    .line 73
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->version:J

    return-wide v0
.end method

.method public putAgrType(I)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->agrType:I

    .line 54
    return-void
.end method

.method public putAgree(Z)V
    .locals 0

    .line 93
    iput-boolean p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->isAgree:Z

    .line 94
    return-void
.end method

.method public putCountry(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->country:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public putLanguage(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->language:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public putLatestVersion(J)V
    .locals 0

    .line 101
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->latestVersion:J

    .line 102
    return-void
.end method

.method public putNeedSign(Z)V
    .locals 0

    .line 109
    iput-boolean p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->needSign:Z

    .line 110
    return-void
.end method

.method public putSignTime(J)V
    .locals 0

    .line 85
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->signTime:J

    .line 86
    return-void
.end method

.method public putVersion(J)V
    .locals 0

    .line 77
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrResInfo;->version:J

    .line 78
    return-void
.end method
