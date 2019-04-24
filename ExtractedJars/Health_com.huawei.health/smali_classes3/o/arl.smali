.class public Lo/arl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/arl$d;
    }
.end annotation


# static fields
.field private static a:Landroid/os/Handler;

.field private static b:Landroid/content/Context;

.field private static final d:[Ljava/lang/String;

.field private static final e:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 55
    const/4 v0, 0x0

    sput-object v0, Lo/arl;->a:Landroid/os/Handler;

    .line 65
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "bucket_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "bucket_display_name"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/arl;->e:[Ljava/lang/String;

    .line 74
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/arl;->d:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/arl;->c(Landroid/content/Context;)V

    .line 94
    invoke-static {p2}, Lo/arl;->c(Landroid/os/Handler;)V

    .line 95
    return-void
.end method

.method static synthetic a()Landroid/os/Handler;
    .locals 1

    .line 30
    sget-object v0, Lo/arl;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private static a(I)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 109
    new-instance v0, Lo/arl$3;

    invoke-direct {v0, p0}, Lo/arl$3;-><init>(I)V

    return-object v0
.end method

.method static synthetic b(Lo/arl;Landroid/net/Uri;)I
    .locals 1

    .line 30
    invoke-direct {p0, p1}, Lo/arl;->d(Landroid/net/Uri;)I

    move-result v0

    return v0
.end method

.method static synthetic b()Ljava/util/ArrayList;
    .locals 1

    .line 30
    invoke-static {}, Lo/arl;->c()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private static c()Ljava/util/ArrayList;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/Album;>;"
        }
    .end annotation

    .line 147
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 148
    const-string v8, "date_added desc"

    .line 149
    const/4 v9, 0x0

    .line 153
    :try_start_0
    sget-object v0, Lo/arl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lo/arl;->e:[Ljava/lang/String;

    const-string v3, "mime_type!=? "

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const-string v5, "image/gif"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    move-object v5, v8

    invoke-static/range {v0 .. v5}, Landroid/provider/MediaStore$Images$Media;->query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 155
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 157
    const/4 v11, 0x0

    .line 158
    if-eqz v9, :cond_1

    .line 160
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 163
    const/4 v0, 0x1

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 164
    const/4 v0, 0x2

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v14

    .line 165
    const/4 v15, 0x0

    .line 168
    :try_start_1
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    move v15, v0

    .line 173
    goto :goto_1

    .line 170
    :catch_0
    move-exception v16

    .line 172
    const-string v0, "GetPhotoTask"

    const-string v1, " getPhotoAlbumFromDb NumberFormatException"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    :goto_1
    invoke-interface {v10, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 177
    new-instance v11, Lcom/huawei/health/sns/model/chat/Album;

    invoke-direct {v11}, Lcom/huawei/health/sns/model/chat/Album;-><init>()V

    .line 178
    invoke-virtual {v11, v14}, Lcom/huawei/health/sns/model/chat/Album;->setName(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v11, v15}, Lcom/huawei/health/sns/model/chat/Album;->setFirstPhotoId(I)V

    .line 180
    invoke-virtual {v11, v15}, Lcom/huawei/health/sns/model/chat/Album;->addPhotoItem(I)V

    .line 181
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/model/chat/Album;->setCount(I)V

    .line 182
    invoke-interface {v10, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 187
    :cond_0
    invoke-interface {v10, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/sns/model/chat/Album;

    .line 188
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/chat/Album;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/model/chat/Album;->setCount(I)V

    .line 189
    invoke-virtual {v11, v15}, Lcom/huawei/health/sns/model/chat/Album;->addPhotoItem(I)V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 191
    :goto_2
    goto/16 :goto_0

    .line 200
    :cond_1
    if-eqz v9, :cond_3

    .line 202
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_3

    .line 194
    :catch_1
    move-exception v10

    .line 196
    const-string v0, "GetPhotoTask"

    const-string v1, " getPhotoAlbumFromDb SQLException "

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 200
    if-eqz v9, :cond_3

    .line 202
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_3

    .line 200
    :catchall_0
    move-exception v17

    if-eqz v9, :cond_2

    .line 202
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 204
    :cond_2
    throw v17

    .line 205
    :cond_3
    :goto_3
    return-object v7
.end method

.method private static c(Landroid/content/Context;)V
    .locals 0

    .line 44
    sput-object p0, Lo/arl;->b:Landroid/content/Context;

    .line 45
    return-void
.end method

.method private static c(Landroid/os/Handler;)V
    .locals 0

    .line 59
    sput-object p0, Lo/arl;->a:Landroid/os/Handler;

    .line 60
    return-void
.end method

.method private d(Landroid/net/Uri;)I
    .locals 8

    .line 301
    const/4 v4, -0x1

    .line 302
    const/4 v5, 0x0

    .line 305
    :try_start_0
    sget-object v0, Lo/arl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/arl;->e:[Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Landroid/provider/MediaStore$Images$Media;->query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v5, v0

    .line 307
    if-eqz v5, :cond_0

    .line 309
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    .line 310
    const-string v0, "_id"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    move v4, v0

    .line 327
    :cond_0
    if-eqz v5, :cond_2

    .line 329
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 313
    :catch_0
    move-exception v6

    .line 315
    const-string v0, "GetPhotoTask"

    const-string v1, ":getPhotoIdByUri SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    if-eqz v5, :cond_2

    .line 329
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 317
    :catch_1
    move-exception v6

    .line 319
    const-string v0, "GetPhotoTask"

    const-string v1, ":getPhotoIdByUri NumberFormatException!"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 327
    if-eqz v5, :cond_2

    .line 329
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 321
    :catch_2
    move-exception v6

    .line 323
    const-string v0, "GetPhotoTask"

    const-string v1, ":getPhotoIdByUri Throwable!"

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 327
    if-eqz v5, :cond_2

    .line 329
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 327
    :catchall_0
    move-exception v7

    if-eqz v5, :cond_1

    .line 329
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 331
    :cond_1
    throw v7

    .line 332
    :cond_2
    :goto_0
    return v4
.end method

.method static synthetic d()Lcom/huawei/health/sns/model/chat/Album;
    .locals 1

    .line 30
    invoke-static {}, Lo/arl;->e()Lcom/huawei/health/sns/model/chat/Album;

    move-result-object v0

    return-object v0
.end method

.method private static e()Lcom/huawei/health/sns/model/chat/Album;
    .locals 13

    .line 215
    new-instance v7, Lcom/huawei/health/sns/model/chat/Album;

    invoke-direct {v7}, Lcom/huawei/health/sns/model/chat/Album;-><init>()V

    .line 216
    const-string v8, "date_added desc"

    .line 217
    const/4 v9, 0x0

    .line 224
    :try_start_0
    sget-object v0, Lo/arl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lo/arl;->d:[Ljava/lang/String;

    const-string v3, "mime_type!=? "

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const-string v5, "image/gif"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    move-object v5, v8

    invoke-static/range {v0 .. v5}, Landroid/provider/MediaStore$Images$Media;->query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 227
    sget-object v0, Lo/arl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_all_album:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/Album;->setName(Ljava/lang/String;)V

    .line 228
    if-eqz v9, :cond_0

    .line 230
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 232
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v10

    .line 235
    :try_start_1
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/Album;->addPhotoItem(I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 240
    goto :goto_1

    .line 237
    :catch_0
    move-exception v11

    .line 239
    const-string v0, "GetPhotoTask"

    const-string v1, " getAllPhotoAlbumFromDb NumberFormatException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    :goto_1
    goto :goto_0

    .line 250
    :cond_0
    if-eqz v9, :cond_2

    .line 252
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_2

    .line 244
    :catch_1
    move-exception v10

    .line 246
    const-string v0, "GetPhotoTask"

    const-string v1, " getAllPhotoAlbumFromDb SQLException "

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 250
    if-eqz v9, :cond_2

    .line 252
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_2

    .line 250
    :catchall_0
    move-exception v12

    if-eqz v9, :cond_1

    .line 252
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 254
    :cond_1
    throw v12

    .line 255
    :cond_2
    :goto_2
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 257
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/Album;->setCount(I)V

    .line 258
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/Album;->setFirstPhotoId(I)V

    goto :goto_3

    .line 262
    :cond_3
    const-string v0, "GetPhotoTask"

    const-string v1, ":getAllPhotoAlbumFromDb album.getPhotoIdList() == null!!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    :goto_3
    return-object v7
.end method


# virtual methods
.method public b(I)V
    .locals 2

    .line 104
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/arl;->a(I)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 105
    return-void
.end method

.method public e(Landroid/net/Uri;Lo/arl$d;)V
    .locals 3

    .line 275
    new-instance v0, Lo/arl$1;

    invoke-direct {v0, p0, p1, p2}, Lo/arl$1;-><init>(Lo/arl;Landroid/net/Uri;Lo/arl$d;)V

    sget-object v1, Lo/brb;->e:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 290
    invoke-virtual {v0, v1, v2}, Lo/arl$1;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 291
    return-void
.end method
