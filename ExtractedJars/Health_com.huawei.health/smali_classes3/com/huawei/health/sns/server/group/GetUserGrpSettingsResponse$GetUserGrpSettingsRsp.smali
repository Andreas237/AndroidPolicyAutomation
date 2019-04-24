.class public Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetUserGrpSettingsRsp"
.end annotation


# instance fields
.field public setFlags_:Ljava/lang/String;

.field public stickTime_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;->setFlags_:Ljava/lang/String;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;->stickTime_:Ljava/lang/String;

    return-void
.end method
