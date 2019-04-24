.class Lo/fnv$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fnv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final a:Lo/fmu;

.field final synthetic b:Lo/fnv;

.field final d:Lo/fmb;


# direct methods
.method public constructor <init>(Lo/fnv;Lo/fmu;Lo/fmb;)V
    .locals 0

    .line 452
    iput-object p1, p0, Lo/fnv$d;->b:Lo/fnv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 453
    iput-object p2, p0, Lo/fnv$d;->a:Lo/fmu;

    .line 454
    iput-object p3, p0, Lo/fnv$d;->d:Lo/fmb;

    .line 455
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 459
    iget-object v0, p0, Lo/fnv$d;->a:Lo/fmu;

    iget-object v1, p0, Lo/fnv$d;->d:Lo/fmb;

    invoke-virtual {v0, v1}, Lo/fmu;->d(Lo/fmb;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 464
    :cond_0
    iget-object v0, p0, Lo/fnv$d;->b:Lo/fnv;

    iget-object v1, p0, Lo/fnv$d;->d:Lo/fmb;

    invoke-static {v0, v1}, Lo/fnv;->b(Lo/fnv;Lo/fmb;)V

    .line 466
    :goto_0
    return-void
.end method
