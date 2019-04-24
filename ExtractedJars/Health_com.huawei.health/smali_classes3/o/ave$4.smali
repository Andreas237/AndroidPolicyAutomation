.class Lo/ave$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ave;->g(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ave;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/ave;Ljava/lang/String;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lo/ave$4;->b:Lo/ave;

    iput-object p2, p0, Lo/ave$4;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 265
    iget-object v0, p0, Lo/ave$4;->b:Lo/ave;

    iget-object v1, p0, Lo/ave$4;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/ave;->d(Lo/ave;Ljava/lang/String;)V

    .line 266
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 271
    iget-object v0, p0, Lo/ave$4;->b:Lo/ave;

    invoke-static {v0}, Lo/ave;->a(Lo/ave;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 272
    const-string v0, "PushManager"

    const-string v1, "upload token login error."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    return-void
.end method
