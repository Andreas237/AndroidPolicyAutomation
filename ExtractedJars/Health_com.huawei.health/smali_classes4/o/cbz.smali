.class public Lo/cbz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Z

.field private e:Z

.field private k:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x2

    iput v0, p0, Lo/cbz;->c:I

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbz;->d:Z

    .line 38
    const/16 v0, 0x28

    iput v0, p0, Lo/cbz;->b:I

    .line 39
    const/16 v0, 0x258

    iput v0, p0, Lo/cbz;->a:I

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbz;->e:Z

    .line 45
    const/high16 v0, 0x447a0000    # 1000.0f

    iput v0, p0, Lo/cbz;->k:F

    return-void
.end method

.method private c(Ljava/lang/String;)Z
    .locals 2

    .line 225
    if-nez p1, :cond_0

    .line 226
    const/4 v0, 0x0

    return v0

    .line 228
    :cond_0
    const-string v1, "5.0"

    .line 229
    invoke-virtual {p1, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 159
    iput p1, p0, Lo/cbz;->b:I

    .line 160
    return-void
.end method

.method public a()Z
    .locals 1

    .line 124
    iget-boolean v0, p0, Lo/cbz;->d:Z

    return v0
.end method

.method public b()Z
    .locals 1

    .line 201
    iget-boolean v0, p0, Lo/cbz;->e:Z

    return v0
.end method

.method public c(Landroid/content/Context;)V
    .locals 5

    .line 50
    if-nez p1, :cond_0

    .line 51
    return-void

    .line 54
    :cond_0
    const-string v0, "AutoTrack"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 56
    if-eqz v4, :cond_1

    .line 58
    const-string v0, "BtnShow"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cbz;->d:Z

    .line 59
    const-string v0, "TrackEnable"

    const/4 v1, 0x2

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cbz;->c:I

    .line 60
    const-string v0, "StartDelay"

    const/16 v1, 0x28

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cbz;->b:I

    .line 61
    const-string v0, "StopDelay"

    const/16 v1, 0x258

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cbz;->a:I

    .line 62
    const-string v0, "ShowDebug"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cbz;->e:Z

    .line 63
    const-string v0, "MinDistance"

    const/high16 v1, 0x447a0000    # 1000.0f

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lo/cbz;->k:F

    .line 66
    invoke-static {}, Lo/dbf;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cbz;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbz;->d:Z

    .line 71
    :cond_1
    const-string v0, "Track_AutoTrackConfig"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/cbz;->d:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  enable "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/cbz;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " start "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/cbz;->b:I

    .line 72
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " stop "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p0, Lo/cbz;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 71
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 133
    if-eqz p1, :cond_0

    .line 134
    const/4 v0, 0x1

    iput v0, p0, Lo/cbz;->c:I

    goto :goto_0

    .line 136
    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lo/cbz;->c:I

    .line 138
    :goto_0
    return-void
.end method

.method public c()Z
    .locals 2

    .line 146
    iget v0, p0, Lo/cbz;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 147
    const/4 v0, 0x1

    return v0

    .line 150
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 1

    .line 167
    iget v0, p0, Lo/cbz;->b:I

    return v0
.end method

.method public d(F)V
    .locals 1

    .line 211
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 212
    iput p1, p0, Lo/cbz;->k:F

    .line 214
    :cond_0
    return-void
.end method

.method public e()I
    .locals 1

    .line 184
    iget v0, p0, Lo/cbz;->a:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 176
    iput p1, p0, Lo/cbz;->a:I

    .line 177
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 6

    .line 77
    if-nez p1, :cond_0

    .line 78
    return-void

    .line 81
    :cond_0
    const-string v0, "AutoTrack"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 83
    if-nez v4, :cond_1

    .line 84
    return-void

    .line 87
    :cond_1
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    .line 89
    if-nez v5, :cond_2

    .line 90
    return-void

    .line 93
    :cond_2
    const-string v0, "BtnShow"

    iget-boolean v1, p0, Lo/cbz;->d:Z

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 94
    const-string v0, "TrackEnable"

    iget v1, p0, Lo/cbz;->c:I

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 95
    const-string v0, "ShowDebug"

    iget-boolean v1, p0, Lo/cbz;->e:Z

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 96
    const-string v0, "StartDelay"

    iget v1, p0, Lo/cbz;->b:I

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 97
    const-string v0, "StopDelay"

    iget v1, p0, Lo/cbz;->a:I

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 98
    const-string v0, "MinDistance"

    iget v1, p0, Lo/cbz;->k:F

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 100
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_3

    .line 101
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 104
    :cond_3
    const-string v0, "Track_AutoTrackConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveConfigToFile success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return-void
.end method

.method public h()F
    .locals 1

    .line 221
    iget v0, p0, Lo/cbz;->k:F

    return v0
.end method
