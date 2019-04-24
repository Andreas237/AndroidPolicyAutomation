.class public Lo/xo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/xo;

.field private static final b:Ljava/lang/String;

.field private static e:Landroid/content/Context;


# instance fields
.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/AssistentTable;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/sns/sdk/modelmsg/FriendInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-class v0, Lo/xo;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/xo;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/xo;->c:Ljava/util/ArrayList;

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    .line 35
    return-void
.end method

.method static synthetic a(Lo/xo;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 26
    iput-object p1, p0, Lo/xo;->c:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 26
    sget-object v0, Lo/xo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static c(Ljava/lang/String;Z)Z
    .locals 2

    .line 177
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 179
    const/4 v0, 0x1

    return v0

    .line 181
    :cond_0
    if-eqz p1, :cond_1

    .line 183
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lt v1, v0, :cond_2

    .line 185
    const/4 v0, 0x1

    return v0

    .line 190
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lt v1, v0, :cond_2

    .line 192
    const/4 v0, 0x1

    return v0

    .line 195
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d()Landroid/content/Context;
    .locals 1

    .line 26
    sget-object v0, Lo/xo;->e:Landroid/content/Context;

    return-object v0
.end method

.method private e(J)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;
    .locals 7

    .line 139
    const/4 v4, 0x0

    .line 140
    iget-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    .line 143
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_8

    .line 144
    sget-object v0, Lo/xo;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can not find in friendlist,now find in assisitent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    new-instance v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    invoke-direct {v4}, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;-><init>()V

    .line 146
    iget-object v0, p0, Lo/xo;->c:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/xo;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 147
    :cond_1
    sget-object v0, Lo/xo;->e:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lo/xo;->b(Landroid/content/Context;)V

    goto/16 :goto_2

    .line 149
    :cond_2
    iget-object v0, p0, Lo/xo;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/bone/social/manager/db/AssistentTable;

    .line 150
    invoke-virtual {v6}, Lcom/huawei/bone/social/manager/db/AssistentTable;->getHuId()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-nez v0, :cond_7

    .line 151
    sget-object v0, Lo/xo;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " find in assisitent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iput-wide p1, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->userId:J

    .line 153
    invoke-virtual {v6}, Lcom/huawei/bone/social/manager/db/AssistentTable;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    .line 154
    iget-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/xo;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 155
    sget-object v0, Lo/xo;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 156
    sget-object v0, Lo/xo;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_assisent_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    goto :goto_1

    .line 158
    :cond_3
    const-string v0, "\u534e\u4e3a\u5c0fR"

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    .line 162
    :cond_4
    :goto_1
    invoke-virtual {v6}, Lcom/huawei/bone/social/manager/db/AssistentTable;->getImgUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    .line 163
    iget-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 164
    :cond_5
    const-string v0, "key_assistent_local_path"

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    .line 166
    :cond_6
    const-string v0, ""

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->phoneDigest:Ljava/lang/String;

    .line 167
    goto :goto_2

    .line 169
    :cond_7
    goto/16 :goto_0

    .line 173
    :cond_8
    :goto_2
    return-object v4
.end method

.method public static e()Lo/xo;
    .locals 4

    .line 38
    const-class v2, Lo/xo;

    monitor-enter v2

    .line 39
    :try_start_0
    sget-object v0, Lo/xo;->a:Lo/xo;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Lo/xo;

    invoke-direct {v0}, Lo/xo;-><init>()V

    sput-object v0, Lo/xo;->a:Lo/xo;

    .line 42
    :cond_0
    sget-object v0, Lo/xo;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 43
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/xo;->e(Landroid/content/Context;)V

    .line 45
    :cond_1
    sget-object v0, Lo/xo;->a:Lo/xo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 46
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public static e(Landroid/content/Context;)V
    .locals 0

    .line 231
    sput-object p0, Lo/xo;->e:Landroid/content/Context;

    .line 232
    return-void
.end method

.method private k()V
    .locals 4

    .line 84
    iget-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 85
    sget-object v0, Lo/xo;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCache: check is not ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    invoke-static {}, Lo/xw;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lo/xo$4;

    invoke-direct {v1, p0}, Lo/xo$4;-><init>(Lo/xo;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 114
    :cond_0
    sget-object v0, Lo/xo;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCache: check is ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 211
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 212
    iget-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 213
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    .line 215
    :cond_0
    iget-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 216
    return-object v2
.end method

.method public b(J)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;
    .locals 1

    .line 75
    invoke-direct {p0}, Lo/xo;->k()V

    .line 76
    invoke-direct {p0, p1, p2}, Lo/xo;->e(J)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    move-result-object v0

    .line 77
    return-object v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 4

    .line 50
    sget-object v0, Lo/xo;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initAssitentInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 52
    sget-object v0, Lo/xo;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initAssitentInfo context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    return-void

    .line 56
    :cond_0
    invoke-static {}, Lo/xw;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lo/xo$5;

    invoke-direct {v1, p0}, Lo/xo$5;-><init>(Lo/xo;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 63
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/sns/sdk/modelmsg/FriendInfo;>;)V"
        }
    .end annotation

    .line 221
    sget-object v0, Lo/xo;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setFriendInfos"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 223
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    .line 224
    iget-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, v5, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->userId:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    goto :goto_0

    .line 227
    :cond_0
    return-void
.end method

.method public c(Landroid/content/Context;)Lcom/huawei/up/model/UserInfomation;
    .locals 5

    .line 121
    sget-object v0, Lo/xo;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======getUserInfo begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 126
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 127
    new-instance v4, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v4}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 129
    :cond_0
    return-object v4
.end method

.method public c()V
    .locals 2

    .line 204
    iget-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 205
    iget-object v0, p0, Lo/xo;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 207
    :cond_0
    return-void
.end method
