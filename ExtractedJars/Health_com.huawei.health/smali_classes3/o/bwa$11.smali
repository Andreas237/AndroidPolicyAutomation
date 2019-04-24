.class Lo/bwa$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->O()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 897
    iput-object p1, p0, Lo/bwa$11;->c:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 900
    iget-object v0, p0, Lo/bwa$11;->c:Lo/bwa;

    iget-object v0, v0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    if-nez v0, :cond_0

    .line 901
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "afterHolderCreate mMediaHelper not playing -- to replay: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwa$11;->c:Lo/bwa;

    iget-object v3, v3, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v3}, Lo/bwa$d;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 902
    iget-object v0, p0, Lo/bwa$11;->c:Lo/bwa;

    iget-object v0, v0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->i()Lo/bvz;

    .line 904
    :cond_0
    return-void
.end method
