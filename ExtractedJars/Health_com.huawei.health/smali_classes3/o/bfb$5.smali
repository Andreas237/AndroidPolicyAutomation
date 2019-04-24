.class Lo/bfb$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfb;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bfb;


# direct methods
.method constructor <init>(Lo/bfb;)V
    .locals 0

    .line 1074
    iput-object p1, p0, Lo/bfb$5;->a:Lo/bfb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1078
    iget-object v0, p0, Lo/bfb$5;->a:Lo/bfb;

    invoke-static {v0}, Lo/bfb;->e(Lo/bfb;)V

    .line 1079
    return-void
.end method
