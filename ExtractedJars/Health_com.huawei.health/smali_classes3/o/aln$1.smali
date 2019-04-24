.class Lo/aln$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vm;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aln;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/aln;


# direct methods
.method constructor <init>(Lo/aln;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lo/aln$1;->e:Lo/aln;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 5

    .line 156
    iget-object v0, p0, Lo/aln$1;->e:Lo/aln;

    invoke-static {v0}, Lo/aln;->c(Lo/aln;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 157
    return-void

    .line 160
    :cond_0
    invoke-static {}, Lo/aln;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwActivityRecognitionServiceConnection onServiceConnected()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lo/aln$1;->e:Lo/aln;

    invoke-static {v0}, Lo/aln;->a(Lo/aln;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.running"

    const/4 v2, 0x1

    const-wide v3, 0x6fc23ac00L

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 165
    iget-object v0, p0, Lo/aln$1;->e:Lo/aln;

    invoke-static {v0}, Lo/aln;->a(Lo/aln;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.running"

    const/4 v2, 0x2

    const-wide v3, 0x6fc23ac00L

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 166
    return-void
.end method

.method public d()V
    .locals 4

    .line 171
    iget-object v0, p0, Lo/aln$1;->e:Lo/aln;

    invoke-static {v0}, Lo/aln;->c(Lo/aln;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    return-void

    .line 175
    :cond_0
    invoke-static {}, Lo/aln;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwActivityRecognition onServiceDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lo/aln$1;->e:Lo/aln;

    iget-object v1, p0, Lo/aln$1;->e:Lo/aln;

    invoke-static {v1}, Lo/aln;->d(Lo/aln;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.huawei.health.AUTO_TRACK_END"

    invoke-static {v0, v1, v2}, Lo/aln;->b(Lo/aln;Landroid/content/Context;Ljava/lang/String;)V

    .line 178
    return-void
.end method
