.class final Lo/ede;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private c:I

.field private e:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    const-class v0, Lo/ede;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/ede;->b:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method c(Landroid/os/Handler;I)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/ede;->e:Landroid/os/Handler;

    .line 32
    iput p2, p0, Lo/ede;->c:I

    .line 33
    return-void
.end method

.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 5

    .line 20
    iget-object v0, p0, Lo/ede;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 21
    iget-object v0, p0, Lo/ede;->e:Landroid/os/Handler;

    iget v1, p0, Lo/ede;->c:I

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 23
    iget-object v0, p0, Lo/ede;->e:Landroid/os/Handler;

    const-wide/16 v1, 0x5dc

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ede;->e:Landroid/os/Handler;

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v0, Lo/ede;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Got auto-focus callback, but no handler for it"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    :goto_0
    return-void
.end method
