.class public final Lo/axj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const-class v0, Lo/axj;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/axj;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Z
    .locals 1

    .line 29
    invoke-static {}, Lo/axj;->f()Z

    move-result v0

    return v0
.end method

.method public static a(Lcom/huawei/health/sns/model/user/UserNotify;)Z
    .locals 3

    .line 168
    const/4 v2, 0x0

    .line 170
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->c:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->d:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_1

    .line 172
    :cond_0
    const/4 v2, 0x1

    .line 174
    :cond_1
    return v2
.end method

.method public static b()I
    .locals 1

    .line 139
    const/4 v0, 0x1

    invoke-static {v0}, Lo/axj;->c(Z)I

    move-result v0

    return v0
.end method

.method protected static b(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/Long;>;)Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation

    .line 49
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 50
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 52
    const-string v0, "#"

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 53
    array-length v4, v3

    .line 54
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 56
    aget-object v0, v3, v5

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 60
    :try_start_0
    aget-object v0, v3, v5

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    goto :goto_1

    .line 62
    :catch_0
    move-exception v6

    .line 64
    sget-object v0, Lo/axj;->c:Ljava/lang/String;

    const-string v1, "initListFromSp NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    :cond_0
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 69
    :cond_1
    return-object p1
.end method

.method static synthetic b(Z)V
    .locals 0

    .line 29
    invoke-static {p0}, Lo/axj;->e(Z)V

    return-void
.end method

.method private static c(Z)I
    .locals 4

    .line 150
    const/4 v1, 0x0

    .line 152
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/atf;->c(Z)I

    move-result v2

    .line 154
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/axi;->e(Z)I

    move-result v3

    .line 156
    add-int v1, v2, v3

    .line 157
    return v1
.end method

.method private static c(Lo/awt;Landroid/os/Handler;Z)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/awt;Landroid/os/Handler;Z)Lo/brc<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 204
    new-instance v0, Lo/axj$1;

    invoke-direct {v0, p1, p0, p2}, Lo/axj$1;-><init>(Landroid/os/Handler;Lo/awt;Z)V

    return-object v0
.end method

.method public static c()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 184
    new-instance v0, Lo/axj$3;

    invoke-direct {v0}, Lo/axj$3;-><init>()V

    return-object v0
.end method

.method public static c(Landroid/app/Activity;IZLandroid/os/Handler;)V
    .locals 1

    .line 259
    new-instance v0, Lo/axj$4;

    invoke-direct {v0, p1, p3, p2, p0}, Lo/axj$4;-><init>(ILandroid/os/Handler;ZLandroid/app/Activity;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 280
    return-void
.end method

.method static synthetic d(Z)I
    .locals 1

    .line 29
    invoke-static {p0}, Lo/axj;->c(Z)I

    move-result v0

    return v0
.end method

.method private static d()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 82
    new-instance v0, Lo/axj$5;

    invoke-direct {v0}, Lo/axj$5;-><init>()V

    return-object v0
.end method

.method static synthetic e(Lo/awt;Landroid/os/Handler;Z)Lo/brc;
    .locals 1

    .line 29
    invoke-static {p0, p1, p2}, Lo/axj;->c(Lo/awt;Landroid/os/Handler;Z)Lo/brc;

    move-result-object v0

    return-object v0
.end method

.method public static e()V
    .locals 2

    .line 77
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lo/axj;->d()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 78
    return-void
.end method

.method protected static e(Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 35
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 36
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    .line 37
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 39
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 37
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 41
    :cond_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    return-void
.end method

.method private static e(Z)V
    .locals 1

    .line 243
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->c()V

    .line 244
    if-eqz p0, :cond_0

    .line 247
    invoke-static {}, Lo/axj;->f()Z

    .line 250
    :cond_0
    invoke-static {}, Lo/aob;->a()V

    .line 251
    return-void
.end method

.method private static f()Z
    .locals 8

    .line 103
    const/4 v3, 0x0

    .line 105
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0}, Lo/axi;->e()Ljava/util/List;

    move-result-object v4

    .line 106
    if-eqz v4, :cond_3

    .line 108
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 109
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 112
    if-eqz v7, :cond_1

    .line 113
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/UserNotify;->isReaded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 114
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_1

    .line 117
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 119
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    :cond_1
    goto :goto_0

    .line 122
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    .line 123
    if-lez v3, :cond_3

    .line 125
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v2}, Lo/axi;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z

    .line 128
    :cond_3
    if-lez v3, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    return v0
.end method
