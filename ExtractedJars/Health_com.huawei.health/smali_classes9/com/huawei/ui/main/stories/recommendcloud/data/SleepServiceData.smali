.class public Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;
    }
.end annotation


# instance fields
.field private sleepZoneConfig:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSleepZoneConfig()Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;->sleepZoneConfig:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;

    return-object v0
.end method

.method public setSleepZoneConfig(Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;->sleepZoneConfig:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;

    .line 24
    return-void
.end method
