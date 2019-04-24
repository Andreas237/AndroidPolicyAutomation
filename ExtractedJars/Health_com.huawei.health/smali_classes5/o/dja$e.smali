.class Lo/dja$e;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dja;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic c:Lo/dja;

.field d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lo/dja;Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/dja$e;->c:Lo/dja;

    .line 108
    invoke-direct {p0, p3}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 109
    iput-object p2, p0, Lo/dja$e;->d:Landroid/content/Context;

    .line 110
    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    .line 114
    invoke-super {p0}, Landroid/database/ContentObserver;->deliverSelfNotifications()Z

    move-result v0

    return v0
.end method

.method public onChange(Z)V
    .locals 6

    .line 119
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 121
    iget-object v0, p0, Lo/dja$e;->d:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/media/AudioManager;

    .line 122
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v5

    .line 123
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u97f3\u91cf\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    iget-object v0, p0, Lo/dja$e;->c:Lo/dja;

    invoke-static {v0}, Lo/dja;->b(Lo/dja;)I

    move-result v0

    if-eq v0, v5, :cond_0

    .line 125
    iget-object v0, p0, Lo/dja$e;->c:Lo/dja;

    invoke-static {v0, v5}, Lo/dja;->d(Lo/dja;I)I

    .line 126
    iget-object v0, p0, Lo/dja$e;->c:Lo/dja;

    invoke-static {v0}, Lo/dja;->a(Lo/dja;)Lo/dir$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 127
    iget-object v0, p0, Lo/dja$e;->c:Lo/dja;

    invoke-static {v0}, Lo/dja;->a(Lo/dja;)Lo/dir$e;

    move-result-object v0

    invoke-interface {v0}, Lo/dir$e;->d()V

    .line 130
    :cond_0
    return-void
.end method
