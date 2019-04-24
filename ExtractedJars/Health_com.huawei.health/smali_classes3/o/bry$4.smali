.class Lo/bry$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bry;->e(ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bui;

.field final synthetic d:Lo/bry;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/bry;ILo/bui;)V
    .locals 0

    .line 314
    iput-object p1, p0, Lo/bry$4;->d:Lo/bry;

    iput p2, p0, Lo/bry$4;->e:I

    iput-object p3, p0, Lo/bry$4;->b:Lo/bui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 317
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lo/bry$4;->e:I

    new-instance v2, Lo/bry$4$5;

    invoke-direct {v2, p0}, Lo/bry$4$5;-><init>(Lo/bry$4;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(ILo/bui;)V

    .line 333
    return-void
.end method
