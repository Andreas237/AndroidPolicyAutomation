.class public Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;
    }
.end annotation


# instance fields
.field private categorys_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getComplainCategory()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;>;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;->categorys_:Ljava/util/List;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetComplainCategoryResponse, :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setComplainCategory(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;>;)V"
        }
    .end annotation

    .line 30
    iput-object p1, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;->categorys_:Ljava/util/List;

    .line 31
    return-void
.end method
