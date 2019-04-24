.class Lo/clq$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/clq;


# direct methods
.method constructor <init>(Lo/clq;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lo/clq$4;->d:Lo/clq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 167
    iget-object v0, p0, Lo/clq$4;->d:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 168
    return-void
.end method
