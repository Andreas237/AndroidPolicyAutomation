.class public Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse$CountryInfo;
    }
.end annotation


# instance fields
.field private countryInfo:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse$CountryInfo;>;"
        }
    .end annotation
.end field

.field private resCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public changeDestSiteDeviceInfo()V
    .locals 0

    .line 154
    return-void
.end method

.method public contrustDestSiteHeadImage()V
    .locals 0

    .line 150
    return-void
.end method

.method public dealWithDestSiteResetFactory()V
    .locals 0

    .line 138
    return-void
.end method

.method public downloadDestSiteNameUrl()V
    .locals 0

    .line 122
    return-void
.end method

.method public getCountryInfo()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse$CountryInfo;>;"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->countryInfo:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getDestSiteName()V
    .locals 0

    .line 114
    return-void
.end method

.method public getResCode()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->resCode:I

    return v0
.end method

.method public judgeDestSiteWeightBySomeInfo()V
    .locals 0

    .line 126
    return-void
.end method

.method public queryDestSiteProcessData()V
    .locals 0

    .line 146
    return-void
.end method

.method public refreshDestSiteInitData()V
    .locals 0

    .line 142
    return-void
.end method

.method public requestDestSiteHeadUrl()V
    .locals 0

    .line 118
    return-void
.end method

.method public setCountryInfo(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse$CountryInfo;>;)V"
        }
    .end annotation

    .line 83
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->countryInfo:Ljava/util/ArrayList;

    .line 84
    return-void
.end method

.method public setDestSiteSwitchUpload()V
    .locals 0

    .line 130
    return-void
.end method

.method public setResCode(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->resCode:I

    .line 76
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QstnDestSiteResponse{resCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->resCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", countryInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->countryInfo:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public updataDestSiteLocalTable()V
    .locals 0

    .line 134
    return-void
.end method
