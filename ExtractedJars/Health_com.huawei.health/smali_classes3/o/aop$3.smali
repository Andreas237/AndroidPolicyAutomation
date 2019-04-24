.class Lo/aop$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aop;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/aop;


# direct methods
.method constructor <init>(Lo/aop;)V
    .locals 0

    .line 358
    iput-object p1, p0, Lo/aop$3;->b:Lo/aop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 362
    iget-object v0, p0, Lo/aop$3;->b:Lo/aop;

    invoke-static {v0}, Lo/aop;->b(Lo/aop;)V

    .line 363
    return-void
.end method
