.class public Lo/axg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/axg;->d:Landroid/content/ContentResolver;

    .line 31
    return-void
.end method


# virtual methods
.method public e()Ljava/util/ArrayList;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 40
    new-instance v6, Lo/axl;

    invoke-direct {v6}, Lo/axl;-><init>()V

    .line 41
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 42
    const-string v8, "sort_pinyin ASC"

    .line 43
    const/4 v9, 0x0

    .line 47
    const-string v10, "user_type =? and is_friend =? "

    .line 48
    const/4 v0, 0x2

    new-array v11, v0, [Ljava/lang/String;

    .line 49
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v11, v1

    .line 53
    :try_start_0
    iget-object v0, p0, Lo/axg;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    move-object v3, v10

    move-object v4, v11

    move-object v5, v8

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 54
    const/4 v12, 0x0

    .line 55
    if-eqz v9, :cond_0

    .line 57
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {v6, v9}, Lo/axl;->c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v12

    .line 60
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 70
    :cond_0
    if-eqz v9, :cond_2

    .line 72
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 64
    :catch_0
    move-exception v12

    .line 66
    const-string v0, "AssistantDBHelper"

    const-string v1, "getAssistantList error , SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    if-eqz v9, :cond_2

    .line 72
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 70
    :catchall_0
    move-exception v13

    if-eqz v9, :cond_1

    .line 72
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 74
    :cond_1
    throw v13

    .line 75
    :cond_2
    :goto_1
    return-object v7
.end method
