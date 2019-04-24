.class public Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private coreSleepTagList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;>;"
        }
    .end annotation
.end field

.field private coreSleepTagRes:Ljava/lang/String;

.field private coreSleepTagRoot:Ljava/lang/String;

.field private coreSleepTime:Ljava/lang/String;

.field private module_name:Ljava/lang/String;

.field private module_type:I

.field private module_ver:Ljava/lang/String;

.field private notificationTagList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepNoticationData;>;"
        }
    .end annotation
.end field

.field private recommondSleepTime:Ljava/lang/String;

.field private recommondSleepTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method


# virtual methods
.method public getCoreSleepTagList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;>;"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->coreSleepTagList:Ljava/util/List;

    return-object v0
.end method

.method public getCoreSleepTagRes()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->coreSleepTagRes:Ljava/lang/String;

    return-object v0
.end method

.method public getCoreSleepTagRoot()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->coreSleepTagRoot:Ljava/lang/String;

    return-object v0
.end method

.method public getCoreSleepTime()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->coreSleepTime:Ljava/lang/String;

    return-object v0
.end method

.method public getModule_name()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->module_name:Ljava/lang/String;

    return-object v0
.end method

.method public getModule_type()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->module_type:I

    return v0
.end method

.method public getModule_ver()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->module_ver:Ljava/lang/String;

    return-object v0
.end method

.method public getNoticationDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepNoticationData;>;"
        }
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->notificationTagList:Ljava/util/List;

    return-object v0
.end method

.method public getRecommondSleepTime()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->recommondSleepTime:Ljava/lang/String;

    return-object v0
.end method

.method public getRecommondSleepTitle()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->recommondSleepTitle:Ljava/lang/String;

    return-object v0
.end method

.method public setCoreSleepTagList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;>;)V"
        }
    .end annotation

    .line 99
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->coreSleepTagList:Ljava/util/List;

    .line 100
    return-void
.end method

.method public setCoreSleepTagRes(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->coreSleepTagRes:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setCoreSleepTagRoot(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->coreSleepTagRoot:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setCoreSleepTime(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->coreSleepTime:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setModule_name(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->module_name:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setModule_type(I)V
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->module_type:I

    .line 92
    return-void
.end method

.method public setModule_ver(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->module_ver:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setNoticationDataList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepNoticationData;>;)V"
        }
    .end annotation

    .line 107
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->notificationTagList:Ljava/util/List;

    .line 108
    return-void
.end method

.method public setRecommondSleepTime(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->recommondSleepTime:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setRecommondSleepTitle(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->recommondSleepTitle:Ljava/lang/String;

    .line 52
    return-void
.end method
