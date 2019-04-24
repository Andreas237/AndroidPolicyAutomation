.class public Lcom/huawei/hihealthservice/old/model/Location;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = -0x34f6cef99f99f1b5L


# instance fields
.field private altitude:D

.field private latitude:D

.field private longitude:D

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clone()Lcom/huawei/hihealthservice/old/model/Location;
    .locals 2

    .line 104
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/model/Location;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 106
    :catch_0
    move-exception v1

    .line 108
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 24
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/Location;->clone()Lcom/huawei/hihealthservice/old/model/Location;

    move-result-object v0

    return-object v0
.end method

.method public getAltitude()D
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/Location;->altitude:D

    return-wide v0
.end method

.method public getLatitude()D
    .locals 2

    .line 61
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/Location;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .line 51
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/Location;->longitude:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/Location;->name:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 117
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 121
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 125
    return-void
.end method

.method public setAltitude(D)V
    .locals 0

    .line 76
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/Location;->altitude:D

    .line 77
    return-void
.end method

.method public setLatitude(D)V
    .locals 0

    .line 66
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/Location;->latitude:D

    .line 67
    return-void
.end method

.method public setLongitude(D)V
    .locals 0

    .line 56
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/Location;->longitude:D

    .line 57
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/Location;->name:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Location ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "longitude="

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealthservice/old/model/Location;->longitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", latitude="

    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealthservice/old/model/Location;->latitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", altitude="

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealthservice/old/model/Location;->altitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/Location;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 92
    return-object v0
.end method
