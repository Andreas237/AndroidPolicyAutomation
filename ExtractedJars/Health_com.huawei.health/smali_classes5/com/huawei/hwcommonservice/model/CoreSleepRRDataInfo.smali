.class public Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mRRDataContent:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field

.field private mStatusContent:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRRDataContent()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<[B>;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;->mRRDataContent:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getStatusContent()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<[B>;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;->mStatusContent:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setRRDataContent(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 31
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;->mRRDataContent:Ljava/util/ArrayList;

    .line 32
    return-void
.end method

.method public setStatusContent(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 45
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;->mStatusContent:Ljava/util/ArrayList;

    .line 46
    return-void
.end method

.method public toJsonString()Ljava/lang/String;
    .locals 1

    .line 50
    const-string v0, "sleep rr string"

    return-object v0
.end method
