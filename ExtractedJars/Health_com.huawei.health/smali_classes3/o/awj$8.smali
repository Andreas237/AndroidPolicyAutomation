.class Lo/awj$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awj;->b(Ljava/lang/String;Ljava/lang/String;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/awj;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/awj;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 815
    iput-object p1, p0, Lo/awj$8;->a:Lo/awj;

    iput-object p2, p0, Lo/awj$8;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/awj$8;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 815
    invoke-virtual {p0, p1}, Lo/awj$8;->c(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Void;
    .locals 5

    .line 819
    iget-object v0, p0, Lo/awj$8;->a:Lo/awj;

    invoke-static {v0}, Lo/awj;->e(Lo/awj;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 821
    :try_start_0
    iget-object v0, p0, Lo/awj$8;->a:Lo/awj;

    invoke-static {v0}, Lo/awj;->g(Lo/awj;)Lo/awp;

    move-result-object v0

    iget-object v1, p0, Lo/awj$8;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/awj$8;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/awp;->a(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 822
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 823
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
