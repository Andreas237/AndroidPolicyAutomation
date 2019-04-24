.class Lo/bry$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bry;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bry;


# direct methods
.method constructor <init>(Lo/bry;)V
    .locals 0

    .line 495
    iput-object p1, p0, Lo/bry$5;->a:Lo/bry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 499
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v8, Lo/bry$5$3;

    invoke-direct {v8, p0}, Lo/bry$5$3;-><init>(Lo/bry$5;)V

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    invoke-interface/range {v0 .. v8}, Lo/bsp;->e(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui;)V

    .line 511
    return-void
.end method
