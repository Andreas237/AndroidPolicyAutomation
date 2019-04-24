.class public Lcom/huawei/health/sns/logic/complain/ComplainResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;
.source "SourceFile"


# static fields
.field private static final EXPECTED_BUFFER_DATA:I = 0x400


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x400

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    const-string v0, "ComplainResponse, ec:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainResponse;->errcode_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    const-string v0, ", em:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainResponse;->errmsg_:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
