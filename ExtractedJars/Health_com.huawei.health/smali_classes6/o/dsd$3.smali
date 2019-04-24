.class Lo/dsd$3;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dsd;->c(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dsd;


# direct methods
.method constructor <init>(Lo/dsd;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lo/dsd$3;->c:Lo/dsd;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 237
    iget-object v0, p0, Lo/dsd$3;->c:Lo/dsd;

    invoke-static {v0}, Lo/dsd;->c(Lo/dsd;)V

    .line 238
    return-void
.end method
