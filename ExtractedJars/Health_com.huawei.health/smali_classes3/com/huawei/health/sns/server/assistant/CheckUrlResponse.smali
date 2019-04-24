.class public Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;
.source "SourceFile"


# static fields
.field public static final BLOCK:I = 0x1

.field public static final PASS:I = 0x0

.field public static final UNKNOWN:I = -0x1


# instance fields
.field private result_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CheckUrlResponse, r="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;->result_:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResult()I
    .locals 4

    .line 42
    const/4 v2, 0x0

    .line 44
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;->result_:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;->result_:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 54
    goto :goto_0

    .line 50
    :catch_0
    move-exception v3

    .line 53
    const-string v0, "CheckUrlResponse"

    const-string v1, "getResult fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    :cond_0
    :goto_0
    return v2
.end method

.method public getResult_()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;->result_:Ljava/lang/String;

    return-object v0
.end method

.method public setResult_(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;->result_:Ljava/lang/String;

    .line 33
    return-void
.end method
