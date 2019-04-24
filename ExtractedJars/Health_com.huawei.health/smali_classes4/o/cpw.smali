.class public Lo/cpw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cpw$a;
    }
.end annotation


# static fields
.field private static a:Landroid/content/Context;


# instance fields
.field private e:Lo/coj;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    sget-object v0, Lo/cpw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/coj;->c(Landroid/content/Context;)Lo/coj;

    move-result-object v0

    iput-object v0, p0, Lo/cpw;->e:Lo/coj;

    .line 41
    return-void
.end method

.method synthetic constructor <init>(Lo/cpw$5;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lo/cpw;-><init>()V

    return-void
.end method

.method private declared-synchronized b(Lo/crd;)I
    .locals 8

    monitor-enter p0

    .line 260
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getClientByAllSync hiHealthContext = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-direct {p0}, Lo/cpw;->c()Ljava/lang/String;

    move-result-object v1

    .line 262
    invoke-virtual {p1}, Lo/crd;->f()I

    move-result v2

    invoke-virtual {p1}, Lo/crd;->c()I

    move-result v3

    invoke-virtual {p1}, Lo/crd;->d()I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lo/cpw;->b(III)[Ljava/lang/String;

    move-result-object v2

    .line 261
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 263
    const-string v0, "_id"

    invoke-static {v6, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    .line 264
    if-gtz v7, :cond_0

    .line 265
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/crd;->f(I)V

    .line 266
    invoke-direct {p0, p1}, Lo/cpw;->d(Lo/crd;)J

    move-result-wide v0

    long-to-int v7, v0

    .line 268
    :cond_0
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getClientByAllSync client = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    monitor-exit p0

    return v7

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private b(JLo/crd;)V
    .locals 8

    .line 216
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 217
    return-void

    .line 219
    :cond_0
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertClientData() addCache  clientID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", hiHealthContext = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    long-to-int v0, p1

    invoke-virtual {p3, v0}, Lo/crd;->e(I)V

    .line 221
    invoke-virtual {p3}, Lo/crd;->f()I

    move-result v4

    .line 222
    invoke-virtual {p3}, Lo/crd;->c()I

    move-result v5

    .line 223
    invoke-virtual {p3}, Lo/crd;->d()I

    move-result v6

    .line 224
    sget-object v0, Lo/cpw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v7

    .line 225
    invoke-virtual {v7, v4}, Lo/cqy;->b(I)V

    .line 226
    invoke-virtual {v7, v6, v4}, Lo/cqy;->d(II)V

    .line 227
    invoke-virtual {v7, v4, v5}, Lo/cqy;->c(II)V

    .line 229
    return-void
.end method

.method private b(III)[Ljava/lang/String;
    .locals 3

    .line 279
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method private c()Ljava/lang/String;
    .locals 1

    .line 273
    const-string v0, "user_id =? and device_id =? and app_id =? "

    return-object v0
.end method

.method private d(Lo/crd;)J
    .locals 7

    .line 207
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertClientData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    invoke-static {p1}, Lo/cpi;->b(Lo/crd;)Landroid/content/ContentValues;

    move-result-object v4

    .line 209
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-virtual {v0, v4}, Lo/coj;->c(Landroid/content/ContentValues;)J

    move-result-wide v5

    .line 210
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertClientData() add  insert = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    invoke-direct {p0, v5, v6, p1}, Lo/cpw;->b(JLo/crd;)V

    .line 212
    return-wide v5
.end method

.method private declared-synchronized e(III)I
    .locals 9

    monitor-enter p0

    .line 246
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x4

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatClientByUser deviceID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",userID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-direct {p0}, Lo/cpw;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, p2, p3}, Lo/cpw;->b(III)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 248
    const-string v0, "_id"

    invoke-static {v6, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    .line 249
    if-gtz v7, :cond_0

    .line 250
    new-instance v8, Lo/crd;

    invoke-direct {v8, p1, p2, p3}, Lo/crd;-><init>(III)V

    .line 251
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/crd;->c(I)V

    .line 252
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/crd;->f(I)V

    .line 253
    invoke-direct {p0, v8}, Lo/cpw;->d(Lo/crd;)J

    move-result-wide v0

    long-to-int v7, v0

    .line 255
    :cond_0
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatClientByDevice client = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    monitor-exit p0

    return v7

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static e(Landroid/content/Context;)Lo/cpw;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cpw;->a:Landroid/content/Context;

    .line 52
    sget-object v0, Lo/cpw$a;->b:Lo/cpw;

    return-object v0
.end method

.method private declared-synchronized p(I)I
    .locals 9

    monitor-enter p0

    .line 232
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatClientByUser userID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-direct {p0}, Lo/cpw;->c()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, p1, v2, v3}, Lo/cpw;->b(III)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 234
    const-string v0, "_id"

    invoke-static {v6, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    .line 235
    if-gtz v7, :cond_0

    .line 236
    new-instance v8, Lo/crd;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {v8, p1, v0, v1}, Lo/crd;-><init>(III)V

    .line 237
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/crd;->c(I)V

    .line 238
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/crd;->f(I)V

    .line 239
    invoke-direct {p0, v8}, Lo/cpw;->d(Lo/crd;)J

    move-result-wide v0

    long-to-int v7, v0

    .line 241
    :cond_0
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatClientByUser userClient = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    monitor-exit p0

    return v7

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a(Lo/crd;)I
    .locals 1

    .line 67
    invoke-direct {p0, p1}, Lo/cpw;->b(Lo/crd;)I

    move-result v0

    return v0
.end method

.method public a(I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 115
    const-string v6, "user_id =? and device_id >?  and app_id >?  and sync_status =? and need_uploaddata =? "

    .line 120
    const/4 v0, 0x5

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v7, v1

    .line 121
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 122
    invoke-static {v8}, Lo/cph;->o(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(ILjava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 146
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 147
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 148
    const-string v0, "user_id"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 149
    add-int/lit8 v0, v6, 0x1

    new-array v8, v0, [Ljava/lang/String;

    .line 150
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 151
    const-string v0, "_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 152
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 153
    const-string v0, "device_id"

    invoke-static {v9, v0}, Lo/cph;->p(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(I)I
    .locals 1

    .line 57
    invoke-direct {p0, p1}, Lo/cpw;->p(I)I

    move-result v0

    return v0
.end method

.method public b(II)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lo/crd;>;"
        }
    .end annotation

    .line 171
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 172
    const-string v0, "user_id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "device_id"

    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "sync_status"

    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 175
    const/4 v0, 0x3

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 176
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 177
    invoke-static {v8}, Lo/cph;->s(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(III)I
    .locals 1

    .line 62
    invoke-direct {p0, p1, p2, p3}, Lo/cpw;->e(III)I

    move-result v0

    return v0
.end method

.method public c(Lo/crd;)J
    .locals 6

    .line 164
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 165
    :cond_0
    invoke-static {p1}, Lo/cpi;->d(Lo/crd;)Landroid/content/ContentValues;

    move-result-object v5

    .line 166
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-direct {p0}, Lo/cpw;->c()Ljava/lang/String;

    move-result-object v1

    .line 167
    invoke-virtual {p1}, Lo/crd;->f()I

    move-result v2

    invoke-virtual {p1}, Lo/crd;->c()I

    move-result v3

    invoke-virtual {p1}, Lo/crd;->d()I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lo/cpw;->b(III)[Ljava/lang/String;

    move-result-object v2

    .line 166
    invoke-virtual {v0, v5, v1, v2}, Lo/coj;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public c(I)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 78
    const-string v6, "user_id =? and device_id >?  and app_id >? "

    .line 81
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    move-object v1, v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, p1, v2, v3}, Lo/cpw;->b(III)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 82
    invoke-static {v7}, Lo/cph;->o(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(II)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 97
    const-string v6, "user_id =? and device_id =? and app_id >? "

    .line 100
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    move-object v1, v6

    const/4 v2, 0x0

    invoke-direct {p0, p1, p2, v2}, Lo/cpw;->b(III)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 101
    invoke-static {v7}, Lo/cph;->o(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(JI)I
    .locals 9

    .line 195
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 196
    const-string v0, "cloud_device"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 197
    const-string v0, "app_id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 198
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 199
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 200
    const-string v0, "device_id"

    invoke-static {v8, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 127
    const-string v6, "user_id =? and device_id >?  and app_id >?  and sync_status =? "

    .line 131
    const/4 v0, 0x4

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 132
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 133
    invoke-static {v8}, Lo/cph;->o(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(III)Lo/crd;
    .locals 8

    .line 189
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-direct {p0}, Lo/cpw;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, p3, p2}, Lo/cpw;->b(III)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 190
    invoke-static {v6}, Lo/cph;->r(Landroid/database/Cursor;)Lo/crd;

    move-result-object v7

    .line 191
    return-object v7
.end method

.method public e(I)I
    .locals 7

    .line 72
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    const-string v1, "_id =? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 73
    const-string v0, "device_id"

    invoke-static {v6, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(Lo/crd;)J
    .locals 6

    .line 157
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 158
    :cond_0
    invoke-static {p1}, Lo/cpi;->a(Lo/crd;)Landroid/content/ContentValues;

    move-result-object v5

    .line 159
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-direct {p0}, Lo/cpw;->c()Ljava/lang/String;

    move-result-object v1

    .line 160
    invoke-virtual {p1}, Lo/crd;->f()I

    move-result v2

    invoke-virtual {p1}, Lo/crd;->c()I

    move-result v3

    invoke-virtual {p1}, Lo/crd;->d()I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lo/cpw;->b(III)[Ljava/lang/String;

    move-result-object v2

    .line 159
    invoke-virtual {v0, v5, v1, v2}, Lo/coj;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public e(II)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 106
    const-string v6, "user_id =? and device_id >=? and app_id =? "

    .line 109
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    move-object v1, v6

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, p2}, Lo/cpw;->b(III)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 110
    invoke-static {v7}, Lo/cph;->o(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public f(I)Lo/crd;
    .locals 9

    .line 181
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 182
    const-string v0, "_id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 183
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 184
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 185
    invoke-static {v8}, Lo/cph;->r(Landroid/database/Cursor;)Lo/crd;

    move-result-object v0

    return-object v0
.end method

.method public g(I)I
    .locals 7

    .line 298
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    const-string v1, "_id =? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 299
    const-string v0, "user_id"

    invoke-static {v6, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public h(I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 137
    const-string v6, "user_id =? and device_id >?  and app_id >? "

    .line 140
    const/4 v0, 0x3

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 141
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 142
    const-string v0, "device_id"

    invoke-static {v8, v0}, Lo/cph;->p(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i(I)V
    .locals 11

    .line 282
    invoke-virtual {p0, p1}, Lo/cpw;->d(I)Ljava/util/List;

    move-result-object v5

    .line 283
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 284
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientid list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    return-void

    .line 287
    :cond_0
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 288
    const-string v0, "need_uploaddata"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 289
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 290
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    const-string v1, "_id =? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v6, v1, v2}, Lo/coj;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v9, v0

    .line 291
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v9

    if-ltz v0, :cond_1

    .line 292
    const-string v0, "Debug_ClientManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateClientNeedFlag false clientid="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    :cond_1
    goto :goto_0

    .line 295
    :cond_2
    return-void
.end method

.method public k(I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lo/crd;>;"
        }
    .end annotation

    .line 303
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 304
    const-string v0, "user_id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "device_id"

    .line 305
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 306
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 307
    iget-object v0, p0, Lo/cpw;->e:Lo/coj;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coj;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 308
    invoke-static {v8}, Lo/cph;->s(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
