.class public final Lo/asa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const-class v0, Lo/asa;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/asa;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;II)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;>;II)Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;>;"
        }
    .end annotation

    .line 49
    const/4 v2, 0x0

    .line 51
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x64

    if-lt v1, v0, :cond_0

    .line 53
    move-object v2, p0

    goto :goto_0

    .line 57
    :cond_0
    mul-int/lit8 v3, p1, 0x64

    .line 58
    const/4 v4, 0x0

    .line 59
    add-int/lit8 v0, p2, -0x1

    if-ge p1, v0, :cond_1

    .line 61
    add-int/lit8 v4, v3, 0x64

    .line 62
    invoke-interface {p0, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 66
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    .line 67
    invoke-interface {p0, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    .line 71
    :goto_0
    return-object v2
.end method

.method public static a()V
    .locals 5

    .line 30
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "friendListOldVersion"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 32
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    new-instance v4, Lo/awr;

    invoke-direct {v4}, Lo/awr;-><init>()V

    .line 35
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/awr;->c(Lo/bra;)I

    .line 37
    :cond_0
    return-void
.end method

.method public static d(Lo/bra;Ljava/util/List;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bra;Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;>;Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;>;)I"
        }
    .end annotation

    .line 135
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v2, v0, 0x64

    .line 136
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    rem-int/lit8 v0, v0, 0x64

    if-lez v0, :cond_0

    add-int/lit8 v0, v2, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    move v2, v0

    .line 138
    new-instance v3, Lcom/huawei/health/sns/server/contact/MatchContactsRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/contact/MatchContactsRequest;-><init>()V

    .line 139
    const/4 v4, 0x0

    .line 140
    const/4 v5, 0x0

    .line 141
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_3

    .line 143
    invoke-interface {p0}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 145
    sget-object v0, Lo/asa;->a:Ljava/lang/String;

    const-string v1, "matchContact task cancel."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const/4 v0, 0x1

    return v0

    .line 148
    :cond_1
    invoke-static {p1, v6, v2}, Lo/asa;->a(Ljava/util/List;II)Ljava/util/List;

    move-result-object v4

    .line 149
    iput-object v4, v3, Lcom/huawei/health/sns/server/contact/MatchContactsRequest;->contactList_:Ljava/util/List;

    .line 151
    invoke-static {v3}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 152
    invoke-static {v5, p2}, Lo/asa;->e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/util/List;)I

    move-result v7

    .line 153
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 155
    return v7

    .line 141
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 158
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;>;)I"
        }
    .end annotation

    .line 82
    const/4 v3, 0x0

    .line 83
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 86
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    .line 88
    instance-of v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;

    if-eqz v0, :cond_1

    .line 90
    move-object v4, p0

    check-cast v4, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;

    .line 91
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;->getMatchContactsRsp_()Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 92
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;->getMatchContactsRsp_()Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;->getContactInfoList_()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 93
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;->getMatchContactsRsp_()Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;->getContactInfoList_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 95
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;->getMatchContactsRsp_()Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;->getContactInfoList_()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 97
    :cond_0
    goto :goto_0

    .line 101
    :cond_1
    sget-object v0, Lo/asa;->a:Ljava/lang/String;

    const-string v1, "response type not corresponding."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    const/4 v3, 0x3

    goto :goto_0

    .line 108
    :cond_2
    sget-object v0, Lo/asa;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response.rtnCode_ = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const/4 v3, 0x3

    .line 111
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f8

    if-ne v0, v1, :cond_4

    .line 113
    const/4 v3, 0x4

    goto :goto_0

    .line 120
    :cond_3
    sget-object v0, Lo/asa;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response.responseCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const/4 v3, 0x2

    .line 123
    :cond_4
    :goto_0
    return v3
.end method
