.class public Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private agrInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAgrInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;>;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqBean;->agrInfo:Ljava/util/List;

    return-object v0
.end method

.method public setAgrInfo(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;>;)V"
        }
    .end annotation

    .line 17
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqBean;->agrInfo:Ljava/util/List;

    .line 18
    return-void
.end method
