.class Lo/brj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brj;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/brj;


# direct methods
.method constructor <init>(Lo/brj;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/brj$2;->e:Lo/brj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 103
    const-string v0, "VoicePlayUtil"

    const-string v1, "playVoice complete"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lo/brj$2;->e:Lo/brj;

    invoke-static {v0}, Lo/brj;->b(Lo/brj;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 105
    iget-object v0, p0, Lo/brj$2;->e:Lo/brj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/brj;->c(Lo/brj;Landroid/media/MediaPlayer;)Landroid/media/MediaPlayer;

    .line 107
    iget-object v0, p0, Lo/brj$2;->e:Lo/brj;

    invoke-static {v0}, Lo/brj;->a(Lo/brj;)V

    .line 108
    return-void
.end method
