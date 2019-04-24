.class public Lo/fjx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/fjx;

.field private static e:Landroid/content/SharedPreferences$Editor;


# instance fields
.field private a:Landroid/content/SharedPreferences;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fjx;->a:Landroid/content/SharedPreferences;

    .line 19
    iget-object v0, p0, Lo/fjx;->a:Landroid/content/SharedPreferences;

    invoke-static {v0, p1}, Lo/fjx;->a(Landroid/content/SharedPreferences;Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/fjx;->a:Landroid/content/SharedPreferences;

    .line 20
    iget-object v0, p0, Lo/fjx;->a:Landroid/content/SharedPreferences;

    sget-object v1, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    invoke-static {v0, v1, p1}, Lo/fjx;->c(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;Landroid/content/Context;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    sput-object v0, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    .line 21
    return-void
.end method

.method public static a(Landroid/content/SharedPreferences;Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    .line 25
    const-string v0, "sMyftDataObject"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static a(Landroid/content/Context;)Lo/fjx;
    .locals 1

    .line 35
    sget-object v0, Lo/fjx;->d:Lo/fjx;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lo/fjx;

    invoke-direct {v0, p0}, Lo/fjx;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/fjx;->d:Lo/fjx;

    .line 37
    :cond_0
    sget-object v0, Lo/fjx;->d:Lo/fjx;

    return-object v0
.end method

.method public static c(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;Landroid/content/Context;)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 30
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 31
    return-object p1
.end method


# virtual methods
.method public a(Lo/fjw;)V
    .locals 3

    .line 42
    sget-object v0, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    const-string v1, "sMyftAccessToken"

    invoke-virtual {p1}, Lo/fjw;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 43
    sget-object v0, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    const-string v1, "sMyftIsLogin"

    invoke-virtual {p1}, Lo/fjw;->e()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 44
    sget-object v0, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    const-string v1, "sMyftSyncTime"

    invoke-virtual {p1}, Lo/fjw;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 45
    sget-object v0, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 46
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 80
    sget-object v0, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    const-string v1, "sMyftSyncTime"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 81
    sget-object v0, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 82
    return-void
.end method

.method public d(Z)V
    .locals 2

    .line 59
    sget-object v0, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    const-string v1, "sMyftIsLogin"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 60
    sget-object v0, Lo/fjx;->e:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 61
    return-void
.end method

.method public e()Lo/fjw;
    .locals 4

    .line 49
    new-instance v3, Lo/fjw;

    invoke-direct {v3}, Lo/fjw;-><init>()V

    .line 50
    iget-object v0, p0, Lo/fjx;->a:Landroid/content/SharedPreferences;

    const-string v1, "sMyftAccessToken"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fjw;->b(Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lo/fjx;->a:Landroid/content/SharedPreferences;

    const-string v1, "sMyftIsLogin"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fjw;->c(Ljava/lang/Boolean;)V

    .line 53
    iget-object v0, p0, Lo/fjx;->a:Landroid/content/SharedPreferences;

    const-string v1, "sMyftSyncTime"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fjw;->a(Ljava/lang/String;)V

    .line 54
    return-object v3
.end method
