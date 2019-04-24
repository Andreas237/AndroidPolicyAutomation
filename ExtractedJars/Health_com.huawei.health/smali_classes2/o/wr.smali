.class public Lo/wr;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static b:Lo/wr;


# instance fields
.field private d:Lo/xn;

.field private e:Lo/wz;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/wr;->e:Lo/wz;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/wr;->d:Lo/xn;

    .line 27
    new-instance v0, Lo/xn;

    invoke-direct {v0}, Lo/xn;-><init>()V

    iput-object v0, p0, Lo/wr;->d:Lo/xn;

    .line 28
    invoke-static {}, Lo/wz;->d()Lo/wz;

    move-result-object v0

    iput-object v0, p0, Lo/wr;->e:Lo/wz;

    .line 29
    iget-object v0, p0, Lo/wr;->e:Lo/wz;

    invoke-virtual {v0, p0}, Lo/wz;->e(Lo/wr;)V

    .line 32
    return-void
.end method

.method public static d()Lo/wr;
    .locals 6

    .line 35
    const-class v4, Lo/wr;

    monitor-enter v4

    .line 36
    const-string v0, "HWSocialManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    sget-object v0, Lo/wr;->b:Lo/wr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 38
    new-instance v0, Lo/wr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/wr;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/wr;->b:Lo/wr;

    .line 40
    :cond_0
    sget-object v0, Lo/wr;->b:Lo/wr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 41
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method


# virtual methods
.method public a(JI)I
    .locals 2

    .line 222
    new-instance v1, Lo/xb;

    invoke-direct {v1}, Lo/xb;-><init>()V

    .line 223
    invoke-virtual {v1, p0, p1, p2, p3}, Lo/xb;->e(Lo/wr;JI)I

    move-result v0

    return v0
.end method

