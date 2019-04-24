.class Lo/bry$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bry;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic d:Lo/bry;


# direct methods
.method constructor <init>(Lo/bry;I)V
    .locals 0

    .line 362
    iput-object p1, p0, Lo/bry$3;->d:Lo/bry;

    iput p2, p0, Lo/bry$3;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 366
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lo/bry$3;->b:I

    new-instance v2, Lo/bry$3$1;

    invoke-direct {v2, p0}, Lo/bry$3$1;-><init>(Lo/bry$3;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->b(ILo/bui;)V

    .line 377
    return-void
.end method
