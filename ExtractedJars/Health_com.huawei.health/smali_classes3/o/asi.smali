.class public final Lo/asi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Landroid/content/SharedPreferences;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.health.sns.data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/asi;->d:Landroid/content/SharedPreferences;

    .line 38
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/asi;
    .locals 2

    .line 48
    if-nez p0, :cond_0

    .line 50
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Null context."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_0
    new-instance v0, Lo/asi;

    invoke-direct {v0, p0}, Lo/asi;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public c()J
    .locals 4

    .line 62
    iget-object v0, p0, Lo/asi;->d:Landroid/content/SharedPreferences;

    const-string v1, "LAST_PHOTO_SYNC_TIME"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public e(J)V
    .locals 2

    .line 72
    iget-object v0, p0, Lo/asi;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "LAST_PHOTO_SYNC_TIME"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 73
    return-void
.end method
