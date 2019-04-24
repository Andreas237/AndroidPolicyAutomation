.class public Lcom/huawei/health/sns/server/contact/MatchContactsRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;
    }
.end annotation


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/matchContacts"


# instance fields
.field public contactList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 29
    const-string v0, "/matchContacts"

    iput-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsRequest;->method:Ljava/lang/String;

    .line 30
    const-string v0, "IBatch"

    iput-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsRequest;->module:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 49
    new-instance v0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    const-string v0, "MatchContactsRequest, size:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsRequest;->contactList_:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsRequest;->contactList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
