.class Lo/eyo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezm$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyo;->d(Lo/ezm;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eyo;


# direct methods
.method constructor <init>(Lo/eyo;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lo/eyo$1;->a:Lo/eyo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eib;>;)V"
        }
    .end annotation

    .line 175
    iget-object v0, p0, Lo/eyo$1;->a:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->f:Lo/ezh;

    invoke-virtual {v0}, Lo/ezh;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Lo/eyo$1;->a:Lo/eyo;

    invoke-static {v0, p1}, Lo/eyo;->e(Lo/eyo;Ljava/util/List;)V

    .line 178
    :cond_0
    return-void
.end method
