.class public Lcom/huawei/hihealthservice/old/model/TimeLine;
.super Lcom/huawei/hihealthservice/old/model/HealthData;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x64bd9ebdfcf01665L


# instance fields
.field private sportDuration:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    return-void
.end method


# virtual methods
.method public getSportDuration()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/TimeLine;->sportDuration:I

    return v0
.end method

.method public setSportDuration(I)V
    .locals 0

    .line 40
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/TimeLine;->sportDuration:I

    .line 41
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TimeLine [sportDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/TimeLine;->sportDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
