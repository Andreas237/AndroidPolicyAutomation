.class Lo/atr$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atr;->c(Ljava/lang/String;Landroid/graphics/Bitmap;)Lo/brd;
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
.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lo/atr;

.field final synthetic e:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lo/atr;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/atr$5;->d:Lo/atr;

    iput-object p2, p0, Lo/atr$5;->c:Ljava/lang/String;

    iput-object p3, p0, Lo/atr$5;->e:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 120
    invoke-virtual {p0, p1}, Lo/atr$5;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/bbu;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 126
    iget-object v0, p0, Lo/atr$5;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/bor;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 127
    iget-object v0, p0, Lo/atr$5;->d:Lo/atr;

    iget-object v1, p0, Lo/atr$5;->e:Landroid/graphics/Bitmap;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".jpg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v4, v2}, Lo/atr;->d(Lo/atr;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
