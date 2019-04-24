.class public Lcom/huawei/health/sns/server/circle/GetCircleResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;,
        Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;,
        Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;
    }
.end annotation


# instance fields
.field private circles_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getCircles_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse;->circles_:Ljava/util/List;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 256
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    const-string v0, "GetCircleResponse, size:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse;->circles_:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse;->circles_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 259
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setCircles_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;>;)V"
        }
    .end annotation

    .line 24
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse;->circles_:Ljava/util/List;

    .line 25
    return-void
.end method
