.class Lo/ass$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ass;->c(IJ)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ass;

.field final synthetic b:I

.field final synthetic c:J


# direct methods
.method constructor <init>(Lo/ass;IJ)V
    .locals 0

    .line 76
    iput-object p1, p0, Lo/ass$2;->a:Lo/ass;

    iput p2, p0, Lo/ass$2;->b:I

    iput-wide p3, p0, Lo/ass$2;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 80
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/ass$2;->a:Lo/ass;

    iget v2, p0, Lo/ass$2;->b:I

    iget-wide v3, p0, Lo/ass$2;->c:J

    invoke-static {v1, v2, v3, v4}, Lo/ass;->a(Lo/ass;IJ)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 81
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 86
    if-eqz p1, :cond_0

    .line 88
    iget-object v0, p0, Lo/ass$2;->a:Lo/ass;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/ass;->a(Lo/ass;III)V

    .line 90
    :cond_0
    return-void
.end method
