.class Lo/we$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/we;->c(JIILandroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/we;

.field final synthetic b:J

.field final synthetic c:I

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/we;JII)V
    .locals 0

    .line 1045
    iput-object p1, p0, Lo/we$4;->a:Lo/we;

    iput-wide p2, p0, Lo/we$4;->b:J

    iput p4, p0, Lo/we$4;->c:I

    iput p5, p0, Lo/we$4;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1048
    move-object v5, p0

    monitor-enter v5

    .line 1051
    :try_start_0
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    iget-wide v1, p0, Lo/we$4;->b:J

    iget v3, p0, Lo/we$4;->c:I

    iget v4, p0, Lo/we$4;->e:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/wr;->b(JII)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1052
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 1053
    :goto_0
    return-void
.end method
