.class public Lo/arv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;[Ljava/lang/String;>;"
        }
    .end annotation

    .line 76
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 77
    new-instance v2, Lo/asc;

    invoke-direct {v2, v1}, Lo/asc;-><init>(Landroid/content/Context;)V

    .line 79
    invoke-virtual {v2}, Lo/asc;->c()Ljava/util/HashMap;

    move-result-object v3

    .line 81
    invoke-virtual {v2, v3}, Lo/asc;->e(Ljava/util/HashMap;)Ljava/util/HashMap;

    move-result-object v3

    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 86
    invoke-direct {p0, v3}, Lo/arv;->b(Ljava/util/HashMap;)Ljava/util/HashMap;

    move-result-object v4

    .line 89
    :cond_0
    return-object v4
.end method

.method private b(Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Lo/asd;>;)Ljava/util/HashMap<Ljava/lang/String;[Ljava/lang/String;>;"
        }
    .end annotation

    .line 102
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 103
    const/4 v3, 0x0

    .line 105
    const/4 v4, 0x0

    .line 107
    const/4 v5, 0x0

    .line 109
    const/4 v6, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 113
    const/4 v9, 0x0

    .line 114
    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 116
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 117
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 118
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/asd;

    .line 119
    if-eqz v9, :cond_0

    .line 121
    invoke-virtual {v9}, Lo/asd;->a()Ljava/util/List;

    move-result-object v4

    .line 122
    invoke-virtual {v9}, Lo/asd;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 123
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 126
    invoke-static {v11}, Lo/boh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 128
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 130
    const/4 v0, 0x3

    new-array v7, v0, [Ljava/lang/String;

    .line 131
    const/4 v0, 0x0

    aput-object v3, v7, v0

    .line 132
    const/4 v0, 0x1

    aput-object v11, v7, v0

    .line 133
    invoke-virtual {v9}, Lo/asd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 135
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v6, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    :cond_1
    goto :goto_1

    :cond_2
    goto/16 :goto_0

    .line 141
    :cond_3
    return-object v2
.end method


# virtual methods
.method public b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;)V"
        }
    .end annotation

    .line 34
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 36
    :cond_0
    return-void

    .line 40
    :cond_1
    invoke-direct {p0}, Lo/arv;->a()Ljava/util/HashMap;

    move-result-object v2

    .line 42
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;

    .line 47
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v3

    .line 49
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 52
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [Ljava/lang/String;

    .line 56
    if-eqz v6, :cond_2

    array-length v0, v6

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 58
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->setPhoneNumber(Ljava/lang/String;)V

    .line 59
    const/4 v0, 0x2

    aget-object v0, v6, v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->setContactName(Ljava/lang/String;)V

    .line 63
    :cond_2
    goto :goto_0

    .line 65
    :cond_3
    return-void
.end method
