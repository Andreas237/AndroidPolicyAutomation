.class public Lo/biz;
.super Lo/bfq;
.source "SourceFile"


# instance fields
.field protected e:Landroid/os/Handler;

.field private f:Lo/bjf;

.field private g:Lo/bja;

.field private h:I

.field private k:Lo/bit;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 70
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lo/biz;->h:I

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/biz;->e:Landroid/os/Handler;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/biz;->g:Lo/bja;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/biz;->f:Lo/bjf;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/biz;->k:Lo/bit;

    .line 71
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 236
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 238
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setLastItem(Z)V

    .line 240
    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 267
    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 269
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setLastItem(Z)V

    goto :goto_0

    .line 273
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/biz;->d(Ljava/util/List;Ljava/util/List;)V

    .line 275
    :goto_0
    return-void
.end method

.method private a(Lo/axw;)V
    .locals 14

    .line 98
    const/4 v5, 0x1

    .line 100
    iget-object v0, p0, Lo/biz;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 104
    invoke-virtual {p1}, Lo/axw;->c()Ljava/util/List;

    move-result-object v6

    .line 107
    if-eqz v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 109
    const/4 v5, 0x0

    .line 110
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    .line 111
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 113
    new-instance v9, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v9}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 114
    iget-object v0, p0, Lo/biz;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_search_user_result:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 115
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 114
    invoke-virtual {v0, v1, v7, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 116
    const/16 v0, 0x15

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/user/User;->setCardType(I)V

    .line 117
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x15

    const/16 v2, 0x15

    invoke-virtual {p0, v1, v2, v0, v8}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 121
    const/16 v0, 0x18

    const/16 v1, 0x18

    invoke-virtual {p0, v0, v1, v7, v6}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 125
    :cond_0
    invoke-virtual {p1}, Lo/axw;->d()Ljava/util/List;

    move-result-object v7

    .line 128
    if-eqz v7, :cond_1

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 130
    invoke-direct {p0, v6}, Lo/biz;->a(Ljava/util/List;)V

    .line 132
    const/4 v5, 0x0

    .line 133
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    .line 134
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 136
    new-instance v10, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v10}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 137
    iget-object v0, p0, Lo/biz;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_search_assist_result:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 138
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 137
    invoke-virtual {v0, v1, v8, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 139
    const/16 v0, 0x15

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/user/User;->setCardType(I)V

    .line 140
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x15

    const/16 v2, 0x15

    invoke-virtual {p0, v1, v2, v0, v9}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 144
    const/16 v0, 0x18

    const/16 v1, 0x18

    invoke-virtual {p0, v0, v1, v8, v7}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 148
    :cond_1
    invoke-virtual {p1}, Lo/axw;->b()Ljava/util/List;

    move-result-object v8

    .line 151
    if-eqz v8, :cond_2

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 153
    const/4 v5, 0x0

    .line 154
    invoke-direct {p0, v6, v7}, Lo/biz;->d(Ljava/util/List;Ljava/util/List;)V

    .line 156
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    .line 158
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 159
    new-instance v11, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v11}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 160
    iget-object v0, p0, Lo/biz;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_search_family_group_result:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 161
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 160
    invoke-virtual {v0, v1, v9, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 162
    const/16 v0, 0x15

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/model/user/User;->setCardType(I)V

    .line 163
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x15

    const/16 v2, 0x15

    invoke-virtual {p0, v1, v2, v0, v10}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 167
    const/16 v0, 0x18

    const/16 v1, 0x18

    invoke-virtual {p0, v0, v1, v9, v8}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 171
    :cond_2
    invoke-virtual {p1}, Lo/axw;->e()Ljava/util/List;

    move-result-object v9

    .line 174
    if-eqz v9, :cond_3

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 176
    invoke-direct {p0, v6, v7, v8}, Lo/biz;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 177
    const/4 v5, 0x0

    .line 178
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    .line 180
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 181
    new-instance v12, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v12}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 182
    iget-object v0, p0, Lo/biz;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_search_normal_group_result:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 183
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 182
    invoke-virtual {v0, v1, v10, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 184
    const/16 v0, 0x15

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/user/User;->setCardType(I)V

    .line 185
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x15

    const/16 v2, 0x15

    invoke-virtual {p0, v1, v2, v0, v11}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 189
    const/16 v0, 0x18

    const/16 v1, 0x18

    invoke-virtual {p0, v0, v1, v10, v9}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 193
    :cond_3
    invoke-virtual {p1}, Lo/axw;->a()Ljava/util/List;

    move-result-object v10

    .line 196
    if-eqz v10, :cond_4

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 198
    const/4 v5, 0x0

    .line 199
    invoke-direct {p0, v6, v7, v8, v9}, Lo/biz;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 200
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    .line 202
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 203
    new-instance v13, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v13}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 204
    iget-object v0, p0, Lo/biz;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_chat_record_activity:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 205
    const/16 v0, 0x15

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/model/user/User;->setCardType(I)V

    .line 206
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x15

    const/16 v2, 0x15

    invoke-virtual {p0, v1, v2, v0, v12}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 210
    const/16 v0, 0x18

    const/16 v1, 0x18

    invoke-virtual {p0, v0, v1, v11, v10}, Lo/biz;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 214
    :cond_4
    iget-object v0, p0, Lo/biz;->e:Landroid/os/Handler;

    if-eqz v0, :cond_6

    .line 216
    iget-object v0, p0, Lo/biz;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v11

    .line 217
    if-eqz v5, :cond_5

    .line 219
    const-string v0, "search_no_result"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iput v0, v11, Landroid/os/Message;->what:I

    goto :goto_0

    .line 223
    :cond_5
    const-string v0, "search_result_list"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iput v0, v11, Landroid/os/Message;->what:I

    .line 225
    :goto_0
    iget-object v0, p0, Lo/biz;->e:Landroid/os/Handler;

    invoke-virtual {v0, v11}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 227
    :cond_6
    return-void
