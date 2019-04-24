.class Lo/efw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efw;->e(FFFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lo/efw;

.field final synthetic c:F

.field final synthetic d:F

.field final synthetic e:F


# direct methods
.method constructor <init>(Lo/efw;FFFF)V
    .locals 0

    .line 204
    iput-object p1, p0, Lo/efw$1;->b:Lo/efw;

    iput p2, p0, Lo/efw$1;->d:F

    iput p3, p0, Lo/efw$1;->c:F

    iput p4, p0, Lo/efw$1;->e:F

    iput p5, p0, Lo/efw$1;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 207
    iget-object v0, p0, Lo/efw$1;->b:Lo/efw;

    new-instance v1, Lo/efs;

    iget v2, p0, Lo/efw$1;->d:F

    iget v3, p0, Lo/efw$1;->c:F

    iget v4, p0, Lo/efw$1;->e:F

    iget v5, p0, Lo/efw$1;->a:F

    invoke-direct {v1, v2, v3, v4, v5}, Lo/efs;-><init>(FFFF)V

    invoke-static {v0, v1}, Lo/efw;->b(Lo/efw;Lo/efs;)Lo/efs;

    .line 208
    return-void
.end method
