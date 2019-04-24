.class Lo/ffy$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffy;->a(Lo/ffu;Lo/fft;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fft;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic h:Lo/ffy;


# direct methods
.method constructor <init>(Lo/ffy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/fft;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lo/ffy$5;->h:Lo/ffy;

    iput-object p2, p0, Lo/ffy$5;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/ffy$5;->b:Ljava/lang/String;

    iput-object p4, p0, Lo/ffy$5;->c:Ljava/lang/String;

    iput-object p5, p0, Lo/ffy$5;->d:Ljava/lang/String;

    iput-object p6, p0, Lo/ffy$5;->a:Lo/fft;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 127
    iget-object v0, p0, Lo/ffy$5;->h:Lo/ffy;

    iget-object v1, p0, Lo/ffy$5;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/ffy$5;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/ffy;->e(Lo/ffy;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 128
    const-string v0, "UIDV_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "savePath is not sanitze"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-void

    .line 131
    :cond_0
    iget-object v0, p0, Lo/ffy$5;->h:Lo/ffy;

    iget-object v1, p0, Lo/ffy$5;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/ffy$5;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/ffy$5;->a:Lo/fft;

    invoke-static {v0, v1, v2, v3}, Lo/ffy;->a(Lo/ffy;Ljava/lang/String;Ljava/lang/String;Lo/fft;)V

    .line 132
    return-void
.end method
