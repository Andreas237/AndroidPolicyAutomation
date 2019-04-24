.class public Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DelGroupNotify"
.end annotation


# instance fields
.field private action_:I

.field private grpID_:J

.field private initiatorUID_:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getAction_()I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;->action_:I

    return v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;->grpID_:J

    return-wide v0
.end method

.method public getInitiatorUID_()J
    .locals 2

    .line 81
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;->initiatorUID_:J

    return-wide v0
.end method

.method public setAction_(I)V
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;->action_:I

    .line 62
    return-void
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 71
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;->grpID_:J

    .line 72
    return-void
.end method

.method public setInitiatorUID_(J)V
    .locals 0

    .line 66
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;->initiatorUID_:J

    .line 67
    return-void
.end method
