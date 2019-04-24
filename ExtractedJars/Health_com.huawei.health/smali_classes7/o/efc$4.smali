.class Lo/efc$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efc;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/efc;


# direct methods
.method constructor <init>(Lo/efc;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lo/efc$4;->b:Lo/efc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 67
    iget-object v0, p0, Lo/efc$4;->b:Lo/efc;

    invoke-virtual {v0}, Lo/efc;->t()V

    .line 68
    return-void
.end method