.method public a(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 54
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 55
    invoke-virtual {v1, p0, p1, p2, p3}, Lo/wy;->c(Lo/wr;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/util/ArrayList;)J
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/xa;>;)J"
        }
    .end annotation

    .line 267
    new-instance v2, Lo/wx;

    invoke-direct {v2}, Lo/wx;-><init>()V

    .line 268
    invoke-virtual {v2, p0, p1}, Lo/wx;->a(Lo/wr;Ljava/util/ArrayList;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a([Landroid/content/ContentValues;)J
    .locals 3

    .line 150
    new-instance v2, Lo/wy;

    invoke-direct {v2}, Lo/wy;-><init>()V

    .line 151
    invoke-virtual {v2, p0, p1}, Lo/wy;->a(Lo/wr;[Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a()Landroid/database/Cursor;
    .locals 2

    .line 120
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 121
    invoke-virtual {v1, p0}, Lo/wy;->b(Lo/wr;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 90
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 91
    invoke-virtual {v1, p0, p1}, Lo/wy;->f(Lo/wr;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public a(J)V
    .locals 1

    .line 181
    new-instance v0, Lo/wy;

    invoke-direct {v0}, Lo/wy;-><init>()V

    .line 182
    invoke-virtual {v0, p0, p1, p2}, Lo/wy;->a(Lo/wr;J)V

    .line 183
    return-void
.end method

.method public b(JII)I
    .locals 2

    .line 257
    new-instance v1, Lo/ww;

    invoke-direct {v1}, Lo/ww;-><init>()V

    .line 258
    invoke-virtual/range {v1 .. v6}, Lo/ww;->c(Lo/wr;JII)I

    move-result v0

    return v0
.end method

.method public b(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 59
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 60
    invoke-virtual {v1, p0, p1, p2, p3}, Lo/wy;->e(Lo/wr;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 140
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 141
    invoke-virtual {v1, p0, p1, p2}, Lo/wy;->e(Lo/wr;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(Landroid/content/ContentValues;)J
    .locals 3

    .line 135
    new-instance v2, Lo/wy;

    invoke-direct {v2}, Lo/wy;-><init>()V

    .line 136
    invoke-virtual {v2, p0, p1}, Lo/wy;->b(Lo/wr;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 95
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 96
    invoke-virtual {v1, p0, p1}, Lo/wy;->a(Lo/wr;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/AssistentTable;>;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lo/wr;->e:Lo/wz;

    invoke-virtual {v0, p0}, Lo/wz;->a(Lo/wr;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/xj;)V
    .locals 1

    .line 289
    iget-object v0, p0, Lo/wr;->d:Lo/xn;

    invoke-virtual {v0, p1}, Lo/xn;->a(Lo/xj;)V

    .line 290
    return-void
.end method

.method public c(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 49
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 50
    invoke-virtual {v1, p0, p1, p2, p3}, Lo/wy;->a(Lo/wr;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 145
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 146
    invoke-virtual {v1, p0, p1, p2}, Lo/wy;->b(Lo/wr;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(Ljava/util/ArrayList;J)J
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/xf;>;J)J"
        }
    .end annotation

    .line 191
    const-wide/16 v3, -0x1

    .line 192
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 193
    new-instance v5, Lo/xc;

    invoke-direct {v5}, Lo/xc;-><init>()V

    .line 194
    invoke-virtual {v5, p0, p1, p2, p3}, Lo/xc;->a(Lo/wr;Ljava/util/ArrayList;J)J

    move-result-wide v3

    .line 195
    iget-object v0, p0, Lo/wr;->d:Lo/xn;

    const-string v1, ""

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/xn;->e(ILjava/lang/String;)V

    .line 198
    :cond_0
    return-wide v3
.end method

.method public c([Landroid/content/ContentValues;)J
    .locals 3

    .line 155
    new-instance v2, Lo/wy;

    invoke-direct {v2}, Lo/wy;-><init>()V

    .line 156
    invoke-virtual {v2, p0, p1}, Lo/wy;->e(Lo/wr;[Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Landroid/database/Cursor;
    .locals 2

    .line 79
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 80
    invoke-virtual {v1, p0}, Lo/wy;->a(Lo/wr;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 105
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 106
    invoke-virtual {v1, p0, p1}, Lo/wy;->e(Lo/wr;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public d(JLjava/lang/String;)I
    .locals 2

    .line 232
    new-instance v1, Lo/xb;

    invoke-direct {v1}, Lo/xb;-><init>()V

    .line 233
    invoke-virtual {v1, p0, p1, p2, p3}, Lo/xb;->a(Lo/wr;JLjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 69
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 70
    invoke-virtual {v1, p0, p1, p2, p3}, Lo/wy;->g(Lo/wr;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Landroid/content/ContentValues;)J
    .locals 3

    .line 130
    new-instance v2, Lo/wy;

    invoke-direct {v2}, Lo/wy;-><init>()V

    .line 131
    invoke-virtual {v2, p0, p1}, Lo/wy;->a(Lo/wr;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Lo/xf;)J
    .locals 3

    .line 262
    new-instance v2, Lo/ww;

    invoke-direct {v2}, Lo/ww;-><init>()V

    .line 263
    invoke-virtual {v2, p0, p1}, Lo/ww;->d(Lo/wr;Lo/xf;)J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 84
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 85
    invoke-virtual {v1, p0, p1}, Lo/wy;->b(Lo/wr;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/xj;)V
    .locals 4

    .line 299
    if-nez p1, :cond_0

    .line 300
    const-string v0, "HWSocialManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Observer object maybe not create."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    return-void

    .line 303
    :cond_0
    iget-object v0, p0, Lo/wr;->d:Lo/xn;

    invoke-virtual {v0, p1}, Lo/xn;->e(Lo/xj;)V

    .line 304
    return-void
.end method

.method public e(JI)I
    .locals 2

    .line 227
    new-instance v1, Lo/xb;

    invoke-direct {v1}, Lo/xb;-><init>()V

    .line 228
    invoke-virtual {v1, p0, p1, p2, p3}, Lo/xb;->d(Lo/wr;JI)I

    move-result v0

    return v0
.end method

.method public e(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 64
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 65
    invoke-virtual {v1, p0, p1, p2, p3}, Lo/wy;->b(Lo/wr;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;I)I
    .locals 2

    .line 242
    new-instance v1, Lo/ww;

    invoke-direct {v1}, Lo/ww;-><init>()V

    .line 243
    invoke-virtual {v1, p0, p1, p2}, Lo/ww;->b(Lo/wr;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public e([Landroid/content/ContentValues;)J
    .locals 3

    .line 160
    new-instance v2, Lo/wy;

    invoke-direct {v2}, Lo/wy;-><init>()V

    .line 161
    invoke-virtual {v2, p0, p1}, Lo/wy;->c(Lo/wr;[Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()Landroid/database/Cursor;
    .locals 2

    .line 125
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 126
    invoke-virtual {v1, p0}, Lo/wy;->d(Lo/wr;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 100
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 101
    invoke-virtual {v1, p0, p1}, Lo/wy;->d(Lo/wr;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 110
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 111
    invoke-virtual {v1, p0, p1}, Lo/wy;->c(Lo/wr;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public f()V
    .locals 1

    .line 176
    new-instance v0, Lo/wy;

    invoke-direct {v0}, Lo/wy;-><init>()V

    .line 177
    invoke-virtual {v0, p0}, Lo/wy;->k(Lo/wr;)V

    .line 178
    return-void
.end method

.method public g()Landroid/database/Cursor;
    .locals 2

    .line 186
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 187
    invoke-virtual {v1, p0}, Lo/wy;->c(Lo/wr;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 308
    const/16 v0, 0x4e24

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/String;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;
    .locals 2

    .line 217
    new-instance v1, Lo/xb;

    invoke-direct {v1}, Lo/xb;-><init>()V

    .line 218
    invoke-virtual {v1, p0, p1}, Lo/xb;->a(Lo/wr;Ljava/lang/String;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 2

    .line 207
    new-instance v1, Lo/xc;

    invoke-direct {v1}, Lo/xc;-><init>()V

    .line 208
    invoke-virtual {v1, p0}, Lo/xc;->c(Lo/wr;)I

    .line 209
    return-void
.end method

.method public i(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 74
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 75
    invoke-virtual {v1, p0, p1, p2, p3}, Lo/wy;->d(Lo/wr;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public i()V
    .locals 1

    .line 202
    new-instance v0, Lo/xc;

    invoke-direct {v0}, Lo/xc;-><init>()V

    .line 203
    invoke-virtual {v0, p0}, Lo/xc;->d(Lo/wr;)V

    .line 204
    return-void
.end method

.method public k(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 115
    new-instance v1, Lo/wy;

    invoke-direct {v1}, Lo/wy;-><init>()V

    .line 116
    invoke-virtual {v1, p0, p1}, Lo/wy;->i(Lo/wr;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 1

    .line 171
    new-instance v0, Lo/wy;

    invoke-direct {v0}, Lo/wy;-><init>()V

    .line 172
    invoke-virtual {v0, p0}, Lo/wy;->h(Lo/wr;)V

    .line 173
    return-void
.end method

.method public l()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/xa;>;"
        }
    .end annotation

    .line 277
    new-instance v1, Lo/wx;

    invoke-direct {v1}, Lo/wx;-><init>()V

    .line 278
    invoke-virtual {v1, p0}, Lo/wx;->a(Lo/wr;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;"
        }
    .end annotation

    .line 247
    new-instance v1, Lo/ww;

    invoke-direct {v1}, Lo/ww;-><init>()V

    .line 248
    invoke-virtual {v1, p0}, Lo/ww;->e(Lo/wr;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public o()Lcom/huawei/bone/social/manager/db/SocialRankingTable;
    .locals 2

    .line 252
    new-instance v1, Lo/ww;

    invoke-direct {v1}, Lo/ww;-><init>()V

    .line 253
    invoke-virtual {v1, p0}, Lo/ww;->b(Lo/wr;)Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    move-result-object v0

    return-object v0
.end method

.method public p()I
    .locals 2

    .line 272
    new-instance v1, Lo/wx;

    invoke-direct {v1}, Lo/wx;-><init>()V

    .line 273
    invoke-virtual {v1, p0}, Lo/wx;->d(Lo/wr;)I

    move-result v0

    return v0
.end method
