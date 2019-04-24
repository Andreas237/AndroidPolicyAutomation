.class Lo/eqx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eqx;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/eqx;


# direct methods
.method constructor <init>(Lo/eqx;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lo/eqx$1;->d:Lo/eqx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 220
    iget-object v0, p0, Lo/eqx$1;->d:Lo/eqx;

    invoke-static {v0}, Lo/eqx;->i(Lo/eqx;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lo/eqx$1;->d:Lo/eqx;

    invoke-static {v0}, Lo/eqx;->d(Lo/eqx;)V

    .line 223
    :cond_0
    return-void
.end method
