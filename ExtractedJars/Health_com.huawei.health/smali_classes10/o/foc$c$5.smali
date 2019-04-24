.class Lo/foc$c$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/foc$c;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/foc$c;

.field final synthetic d:Lo/fly;


# direct methods
.method constructor <init>(Lo/foc$c;Lo/fly;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lo/foc$c$5;->a:Lo/foc$c;

    iput-object p2, p0, Lo/foc$c$5;->d:Lo/fly;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 247
    iget-object v0, p0, Lo/foc$c$5;->a:Lo/foc$c;

    iget-object v0, v0, Lo/foc$c;->a:Lo/foc;

    iget-object v1, p0, Lo/foc$c$5;->a:Lo/foc$c;

    invoke-static {v1}, Lo/foc$c;->e(Lo/foc$c;)Lo/fmb;

    move-result-object v1

    iget-object v2, p0, Lo/foc$c$5;->d:Lo/fly;

    invoke-static {v0, v1, v2}, Lo/foc;->e(Lo/foc;Lo/fmb;Lo/fly;)V

    .line 248
    return-void
.end method
