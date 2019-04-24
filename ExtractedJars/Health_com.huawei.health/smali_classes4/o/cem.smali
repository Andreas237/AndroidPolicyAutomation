.class public Lo/cem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:I

.field private b:J

.field private c:I

.field private d:I

.field private e:F

.field private f:Z

.field private g:Z

.field private h:J

.field private i:F

.field private k:Z

.field private l:Z

.field private m:Z

.field private o:Z


# direct methods
.method public constructor <init>(IFJI)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput p1, p0, Lo/cem;->c:I

    .line 54
    iput p2, p0, Lo/cem;->e:F

    .line 55
    iput-wide p3, p0, Lo/cem;->b:J

    .line 56
    iput p5, p0, Lo/cem;->d:I

    .line 57
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cem;->k:Z

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cem;->g:Z

    .line 59
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cem;->m:Z

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cem;->l:Z

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 4

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    if-nez p1, :cond_0

    .line 112
    const-string v0, "Track_SportStateVoiceParameter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playContent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    return-void

    .line 116
    :cond_0
    invoke-direct {p0, p1}, Lo/cem;->c(Landroid/os/Bundle;)V

    .line 117
    return-void
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 3

    .line 120
    const-string v0, "sportType"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cem;->c:I

    .line 121
    const-string v0, "distance"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lo/cem;->e:F

    .line 122
    const-string v0, "duration"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/cem;->b:J

    .line 123
    const-string v0, "heartRate"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cem;->d:I

    .line 124
    const-string v0, "calorie"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cem;->a:I

    .line 125
    const-string v0, "pace"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/cem;->h:J

    .line 126
    const-string v0, "paceTip"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cem;->f:Z

    .line 128
    const-string v0, "voice_distance"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cem;->k:Z

    .line 129
    const-string v0, "voice_speed_time"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cem;->g:Z

    .line 130
    const-string v0, "voice_pace"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cem;->m:Z

    .line 131
    const-string v0, "voice_heart_rate"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cem;->l:Z

    .line 132
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 139
    iget-boolean v0, p0, Lo/cem;->g:Z

    return v0
.end method

.method public b()Z
    .locals 1

    .line 147
    iget-boolean v0, p0, Lo/cem;->l:Z

    return v0
.end method

.method public c()Z
    .locals 1

    .line 150
    iget-boolean v0, p0, Lo/cem;->o:Z

    return v0
.end method

.method public d()Z
    .locals 1

    .line 135
    iget-boolean v0, p0, Lo/cem;->k:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .line 143
    iget-boolean v0, p0, Lo/cem;->m:Z

    return v0
.end method

.method public f()I
    .locals 1

    .line 166
    iget v0, p0, Lo/cem;->d:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 154
    iget v0, p0, Lo/cem;->c:I

    return v0
.end method

.method public h()F
    .locals 1

    .line 158
    iget v0, p0, Lo/cem;->e:F

    return v0
.end method

.method public i()J
    .locals 2

    .line 170
    iget-wide v0, p0, Lo/cem;->h:J

    return-wide v0
.end method

.method public k()J
    .locals 2

    .line 162
    iget-wide v0, p0, Lo/cem;->b:J

    return-wide v0
.end method

.method public m()F
    .locals 1

    .line 173
    iget v0, p0, Lo/cem;->i:F

    return v0
.end method

.method public n()Z
    .locals 1

    .line 176
    iget-boolean v0, p0, Lo/cem;->f:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportStateVoiceParameter [mSportType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cem;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCurrentDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cem;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mTotalDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/cem;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mLastPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/cem;->h:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cem;->i:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mPaceTip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/cem;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mVoiceDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/cem;->k:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mVoiceDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/cem;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mVoicePace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/cem;->m:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mVoiceHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/cem;->l:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mVoiceSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/cem;->o:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
