.class public Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private isSupportA2:Z

.field private isSupportAF500:Z

.field private isSupportB0:Z

.field private isSupportB1:Z

.field private isSupportB2:Z

.field private isSupportB3:Z

.field private isSupportB3Lite:Z

.field private isSupportEris:Z

.field private isSupportLeo:Z

.field private isSupportMetis:Z

.field private isSupportNyx:Z

.field private isSupportPro:Z

.field private isSupportR1:Z

.field private isSupportW1:Z

.field private proscheDesignMiniVersion:Ljava/lang/String;

.field private watch2MiniVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportLeo:Z

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->watch2MiniVersion:Ljava/lang/String;

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportPro:Z

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->proscheDesignMiniVersion:Ljava/lang/String;

    .line 16
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportMetis:Z

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB3Lite:Z

    .line 19
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportEris:Z

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportNyx:Z

    .line 21
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportA2:Z

    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB3:Z

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB2:Z

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB1:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB0:Z

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportW1:Z

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportAF500:Z

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportR1:Z

    return-void
.end method


# virtual methods
.method public getProscheDesignMiniVersion()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->proscheDesignMiniVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getWatch2MiniVersion()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->watch2MiniVersion:Ljava/lang/String;

    return-object v0
.end method

.method public isSupportA2()Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportA2:Z

    return v0
.end method

.method public isSupportAF500()Z
    .locals 1

    .line 142
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportAF500:Z

    return v0
.end method

.method public isSupportB0()Z
    .locals 1

    .line 126
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB0:Z

    return v0
.end method

.method public isSupportB1()Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB1:Z

    return v0
.end method

.method public isSupportB2()Z
    .locals 1

    .line 110
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB2:Z

    return v0
.end method

.method public isSupportB3()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB3:Z

    return v0
.end method

.method public isSupportB3Lite()Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB3Lite:Z

    return v0
.end method

.method public isSupportEris()Z
    .locals 1

    .line 70
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportEris:Z

    return v0
.end method

.method public isSupportLeo()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportLeo:Z

    return v0
.end method

.method public isSupportMetis()Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportMetis:Z

    return v0
.end method

.method public isSupportNyx()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportNyx:Z

    return v0
.end method

.method public isSupportPro()Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportPro:Z

    return v0
.end method

.method public isSupportR1()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportR1:Z

    return v0
.end method

.method public isSupportW1()Z
    .locals 1

    .line 134
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportW1:Z

    return v0
.end method

.method public setProscheDesignMiniVersion(Ljava/lang/String;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->proscheDesignMiniVersion:Ljava/lang/String;

    .line 163
    return-void
.end method

.method public setSupportA2(Z)V
    .locals 0

    .line 90
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportA2:Z

    .line 91
    return-void
.end method

.method public setSupportAF500(Z)V
    .locals 0

    .line 146
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportAF500:Z

    .line 147
    return-void
.end method

.method public setSupportB0(Z)V
    .locals 0

    .line 130
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB0:Z

    .line 131
    return-void
.end method

.method public setSupportB1(Z)V
    .locals 0

    .line 122
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB1:Z

    .line 123
    return-void
.end method

.method public setSupportB2(Z)V
    .locals 0

    .line 114
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB2:Z

    .line 115
    return-void
.end method

.method public setSupportB3(Z)V
    .locals 0

    .line 98
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB3:Z

    .line 99
    return-void
.end method

.method public setSupportB3Lite(Z)V
    .locals 0

    .line 66
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB3Lite:Z

    .line 67
    return-void
.end method

.method public setSupportEris(Z)V
    .locals 0

    .line 74
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportEris:Z

    .line 75
    return-void
.end method

.method public setSupportLeo(Z)V
    .locals 0

    .line 42
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportLeo:Z

    .line 43
    return-void
.end method

.method public setSupportMetis(Z)V
    .locals 0

    .line 58
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportMetis:Z

    .line 59
    return-void
.end method

.method public setSupportNyx(Z)V
    .locals 0

    .line 82
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportNyx:Z

    .line 83
    return-void
.end method

.method public setSupportPro(Z)V
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportPro:Z

    .line 51
    return-void
.end method

.method public setSupportR1(Z)V
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportR1:Z

    .line 107
    return-void
.end method

.method public setSupportW1(Z)V
    .locals 0

    .line 138
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportW1:Z

    .line 139
    return-void
.end method

.method public setWatch2MiniVersion(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->watch2MiniVersion:Ljava/lang/String;

    .line 155
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthSupportModel{isSupportLeo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportLeo:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", watch2MiniVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->watch2MiniVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportPro="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportPro:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", proscheDesignMiniVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->proscheDesignMiniVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportMetis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportMetis:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportB3Lite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB3Lite:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportEris="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportEris:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportNyx="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportNyx:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportA2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportA2:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportB3="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB3:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportB2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB2:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportB1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB1:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportB0="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportB0:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportW1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportW1:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportAF500="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportAF500:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportR1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;->isSupportR1:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
