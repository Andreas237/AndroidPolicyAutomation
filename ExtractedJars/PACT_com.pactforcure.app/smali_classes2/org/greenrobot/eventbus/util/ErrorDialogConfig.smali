.class public Lorg/greenrobot/eventbus/util/ErrorDialogConfig;
.super Ljava/lang/Object;
.source "ErrorDialogConfig.java"


# instance fields
.field defaultDialogIconId:I

.field final defaultErrorMsgId:I

.field defaultEventTypeOnDialogClosed:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field final defaultTitleId:I

.field eventBus:Lorg/greenrobot/eventbus/EventBus;

.field logExceptions:Z

.field final mapping:Lorg/greenrobot/eventbus/util/ExceptionToResourceMapping;

.field final resources:Landroid/content/res/Resources;

.field tagForLoggingExceptions:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;II)V
    .locals 1
    .param p1, "resources"    # Landroid/content/res/Resources;
    .param p2, "defaultTitleId"    # I
    .param p3, "defaultMsgId"    # I

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->logExceptions:Z

    .line 37
    iput-object p1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->resources:Landroid/content/res/Resources;

    .line 38
    iput p2, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultTitleId:I

    .line 39
    iput p3, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultErrorMsgId:I

    .line 40
    new-instance v0, Lorg/greenrobot/eventbus/util/ExceptionToResourceMapping;

    invoke-direct {v0}, Lorg/greenrobot/eventbus/util/ExceptionToResourceMapping;-><init>()V

    iput-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->mapping:Lorg/greenrobot/eventbus/util/ExceptionToResourceMapping;

    .line 41
    return-void
.end method


# virtual methods
.method public addMapping(Ljava/lang/Class;I)Lorg/greenrobot/eventbus/util/ErrorDialogConfig;
    .locals 1
    .param p2, "msgId"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/Throwable;",
            ">;I)",
            "Lorg/greenrobot/eventbus/util/ErrorDialogConfig;"
        }
    .end annotation

    .prologue
    .line 44
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Throwable;>;"
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->mapping:Lorg/greenrobot/eventbus/util/ExceptionToResourceMapping;

    invoke-virtual {v0, p1, p2}, Lorg/greenrobot/eventbus/util/ExceptionToResourceMapping;->addMapping(Ljava/lang/Class;I)Lorg/greenrobot/eventbus/util/ExceptionToResourceMapping;

    .line 45
    return-object p0
.end method

.method public disableExceptionLogging()V
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->logExceptions:Z

    .line 68
    return-void
.end method

.method getEventBus()Lorg/greenrobot/eventbus/EventBus;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lorg/greenrobot/eventbus/EventBus;->getDefault()Lorg/greenrobot/eventbus/EventBus;

    move-result-object v0

    goto :goto_0
.end method

.method public getMessageIdForThrowable(Ljava/lang/Throwable;)I
    .locals 4
    .param p1, "throwable"    # Ljava/lang/Throwable;

    .prologue
    .line 49
    iget-object v1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->mapping:Lorg/greenrobot/eventbus/util/ExceptionToResourceMapping;

    invoke-virtual {v1, p1}, Lorg/greenrobot/eventbus/util/ExceptionToResourceMapping;->mapThrowable(Ljava/lang/Throwable;)Ljava/lang/Integer;

    move-result-object v0

    .line 50
    .local v0, "resId":Ljava/lang/Integer;
    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 54
    :goto_0
    return v1

    .line 53
    :cond_0
    sget-object v1, Lorg/greenrobot/eventbus/EventBus;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No specific message ressource ID found for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    iget v1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultErrorMsgId:I

    goto :goto_0
.end method

.method public setDefaultDialogIconId(I)V
    .locals 0
    .param p1, "defaultDialogIconId"    # I

    .prologue
    .line 59
    iput p1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultDialogIconId:I

    .line 60
    return-void
.end method

.method public setDefaultEventTypeOnDialogClosed(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 63
    .local p1, "defaultEventTypeOnDialogClosed":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    iput-object p1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultEventTypeOnDialogClosed:Ljava/lang/Class;

    .line 64
    return-void
.end method

.method public setEventBus(Lorg/greenrobot/eventbus/EventBus;)V
    .locals 0
    .param p1, "eventBus"    # Lorg/greenrobot/eventbus/EventBus;

    .prologue
    .line 75
    iput-object p1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    .line 76
    return-void
.end method

.method public setTagForLoggingExceptions(Ljava/lang/String;)V
    .locals 0
    .param p1, "tagForLoggingExceptions"    # Ljava/lang/String;

    .prologue
    .line 71
    iput-object p1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->tagForLoggingExceptions:Ljava/lang/String;

    .line 72
    return-void
.end method
