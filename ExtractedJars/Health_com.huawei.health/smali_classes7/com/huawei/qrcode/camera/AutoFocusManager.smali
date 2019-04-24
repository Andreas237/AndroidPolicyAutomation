.class final Lcom/huawei/qrcode/camera/AutoFocusManager;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;
    }
.end annotation


# static fields
.field private static final AUTO_FOCUS_INTERVAL_MS:J = 0x7d0L

.field private static final FOCUS_MODES_CALLING_AF:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private active:Z

.field private final camera:Landroid/hardware/Camera;

.field private outstandingTask:Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;

.field private final taskExec:Lcom/huawei/qrcode/common/executor/AsyncTaskExecInterface;

.field private final useAutoFocus:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/huawei/qrcode/camera/AutoFocusManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/camera/AutoFocusManager;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/huawei/qrcode/camera/AutoFocusManager;->FOCUS_MODES_CALLING_AF:Ljava/util/Collection;

    sget-object v0, Lcom/huawei/qrcode/camera/AutoFocusManager;->FOCUS_MODES_CALLING_AF:Ljava/util/Collection;

    const-string v1, "auto"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/qrcode/camera/AutoFocusManager;->FOCUS_MODES_CALLING_AF:Ljava/util/Collection;

    const-string v1, "macro"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/hardware/Camera;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->camera:Landroid/hardware/Camera;

    new-instance v0, Lcom/huawei/qrcode/common/executor/AsyncTaskExecManager;

    invoke-direct {v0}, Lcom/huawei/qrcode/common/executor/AsyncTaskExecManager;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/qrcode/common/executor/AsyncTaskExecManager;->build()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/common/executor/AsyncTaskExecInterface;

    iput-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->taskExec:Lcom/huawei/qrcode/common/executor/AsyncTaskExecInterface;

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v4

    const-string v0, "preferences_auto_focus"

    const/4 v1, 0x1

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/qrcode/camera/AutoFocusManager;->FOCUS_MODES_CALLING_AF:Ljava/util/Collection;

    invoke-interface {v0, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->useAutoFocus:Z

    sget-object v0, Lcom/huawei/qrcode/camera/AutoFocusManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current focus mode \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'; use auto focus? "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->useAutoFocus:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/camera/AutoFocusManager;->start()V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/camera/AutoFocusManager;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->active:Z

    return v0
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->active:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;-><init>(Lcom/huawei/qrcode/camera/AutoFocusManager;Lcom/huawei/qrcode/camera/AutoFocusManager$1;)V

    iput-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->outstandingTask:Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;

    iget-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->taskExec:Lcom/huawei/qrcode/common/executor/AsyncTaskExecInterface;

    iget-object v1, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->outstandingTask:Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/huawei/qrcode/common/executor/AsyncTaskExecInterface;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public start()V
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->useAutoFocus:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->active:Z

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/qrcode/camera/AutoFocusManager;->TAG:Ljava/lang/String;

    const-string v1, "Unexpected exception while focusing"

    invoke-static {v0, v1, v2}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public stop()V
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->useAutoFocus:Z

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/qrcode/camera/AutoFocusManager;->TAG:Ljava/lang/String;

    const-string v1, "Unexpected exception while cancelling focusing"

    invoke-static {v0, v1, v2}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->outstandingTask:Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->outstandingTask:Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->outstandingTask:Lcom/huawei/qrcode/camera/AutoFocusManager$AutoFocusTask;

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/camera/AutoFocusManager;->active:Z

    return-void
.end method
