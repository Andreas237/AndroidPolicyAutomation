.class public Lcom/huawei/hwcloudmodel/agreement/SignAgrReqBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private signInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSignInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;>;"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqBean;->signInfo:Ljava/util/List;

    return-object v0
.end method

.method public setSignInfo(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;>;)V"
        }
    .end annotation

    .line 11
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqBean;->signInfo:Ljava/util/List;

    .line 12
    return-void
.end method
