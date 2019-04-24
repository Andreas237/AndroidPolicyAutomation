.class public Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
.source "SourceFile"


# instance fields
.field public errcode_:I

.field public errmsg_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;-><init>()V

    .line 15
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;->errcode_:I

    return-void
.end method


# virtual methods
.method public getErrmsg_()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;->errmsg_:Ljava/lang/String;

    return-object v0
.end method

.method public getServerErrorCode()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;->errcode_:I

    return v0
.end method

.method public setErrmsg_(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;->errmsg_:Ljava/lang/String;

    .line 25
    return-void
.end method
