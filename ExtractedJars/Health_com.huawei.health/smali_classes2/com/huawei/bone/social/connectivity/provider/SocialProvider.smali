.class public Lcom/huawei/bone/social/connectivity/provider/SocialProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final e:Landroid/content/UriMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 25
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    .line 40
    const-class v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method private static a()V
    .locals 4

    .line 43
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "posts"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 44
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "postsid"

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 45
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "comments"

    const/4 v3, 0x6

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 46
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "likes"

    const/4 v3, 0x4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "iamins"

    const/4 v3, 0x5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 48
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "images"

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 49
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "imagesid"

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 50
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "replyto"

    const/16 v3, 0x8

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 51
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "mymoments"

    const/16 v3, 0x9

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 52
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "detail_likes"

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 53
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "detail_comments"

    const/16 v3, 0xb

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 54
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "detail_posts"

    const/16 v3, 0xc

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 55
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    sget-object v1, Lo/wk;->d:Ljava/lang/String;

    const-string v2, "posts_all"

    const/16 v3, 0xd

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 57
    return-void
.end method


# virtual methods
.method public bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I
    .locals 5
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Landroid/content/ContentValues;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 188
    const/4 v4, -0x1

    .line 190
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 193
    :pswitch_0
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/wr;->a([Landroid/content/ContentValues;)J

    move-result-wide v0

    long-to-int v4, v0

    .line 194
    goto :goto_0

    .line 198
    :pswitch_1
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/wr;->a([Landroid/content/ContentValues;)J

    move-result-wide v0

    long-to-int v4, v0

    .line 199
    goto :goto_0

    .line 202
    :pswitch_2
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/wr;->c([Landroid/content/ContentValues;)J

    move-result-wide v0

    long-to-int v4, v0

    .line 203
    goto :goto_0

    .line 206
    :pswitch_3
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/wr;->e([Landroid/content/ContentValues;)J

    move-result-wide v0

    long-to-int v4, v0

    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "POST_DETAIL bulk insert: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    .line 213
    :goto_0
    :pswitch_4
    if-lez v4, :cond_0

    .line 214
    invoke-virtual {p0}, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->e:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;Z)V

    .line 216
    :cond_0
    return v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 5
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 221
    const/4 v4, -0x1

    .line 223
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 226
    :sswitch_0
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/wr;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 227
    goto :goto_0

    .line 230
    :sswitch_1
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/wr;->c(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 231
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DELETED LIKES: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    .line 237
    :goto_0
    if-lez v4, :cond_0

    .line 238
    invoke-virtual {p0}, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->e:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;Z)V

    .line 240
    :cond_0
    return v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 146
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 7
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 152
    const-wide/16 v4, -0x1

    .line 154
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v6

    .line 156
    packed-switch v6, :pswitch_data_0

    goto :goto_0

    .line 159
    :pswitch_0
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/wr;->d(Landroid/content/ContentValues;)J

    move-result-wide v4

    .line 160
    goto :goto_0

    .line 166
    :pswitch_1
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/wr;->d(Landroid/content/ContentValues;)J

    move-result-wide v4

    .line 167
    goto :goto_0

    .line 171
    :pswitch_2
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/wr;->b(Landroid/content/ContentValues;)J

    move-result-wide v4

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TYPE:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and ret value:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    .line 178
    :goto_0
    :pswitch_3
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    .line 179
    invoke-virtual {p0}, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->e:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;Z)V

    .line 180
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    .line 182
    :cond_0
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public onCreate()Z
    .locals 4

    .line 61
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialProvider onCreate()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 63
    invoke-virtual {p0}, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a(Landroid/content/Context;)V

    .line 66
    :cond_0
    invoke-static {}, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->a()V

    .line 67
    const/4 v0, 0x0

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 7
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 74
    const/4 v4, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v6

    .line 79
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_0

    .line 82
    :pswitch_0
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->c()Landroid/database/Cursor;

    move-result-object v4

    .line 83
    goto/16 :goto_1

    .line 85
    :pswitch_1
    const-string v0, "post_id"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 87
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/wr;->d(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 88
    goto/16 :goto_1

    .line 90
    :pswitch_2
    const-string v0, "post_id"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 92
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/wr;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 93
    goto/16 :goto_1

    .line 95
    :pswitch_3
    const-string v0, "post_id"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 97
    goto/16 :goto_1

    .line 99
    :pswitch_4
    const-string v0, "post_id"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 101
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/wr;->b(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 102
    goto/16 :goto_1

    .line 104
    :pswitch_5
    const-string v0, "post_id"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 106
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/wr;->e(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 107
    goto :goto_1

    .line 109
    :pswitch_6
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====POST_PHOTOS_ID "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    const-string v0, "post_id"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 112
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/wr;->c(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 113
    goto :goto_1

    .line 116
    :pswitch_7
    const-string v0, "post_id"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 118
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/wr;->f(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 119
    goto :goto_1

    .line 121
    :pswitch_8
    const-string v0, "post_id"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 123
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/wr;->k(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 124
    goto :goto_1

    .line 127
    :pswitch_9
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->a()Landroid/database/Cursor;

    move-result-object v4

    .line 128
    goto :goto_1

    .line 131
    :pswitch_a
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->e()Landroid/database/Cursor;

    move-result-object v4

    .line 132
    goto :goto_1

    .line 134
    :goto_0
    :pswitch_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 137
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 138
    invoke-virtual {p0}, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->e:Landroid/net/Uri;

    invoke-interface {v4, v0, v1}, Landroid/database/Cursor;->setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 140
    :cond_0
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_6
        :pswitch_b
        :pswitch_b
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 5
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 245
    const/4 v4, 0x0

    .line 247
    sget-object v0, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->e:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 250
    :pswitch_0
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lo/wr;->c(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 251
    goto/16 :goto_0

    .line 254
    :pswitch_1
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lo/wr;->a(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 255
    goto/16 :goto_0

    .line 258
    :pswitch_2
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lo/wr;->b(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 259
    goto/16 :goto_0

    .line 262
    :pswitch_3
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lo/wr;->e(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "POST_DETAIL_LIKES:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    goto :goto_0

    .line 267
    :pswitch_4
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lo/wr;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "POST_DETAIL_COMMENT:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    goto :goto_0

    .line 272
    :pswitch_5
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lo/wr;->i(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 273
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "POST_MY_MOMENTS:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    .line 279
    :goto_0
    :pswitch_6
    if-lez v4, :cond_0

    .line 280
    invoke-virtual {p0}, Lcom/huawei/bone/social/connectivity/provider/SocialProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->e:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;Z)V

    .line 282
    :cond_0
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_6
        :pswitch_6
        :pswitch_1
        :pswitch_6
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
