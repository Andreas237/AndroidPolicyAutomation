.class public Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetUserSNSInfoResponse"
.end annotation


# instance fields
.field private userSNSInfo_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 26
    new-instance v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;->userSNSInfo_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    return-void
.end method


# virtual methods
.method public getUserSNSInfo_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;->userSNSInfo_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    .line 31
    return-object v0
.end method
