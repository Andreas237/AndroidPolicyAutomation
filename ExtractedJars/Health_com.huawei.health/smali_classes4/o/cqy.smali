.class public Lo/cqy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqy$d;
    }
.end annotation


# static fields
.field private static a:Landroid/content/Context;


# instance fields
.field private e:Lo/cqt;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Lo/cqt;

    invoke-direct {v0}, Lo/cqt;-><init>()V

    iput-object v0, p0, Lo/cqy;->e:Lo/cqt;

    .line 25
    return-void
.end method

.method synthetic constructor <init>(Lo/cqy$2;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lo/cqy;-><init>()V

    return-void
.end method

.method private declared-synchronized b(II)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    monitor-enter p0

    .line 89
    if-lez p1, :cond_0

    if-gtz p2, :cond_1

    .line 90
    :cond_0
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserDeviceStatClients who <= 0 or deviceID <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_1
    const-string v0, "0"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 95
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v4}, Lo/cqt;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 96
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 98
    monitor-exit p0

    return-object v5

    .line 101
    :cond_2
    sget-object v0, Lo/cqy;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cpw;->c(II)Ljava/util/List;

    move-result-object v5

    .line 102
    if-eqz v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 103
    :cond_3
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserDeviceStatClients clients is null key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 107
    :cond_4
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v4, v5}, Lo/cqt;->c(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    monitor-exit p0

    return-object v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized c(I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    monitor-enter p0

    .line 47
    if-gtz p1, :cond_0

    .line 48
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserStatClients who <= 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 51
    :cond_0
    const-string v0, "0"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 52
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v4}, Lo/cqt;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 53
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 54
    monitor-exit p0

    return-object v5

    .line 57
    :cond_1
    sget-object v0, Lo/cqy;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->c(I)Ljava/util/List;

    move-result-object v5

    .line 58
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 59
    :cond_2
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserStatClients clients is null who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_3
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v4, v5}, Lo/cqt;->c(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    monitor-exit p0

    return-object v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static d(Landroid/content/Context;)Lo/cqy;
    .locals 1

    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqy;->a:Landroid/content/Context;

    .line 36
    sget-object v0, Lo/cqy$d;->a:Lo/cqy;

    return-object v0
.end method

.method private declared-synchronized e(ILjava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    monitor-enter p0

    .line 116
    if-lez p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 117
    :cond_0
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserDeviceStatClients who <= 0 or deviceUUID = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 121
    :cond_1
    const-string v0, "0"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 122
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v4}, Lo/cqt;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 123
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 125
    monitor-exit p0

    return-object v5

    .line 127
    :cond_2
    sget-object v0, Lo/cqy;->a:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cqf;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    .line 128
    if-gtz v6, :cond_3

    .line 129
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserDeviceStatClients deviceID <= 0 deviceUUID error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 132
    :cond_3
    invoke-virtual {p0, p1, v6}, Lo/cqy;->a(II)Ljava/util/List;

    move-result-object v5

    .line 133
    if-eqz v5, :cond_4

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 134
    :cond_4
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserDeviceStatClients clients is null key error ! who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " deviceID is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 138
    :cond_5
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v4, v5}, Lo/cqt;->c(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    monitor-exit p0

    return-object v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized k(II)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    monitor-enter p0

    .line 169
    if-lez p1, :cond_0

    if-gtz p2, :cond_1

    .line 170
    :cond_0
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserAppStatClients who <= 0 or appID <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 174
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 175
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v4}, Lo/cqt;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 176
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 178
    monitor-exit p0

    return-object v5

    .line 180
    :cond_2
    sget-object v0, Lo/cqy;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lo/cpw;->e(II)Ljava/util/List;

    move-result-object v5

    .line 181
    if-eqz v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 182
    :cond_3
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserAppStatClients clients is null key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 186
    :cond_4
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v4, v5}, Lo/cqt;->c(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    monitor-exit p0

    return-object v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 43
    invoke-direct {p0, p1}, Lo/cqy;->c(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(II)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 85
    invoke-direct {p0, p1, p2}, Lo/cqy;->b(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 6

    .line 70
    if-gtz p1, :cond_0

    return-void

    .line 71
    :cond_0
    sget-object v0, Lo/cqy;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->c(I)Ljava/util/List;

    move-result-object v4

    .line 72
    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 73
    :cond_1
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserStatClients clients is null who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    return-void

    .line 76
    :cond_2
    const-string v0, "0"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 78
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v5, v4}, Lo/cqt;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 79
    return-void
.end method

.method public c(ILjava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 112
    invoke-direct {p0, p1, p2}, Lo/cqy;->e(ILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 212
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0}, Lo/cqt;->a()V

    .line 213
    return-void
.end method

.method public c(II)V
    .locals 6

    .line 146
    if-lez p1, :cond_0

    if-gtz p2, :cond_1

    .line 147
    :cond_0
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserDeviceStatClients who <= 0 or deviceID <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-void

    .line 150
    :cond_1
    sget-object v0, Lo/cqy;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cpw;->c(II)Ljava/util/List;

    move-result-object v4

    .line 151
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 152
    :cond_2
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserDeviceStatClients clients is null who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",deviceID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    return-void

    .line 156
    :cond_3
    const-string v0, "0"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 158
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v5, v4}, Lo/cqt;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 159
    return-void
.end method

.method public d(II)V
    .locals 6

    .line 194
    if-lez p2, :cond_0

    if-gtz p1, :cond_1

    .line 195
    :cond_0
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserAppStatClients who <= 0 or appID <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    return-void

    .line 199
    :cond_1
    sget-object v0, Lo/cqy;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lo/cpw;->e(II)Ljava/util/List;

    move-result-object v4

    .line 200
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 201
    :cond_2
    const-string v0, "Debug_StatClients"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserAppStatClients clients is null who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    return-void

    .line 205
    :cond_3
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 207
    iget-object v0, p0, Lo/cqy;->e:Lo/cqt;

    invoke-virtual {v0, v5, v4}, Lo/cqt;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 208
    return-void
.end method

.method public e(II)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 165
    invoke-direct {p0, p1, p2}, Lo/cqy;->k(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
