.class public Lo/dwn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile b:Lo/dwn;

.field private static final c:Ljava/lang/Object;


# instance fields
.field private volatile a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dui;>;"
        }
    .end annotation
.end field

.field private e:Lo/dwi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dwn;->c:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    .line 47
    invoke-static {p1}, Lo/dwi;->a(Landroid/content/Context;)Lo/dwi;

    move-result-object v0

    iput-object v0, p0, Lo/dwn;->e:Lo/dwi;

    .line 48
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/dwn;
    .locals 4

    .line 36
    sget-object v0, Lo/dwn;->b:Lo/dwn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 37
    const-class v2, Lo/dwn;

    monitor-enter v2

    .line 38
    :try_start_0
    sget-object v0, Lo/dwn;->b:Lo/dwn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 39
    new-instance v0, Lo/dwn;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dwn;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dwn;->b:Lo/dwn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 43
    :cond_1
    :goto_0
    sget-object v0, Lo/dwn;->b:Lo/dwn;

    return-object v0
.end method


# virtual methods
.method public a(Lo/dug;)V
    .locals 3

    .line 212
    iget-object v0, p0, Lo/dwn;->e:Lo/dwi;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/dwi;->d(I)Lo/dup;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/dvb;

    .line 213
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 214
    const-string v0, "PLGACHIEVE_AchieveProvider"

    const-string v1, "setAMedalObserver achieveDBmgr is null!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    return-void

    .line 217
    :cond_0
    invoke-virtual {v2, p1}, Lo/dvb;->a(Lo/dug;)V

    .line 218
    return-void
.end method

.method public b()V
    .locals 7

    .line 190
    sget-object v3, Lo/dwn;->c:Ljava/lang/Object;

    monitor-enter v3

    .line 191
    :try_start_0
    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 192
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveProvider"

    const-string v1, "notifyAllObserver, mObserverList is null! "

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    monitor-exit v3

    return-void

    .line 195
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveProvider"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "removeAllObserver mObserverList= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dui;

    .line 197
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 198
    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 200
    :cond_2
    goto :goto_0

    .line 201
    :cond_3
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 202
    :goto_1
    return-void
.end method

.method public b(Lo/dug;)V
    .locals 1

    .line 206
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 207
    invoke-virtual {p0, p1}, Lo/dwn;->a(Lo/dug;)V

    .line 209
    :cond_0
    return-void
.end method

