.class Lo/bry$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bry;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bry;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/bry;I)V
    .locals 0

    .line 475
    iput-object p1, p0, Lo/bry$2;->a:Lo/bry;

    iput p2, p0, Lo/bry$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 479
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lo/bry$2;->c:I

    new-instance v2, Lo/bry$2$4;

    invoke-direct {v2, p0}, Lo/bry$2$4;-><init>(Lo/bry$2;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->a(ILo/bui;)V

    .line 490
    return-void
.end method
