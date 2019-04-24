.class Lo/efw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efw;->b(FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic c:Lo/efw;

.field final synthetic d:F

.field final synthetic e:F


# direct methods
.method constructor <init>(Lo/efw;FFF)V
    .locals 0

    .line 234
    iput-object p1, p0, Lo/efw$2;->c:Lo/efw;

    iput p2, p0, Lo/efw$2;->d:F

    iput p3, p0, Lo/efw$2;->e:F

    iput p4, p0, Lo/efw$2;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 237
    iget-object v0, p0, Lo/efw$2;->c:Lo/efw;

    new-instance v1, Lo/efr;

    iget v2, p0, Lo/efw$2;->d:F

    iget v3, p0, Lo/efw$2;->e:F

    iget v4, p0, Lo/efw$2;->a:F

    invoke-direct {v1, v2, v3, v4}, Lo/efr;-><init>(FFF)V

    invoke-static {v0, v1}, Lo/efw;->d(Lo/efw;Lo/efr;)Lo/efr;

    .line 238
    return-void
.end method
