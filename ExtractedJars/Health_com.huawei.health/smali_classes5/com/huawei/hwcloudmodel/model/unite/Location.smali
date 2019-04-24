.class public Lcom/huawei/hwcloudmodel/model/unite/Location;
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

.field private timestamp:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clone()Lcom/huawei/hwcloudmodel/model/unite/Location;
    .locals 2

    .line 106
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/Location;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 107
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
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/Location;->clone()Lcom/huawei/hwcloudmodel/model/unite/Location;

    move-result-object v0

    return-object v0
.end method

.method public getAltitude()D
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->altitude:D

    return-wide v0
.end method

.method public getLatitude()D
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->longitude:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()Ljava/lang/Long;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->timestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public setAltitude(D)V
    .locals 0

    .line 90
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->altitude:D

    .line 91
    return-void
.end method

.method public setLatitude(D)V
    .locals 0

    .line 66
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->latitude:D

    .line 67
    return-void
.end method

.method public setLongitude(D)V
    .locals 0

    .line 74
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->longitude:D

    .line 75
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->name:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public setTimestamp(Ljava/lang/Long;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->timestamp:Ljava/lang/Long;

    .line 59
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Location ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "timestamp="

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->timestamp:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", longitude="

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->longitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", latitude="

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->latitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", altitude="

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->altitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/Location;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 95
    return-object v0
.end method
