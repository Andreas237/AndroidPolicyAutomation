.class Lo/atd$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atd;->a(I)Lo/brd;
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
.field final synthetic a:Lo/atd;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/atd;I)V
    .locals 0

    .line 208
    iput-object p1, p0, Lo/atd$5;->a:Lo/atd;

    iput p2, p0, Lo/atd$5;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 208
    invoke-virtual {p0, p1}, Lo/atd$5;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 212
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v2

    .line 213
    invoke-virtual {v2}, Lo/atc;->e()Ljava/util/ArrayList;

    move-result-object v3

    .line 214
    iget-object v0, p0, Lo/atd$5;->a:Lo/atd;

    iget v1, p0, Lo/atd$5;->e:I

    invoke-static {v0, v3, v1}, Lo/atd;->d(Lo/atd;Ljava/util/ArrayList;I)V

    .line 215
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
