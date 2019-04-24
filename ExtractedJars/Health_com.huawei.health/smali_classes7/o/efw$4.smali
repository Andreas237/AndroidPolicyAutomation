.class Lo/efw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efw;->a(FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:Lo/efw;

.field final synthetic e:F


# direct methods
.method constructor <init>(Lo/efw;FFF)V
    .locals 0

    .line 224
    iput-object p1, p0, Lo/efw$4;->c:Lo/efw;

    iput p2, p0, Lo/efw$4;->b:F

    iput p3, p0, Lo/efw$4;->e:F

    iput p4, p0, Lo/efw$4;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 227
    iget-object v0, p0, Lo/efw$4;->c:Lo/efw;

    new-instance v1, Lo/efr;

    iget v2, p0, Lo/efw$4;->b:F

    iget v3, p0, Lo/efw$4;->e:F

    iget v4, p0, Lo/efw$4;->a:F

    invoke-direct {v1, v2, v3, v4}, Lo/efr;-><init>(FFF)V

    invoke-static {v0, v1}, Lo/efw;->b(Lo/efw;Lo/efr;)Lo/efr;

    .line 228
    return-void
.end method
