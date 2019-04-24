.class public Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private newUserConfig:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getNewUserConfig()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;>;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;->newUserConfig:Ljava/util/Map;

    return-object v0
.end method

.method public setNewUserConfig(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;>;)V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;->newUserConfig:Ljava/util/Map;

    .line 22
    return-void
.end method
