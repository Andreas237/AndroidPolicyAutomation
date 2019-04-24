.class public Lo/bkf;
.super Lo/bfq;
.source "SourceFile"


# instance fields
.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field

.field private g:I

.field private i:I

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 57
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkf;->e:Ljava/util/List;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkf;->k:Ljava/util/List;

    .line 58
    return-void
.end method

.method private b()V
    .locals 5

    .line 140
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 141
    new-instance v4, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;-><init>()V

    .line 142
    const/16 v0, 0x17

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setCardType(I)V

    .line 143
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_friends_family_normal:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setResID(I)V

    .line 144
    iget-object v0, p0, Lo/bkf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_family_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setTitle(Ljava/lang/String;)V

    .line 145
    iget v0, p0, Lo/bkf;->i:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setMessageNum(I)V

    .line 146
    sget-object v0, Lo/bfp$c;->f:Lo/bfp$c;

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setEventType(Lo/bfp$c;)V

    .line 147
    const-string v0, "#"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setSortPinYin(Ljava/lang/String;)V

    .line 148
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x17

    const/16 v2, 0x17

    invoke-virtual {p0, v1, v2, v0, v3}, Lo/bkf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 150
    return-void
.end method

.method private c()V
    .locals 5

    .line 158
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 159
    new-instance v4, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;-><init>()V

    .line 160
    const/16 v0, 0x17

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setCardType(I)V

    .line 161
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_friends_group_normal:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setResID(I)V

    .line 162
    iget-object v0, p0, Lo/bkf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_chat_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setTitle(Ljava/lang/String;)V

    .line 163
    sget-object v0, Lo/bfp$c;->p:Lo/bfp$c;

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setEventType(Lo/bfp$c;)V

    .line 164
    const-string v0, "#"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setSortPinYin(Ljava/lang/String;)V

    .line 166
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setEnable(Z)V

    .line 167
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x17

    const/16 v2, 0x17

    invoke-virtual {p0, v1, v2, v0, v3}, Lo/bkf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 169
    return-void
.end method

