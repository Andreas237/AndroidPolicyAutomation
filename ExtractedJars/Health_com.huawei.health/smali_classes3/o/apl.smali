.class public Lo/apl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/apl$e;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Lo/apl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/apl;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/apl;->e:Ljava/lang/String;

    .line 70
    return-void
.end method

.method synthetic constructor <init>(Lo/apl$5;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/apl;-><init>()V

    return-void
.end method

.method public static d()Lo/apl;
    .locals 1

    .line 64
    sget-object v0, Lo/apl$e;->c:Lo/apl;

    return-object v0
.end method

.method private e()Z
    .locals 2

    .line 255
    iget-object v0, p0, Lo/apl;->e:Ljava/lang/String;

    const-string v1, "local_pic_"

    invoke-static {v0, v1}, Lo/bot;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public b(Ljava/util/ArrayList;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)I"
        }
    .end annotation

    .line 80
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 82
    const/4 v0, -0x2

    return v0

    .line 84
    :cond_0
    const/4 v2, 0x0

    .line 85
    const/4 v3, 0x1

    .line 87
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 88
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 90
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 91
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 93
    goto :goto_0

    .line 95
    :cond_1
    const/4 v6, 0x0

    .line 97
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v7

    .line 98
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 101
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v7

    .line 103
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/apl;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "chat_pic_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 105
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lo/apl;->e:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bot;->e(Ljava/lang/String;)J

    move-result-wide v9

    .line 106
    const-wide/16 v0, -0x2

    cmp-long v0, v9, v0

    if-nez v0, :cond_3

    .line 108
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 109
    goto/16 :goto_0

    .line 111
    :cond_3
    const-wide/32 v0, 0x32000

    cmp-long v0, v9, v0

    if-gez v0, :cond_4

    .line 113
    const/4 v0, -0x3

    return v0

    .line 115
    :cond_4
    const-wide/32 v0, 0x32000

    invoke-static {v7, v0, v1}, Lo/bot;->d(Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 118
    const-wide/32 v0, 0x32000

    invoke-static {v7, v8, v0, v1}, Lo/bov;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v6, 0x0

    goto :goto_1

    :cond_5
    const/4 v6, -0x2

    :goto_1
    goto :goto_2

    .line 123
    :cond_6
    invoke-static {v7, v8}, Lo/bot;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    .line 125
    :goto_2
    if-nez v6, :cond_7

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "chat_pic_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 130
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 133
    :cond_7
    const/4 v0, -0x1

    if-eq v6, v0, :cond_8

    const/4 v0, -0x2

    if-ne v6, v0, :cond_9

    .line 135
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 137
    :cond_9
    :goto_3
    goto/16 :goto_0

    .line 138
    :cond_a
    return v2
.end method

.method public b(I)Ljava/lang/String;
    .locals 2

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/apl;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "local_pic_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/content/Context;Ljava/util/ArrayList;)I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Ljava/lang/Integer;>;)I"
        }
    .end annotation

    .line 207
    invoke-direct {p0}, Lo/apl;->e()Z

    .line 209
    new-instance v2, Lo/avb;

    invoke-direct {v2, p1}, Lo/avb;-><init>(Landroid/content/Context;)V

    .line 210
    const/4 v3, 0x1

    .line 211
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 213
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/avb;->b(I)Landroid/net/Uri;

    move-result-object v6

    .line 214
    invoke-static {p1, v6}, Lo/bov;->d(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v7

    .line 215
    if-eqz v7, :cond_0

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 217
    goto :goto_0

    .line 219
    :cond_1
    invoke-static {}, Lo/apl;->d()Lo/apl;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/apl;->b(I)Ljava/lang/String;

    move-result-object v8

    .line 220
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v9

    .line 221
    invoke-static {v9}, Lo/bot;->e(Ljava/lang/String;)J

    move-result-wide v10

    .line 222
    const-wide/16 v0, -0x2

    cmp-long v0, v10, v0

    if-nez v0, :cond_2

    .line 224
    const/4 v0, -0x2

    return v0

    .line 226
    :cond_2
    const-wide/32 v0, 0x32000

    cmp-long v0, v10, v0

    if-gez v0, :cond_3

    .line 228
    const/4 v0, -0x3

    return v0

    .line 230
    :cond_3
    const-wide/32 v0, 0x32000

    invoke-static {v7, v8, v0, v1}, Lo/bov;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 232
    add-int/lit8 v3, v3, 0x1

    .line 234
    :cond_4
    goto/16 :goto_0

    .line 235
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;)I
    .locals 2

    .line 245
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/apl;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "chat_record.json"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/bot;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c()V
    .locals 2

    .line 263
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lo/apl;->e:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/bot;->a(Ljava/io/File;)Z

    .line 264
    return-void
.end method

.method public d(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 149
    move-object v1, p1

    .line 150
    new-instance v2, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v2}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 151
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eq v0, v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v3, :cond_2

    .line 153
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 154
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v5

    .line 155
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 156
    const-string v8, ""

    .line 157
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 159
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v8

    .line 161
    :cond_0
    invoke-virtual {v2, v5, v6}, Landroid/support/v4/util/LongSparseArray;->indexOfKey(J)I

    move-result v0

    if-lez v0, :cond_1

    .line 163
    invoke-virtual {v2, v5, v6}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderName(Ljava/lang/String;)V

    goto :goto_1

    .line 167
    :cond_1
    invoke-virtual {v2, v5, v6, v8}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 168
    invoke-virtual {v4, v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderName(Ljava/lang/String;)V

    .line 170
    :goto_1
    invoke-virtual {v1, v3, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 151
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 172
    :cond_2
    return-object v1
.end method

.method public e(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 183
    const-string v1, ""

    .line 184
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 186
    return-object v1

    .line 188
    :cond_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 189
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 191
    invoke-static {v4}, Lo/axu;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/axu;

    move-result-object v0

    invoke-virtual {v0}, Lo/axu;->d()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 192
    goto :goto_0

    .line 193
    :cond_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    .line 194
    return-object v1
.end method
