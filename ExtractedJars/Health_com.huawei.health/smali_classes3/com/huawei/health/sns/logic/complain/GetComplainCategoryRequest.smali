.class public Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;
.super Lcom/huawei/health/sns/server/AssistRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/get_complain_category"


# instance fields
.field private language_:Ljava/lang/String;

.field private type_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/server/AssistRequestBean;-><init>()V

    .line 48
    const-string v0, "/get_complain_category"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;->method:Ljava/lang/String;

    .line 49
    const-string v0, "/api/client"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;->module:Ljava/lang/String;

    .line 50
    new-instance v0, Lo/bax;

    invoke-direct {v0}, Lo/bax;-><init>()V

    invoke-virtual {v0}, Lo/bax;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;->language_:Ljava/lang/String;

    .line 51
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 56
    new-instance v0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;-><init>()V

    return-object v0
.end method

.method public getLanguage_()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;->language_:Ljava/lang/String;

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    const-string v0, "GetComplainCategoryRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType_()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;->type_:I

    return v0
.end method

.method public setLanguage_(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;->language_:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setTypeData(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;->type_:I

    .line 70
    return-void
.end method

.method public setType_(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;->type_:I

    .line 36
    return-void
.end method
