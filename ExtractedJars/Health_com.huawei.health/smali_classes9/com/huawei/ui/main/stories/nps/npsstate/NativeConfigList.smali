.class public Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigList;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private allSurveyConfig:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAllSurveyConfig()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;>;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigList;->allSurveyConfig:Ljava/util/List;

    return-object v0
.end method

.method public setAllSurveyConfig(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;>;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigList;->allSurveyConfig:Ljava/util/List;

    .line 20
    return-void
.end method
