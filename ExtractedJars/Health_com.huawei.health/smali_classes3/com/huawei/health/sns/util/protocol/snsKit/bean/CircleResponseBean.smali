.class public Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
.source "SourceFile"


# instance fields
.field private errcode_:I

.field private errmsg_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;-><init>()V

    .line 11
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;->errcode_:I

    return-void
.end method


# virtual methods
.method public getErrcode_()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;->errcode_:I

    return v0
.end method

.method public getErrmsg_()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;->errmsg_:Ljava/lang/String;

    return-object v0
.end method

.method public getServerErrorCode()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;->errcode_:I

    return v0
.end method

.method public setErrcode_(I)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;->errcode_:I

    .line 15
    return-void
.end method

.method public setErrmsg_(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;->errmsg_:Ljava/lang/String;

    .line 19
    return-void
.end method
