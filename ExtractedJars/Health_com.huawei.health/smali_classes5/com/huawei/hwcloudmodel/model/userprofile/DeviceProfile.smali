.class public Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x488b98be65c32f53L


# instance fields
.field private bigPortraitUrl:Ljava/lang/String;

.field private birthday:Ljava/lang/String;

.field private deviceCode:I

.field private deviceType:I

.field private grade:I

.field private height:I

.field private largePortraitUrl:Ljava/lang/String;

.field private localUrl:Ljava/lang/String;

.field private mac:Ljava/lang/String;

.field private middlePortraitUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private portraitImg:Ljava/lang/String;

.field private portraitImgName:Ljava/lang/String;

.field private portraitUrl:Ljava/lang/String;

.field private primaryHuid:Ljava/lang/String;

.field private sex:I

.field private simCardNum:Ljava/lang/String;

.field private smallPortraitUrl:Ljava/lang/String;

.field private weight:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->deviceCode:I

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->name:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->localUrl:Ljava/lang/String;

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->smallPortraitUrl:Ljava/lang/String;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->middlePortraitUrl:Ljava/lang/String;

    .line 33
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->largePortraitUrl:Ljava/lang/String;

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->birthday:Ljava/lang/String;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->height:I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->weight:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->sex:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->grade:I

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->simCardNum:Ljava/lang/String;

    .line 55
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->portraitImg:Ljava/lang/String;

    .line 57
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->portraitImgName:Ljava/lang/String;

    .line 59
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->primaryHuid:Ljava/lang/String;

    .line 61
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->mac:Ljava/lang/String;

    .line 63
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->portraitUrl:Ljava/lang/String;

    .line 65
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->bigPortraitUrl:Ljava/lang/String;

    .line 67
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->deviceType:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  deviceCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->deviceCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  name = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  localUrl = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->localUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  smallPortraitUrl = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->smallPortraitUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  middlePortraitUrl = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->middlePortraitUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  largePortraitUrl = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->largePortraitUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  birthday = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->birthday:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  height = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  height = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  sex = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->sex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  grade = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->grade:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  simCardNum = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->simCardNum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  portraitImgName = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->portraitImgName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  mac = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->mac:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  portraitUrl = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->portraitUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " primaryHuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->primaryHuid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  deviceType= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->deviceType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  bigPortraitUrl= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->bigPortraitUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 81
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;->bigPortraitUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is null]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 84
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is not null]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 86
    :goto_0
    return-object v2
.end method

.method public uadpDeviceProfile()V
    .locals 0

    .line 93
    return-void
.end method
