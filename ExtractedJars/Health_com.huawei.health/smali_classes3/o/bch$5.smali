.class Lo/bch$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bch;->a(Landroid/content/Context;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lo/bch;


# direct methods
.method constructor <init>(Lo/bch;Landroid/content/Context;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/bch$5;->d:Lo/bch;

    iput-object p2, p0, Lo/bch$5;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 93
    invoke-virtual {p0, p1}, Lo/bch$5;->b(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Void;
    .locals 2

    .line 98
    iget-object v0, p0, Lo/bch$5;->d:Lo/bch;

    iget-object v1, p0, Lo/bch$5;->c:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/bch;->d(Lo/bch;Landroid/content/Context;)V

    .line 99
    const/4 v0, 0x0

    return-object v0
.end method
