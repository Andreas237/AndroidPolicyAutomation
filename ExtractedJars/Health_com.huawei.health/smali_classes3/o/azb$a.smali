.class Lo/azb$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lo/azb;

.field private e:Lo/bac;


# direct methods
.method constructor <init>(Lo/azb;Lo/bac;)V
    .locals 0

    .line 410
    iput-object p1, p0, Lo/azb$a;->d:Lo/azb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 411
    iput-object p2, p0, Lo/azb$a;->e:Lo/bac;

    .line 412
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 417
    iget-object v0, p0, Lo/azb$a;->d:Lo/azb;

    invoke-static {v0}, Lo/azb;->g(Lo/azb;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bab;

    .line 419
    if-eqz v2, :cond_0

    .line 421
    iget-object v0, p0, Lo/azb$a;->e:Lo/bac;

    invoke-interface {v2, v0}, Lo/bab;->d(Lo/bac;)V

    .line 423
    :cond_0
    goto :goto_0

    .line 424
    :cond_1
    return-void
.end method
