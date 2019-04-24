.class public Lo/ahh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private g:I

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lo/ahh;->c:Ljava/lang/String;

    .line 17
    const/4 v0, -0x1

    iput v0, p0, Lo/ahh;->k:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/ahh;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 32
    iput p1, p0, Lo/ahh;->a:I

    .line 33
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lo/ahh;->d:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public b()I
    .locals 1

    .line 43
    iget v0, p0, Lo/ahh;->e:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/ahh;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 96
    iput p1, p0, Lo/ahh;->k:I

    .line 97
    return-void
.end method

.method public c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;II)V
    .locals 2

    .line 79
    const-string v0, "PORSCHE DESIGN"

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->device_icon_leo2:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ahh;->a(Ljava/lang/String;)V

    .line 81
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->img_device_porc_pic1:I

    invoke-virtual {p0, v0}, Lo/ahh;->d(I)V

    goto :goto_0

    .line 83
    :cond_0
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ahh;->a(Ljava/lang/String;)V

    .line 84
    invoke-virtual {p0, p2}, Lo/ahh;->d(I)V

    .line 86
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/ahh;->a(I)V

    .line 87
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ahh;->e(Ljava/lang/String;)V

    .line 88
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/ahh;->c(I)V

    .line 89
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/ahh;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 72
    iput p1, p0, Lo/ahh;->g:I

    .line 73
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lo/ahh;->b:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public e()I
    .locals 1

    .line 28
    iget v0, p0, Lo/ahh;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public e(I)V
    .locals 1

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/ahh;->e:I

    .line 48
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/ahh;->c:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public f()I
    .locals 1

    .line 92
    iget v0, p0, Lo/ahh;->k:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public g()I
    .locals 1

    .line 67
    iget v0, p0, Lo/ahh;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[mDeviceName = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ahh;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mDeviceConnectState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/ahh;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
