.class Lo/bry$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bry;->c(ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bry;

.field final synthetic c:I

.field final synthetic d:Lo/bui;


# direct methods
.method constructor <init>(Lo/bry;ILo/bui;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lo/bry$1;->a:Lo/bry;

    iput p2, p0, Lo/bry$1;->c:I

    iput-object p3, p0, Lo/bry$1;->d:Lo/bui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 341
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lo/bry$1;->c:I

    new-instance v2, Lo/bry$1$3;

    invoke-direct {v2, p0}, Lo/bry$1$3;-><init>(Lo/bry$1;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->b(ILo/bui;)V

    .line 357
    return-void
.end method
