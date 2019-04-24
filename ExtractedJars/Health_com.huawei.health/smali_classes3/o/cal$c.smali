.class Lo/cal$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/alb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lo/cal;


# direct methods
.method constructor <init>(Lo/cal;Lo/cav;)V
    .locals 1

    .line 143
    iput-object p1, p0, Lo/cal$c;->e:Lo/cal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    invoke-static {p1, p2}, Lo/cal;->c(Lo/cal;Lo/cav;)Lo/cav;

    .line 145
    return-void
.end method


# virtual methods
.method public b(Lo/ald;)V
    .locals 1

    .line 149
    if-nez p1, :cond_0

    .line 150
    return-void

    .line 152
    :cond_0
    iget-object v0, p0, Lo/cal$c;->e:Lo/cal;

    invoke-virtual {v0}, Lo/cal;->f()Lo/can;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/can;->c(Lo/ald;)V

    .line 153
    return-void
.end method
