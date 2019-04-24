.class final Lo/edj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Landroid/os/Handler;

.field private final b:Z

.field private c:I

.field private final e:Lo/edc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    const-class v0, Lo/edj;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/edj;->d:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lo/edc;Z)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    sget-object v0, Lo/edj;->d:Ljava/lang/String;

    const-string v1, "PreviewCallback"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    iput-object p1, p0, Lo/edj;->e:Lo/edc;

    .line 24
    iput-boolean p2, p0, Lo/edj;->b:Z

    .line 25
    return-void
.end method


# virtual methods
.method d(Landroid/os/Handler;I)V
    .locals 2

    .line 28
    sget-object v0, Lo/edj;->d:Ljava/lang/String;

    const-string v1, "setHandler"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    iput p2, p0, Lo/edj;->c:I

    .line 30
    iput-object p1, p0, Lo/edj;->a:Landroid/os/Handler;

    .line 31
    return-void
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 6

    .line 34
    sget-object v0, Lo/edj;->d:Ljava/lang/String;

    const-string v1, "onPreviewFrame-start"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    iget-object v0, p0, Lo/edj;->e:Lo/edc;

    invoke-virtual {v0}, Lo/edc;->b()Landroid/graphics/Point;

    move-result-object v4

    .line 36
    iget-boolean v0, p0, Lo/edj;->b:Z

    if-nez v0, :cond_0

    .line 37
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 39
    :cond_0
    iget-object v0, p0, Lo/edj;->a:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 40
    iget-object v0, p0, Lo/edj;->a:Landroid/os/Handler;

    iget v1, p0, Lo/edj;->c:I

    iget v2, v4, Landroid/graphics/Point;->x:I

    iget v3, v4, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    .line 42
    invoke-virtual {v5}, Landroid/os/Message;->sendToTarget()V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/edj;->a:Landroid/os/Handler;

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget-object v0, Lo/edj;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Got preview callback, but no handler for it"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    :goto_0
    sget-object v0, Lo/edj;->d:Ljava/lang/String;

    const-string v1, "onPreviewFrame-end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    return-void
.end method
