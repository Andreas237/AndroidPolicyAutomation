.class public Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private currentTime:Ljava/lang/String;

.field private redActivity:Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;

.field private resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrentTime()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->currentTime:Ljava/lang/String;

    return-object v0
.end method

.method public getRedActivity()Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->redActivity:Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->resultCode:I

    return v0
.end method

.method public setCurrentTime(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->currentTime:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public setRedActivity(Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->redActivity:Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;

    .line 34
    return-void
.end method

.method public setResultCode(I)V
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->resultCode:I

    .line 42
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RedPacketBean{currentTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->currentTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", redActivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->redActivity:Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", resultCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->resultCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
