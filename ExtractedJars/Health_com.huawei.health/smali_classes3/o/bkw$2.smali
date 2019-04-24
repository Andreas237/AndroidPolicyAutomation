.class final Lo/bkw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bkw;->b(Landroid/content/Context;J)Lo/brd;
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
.field final synthetic a:Landroid/content/Context;

.field final synthetic e:J


# direct methods
.method constructor <init>(JLandroid/content/Context;)V
    .locals 0

    .line 146
    iput-wide p1, p0, Lo/bkw$2;->e:J

    iput-object p3, p0, Lo/bkw$2;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 146
    invoke-virtual {p0, p1}, Lo/bkw$2;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 152
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bkw$2;->e:J

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->c(JI)Z

    move-result v4

    .line 154
    if-eqz v4, :cond_0

    .line 157
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bkw$2;->e:J

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->b(JI)V

    .line 159
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bkw$2;->e:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->e(J)V

    .line 160
    iget-object v0, p0, Lo/bkw$2;->a:Landroid/content/Context;

    iget-wide v1, p0, Lo/bkw$2;->e:J

    invoke-static {v0, v1, v2}, Lo/bkw;->a(Landroid/content/Context;J)V

    .line 163
    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
