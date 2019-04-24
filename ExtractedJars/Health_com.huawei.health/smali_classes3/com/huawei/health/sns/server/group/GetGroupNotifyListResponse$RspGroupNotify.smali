.class public Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RspGroupNotify"
.end annotation


# instance fields
.field private action_:I

.field private grpID_:J

.field private grpImageURLDownload_:Ljava/lang/String;

.field private grpImageURL_:Ljava/lang/String;

.field private grpName_:Ljava/lang/String;

.field private initiatorAccount_:Ljava/lang/String;

.field private initiatorUID_:J

.field private operTime_:Ljava/lang/String;

.field private userImageURLDownload_:Ljava/lang/String;

.field private userImageURL_:Ljava/lang/String;

.field private userNickName_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getAction_()I
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->action_:I

    .line 116
    return v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 151
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->grpID_:J

    .line 152
    return-wide v0
.end method

.method public getGrpImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->grpImageURLDownload_:Ljava/lang/String;

    .line 164
    return-object v0
.end method

.method public getGrpImageURL_()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->grpImageURL_:Ljava/lang/String;

    .line 158
    return-object v0
.end method

.method public getGrpName_()Ljava/lang/String;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->grpName_:Ljava/lang/String;

    .line 170
    return-object v0
.end method

.method public getInitiatorAccount_()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->initiatorAccount_:Ljava/lang/String;

    .line 128
    return-object v0
.end method

.method public getInitiatorUID_()J
    .locals 2

    .line 121
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->initiatorUID_:J

    .line 122
    return-wide v0
.end method

.method public getOperTime_()Ljava/lang/String;
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->operTime_:Ljava/lang/String;

    .line 176
    return-object v0
.end method

.method public getUserImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->userImageURLDownload_:Ljava/lang/String;

    .line 140
    return-object v0
.end method

.method public getUserImageURL_()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->userImageURL_:Ljava/lang/String;

    .line 134
    return-object v0
.end method

.method public getUserNickName_()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->userNickName_:Ljava/lang/String;

    .line 146
    return-object v0
.end method