.end method

.method private b()Lo/bjf;
    .locals 1

    .line 316
    iget-object v0, p0, Lo/biz;->f:Lo/bjf;

    if-nez v0, :cond_0

    .line 318
    new-instance v0, Lo/bjf;

    invoke-direct {v0}, Lo/bjf;-><init>()V

    iput-object v0, p0, Lo/biz;->f:Lo/bjf;

    .line 320
    :cond_0
    iget-object v0, p0, Lo/biz;->f:Lo/bjf;

    return-object v0
.end method

.method private c()Lo/bja;
    .locals 1

    .line 302
    iget-object v0, p0, Lo/biz;->g:Lo/bja;

    if-nez v0, :cond_0

    .line 304
    new-instance v0, Lo/bja;

    invoke-direct {v0}, Lo/bja;-><init>()V

    iput-object v0, p0, Lo/biz;->g:Lo/bja;

    .line 306
    :cond_0
    iget-object v0, p0, Lo/biz;->g:Lo/bja;

    return-object v0
.end method

.method private d(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 249
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 251
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setLastItem(Z)V

    goto :goto_0

    .line 255
    :cond_0
    invoke-direct {p0, p1}, Lo/biz;->a(Ljava/util/List;)V

    .line 257
    :goto_0
    return-void
.end method

.method private e(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 285
    if-eqz p4, :cond_0

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 287
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setLastItem(Z)V

    goto :goto_0

    .line 291
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo/biz;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 293
    :goto_0
    return-void
.end method

.method private k()Lo/bit;
    .locals 2

    .line 330
    iget-object v0, p0, Lo/biz;->k:Lo/bit;

    if-nez v0, :cond_0

    .line 332
    new-instance v0, Lo/bit;

    iget-object v1, p0, Lo/biz;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/bit;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/biz;->k:Lo/bit;

    .line 334
    :cond_0
    iget-object v0, p0, Lo/biz;->k:Lo/bit;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 9

    .line 344
    new-instance v3, Lo/axw;

    invoke-direct {v3}, Lo/axw;-><init>()V

    .line 346
    invoke-direct {p0}, Lo/biz;->c()Lo/bja;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lo/bja;->b(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v4

    .line 348
    invoke-virtual {v3, v4}, Lo/axw;->a(Ljava/util/List;)V

    .line 351
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 354
    invoke-direct {p0}, Lo/biz;->c()Lo/bja;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/bja;->b(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    .line 356
    invoke-virtual {v3, v5}, Lo/axw;->b(Ljava/util/List;)V

    .line 359
    iget v0, p0, Lo/biz;->h:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 362
    invoke-direct {p0}, Lo/biz;->k()Lo/bit;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bit;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 363
    invoke-virtual {v3, v6}, Lo/axw;->e(Ljava/util/List;)V

    .line 365
    invoke-direct {p0}, Lo/biz;->b()Lo/bjf;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/bjf;->a(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v7

    .line 366
    invoke-virtual {v3, v7}, Lo/axw;->c(Ljava/util/List;)V

    .line 367
    invoke-direct {p0}, Lo/biz;->b()Lo/bjf;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/bjf;->a(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v8

    .line 369
    invoke-virtual {v3, v8}, Lo/axw;->d(Ljava/util/List;)V

    .line 370
    goto :goto_0

    .line 374
    :cond_0
    invoke-direct {p0}, Lo/biz;->b()Lo/bjf;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/bjf;->a(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v6

    .line 375
    invoke-virtual {v3, v6}, Lo/axw;->c(Ljava/util/List;)V

    .line 377
    :goto_0
    goto :goto_1

    .line 382
    :cond_1
    invoke-direct {p0}, Lo/biz;->b()Lo/bjf;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/bjf;->a(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v5

    .line 383
    invoke-virtual {v3, v5}, Lo/axw;->c(Ljava/util/List;)V

    .line 384
    invoke-direct {p0}, Lo/biz;->b()Lo/bjf;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/bjf;->a(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v6

    .line 385
    invoke-virtual {v3, v6}, Lo/axw;->d(Ljava/util/List;)V

    .line 387
    :goto_1
    return-object v3
.end method

.method public d(I)V
    .locals 0

    .line 78
    iput p1, p0, Lo/biz;->h:I

    .line 79
    return-void
.end method

.method public d(Landroid/os/Handler;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lo/biz;->e:Landroid/os/Handler;

    .line 89
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 2

    .line 397
    iget-object v0, p0, Lo/biz;->d:Lo/bfq$c;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 399
    move-object v1, p1

    check-cast v1, Lo/axw;

    .line 400
    invoke-direct {p0, v1}, Lo/biz;->a(Lo/axw;)V

    .line 401
    iget-object v0, p0, Lo/biz;->d:Lo/bfq$c;

    invoke-interface {v0}, Lo/bfq$c;->b()V

    .line 403
    :cond_0
    return-void
.end method
