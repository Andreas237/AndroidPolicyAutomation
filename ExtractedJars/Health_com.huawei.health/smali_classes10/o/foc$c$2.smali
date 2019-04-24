.class Lo/foc$c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/foc$c;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fly;

.field final synthetic c:Lo/foc$c;


# direct methods
.method constructor <init>(Lo/foc$c;Lo/fly;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lo/foc$c$2;->c:Lo/foc$c;

    iput-object p2, p0, Lo/foc$c$2;->a:Lo/fly;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 216
    iget-object v0, p0, Lo/foc$c$2;->c:Lo/foc$c;

    iget-object v0, v0, Lo/foc$c;->a:Lo/foc;

    iget-object v1, p0, Lo/foc$c$2;->c:Lo/foc$c;

    invoke-static {v1}, Lo/foc$c;->e(Lo/foc$c;)Lo/fmb;

    move-result-object v1

    iget-object v2, p0, Lo/foc$c$2;->a:Lo/fly;

    invoke-static {v0, v1, v2}, Lo/foc;->c(Lo/foc;Lo/fmb;Lo/fly;)V

    .line 217
    return-void
.end method
