.class public Lo/ask;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:[Ljava/lang/String;

.field private static final d:[Ljava/lang/String;

.field private static final e:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 23
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "contact_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "raw_contact_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "display_name"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "data1"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/ask;->d:[Ljava/lang/String;

    .line 26
    sget-object v0, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sput-object v0, Lo/ask;->e:Landroid/net/Uri;

    .line 30
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "com.android.huawei.phone"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/ask;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/ContentResolver;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/ContentResolver;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lo/asl;>;"
        }
    .end annotation

    .line 116
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 118
    const/4 v7, 0x0

    .line 121
    move-object/from16 v0, p0

    :try_start_0
    sget-object v1, Lo/ask;->e:Landroid/net/Uri;

    sget-object v2, Lo/ask;->d:[Ljava/lang/String;

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 123
    if-eqz v7, :cond_2

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v0

    .line 132
    const/4 v14, 0x0

    .line 133
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 135
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    .line 136
    const/4 v0, 0x2

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 137
    const/4 v0, 0x1

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11

    .line 138
    const/4 v0, 0x3

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 140
    if-eqz v14, :cond_0

    invoke-virtual {v14}, Lo/asl;->b()J

    move-result-wide v0

    cmp-long v0, v0, v8

    if-eqz v0, :cond_1

    .line 142
    :cond_0
    new-instance v0, Lo/asl;

    invoke-direct {v0, v8, v9, v10}, Lo/asl;-><init>(JLjava/lang/String;)V

    invoke-virtual {v0, v11, v12, v13}, Lo/asl;->c(JLjava/lang/String;)Lo/asl;

    move-result-object v14

    .line 143
    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 147
    :cond_1
    invoke-virtual {v14, v11, v12, v13}, Lo/asl;->c(JLjava/lang/String;)Lo/asl;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 158
    :cond_2
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 159
    goto :goto_1

    .line 152
    :catch_0
    move-exception v8

    .line 154
    const-string v0, "PhoneQueryHelper"

    const-string v1, "Query phone contacts, exception."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 159
    goto :goto_1

    .line 158
    :catchall_0
    move-exception v15

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 159
    throw v15

    .line 161
    :goto_1
    return-object v6
.end method

.method public static b(Landroid/content/ContentResolver;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/ContentResolver;)Ljava/util/List<Lo/asl;>;"
        }
    .end annotation

    .line 51
    const-string v0, "account_type=?"

    sget-object v1, Lo/ask;->c:[Ljava/lang/String;

    const-string v2, "contact_id,_id"

    invoke-static {p0, v0, v1, v2}, Lo/ask;->a(Landroid/content/ContentResolver;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/ContentResolver;J)Lo/asl;
    .locals 15

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 66
    const-string v8, "account_type=? and contact_id=?"

    .line 67
    const/4 v0, 0x2

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "com.android.huawei.phone"

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 68
    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 69
    move-object v0, p0

    sget-object v1, Lo/ask;->e:Landroid/net/Uri;

    sget-object v2, Lo/ask;->d:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 71
    if-eqz v7, :cond_1

    .line 77
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    const/4 v0, 0x2

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 80
    const/4 v0, 0x1

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11

    .line 81
    const/4 v0, 0x3

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 82
    if-nez v6, :cond_0

    .line 84
    new-instance v0, Lo/asl;

    move-wide/from16 v1, p1

    invoke-direct {v0, v1, v2, v10}, Lo/asl;-><init>(JLjava/lang/String;)V

    invoke-virtual {v0, v11, v12, v13}, Lo/asl;->c(JLjava/lang/String;)Lo/asl;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {v6, v11, v12, v13}, Lo/asl;->c(JLjava/lang/String;)Lo/asl;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 99
    :cond_1
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 100
    goto :goto_1

    .line 93
    :catch_0
    move-exception v8

    .line 95
    const-string v0, "PhoneQueryHelper"

    const-string v1, "Query phone contacts, exception."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 100
    goto :goto_1

    .line 99
    :catchall_0
    move-exception v14

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 100
    throw v14

    .line 101
    :goto_1
    return-object v6
.end method
