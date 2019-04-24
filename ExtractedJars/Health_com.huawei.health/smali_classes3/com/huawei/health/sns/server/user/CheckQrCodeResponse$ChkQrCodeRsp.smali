.class public Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/CheckQrCodeResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ChkQrCodeRsp"
.end annotation


# instance fields
.field public grpID_:J

.field public userID_:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 27
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 32
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;->userID_:J

    .line 37
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse$ChkQrCodeRsp;->grpID_:J

    return-void
.end method
