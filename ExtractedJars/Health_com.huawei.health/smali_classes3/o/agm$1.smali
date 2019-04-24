.class Lo/agm$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agm;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/agm;


# direct methods
.method constructor <init>(Lo/agm;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lo/agm$1;->c:Lo/agm;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 260
    iget-object v0, p0, Lo/agm$1;->c:Lo/agm;

    invoke-static {v0}, Lo/agm;->h(Lo/agm;)V

    .line 261
    return-void
.end method
