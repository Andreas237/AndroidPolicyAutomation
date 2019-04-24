.class public Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UpdateUserFrdSettingsRsp"
.end annotation


# instance fields
.field public frdUID_:J

.field public stickTime_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 24
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 29
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;->frdUID_:J

    .line 50
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;->stickTime_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getFrdUID_()J
    .locals 2

    .line 32
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;->frdUID_:J

    return-wide v0
.end method

.method public getStickTime_()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;->stickTime_:Ljava/lang/String;

    return-object v0
.end method

.method public setFrdUID_(J)V
    .locals 0

    .line 36
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;->frdUID_:J

    .line 37
    return-void
.end method

.method public setStickTime_(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;->stickTime_:Ljava/lang/String;

    .line 45
    return-void
.end method
