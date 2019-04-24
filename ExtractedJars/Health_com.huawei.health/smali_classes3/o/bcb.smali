.class public final Lo/bcb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/bcb;

.field private static d:J


# instance fields
.field private e:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 135
    const/4 v0, 0x0

    sput-object v0, Lo/bcb;->b:Lo/bcb;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 3

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    .line 146
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 147
    const-string v0, "Sp"

    invoke-static {p1, p2, v0}, Lo/bop;->d(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 148
    const/4 v0, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    .line 149
    invoke-static {p1, p2}, Lo/bcb;->a(J)V

    .line 150
    return-void
.end method

.method private static a(J)V
    .locals 0

    .line 154
    sput-wide p0, Lo/bcb;->d:J

    .line 155
    return-void
.end method

.method public static declared-synchronized b()Lo/bcb;
    .locals 5

    const-class v4, Lo/bcb;

    monitor-enter v4

    .line 163
    :try_start_0
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v2

    .line 165
    sget-wide v0, Lo/bcb;->d:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 167
    new-instance v0, Lo/bcb;

    invoke-direct {v0, v2, v3}, Lo/bcb;-><init>(J)V

    sput-object v0, Lo/bcb;->b:Lo/bcb;

    goto :goto_0

    .line 169
    :cond_0
    sget-object v0, Lo/bcb;->b:Lo/bcb;

    if-nez v0, :cond_1

    .line 171
    new-instance v0, Lo/bcb;

    invoke-direct {v0, v2, v3}, Lo/bcb;-><init>(J)V

    sput-object v0, Lo/bcb;->b:Lo/bcb;

    .line 173
    :cond_1
    :goto_0
    sget-object v0, Lo/bcb;->b:Lo/bcb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v4

    throw v2
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 295
    iget-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 296
    return-void
.end method

.method public a(Ljava/lang/String;J)Z
    .locals 1

    .line 233
    iget-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;Z)Z
    .locals 1

    .line 220
    iget-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    .line 266
    iget-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public d()V
    .locals 1

    .line 275
    const-string v0, "addFriendVerifyNote"

    invoke-virtual {p0, v0}, Lo/bcb;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    const-string v0, "addFriendVerifyNote"

    invoke-virtual {p0, v0}, Lo/bcb;->d(Ljava/lang/String;)Z

    .line 280
    :cond_0
    const-string v0, "userNotifyCachedUserId"

    invoke-virtual {p0, v0}, Lo/bcb;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 282
    const-string v0, "userNotifyCachedUserId"

    invoke-virtual {p0, v0}, Lo/bcb;->d(Ljava/lang/String;)Z

    .line 284
    :cond_1
    const-string v0, "groupInviteNotifyCachedGroupID"

    invoke-virtual {p0, v0}, Lo/bcb;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 286
    const-string v0, "groupInviteNotifyCachedGroupID"

    invoke-virtual {p0, v0}, Lo/bcb;->d(Ljava/lang/String;)Z

    .line 288
    :cond_2
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1

    .line 255
    iget-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;J)J
    .locals 2

    .line 245
    iget-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 185
    iget-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Z)Z
    .locals 1

    .line 208
    iget-object v0, p0, Lo/bcb;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method
