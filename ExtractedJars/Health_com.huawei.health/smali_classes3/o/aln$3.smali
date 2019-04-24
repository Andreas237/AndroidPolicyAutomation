.class Lo/aln$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aln;->d(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/aln;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/aln;Ljava/lang/String;)V
    .locals 0

    .line 274
    iput-object p1, p0, Lo/aln$3;->c:Lo/aln;

    iput-object p2, p0, Lo/aln$3;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 277
    iget-object v0, p0, Lo/aln$3;->c:Lo/aln;

    invoke-static {v0}, Lo/aln;->b(Lo/aln;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_0

    .line 278
    return-void

    .line 281
    :cond_0
    iget-object v0, p0, Lo/aln$3;->c:Lo/aln;

    invoke-static {v0}, Lo/aln;->c(Lo/aln;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/aln$3;->c:Lo/aln;

    iget-object v1, p0, Lo/aln$3;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/aln;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 282
    invoke-static {}, Lo/aln;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAutoTrackHeartBeat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lo/aln$3;->c:Lo/aln;

    invoke-static {v0}, Lo/aln;->e(Lo/aln;)Lo/amn;

    move-result-object v0

    invoke-virtual {v0}, Lo/amn;->e()V

    .line 285
    :cond_1
    iget-object v0, p0, Lo/aln$3;->c:Lo/aln;

    invoke-static {v0}, Lo/aln;->b(Lo/aln;)Landroid/os/Handler;

    move-result-object v0

    const-wide/32 v1, 0xea60

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 286
    return-void
.end method
