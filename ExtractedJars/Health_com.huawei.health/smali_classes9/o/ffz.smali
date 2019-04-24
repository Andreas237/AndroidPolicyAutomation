.class public Lo/ffz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, "deviceautotest"

    iput-object v0, p0, Lo/ffz;->c:Ljava/lang/String;

    .line 19
    iput-object p1, p0, Lo/ffz;->e:Landroid/content/Context;

    .line 20
    if-eqz p2, :cond_0

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21
    :cond_0
    iget-object v0, p0, Lo/ffz;->c:Ljava/lang/String;

    iput-object v0, p0, Lo/ffz;->a:Ljava/lang/String;

    goto :goto_0

    .line 23
    :cond_1
    iput-object p2, p0, Lo/ffz;->a:Ljava/lang/String;

    .line 25
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 4

    .line 59
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/ffz;->e:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 60
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 63
    :cond_1
    iget-object v0, p0, Lo/ffz;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ffz;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 65
    invoke-interface {v3, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 66
    const/4 v0, 0x0

    return v0

    .line 68
    :cond_2
    const/4 v0, 0x0

    invoke-interface {v3, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 28
    if-eqz p2, :cond_0

    iget-object v0, p0, Lo/ffz;->e:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 29
    :cond_0
    return-void

    .line 31
    :cond_1
    iget-object v0, p0, Lo/ffz;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ffz;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 32
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 33
    invoke-interface {v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 34
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 35
    return-void
.end method

.method public e(Ljava/lang/String;Z)V
    .locals 5

    .line 50
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/ffz;->e:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 51
    :cond_0
    return-void

    .line 53
    :cond_1
    iget-object v0, p0, Lo/ffz;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ffz;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 54
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 55
    invoke-interface {v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 56
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 57
    return-void
.end method
