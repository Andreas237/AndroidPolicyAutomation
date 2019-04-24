.class Lo/yv$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/yv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lo/yv;


# direct methods
.method public constructor <init>(Lo/yv;Landroid/os/Looper;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lo/yv$b;->a:Lo/yv;

    .line 207
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 208
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 213
    const-string v0, "handleMessage."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 214
    iget-object v0, p0, Lo/yv$b;->a:Lo/yv;

    invoke-static {v0, p1}, Lo/yv;->c(Lo/yv;Landroid/os/Message;)V

    .line 215
    return-void
.end method
