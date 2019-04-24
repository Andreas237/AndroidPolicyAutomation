.class Lo/bqa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bqa;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:J

.field final synthetic d:Lo/bqa;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/bqa;JJ)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/bqa$1;->d:Lo/bqa;

    iput-wide p2, p0, Lo/bqa$1;->c:J

    iput-wide p4, p0, Lo/bqa$1;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 53
    iget-object v0, p0, Lo/bqa$1;->d:Lo/bqa;

    invoke-static {v0}, Lo/bqa;->b(Lo/bqa;)Lo/bqe;

    move-result-object v0

    iget-wide v1, p0, Lo/bqa$1;->c:J

    iget-wide v3, p0, Lo/bqa$1;->e:J

    invoke-interface {v0, v1, v2, v3, v4}, Lo/bqe;->onProgress(JJ)V

    .line 54
    return-void
.end method
