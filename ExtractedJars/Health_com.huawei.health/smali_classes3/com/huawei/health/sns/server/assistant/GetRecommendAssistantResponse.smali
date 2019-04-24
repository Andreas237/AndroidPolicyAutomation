.class public Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;
    }
.end annotation


# instance fields
.field private account_list_:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;->account_list_:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getAccount_list_()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;>;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;->account_list_:Ljava/util/ArrayList;

    .line 21
    return-object v0
.end method

.method public getErrcode_()I
    .locals 1

    .line 116
    iget v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;->errcode_:I

    return v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetRecommendAssistantResponse account_list_ size "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;->account_list_:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setErrcode_(I)V
    .locals 0

    .line 121
    iput p1, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;->errcode_:I

    .line 122
    return-void
.end method