.method private f()V
    .locals 5

    .line 177
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 178
    new-instance v4, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;-><init>()V

    .line 179
    const/16 v0, 0x17

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setCardType(I)V

    .line 180
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_friends_notification_normal:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setResID(I)V

    .line 181
    iget-object v0, p0, Lo/bkf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_system_notification:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setTitle(Ljava/lang/String;)V

    .line 182
    sget-object v0, Lo/bfp$c;->C:Lo/bfp$c;

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setEventType(Lo/bfp$c;)V

    .line 183
    const-string v0, "#"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setSortPinYin(Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lo/bkf;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bkf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 186
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setShowBottomLine(Z)V

    goto :goto_0

    .line 190
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setShowBottomLine(Z)V

    .line 192
    :goto_0
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 193
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x17

    const/16 v2, 0x17

    invoke-virtual {p0, v1, v2, v0, v3}, Lo/bkf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 194
    return-void
.end method

.method private g()V
    .locals 5

    .line 233
    iget-object v0, p0, Lo/bkf;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bkf;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 235
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 236
    new-instance v4, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;-><init>()V

    .line 237
    const/16 v0, 0x1e

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->setCardType(I)V

    .line 238
    sget-object v0, Lo/bfp$c;->b:Lo/bfp$c;

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->setEventType(Lo/bfp$c;)V

    .line 239
    const-string v0, "#"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->setSortPinYin(Ljava/lang/String;)V

    .line 240
    iget-object v0, p0, Lo/bkf;->k:Ljava/util/List;

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->setRecommendUserList(Ljava/util/List;)V

    .line 241
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x1e

    const/16 v2, 0x1e

    invoke-virtual {p0, v1, v2, v0, v3}, Lo/bkf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 245
    :cond_0
    return-void
.end method

.method private h()V
    .locals 5

    .line 252
    iget-object v0, p0, Lo/bkf;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bkf;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 255
    return-void

    .line 257
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 258
    new-instance v4, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;-><init>()V

    .line 259
    const/16 v0, 0x17

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setCardType(I)V

    .line 260
    iget v0, p0, Lo/bkf;->g:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setMessageNum(I)V

    .line 261
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_friends_add_normal:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setResID(I)V

    .line 262
    iget-object v0, p0, Lo/bkf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_new_friends:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setTitle(Ljava/lang/String;)V

    .line 263
    sget-object v0, Lo/bfp$c;->e:Lo/bfp$c;

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setEventType(Lo/bfp$c;)V

    .line 264
    const-string v0, "#"

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setSortPinYin(Ljava/lang/String;)V

    .line 265
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x17

    const/16 v2, 0x17

    invoke-virtual {p0, v1, v2, v0, v3}, Lo/bkf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 267
    return-void
.end method

.method private i()V
    .locals 7

    .line 201
    iget-object v0, p0, Lo/bkf;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bkf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 203
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 205
    new-instance v6, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v6}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 206
    iget-object v0, p0, Lo/bkf;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_friend_count:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/bkf;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 207
    const/16 v0, 0x15

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/user/User;->setCardType(I)V

    .line 208
    sget-object v0, Lo/bfp$c;->a:Lo/bfp$c;

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/user/User;->setEventType(Lo/bfp$c;)V

    .line 209
    const-string v0, "#"

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/user/User;->setSortPinYin(Ljava/lang/String;)V

    .line 210
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x15

    const/16 v2, 0x15

    invoke-virtual {p0, v1, v2, v0, v5}, Lo/bkf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 214
    iget-object v0, p0, Lo/bkf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/bkf;->e:Ljava/util/List;

    const/16 v2, 0x16

    const/16 v3, 0x16

    invoke-virtual {p0, v2, v3, v0, v1}, Lo/bkf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 215
    goto :goto_0

    .line 219
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 220
    new-instance v6, Lo/bfh;

    invoke-direct {v6}, Lo/bfh;-><init>()V

    .line 221
    const/16 v0, 0x1c

    invoke-virtual {v6, v0}, Lo/bfh;->setCardType(I)V

    .line 222
    sget-object v0, Lo/bfp$c;->g:Lo/bfp$c;

    invoke-virtual {v6, v0}, Lo/bfh;->setEventType(Lo/bfp$c;)V

    .line 223
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x1c

    const/16 v2, 0x1c

    invoke-virtual {p0, v1, v2, v0, v5}, Lo/bkf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 226
    :goto_0
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkf;->k:Ljava/util/List;

    .line 130
    iput p1, p0, Lo/bkf;->g:I

    .line 131
    invoke-virtual {p0}, Lo/bkf;->d()V

    .line 132
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 94
    iput-object p1, p0, Lo/bkf;->e:Ljava/util/List;

    .line 95
    invoke-virtual {p0}, Lo/bkf;->d()V

    .line 96
    return-void
.end method

.method public declared-synchronized d()V
    .locals 2

    monitor-enter p0

    .line 63
    :try_start_0
    iget-object v0, p0, Lo/bkf;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 65
    invoke-direct {p0}, Lo/bkf;->g()V

    .line 67
    invoke-direct {p0}, Lo/bkf;->h()V

    .line 69
    invoke-direct {p0}, Lo/bkf;->b()V

    .line 72
    invoke-direct {p0}, Lo/bkf;->c()V

    .line 75
    invoke-direct {p0}, Lo/bkf;->f()V

    .line 78
    invoke-direct {p0}, Lo/bkf;->i()V

    .line 80
    invoke-virtual {p0}, Lo/bkf;->a()Lo/bfq$c;

    move-result-object v1

    .line 81
    if-eqz v1, :cond_0

    .line 83
    invoke-interface {v1}, Lo/bfq$c;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public d(I)V
    .locals 0

    .line 105
    iput p1, p0, Lo/bkf;->i:I

    .line 106
    invoke-virtual {p0}, Lo/bkf;->d()V

    .line 107
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 116
    const-string v0, "setRecommendFriendList"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setRecommendFriendList:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lo/bkf;->g:I

    .line 118
    iput-object p1, p0, Lo/bkf;->k:Ljava/util/List;

    .line 119
    invoke-virtual {p0}, Lo/bkf;->d()V

    .line 120
    return-void
.end method
