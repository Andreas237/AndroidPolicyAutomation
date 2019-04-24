.class Lo/bbh$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bbh;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/bbh;


# direct methods
.method constructor <init>(Lo/bbh;)V
    .locals 0

    .line 578
    iput-object p1, p0, Lo/bbh$5;->c:Lo/bbh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/bra;)Ljava/lang/Object;
    .locals 2

    .line 582
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lo/bbh$5;->c:Lo/bbh;

    invoke-virtual {v1}, Lo/bbh;->i()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/bot;->a(Ljava/io/File;)Z

    .line 583
    const/4 v0, 0x0

    return-object v0
.end method
