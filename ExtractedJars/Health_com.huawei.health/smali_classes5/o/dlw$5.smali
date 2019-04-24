.class Lo/dlw$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlw;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlw;


# direct methods
.method constructor <init>(Lo/dlw;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lo/dlw$5;->d:Lo/dlw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 111
    iget-object v0, p0, Lo/dlw$5;->d:Lo/dlw;

    invoke-virtual {v0}, Lo/dlw;->c()V

    .line 112
    iget-object v0, p0, Lo/dlw$5;->d:Lo/dlw;

    invoke-virtual {v0}, Lo/dlw;->b()V

    .line 113
    iget-object v0, p0, Lo/dlw$5;->d:Lo/dlw;

    invoke-virtual {v0}, Lo/dlw;->a()V

    .line 114
    return-void
.end method
