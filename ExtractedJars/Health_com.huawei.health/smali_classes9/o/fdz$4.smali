.class Lo/fdz$4;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdz;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fdz;


# direct methods
.method constructor <init>(Lo/fdz;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/fdz$4;->c:Lo/fdz;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 45
    iget-object v0, p0, Lo/fdz$4;->c:Lo/fdz;

    invoke-static {v0}, Lo/fdz;->a(Lo/fdz;)V

    .line 46
    return-void
.end method
