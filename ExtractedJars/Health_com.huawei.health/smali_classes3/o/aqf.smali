.class public Lo/aqf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(JLjava/lang/String;Ljava/lang/String;I)V
    .locals 8

    .line 173
    new-instance v6, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v6}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 174
    invoke-virtual {v6, p0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 175
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 176
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 177
    invoke-virtual {v6, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v6, p4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 179
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 180
    invoke-virtual {v6, p0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 183
    const/4 v7, 0x1

    .line 184
    const/4 v0, 0x1

    if-ne v0, p4, :cond_0

    .line 187
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->g(J)Z

    move-result v7

    .line 188
    invoke-virtual {v6, v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    .line 189
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/apz;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 193
    :cond_0
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/apz;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 196
    :goto_0
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-wide v1, p0

    move v3, p4

    move-object v4, p2

    move v5, v7

    invoke-virtual/range {v0 .. v5}, Lo/apz;->b(JILjava/lang/String;Z)V

    .line 197
    return-void
.end method

.method private static b(JLjava/lang/String;Ljava/util/List;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/lang/String;Ljava/util/List<Landroid/net/Uri;>;I)V"
        }
    .end annotation

    .line 88
    if-nez p3, :cond_0

    .line 90
    const-string v0, "ShareMessageManager"

    const-string v1, "sendImageMessage imagePathList is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    return-void

    .line 95
    :cond_0
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 97
    invoke-static {}, Lo/aop;->h()V

    .line 100
    :cond_1
    const/4 v6, 0x0

    .line 101
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/net/Uri;

    .line 103
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lo/aqr;->d(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 104
    if-nez v9, :cond_2

    .line 106
    goto :goto_0

    .line 108
    :cond_2
    new-instance v10, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v10}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 109
    invoke-virtual {v10, p0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 110
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 112
    invoke-virtual {v10, v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbnail(Ljava/lang/String;)V

    .line 113
    invoke-virtual {v10, v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 114
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaSize(J)V

    .line 116
    new-instance v11, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v11}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 118
    const/4 v0, 0x1

    iput-boolean v0, v11, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 119
    invoke-static {v9, v11}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 122
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 123
    move/from16 v0, p4

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 124
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 125
    invoke-virtual {v10, p0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 128
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 130
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 134
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setId(I)V

    .line 137
    const/4 v12, 0x1

    .line 138
    move/from16 v0, p4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 140
    const/4 v12, 0x2

    .line 142
    :cond_3
    const v0, 0x310dc

    invoke-static {v12, v0, v10}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 144
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/aus;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 147
    add-int/lit8 v6, v6, 0x1

    .line 148
    const/16 v0, 0x9

    if-lt v6, v0, :cond_4

    .line 150
    goto :goto_1

    .line 152
    :cond_4
    goto/16 :goto_0

    .line 155
    :cond_5
    :goto_1
    const/4 v7, 0x1

    .line 156
    const/4 v0, 0x1

    move/from16 v1, p4

    if-ne v0, v1, :cond_6

    .line 158
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->g(J)Z

    move-result v7

    .line 160
    :cond_6
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-wide v1, p0

    move/from16 v3, p4

    move-object v4, p2

    move v5, v7

    invoke-virtual/range {v0 .. v5}, Lo/apz;->b(JILjava/lang/String;Z)V

    .line 162
    return-void
.end method

.method static synthetic d(JLjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 36
    invoke-static {p0, p1, p2, p3, p4}, Lo/aqf;->a(JLjava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private static e(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 208
    new-instance v0, Lo/aqf$4;

    invoke-direct {v0, p1, p0}, Lo/aqf$4;-><init>(Lcom/huawei/health/sns/model/chat/ShareMessageParams;Ljava/lang/String;)V

    return-object v0
.end method

.method static synthetic e(JLjava/lang/String;Ljava/util/List;I)V
    .locals 0

    .line 36
    invoke-static {p0, p1, p2, p3, p4}, Lo/aqf;->b(JLjava/lang/String;Ljava/util/List;I)V

    return-void
.end method


# virtual methods
.method protected d(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)V
    .locals 6

    .line 52
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareType()Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    move-result-object v2

    .line 53
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareText()Ljava/lang/String;

    move-result-object v3

    .line 54
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getSharePicList()Ljava/util/ArrayList;

    move-result-object v4

    .line 56
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    if-ne v2, v0, :cond_1

    .line 58
    if-eqz v3, :cond_2

    .line 60
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->k()I

    move-result v5

    .line 61
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v5, :cond_0

    .line 63
    const/4 v0, 0x0

    invoke-virtual {v3, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 64
    invoke-virtual {p2, v3}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->setShareText(Ljava/lang/String;)V

    .line 66
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/aqf;->e(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 67
    goto :goto_0

    .line 69
    :cond_1
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    if-ne v2, v0, :cond_2

    .line 71
    if-eqz v4, :cond_2

    .line 73
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/aqf;->e(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 76
    :cond_2
    :goto_0
    return-void
.end method
