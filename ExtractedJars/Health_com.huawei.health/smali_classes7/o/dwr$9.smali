.class Lo/dwr$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwr;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dwr;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lo/dwr;J)V
    .locals 0

    .line 1296
    iput-object p1, p0, Lo/dwr$9;->a:Lo/dwr;

    iput-wide p2, p0, Lo/dwr$9;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 4

    .line 1299
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1300
    return-void

    .line 1302
    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxc;->a(Ljava/lang/String;)I

    move-result v3

    .line 1303
    iget-object v0, p0, Lo/dwr$9;->a:Lo/dwr;

    iget-wide v1, p0, Lo/dwr$9;->b:J

    invoke-static {v0, v3, v1, v2}, Lo/dwr;->d(Lo/dwr;IJ)V

    .line 1304
    return-void
.end method
