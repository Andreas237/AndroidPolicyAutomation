.class Lo/anv$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/anv;->p()Ljava/util/TimerTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/anv;


# direct methods
.method constructor <init>(Lo/anv;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lo/anv$1;->c:Lo/anv;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 246
    iget-object v0, p0, Lo/anv$1;->c:Lo/anv;

    invoke-static {v0}, Lo/anv;->c(Lo/anv;)V

    .line 247
    return-void
.end method
