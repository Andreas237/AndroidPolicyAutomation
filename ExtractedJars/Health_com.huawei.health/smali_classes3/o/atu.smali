.class public Lo/atu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Context;

.field private d:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atu;->b:Landroid/content/Context;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    .line 45
    iput-object p1, p0, Lo/atu;->b:Landroid/content/Context;

    .line 46
    iget-object v0, p0, Lo/atu;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    .line 47
    return-void
.end method

.method private b(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 2

    .line 647
    const-string v0, "group_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 649
    return-object v1
.end method

.method private b(Ljava/lang/StringBuffer;)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/StringBuffer;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation

    .line 120
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 121
    new-instance v7, Lo/att;

    invoke-direct {v7}, Lo/att;-><init>()V

    .line 122
    const/4 v8, 0x0

    .line 125
    const-string v9, "t_conversation.chat_type =? and t_group.group_state = ? and t_group.group_type =? "

    .line 129
    const/4 v0, 0x3

    :try_start_0
    new-array v10, v0, [Ljava/lang/String;

    .line 130
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v10, v1

    .line 131
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v10, v1

    .line 133
    iget-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->a:Landroid/net/Uri;

    .line 134
    invoke-virtual {v7}, Lo/att;->c()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    move-object v4, v10

    const-string v5, "t_conversation.last_message_date desc"

    .line 133
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 137
    if-eqz v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 139
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 142
    :cond_0
    invoke-virtual {v7, v8}, Lo/att;->a(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v11

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 144
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 159
    :cond_1
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 160
    goto :goto_0

    .line 149
    :catch_0
    move-exception v9

    .line 151
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupConversation SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 160
    goto :goto_0

    .line 153
    :catch_1
    move-exception v9

    .line 155
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupConversation IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 159
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 160
    goto :goto_0

    .line 159
    :catchall_0
    move-exception v12

    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 160
    throw v12

    .line 161
    :goto_0
    return-object v6
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;Z)Z
    .locals 7

    .line 678
    move v2, p2

    .line 679
    new-instance v0, Lo/att;

    invoke-direct {v0}, Lo/att;-><init>()V

    invoke-virtual {v0, p1}, Lo/att;->a(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentValues;

    move-result-object v3

    .line 682
    const-string v4, "group_id =? "

    .line 684
    const/4 v0, 0x1

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    .line 685
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 687
    iget-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 688
    if-lez v6, :cond_0

    .line 690
    const/4 v2, 0x1

    .line 691
    sget-object v0, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v1, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 701
    :cond_0
    goto :goto_0

    .line 694
    :catch_0
    move-exception v4

    .line 696
    const-string v0, "GroupDBHelper"

    const-string v1, "updateGroupDB SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 701
    goto :goto_0

    .line 698
    :catch_1
    move-exception v4

    .line 700
    const-string v0, "GroupDBHelper"

    const-string v1, "updateGroupDB IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    :goto_0
    return v2
.end method

.method private c(Ljava/lang/StringBuffer;IZ)[Ljava/lang/String;
    .locals 3

    .line 293
    const/4 v2, 0x0

    .line 296
    if-eqz p2, :cond_0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 298
    :cond_0
    const-string v0, "group_type =? "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 299
    if-eqz p3, :cond_1

    .line 301
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    .line 302
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    goto/16 :goto_0

    .line 306
    :cond_1
    const-string v0, "and group_state =? "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 307
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    .line 308
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    goto :goto_0

    .line 312
    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_4

    .line 314
    const-string v0, "group_type =? and save_to_contract_mode =? "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 315
    if-eqz p3, :cond_3

    .line 317
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    .line 318
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    goto :goto_0

    .line 322
    :cond_3
    const-string v0, "and group_state =? "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 323
    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/String;

    .line 324
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v2, v1

    goto :goto_0

    .line 329
    :cond_4
    if-nez p3, :cond_5

    .line 331
    const-string v0, "group_state =? "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 332
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    .line 333
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 336
    :cond_5
    :goto_0
    return-object v2
.end method


# virtual methods
.method public a(J)Z
    .locals 6

    .line 611
    const/4 v2, 0x0

    .line 613
    const-string v3, "group_id =? "

    .line 615
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    .line 616
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 620
    :try_start_0
    iget-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 621
    if-lez v5, :cond_0

    .line 623
    const/4 v2, 0x1

    .line 624
    sget-object v0, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v1, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 634
    :cond_0
    goto :goto_0

    .line 627
    :catch_0
    move-exception v5

    .line 629
    const-string v0, "GroupDBHelper"

    const-string v1, "deleteGroupById SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    goto :goto_0

    .line 631
    :catch_1
    move-exception v5

    .line 633
    const-string v0, "GroupDBHelper"

    const-string v1, "deleteGroupById IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 635
    :goto_0
    return v2
.end method

.method public a(Lcom/huawei/health/sns/model/group/Group;)Z
    .locals 3

    .line 660
    const/4 v2, 0x0

    .line 661
    if-nez p1, :cond_0

    .line 663
    const-string v0, "GroupDBHelper"

    const-string v1, "updateGroup group=null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 664
    return v2

    .line 667
    :cond_0
    invoke-direct {p0, p1, v2}, Lo/atu;->b(Lcom/huawei/health/sns/model/group/Group;Z)Z

    move-result v0

    return v0
.end method

.method public b(I)I
    .locals 12

    .line 410
    const/4 v6, 0x0

    .line 412
    const/4 v7, 0x0

    .line 415
    const/4 v8, 0x0

    .line 416
    const/4 v9, 0x0

    .line 419
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 421
    :cond_0
    const-string v8, "group_type =? and group_state =?  or group_state =? "

    .line 422
    const/4 v0, 0x3

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 423
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    goto :goto_0

    .line 426
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 428
    const-string v8, "group_type =? and save_to_contract_mode =? and group_state =? "

    .line 430
    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    .line 431
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 434
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "count(*)"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 437
    if-nez v7, :cond_3

    .line 439
    const/4 v10, 0x0

    .line 459
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 439
    return v10

    .line 442
    :cond_3
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_4

    .line 444
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 445
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    move v6, v0

    .line 459
    :cond_4
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 460
    goto :goto_1

    .line 449
    :catch_0
    move-exception v8

    .line 451
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupCount SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 459
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 460
    goto :goto_1

    .line 453
    :catch_1
    move-exception v8

    .line 455
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupCount IllegalStateException."

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 459
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 460
    goto :goto_1

    .line 459
    :catchall_0
    move-exception v11

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 460
    throw v11

    .line 462
    :goto_1
    return v6
.end method

.method public b(Lcom/huawei/health/sns/model/group/Group;)Z
    .locals 5

    .line 713
    if-nez p1, :cond_0

    .line 715
    const-string v0, "GroupDBHelper"

    const-string v1, "modifyGroup group=null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 716
    const/4 v0, 0x0

    return v0

    .line 719
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 721
    const-string v0, "GroupDBHelper"

    const-string v1, "modifyGroup group.groupId == -1."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 722
    const/4 v0, 0x0

    return v0

    .line 724
    :cond_1
    const/4 v4, 0x0

    .line 726
    invoke-direct {p0, p1, v4}, Lo/atu;->b(Lcom/huawei/health/sns/model/group/Group;Z)Z

    move-result v0

    return v0
.end method

.method public c(J)Lcom/huawei/health/sns/model/group/Group;
    .locals 13

    .line 523
    const/4 v6, 0x0

    .line 524
    const/4 v7, 0x0

    .line 525
    new-instance v8, Lo/att;

    invoke-direct {v8}, Lo/att;-><init>()V

    .line 529
    const-string v9, "group_id =? "

    .line 530
    const/4 v0, 0x1

    :try_start_0
    new-array v10, v0, [Ljava/lang/String;

    .line 531
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 533
    iget-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    move-object v3, v9

    move-object v4, v10

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 534
    if-nez v7, :cond_0

    .line 536
    const/4 v11, 0x0

    .line 556
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 536
    return-object v11

    .line 539
    :cond_0
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 541
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 542
    invoke-virtual {v8, v7}, Lo/att;->e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 556
    :cond_1
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 557
    goto :goto_0

    .line 546
    :catch_0
    move-exception v9

    .line 548
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupById SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 556
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 557
    goto :goto_0

    .line 550
    :catch_1
    move-exception v9

    .line 552
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupById IllegalStateException."

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 556
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 557
    goto :goto_0

    .line 556
    :catchall_0
    move-exception v12

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 557
    throw v12

    .line 559
    :goto_0
    return-object v6
.end method

.method public c()Ljava/util/ArrayList;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation

    .line 56
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 57
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/atu;->b(Ljava/lang/StringBuffer;)Ljava/util/ArrayList;

    move-result-object v7

    .line 58
    const/4 v8, 0x0

    .line 59
    new-instance v9, Lo/att;

    invoke-direct {v9}, Lo/att;-><init>()V

    .line 62
    const-string v10, "group_type =? and save_to_contract_mode =? and group_state =? "

    .line 65
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v11

    .line 66
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 68
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 70
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v11, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 72
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "and t_group.group_id not in("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 77
    :cond_1
    const/4 v0, 0x3

    new-array v12, v0, [Ljava/lang/String;

    .line 78
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v12, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v12, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v12, v1

    .line 79
    const-string v13, "sort_pinyin asc, create_time desc"

    .line 81
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    move-object v3, v10

    move-object v4, v12

    move-object v5, v13

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 82
    if-nez v8, :cond_2

    .line 84
    move-object v14, v7

    .line 106
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 84
    return-object v14

    .line 86
    :cond_2
    :try_start_1
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_4

    .line 88
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 91
    :cond_3
    invoke-virtual {v9, v8}, Lo/att;->e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_3

    .line 106
    :cond_4
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 107
    goto :goto_0

    .line 96
    :catch_0
    move-exception v10

    .line 98
    const-string v0, "GroupDBHelper"

    const-string v1, "getGrpListForGrpChat SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 107
    goto :goto_0

    .line 100
    :catch_1
    move-exception v10

    .line 102
    const-string v0, "GroupDBHelper"

    const-string v1, "getGrpListForGrpChat IllegalStateException."

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 106
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 107
    goto :goto_0

    .line 106
    :catchall_0
    move-exception v15

    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 107
    throw v15

    .line 109
    :goto_0
    return-object v7
.end method

.method public c(IZ)Ljava/util/ArrayList;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation

    .line 233
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 234
    const/4 v7, 0x0

    .line 235
    new-instance v8, Lo/att;

    invoke-direct {v8}, Lo/att;-><init>()V

    .line 239
    :try_start_0
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 240
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-direct {v0, v9, v1, v2}, Lo/atu;->c(Ljava/lang/StringBuffer;IZ)[Ljava/lang/String;

    move-result-object v10

    .line 242
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v11

    .line 245
    :goto_0
    const-string v12, "stick_time desc, sort_pinyin asc, create_time desc"

    .line 246
    move-object v13, v12

    .line 247
    move/from16 v0, p1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 251
    move-object v13, v12

    .line 253
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    move-object v3, v11

    move-object v4, v10

    move-object v5, v13

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 254
    if-nez v7, :cond_2

    .line 256
    move-object v14, v6

    .line 278
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 256
    return-object v14

    .line 258
    :cond_2
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_4

    .line 260
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 263
    :cond_3
    invoke-virtual {v8, v7}, Lo/att;->e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_3

    .line 278
    :cond_4
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 279
    goto :goto_1

    .line 268
    :catch_0
    move-exception v9

    .line 270
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupList SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 278
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 279
    goto :goto_1

    .line 272
    :catch_1
    move-exception v9

    .line 274
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupList IllegalStateException."

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 278
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 279
    goto :goto_1

    .line 278
    :catchall_0
    move-exception v15

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 279
    throw v15

    .line 280
    :goto_1
    return-object v6
.end method

.method public d(IZ)Ljava/util/ArrayList;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation

    .line 174
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 175
    const/4 v7, 0x0

    .line 176
    new-instance v8, Lo/att;

    invoke-direct {v8}, Lo/att;-><init>()V

    .line 180
    :try_start_0
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 181
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-direct {v0, v9, v1, v2}, Lo/atu;->c(Ljava/lang/StringBuffer;IZ)[Ljava/lang/String;

    move-result-object v10

    .line 183
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v11

    .line 186
    :goto_0
    const-string v12, "sort_pinyin asc, create_time desc"

    .line 187
    move-object v13, v12

    .line 188
    move/from16 v0, p1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "grp_name_flag asc, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 193
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    move-object v3, v11

    move-object v4, v10

    move-object v5, v13

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 194
    if-nez v7, :cond_2

    .line 196
    move-object v14, v6

    .line 218
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 196
    return-object v14

    .line 198
    :cond_2
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_4

    .line 200
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 203
    :cond_3
    invoke-virtual {v8, v7}, Lo/att;->e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_3

    .line 218
    :cond_4
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 219
    goto :goto_1

    .line 208
    :catch_0
    move-exception v9

    .line 210
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupList SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 218
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 219
    goto :goto_1

    .line 212
    :catch_1
    move-exception v9

    .line 214
    const-string v0, "GroupDBHelper"

    const-string v1, "getGroupList IllegalStateException."

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 218
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 219
    goto :goto_1

    .line 218
    :catchall_0
    move-exception v15

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 219
    throw v15

    .line 220
    :goto_1
    return-object v6
.end method

.method public d(Lcom/huawei/health/sns/model/group/Group;)Z
    .locals 5

    .line 571
    if-nez p1, :cond_0

    .line 573
    const-string v0, "GroupDBHelper"

    const-string v1, "insertGroup group=null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    const/4 v0, 0x0

    return v0

    .line 576
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 578
    const/4 v0, 0x0

    return v0

    .line 581
    :cond_1
    const/4 v2, 0x0

    .line 584
    :try_start_0
    new-instance v0, Lo/att;

    invoke-direct {v0}, Lo/att;-><init>()V

    invoke-virtual {v0, p1}, Lo/att;->a(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentValues;

    move-result-object v3

    .line 585
    iget-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v4

    .line 586
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 588
    const/4 v2, 0x1

    .line 589
    iget-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    invoke-static {v4, v0}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 599
    :cond_2
    goto :goto_0

    .line 592
    :catch_0
    move-exception v3

    .line 594
    const-string v0, "GroupDBHelper"

    const-string v1, "insertGroup SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    goto :goto_0

    .line 596
    :catch_1
    move-exception v3

    .line 598
    const-string v0, "GroupDBHelper"

    const-string v1, "insertGroup IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 600
    :goto_0
    return v2
.end method

.method public e(J)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 473
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 474
    const/4 v7, 0x0

    .line 477
    const-string v8, "group_type =? and manager_id =? and group_state =? "

    .line 480
    const/4 v0, 0x3

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 481
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 483
    iget-object v0, p0, Lo/atu;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    move-object v3, v8

    move-object v4, v9

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 485
    if-nez v7, :cond_0

    .line 487
    move-object v10, v6

    .line 509
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 487
    return-object v10

    .line 489
    :cond_0
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 491
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 494
    :cond_1
    invoke-direct {p0, v7}, Lo/atu;->b(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 496
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 509
    :cond_2
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 510
    goto :goto_0

    .line 499
    :catch_0
    move-exception v8

    .line 501
    const-string v0, "GroupDBHelper"

    const-string v1, "getFamilyGroupNames SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 509
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 510
    goto :goto_0

    .line 503
    :catch_1
    move-exception v8

    .line 505
    const-string v0, "GroupDBHelper"

    const-string v1, "getFamilyGroupNames IllegalStateException."

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 509
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 510
    goto :goto_0

    .line 509
    :catchall_0
    move-exception v11

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 510
    throw v11

    .line 511
    :goto_0
    return-object v6
.end method
