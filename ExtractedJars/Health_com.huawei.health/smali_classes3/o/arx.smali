.class public Lo/arx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/arx;->e:Landroid/os/Handler;

    .line 66
    invoke-direct {p0, p1}, Lo/arx;->e(Landroid/os/Handler;)V

    .line 67
    return-void
.end method

.method private a(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;>;)Ljava/util/ArrayList<Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;>;"
        }
    .end annotation

    .line 211
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 213
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    .line 217
    const/16 v0, 0x14

    if-le v3, v0, :cond_0

    const/16 v4, 0x14

    goto :goto_0

    :cond_0
    move v4, v3

    .line 218
    :goto_0
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    .line 220
    new-instance v2, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;

    invoke-direct {v2}, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;-><init>()V

    .line 221
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;

    invoke-virtual {v0}, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->setName(Ljava/lang/String;)V

    .line 222
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;

    invoke-virtual {v0}, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;->getValue()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->setValue(I)V

    .line 223
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 228
    :cond_1
    return-object v1
.end method

.method private static a(Lo/arx;I)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/arx;I)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 134
    new-instance v0, Lo/arx$5;

    invoke-direct {v0, p1, p0}, Lo/arx$5;-><init>(ILo/arx;)V

    return-object v0
.end method

.method private a(III)V
    .locals 2

    .line 78
    iget-object v0, p0, Lo/arx;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/arx;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/arx;->e:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 82
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/arx;III)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lo/arx;->a(III)V

    return-void
.end method

.method static synthetic c(Lo/arx;I)Lo/brd;
    .locals 1

    .line 25
    invoke-static {p0, p1}, Lo/arx;->a(Lo/arx;I)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private static d(Lo/arx;I)Lo/aud;
    .locals 1

    .line 104
    new-instance v0, Lo/arx$1;

    invoke-direct {v0, p0, p1}, Lo/arx$1;-><init>(Lo/arx;I)V

    return-object v0
.end method

.method private e(Landroid/os/Handler;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lo/arx;->e:Landroid/os/Handler;

    .line 57
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 7

    .line 160
    if-nez p1, :cond_0

    .line 162
    const/16 v0, 0xb03

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/arx;->a(III)V

    .line 163
    const-string v0, "ComplainTask"

    const-string v1, "GetComplainCategoryInfo error! response == null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    return-void

    .line 166
    :cond_0
    const/4 v4, 0x0

    .line 167
    instance-of v0, p1, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;

    if-eqz v0, :cond_1

    .line 169
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;

    .line 172
    :cond_1
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 174
    if-eqz v4, :cond_2

    iget v0, v4, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;->errcode_:I

    if-nez v0, :cond_2

    .line 176
    invoke-virtual {v4}, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;->getComplainCategory()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/arx;->a(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v3

    .line 178
    iget-object v0, p0, Lo/arx;->e:Landroid/os/Handler;

    if-eqz v0, :cond_5

    .line 180
    iget-object v0, p0, Lo/arx;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 181
    const/16 v0, 0xb01

    iput v0, v5, Landroid/os/Message;->what:I

    .line 182
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 183
    const-string v0, "bundleKeyComplainCategory"

    invoke-virtual {v6, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 184
    invoke-virtual {v5, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 185
    iget-object v0, p0, Lo/arx;->e:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 186
    goto :goto_0

    .line 190
    :cond_2
    if-eqz v4, :cond_3

    .line 192
    iget v0, v4, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;->errcode_:I

    const/16 v1, 0xb02

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/arx;->a(III)V

    .line 193
    const-string v0, "ComplainTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GetComplainCategoryInfo error! errcode_ == "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;->errcode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 197
    :cond_3
    const-string v0, "ComplainTask"

    const-string v1, "GetComplainCategoryInfo error! getComplainCategoryResponse null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 203
    :cond_4
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0xb03

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/arx;->a(III)V

    .line 204
    const-string v0, "ComplainTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GetComplainCategoryInfo error, response.responseCode != SNSHttpCode.OK errcode_ == "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    :cond_5
    :goto_0
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 92
    invoke-static {p0, p1}, Lo/arx;->d(Lo/arx;I)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->e(Lo/aud;)V

    .line 93
    return-void
.end method
