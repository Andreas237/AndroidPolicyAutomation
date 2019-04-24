.class final Lo/atg$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atg;->a(Lo/atg;JLo/atl;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/atg;

.field final synthetic c:Lo/atl;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/atg;JLo/atl;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lo/atg$4;->b:Lo/atg;

    iput-wide p2, p0, Lo/atg$4;->e:J

    iput-object p4, p0, Lo/atg$4;->c:Lo/atl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 305
    invoke-virtual {p0, p1}, Lo/atg$4;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 310
    iget-object v0, p0, Lo/atg$4;->b:Lo/atg;

    iget-wide v1, p0, Lo/atg$4;->e:J

    iget-object v3, p0, Lo/atg$4;->c:Lo/atl;

    invoke-static {v0, v1, v2, v3}, Lo/atg;->d(Lo/atg;JLo/atl;)V

    .line 311
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
