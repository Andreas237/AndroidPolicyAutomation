.class public Lo/afi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, "mDefaultFilePath"

    iput-object v0, p0, Lo/afi;->d:Ljava/lang/String;

    .line 18
    iget-object v0, p0, Lo/afi;->d:Ljava/lang/String;

    iput-object v0, p0, Lo/afi;->a:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, "mDefaultFilePath"

    iput-object v0, p0, Lo/afi;->d:Ljava/lang/String;

    .line 21
    iput-object p1, p0, Lo/afi;->a:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 6

    .line 44
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceSharePreferencesManager flushMemoryToSharedPreferences"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 47
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceSharePreferencesManager invalid macAddress"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    return-void

    .line 51
    :cond_1
    iget-object v0, p0, Lo/afi;->a:Ljava/lang/String;

    const v1, 0x8000

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 52
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    .line 53
    invoke-interface {v5, p2, p3, p4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 54
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 55
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;)I
    .locals 6

    .line 64
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceSharePreferencesManager getSequenceNumberFromSharedPreferences"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 67
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 70
    :cond_1
    const/4 v4, 0x0

    .line 71
    iget-object v0, p0, Lo/afi;->a:Ljava/lang/String;

    const v1, 0x8000

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 73
    invoke-interface {v5, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 74
    const/4 v0, 0x0

    return v0

    .line 77
    :cond_2
    const/4 v0, 0x0

    invoke-interface {v5, p2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 78
    return v4
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;)J
    .locals 7

    .line 83
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceSharePreferencesManager getSequenceNumberFromSharedPreferences"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 86
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 90
    :cond_1
    iget-object v0, p0, Lo/afi;->a:Ljava/lang/String;

    const v1, 0x8000

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 92
    invoke-interface {v6, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 93
    const-wide/16 v0, 0x0

    return-wide v0

    .line 96
    :cond_2
    const-wide/16 v0, 0x0

    invoke-interface {v6, p2, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    .line 97
    return-wide v4
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 6

    .line 30
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceSharePreferencesManager flushMemoryToSharedPreferences"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 33
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceSharePreferencesManager invalid macAddress"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    return-void

    .line 37
    :cond_1
    iget-object v0, p0, Lo/afi;->a:Ljava/lang/String;

    const v1, 0x8000

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 38
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    .line 39
    invoke-interface {v5, p2, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 40
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 41
    return-void
.end method
