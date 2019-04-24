.class public Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse$UpdatePushTokenRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UpdatePushTokenRsp"
.end annotation


# instance fields
.field private deviceID_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getDeviceID_()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse$UpdatePushTokenRsp;->deviceID_:Ljava/lang/String;

    return-object v0
.end method

.method public setDeviceID_(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse$UpdatePushTokenRsp;->deviceID_:Ljava/lang/String;

    .line 41
    return-void
.end method
