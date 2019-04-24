.class public Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DelFrdAddNotify"
.end annotation


# instance fields
.field public frdUID_:J

.field public notifiedSide_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getFrdUID_()J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;->frdUID_:J

    return-wide v0
.end method

.method public getNotifiedSide_()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;->notifiedSide_:I

    return v0
.end method

.method public setFrdUID_(J)V
    .locals 0

    .line 34
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;->frdUID_:J

    .line 35
    return-void
.end method

.method public setNotifiedSide_(I)V
    .locals 0

    .line 42
    iput p1, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListRequest$DelFrdAddNotify;->notifiedSide_:I

    .line 43
    return-void
.end method
