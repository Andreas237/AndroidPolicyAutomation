.class public Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UpdateUserGrpSettingsRsp"
.end annotation


# instance fields
.field public grpID_:J

.field public stickTime_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 46
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;->stickTime_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getGrpID_()J
    .locals 2

    .line 31
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;->grpID_:J

    return-wide v0
.end method

.method public getStickTime_()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;->stickTime_:Ljava/lang/String;

    return-object v0
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 35
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;->grpID_:J

    .line 36
    return-void
.end method

.method public setStickTime_(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;->stickTime_:Ljava/lang/String;

    .line 44
    return-void
.end method
