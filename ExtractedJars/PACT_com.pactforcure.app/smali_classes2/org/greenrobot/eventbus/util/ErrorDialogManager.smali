.class public Lorg/greenrobot/eventbus/util/ErrorDialogManager;
.super Ljava/lang/Object;
.source "ErrorDialogManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;,
        Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;
    }
.end annotation


# static fields
.field public static final KEY_EVENT_TYPE_ON_CLOSE:Ljava/lang/String; = "de.greenrobot.eventbus.errordialog.event_type_on_close"

.field public static final KEY_FINISH_AFTER_DIALOG:Ljava/lang/String; = "de.greenrobot.eventbus.errordialog.finish_after_dialog"

.field public static final KEY_ICON_ID:Ljava/lang/String; = "de.greenrobot.eventbus.errordialog.icon_id"

.field public static final KEY_MESSAGE:Ljava/lang/String; = "de.greenrobot.eventbus.errordialog.message"

.field public static final KEY_TITLE:Ljava/lang/String; = "de.greenrobot.eventbus.errordialog.title"

.field protected static final TAG_ERROR_DIALOG:Ljava/lang/String; = "de.greenrobot.eventbus.error_dialog"

.field protected static final TAG_ERROR_DIALOG_MANAGER:Ljava/lang/String; = "de.greenrobot.eventbus.error_dialog_manager"

.field public static factory:Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    return-void
.end method

.method static synthetic access$000(Ljava/lang/Object;Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)Z
    .locals 1
    .param p0, "x0"    # Ljava/lang/Object;
    .param p1, "x1"    # Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;

    .prologue
    .line 46
    invoke-static {p0, p1}, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->isInExecutionScope(Ljava/lang/Object;Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)Z

    move-result v0

    return v0
.end method

.method public static attachTo(Landroid/app/Activity;)V
    .locals 2
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 191
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->attachTo(Landroid/app/Activity;ZLandroid/os/Bundle;)V

    .line 192
    return-void
.end method

.method public static attachTo(Landroid/app/Activity;Ljava/lang/Object;ZLandroid/os/Bundle;)V
    .locals 2
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "executionScope"    # Ljava/lang/Object;
    .param p2, "finishAfterDialog"    # Z
    .param p3, "argumentsForErrorDialog"    # Landroid/os/Bundle;

    .prologue
    .line 206
    sget-object v0, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->factory:Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;

    if-nez v0, :cond_0

    .line 207
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "You must set the static factory field to configure error dialogs for your app."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 209
    :cond_0
    invoke-static {p0}, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->isSupportActivity(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    invoke-static {p0, p1, p2, p3}, Lorg/greenrobot/eventbus/util/ErrorDialogManager$SupportManagerFragment;->attachTo(Landroid/app/Activity;Ljava/lang/Object;ZLandroid/os/Bundle;)V

    .line 214
    :goto_0
    return-void

    .line 212
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lorg/greenrobot/eventbus/util/ErrorDialogManager$HoneycombManagerFragment;->attachTo(Landroid/app/Activity;Ljava/lang/Object;ZLandroid/os/Bundle;)V

    goto :goto_0
.end method

.method public static attachTo(Landroid/app/Activity;Z)V
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "finishAfterDialog"    # Z

    .prologue
    .line 196
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->attachTo(Landroid/app/Activity;ZLandroid/os/Bundle;)V

    .line 197
    return-void
.end method

.method public static attachTo(Landroid/app/Activity;ZLandroid/os/Bundle;)V
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "finishAfterDialog"    # Z
    .param p2, "argumentsForErrorDialog"    # Landroid/os/Bundle;

    .prologue
    .line 201
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 202
    .local v0, "executionScope":Ljava/lang/Class;
    invoke-static {p0, v0, p1, p2}, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->attachTo(Landroid/app/Activity;Ljava/lang/Object;ZLandroid/os/Bundle;)V

    .line 203
    return-void
.end method

.method protected static checkLogException(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)V
    .locals 3
    .param p0, "event"    # Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;

    .prologue
    .line 242
    sget-object v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->factory:Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;

    iget-object v1, v1, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget-boolean v1, v1, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->logExceptions:Z

    if-eqz v1, :cond_1

    .line 243
    sget-object v1, Lorg/greenrobot/eventbus/util/ErrorDialogManager;->factory:Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;

    iget-object v1, v1, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget-object v0, v1, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->tagForLoggingExceptions:Ljava/lang/String;

    .line 244
    .local v0, "tag":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 245
    sget-object v0, Lorg/greenrobot/eventbus/EventBus;->TAG:Ljava/lang/String;

    .line 247
    :cond_0
    const-string v1, "Error dialog manager received exception"

    iget-object v2, p0, Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;->throwable:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 249
    .end local v0    # "tag":Ljava/lang/String;
    :cond_1
    return-void
.end method

.method private static isInExecutionScope(Ljava/lang/Object;Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;)Z
    .locals 2
    .param p0, "executionScope"    # Ljava/lang/Object;
    .param p1, "event"    # Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;

    .prologue
    .line 252
    if-eqz p1, :cond_0

    .line 253
    invoke-virtual {p1}, Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;->getExecutionScope()Ljava/lang/Object;

    move-result-object v0

    .line 254
    .local v0, "eventExecutionScope":Ljava/lang/Object;
    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 256
    const/4 v1, 0x0

    .line 259
    .end local v0    # "eventExecutionScope":Ljava/lang/Object;
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0
.end method

.method private static isSupportActivity(Landroid/app/Activity;)Z
    .locals 6
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 217
    const/4 v1, 0x0

    .line 218
    .local v1, "isSupport":Z
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    .line 219
    .local v0, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    if-nez v0, :cond_0

    .line 220
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Illegal activity type: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 222
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    .line 223
    .local v2, "name":Ljava/lang/String;
    const-string v3, "android.support.v4.app.FragmentActivity"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 224
    const/4 v1, 0x1

    .line 238
    :cond_1
    return v1

    .line 226
    :cond_2
    const-string v3, "com.actionbarsherlock.app"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, ".SherlockActivity"

    .line 227
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, ".SherlockListActivity"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, ".SherlockPreferenceActivity"

    .line 228
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 229
    :cond_3
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Please use SherlockFragmentActivity. Illegal activity: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 230
    :cond_4
    const-string v3, "android.app.Activity"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 231
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xb

    if-ge v3, v4, :cond_1

    .line 232
    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "Illegal activity without fragment support. Either use Android 3.0+ or android.support.v4.app.FragmentActivity."

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 218
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0
.end method
