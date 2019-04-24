.class Lo/bri$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bri;->b(Landroid/content/Context;Landroid/view/View;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic c:Lo/bri;


# direct methods
.method constructor <init>(Lo/bri;Landroid/view/View;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lo/bri$1;->c:Lo/bri;

    iput-object p2, p0, Lo/bri$1;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 90
    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/bri$1;->c:Lo/bri;

    invoke-static {v0}, Lo/bri;->b(Lo/bri;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    new-instance v8, Landroid/os/Message;

    invoke-direct {v8}, Landroid/os/Message;-><init>()V

    .line 93
    iget-object v0, p0, Lo/bri$1;->c:Lo/bri;

    iget-object v0, v0, Lo/bri;->e:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->getMaxAmplitude()I

    move-result v0

    mul-int/lit8 v0, v0, 0x63

    div-int/lit16 v0, v0, 0x7fff

    iput v0, v8, Landroid/os/Message;->what:I

    .line 94
    iget-object v0, p0, Lo/bri$1;->c:Lo/bri;

    invoke-static {v0}, Lo/bri;->d(Lo/bri;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 95
    const-wide/16 v0, 0x64

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 96
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Lo/bri$1;->c:Lo/bri;

    invoke-static {v2}, Lo/bri;->c(Lo/bri;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    div-int/lit16 v9, v0, 0x3e8

    .line 97
    const/16 v0, 0x3c

    if-le v9, v0, :cond_0

    .line 99
    iget-object v0, p0, Lo/bri$1;->a:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 102
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x64

    add-long/2addr v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, -0x1

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v10

    .line 103
    iget-object v0, p0, Lo/bri$1;->a:Landroid/view/View;

    invoke-virtual {v0, v10}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 104
    const-string v0, "VoiceRecorderUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "times = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",voiceRecorderView="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bri$1;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :cond_0
    goto/16 :goto_0

    .line 115
    :cond_1
    goto :goto_1

    .line 110
    :catch_0
    move-exception v8

    .line 114
    const-string v0, "VoiceRecorderUtil"

    invoke-virtual {v8}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :goto_1
    return-void
.end method
