.class public Lcom/huawei/health/sns/server/user/FindAssistantResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;
    }
.end annotation


# instance fields
.field private account_list_:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;>;"
        }
    .end annotation
.end field

.field private total_num_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->account_list_:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getAccount_list_()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;>;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->account_list_:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getErrcode_()I
    .locals 1

    .line 142
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->errcode_:I

    return v0
.end method

.method public getFindAssistantInfo_()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;>;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->account_list_:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    const-string v0, "FindUserResponse v:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTotal_num_()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->total_num_:I

    return v0
.end method

.method public setAccount_list_(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;>;)V"
        }
    .end annotation

    .line 45
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->account_list_:Ljava/util/ArrayList;

    .line 46
    return-void
.end method

.method public setErrcode_(I)V
    .locals 0

    .line 147
    iput p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->errcode_:I

    .line 148
    return-void
.end method

.method public setTotal_num_(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->total_num_:I

    .line 36
    return-void
.end method
