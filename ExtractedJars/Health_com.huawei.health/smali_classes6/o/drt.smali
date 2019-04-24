.class Lo/drt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Ljava/util/ArrayList;

.field private b:Ljava/lang/String;

.field private c:Landroid/os/Message;

.field private e:Ljava/util/ArrayList;

.field private f:Landroid/content/Context;

.field private g:Lo/dsl;

.field private h:Lo/dsl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-class v0, Lo/drt;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drt;->d:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/os/Message;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/drt;->a:Ljava/util/ArrayList;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/drt;->e:Ljava/util/ArrayList;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drt;->b:Ljava/lang/String;

    .line 54
    new-instance v0, Lo/drt$4;

    invoke-direct {v0, p0}, Lo/drt$4;-><init>(Lo/drt;)V

    iput-object v0, p0, Lo/drt;->h:Lo/dsl;

    .line 114
    new-instance v0, Lo/drt$3;

    invoke-direct {v0, p0}, Lo/drt$3;-><init>(Lo/drt;)V

    iput-object v0, p0, Lo/drt;->g:Lo/dsl;

    .line 31
    iput-object p1, p0, Lo/drt;->f:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lo/drt;->c:Landroid/os/Message;

    .line 33
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 19
    sget-object v0, Lo/drt;->d:Ljava/lang/String;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 196
    new-instance v1, Lo/drh;

    invoke-direct {v1}, Lo/drh;-><init>()V

    .line 197
    invoke-static {}, Lo/dsh;->a()I

    move-result v2

    .line 198
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/drt;->d(Ljava/lang/Integer;)V

    .line 199
    invoke-virtual {v1, v2}, Lo/drh;->b(I)V

    .line 200
    const-string v0, "DevAuth"

    invoke-virtual {v1, v0}, Lo/drh;->c(Ljava/lang/String;)V

    .line 201
    const-string v0, "EAP-AKA"

    invoke-virtual {v1, v0}, Lo/drh;->d(Ljava/lang/String;)V

    .line 202
    invoke-virtual {v1, p1}, Lo/drh;->e(Ljava/lang/String;)V

    .line 203
    invoke-virtual {v1}, Lo/drh;->e()Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/drt;)Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/drt;->b:Ljava/lang/String;

    return-object v0
.end method

.method private b(Ljava/lang/Integer;)V
    .locals 4

    .line 174
    iget-object v0, p0, Lo/drt;->e:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 175
    iget-object v2, p0, Lo/drt;->e:Ljava/util/ArrayList;

    monitor-enter v2

    .line 176
    :try_start_0
    iget-object v0, p0, Lo/drt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 177
    iget-object v0, p0, Lo/drt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 181
    :cond_1
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 207
    new-instance v1, Lo/drd;

    invoke-direct {v1}, Lo/drd;-><init>()V

    .line 208
    invoke-static {}, Lo/dsh;->a()I

    move-result v2

    .line 209
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/drt;->b(Ljava/lang/Integer;)V

    .line 210
    invoke-virtual {v1, v2}, Lo/drd;->c(I)V

    .line 211
    const-string v0, "DevAuthChallenge"

    invoke-virtual {v1, v0}, Lo/drd;->b(Ljava/lang/String;)V

    .line 212
    invoke-virtual {v1, p1}, Lo/drd;->a(Ljava/lang/String;)V

    .line 213
    const-string v0, "EAP-AKA"

    invoke-virtual {v1, v0}, Lo/drd;->c(Ljava/lang/String;)V

    .line 214
    invoke-virtual {v1}, Lo/drd;->a()Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/Integer;)Z
    .locals 4

    .line 162
    iget-object v0, p0, Lo/drt;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 163
    iget-object v2, p0, Lo/drt;->a:Ljava/util/ArrayList;

    monitor-enter v2

    .line 164
    :try_start_0
    iget-object v0, p0, Lo/drt;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lo/drt;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    monitor-exit v2

    const/4 v0, 0x1

    return v0

    .line 168
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 170
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lo/drt;Ljava/lang/Integer;)Z
    .locals 1

    .line 19
    invoke-direct {p0, p1}, Lo/drt;->e(Ljava/lang/Integer;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/drt;)Landroid/content/Context;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/drt;->f:Landroid/content/Context;

    return-object v0
.end method

.method private d(Ljava/lang/Integer;)V
    .locals 4

    .line 152
    iget-object v0, p0, Lo/drt;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 153
    iget-object v2, p0, Lo/drt;->a:Ljava/util/ArrayList;

    monitor-enter v2

    .line 154
    :try_start_0
    iget-object v0, p0, Lo/drt;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    iget-object v0, p0, Lo/drt;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 159
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/drt;)Landroid/os/Message;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/drt;->c:Landroid/os/Message;

    return-object v0
.end method

.method static synthetic e(Lo/drt;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lo/drt;->b:Ljava/lang/String;

    return-object p1
.end method

.method private e(Ljava/lang/Integer;)Z
    .locals 4

    .line 184
    iget-object v0, p0, Lo/drt;->e:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 185
    iget-object v2, p0, Lo/drt;->e:Ljava/util/ArrayList;

    monitor-enter v2

    .line 186
    :try_start_0
    iget-object v0, p0, Lo/drt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lo/drt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    monitor-exit v2

    const/4 v0, 0x1

    return v0

    .line 190
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 192
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lo/drt;Ljava/lang/Integer;)Z
    .locals 1

    .line 19
    invoke-direct {p0, p1}, Lo/drt;->c(Ljava/lang/Integer;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 100
    iget-object v0, p0, Lo/drt;->c:Landroid/os/Message;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 101
    sget-object v0, Lo/drt;->d:Ljava/lang/String;

    const-string v1, "Start Aka Second Authen mMessage is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    return-void

    .line 104
    :cond_0
    invoke-static {}, Lo/drx;->a()Ljava/lang/String;

    move-result-object v2

    .line 105
    invoke-direct {p0, p1}, Lo/drt;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 106
    invoke-static {}, Lo/dsg;->b()Lo/dsg;

    move-result-object v4

    .line 107
    iget-object v0, p0, Lo/drt;->g:Lo/dsl;

    invoke-virtual {v4, v2, v3, p2, v0}, Lo/dsg;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V

    .line 108
    sget-object v0, Lo/drt;->d:Ljava/lang/String;

    const-string v1, "Start Aka Second Authen"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 5

    .line 43
    invoke-static {}, Lo/drx;->a()Ljava/lang/String;

    move-result-object v2

    .line 44
    invoke-direct {p0, p1}, Lo/drt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 45
    invoke-static {}, Lo/dsg;->b()Lo/dsg;

    move-result-object v4

    .line 46
    iget-object v0, p0, Lo/drt;->h:Lo/dsl;

    invoke-virtual {v4, v2, v3, v0}, Lo/dsg;->a(Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V

    .line 47
    sget-object v0, Lo/drt;->d:Ljava/lang/String;

    const-string v1, "Start aka first authen"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    return-void
.end method
