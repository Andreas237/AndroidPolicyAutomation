.class Lo/flx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/flx;->a(Lo/fma;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fma;

.field final synthetic e:Lo/flx;


# direct methods
.method constructor <init>(Lo/flx;Lo/fma;)V
    .locals 0

    .line 559
    iput-object p1, p0, Lo/flx$2;->e:Lo/flx;

    iput-object p2, p0, Lo/flx$2;->d:Lo/fma;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 562
    iget-object v0, p0, Lo/flx$2;->e:Lo/flx;

    invoke-static {v0}, Lo/flx;->a(Lo/flx;)Lo/fnw;

    move-result-object v0

    iget-object v1, p0, Lo/flx$2;->d:Lo/fma;

    invoke-interface {v0, v1}, Lo/fnw;->a(Lo/fma;)V

    .line 563
    return-void
.end method
