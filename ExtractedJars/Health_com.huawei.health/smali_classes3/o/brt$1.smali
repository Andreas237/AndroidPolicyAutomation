.class Lo/brt$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt;->e(Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bui;

.field final synthetic b:Lo/brt;


# direct methods
.method constructor <init>(Lo/brt;Lo/bui;)V
    .locals 0

    .line 709
    iput-object p1, p0, Lo/brt$1;->b:Lo/brt;

    iput-object p2, p0, Lo/brt$1;->a:Lo/bui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 712
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lo/brt$1$4;

    invoke-direct {v1, p0}, Lo/brt$1$4;-><init>(Lo/brt$1;)V

    invoke-interface {v0, v1}, Lo/bsp;->e(Lo/bui;)Lcom/huawei/health/suggestion/model/Plan;

    .line 740
    return-void
.end method
