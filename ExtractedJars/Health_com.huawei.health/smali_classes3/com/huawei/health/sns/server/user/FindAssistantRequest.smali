.class public Lcom/huawei/health/sns/server/user/FindAssistantRequest;
.super Lcom/huawei/health/sns/server/AssistRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/search_account"


# instance fields
.field private page_num_:I

.field private search_string_:Ljava/lang/String;

.field private start_seq_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Lcom/huawei/health/sns/server/AssistRequestBean;-><init>()V

    .line 60
    const-string v0, "/search_account"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->method:Ljava/lang/String;

    .line 61
    const-string v0, "/api/client"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->module:Ljava/lang/String;

    .line 62
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 74
    new-instance v0, Lcom/huawei/health/sns/server/user/FindAssistantResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/FindAssistantResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    const-string v0, "FindAssistantRequest ft:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->start_seq_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->page_num_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPage_num_()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->page_num_:I

    return v0
.end method

.method public getSearch_string_()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->search_string_:Ljava/lang/String;

    return-object v0
.end method

.method public getStart_seq_()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->start_seq_:I

    return v0
.end method

.method public setData(Ljava/lang/String;II)V
    .locals 0

    .line 66
    iput p2, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->start_seq_:I

    .line 67
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->search_string_:Ljava/lang/String;

    .line 68
    iput p3, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->page_num_:I

    .line 69
    return-void
.end method

.method public setPage_num_(I)V
    .locals 0

    .line 42
    iput p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->page_num_:I

    .line 43
    return-void
.end method

.method public setSearch_string_(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->search_string_:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public setStart_seq_(I)V
    .locals 0

    .line 34
    iput p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->start_seq_:I

    .line 35
    return-void
.end method
