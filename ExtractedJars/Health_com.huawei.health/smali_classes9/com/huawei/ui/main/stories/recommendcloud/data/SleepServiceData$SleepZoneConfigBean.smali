.class public Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SleepZoneConfigBean"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;,
        Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$InfoListBean;,
        Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$BannerBean;
    }
.end annotation


# instance fields
.field private banner:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$BannerBean;>;"
        }
    .end annotation
.end field

.field private infoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$InfoListBean;>;"
        }
    .end annotation
.end field

.field private serviceList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBanner()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$BannerBean;>;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;->banner:Ljava/util/List;

    return-object v0
.end method

.method public getInfoList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$InfoListBean;>;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;->infoList:Ljava/util/List;

    return-object v0
.end method

.method public getServiceList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;>;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;->serviceList:Ljava/util/List;

    return-object v0
.end method

.method public setBanner(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$BannerBean;>;)V"
        }
    .end annotation

    .line 36
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;->banner:Ljava/util/List;

    .line 37
    return-void
.end method

.method public setInfoList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$InfoListBean;>;)V"
        }
    .end annotation

    .line 44
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;->infoList:Ljava/util/List;

    .line 45
    return-void
.end method

.method public setServiceList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;>;)V"
        }
    .end annotation

    .line 52
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;->serviceList:Ljava/util/List;

    .line 53
    return-void
.end method
