.class public Lo/ceg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static e:Lo/ceg;


# instance fields
.field private c:Lo/cej;

.field private d:Lo/cei;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ceg;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-direct {p0, p1}, Lo/ceg;->d(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/ceg;
    .locals 6

    .line 33
    sget-object v4, Lo/ceg;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 34
    :try_start_0
    sget-object v0, Lo/ceg;->e:Lo/ceg;

    if-nez v0, :cond_0

    .line 35
    const-string v0, "Track_VoicePlayer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() new VoicePlayer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    new-instance v0, Lo/ceg;

    invoke-direct {v0, p0}, Lo/ceg;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ceg;->e:Lo/ceg;

    .line 39
    :cond_0
    const-string v0, "Track_VoicePlayer"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() SoundPoolVoiceEng = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/ceg;->e:Lo/ceg;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    sget-object v0, Lo/ceg;->e:Lo/ceg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 41
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method private static b()V
    .locals 3

    .line 113
    sget-object v1, Lo/ceg;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 114
    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lo/ceg;->e:Lo/ceg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 116
    :goto_0
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 5

    .line 95
    const-string v0, "Track_VoicePlayer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initilize() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    invoke-static {p1}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    new-instance v0, Lo/ced;

    invoke-direct {v0}, Lo/ced;-><init>()V

    iput-object v0, p0, Lo/ceg;->c:Lo/cej;

    goto :goto_0

    .line 103
    :cond_0
    new-instance v0, Lo/ceh;

    invoke-direct {v0}, Lo/ceh;-><init>()V

    iput-object v0, p0, Lo/ceg;->c:Lo/cej;

    .line 106
    :goto_0
    iget-object v0, p0, Lo/ceg;->c:Lo/cej;

    move-object v4, v0

    check-cast v4, Lo/cel;

    .line 108
    new-instance v0, Lo/cec;

    invoke-interface {v4}, Lo/cel;->b()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lo/cec;-><init>(Landroid/content/Context;Ljava/util/Map;)V

    iput-object v0, p0, Lo/ceg;->d:Lo/cei;

    .line 109
    return-void
.end method


# virtual methods
.method public a()I
    .locals 4

    .line 77
    const-string v0, "Track_VoicePlayer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stop() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-object v0, p0, Lo/ceg;->d:Lo/cei;

    invoke-interface {v0}, Lo/cei;->d()V

    .line 79
    const/4 v0, 0x0

    return v0
.end method

.method public b(ZILjava/lang/Object;)I
    .locals 4

    .line 55
    const-string v0, "Track_VoicePlayer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "play() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const/16 v0, 0xa

    if-ne p2, v0, :cond_0

    .line 58
    iget-object v0, p0, Lo/ceg;->d:Lo/cei;

    invoke-interface {v0, p3, p1}, Lo/cei;->c(Ljava/lang/Object;Z)V

    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Lo/ceg;->d:Lo/cei;

    iget-object v1, p0, Lo/ceg;->c:Lo/cej;

    invoke-interface {v1, p2, p3}, Lo/cej;->e(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lo/cei;->c(Ljava/lang/Object;Z)V

    .line 66
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 1

    .line 122
    iget-object v0, p0, Lo/ceg;->d:Lo/cei;

    invoke-interface {v0, p1}, Lo/cei;->c(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 124
    return-void
.end method

.method public c()V
    .locals 4

    .line 88
    const-string v0, "Track_VoicePlayer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lo/ceg;->d:Lo/cei;

    invoke-interface {v0}, Lo/cei;->c()V

    .line 90
    invoke-static {}, Lo/ceg;->b()V

    .line 91
    return-void
.end method

.method public e(Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lo/ceg;->d:Lo/cei;

    invoke-interface {v0, p1}, Lo/cei;->b(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 120
    return-void
.end method
