.class Lo/eof$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eof;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eof;


# direct methods
.method constructor <init>(Lo/eof;)V
    .locals 0

    .line 525
    iput-object p1, p0, Lo/eof$1;->c:Lo/eof;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 528
    iget-object v0, p0, Lo/eof$1;->c:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->n()V

    .line 529
    return-void
.end method
