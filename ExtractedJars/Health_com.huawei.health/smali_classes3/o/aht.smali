.class public Lo/aht;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/huawei/hihealth/HiHealthData;

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()D
    .locals 4

    .line 20
    const-wide/16 v2, 0x0

    .line 21
    iget-object v0, p0, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 22
    iget-object v0, p0, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    .line 24
    :cond_0
    return-wide v2
.end method

.method public e()Ljava/lang/String;
    .locals 5

    .line 28
    const/4 v3, 0x0

    .line 29
    iget-object v0, p0, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 30
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 31
    new-instance v0, Ljava/util/Date;

    iget-object v1, p0, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 33
    :cond_0
    return-object v3
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 38
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    instance-of v0, p1, Lo/aht;

    if-eqz v0, :cond_0

    .line 39
    move-object v2, p1

    check-cast v2, Lo/aht;

    .line 40
    invoke-virtual {p0}, Lo/aht;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Lo/aht;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    invoke-virtual {p0}, Lo/aht;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lo/aht;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 44
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 49
    iget-object v0, p0, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->hashCode()I

    move-result v1

    .line 50
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 55
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "ClaimWeightDataBean{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 56
    const-string v0, "StartTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lo/aht;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 57
    const-string v0, ", isChoose=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v1, p0, Lo/aht;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 58
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
