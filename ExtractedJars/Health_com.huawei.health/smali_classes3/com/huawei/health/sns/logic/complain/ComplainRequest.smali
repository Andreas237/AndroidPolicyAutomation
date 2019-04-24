.class public Lcom/huawei/health/sns/logic/complain/ComplainRequest;
.super Lcom/huawei/health/sns/server/AssistRequestBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;,
        Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;
    }
.end annotation


# static fields
.field public static final API_METHOD:Ljava/lang/String; = "/complain"

.field private static final FILE_KEY:Ljava/lang/String; = "reportFile"

.field private static final READ_TIMEOUT:I = 0x7530

.field private static final REPORT_KEY:Ljava/lang/String; = "reportJson"


# instance fields
.field private category_:I

.field private chat_pic_count_:I

.field private chat_record_count_:I

.field private initiator_:Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;

.field private local_pic_count_:I

.field private target_:Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;

.field private type_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 168
    invoke-direct {p0}, Lcom/huawei/health/sns/server/AssistRequestBean;-><init>()V

    .line 169
    const-string v0, "/complain"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->method:Ljava/lang/String;

    .line 170
    const-string v0, "/api/client"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->module:Ljava/lang/String;

    .line 171
    const-string v0, "0100"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->version:Ljava/lang/String;

    .line 172
    const-string v0, "reportFile"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->fileKey:Ljava/lang/String;

    .line 173
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 230
    new-instance v0, Lcom/huawei/health/sns/logic/complain/ComplainResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/complain/ComplainResponse;-><init>()V

    return-object v0
.end method

.method public getCategory_()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->category_:I

    return v0
.end method

.method public getChat_pic_count_()I
    .locals 1

    .line 101
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->chat_pic_count_:I

    return v0
.end method

.method public getChat_record_count_()I
    .locals 1

    .line 93
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->chat_record_count_:I

    return v0
.end method

.method public getFormParams()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 237
    new-instance v2, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 240
    const-string v0, "reportJson"

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->genBody()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 245
    goto :goto_0

    .line 242
    :catch_0
    move-exception v3

    .line 244
    const-string v0, "ComplainRequest"

    const-string v1, "gen param body failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    :goto_0
    return-object v2
.end method

.method public getLocal_pic_count_()I
    .locals 1

    .line 109
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->local_pic_count_:I

    return v0
.end method

.method public getReadTimeout()I
    .locals 1

    .line 253
    const/16 v0, 0x7530

    return v0
.end method

.method public getType_()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->type_:I

    return v0
.end method

.method public setCategory_(I)V
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->category_:I

    .line 90
    return-void
.end method

.method public setChatInfo(III)V
    .locals 0

    .line 222
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->chat_record_count_:I

    .line 223
    iput p2, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->chat_pic_count_:I

    .line 224
    iput p3, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->local_pic_count_:I

    .line 225
    return-void
.end method

.method public setChat_pic_count_(I)V
    .locals 0

    .line 105
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->chat_pic_count_:I

    .line 106
    return-void
.end method

.method public setChat_record_count_(I)V
    .locals 0

    .line 97
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->chat_record_count_:I

    .line 98
    return-void
.end method

.method public setLocal_pic_count_(I)V
    .locals 0

    .line 113
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->local_pic_count_:I

    .line 114
    return-void
.end method

.method public setTarget(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 208
    new-instance v0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->target_:Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;

    .line 209
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->target_:Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;

    iput-object p1, v0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;->id_:Ljava/lang/String;

    .line 210
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->target_:Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;

    iput-object p2, v0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;->name_:Ljava/lang/String;

    .line 211
    return-void
.end method

.method public setType(II)V
    .locals 0

    .line 183
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->type_:I

    .line 184
    iput p2, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->category_:I

    .line 185
    return-void
.end method

.method public setType_(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->type_:I

    .line 82
    return-void
.end method

.method public setUserInfo(JLjava/lang/String;)V
    .locals 1

    .line 195
    new-instance v0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->initiator_:Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->initiator_:Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;

    iput-wide p1, v0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;->id_:J

    .line 197
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->initiator_:Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;

    iput-object p3, v0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;->name_:Ljava/lang/String;

    .line 198
    return-void
.end method
