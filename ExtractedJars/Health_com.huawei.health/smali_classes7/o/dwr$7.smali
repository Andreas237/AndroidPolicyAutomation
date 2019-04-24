.class Lo/dwr$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwr;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dwr;

.field final synthetic c:J


# direct methods
.method constructor <init>(Lo/dwr;J)V
    .locals 0

    .line 1465
    iput-object p1, p0, Lo/dwr$7;->b:Lo/dwr;

    iput-wide p2, p0, Lo/dwr$7;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 4

    .line 1468
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1469
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    const-string v1, "obj is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1470
    return-void

    .line 1472
    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxc;->a(Ljava/lang/String;)I

    move-result v3

    .line 1473
    iget-object v0, p0, Lo/dwr$7;->b:Lo/dwr;

    iget-wide v1, p0, Lo/dwr$7;->c:J

    invoke-static {v0, v3, v1, v2}, Lo/dwr;->c(Lo/dwr;IJ)V

    .line 1474
    return-void
.end method
