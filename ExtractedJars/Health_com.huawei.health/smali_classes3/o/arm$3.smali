.class Lo/arm$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arm;->d(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/arm;

.field final synthetic c:I

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/arm;JI)V
    .locals 0

    .line 64
    iput-object p1, p0, Lo/arm$3;->a:Lo/arm;

    iput-wide p2, p0, Lo/arm$3;->e:J

    iput p4, p0, Lo/arm$3;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 64
    invoke-virtual {p0, p1}, Lo/arm$3;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 68
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lo/arm$3;->e:J

    invoke-virtual {v0, v1, v2}, Lo/apm;->b(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 70
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 72
    iget-object v0, p0, Lo/arm$3;->a:Lo/arm;

    iget v1, p0, Lo/arm$3;->c:I

    const-string v2, "bundleKeyRecordMessageList"

    invoke-static {v0, v3, v1, v2}, Lo/arm;->b(Lo/arm;Ljava/util/ArrayList;ILjava/lang/String;)V

    .line 74
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
