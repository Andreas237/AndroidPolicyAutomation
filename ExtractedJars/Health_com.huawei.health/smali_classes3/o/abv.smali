.class public Lo/abv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aku;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/abv$c;
    }
.end annotation


# instance fields
.field private a:Landroid/hardware/SensorManager;

.field private b:Lo/abv$c;

.field private c:I

.field private d:I

.field private e:Landroid/content/Context;

.field private h:I


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/abv;-><init>(Landroid/content/Context;Z)V

    .line 33
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Z)V
    .locals 4

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abv;->e:Landroid/content/Context;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    .line 28
    const/4 v0, -0x1

    iput v0, p0, Lo/abv;->c:I

    .line 82
    const/4 v0, -0x1

    iput v0, p0, Lo/abv;->d:I

    .line 83
    const/4 v0, -0x1

    iput v0, p0, Lo/abv;->h:I

    .line 37
    iput-object p1, p0, Lo/abv;->e:Landroid/content/Context;

    .line 38
    iget-object v0, p0, Lo/abv;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 39
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StandStepCounter mContext "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/abv;->e:Landroid/content/Context;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 41
    :cond_0
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StandStepCounter mContext = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    :goto_0
    new-instance v0, Lo/abv$c;

    iget-object v1, p0, Lo/abv;->e:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/abv$c;-><init>(Landroid/content/Context;Lo/abv$3;)V

    iput-object v0, p0, Lo/abv;->b:Lo/abv$c;

    .line 44
    iget-object v0, p0, Lo/abv;->e:Landroid/content/Context;

    if-eqz v0, :cond_1

    if-nez p2, :cond_1

    .line 45
    iget-object v0, p0, Lo/abv;->e:Landroid/content/Context;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    .line 47
    :cond_1
    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 63
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopStepCounter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    iget-object v0, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 69
    :cond_0
    return-void
.end method

.method public b(IZ)V
    .locals 0

    .line 87
    invoke-virtual {p0, p1}, Lo/abv;->e(I)V

    .line 88
    if-eqz p2, :cond_0

    .line 89
    iput p1, p0, Lo/abv;->d:I

    goto :goto_0

    .line 91
    :cond_0
    iput p1, p0, Lo/abv;->h:I

    .line 93
    :goto_0
    return-void
.end method

.method public c()V
    .locals 5

    .line 51
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startStepCounter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    iget-object v0, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    .line 54
    const/16 v2, 0x13

    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    .line 53
    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v4

    .line 56
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startStepCounter registerListener: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 97
    if-eqz p1, :cond_0

    .line 98
    const/4 v0, -0x1

    iput v0, p0, Lo/abv;->d:I

    goto :goto_0

    .line 100
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lo/abv;->h:I

    .line 102
    :goto_0
    return-void
.end method

.method public d()V
    .locals 4

    .line 122
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    .line 123
    iget-object v0, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 124
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flush sensor data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lo/abv;->a:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->flush(Landroid/hardware/SensorEventListener;)Z

    .line 128
    :cond_0
    return-void
.end method

.method public e()V
    .locals 4

    .line 131
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reStartStepCounter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    invoke-virtual {p0}, Lo/abv;->b()V

    .line 133
    invoke-virtual {p0}, Lo/abv;->c()V

    .line 134
    return-void
.end method

.method public e(I)V
    .locals 5

    .line 105
    iget v0, p0, Lo/abv;->d:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, Lo/abv;->h:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 107
    iput v4, p0, Lo/abv;->c:I

    .line 108
    iget-object v0, p0, Lo/abv;->b:Lo/abv$c;

    invoke-static {v0, v4}, Lo/abv$c;->e(Lo/abv$c;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong data,lose it "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void

    .line 112
    :cond_0
    iget-object v0, p0, Lo/abv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, v4}, Lo/alt;->a(JI)V

    .line 113
    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 4

    .line 117
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAccuracyChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 3

    .line 74
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/16 v1, 0x13

    if-ne v0, v1, :cond_0

    .line 75
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    float-to-int v2, v0

    .line 76
    invoke-virtual {p0, v2}, Lo/abv;->e(I)V

    .line 78
    iput v2, p0, Lo/abv;->d:I

    .line 80
    :cond_0
    return-void
.end method
