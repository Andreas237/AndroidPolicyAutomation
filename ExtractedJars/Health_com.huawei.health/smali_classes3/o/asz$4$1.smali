.class Lo/asz$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asz$4;->a()V
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
.field final synthetic e:Lo/asz$4;


# direct methods
.method constructor <init>(Lo/asz$4;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lo/asz$4$1;->e:Lo/asz$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 190
    invoke-virtual {p0, p1}, Lo/asz$4$1;->d(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Void;
    .locals 2

    .line 195
    iget-object v0, p0, Lo/asz$4$1;->e:Lo/asz$4;

    iget-object v0, v0, Lo/asz$4;->b:Lo/asz;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lo/asz;->e(Lo/asz;ZLo/bra;)[I

    .line 196
    const/4 v0, 0x0

    return-object v0
.end method
