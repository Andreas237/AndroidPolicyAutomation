.class Lo/cbq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vm;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbq;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cbq;


# direct methods
.method constructor <init>(Lo/cbq;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 5

    .line 95
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->d(Lo/cbq;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwActivityRecognitionServiceConnection onServiceConnected()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->d(Lo/cbq;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stillActivityRecognition is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.still"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->b(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 101
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.still"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->a(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x2

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 102
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.walking"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->b(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 103
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.walking"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->a(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x2

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 104
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.running"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->b(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 105
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.running"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->a(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x2

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 106
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.on_bicycle"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->b(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 107
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.on_bicycle"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->a(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x2

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 108
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.in_vehicle"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->b(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 109
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v0

    const-string v1, "android.activity_recognition.in_vehicle"

    iget-object v2, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v2}, Lo/cbq;->a(Lo/cbq;)J

    move-result-wide v2

    const/4 v4, 0x2

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/ve;->d(Ljava/lang/String;IJ)Z

    .line 111
    return-void
.end method

.method public d()V
    .locals 4

    .line 116
    iget-object v0, p0, Lo/cbq$2;->a:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->d(Lo/cbq;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwActivityRecognitionServiceConnection onServiceDisconnected()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    return-void
.end method