.method public c(ILjava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 126
    const-string v0, "PLGACHIEVE_AchieveProvider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData() : params ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p2, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Lo/dwn;->e:Lo/dwi;

    invoke-virtual {v0, p1}, Lo/dwi;->d(I)Lo/dup;

    move-result-object v3

    .line 128
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 129
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 131
    :cond_2
    invoke-interface {v3, p2}, Lo/dup;->e(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 221
    const-string v0, "PLGACHIEVE_AchieveProvider"

    const-string v1, "removeAMedalObserver!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dwn;->a(Lo/dug;)V

    .line 223
    return-void
.end method

.method public c(Lo/dvf;)Z
    .locals 6

    .line 56
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 57
    const/4 v0, 0x0

    return v0

    .line 59
    :cond_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 60
    const-string v0, "1"

    invoke-virtual {p1, v0}, Lo/dvf;->setHuid(Ljava/lang/String;)V

    .line 64
    :cond_1
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 65
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v3

    .line 66
    invoke-virtual {v3}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/dvf;->setHuid(Ljava/lang/String;)V

    .line 69
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveProvider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insertData() : params ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lo/dvf;->acquireDataType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Lo/dwn;->e:Lo/dwi;

    invoke-virtual {p1}, Lo/dvf;->acquireDataType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dwi;->d(I)Lo/dup;

    move-result-object v3

    .line 71
    const/4 v0, 0x0

    if-ne v0, v3, :cond_3

    .line 72
    const/4 v0, 0x0

    return v0

    .line 74
    :cond_3
    invoke-interface {v3, p1}, Lo/dup;->e(Lo/dvf;)J

    move-result-wide v4

    .line 75
    const-wide/16 v0, -0x1

    cmp-long v0, v0, v4

    if-eqz v0, :cond_4

    .line 76
    const/4 v0, 0x1

    return v0

    .line 78
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public d(Lo/dui;)V
    .locals 4

    .line 176
    sget-object v2, Lo/dwn;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 177
    :try_start_0
    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 178
    const-string v0, "PLGACHIEVE_AchieveProvider"

    const-string v1, "mObserverList is null!"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    monitor-exit v2

    return-void

    .line 181
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 183
    :goto_0
    return-void
.end method

.method public d(Lo/dvf;)Z
    .locals 4

    .line 140
    iget-object v0, p0, Lo/dwn;->e:Lo/dwi;

    invoke-virtual {p1}, Lo/dvf;->acquireDataType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dwi;->d(I)Lo/dup;

    move-result-object v2

    .line 141
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 142
    const/4 v0, 0x0

    return v0

    .line 144
    :cond_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 145
    const-string v0, "1"

    invoke-virtual {p1, v0}, Lo/dvf;->setHuid(Ljava/lang/String;)V

    .line 147
    :cond_1
    invoke-interface {v2, p1}, Lo/dup;->b(Lo/dvf;)I

    move-result v3

    .line 148
    const/4 v0, -0x1

    if-eq v0, v3, :cond_2

    .line 149
    const/4 v0, 0x1

    return v0

    .line 151
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public e(ILjava/util/Map;)Lo/dvf;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 109
    const-string v0, "PLGACHIEVE_AchieveProvider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData() : params ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p2, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lo/dwn;->e:Lo/dwi;

    invoke-virtual {v0, p1}, Lo/dwi;->d(I)Lo/dup;

    move-result-object v3

    .line 111
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 112
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 114
    :cond_2
    invoke-interface {v3, p2}, Lo/dup;->a(Ljava/util/Map;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public e(ILo/dwk;)V
    .locals 7

    .line 229
    sget-object v3, Lo/dwn;->c:Ljava/lang/Object;

    monitor-enter v3

    .line 230
    :try_start_0
    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 231
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveProvider"

    const-string v1, "notifyAllObserver, mObserverList is null! "

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    monitor-exit v3

    return-void

    .line 235
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveProvider"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyAllObserver mObserverList= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dui;

    .line 237
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 238
    invoke-interface {v5, p1, p2}, Lo/dui;->e(ILo/dwk;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 240
    :cond_2
    goto :goto_0

    .line 241
    :cond_3
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 242
    :goto_1
    return-void
.end method

.method public e(Lo/dui;)V
    .locals 6

    .line 158
    sget-object v4, Lo/dwn;->c:Ljava/lang/Object;

    monitor-enter v4

    .line 159
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 160
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveProvider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "achieveObserver or mObserverList is null "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwn;->a:Ljava/util/List;

    const/4 v3, 0x0

    if-ne v3, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    monitor-exit v4

    return-void

    .line 163
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveProvider"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addObserver "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 165
    iget-object v0, p0, Lo/dwn;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    :cond_4
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 169
    :goto_2
    return-void
.end method

.method public e(Lo/dvf;)Z
    .locals 4

    .line 87
    iget-object v0, p0, Lo/dwn;->e:Lo/dwi;

    invoke-virtual {p1}, Lo/dvf;->acquireDataType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dwi;->d(I)Lo/dup;

    move-result-object v2

    .line 88
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 89
    const/4 v0, 0x0

    return v0

    .line 91
    :cond_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 92
    const-string v0, "1"

    invoke-virtual {p1, v0}, Lo/dvf;->setHuid(Ljava/lang/String;)V

    .line 94
    :cond_1
    invoke-interface {v2, p1}, Lo/dup;->a(Lo/dvf;)I

    move-result v3

    .line 95
    const/4 v0, -0x1

    if-eq v0, v3, :cond_2

    .line 96
    const/4 v0, 0x1

    return v0

    .line 98
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
