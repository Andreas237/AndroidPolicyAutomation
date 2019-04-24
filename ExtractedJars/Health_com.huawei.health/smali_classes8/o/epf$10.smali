.class Lo/epf$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epf;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/epf;


# direct methods
.method constructor <init>(Lo/epf;)V
    .locals 0

    .line 623
    iput-object p1, p0, Lo/epf$10;->e:Lo/epf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 626
    iget-object v0, p0, Lo/epf$10;->e:Lo/epf;

    invoke-static {v0}, Lo/epf;->e(Lo/epf;)V

    .line 627
    iget-object v0, p0, Lo/epf$10;->e:Lo/epf;

    invoke-static {v0}, Lo/epf;->d(Lo/epf;)V

    .line 628
    iget-object v0, p0, Lo/epf$10;->e:Lo/epf;

    invoke-static {v0}, Lo/epf;->b(Lo/epf;)V

    .line 629
    return-void
.end method
